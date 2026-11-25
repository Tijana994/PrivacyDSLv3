package ocltests;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import privacyModel.PrivacyModelPackage;
import utility.validation.Validation;

/**
 * Tests of the temporal helper operations of PrivacyPolicyHelper, one test per row of CASES.
 *
 * A row is "operation | argument | argument | expected result". An argument is either a date
 * (2024-06-01) or the time of a statement written as in a privacy policy:
 *
 *   at 2024-06-01, from 2024-06-01, after 2024-06-01, until 2024-06-01  (a moment)
 *   from 2024-03-01 to 2024-09-01, after 2024-03-01 before 2024-09-01   (an interval)
 *
 * The expected result is true, false, or a date (for endOfTime). Adding a test therefore means
 * only adding a row.
 */
@RunWith(Parameterized.class)
public class HelperOperationsTest {

	/** Interval used in most rows: from 2024-03-01 to 2024-09-01. */
	private static final String I = "from 2024-03-01 to 2024-09-01";
	/** The same period, with the end excluded: after 2024-03-01 before 2024-09-01. */
	private static final String J = "after 2024-03-01 before 2024-09-01";

	static final String[] CASES = {
		// isDateBeforeInterval(time, date): the date is before the moment, or before the whole interval
		"isDateBeforeInterval | at 2024-06-01 | 2024-05-31 | true",
		"isDateBeforeInterval | at 2024-06-01 | 2024-06-01 | false",
		"isDateBeforeInterval | at 2024-06-01 | 2024-06-02 | false",
		"isDateBeforeInterval | " + I + " | 2024-02-29 | true",
		"isDateBeforeInterval | " + I + " | 2024-03-01 | false",
		"isDateBeforeInterval | " + I + " | 2024-06-01 | false",
		// isDateAfterInterval(time, date): the date is after the moment, or after the whole interval
		"isDateAfterInterval | at 2024-06-01 | 2024-06-02 | true",
		"isDateAfterInterval | at 2024-06-01 | 2024-06-01 | false",
		"isDateAfterInterval | " + I + " | 2024-09-02 | true",
		"isDateAfterInterval | " + I + " | 2024-09-01 | false",
		"isDateAfterInterval | " + I + " | 2024-06-01 | false",
		// isDateInInterval(time, date): the date falls within the time
		"isDateInInterval | at 2024-06-01 | 2024-06-01 | true",
		"isDateInInterval | at 2024-06-01 | 2024-06-02 | false",
		"isDateInInterval | from 2024-06-01 | 2024-06-01 | true",
		"isDateInInterval | from 2024-06-01 | 2024-06-02 | true",
		"isDateInInterval | from 2024-06-01 | 2024-05-31 | false",
		"isDateInInterval | after 2024-06-01 | 2024-06-02 | true",
		"isDateInInterval | after 2024-06-01 | 2024-05-31 | false",
		"isDateInInterval | until 2024-06-01 | 2024-05-31 | true",
		"isDateInInterval | until 2024-06-01 | 2024-06-01 | true",
		"isDateInInterval | until 2024-06-01 | 2024-06-02 | false",
		"isDateInInterval | " + I + " | 2024-03-01 | true",
		"isDateInInterval | " + I + " | 2024-06-01 | true",
		"isDateInInterval | " + I + " | 2024-09-01 | true",
		"isDateInInterval | " + I + " | 2024-02-29 | false",
		"isDateInInterval | " + I + " | 2024-09-02 | false",
		// doesTimeEndAfterDate(time, date): the time extends beyond the date
		"doesTimeEndAfterDate | at 2024-06-01 | 2024-05-31 | true",
		"doesTimeEndAfterDate | at 2024-06-01 | 2024-06-01 | false",
		"doesTimeEndAfterDate | " + I + " | 2024-08-31 | true",
		"doesTimeEndAfterDate | " + I + " | 2024-09-01 | false",
		"doesTimeEndAfterDate | " + I + " | 2024-09-02 | false",
		// doesTimeStartBeforeDate(time, date): the time starts before the date
		"doesTimeStartBeforeDate | at 2024-06-01 | 2024-06-02 | true",
		"doesTimeStartBeforeDate | at 2024-06-01 | 2024-06-01 | false",
		"doesTimeStartBeforeDate | " + I + " | 2024-03-02 | true",
		"doesTimeStartBeforeDate | " + I + " | 2024-03-01 | false",
		"doesTimeStartBeforeDate | " + I + " | 2024-02-29 | false",
		// hasDefinedEnd(time): an interval, or a moment specified with until
		"hasDefinedEnd | at 2024-06-01 | false",
		"hasDefinedEnd | from 2024-06-01 | false",
		"hasDefinedEnd | after 2024-06-01 | false",
		"hasDefinedEnd | until 2024-06-01 | true",
		"hasDefinedEnd | " + I + " | true",
		"hasDefinedEnd | " + J + " | true",
		// endOfTime(time): the moment, or the end of the interval
		"endOfTime | at 2024-06-01 | 2024-06-01",
		"endOfTime | until 2024-06-01 | 2024-06-01",
		"endOfTime | " + I + " | 2024-09-01",
		"endOfTime | " + J + " | 2024-09-01",
		// areDatesOverlap(time, date): the time is not before the date
		"areDatesOverlap | at 2024-06-01 | 2024-06-01 | true",
		"areDatesOverlap | at 2024-06-01 | 2024-05-31 | true",
		"areDatesOverlap | at 2024-06-01 | 2024-06-02 | false",
		"areDatesOverlap | " + I + " | 2024-03-01 | true",
		"areDatesOverlap | " + I + " | 2024-03-02 | false",
		// areIntervalsOverlap(time1, time2): the first time falls within the second
		"areIntervalsOverlap | at 2024-06-01 | at 2024-03-01 | true",
		"areIntervalsOverlap | at 2024-03-01 | at 2024-03-01 | true",
		"areIntervalsOverlap | at 2024-02-01 | at 2024-03-01 | false",
		"areIntervalsOverlap | at 2024-06-01 | from 2024-03-01 | true",
		"areIntervalsOverlap | at 2024-06-01 | until 2024-09-01 | true",
		"areIntervalsOverlap | at 2024-09-01 | until 2024-09-01 | true",
		"areIntervalsOverlap | at 2024-09-02 | until 2024-09-01 | false",
		"areIntervalsOverlap | at 2024-06-01 | " + I + " | true",
		"areIntervalsOverlap | at 2024-03-01 | " + I + " | true",
		"areIntervalsOverlap | at 2024-09-01 | " + I + " | true",
		"areIntervalsOverlap | at 2024-09-02 | " + I + " | false",
		"areIntervalsOverlap | at 2024-02-29 | " + I + " | false",
		"areIntervalsOverlap | at 2024-08-31 | " + J + " | true",
		"areIntervalsOverlap | at 2024-09-01 | " + J + " | false",
		"areIntervalsOverlap | from 2024-06-01 to 2024-12-01 | " + I + " | true",
		"areIntervalsOverlap | from 2024-02-01 to 2024-06-01 | " + I + " | false",
		"areIntervalsOverlap | from 2024-06-01 | " + I + " | true",
		// doesIntervalStartBeforeInterval(time1, time2): the first time starts before the second
		"doesIntervalStartBeforeInterval | at 2024-03-01 | at 2024-06-01 | true",
		"doesIntervalStartBeforeInterval | at 2024-06-01 | at 2024-06-01 | false",
		"doesIntervalStartBeforeInterval | at 2024-07-01 | at 2024-06-01 | false",
		"doesIntervalStartBeforeInterval | " + I + " | at 2024-06-01 | true",
		"doesIntervalStartBeforeInterval | " + I + " | at 2024-02-01 | false",
		"doesIntervalStartBeforeInterval | " + I + " | at 2024-10-01 | false",
	};

	/** The package the operations are taken from; the generated one unless a test runner sets another. */
	public static EPackage PACKAGE = PrivacyModelPackage.eINSTANCE;

	private static boolean initialized = false;
	private static EObject helper;
	private static Resource resource;

	private final String row;

	public HelperOperationsTest(String name, String row) {
		this.row = row;
	}

	@Parameters(name = "{0}")
	public static Collection<Object[]> cases() {
		List<Object[]> result = new ArrayList<>();
		for (String row : CASES) {
			result.add(new Object[] { row.replace(" | ", ", "), row });
		}
		return result;
	}

	@Test
	public void operation() throws Exception {
		String[] parts = row.split(" \\| ");
		String expected = parts[parts.length - 1];
		Object actual = evaluate(parts[0], Arrays.copyOfRange(parts, 1, parts.length - 1));
		Object wanted = expected.equals("true") || expected.equals("false") ? (Object) Boolean.valueOf(expected) : date(expected);
		assertEquals(row, wanted, actual);
	}

	/** Invokes the helper operation with the given name on the parsed arguments. */
	public static Object evaluate(String operationName, String[] arguments) throws Exception {
		init();
		EClass helperClass = (EClass) PACKAGE.getEClassifier("PrivacyPolicyHelper");
		EOperation operation = null;
		for (EOperation candidate : helperClass.getEAllOperations()) {
			if (candidate.getName().equals(operationName) && candidate.getEParameters().size() == arguments.length) {
				operation = candidate;
			}
		}
		if (operation == null) {
			throw new IllegalArgumentException("No operation " + operationName + " with " + arguments.length + " parameters");
		}
		EList<Object> values = new BasicEList<>();
		for (String argument : arguments) {
			values.add(argument.matches("\\d{4}-\\d{2}-\\d{2}") ? date(argument) : time(argument));
		}
		return helper.eInvoke(operation, values);
	}

	private static synchronized void init() {
		if (!initialized) {
			new Validation(); // registers the OCL delegates (same setup as OclValidator)
			resource = new ResourceSetImpl().createResource(URI.createURI("helper-operations-test.xmi"));
			helper = EcoreUtil.create((EClass) PACKAGE.getEClassifier("PrivacyPolicyHelper"));
			resource.getContents().add(helper);
			initialized = true;
		}
	}

	/** "at 2024-06-01" or "from 2024-03-01 to 2024-09-01". */
	static EObject time(String text) {
		String[] words = text.trim().split("\\s+");
		EObject time;
		if (words.length == 2) {
			time = moment(words[0], words[1]);
		} else if (words.length == 4) {
			EClass intervalClass = (EClass) PACKAGE.getEClassifier("TimeInterval");
			time = EcoreUtil.create(intervalClass);
			time.eSet(intervalClass.getEStructuralFeature("start"), moment(words[0], words[1]));
			time.eSet(intervalClass.getEStructuralFeature("end"), moment(words[2], words[3]));
		} else {
			throw new IllegalArgumentException("Cannot read the time: " + text);
		}
		resource.getContents().add(time);
		return time;
	}

	private static EObject moment(String preposition, String date) {
		EClass statementClass = (EClass) PACKAGE.getEClassifier("TimeStatement");
		EEnum prepositions = (EEnum) PACKAGE.getEClassifier("TimePreposition");
		EObject statement = EcoreUtil.create(statementClass);
		statement.eSet(statementClass.getEStructuralFeature("preposition"), prepositions.getEEnumLiteral(preposition).getInstance());
		statement.eSet(statementClass.getEStructuralFeature("dateTime"), date(date));
		return statement;
	}

	static Date date(String text) {
		return Date.from(LocalDate.parse(text).atStartOfDay().toInstant(ZoneOffset.UTC));
	}
}
