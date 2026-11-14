/**
 */
package privacyModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>How</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.How#getDocuments <em>Documents</em>}</li>
 *   <li>{@link privacyModel.How#getConsent <em>Consent</em>}</li>
 *   <li>{@link privacyModel.How#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getHow()
 * @model
 * @generated
 */
public interface How extends EObject {
	/**
	 * Returns the value of the '<em><b>Documents</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.Document}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Documents</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getHow_Documents()
	 * @model
	 * @generated
	 */
	EList<Document> getDocuments();

	/**
	 * Returns the value of the '<em><b>Consent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consent</em>' reference.
	 * @see #setConsent(Consent)
	 * @see privacyModel.PrivacyModelPackage#getHow_Consent()
	 * @model
	 * @generated
	 */
	Consent getConsent();

	/**
	 * Sets the value of the '{@link privacyModel.How#getConsent <em>Consent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Consent</em>' reference.
	 * @see #getConsent()
	 * @generated
	 */
	void setConsent(Consent value);

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' reference.
	 * @see #setContract(Contract)
	 * @see privacyModel.PrivacyModelPackage#getHow_Contract()
	 * @model
	 * @generated
	 */
	Contract getContract();

	/**
	 * Sets the value of the '{@link privacyModel.How#getContract <em>Contract</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contract</em>' reference.
	 * @see #getContract()
	 * @generated
	 */
	void setContract(Contract value);

} // How
