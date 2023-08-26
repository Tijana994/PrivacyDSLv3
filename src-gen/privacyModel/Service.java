/**
 */
package privacyModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Service#getSubservices <em>Subservices</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Subservices</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subservices</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getService_Subservices()
	 * @model
	 * @generated
	 */
	EList<Service> getSubservices();

} // Service
