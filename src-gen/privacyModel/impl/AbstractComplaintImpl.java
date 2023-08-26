/**
 */
package privacyModel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import privacyModel.AbstractComplaint;
import privacyModel.ComplaintStatus;
import privacyModel.Denial;
import privacyModel.PrivacyModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Complaint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.AbstractComplaintImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link privacyModel.impl.AbstractComplaintImpl#getDenialReason <em>Denial Reason</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractComplaintImpl extends AbstractComplaintActionImpl implements AbstractComplaint {
	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final ComplaintStatus STATUS_EDEFAULT = ComplaintStatus.PENDING;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected ComplaintStatus status = STATUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDenialReason() <em>Denial Reason</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDenialReason()
	 * @generated
	 * @ordered
	 */
	protected Denial denialReason;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractComplaintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.ABSTRACT_COMPLAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComplaintStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(ComplaintStatus newStatus) {
		ComplaintStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.ABSTRACT_COMPLAINT__STATUS,
					oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Denial getDenialReason() {
		if (denialReason != null && denialReason.eIsProxy()) {
			InternalEObject oldDenialReason = (InternalEObject) denialReason;
			denialReason = (Denial) eResolveProxy(oldDenialReason);
			if (denialReason != oldDenialReason) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PrivacyModelPackage.ABSTRACT_COMPLAINT__DENIAL_REASON, oldDenialReason, denialReason));
			}
		}
		return denialReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Denial basicGetDenialReason() {
		return denialReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDenialReason(Denial newDenialReason) {
		Denial oldDenialReason = denialReason;
		denialReason = newDenialReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.ABSTRACT_COMPLAINT__DENIAL_REASON,
					oldDenialReason, denialReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.ABSTRACT_COMPLAINT__STATUS:
			return getStatus();
		case PrivacyModelPackage.ABSTRACT_COMPLAINT__DENIAL_REASON:
			if (resolve)
				return getDenialReason();
			return basicGetDenialReason();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PrivacyModelPackage.ABSTRACT_COMPLAINT__STATUS:
			setStatus((ComplaintStatus) newValue);
			return;
		case PrivacyModelPackage.ABSTRACT_COMPLAINT__DENIAL_REASON:
			setDenialReason((Denial) newValue);
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
		case PrivacyModelPackage.ABSTRACT_COMPLAINT__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case PrivacyModelPackage.ABSTRACT_COMPLAINT__DENIAL_REASON:
			setDenialReason((Denial) null);
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
		case PrivacyModelPackage.ABSTRACT_COMPLAINT__STATUS:
			return status != STATUS_EDEFAULT;
		case PrivacyModelPackage.ABSTRACT_COMPLAINT__DENIAL_REASON:
			return denialReason != null;
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
		result.append(" (status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //AbstractComplaintImpl
