package utility;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import privacyModel.PrivacyModelFactory;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyPolicy;
import utility.ProjectConfiguration.Configuration;
import utility.validation.Validation;

public class PrivacyModelRepository {

	private Validation validationHelper;
	public PrivacyModelRepository()
	{
		validationHelper = new Validation();
	}
	
    public PrivacyPolicy getModel() {
    	try {
        	PrivacyModelPackage.eINSTANCE.eClass();
            Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
            Map<String, Object> m = reg.getExtensionToFactoryMap();
            m.put("xmi", new XMIResourceFactoryImpl());

    	    // Obtain a new resource set
    	    ResourceSet resSet = new ResourceSetImpl();
    	    registerPackage(resSet);
    	
    	    // Get the resource
    	    Resource resource = resSet.getResource(URI.createURI(Configuration.getXmlPath()), true);
    	    PrivacyPolicy policy = (PrivacyPolicy)resource.getContents().get(0);
    	    return policy;
    	} catch (Exception e){
 		   System.out.print("Problem with loading model. Exception " + e );
 		   return null;
 		 } 
	}

	public Boolean saveModel(PrivacyPolicy model){
    	PrivacyModelPackage.eINSTANCE.eClass();
        Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("xmi", new XMIResourceFactoryImpl());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("arxml", new XMIResourceImpl());

		URI uri = URI.createURI(Configuration.getXmlPath());
		Resource res = resourceSet.createResource(uri);

		 res.getContents().add(model);

		 try{
		    res.save(m);
		 } catch (IOException e){
		   System.out.print("Problem with saving. Exception " + e );
		   return false;
		 } 
		 
		 var validationResult = validationHelper.validateModel(Configuration.getXmlPath());
	     System.out.println(validationResult.ValidationMessage);
		 return true;
	}
	
	public PrivacyModelFactory getFactory(){
		var p = PrivacyModelPackage.eINSTANCE;
		return PrivacyModelFactory.eINSTANCE;
	}
	
	private void registerPackage(ResourceSet resSet) {
	    try {
	        Class<?> c = this.getClass().getClassLoader().loadClass("privacyModel.PrivacyModelPackage");
	        Field fNS = c.getField("eNS_URI");
	        Field fI = c.getField("eINSTANCE");
	        resSet.getPackageRegistry().put(fNS.get(null).toString(), fI.get(null));
	    	} 
	    catch (Exception e) {
	        // TODO: handle exception
	    	System.out.println("Cannot find class.");
	        }
	 }
}
