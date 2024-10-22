package utility.validation;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.pivot.internal.delegate.OCLInvocationDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLSettingDelegateFactory;
import org.eclipse.ocl.pivot.internal.delegate.OCLValidationDelegateFactory;
import org.eclipse.ocl.xtext.essentialocl.EssentialOCLStandaloneSetup;

import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyPolicy;

public class Validation {
	
	public Validation()
	{
		init_OclStuff();
	}
	
	public ValidationResult validateModel(String modelPath)
	{
		return validateObject(getModel(modelPath));
	}
	
	private void init_OclStuff() {
        EssentialOCLStandaloneSetup.doSetup();
		String pivotDelegateURI = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
				pivotDelegateURI, new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
				.put(pivotDelegateURI, new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(pivotDelegateURI,
				new OCLValidationDelegateFactory.Global());
		
		//http://download.eclipse.org/releases/photon
		String oclDelegateURI = "http://www.eclipse.org/emf/2002/Ecore/OCL"; //OCLDelegateDomain.OCL_DELEGATE_URI;
        EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
                oclDelegateURI, new OCLInvocationDelegateFactory.Global());
        EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(
                oclDelegateURI, new OCLSettingDelegateFactory.Global());
        EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
				new OCLValidationDelegateFactory.Global());
	}

    private PrivacyPolicy getModel(String fileName) {
    	PrivacyModelPackage.eINSTANCE.eClass();
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());

        // Obtain a new resource set
        ResourceSet resSet = new ResourceSetImpl();
        registerPackage(resSet);

        // Get the resource
        Resource resource = resSet.getResource(URI.createURI(fileName), true);
        PrivacyPolicy policy = (PrivacyPolicy)resource.getContents().get(0);
        return policy;
    }
    
    private ValidationResult validateObject(EObject eObject)
    {
    	ValidationResult result = new ValidationResult();
    	result.ValidationMessage = "Validation failed with errors:";
    	result.IsSuccessful = false;
    	Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);
        if (diagnostic.getSeverity() == Diagnostic.ERROR || 
	    		diagnostic.getSeverity() == Diagnostic.WARNING)
            {
            	System.err.println(diagnostic.getMessage());
                for (Iterator i=diagnostic.getChildren().iterator(); i.hasNext();)
                {
                	Diagnostic childDiagnostic = (Diagnostic)i.next();
                	switch (childDiagnostic.getSeverity())
                	{
		            	case Diagnostic.ERROR:
		            	case Diagnostic.WARNING:
		            		result.ValidationMessage += "\n" + childDiagnostic.getMessage();
                	}
		        }
		      return result;
		   }
        result.ValidationMessage = "Model is valid.";
	    result.IsSuccessful = true;
	    return result;
    }
    
    private void registerPackage(ResourceSet resSet) {
        try {
            Class<?> c = this.getClass().getClassLoader().loadClass("privacyModel.PrivacyModelPackage");
            Field fNS = c.getField("eNS_URI");
            Field fI = c.getField("eINSTANCE");
            resSet.getPackageRegistry().put(fNS.get(null).toString(), fI.get(null));
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
	private Boolean test()
	{
		//http://download.eclipse.org/releases/photon
		String oclDelegateURI = "http://www.eclipse.org/emf/2002/Ecore/OCL"; //OCLDelegateDomain.OCL_DELEGATE_URI;
        EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
                oclDelegateURI, new OCLInvocationDelegateFactory.Global());
        EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE.put(
                oclDelegateURI, new OCLSettingDelegateFactory.Global());
        EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
				new OCLValidationDelegateFactory.Global());


        // Step 2: Initialize and load the Ecore model
        ResourceSet resourceSet = new ResourceSetImpl();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

        // Load your model (replace with your actual file path)
        Resource resource = resourceSet.getResource(URI.createFileURI("model/bank.xmi"), true);
        EObject eObject = resource.getContents().get(0);

        // Step 3: Validate the EObject instance
        Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eObject);

        // Output the results
        if (diagnostic.getSeverity() == Diagnostic.ERROR || 
        		diagnostic.getSeverity() == Diagnostic.WARNING)
	      {
	        System.err.println(diagnostic.getMessage());
	        for (Iterator i=diagnostic.getChildren().iterator(); i.hasNext();)
	        {
	          Diagnostic childDiagnostic = (Diagnostic)i.next();
	          switch (childDiagnostic.getSeverity())
	          {
	            case Diagnostic.ERROR:
	            case Diagnostic.WARNING:
	            	System.out.println(childDiagnostic.getMessage());
	          }
	        }
	        return false;
	      }
        return true;
	}
}
