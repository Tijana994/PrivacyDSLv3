/**
 */
package privacyModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import privacyModel.ConfigurationManager;
import privacyModel.PrivacyModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.ConfigurationManagerImpl#getDataSources <em>Data Sources</em>}</li>
 *   <li>{@link privacyModel.impl.ConfigurationManagerImpl#getProtectionControlMethods <em>Protection Control Methods</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationManagerImpl extends MinimalEObjectImpl.Container implements ConfigurationManager {
	/**
	 * The cached value of the '{@link #getDataSources() <em>Data Sources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataSources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> dataSources;

	/**
	 * The cached value of the '{@link #getProtectionControlMethods() <em>Protection Control Methods</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtectionControlMethods()
	 * @generated
	 * @ordered
	 */
	protected EList<String> protectionControlMethods;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.CONFIGURATION_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDataSources() {
		if (dataSources == null) {
			dataSources = new EDataTypeUniqueEList<String>(String.class, this,
					PrivacyModelPackage.CONFIGURATION_MANAGER__DATA_SOURCES);
		}
		return dataSources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProtectionControlMethods() {
		if (protectionControlMethods == null) {
			protectionControlMethods = new EDataTypeUniqueEList<String>(String.class, this,
					PrivacyModelPackage.CONFIGURATION_MANAGER__PROTECTION_CONTROL_METHODS);
		}
		return protectionControlMethods;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.CONFIGURATION_MANAGER__DATA_SOURCES:
			return getDataSources();
		case PrivacyModelPackage.CONFIGURATION_MANAGER__PROTECTION_CONTROL_METHODS:
			return getProtectionControlMethods();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PrivacyModelPackage.CONFIGURATION_MANAGER__DATA_SOURCES:
			getDataSources().clear();
			getDataSources().addAll((Collection<? extends String>) newValue);
			return;
		case PrivacyModelPackage.CONFIGURATION_MANAGER__PROTECTION_CONTROL_METHODS:
			getProtectionControlMethods().clear();
			getProtectionControlMethods().addAll((Collection<? extends String>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PrivacyModelPackage.CONFIGURATION_MANAGER__DATA_SOURCES:
			getDataSources().clear();
			return;
		case PrivacyModelPackage.CONFIGURATION_MANAGER__PROTECTION_CONTROL_METHODS:
			getProtectionControlMethods().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PrivacyModelPackage.CONFIGURATION_MANAGER__DATA_SOURCES:
			return dataSources != null && !dataSources.isEmpty();
		case PrivacyModelPackage.CONFIGURATION_MANAGER__PROTECTION_CONTROL_METHODS:
			return protectionControlMethods != null && !protectionControlMethods.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (dataSources: ");
		result.append(dataSources);
		result.append(", protectionControlMethods: ");
		result.append(protectionControlMethods);
		result.append(')');
		return result.toString();
	}

} //ConfigurationManagerImpl
