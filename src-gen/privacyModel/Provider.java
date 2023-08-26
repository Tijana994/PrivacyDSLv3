/**
 */
package privacyModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.Provider#getProvide <em>Provide</em>}</li>
 *   <li>{@link privacyModel.Provider#getLocated <em>Located</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getProvider()
 * @model
 * @generated
 */
public interface Provider extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Provide</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getProvider_Provide()
	 * @model
	 * @generated
	 */
	EList<Service> getProvide();

	/**
	 * Returns the value of the '<em><b>Located</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Located</em>' reference.
	 * @see #setLocated(Location)
	 * @see privacyModel.PrivacyModelPackage#getProvider_Located()
	 * @model required="true"
	 * @generated
	 */
	Location getLocated();

	/**
	 * Sets the value of the '{@link privacyModel.Provider#getLocated <em>Located</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Located</em>' reference.
	 * @see #getLocated()
	 * @generated
	 */
	void setLocated(Location value);

} // Provider
