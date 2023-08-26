/**
 */
package privacyModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Complaint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.AbstractComplaint#getStatus <em>Status</em>}</li>
 *   <li>{@link privacyModel.AbstractComplaint#getDenialReason <em>Denial Reason</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getAbstractComplaint()
 * @model abstract="true"
 * @generated
 */
public interface AbstractComplaint extends AbstractComplaintAction {
	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.ComplaintStatus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see privacyModel.ComplaintStatus
	 * @see #setStatus(ComplaintStatus)
	 * @see privacyModel.PrivacyModelPackage#getAbstractComplaint_Status()
	 * @model required="true"
	 * @generated
	 */
	ComplaintStatus getStatus();

	/**
	 * Sets the value of the '{@link privacyModel.AbstractComplaint#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see privacyModel.ComplaintStatus
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(ComplaintStatus value);

	/**
	 * Returns the value of the '<em><b>Denial Reason</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Denial Reason</em>' reference.
	 * @see #setDenialReason(Denial)
	 * @see privacyModel.PrivacyModelPackage#getAbstractComplaint_DenialReason()
	 * @model
	 * @generated
	 */
	Denial getDenialReason();

	/**
	 * Sets the value of the '{@link privacyModel.AbstractComplaint#getDenialReason <em>Denial Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Denial Reason</em>' reference.
	 * @see #getDenialReason()
	 * @generated
	 */
	void setDenialReason(Denial value);

} // AbstractComplaint
