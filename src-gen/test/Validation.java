package test;

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

import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyPolicy;

public class Validation {
	
	protected final String passInst1 = "model/hospital.xmi";
	
	public Boolean checkValidation()
	{
		init_OclStuff();
    	if (!validateObject(getModel(passInst1))) {
    		System.out.println("Failed.");
    		return false;
    	}
    	System.out.println("OK.");
		return true;
	}
	
	private void init_OclStuff() {
        //EssentialOCLStandaloneSetup.doSetup();
		String oclDelegateURI = "http://www.eclipse.org/emf/2002/Ecore/OCL";//"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"; //
		EOperation.Internal.InvocationDelegate.Factory.Registry.INSTANCE.put(
				oclDelegateURI, new OCLInvocationDelegateFactory.Global());
		EStructuralFeature.Internal.SettingDelegate.Factory.Registry.INSTANCE
				.put(oclDelegateURI, new OCLSettingDelegateFactory.Global());
		EValidator.ValidationDelegate.Registry.INSTANCE.put(oclDelegateURI,
				new OCLValidationDelegateFactory.Global());
		//EValidator.Registry.INSTANCE.put(MyModelPackage.eINSTANCE, new MyModelValidator());
		//https://www.eclipse.org/forums/index.php/t/261587/
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
    
    private boolean validateObject(EObject eObject)
    {
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
              System.err.println("\t" + childDiagnostic.getMessage());
          }
        }
        return false;
      }
      return true;
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
}
