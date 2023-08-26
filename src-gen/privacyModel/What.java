/**
 */
package privacyModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>What</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.What#getActions <em>Actions</em>}</li>
 *   <li>{@link privacyModel.What#getProviders <em>Providers</em>}</li>
 *   <li>{@link privacyModel.What#getDatas <em>Datas</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getWhat()
 * @model
 * @generated
 */
public interface What extends EObject {
	/**
	 * Returns the value of the '<em><b>Actions</b></em>' attribute list.
	 * The list contents are of type {@link privacyModel.Action}.
	 * The literals are from the enumeration {@link privacyModel.Action}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actions</em>' attribute list.
	 * @see privacyModel.Action
	 * @see privacyModel.PrivacyModelPackage#getWhat_Actions()
	 * @model required="true"
	 * @generated
	 */
	EList<Action> getActions();

	/**
	 * Returns the value of the '<em><b>Providers</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.Provider}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getWhat_Providers()
	 * @model
	 * @generated
	 */
	EList<Provider> getProviders();

	/**
	 * Returns the value of the '<em><b>Datas</b></em>' reference list.
	 * The list contents are of type {@link privacyModel.SharedPrivacyData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datas</em>' reference list.
	 * @see privacyModel.PrivacyModelPackage#getWhat_Datas()
	 * @model
	 * @generated
	 */
	EList<SharedPrivacyData> getDatas();

} // What
