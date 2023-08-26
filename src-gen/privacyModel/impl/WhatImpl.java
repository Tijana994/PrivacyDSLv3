/**
 */
package privacyModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import privacyModel.Action;
import privacyModel.PrivacyModelPackage;
import privacyModel.Provider;
import privacyModel.SharedPrivacyData;
import privacyModel.What;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>What</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.WhatImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link privacyModel.impl.WhatImpl#getProviders <em>Providers</em>}</li>
 *   <li>{@link privacyModel.impl.WhatImpl#getDatas <em>Datas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhatImpl extends MinimalEObjectImpl.Container implements What {
	/**
	 * The cached value of the '{@link #getActions() <em>Actions</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> actions;

	/**
	 * The cached value of the '{@link #getProviders() <em>Providers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviders()
	 * @generated
	 * @ordered
	 */
	protected EList<Provider> providers;

	/**
	 * The cached value of the '{@link #getDatas() <em>Datas</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatas()
	 * @generated
	 * @ordered
	 */
	protected EList<SharedPrivacyData> datas;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.WHAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getActions() {
		if (actions == null) {
			actions = new EDataTypeUniqueEList<Action>(Action.class, this, PrivacyModelPackage.WHAT__ACTIONS);
		}
		return actions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Provider> getProviders() {
		if (providers == null) {
			providers = new EObjectResolvingEList<Provider>(Provider.class, this, PrivacyModelPackage.WHAT__PROVIDERS);
		}
		return providers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SharedPrivacyData> getDatas() {
		if (datas == null) {
			datas = new EObjectResolvingEList<SharedPrivacyData>(SharedPrivacyData.class, this,
					PrivacyModelPackage.WHAT__DATAS);
		}
		return datas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.WHAT__ACTIONS:
			return getActions();
		case PrivacyModelPackage.WHAT__PROVIDERS:
			return getProviders();
		case PrivacyModelPackage.WHAT__DATAS:
			return getDatas();
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
		case PrivacyModelPackage.WHAT__ACTIONS:
			getActions().clear();
			getActions().addAll((Collection<? extends Action>) newValue);
			return;
		case PrivacyModelPackage.WHAT__PROVIDERS:
			getProviders().clear();
			getProviders().addAll((Collection<? extends Provider>) newValue);
			return;
		case PrivacyModelPackage.WHAT__DATAS:
			getDatas().clear();
			getDatas().addAll((Collection<? extends SharedPrivacyData>) newValue);
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
		case PrivacyModelPackage.WHAT__ACTIONS:
			getActions().clear();
			return;
		case PrivacyModelPackage.WHAT__PROVIDERS:
			getProviders().clear();
			return;
		case PrivacyModelPackage.WHAT__DATAS:
			getDatas().clear();
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
		case PrivacyModelPackage.WHAT__ACTIONS:
			return actions != null && !actions.isEmpty();
		case PrivacyModelPackage.WHAT__PROVIDERS:
			return providers != null && !providers.isEmpty();
		case PrivacyModelPackage.WHAT__DATAS:
			return datas != null && !datas.isEmpty();
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
		result.append(" (actions: ");
		result.append(actions);
		result.append(')');
		return result.toString();
	}

} //WhatImpl
