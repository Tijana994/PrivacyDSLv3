package utility;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import utility.ProjectConfiguration.Configuration;

/** The output of TeMDA messages to the console or to a log file. */
public class TemdaLogTest {

	private static final String MODEL = """
			<?xml version="1.0" encoding="UTF-8"?>
			<privacyModel:PrivacyPolicy xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:privacyModel="http://privacymodel"
			    name="Test policy" owner="//@allPrincipals.0">
			  <allPrincipals name="Bank" type="LegalEntity" scope="In" inhabits="//@locations.0"/>
			  <locations name="Hungary" isEUMember="true" type="Country"/>
			  <configurationManager/>
			  <privacyPolicyHelper/>
			</privacyModel:PrivacyPolicy>
			""";

	private Path dir;
	private PrintStream originalOut;
	private ByteArrayOutputStream out;
	private String originalXmlPath;

	@Before
	public void setUp() throws IOException {
		dir = Files.createTempDirectory("temda-log");
		originalOut = System.out;
		out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out, true, StandardCharsets.UTF_8));
		originalXmlPath = Configuration.getXmlPath();
	}

	@After
	public void tearDown() throws IOException {
		System.setOut(originalOut);
		Configuration.setLogOutput(LogOutput.CONSOLE);
		Configuration.setLogFilePath("temda-validation.log");
		Configuration.setXmlPath(originalXmlPath);
		try (Stream<Path> paths = Files.walk(dir)) {
			paths.sorted(Comparator.reverseOrder()).map(Path::toFile).forEach(File::delete);
		}
	}

	private String console() {
		return out.toString(StandardCharsets.UTF_8);
	}

	@Test
	public void consoleIsTheDefaultOutput() {
		assertEquals(LogOutput.CONSOLE, Configuration.getLogOutput());
		TemdaLog.log("message on the console");
		assertTrue(console().contains("message on the console"));
	}

	@Test
	public void fileOutputAppendsMessagesAndCreatesMissingFolders() throws IOException {
		Path file = dir.resolve("logs").resolve("validation.log");
		Configuration.setLogFilePath(file.toString());
		Configuration.setLogOutput(LogOutput.FILE);

		TemdaLog.log("first message");
		TemdaLog.log("second message");

		List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
		assertEquals(2, lines.size());
		assertTrue(lines.get(0).endsWith("] first message"));
		assertTrue(lines.get(1).endsWith("] second message"));
		assertFalse(console().contains("first message"));
	}

	@Test
	public void validationResultIsWrittenToTheLogFile() throws IOException {
		Path model = dir.resolve("model.xmi");
		Files.writeString(model, MODEL);
		Configuration.setXmlPath(model.toUri().toString());
		Path file = dir.resolve("validation.log");
		Configuration.setLogFilePath(file.toString());
		Configuration.setLogOutput(LogOutput.FILE);

		var repository = new PrivacyModelRepository();
		repository.saveModel(repository.getModel());

		String log = Files.readString(file, StandardCharsets.UTF_8);
		assertTrue(log, log.contains("Model is valid.") || log.contains("Validation failed with errors:"));
		assertFalse(console().contains("Model is valid."));
	}

	@Test
	public void messageGoesToTheConsoleWhenTheFileCannotBeWritten() {
		Configuration.setLogFilePath(dir.toString());
		Configuration.setLogOutput(LogOutput.FILE);

		TemdaLog.log("message that cannot be written to a folder");

		assertTrue(console().contains("message that cannot be written to a folder"));
	}

	@Test
	public void nullOutputFallsBackToConsole() {
		Configuration.setLogOutput(null);
		assertEquals(LogOutput.CONSOLE, Configuration.getLogOutput());
	}
}
