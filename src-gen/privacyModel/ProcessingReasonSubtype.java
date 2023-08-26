/**
 */
package privacyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Processing Reason Subtype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelPackage#getProcessingReasonSubtype()
 * @model
 * @generated
 */
public enum ProcessingReasonSubtype implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Prevention</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVENTION_VALUE
	 * @generated
	 * @ordered
	 */
	PREVENTION(1, "Prevention", "Prevention"),

	/**
	 * The '<em><b>Investigation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVESTIGATION_VALUE
	 * @generated
	 * @ordered
	 */
	INVESTIGATION(2, "Investigation", "Investigation"),

	/**
	 * The '<em><b>Detection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DETECTION(3, "Detection", "Detection"),

	/**
	 * The '<em><b>Prosecution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROSECUTION_VALUE
	 * @generated
	 * @ordered
	 */
	PROSECUTION(4, "Prosecution", "Prosecution"),

	/**
	 * The '<em><b>Prevention Of Threats</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVENTION_OF_THREATS_VALUE
	 * @generated
	 * @ordered
	 */
	PREVENTION_OF_THREATS(5, "PreventionOfThreats", "PreventionOfThreats"),

	/**
	 * The '<em><b>Out Of EU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_OF_EU_VALUE
	 * @generated
	 * @ordered
	 */
	OUT_OF_EU(6, "OutOfEU", "OutOfEU"),

	/**
	 * The '<em><b>Personal Activity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_ACTIVITY_VALUE
	 * @generated
	 * @ordered
	 */
	PERSONAL_ACTIVITY(7, "PersonalActivity", "PersonalActivity"),

	/**
	 * The '<em><b>Special Scope Of Activity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_SCOPE_OF_ACTIVITY_VALUE
	 * @generated
	 * @ordered
	 */
	SPECIAL_SCOPE_OF_ACTIVITY(8, "SpecialScopeOfActivity", "SpecialScopeOfActivity"),

	/**
	 * The '<em><b>Employment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYMENT_VALUE
	 * @generated
	 * @ordered
	 */
	EMPLOYMENT(9, "Employment", "Employment"),

	/**
	 * The '<em><b>Social Security</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_SECURITY_VALUE
	 * @generated
	 * @ordered
	 */
	SOCIAL_SECURITY(10, "SocialSecurity", "SocialSecurity"),

	/**
	 * The '<em><b>Social Protection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_PROTECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SOCIAL_PROTECTION(11, "SocialProtection", "SocialProtection"),

	/**
	 * The '<em><b>Phisically Incapable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHISICALLY_INCAPABLE_VALUE
	 * @generated
	 * @ordered
	 */
	PHISICALLY_INCAPABLE(12, "PhisicallyIncapable", "PhisicallyIncapable"),

	/**
	 * The '<em><b>Legally Incapable</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGALLY_INCAPABLE_VALUE
	 * @generated
	 * @ordered
	 */
	LEGALLY_INCAPABLE(13, "LegallyIncapable", "LegallyIncapable"),

	/**
	 * The '<em><b>Statistical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATISTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	STATISTICAL(14, "Statistical", "Statistical"),

	/**
	 * The '<em><b>Historical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORICAL_VALUE
	 * @generated
	 * @ordered
	 */
	HISTORICAL(15, "Historical", "Historical"),

	/**
	 * The '<em><b>Scientific</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIENTIFIC_VALUE
	 * @generated
	 * @ordered
	 */
	SCIENTIFIC(16, "Scientific", "Scientific"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(17, "Other", "Other");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Prevention</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVENTION
	 * @model name="Prevention"
	 * @generated
	 * @ordered
	 */
	public static final int PREVENTION_VALUE = 1;

	/**
	 * The '<em><b>Investigation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVESTIGATION
	 * @model name="Investigation"
	 * @generated
	 * @ordered
	 */
	public static final int INVESTIGATION_VALUE = 2;

	/**
	 * The '<em><b>Detection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DETECTION
	 * @model name="Detection"
	 * @generated
	 * @ordered
	 */
	public static final int DETECTION_VALUE = 3;

	/**
	 * The '<em><b>Prosecution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROSECUTION
	 * @model name="Prosecution"
	 * @generated
	 * @ordered
	 */
	public static final int PROSECUTION_VALUE = 4;

	/**
	 * The '<em><b>Prevention Of Threats</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREVENTION_OF_THREATS
	 * @model name="PreventionOfThreats"
	 * @generated
	 * @ordered
	 */
	public static final int PREVENTION_OF_THREATS_VALUE = 5;

	/**
	 * The '<em><b>Out Of EU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OUT_OF_EU
	 * @model name="OutOfEU"
	 * @generated
	 * @ordered
	 */
	public static final int OUT_OF_EU_VALUE = 6;

	/**
	 * The '<em><b>Personal Activity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERSONAL_ACTIVITY
	 * @model name="PersonalActivity"
	 * @generated
	 * @ordered
	 */
	public static final int PERSONAL_ACTIVITY_VALUE = 7;

	/**
	 * The '<em><b>Special Scope Of Activity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPECIAL_SCOPE_OF_ACTIVITY
	 * @model name="SpecialScopeOfActivity"
	 * @generated
	 * @ordered
	 */
	public static final int SPECIAL_SCOPE_OF_ACTIVITY_VALUE = 8;

	/**
	 * The '<em><b>Employment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMPLOYMENT
	 * @model name="Employment"
	 * @generated
	 * @ordered
	 */
	public static final int EMPLOYMENT_VALUE = 9;

	/**
	 * The '<em><b>Social Security</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_SECURITY
	 * @model name="SocialSecurity"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIAL_SECURITY_VALUE = 10;

	/**
	 * The '<em><b>Social Protection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOCIAL_PROTECTION
	 * @model name="SocialProtection"
	 * @generated
	 * @ordered
	 */
	public static final int SOCIAL_PROTECTION_VALUE = 11;

	/**
	 * The '<em><b>Phisically Incapable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHISICALLY_INCAPABLE
	 * @model name="PhisicallyIncapable"
	 * @generated
	 * @ordered
	 */
	public static final int PHISICALLY_INCAPABLE_VALUE = 12;

	/**
	 * The '<em><b>Legally Incapable</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEGALLY_INCAPABLE
	 * @model name="LegallyIncapable"
	 * @generated
	 * @ordered
	 */
	public static final int LEGALLY_INCAPABLE_VALUE = 13;

	/**
	 * The '<em><b>Statistical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATISTICAL
	 * @model name="Statistical"
	 * @generated
	 * @ordered
	 */
	public static final int STATISTICAL_VALUE = 14;

	/**
	 * The '<em><b>Historical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HISTORICAL
	 * @model name="Historical"
	 * @generated
	 * @ordered
	 */
	public static final int HISTORICAL_VALUE = 15;

	/**
	 * The '<em><b>Scientific</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCIENTIFIC
	 * @model name="Scientific"
	 * @generated
	 * @ordered
	 */
	public static final int SCIENTIFIC_VALUE = 16;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 17;

	/**
	 * An array of all the '<em><b>Processing Reason Subtype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessingReasonSubtype[] VALUES_ARRAY = new ProcessingReasonSubtype[] { NONE, PREVENTION,
			INVESTIGATION, DETECTION, PROSECUTION, PREVENTION_OF_THREATS, OUT_OF_EU, PERSONAL_ACTIVITY,
			SPECIAL_SCOPE_OF_ACTIVITY, EMPLOYMENT, SOCIAL_SECURITY, SOCIAL_PROTECTION, PHISICALLY_INCAPABLE,
			LEGALLY_INCAPABLE, STATISTICAL, HISTORICAL, SCIENTIFIC, OTHER, };

	/**
	 * A public read-only list of all the '<em><b>Processing Reason Subtype</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessingReasonSubtype> VALUES = Collections
			.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Processing Reason Subtype</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingReasonSubtype get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingReasonSubtype result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Reason Subtype</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingReasonSubtype getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingReasonSubtype result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Reason Subtype</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingReasonSubtype get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case PREVENTION_VALUE:
			return PREVENTION;
		case INVESTIGATION_VALUE:
			return INVESTIGATION;
		case DETECTION_VALUE:
			return DETECTION;
		case PROSECUTION_VALUE:
			return PROSECUTION;
		case PREVENTION_OF_THREATS_VALUE:
			return PREVENTION_OF_THREATS;
		case OUT_OF_EU_VALUE:
			return OUT_OF_EU;
		case PERSONAL_ACTIVITY_VALUE:
			return PERSONAL_ACTIVITY;
		case SPECIAL_SCOPE_OF_ACTIVITY_VALUE:
			return SPECIAL_SCOPE_OF_ACTIVITY;
		case EMPLOYMENT_VALUE:
			return EMPLOYMENT;
		case SOCIAL_SECURITY_VALUE:
			return SOCIAL_SECURITY;
		case SOCIAL_PROTECTION_VALUE:
			return SOCIAL_PROTECTION;
		case PHISICALLY_INCAPABLE_VALUE:
			return PHISICALLY_INCAPABLE;
		case LEGALLY_INCAPABLE_VALUE:
			return LEGALLY_INCAPABLE;
		case STATISTICAL_VALUE:
			return STATISTICAL;
		case HISTORICAL_VALUE:
			return HISTORICAL;
		case SCIENTIFIC_VALUE:
			return SCIENTIFIC;
		case OTHER_VALUE:
			return OTHER;
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
	private ProcessingReasonSubtype(int value, String name, String literal) {
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

} //ProcessingReasonSubtype
