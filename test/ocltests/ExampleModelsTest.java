package ocltests;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

/** The example models in model/ are complete, realistic policies and must stay valid. */
public class ExampleModelsTest {

	@Test
	public void hospitalModelIsValid() {
		assertValid("model/hospital.xmi");
	}

	@Test
	public void bankModelIsValid() {
		assertValid("model/bank.xmi");
	}

	private static void assertValid(String path) {
		OclValidator.Result result = OclValidator.validate(new File(path));
		assertTrue(path + " should be valid, but: " + result, result.isValid());
	}
}
