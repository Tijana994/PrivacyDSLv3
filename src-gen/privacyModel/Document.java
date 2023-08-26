/**
 */
package privacyModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Document#getDocumentType <em>Document Type</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends AbstractPaper {
	/**
	 * Returns the value of the '<em><b>Document Type</b></em>' attribute.
	 * The literals are from the enumeration {@link privacyModel.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type</em>' attribute.
	 * @see privacyModel.DocumentType
	 * @see #setDocumentType(DocumentType)
	 * @see privacyModel.PrivacyModelPackage#getDocument_DocumentType()
	 * @model
	 * @generated
	 */
	DocumentType getDocumentType();

	/**
	 * Sets the value of the '{@link privacyModel.Document#getDocumentType <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' attribute.
	 * @see privacyModel.DocumentType
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(DocumentType value);

} // Document
