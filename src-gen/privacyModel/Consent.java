/**
 */
package privacyModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Consent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Consent#getFormat <em>Format</em>}</li>
 *   <li>{@link privacyModel.Consent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getConsent()
 * @model
 * @generated
 */
public interface Consent extends AbstractPaper {
	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.ConsentFormat}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see privacyModel.ConsentFormat
	 * @see #setFormat(ConsentFormat)
	 * @see privacyModel.PrivacyModelPackage#getConsent_Format()
	 * @model
	 * @generated
	 */
	ConsentFormat getFormat();

	/**
	 * Sets the value of the '{@link privacyModel.Consent#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see privacyModel.ConsentFormat
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(ConsentFormat value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.ConsentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see privacyModel.ConsentType
	 * @see #setType(ConsentType)
	 * @see privacyModel.PrivacyModelPackage#getConsent_Type()
	 * @model
	 * @generated
	 */
	ConsentType getType();

	/**
	 * Sets the value of the '{@link privacyModel.Consent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see privacyModel.ConsentType
	 * @see #getType()
	 * @generated
	 */
	void setType(ConsentType value);

} // Consent
