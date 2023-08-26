/**
 */
package privacyModel.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import privacyModel.Notification;
import privacyModel.NotificationInfo;
import privacyModel.NotificationType;
import privacyModel.Principal;
import privacyModel.PrivacyModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.NotificationImpl#getType <em>Type</em>}</li>
 *   <li>{@link privacyModel.impl.NotificationImpl#getNotifiers <em>Notifiers</em>}</li>
 *   <li>{@link privacyModel.impl.NotificationImpl#getReceivers <em>Receivers</em>}</li>
 *   <li>{@link privacyModel.impl.NotificationImpl#getCausedBy <em>Caused By</em>}</li>
 *   <li>{@link privacyModel.impl.NotificationImpl#getWhen <em>When</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationImpl extends NamedElementImpl implements Notification {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final NotificationType TYPE_EDEFAULT = NotificationType.ERASURE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected NotificationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNotifiers() <em>Notifiers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Principal> notifiers;

	/**
	 * The cached value of the '{@link #getReceivers() <em>Receivers</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivers()
	 * @generated
	 * @ordered
	 */
	protected EList<Principal> receivers;

	/**
	 * The cached value of the '{@link #getCausedBy() <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausedBy()
	 * @generated
	 * @ordered
	 */
	protected NotificationInfo causedBy;

	/**
	 * The default value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected static final Date WHEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected Date when = WHEN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.NOTIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(NotificationType newType) {
		NotificationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					PrivacyModelPackage.NOTIFICATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Principal> getNotifiers() {
		if (notifiers == null) {
			notifiers = new EObjectResolvingEList<Principal>(Principal.class, this,
					PrivacyModelPackage.NOTIFICATION__NOTIFIERS);
		}
		return notifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Principal> getReceivers() {
		if (receivers == null) {
			receivers = new EObjectResolvingEList<Principal>(Principal.class, this,
					PrivacyModelPackage.NOTIFICATION__RECEIVERS);
		}
		return receivers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationInfo getCausedBy() {
		if (causedBy != null && causedBy.eIsProxy()) {
			InternalEObject oldCausedBy = (InternalEObject) causedBy;
			causedBy = (NotificationInfo) eResolveProxy(oldCausedBy);
			if (causedBy != oldCausedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE,
							PrivacyModelPackage.NOTIFICATION__CAUSED_BY, oldCausedBy, causedBy));
			}
		}
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationInfo basicGetCausedBy() {
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausedBy(NotificationInfo newCausedBy) {
		NotificationInfo oldCausedBy = causedBy;
		causedBy = newCausedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					PrivacyModelPackage.NOTIFICATION__CAUSED_BY, oldCausedBy, causedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhen(Date newWhen) {
		Date oldWhen = when;
		when = newWhen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					PrivacyModelPackage.NOTIFICATION__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.NOTIFICATION__TYPE:
			return getType();
		case PrivacyModelPackage.NOTIFICATION__NOTIFIERS:
			return getNotifiers();
		case PrivacyModelPackage.NOTIFICATION__RECEIVERS:
			return getReceivers();
		case PrivacyModelPackage.NOTIFICATION__CAUSED_BY:
			if (resolve)
				return getCausedBy();
			return basicGetCausedBy();
		case PrivacyModelPackage.NOTIFICATION__WHEN:
			return getWhen();
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
		case PrivacyModelPackage.NOTIFICATION__TYPE:
			setType((NotificationType) newValue);
			return;
		case PrivacyModelPackage.NOTIFICATION__NOTIFIERS:
			getNotifiers().clear();
			getNotifiers().addAll((Collection<? extends Principal>) newValue);
			return;
		case PrivacyModelPackage.NOTIFICATION__RECEIVERS:
			getReceivers().clear();
			getReceivers().addAll((Collection<? extends Principal>) newValue);
			return;
		case PrivacyModelPackage.NOTIFICATION__CAUSED_BY:
			setCausedBy((NotificationInfo) newValue);
			return;
		case PrivacyModelPackage.NOTIFICATION__WHEN:
			setWhen((Date) newValue);
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
		case PrivacyModelPackage.NOTIFICATION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case PrivacyModelPackage.NOTIFICATION__NOTIFIERS:
			getNotifiers().clear();
			return;
		case PrivacyModelPackage.NOTIFICATION__RECEIVERS:
			getReceivers().clear();
			return;
		case PrivacyModelPackage.NOTIFICATION__CAUSED_BY:
			setCausedBy((NotificationInfo) null);
			return;
		case PrivacyModelPackage.NOTIFICATION__WHEN:
			setWhen(WHEN_EDEFAULT);
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
		case PrivacyModelPackage.NOTIFICATION__TYPE:
			return type != TYPE_EDEFAULT;
		case PrivacyModelPackage.NOTIFICATION__NOTIFIERS:
			return notifiers != null && !notifiers.isEmpty();
		case PrivacyModelPackage.NOTIFICATION__RECEIVERS:
			return receivers != null && !receivers.isEmpty();
		case PrivacyModelPackage.NOTIFICATION__CAUSED_BY:
			return causedBy != null;
		case PrivacyModelPackage.NOTIFICATION__WHEN:
			return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
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
		result.append(" (type: ");
		result.append(type);
		result.append(", when: ");
		result.append(when);
		result.append(')');
		return result.toString();
	}

} //NotificationImpl
