/**
 */
package privacyModel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Denial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Denial#getWhen <em>When</em>}</li>
 *   <li>{@link privacyModel.Denial#getApprovedBy <em>Approved By</em>}</li>
 *   <li>{@link privacyModel.Denial#getReason <em>Reason</em>}</li>
 *   <li>{@link privacyModel.Denial#getBasedOnStatements <em>Based On Statements</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getDenial()
 * @model
 * @generated
 */
public interface Denial extends NamedElement {
	/**
	 * Returns the value of the '<em><b>When</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>When</em>' attribute.
	 * @see #setWhen(Date)
	 * @see privacyModel.PrivacyModelPackage#getDenial_When()
	 * @model required="true"
	 * @generated
	 */
	Date getWhen();

	/**
	 * Sets the value of the '{@link privacyModel.Denial#getWhen <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>When</em>' attribute.
	 * @see #getWhen()
	 * @generated
	 */
	void setWhen(Date value);

	/**
	 * Returns the value of the '<em><b>Approved By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved By</em>' reference.
	 * @see #setApprovedBy(Principal)
	 * @see privacyModel.PrivacyModelPackage#getDenial_ApprovedBy()
	 * @model required="true"
	 * @generated
	 */
	Principal getApprovedBy();

	/**
	 * Sets the value of the '{@link privacyModel.Denial#getApprovedBy <em>Approved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Approved By</em>' reference.
	 * @see #getApprovedBy()
	 * @generated
	 */
	void setApprovedBy(Principal value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see privacyModel.PrivacyModelPackage#getDenial_Reason()
	 * @model
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link privacyModel.Denial#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Based On Statements</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.PolicyStatement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Based On Statements</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getDenial_BasedOnStatements()
	 * @model
	 * @generated
	 */
	EList<PolicyStatement> getBasedOnStatements();

} // Denial
