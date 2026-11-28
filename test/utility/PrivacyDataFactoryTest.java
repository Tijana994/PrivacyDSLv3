package utility;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import privacyModel.DocumentType;
import privacyModel.PrivacyPolicy;
import utility.PrivacyDataFactory.DataFactory;
import utility.ProjectConfiguration.Configuration;

/** The Data Factory methods that define services, providers and contracts with providers. */
public class PrivacyDataFactoryTest {

	private static final String MODEL = """
			<?xml version="1.0" encoding="UTF-8"?>
			<privacyModel:PrivacyPolicy xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:privacyModel="http://privacymodel"
			    name="Test policy" owner="//@allPrincipals.0">
			  <allPrincipals name="Bank" type="LegalEntity" scope="In" inhabits="//@locations.0"/>
			  <locations name="Hungary" isEUMember="true" type="Country"/>
			  <locations name="United States" type="Country" legalAgeLimit="18"/>
			  <allServices name="Hosting"/>
			  <configurationManager/>
			  <privacyPolicyHelper/>
			</privacyModel:PrivacyPolicy>
			""";

	private File file;

	@Before
	public void setUp() throws IOException {
		file = File.createTempFile("data-factory", ".xmi");
		Files.writeString(file.toPath(), MODEL);
		Configuration.setXmlPath(file.toURI().toString());
	}

	@After
	public void tearDown() {
		file.delete();
	}

	private static PrivacyPolicy model() {
		return new PrivacyModelRepository().getModel();
	}

	private static List<String> names(List<? extends privacyModel.NamedElement> elements) {
		return elements.stream().map(privacyModel.NamedElement::getName).collect(Collectors.toList());
	}

	@Test
	public void serviceWithoutParentIsTopLevel() {
		DataFactory.addService("Backup", null);
		assertEquals(List.of("Hosting", "Backup"), names(model().getAllServices()));
	}

	@Test
	public void serviceIsAddedAsSubserviceOfItsParent() {
		DataFactory.addService("Backup", "Hosting");
		var model = model();
		assertEquals(List.of("Backup"), names(model.getAllServices().get(0).getSubservices()));
	}

	@Test
	public void serviceWithUnknownParentIsNotAdded() {
		DataFactory.addService("Backup", "Analytics");
		assertEquals(List.of("Hosting"), names(model().getAllServices()));
	}

	@Test
	public void providerIsLocatedAndProvidesExistingAndNewServices() {
		DataFactory.addProvider("US cloud", "United States", List.of("Hosting", "Analytics"));
		var model = model();
		var provider = model.getAllProviders().get(0);
		assertEquals("US cloud", provider.getName());
		assertEquals("United States", provider.getLocated().getName());
		assertEquals(List.of("Hosting", "Analytics"), names(provider.getProvide()));
		assertEquals(List.of("Hosting", "Analytics"), names(model.getAllServices()));
	}

	@Test
	public void providerWithUnknownLocationIsNotAdded() {
		DataFactory.addProvider("Mars cloud", "Mars", List.of("Hosting"));
		assertTrue(model().getAllProviders().isEmpty());
	}

	@Test
	public void providerContractIncludesTheTransferCertificate() {
		DataFactory.addProvider("US cloud", "United States", List.of("Hosting"));
		DataFactory.addProviderContract("Hosting agreement", "US cloud", "Belgrade", "Standard contractual clauses");
		var model = model();
		var contract = model.getAllContracts().get(0);
		assertSame(model.getAllProviders().get(0), contract.getProvider());
		assertNull(contract.getProvidedBy());
		var certificate = contract.getDocuments().get(0);
		assertEquals("Standard contractual clauses", certificate.getName());
		assertEquals(DocumentType.TRANSFER_CERTIFICATE, certificate.getDocumentType());
		assertSame(model.getOwner(), certificate.getProvidedBy());
		assertEquals(List.of(certificate), model.getAllDocuments());
	}

	@Test
	public void providerContractWithoutCertificateHasNoDocuments() {
		DataFactory.addProvider("US cloud", "United States", List.of("Hosting"));
		DataFactory.addProviderContract("Hosting agreement", "US cloud", "Belgrade", null);
		var model = model();
		assertTrue(model.getAllContracts().get(0).getDocuments().isEmpty());
		assertTrue(model.getAllDocuments().isEmpty());
	}

	@Test
	public void contractWithUnknownProviderIsNotAdded() {
		DataFactory.addProviderContract("Hosting agreement", "US cloud", "Belgrade", "Standard contractual clauses");
		var model = model();
		assertTrue(model.getAllContracts().isEmpty());
		assertTrue(model.getAllDocuments().isEmpty());
	}
}
