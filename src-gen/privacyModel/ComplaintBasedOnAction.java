/**
 */
package privacyModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complaint Based On Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.ComplaintBasedOnAction#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getComplaintBasedOnAction()
 * @model
 * @generated
 */
public interface ComplaintBasedOnAction extends AbstractComplaint {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' reference.
	 * @see #setStatement(PolicyStatement)
	 * @see privacyModel.PrivacyModelPackage#getComplaintBasedOnAction_Statement()
	 * @model required="true"
	 * @generated
	 */
	PolicyStatement getStatement();

	/**
	 * Sets the value of the '{@link privacyModel.ComplaintBasedOnAction#getStatement <em>Statement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' reference.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(PolicyStatement value);

} // ComplaintBasedOnAction
