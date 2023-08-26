/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import privacyModel.PrivacyModelPackage;
import privacyModel.ProcessingReason;
import privacyModel.ProcessingReasonSubtype;
import privacyModel.Purpose;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Purpose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.PurposeImpl#getProcessingReason <em>Processing Reason</em>}</li>
 *   <li>{@link privacyModel.impl.PurposeImpl#getProcessingReasonSubtype <em>Processing Reason Subtype</em>}</li>
 *   <li>{@link privacyModel.impl.PurposeImpl#getSubPurposes <em>Sub Purposes</em>}</li>
 *   <li>{@link privacyModel.impl.PurposeImpl#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PurposeImpl extends MinimalEObjectImpl.Container implements Purpose {
	/**
	 * The default value of the '{@link #getProcessingReason() <em>Processing Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingReason()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingReason PROCESSING_REASON_EDEFAULT = ProcessingReason.RESEARCH;

	/**
	 * The cached value of the '{@link #getProcessingReason() <em>Processing Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingReason()
	 * @generated
	 * @ordered
	 */
	protected ProcessingReason processingReason = PROCESSING_REASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcessingReasonSubtype() <em>Processing Reason Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingReasonSubtype()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingReasonSubtype PROCESSING_REASON_SUBTYPE_EDEFAULT = ProcessingReasonSubtype.NONE;

	/**
	 * The cached value of the '{@link #getProcessingReasonSubtype() <em>Processing Reason Subtype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessingReasonSubtype()
	 * @generated
	 * @ordered
	 */
	protected ProcessingReasonSubtype processingReasonSubtype = PROCESSING_REASON_SUBTYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubPurposes() <em>Sub Purposes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPurposes()
	 * @generated
	 * @ordered
	 */
	protected EList<Purpose> subPurposes;

	/**
	 * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected static final String DETAILS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected String details = DETAILS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PurposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.PURPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingReason getProcessingReason() {
		return processingReason;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingReason(ProcessingReason newProcessingReason) {
		ProcessingReason oldProcessingReason = processingReason;
		processingReason = newProcessingReason == null ? PROCESSING_REASON_EDEFAULT : newProcessingReason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.PURPOSE__PROCESSING_REASON,
					oldProcessingReason, processingReason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingReasonSubtype getProcessingReasonSubtype() {
		return processingReasonSubtype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessingReasonSubtype(ProcessingReasonSubtype newProcessingReasonSubtype) {
		ProcessingReasonSubtype oldProcessingReasonSubtype = processingReasonSubtype;
		processingReasonSubtype = newProcessingReasonSubtype == null ? PROCESSING_REASON_SUBTYPE_EDEFAULT
				: newProcessingReasonSubtype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.PURPOSE__PROCESSING_REASON_SUBTYPE, oldProcessingReasonSubtype,
					processingReasonSubtype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Purpose> getSubPurposes() {
		if (subPurposes == null) {
			subPurposes = new EObjectContainmentEList<Purpose>(Purpose.class, this,
					PrivacyModelPackage.PURPOSE__SUB_PURPOSES);
		}
		return subPurposes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetails(String newDetails) {
		String oldDetails = details;
		details = newDetails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.PURPOSE__DETAILS, oldDetails,
					details));
	}

	/**
	 * The cached invocation delegate for the '{@link #isValid(privacyModel.Purpose) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid(privacyModel.Purpose)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_VALID_PURPOSE__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PURPOSE___IS_VALID__PURPOSE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid(Purpose purpose) {
		try {
			return (Boolean) IS_VALID_PURPOSE__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { purpose }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isSubPurposeValid(privacyModel.ProcessingReason, org.eclipse.emf.common.util.EList) <em>Is Sub Purpose Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubPurposeValid(privacyModel.ProcessingReason, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SUB_PURPOSE_VALID_PROCESSING_REASON_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PURPOSE___IS_SUB_PURPOSE_VALID__PROCESSINGREASON_ELIST)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubPurposeValid(ProcessingReason reason, EList<ProcessingReasonSubtype> subreasons) {
		try {
			return (Boolean) IS_SUB_PURPOSE_VALID_PROCESSING_REASON_ELIST__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(2, new Object[] { reason, subreasons }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #containsAllowedPurposeReasonAndSubreason(privacyModel.ProcessingReason, org.eclipse.emf.common.util.EList) <em>Contains Allowed Purpose Reason And Subreason</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #containsAllowedPurposeReasonAndSubreason(privacyModel.ProcessingReason, org.eclipse.emf.common.util.EList)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CONTAINS_ALLOWED_PURPOSE_REASON_AND_SUBREASON_PROCESSING_REASON_ELIST__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PURPOSE___CONTAINS_ALLOWED_PURPOSE_REASON_AND_SUBREASON__PROCESSINGREASON_ELIST)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containsAllowedPurposeReasonAndSubreason(ProcessingReason allowedReason,
			EList<ProcessingReasonSubtype> allowedSubreasons) {
		try {
			return (Boolean) CONTAINS_ALLOWED_PURPOSE_REASON_AND_SUBREASON_PROCESSING_REASON_ELIST__EINVOCATION_DELEGATE
					.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2,
							new Object[] { allowedReason, allowedSubreasons }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PrivacyModelPackage.PURPOSE__SUB_PURPOSES:
			return ((InternalEList<?>) getSubPurposes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.PURPOSE__PROCESSING_REASON:
			return getProcessingReason();
		case PrivacyModelPackage.PURPOSE__PROCESSING_REASON_SUBTYPE:
			return getProcessingReasonSubtype();
		case PrivacyModelPackage.PURPOSE__SUB_PURPOSES:
			return getSubPurposes();
		case PrivacyModelPackage.PURPOSE__DETAILS:
			return getDetails();
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
		case PrivacyModelPackage.PURPOSE__PROCESSING_REASON:
			setProcessingReason((ProcessingReason) newValue);
			return;
		case PrivacyModelPackage.PURPOSE__PROCESSING_REASON_SUBTYPE:
			setProcessingReasonSubtype((ProcessingReasonSubtype) newValue);
			return;
		case PrivacyModelPackage.PURPOSE__SUB_PURPOSES:
			getSubPurposes().clear();
			getSubPurposes().addAll((Collection<? extends Purpose>) newValue);
			return;
		case PrivacyModelPackage.PURPOSE__DETAILS:
			setDetails((String) newValue);
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
		case PrivacyModelPackage.PURPOSE__PROCESSING_REASON:
			setProcessingReason(PROCESSING_REASON_EDEFAULT);
			return;
		case PrivacyModelPackage.PURPOSE__PROCESSING_REASON_SUBTYPE:
			setProcessingReasonSubtype(PROCESSING_REASON_SUBTYPE_EDEFAULT);
			return;
		case PrivacyModelPackage.PURPOSE__SUB_PURPOSES:
			getSubPurposes().clear();
			return;
		case PrivacyModelPackage.PURPOSE__DETAILS:
			setDetails(DETAILS_EDEFAULT);
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
		case PrivacyModelPackage.PURPOSE__PROCESSING_REASON:
			return processingReason != PROCESSING_REASON_EDEFAULT;
		case PrivacyModelPackage.PURPOSE__PROCESSING_REASON_SUBTYPE:
			return processingReasonSubtype != PROCESSING_REASON_SUBTYPE_EDEFAULT;
		case PrivacyModelPackage.PURPOSE__SUB_PURPOSES:
			return subPurposes != null && !subPurposes.isEmpty();
		case PrivacyModelPackage.PURPOSE__DETAILS:
			return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PrivacyModelPackage.PURPOSE___IS_VALID__PURPOSE:
			return isValid((Purpose) arguments.get(0));
		case PrivacyModelPackage.PURPOSE___IS_SUB_PURPOSE_VALID__PROCESSINGREASON_ELIST:
			return isSubPurposeValid((ProcessingReason) arguments.get(0),
					(EList<ProcessingReasonSubtype>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___CONTAINS_ALLOWED_PURPOSE_REASON_AND_SUBREASON__PROCESSINGREASON_ELIST:
			return containsAllowedPurposeReasonAndSubreason((ProcessingReason) arguments.get(0),
					(EList<ProcessingReasonSubtype>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (processingReason: ");
		result.append(processingReason);
		result.append(", processingReasonSubtype: ");
		result.append(processingReasonSubtype);
		result.append(", details: ");
		result.append(details);
		result.append(')');
		return result.toString();
	}

} //PurposeImpl
