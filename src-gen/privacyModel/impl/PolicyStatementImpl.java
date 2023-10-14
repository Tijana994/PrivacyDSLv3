/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

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

import privacyModel.AbstractTime;
import privacyModel.Action;
import privacyModel.Complaint;
import privacyModel.DocumentType;
import privacyModel.How;
import privacyModel.PolicyStatement;
import privacyModel.Principal;
import privacyModel.PrivacyModelPackage;
import privacyModel.ProcessingReason;
import privacyModel.Purpose;
import privacyModel.What;
import privacyModel.Where;
import privacyModel.util.PrivacyModelValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Policy Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.PolicyStatementImpl#getWhen <em>When</em>}</li>
 *   <li>{@link privacyModel.impl.PolicyStatementImpl#getWho <em>Who</em>}</li>
 *   <li>{@link privacyModel.impl.PolicyStatementImpl#getWhy <em>Why</em>}</li>
 *   <li>{@link privacyModel.impl.PolicyStatementImpl#getWhat <em>What</em>}</li>
 *   <li>{@link privacyModel.impl.PolicyStatementImpl#getHow <em>How</em>}</li>
 *   <li>{@link privacyModel.impl.PolicyStatementImpl#getWhose <em>Whose</em>}</li>
 *   <li>{@link privacyModel.impl.PolicyStatementImpl#getWhom <em>Whom</em>}</li>
 *   <li>{@link privacyModel.impl.PolicyStatementImpl#getWhere <em>Where</em>}</li>
 *   <li>{@link privacyModel.impl.PolicyStatementImpl#getCausedBy <em>Caused By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PolicyStatementImpl extends NotificationInfoImpl implements PolicyStatement {
	/**
	 * The cached value of the '{@link #getWhen() <em>When</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhen()
	 * @generated
	 * @ordered
	 */
	protected AbstractTime when;

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
	 * The cached value of the '{@link #getWhy() <em>Why</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhy()
	 * @generated
	 * @ordered
	 */
	protected Purpose why;

	/**
	 * The cached value of the '{@link #getWhat() <em>What</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhat()
	 * @generated
	 * @ordered
	 */
	protected What what;

	/**
	 * The cached value of the '{@link #getHow() <em>How</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHow()
	 * @generated
	 * @ordered
	 */
	protected How how;

	/**
	 * The cached value of the '{@link #getWhose() <em>Whose</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhose()
	 * @generated
	 * @ordered
	 */
	protected Principal whose;

	/**
	 * The cached value of the '{@link #getWhom() <em>Whom</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhom()
	 * @generated
	 * @ordered
	 */
	protected Principal whom;

	/**
	 * The cached value of the '{@link #getWhere() <em>Where</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhere()
	 * @generated
	 * @ordered
	 */
	protected Where where;

	/**
	 * The cached value of the '{@link #getCausedBy() <em>Caused By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCausedBy()
	 * @generated
	 * @ordered
	 */
	protected Complaint causedBy;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolicyStatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.POLICY_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTime getWhen() {
		return when;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhen(AbstractTime newWhen, NotificationChain msgs) {
		AbstractTime oldWhen = when;
		when = newWhen;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.POLICY_STATEMENT__WHEN, oldWhen, newWhen);
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
	public void setWhen(AbstractTime newWhen) {
		if (newWhen != when) {
			NotificationChain msgs = null;
			if (when != null)
				msgs = ((InternalEObject) when).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.POLICY_STATEMENT__WHEN, null, msgs);
			if (newWhen != null)
				msgs = ((InternalEObject) newWhen).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.POLICY_STATEMENT__WHEN, null, msgs);
			msgs = basicSetWhen(newWhen, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.POLICY_STATEMENT__WHEN, newWhen,
					newWhen));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrivacyModelPackage.POLICY_STATEMENT__WHO,
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
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.POLICY_STATEMENT__WHO, oldWho,
					who));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Purpose getWhy() {
		return why;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhy(Purpose newWhy, NotificationChain msgs) {
		Purpose oldWhy = why;
		why = newWhy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.POLICY_STATEMENT__WHY, oldWhy, newWhy);
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
	public void setWhy(Purpose newWhy) {
		if (newWhy != why) {
			NotificationChain msgs = null;
			if (why != null)
				msgs = ((InternalEObject) why).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.POLICY_STATEMENT__WHY, null, msgs);
			if (newWhy != null)
				msgs = ((InternalEObject) newWhy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.POLICY_STATEMENT__WHY, null, msgs);
			msgs = basicSetWhy(newWhy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.POLICY_STATEMENT__WHY, newWhy,
					newWhy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public What getWhat() {
		return what;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhat(What newWhat, NotificationChain msgs) {
		What oldWhat = what;
		what = newWhat;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.POLICY_STATEMENT__WHAT, oldWhat, newWhat);
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
	public void setWhat(What newWhat) {
		if (newWhat != what) {
			NotificationChain msgs = null;
			if (what != null)
				msgs = ((InternalEObject) what).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.POLICY_STATEMENT__WHAT, null, msgs);
			if (newWhat != null)
				msgs = ((InternalEObject) newWhat).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.POLICY_STATEMENT__WHAT, null, msgs);
			msgs = basicSetWhat(newWhat, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.POLICY_STATEMENT__WHAT, newWhat,
					newWhat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public How getHow() {
		return how;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHow(How newHow, NotificationChain msgs) {
		How oldHow = how;
		how = newHow;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.POLICY_STATEMENT__HOW, oldHow, newHow);
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
	public void setHow(How newHow) {
		if (newHow != how) {
			NotificationChain msgs = null;
			if (how != null)
				msgs = ((InternalEObject) how).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.POLICY_STATEMENT__HOW, null, msgs);
			if (newHow != null)
				msgs = ((InternalEObject) newHow).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.POLICY_STATEMENT__HOW, null, msgs);
			msgs = basicSetHow(newHow, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.POLICY_STATEMENT__HOW, newHow,
					newHow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal getWhose() {
		if (whose != null && whose.eIsProxy()) {
			InternalEObject oldWhose = (InternalEObject) whose;
			whose = (Principal) eResolveProxy(oldWhose);
			if (whose != oldWhose) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PrivacyModelPackage.POLICY_STATEMENT__WHOSE, oldWhose, whose));
			}
		}
		return whose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal basicGetWhose() {
		return whose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhose(Principal newWhose) {
		Principal oldWhose = whose;
		whose = newWhose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.POLICY_STATEMENT__WHOSE, oldWhose,
					whose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal getWhom() {
		if (whom != null && whom.eIsProxy()) {
			InternalEObject oldWhom = (InternalEObject) whom;
			whom = (Principal) eResolveProxy(oldWhom);
			if (whom != oldWhom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PrivacyModelPackage.POLICY_STATEMENT__WHOM, oldWhom, whom));
			}
		}
		return whom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal basicGetWhom() {
		return whom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhom(Principal newWhom) {
		Principal oldWhom = whom;
		whom = newWhom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.POLICY_STATEMENT__WHOM, oldWhom,
					whom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Where getWhere() {
		return where;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhere(Where newWhere, NotificationChain msgs) {
		Where oldWhere = where;
		where = newWhere;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.POLICY_STATEMENT__WHERE, oldWhere, newWhere);
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
	public void setWhere(Where newWhere) {
		if (newWhere != where) {
			NotificationChain msgs = null;
			if (where != null)
				msgs = ((InternalEObject) where).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.POLICY_STATEMENT__WHERE, null, msgs);
			if (newWhere != null)
				msgs = ((InternalEObject) newWhere).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.POLICY_STATEMENT__WHERE, null, msgs);
			msgs = basicSetWhere(newWhere, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.POLICY_STATEMENT__WHERE, newWhere,
					newWhere));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complaint getCausedBy() {
		if (causedBy != null && causedBy.eIsProxy()) {
			InternalEObject oldCausedBy = (InternalEObject) causedBy;
			causedBy = (Complaint) eResolveProxy(oldCausedBy);
			if (causedBy != oldCausedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PrivacyModelPackage.POLICY_STATEMENT__CAUSED_BY, oldCausedBy, causedBy));
			}
		}
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complaint basicGetCausedBy() {
		return causedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCausedBy(Complaint newCausedBy) {
		Complaint oldCausedBy = causedBy;
		causedBy = newCausedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.POLICY_STATEMENT__CAUSED_BY,
					oldCausedBy, causedBy));
	}

	/**
	 * The cached invocation delegate for the '{@link #dateShouldBeDefinedForType(privacyModel.Action) <em>Date Should Be Defined For Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #dateShouldBeDefinedForType(privacyModel.Action)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DATE_SHOULD_BE_DEFINED_FOR_TYPE_ACTION__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_TYPE__ACTION)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean dateShouldBeDefinedForType(Action actionType) {
		try {
			return (Boolean) DATE_SHOULD_BE_DEFINED_FOR_TYPE_ACTION__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { actionType }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #causedByShouldBeDefinedForType(privacyModel.Action) <em>Caused By Should Be Defined For Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #causedByShouldBeDefinedForType(privacyModel.Action)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CAUSED_BY_SHOULD_BE_DEFINED_FOR_TYPE_ACTION__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_TYPE__ACTION)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean causedByShouldBeDefinedForType(Action actionType) {
		try {
			return (Boolean) CAUSED_BY_SHOULD_BE_DEFINED_FOR_TYPE_ACTION__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { actionType }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #documentIsNeededForPurpose(privacyModel.DocumentType, privacyModel.ProcessingReason) <em>Document Is Needed For Purpose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #documentIsNeededForPurpose(privacyModel.DocumentType, privacyModel.ProcessingReason)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DOCUMENT_IS_NEEDED_FOR_PURPOSE_DOCUMENT_TYPE_PROCESSING_REASON__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.POLICY_STATEMENT___DOCUMENT_IS_NEEDED_FOR_PURPOSE__DOCUMENTTYPE_PROCESSINGREASON)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean documentIsNeededForPurpose(DocumentType documentType, ProcessingReason processingReason) {
		try {
			return (Boolean) DOCUMENT_IS_NEEDED_FOR_PURPOSE_DOCUMENT_TYPE_PROCESSING_REASON__EINVOCATION_DELEGATE
					.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2,
							new Object[] { documentType, processingReason }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached validation expression for the '{@link #SubjectShouldBeNotifiedAboutTransferToThirdCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Transfer To Third Country</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SubjectShouldBeNotifiedAboutTransferToThirdCountry(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art15',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what.actions->exists(action| action = Action::Transfer) and not(self.where.destination = null) and self.where.destination.isEUMember = false) then\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::ThirdPartyTransfer \n"
			+ "\t\t\t\t\t\tand notification.causedBy = self\n" + "\t\t\t\t\t)\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutTransferToThirdCountry(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY__DIAGNOSTICCHAIN_MAP,
				SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY);
	}

	/**
	 * The cached validation expression for the '{@link #SubjectShouldBeNotifiedAboutExecutedRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Executed Rectification</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SubjectShouldBeNotifiedAboutExecutedRectification(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art19',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(what.actions->exists(action| action = Action::Rectification)) then\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\t\tnotification.type = NotificationType::ExecutedRectification\n" + "\t\t\t\t\t)\n"
			+ "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutExecutedRectification(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__DIAGNOSTICCHAIN_MAP,
				SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION);
	}

	/**
	 * The cached validation expression for the '{@link #SubjectShouldBeNotifiedAboutStopProcessing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Stop Processing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SubjectShouldBeNotifiedAboutStopProcessing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art21',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(what.actions->exists(action| action = Action::StopProcessing)) then\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::StopProcessing and \n"
			+ "\t\t\t\t\t\tnotification.causedBy = self\n" + "\t\t\t\t\t)\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutStopProcessing(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP,
				SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING);
	}

	/**
	 * The cached validation expression for the '{@link #ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Controller Approval Is Need For Protect The Vital Interests Of The Data Subject Purpose</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_APPROVAL_IS_NEED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art9',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdocumentIsNeededForPurpose(DocumentType::ControllerApproval,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE__DIAGNOSTICCHAIN_MAP,
				CONTROLLER_APPROVAL_IS_NEED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__CONTROLLER_APPROVAL_IS_NEED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE);
	}

	/**
	 * The cached validation expression for the '{@link #MissingConsentForCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Missing Consent For Collecting</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MissingConsentForCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_CONSENT_FOR_COLLECTING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or not(self.what.actions->exists(action| action = Action::Collecting)) or \n"
			+ "\t\t\t\t(what.datas->exists(data| data.colllectedFromSubject = false) and self.what.actions->exists(action| action = Action::Collecting))\n"
			+ "\t\t\t) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse if(self.whose.type = PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then\n"
			+ "\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and self.whose.responsiblePersons->exists(person| self.how.consent.providedBy = person)\n"
			+ "\t\t\telse \n"
			+ "\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and (self.how.consent.providedBy = self.whose or self.whose.responsiblePersons->exists(person| self.how.consent.providedBy = person))\n"
			+ "\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MissingConsentForCollecting(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___MISSING_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP,
				MISSING_CONSENT_FOR_COLLECTING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__MISSING_CONSENT_FOR_COLLECTING);
	}

	/**
	 * The cached validation expression for the '{@link #ExpiredConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Expired Consent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ExpiredConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRED_CONSENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or self.what.actions->exists(act| act = Action::Collecting or act = Action::StopProcessing)) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tself.what.datas->forAll(data |\n"
			+ "\t\t\t\t\tlet statements = privacyPolicy.policyStatements->select(st| \n"
			+ "\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose and self.who.equals(st.who) and st.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))\n"
			+ "\t\t\t\t\t\tin \n" + "\t\t\t\t\t\tif(statements->isEmpty()) then \n" + "\t\t\t\t\t\t\ttrue\n"
			+ "\t\t\t\t\t\telse\n" + "\t\t\t\t\t\t\tstatements -> exists(st|\n"
			+ "\t\t\t\t\t\t\t\tif(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then\n"
			+ "\t\t\t\t\t\t\t\t\tif(self.why = null \n" + "\t\t\t\t\t\t\t\t\t\tor \n"
			+ "\t\t\t\t\t\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in\n"
			+ "\t\t\t\t\t\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)\n"
			+ "\t\t\t\t\t\t\t\t\t)) then\n" + "\t\t\t\t\t\t\t\t\t\ttrue\n" + "\t\t\t\t\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\t\t\t\t\tnot(privacyPolicy.privacyPolicyHelper.isDateAfterInterval(self.when, st.how.consent.startDate)) and\n"
			+ "\t\t\t\t\t\t\t\t\t\t(st.how.consent.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, st.how.consent.terminationDate)))\n"
			+ "\t\t\t\t\t\t\t\t\tendif\n" + "\t\t\t\t\t\t\t\telse\n" + "\t\t\t\t\t\t\t\t\tfalse\n"
			+ "\t\t\t\t\t\t\t\tendif\n" + "\t\t\t\t\t\t\t)\n" + "\t\t\t\t\t\tendif\n" + "\t\t\t\t)\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ExpiredConsent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___EXPIRED_CONSENT__DIAGNOSTICCHAIN_MAP,
				EXPIRED_CONSENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE, PrivacyModelValidator.POLICY_STATEMENT__EXPIRED_CONSENT);
	}

	/**
	 * The cached validation expression for the '{@link #StopProcessingPurposeForActionStopProcessing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Stop Processing Purpose For Action Stop Processing</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StopProcessingPurposeForActionStopProcessing(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n"
			+ "\t\t\tif(not(self.what.actions->exists(act| act = Action::StopProcessing))) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse\n" + "\t\t\t\tself.why.processingReason = ProcessingReason::StopProcessing\n" + "\t\t\tendif";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean StopProcessingPurposeForActionStopProcessing(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP,
				STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING);
	}

	/**
	 * The cached validation expression for the '{@link #WithdrawedConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Withdrawed Consent</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WithdrawedConsent(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String WITHDRAWED_CONSENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art7',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or self.what.actions->exists(act| act = Action::Collecting)) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tself.what.datas->forAll(data|\n"
			+ "\t\t\t\t\tlet statements = privacyPolicy.policyStatements->select(st: PolicyStatement| \n"
			+ "\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose and self.who.equals(st.who) and st.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))\n"
			+ "\t\t\t\t\t\tin \n" + "\t\t\t\t\t\tif(statements->isEmpty()) then \n" + "\t\t\t\t\t\t\ttrue\n"
			+ "\t\t\t\t\t\telse\n" + "\t\t\t\t\t\t\tstatements -> forAll(st|\n"
			+ "\t\t\t\t\t\t\t\tif(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then\n"
			+ "\t\t\t\t\t\t\t\t\tif(self.why = null \n" + "\t\t\t\t\t\t\t\t\t\tor \n"
			+ "\t\t\t\t\t\t\t\t\t\tlet reasons  = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in\n"
			+ "\t\t\t\t\t\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)\n"
			+ "\t\t\t\t\t\t\t\t\t)) then\n" + "\t\t\t\t\t\t\t\t\t\ttrue\n" + "\t\t\t\t\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\t\t\t\t\tnot(privacyPolicy.allComplaints->exists(complaint| complaint.action.oclIsTypeOf(Withdraw) and \n"
			+ "\t\t\t\t\t\t\t\t\t\t\tlet withdrawal: Withdraw = complaint.action.oclAsType(Withdraw) in\n"
			+ "\t\t\t\t\t\t\t\t\t\t\t\twithdrawal.subject = st.how.consent\n"
			+ "\t\t\t\t\t\t\t\t\t\t\t\tand (privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, complaint.when) \n"
			+ "\t\t\t\t\t\t\t\t\t\t\t\tor privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, complaint.when))\n"
			+ "\t\t\t\t\t\t\t\t\t\t\tand not(privacyPolicy.policyStatements->exists(stopStatement| \n"
			+ "\t\t\t\t\t\t\t\t\t\t\t\tstopStatement.what.actions->exists(act| act = Action::StopProcessing) and \n"
			+ "\t\t\t\t\t\t\t\t\t\t\t\tstopStatement.what.datas->exists(d| d = data) and not(stopStatement.causedBy = null) and \n"
			+ "\t\t\t\t\t\t\t\t\t\t\t\tstopStatement.causedBy.action= withdrawal))\n" + "\t\t\t\t\t\t\t\t\t\t))\n"
			+ "\t\t\t\t\t\t\t\t\tendif\n" + "\t\t\t\t\t\t\t\telse\n" + "\t\t\t\t\t\t\t\t\tfalse\n"
			+ "\t\t\t\t\t\t\t\tendif\n" + "\t\t\t\t\t\t\t)\n" + "\t\t\t\t\t\tendif\n" + "\t\t\t\t)\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean WithdrawedConsent(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___WITHDRAWED_CONSENT__DIAGNOSTICCHAIN_MAP,
				WITHDRAWED_CONSENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE, PrivacyModelValidator.POLICY_STATEMENT__WITHDRAWED_CONSENT);
	}

	/**
	 * The cached validation expression for the '{@link #ProcessingOfSpecialCategories(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Processing Of Special Categories</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ProcessingOfSpecialCategories(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String PROCESSING_OF_SPECIAL_CATEGORIES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art9',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what.actions->exists(action | action = Action::StopProcessing)) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse\n" + "\t\t\tself.what.datas->forAll(data| \n"
			+ "\t\t\t\tlet dataTypes  = Sequence{DataType::Biometric, DataType::Genetic, DataType::PoliticalOpinion, \n"
			+ "\t\t\t\t\tDataType::RacialOrEthnicOrigin, DataType::SexLife, DataType::Religic, DataType::Judical\n"
			+ "\t\t\t\t} in\n" + "\t\t\t\tif(dataTypes->includes(data.privacydata.type)) then\n"
			+ "\t\t\t\t\t((not(self.how = null) and not(self.how.consent = null))\n" + "\t\t\t\t\t\tor\n"
			+ "\t\t\t\t\t(not(self.why = null) and\n"
			+ "\t\t\t\t\tlet reasons  = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,\n"
			+ "\t\t\t\t\t\tProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::Research, ProcessingReason::PublicHealth\n"
			+ "\t\t\t\t\t} in\n"
			+ "\t\t\t\t\t\treasons->includes(self.why.processingReason) or (not(self.why.subPurposes = null) and self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)\n"
			+ "\t\t\t\t\t))))\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\t\tendif\n" + "\t\t\t)\n"
			+ "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProcessingOfSpecialCategories(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___PROCESSING_OF_SPECIAL_CATEGORIES__DIAGNOSTICCHAIN_MAP,
				PROCESSING_OF_SPECIAL_CATEGORIES_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__PROCESSING_OF_SPECIAL_CATEGORIES);
	}

	/**
	 * The cached validation expression for the '{@link #SubjectShouldBeNotifiedAboutCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Collecting</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SubjectShouldBeNotifiedAboutCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art14',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.what.actions->exists(action| action = Action::Collecting) and self.what.datas->exists(data| data.colllectedFromSubject = false)) then\n"
			+ "\t\t\t\tif(not(self.why = null) and \n"
			+ "\t\t\t\t(self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,Sequence{ProcessingReasonSubtype::None}) or\n"
			+ "\t\t\t\t\tself.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Research,Sequence{ProcessingReasonSubtype::Statistical, \n"
			+ "\t\t\t\t\t\tProcessingReasonSubtype::Historical,ProcessingReasonSubtype::Scientific}))\n"
			+ "\t\t\t\t)then\n" + "\t\t\t\t\ttrue\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.type = NotificationType::DataCollecting \n"
			+ "\t\t\t\t\t\tand notification.causedBy = self\n" + "\t\t\t\t\t)\n" + "\t\t\t\tendif\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutCollecting(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING__DIAGNOSTICCHAIN_MAP,
				SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING);
	}

	/**
	 * The cached validation expression for the '{@link #DateShoudBeDefinedForStoreAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Date Shoud Be Defined For Store Action</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DateShoudBeDefinedForStoreAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_SHOUD_BE_DEFINED_FOR_STORE_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Date shoud be defined',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdateShouldBeDefinedForType(Action::Store)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DateShoudBeDefinedForStoreAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___DATE_SHOUD_BE_DEFINED_FOR_STORE_ACTION__DIAGNOSTICCHAIN_MAP,
				DATE_SHOUD_BE_DEFINED_FOR_STORE_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__DATE_SHOUD_BE_DEFINED_FOR_STORE_ACTION);
	}

	/**
	 * The cached validation expression for the '{@link #CourtApprovalIsNeedForPublicInterestPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Court Approval Is Need For Public Interest Purpose</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CourtApprovalIsNeedForPublicInterestPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String COURT_APPROVAL_IS_NEED_FOR_PUBLIC_INTEREST_PURPOSE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art9',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdocumentIsNeededForPurpose(DocumentType::CourtApproval,ProcessingReason::PublicInterest)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CourtApprovalIsNeedForPublicInterestPurpose(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___COURT_APPROVAL_IS_NEED_FOR_PUBLIC_INTEREST_PURPOSE__DIAGNOSTICCHAIN_MAP,
				COURT_APPROVAL_IS_NEED_FOR_PUBLIC_INTEREST_PURPOSE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__COURT_APPROVAL_IS_NEED_FOR_PUBLIC_INTEREST_PURPOSE);
	}

	/**
	 * The cached validation expression for the '{@link #ControllerApprovalIsNeedForLegitimateInterestsPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Controller Approval Is Need For Legitimate Interests Purpose</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ControllerApprovalIsNeedForLegitimateInterestsPurpose(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CONTROLLER_APPROVAL_IS_NEED_FOR_LEGITIMATE_INTERESTS_PURPOSE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art9',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdocumentIsNeededForPurpose(DocumentType::ControllerApproval,ProcessingReason::LegitimateInterests)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ControllerApprovalIsNeedForLegitimateInterestsPurpose(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEED_FOR_LEGITIMATE_INTERESTS_PURPOSE__DIAGNOSTICCHAIN_MAP,
				CONTROLLER_APPROVAL_IS_NEED_FOR_LEGITIMATE_INTERESTS_PURPOSE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__CONTROLLER_APPROVAL_IS_NEED_FOR_LEGITIMATE_INTERESTS_PURPOSE);
	}

	/**
	 * The cached validation expression for the '{@link #DateShoudBeDefinedForAccessAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Date Shoud Be Defined For Access Action</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DateShoudBeDefinedForAccessAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String DATE_SHOUD_BE_DEFINED_FOR_ACCESS_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Date shoud be defined',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tdateShouldBeDefinedForType(Action::Access)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DateShoudBeDefinedForAccessAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___DATE_SHOUD_BE_DEFINED_FOR_ACCESS_ACTION__DIAGNOSTICCHAIN_MAP,
				DATE_SHOUD_BE_DEFINED_FOR_ACCESS_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__DATE_SHOUD_BE_DEFINED_FOR_ACCESS_ACTION);
	}

	/**
	 * The cached validation expression for the '{@link #ExpiredConsentForCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Expired Consent For Collecting</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ExpiredConsentForCollecting(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRED_CONSENT_FOR_COLLECTING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or not(self.what.actions->exists(act| act = Action::Collecting)) or self.how = null or self.how.consent = null) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tif(self.why = null \n" + "\t\t\t\t\tor \n"
			+ "\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject} in\n"
			+ "\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose)\n"
			+ "\t\t\t\t)) then\n" + "\t\t\t\t\ttrue\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\t(privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, self.how.consent.startDate) or\n"
			+ "\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.startDate))\n"
			+ "\t\t\t\t\tand\n"
			+ "\t\t\t\t\t(self.how.consent.terminationDate = null or not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.terminationDate)))\n"
			+ "\t\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ExpiredConsentForCollecting(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___EXPIRED_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP,
				EXPIRED_CONSENT_FOR_COLLECTING_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__EXPIRED_CONSENT_FOR_COLLECTING);
	}

	/**
	 * The cached validation expression for the '{@link #CausedByShouldBeDefinedForStopProcessingAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Caused By Should Be Defined For Stop Processing Action</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CausedByShouldBeDefinedForStopProcessingAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art21',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tcausedByShouldBeDefinedForType(Action::StopProcessing)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CausedByShouldBeDefinedForStopProcessingAction(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION__DIAGNOSTICCHAIN_MAP,
				CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION);
	}

	/**
	 * The cached validation expression for the '{@link #JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Juvenile Data Should Be Used With Document Of Type Child Custody Provided By Responsible Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art8',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or not(self.what.actions->exists(action| action = Action::Collecting))) then\n"
			+ "\t\t\t\ttrue\n"
			+ "\t\t\telse if(self.whose.type = PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then\n"
			+ "\t\t\t\tif(self.how = null or self.whose.responsiblePersons->isEmpty() or self.how.documents->isEmpty() or \n"
			+ "\t\t\t\t\tnot(self.how.documents->exists(document| document.documentType = DocumentType::ChildCustody and self.whose.responsiblePersons->exists(p|p=document.providedBy)))\n"
			+ "\t\t\t\t) then \n" + "\t\t\t\t\tfalse\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\t\tendif\n"
			+ "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP,
				JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON);
	}

	/**
	 * The cached validation expression for the '{@link #MissingConsentOrTransferCertificate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Missing Consent Or Transfer Certificate</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MissingConsentOrTransferCertificate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_CONSENT_OR_TRANSFER_CERTIFICATE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Arts 44-50',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(not(self.what.actions->exists(action| action = Action::Transfer))or self.where = null or self.where.destination = null or self.where.destination.isEUMember = true) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\t\tif((not(self.where.destination = null)) and self.where.destination.isEUMember = false) then\n"
			+ "\t\t\t\t\t(not(self.how = null) and (self.how.documents->exists(doc| doc.documentType = DocumentType::TransferCertificate) or (not(self.how = null) and not(self.how.consent = null)))) or\n"
			+ "\t\t\t\t\t(not(self.why = null) and \n"
			+ "\t\t\t\t\t(self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,Sequence{ProcessingReasonSubtype::Prevention,ProcessingReasonSubtype::Investigation,ProcessingReasonSubtype::Detection,\n"
			+ "\t\t\t\t\tProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats,ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other}) or\n"
			+ "\t\t\t\t\t\tself.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,Sequence{ProcessingReasonSubtype::PhisicallyIncapable, \n"
			+ "\t\t\t\t\t\t\tProcessingReasonSubtype::Other,ProcessingReasonSubtype::None})))\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\ttrue\n" + "\t\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MissingConsentOrTransferCertificate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___MISSING_CONSENT_OR_TRANSFER_CERTIFICATE__DIAGNOSTICCHAIN_MAP,
				MISSING_CONSENT_OR_TRANSFER_CERTIFICATE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__MISSING_CONSENT_OR_TRANSFER_CERTIFICATE);
	}

	/**
	 * The cached validation expression for the '{@link #UndefinedPurposeForAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Undefined Purpose For Action</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UndefinedPurposeForAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNDEFINED_PURPOSE_FOR_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art6',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or self.what.actions->exists(act| act = Action::Collecting or act = Action::StopProcessing)) then\n"
			+ "\t\t\t\ttrue\n" + "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tself.what.datas->forAll(data|\n"
			+ "\t\t\t\t\tlet statements = privacyPolicy.policyStatements->select(st| \n"
			+ "\t\t\t\t\t\tnot(st.whose = null) and st.whose = self.whose  \n"
			+ "\t\t\t\t\t\tand st.what.actions->exists(act| act = Action::Collecting) and st.what.datas->exists(d| d = data))\n"
			+ "\t\t\t\t\t\tin \n" + "\t\t\t\t\t\tif(statements->isEmpty()) then \n" + "\t\t\t\t\t\t\ttrue\n"
			+ "\t\t\t\t\t\telse\n" + "\t\t\t\t\t\t\tstatements -> forAll(st|\n"
			+ "\t\t\t\t\t\t\t\tif(privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)) then\n"
			+ "\t\t\t\t\t\t\t\t\tif(self.why = null) then\n" + "\t\t\t\t\t\t\t\t\t\tfalse\n"
			+ "\t\t\t\t\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\t\t\t\t\t(not(st.whom = null) and (self.who.equals(st.whom) or st.whom.subPrincipals->exists(subprincipal| subprincipal = self.who)) \n"
			+ "\t\t\t\t\t\t\t\t\t\tor self.who.equals(st.who) or privacyPolicy.owner.subPrincipals->exists(subprincipal| subprincipal = self.who))\n"
			+ "\t\t\t\t\t\t\t\t\t\tand (st.why.isValid(self.why) \n" + "\t\t\t\t\t\t\t\t\t\tor \n"
			+ "\t\t\t\t\t\t\t\t\t\tlet reasons = Sequence{ProcessingReason::PublicInterest,ProcessingReason::LegitimateInterests,ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::PublicHealth} in\n"
			+ "\t\t\t\t\t\t\t\t\t\t\treasons->includes(self.why.processingReason) or self.why.subPurposes->exists(subpurpose| reasons->includes(subpurpose))\n"
			+ "\t\t\t\t\t\t\t\t\t\t)\n" + "\t\t\t\t\t\t\t\t\tendif\n" + "\t\t\t\t\t\t\t\telse\n"
			+ "\t\t\t\t\t\t\t\t\tfalse\n" + "\t\t\t\t\t\t\t\tendif\n" + "\t\t\t\t\t\t\t)\n" + "\t\t\t\t\t\tendif\n"
			+ "\t\t\t\t)\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UndefinedPurposeForAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___UNDEFINED_PURPOSE_FOR_ACTION__DIAGNOSTICCHAIN_MAP,
				UNDEFINED_PURPOSE_FOR_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__UNDEFINED_PURPOSE_FOR_ACTION);
	}

	/**
	 * The cached validation expression for the '{@link #CausedByShouldBeDefinedForRectificationAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Caused By Should Be Defined For Rectification Action</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CausedByShouldBeDefinedForRectificationAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art16',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tcausedByShouldBeDefinedForType(Action::Rectification)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CausedByShouldBeDefinedForRectificationAction(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION__DIAGNOSTICCHAIN_MAP,
				CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				Diagnostic.ERROR, PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION);
	}

	/**
	 * The cached validation expression for the '{@link #ExpiredDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Expired Document</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ExpiredDocument(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRED_DOCUMENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n"
			+ "\t\t\tif(self.how = null or not(self.how.documents->notEmpty())) then\n" + "\t\t\t\ttrue\n"
			+ "\t\t\telse\n"
			+ "\t\t\tlet privacyPolicy : PrivacyPolicy = PrivacyPolicy.allInstances()->asSequence()->first() in\n"
			+ "\t\t\t\tself.how.documents->forAll(document|\n"
			+ "\t\t\t\t\t(privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, document.startDate) or \n"
			+ "\t\t\t\t\tprivacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.startDate))\n"
			+ "\t\t\t\t\tand\n"
			+ "\t\t\t\t\t(document.terminationDate = null or (not(privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.terminationDate))))\n"
			+ "\t\t\t\t)\n" + "\t\t\tendif";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ExpiredDocument(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___EXPIRED_DOCUMENT__DIAGNOSTICCHAIN_MAP,
				EXPIRED_DOCUMENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE, PrivacyModelValidator.POLICY_STATEMENT__EXPIRED_DOCUMENT);
	}

	/**
	 * The cached validation expression for the '{@link #MissingConsentForTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Missing Consent For Transfer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MissingConsentForTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String MISSING_CONSENT_FOR_TRANSFER_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art20',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(self.whose = null or not(self.what.actions->exists(action| action = Action::Transfer)) or self.where = null or self.where.destination = null or self.where.destination.isEUMember = false) then\n"
			+ "\t\t\t\ttrue\n"
			+ "\t\t\telse if(self.whose.type= PrincipalType::NaturalPerson and self.whose.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then\n"
			+ "\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and self.whose.responsiblePersons->exists(person| self.how.consent.providedBy)\n"
			+ "\t\t\telse \n"
			+ "\t\t\t\tnot(self.how = null) and not(self.how.consent = null) and (self.how.consent.providedBy = self.whose or self.whose.responsiblePersons->exists(person| self.how.consent.providedBy))\n"
			+ "\t\t\tendif\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MissingConsentForTransfer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___MISSING_CONSENT_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP,
				MISSING_CONSENT_FOR_TRANSFER_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__MISSING_CONSENT_FOR_TRANSFER);
	}

	/**
	 * The cached validation expression for the '{@link #CausedByShouldBeDefinedForErasureAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Caused By Should Be Defined For Erasure Action</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CausedByShouldBeDefinedForErasureAction(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art17',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tcausedByShouldBeDefinedForType(Action::Erasure)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CausedByShouldBeDefinedForErasureAction(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION__DIAGNOSTICCHAIN_MAP,
				CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION);
	}

	/**
	 * The cached validation expression for the '{@link #SubjectShouldBeNotifiedAboutExecutedErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Subject Should Be Notified About Executed Erasure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SubjectShouldBeNotifiedAboutExecutedErasure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art19',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(what.actions->exists(action| action = Action::Erasure)) then\n"
			+ "\t\t\t\t\tPrivacyPolicy.allInstances()->asSequence()->first().notifications->exists(notification| notification.causedBy = self and\n"
			+ "\t\t\t\t\t\tnotification.type = NotificationType::ExecutedErasure\n" + "\t\t\t\t\t)\n" + "\t\t\t\telse\n"
			+ "\t\t\t\t\ttrue\n" + "\t\t\tendif\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutExecutedErasure(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__DIAGNOSTICCHAIN_MAP,
				SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE);
	}

	/**
	 * The cached validation expression for the '{@link #WhomShouldBeDefinedForTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Whom Should Be Defined For Transfer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WhomShouldBeDefinedForTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art20',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tif(what.actions->exists(action| action = Action::Transfer)) then\n"
			+ "\t\t\t\t\tnot(self.whom = null)\n" + "\t\t\t\telse\n" + "\t\t\t\t\ttrue\n" + "\t\t\tendif\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean WhomShouldBeDefinedForTransfer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.POLICY_STATEMENT, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.POLICY_STATEMENT___WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP,
				WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.POLICY_STATEMENT__WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PrivacyModelPackage.POLICY_STATEMENT__WHEN:
			return basicSetWhen(null, msgs);
		case PrivacyModelPackage.POLICY_STATEMENT__WHY:
			return basicSetWhy(null, msgs);
		case PrivacyModelPackage.POLICY_STATEMENT__WHAT:
			return basicSetWhat(null, msgs);
		case PrivacyModelPackage.POLICY_STATEMENT__HOW:
			return basicSetHow(null, msgs);
		case PrivacyModelPackage.POLICY_STATEMENT__WHERE:
			return basicSetWhere(null, msgs);
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
		case PrivacyModelPackage.POLICY_STATEMENT__WHEN:
			return getWhen();
		case PrivacyModelPackage.POLICY_STATEMENT__WHO:
			if (resolve)
				return getWho();
			return basicGetWho();
		case PrivacyModelPackage.POLICY_STATEMENT__WHY:
			return getWhy();
		case PrivacyModelPackage.POLICY_STATEMENT__WHAT:
			return getWhat();
		case PrivacyModelPackage.POLICY_STATEMENT__HOW:
			return getHow();
		case PrivacyModelPackage.POLICY_STATEMENT__WHOSE:
			if (resolve)
				return getWhose();
			return basicGetWhose();
		case PrivacyModelPackage.POLICY_STATEMENT__WHOM:
			if (resolve)
				return getWhom();
			return basicGetWhom();
		case PrivacyModelPackage.POLICY_STATEMENT__WHERE:
			return getWhere();
		case PrivacyModelPackage.POLICY_STATEMENT__CAUSED_BY:
			if (resolve)
				return getCausedBy();
			return basicGetCausedBy();
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
		case PrivacyModelPackage.POLICY_STATEMENT__WHEN:
			setWhen((AbstractTime) newValue);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHO:
			setWho((Principal) newValue);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHY:
			setWhy((Purpose) newValue);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHAT:
			setWhat((What) newValue);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__HOW:
			setHow((How) newValue);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHOSE:
			setWhose((Principal) newValue);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHOM:
			setWhom((Principal) newValue);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHERE:
			setWhere((Where) newValue);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__CAUSED_BY:
			setCausedBy((Complaint) newValue);
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
		case PrivacyModelPackage.POLICY_STATEMENT__WHEN:
			setWhen((AbstractTime) null);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHO:
			setWho((Principal) null);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHY:
			setWhy((Purpose) null);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHAT:
			setWhat((What) null);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__HOW:
			setHow((How) null);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHOSE:
			setWhose((Principal) null);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHOM:
			setWhom((Principal) null);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__WHERE:
			setWhere((Where) null);
			return;
		case PrivacyModelPackage.POLICY_STATEMENT__CAUSED_BY:
			setCausedBy((Complaint) null);
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
		case PrivacyModelPackage.POLICY_STATEMENT__WHEN:
			return when != null;
		case PrivacyModelPackage.POLICY_STATEMENT__WHO:
			return who != null;
		case PrivacyModelPackage.POLICY_STATEMENT__WHY:
			return why != null;
		case PrivacyModelPackage.POLICY_STATEMENT__WHAT:
			return what != null;
		case PrivacyModelPackage.POLICY_STATEMENT__HOW:
			return how != null;
		case PrivacyModelPackage.POLICY_STATEMENT__WHOSE:
			return whose != null;
		case PrivacyModelPackage.POLICY_STATEMENT__WHOM:
			return whom != null;
		case PrivacyModelPackage.POLICY_STATEMENT__WHERE:
			return where != null;
		case PrivacyModelPackage.POLICY_STATEMENT__CAUSED_BY:
			return causedBy != null;
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
		case PrivacyModelPackage.POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_TYPE__ACTION:
			return dateShouldBeDefinedForType((Action) arguments.get(0));
		case PrivacyModelPackage.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_TYPE__ACTION:
			return causedByShouldBeDefinedForType((Action) arguments.get(0));
		case PrivacyModelPackage.POLICY_STATEMENT___DOCUMENT_IS_NEEDED_FOR_PURPOSE__DOCUMENTTYPE_PROCESSINGREASON:
			return documentIsNeededForPurpose((DocumentType) arguments.get(0), (ProcessingReason) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutTransferToThirdCountry((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutExecutedRectification((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutStopProcessing((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE__DIAGNOSTICCHAIN_MAP:
			return ControllerApprovalIsNeedForProtectTheVitalInterestsOfTheDataSubjectPurpose(
					(DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___MISSING_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP:
			return MissingConsentForCollecting((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___EXPIRED_CONSENT__DIAGNOSTICCHAIN_MAP:
			return ExpiredConsent((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP:
			return StopProcessingPurposeForActionStopProcessing((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___WITHDRAWED_CONSENT__DIAGNOSTICCHAIN_MAP:
			return WithdrawedConsent((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___PROCESSING_OF_SPECIAL_CATEGORIES__DIAGNOSTICCHAIN_MAP:
			return ProcessingOfSpecialCategories((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutCollecting((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___DATE_SHOUD_BE_DEFINED_FOR_STORE_ACTION__DIAGNOSTICCHAIN_MAP:
			return DateShoudBeDefinedForStoreAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___COURT_APPROVAL_IS_NEED_FOR_PUBLIC_INTEREST_PURPOSE__DIAGNOSTICCHAIN_MAP:
			return CourtApprovalIsNeedForPublicInterestPurpose((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEED_FOR_LEGITIMATE_INTERESTS_PURPOSE__DIAGNOSTICCHAIN_MAP:
			return ControllerApprovalIsNeedForLegitimateInterestsPurpose((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___DATE_SHOUD_BE_DEFINED_FOR_ACCESS_ACTION__DIAGNOSTICCHAIN_MAP:
			return DateShoudBeDefinedForAccessAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___EXPIRED_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP:
			return ExpiredConsentForCollecting((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION__DIAGNOSTICCHAIN_MAP:
			return CausedByShouldBeDefinedForStopProcessingAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP:
			return JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(
					(DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___MISSING_CONSENT_OR_TRANSFER_CERTIFICATE__DIAGNOSTICCHAIN_MAP:
			return MissingConsentOrTransferCertificate((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___UNDEFINED_PURPOSE_FOR_ACTION__DIAGNOSTICCHAIN_MAP:
			return UndefinedPurposeForAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION__DIAGNOSTICCHAIN_MAP:
			return CausedByShouldBeDefinedForRectificationAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___EXPIRED_DOCUMENT__DIAGNOSTICCHAIN_MAP:
			return ExpiredDocument((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___MISSING_CONSENT_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP:
			return MissingConsentForTransfer((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION__DIAGNOSTICCHAIN_MAP:
			return CausedByShouldBeDefinedForErasureAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutExecutedErasure((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP:
			return WhomShouldBeDefinedForTransfer((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PolicyStatementImpl
