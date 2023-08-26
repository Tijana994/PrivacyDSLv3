/**
 */
package privacyModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Withdraw</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Withdraw#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getWithdraw()
 * @model
 * @generated
 */
public interface Withdraw extends AbstractComplaintAction {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(Consent)
	 * @see privacyModel.PrivacyModelPackage#getWithdraw_Subject()
	 * @model required="true"
	 * @generated
	 */
	Consent getSubject();

	/**
	 * Sets the value of the '{@link privacyModel.Withdraw#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(Consent value);

} // Withdraw
