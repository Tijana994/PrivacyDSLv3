/**
 */
package privacyModel.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import privacyModel.Denial;
import privacyModel.PolicyStatement;
import privacyModel.Principal;
import privacyModel.PrivacyModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Denial</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.DenialImpl#getWhen <em>When</em>}</li>
 *   <li>{@link privacyModel.impl.DenialImpl#getApprovedBy <em>Approved By</em>}</li>
 *   <li>{@link privacyModel.impl.DenialImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link privacyModel.impl.DenialImpl#getBasedOnStatements <em>Based On Statements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DenialImpl extends NamedElementImpl implements Denial {
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
	 * The cached value of the '{@link #getApprovedBy() <em>Approved By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedBy()
	 * @generated
	 * @ordered
	 */
	protected Principal approvedBy;

	/**
	 * The default value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected static final String REASON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReason() <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReason()
	 * @generated
	 * @ordered
	 */
	protected String reason = REASON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBasedOnStatements() <em>Based On Statements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasedOnStatements()
	 * @generated
	 * @ordered
	 */
	protected EList<PolicyStatement> basedOnStatements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DenialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.DENIAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.DENIAL__WHEN, oldWhen, when));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal getApprovedBy() {
		if (approvedBy != null && approvedBy.eIsProxy()) {
			InternalEObject oldApprovedBy = (InternalEObject) approvedBy;
			approvedBy = (Principal) eResolveProxy(oldApprovedBy);
			if (approvedBy != oldApprovedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrivacyModelPackage.DENIAL__APPROVED_BY,
							oldApprovedBy, approvedBy));
			}
		}
		return approvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal basicGetApprovedBy() {
		return approvedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprovedBy(Principal newApprovedBy) {
		Principal oldApprovedBy = approvedBy;
		approvedBy = newApprovedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.DENIAL__APPROVED_BY,
					oldApprovedBy, approvedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReason(String newReason) {
		String oldReason = reason;
		reason = newReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.DENIAL__REASON, oldReason,
					reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PolicyStatement> getBasedOnStatements() {
		if (basedOnStatements == null) {
			basedOnStatements = new EObjectResolvingEList<PolicyStatement>(PolicyStatement.class, this,
					PrivacyModelPackage.DENIAL__BASED_ON_STATEMENTS);
		}
		return basedOnStatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.DENIAL__WHEN:
			return getWhen();
		case PrivacyModelPackage.DENIAL__APPROVED_BY:
			if (resolve)
				return getApprovedBy();
			return basicGetApprovedBy();
		case PrivacyModelPackage.DENIAL__REASON:
			return getReason();
		case PrivacyModelPackage.DENIAL__BASED_ON_STATEMENTS:
			return getBasedOnStatements();
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
		case PrivacyModelPackage.DENIAL__WHEN:
			setWhen((Date) newValue);
			return;
		case PrivacyModelPackage.DENIAL__APPROVED_BY:
			setApprovedBy((Principal) newValue);
			return;
		case PrivacyModelPackage.DENIAL__REASON:
			setReason((String) newValue);
			return;
		case PrivacyModelPackage.DENIAL__BASED_ON_STATEMENTS:
			getBasedOnStatements().clear();
			getBasedOnStatements().addAll((Collection<? extends PolicyStatement>) newValue);
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
		case PrivacyModelPackage.DENIAL__WHEN:
			setWhen(WHEN_EDEFAULT);
			return;
		case PrivacyModelPackage.DENIAL__APPROVED_BY:
			setApprovedBy((Principal) null);
			return;
		case PrivacyModelPackage.DENIAL__REASON:
			setReason(REASON_EDEFAULT);
			return;
		case PrivacyModelPackage.DENIAL__BASED_ON_STATEMENTS:
			getBasedOnStatements().clear();
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
		case PrivacyModelPackage.DENIAL__WHEN:
			return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
		case PrivacyModelPackage.DENIAL__APPROVED_BY:
			return approvedBy != null;
		case PrivacyModelPackage.DENIAL__REASON:
			return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
		case PrivacyModelPackage.DENIAL__BASED_ON_STATEMENTS:
			return basedOnStatements != null && !basedOnStatements.isEmpty();
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
		result.append(" (when: ");
		result.append(when);
		result.append(", reason: ");
		result.append(reason);
		result.append(')');
		return result.toString();
	}

} //DenialImpl
