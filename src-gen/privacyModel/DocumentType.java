/**
 */
package privacyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Document Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelPackage#getDocumentType()
 * @model
 * @generated
 */
public enum DocumentType implements Enumerator {
	/**
	 * The '<em><b>Child Custody</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_CUSTODY_VALUE
	 * @generated
	 * @ordered
	 */
	CHILD_CUSTODY(0, "ChildCustody", "ChildCustody"),

	/**
	 * The '<em><b>Court Approval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURT_APPROVAL_VALUE
	 * @generated
	 * @ordered
	 */
	COURT_APPROVAL(1, "CourtApproval", "CourtApproval"),

	/**
	 * The '<em><b>Controller Approval</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER_APPROVAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROLLER_APPROVAL(2, "ControllerApproval", "ControllerApproval"),

	/**
	 * The '<em><b>Transfer Certificate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_CERTIFICATE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER_CERTIFICATE(3, "TransferCertificate", "TransferCertificate");

	/**
	 * The '<em><b>Child Custody</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHILD_CUSTODY
	 * @model name="ChildCustody"
	 * @generated
	 * @ordered
	 */
	public static final int CHILD_CUSTODY_VALUE = 0;

	/**
	 * The '<em><b>Court Approval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COURT_APPROVAL
	 * @model name="CourtApproval"
	 * @generated
	 * @ordered
	 */
	public static final int COURT_APPROVAL_VALUE = 1;

	/**
	 * The '<em><b>Controller Approval</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROLLER_APPROVAL
	 * @model name="ControllerApproval"
	 * @generated
	 * @ordered
	 */
	public static final int CONTROLLER_APPROVAL_VALUE = 2;

	/**
	 * The '<em><b>Transfer Certificate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_CERTIFICATE
	 * @model name="TransferCertificate"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_CERTIFICATE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Document Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DocumentType[] VALUES_ARRAY = new DocumentType[] { CHILD_CUSTODY, COURT_APPROVAL,
			CONTROLLER_APPROVAL, TRANSFER_CERTIFICATE, };

	/**
	 * A public read-only list of all the '<em><b>Document Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DocumentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Document Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DocumentType get(int value) {
		switch (value) {
		case CHILD_CUSTODY_VALUE:
			return CHILD_CUSTODY;
		case COURT_APPROVAL_VALUE:
			return COURT_APPROVAL;
		case CONTROLLER_APPROVAL_VALUE:
			return CONTROLLER_APPROVAL;
		case TRANSFER_CERTIFICATE_VALUE:
			return TRANSFER_CERTIFICATE;
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
	private DocumentType(int value, String name, String literal) {
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

} //DocumentType
