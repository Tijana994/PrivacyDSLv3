package utility;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;
import java.util.List;

import privacyModel.DataOrigin;
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
				DataOrigin origin, String privacyDataSource, List<String> additionalProtectionControls)
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
			sharedPrivacyDataObject.setOrigin(origin);
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
				DataOrigin origin, String privacyDataSource, List<String> additionalProtectionControls)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var privacyDataObject = repo.getFactory().createPrivacyData();
			privacyDataObject.setName(name);
			privacyDataObject.setType(type);
			model.getAllDatas().add(privacyDataObject);
			var sharedPrivacyDataObject = repo.getFactory().createSharedPrivacyData();
			sharedPrivacyDataObject.setName(name);
			sharedPrivacyDataObject.setOrigin(origin);
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
		
		public static void addService(String name, String parentServiceId)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var serviceObject = repo.getFactory().createService();
			serviceObject.setName(name);
			if(parentServiceId != null && !parentServiceId.isEmpty())
			{
				var parentObj = model.getAllServices().stream().filter(service -> service.getName().equals(parentServiceId)).findFirst();
				if(parentObj.isEmpty())
				{
					System.out.println("There is no service with id " + parentServiceId);
					return;
				}
				parentObj.get().getSubservices().add(serviceObject);
			}
			model.getAllServices().add(serviceObject);
			repo.saveModel(model);
		}
		
		public static void addProvider(String name, String locationId, List<String> serviceIds)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var locationObj = model.getLocations().stream().filter(location -> location.getName().equals(locationId)).findFirst();
			if(locationObj.isEmpty())
			{
				System.out.println("There is no location with id " + locationId);
				return;
			}
			var providerObject = repo.getFactory().createProvider();
			providerObject.setName(name);
			providerObject.setLocated(locationObj.get());
			if(serviceIds != null)
			{
				for(var serviceId : serviceIds)
				{
					var serviceObj = model.getAllServices().stream().filter(service -> service.getName().equals(serviceId)).findFirst();
					if(serviceObj.isPresent())
					{
						providerObject.getProvide().add(serviceObj.get());
					}
					else
					{
						var serviceObject = repo.getFactory().createService();
						serviceObject.setName(serviceId);
						model.getAllServices().add(serviceObject);
						providerObject.getProvide().add(serviceObject);
					}
				}
			}
			model.getAllProviders().add(providerObject);
			repo.saveModel(model);
		}
		
		public static void addProviderContract(String name, String providerId, String location, String transferCertificateName)
		{
			var repo = new PrivacyModelRepository();
			var model = repo.getModel();
			var providerObj = model.getAllProviders().stream().filter(provider -> provider.getName().equals(providerId)).findFirst();
			if(providerObj.isEmpty())
			{
				System.out.println("There is no provider with id " + providerId);
				return;
			}
			var startDate = Date.from(LocalDateTime.now().toInstant(ZoneOffset.UTC));
			var contractObject = repo.getFactory().createContract();
			contractObject.setName(name);
			contractObject.setProvider(providerObj.get());
			contractObject.setStartDate(startDate);
			contractObject.setLocation(location);
			if(transferCertificateName != null && !transferCertificateName.isEmpty())
			{
				if(model.getOwner() == null)
				{
					System.out.println("The owner of the privacy policy must be defined before a transfer certificate is added");
					return;
				}
				var documentObject = repo.getFactory().createDocument();
				documentObject.setName(transferCertificateName);
				documentObject.setDocumentType(DocumentType.TRANSFER_CERTIFICATE);
				documentObject.setProvidedBy(model.getOwner());
				documentObject.setStartDate(startDate);
				documentObject.setLocation(location);
				model.getAllDocuments().add(documentObject);
				contractObject.getDocuments().add(documentObject);
			}
			model.getAllContracts().add(contractObject);
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
