package utility;

import java.lang.reflect.Field;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import privacyModel.PrivacyModelFactory;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyPolicy;
import utility.ProjectConfiguration.Configuration;

public class PrivacyModelRepository {

	public PrivacyModelRepository()
	{
		
	}
	
    public PrivacyPolicy getModel() {
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
	}

	public Boolean saveModel(){
		//TODO
		return true;
	}
	
	public PrivacyModelFactory getFactory(){
		var p = PrivacyModelPackage.eINSTANCE;
	    // Retrieve the default factory singleton
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
