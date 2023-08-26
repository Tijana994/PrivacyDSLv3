/**
 */
package privacyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelPackage#getDataType()
 * @model
 * @generated
 */
public enum DataType implements Enumerator {
	/**
	 * The '<em><b>Biometric</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOMETRIC_VALUE
	 * @generated
	 * @ordered
	 */
	BIOMETRIC(0, "Biometric", "Biometric"),

	/**
	 * The '<em><b>General</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL_VALUE
	 * @generated
	 * @ordered
	 */
	GENERAL(1, "General", "General"),

	/**
	 * The '<em><b>Genetic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENETIC_VALUE
	 * @generated
	 * @ordered
	 */
	GENETIC(2, "Genetic", "Genetic"),

	/**
	 * The '<em><b>Political Opinion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLITICAL_OPINION_VALUE
	 * @generated
	 * @ordered
	 */
	POLITICAL_OPINION(3, "PoliticalOpinion", "PoliticalOpinion"),

	/**
	 * The '<em><b>Racial Or Ethnic Origin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RACIAL_OR_ETHNIC_ORIGIN_VALUE
	 * @generated
	 * @ordered
	 */
	RACIAL_OR_ETHNIC_ORIGIN(4, "RacialOrEthnicOrigin", "RacialOrEthnicOrigin"),

	/**
	 * The '<em><b>Beliefs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELIEFS_VALUE
	 * @generated
	 * @ordered
	 */
	BELIEFS(5, "Beliefs", "Beliefs"),

	/**
	 * The '<em><b>Sex Life</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEX_LIFE_VALUE
	 * @generated
	 * @ordered
	 */
	SEX_LIFE(6, "SexLife", "SexLife"),

	/**
	 * The '<em><b>Religic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELIGIC_VALUE
	 * @generated
	 * @ordered
	 */
	RELIGIC(7, "Religic", "Religic"),

	/**
	 * The '<em><b>Health</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH_VALUE
	 * @generated
	 * @ordered
	 */
	HEALTH(8, "Health", "Health"),

	/**
	 * The '<em><b>Judical</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUDICAL_VALUE
	 * @generated
	 * @ordered
	 */
	JUDICAL(9, "Judical", "Judical");

	/**
	 * The '<em><b>Biometric</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIOMETRIC
	 * @model name="Biometric"
	 * @generated
	 * @ordered
	 */
	public static final int BIOMETRIC_VALUE = 0;

	/**
	 * The '<em><b>General</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERAL
	 * @model name="General"
	 * @generated
	 * @ordered
	 */
	public static final int GENERAL_VALUE = 1;

	/**
	 * The '<em><b>Genetic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENETIC
	 * @model name="Genetic"
	 * @generated
	 * @ordered
	 */
	public static final int GENETIC_VALUE = 2;

	/**
	 * The '<em><b>Political Opinion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLITICAL_OPINION
	 * @model name="PoliticalOpinion"
	 * @generated
	 * @ordered
	 */
	public static final int POLITICAL_OPINION_VALUE = 3;

	/**
	 * The '<em><b>Racial Or Ethnic Origin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RACIAL_OR_ETHNIC_ORIGIN
	 * @model name="RacialOrEthnicOrigin"
	 * @generated
	 * @ordered
	 */
	public static final int RACIAL_OR_ETHNIC_ORIGIN_VALUE = 4;

	/**
	 * The '<em><b>Beliefs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BELIEFS
	 * @model name="Beliefs"
	 * @generated
	 * @ordered
	 */
	public static final int BELIEFS_VALUE = 5;

	/**
	 * The '<em><b>Sex Life</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEX_LIFE
	 * @model name="SexLife"
	 * @generated
	 * @ordered
	 */
	public static final int SEX_LIFE_VALUE = 6;

	/**
	 * The '<em><b>Religic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELIGIC
	 * @model name="Religic"
	 * @generated
	 * @ordered
	 */
	public static final int RELIGIC_VALUE = 7;

	/**
	 * The '<em><b>Health</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEALTH
	 * @model name="Health"
	 * @generated
	 * @ordered
	 */
	public static final int HEALTH_VALUE = 8;

	/**
	 * The '<em><b>Judical</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JUDICAL
	 * @model name="Judical"
	 * @generated
	 * @ordered
	 */
	public static final int JUDICAL_VALUE = 9;

	/**
	 * An array of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataType[] VALUES_ARRAY = new DataType[] { BIOMETRIC, GENERAL, GENETIC, POLITICAL_OPINION,
			RACIAL_OR_ETHNIC_ORIGIN, BELIEFS, SEX_LIFE, RELIGIC, HEALTH, JUDICAL, };

	/**
	 * A public read-only list of all the '<em><b>Data Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataType get(int value) {
		switch (value) {
		case BIOMETRIC_VALUE:
			return BIOMETRIC;
		case GENERAL_VALUE:
			return GENERAL;
		case GENETIC_VALUE:
			return GENETIC;
		case POLITICAL_OPINION_VALUE:
			return POLITICAL_OPINION;
		case RACIAL_OR_ETHNIC_ORIGIN_VALUE:
			return RACIAL_OR_ETHNIC_ORIGIN;
		case BELIEFS_VALUE:
			return BELIEFS;
		case SEX_LIFE_VALUE:
			return SEX_LIFE;
		case RELIGIC_VALUE:
			return RELIGIC;
		case HEALTH_VALUE:
			return HEALTH;
		case JUDICAL_VALUE:
			return JUDICAL;
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
	private DataType(int value, String name, String literal) {
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

} //DataType
