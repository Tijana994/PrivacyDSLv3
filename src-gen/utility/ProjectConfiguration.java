package utility;

import org.eclipse.emf.common.util.EList;

import privacyModel.Principal;
import privacyModel.PrivacyModelFactory;
import privacyModel.PrivacyModelPackage;

public class ProjectConfiguration {
	
	public static class Configuration{
		
		private static String xmlPath = "model/test.xmi";
		private static Boolean fromDisc = false;
		
		public static String getXmlPath(){
		    return xmlPath;
		}

		public static void setXmlPath(String newXmlPath){
			xmlPath = newXmlPath;
		}
		
		public static void setFromDiscLocation(Boolean newValue){
			fromDisc = newValue;
		}

		public static Boolean getFromDisc() {
			return fromDisc;
		}
		
		public static Boolean createDefaultConfiguration()
		{
			var p = PrivacyModelPackage.eINSTANCE;
			PrivacyModelFactory factory = PrivacyModelFactory.eINSTANCE;
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			model.setConfigurationManager(factory.createConfigurationManager());
			model.setPrivacyPolicyHelper(factory.createPrivacyPolicyHelper());
			return repo.saveModel(model);
		}
		
		public static void setDataSources(EList<String> dataSources)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			model.getConfigurationManager().getDataSources().clear();
			model.getConfigurationManager().getDataSources().addAll(dataSources);
			repo.saveModel(model);
		}
		
		public static void addDataSources(String dataSource)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			model.getConfigurationManager().getDataSources().add(dataSource);
			repo.saveModel(model);
		}
		
		public static void setProtectionControlMethods(EList<String> protectionControlMethods)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			model.getConfigurationManager().getProtectionControlMethods().clear();
			model.getConfigurationManager().getProtectionControlMethods().addAll(protectionControlMethods);
			repo.saveModel(model);
		}
		
		public static void addProtectionControlMethod(String protectionControlMethod)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			model.getConfigurationManager().getProtectionControlMethods().add(protectionControlMethod);
			repo.saveModel(model);
		}
		
		public static void setPrivacyPolicyName(String name)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			model.setName(name);
			repo.saveModel(model);
		}
		
		public static void setPrivacyPolicyOwner(Principal owner)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			model.setOwner(owner);
			repo.saveModel(model);
		}

		public static void setDefaultProtectionControls(EList<String> protectionCOntrols)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			model.getDefaultProtectionControls().clear();
			model.getDefaultProtectionControls().addAll(protectionCOntrols);
			repo.saveModel(model);
		}
	}

}
