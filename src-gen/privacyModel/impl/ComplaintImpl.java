/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import privacyModel.AbstractComplaintAction;
import privacyModel.Action;
import privacyModel.Complaint;
import privacyModel.ComplaintBasedOnDataType;
import privacyModel.Principal;
import privacyModel.PrivacyModelPackage;
import privacyModel.util.PrivacyModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complaint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.ComplaintImpl#getWho <em>Who</em>}</li>
 *   <li>{@link privacyModel.impl.ComplaintImpl#getWhen <em>When</em>}</li>
 *   <li>{@link privacyModel.impl.ComplaintImpl#getReason <em>Reason</em>}</li>
 *   <li>{@link privacyModel.impl.ComplaintImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComplaintImpl extends NotificationInfoImpl implements Complaint {
	/**
	 * The cached value of the '{@link #getWho() <em>Who</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWho()
	 * @generated
	 * @ordered
	 */
	protected Principal who;

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
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected AbstractComplaintAction action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComplaintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.COMPLAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal getWho() {
		if (who != null && who.eIsProxy()) {
			InternalEObject oldWho = (InternalEObject) who;
			who = (Principal) eResolveProxy(oldWho);
			if (who != oldWho) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrivacyModelPackage.COMPLAINT__WHO,
							oldWho, who));
			}
		}
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal basicGetWho() {
		return who;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWho(Principal newWho) {
		Principal oldWho = who;
		who = newWho;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.COMPLAINT__WHO, oldWho, who));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.COMPLAINT__WHEN, oldWhen, when));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.COMPLAINT__REASON, oldReason,
					reason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractComplaintAction getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(AbstractComplaintAction newAction, NotificationChain msgs) {
		AbstractComplaintAction oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.COMPLAINT__ACTION, oldAction, newAction);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(AbstractComplaintAction newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject) action).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.COMPLAINT__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject) newAction).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.COMPLAINT__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.COMPLAINT__ACTION, newAction,
					newAction));
	}

	/**
	 * The cached invocation delegate for the '{@link #doesPolicyStatementExists(privacyModel.Action, privacyModel.ComplaintBasedOnDataType) <em>Does Policy Statement Exists</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #doesPolicyStatementExists(privacyModel.Action, privacyModel.ComplaintBasedOnDataType)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DOES_POLICY_STATEMENT_EXISTS_ACTION_COMPLAINT_BASED_ON_DATA_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.COMPLAINT___DOES_POLICY_STATEMENT_EXISTS__ACTION_COMPLAINTBASEDONDATATYPE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean doesPolicyStatementExists(Action actionType, ComplaintBasedOnDataType type) {
		try {
			return (Boolean) DOES_POLICY_STATEMENT_EXISTS_ACTION_COMPLAINT_BASED_ON_DATA_TYPE__EINVOCATION_DELEGATE
					.dynamicInvoke(this,
							new BasicEList.UnmodifiableEList<Object>(2, new Object[] { actionType, type }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached validation expression for the '{@link #CannotIdentifyDataFromComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Cannot Identify Data From Complaint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CannotIdentifyDataFromComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CANNOT_IDENTIFY_DATA_FROM_COMPLAINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art11',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnData))) then\n" + "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n"
			+ "\t\t\t\t\tbasedOnData.subject->forAll(data: PrivacyData|\n"
			+ "\t\t\t\t\tprivacyPolicy.policyStatements->exists(stmt| stmt.what.actions->exists(action| action = Action::Collecting) and \n"
			+ "\t\t\t\t\t\tnot(stmt.whose = null) and (stmt.whose = self.who or stmt.whose.responsiblePersons->exists(rp| rp = self.who))\n"
			+ "\t\t\t\t\t\tand privacyPolicy.privacyPolicyHelper.isDateAfterInterval(stmt.when, self.when) \n"
			+ "\t\t\t\t\t\tand stmt.what.datas->exists(selectedData| selectedData.privacydata = data)\n"
			+ "\t\t\t\t\t)\n" + "\t\t\t\t)\n" + "\t\t  endif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CannotIdentifyDataFromComplaint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.COMPLAINT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.COMPLAINT___CANNOT_IDENTIFY_DATA_FROM_COMPLAINT__DIAGNOSTICCHAIN_MAP,
				CANNOT_IDENTIFY_DATA_FROM_COMPLAINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.COMPLAINT__CANNOT_IDENTIFY_DATA_FROM_COMPLAINT);
	}

	/**
	 * The cached validation expression for the '{@link #StopProcessingShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Stop Processing Should Be Executed As Soon As Possible</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StopProcessingShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art21',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\t\telse\n"
			+ "\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n"
			+ "\t\t\t\t\tif(not(basedOnAction.denialReason = null)) then\n" + "\t\t\t\t\t\ttrue\n" + "\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\tprivacyPolicy.policyStatements->exists(stmt| stmt.what.actions->exists(action| action = Action::StopProcessing) and \n"
			+ "\t\t\t\t\t\t\tnot(stmt.causedBy = null) and stmt.causedBy = self)\n" + "\t\t\t\t\tendif\n"
			+ "\t\t\t  endif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean StopProcessingShouldBeExecutedAsSoonAsPossible(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.COMPLAINT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.COMPLAINT___STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP,
				STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.COMPLAINT__STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE);
	}

	/**
	 * The cached validation expression for the '{@link #UserDoesntHavePermissionToWithdrawConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>User Doesnt Have Permission To Withdraw Consent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UserDoesntHavePermissionToWithdrawConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art7',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.action.oclIsKindOf(Withdraw))) then\n" + "\t\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\t\tlet withdraw : Withdraw = self.action.oclAsType(Withdraw) in\n"
			+ "\t\t\t\t\tself.who = withdraw.subject.providedBy or  withdraw.subject.providedBy.responsiblePersons->exists(rp| rp = self.who)\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UserDoesntHavePermissionToWithdrawConsent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.COMPLAINT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT__DIAGNOSTICCHAIN_MAP,
				USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.COMPLAINT__USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT);
	}

	/**
	 * The cached validation expression for the '{@link #ErasureShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Erasure Should Be Executed As Soon As Possible</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ErasureShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art17',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdoesPolicyStatementExists(Action::Erasure,ComplaintBasedOnDataType::Erasure)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ErasureShouldBeExecutedAsSoonAsPossible(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.COMPLAINT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.COMPLAINT___ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP,
				ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.COMPLAINT__ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE);
	}

	/**
	 * The cached validation expression for the '{@link #SubjectShouldBeNotifiedAboutExistingComplaintForErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Existing Complaint For Erasure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SubjectShouldBeNotifiedAboutExistingComplaintForErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art19',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.action.oclIsKindOf(ComplaintBasedOnData)) then\n"
			+ "\t\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n"
			+ "\t\t\t\t\tif(basedOnData.type = ComplaintBasedOnDataType::Erasure)then\n"
			+ "\t\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\t\t\tnotification.type = NotificationType::Erasure\n" + "\t\t\t\t\t\t)\n" + "\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\ttrue\n" + "\t\t\t\t\tendif\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutExistingComplaintForErasure(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.COMPLAINT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE__DIAGNOSTICCHAIN_MAP,
				SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE);
	}

	/**
	 * The cached validation expression for the '{@link #RectificationShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Rectification Should Be Executed As Soon As Possible</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RectificationShouldBeExecutedAsSoonAsPossible(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art16',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdoesPolicyStatementExists(Action::Rectification,ComplaintBasedOnDataType::Rectification)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean RectificationShouldBeExecutedAsSoonAsPossible(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.COMPLAINT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.COMPLAINT___RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP,
				RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.COMPLAINT__RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE);
	}

	/**
	 * The cached validation expression for the '{@link #InvalidTypeOfPurposeForAnObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Invalid Type Of Purpose For An Object</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #InvalidTypeOfPurposeForAnObject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art21',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\telse\n"
			+ "\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n"
			+ "\t\t\t\tif(basedOnAction.statement.why = null or not(basedOnAction.denialReason = null)) then\n"
			+ "\t\t\t\t\t\ttrue\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\t(not(basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,\n"
			+ "\t\t\t\t\tSequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,\n"
			+ "\t\t\t\t\tProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other}))) \n"
			+ "\t\t\t\t\tand\n"
			+ "\t\t\t\t\t(basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Marketing,Sequence{ProcessingReasonSubtype::None})\n"
			+ "\t\t\t\t\tor\n"
			+ "\t\t\t\t\tbasedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Profiling,Sequence{ProcessingReasonSubtype::None}))\n"
			+ "\t\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean InvalidTypeOfPurposeForAnObject(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.COMPLAINT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.COMPLAINT___INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT__DIAGNOSTICCHAIN_MAP,
				INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.COMPLAINT__INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT);
	}

	/**
	 * The cached validation expression for the '{@link #UserDoesntHavePermissionToComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>User Doesnt Have Permission To Complaint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UserDoesntHavePermissionToComplaint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art21',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.action.oclIsKindOf(ComplaintBasedOnAction))) then\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\telse\n"
			+ "\t\t\t\tlet basedOnAction : ComplaintBasedOnAction = self.action.oclAsType(ComplaintBasedOnAction) in\n"
			+ "\t\t\t\t\tnot(basedOnAction.statement.whose = null) \n" + "\t\t\t\t\tand \n"
			+ "\t\t\t\t\t(basedOnAction.statement.whose = self.who or basedOnAction.statement.whose.responsiblePersons->exists(rp| rp = self.who))\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UserDoesntHavePermissionToComplaint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.COMPLAINT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT__DIAGNOSTICCHAIN_MAP,
				USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.COMPLAINT__USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT);
	}

	/**
	 * The cached validation expression for the '{@link #SubjectShouldBeNotifiedAboutWithdraw(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Withdraw</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SubjectShouldBeNotifiedAboutWithdraw(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art19',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.action.oclIsKindOf(Withdraw)) then\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and \n"
			+ "\t\t\t\t\t\tnotification.type = NotificationType::Withdraw\n" + "\t\t\t\t\t)\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutWithdraw(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.COMPLAINT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW__DIAGNOSTICCHAIN_MAP,
				SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW);
	}

	/**
	 * The cached validation expression for the '{@link #SubjectShouldBeNotifiedAboutExistingComplaintForRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Existing Complaint For Rectification</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SubjectShouldBeNotifiedAboutExistingComplaintForRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art19',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.action.oclIsKindOf(ComplaintBasedOnData)) then\n"
			+ "\t\t\t\tlet basedOnData : ComplaintBasedOnData = self.action.oclAsType(ComplaintBasedOnData) in\n"
			+ "\t\t\t\t\tif(basedOnData.type = ComplaintBasedOnDataType::Rectification)then\n"
			+ "\t\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\t\t\tnotification.type = NotificationType::Rectification\n" + "\t\t\t\t\t\t)\n"
			+ "\t\t\t\t\telse\n" + "\t\t\t\t\t\ttrue\n" + "\t\t\t\t\tendif\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutExistingComplaintForRectification(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.COMPLAINT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION__DIAGNOSTICCHAIN_MAP,
				SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.COMPLAINT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PrivacyModelPackage.COMPLAINT__ACTION:
			return basicSetAction(null, msgs);
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
		case PrivacyModelPackage.COMPLAINT__WHO:
			if (resolve)
				return getWho();
			return basicGetWho();
		case PrivacyModelPackage.COMPLAINT__WHEN:
			return getWhen();
		case PrivacyModelPackage.COMPLAINT__REASON:
			return getReason();
		case PrivacyModelPackage.COMPLAINT__ACTION:
			return getAction();
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
		case PrivacyModelPackage.COMPLAINT__WHO:
			setWho((Principal) newValue);
			return;
		case PrivacyModelPackage.COMPLAINT__WHEN:
			setWhen((Date) newValue);
			return;
		case PrivacyModelPackage.COMPLAINT__REASON:
			setReason((String) newValue);
			return;
		case PrivacyModelPackage.COMPLAINT__ACTION:
			setAction((AbstractComplaintAction) newValue);
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
		case PrivacyModelPackage.COMPLAINT__WHO:
			setWho((Principal) null);
			return;
		case PrivacyModelPackage.COMPLAINT__WHEN:
			setWhen(WHEN_EDEFAULT);
			return;
		case PrivacyModelPackage.COMPLAINT__REASON:
			setReason(REASON_EDEFAULT);
			return;
		case PrivacyModelPackage.COMPLAINT__ACTION:
			setAction((AbstractComplaintAction) null);
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
		case PrivacyModelPackage.COMPLAINT__WHO:
			return who != null;
		case PrivacyModelPackage.COMPLAINT__WHEN:
			return WHEN_EDEFAULT == null ? when != null : !WHEN_EDEFAULT.equals(when);
		case PrivacyModelPackage.COMPLAINT__REASON:
			return REASON_EDEFAULT == null ? reason != null : !REASON_EDEFAULT.equals(reason);
		case PrivacyModelPackage.COMPLAINT__ACTION:
			return action != null;
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
		case PrivacyModelPackage.COMPLAINT___DOES_POLICY_STATEMENT_EXISTS__ACTION_COMPLAINTBASEDONDATATYPE:
			return doesPolicyStatementExists((Action) arguments.get(0), (ComplaintBasedOnDataType) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___CANNOT_IDENTIFY_DATA_FROM_COMPLAINT__DIAGNOSTICCHAIN_MAP:
			return CannotIdentifyDataFromComplaint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP:
			return StopProcessingShouldBeExecutedAsSoonAsPossible((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT__DIAGNOSTICCHAIN_MAP:
			return UserDoesntHavePermissionToWithdrawConsent((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP:
			return ErasureShouldBeExecutedAsSoonAsPossible((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutExistingComplaintForErasure((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP:
			return RectificationShouldBeExecutedAsSoonAsPossible((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT__DIAGNOSTICCHAIN_MAP:
			return InvalidTypeOfPurposeForAnObject((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT__DIAGNOSTICCHAIN_MAP:
			return UserDoesntHavePermissionToComplaint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutWithdraw((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutExistingComplaintForRectification((DiagnosticChain) arguments.get(0),
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
		result.append(" (when: ");
		result.append(when);
		result.append(", reason: ");
		result.append(reason);
		result.append(')');
		return result.toString();
	}

} //ComplaintImpl
