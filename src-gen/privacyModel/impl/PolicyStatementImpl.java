/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PrivacyModelPackage.POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_TYPE__ACTION:
			return dateShouldBeDefinedForType((Action) arguments.get(0));
		case PrivacyModelPackage.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_TYPE__ACTION:
			return causedByShouldBeDefinedForType((Action) arguments.get(0));
		case PrivacyModelPackage.POLICY_STATEMENT___DOCUMENT_IS_NEEDED_FOR_PURPOSE__DOCUMENTTYPE_PROCESSINGREASON:
			return documentIsNeededForPurpose((DocumentType) arguments.get(0), (ProcessingReason) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PolicyStatementImpl
