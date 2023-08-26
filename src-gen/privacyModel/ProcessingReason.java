/**
 */
package privacyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Processing Reason</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelPackage#getProcessingReason()
 * @model
 * @generated
 */
public enum ProcessingReason implements Enumerator {
	/**
	 * The '<em><b>Research</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCH_VALUE
	 * @generated
	 * @ordered
	 */
	RESEARCH(0, "Research", "Research"),

	/**
	 * The '<em><b>Public Health</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_HEALTH_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_HEALTH(1, "PublicHealth", "PublicHealth"),

	/**
	 * The '<em><b>Out Of Scope</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_OF_SCOPE_VALUE
	 * @generated
	 * @ordered
	 */
	OUT_OF_SCOPE(2, "OutOfScope", "OutOfScope"),

	/**
	 * The '<em><b>Public Interest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_INTEREST_VALUE
	 * @generated
	 * @ordered
	 */
	PUBLIC_INTEREST(3, "PublicInterest", "PublicInterest"),

	/**
	 * The '<em><b>Statistical Purposes</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATISTICAL_PURPOSES_VALUE
	 * @generated
	 * @ordered
	 */
	STATISTICAL_PURPOSES(4, "StatisticalPurposes", "StatisticalPurposes"),

	/**
	 * The '<em><b>Exercising Specific Rights</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXERCISING_SPECIFIC_RIGHTS_VALUE
	 * @generated
	 * @ordered
	 */
	EXERCISING_SPECIFIC_RIGHTS(5, "ExercisingSpecificRights", "ExercisingSpecificRights"),

	/**
	 * The '<em><b>Marketing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKETING_VALUE
	 * @generated
	 * @ordered
	 */
	MARKETING(6, "Marketing", "Marketing"),

	/**
	 * The '<em><b>Testing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESTING_VALUE
	 * @generated
	 * @ordered
	 */
	TESTING(7, "Testing", "Testing"),

	/**
	 * The '<em><b>Profiling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFILING_VALUE
	 * @generated
	 * @ordered
	 */
	PROFILING(8, "Profiling", "Profiling"),

	/**
	 * The '<em><b>Protect The Vital Interests Of The Data Subject</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_VALUE
	 * @generated
	 * @ordered
	 */
	PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT(9, "ProtectTheVitalInterestsOfTheDataSubject",
			"ProtectTheVitalInterestsOfTheDataSubject"),

	/**
	 * The '<em><b>Legitimate Interests</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGITIMATE_INTERESTS_VALUE
	 * @generated
	 * @ordered
	 */
	LEGITIMATE_INTERESTS(10, "LegitimateInterests", "LegitimateInterests"),

	/**
	 * The '<em><b>Stop Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_PROCESSING(11, "StopProcessing", "StopProcessing");

	/**
	 * The '<em><b>Research</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESEARCH
	 * @model name="Research"
	 * @generated
	 * @ordered
	 */
	public static final int RESEARCH_VALUE = 0;

	/**
	 * The '<em><b>Public Health</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_HEALTH
	 * @model name="PublicHealth"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_HEALTH_VALUE = 1;

	/**
	 * The '<em><b>Out Of Scope</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_OF_SCOPE
	 * @model name="OutOfScope"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_OF_SCOPE_VALUE = 2;

	/**
	 * The '<em><b>Public Interest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUBLIC_INTEREST
	 * @model name="PublicInterest"
	 * @generated
	 * @ordered
	 */
	public static final int PUBLIC_INTEREST_VALUE = 3;

	/**
	 * The '<em><b>Statistical Purposes</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATISTICAL_PURPOSES
	 * @model name="StatisticalPurposes"
	 * @generated
	 * @ordered
	 */
	public static final int STATISTICAL_PURPOSES_VALUE = 4;

	/**
	 * The '<em><b>Exercising Specific Rights</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXERCISING_SPECIFIC_RIGHTS
	 * @model name="ExercisingSpecificRights"
	 * @generated
	 * @ordered
	 */
	public static final int EXERCISING_SPECIFIC_RIGHTS_VALUE = 5;

	/**
	 * The '<em><b>Marketing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARKETING
	 * @model name="Marketing"
	 * @generated
	 * @ordered
	 */
	public static final int MARKETING_VALUE = 6;

	/**
	 * The '<em><b>Testing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TESTING
	 * @model name="Testing"
	 * @generated
	 * @ordered
	 */
	public static final int TESTING_VALUE = 7;

	/**
	 * The '<em><b>Profiling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFILING
	 * @model name="Profiling"
	 * @generated
	 * @ordered
	 */
	public static final int PROFILING_VALUE = 8;

	/**
	 * The '<em><b>Protect The Vital Interests Of The Data Subject</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT
	 * @model name="ProtectTheVitalInterestsOfTheDataSubject"
	 * @generated
	 * @ordered
	 */
	public static final int PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_VALUE = 9;

	/**
	 * The '<em><b>Legitimate Interests</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGITIMATE_INTERESTS
	 * @model name="LegitimateInterests"
	 * @generated
	 * @ordered
	 */
	public static final int LEGITIMATE_INTERESTS_VALUE = 10;

	/**
	 * The '<em><b>Stop Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESSING
	 * @model name="StopProcessing"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_PROCESSING_VALUE = 11;

	/**
	 * An array of all the '<em><b>Processing Reason</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessingReason[] VALUES_ARRAY = new ProcessingReason[] { RESEARCH, PUBLIC_HEALTH,
			OUT_OF_SCOPE, PUBLIC_INTEREST, STATISTICAL_PURPOSES, EXERCISING_SPECIFIC_RIGHTS, MARKETING, TESTING,
			PROFILING, PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT, LEGITIMATE_INTERESTS, STOP_PROCESSING, };

	/**
	 * A public read-only list of all the '<em><b>Processing Reason</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessingReason> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Processing Reason</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingReason get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingReason result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Reason</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingReason getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingReason result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Reason</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingReason get(int value) {
		switch (value) {
		case RESEARCH_VALUE:
			return RESEARCH;
		case PUBLIC_HEALTH_VALUE:
			return PUBLIC_HEALTH;
		case OUT_OF_SCOPE_VALUE:
			return OUT_OF_SCOPE;
		case PUBLIC_INTEREST_VALUE:
			return PUBLIC_INTEREST;
		case STATISTICAL_PURPOSES_VALUE:
			return STATISTICAL_PURPOSES;
		case EXERCISING_SPECIFIC_RIGHTS_VALUE:
			return EXERCISING_SPECIFIC_RIGHTS;
		case MARKETING_VALUE:
			return MARKETING;
		case TESTING_VALUE:
			return TESTING;
		case PROFILING_VALUE:
			return PROFILING;
		case PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_VALUE:
			return PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT;
		case LEGITIMATE_INTERESTS_VALUE:
			return LEGITIMATE_INTERESTS;
		case STOP_PROCESSING_VALUE:
			return STOP_PROCESSING;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ProcessingReason(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //ProcessingReason
