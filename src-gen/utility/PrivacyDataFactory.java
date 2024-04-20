package utility;

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
	}
}
