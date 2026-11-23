package ocltests;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import privacyModel.PrivacyModelPackage;
import utility.validation.Validation;

/**
 * Loads an XMI model and reports which OCL constraints it violates.
 *
 * Constraints are reported as "Class::Constraint", where Class is the class that
 * defines the constraint (e.g. "AbstractPaper::StartDateShouldBeBeforeTerminationDate",
 * even when the violating object is a Consent).
 *
 * Anything that is not a clean constraint violation (a missing required feature,
 * an exception while evaluating OCL, an unknown message format) is reported as a
 * problem, so that a broken setup can never look like an expected violation.
 */
public final class OclValidator {

	private static final Pattern VIOLATED =
			Pattern.compile("^The '([^']+)' constraint is violated on ");

	private static boolean initialized = false;

	public static final class Result {
		/** Violated constraints, as "Class::Constraint". */
		public final Set<String> violated = new LinkedHashSet<>();
		/** Everything else that went wrong (structural errors, OCL exceptions, ...). */
		public final List<String> problems = new ArrayList<>();

		public boolean isValid() {
			return violated.isEmpty() && problems.isEmpty();
		}

		@Override
		public String toString() {
			return "violated=" + violated + (problems.isEmpty() ? "" : ", problems=" + problems);
		}
	}

	private OclValidator() {
	}

	private static synchronized void init() {
		if (!initialized) {
			new Validation(); // registers the OCL delegates (same setup as utility.validation.Validation)
			initialized = true;
		}
	}

	public static Result validate(File xmiFile) {
		init();
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(PrivacyModelPackage.eNS_URI, PrivacyModelPackage.eINSTANCE);

		Resource resource = resourceSet.getResource(URI.createFileURI(xmiFile.getAbsolutePath()), true);
		Result result = new Result();
		for (Resource.Diagnostic error : resource.getErrors()) {
			result.problems.add("XMI load error: " + error.getMessage());
		}
		for (EObject root : resource.getContents()) {
			collect(Diagnostician.INSTANCE.validate(root), result);
		}
		return result;
	}

	private static void collect(Diagnostic diagnostic, Result result) {
		for (Diagnostic child : diagnostic.getChildren()) {
			if (child.getSeverity() >= Diagnostic.WARNING) {
				String message = child.getMessage();
				Matcher m = VIOLATED.matcher(message);
				if (m.find() && !child.getData().isEmpty() && child.getData().get(0) instanceof EObject) {
					EObject object = (EObject) child.getData().get(0);
					result.violated.add(definingClass(object.eClass(), m.group(1)) + "::" + m.group(1));
				} else {
					result.problems.add(message);
				}
			}
			collect(child, result);
		}
	}

	/** Finds the class (the object's class or one of its supertypes) that declares the constraint. */
	static String definingClass(EClass eClass, String constraint) {
		List<EClass> candidates = new ArrayList<>();
		candidates.add(eClass);
		candidates.addAll(eClass.getEAllSuperTypes());
		for (EClass candidate : candidates) {
			if (constraintsOf(candidate).contains(constraint)) {
				return candidate.getName();
			}
		}
		return eClass.getName();
	}

	/** Names of the constraints declared directly on the class in the Ecore model. */
	static List<String> constraintsOf(EClassifier classifier) {
		List<String> names = new ArrayList<>();
		EAnnotation annotation = classifier.getEAnnotation(EcorePackage.eNS_URI);
		if (annotation != null && annotation.getDetails().get("constraints") != null) {
			for (String name : annotation.getDetails().get("constraints").trim().split("\\s+")) {
				names.add(name);
			}
		}
		return names;
	}

	/** All constraints of the model, as "Class::Constraint". */
	public static Set<String> allConstraints() {
		Set<String> all = new LinkedHashSet<>();
		for (EClassifier classifier : PrivacyModelPackage.eINSTANCE.getEClassifiers()) {
			for (String name : constraintsOf(classifier)) {
				all.add(classifier.getName() + "::" + name);
			}
		}
		return all;
	}
}
