package ocltests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import privacyModel.ProcessingReason;
import privacyModel.ProcessingReasonSubtype;
import privacyModel.TimePreposition;

/**
 * Checks every combination for the rules that depend on a combination of values:
 *
 * - Purpose: every processing reason with every sub-reason, both as the main purpose
 *   of a policy statement and as a sub-purpose. A combination must violate exactly the
 *   rule of its reason when the sub-reason is not allowed, and nothing otherwise.
 * - TimeInterval: every start preposition with every end preposition, with the start
 *   date before, equal to and after the end date. The expected set of violated rules
 *   is computed from the rule descriptions below.
 *
 * The expected results come from the tables in this class (ALLOWED_SUBREASONS and
 * expectedTimeIntervalViolations), written from the GDPR rules, not from the OCL code.
 */
@RunWith(Parameterized.class)
public class CombinationsTest {

	/** Allowed sub-reasons per processing reason, and the rule that checks them. */
	static final Map<ProcessingReason, Object[]> ALLOWED_SUBREASONS = new LinkedHashMap<>();
	static {
		allow(ProcessingReason.RESEARCH, "ResearchShouldNotContainThisSubReason",
				"None", "Other", "Scientific", "Historical", "Statistical");
		allow(ProcessingReason.PUBLIC_HEALTH, "PublicHealthShouldNotContainSubReason", "None");
		allow(ProcessingReason.OUT_OF_SCOPE, "OutOfScopeShouldNotContainThisSubReason",
				"OutOfEU", "PersonalActivity", "SpecialScopeOfActivity", "None", "Other");
		allow(ProcessingReason.PUBLIC_INTEREST, "PublicInterestShouldNotContainThisSubReason",
				"Prevention", "Investigation", "Detection", "Prosecution", "PreventionOfThreats", "None", "Other");
		allow(ProcessingReason.STATISTICAL_PURPOSES, "StatisticalPurposesShouldNotContainSubReason", "None");
		allow(ProcessingReason.EXERCISING_SPECIFIC_RIGHTS, "ExercisingSpecificRightsPurposesCannotContainThisSubReason",
				"Employment", "SocialSecurity", "SocialProtection", "None", "Other");
		allow(ProcessingReason.MARKETING, "MarketingShouldNotContainSubReason", "None");
		allow(ProcessingReason.TESTING, "TestingShouldNotContainSubReason", "None");
		allow(ProcessingReason.PROFILING, "ProfilingShouldNotContainSubReason", "None");
		allow(ProcessingReason.PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT,
				"ProtectTheVitalInterestsOfTheDataSubjectShouldNotContainThisSubReason",
				"PhysicallyIncapable", "LegallyIncapable", "Other", "None");
		allow(ProcessingReason.LEGITIMATE_INTERESTS, "LegitimateInterestsShouldNotContainThisSubReason", "None");
		allow(ProcessingReason.STOP_PROCESSING, "StopProcessingShouldNotContainSubReason", "None");
		allow(ProcessingReason.CONTRACT_PERFORMANCE, "ContractPerformanceCannotContainThisSubReason",
				"PreContractual", "None", "Other");
		allow(ProcessingReason.LEGAL_OBLIGATION, "LegalObligationShouldNotContainSubReason", "None");
		allow(ProcessingReason.LEGAL_CLAIMS, "LegalClaimsShouldNotContainThisSubReason",
				"ProtectionOfRightsOfOthers", "None", "Other");
		allow(ProcessingReason.HEALTH_CARE, "HealthCareShouldNotContainSubReason", "None");
		allow(ProcessingReason.NOT_FOR_PROFIT_BODY_ACTIVITY, "NotForProfitBodyActivityShouldNotContainSubReason", "None");
	}

	/** Reasons for which the policy statement must carry a document of this type. */
	static final Map<ProcessingReason, String> REQUIRED_DOCUMENT = Map.of(
			ProcessingReason.PUBLIC_INTEREST, "CourtApproval",
			ProcessingReason.LEGITIMATE_INTERESTS, "ControllerApproval",
			ProcessingReason.PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT, "ControllerApproval",
			ProcessingReason.LEGAL_OBLIGATION, "LegalProvision");

	private static void allow(ProcessingReason reason, String rule, String... subreasons) {
		ALLOWED_SUBREASONS.put(reason, new Object[] { rule, Arrays.asList(subreasons) });
	}

	static final String EARLY = "2024-01-01T00:00:00.000+0100";
	static final String LATE = "2024-06-01T00:00:00.000+0200";

	/** Expected TimeInterval violations for an interval "start ... end". */
	static Set<String> expectedTimeIntervalViolations(TimePreposition start, TimePreposition end, int order) {
		Set<String> violated = new TreeSet<>();
		// 'after' may only be combined with 'before'
		if (start == TimePreposition.AFTER && end != TimePreposition.BEFORE) {
			violated.add("TimeInterval::OnlyAfterOrAfterWithBefore");
		}
		// 'from' may only be combined with 'to'
		if (start == TimePreposition.FROM && end != TimePreposition.TO) {
			violated.add("TimeInterval::OnlyFromOrFromWithTo");
		}
		// 'at' and 'until' cannot be part of an interval
		if (start == TimePreposition.AT || end == TimePreposition.AT) {
			violated.add("TimeInterval::AtTypeShouldBeDefinedAlone");
		}
		if (start == TimePreposition.UNTIL || end == TimePreposition.UNTIL) {
			violated.add("TimeInterval::UntilTypeShouldBeDefinedAlone");
		}
		// 'after X before Y' needs X earlier than Y; 'before ... after' is never allowed
		if ((start == TimePreposition.AFTER && end == TimePreposition.BEFORE && order >= 0)
				|| (start == TimePreposition.BEFORE && end == TimePreposition.AFTER)) {
			violated.add("TimeInterval::AfterStatementBeforeBeforeStatement");
		}
		// 'from X to Y' needs X earlier than Y; 'to ... from' is never allowed
		if ((start == TimePreposition.FROM && end == TimePreposition.TO && order >= 0)
				|| (start == TimePreposition.TO && end == TimePreposition.FROM)) {
			violated.add("TimeInterval::FromStatementBeforeToStatement");
		}
		return violated;
	}

	private final String model;
	private final Set<String> expected;

	public CombinationsTest(String name, String model, Set<String> expected) {
		this.model = model;
		this.expected = expected;
	}

	@Parameters(name = "{0}")
	public static Collection<Object[]> combinations() {
		List<Object[]> result = new ArrayList<>();
		for (Map.Entry<ProcessingReason, Object[]> entry : ALLOWED_SUBREASONS.entrySet()) {
			ProcessingReason reason = entry.getKey();
			String rule = "Purpose::" + entry.getValue()[0];
			@SuppressWarnings("unchecked")
			List<String> allowed = (List<String>) entry.getValue()[1];
			for (ProcessingReasonSubtype subtype : ProcessingReasonSubtype.VALUES) {
				Set<String> expected = new TreeSet<>();
				if (!allowed.contains(subtype.getName())) {
					expected.add(rule);
				}
				for (boolean asSubPurpose : new boolean[] { false, true }) {
					String name = "Purpose " + reason.getName() + " / " + subtype.getName()
							+ (asSubPurpose ? " (sub-purpose)" : " (main purpose)")
							+ (expected.isEmpty() ? " is allowed" : " violates " + rule);
					result.add(new Object[] { name, purposeModel(reason, subtype, asSubPurpose), expected });
				}
			}
		}
		String[] orderNames = { "start before end", "same date", "start after end" };
		String[][] dates = { { EARLY, LATE }, { EARLY, EARLY }, { LATE, EARLY } };
		for (TimePreposition start : TimePreposition.VALUES) {
			for (TimePreposition end : TimePreposition.VALUES) {
				for (int i = 0; i < 3; i++) {
					int order = i - 1; // -1: start < end, 0: equal, 1: start > end
					Set<String> expected = expectedTimeIntervalViolations(start, end, order);
					String name = "TimeInterval " + start.getName() + " ... " + end.getName() + " (" + orderNames[i] + ") "
							+ (expected.isEmpty() ? "is allowed" : "violates " + expected);
					result.add(new Object[] { name, intervalModel(start, end, dates[i][0], dates[i][1]), expected });
				}
			}
		}
		return result;
	}

	@Test
	public void combination() throws IOException {
		File file = File.createTempFile("combination", ".xmi");
		try {
			Files.write(file.toPath(), model.getBytes(StandardCharsets.UTF_8));
			OclValidator.Result result = OclValidator.validate(file);
			assertTrue("Model could not be validated cleanly: " + result.problems, result.problems.isEmpty());
			assertEquals(expected, new TreeSet<>(result.violated));
		} finally {
			file.delete();
		}
	}

	// ------------------------------------------------------------------ model templates

	private static String policy(String statement, String documents) {
		return "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n"
				+ "<privacyModel:PrivacyPolicy xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\""
				+ " xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:privacyModel=\"http://privacymodel\""
				+ " name=\"Test policy\" owner=\"//@allPrincipals.0\">\n"
				+ statement
				+ "  <allPrincipals name=\"Company\" inhabits=\"//@locations.0\"/>\n"
				+ "  <locations name=\"Serbia\" type=\"Country\" legalAgeLimit=\"18\"/>\n"
				+ "  <configurationManager/>\n"
				+ "  <privacyPolicyHelper/>\n"
				+ documents
				+ "</privacyModel:PrivacyPolicy>\n";
	}

	private static String statement(String when, String why, String how) {
		return "  <policyStatements name=\"Statement\" who=\"//@allPrincipals.0\">\n"
				+ "    " + when + "\n"
				+ "    " + why + "\n"
				+ "    <what><actions>Access</actions></what>\n"
				+ how
				+ "  </policyStatements>\n";
	}

	private static final String AT_EARLY =
			"<when xsi:type=\"privacyModel:TimeStatement\" preposition=\"at\" dateTime=\"" + EARLY + "\"/>";

	static String purposeModel(ProcessingReason reason, ProcessingReasonSubtype subtype, boolean asSubPurpose) {
		String purpose = "processingReason=\"" + reason.getName() + "\" processingReasonSubtype=\"" + subtype.getName() + "\"";
		String why = asSubPurpose
				? "<why processingReason=\"Research\"><subPurposes " + purpose + "/></why>"
				: "<why " + purpose + "/>";
		String document = REQUIRED_DOCUMENT.get(reason);
		String how = document == null ? "" : "    <how documents=\"//@allDocuments.0\"/>\n";
		String documents = document == null ? ""
				: "  <allDocuments name=\"" + document + " document\" providedBy=\"//@allPrincipals.0\""
						+ " startDate=\"2023-01-01T00:00:00.000+0100\" location=\"Belgrade\" documentType=\"" + document + "\"/>\n";
		return policy(statement(AT_EARLY, why, how), documents);
	}

	static String intervalModel(TimePreposition start, TimePreposition end, String startDate, String endDate) {
		String when = "<when xsi:type=\"privacyModel:TimeInterval\">"
				+ "<start preposition=\"" + start.getName() + "\" dateTime=\"" + startDate + "\"/>"
				+ "<end preposition=\"" + end.getName() + "\" dateTime=\"" + endDate + "\"/></when>";
		return policy(statement(when, "<why processingReason=\"Research\"/>", ""), "");
	}
}
