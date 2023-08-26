/**
 */
package privacyModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Privacy Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.PrivacyData#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getPrivacyData()
 * @model
 * @generated
 */
public interface PrivacyData extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see privacyModel.DataType
	 * @see #setType(DataType)
	 * @see privacyModel.PrivacyModelPackage#getPrivacyData_Type()
	 * @model required="true"
	 * @generated
	 */
	DataType getType();

	/**
	 * Sets the value of the '{@link privacyModel.PrivacyData#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see privacyModel.DataType
	 * @see #getType()
	 * @generated
	 */
	void setType(DataType value);

} // PrivacyData
