package utility;

import java.util.List;

import privacyModel.DataType;
import privacyModel.LocationType;

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
		
		public static void addPrivacyDataWithSharedPrivacyData(String name, DataType type,
				Boolean collectedFromSubject, String privacyDataSource, List<String> additionalProtectionControls)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var privacyDataObject = repo.getFactory().createPrivacyData();
			privacyDataObject.setName(name);
			privacyDataObject.setType(type);
			model.getAllDatas().add(privacyDataObject);
			var sharedPrivacyDataObject = repo.getFactory().createSharedPrivacyData();
			sharedPrivacyDataObject.setName(name);
			sharedPrivacyDataObject.setCollectedFromSubject(collectedFromSubject);
			sharedPrivacyDataObject.setDataSource(privacyDataSource);
			sharedPrivacyDataObject.setPrivacydata(privacyDataObject);
			if(additionalProtectionControls != null)
			{
				sharedPrivacyDataObject.getAdditionalProtectionControls().addAll(additionalProtectionControls);
			}
			
			model.getAllSharedPrivacyData().add(sharedPrivacyDataObject);
			repo.saveModel(model);
		}
		
		public static void addRegion(String name, String parentId)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var locationObject = repo.getFactory().createLocation();
			locationObject.setName(name);
			locationObject.setType(LocationType.REGION);
			var parentObj = model.getLocations().stream().filter(location -> location.getName().equals(parentId)).findFirst();
			if(parentObj.isPresent())
			{
				parentObj.get().getSubLocations().add(locationObject);
			}
			else
			{
				System.out.println("There is no location with id " + parentId);
				return;
			}
			model.getLocations().add(locationObject);
			repo.saveModel(model);
		}
		
		public static void addCountry(String name, Boolean isEUmember, int legalAgeLimit)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var locationObject = repo.getFactory().createLocation();
			locationObject.setName(name);
			locationObject.setType(LocationType.COUNTRY);
			locationObject.setIsEUMember(isEUmember);
			locationObject.setLegalAgeLimit(legalAgeLimit);
			model.getLocations().add(locationObject);
			repo.saveModel(model);
		}
	}
}
