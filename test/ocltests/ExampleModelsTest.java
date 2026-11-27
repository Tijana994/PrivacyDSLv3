package ocltests;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

import privacyModel.PrivacyModelPackage;

/** The example models in model/ are complete, realistic policies and must stay valid. */
public class ExampleModelsTest {

	@Test
	public void hospitalModelIsValid() {
		assertValid("model/hospital.xmi");
	}

	@Test
	public void bankModelIsValid() {
		assertValid("model/bank.xmi");
	}

	/**
	 * The witness model shows that the rules are not contradictory even when every concept is used:
	 * it has at least one instance of every concrete class and violates no rule.
	 */
	@Test
	public void witnessModelIsValidAndInstantiatesEveryConcreteClass() {
		assertValid("model/witness.xmi");
		Set<EClass> instantiated = new HashSet<>();
		for (EObject root : load("model/witness.xmi").getContents()) {
			instantiated.add(root.eClass());
			for (Iterator<EObject> it = root.eAllContents(); it.hasNext();) {
				instantiated.add(it.next().eClass());
			}
		}
		List<String> missing = new ArrayList<>();
		for (EClassifier classifier : PrivacyModelPackage.eINSTANCE.getEClassifiers()) {
			if (classifier instanceof EClass) {
				EClass eClass = (EClass) classifier;
				if (!eClass.isAbstract() && !eClass.isInterface() && !instantiated.contains(eClass)) {
					missing.add(eClass.getName());
				}
			}
		}
		assertTrue("model/witness.xmi has no instance of " + missing, missing.isEmpty());
	}

	private static void assertValid(String path) {
		OclValidator.Result result = OclValidator.validate(new File(path));
		assertTrue(path + " should be valid, but: " + result, result.isValid());
	}

	private static Resource load(String path) {
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getPackageRegistry().put(PrivacyModelPackage.eNS_URI, PrivacyModelPackage.eINSTANCE);
		return resourceSet.getResource(URI.createFileURI(new File(path).getAbsolutePath()), true);
	}
}
