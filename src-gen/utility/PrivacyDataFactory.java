package utility;

import java.util.List;

import privacyModel.DataType;

public class PrivacyDataFactory {

	public static class DataFactory{
		
		public static void addPrivacyData(String name, DataType type)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var privacyDataObject = repo.getFactory().createPrivacyData();
			privacyDataObject.setName(name);
			privacyDataObject.setType(type);
			model.getAllDatas().add(privacyDataObject);
			repo.saveModel(model);
		}
		
		public static void addSharedPrivacyData(String name, String privacyDataId, 
				Boolean collectedFromSubject, String privacyDataSource, List<String> additionalProtectionControls)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			
			var privacyDataOptional = model.getAllDatas().stream()
			   .filter(privacyData -> privacyData.getName().equals(privacyDataId)).findFirst();
			
			if(privacyDataOptional.isEmpty())
			{
				System.out.println("There is no privacy data with id " + privacyDataId);
				return;
			}
			var sharedPrivacyDataObject = repo.getFactory().createSharedPrivacyData();
			sharedPrivacyDataObject.setName(name);
			sharedPrivacyDataObject.setCollectedFromSubject(collectedFromSubject);
			sharedPrivacyDataObject.setDataSource(privacyDataSource);
			sharedPrivacyDataObject.setPrivacydata(privacyDataOptional.get());
			if(additionalProtectionControls != null)
			{
				sharedPrivacyDataObject.getAdditionalProtectionControls().addAll(additionalProtectionControls);
			}
			
			model.getAllSharedPrivacyData().add(sharedPrivacyDataObject);
			repo.saveModel(model);
		}
	}
}
