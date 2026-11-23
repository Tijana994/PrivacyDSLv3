package ocltests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * One test per example model in test-models/, named after the rule it tests:
 *
 *   WithdrawnConsent-valid.xmi            must not violate any rule
 *   WithdrawnConsent-invalid.xmi          must violate exactly WithdrawnConsent
 *   WithdrawnConsent-invalid-expired.xmi  more examples: add anything after valid/invalid
 *
 * If two classes have a rule with the same name, put the class in front:
 *   SharedPrivacyData.ProtectionControlShouldExistInConfiguration-invalid.xmi
 *
 * Adding a test therefore means only adding an XMI file; no Java code is needed.
 */
@RunWith(Parameterized.class)
public class RuleExamplesTest {

	public static final File MODELS = new File("test-models");

	/** &lt;rule&gt;-valid... or &lt;rule&gt;-invalid... */
	static final Pattern FILE_NAME = Pattern.compile("^(.+?)-(valid|invalid)(-.*)?\\.xmi$");

	private final File model;

	public RuleExamplesTest(String name, File model) {
		this.model = model;
	}

	@Parameters(name = "{0}")
	public static Collection<Object[]> models() {
		List<Object[]> result = new ArrayList<>();
		File[] files = MODELS.listFiles((dir, name) -> name.endsWith(".xmi"));
		if (files != null) {
			Arrays.sort(files);
			for (File file : files) {
				result.add(new Object[] { file.getName(), file });
			}
		}
		return result;
	}

	@Test
	public void example() {
		Matcher name = FILE_NAME.matcher(model.getName());
		assertTrue("File name must look like <Rule>-valid.xmi or <Rule>-invalid.xmi: " + model.getName(),
				name.matches());
		String rule = resolveRule(name.group(1));
		boolean valid = name.group(2).equals("valid");

		OclValidator.Result result = OclValidator.validate(model);
		assertTrue("Model could not be validated cleanly: " + result.problems, result.problems.isEmpty());

		if (valid) {
			assertEquals("Valid example must not violate any rule", Collections.emptySet(), result.violated);
		} else {
			assertEquals("Invalid example must violate exactly this rule", Collections.singleton(rule),
					result.violated);
		}
	}

	/** "WithdrawnConsent" or "PolicyStatement.WithdrawnConsent" -> "PolicyStatement::WithdrawnConsent". */
	static String resolveRule(String text) {
		List<String> matches = new ArrayList<>();
		for (String rule : OclValidator.allConstraints()) {
			String className = rule.substring(0, rule.indexOf("::"));
			String ruleName = rule.substring(rule.indexOf("::") + 2);
			if (text.equals(ruleName) || text.equals(className + "." + ruleName)) {
				matches.add(rule);
			}
		}
		assertTrue("Unknown rule '" + text + "' (does not match a constraint in privacyModel.ecore)",
				!matches.isEmpty());
		assertEquals("Rule '" + text + "' exists in several classes, put the class in front, e.g. "
				+ matches.get(0).replace("::", ".") + "-valid.xmi", 1, matches.size());
		return matches.get(0);
	}
}
