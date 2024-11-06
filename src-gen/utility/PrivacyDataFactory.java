package utility;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

import privacyModel.DataType;
import privacyModel.DocumentType;
import privacyModel.LocationType;
import privacyModel.Principal;
import privacyModel.PrincipalScope;
import privacyModel.PrincipalType;
import privacyModel.ProcessingReason;
import privacyModel.ProcessingReasonSubtype;
import privacyModel.Purpose;

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
			if(parentObj.isEmpty())
			{
				System.out.println("There is no location with id " + parentId);
				return;
			}
			parentObj.get().getSubLocations().add(locationObject);
			locationObject.setIsEUMember(parentObj.get().isIsEUMember());
			locationObject.setLegalAgeLimit(parentObj.get().getLegalAgeLimit());
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
		
		public static void addSubPrincipal(String childId, String parentId)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var childObj = model.getAllPrincipals().stream().filter(principal -> principal.getName().equals(childId)).findFirst();
			if(childObj.isEmpty())
			{
				System.out.println("There is no principal with id " + childId);
				return;
			}
			var parentObj = model.getAllPrincipals().stream().filter(principal -> principal.getName().equals(parentId)).findFirst();
			if(parentObj.isEmpty())
			{
				System.out.println("There is no principal with id " + parentId);
				return;
			}
			parentObj.get().getSubPrincipals().add(childObj.get());
			repo.saveModel(model);
			
		}
		
		public static Purpose createPurpose(String details, ProcessingReason reason, ProcessingReasonSubtype subtype)
		{
			var repo = new PrivacyModelRepository();
			var purpose = repo.getFactory().createPurpose();
			purpose.setDetails(details);
			purpose.setProcessingReason(reason);
			purpose.setProcessingReasonSubtype(subtype);
			return purpose;
		}
		
		public static void addChildCustodyDocument(String documentName, String childId, String parentId, Boolean shouldCreateParent)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var childObj = model.getAllPrincipals().stream().filter(principal -> principal.getName().equals(childId)).findFirst();
			if(childObj.isEmpty())
			{
				System.out.println("There is no principal with id " + childId);
				return;
			}
			Principal parent = null;
			if(shouldCreateParent)
			{
				parent = repo.getFactory().createPrincipal();
				parent.setName(parentId);
				parent.setType(PrincipalType.NATURAL_PERSON);
				parent.setScope(PrincipalScope.OUT);
				parent.setAge(30);
				childObj.get().getResponsiblePersons().add(parent);
				model.getAllPrincipals().add(parent);
				repo.saveModel(model);
			}
			else
			{
				var parentObj = model.getAllPrincipals().stream().filter(principal -> principal.getName().equals(parentId)).findFirst();
				if(parentObj.isEmpty())
				{
					System.out.println("There is no principal with id " + parentId);
					return;
				}
				parent = parentObj.get();
			}
			var documentObject = repo.getFactory().createDocument();
			documentObject.setName(documentName);
			documentObject.setDocumentType(DocumentType.CHILD_CUSTODY);
			documentObject.setLocation("System");
			documentObject.setProvidedBy(parent);
			documentObject.setStartDate(Date.from(LocalDateTime.now().toInstant(ZoneOffset.UTC)));
			model.getAllDocuments().add(documentObject);
			repo.saveModel(model);
		}
	}
}
