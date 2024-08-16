package test;

import utility.PrivacyModelRepository;
import utility.ProjectConfiguration.Configuration;
import utility.validation.Validation;

public class Check {

	public static void main(String[] args) {
		Configuration.createDefaultConfiguration();
		var test = new PrivacyModelRepository();
		var validation = new Validation();
		var validationResult = validation.validateModel("model/bank.xmi");
    	System.out.println(validationResult.ValidationMessage);
	}

}
