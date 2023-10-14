/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
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
import privacyModel.util.PrivacyModelValidator;

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
	 * The cached validation expression for the '{@link #ShouldDefineCausedByAsErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Should Define Caused By As Erasure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ShouldDefineCausedByAsErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SHOULD_DEFINE_CAUSED_BY_AS_ERASURE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'NotifyAboutErasure should contain causedBy with complaint Erasure',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tif(type = NotificationType::Erasure) then\n"
			+ "\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n"
			+ "\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n"
			+ "\t\t\t\t\tif(complaint.action.oclIsKindOf(ComplaintBasedOnData)) then\n"
			+ "\t\t\t\t\t\tlet basedOnData : ComplaintBasedOnData = complaint.action.oclAsType(ComplaintBasedOnData) in\n"
			+ "\t\t\t\t\t\tbasedOnData.type = ComplaintBasedOnDataType::Erasure\n" + "\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\tfalse\n" + "\t\t\t\t\tendif\n" + "\t\t\t\telse\n" + "\t\t\t\t\tfalse\n" + "\t\t\t\tendif\n"
			+ "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ShouldDefineCausedByAsErasure(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.NOTIFICATION, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_ERASURE__DIAGNOSTICCHAIN_MAP,
				SHOULD_DEFINE_CAUSED_BY_AS_ERASURE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_ERASURE);
	}

	/**
	 * The cached validation expression for the '{@link #ShouldDefineCausedByAsPrivacyPolicy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Should Define Caused By As Privacy Policy</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ShouldDefineCausedByAsPrivacyPolicy(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'NotifyAboutCollecting or StopProcessing should contain causedBy with policy statement',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t\tif(type = NotificationType::DataCollecting or type = NotificationType::StopProcessing \n"
			+ "\t\t\t\tor type = NotificationType::ExecutedRectification or type = NotificationType::ExecutedErasure\n"
			+ "\t\t\t) then\n" + "\t\t\t\tcausedBy.oclIsKindOf(PolicyStatement)\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ShouldDefineCausedByAsPrivacyPolicy(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.NOTIFICATION, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY__DIAGNOSTICCHAIN_MAP,
				SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY);
	}

	/**
	 * The cached validation expression for the '{@link #ShouldDefineCausedByAsWithdraw(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Should Define Caused By As Withdraw</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ShouldDefineCausedByAsWithdraw(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'NotifyAboutWithdraw should contain causedBy with complaint Withraw',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tif(type = NotificationType::Withdraw) then\n"
			+ "\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n"
			+ "\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n"
			+ "\t\t\t\t\tcomplaint.action.oclIsKindOf(Withdraw)\n" + "\t\t\t\telse\n" + "\t\t\t\t\tfalse\n"
			+ "\t\t\t\tendif\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ShouldDefineCausedByAsWithdraw(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.NOTIFICATION, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW__DIAGNOSTICCHAIN_MAP,
				SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW);
	}

	/**
	 * The cached validation expression for the '{@link #ShouldDefineCausedByAsRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Should Define Caused By As Rectification</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ShouldDefineCausedByAsRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'NotifyAboutRectification should contain causedBy with complaint Rectification',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tif(type = NotificationType::Rectification) then\n"
			+ "\t\t\t\tif(causedBy.oclIsKindOf(Complaint)) then\n"
			+ "\t\t\t\t\tlet complaint : Complaint = causedBy.oclAsType(Complaint) in\n"
			+ "\t\t\t\t\tif(complaint.action.oclIsKindOf(ComplaintBasedOnData)) then\n"
			+ "\t\t\t\t\t\tlet basedOnData : ComplaintBasedOnData = complaint.action.oclAsType(ComplaintBasedOnData) in\n"
			+ "\t\t\t\t\t\tbasedOnData.type = ComplaintBasedOnDataType::Rectification\n" + "\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\tfalse\n" + "\t\t\t\t\tendif\n" + "\t\t\t\telse\n" + "\t\t\t\t\tfalse\n" + "\t\t\t\tendif\n"
			+ "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ShouldDefineCausedByAsRectification(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.NOTIFICATION, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION__DIAGNOSTICCHAIN_MAP,
				SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.NOTIFICATION__SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION);
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PrivacyModelPackage.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_ERASURE__DIAGNOSTICCHAIN_MAP:
			return ShouldDefineCausedByAsErasure((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY__DIAGNOSTICCHAIN_MAP:
			return ShouldDefineCausedByAsPrivacyPolicy((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW__DIAGNOSTICCHAIN_MAP:
			return ShouldDefineCausedByAsWithdraw((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION__DIAGNOSTICCHAIN_MAP:
			return ShouldDefineCausedByAsRectification((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
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
		result.append(" (type: ");
		result.append(type);
		result.append(", when: ");
		result.append(when);
		result.append(')');
		return result.toString();
	}

} //NotificationImpl
