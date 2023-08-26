/**
 */
package privacyModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import privacyModel.Location;
import privacyModel.PrivacyModelPackage;
import privacyModel.Provider;
import privacyModel.Service;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.ProviderImpl#getProvide <em>Provide</em>}</li>
 *   <li>{@link privacyModel.impl.ProviderImpl#getLocated <em>Located</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProviderImpl extends NamedElementImpl implements Provider {
	/**
	 * The cached value of the '{@link #getProvide() <em>Provide</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvide()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> provide;

	/**
	 * The cached value of the '{@link #getLocated() <em>Located</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocated()
	 * @generated
	 * @ordered
	 */
	protected Location located;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getProvide() {
		if (provide == null) {
			provide = new EObjectResolvingEList<Service>(Service.class, this, PrivacyModelPackage.PROVIDER__PROVIDE);
		}
		return provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocated() {
		if (located != null && located.eIsProxy()) {
			InternalEObject oldLocated = (InternalEObject) located;
			located = (Location) eResolveProxy(oldLocated);
			if (located != oldLocated) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrivacyModelPackage.PROVIDER__LOCATED,
							oldLocated, located));
			}
		}
		return located;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocated() {
		return located;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocated(Location newLocated) {
		Location oldLocated = located;
		located = newLocated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.PROVIDER__LOCATED, oldLocated,
					located));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.PROVIDER__PROVIDE:
			return getProvide();
		case PrivacyModelPackage.PROVIDER__LOCATED:
			if (resolve)
				return getLocated();
			return basicGetLocated();
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
		case PrivacyModelPackage.PROVIDER__PROVIDE:
			getProvide().clear();
			getProvide().addAll((Collection<? extends Service>) newValue);
			return;
		case PrivacyModelPackage.PROVIDER__LOCATED:
			setLocated((Location) newValue);
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
		case PrivacyModelPackage.PROVIDER__PROVIDE:
			getProvide().clear();
			return;
		case PrivacyModelPackage.PROVIDER__LOCATED:
			setLocated((Location) null);
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
		case PrivacyModelPackage.PROVIDER__PROVIDE:
			return provide != null && !provide.isEmpty();
		case PrivacyModelPackage.PROVIDER__LOCATED:
			return located != null;
		}
		return super.eIsSet(featureID);
	}

} //ProviderImpl
