package utility;

import java.util.List;

import privacyModel.PrivacyModelFactory;
import privacyModel.PrivacyModelPackage;

public class ProjectConfiguration {
	
	public static class Configuration{
		
		private static String xmlPath = "model/test.xmi";
		private static Boolean fromDisc = false;
		private static LogOutput logOutput = LogOutput.CONSOLE;
		private static String logFilePath = "temda-validation.log";
		
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
		
		public static LogOutput getLogOutput() {
			return logOutput;
		}
		
		/** Sets whether TeMDA messages are written to the console (default) or to the log file. */
		public static void setLogOutput(LogOutput newLogOutput) {
			logOutput = newLogOutput == null ? LogOutput.CONSOLE : newLogOutput;
		}
		
		public static String getLogFilePath() {
			return logFilePath;
		}
		
		/** Sets the file to which TeMDA messages are appended when the output is LogOutput.FILE. */
		public static void setLogFilePath(String newLogFilePath) {
			logFilePath = newLogFilePath;
		}
		
		public static Boolean createDefaultConfiguration()
		{
			var p = PrivacyModelPackage.eINSTANCE;
			PrivacyModelFactory factory = PrivacyModelFactory.eINSTANCE;
			var repo = new PrivacyModelRepository();
			var model = factory.createPrivacyPolicy();
			model.setConfigurationManager(factory.createConfigurationManager());
			model.setPrivacyPolicyHelper(factory.createPrivacyPolicyHelper());
			return repo.saveModel(model);
		}
		
		public static void setDataSources(List<String> dataSources)
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
		
		public static void setProtectionControlMethods(List<String> protectionControlMethods)
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
		
		public static void setPrivacyPolicyOwner(String ownerId)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var owner = model.getAllPrincipals().stream()
			   .filter(principal -> principal.getName().equals(ownerId)).findFirst();
			if(owner.isPresent())
			{
				model.setOwner(owner.get());
				repo.saveModel(model);
			}
		}

		public static void setDefaultProtectionControls(List<String> protectionCOntrols)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			model.getDefaultProtectionControls().clear();
			model.getDefaultProtectionControls().addAll(protectionCOntrols);
			repo.saveModel(model);
		}
	}

}
