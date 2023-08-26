/**
 */
package privacyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Consent Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelPackage#getConsentType()
 * @model
 * @generated
 */
public enum ConsentType implements Enumerator {
	/**
	 * The '<em><b>Explicit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT_VALUE
	 * @generated
	 * @ordered
	 */
	EXPLICIT(0, "Explicit", "Explicit"),

	/**
	 * The '<em><b>Implied</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLIED_VALUE
	 * @generated
	 * @ordered
	 */
	IMPLIED(1, "Implied", "Implied"),

	/**
	 * The '<em><b>Informed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMED_VALUE
	 * @generated
	 * @ordered
	 */
	INFORMED(2, "Informed", "Informed"),

	/**
	 * The '<em><b>Unanomius</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNANOMIUS_VALUE
	 * @generated
	 * @ordered
	 */
	UNANOMIUS(3, "Unanomius", "Unanomius"),

	/**
	 * The '<em><b>Substituted</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTED_VALUE
	 * @generated
	 * @ordered
	 */
	SUBSTITUTED(4, "Substituted", "Substituted");

	/**
	 * The '<em><b>Explicit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPLICIT
	 * @model name="Explicit"
	 * @generated
	 * @ordered
	 */
	public static final int EXPLICIT_VALUE = 0;

	/**
	 * The '<em><b>Implied</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMPLIED
	 * @model name="Implied"
	 * @generated
	 * @ordered
	 */
	public static final int IMPLIED_VALUE = 1;

	/**
	 * The '<em><b>Informed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INFORMED
	 * @model name="Informed"
	 * @generated
	 * @ordered
	 */
	public static final int INFORMED_VALUE = 2;

	/**
	 * The '<em><b>Unanomius</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNANOMIUS
	 * @model name="Unanomius"
	 * @generated
	 * @ordered
	 */
	public static final int UNANOMIUS_VALUE = 3;

	/**
	 * The '<em><b>Substituted</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBSTITUTED
	 * @model name="Substituted"
	 * @generated
	 * @ordered
	 */
	public static final int SUBSTITUTED_VALUE = 4;

	/**
	 * An array of all the '<em><b>Consent Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConsentType[] VALUES_ARRAY = new ConsentType[] { EXPLICIT, IMPLIED, INFORMED, UNANOMIUS,
			SUBSTITUTED, };

	/**
	 * A public read-only list of all the '<em><b>Consent Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConsentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Consent Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConsentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Consent Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ConsentType get(int value) {
		switch (value) {
		case EXPLICIT_VALUE:
			return EXPLICIT;
		case IMPLIED_VALUE:
			return IMPLIED;
		case INFORMED_VALUE:
			return INFORMED;
		case UNANOMIUS_VALUE:
			return UNANOMIUS;
		case SUBSTITUTED_VALUE:
			return SUBSTITUTED;
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
	private ConsentType(int value, String name, String literal) {
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

} //ConsentType
