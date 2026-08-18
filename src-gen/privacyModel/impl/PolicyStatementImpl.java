/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.IdResolver.IdResolverExtension;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIncludesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.OrderedSetValue.Accumulator;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import privacyModel.AbstractComplaintAction;
import privacyModel.AbstractTime;
import privacyModel.Action;
import privacyModel.Complaint;
import privacyModel.Consent;
import privacyModel.DataType;
import privacyModel.Document;
import privacyModel.DocumentType;
import privacyModel.How;
import privacyModel.Location;
import privacyModel.NotificationInfo;
import privacyModel.NotificationType;
import privacyModel.PolicyStatement;
import privacyModel.Principal;
import privacyModel.PrincipalType;
import privacyModel.PrivacyData;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyModelTables;
import privacyModel.PrivacyPolicy;
import privacyModel.PrivacyPolicyHelper;
import privacyModel.ProcessingReason;
import privacyModel.ProcessingReasonSubtype;
import privacyModel.Purpose;
import privacyModel.SharedPrivacyData;
import privacyModel.What;
import privacyModel.Where;
import privacyModel.Withdraw;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean dateShouldBeDefinedForType(final Action actionType) {
		/**
		 *
		 * if self.what.actions->exists(act | act = actionType)
		 * then not (self.when = null)
		 * else true
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ What what = this.getWhat();
		final /*@NonInvalid*/ List<Action> actions = what.getActions();
		final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
				.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
		/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
		Iterator<Object> ITERATOR_act = BOXED_actions.iterator();
		/*@NonInvalid*/ Boolean exists;
		while (true) {
			if (!ITERATOR_act.hasNext()) {
				if (accumulator == ValueUtil.FALSE_VALUE) {
					exists = ValueUtil.FALSE_VALUE;
				} else {
					throw (InvalidValueException) accumulator;
				}
				break;
			}
			/*@NonInvalid*/ EnumerationLiteralId act = (EnumerationLiteralId) ITERATOR_act.next();
			/**
			 * act = actionType
			 */
			final /*@NonInvalid*/ EnumerationLiteralId BOXED_actionType = PrivacyModelTables.ENUMid_Action
					.getEnumerationLiteralId(ClassUtil.nonNullState(actionType.getName()));
			final /*@NonInvalid*/ boolean eq = act == BOXED_actionType;
			//
			if (eq) { // Normal successful body evaluation result
				exists = ValueUtil.TRUE_VALUE;
				break; // Stop immediately
			} else if (!eq) { // Normal unsuccessful body evaluation result
				; // Carry on
			} else { // Impossible badly typed result
				accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
			}
		}
		if (exists == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@NonInvalid*/ Boolean local_0;
		if (exists) {
			final /*@NonInvalid*/ AbstractTime when = this.getWhen();
			final /*@NonInvalid*/ boolean eq_0 = when == null;
			final /*@NonInvalid*/ Boolean not;
			if (!eq_0) {
				not = ValueUtil.TRUE_VALUE;
			} else {
				if (eq_0) {
					not = ValueUtil.FALSE_VALUE;
				} else {
					not = null;
				}
			}
			local_0 = not;
		} else {
			local_0 = ValueUtil.TRUE_VALUE;
		}
		if (local_0 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PolicyStatement::dateShouldBeDefinedForType(privacyModel::Action[1]) : Boolean[1]\'");
		}
		return local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean causedByShouldBeDefinedForType(final Action actionType) {
		/**
		 *
		 * if self.what.actions->exists(act | act = actionType)
		 * then not (self.causedBy = null)
		 * else true
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ What what = this.getWhat();
		final /*@NonInvalid*/ List<Action> actions = what.getActions();
		final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
				.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
		/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
		Iterator<Object> ITERATOR_act = BOXED_actions.iterator();
		/*@NonInvalid*/ Boolean exists;
		while (true) {
			if (!ITERATOR_act.hasNext()) {
				if (accumulator == ValueUtil.FALSE_VALUE) {
					exists = ValueUtil.FALSE_VALUE;
				} else {
					throw (InvalidValueException) accumulator;
				}
				break;
			}
			/*@NonInvalid*/ EnumerationLiteralId act = (EnumerationLiteralId) ITERATOR_act.next();
			/**
			 * act = actionType
			 */
			final /*@NonInvalid*/ EnumerationLiteralId BOXED_actionType = PrivacyModelTables.ENUMid_Action
					.getEnumerationLiteralId(ClassUtil.nonNullState(actionType.getName()));
			final /*@NonInvalid*/ boolean eq = act == BOXED_actionType;
			//
			if (eq) { // Normal successful body evaluation result
				exists = ValueUtil.TRUE_VALUE;
				break; // Stop immediately
			} else if (!eq) { // Normal unsuccessful body evaluation result
				; // Carry on
			} else { // Impossible badly typed result
				accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
			}
		}
		if (exists == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@NonInvalid*/ Boolean local_0;
		if (exists) {
			final /*@NonInvalid*/ Complaint causedBy = this.getCausedBy();
			final /*@NonInvalid*/ boolean eq_0 = causedBy == null;
			final /*@NonInvalid*/ Boolean not;
			if (!eq_0) {
				not = ValueUtil.TRUE_VALUE;
			} else {
				if (eq_0) {
					not = ValueUtil.FALSE_VALUE;
				} else {
					not = null;
				}
			}
			local_0 = not;
		} else {
			local_0 = ValueUtil.TRUE_VALUE;
		}
		if (local_0 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PolicyStatement::causedByShouldBeDefinedForType(privacyModel::Action[1]) : Boolean[1]\'");
		}
		return local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean documentIsNeededForPurpose(final DocumentType documentType,
			final ProcessingReason processingReason) {
		/**
		 *
		 * if self.what.actions->exists(act | act = Action::Collecting)
		 * then true
		 * else
		 *   if self.why.processingReason = processingReason
		 *   then
		 *     not (self.how = null
		 *     ) and
		 *     self.how.documents->exists(doc | doc.documentType = documentType)
		 *   else
		 *     self.why.subPurposes->forAll(purpose |
		 *       if purpose.processingReason = processingReason
		 *       then
		 *         not (self.how = null
		 *         ) and
		 *         self.how.documents->exists(doc | doc.documentType = documentType)
		 *       else true
		 *       endif)
		 *   endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ What what = this.getWhat();
		final /*@NonInvalid*/ List<Action> actions = what.getActions();
		final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
				.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
		/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
		Iterator<Object> ITERATOR_act = BOXED_actions.iterator();
		/*@NonInvalid*/ Boolean exists;
		while (true) {
			if (!ITERATOR_act.hasNext()) {
				if (accumulator == ValueUtil.FALSE_VALUE) {
					exists = ValueUtil.FALSE_VALUE;
				} else {
					throw (InvalidValueException) accumulator;
				}
				break;
			}
			/*@NonInvalid*/ EnumerationLiteralId act = (EnumerationLiteralId) ITERATOR_act.next();
			/**
			 * act = Action::Collecting
			 */
			final /*@NonInvalid*/ boolean eq = act == PrivacyModelTables.ELITid_Collecting;
			//
			if (eq) { // Normal successful body evaluation result
				exists = ValueUtil.TRUE_VALUE;
				break; // Stop immediately
			} else if (!eq) { // Normal unsuccessful body evaluation result
				; // Carry on
			} else { // Impossible badly typed result
				accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
			}
		}
		if (exists == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@Thrown*/ Boolean local_2;
		if (exists) {
			local_2 = ValueUtil.TRUE_VALUE;
		} else {
			final /*@NonInvalid*/ Purpose why = this.getWhy();
			final /*@NonInvalid*/ ProcessingReason processingReason_0 = why.getProcessingReason();
			final /*@NonInvalid*/ boolean eq_0 = processingReason_0.equals(processingReason);
			/*@Thrown*/ Boolean local_1;
			if (eq_0) {
				final /*@NonInvalid*/ How how = this.getHow();
				final /*@NonInvalid*/ boolean eq_1 = how == null;
				final /*@NonInvalid*/ Boolean not;
				if (!eq_1) {
					not = ValueUtil.TRUE_VALUE;
				} else {
					if (eq_1) {
						not = ValueUtil.FALSE_VALUE;
					} else {
						not = null;
					}
				}
				final /*@Thrown*/ Boolean and;
				if (not == ValueUtil.FALSE_VALUE) {
					and = ValueUtil.FALSE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_exists_0;
					try {
						if (how == null) {
							throw new InvalidValueException(
									"Null source for \'\'http://privacymodel\'::How::documents\'");
						}
						final /*@Thrown*/ List<Document> documents = how.getDocuments();
						final /*@Thrown*/ OrderedSetValue BOXED_documents = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Document, documents);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_doc = BOXED_documents.iterator();
						/*@Thrown*/ Boolean exists_0;
						while (true) {
							if (!ITERATOR_doc.hasNext()) {
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists_0 = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ Document doc = (Document) ITERATOR_doc.next();
							/**
							 * doc.documentType = documentType
							 */
							final /*@NonInvalid*/ DocumentType documentType_0 = doc.getDocumentType();
							final /*@NonInvalid*/ boolean eq_2 = documentType.equals(documentType_0);
							//
							if (eq_2) { // Normal successful body evaluation result
								exists_0 = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!eq_2) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						CAUGHT_exists_0 = exists_0;
					} catch (Exception e) {
						CAUGHT_exists_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_exists_0 == ValueUtil.FALSE_VALUE) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						if (CAUGHT_exists_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_exists_0;
						}
						if ((not == null) || (CAUGHT_exists_0 == null)) {
							and = null;
						} else {
							and = ValueUtil.TRUE_VALUE;
						}
					}
				}
				local_1 = and;
			} else {
				final /*@NonInvalid*/ List<Purpose> subPurposes = why.getSubPurposes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_subPurposes = idResolver
						.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Purpose, subPurposes);
				/*@Thrown*/ Object accumulator_1 = ValueUtil.TRUE_VALUE;
				Iterator<Object> ITERATOR_purpose_0 = BOXED_subPurposes.iterator();
				/*@Thrown*/ Boolean forAll;
				while (true) {
					if (!ITERATOR_purpose_0.hasNext()) {
						if (accumulator_1 == null) {
							forAll = null;
						} else if (accumulator_1 == ValueUtil.TRUE_VALUE) {
							forAll = ValueUtil.TRUE_VALUE;
						} else {
							throw (InvalidValueException) accumulator_1;
						}
						break;
					}
					/*@NonInvalid*/ Purpose purpose_0 = (Purpose) ITERATOR_purpose_0.next();
					/**
					 *
					 * if purpose.processingReason = processingReason
					 * then
					 *   not (self.how = null
					 *   ) and
					 *   self.how.documents->exists(doc | doc.documentType = documentType)
					 * else true
					 * endif
					 */
					/*@Caught*/ Object CAUGHT_local_0;
					try {
						final /*@NonInvalid*/ ProcessingReason processingReason_1 = purpose_0.getProcessingReason();
						final /*@NonInvalid*/ boolean eq_3 = processingReason_1.equals(processingReason);
						/*@Thrown*/ Boolean local_0;
						if (eq_3) {
							final /*@NonInvalid*/ How how_1 = this.getHow();
							final /*@NonInvalid*/ boolean eq_4 = how_1 == null;
							final /*@NonInvalid*/ Boolean not_0;
							if (!eq_4) {
								not_0 = ValueUtil.TRUE_VALUE;
							} else {
								if (eq_4) {
									not_0 = ValueUtil.FALSE_VALUE;
								} else {
									not_0 = null;
								}
							}
							final /*@Thrown*/ Boolean and_0;
							if (not_0 == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_exists_1;
								try {
									if (how_1 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::How::documents\'");
									}
									final /*@Thrown*/ List<Document> documents_0 = how_1.getDocuments();
									final /*@Thrown*/ OrderedSetValue BOXED_documents_0 = idResolver
											.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Document, documents_0);
									/*@Thrown*/ Object accumulator_2 = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_doc_0 = BOXED_documents_0.iterator();
									/*@Thrown*/ Boolean exists_1;
									while (true) {
										if (!ITERATOR_doc_0.hasNext()) {
											if (accumulator_2 == ValueUtil.FALSE_VALUE) {
												exists_1 = ValueUtil.FALSE_VALUE;
											} else {
												throw (InvalidValueException) accumulator_2;
											}
											break;
										}
										/*@NonInvalid*/ Document doc_0 = (Document) ITERATOR_doc_0.next();
										/**
										 * doc.documentType = documentType
										 */
										final /*@NonInvalid*/ DocumentType documentType_1 = doc_0.getDocumentType();
										final /*@NonInvalid*/ boolean eq_5 = documentType.equals(documentType_1);
										//
										if (eq_5) { // Normal successful body evaluation result
											exists_1 = ValueUtil.TRUE_VALUE;
											break; // Stop immediately
										} else if (!eq_5) { // Normal unsuccessful body evaluation result
											; // Carry on
										} else { // Impossible badly typed result
											accumulator_2 = new InvalidValueException(PivotMessages.NonBooleanBody,
													"exists");
										}
									}
									CAUGHT_exists_1 = exists_1;
								} catch (Exception e) {
									CAUGHT_exists_1 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_exists_1 == ValueUtil.FALSE_VALUE) {
									and_0 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_exists_1 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_exists_1;
									}
									if ((not_0 == null) || (CAUGHT_exists_1 == null)) {
										and_0 = null;
									} else {
										and_0 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							local_0 = and_0;
						} else {
							local_0 = ValueUtil.TRUE_VALUE;
						}
						CAUGHT_local_0 = local_0;
					} catch (Exception e) {
						CAUGHT_local_0 = ValueUtil.createInvalidValue(e);
					}
					//
					if (CAUGHT_local_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
						forAll = ValueUtil.FALSE_VALUE;
						break; // Stop immediately
					} else if (CAUGHT_local_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
						; // Carry on
					} else if (CAUGHT_local_0 == null) { // Abnormal null body evaluation result
						if (accumulator_1 == ValueUtil.TRUE_VALUE) {
							accumulator_1 = null; // Cache a null failure
						}
					} else if (CAUGHT_local_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
						accumulator_1 = CAUGHT_local_0; // Cache an exception failure
					} else { // Impossible badly typed result
						accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
					}
				}
				local_1 = forAll;
			}
			local_2 = local_1;
		}
		if (local_2 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::PolicyStatement::documentIsNeededForPurpose(privacyModel::DocumentType[1],privacyModel::ProcessingReason[1]) : Boolean[1]\'");
		}
		return local_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutTransferToThirdCountry(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::SubjectShouldBeNotifiedAboutTransferToThirdCountry";
		try {
			/**
			 *
			 * inv SubjectShouldBeNotifiedAboutTransferToThirdCountry:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             self.what.actions->exists(action | action = Action::Transfer) and
			 *             not (self.where = null
			 *             ) and
			 *             not (self.where.destination = null
			 *             ) and self.where.destination.isEUMember = false
			 *           then
			 *             PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *             .notifications->exists(notification | notification.type = NotificationType::ThirdPartyTransfer and notification.causedBy = self)
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art15', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					/*@Caught*/ Object CAUGHT_and_0;
					try {
						/*@Caught*/ Object CAUGHT_and;
						try {
							final /*@NonInvalid*/ What what = this.getWhat();
							final /*@NonInvalid*/ List<Action> actions = what.getActions();
							final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
									.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
							/*@NonInvalid*/ Boolean exists;
							while (true) {
								if (!ITERATOR_action.hasNext()) {
									if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action
										.next();
								/**
								 * action = Action::Transfer
								 */
								final /*@NonInvalid*/ boolean eq = action == PrivacyModelTables.ELITid_Transfer;
								//
								if (eq) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (!eq) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							final /*@Thrown*/ Boolean and;
							if (exists == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ Where where = this.getWhere();
								final /*@NonInvalid*/ boolean eq_0 = where == null;
								final /*@NonInvalid*/ Boolean not;
								if (!eq_0) {
									not = ValueUtil.TRUE_VALUE;
								} else {
									if (eq_0) {
										not = ValueUtil.FALSE_VALUE;
									} else {
										not = null;
									}
								}
								if (not == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									if ((exists == null) || (not == null)) {
										and = null;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and = and;
						} catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and_0;
						if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_not_0;
							try {
								/*@Caught*/ Object CAUGHT_eq_1;
								try {
									final /*@NonInvalid*/ Where where_0 = this.getWhere();
									if (where_0 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::Where::destination\'");
									}
									final /*@Thrown*/ Location destination = where_0.getDestination();
									final /*@Thrown*/ boolean eq_1 = destination == null;
									CAUGHT_eq_1 = eq_1;
								} catch (Exception e) {
									CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_eq_1 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq_1;
								}
								final /*@Thrown*/ Boolean not_0;
								if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
									not_0 = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
										not_0 = ValueUtil.FALSE_VALUE;
									} else {
										not_0 = null;
									}
								}
								CAUGHT_not_0 = not_0;
							} catch (Exception e) {
								CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_not_0 == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_and instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_and;
								}
								if (CAUGHT_not_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_not_0;
								}
								if ((CAUGHT_and == null) || (CAUGHT_not_0 == null)) {
									and_0 = null;
								} else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						CAUGHT_and_0 = and_0;
					} catch (Exception e) {
						CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and_1;
					if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
						and_1 = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_eq_2;
						try {
							final /*@NonInvalid*/ Where where_1 = this.getWhere();
							if (where_1 == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::Where::destination\'");
							}
							final /*@Thrown*/ Location destination_0 = where_1.getDestination();
							if (destination_0 == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::Location::isEUMember\'");
							}
							final /*@Thrown*/ boolean isEUMember = destination_0.isIsEUMember();
							final /*@Thrown*/ boolean eq_2 = !isEUMember;
							CAUGHT_eq_2 = eq_2;
						} catch (Exception e) {
							CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_eq_2 == ValueUtil.FALSE_VALUE) {
							and_1 = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_and_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and_0;
							}
							if (CAUGHT_eq_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq_2;
							}
							if (CAUGHT_and_0 == null) {
								and_1 = null;
							} else {
								and_1 = ValueUtil.TRUE_VALUE;
							}
						}
					}
					if (and_1 == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (and_1) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
								.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
						final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
								executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
								TYP_privacyModel_c_c_PrivacyPolicy_0);
						final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
								.evaluate(allInstances);
						final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
								.evaluate(asSequence);
						if (first == null) {
							throw new InvalidValueException(
									"Null source for \'\'http://privacymodel\'::PrivacyPolicy::notifications\'");
						}
						final /*@Thrown*/ List<privacyModel.Notification> notifications = first.getNotifications();
						final /*@Thrown*/ OrderedSetValue BOXED_notifications = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Notification, notifications);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_notification = BOXED_notifications.iterator();
						/*@Thrown*/ Boolean exists_0;
						while (true) {
							if (!ITERATOR_notification.hasNext()) {
								if (accumulator_0 == null) {
									exists_0 = null;
								} else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists_0 = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ privacyModel.Notification notification = (privacyModel.Notification) ITERATOR_notification
									.next();
							/**
							 * notification.type = NotificationType::ThirdPartyTransfer and notification.causedBy = self
							 */
							final /*@NonInvalid*/ NotificationType type = notification.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_NotificationType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq_3 = BOXED_type == PrivacyModelTables.ELITid_ThirdPartyTransfer;
							final /*@NonInvalid*/ Boolean and_2;
							if (!eq_3) {
								and_2 = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ NotificationInfo causedBy = notification.getCausedBy();
								final /*@NonInvalid*/ boolean eq_4 = causedBy.equals(this);
								if (!eq_4) {
									and_2 = ValueUtil.FALSE_VALUE;
								} else {
									and_2 = ValueUtil.TRUE_VALUE;
								}
							}
							//
							if (and_2 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists_0 = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (and_2 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (and_2 == null) { // Abnormal null body evaluation result
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									accumulator_0 = null; // Cache a null failure
								}
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						status = exists_0;
					} else {
						status = ValueUtil.TRUE_VALUE;
					}
					final /*@Thrown*/ boolean eq_5 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_5) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art15, status);
						local_1 = local_0;
					}
					CAUGHT_local_1 = local_1;
				} catch (Exception e) {
					CAUGHT_local_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MissingConsentForDataPortability(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::MissingConsentForDataPortability";
		try {
			/**
			 *
			 * inv MissingConsentForDataPortability:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if self.whose = null or
			 *             not self.what.actions->exists(action |
			 *               (action = Action::DataPortability
			 *               ))
			 *           then true
			 *           else
			 *             if self.whose.type = PrincipalType::NaturalPerson and self.whose.age <
			 *               PrivacyPolicy.allInstances()
			 *               ->asSequence()
			 *               ->first().owner.inhabits.legalAgeLimit
			 *             then
			 *               not (self.how = null
			 *               ) and
			 *               not (self.how.consent = null
			 *               ) and
			 *               self.whose.responsiblePersons->exists(person | self.how.consent.providedBy = person)
			 *             else
			 *               not (self.how = null
			 *               ) and
			 *               not (self.how.consent = null
			 *               ) and
			 *               (self.how.consent.providedBy = self.whose or
			 *                 self.whose.responsiblePersons->exists(person | self.how.consent.providedBy = person)
			 *               )
			 *             endif
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art20', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___MISSING_CONSENT_FOR_DATA_PORTABILITY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					final /*@NonInvalid*/ Principal whose = this.getWhose();
					final /*@NonInvalid*/ boolean eq = whose == null;
					final /*@Thrown*/ Boolean or;
					if (eq) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_not;
						try {
							final /*@NonInvalid*/ What what = this.getWhat();
							final /*@NonInvalid*/ List<Action> actions = what.getActions();
							final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
									.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
							/*@NonInvalid*/ Boolean exists;
							while (true) {
								if (!ITERATOR_action.hasNext()) {
									if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action
										.next();
								/**
								 * action = Action::DataPortability
								 */
								final /*@NonInvalid*/ boolean eq_0 = action == PrivacyModelTables.ELITid_DataPortability;
								//
								if (eq_0) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (!eq_0) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							final /*@Thrown*/ Boolean not;
							if (exists == ValueUtil.FALSE_VALUE) {
								not = ValueUtil.TRUE_VALUE;
							} else {
								if (exists == ValueUtil.TRUE_VALUE) {
									not = ValueUtil.FALSE_VALUE;
								} else {
									not = null;
								}
							}
							CAUGHT_not = not;
						} catch (Exception e) {
							CAUGHT_not = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if (CAUGHT_not == null) {
								or = null;
							} else {
								or = ValueUtil.FALSE_VALUE;
							}
						}
					}
					if (or == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (or) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and_2;
						try {
							final /*@NonInvalid*/ How how_2 = this.getHow();
							final /*@NonInvalid*/ boolean eq_5 = how_2 == null;
							final /*@NonInvalid*/ Boolean not_2;
							if (!eq_5) {
								not_2 = ValueUtil.TRUE_VALUE;
							} else {
								if (eq_5) {
									not_2 = ValueUtil.FALSE_VALUE;
								} else {
									not_2 = null;
								}
							}
							final /*@Thrown*/ Boolean and_2;
							if (not_2 == ValueUtil.FALSE_VALUE) {
								and_2 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_not_3;
								try {
									/*@Caught*/ Object CAUGHT_eq_6;
									try {
										if (how_2 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::How::consent\'");
										}
										final /*@Thrown*/ Consent consent_1 = how_2.getConsent();
										final /*@Thrown*/ boolean eq_6 = consent_1 == null;
										CAUGHT_eq_6 = eq_6;
									} catch (Exception e) {
										CAUGHT_eq_6 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_eq_6 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq_6;
									}
									final /*@Thrown*/ Boolean not_3;
									if (CAUGHT_eq_6 == ValueUtil.FALSE_VALUE) {
										not_3 = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq_6 == ValueUtil.TRUE_VALUE) {
											not_3 = ValueUtil.FALSE_VALUE;
										} else {
											not_3 = null;
										}
									}
									CAUGHT_not_3 = not_3;
								} catch (Exception e) {
									CAUGHT_not_3 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_not_3 == ValueUtil.FALSE_VALUE) {
									and_2 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_not_3 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_not_3;
									}
									if ((not_2 == null) || (CAUGHT_not_3 == null)) {
										and_2 = null;
									} else {
										and_2 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_2 = and_2;
						} catch (Exception e) {
							CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ Object CAUGHT_eq_1;
						try {
							if (whose == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::Principal::type\'");
							}
							final /*@Thrown*/ PrincipalType type = whose.getType();
							final /*@Thrown*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_PrincipalType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@Thrown*/ boolean eq_1 = BOXED_type == PrivacyModelTables.ELITid_NaturalPerson;
							CAUGHT_eq_1 = eq_1;
						} catch (Exception e) {
							CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and;
						if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_lt;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
										.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
								if (whose == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Principal::age\'");
								}
								final /*@Thrown*/ int age = whose.getAge();
								final /*@Thrown*/ IntegerValue BOXED_age = ValueUtil.integerValueOf(age);
								final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
										.evaluate(executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
												TYP_privacyModel_c_c_PrivacyPolicy_0);
								final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
										.evaluate(allInstances);
								final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
										.evaluate(asSequence);
								if (first == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::PrivacyPolicy::owner\'");
								}
								final /*@Thrown*/ Principal owner = first.getOwner();
								final /*@Thrown*/ Location inhabits = owner.getInhabits();
								if (inhabits == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Location::legalAgeLimit\'");
								}
								final /*@Thrown*/ int legalAgeLimit = inhabits.getLegalAgeLimit();
								final /*@Thrown*/ IntegerValue BOXED_legalAgeLimit = ValueUtil
										.integerValueOf(legalAgeLimit);
								if (BOXED_legalAgeLimit instanceof InvalidValueException) {
									throw (InvalidValueException) BOXED_legalAgeLimit;
								}
								final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE
										.evaluate(executor, BOXED_age, BOXED_legalAgeLimit).booleanValue();
								CAUGHT_lt = lt;
							} catch (Exception e) {
								CAUGHT_lt = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_lt == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_eq_1 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq_1;
								}
								if (CAUGHT_lt instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_lt;
								}
								and = ValueUtil.TRUE_VALUE;
							}
						}
						if (and == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@Thrown*/ Boolean local_0;
						if (and) {
							final /*@Thrown*/ Boolean and_1;
							if (CAUGHT_and_2 == ValueUtil.FALSE_VALUE) {
								and_1 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_exists_0;
								try {
									if (whose == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::Principal::responsiblePersons\'");
									}
									final /*@Thrown*/ List<Principal> responsiblePersons = whose
											.getResponsiblePersons();
									final /*@Thrown*/ OrderedSetValue BOXED_responsiblePersons = idResolver
											.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal,
													responsiblePersons);
									/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_person = BOXED_responsiblePersons.iterator();
									/*@Thrown*/ Boolean exists_0;
									while (true) {
										if (!ITERATOR_person.hasNext()) {
											if (accumulator_0 == ValueUtil.FALSE_VALUE) {
												exists_0 = ValueUtil.FALSE_VALUE;
											} else {
												throw (InvalidValueException) accumulator_0;
											}
											break;
										}
										/*@NonInvalid*/ Principal person = (Principal) ITERATOR_person.next();
										/**
										 * self.how.consent.providedBy = person
										 */
										/*@Caught*/ Object CAUGHT_eq_4;
										try {
											final /*@NonInvalid*/ How how_1 = this.getHow();
											if (how_1 == null) {
												throw new InvalidValueException(
														"Null source for \'\'http://privacymodel\'::How::consent\'");
											}
											final /*@Thrown*/ Consent consent_0 = how_1.getConsent();
											if (consent_0 == null) {
												throw new InvalidValueException(
														"Null source for \'\'http://privacymodel\'::AbstractPaper::providedBy\'");
											}
											final /*@Thrown*/ Principal providedBy = consent_0.getProvidedBy();
											final /*@Thrown*/ boolean eq_4 = providedBy.equals(person);
											CAUGHT_eq_4 = eq_4;
										} catch (Exception e) {
											CAUGHT_eq_4 = ValueUtil.createInvalidValue(e);
										}
										//
										if (CAUGHT_eq_4 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
											exists_0 = ValueUtil.TRUE_VALUE;
											break; // Stop immediately
										} else if (CAUGHT_eq_4 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
											; // Carry on
										} else if (CAUGHT_eq_4 instanceof InvalidValueException) { // Abnormal exception evaluation result
											accumulator_0 = CAUGHT_eq_4; // Cache an exception failure
										} else { // Impossible badly typed result
											accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
													"exists");
										}
									}
									CAUGHT_exists_0 = exists_0;
								} catch (Exception e) {
									CAUGHT_exists_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_exists_0 == ValueUtil.FALSE_VALUE) {
									and_1 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_and_2 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_2;
									}
									if (CAUGHT_exists_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_exists_0;
									}
									if ((CAUGHT_and_2 == null) || (CAUGHT_exists_0 == null)) {
										and_1 = null;
									} else {
										and_1 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							local_0 = and_1;
						} else {
							final /*@Thrown*/ Boolean and_3;
							if (CAUGHT_and_2 == ValueUtil.FALSE_VALUE) {
								and_3 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_or_0;
								try {
									/*@Caught*/ Object CAUGHT_eq_7;
									try {
										final /*@NonInvalid*/ How how_4 = this.getHow();
										if (how_4 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::How::consent\'");
										}
										final /*@Thrown*/ Consent consent_2 = how_4.getConsent();
										if (consent_2 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::AbstractPaper::providedBy\'");
										}
										final /*@Thrown*/ Principal providedBy_0 = consent_2.getProvidedBy();
										final /*@Thrown*/ boolean eq_7 = providedBy_0.equals(whose);
										CAUGHT_eq_7 = eq_7;
									} catch (Exception e) {
										CAUGHT_eq_7 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean or_0;
									if (CAUGHT_eq_7 == ValueUtil.TRUE_VALUE) {
										or_0 = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_exists_1;
										try {
											if (whose == null) {
												throw new InvalidValueException(
														"Null source for \'\'http://privacymodel\'::Principal::responsiblePersons\'");
											}
											final /*@Thrown*/ List<Principal> responsiblePersons_0 = whose
													.getResponsiblePersons();
											final /*@Thrown*/ OrderedSetValue BOXED_responsiblePersons_0 = idResolver
													.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal,
															responsiblePersons_0);
											/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
											Iterator<Object> ITERATOR_person_0 = BOXED_responsiblePersons_0.iterator();
											/*@Thrown*/ Boolean exists_1;
											while (true) {
												if (!ITERATOR_person_0.hasNext()) {
													if (accumulator_1 == ValueUtil.FALSE_VALUE) {
														exists_1 = ValueUtil.FALSE_VALUE;
													} else {
														throw (InvalidValueException) accumulator_1;
													}
													break;
												}
												/*@NonInvalid*/ Principal person_0 = (Principal) ITERATOR_person_0
														.next();
												/**
												 * self.how.consent.providedBy = person
												 */
												/*@Caught*/ Object CAUGHT_eq_8;
												try {
													final /*@NonInvalid*/ How how_5 = this.getHow();
													if (how_5 == null) {
														throw new InvalidValueException(
																"Null source for \'\'http://privacymodel\'::How::consent\'");
													}
													final /*@Thrown*/ Consent consent_3 = how_5.getConsent();
													if (consent_3 == null) {
														throw new InvalidValueException(
																"Null source for \'\'http://privacymodel\'::AbstractPaper::providedBy\'");
													}
													final /*@Thrown*/ Principal providedBy_1 = consent_3
															.getProvidedBy();
													final /*@Thrown*/ boolean eq_8 = providedBy_1.equals(person_0);
													CAUGHT_eq_8 = eq_8;
												} catch (Exception e) {
													CAUGHT_eq_8 = ValueUtil.createInvalidValue(e);
												}
												//
												if (CAUGHT_eq_8 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
													exists_1 = ValueUtil.TRUE_VALUE;
													break; // Stop immediately
												} else if (CAUGHT_eq_8 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
													; // Carry on
												} else if (CAUGHT_eq_8 instanceof InvalidValueException) { // Abnormal exception evaluation result
													accumulator_1 = CAUGHT_eq_8; // Cache an exception failure
												} else { // Impossible badly typed result
													accumulator_1 = new InvalidValueException(
															PivotMessages.NonBooleanBody, "exists");
												}
											}
											CAUGHT_exists_1 = exists_1;
										} catch (Exception e) {
											CAUGHT_exists_1 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_exists_1 == ValueUtil.TRUE_VALUE) {
											or_0 = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_eq_7 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_7;
											}
											if (CAUGHT_exists_1 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_exists_1;
											}
											if (CAUGHT_exists_1 == null) {
												or_0 = null;
											} else {
												or_0 = ValueUtil.FALSE_VALUE;
											}
										}
									}
									CAUGHT_or_0 = or_0;
								} catch (Exception e) {
									CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_or_0 == ValueUtil.FALSE_VALUE) {
									and_3 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_and_2 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_2;
									}
									if (CAUGHT_or_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_or_0;
									}
									if ((CAUGHT_and_2 == null) || (CAUGHT_or_0 == null)) {
										and_3 = null;
									} else {
										and_3 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							local_0 = and_3;
						}
						status = local_0;
					}
					final /*@Thrown*/ boolean eq_9 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_9) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art20, status);
						local_2 = local_1;
					}
					CAUGHT_local_2 = local_2;
				} catch (Exception e) {
					CAUGHT_local_2 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_2, PrivacyModelTables.INT_0)
						.booleanValue();
				local_3 = logDiagnostic;
			}
			return local_3;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutExecutedRectification(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::SubjectShouldBeNotifiedAboutExecutedRectification";
		try {
			/**
			 *
			 * inv SubjectShouldBeNotifiedAboutExecutedRectification:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             what.actions->exists(action | action = Action::Rectification)
			 *           then
			 *             PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *             .notifications->exists(notification | notification.causedBy = self and notification.type = NotificationType::ExecutedRectification)
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art19', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ What what = this.getWhat();
					final /*@NonInvalid*/ List<Action> actions = what.getActions();
					final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_action.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action.next();
						/**
						 * action = Action::Rectification
						 */
						final /*@NonInvalid*/ boolean eq = action == PrivacyModelTables.ELITid_Rectification;
						//
						if (eq) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!eq) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					if (exists == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (exists) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
								.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
						final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
								executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
								TYP_privacyModel_c_c_PrivacyPolicy_0);
						final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
								.evaluate(allInstances);
						final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
								.evaluate(asSequence);
						if (first == null) {
							throw new InvalidValueException(
									"Null source for \'\'http://privacymodel\'::PrivacyPolicy::notifications\'");
						}
						final /*@Thrown*/ List<privacyModel.Notification> notifications = first.getNotifications();
						final /*@Thrown*/ OrderedSetValue BOXED_notifications = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Notification, notifications);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_notification = BOXED_notifications.iterator();
						/*@Thrown*/ Boolean exists_0;
						while (true) {
							if (!ITERATOR_notification.hasNext()) {
								if (accumulator_0 == null) {
									exists_0 = null;
								} else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists_0 = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ privacyModel.Notification notification = (privacyModel.Notification) ITERATOR_notification
									.next();
							/**
							 * notification.causedBy = self and notification.type = NotificationType::ExecutedRectification
							 */
							final /*@NonInvalid*/ NotificationInfo causedBy = notification.getCausedBy();
							final /*@NonInvalid*/ boolean eq_0 = causedBy.equals(this);
							final /*@NonInvalid*/ Boolean and;
							if (!eq_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ NotificationType type = notification.getType();
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_NotificationType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
								final /*@NonInvalid*/ boolean eq_1 = BOXED_type == PrivacyModelTables.ELITid_ExecutedRectification;
								if (!eq_1) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							//
							if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists_0 = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (and == null) { // Abnormal null body evaluation result
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									accumulator_0 = null; // Cache a null failure
								}
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						status = exists_0;
					} else {
						status = ValueUtil.TRUE_VALUE;
					}
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_2) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art19, status);
						local_1 = local_0;
					}
					CAUGHT_local_1 = local_1;
				} catch (Exception e) {
					CAUGHT_local_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutStopProcessing(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::SubjectShouldBeNotifiedAboutStopProcessing";
		try {
			/**
			 *
			 * inv SubjectShouldBeNotifiedAboutStopProcessing:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             what.actions->exists(action | action = Action::StopProcessing)
			 *           then
			 *             PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *             .notifications->exists(notification | notification.type = NotificationType::StopProcessing and notification.causedBy = self)
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art21', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ What what = this.getWhat();
					final /*@NonInvalid*/ List<Action> actions = what.getActions();
					final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_action.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action.next();
						/**
						 * action = Action::StopProcessing
						 */
						final /*@NonInvalid*/ boolean eq = action == PrivacyModelTables.ELITid_StopProcessing;
						//
						if (eq) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!eq) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					if (exists == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (exists) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
								.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
						final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
								executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
								TYP_privacyModel_c_c_PrivacyPolicy_0);
						final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
								.evaluate(allInstances);
						final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
								.evaluate(asSequence);
						if (first == null) {
							throw new InvalidValueException(
									"Null source for \'\'http://privacymodel\'::PrivacyPolicy::notifications\'");
						}
						final /*@Thrown*/ List<privacyModel.Notification> notifications = first.getNotifications();
						final /*@Thrown*/ OrderedSetValue BOXED_notifications = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Notification, notifications);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_notification = BOXED_notifications.iterator();
						/*@Thrown*/ Boolean exists_0;
						while (true) {
							if (!ITERATOR_notification.hasNext()) {
								if (accumulator_0 == null) {
									exists_0 = null;
								} else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists_0 = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ privacyModel.Notification notification = (privacyModel.Notification) ITERATOR_notification
									.next();
							/**
							 * notification.type = NotificationType::StopProcessing and notification.causedBy = self
							 */
							final /*@NonInvalid*/ NotificationType type = notification.getType();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_NotificationType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@NonInvalid*/ boolean eq_0 = BOXED_type == PrivacyModelTables.ELITid_StopProcessing_1;
							final /*@NonInvalid*/ Boolean and;
							if (!eq_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ NotificationInfo causedBy = notification.getCausedBy();
								final /*@NonInvalid*/ boolean eq_1 = causedBy.equals(this);
								if (!eq_1) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							//
							if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists_0 = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (and == null) { // Abnormal null body evaluation result
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									accumulator_0 = null; // Cache a null failure
								}
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						status = exists_0;
					} else {
						status = ValueUtil.TRUE_VALUE;
					}
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_2) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art21, status);
						local_1 = local_0;
					}
					CAUGHT_local_1 = local_1;
				} catch (Exception e) {
					CAUGHT_local_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MissingConsentForCollecting(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::MissingConsentForCollecting";
		try {
			/**
			 *
			 * inv MissingConsentForCollecting:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if self.whose = null or
			 *             not self.what.actions->exists(action | (action = Action::Collecting)) or
			 *             what.datas->exists(data | data.collectedFromSubject = false) and
			 *             self.what.actions->exists(action | action = Action::Collecting)
			 *           then true
			 *           else
			 *             if self.whose.type = PrincipalType::NaturalPerson and self.whose.age <
			 *               PrivacyPolicy.allInstances()
			 *               ->asSequence()
			 *               ->first().owner.inhabits.legalAgeLimit
			 *             then
			 *               not (self.how = null
			 *               ) and
			 *               not (self.how.consent = null
			 *               ) and
			 *               self.whose.responsiblePersons->exists(person | self.how.consent.providedBy = person)
			 *             else
			 *               not (self.how = null
			 *               ) and
			 *               not (self.how.consent = null
			 *               ) and
			 *               (self.how.consent.providedBy = self.whose or
			 *                 self.whose.responsiblePersons->exists(person | self.how.consent.providedBy = person)
			 *               )
			 *             endif
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art6', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___MISSING_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					/*@Caught*/ Object CAUGHT_or;
					try {
						final /*@NonInvalid*/ Principal whose = this.getWhose();
						final /*@NonInvalid*/ boolean eq = whose == null;
						final /*@Thrown*/ Boolean or;
						if (eq) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_not;
							try {
								final /*@NonInvalid*/ What what = this.getWhat();
								final /*@NonInvalid*/ List<Action> actions = what.getActions();
								final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
										.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
								/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
								/*@NonInvalid*/ Boolean exists;
								while (true) {
									if (!ITERATOR_action.hasNext()) {
										if (accumulator == ValueUtil.FALSE_VALUE) {
											exists = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator;
										}
										break;
									}
									/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action
											.next();
									/**
									 * action = Action::Collecting
									 */
									final /*@NonInvalid*/ boolean eq_0 = action == PrivacyModelTables.ELITid_Collecting;
									//
									if (eq_0) { // Normal successful body evaluation result
										exists = ValueUtil.TRUE_VALUE;
										break; // Stop immediately
									} else if (!eq_0) { // Normal unsuccessful body evaluation result
										; // Carry on
									} else { // Impossible badly typed result
										accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
									}
								}
								final /*@Thrown*/ Boolean not;
								if (exists == ValueUtil.FALSE_VALUE) {
									not = ValueUtil.TRUE_VALUE;
								} else {
									if (exists == ValueUtil.TRUE_VALUE) {
										not = ValueUtil.FALSE_VALUE;
									} else {
										not = null;
									}
								}
								CAUGHT_not = not;
							} catch (Exception e) {
								CAUGHT_not = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_not instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_not;
								}
								if (CAUGHT_not == null) {
									or = null;
								} else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or = or;
					} catch (Exception e) {
						CAUGHT_or = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean or_0;
					if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
						or_0 = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and;
						try {
							final /*@NonInvalid*/ What what_1 = this.getWhat();
							final /*@NonInvalid*/ List<SharedPrivacyData> datas = what_1.getDatas();
							final /*@NonInvalid*/ OrderedSetValue BOXED_datas = idResolver
									.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_SharedPrivacyData, datas);
							/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_data = BOXED_datas.iterator();
							/*@NonInvalid*/ Boolean exists_0;
							while (true) {
								if (!ITERATOR_data.hasNext()) {
									if (accumulator_0 == ValueUtil.FALSE_VALUE) {
										exists_0 = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator_0;
									}
									break;
								}
								/*@NonInvalid*/ SharedPrivacyData data = (SharedPrivacyData) ITERATOR_data.next();
								/**
								 * data.collectedFromSubject = false
								 */
								final /*@NonInvalid*/ boolean collectedFromSubject = data.isCollectedFromSubject();
								final /*@NonInvalid*/ boolean eq_1 = !collectedFromSubject;
								//
								if (eq_1) { // Normal successful body evaluation result
									exists_0 = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (!eq_1) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else { // Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							final /*@Thrown*/ Boolean and;
							if (exists_0 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ List<Action> actions_0 = what_1.getActions();
								final /*@NonInvalid*/ OrderedSetValue BOXED_actions_0 = idResolver
										.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions_0);
								/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_action_0 = BOXED_actions_0.iterator();
								/*@NonInvalid*/ Boolean exists_1;
								while (true) {
									if (!ITERATOR_action_0.hasNext()) {
										if (accumulator_1 == ValueUtil.FALSE_VALUE) {
											exists_1 = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator_1;
										}
										break;
									}
									/*@NonInvalid*/ EnumerationLiteralId action_0 = (EnumerationLiteralId) ITERATOR_action_0
											.next();
									/**
									 * action = Action::Collecting
									 */
									final /*@NonInvalid*/ boolean eq_2 = action_0 == PrivacyModelTables.ELITid_Collecting;
									//
									if (eq_2) { // Normal successful body evaluation result
										exists_1 = ValueUtil.TRUE_VALUE;
										break; // Stop immediately
									} else if (!eq_2) { // Normal unsuccessful body evaluation result
										; // Carry on
									} else { // Impossible badly typed result
										accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody,
												"exists");
									}
								}
								if (exists_1 == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									if ((exists_0 == null) || (exists_1 == null)) {
										and = null;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and = and;
						} catch (Exception e) {
							CAUGHT_and = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
							or_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_or instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or;
							}
							if (CAUGHT_and instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_and;
							}
							if ((CAUGHT_or == null) || (CAUGHT_and == null)) {
								or_0 = null;
							} else {
								or_0 = ValueUtil.FALSE_VALUE;
							}
						}
					}
					if (or_0 == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (or_0) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_and_3;
						try {
							final /*@NonInvalid*/ How how_2 = this.getHow();
							final /*@NonInvalid*/ boolean eq_7 = how_2 == null;
							final /*@NonInvalid*/ Boolean not_2;
							if (!eq_7) {
								not_2 = ValueUtil.TRUE_VALUE;
							} else {
								if (eq_7) {
									not_2 = ValueUtil.FALSE_VALUE;
								} else {
									not_2 = null;
								}
							}
							final /*@Thrown*/ Boolean and_3;
							if (not_2 == ValueUtil.FALSE_VALUE) {
								and_3 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_not_3;
								try {
									/*@Caught*/ Object CAUGHT_eq_8;
									try {
										if (how_2 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::How::consent\'");
										}
										final /*@Thrown*/ Consent consent_1 = how_2.getConsent();
										final /*@Thrown*/ boolean eq_8 = consent_1 == null;
										CAUGHT_eq_8 = eq_8;
									} catch (Exception e) {
										CAUGHT_eq_8 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_eq_8 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_eq_8;
									}
									final /*@Thrown*/ Boolean not_3;
									if (CAUGHT_eq_8 == ValueUtil.FALSE_VALUE) {
										not_3 = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq_8 == ValueUtil.TRUE_VALUE) {
											not_3 = ValueUtil.FALSE_VALUE;
										} else {
											not_3 = null;
										}
									}
									CAUGHT_not_3 = not_3;
								} catch (Exception e) {
									CAUGHT_not_3 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_not_3 == ValueUtil.FALSE_VALUE) {
									and_3 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_not_3 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_not_3;
									}
									if ((not_2 == null) || (CAUGHT_not_3 == null)) {
										and_3 = null;
									} else {
										and_3 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							CAUGHT_and_3 = and_3;
						} catch (Exception e) {
							CAUGHT_and_3 = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ Object CAUGHT_eq_3;
						try {
							final /*@NonInvalid*/ Principal whose_0 = this.getWhose();
							if (whose_0 == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::Principal::type\'");
							}
							final /*@Thrown*/ PrincipalType type = whose_0.getType();
							final /*@Thrown*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_PrincipalType
									.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
							final /*@Thrown*/ boolean eq_3 = BOXED_type == PrivacyModelTables.ELITid_NaturalPerson;
							CAUGHT_eq_3 = eq_3;
						} catch (Exception e) {
							CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and_0;
						if (CAUGHT_eq_3 == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_lt;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
										.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
								final /*@NonInvalid*/ Principal whose_1 = this.getWhose();
								if (whose_1 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Principal::age\'");
								}
								final /*@Thrown*/ int age = whose_1.getAge();
								final /*@Thrown*/ IntegerValue BOXED_age = ValueUtil.integerValueOf(age);
								final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
										.evaluate(executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
												TYP_privacyModel_c_c_PrivacyPolicy_0);
								final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
										.evaluate(allInstances);
								final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
										.evaluate(asSequence);
								if (first == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::PrivacyPolicy::owner\'");
								}
								final /*@Thrown*/ Principal owner = first.getOwner();
								final /*@Thrown*/ Location inhabits = owner.getInhabits();
								if (inhabits == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Location::legalAgeLimit\'");
								}
								final /*@Thrown*/ int legalAgeLimit = inhabits.getLegalAgeLimit();
								final /*@Thrown*/ IntegerValue BOXED_legalAgeLimit = ValueUtil
										.integerValueOf(legalAgeLimit);
								if (BOXED_legalAgeLimit instanceof InvalidValueException) {
									throw (InvalidValueException) BOXED_legalAgeLimit;
								}
								final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE
										.evaluate(executor, BOXED_age, BOXED_legalAgeLimit).booleanValue();
								CAUGHT_lt = lt;
							} catch (Exception e) {
								CAUGHT_lt = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_lt == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_eq_3 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq_3;
								}
								if (CAUGHT_lt instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_lt;
								}
								and_0 = ValueUtil.TRUE_VALUE;
							}
						}
						if (and_0 == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@Thrown*/ Boolean local_0;
						if (and_0) {
							final /*@Thrown*/ Boolean and_2;
							if (CAUGHT_and_3 == ValueUtil.FALSE_VALUE) {
								and_2 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_exists_2;
								try {
									final /*@NonInvalid*/ Principal whose_2 = this.getWhose();
									if (whose_2 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::Principal::responsiblePersons\'");
									}
									final /*@Thrown*/ List<Principal> responsiblePersons = whose_2
											.getResponsiblePersons();
									final /*@Thrown*/ OrderedSetValue BOXED_responsiblePersons = idResolver
											.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal,
													responsiblePersons);
									/*@Thrown*/ Object accumulator_2 = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_person = BOXED_responsiblePersons.iterator();
									/*@Thrown*/ Boolean exists_2;
									while (true) {
										if (!ITERATOR_person.hasNext()) {
											if (accumulator_2 == ValueUtil.FALSE_VALUE) {
												exists_2 = ValueUtil.FALSE_VALUE;
											} else {
												throw (InvalidValueException) accumulator_2;
											}
											break;
										}
										/*@NonInvalid*/ Principal person = (Principal) ITERATOR_person.next();
										/**
										 * self.how.consent.providedBy = person
										 */
										/*@Caught*/ Object CAUGHT_eq_6;
										try {
											final /*@NonInvalid*/ How how_1 = this.getHow();
											if (how_1 == null) {
												throw new InvalidValueException(
														"Null source for \'\'http://privacymodel\'::How::consent\'");
											}
											final /*@Thrown*/ Consent consent_0 = how_1.getConsent();
											if (consent_0 == null) {
												throw new InvalidValueException(
														"Null source for \'\'http://privacymodel\'::AbstractPaper::providedBy\'");
											}
											final /*@Thrown*/ Principal providedBy = consent_0.getProvidedBy();
											final /*@Thrown*/ boolean eq_6 = providedBy.equals(person);
											CAUGHT_eq_6 = eq_6;
										} catch (Exception e) {
											CAUGHT_eq_6 = ValueUtil.createInvalidValue(e);
										}
										//
										if (CAUGHT_eq_6 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
											exists_2 = ValueUtil.TRUE_VALUE;
											break; // Stop immediately
										} else if (CAUGHT_eq_6 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
											; // Carry on
										} else if (CAUGHT_eq_6 instanceof InvalidValueException) { // Abnormal exception evaluation result
											accumulator_2 = CAUGHT_eq_6; // Cache an exception failure
										} else { // Impossible badly typed result
											accumulator_2 = new InvalidValueException(PivotMessages.NonBooleanBody,
													"exists");
										}
									}
									CAUGHT_exists_2 = exists_2;
								} catch (Exception e) {
									CAUGHT_exists_2 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_exists_2 == ValueUtil.FALSE_VALUE) {
									and_2 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_and_3 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_3;
									}
									if (CAUGHT_exists_2 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_exists_2;
									}
									if ((CAUGHT_and_3 == null) || (CAUGHT_exists_2 == null)) {
										and_2 = null;
									} else {
										and_2 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							local_0 = and_2;
						} else {
							final /*@Thrown*/ Boolean and_4;
							if (CAUGHT_and_3 == ValueUtil.FALSE_VALUE) {
								and_4 = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_or_1;
								try {
									/*@Caught*/ Object CAUGHT_eq_9;
									try {
										final /*@NonInvalid*/ How how_4 = this.getHow();
										if (how_4 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::How::consent\'");
										}
										final /*@Thrown*/ Consent consent_2 = how_4.getConsent();
										if (consent_2 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::AbstractPaper::providedBy\'");
										}
										final /*@Thrown*/ Principal providedBy_0 = consent_2.getProvidedBy();
										final /*@NonInvalid*/ Principal whose_3 = this.getWhose();
										final /*@Thrown*/ boolean eq_9 = providedBy_0.equals(whose_3);
										CAUGHT_eq_9 = eq_9;
									} catch (Exception e) {
										CAUGHT_eq_9 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean or_1;
									if (CAUGHT_eq_9 == ValueUtil.TRUE_VALUE) {
										or_1 = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_exists_3;
										try {
											final /*@NonInvalid*/ Principal whose_4 = this.getWhose();
											if (whose_4 == null) {
												throw new InvalidValueException(
														"Null source for \'\'http://privacymodel\'::Principal::responsiblePersons\'");
											}
											final /*@Thrown*/ List<Principal> responsiblePersons_0 = whose_4
													.getResponsiblePersons();
											final /*@Thrown*/ OrderedSetValue BOXED_responsiblePersons_0 = idResolver
													.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal,
															responsiblePersons_0);
											/*@Thrown*/ Object accumulator_3 = ValueUtil.FALSE_VALUE;
											Iterator<Object> ITERATOR_person_0 = BOXED_responsiblePersons_0.iterator();
											/*@Thrown*/ Boolean exists_3;
											while (true) {
												if (!ITERATOR_person_0.hasNext()) {
													if (accumulator_3 == ValueUtil.FALSE_VALUE) {
														exists_3 = ValueUtil.FALSE_VALUE;
													} else {
														throw (InvalidValueException) accumulator_3;
													}
													break;
												}
												/*@NonInvalid*/ Principal person_0 = (Principal) ITERATOR_person_0
														.next();
												/**
												 * self.how.consent.providedBy = person
												 */
												/*@Caught*/ Object CAUGHT_eq_10;
												try {
													final /*@NonInvalid*/ How how_5 = this.getHow();
													if (how_5 == null) {
														throw new InvalidValueException(
																"Null source for \'\'http://privacymodel\'::How::consent\'");
													}
													final /*@Thrown*/ Consent consent_3 = how_5.getConsent();
													if (consent_3 == null) {
														throw new InvalidValueException(
																"Null source for \'\'http://privacymodel\'::AbstractPaper::providedBy\'");
													}
													final /*@Thrown*/ Principal providedBy_1 = consent_3
															.getProvidedBy();
													final /*@Thrown*/ boolean eq_10 = providedBy_1.equals(person_0);
													CAUGHT_eq_10 = eq_10;
												} catch (Exception e) {
													CAUGHT_eq_10 = ValueUtil.createInvalidValue(e);
												}
												//
												if (CAUGHT_eq_10 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
													exists_3 = ValueUtil.TRUE_VALUE;
													break; // Stop immediately
												} else if (CAUGHT_eq_10 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
													; // Carry on
												} else if (CAUGHT_eq_10 instanceof InvalidValueException) { // Abnormal exception evaluation result
													accumulator_3 = CAUGHT_eq_10; // Cache an exception failure
												} else { // Impossible badly typed result
													accumulator_3 = new InvalidValueException(
															PivotMessages.NonBooleanBody, "exists");
												}
											}
											CAUGHT_exists_3 = exists_3;
										} catch (Exception e) {
											CAUGHT_exists_3 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_exists_3 == ValueUtil.TRUE_VALUE) {
											or_1 = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_eq_9 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_9;
											}
											if (CAUGHT_exists_3 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_exists_3;
											}
											if (CAUGHT_exists_3 == null) {
												or_1 = null;
											} else {
												or_1 = ValueUtil.FALSE_VALUE;
											}
										}
									}
									CAUGHT_or_1 = or_1;
								} catch (Exception e) {
									CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_or_1 == ValueUtil.FALSE_VALUE) {
									and_4 = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_and_3 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_3;
									}
									if (CAUGHT_or_1 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_or_1;
									}
									if ((CAUGHT_and_3 == null) || (CAUGHT_or_1 == null)) {
										and_4 = null;
									} else {
										and_4 = ValueUtil.TRUE_VALUE;
									}
								}
							}
							local_0 = and_4;
						}
						status = local_0;
					}
					final /*@Thrown*/ boolean eq_11 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_11) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art6, status);
						local_2 = local_1;
					}
					CAUGHT_local_2 = local_2;
				} catch (Exception e) {
					CAUGHT_local_2 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_2, PrivacyModelTables.INT_0)
						.booleanValue();
				local_3 = logDiagnostic;
			}
			return local_3;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ExpiredConsent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::ExpiredConsent";
		try {
			/**
			 *
			 * inv ExpiredConsent:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if self.whose = null or
			 *             self.what.actions->exists(act | act = Action::Collecting or act = Action::StopProcessing)
			 *           then true
			 *           else
			 *             let
			 *               privacyPolicy : PrivacyPolicy[1] = PrivacyPolicy.allInstances()
			 *               ->asSequence()
			 *               ->first()
			 *             in
			 *               self.what.datas->forAll(data |
			 *                 let
			 *                   statements : OrderedSet(privacyModel::PolicyStatement) = privacyPolicy.policyStatements->select(st |
			 *                     not (st.whose = null
			 *                     ) and st.whose = self.whose and
			 *                     self.who.equals(st.who) and
			 *                     st.what.actions->exists(act | act = Action::Collecting) and
			 *                     st.what.datas->exists(d | d = data))
			 *                 in
			 *                   if statements->isEmpty()
			 *                   then true
			 *                   else
			 *                     statements->exists(st |
			 *                       if
			 *                         privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)
			 *                       then
			 *                         if self.why = null or
			 *                           let
			 *                             reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject
			 *                             }
			 *                           in
			 *                             reasons->includes(self.why.processingReason) or
			 *                             self.why.subPurposes->exists(subpurpose |
			 *                               reasons->includes(subpurpose))
			 *                         then true
			 *                         else
			 *                           not privacyPolicy.privacyPolicyHelper.isDateAfterInterval(self.when, st.how.consent.startDate) and
			 *                           (st.how.consent.terminationDate = null or
			 *                             not privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, st.how.consent.terminationDate)
			 *                           )
			 *                         endif
			 *                       else false
			 *                       endif)
			 *                   endif)
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art6', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___EXPIRED_CONSENT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_5;
			if (le) {
				local_5 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_4;
				try {
					final /*@NonInvalid*/ Principal whose = this.getWhose();
					final /*@NonInvalid*/ boolean eq = whose == null;
					final /*@Thrown*/ Boolean or_0;
					if (eq) {
						or_0 = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_exists;
						try {
							final /*@NonInvalid*/ What what = this.getWhat();
							final /*@NonInvalid*/ List<Action> actions = what.getActions();
							final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
									.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_act = BOXED_actions.iterator();
							/*@Thrown*/ Boolean exists;
							while (true) {
								if (!ITERATOR_act.hasNext()) {
									if (accumulator == null) {
										exists = null;
									} else if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ EnumerationLiteralId act = (EnumerationLiteralId) ITERATOR_act.next();
								/**
								 * act = Action::Collecting or act = Action::StopProcessing
								 */
								final /*@NonInvalid*/ boolean eq_0 = act == PrivacyModelTables.ELITid_Collecting;
								final /*@NonInvalid*/ Boolean or;
								if (eq_0) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_1 = act == PrivacyModelTables.ELITid_StopProcessing;
									if (eq_1) {
										or = ValueUtil.TRUE_VALUE;
									} else {
										or = ValueUtil.FALSE_VALUE;
									}
								}
								//
								if (or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else if (or == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.FALSE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							CAUGHT_exists = exists;
						} catch (Exception e) {
							CAUGHT_exists = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
							or_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_exists instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_exists;
							}
							if (CAUGHT_exists == null) {
								or_0 = null;
							} else {
								or_0 = ValueUtil.FALSE_VALUE;
							}
						}
					}
					if (or_0 == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (or_0) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_privacyPolicy;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
									.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
							final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
									.evaluate(executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
											TYP_privacyModel_c_c_PrivacyPolicy_0);
							final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
									.evaluate(allInstances);
							final /*@Thrown*/ PrivacyPolicy privacyPolicy = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
									.evaluate(asSequence);
							CAUGHT_privacyPolicy = privacyPolicy;
						} catch (Exception e) {
							CAUGHT_privacyPolicy = ValueUtil.createInvalidValue(e);
						}
						final /*@NonInvalid*/ What what_0 = this.getWhat();
						final /*@NonInvalid*/ List<SharedPrivacyData> datas = what_0.getDatas();
						final /*@NonInvalid*/ OrderedSetValue BOXED_datas = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_SharedPrivacyData, datas);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_data = BOXED_datas.iterator();
						/*@Thrown*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_data.hasNext()) {
								if (accumulator_0 == null) {
									forAll = null;
								} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ SharedPrivacyData data = (SharedPrivacyData) ITERATOR_data.next();
							/**
							 *
							 * let
							 *   statements : OrderedSet(privacyModel::PolicyStatement) = privacyPolicy.policyStatements->select(st |
							 *     not (st.whose = null
							 *     ) and st.whose = self.whose and
							 *     self.who.equals(st.who) and
							 *     st.what.actions->exists(act | act = Action::Collecting) and
							 *     st.what.datas->exists(d | d = data))
							 * in
							 *   if statements->isEmpty()
							 *   then true
							 *   else
							 *     statements->exists(st |
							 *       if
							 *         privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)
							 *       then
							 *         if self.why = null or
							 *           let
							 *             reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject
							 *             }
							 *           in
							 *             reasons->includes(self.why.processingReason) or
							 *             self.why.subPurposes->exists(subpurpose |
							 *               reasons->includes(subpurpose))
							 *         then true
							 *         else
							 *           not privacyPolicy.privacyPolicyHelper.isDateAfterInterval(self.when, st.how.consent.startDate) and
							 *           (st.how.consent.terminationDate = null or
							 *             not privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, st.how.consent.terminationDate)
							 *           )
							 *         endif
							 *       else false
							 *       endif)
							 *   endif
							 */
							/*@Caught*/ Object CAUGHT_local_2;
							try {
								if (CAUGHT_privacyPolicy == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::PrivacyPolicy::policyStatements\'");
								}
								if (CAUGHT_privacyPolicy instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_privacyPolicy;
								}
								final /*@Thrown*/ List<PolicyStatement> policyStatements = ((PrivacyPolicy) CAUGHT_privacyPolicy)
										.getPolicyStatements();
								final /*@Thrown*/ OrderedSetValue BOXED_policyStatements = idResolver
										.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_PolicyStatement,
												policyStatements);
								/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createOrderedSetAccumulatorValue(
										PrivacyModelTables.ORD_CLSSid_PolicyStatement);
								Iterator<Object> ITERATOR_st = BOXED_policyStatements.iterator();
								/*@Thrown*/ OrderedSetValue statements;
								while (true) {
									if (!ITERATOR_st.hasNext()) {
										statements = accumulator_1;
										break;
									}
									/*@NonInvalid*/ PolicyStatement st = (PolicyStatement) ITERATOR_st.next();
									/**
									 *
									 * not (st.whose = null
									 * ) and st.whose = self.whose and
									 * self.who.equals(st.who) and
									 * st.what.actions->exists(act | act = Action::Collecting) and
									 * st.what.datas->exists(d | d = data)
									 */
									final /*@NonInvalid*/ What what_2 = st.getWhat();
									/*@Caught*/ Object CAUGHT_and_1;
									try {
										/*@Caught*/ Object CAUGHT_and_0;
										try {
											/*@Caught*/ Object CAUGHT_and;
											try {
												final /*@NonInvalid*/ Principal whose_1 = st.getWhose();
												final /*@NonInvalid*/ boolean eq_2 = whose_1 == null;
												final /*@NonInvalid*/ Boolean not;
												if (!eq_2) {
													not = ValueUtil.TRUE_VALUE;
												} else {
													if (eq_2) {
														not = ValueUtil.FALSE_VALUE;
													} else {
														not = null;
													}
												}
												final /*@Thrown*/ Boolean and;
												if (not == ValueUtil.FALSE_VALUE) {
													and = ValueUtil.FALSE_VALUE;
												} else {
													final /*@NonInvalid*/ boolean eq_3 = (whose_1 != null)
															? whose_1.equals(whose)
															: (whose == null);
													if (!eq_3) {
														and = ValueUtil.FALSE_VALUE;
													} else {
														if (not == null) {
															and = null;
														} else {
															and = ValueUtil.TRUE_VALUE;
														}
													}
												}
												CAUGHT_and = and;
											} catch (Exception e) {
												CAUGHT_and = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean and_0;
											if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
												and_0 = ValueUtil.FALSE_VALUE;
											} else {
												final /*@NonInvalid*/ Principal who = this.getWho();
												final /*@NonInvalid*/ Principal who_0 = st.getWho();
												final /*@NonInvalid*/ boolean equals = who.equals(who_0);
												if (!equals) {
													and_0 = ValueUtil.FALSE_VALUE;
												} else {
													if (CAUGHT_and instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_and;
													}
													if (CAUGHT_and == null) {
														and_0 = null;
													} else {
														and_0 = ValueUtil.TRUE_VALUE;
													}
												}
											}
											CAUGHT_and_0 = and_0;
										} catch (Exception e) {
											CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean and_1;
										if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
											and_1 = ValueUtil.FALSE_VALUE;
										} else {
											final /*@NonInvalid*/ List<Action> actions_0 = what_2.getActions();
											final /*@NonInvalid*/ OrderedSetValue BOXED_actions_0 = idResolver
													.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action,
															actions_0);
											/*@Thrown*/ Object accumulator_2 = ValueUtil.FALSE_VALUE;
											Iterator<Object> ITERATOR_act_0 = BOXED_actions_0.iterator();
											/*@NonInvalid*/ Boolean exists_0;
											while (true) {
												if (!ITERATOR_act_0.hasNext()) {
													if (accumulator_2 == ValueUtil.FALSE_VALUE) {
														exists_0 = ValueUtil.FALSE_VALUE;
													} else {
														throw (InvalidValueException) accumulator_2;
													}
													break;
												}
												/*@NonInvalid*/ EnumerationLiteralId act_0 = (EnumerationLiteralId) ITERATOR_act_0
														.next();
												/**
												 * act = Action::Collecting
												 */
												final /*@NonInvalid*/ boolean eq_4 = act_0 == PrivacyModelTables.ELITid_Collecting;
												//
												if (eq_4) { // Normal successful body evaluation result
													exists_0 = ValueUtil.TRUE_VALUE;
													break; // Stop immediately
												} else if (!eq_4) { // Normal unsuccessful body evaluation result
													; // Carry on
												} else { // Impossible badly typed result
													accumulator_2 = new InvalidValueException(
															PivotMessages.NonBooleanBody, "exists");
												}
											}
											if (exists_0 == ValueUtil.FALSE_VALUE) {
												and_1 = ValueUtil.FALSE_VALUE;
											} else {
												if (CAUGHT_and_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_and_0;
												}
												if ((CAUGHT_and_0 == null) || (exists_0 == null)) {
													and_1 = null;
												} else {
													and_1 = ValueUtil.TRUE_VALUE;
												}
											}
										}
										CAUGHT_and_1 = and_1;
									} catch (Exception e) {
										CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean and_2;
									if (CAUGHT_and_1 == ValueUtil.FALSE_VALUE) {
										and_2 = ValueUtil.FALSE_VALUE;
									} else {
										final /*@NonInvalid*/ List<SharedPrivacyData> datas_0 = what_2.getDatas();
										final /*@NonInvalid*/ OrderedSetValue BOXED_datas_0 = idResolver
												.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_SharedPrivacyData,
														datas_0);
										/*@Thrown*/ Object accumulator_3 = ValueUtil.FALSE_VALUE;
										Iterator<Object> ITERATOR_d = BOXED_datas_0.iterator();
										/*@NonInvalid*/ Boolean exists_1;
										while (true) {
											if (!ITERATOR_d.hasNext()) {
												if (accumulator_3 == ValueUtil.FALSE_VALUE) {
													exists_1 = ValueUtil.FALSE_VALUE;
												} else {
													throw (InvalidValueException) accumulator_3;
												}
												break;
											}
											/*@NonInvalid*/ SharedPrivacyData d = (SharedPrivacyData) ITERATOR_d.next();
											/**
											 * d = data
											 */
											final /*@NonInvalid*/ boolean eq_5 = d.equals(data);
											//
											if (eq_5) { // Normal successful body evaluation result
												exists_1 = ValueUtil.TRUE_VALUE;
												break; // Stop immediately
											} else if (!eq_5) { // Normal unsuccessful body evaluation result
												; // Carry on
											} else { // Impossible badly typed result
												accumulator_3 = new InvalidValueException(PivotMessages.NonBooleanBody,
														"exists");
											}
										}
										if (exists_1 == ValueUtil.FALSE_VALUE) {
											and_2 = ValueUtil.FALSE_VALUE;
										} else {
											if (CAUGHT_and_1 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_and_1;
											}
											if ((CAUGHT_and_1 == null) || (exists_1 == null)) {
												and_2 = null;
											} else {
												and_2 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									if (and_2 == null) {
										throw new InvalidValueException(
												"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
									}
									//
									if (and_2 == ValueUtil.TRUE_VALUE) {
										accumulator_1.add(st);
									}
								}
								final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
										.evaluate(statements).booleanValue();
								/*@Thrown*/ Boolean local_2;
								if (isEmpty) {
									local_2 = ValueUtil.TRUE_VALUE;
								} else {
									/*@Thrown*/ Object accumulator_4 = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_st_0 = statements.iterator();
									/*@Thrown*/ Boolean exists_2;
									while (true) {
										if (!ITERATOR_st_0.hasNext()) {
											if (accumulator_4 == null) {
												exists_2 = null;
											} else if (accumulator_4 == ValueUtil.FALSE_VALUE) {
												exists_2 = ValueUtil.FALSE_VALUE;
											} else {
												throw (InvalidValueException) accumulator_4;
											}
											break;
										}
										/*@NonInvalid*/ PolicyStatement st_0 = (PolicyStatement) ITERATOR_st_0.next();
										/**
										 *
										 * if
										 *   privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)
										 * then
										 *   if self.why = null or
										 *     let
										 *       reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject
										 *       }
										 *     in
										 *       reasons->includes(self.why.processingReason) or
										 *       self.why.subPurposes->exists(subpurpose |
										 *         reasons->includes(subpurpose))
										 *   then true
										 *   else
										 *     not privacyPolicy.privacyPolicyHelper.isDateAfterInterval(self.when, st.how.consent.startDate) and
										 *     (st.how.consent.terminationDate = null or
										 *       not privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, st.how.consent.terminationDate)
										 *     )
										 *   endif
										 * else false
										 * endif
										 */
										/*@Caught*/ Object CAUGHT_local_1;
										try {
											final /*@NonInvalid*/ AbstractTime when = this.getWhen();
											final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper = ((PrivacyPolicy) CAUGHT_privacyPolicy)
													.getPrivacyPolicyHelper();
											final /*@NonInvalid*/ AbstractTime when_0 = st_0.getWhen();
											final /*@Thrown*/ boolean areIntervalsOverlap = privacyPolicyHelper
													.areIntervalsOverlap(when, when_0);
											/*@Thrown*/ Boolean local_1;
											if (areIntervalsOverlap) {
												final /*@Thrown*/ Boolean or_2;
												/*@Caught*/ Object CAUGHT_or_1;
												try {
													final /*@NonInvalid*/ Purpose why_0 = this.getWhy();
													final /*@NonInvalid*/ ProcessingReason processingReason = why_0
															.getProcessingReason();
													final /*@NonInvalid*/ EnumerationLiteralId BOXED_processingReason = PrivacyModelTables.ENUMid_ProcessingReason
															.getEnumerationLiteralId(
																	ClassUtil.nonNullState(processingReason.getName()));
													final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
															.evaluate(PrivacyModelTables.reasons_1,
																	BOXED_processingReason)
															.booleanValue();
													final /*@Thrown*/ Boolean or_1;
													if (includes) {
														or_1 = ValueUtil.TRUE_VALUE;
													} else {
														final /*@NonInvalid*/ List<Purpose> subPurposes = why_0
																.getSubPurposes();
														final /*@NonInvalid*/ OrderedSetValue BOXED_subPurposes = idResolver
																.createOrderedSetOfAll(
																		PrivacyModelTables.ORD_CLSSid_Purpose,
																		subPurposes);
														/*@Thrown*/ Object accumulator_5 = ValueUtil.FALSE_VALUE;
														Iterator<Object> ITERATOR_subpurpose = BOXED_subPurposes
																.iterator();
														/*@NonInvalid*/ Boolean exists_3;
														while (true) {
															if (!ITERATOR_subpurpose.hasNext()) {
																if (accumulator_5 == ValueUtil.FALSE_VALUE) {
																	exists_3 = ValueUtil.FALSE_VALUE;
																} else {
																	throw (InvalidValueException) accumulator_5;
																}
																break;
															}
															/*@NonInvalid*/ Purpose subpurpose = (Purpose) ITERATOR_subpurpose
																	.next();
															/**
															 * reasons->includes(subpurpose)
															 */
															final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE
																	.evaluate(PrivacyModelTables.reasons_1, subpurpose)
																	.booleanValue();
															//
															if (includes_0) { // Normal successful body evaluation result
																exists_3 = ValueUtil.TRUE_VALUE;
																break; // Stop immediately
															} else if (!includes_0) { // Normal unsuccessful body evaluation result
																; // Carry on
															} else { // Impossible badly typed result
																accumulator_5 = new InvalidValueException(
																		PivotMessages.NonBooleanBody, "exists");
															}
														}
														if (exists_3 == ValueUtil.TRUE_VALUE) {
															or_1 = ValueUtil.TRUE_VALUE;
														} else {
															if (exists_3 == null) {
																or_1 = null;
															} else {
																or_1 = ValueUtil.FALSE_VALUE;
															}
														}
													}
													CAUGHT_or_1 = or_1;
												} catch (Exception e) {
													CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_or_1 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_or_1;
												}
												or_2 = (Boolean) CAUGHT_or_1;
												if (or_2 == null) {
													throw new InvalidValueException("Null if condition");
												}
												/*@Thrown*/ Boolean local_0;
												if (or_2) {
													local_0 = ValueUtil.TRUE_VALUE;
												} else {
													/*@Caught*/ Object CAUGHT_not_0;
													try {
														/*@Caught*/ Object CAUGHT_isDateAfterInterval;
														try {
															final /*@NonInvalid*/ How how = st_0.getHow();
															if (how == null) {
																throw new InvalidValueException(
																		"Null source for \'\'http://privacymodel\'::How::consent\'");
															}
															final /*@Thrown*/ Consent consent = how.getConsent();
															if (consent == null) {
																throw new InvalidValueException(
																		"Null source for \'\'http://privacymodel\'::AbstractPaper::startDate\'");
															}
															final /*@Thrown*/ Date startDate = consent.getStartDate();
															final /*@Thrown*/ boolean isDateAfterInterval = privacyPolicyHelper
																	.isDateAfterInterval(when, startDate);
															CAUGHT_isDateAfterInterval = isDateAfterInterval;
														} catch (Exception e) {
															CAUGHT_isDateAfterInterval = ValueUtil
																	.createInvalidValue(e);
														}
														if (CAUGHT_isDateAfterInterval instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_isDateAfterInterval;
														}
														final /*@Thrown*/ Boolean not_0;
														if (CAUGHT_isDateAfterInterval == ValueUtil.FALSE_VALUE) {
															not_0 = ValueUtil.TRUE_VALUE;
														} else {
															if (CAUGHT_isDateAfterInterval == ValueUtil.TRUE_VALUE) {
																not_0 = ValueUtil.FALSE_VALUE;
															} else {
																not_0 = null;
															}
														}
														CAUGHT_not_0 = not_0;
													} catch (Exception e) {
														CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
													}
													final /*@Thrown*/ Boolean and_3;
													if (CAUGHT_not_0 == ValueUtil.FALSE_VALUE) {
														and_3 = ValueUtil.FALSE_VALUE;
													} else {
														/*@Caught*/ Object CAUGHT_or_3;
														try {
															/*@Caught*/ Object CAUGHT_eq_6;
															try {
																final /*@NonInvalid*/ How how_0 = st_0.getHow();
																if (how_0 == null) {
																	throw new InvalidValueException(
																			"Null source for \'\'http://privacymodel\'::How::consent\'");
																}
																final /*@Thrown*/ Consent consent_0 = how_0
																		.getConsent();
																if (consent_0 == null) {
																	throw new InvalidValueException(
																			"Null source for \'\'http://privacymodel\'::AbstractPaper::terminationDate\'");
																}
																final /*@Thrown*/ Date terminationDate = consent_0
																		.getTerminationDate();
																final /*@Thrown*/ boolean eq_6 = terminationDate == null;
																CAUGHT_eq_6 = eq_6;
															} catch (Exception e) {
																CAUGHT_eq_6 = ValueUtil.createInvalidValue(e);
															}
															final /*@Thrown*/ Boolean or_3;
															if (CAUGHT_eq_6 == ValueUtil.TRUE_VALUE) {
																or_3 = ValueUtil.TRUE_VALUE;
															} else {
																/*@Caught*/ Object CAUGHT_not_1;
																try {
																	/*@Caught*/ Object CAUGHT_isDateBeforeInterval;
																	try {
																		final /*@NonInvalid*/ How how_1 = st_0.getHow();
																		if (how_1 == null) {
																			throw new InvalidValueException(
																					"Null source for \'\'http://privacymodel\'::How::consent\'");
																		}
																		final /*@Thrown*/ Consent consent_1 = how_1
																				.getConsent();
																		if (consent_1 == null) {
																			throw new InvalidValueException(
																					"Null source for \'\'http://privacymodel\'::AbstractPaper::terminationDate\'");
																		}
																		final /*@Thrown*/ Date terminationDate_0 = consent_1
																				.getTerminationDate();
																		final /*@Thrown*/ boolean isDateBeforeInterval = privacyPolicyHelper
																				.isDateBeforeInterval(when,
																						terminationDate_0);
																		CAUGHT_isDateBeforeInterval = isDateBeforeInterval;
																	} catch (Exception e) {
																		CAUGHT_isDateBeforeInterval = ValueUtil
																				.createInvalidValue(e);
																	}
																	if (CAUGHT_isDateBeforeInterval instanceof InvalidValueException) {
																		throw (InvalidValueException) CAUGHT_isDateBeforeInterval;
																	}
																	final /*@Thrown*/ Boolean not_1;
																	if (CAUGHT_isDateBeforeInterval == ValueUtil.FALSE_VALUE) {
																		not_1 = ValueUtil.TRUE_VALUE;
																	} else {
																		if (CAUGHT_isDateBeforeInterval == ValueUtil.TRUE_VALUE) {
																			not_1 = ValueUtil.FALSE_VALUE;
																		} else {
																			not_1 = null;
																		}
																	}
																	CAUGHT_not_1 = not_1;
																} catch (Exception e) {
																	CAUGHT_not_1 = ValueUtil.createInvalidValue(e);
																}
																if (CAUGHT_not_1 == ValueUtil.TRUE_VALUE) {
																	or_3 = ValueUtil.TRUE_VALUE;
																} else {
																	if (CAUGHT_eq_6 instanceof InvalidValueException) {
																		throw (InvalidValueException) CAUGHT_eq_6;
																	}
																	if (CAUGHT_not_1 instanceof InvalidValueException) {
																		throw (InvalidValueException) CAUGHT_not_1;
																	}
																	if (CAUGHT_not_1 == null) {
																		or_3 = null;
																	} else {
																		or_3 = ValueUtil.FALSE_VALUE;
																	}
																}
															}
															CAUGHT_or_3 = or_3;
														} catch (Exception e) {
															CAUGHT_or_3 = ValueUtil.createInvalidValue(e);
														}
														if (CAUGHT_or_3 == ValueUtil.FALSE_VALUE) {
															and_3 = ValueUtil.FALSE_VALUE;
														} else {
															if (CAUGHT_not_0 instanceof InvalidValueException) {
																throw (InvalidValueException) CAUGHT_not_0;
															}
															if (CAUGHT_or_3 instanceof InvalidValueException) {
																throw (InvalidValueException) CAUGHT_or_3;
															}
															if ((CAUGHT_not_0 == null) || (CAUGHT_or_3 == null)) {
																and_3 = null;
															} else {
																and_3 = ValueUtil.TRUE_VALUE;
															}
														}
													}
													local_0 = and_3;
												}
												local_1 = local_0;
											} else {
												local_1 = ValueUtil.FALSE_VALUE;
											}
											CAUGHT_local_1 = local_1;
										} catch (Exception e) {
											CAUGHT_local_1 = ValueUtil.createInvalidValue(e);
										}
										//
										if (CAUGHT_local_1 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
											exists_2 = ValueUtil.TRUE_VALUE;
											break; // Stop immediately
										} else if (CAUGHT_local_1 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
											; // Carry on
										} else if (CAUGHT_local_1 == null) { // Abnormal null body evaluation result
											if (accumulator_4 == ValueUtil.FALSE_VALUE) {
												accumulator_4 = null; // Cache a null failure
											}
										} else if (CAUGHT_local_1 instanceof InvalidValueException) { // Abnormal exception evaluation result
											accumulator_4 = CAUGHT_local_1; // Cache an exception failure
										} else { // Impossible badly typed result
											accumulator_4 = new InvalidValueException(PivotMessages.NonBooleanBody,
													"exists");
										}
									}
									local_2 = exists_2;
								}
								CAUGHT_local_2 = local_2;
							} catch (Exception e) {
								CAUGHT_local_2 = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_local_2 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_local_2 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								; // Carry on
							} else if (CAUGHT_local_2 == null) { // Abnormal null body evaluation result
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									accumulator_0 = null; // Cache a null failure
								}
							} else if (CAUGHT_local_2 instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator_0 = CAUGHT_local_2; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						status = forAll;
					}
					final /*@Thrown*/ boolean eq_7 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_4;
					if (eq_7) {
						local_4 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_3 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art6, status);
						local_4 = local_3;
					}
					CAUGHT_local_4 = local_4;
				} catch (Exception e) {
					CAUGHT_local_4 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_4, PrivacyModelTables.INT_0)
						.booleanValue();
				local_5 = logDiagnostic;
			}
			return local_5;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean StopProcessingPurposeForActionStopProcessing(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::StopProcessingPurposeForActionStopProcessing";
		try {
			/**
			 *
			 * inv StopProcessingPurposeForActionStopProcessing:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = if
			 *           not self.what.actions->exists(act | (act = Action::StopProcessing))
			 *         then true
			 *         else self.why.processingReason = ProcessingReason::StopProcessing
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ What what = this.getWhat();
				final /*@NonInvalid*/ List<Action> actions = what.getActions();
				final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
						.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_act = BOXED_actions.iterator();
				/*@NonInvalid*/ Boolean exists;
				while (true) {
					if (!ITERATOR_act.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							exists = ValueUtil.FALSE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ EnumerationLiteralId act = (EnumerationLiteralId) ITERATOR_act.next();
					/**
					 * act = Action::StopProcessing
					 */
					final /*@NonInvalid*/ boolean eq = act == PrivacyModelTables.ELITid_StopProcessing;
					//
					if (eq) { // Normal successful body evaluation result
						exists = ValueUtil.TRUE_VALUE;
						break; // Stop immediately
					} else if (!eq) { // Normal unsuccessful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				final /*@Thrown*/ Boolean not;
				if (exists == ValueUtil.FALSE_VALUE) {
					not = ValueUtil.TRUE_VALUE;
				} else {
					if (exists == ValueUtil.TRUE_VALUE) {
						not = ValueUtil.FALSE_VALUE;
					} else {
						not = null;
					}
				}
				if (not == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@NonInvalid*/ boolean result;
				if (not) {
					result = true;
				} else {
					final /*@NonInvalid*/ Purpose why = this.getWhy();
					final /*@NonInvalid*/ ProcessingReason processingReason = why.getProcessingReason();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_processingReason = PrivacyModelTables.ENUMid_ProcessingReason
							.getEnumerationLiteralId(ClassUtil.nonNullState(processingReason.getName()));
					final /*@NonInvalid*/ boolean eq_0 = BOXED_processingReason == PrivacyModelTables.ELITid_StopProcessing_0;
					result = eq_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, PrivacyModelTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProcessingOfSpecialCategories(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::ProcessingOfSpecialCategories";
		try {
			/**
			 *
			 * inv ProcessingOfSpecialCategories:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             self.what.actions->exists(action | action = Action::StopProcessing)
			 *           then true
			 *           else
			 *             self.what.datas->forAll(data |
			 *               let
			 *                 dataTypes : Sequence(privacyModel::DataType) = Sequence{DataType::Biometric, DataType::Genetic, DataType::PoliticalOpinion, DataType::RacialOrEthnicOrigin, DataType::SexLife, DataType::Religious, DataType::Judicial
			 *                 }
			 *               in
			 *                 if
			 *                   dataTypes->includes(data.privacydata.type)
			 *                 then
			 *                   not (self.how = null
			 *                   ) and
			 *                   not (self.how.consent = null
			 *                   ) or
			 *                   not (self.why = null
			 *                   ) and
			 *                   let
			 *                     reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::Research, ProcessingReason::PublicHealth
			 *                     }
			 *                   in
			 *                     (
			 *                       reasons->includes(self.why.processingReason) or
			 *                       not (self.why.subPurposes = null
			 *                       ) and
			 *                       self.why.subPurposes->exists(subpurpose |
			 *                         reasons->includes(subpurpose))
			 *                     )
			 *                 else true
			 *                 endif)
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art9', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___PROCESSING_OF_SPECIAL_CATEGORIES__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					final /*@NonInvalid*/ What what_0 = this.getWhat();
					final /*@NonInvalid*/ List<Action> actions = what_0.getActions();
					final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_action.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action.next();
						/**
						 * action = Action::StopProcessing
						 */
						final /*@NonInvalid*/ boolean eq = action == PrivacyModelTables.ELITid_StopProcessing;
						//
						if (eq) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!eq) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					if (exists == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (exists) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ List<SharedPrivacyData> datas = what_0.getDatas();
						final /*@NonInvalid*/ OrderedSetValue BOXED_datas = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_SharedPrivacyData, datas);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_data = BOXED_datas.iterator();
						/*@Thrown*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_data.hasNext()) {
								if (accumulator_0 == null) {
									forAll = null;
								} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ SharedPrivacyData data = (SharedPrivacyData) ITERATOR_data.next();
							/**
							 *
							 * let
							 *   dataTypes : Sequence(privacyModel::DataType) = Sequence{DataType::Biometric, DataType::Genetic, DataType::PoliticalOpinion, DataType::RacialOrEthnicOrigin, DataType::SexLife, DataType::Religious, DataType::Judicial
							 *   }
							 * in
							 *   if dataTypes->includes(data.privacydata.type)
							 *   then
							 *     not (self.how = null
							 *     ) and
							 *     not (self.how.consent = null
							 *     ) or
							 *     not (self.why = null
							 *     ) and
							 *     let
							 *       reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::Research, ProcessingReason::PublicHealth
							 *       }
							 *     in
							 *       (
							 *         reasons->includes(self.why.processingReason) or
							 *         not (self.why.subPurposes = null
							 *         ) and
							 *         self.why.subPurposes->exists(subpurpose |
							 *           reasons->includes(subpurpose))
							 *       )
							 *   else true
							 *   endif
							 */
							/*@Caught*/ Object CAUGHT_local_0;
							try {
								final /*@NonInvalid*/ PrivacyData privacydata = data.getPrivacydata();
								final /*@NonInvalid*/ DataType type = privacydata.getType();
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_DataType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
								final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
										.evaluate(PrivacyModelTables.dataTypes, BOXED_type).booleanValue();
								/*@Thrown*/ Boolean local_0;
								if (includes) {
									/*@Caught*/ Object CAUGHT_and;
									try {
										final /*@NonInvalid*/ How how = this.getHow();
										final /*@NonInvalid*/ boolean eq_0 = how == null;
										final /*@NonInvalid*/ Boolean not;
										if (!eq_0) {
											not = ValueUtil.TRUE_VALUE;
										} else {
											if (eq_0) {
												not = ValueUtil.FALSE_VALUE;
											} else {
												not = null;
											}
										}
										final /*@Thrown*/ Boolean and;
										if (not == ValueUtil.FALSE_VALUE) {
											and = ValueUtil.FALSE_VALUE;
										} else {
											/*@Caught*/ Object CAUGHT_not_0;
											try {
												/*@Caught*/ Object CAUGHT_eq_1;
												try {
													if (how == null) {
														throw new InvalidValueException(
																"Null source for \'\'http://privacymodel\'::How::consent\'");
													}
													final /*@Thrown*/ Consent consent = how.getConsent();
													final /*@Thrown*/ boolean eq_1 = consent == null;
													CAUGHT_eq_1 = eq_1;
												} catch (Exception e) {
													CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_eq_1 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_eq_1;
												}
												final /*@Thrown*/ Boolean not_0;
												if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
													not_0 = ValueUtil.TRUE_VALUE;
												} else {
													if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
														not_0 = ValueUtil.FALSE_VALUE;
													} else {
														not_0 = null;
													}
												}
												CAUGHT_not_0 = not_0;
											} catch (Exception e) {
												CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_not_0 == ValueUtil.FALSE_VALUE) {
												and = ValueUtil.FALSE_VALUE;
											} else {
												if (CAUGHT_not_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_not_0;
												}
												if ((not == null) || (CAUGHT_not_0 == null)) {
													and = null;
												} else {
													and = ValueUtil.TRUE_VALUE;
												}
											}
										}
										CAUGHT_and = and;
									} catch (Exception e) {
										CAUGHT_and = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean or_0;
									if (CAUGHT_and == ValueUtil.TRUE_VALUE) {
										or_0 = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_and_1;
										try {
											final /*@NonInvalid*/ Boolean not_1 = ValueUtil.TRUE_VALUE;
											final /*@Thrown*/ Boolean and_1;
											if (not_1 == ValueUtil.FALSE_VALUE) {
												and_1 = ValueUtil.FALSE_VALUE;
											} else {
												/*@Caught*/ Object CAUGHT_or;
												try {
													final /*@NonInvalid*/ Purpose why = this.getWhy();
													final /*@NonInvalid*/ ProcessingReason processingReason = why
															.getProcessingReason();
													final /*@NonInvalid*/ EnumerationLiteralId BOXED_processingReason = PrivacyModelTables.ENUMid_ProcessingReason
															.getEnumerationLiteralId(
																	ClassUtil.nonNullState(processingReason.getName()));
													final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE
															.evaluate(PrivacyModelTables.reasons_3,
																	BOXED_processingReason)
															.booleanValue();
													final /*@Thrown*/ Boolean or;
													if (includes_0) {
														or = ValueUtil.TRUE_VALUE;
													} else {
														/*@Caught*/ Object CAUGHT_and_0;
														try {
															final /*@Thrown*/ Boolean and_0;
															if (not_1 == ValueUtil.FALSE_VALUE) {
																and_0 = ValueUtil.FALSE_VALUE;
															} else {
																final /*@NonInvalid*/ List<Purpose> subPurposes = why
																		.getSubPurposes();
																final /*@NonInvalid*/ OrderedSetValue BOXED_subPurposes = idResolver
																		.createOrderedSetOfAll(
																				PrivacyModelTables.ORD_CLSSid_Purpose,
																				subPurposes);
																/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
																Iterator<Object> ITERATOR_subpurpose = BOXED_subPurposes
																		.iterator();
																/*@NonInvalid*/ Boolean exists_0;
																while (true) {
																	if (!ITERATOR_subpurpose.hasNext()) {
																		if (accumulator_1 == ValueUtil.FALSE_VALUE) {
																			exists_0 = ValueUtil.FALSE_VALUE;
																		} else {
																			throw (InvalidValueException) accumulator_1;
																		}
																		break;
																	}
																	/*@NonInvalid*/ Purpose subpurpose = (Purpose) ITERATOR_subpurpose
																			.next();
																	/**
																	 * reasons->includes(subpurpose)
																	 */
																	final /*@NonInvalid*/ boolean includes_1 = CollectionIncludesOperation.INSTANCE
																			.evaluate(PrivacyModelTables.reasons_3,
																					subpurpose)
																			.booleanValue();
																	//
																	if (includes_1) { // Normal successful body evaluation result
																		exists_0 = ValueUtil.TRUE_VALUE;
																		break; // Stop immediately
																	} else if (!includes_1) { // Normal unsuccessful body evaluation result
																		; // Carry on
																	} else { // Impossible badly typed result
																		accumulator_1 = new InvalidValueException(
																				PivotMessages.NonBooleanBody, "exists");
																	}
																}
																if (exists_0 == ValueUtil.FALSE_VALUE) {
																	and_0 = ValueUtil.FALSE_VALUE;
																} else {
																	if ((not_1 == null) || (exists_0 == null)) {
																		and_0 = null;
																	} else {
																		and_0 = ValueUtil.TRUE_VALUE;
																	}
																}
															}
															CAUGHT_and_0 = and_0;
														} catch (Exception e) {
															CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
														}
														if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
															or = ValueUtil.TRUE_VALUE;
														} else {
															if (CAUGHT_and_0 instanceof InvalidValueException) {
																throw (InvalidValueException) CAUGHT_and_0;
															}
															if (CAUGHT_and_0 == null) {
																or = null;
															} else {
																or = ValueUtil.FALSE_VALUE;
															}
														}
													}
													CAUGHT_or = or;
												} catch (Exception e) {
													CAUGHT_or = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_or == ValueUtil.FALSE_VALUE) {
													and_1 = ValueUtil.FALSE_VALUE;
												} else {
													if (CAUGHT_or instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_or;
													}
													if ((not_1 == null) || (CAUGHT_or == null)) {
														and_1 = null;
													} else {
														and_1 = ValueUtil.TRUE_VALUE;
													}
												}
											}
											CAUGHT_and_1 = and_1;
										} catch (Exception e) {
											CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_and_1 == ValueUtil.TRUE_VALUE) {
											or_0 = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_and instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_and;
											}
											if (CAUGHT_and_1 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_and_1;
											}
											if ((CAUGHT_and == null) || (CAUGHT_and_1 == null)) {
												or_0 = null;
											} else {
												or_0 = ValueUtil.FALSE_VALUE;
											}
										}
									}
									local_0 = or_0;
								} else {
									local_0 = ValueUtil.TRUE_VALUE;
								}
								CAUGHT_local_0 = local_0;
							} catch (Exception e) {
								CAUGHT_local_0 = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_local_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_local_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								; // Carry on
							} else if (CAUGHT_local_0 == null) { // Abnormal null body evaluation result
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									accumulator_0 = null; // Cache a null failure
								}
							} else if (CAUGHT_local_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator_0 = CAUGHT_local_0; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						status = forAll;
					}
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_2) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art9, status);
						local_2 = local_1;
					}
					CAUGHT_local_2 = local_2;
				} catch (Exception e) {
					CAUGHT_local_2 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_2, PrivacyModelTables.INT_0)
						.booleanValue();
				local_3 = logDiagnostic;
			}
			return local_3;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutCollecting(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::SubjectShouldBeNotifiedAboutCollecting";
		try {
			/**
			 *
			 * inv SubjectShouldBeNotifiedAboutCollecting:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             self.what.actions->exists(action | action = Action::Collecting) and
			 *             self.what.datas->exists(data | data.collectedFromSubject = false)
			 *           then
			 *             if
			 *               not (self.why = null
			 *               ) and
			 *               (
			 *                 self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,
			 *                   Sequence{ProcessingReasonSubtype::None
			 *                   }) or
			 *                 self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Research,
			 *                   Sequence{ProcessingReasonSubtype::Statistical, ProcessingReasonSubtype::Historical, ProcessingReasonSubtype::Scientific
			 *                   })
			 *               )
			 *             then true
			 *             else
			 *               PrivacyPolicy.allInstances()
			 *               ->asSequence()
			 *               ->first()
			 *               .notifications->exists(notification | notification.type = NotificationType::DataCollecting and notification.causedBy = self)
			 *             endif
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art14', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					final /*@NonInvalid*/ What what_0 = this.getWhat();
					final /*@NonInvalid*/ List<Action> actions = what_0.getActions();
					final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_action.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action.next();
						/**
						 * action = Action::Collecting
						 */
						final /*@NonInvalid*/ boolean eq = action == PrivacyModelTables.ELITid_Collecting;
						//
						if (eq) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!eq) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					final /*@Thrown*/ Boolean and;
					if (exists == ValueUtil.FALSE_VALUE) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						final /*@NonInvalid*/ List<SharedPrivacyData> datas = what_0.getDatas();
						final /*@NonInvalid*/ OrderedSetValue BOXED_datas = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_SharedPrivacyData, datas);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_data = BOXED_datas.iterator();
						/*@NonInvalid*/ Boolean exists_0;
						while (true) {
							if (!ITERATOR_data.hasNext()) {
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists_0 = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ SharedPrivacyData data = (SharedPrivacyData) ITERATOR_data.next();
							/**
							 * data.collectedFromSubject = false
							 */
							final /*@NonInvalid*/ boolean collectedFromSubject = data.isCollectedFromSubject();
							final /*@NonInvalid*/ boolean eq_0 = !collectedFromSubject;
							//
							if (eq_0) { // Normal successful body evaluation result
								exists_0 = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!eq_0) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists_0 == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							if ((exists == null) || (exists_0 == null)) {
								and = null;
							} else {
								and = ValueUtil.TRUE_VALUE;
							}
						}
					}
					if (and == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (and) {
						final /*@NonInvalid*/ Purpose why_0 = this.getWhy();
						final /*@NonInvalid*/ Boolean not = ValueUtil.TRUE_VALUE;
						final /*@Thrown*/ Boolean and_0;
						if (not == ValueUtil.FALSE_VALUE) {
							and_0 = ValueUtil.FALSE_VALUE;
						} else {
							final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_PublicInterest = (ProcessingReason) idResolver
									.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_PublicInterest);
							final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence = ((IdResolverExtension) idResolver)
									.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_4);
							final /*@NonInvalid*/ boolean containsAllowedPurposeReasonAndSubreason = why_0
									.containsAllowedPurposeReasonAndSubreason(ECORE_ELITid_PublicInterest,
											(EList<ProcessingReasonSubtype>) ECORE_Sequence);
							final /*@NonInvalid*/ Boolean or;
							if (containsAllowedPurposeReasonAndSubreason) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_Research = (ProcessingReason) idResolver
										.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_Research);
								final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_0 = ((IdResolverExtension) idResolver)
										.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_0);
								final /*@NonInvalid*/ boolean containsAllowedPurposeReasonAndSubreason_0 = why_0
										.containsAllowedPurposeReasonAndSubreason(ECORE_ELITid_Research,
												(EList<ProcessingReasonSubtype>) ECORE_Sequence_0);
								if (containsAllowedPurposeReasonAndSubreason_0) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
							if (or == ValueUtil.FALSE_VALUE) {
								and_0 = ValueUtil.FALSE_VALUE;
							} else {
								if ((not == null) || (or == null)) {
									and_0 = null;
								} else {
									and_0 = ValueUtil.TRUE_VALUE;
								}
							}
						}
						if (and_0 == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@Thrown*/ Boolean local_0;
						if (and_0) {
							local_0 = ValueUtil.TRUE_VALUE;
						} else {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
									.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
							final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
									.evaluate(executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
											TYP_privacyModel_c_c_PrivacyPolicy_0);
							final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
									.evaluate(allInstances);
							final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
									.evaluate(asSequence);
							if (first == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::PrivacyPolicy::notifications\'");
							}
							final /*@Thrown*/ List<privacyModel.Notification> notifications = first.getNotifications();
							final /*@Thrown*/ OrderedSetValue BOXED_notifications = idResolver
									.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Notification, notifications);
							/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_notification = BOXED_notifications.iterator();
							/*@Thrown*/ Boolean exists_1;
							while (true) {
								if (!ITERATOR_notification.hasNext()) {
									if (accumulator_1 == null) {
										exists_1 = null;
									} else if (accumulator_1 == ValueUtil.FALSE_VALUE) {
										exists_1 = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator_1;
									}
									break;
								}
								/*@NonInvalid*/ privacyModel.Notification notification = (privacyModel.Notification) ITERATOR_notification
										.next();
								/**
								 * notification.type = NotificationType::DataCollecting and notification.causedBy = self
								 */
								final /*@NonInvalid*/ NotificationType type = notification.getType();
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_NotificationType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
								final /*@NonInvalid*/ boolean eq_1 = BOXED_type == PrivacyModelTables.ELITid_DataCollecting;
								final /*@NonInvalid*/ Boolean and_1;
								if (!eq_1) {
									and_1 = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ NotificationInfo causedBy = notification.getCausedBy();
									final /*@NonInvalid*/ boolean eq_2 = causedBy.equals(this);
									if (!eq_2) {
										and_1 = ValueUtil.FALSE_VALUE;
									} else {
										and_1 = ValueUtil.TRUE_VALUE;
									}
								}
								//
								if (and_1 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									exists_1 = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (and_1 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else if (and_1 == null) { // Abnormal null body evaluation result
									if (accumulator_1 == ValueUtil.FALSE_VALUE) {
										accumulator_1 = null; // Cache a null failure
									}
								} else { // Impossible badly typed result
									accumulator_1 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							local_0 = exists_1;
						}
						status = local_0;
					} else {
						status = ValueUtil.TRUE_VALUE;
					}
					final /*@Thrown*/ boolean eq_3 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_3) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art14, status);
						local_2 = local_1;
					}
					CAUGHT_local_2 = local_2;
				} catch (Exception e) {
					CAUGHT_local_2 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_2, PrivacyModelTables.INT_0)
						.booleanValue();
				local_3 = logDiagnostic;
			}
			return local_3;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ExpiredConsentForCollecting(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::ExpiredConsentForCollecting";
		try {
			/**
			 *
			 * inv ExpiredConsentForCollecting:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if self.whose = null or
			 *             not self.what.actions->exists(act | (act = Action::Collecting)) or self.how = null or self.how.consent = null
			 *           then true
			 *           else
			 *             let
			 *               privacyPolicy : PrivacyPolicy[1] = PrivacyPolicy.allInstances()
			 *               ->asSequence()
			 *               ->first()
			 *             in
			 *               if self.why = null or
			 *                 let
			 *                   reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject
			 *                   }
			 *                 in
			 *                   reasons->includes(self.why.processingReason) or
			 *                   self.why.subPurposes->exists(subpurpose |
			 *                     reasons->includes(subpurpose))
			 *               then true
			 *               else
			 *                 (
			 *                   privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, self.how.consent.startDate) or
			 *                   privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.startDate)
			 *                 ) and
			 *                 (self.how.consent.terminationDate = null or
			 *                   not privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, self.how.consent.terminationDate)
			 *                 )
			 *               endif
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art6', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___EXPIRED_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					/*@Caught*/ Object CAUGHT_or_0;
					try {
						/*@Caught*/ Object CAUGHT_or;
						try {
							final /*@NonInvalid*/ Principal whose = this.getWhose();
							final /*@NonInvalid*/ boolean eq = whose == null;
							final /*@Thrown*/ Boolean or;
							if (eq) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_not;
								try {
									final /*@NonInvalid*/ What what = this.getWhat();
									final /*@NonInvalid*/ List<Action> actions = what.getActions();
									final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
											.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
									/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_act = BOXED_actions.iterator();
									/*@NonInvalid*/ Boolean exists;
									while (true) {
										if (!ITERATOR_act.hasNext()) {
											if (accumulator == ValueUtil.FALSE_VALUE) {
												exists = ValueUtil.FALSE_VALUE;
											} else {
												throw (InvalidValueException) accumulator;
											}
											break;
										}
										/*@NonInvalid*/ EnumerationLiteralId act = (EnumerationLiteralId) ITERATOR_act
												.next();
										/**
										 * act = Action::Collecting
										 */
										final /*@NonInvalid*/ boolean eq_0 = act == PrivacyModelTables.ELITid_Collecting;
										//
										if (eq_0) { // Normal successful body evaluation result
											exists = ValueUtil.TRUE_VALUE;
											break; // Stop immediately
										} else if (!eq_0) { // Normal unsuccessful body evaluation result
											; // Carry on
										} else { // Impossible badly typed result
											accumulator = new InvalidValueException(PivotMessages.NonBooleanBody,
													"exists");
										}
									}
									final /*@Thrown*/ Boolean not;
									if (exists == ValueUtil.FALSE_VALUE) {
										not = ValueUtil.TRUE_VALUE;
									} else {
										if (exists == ValueUtil.TRUE_VALUE) {
											not = ValueUtil.FALSE_VALUE;
										} else {
											not = null;
										}
									}
									CAUGHT_not = not;
								} catch (Exception e) {
									CAUGHT_not = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_not instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_not;
									}
									if (CAUGHT_not == null) {
										or = null;
									} else {
										or = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or = or;
						} catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or_0;
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							or_0 = ValueUtil.TRUE_VALUE;
						} else {
							final /*@NonInvalid*/ How how = this.getHow();
							final /*@NonInvalid*/ boolean eq_1 = how == null;
							if (eq_1) {
								or_0 = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_or instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_or;
								}
								if (CAUGHT_or == null) {
									or_0 = null;
								} else {
									or_0 = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or_0 = or_0;
					} catch (Exception e) {
						CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean or_1;
					if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
						or_1 = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_eq_2;
						try {
							final /*@NonInvalid*/ How how_0 = this.getHow();
							if (how_0 == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::How::consent\'");
							}
							final /*@Thrown*/ Consent consent = how_0.getConsent();
							final /*@Thrown*/ boolean eq_2 = consent == null;
							CAUGHT_eq_2 = eq_2;
						} catch (Exception e) {
							CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
							or_1 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_or_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or_0;
							}
							if (CAUGHT_eq_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq_2;
							}
							if (CAUGHT_or_0 == null) {
								or_1 = null;
							} else {
								or_1 = ValueUtil.FALSE_VALUE;
							}
						}
					}
					if (or_1 == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (or_1) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_privacyPolicy;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
									.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
							final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
									.evaluate(executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
											TYP_privacyModel_c_c_PrivacyPolicy_0);
							final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
									.evaluate(allInstances);
							final /*@Thrown*/ PrivacyPolicy privacyPolicy = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
									.evaluate(asSequence);
							CAUGHT_privacyPolicy = privacyPolicy;
						} catch (Exception e) {
							CAUGHT_privacyPolicy = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or_3;
						/*@Caught*/ Object CAUGHT_or_2;
						try {
							final /*@NonInvalid*/ Purpose why_0 = this.getWhy();
							final /*@NonInvalid*/ ProcessingReason processingReason = why_0.getProcessingReason();
							final /*@NonInvalid*/ EnumerationLiteralId BOXED_processingReason = PrivacyModelTables.ENUMid_ProcessingReason
									.getEnumerationLiteralId(ClassUtil.nonNullState(processingReason.getName()));
							final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
									.evaluate(PrivacyModelTables.reasons_1, BOXED_processingReason).booleanValue();
							final /*@Thrown*/ Boolean or_2;
							if (includes) {
								or_2 = ValueUtil.TRUE_VALUE;
							} else {
								final /*@NonInvalid*/ List<Purpose> subPurposes = why_0.getSubPurposes();
								final /*@NonInvalid*/ OrderedSetValue BOXED_subPurposes = idResolver
										.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Purpose, subPurposes);
								/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_subpurpose = BOXED_subPurposes.iterator();
								/*@NonInvalid*/ Boolean exists_0;
								while (true) {
									if (!ITERATOR_subpurpose.hasNext()) {
										if (accumulator_0 == ValueUtil.FALSE_VALUE) {
											exists_0 = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator_0;
										}
										break;
									}
									/*@NonInvalid*/ Purpose subpurpose = (Purpose) ITERATOR_subpurpose.next();
									/**
									 * reasons->includes(subpurpose)
									 */
									final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE
											.evaluate(PrivacyModelTables.reasons_1, subpurpose).booleanValue();
									//
									if (includes_0) { // Normal successful body evaluation result
										exists_0 = ValueUtil.TRUE_VALUE;
										break; // Stop immediately
									} else if (!includes_0) { // Normal unsuccessful body evaluation result
										; // Carry on
									} else { // Impossible badly typed result
										accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
												"exists");
									}
								}
								if (exists_0 == ValueUtil.TRUE_VALUE) {
									or_2 = ValueUtil.TRUE_VALUE;
								} else {
									if (exists_0 == null) {
										or_2 = null;
									} else {
										or_2 = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or_2 = or_2;
						} catch (Exception e) {
							CAUGHT_or_2 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_or_2 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_or_2;
						}
						or_3 = (Boolean) CAUGHT_or_2;
						if (or_3 == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@Thrown*/ Boolean local_0;
						if (or_3) {
							local_0 = ValueUtil.TRUE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_or_4;
							try {
								/*@Caught*/ Object CAUGHT_isDateInInterval;
								try {
									if (CAUGHT_privacyPolicy == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::PrivacyPolicy::privacyPolicyHelper\'");
									}
									if (CAUGHT_privacyPolicy instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_privacyPolicy;
									}
									final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper = ((PrivacyPolicy) CAUGHT_privacyPolicy)
											.getPrivacyPolicyHelper();
									final /*@NonInvalid*/ AbstractTime when = this.getWhen();
									final /*@NonInvalid*/ How how_1 = this.getHow();
									if (how_1 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::How::consent\'");
									}
									final /*@Thrown*/ Consent consent_0 = how_1.getConsent();
									if (consent_0 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::AbstractPaper::startDate\'");
									}
									final /*@Thrown*/ Date startDate = consent_0.getStartDate();
									final /*@Thrown*/ boolean isDateInInterval = privacyPolicyHelper
											.isDateInInterval(when, startDate);
									CAUGHT_isDateInInterval = isDateInInterval;
								} catch (Exception e) {
									CAUGHT_isDateInInterval = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean or_4;
								if (CAUGHT_isDateInInterval == ValueUtil.TRUE_VALUE) {
									or_4 = ValueUtil.TRUE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_isDateBeforeInterval;
									try {
										if (CAUGHT_privacyPolicy == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::PrivacyPolicy::privacyPolicyHelper\'");
										}
										if (CAUGHT_privacyPolicy instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_privacyPolicy;
										}
										final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper_0 = ((PrivacyPolicy) CAUGHT_privacyPolicy)
												.getPrivacyPolicyHelper();
										final /*@NonInvalid*/ AbstractTime when_0 = this.getWhen();
										final /*@NonInvalid*/ How how_2 = this.getHow();
										if (how_2 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::How::consent\'");
										}
										final /*@Thrown*/ Consent consent_1 = how_2.getConsent();
										if (consent_1 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::AbstractPaper::startDate\'");
										}
										final /*@Thrown*/ Date startDate_0 = consent_1.getStartDate();
										final /*@Thrown*/ boolean isDateBeforeInterval = privacyPolicyHelper_0
												.isDateBeforeInterval(when_0, startDate_0);
										CAUGHT_isDateBeforeInterval = isDateBeforeInterval;
									} catch (Exception e) {
										CAUGHT_isDateBeforeInterval = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_isDateBeforeInterval == ValueUtil.TRUE_VALUE) {
										or_4 = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_isDateInInterval instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_isDateInInterval;
										}
										if (CAUGHT_isDateBeforeInterval instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_isDateBeforeInterval;
										}
										or_4 = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_or_4 = or_4;
							} catch (Exception e) {
								CAUGHT_or_4 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and;
							if (CAUGHT_or_4 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_or_5;
								try {
									/*@Caught*/ Object CAUGHT_eq_3;
									try {
										final /*@NonInvalid*/ How how_3 = this.getHow();
										if (how_3 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::How::consent\'");
										}
										final /*@Thrown*/ Consent consent_2 = how_3.getConsent();
										if (consent_2 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::AbstractPaper::terminationDate\'");
										}
										final /*@Thrown*/ Date terminationDate = consent_2.getTerminationDate();
										final /*@Thrown*/ boolean eq_3 = terminationDate == null;
										CAUGHT_eq_3 = eq_3;
									} catch (Exception e) {
										CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean or_5;
									if (CAUGHT_eq_3 == ValueUtil.TRUE_VALUE) {
										or_5 = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_not_0;
										try {
											/*@Caught*/ Object CAUGHT_isDateBeforeInterval_0;
											try {
												if (CAUGHT_privacyPolicy == null) {
													throw new InvalidValueException(
															"Null source for \'\'http://privacymodel\'::PrivacyPolicy::privacyPolicyHelper\'");
												}
												if (CAUGHT_privacyPolicy instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_privacyPolicy;
												}
												final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper_1 = ((PrivacyPolicy) CAUGHT_privacyPolicy)
														.getPrivacyPolicyHelper();
												final /*@NonInvalid*/ AbstractTime when_1 = this.getWhen();
												final /*@NonInvalid*/ How how_4 = this.getHow();
												if (how_4 == null) {
													throw new InvalidValueException(
															"Null source for \'\'http://privacymodel\'::How::consent\'");
												}
												final /*@Thrown*/ Consent consent_3 = how_4.getConsent();
												if (consent_3 == null) {
													throw new InvalidValueException(
															"Null source for \'\'http://privacymodel\'::AbstractPaper::terminationDate\'");
												}
												final /*@Thrown*/ Date terminationDate_0 = consent_3
														.getTerminationDate();
												final /*@Thrown*/ boolean isDateBeforeInterval_0 = privacyPolicyHelper_1
														.isDateBeforeInterval(when_1, terminationDate_0);
												CAUGHT_isDateBeforeInterval_0 = isDateBeforeInterval_0;
											} catch (Exception e) {
												CAUGHT_isDateBeforeInterval_0 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_isDateBeforeInterval_0 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_isDateBeforeInterval_0;
											}
											final /*@Thrown*/ Boolean not_0;
											if (CAUGHT_isDateBeforeInterval_0 == ValueUtil.FALSE_VALUE) {
												not_0 = ValueUtil.TRUE_VALUE;
											} else {
												if (CAUGHT_isDateBeforeInterval_0 == ValueUtil.TRUE_VALUE) {
													not_0 = ValueUtil.FALSE_VALUE;
												} else {
													not_0 = null;
												}
											}
											CAUGHT_not_0 = not_0;
										} catch (Exception e) {
											CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_not_0 == ValueUtil.TRUE_VALUE) {
											or_5 = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_eq_3 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_eq_3;
											}
											if (CAUGHT_not_0 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_not_0;
											}
											if (CAUGHT_not_0 == null) {
												or_5 = null;
											} else {
												or_5 = ValueUtil.FALSE_VALUE;
											}
										}
									}
									CAUGHT_or_5 = or_5;
								} catch (Exception e) {
									CAUGHT_or_5 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_or_5 == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_or_4 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_or_4;
									}
									if (CAUGHT_or_5 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_or_5;
									}
									if ((CAUGHT_or_4 == null) || (CAUGHT_or_5 == null)) {
										and = null;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
							}
							local_0 = and;
						}
						status = local_0;
					}
					final /*@Thrown*/ boolean eq_4 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_4) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art6, status);
						local_2 = local_1;
					}
					CAUGHT_local_2 = local_2;
				} catch (Exception e) {
					CAUGHT_local_2 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_2, PrivacyModelTables.INT_0)
						.booleanValue();
				local_3 = logDiagnostic;
			}
			return local_3;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CausedByShouldBeDefinedForStopProcessingAction(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::CausedByShouldBeDefinedForStopProcessingAction";
		try {
			/**
			 *
			 * inv CausedByShouldBeDefinedForStopProcessingAction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = causedByShouldBeDefinedForType(Action::StopProcessing)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art21', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ Action ECORE_ELITid_StopProcessing = (Action) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_StopProcessing);
				final /*@NonInvalid*/ boolean status = this.causedByShouldBeDefinedForType(ECORE_ELITid_StopProcessing);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Based_32_on_32_Art21, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(
			final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson";
		try {
			/**
			 *
			 * inv JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = if self.whose = null or
			 *             not self.what.actions->exists(action | (action = Action::Collecting))
			 *           then true
			 *           else
			 *             if self.whose.type = PrincipalType::NaturalPerson and self.whose.age <
			 *               PrivacyPolicy.allInstances()
			 *               ->asSequence()
			 *               ->first().owner.inhabits.legalAgeLimit
			 *             then
			 *               if self.how = null or
			 *                 self.whose.responsiblePersons->isEmpty() or
			 *                 self.how.documents->isEmpty() or
			 *                 not self.how.documents->exists(document |
			 *                   (document.documentType = DocumentType::ChildCustody and
			 *                     self.whose.responsiblePersons->exists(p | p = document.providedBy)
			 *                   ))
			 *               then false
			 *               else true
			 *               endif
			 *             else true
			 *             endif
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art8', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			} else {
				final /*@NonInvalid*/ Principal whose = this.getWhose();
				final /*@NonInvalid*/ boolean eq = whose == null;
				final /*@Thrown*/ Boolean or;
				if (eq) {
					or = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_not;
					try {
						final /*@NonInvalid*/ What what = this.getWhat();
						final /*@NonInvalid*/ List<Action> actions = what.getActions();
						final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_action.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action.next();
							/**
							 * action = Action::Collecting
							 */
							final /*@NonInvalid*/ boolean eq_0 = action == PrivacyModelTables.ELITid_Collecting;
							//
							if (eq_0) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!eq_0) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						final /*@Thrown*/ Boolean not;
						if (exists == ValueUtil.FALSE_VALUE) {
							not = ValueUtil.TRUE_VALUE;
						} else {
							if (exists == ValueUtil.TRUE_VALUE) {
								not = ValueUtil.FALSE_VALUE;
							} else {
								not = null;
							}
						}
						CAUGHT_not = not;
					} catch (Exception e) {
						CAUGHT_not = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_not instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not;
						}
						if (CAUGHT_not == null) {
							or = null;
						} else {
							or = ValueUtil.FALSE_VALUE;
						}
					}
				}
				if (or == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@NonInvalid*/ boolean status;
				if (or) {
					status = true;
				} else {
					/*@Caught*/ Object CAUGHT_eq_1;
					try {
						if (whose == null) {
							throw new InvalidValueException(
									"Null source for \'\'http://privacymodel\'::Principal::type\'");
						}
						final /*@Thrown*/ PrincipalType type = whose.getType();
						final /*@Thrown*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_PrincipalType
								.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
						final /*@Thrown*/ boolean eq_1 = BOXED_type == PrivacyModelTables.ELITid_NaturalPerson;
						CAUGHT_eq_1 = eq_1;
					} catch (Exception e) {
						CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean and;
					if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_lt;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
									.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
							if (whose == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::Principal::age\'");
							}
							final /*@Thrown*/ int age = whose.getAge();
							final /*@Thrown*/ IntegerValue BOXED_age = ValueUtil.integerValueOf(age);
							final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
									.evaluate(executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
											TYP_privacyModel_c_c_PrivacyPolicy_0);
							final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
									.evaluate(allInstances);
							final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
									.evaluate(asSequence);
							if (first == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::PrivacyPolicy::owner\'");
							}
							final /*@Thrown*/ Principal owner = first.getOwner();
							final /*@Thrown*/ Location inhabits = owner.getInhabits();
							if (inhabits == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::Location::legalAgeLimit\'");
							}
							final /*@Thrown*/ int legalAgeLimit = inhabits.getLegalAgeLimit();
							final /*@Thrown*/ IntegerValue BOXED_legalAgeLimit = ValueUtil
									.integerValueOf(legalAgeLimit);
							if (BOXED_legalAgeLimit instanceof InvalidValueException) {
								throw (InvalidValueException) BOXED_legalAgeLimit;
							}
							final /*@Thrown*/ boolean lt = OclComparableLessThanOperation.INSTANCE
									.evaluate(executor, BOXED_age, BOXED_legalAgeLimit).booleanValue();
							CAUGHT_lt = lt;
						} catch (Exception e) {
							CAUGHT_lt = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_lt == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							if (CAUGHT_eq_1 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq_1;
							}
							if (CAUGHT_lt instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_lt;
							}
							and = ValueUtil.TRUE_VALUE;
						}
					}
					if (and == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@NonInvalid*/ boolean local_1;
					if (and) {
						/*@Caught*/ Object CAUGHT_or_1;
						try {
							/*@Caught*/ Object CAUGHT_or_0;
							try {
								final /*@NonInvalid*/ How how = this.getHow();
								final /*@NonInvalid*/ boolean eq_2 = how == null;
								final /*@Thrown*/ Boolean or_0;
								if (eq_2) {
									or_0 = ValueUtil.TRUE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_isEmpty;
									try {
										if (whose == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::Principal::responsiblePersons\'");
										}
										final /*@Thrown*/ List<Principal> responsiblePersons = whose
												.getResponsiblePersons();
										final /*@Thrown*/ OrderedSetValue BOXED_responsiblePersons = idResolver
												.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal,
														responsiblePersons);
										final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
												.evaluate(BOXED_responsiblePersons).booleanValue();
										CAUGHT_isEmpty = isEmpty;
									} catch (Exception e) {
										CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_isEmpty == ValueUtil.TRUE_VALUE) {
										or_0 = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_isEmpty instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_isEmpty;
										}
										or_0 = ValueUtil.FALSE_VALUE;
									}
								}
								CAUGHT_or_0 = or_0;
							} catch (Exception e) {
								CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or_1;
							if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
								or_1 = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_isEmpty_0;
								try {
									final /*@NonInvalid*/ How how_0 = this.getHow();
									if (how_0 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::How::documents\'");
									}
									final /*@Thrown*/ List<Document> documents = how_0.getDocuments();
									final /*@Thrown*/ OrderedSetValue BOXED_documents = idResolver
											.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Document, documents);
									final /*@Thrown*/ boolean isEmpty_0 = CollectionIsEmptyOperation.INSTANCE
											.evaluate(BOXED_documents).booleanValue();
									CAUGHT_isEmpty_0 = isEmpty_0;
								} catch (Exception e) {
									CAUGHT_isEmpty_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_isEmpty_0 == ValueUtil.TRUE_VALUE) {
									or_1 = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_or_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_or_0;
									}
									if (CAUGHT_isEmpty_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_isEmpty_0;
									}
									if (CAUGHT_or_0 == null) {
										or_1 = null;
									} else {
										or_1 = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or_1 = or_1;
						} catch (Exception e) {
							CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or_2;
						if (CAUGHT_or_1 == ValueUtil.TRUE_VALUE) {
							or_2 = ValueUtil.TRUE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_not_0;
							try {
								/*@Caught*/ Object CAUGHT_exists_0;
								try {
									final /*@NonInvalid*/ How how_1 = this.getHow();
									if (how_1 == null) {
										throw new InvalidValueException(
												"Null source for \'\'http://privacymodel\'::How::documents\'");
									}
									final /*@Thrown*/ List<Document> documents_0 = how_1.getDocuments();
									final /*@Thrown*/ OrderedSetValue BOXED_documents_0 = idResolver
											.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Document, documents_0);
									/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
									Iterator<Object> ITERATOR_document = BOXED_documents_0.iterator();
									/*@Thrown*/ Boolean exists_0;
									while (true) {
										if (!ITERATOR_document.hasNext()) {
											if (accumulator_0 == null) {
												exists_0 = null;
											} else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
												exists_0 = ValueUtil.FALSE_VALUE;
											} else {
												throw (InvalidValueException) accumulator_0;
											}
											break;
										}
										/*@NonInvalid*/ Document document = (Document) ITERATOR_document.next();
										/**
										 * document.documentType = DocumentType::ChildCustody and
										 * self.whose.responsiblePersons->exists(p | p = document.providedBy)
										 */
										/*@Caught*/ Object CAUGHT_and_0;
										try {
											final /*@NonInvalid*/ DocumentType documentType = document
													.getDocumentType();
											final /*@NonInvalid*/ EnumerationLiteralId BOXED_documentType = documentType == null
													? null
													: PrivacyModelTables.ENUMid_DocumentType.getEnumerationLiteralId(
															ClassUtil.nonNullState(documentType.getName()));
											final /*@NonInvalid*/ boolean eq_3 = BOXED_documentType == PrivacyModelTables.ELITid_ChildCustody;
											final /*@Thrown*/ Boolean and_0;
											if (!eq_3) {
												and_0 = ValueUtil.FALSE_VALUE;
											} else {
												/*@Caught*/ Object CAUGHT_exists_1;
												try {
													if (whose == null) {
														throw new InvalidValueException(
																"Null source for \'\'http://privacymodel\'::Principal::responsiblePersons\'");
													}
													final /*@Thrown*/ List<Principal> responsiblePersons_0 = whose
															.getResponsiblePersons();
													final /*@Thrown*/ OrderedSetValue BOXED_responsiblePersons_0 = idResolver
															.createOrderedSetOfAll(
																	PrivacyModelTables.ORD_CLSSid_Principal,
																	responsiblePersons_0);
													/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
													Iterator<Object> ITERATOR_p = BOXED_responsiblePersons_0.iterator();
													/*@Thrown*/ Boolean exists_1;
													while (true) {
														if (!ITERATOR_p.hasNext()) {
															if (accumulator_1 == ValueUtil.FALSE_VALUE) {
																exists_1 = ValueUtil.FALSE_VALUE;
															} else {
																throw (InvalidValueException) accumulator_1;
															}
															break;
														}
														/*@NonInvalid*/ Principal p = (Principal) ITERATOR_p.next();
														/**
														 * p = document.providedBy
														 */
														final /*@NonInvalid*/ Principal providedBy = document
																.getProvidedBy();
														final /*@NonInvalid*/ boolean eq_4 = p.equals(providedBy);
														//
														if (eq_4) { // Normal successful body evaluation result
															exists_1 = ValueUtil.TRUE_VALUE;
															break; // Stop immediately
														} else if (!eq_4) { // Normal unsuccessful body evaluation result
															; // Carry on
														} else { // Impossible badly typed result
															accumulator_1 = new InvalidValueException(
																	PivotMessages.NonBooleanBody, "exists");
														}
													}
													CAUGHT_exists_1 = exists_1;
												} catch (Exception e) {
													CAUGHT_exists_1 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_exists_1 == ValueUtil.FALSE_VALUE) {
													and_0 = ValueUtil.FALSE_VALUE;
												} else {
													if (CAUGHT_exists_1 instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_exists_1;
													}
													if (CAUGHT_exists_1 == null) {
														and_0 = null;
													} else {
														and_0 = ValueUtil.TRUE_VALUE;
													}
												}
											}
											CAUGHT_and_0 = and_0;
										} catch (Exception e) {
											CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
										}
										//
										if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
											exists_0 = ValueUtil.TRUE_VALUE;
											break; // Stop immediately
										} else if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
											; // Carry on
										} else if (CAUGHT_and_0 == null) { // Abnormal null body evaluation result
											if (accumulator_0 == ValueUtil.FALSE_VALUE) {
												accumulator_0 = null; // Cache a null failure
											}
										} else if (CAUGHT_and_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
											accumulator_0 = CAUGHT_and_0; // Cache an exception failure
										} else { // Impossible badly typed result
											accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
													"exists");
										}
									}
									CAUGHT_exists_0 = exists_0;
								} catch (Exception e) {
									CAUGHT_exists_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_exists_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_exists_0;
								}
								final /*@Thrown*/ Boolean not_0;
								if (CAUGHT_exists_0 == ValueUtil.FALSE_VALUE) {
									not_0 = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_exists_0 == ValueUtil.TRUE_VALUE) {
										not_0 = ValueUtil.FALSE_VALUE;
									} else {
										not_0 = null;
									}
								}
								CAUGHT_not_0 = not_0;
							} catch (Exception e) {
								CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_not_0 == ValueUtil.TRUE_VALUE) {
								or_2 = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_or_1 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_or_1;
								}
								if (CAUGHT_not_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_not_0;
								}
								if ((CAUGHT_or_1 == null) || (CAUGHT_not_0 == null)) {
									or_2 = null;
								} else {
									or_2 = ValueUtil.FALSE_VALUE;
								}
							}
						}
						if (or_2 == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@NonInvalid*/ boolean local_0;
						if (or_2) {
							local_0 = false;
						} else {
							local_0 = true;
						}
						local_1 = local_0;
					} else {
						local_1 = true;
					}
					status = local_1;
				}
				/*@NonInvalid*/ Object local_3;
				if (status) {
					local_3 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_2 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Based_32_on_32_Art8, status);
					local_3 = local_2;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_3, PrivacyModelTables.INT_0)
						.booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean WithdrawnConsent(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::WithdrawnConsent";
		try {
			/**
			 *
			 * inv WithdrawnConsent:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if self.whose = null or
			 *             self.what.actions->exists(act | act = Action::Collecting)
			 *           then true
			 *           else
			 *             let
			 *               privacyPolicy : PrivacyPolicy[1] = PrivacyPolicy.allInstances()
			 *               ->asSequence()
			 *               ->first()
			 *             in
			 *               self.what.datas->forAll(data |
			 *                 let
			 *                   statements : OrderedSet(privacyModel::PolicyStatement) = privacyPolicy.policyStatements->select(st |
			 *                     not (st.whose = null
			 *                     ) and st.whose = self.whose and
			 *                     self.who.equals(st.who) and
			 *                     st.what.actions->exists(act | act = Action::Collecting) and
			 *                     st.what.datas->exists(d | d = data))
			 *                 in
			 *                   if statements->isEmpty()
			 *                   then true
			 *                   else
			 *                     statements->forAll(st |
			 *                       if
			 *                         privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)
			 *                       then
			 *                         if self.why = null or
			 *                           let
			 *                             reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject
			 *                             }
			 *                           in
			 *                             reasons->includes(self.why.processingReason) or
			 *                             self.why.subPurposes->exists(subpurpose |
			 *                               reasons->includes(subpurpose))
			 *                         then true
			 *                         else
			 *                           not privacyPolicy.allComplaints->exists(complaint |
			 *                             (
			 *                               complaint.action.oclIsTypeOf(Withdraw) and
			 *                               let
			 *                                 withdrawal : Withdraw[1] = complaint.action.oclAsType(Withdraw)
			 *                               in withdrawal.subject = st.how.consent and
			 *                                 (
			 *                                   privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, complaint.when) or
			 *                                   privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, complaint.when)
			 *                                 ) and
			 *                                 not privacyPolicy.policyStatements->exists(stopStatement |
			 *                                   (
			 *                                     stopStatement.what.actions->exists(act | act = Action::StopProcessing) and
			 *                                     stopStatement.what.datas->exists(d | d = data) and
			 *                                     not (stopStatement.causedBy = null
			 *                                     ) and stopStatement.causedBy.action = withdrawal
			 *                                   ))
			 *                             ))
			 *                         endif
			 *                       else false
			 *                       endif)
			 *                   endif)
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art7', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___WITHDRAWN_CONSENT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_5;
			if (le) {
				local_5 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_4;
				try {
					final /*@NonInvalid*/ What what_0 = this.getWhat();
					final /*@NonInvalid*/ Principal whose = this.getWhose();
					final /*@NonInvalid*/ boolean eq = whose == null;
					final /*@Thrown*/ Boolean or;
					if (eq) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ List<Action> actions = what_0.getActions();
						final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_act = BOXED_actions.iterator();
						/*@NonInvalid*/ Boolean exists;
						while (true) {
							if (!ITERATOR_act.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ EnumerationLiteralId act = (EnumerationLiteralId) ITERATOR_act.next();
							/**
							 * act = Action::Collecting
							 */
							final /*@NonInvalid*/ boolean eq_0 = act == PrivacyModelTables.ELITid_Collecting;
							//
							if (eq_0) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (!eq_0) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						if (exists == ValueUtil.TRUE_VALUE) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							if (exists == null) {
								or = null;
							} else {
								or = ValueUtil.FALSE_VALUE;
							}
						}
					}
					if (or == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (or) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_privacyPolicy;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
									.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
							final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
									.evaluate(executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
											TYP_privacyModel_c_c_PrivacyPolicy_0);
							final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
									.evaluate(allInstances);
							final /*@Thrown*/ PrivacyPolicy privacyPolicy = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
									.evaluate(asSequence);
							CAUGHT_privacyPolicy = privacyPolicy;
						} catch (Exception e) {
							CAUGHT_privacyPolicy = ValueUtil.createInvalidValue(e);
						}
						final /*@NonInvalid*/ List<SharedPrivacyData> datas = what_0.getDatas();
						final /*@NonInvalid*/ OrderedSetValue BOXED_datas = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_SharedPrivacyData, datas);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_data = BOXED_datas.iterator();
						/*@Thrown*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_data.hasNext()) {
								if (accumulator_0 == null) {
									forAll = null;
								} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ SharedPrivacyData data = (SharedPrivacyData) ITERATOR_data.next();
							/**
							 *
							 * let
							 *   statements : OrderedSet(privacyModel::PolicyStatement) = privacyPolicy.policyStatements->select(st |
							 *     not (st.whose = null
							 *     ) and st.whose = self.whose and
							 *     self.who.equals(st.who) and
							 *     st.what.actions->exists(act | act = Action::Collecting) and
							 *     st.what.datas->exists(d | d = data))
							 * in
							 *   if statements->isEmpty()
							 *   then true
							 *   else
							 *     statements->forAll(st |
							 *       if
							 *         privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)
							 *       then
							 *         if self.why = null or
							 *           let
							 *             reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject
							 *             }
							 *           in
							 *             reasons->includes(self.why.processingReason) or
							 *             self.why.subPurposes->exists(subpurpose |
							 *               reasons->includes(subpurpose))
							 *         then true
							 *         else
							 *           not privacyPolicy.allComplaints->exists(complaint |
							 *             (
							 *               complaint.action.oclIsTypeOf(Withdraw) and
							 *               let
							 *                 withdrawal : Withdraw[1] = complaint.action.oclAsType(Withdraw)
							 *               in withdrawal.subject = st.how.consent and
							 *                 (
							 *                   privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, complaint.when) or
							 *                   privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, complaint.when)
							 *                 ) and
							 *                 not privacyPolicy.policyStatements->exists(stopStatement |
							 *                   (
							 *                     stopStatement.what.actions->exists(act | act = Action::StopProcessing) and
							 *                     stopStatement.what.datas->exists(d | d = data) and
							 *                     not (stopStatement.causedBy = null
							 *                     ) and stopStatement.causedBy.action = withdrawal
							 *                   ))
							 *             ))
							 *         endif
							 *       else false
							 *       endif)
							 *   endif
							 */
							/*@Caught*/ Object CAUGHT_local_2;
							try {
								if (CAUGHT_privacyPolicy == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::PrivacyPolicy::policyStatements\'");
								}
								if (CAUGHT_privacyPolicy instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_privacyPolicy;
								}
								final /*@Thrown*/ List<PolicyStatement> policyStatements = ((PrivacyPolicy) CAUGHT_privacyPolicy)
										.getPolicyStatements();
								final /*@Thrown*/ OrderedSetValue BOXED_policyStatements = idResolver
										.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_PolicyStatement,
												policyStatements);
								/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createOrderedSetAccumulatorValue(
										PrivacyModelTables.ORD_CLSSid_PolicyStatement);
								Iterator<Object> ITERATOR_st = BOXED_policyStatements.iterator();
								/*@Thrown*/ OrderedSetValue statements;
								while (true) {
									if (!ITERATOR_st.hasNext()) {
										statements = accumulator_1;
										break;
									}
									/*@NonInvalid*/ PolicyStatement st = (PolicyStatement) ITERATOR_st.next();
									/**
									 *
									 * not (st.whose = null
									 * ) and st.whose = self.whose and
									 * self.who.equals(st.who) and
									 * st.what.actions->exists(act | act = Action::Collecting) and
									 * st.what.datas->exists(d | d = data)
									 */
									final /*@NonInvalid*/ What what_2 = st.getWhat();
									/*@Caught*/ Object CAUGHT_and_1;
									try {
										/*@Caught*/ Object CAUGHT_and_0;
										try {
											/*@Caught*/ Object CAUGHT_and;
											try {
												final /*@NonInvalid*/ Principal whose_1 = st.getWhose();
												final /*@NonInvalid*/ boolean eq_1 = whose_1 == null;
												final /*@NonInvalid*/ Boolean not;
												if (!eq_1) {
													not = ValueUtil.TRUE_VALUE;
												} else {
													if (eq_1) {
														not = ValueUtil.FALSE_VALUE;
													} else {
														not = null;
													}
												}
												final /*@Thrown*/ Boolean and;
												if (not == ValueUtil.FALSE_VALUE) {
													and = ValueUtil.FALSE_VALUE;
												} else {
													final /*@NonInvalid*/ boolean eq_2 = (whose_1 != null)
															? whose_1.equals(whose)
															: (whose == null);
													if (!eq_2) {
														and = ValueUtil.FALSE_VALUE;
													} else {
														if (not == null) {
															and = null;
														} else {
															and = ValueUtil.TRUE_VALUE;
														}
													}
												}
												CAUGHT_and = and;
											} catch (Exception e) {
												CAUGHT_and = ValueUtil.createInvalidValue(e);
											}
											final /*@Thrown*/ Boolean and_0;
											if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
												and_0 = ValueUtil.FALSE_VALUE;
											} else {
												final /*@NonInvalid*/ Principal who = this.getWho();
												final /*@NonInvalid*/ Principal who_0 = st.getWho();
												final /*@NonInvalid*/ boolean equals = who.equals(who_0);
												if (!equals) {
													and_0 = ValueUtil.FALSE_VALUE;
												} else {
													if (CAUGHT_and instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_and;
													}
													if (CAUGHT_and == null) {
														and_0 = null;
													} else {
														and_0 = ValueUtil.TRUE_VALUE;
													}
												}
											}
											CAUGHT_and_0 = and_0;
										} catch (Exception e) {
											CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean and_1;
										if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
											and_1 = ValueUtil.FALSE_VALUE;
										} else {
											final /*@NonInvalid*/ List<Action> actions_0 = what_2.getActions();
											final /*@NonInvalid*/ OrderedSetValue BOXED_actions_0 = idResolver
													.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action,
															actions_0);
											/*@Thrown*/ Object accumulator_2 = ValueUtil.FALSE_VALUE;
											Iterator<Object> ITERATOR_act_0 = BOXED_actions_0.iterator();
											/*@NonInvalid*/ Boolean exists_0;
											while (true) {
												if (!ITERATOR_act_0.hasNext()) {
													if (accumulator_2 == ValueUtil.FALSE_VALUE) {
														exists_0 = ValueUtil.FALSE_VALUE;
													} else {
														throw (InvalidValueException) accumulator_2;
													}
													break;
												}
												/*@NonInvalid*/ EnumerationLiteralId act_0 = (EnumerationLiteralId) ITERATOR_act_0
														.next();
												/**
												 * act = Action::Collecting
												 */
												final /*@NonInvalid*/ boolean eq_3 = act_0 == PrivacyModelTables.ELITid_Collecting;
												//
												if (eq_3) { // Normal successful body evaluation result
													exists_0 = ValueUtil.TRUE_VALUE;
													break; // Stop immediately
												} else if (!eq_3) { // Normal unsuccessful body evaluation result
													; // Carry on
												} else { // Impossible badly typed result
													accumulator_2 = new InvalidValueException(
															PivotMessages.NonBooleanBody, "exists");
												}
											}
											if (exists_0 == ValueUtil.FALSE_VALUE) {
												and_1 = ValueUtil.FALSE_VALUE;
											} else {
												if (CAUGHT_and_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_and_0;
												}
												if ((CAUGHT_and_0 == null) || (exists_0 == null)) {
													and_1 = null;
												} else {
													and_1 = ValueUtil.TRUE_VALUE;
												}
											}
										}
										CAUGHT_and_1 = and_1;
									} catch (Exception e) {
										CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean and_2;
									if (CAUGHT_and_1 == ValueUtil.FALSE_VALUE) {
										and_2 = ValueUtil.FALSE_VALUE;
									} else {
										final /*@NonInvalid*/ List<SharedPrivacyData> datas_0 = what_2.getDatas();
										final /*@NonInvalid*/ OrderedSetValue BOXED_datas_0 = idResolver
												.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_SharedPrivacyData,
														datas_0);
										/*@Thrown*/ Object accumulator_3 = ValueUtil.FALSE_VALUE;
										Iterator<Object> ITERATOR_d = BOXED_datas_0.iterator();
										/*@NonInvalid*/ Boolean exists_1;
										while (true) {
											if (!ITERATOR_d.hasNext()) {
												if (accumulator_3 == ValueUtil.FALSE_VALUE) {
													exists_1 = ValueUtil.FALSE_VALUE;
												} else {
													throw (InvalidValueException) accumulator_3;
												}
												break;
											}
											/*@NonInvalid*/ SharedPrivacyData d = (SharedPrivacyData) ITERATOR_d.next();
											/**
											 * d = data
											 */
											final /*@NonInvalid*/ boolean eq_4 = d.equals(data);
											//
											if (eq_4) { // Normal successful body evaluation result
												exists_1 = ValueUtil.TRUE_VALUE;
												break; // Stop immediately
											} else if (!eq_4) { // Normal unsuccessful body evaluation result
												; // Carry on
											} else { // Impossible badly typed result
												accumulator_3 = new InvalidValueException(PivotMessages.NonBooleanBody,
														"exists");
											}
										}
										if (exists_1 == ValueUtil.FALSE_VALUE) {
											and_2 = ValueUtil.FALSE_VALUE;
										} else {
											if (CAUGHT_and_1 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_and_1;
											}
											if ((CAUGHT_and_1 == null) || (exists_1 == null)) {
												and_2 = null;
											} else {
												and_2 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									if (and_2 == null) {
										throw new InvalidValueException(
												"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
									}
									//
									if (and_2 == ValueUtil.TRUE_VALUE) {
										accumulator_1.add(st);
									}
								}
								final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
										.evaluate(statements).booleanValue();
								/*@Thrown*/ Boolean local_2;
								if (isEmpty) {
									local_2 = ValueUtil.TRUE_VALUE;
								} else {
									/*@Thrown*/ Object accumulator_4 = ValueUtil.TRUE_VALUE;
									Iterator<Object> ITERATOR_st_0 = statements.iterator();
									/*@Thrown*/ Boolean forAll_0;
									while (true) {
										if (!ITERATOR_st_0.hasNext()) {
											if (accumulator_4 == null) {
												forAll_0 = null;
											} else if (accumulator_4 == ValueUtil.TRUE_VALUE) {
												forAll_0 = ValueUtil.TRUE_VALUE;
											} else {
												throw (InvalidValueException) accumulator_4;
											}
											break;
										}
										/*@NonInvalid*/ PolicyStatement st_0 = (PolicyStatement) ITERATOR_st_0.next();
										/**
										 *
										 * if
										 *   privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)
										 * then
										 *   if self.why = null or
										 *     let
										 *       reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject
										 *       }
										 *     in
										 *       reasons->includes(self.why.processingReason) or
										 *       self.why.subPurposes->exists(subpurpose |
										 *         reasons->includes(subpurpose))
										 *   then true
										 *   else
										 *     not privacyPolicy.allComplaints->exists(complaint |
										 *       (
										 *         complaint.action.oclIsTypeOf(Withdraw) and
										 *         let
										 *           withdrawal : Withdraw[1] = complaint.action.oclAsType(Withdraw)
										 *         in withdrawal.subject = st.how.consent and
										 *           (
										 *             privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, complaint.when) or
										 *             privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, complaint.when)
										 *           ) and
										 *           not privacyPolicy.policyStatements->exists(stopStatement |
										 *             (
										 *               stopStatement.what.actions->exists(act | act = Action::StopProcessing) and
										 *               stopStatement.what.datas->exists(d | d = data) and
										 *               not (stopStatement.causedBy = null
										 *               ) and stopStatement.causedBy.action = withdrawal
										 *             ))
										 *       ))
										 *   endif
										 * else false
										 * endif
										 */
										/*@Caught*/ Object CAUGHT_local_1;
										try {
											final /*@NonInvalid*/ AbstractTime when = this.getWhen();
											final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper = ((PrivacyPolicy) CAUGHT_privacyPolicy)
													.getPrivacyPolicyHelper();
											final /*@NonInvalid*/ AbstractTime when_0 = st_0.getWhen();
											final /*@Thrown*/ boolean areIntervalsOverlap = privacyPolicyHelper
													.areIntervalsOverlap(when, when_0);
											/*@Thrown*/ Boolean local_1;
											if (areIntervalsOverlap) {
												final /*@Thrown*/ Boolean or_1;
												/*@Caught*/ Object CAUGHT_or_0;
												try {
													final /*@NonInvalid*/ Purpose why_0 = this.getWhy();
													final /*@NonInvalid*/ ProcessingReason processingReason = why_0
															.getProcessingReason();
													final /*@NonInvalid*/ EnumerationLiteralId BOXED_processingReason = PrivacyModelTables.ENUMid_ProcessingReason
															.getEnumerationLiteralId(
																	ClassUtil.nonNullState(processingReason.getName()));
													final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
															.evaluate(PrivacyModelTables.reasons_1,
																	BOXED_processingReason)
															.booleanValue();
													final /*@Thrown*/ Boolean or_0;
													if (includes) {
														or_0 = ValueUtil.TRUE_VALUE;
													} else {
														final /*@NonInvalid*/ List<Purpose> subPurposes = why_0
																.getSubPurposes();
														final /*@NonInvalid*/ OrderedSetValue BOXED_subPurposes = idResolver
																.createOrderedSetOfAll(
																		PrivacyModelTables.ORD_CLSSid_Purpose,
																		subPurposes);
														/*@Thrown*/ Object accumulator_5 = ValueUtil.FALSE_VALUE;
														Iterator<Object> ITERATOR_subpurpose = BOXED_subPurposes
																.iterator();
														/*@NonInvalid*/ Boolean exists_2;
														while (true) {
															if (!ITERATOR_subpurpose.hasNext()) {
																if (accumulator_5 == ValueUtil.FALSE_VALUE) {
																	exists_2 = ValueUtil.FALSE_VALUE;
																} else {
																	throw (InvalidValueException) accumulator_5;
																}
																break;
															}
															/*@NonInvalid*/ Purpose subpurpose = (Purpose) ITERATOR_subpurpose
																	.next();
															/**
															 * reasons->includes(subpurpose)
															 */
															final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE
																	.evaluate(PrivacyModelTables.reasons_1, subpurpose)
																	.booleanValue();
															//
															if (includes_0) { // Normal successful body evaluation result
																exists_2 = ValueUtil.TRUE_VALUE;
																break; // Stop immediately
															} else if (!includes_0) { // Normal unsuccessful body evaluation result
																; // Carry on
															} else { // Impossible badly typed result
																accumulator_5 = new InvalidValueException(
																		PivotMessages.NonBooleanBody, "exists");
															}
														}
														if (exists_2 == ValueUtil.TRUE_VALUE) {
															or_0 = ValueUtil.TRUE_VALUE;
														} else {
															if (exists_2 == null) {
																or_0 = null;
															} else {
																or_0 = ValueUtil.FALSE_VALUE;
															}
														}
													}
													CAUGHT_or_0 = or_0;
												} catch (Exception e) {
													CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_or_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_or_0;
												}
												or_1 = (Boolean) CAUGHT_or_0;
												if (or_1 == null) {
													throw new InvalidValueException("Null if condition");
												}
												/*@Thrown*/ Boolean local_0;
												if (or_1) {
													local_0 = ValueUtil.TRUE_VALUE;
												} else {
													/*@Caught*/ Object CAUGHT_exists_3;
													try {
														final /*@Thrown*/ List<Complaint> allComplaints = ((PrivacyPolicy) CAUGHT_privacyPolicy)
																.getAllComplaints();
														final /*@Thrown*/ OrderedSetValue BOXED_allComplaints = idResolver
																.createOrderedSetOfAll(
																		PrivacyModelTables.ORD_CLSSid_Complaint,
																		allComplaints);
														/*@Thrown*/ Object accumulator_6 = ValueUtil.FALSE_VALUE;
														Iterator<Object> ITERATOR_complaint = BOXED_allComplaints
																.iterator();
														/*@Thrown*/ Boolean exists_3;
														while (true) {
															if (!ITERATOR_complaint.hasNext()) {
																if (accumulator_6 == null) {
																	exists_3 = null;
																} else if (accumulator_6 == ValueUtil.FALSE_VALUE) {
																	exists_3 = ValueUtil.FALSE_VALUE;
																} else {
																	throw (InvalidValueException) accumulator_6;
																}
																break;
															}
															/*@NonInvalid*/ Complaint complaint = (Complaint) ITERATOR_complaint
																	.next();
															/**
															 *
															 * complaint.action.oclIsTypeOf(Withdraw) and
															 * let withdrawal : Withdraw[1] = complaint.action.oclAsType(Withdraw)
															 * in withdrawal.subject = st.how.consent and
															 *   (
															 *     privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, complaint.when) or
															 *     privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, complaint.when)
															 *   ) and
															 *   not privacyPolicy.policyStatements->exists(stopStatement |
															 *     (
															 *       stopStatement.what.actions->exists(act | act = Action::StopProcessing) and
															 *       stopStatement.what.datas->exists(d | d = data) and
															 *       not (stopStatement.causedBy = null
															 *       ) and stopStatement.causedBy.action = withdrawal
															 *     ))
															 */
															/*@Caught*/ Object CAUGHT_and_8;
															try {
																final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_Withdraw = idResolver
																		.getClass(PrivacyModelTables.CLSSid_Withdraw,
																				null);
																final /*@NonInvalid*/ AbstractComplaintAction action = complaint
																		.getAction();
																final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
																		.evaluate(executor, action,
																				TYP_privacyModel_c_c_Withdraw)
																		.booleanValue();
																final /*@Thrown*/ Boolean and_8;
																if (!oclIsTypeOf) {
																	and_8 = ValueUtil.FALSE_VALUE;
																} else {
																	/*@Caught*/ Object CAUGHT_and_7;
																	try {
																		/*@Caught*/ Object CAUGHT_withdrawal;
																		try {
																			final /*@Thrown*/ Withdraw withdrawal = (Withdraw) OclAnyOclAsTypeOperation.INSTANCE
																					.evaluate(executor, action,
																							TYP_privacyModel_c_c_Withdraw);
																			CAUGHT_withdrawal = withdrawal;
																		} catch (Exception e) {
																			CAUGHT_withdrawal = ValueUtil
																					.createInvalidValue(e);
																		}
																		/*@Caught*/ Object CAUGHT_and_3;
																		try {
																			/*@Caught*/ Object CAUGHT_eq_5;
																			try {
																				if (CAUGHT_withdrawal instanceof InvalidValueException) {
																					throw (InvalidValueException) CAUGHT_withdrawal;
																				}
																				final /*@Thrown*/ Consent subject = ((Withdraw) CAUGHT_withdrawal)
																						.getSubject();
																				final /*@NonInvalid*/ How how = st_0
																						.getHow();
																				if (how == null) {
																					throw new InvalidValueException(
																							"Null source for \'\'http://privacymodel\'::How::consent\'");
																				}
																				final /*@Thrown*/ Consent consent = how
																						.getConsent();
																				final /*@Thrown*/ boolean eq_5 = subject
																						.equals(consent);
																				CAUGHT_eq_5 = eq_5;
																			} catch (Exception e) {
																				CAUGHT_eq_5 = ValueUtil
																						.createInvalidValue(e);
																			}
																			final /*@Thrown*/ Boolean and_3;
																			if (CAUGHT_eq_5 == ValueUtil.FALSE_VALUE) {
																				and_3 = ValueUtil.FALSE_VALUE;
																			} else {
																				/*@Caught*/ Object CAUGHT_or_2;
																				try {
																					/*@Caught*/ Object CAUGHT_isDateInInterval;
																					try {
																						final /*@NonInvalid*/ Date when_2 = complaint
																								.getWhen();
																						final /*@Thrown*/ boolean isDateInInterval = privacyPolicyHelper
																								.isDateInInterval(when,
																										when_2);
																						CAUGHT_isDateInInterval = isDateInInterval;
																					} catch (Exception e) {
																						CAUGHT_isDateInInterval = ValueUtil
																								.createInvalidValue(e);
																					}
																					final /*@Thrown*/ Boolean or_2;
																					if (CAUGHT_isDateInInterval == ValueUtil.TRUE_VALUE) {
																						or_2 = ValueUtil.TRUE_VALUE;
																					} else {
																						/*@Caught*/ Object CAUGHT_isDateBeforeInterval;
																						try {
																							final /*@NonInvalid*/ Date when_4 = complaint
																									.getWhen();
																							final /*@Thrown*/ boolean isDateBeforeInterval = privacyPolicyHelper
																									.isDateBeforeInterval(
																											when,
																											when_4);
																							CAUGHT_isDateBeforeInterval = isDateBeforeInterval;
																						} catch (Exception e) {
																							CAUGHT_isDateBeforeInterval = ValueUtil
																									.createInvalidValue(
																											e);
																						}
																						if (CAUGHT_isDateBeforeInterval == ValueUtil.TRUE_VALUE) {
																							or_2 = ValueUtil.TRUE_VALUE;
																						} else {
																							if (CAUGHT_isDateInInterval instanceof InvalidValueException) {
																								throw (InvalidValueException) CAUGHT_isDateInInterval;
																							}
																							if (CAUGHT_isDateBeforeInterval instanceof InvalidValueException) {
																								throw (InvalidValueException) CAUGHT_isDateBeforeInterval;
																							}
																							or_2 = ValueUtil.FALSE_VALUE;
																						}
																					}
																					CAUGHT_or_2 = or_2;
																				} catch (Exception e) {
																					CAUGHT_or_2 = ValueUtil
																							.createInvalidValue(e);
																				}
																				if (CAUGHT_or_2 == ValueUtil.FALSE_VALUE) {
																					and_3 = ValueUtil.FALSE_VALUE;
																				} else {
																					if (CAUGHT_eq_5 instanceof InvalidValueException) {
																						throw (InvalidValueException) CAUGHT_eq_5;
																					}
																					if (CAUGHT_or_2 instanceof InvalidValueException) {
																						throw (InvalidValueException) CAUGHT_or_2;
																					}
																					if (CAUGHT_or_2 == null) {
																						and_3 = null;
																					} else {
																						and_3 = ValueUtil.TRUE_VALUE;
																					}
																				}
																			}
																			CAUGHT_and_3 = and_3;
																		} catch (Exception e) {
																			CAUGHT_and_3 = ValueUtil
																					.createInvalidValue(e);
																		}
																		final /*@Thrown*/ Boolean and_7;
																		if (CAUGHT_and_3 == ValueUtil.FALSE_VALUE) {
																			and_7 = ValueUtil.FALSE_VALUE;
																		} else {
																			/*@Caught*/ Object CAUGHT_not_1;
																			try {
																				/*@Caught*/ Object CAUGHT_exists_4;
																				try {
																					/*@Thrown*/ Object accumulator_7 = ValueUtil.FALSE_VALUE;
																					Iterator<Object> ITERATOR_stopStatement = BOXED_policyStatements
																							.iterator();
																					/*@Thrown*/ Boolean exists_4;
																					while (true) {
																						if (!ITERATOR_stopStatement
																								.hasNext()) {
																							if (accumulator_7 == null) {
																								exists_4 = null;
																							} else if (accumulator_7 == ValueUtil.FALSE_VALUE) {
																								exists_4 = ValueUtil.FALSE_VALUE;
																							} else {
																								throw (InvalidValueException) accumulator_7;
																							}
																							break;
																						}
																						/*@NonInvalid*/ PolicyStatement stopStatement = (PolicyStatement) ITERATOR_stopStatement
																								.next();
																						/**
																						 *
																						 * stopStatement.what.actions->exists(act | act = Action::StopProcessing) and
																						 * stopStatement.what.datas->exists(d | d = data) and
																						 * not (stopStatement.causedBy = null
																						 * ) and stopStatement.causedBy.action = withdrawal
																						 */
																						/*@Caught*/ Object CAUGHT_and_6;
																						try {
																							/*@Caught*/ Object CAUGHT_and_5;
																							try {
																								/*@Caught*/ Object CAUGHT_and_4;
																								try {
																									final /*@NonInvalid*/ What what_4 = stopStatement
																											.getWhat();
																									final /*@NonInvalid*/ List<Action> actions_1 = what_4
																											.getActions();
																									final /*@NonInvalid*/ OrderedSetValue BOXED_actions_1 = idResolver
																											.createOrderedSetOfAll(
																													PrivacyModelTables.ORD_ENUMid_Action,
																													actions_1);
																									/*@Thrown*/ Object accumulator_8 = ValueUtil.FALSE_VALUE;
																									Iterator<Object> ITERATOR_act_1 = BOXED_actions_1
																											.iterator();
																									/*@NonInvalid*/ Boolean exists_5;
																									while (true) {
																										if (!ITERATOR_act_1
																												.hasNext()) {
																											if (accumulator_8 == ValueUtil.FALSE_VALUE) {
																												exists_5 = ValueUtil.FALSE_VALUE;
																											} else {
																												throw (InvalidValueException) accumulator_8;
																											}
																											break;
																										}
																										/*@NonInvalid*/ EnumerationLiteralId act_1 = (EnumerationLiteralId) ITERATOR_act_1
																												.next();
																										/**
																										 * act = Action::StopProcessing
																										 */
																										final /*@NonInvalid*/ boolean eq_6 = act_1 == PrivacyModelTables.ELITid_StopProcessing;
																										//
																										if (eq_6) { // Normal successful body evaluation result
																											exists_5 = ValueUtil.TRUE_VALUE;
																											break; // Stop immediately
																										} else if (!eq_6) { // Normal unsuccessful body evaluation result
																											; // Carry on
																										} else { // Impossible badly typed result
																											accumulator_8 = new InvalidValueException(
																													PivotMessages.NonBooleanBody,
																													"exists");
																										}
																									}
																									final /*@Thrown*/ Boolean and_4;
																									if (exists_5 == ValueUtil.FALSE_VALUE) {
																										and_4 = ValueUtil.FALSE_VALUE;
																									} else {
																										final /*@NonInvalid*/ List<SharedPrivacyData> datas_1 = what_4
																												.getDatas();
																										final /*@NonInvalid*/ OrderedSetValue BOXED_datas_1 = idResolver
																												.createOrderedSetOfAll(
																														PrivacyModelTables.ORD_CLSSid_SharedPrivacyData,
																														datas_1);
																										/*@Thrown*/ Object accumulator_9 = ValueUtil.FALSE_VALUE;
																										Iterator<Object> ITERATOR_d_0 = BOXED_datas_1
																												.iterator();
																										/*@NonInvalid*/ Boolean exists_6;
																										while (true) {
																											if (!ITERATOR_d_0
																													.hasNext()) {
																												if (accumulator_9 == ValueUtil.FALSE_VALUE) {
																													exists_6 = ValueUtil.FALSE_VALUE;
																												} else {
																													throw (InvalidValueException) accumulator_9;
																												}
																												break;
																											}
																											/*@NonInvalid*/ SharedPrivacyData d_0 = (SharedPrivacyData) ITERATOR_d_0
																													.next();
																											/**
																											 * d = data
																											 */
																											final /*@NonInvalid*/ boolean eq_7 = d_0
																													.equals(data);
																											//
																											if (eq_7) { // Normal successful body evaluation result
																												exists_6 = ValueUtil.TRUE_VALUE;
																												break; // Stop immediately
																											} else if (!eq_7) { // Normal unsuccessful body evaluation result
																												; // Carry on
																											} else { // Impossible badly typed result
																												accumulator_9 = new InvalidValueException(
																														PivotMessages.NonBooleanBody,
																														"exists");
																											}
																										}
																										if (exists_6 == ValueUtil.FALSE_VALUE) {
																											and_4 = ValueUtil.FALSE_VALUE;
																										} else {
																											if ((exists_5 == null)
																													|| (exists_6 == null)) {
																												and_4 = null;
																											} else {
																												and_4 = ValueUtil.TRUE_VALUE;
																											}
																										}
																									}
																									CAUGHT_and_4 = and_4;
																								} catch (Exception e) {
																									CAUGHT_and_4 = ValueUtil
																											.createInvalidValue(
																													e);
																								}
																								final /*@Thrown*/ Boolean and_5;
																								if (CAUGHT_and_4 == ValueUtil.FALSE_VALUE) {
																									and_5 = ValueUtil.FALSE_VALUE;
																								} else {
																									final /*@NonInvalid*/ Complaint causedBy = stopStatement
																											.getCausedBy();
																									final /*@NonInvalid*/ boolean eq_8 = causedBy == null;
																									final /*@NonInvalid*/ Boolean not_0;
																									if (!eq_8) {
																										not_0 = ValueUtil.TRUE_VALUE;
																									} else {
																										if (eq_8) {
																											not_0 = ValueUtil.FALSE_VALUE;
																										} else {
																											not_0 = null;
																										}
																									}
																									if (not_0 == ValueUtil.FALSE_VALUE) {
																										and_5 = ValueUtil.FALSE_VALUE;
																									} else {
																										if (CAUGHT_and_4 instanceof InvalidValueException) {
																											throw (InvalidValueException) CAUGHT_and_4;
																										}
																										if ((CAUGHT_and_4 == null)
																												|| (not_0 == null)) {
																											and_5 = null;
																										} else {
																											and_5 = ValueUtil.TRUE_VALUE;
																										}
																									}
																								}
																								CAUGHT_and_5 = and_5;
																							} catch (Exception e) {
																								CAUGHT_and_5 = ValueUtil
																										.createInvalidValue(
																												e);
																							}
																							final /*@Thrown*/ Boolean and_6;
																							if (CAUGHT_and_5 == ValueUtil.FALSE_VALUE) {
																								and_6 = ValueUtil.FALSE_VALUE;
																							} else {
																								/*@Caught*/ Object CAUGHT_eq_9;
																								try {
																									final /*@NonInvalid*/ Complaint causedBy_0 = stopStatement
																											.getCausedBy();
																									if (causedBy_0 == null) {
																										throw new InvalidValueException(
																												"Null source for \'\'http://privacymodel\'::Complaint::action\'");
																									}
																									final /*@Thrown*/ AbstractComplaintAction action_1 = causedBy_0
																											.getAction();
																									if (CAUGHT_withdrawal instanceof InvalidValueException) {
																										throw (InvalidValueException) CAUGHT_withdrawal;
																									}
																									final /*@Thrown*/ boolean eq_9 = action_1
																											.equals(CAUGHT_withdrawal);
																									CAUGHT_eq_9 = eq_9;
																								} catch (Exception e) {
																									CAUGHT_eq_9 = ValueUtil
																											.createInvalidValue(
																													e);
																								}
																								if (CAUGHT_eq_9 == ValueUtil.FALSE_VALUE) {
																									and_6 = ValueUtil.FALSE_VALUE;
																								} else {
																									if (CAUGHT_and_5 instanceof InvalidValueException) {
																										throw (InvalidValueException) CAUGHT_and_5;
																									}
																									if (CAUGHT_eq_9 instanceof InvalidValueException) {
																										throw (InvalidValueException) CAUGHT_eq_9;
																									}
																									if (CAUGHT_and_5 == null) {
																										and_6 = null;
																									} else {
																										and_6 = ValueUtil.TRUE_VALUE;
																									}
																								}
																							}
																							CAUGHT_and_6 = and_6;
																						} catch (Exception e) {
																							CAUGHT_and_6 = ValueUtil
																									.createInvalidValue(
																											e);
																						}
																						//
																						if (CAUGHT_and_6 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
																							exists_4 = ValueUtil.TRUE_VALUE;
																							break; // Stop immediately
																						} else if (CAUGHT_and_6 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
																							; // Carry on
																						} else if (CAUGHT_and_6 == null) { // Abnormal null body evaluation result
																							if (accumulator_7 == ValueUtil.FALSE_VALUE) {
																								accumulator_7 = null; // Cache a null failure
																							}
																						} else if (CAUGHT_and_6 instanceof InvalidValueException) { // Abnormal exception evaluation result
																							accumulator_7 = CAUGHT_and_6; // Cache an exception failure
																						} else { // Impossible badly typed result
																							accumulator_7 = new InvalidValueException(
																									PivotMessages.NonBooleanBody,
																									"exists");
																						}
																					}
																					CAUGHT_exists_4 = exists_4;
																				} catch (Exception e) {
																					CAUGHT_exists_4 = ValueUtil
																							.createInvalidValue(e);
																				}
																				if (CAUGHT_exists_4 instanceof InvalidValueException) {
																					throw (InvalidValueException) CAUGHT_exists_4;
																				}
																				final /*@Thrown*/ Boolean not_1;
																				if (CAUGHT_exists_4 == ValueUtil.FALSE_VALUE) {
																					not_1 = ValueUtil.TRUE_VALUE;
																				} else {
																					if (CAUGHT_exists_4 == ValueUtil.TRUE_VALUE) {
																						not_1 = ValueUtil.FALSE_VALUE;
																					} else {
																						not_1 = null;
																					}
																				}
																				CAUGHT_not_1 = not_1;
																			} catch (Exception e) {
																				CAUGHT_not_1 = ValueUtil
																						.createInvalidValue(e);
																			}
																			if (CAUGHT_not_1 == ValueUtil.FALSE_VALUE) {
																				and_7 = ValueUtil.FALSE_VALUE;
																			} else {
																				if (CAUGHT_and_3 instanceof InvalidValueException) {
																					throw (InvalidValueException) CAUGHT_and_3;
																				}
																				if (CAUGHT_not_1 instanceof InvalidValueException) {
																					throw (InvalidValueException) CAUGHT_not_1;
																				}
																				if ((CAUGHT_and_3 == null)
																						|| (CAUGHT_not_1 == null)) {
																					and_7 = null;
																				} else {
																					and_7 = ValueUtil.TRUE_VALUE;
																				}
																			}
																		}
																		CAUGHT_and_7 = and_7;
																	} catch (Exception e) {
																		CAUGHT_and_7 = ValueUtil.createInvalidValue(e);
																	}
																	if (CAUGHT_and_7 == ValueUtil.FALSE_VALUE) {
																		and_8 = ValueUtil.FALSE_VALUE;
																	} else {
																		if (CAUGHT_and_7 instanceof InvalidValueException) {
																			throw (InvalidValueException) CAUGHT_and_7;
																		}
																		if (CAUGHT_and_7 == null) {
																			and_8 = null;
																		} else {
																			and_8 = ValueUtil.TRUE_VALUE;
																		}
																	}
																}
																CAUGHT_and_8 = and_8;
															} catch (Exception e) {
																CAUGHT_and_8 = ValueUtil.createInvalidValue(e);
															}
															//
															if (CAUGHT_and_8 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
																exists_3 = ValueUtil.TRUE_VALUE;
																break; // Stop immediately
															} else if (CAUGHT_and_8 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
																; // Carry on
															} else if (CAUGHT_and_8 == null) { // Abnormal null body evaluation result
																if (accumulator_6 == ValueUtil.FALSE_VALUE) {
																	accumulator_6 = null; // Cache a null failure
																}
															} else if (CAUGHT_and_8 instanceof InvalidValueException) { // Abnormal exception evaluation result
																accumulator_6 = CAUGHT_and_8; // Cache an exception failure
															} else { // Impossible badly typed result
																accumulator_6 = new InvalidValueException(
																		PivotMessages.NonBooleanBody, "exists");
															}
														}
														CAUGHT_exists_3 = exists_3;
													} catch (Exception e) {
														CAUGHT_exists_3 = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_exists_3 instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_exists_3;
													}
													final /*@Thrown*/ Boolean not_2;
													if (CAUGHT_exists_3 == ValueUtil.FALSE_VALUE) {
														not_2 = ValueUtil.TRUE_VALUE;
													} else {
														if (CAUGHT_exists_3 == ValueUtil.TRUE_VALUE) {
															not_2 = ValueUtil.FALSE_VALUE;
														} else {
															not_2 = null;
														}
													}
													local_0 = not_2;
												}
												local_1 = local_0;
											} else {
												local_1 = ValueUtil.FALSE_VALUE;
											}
											CAUGHT_local_1 = local_1;
										} catch (Exception e) {
											CAUGHT_local_1 = ValueUtil.createInvalidValue(e);
										}
										//
										if (CAUGHT_local_1 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
											forAll_0 = ValueUtil.FALSE_VALUE;
											break; // Stop immediately
										} else if (CAUGHT_local_1 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
											; // Carry on
										} else if (CAUGHT_local_1 == null) { // Abnormal null body evaluation result
											if (accumulator_4 == ValueUtil.TRUE_VALUE) {
												accumulator_4 = null; // Cache a null failure
											}
										} else if (CAUGHT_local_1 instanceof InvalidValueException) { // Abnormal exception evaluation result
											accumulator_4 = CAUGHT_local_1; // Cache an exception failure
										} else { // Impossible badly typed result
											accumulator_4 = new InvalidValueException(PivotMessages.NonBooleanBody,
													"forAll");
										}
									}
									local_2 = forAll_0;
								}
								CAUGHT_local_2 = local_2;
							} catch (Exception e) {
								CAUGHT_local_2 = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_local_2 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_local_2 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								; // Carry on
							} else if (CAUGHT_local_2 == null) { // Abnormal null body evaluation result
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									accumulator_0 = null; // Cache a null failure
								}
							} else if (CAUGHT_local_2 instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator_0 = CAUGHT_local_2; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						status = forAll;
					}
					final /*@Thrown*/ boolean eq_10 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_4;
					if (eq_10) {
						local_4 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_3 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art7, status);
						local_4 = local_3;
					}
					CAUGHT_local_4 = local_4;
				} catch (Exception e) {
					CAUGHT_local_4 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_4, PrivacyModelTables.INT_0)
						.booleanValue();
				local_5 = logDiagnostic;
			}
			return local_5;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UndefinedPurposeForActionOrUserDoesntHavePermission(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::UndefinedPurposeForActionOrUserDoesntHavePermission";
		try {
			/**
			 *
			 * inv UndefinedPurposeForActionOrUserDoesntHavePermission:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if self.whose = null or
			 *             self.what.actions->exists(act | act = Action::Collecting or act = Action::StopProcessing)
			 *           then true
			 *           else
			 *             let
			 *               privacyPolicy : PrivacyPolicy[1] = PrivacyPolicy.allInstances()
			 *               ->asSequence()
			 *               ->first()
			 *             in
			 *               self.what.datas->forAll(data |
			 *                 let
			 *                   statements : OrderedSet(privacyModel::PolicyStatement) = privacyPolicy.policyStatements->select(st |
			 *                     not (st.whose = null
			 *                     ) and st.whose = self.whose and
			 *                     st.what.actions->exists(act | act = Action::Collecting) and
			 *                     st.what.datas->exists(d | d = data))
			 *                 in
			 *                   if statements->isEmpty()
			 *                   then true
			 *                   else
			 *                     statements->forAll(st |
			 *                       if
			 *                         privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)
			 *                       then
			 *                         if self.why = null
			 *                         then false
			 *                         else
			 *                           not (st.whom = null
			 *                           ) and
			 *                           (
			 *                             self.who.equals(st.whom) or
			 *                             st.whom.subPrincipals->exists(subprincipal | subprincipal = self.who) or
			 *                             self.who.equals(st.whose) or
			 *                             st.whose.responsiblePersons->exists(responsiblePerson | responsiblePerson = self.who)
			 *                           ) and
			 *                           (
			 *                             st.why.isValid(self.why) or
			 *                             let
			 *                               reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::PublicHealth
			 *                               }
			 *                             in
			 *                               reasons->includes(self.why.processingReason) or
			 *                               self.why.subPurposes->exists(subpurpose |
			 *                                 reasons->includes(subpurpose))
			 *                           )
			 *                         endif
			 *                       else false
			 *                       endif)
			 *                   endif)
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art6 and Art9', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___UNDEFINED_PURPOSE_FOR_ACTION_OR_USER_DOESNT_HAVE_PERMISSION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_3;
				try {
					final /*@NonInvalid*/ Principal whose = this.getWhose();
					final /*@NonInvalid*/ boolean eq = whose == null;
					final /*@Thrown*/ Boolean or_0;
					if (eq) {
						or_0 = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_exists;
						try {
							final /*@NonInvalid*/ What what = this.getWhat();
							final /*@NonInvalid*/ List<Action> actions = what.getActions();
							final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
									.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_act = BOXED_actions.iterator();
							/*@Thrown*/ Boolean exists;
							while (true) {
								if (!ITERATOR_act.hasNext()) {
									if (accumulator == null) {
										exists = null;
									} else if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ EnumerationLiteralId act = (EnumerationLiteralId) ITERATOR_act.next();
								/**
								 * act = Action::Collecting or act = Action::StopProcessing
								 */
								final /*@NonInvalid*/ boolean eq_0 = act == PrivacyModelTables.ELITid_Collecting;
								final /*@NonInvalid*/ Boolean or;
								if (eq_0) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean eq_1 = act == PrivacyModelTables.ELITid_StopProcessing;
									if (eq_1) {
										or = ValueUtil.TRUE_VALUE;
									} else {
										or = ValueUtil.FALSE_VALUE;
									}
								}
								//
								if (or == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (or == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else if (or == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.FALSE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							CAUGHT_exists = exists;
						} catch (Exception e) {
							CAUGHT_exists = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
							or_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_exists instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_exists;
							}
							if (CAUGHT_exists == null) {
								or_0 = null;
							} else {
								or_0 = ValueUtil.FALSE_VALUE;
							}
						}
					}
					if (or_0 == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (or_0) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
								.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
						final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
								executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
								TYP_privacyModel_c_c_PrivacyPolicy_0);
						final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
								.evaluate(allInstances);
						final /*@Thrown*/ PrivacyPolicy privacyPolicy = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
								.evaluate(asSequence);
						final /*@NonInvalid*/ What what_0 = this.getWhat();
						final /*@NonInvalid*/ List<SharedPrivacyData> datas = what_0.getDatas();
						final /*@NonInvalid*/ OrderedSetValue BOXED_datas = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_SharedPrivacyData, datas);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_data = BOXED_datas.iterator();
						/*@Thrown*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_data.hasNext()) {
								if (accumulator_0 == null) {
									forAll = null;
								} else if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ SharedPrivacyData data = (SharedPrivacyData) ITERATOR_data.next();
							/**
							 *
							 * let
							 *   statements : OrderedSet(privacyModel::PolicyStatement) = privacyPolicy.policyStatements->select(st |
							 *     not (st.whose = null
							 *     ) and st.whose = self.whose and
							 *     st.what.actions->exists(act | act = Action::Collecting) and
							 *     st.what.datas->exists(d | d = data))
							 * in
							 *   if statements->isEmpty()
							 *   then true
							 *   else
							 *     statements->forAll(st |
							 *       if
							 *         privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)
							 *       then
							 *         if self.why = null
							 *         then false
							 *         else
							 *           not (st.whom = null
							 *           ) and
							 *           (
							 *             self.who.equals(st.whom) or
							 *             st.whom.subPrincipals->exists(subprincipal | subprincipal = self.who) or
							 *             self.who.equals(st.whose) or
							 *             st.whose.responsiblePersons->exists(responsiblePerson | responsiblePerson = self.who)
							 *           ) and
							 *           (
							 *             st.why.isValid(self.why) or
							 *             let
							 *               reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::PublicHealth
							 *               }
							 *             in
							 *               reasons->includes(self.why.processingReason) or
							 *               self.why.subPurposes->exists(subpurpose |
							 *                 reasons->includes(subpurpose))
							 *           )
							 *         endif
							 *       else false
							 *       endif)
							 *   endif
							 */
							/*@Caught*/ Object CAUGHT_local_1;
							try {
								if (privacyPolicy == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::PrivacyPolicy::policyStatements\'");
								}
								final /*@Thrown*/ List<PolicyStatement> policyStatements = privacyPolicy
										.getPolicyStatements();
								final /*@Thrown*/ OrderedSetValue BOXED_policyStatements = idResolver
										.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_PolicyStatement,
												policyStatements);
								/*@Thrown*/ Accumulator accumulator_1 = ValueUtil.createOrderedSetAccumulatorValue(
										PrivacyModelTables.ORD_CLSSid_PolicyStatement);
								Iterator<Object> ITERATOR_st = BOXED_policyStatements.iterator();
								/*@Thrown*/ OrderedSetValue statements;
								while (true) {
									if (!ITERATOR_st.hasNext()) {
										statements = accumulator_1;
										break;
									}
									/*@NonInvalid*/ PolicyStatement st = (PolicyStatement) ITERATOR_st.next();
									/**
									 *
									 * not (st.whose = null
									 * ) and st.whose = self.whose and
									 * st.what.actions->exists(act | act = Action::Collecting) and
									 * st.what.datas->exists(d | d = data)
									 */
									final /*@NonInvalid*/ What what_2 = st.getWhat();
									/*@Caught*/ Object CAUGHT_and_0;
									try {
										/*@Caught*/ Object CAUGHT_and;
										try {
											final /*@NonInvalid*/ Principal whose_1 = st.getWhose();
											final /*@NonInvalid*/ boolean eq_2 = whose_1 == null;
											final /*@NonInvalid*/ Boolean not;
											if (!eq_2) {
												not = ValueUtil.TRUE_VALUE;
											} else {
												if (eq_2) {
													not = ValueUtil.FALSE_VALUE;
												} else {
													not = null;
												}
											}
											final /*@Thrown*/ Boolean and;
											if (not == ValueUtil.FALSE_VALUE) {
												and = ValueUtil.FALSE_VALUE;
											} else {
												final /*@NonInvalid*/ boolean eq_3 = (whose_1 != null)
														? whose_1.equals(whose)
														: (whose == null);
												if (!eq_3) {
													and = ValueUtil.FALSE_VALUE;
												} else {
													if (not == null) {
														and = null;
													} else {
														and = ValueUtil.TRUE_VALUE;
													}
												}
											}
											CAUGHT_and = and;
										} catch (Exception e) {
											CAUGHT_and = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean and_0;
										if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
											and_0 = ValueUtil.FALSE_VALUE;
										} else {
											final /*@NonInvalid*/ List<Action> actions_0 = what_2.getActions();
											final /*@NonInvalid*/ OrderedSetValue BOXED_actions_0 = idResolver
													.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action,
															actions_0);
											/*@Thrown*/ Object accumulator_2 = ValueUtil.FALSE_VALUE;
											Iterator<Object> ITERATOR_act_0 = BOXED_actions_0.iterator();
											/*@NonInvalid*/ Boolean exists_0;
											while (true) {
												if (!ITERATOR_act_0.hasNext()) {
													if (accumulator_2 == ValueUtil.FALSE_VALUE) {
														exists_0 = ValueUtil.FALSE_VALUE;
													} else {
														throw (InvalidValueException) accumulator_2;
													}
													break;
												}
												/*@NonInvalid*/ EnumerationLiteralId act_0 = (EnumerationLiteralId) ITERATOR_act_0
														.next();
												/**
												 * act = Action::Collecting
												 */
												final /*@NonInvalid*/ boolean eq_4 = act_0 == PrivacyModelTables.ELITid_Collecting;
												//
												if (eq_4) { // Normal successful body evaluation result
													exists_0 = ValueUtil.TRUE_VALUE;
													break; // Stop immediately
												} else if (!eq_4) { // Normal unsuccessful body evaluation result
													; // Carry on
												} else { // Impossible badly typed result
													accumulator_2 = new InvalidValueException(
															PivotMessages.NonBooleanBody, "exists");
												}
											}
											if (exists_0 == ValueUtil.FALSE_VALUE) {
												and_0 = ValueUtil.FALSE_VALUE;
											} else {
												if (CAUGHT_and instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_and;
												}
												if ((CAUGHT_and == null) || (exists_0 == null)) {
													and_0 = null;
												} else {
													and_0 = ValueUtil.TRUE_VALUE;
												}
											}
										}
										CAUGHT_and_0 = and_0;
									} catch (Exception e) {
										CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean and_1;
									if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) {
										and_1 = ValueUtil.FALSE_VALUE;
									} else {
										final /*@NonInvalid*/ List<SharedPrivacyData> datas_0 = what_2.getDatas();
										final /*@NonInvalid*/ OrderedSetValue BOXED_datas_0 = idResolver
												.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_SharedPrivacyData,
														datas_0);
										/*@Thrown*/ Object accumulator_3 = ValueUtil.FALSE_VALUE;
										Iterator<Object> ITERATOR_d = BOXED_datas_0.iterator();
										/*@NonInvalid*/ Boolean exists_1;
										while (true) {
											if (!ITERATOR_d.hasNext()) {
												if (accumulator_3 == ValueUtil.FALSE_VALUE) {
													exists_1 = ValueUtil.FALSE_VALUE;
												} else {
													throw (InvalidValueException) accumulator_3;
												}
												break;
											}
											/*@NonInvalid*/ SharedPrivacyData d = (SharedPrivacyData) ITERATOR_d.next();
											/**
											 * d = data
											 */
											final /*@NonInvalid*/ boolean eq_5 = d.equals(data);
											//
											if (eq_5) { // Normal successful body evaluation result
												exists_1 = ValueUtil.TRUE_VALUE;
												break; // Stop immediately
											} else if (!eq_5) { // Normal unsuccessful body evaluation result
												; // Carry on
											} else { // Impossible badly typed result
												accumulator_3 = new InvalidValueException(PivotMessages.NonBooleanBody,
														"exists");
											}
										}
										if (exists_1 == ValueUtil.FALSE_VALUE) {
											and_1 = ValueUtil.FALSE_VALUE;
										} else {
											if (CAUGHT_and_0 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_and_0;
											}
											if ((CAUGHT_and_0 == null) || (exists_1 == null)) {
												and_1 = null;
											} else {
												and_1 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									if (and_1 == null) {
										throw new InvalidValueException(
												"Null body for \'OrderedSet(T).select(OrderedSet.T[?] | Lambda T() : Boolean[1]) : OrderedSet(T)\'");
									}
									//
									if (and_1 == ValueUtil.TRUE_VALUE) {
										accumulator_1.add(st);
									}
								}
								final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
										.evaluate(statements).booleanValue();
								/*@Thrown*/ Boolean local_1;
								if (isEmpty) {
									local_1 = ValueUtil.TRUE_VALUE;
								} else {
									/*@Thrown*/ Object accumulator_4 = ValueUtil.TRUE_VALUE;
									Iterator<Object> ITERATOR_st_0 = statements.iterator();
									/*@Thrown*/ Boolean forAll_0;
									while (true) {
										if (!ITERATOR_st_0.hasNext()) {
											if (accumulator_4 == null) {
												forAll_0 = null;
											} else if (accumulator_4 == ValueUtil.TRUE_VALUE) {
												forAll_0 = ValueUtil.TRUE_VALUE;
											} else {
												throw (InvalidValueException) accumulator_4;
											}
											break;
										}
										/*@NonInvalid*/ PolicyStatement st_0 = (PolicyStatement) ITERATOR_st_0.next();
										/**
										 *
										 * if
										 *   privacyPolicy.privacyPolicyHelper.areIntervalsOverlap(self.when, st.when)
										 * then
										 *   if self.why = null
										 *   then false
										 *   else
										 *     not (st.whom = null
										 *     ) and
										 *     (
										 *       self.who.equals(st.whom) or
										 *       st.whom.subPrincipals->exists(subprincipal | subprincipal = self.who) or
										 *       self.who.equals(st.whose) or
										 *       st.whose.responsiblePersons->exists(responsiblePerson | responsiblePerson = self.who)
										 *     ) and
										 *     (
										 *       st.why.isValid(self.why) or
										 *       let
										 *         reasons : Sequence(privacyModel::ProcessingReason) = Sequence{ProcessingReason::PublicInterest, ProcessingReason::LegitimateInterests, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject, ProcessingReason::PublicHealth
										 *         }
										 *       in
										 *         reasons->includes(self.why.processingReason) or
										 *         self.why.subPurposes->exists(subpurpose |
										 *           reasons->includes(subpurpose))
										 *     )
										 *   endif
										 * else false
										 * endif
										 */
										/*@Caught*/ Object CAUGHT_local_0;
										try {
											final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper = privacyPolicy
													.getPrivacyPolicyHelper();
											final /*@NonInvalid*/ AbstractTime when = this.getWhen();
											final /*@NonInvalid*/ AbstractTime when_0 = st_0.getWhen();
											final /*@Thrown*/ boolean areIntervalsOverlap = privacyPolicyHelper
													.areIntervalsOverlap(when, when_0);
											/*@Thrown*/ Boolean local_0;
											if (areIntervalsOverlap) {
												/*@Caught*/ Object CAUGHT_and_2;
												try {
													final /*@NonInvalid*/ Principal whom = st_0.getWhom();
													final /*@NonInvalid*/ boolean eq_6 = whom == null;
													final /*@NonInvalid*/ Boolean not_0;
													if (!eq_6) {
														not_0 = ValueUtil.TRUE_VALUE;
													} else {
														if (eq_6) {
															not_0 = ValueUtil.FALSE_VALUE;
														} else {
															not_0 = null;
														}
													}
													final /*@Thrown*/ Boolean and_2;
													if (not_0 == ValueUtil.FALSE_VALUE) {
														and_2 = ValueUtil.FALSE_VALUE;
													} else {
														/*@Caught*/ Object CAUGHT_or_3;
														try {
															/*@Caught*/ Object CAUGHT_or_2;
															try {
																/*@Caught*/ Object CAUGHT_or_1;
																try {
																	/*@Caught*/ Object CAUGHT_equals;
																	try {
																		final /*@NonInvalid*/ Principal who = this
																				.getWho();
																		final /*@Thrown*/ boolean equals = who
																				.equals(whom);
																		CAUGHT_equals = equals;
																	} catch (Exception e) {
																		CAUGHT_equals = ValueUtil.createInvalidValue(e);
																	}
																	final /*@Thrown*/ Boolean or_1;
																	if (CAUGHT_equals == ValueUtil.TRUE_VALUE) {
																		or_1 = ValueUtil.TRUE_VALUE;
																	} else {
																		/*@Caught*/ Object CAUGHT_exists_2;
																		try {
																			if (whom == null) {
																				throw new InvalidValueException(
																						"Null source for \'\'http://privacymodel\'::Principal::subPrincipals\'");
																			}
																			final /*@Thrown*/ List<Principal> subPrincipals = whom
																					.getSubPrincipals();
																			final /*@Thrown*/ OrderedSetValue BOXED_subPrincipals = idResolver
																					.createOrderedSetOfAll(
																							PrivacyModelTables.ORD_CLSSid_Principal,
																							subPrincipals);
																			/*@Thrown*/ Object accumulator_5 = ValueUtil.FALSE_VALUE;
																			Iterator<Object> ITERATOR_subprincipal = BOXED_subPrincipals
																					.iterator();
																			/*@Thrown*/ Boolean exists_2;
																			while (true) {
																				if (!ITERATOR_subprincipal.hasNext()) {
																					if (accumulator_5 == ValueUtil.FALSE_VALUE) {
																						exists_2 = ValueUtil.FALSE_VALUE;
																					} else {
																						throw (InvalidValueException) accumulator_5;
																					}
																					break;
																				}
																				/*@NonInvalid*/ Principal subprincipal = (Principal) ITERATOR_subprincipal
																						.next();
																				/**
																				 * subprincipal = self.who
																				 */
																				final /*@NonInvalid*/ Principal who_0 = this
																						.getWho();
																				final /*@NonInvalid*/ boolean eq_7 = subprincipal
																						.equals(who_0);
																				//
																				if (eq_7) { // Normal successful body evaluation result
																					exists_2 = ValueUtil.TRUE_VALUE;
																					break; // Stop immediately
																				} else if (!eq_7) { // Normal unsuccessful body evaluation result
																					; // Carry on
																				} else { // Impossible badly typed result
																					accumulator_5 = new InvalidValueException(
																							PivotMessages.NonBooleanBody,
																							"exists");
																				}
																			}
																			CAUGHT_exists_2 = exists_2;
																		} catch (Exception e) {
																			CAUGHT_exists_2 = ValueUtil
																					.createInvalidValue(e);
																		}
																		if (CAUGHT_exists_2 == ValueUtil.TRUE_VALUE) {
																			or_1 = ValueUtil.TRUE_VALUE;
																		} else {
																			if (CAUGHT_equals instanceof InvalidValueException) {
																				throw (InvalidValueException) CAUGHT_equals;
																			}
																			if (CAUGHT_exists_2 instanceof InvalidValueException) {
																				throw (InvalidValueException) CAUGHT_exists_2;
																			}
																			if (CAUGHT_exists_2 == null) {
																				or_1 = null;
																			} else {
																				or_1 = ValueUtil.FALSE_VALUE;
																			}
																		}
																	}
																	CAUGHT_or_1 = or_1;
																} catch (Exception e) {
																	CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
																}
																final /*@Thrown*/ Boolean or_2;
																if (CAUGHT_or_1 == ValueUtil.TRUE_VALUE) {
																	or_2 = ValueUtil.TRUE_VALUE;
																} else {
																	/*@Caught*/ Object CAUGHT_equals_0;
																	try {
																		final /*@NonInvalid*/ Principal who_1 = this
																				.getWho();
																		final /*@NonInvalid*/ Principal whose_3 = st_0
																				.getWhose();
																		final /*@Thrown*/ boolean equals_0 = who_1
																				.equals(whose_3);
																		CAUGHT_equals_0 = equals_0;
																	} catch (Exception e) {
																		CAUGHT_equals_0 = ValueUtil
																				.createInvalidValue(e);
																	}
																	if (CAUGHT_equals_0 == ValueUtil.TRUE_VALUE) {
																		or_2 = ValueUtil.TRUE_VALUE;
																	} else {
																		if (CAUGHT_or_1 instanceof InvalidValueException) {
																			throw (InvalidValueException) CAUGHT_or_1;
																		}
																		if (CAUGHT_equals_0 instanceof InvalidValueException) {
																			throw (InvalidValueException) CAUGHT_equals_0;
																		}
																		if (CAUGHT_or_1 == null) {
																			or_2 = null;
																		} else {
																			or_2 = ValueUtil.FALSE_VALUE;
																		}
																	}
																}
																CAUGHT_or_2 = or_2;
															} catch (Exception e) {
																CAUGHT_or_2 = ValueUtil.createInvalidValue(e);
															}
															final /*@Thrown*/ Boolean or_3;
															if (CAUGHT_or_2 == ValueUtil.TRUE_VALUE) {
																or_3 = ValueUtil.TRUE_VALUE;
															} else {
																/*@Caught*/ Object CAUGHT_exists_3;
																try {
																	final /*@NonInvalid*/ Principal whose_4 = st_0
																			.getWhose();
																	if (whose_4 == null) {
																		throw new InvalidValueException(
																				"Null source for \'\'http://privacymodel\'::Principal::responsiblePersons\'");
																	}
																	final /*@Thrown*/ List<Principal> responsiblePersons = whose_4
																			.getResponsiblePersons();
																	final /*@Thrown*/ OrderedSetValue BOXED_responsiblePersons = idResolver
																			.createOrderedSetOfAll(
																					PrivacyModelTables.ORD_CLSSid_Principal,
																					responsiblePersons);
																	/*@Thrown*/ Object accumulator_6 = ValueUtil.FALSE_VALUE;
																	Iterator<Object> ITERATOR_responsiblePerson = BOXED_responsiblePersons
																			.iterator();
																	/*@Thrown*/ Boolean exists_3;
																	while (true) {
																		if (!ITERATOR_responsiblePerson.hasNext()) {
																			if (accumulator_6 == ValueUtil.FALSE_VALUE) {
																				exists_3 = ValueUtil.FALSE_VALUE;
																			} else {
																				throw (InvalidValueException) accumulator_6;
																			}
																			break;
																		}
																		/*@NonInvalid*/ Principal responsiblePerson = (Principal) ITERATOR_responsiblePerson
																				.next();
																		/**
																		 * responsiblePerson = self.who
																		 */
																		final /*@NonInvalid*/ Principal who_2 = this
																				.getWho();
																		final /*@NonInvalid*/ boolean eq_8 = responsiblePerson
																				.equals(who_2);
																		//
																		if (eq_8) { // Normal successful body evaluation result
																			exists_3 = ValueUtil.TRUE_VALUE;
																			break; // Stop immediately
																		} else if (!eq_8) { // Normal unsuccessful body evaluation result
																			; // Carry on
																		} else { // Impossible badly typed result
																			accumulator_6 = new InvalidValueException(
																					PivotMessages.NonBooleanBody,
																					"exists");
																		}
																	}
																	CAUGHT_exists_3 = exists_3;
																} catch (Exception e) {
																	CAUGHT_exists_3 = ValueUtil.createInvalidValue(e);
																}
																if (CAUGHT_exists_3 == ValueUtil.TRUE_VALUE) {
																	or_3 = ValueUtil.TRUE_VALUE;
																} else {
																	if (CAUGHT_or_2 instanceof InvalidValueException) {
																		throw (InvalidValueException) CAUGHT_or_2;
																	}
																	if (CAUGHT_exists_3 instanceof InvalidValueException) {
																		throw (InvalidValueException) CAUGHT_exists_3;
																	}
																	if ((CAUGHT_or_2 == null)
																			|| (CAUGHT_exists_3 == null)) {
																		or_3 = null;
																	} else {
																		or_3 = ValueUtil.FALSE_VALUE;
																	}
																}
															}
															CAUGHT_or_3 = or_3;
														} catch (Exception e) {
															CAUGHT_or_3 = ValueUtil.createInvalidValue(e);
														}
														if (CAUGHT_or_3 == ValueUtil.FALSE_VALUE) {
															and_2 = ValueUtil.FALSE_VALUE;
														} else {
															if (CAUGHT_or_3 instanceof InvalidValueException) {
																throw (InvalidValueException) CAUGHT_or_3;
															}
															if ((not_0 == null) || (CAUGHT_or_3 == null)) {
																and_2 = null;
															} else {
																and_2 = ValueUtil.TRUE_VALUE;
															}
														}
													}
													CAUGHT_and_2 = and_2;
												} catch (Exception e) {
													CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
												}
												final /*@Thrown*/ Boolean and_3;
												if (CAUGHT_and_2 == ValueUtil.FALSE_VALUE) {
													and_3 = ValueUtil.FALSE_VALUE;
												} else {
													/*@Caught*/ Object CAUGHT_or_5;
													try {
														final /*@NonInvalid*/ Purpose why_0 = this.getWhy();
														final /*@NonInvalid*/ Purpose why = st_0.getWhy();
														final /*@NonInvalid*/ boolean isValid = why.isValid(why_0);
														final /*@Thrown*/ Boolean or_5;
														if (isValid) {
															or_5 = ValueUtil.TRUE_VALUE;
														} else {
															/*@Caught*/ Object CAUGHT_or_4;
															try {
																final /*@NonInvalid*/ ProcessingReason processingReason = why_0
																		.getProcessingReason();
																final /*@NonInvalid*/ EnumerationLiteralId BOXED_processingReason = PrivacyModelTables.ENUMid_ProcessingReason
																		.getEnumerationLiteralId(ClassUtil.nonNullState(
																				processingReason.getName()));
																final /*@NonInvalid*/ boolean includes = CollectionIncludesOperation.INSTANCE
																		.evaluate(PrivacyModelTables.reasons,
																				BOXED_processingReason)
																		.booleanValue();
																final /*@Thrown*/ Boolean or_4;
																if (includes) {
																	or_4 = ValueUtil.TRUE_VALUE;
																} else {
																	final /*@NonInvalid*/ List<Purpose> subPurposes = why_0
																			.getSubPurposes();
																	final /*@NonInvalid*/ OrderedSetValue BOXED_subPurposes = idResolver
																			.createOrderedSetOfAll(
																					PrivacyModelTables.ORD_CLSSid_Purpose,
																					subPurposes);
																	/*@Thrown*/ Object accumulator_7 = ValueUtil.FALSE_VALUE;
																	Iterator<Object> ITERATOR_subpurpose = BOXED_subPurposes
																			.iterator();
																	/*@NonInvalid*/ Boolean exists_4;
																	while (true) {
																		if (!ITERATOR_subpurpose.hasNext()) {
																			if (accumulator_7 == ValueUtil.FALSE_VALUE) {
																				exists_4 = ValueUtil.FALSE_VALUE;
																			} else {
																				throw (InvalidValueException) accumulator_7;
																			}
																			break;
																		}
																		/*@NonInvalid*/ Purpose subpurpose = (Purpose) ITERATOR_subpurpose
																				.next();
																		/**
																		 * reasons->includes(subpurpose)
																		 */
																		final /*@NonInvalid*/ boolean includes_0 = CollectionIncludesOperation.INSTANCE
																				.evaluate(PrivacyModelTables.reasons,
																						subpurpose)
																				.booleanValue();
																		//
																		if (includes_0) { // Normal successful body evaluation result
																			exists_4 = ValueUtil.TRUE_VALUE;
																			break; // Stop immediately
																		} else if (!includes_0) { // Normal unsuccessful body evaluation result
																			; // Carry on
																		} else { // Impossible badly typed result
																			accumulator_7 = new InvalidValueException(
																					PivotMessages.NonBooleanBody,
																					"exists");
																		}
																	}
																	if (exists_4 == ValueUtil.TRUE_VALUE) {
																		or_4 = ValueUtil.TRUE_VALUE;
																	} else {
																		if (exists_4 == null) {
																			or_4 = null;
																		} else {
																			or_4 = ValueUtil.FALSE_VALUE;
																		}
																	}
																}
																CAUGHT_or_4 = or_4;
															} catch (Exception e) {
																CAUGHT_or_4 = ValueUtil.createInvalidValue(e);
															}
															if (CAUGHT_or_4 == ValueUtil.TRUE_VALUE) {
																or_5 = ValueUtil.TRUE_VALUE;
															} else {
																if (CAUGHT_or_4 instanceof InvalidValueException) {
																	throw (InvalidValueException) CAUGHT_or_4;
																}
																if (CAUGHT_or_4 == null) {
																	or_5 = null;
																} else {
																	or_5 = ValueUtil.FALSE_VALUE;
																}
															}
														}
														CAUGHT_or_5 = or_5;
													} catch (Exception e) {
														CAUGHT_or_5 = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_or_5 == ValueUtil.FALSE_VALUE) {
														and_3 = ValueUtil.FALSE_VALUE;
													} else {
														if (CAUGHT_and_2 instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_and_2;
														}
														if (CAUGHT_or_5 instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_or_5;
														}
														if ((CAUGHT_and_2 == null) || (CAUGHT_or_5 == null)) {
															and_3 = null;
														} else {
															and_3 = ValueUtil.TRUE_VALUE;
														}
													}
												}
												local_0 = and_3;
											} else {
												local_0 = ValueUtil.FALSE_VALUE;
											}
											CAUGHT_local_0 = local_0;
										} catch (Exception e) {
											CAUGHT_local_0 = ValueUtil.createInvalidValue(e);
										}
										//
										if (CAUGHT_local_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
											forAll_0 = ValueUtil.FALSE_VALUE;
											break; // Stop immediately
										} else if (CAUGHT_local_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
											; // Carry on
										} else if (CAUGHT_local_0 == null) { // Abnormal null body evaluation result
											if (accumulator_4 == ValueUtil.TRUE_VALUE) {
												accumulator_4 = null; // Cache a null failure
											}
										} else if (CAUGHT_local_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
											accumulator_4 = CAUGHT_local_0; // Cache an exception failure
										} else { // Impossible badly typed result
											accumulator_4 = new InvalidValueException(PivotMessages.NonBooleanBody,
													"forAll");
										}
									}
									local_1 = forAll_0;
								}
								CAUGHT_local_1 = local_1;
							} catch (Exception e) {
								CAUGHT_local_1 = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_local_1 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_local_1 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								; // Carry on
							} else if (CAUGHT_local_1 == null) { // Abnormal null body evaluation result
								if (accumulator_0 == ValueUtil.TRUE_VALUE) {
									accumulator_0 = null; // Cache a null failure
								}
							} else if (CAUGHT_local_1 instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator_0 = CAUGHT_local_1; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						status = forAll;
					}
					final /*@Thrown*/ boolean eq_9 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_3;
					if (eq_9) {
						local_3 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_2 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art6_32_and_32_Art9, status);
						local_3 = local_2;
					}
					CAUGHT_local_3 = local_3;
				} catch (Exception e) {
					CAUGHT_local_3 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_3, PrivacyModelTables.INT_0)
						.booleanValue();
				local_4 = logDiagnostic;
			}
			return local_4;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean MissingConsentOrTransferCertificate(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::MissingConsentOrTransferCertificate";
		try {
			/**
			 *
			 * inv MissingConsentOrTransferCertificate:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             not self.what.actions->exists(action | (action = Action::Transfer)) or self.where = null or self.where.destination = null or self.where.destination.isEUMember = true
			 *           then true
			 *           else
			 *             if
			 *               not (self.where.destination = null
			 *               ) and self.where.destination.isEUMember = false
			 *             then
			 *               not (self.how = null
			 *               ) and
			 *               (
			 *                 self.how.documents->exists(doc | doc.documentType = DocumentType::TransferCertificate) or
			 *                 not (self.how = null
			 *                 ) and
			 *                 not (self.how.consent = null
			 *                 )
			 *               ) or
			 *               not (self.why = null
			 *               ) and
			 *               (
			 *                 self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,
			 *                   Sequence{ProcessingReasonSubtype::Prevention, ProcessingReasonSubtype::Investigation, ProcessingReasonSubtype::Detection, ProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats, ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other
			 *                   }) or
			 *                 self.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,
			 *                   Sequence{ProcessingReasonSubtype::PhysicallyIncapable, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::None
			 *                   })
			 *               )
			 *             else true
			 *             endif
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Arts 44-50', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___MISSING_CONSENT_OR_TRANSFER_CERTIFICATE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					/*@Caught*/ Object CAUGHT_or_0;
					try {
						/*@Caught*/ Object CAUGHT_or;
						try {
							/*@Caught*/ Object CAUGHT_not;
							try {
								final /*@NonInvalid*/ What what = this.getWhat();
								final /*@NonInvalid*/ List<Action> actions = what.getActions();
								final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
										.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
								/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
								/*@NonInvalid*/ Boolean exists;
								while (true) {
									if (!ITERATOR_action.hasNext()) {
										if (accumulator == ValueUtil.FALSE_VALUE) {
											exists = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator;
										}
										break;
									}
									/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action
											.next();
									/**
									 * action = Action::Transfer
									 */
									final /*@NonInvalid*/ boolean eq = action == PrivacyModelTables.ELITid_Transfer;
									//
									if (eq) { // Normal successful body evaluation result
										exists = ValueUtil.TRUE_VALUE;
										break; // Stop immediately
									} else if (!eq) { // Normal unsuccessful body evaluation result
										; // Carry on
									} else { // Impossible badly typed result
										accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
									}
								}
								final /*@Thrown*/ Boolean not;
								if (exists == ValueUtil.FALSE_VALUE) {
									not = ValueUtil.TRUE_VALUE;
								} else {
									if (exists == ValueUtil.TRUE_VALUE) {
										not = ValueUtil.FALSE_VALUE;
									} else {
										not = null;
									}
								}
								CAUGHT_not = not;
							} catch (Exception e) {
								CAUGHT_not = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or;
							if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								final /*@NonInvalid*/ Where where = this.getWhere();
								final /*@NonInvalid*/ boolean eq_0 = where == null;
								if (eq_0) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_not instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_not;
									}
									if (CAUGHT_not == null) {
										or = null;
									} else {
										or = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_or = or;
						} catch (Exception e) {
							CAUGHT_or = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or_0;
						if (CAUGHT_or == ValueUtil.TRUE_VALUE) {
							or_0 = ValueUtil.TRUE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_eq_1;
							try {
								final /*@NonInvalid*/ Where where_0 = this.getWhere();
								if (where_0 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Where::destination\'");
								}
								final /*@Thrown*/ Location destination = where_0.getDestination();
								final /*@Thrown*/ boolean eq_1 = destination == null;
								CAUGHT_eq_1 = eq_1;
							} catch (Exception e) {
								CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
								or_0 = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_or instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_or;
								}
								if (CAUGHT_eq_1 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq_1;
								}
								if (CAUGHT_or == null) {
									or_0 = null;
								} else {
									or_0 = ValueUtil.FALSE_VALUE;
								}
							}
						}
						CAUGHT_or_0 = or_0;
					} catch (Exception e) {
						CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
					}
					final /*@Thrown*/ Boolean or_1;
					if (CAUGHT_or_0 == ValueUtil.TRUE_VALUE) {
						or_1 = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_isEUMember;
						try {
							final /*@NonInvalid*/ Where where_1 = this.getWhere();
							if (where_1 == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::Where::destination\'");
							}
							final /*@Thrown*/ Location destination_0 = where_1.getDestination();
							if (destination_0 == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::Location::isEUMember\'");
							}
							final /*@Thrown*/ boolean isEUMember = destination_0.isIsEUMember();
							CAUGHT_isEUMember = isEUMember;
						} catch (Exception e) {
							CAUGHT_isEUMember = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_isEUMember == ValueUtil.TRUE_VALUE) {
							or_1 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_or_0 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_or_0;
							}
							if (CAUGHT_isEUMember instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_isEUMember;
							}
							if (CAUGHT_or_0 == null) {
								or_1 = null;
							} else {
								or_1 = ValueUtil.FALSE_VALUE;
							}
						}
					}
					if (or_1 == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (or_1) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_not_0;
						try {
							/*@Caught*/ Object CAUGHT_eq_2;
							try {
								final /*@NonInvalid*/ Where where_2 = this.getWhere();
								if (where_2 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Where::destination\'");
								}
								final /*@Thrown*/ Location destination_1 = where_2.getDestination();
								final /*@Thrown*/ boolean eq_2 = destination_1 == null;
								CAUGHT_eq_2 = eq_2;
							} catch (Exception e) {
								CAUGHT_eq_2 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq_2 instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq_2;
							}
							final /*@Thrown*/ Boolean not_0;
							if (CAUGHT_eq_2 == ValueUtil.FALSE_VALUE) {
								not_0 = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_eq_2 == ValueUtil.TRUE_VALUE) {
									not_0 = ValueUtil.FALSE_VALUE;
								} else {
									not_0 = null;
								}
							}
							CAUGHT_not_0 = not_0;
						} catch (Exception e) {
							CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean and;
						if (CAUGHT_not_0 == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_eq_3;
							try {
								final /*@NonInvalid*/ Where where_3 = this.getWhere();
								if (where_3 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Where::destination\'");
								}
								final /*@Thrown*/ Location destination_2 = where_3.getDestination();
								if (destination_2 == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::Location::isEUMember\'");
								}
								final /*@Thrown*/ boolean isEUMember_0 = destination_2.isIsEUMember();
								final /*@Thrown*/ boolean eq_3 = !isEUMember_0;
								CAUGHT_eq_3 = eq_3;
							} catch (Exception e) {
								CAUGHT_eq_3 = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq_3 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_not_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_not_0;
								}
								if (CAUGHT_eq_3 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq_3;
								}
								if (CAUGHT_not_0 == null) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						if (and == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@Thrown*/ Boolean local_0;
						if (and) {
							/*@Caught*/ Object CAUGHT_and_1;
							try {
								final /*@NonInvalid*/ How how = this.getHow();
								final /*@NonInvalid*/ boolean eq_4 = how == null;
								final /*@NonInvalid*/ Boolean not_1;
								if (!eq_4) {
									not_1 = ValueUtil.TRUE_VALUE;
								} else {
									if (eq_4) {
										not_1 = ValueUtil.FALSE_VALUE;
									} else {
										not_1 = null;
									}
								}
								final /*@Thrown*/ Boolean and_1;
								if (not_1 == ValueUtil.FALSE_VALUE) {
									and_1 = ValueUtil.FALSE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_or_2;
									try {
										/*@Caught*/ Object CAUGHT_exists_0;
										try {
											if (how == null) {
												throw new InvalidValueException(
														"Null source for \'\'http://privacymodel\'::How::documents\'");
											}
											final /*@Thrown*/ List<Document> documents = how.getDocuments();
											final /*@Thrown*/ OrderedSetValue BOXED_documents = idResolver
													.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Document,
															documents);
											/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
											Iterator<Object> ITERATOR_doc = BOXED_documents.iterator();
											/*@Thrown*/ Boolean exists_0;
											while (true) {
												if (!ITERATOR_doc.hasNext()) {
													if (accumulator_0 == ValueUtil.FALSE_VALUE) {
														exists_0 = ValueUtil.FALSE_VALUE;
													} else {
														throw (InvalidValueException) accumulator_0;
													}
													break;
												}
												/*@NonInvalid*/ Document doc = (Document) ITERATOR_doc.next();
												/**
												 * doc.documentType = DocumentType::TransferCertificate
												 */
												final /*@NonInvalid*/ DocumentType documentType = doc.getDocumentType();
												final /*@NonInvalid*/ EnumerationLiteralId BOXED_documentType = documentType == null
														? null
														: PrivacyModelTables.ENUMid_DocumentType
																.getEnumerationLiteralId(
																		ClassUtil.nonNullState(documentType.getName()));
												final /*@NonInvalid*/ boolean eq_5 = BOXED_documentType == PrivacyModelTables.ELITid_TransferCertificate;
												//
												if (eq_5) { // Normal successful body evaluation result
													exists_0 = ValueUtil.TRUE_VALUE;
													break; // Stop immediately
												} else if (!eq_5) { // Normal unsuccessful body evaluation result
													; // Carry on
												} else { // Impossible badly typed result
													accumulator_0 = new InvalidValueException(
															PivotMessages.NonBooleanBody, "exists");
												}
											}
											CAUGHT_exists_0 = exists_0;
										} catch (Exception e) {
											CAUGHT_exists_0 = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean or_2;
										if (CAUGHT_exists_0 == ValueUtil.TRUE_VALUE) {
											or_2 = ValueUtil.TRUE_VALUE;
										} else {
											/*@Caught*/ Object CAUGHT_and_0;
											try {
												final /*@Thrown*/ Boolean and_0;
												if (not_1 == ValueUtil.FALSE_VALUE) {
													and_0 = ValueUtil.FALSE_VALUE;
												} else {
													/*@Caught*/ Object CAUGHT_not_3;
													try {
														/*@Caught*/ Object CAUGHT_eq_7;
														try {
															if (how == null) {
																throw new InvalidValueException(
																		"Null source for \'\'http://privacymodel\'::How::consent\'");
															}
															final /*@Thrown*/ Consent consent = how.getConsent();
															final /*@Thrown*/ boolean eq_7 = consent == null;
															CAUGHT_eq_7 = eq_7;
														} catch (Exception e) {
															CAUGHT_eq_7 = ValueUtil.createInvalidValue(e);
														}
														if (CAUGHT_eq_7 instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_eq_7;
														}
														final /*@Thrown*/ Boolean not_3;
														if (CAUGHT_eq_7 == ValueUtil.FALSE_VALUE) {
															not_3 = ValueUtil.TRUE_VALUE;
														} else {
															if (CAUGHT_eq_7 == ValueUtil.TRUE_VALUE) {
																not_3 = ValueUtil.FALSE_VALUE;
															} else {
																not_3 = null;
															}
														}
														CAUGHT_not_3 = not_3;
													} catch (Exception e) {
														CAUGHT_not_3 = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_not_3 == ValueUtil.FALSE_VALUE) {
														and_0 = ValueUtil.FALSE_VALUE;
													} else {
														if (CAUGHT_not_3 instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_not_3;
														}
														if ((not_1 == null) || (CAUGHT_not_3 == null)) {
															and_0 = null;
														} else {
															and_0 = ValueUtil.TRUE_VALUE;
														}
													}
												}
												CAUGHT_and_0 = and_0;
											} catch (Exception e) {
												CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
												or_2 = ValueUtil.TRUE_VALUE;
											} else {
												if (CAUGHT_exists_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_exists_0;
												}
												if (CAUGHT_and_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_and_0;
												}
												if ((CAUGHT_exists_0 == null) || (CAUGHT_and_0 == null)) {
													or_2 = null;
												} else {
													or_2 = ValueUtil.FALSE_VALUE;
												}
											}
										}
										CAUGHT_or_2 = or_2;
									} catch (Exception e) {
										CAUGHT_or_2 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_or_2 == ValueUtil.FALSE_VALUE) {
										and_1 = ValueUtil.FALSE_VALUE;
									} else {
										if (CAUGHT_or_2 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_or_2;
										}
										if ((not_1 == null) || (CAUGHT_or_2 == null)) {
											and_1 = null;
										} else {
											and_1 = ValueUtil.TRUE_VALUE;
										}
									}
								}
								CAUGHT_and_1 = and_1;
							} catch (Exception e) {
								CAUGHT_and_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean or_4;
							if (CAUGHT_and_1 == ValueUtil.TRUE_VALUE) {
								or_4 = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_and_2;
								try {
									final /*@NonInvalid*/ Purpose why_0 = this.getWhy();
									final /*@NonInvalid*/ Boolean not_4 = ValueUtil.TRUE_VALUE;
									final /*@Thrown*/ Boolean and_2;
									if (not_4 == ValueUtil.FALSE_VALUE) {
										and_2 = ValueUtil.FALSE_VALUE;
									} else {
										final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_PublicInterest = (ProcessingReason) idResolver
												.ecoreValueOf(Enumerator.class,
														PrivacyModelTables.ELITid_PublicInterest);
										final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_1 = ((IdResolverExtension) idResolver)
												.ecoreValueOfAll(ProcessingReasonSubtype.class,
														PrivacyModelTables.Sequence_6);
										final /*@NonInvalid*/ boolean containsAllowedPurposeReasonAndSubreason = why_0
												.containsAllowedPurposeReasonAndSubreason(ECORE_ELITid_PublicInterest,
														(EList<ProcessingReasonSubtype>) ECORE_Sequence_1);
										final /*@NonInvalid*/ Boolean or_3;
										if (containsAllowedPurposeReasonAndSubreason) {
											or_3 = ValueUtil.TRUE_VALUE;
										} else {
											final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_ProtectTheVitalInterestsOfTheDataSubject = (ProcessingReason) idResolver
													.ecoreValueOf(Enumerator.class,
															PrivacyModelTables.ELITid_ProtectTheVitalInterestsOfTheDataSubject);
											final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_2 = ((IdResolverExtension) idResolver)
													.ecoreValueOfAll(ProcessingReasonSubtype.class,
															PrivacyModelTables.Sequence_2);
											final /*@NonInvalid*/ boolean containsAllowedPurposeReasonAndSubreason_0 = why_0
													.containsAllowedPurposeReasonAndSubreason(
															ECORE_ELITid_ProtectTheVitalInterestsOfTheDataSubject,
															(EList<ProcessingReasonSubtype>) ECORE_Sequence_2);
											if (containsAllowedPurposeReasonAndSubreason_0) {
												or_3 = ValueUtil.TRUE_VALUE;
											} else {
												or_3 = ValueUtil.FALSE_VALUE;
											}
										}
										if (or_3 == ValueUtil.FALSE_VALUE) {
											and_2 = ValueUtil.FALSE_VALUE;
										} else {
											if ((not_4 == null) || (or_3 == null)) {
												and_2 = null;
											} else {
												and_2 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									CAUGHT_and_2 = and_2;
								} catch (Exception e) {
									CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_and_2 == ValueUtil.TRUE_VALUE) {
									or_4 = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_and_1 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_1;
									}
									if (CAUGHT_and_2 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_2;
									}
									if ((CAUGHT_and_1 == null) || (CAUGHT_and_2 == null)) {
										or_4 = null;
									} else {
										or_4 = ValueUtil.FALSE_VALUE;
									}
								}
							}
							local_0 = or_4;
						} else {
							local_0 = ValueUtil.TRUE_VALUE;
						}
						status = local_0;
					}
					final /*@Thrown*/ boolean eq_8 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_8) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Arts_32_44_m_50, status);
						local_2 = local_1;
					}
					CAUGHT_local_2 = local_2;
				} catch (Exception e) {
					CAUGHT_local_2 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_2, PrivacyModelTables.INT_0)
						.booleanValue();
				local_3 = logDiagnostic;
			}
			return local_3;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ControllerApprovalIsNeededForProtectTheVitalInterestsOfTheDataSubjectPurpose(
			final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::ControllerApprovalIsNeededForProtectTheVitalInterestsOfTheDataSubjectPurpose";
		try {
			/**
			 *
			 * inv ControllerApprovalIsNeededForProtectTheVitalInterestsOfTheDataSubjectPurpose:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = documentIsNeededForPurpose(DocumentType::ControllerApproval, ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art9', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEEDED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ DocumentType ECORE_ELITid_ControllerApproval = (DocumentType) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_ControllerApproval);
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_ProtectTheVitalInterestsOfTheDataSubject = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class,
								PrivacyModelTables.ELITid_ProtectTheVitalInterestsOfTheDataSubject);
				final /*@NonInvalid*/ boolean status = this.documentIsNeededForPurpose(ECORE_ELITid_ControllerApproval,
						ECORE_ELITid_ProtectTheVitalInterestsOfTheDataSubject);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Based_32_on_32_Art9, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ControllerApprovalIsNeededForLegitimateInterestsPurpose(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::ControllerApprovalIsNeededForLegitimateInterestsPurpose";
		try {
			/**
			 *
			 * inv ControllerApprovalIsNeededForLegitimateInterestsPurpose:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = documentIsNeededForPurpose(DocumentType::ControllerApproval, ProcessingReason::LegitimateInterests)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art9', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEEDED_FOR_LEGITIMATE_INTERESTS_PURPOSE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ DocumentType ECORE_ELITid_ControllerApproval = (DocumentType) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_ControllerApproval);
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_LegitimateInterests = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_LegitimateInterests);
				final /*@NonInvalid*/ boolean status = this.documentIsNeededForPurpose(ECORE_ELITid_ControllerApproval,
						ECORE_ELITid_LegitimateInterests);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Based_32_on_32_Art9, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DateShouldBeDefinedForAccessAction(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::DateShouldBeDefinedForAccessAction";
		try {
			/**
			 *
			 * inv DateShouldBeDefinedForAccessAction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = dateShouldBeDefinedForType(Action::Access)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Date should be defined', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_ACCESS_ACTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ Action ECORE_ELITid_Access = (Action) idResolver.ecoreValueOf(Enumerator.class,
						PrivacyModelTables.ELITid_Access);
				final /*@NonInvalid*/ boolean status = this.dateShouldBeDefinedForType(ECORE_ELITid_Access);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Date_32_should_32_be_32_defined, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean DateShouldBeDefinedForStoreAction(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::DateShouldBeDefinedForStoreAction";
		try {
			/**
			 *
			 * inv DateShouldBeDefinedForStoreAction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = dateShouldBeDefinedForType(Action::Store)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Date should be defined', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_STORE_ACTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ Action ECORE_ELITid_Store = (Action) idResolver.ecoreValueOf(Enumerator.class,
						PrivacyModelTables.ELITid_Store);
				final /*@NonInvalid*/ boolean status = this.dateShouldBeDefinedForType(ECORE_ELITid_Store);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Date_32_should_32_be_32_defined, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean WhereShouldBeDefinedForTransferAction(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::WhereShouldBeDefinedForTransferAction";
		try {
			/**
			 *
			 * inv WhereShouldBeDefinedForTransferAction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             self.what.actions->exists(action | action = Action::Transfer)
			 *           then not (self.where = null)
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Where should be defined', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___WHERE_SHOULD_BE_DEFINED_FOR_TRANSFER_ACTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ What what = this.getWhat();
				final /*@NonInvalid*/ List<Action> actions = what.getActions();
				final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
						.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
				/*@NonInvalid*/ Boolean exists;
				while (true) {
					if (!ITERATOR_action.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							exists = ValueUtil.FALSE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action.next();
					/**
					 * action = Action::Transfer
					 */
					final /*@NonInvalid*/ boolean eq = action == PrivacyModelTables.ELITid_Transfer;
					//
					if (eq) { // Normal successful body evaluation result
						exists = ValueUtil.TRUE_VALUE;
						break; // Stop immediately
					} else if (!eq) { // Normal unsuccessful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				if (exists == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@NonInvalid*/ Boolean status;
				if (exists) {
					final /*@NonInvalid*/ Where where = this.getWhere();
					final /*@NonInvalid*/ boolean eq_0 = where == null;
					final /*@NonInvalid*/ Boolean not;
					if (!eq_0) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (eq_0) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					status = not;
				} else {
					status = ValueUtil.TRUE_VALUE;
				}
				final /*@NonInvalid*/ boolean eq_1 = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq_1) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Where_32_should_32_be_32_defined, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CausedByShouldBeDefinedForRectificationAction(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::CausedByShouldBeDefinedForRectificationAction";
		try {
			/**
			 *
			 * inv CausedByShouldBeDefinedForRectificationAction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = causedByShouldBeDefinedForType(Action::Rectification)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art16', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ Action ECORE_ELITid_Rectification = (Action) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_Rectification);
				final /*@NonInvalid*/ boolean status = this.causedByShouldBeDefinedForType(ECORE_ELITid_Rectification);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Based_32_on_32_Art16, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CourtApprovalIsNeededForPublicInterestPurpose(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::CourtApprovalIsNeededForPublicInterestPurpose";
		try {
			/**
			 *
			 * inv CourtApprovalIsNeededForPublicInterestPurpose:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = documentIsNeededForPurpose(DocumentType::CourtApproval, ProcessingReason::PublicInterest)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art9', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___COURT_APPROVAL_IS_NEEDED_FOR_PUBLIC_INTEREST_PURPOSE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ DocumentType ECORE_ELITid_CourtApproval = (DocumentType) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_CourtApproval);
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_PublicInterest = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_PublicInterest);
				final /*@NonInvalid*/ boolean status = this.documentIsNeededForPurpose(ECORE_ELITid_CourtApproval,
						ECORE_ELITid_PublicInterest);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Based_32_on_32_Art9, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ExpiredDocument(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::ExpiredDocument";
		try {
			/**
			 *
			 * inv ExpiredDocument:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = if self.how = null or
			 *           not self.how.documents->notEmpty()
			 *         then true
			 *         else
			 *           let
			 *             privacyPolicy : PrivacyPolicy[1] = PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *           in
			 *             self.how.documents->forAll(document |
			 *               (
			 *                 privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, document.startDate) or
			 *                 privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.startDate)
			 *               ) and
			 *               (document.terminationDate = null or
			 *                 not privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.terminationDate)
			 *               ))
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___EXPIRED_DOCUMENT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ How how = this.getHow();
					final /*@NonInvalid*/ boolean eq = how == null;
					final /*@Thrown*/ Boolean or;
					if (eq) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_not;
						try {
							/*@Caught*/ Object CAUGHT_notEmpty;
							try {
								if (how == null) {
									throw new InvalidValueException(
											"Null source for \'\'http://privacymodel\'::How::documents\'");
								}
								final /*@Thrown*/ List<Document> documents = how.getDocuments();
								final /*@Thrown*/ OrderedSetValue BOXED_documents = idResolver
										.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Document, documents);
								final /*@Thrown*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE
										.evaluate(BOXED_documents).booleanValue();
								CAUGHT_notEmpty = notEmpty;
							} catch (Exception e) {
								CAUGHT_notEmpty = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_notEmpty instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_notEmpty;
							}
							final /*@Thrown*/ Boolean not;
							if (CAUGHT_notEmpty == ValueUtil.FALSE_VALUE) {
								not = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_notEmpty == ValueUtil.TRUE_VALUE) {
									not = ValueUtil.FALSE_VALUE;
								} else {
									not = null;
								}
							}
							CAUGHT_not = not;
						} catch (Exception e) {
							CAUGHT_not = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not == ValueUtil.TRUE_VALUE) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if (CAUGHT_not == null) {
								or = null;
							} else {
								or = ValueUtil.FALSE_VALUE;
							}
						}
					}
					if (or == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean result;
					if (or) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_privacyPolicy;
						try {
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy = idResolver
									.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
							final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE
									.evaluate(executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
											TYP_privacyModel_c_c_PrivacyPolicy);
							final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
									.evaluate(allInstances);
							final /*@Thrown*/ PrivacyPolicy privacyPolicy = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
									.evaluate(asSequence);
							CAUGHT_privacyPolicy = privacyPolicy;
						} catch (Exception e) {
							CAUGHT_privacyPolicy = ValueUtil.createInvalidValue(e);
						}
						if (how == null) {
							throw new InvalidValueException(
									"Null source for \'\'http://privacymodel\'::How::documents\'");
						}
						final /*@Thrown*/ List<Document> documents_0 = how.getDocuments();
						final /*@Thrown*/ OrderedSetValue BOXED_documents_0 = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Document, documents_0);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_document = BOXED_documents_0.iterator();
						/*@Thrown*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_document.hasNext()) {
								if (accumulator == null) {
									forAll = null;
								} else if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Document document = (Document) ITERATOR_document.next();
							/**
							 *
							 * (
							 *   privacyPolicy.privacyPolicyHelper.isDateInInterval(self.when, document.startDate) or
							 *   privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.startDate)
							 * ) and
							 * (document.terminationDate = null or
							 *   not privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(self.when, document.terminationDate)
							 * )
							 */
							/*@Caught*/ Object CAUGHT_and;
							try {
								/*@Caught*/ Object CAUGHT_or_0;
								try {
									/*@Caught*/ Object CAUGHT_isDateInInterval;
									try {
										if (CAUGHT_privacyPolicy == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::PrivacyPolicy::privacyPolicyHelper\'");
										}
										if (CAUGHT_privacyPolicy instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_privacyPolicy;
										}
										final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper = ((PrivacyPolicy) CAUGHT_privacyPolicy)
												.getPrivacyPolicyHelper();
										final /*@NonInvalid*/ AbstractTime when = this.getWhen();
										final /*@NonInvalid*/ Date startDate = document.getStartDate();
										final /*@Thrown*/ boolean isDateInInterval = privacyPolicyHelper
												.isDateInInterval(when, startDate);
										CAUGHT_isDateInInterval = isDateInInterval;
									} catch (Exception e) {
										CAUGHT_isDateInInterval = ValueUtil.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean or_0;
									if (CAUGHT_isDateInInterval == ValueUtil.TRUE_VALUE) {
										or_0 = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_isDateBeforeInterval;
										try {
											if (CAUGHT_privacyPolicy == null) {
												throw new InvalidValueException(
														"Null source for \'\'http://privacymodel\'::PrivacyPolicy::privacyPolicyHelper\'");
											}
											if (CAUGHT_privacyPolicy instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_privacyPolicy;
											}
											final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper_0 = ((PrivacyPolicy) CAUGHT_privacyPolicy)
													.getPrivacyPolicyHelper();
											final /*@NonInvalid*/ AbstractTime when_0 = this.getWhen();
											final /*@NonInvalid*/ Date startDate_0 = document.getStartDate();
											final /*@Thrown*/ boolean isDateBeforeInterval = privacyPolicyHelper_0
													.isDateBeforeInterval(when_0, startDate_0);
											CAUGHT_isDateBeforeInterval = isDateBeforeInterval;
										} catch (Exception e) {
											CAUGHT_isDateBeforeInterval = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_isDateBeforeInterval == ValueUtil.TRUE_VALUE) {
											or_0 = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_isDateInInterval instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_isDateInInterval;
											}
											if (CAUGHT_isDateBeforeInterval instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_isDateBeforeInterval;
											}
											or_0 = ValueUtil.FALSE_VALUE;
										}
									}
									CAUGHT_or_0 = or_0;
								} catch (Exception e) {
									CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean and;
								if (CAUGHT_or_0 == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_or_1;
									try {
										final /*@NonInvalid*/ Date terminationDate = document.getTerminationDate();
										final /*@NonInvalid*/ boolean eq_0 = terminationDate == null;
										final /*@Thrown*/ Boolean or_1;
										if (eq_0) {
											or_1 = ValueUtil.TRUE_VALUE;
										} else {
											/*@Caught*/ Object CAUGHT_not_0;
											try {
												/*@Caught*/ Object CAUGHT_isDateBeforeInterval_0;
												try {
													if (CAUGHT_privacyPolicy == null) {
														throw new InvalidValueException(
																"Null source for \'\'http://privacymodel\'::PrivacyPolicy::privacyPolicyHelper\'");
													}
													if (CAUGHT_privacyPolicy instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_privacyPolicy;
													}
													final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper_1 = ((PrivacyPolicy) CAUGHT_privacyPolicy)
															.getPrivacyPolicyHelper();
													final /*@NonInvalid*/ AbstractTime when_1 = this.getWhen();
													final /*@Thrown*/ boolean isDateBeforeInterval_0 = privacyPolicyHelper_1
															.isDateBeforeInterval(when_1, terminationDate);
													CAUGHT_isDateBeforeInterval_0 = isDateBeforeInterval_0;
												} catch (Exception e) {
													CAUGHT_isDateBeforeInterval_0 = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_isDateBeforeInterval_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_isDateBeforeInterval_0;
												}
												final /*@Thrown*/ Boolean not_0;
												if (CAUGHT_isDateBeforeInterval_0 == ValueUtil.FALSE_VALUE) {
													not_0 = ValueUtil.TRUE_VALUE;
												} else {
													if (CAUGHT_isDateBeforeInterval_0 == ValueUtil.TRUE_VALUE) {
														not_0 = ValueUtil.FALSE_VALUE;
													} else {
														not_0 = null;
													}
												}
												CAUGHT_not_0 = not_0;
											} catch (Exception e) {
												CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_not_0 == ValueUtil.TRUE_VALUE) {
												or_1 = ValueUtil.TRUE_VALUE;
											} else {
												if (CAUGHT_not_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_not_0;
												}
												if (CAUGHT_not_0 == null) {
													or_1 = null;
												} else {
													or_1 = ValueUtil.FALSE_VALUE;
												}
											}
										}
										CAUGHT_or_1 = or_1;
									} catch (Exception e) {
										CAUGHT_or_1 = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_or_1 == ValueUtil.FALSE_VALUE) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										if (CAUGHT_or_0 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_or_0;
										}
										if (CAUGHT_or_1 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_or_1;
										}
										if ((CAUGHT_or_0 == null) || (CAUGHT_or_1 == null)) {
											and = null;
										} else {
											and = ValueUtil.TRUE_VALUE;
										}
									}
								}
								CAUGHT_and = and;
							} catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								; // Carry on
							} else if (CAUGHT_and == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.TRUE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else if (CAUGHT_and instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator = CAUGHT_and; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						result = forAll;
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, PrivacyModelTables.INT_0)
						.booleanValue();
				local_0 = logDiagnostic;
			}
			return local_0;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CausedByShouldBeDefinedForErasureAction(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::CausedByShouldBeDefinedForErasureAction";
		try {
			/**
			 *
			 * inv CausedByShouldBeDefinedForErasureAction:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = causedByShouldBeDefinedForType(Action::Erasure)
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art17', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ Action ECORE_ELITid_Erasure = (Action) idResolver.ecoreValueOf(Enumerator.class,
						PrivacyModelTables.ELITid_Erasure);
				final /*@NonInvalid*/ boolean status = this.causedByShouldBeDefinedForType(ECORE_ELITid_Erasure);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Based_32_on_32_Art17, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SubjectShouldBeNotifiedAboutExecutedErasure(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::SubjectShouldBeNotifiedAboutExecutedErasure";
		try {
			/**
			 *
			 * inv SubjectShouldBeNotifiedAboutExecutedErasure:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             what.actions->exists(action | action = Action::Erasure)
			 *           then
			 *             PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *             .notifications->exists(notification | notification.causedBy = self and notification.type = NotificationType::ExecutedErasure)
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art19', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ What what = this.getWhat();
					final /*@NonInvalid*/ List<Action> actions = what.getActions();
					final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
					/*@NonInvalid*/ Boolean exists;
					while (true) {
						if (!ITERATOR_action.hasNext()) {
							if (accumulator == ValueUtil.FALSE_VALUE) {
								exists = ValueUtil.FALSE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action.next();
						/**
						 * action = Action::Erasure
						 */
						final /*@NonInvalid*/ boolean eq = action == PrivacyModelTables.ELITid_Erasure;
						//
						if (eq) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (!eq) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					if (exists == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (exists) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
								.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
						final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
								executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
								TYP_privacyModel_c_c_PrivacyPolicy_0);
						final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
								.evaluate(allInstances);
						final /*@Thrown*/ PrivacyPolicy first = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
								.evaluate(asSequence);
						if (first == null) {
							throw new InvalidValueException(
									"Null source for \'\'http://privacymodel\'::PrivacyPolicy::notifications\'");
						}
						final /*@Thrown*/ List<privacyModel.Notification> notifications = first.getNotifications();
						final /*@Thrown*/ OrderedSetValue BOXED_notifications = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Notification, notifications);
						/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_notification = BOXED_notifications.iterator();
						/*@Thrown*/ Boolean exists_0;
						while (true) {
							if (!ITERATOR_notification.hasNext()) {
								if (accumulator_0 == null) {
									exists_0 = null;
								} else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									exists_0 = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator_0;
								}
								break;
							}
							/*@NonInvalid*/ privacyModel.Notification notification = (privacyModel.Notification) ITERATOR_notification
									.next();
							/**
							 * notification.causedBy = self and notification.type = NotificationType::ExecutedErasure
							 */
							final /*@NonInvalid*/ NotificationInfo causedBy = notification.getCausedBy();
							final /*@NonInvalid*/ boolean eq_0 = causedBy.equals(this);
							final /*@NonInvalid*/ Boolean and;
							if (!eq_0) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ NotificationType type = notification.getType();
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_NotificationType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
								final /*@NonInvalid*/ boolean eq_1 = BOXED_type == PrivacyModelTables.ELITid_ExecutedErasure;
								if (!eq_1) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							//
							if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists_0 = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (and == null) { // Abnormal null body evaluation result
								if (accumulator_0 == ValueUtil.FALSE_VALUE) {
									accumulator_0 = null; // Cache a null failure
								}
							} else { // Impossible badly typed result
								accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						status = exists_0;
					} else {
						status = ValueUtil.TRUE_VALUE;
					}
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_2) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art19, status);
						local_1 = local_0;
					}
					CAUGHT_local_1 = local_1;
				} catch (Exception e) {
					CAUGHT_local_1 = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean WhomShouldBeDefinedForTransfer(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "PolicyStatement::WhomShouldBeDefinedForTransfer";
		try {
			/**
			 *
			 * inv WhomShouldBeDefinedForTransfer:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             what.actions->exists(action | action = Action::Transfer)
			 *           then not (self.whom = null)
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Arts44-50', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.POLICY_STATEMENT___WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ What what = this.getWhat();
				final /*@NonInvalid*/ List<Action> actions = what.getActions();
				final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
						.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_action = BOXED_actions.iterator();
				/*@NonInvalid*/ Boolean exists;
				while (true) {
					if (!ITERATOR_action.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							exists = ValueUtil.FALSE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ EnumerationLiteralId action = (EnumerationLiteralId) ITERATOR_action.next();
					/**
					 * action = Action::Transfer
					 */
					final /*@NonInvalid*/ boolean eq = action == PrivacyModelTables.ELITid_Transfer;
					//
					if (eq) { // Normal successful body evaluation result
						exists = ValueUtil.TRUE_VALUE;
						break; // Stop immediately
					} else if (!eq) { // Normal unsuccessful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				if (exists == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@NonInvalid*/ Boolean status;
				if (exists) {
					final /*@NonInvalid*/ Principal whom = this.getWhom();
					final /*@NonInvalid*/ boolean eq_0 = whom == null;
					final /*@NonInvalid*/ Boolean not;
					if (!eq_0) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (eq_0) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					status = not;
				} else {
					status = ValueUtil.TRUE_VALUE;
				}
				final /*@NonInvalid*/ boolean eq_1 = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq_1) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Based_32_on_32_Arts44_m_50, status);
					local_1 = local_0;
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, local_1, PrivacyModelTables.INT_0)
						.booleanValue();
				local_2 = logDiagnostic;
			}
			return local_2;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PrivacyModelPackage.POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_TYPE__ACTION:
			return dateShouldBeDefinedForType((Action) arguments.get(0));
		case PrivacyModelPackage.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_TYPE__ACTION:
			return causedByShouldBeDefinedForType((Action) arguments.get(0));
		case PrivacyModelPackage.POLICY_STATEMENT___DOCUMENT_IS_NEEDED_FOR_PURPOSE__DOCUMENTTYPE_PROCESSINGREASON:
			return documentIsNeededForPurpose((DocumentType) arguments.get(0), (ProcessingReason) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___MISSING_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP:
			return MissingConsentForCollecting((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___EXPIRED_DOCUMENT__DIAGNOSTICCHAIN_MAP:
			return ExpiredDocument((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_COLLECTING__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutCollecting((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_ERASURE__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutExecutedErasure((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXECUTED_RECTIFICATION__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutExecutedRectification((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___PROCESSING_OF_SPECIAL_CATEGORIES__DIAGNOSTICCHAIN_MAP:
			return ProcessingOfSpecialCategories((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_RECTIFICATION_ACTION__DIAGNOSTICCHAIN_MAP:
			return CausedByShouldBeDefinedForRectificationAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___COURT_APPROVAL_IS_NEEDED_FOR_PUBLIC_INTEREST_PURPOSE__DIAGNOSTICCHAIN_MAP:
			return CourtApprovalIsNeededForPublicInterestPurpose((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___EXPIRED_CONSENT__DIAGNOSTICCHAIN_MAP:
			return ExpiredConsent((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_ERASURE_ACTION__DIAGNOSTICCHAIN_MAP:
			return CausedByShouldBeDefinedForErasureAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___WHOM_SHOULD_BE_DEFINED_FOR_TRANSFER__DIAGNOSTICCHAIN_MAP:
			return WhomShouldBeDefinedForTransfer((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___EXPIRED_CONSENT_FOR_COLLECTING__DIAGNOSTICCHAIN_MAP:
			return ExpiredConsentForCollecting((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___MISSING_CONSENT_OR_TRANSFER_CERTIFICATE__DIAGNOSTICCHAIN_MAP:
			return MissingConsentOrTransferCertificate((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEEDED_FOR_PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_PURPOSE__DIAGNOSTICCHAIN_MAP:
			return ControllerApprovalIsNeededForProtectTheVitalInterestsOfTheDataSubjectPurpose(
					(DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___CONTROLLER_APPROVAL_IS_NEEDED_FOR_LEGITIMATE_INTERESTS_PURPOSE__DIAGNOSTICCHAIN_MAP:
			return ControllerApprovalIsNeededForLegitimateInterestsPurpose((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_ACCESS_ACTION__DIAGNOSTICCHAIN_MAP:
			return DateShouldBeDefinedForAccessAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___DATE_SHOULD_BE_DEFINED_FOR_STORE_ACTION__DIAGNOSTICCHAIN_MAP:
			return DateShouldBeDefinedForStoreAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___WHERE_SHOULD_BE_DEFINED_FOR_TRANSFER_ACTION__DIAGNOSTICCHAIN_MAP:
			return WhereShouldBeDefinedForTransferAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutStopProcessing((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_TRANSFER_TO_THIRD_COUNTRY__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutTransferToThirdCountry((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___MISSING_CONSENT_FOR_DATA_PORTABILITY__DIAGNOSTICCHAIN_MAP:
			return MissingConsentForDataPortability((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___CAUSED_BY_SHOULD_BE_DEFINED_FOR_STOP_PROCESSING_ACTION__DIAGNOSTICCHAIN_MAP:
			return CausedByShouldBeDefinedForStopProcessingAction((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___STOP_PROCESSING_PURPOSE_FOR_ACTION_STOP_PROCESSING__DIAGNOSTICCHAIN_MAP:
			return StopProcessingPurposeForActionStopProcessing((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___JUVENILE_DATA_SHOULD_BE_USED_WITH_DOCUMENT_OF_TYPE_CHILD_CUSTODY_PROVIDED_BY_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP:
			return JuvenileDataShouldBeUsedWithDocumentOfTypeChildCustodyProvidedByResponsiblePerson(
					(DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___WITHDRAWN_CONSENT__DIAGNOSTICCHAIN_MAP:
			return WithdrawnConsent((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.POLICY_STATEMENT___UNDEFINED_PURPOSE_FOR_ACTION_OR_USER_DOESNT_HAVE_PERMISSION__DIAGNOSTICCHAIN_MAP:
			return UndefinedPurposeForActionOrUserDoesntHavePermission((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PolicyStatementImpl
