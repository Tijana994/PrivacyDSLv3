/**
 */
package privacyModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complaint Based On Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.ComplaintBasedOnData#getSubject <em>Subject</em>}</li>
 *   <li>{@link privacyModel.ComplaintBasedOnData#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getComplaintBasedOnData()
 * @model
 * @generated
 */
public interface ComplaintBasedOnData extends AbstractComplaint {
	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.PrivacyData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getComplaintBasedOnData_Subject()
	 * @model required="true"
	 * @generated
	 */
	EList<PrivacyData> getSubject();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.ComplaintBasedOnDataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see privacyModel.ComplaintBasedOnDataType
	 * @see #setType(ComplaintBasedOnDataType)
	 * @see privacyModel.PrivacyModelPackage#getComplaintBasedOnData_Type()
	 * @model required="true"
	 * @generated
	 */
	ComplaintBasedOnDataType getType();

	/**
	 * Sets the value of the '{@link privacyModel.ComplaintBasedOnData#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see privacyModel.ComplaintBasedOnDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(ComplaintBasedOnDataType value);

} // ComplaintBasedOnData
