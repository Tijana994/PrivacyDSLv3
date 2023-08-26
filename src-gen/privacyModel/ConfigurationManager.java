/**
 */
package privacyModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.ConfigurationManager#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link privacyModel.ConfigurationManager#getProtectionControlMethods <em>Protection Control Methods</em>}</li>
 * </ul>
 *
 * @see privacyModel.PrivacyModelPackage#getConfigurationManager()
 * @model
 * @generated
 */
public interface ConfigurationManager extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Sources</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Sources</em>' attribute list.
	 * @see privacyModel.PrivacyModelPackage#getConfigurationManager_DataSources()
	 * @model
	 * @generated
	 */
	EList<String> getDataSources();

	/**
	 * Returns the value of the '<em><b>Protection Control Methods</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Protection Control Methods</em>' attribute list.
	 * @see privacyModel.PrivacyModelPackage#getConfigurationManager_ProtectionControlMethods()
	 * @model
	 * @generated
	 */
	EList<String> getProtectionControlMethods();

} // ConfigurationManager
