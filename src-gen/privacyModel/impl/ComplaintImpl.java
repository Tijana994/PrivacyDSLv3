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
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import privacyModel.AbstractComplaintAction;
import privacyModel.AbstractTime;
import privacyModel.Action;
import privacyModel.Complaint;
import privacyModel.ComplaintBasedOnAction;
import privacyModel.ComplaintBasedOnData;
import privacyModel.ComplaintBasedOnDataType;
import privacyModel.ComplaintStatus;
import privacyModel.Consent;
import privacyModel.Denial;
import privacyModel.NotificationInfo;
import privacyModel.NotificationType;
import privacyModel.PolicyStatement;
import privacyModel.Principal;
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
import privacyModel.Withdraw;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean doesPolicyStatementExists(final Action actionType, final ComplaintBasedOnDataType type) {
		/**
		 *
		 * let
		 *   privacyPolicy : PrivacyPolicy[1] = PrivacyPolicy.allInstances()
		 *   ->asSequence()
		 *   ->first()
		 * in
		 *   if not self.action.oclIsKindOf(ComplaintBasedOnData)
		 *   then true
		 *   else
		 *     let
		 *       basedOnData : ComplaintBasedOnData[1] = self.action.oclAsType(ComplaintBasedOnData)
		 *     in
		 *       if basedOnData.type = type
		 *       then
		 *         if
		 *           not (basedOnData.denialReason = null
		 *           ) or
		 *           not (basedOnData.status = ComplaintStatus::Pending
		 *           )
		 *         then true
		 *         else
		 *           basedOnData.subject->forAll(data |
		 *             privacyPolicy.policyStatements->exists(stmt |
		 *               stmt.what.actions->exists(action | action = actionType) and
		 *               not (stmt.whose = null
		 *               ) and stmt.whose = self.who and
		 *               privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(stmt.when, self.when) and
		 *               stmt.what.datas->exists(selectedData | selectedData.privacydata = data) and
		 *               not (stmt.causedBy = null
		 *               ) and stmt.causedBy = self))
		 *         endif
		 *       else true
		 *       endif
		 *   endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		/*@Caught*/ Object CAUGHT_privacyPolicy;
		try {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
					.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
			final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(executor,
					PrivacyModelTables.SET_CLSSid_PrivacyPolicy, TYP_privacyModel_c_c_PrivacyPolicy_0);
			final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
					.evaluate(allInstances);
			final /*@Thrown*/ PrivacyPolicy privacyPolicy = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
					.evaluate(asSequence);
			CAUGHT_privacyPolicy = privacyPolicy;
		} catch (Exception e) {
			CAUGHT_privacyPolicy = ValueUtil.createInvalidValue(e);
		}
		final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_ComplaintBasedOnData_0 = idResolver
				.getClass(PrivacyModelTables.CLSSid_ComplaintBasedOnData, null);
		final /*@NonInvalid*/ AbstractComplaintAction action = this.getAction();
		final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
				.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnData_0).booleanValue();
		final /*@NonInvalid*/ Boolean not;
		if (!oclIsKindOf) {
			not = ValueUtil.TRUE_VALUE;
		} else {
			if (oclIsKindOf) {
				not = ValueUtil.FALSE_VALUE;
			} else {
				not = null;
			}
		}
		if (not == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@Thrown*/ Boolean local_2;
		if (not) {
			local_2 = ValueUtil.TRUE_VALUE;
		} else {
			/*@Caught*/ Object CAUGHT_basedOnData;
			try {
				final /*@Thrown*/ ComplaintBasedOnData basedOnData = (ComplaintBasedOnData) OclAnyOclAsTypeOperation.INSTANCE
						.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnData_0);
				CAUGHT_basedOnData = basedOnData;
			} catch (Exception e) {
				CAUGHT_basedOnData = ValueUtil.createInvalidValue(e);
			}
			if (CAUGHT_basedOnData instanceof InvalidValueException) {
				throw (InvalidValueException) CAUGHT_basedOnData;
			}
			final /*@Thrown*/ ComplaintBasedOnDataType type_0 = ((ComplaintBasedOnData) CAUGHT_basedOnData).getType();
			final /*@Thrown*/ boolean eq = type_0.equals(type);
			/*@Thrown*/ Boolean local_1;
			if (eq) {
				/*@Caught*/ Object CAUGHT_not_0;
				try {
					/*@Caught*/ Object CAUGHT_eq_0;
					try {
						final /*@Thrown*/ Denial denialReason = ((ComplaintBasedOnData) CAUGHT_basedOnData)
								.getDenialReason();
						final /*@Thrown*/ boolean eq_0 = denialReason == null;
						CAUGHT_eq_0 = eq_0;
					} catch (Exception e) {
						CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_eq_0 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_0;
					}
					final /*@Thrown*/ Boolean not_0;
					if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
						not_0 = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
							not_0 = ValueUtil.FALSE_VALUE;
						} else {
							not_0 = null;
						}
					}
					CAUGHT_not_0 = not_0;
				} catch (Exception e) {
					CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
				}
				final /*@Thrown*/ Boolean or;
				if (CAUGHT_not_0 == ValueUtil.TRUE_VALUE) {
					or = ValueUtil.TRUE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_not_1;
					try {
						/*@Caught*/ Object CAUGHT_eq_1;
						try {
							final /*@Thrown*/ ComplaintStatus status = ((ComplaintBasedOnData) CAUGHT_basedOnData)
									.getStatus();
							final /*@Thrown*/ EnumerationLiteralId BOXED_status = PrivacyModelTables.ENUMid_ComplaintStatus
									.getEnumerationLiteralId(ClassUtil.nonNullState(status.getName()));
							final /*@Thrown*/ boolean eq_1 = BOXED_status == PrivacyModelTables.ELITid_Pending;
							CAUGHT_eq_1 = eq_1;
						} catch (Exception e) {
							CAUGHT_eq_1 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_eq_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq_1;
						}
						final /*@Thrown*/ Boolean not_1;
						if (CAUGHT_eq_1 == ValueUtil.FALSE_VALUE) {
							not_1 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_eq_1 == ValueUtil.TRUE_VALUE) {
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
						or = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_not_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_0;
						}
						if (CAUGHT_not_1 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_1;
						}
						if ((CAUGHT_not_0 == null) || (CAUGHT_not_1 == null)) {
							or = null;
						} else {
							or = ValueUtil.FALSE_VALUE;
						}
					}
				}
				if (or == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@Thrown*/ Boolean local_0;
				if (or) {
					local_0 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@Thrown*/ List<PrivacyData> subject = ((ComplaintBasedOnData) CAUGHT_basedOnData)
							.getSubject();
					final /*@Thrown*/ OrderedSetValue BOXED_subject = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_PrivacyData, subject);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_data = BOXED_subject.iterator();
					/*@Thrown*/ Boolean forAll;
					while (true) {
						if (!ITERATOR_data.hasNext()) {
							if (accumulator == null) {
								forAll = null;
							} else if (accumulator == ValueUtil.TRUE_VALUE) {
								forAll = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ PrivacyData data = (PrivacyData) ITERATOR_data.next();
						/**
						 *
						 * privacyPolicy.policyStatements->exists(stmt |
						 *   stmt.what.actions->exists(action | action = actionType) and
						 *   not (stmt.whose = null
						 *   ) and stmt.whose = self.who and
						 *   privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(stmt.when, self.when) and
						 *   stmt.what.datas->exists(selectedData | selectedData.privacydata = data) and
						 *   not (stmt.causedBy = null
						 *   ) and stmt.causedBy = self)
						 */
						/*@Caught*/ Object CAUGHT_exists;
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
							final /*@Thrown*/ OrderedSetValue BOXED_policyStatements = idResolver.createOrderedSetOfAll(
									PrivacyModelTables.ORD_CLSSid_PolicyStatement, policyStatements);
							/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_stmt = BOXED_policyStatements.iterator();
							/*@Thrown*/ Boolean exists;
							while (true) {
								if (!ITERATOR_stmt.hasNext()) {
									if (accumulator_0 == null) {
										exists = null;
									} else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator_0;
									}
									break;
								}
								/*@NonInvalid*/ PolicyStatement stmt = (PolicyStatement) ITERATOR_stmt.next();
								/**
								 *
								 * stmt.what.actions->exists(action | action = actionType) and
								 * not (stmt.whose = null
								 * ) and stmt.whose = self.who and
								 * privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(stmt.when, self.when) and
								 * stmt.what.datas->exists(selectedData | selectedData.privacydata = data) and
								 * not (stmt.causedBy = null
								 * ) and stmt.causedBy = self
								 */
								/*@Caught*/ Object CAUGHT_and_4;
								try {
									final /*@NonInvalid*/ Complaint causedBy_0 = stmt.getCausedBy();
									/*@Caught*/ Object CAUGHT_and_3;
									try {
										/*@Caught*/ Object CAUGHT_and_2;
										try {
											final /*@NonInvalid*/ What what_0 = stmt.getWhat();
											/*@Caught*/ Object CAUGHT_and_1;
											try {
												/*@Caught*/ Object CAUGHT_and_0;
												try {
													final /*@NonInvalid*/ Principal whose_0 = stmt.getWhose();
													/*@Caught*/ Object CAUGHT_and;
													try {
														final /*@NonInvalid*/ List<Action> actions = what_0
																.getActions();
														final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
																.createOrderedSetOfAll(
																		PrivacyModelTables.ORD_ENUMid_Action, actions);
														/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
														Iterator<Object> ITERATOR_action_1 = BOXED_actions.iterator();
														/*@NonInvalid*/ Boolean exists_0;
														while (true) {
															if (!ITERATOR_action_1.hasNext()) {
																if (accumulator_1 == ValueUtil.FALSE_VALUE) {
																	exists_0 = ValueUtil.FALSE_VALUE;
																} else {
																	throw (InvalidValueException) accumulator_1;
																}
																break;
															}
															/*@NonInvalid*/ EnumerationLiteralId action_1 = (EnumerationLiteralId) ITERATOR_action_1
																	.next();
															/**
															 * action = actionType
															 */
															final /*@NonInvalid*/ EnumerationLiteralId BOXED_actionType = PrivacyModelTables.ENUMid_Action
																	.getEnumerationLiteralId(ClassUtil
																			.nonNullState(actionType.getName()));
															final /*@NonInvalid*/ boolean eq_2 = action_1 == BOXED_actionType;
															//
															if (eq_2) { // Normal successful body evaluation result
																exists_0 = ValueUtil.TRUE_VALUE;
																break; // Stop immediately
															} else if (!eq_2) { // Normal unsuccessful body evaluation result
																; // Carry on
															} else { // Impossible badly typed result
																accumulator_1 = new InvalidValueException(
																		PivotMessages.NonBooleanBody, "exists");
															}
														}
														final /*@Thrown*/ Boolean and;
														if (exists_0 == ValueUtil.FALSE_VALUE) {
															and = ValueUtil.FALSE_VALUE;
														} else {
															final /*@NonInvalid*/ boolean eq_3 = whose_0 == null;
															final /*@NonInvalid*/ Boolean not_2;
															if (!eq_3) {
																not_2 = ValueUtil.TRUE_VALUE;
															} else {
																if (eq_3) {
																	not_2 = ValueUtil.FALSE_VALUE;
																} else {
																	not_2 = null;
																}
															}
															if (not_2 == ValueUtil.FALSE_VALUE) {
																and = ValueUtil.FALSE_VALUE;
															} else {
																if ((exists_0 == null) || (not_2 == null)) {
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
														final /*@NonInvalid*/ boolean eq_4 = who.equals(whose_0);
														if (!eq_4) {
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
													/*@Caught*/ Object CAUGHT_isDateBeforeInterval;
													try {
														final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper = ((PrivacyPolicy) CAUGHT_privacyPolicy)
																.getPrivacyPolicyHelper();
														final /*@NonInvalid*/ AbstractTime when = stmt.getWhen();
														final /*@NonInvalid*/ Date when_0 = this.getWhen();
														final /*@Thrown*/ boolean isDateBeforeInterval = privacyPolicyHelper
																.isDateBeforeInterval(when, when_0);
														CAUGHT_isDateBeforeInterval = isDateBeforeInterval;
													} catch (Exception e) {
														CAUGHT_isDateBeforeInterval = ValueUtil.createInvalidValue(e);
													}
													if (CAUGHT_isDateBeforeInterval == ValueUtil.FALSE_VALUE) {
														and_1 = ValueUtil.FALSE_VALUE;
													} else {
														if (CAUGHT_and_0 instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_and_0;
														}
														if (CAUGHT_isDateBeforeInterval instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_isDateBeforeInterval;
														}
														if (CAUGHT_and_0 == null) {
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
												final /*@NonInvalid*/ List<SharedPrivacyData> datas = what_0.getDatas();
												final /*@NonInvalid*/ OrderedSetValue BOXED_datas = idResolver
														.createOrderedSetOfAll(
																PrivacyModelTables.ORD_CLSSid_SharedPrivacyData, datas);
												/*@Thrown*/ Object accumulator_2 = ValueUtil.FALSE_VALUE;
												Iterator<Object> ITERATOR_selectedData = BOXED_datas.iterator();
												/*@NonInvalid*/ Boolean exists_1;
												while (true) {
													if (!ITERATOR_selectedData.hasNext()) {
														if (accumulator_2 == ValueUtil.FALSE_VALUE) {
															exists_1 = ValueUtil.FALSE_VALUE;
														} else {
															throw (InvalidValueException) accumulator_2;
														}
														break;
													}
													/*@NonInvalid*/ SharedPrivacyData selectedData = (SharedPrivacyData) ITERATOR_selectedData
															.next();
													/**
													 * selectedData.privacydata = data
													 */
													final /*@NonInvalid*/ PrivacyData privacydata = selectedData
															.getPrivacydata();
													final /*@NonInvalid*/ boolean eq_5 = privacydata.equals(data);
													//
													if (eq_5) { // Normal successful body evaluation result
														exists_1 = ValueUtil.TRUE_VALUE;
														break; // Stop immediately
													} else if (!eq_5) { // Normal unsuccessful body evaluation result
														; // Carry on
													} else { // Impossible badly typed result
														accumulator_2 = new InvalidValueException(
																PivotMessages.NonBooleanBody, "exists");
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
											CAUGHT_and_2 = and_2;
										} catch (Exception e) {
											CAUGHT_and_2 = ValueUtil.createInvalidValue(e);
										}
										final /*@Thrown*/ Boolean and_3;
										if (CAUGHT_and_2 == ValueUtil.FALSE_VALUE) {
											and_3 = ValueUtil.FALSE_VALUE;
										} else {
											final /*@NonInvalid*/ boolean eq_6 = causedBy_0 == null;
											final /*@NonInvalid*/ Boolean not_3;
											if (!eq_6) {
												not_3 = ValueUtil.TRUE_VALUE;
											} else {
												if (eq_6) {
													not_3 = ValueUtil.FALSE_VALUE;
												} else {
													not_3 = null;
												}
											}
											if (not_3 == ValueUtil.FALSE_VALUE) {
												and_3 = ValueUtil.FALSE_VALUE;
											} else {
												if (CAUGHT_and_2 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_and_2;
												}
												if ((CAUGHT_and_2 == null) || (not_3 == null)) {
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
									final /*@Thrown*/ Boolean and_4;
									if (CAUGHT_and_3 == ValueUtil.FALSE_VALUE) {
										and_4 = ValueUtil.FALSE_VALUE;
									} else {
										final /*@NonInvalid*/ boolean eq_7 = this.equals(causedBy_0);
										if (!eq_7) {
											and_4 = ValueUtil.FALSE_VALUE;
										} else {
											if (CAUGHT_and_3 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_and_3;
											}
											if (CAUGHT_and_3 == null) {
												and_4 = null;
											} else {
												and_4 = ValueUtil.TRUE_VALUE;
											}
										}
									}
									CAUGHT_and_4 = and_4;
								} catch (Exception e) {
									CAUGHT_and_4 = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_and_4 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (CAUGHT_and_4 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else if (CAUGHT_and_4 == null) { // Abnormal null body evaluation result
									if (accumulator_0 == ValueUtil.FALSE_VALUE) {
										accumulator_0 = null; // Cache a null failure
									}
								} else if (CAUGHT_and_4 instanceof InvalidValueException) { // Abnormal exception evaluation result
									accumulator_0 = CAUGHT_and_4; // Cache an exception failure
								} else { // Impossible badly typed result
									accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							CAUGHT_exists = exists;
						} catch (Exception e) {
							CAUGHT_exists = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_exists == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							forAll = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_exists == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_exists == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else if (CAUGHT_exists instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_exists; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
					}
					local_0 = forAll;
				}
				local_1 = local_0;
			} else {
				local_1 = ValueUtil.TRUE_VALUE;
			}
			local_2 = local_1;
		}
		if (local_2 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::Complaint::doesPolicyStatementExists(privacyModel::Action[1],privacyModel::ComplaintBasedOnDataType[1]) : Boolean[1]\'");
		}
		return local_2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CannotIdentifyDataFromComplaint(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::CannotIdentifyDataFromComplaint";
		try {
			/**
			 *
			 * inv CannotIdentifyDataFromComplaint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = let
			 *             privacyPolicy : PrivacyPolicy[1] = PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *           in
			 *             if
			 *               not self.action.oclIsKindOf(ComplaintBasedOnData)
			 *             then true
			 *             else
			 *               let
			 *                 basedOnData : ComplaintBasedOnData[1] = self.action.oclAsType(ComplaintBasedOnData)
			 *               in
			 *                 basedOnData.subject->forAll(data |
			 *                   privacyPolicy.policyStatements->exists(stmt |
			 *                     stmt.what.actions->exists(action | action = Action::Collecting) and
			 *                     not (stmt.whose = null
			 *                     ) and
			 *                     (stmt.whose = self.who or
			 *                       stmt.whose.responsiblePersons->exists(rp | rp = self.who)
			 *                     ) and
			 *                     privacyPolicy.privacyPolicyHelper.isDateAfterInterval(stmt.when, self.when) and
			 *                     stmt.what.datas->exists(selectedData | selectedData.privacydata = data)))
			 *             endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else Tuple{message = 'Based on Art11', status = status}
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.COMPLAINT___CANNOT_IDENTIFY_DATA_FROM_COMPLAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					/*@Caught*/ Object CAUGHT_privacyPolicy;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
								.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
						final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
								executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
								TYP_privacyModel_c_c_PrivacyPolicy_0);
						final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
								.evaluate(allInstances);
						final /*@Thrown*/ PrivacyPolicy privacyPolicy = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
								.evaluate(asSequence);
						CAUGHT_privacyPolicy = privacyPolicy;
					} catch (Exception e) {
						CAUGHT_privacyPolicy = ValueUtil.createInvalidValue(e);
					}
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_ComplaintBasedOnData_1 = idResolver
							.getClass(PrivacyModelTables.CLSSid_ComplaintBasedOnData, null);
					final /*@NonInvalid*/ AbstractComplaintAction action_0 = this.getAction();
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, action_0, TYP_privacyModel_c_c_ComplaintBasedOnData_1).booleanValue();
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsKindOf) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsKindOf) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					if (not == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean local_0;
					if (not) {
						local_0 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ ComplaintBasedOnData basedOnData = (ComplaintBasedOnData) OclAnyOclAsTypeOperation.INSTANCE
								.evaluate(executor, action_0, TYP_privacyModel_c_c_ComplaintBasedOnData_1);
						final /*@Thrown*/ List<PrivacyData> subject = basedOnData.getSubject();
						final /*@Thrown*/ OrderedSetValue BOXED_subject = idResolver
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_PrivacyData, subject);
						/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
						Iterator<Object> ITERATOR_data = BOXED_subject.iterator();
						/*@Thrown*/ Boolean forAll;
						while (true) {
							if (!ITERATOR_data.hasNext()) {
								if (accumulator == null) {
									forAll = null;
								} else if (accumulator == ValueUtil.TRUE_VALUE) {
									forAll = ValueUtil.TRUE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ PrivacyData data = (PrivacyData) ITERATOR_data.next();
							/**
							 *
							 * privacyPolicy.policyStatements->exists(stmt |
							 *   stmt.what.actions->exists(action | action = Action::Collecting) and
							 *   not (stmt.whose = null
							 *   ) and
							 *   (stmt.whose = self.who or
							 *     stmt.whose.responsiblePersons->exists(rp | rp = self.who)
							 *   ) and
							 *   privacyPolicy.privacyPolicyHelper.isDateAfterInterval(stmt.when, self.when) and
							 *   stmt.what.datas->exists(selectedData | selectedData.privacydata = data))
							 */
							/*@Caught*/ Object CAUGHT_exists;
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
								/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_stmt = BOXED_policyStatements.iterator();
								/*@Thrown*/ Boolean exists;
								while (true) {
									if (!ITERATOR_stmt.hasNext()) {
										if (accumulator_0 == null) {
											exists = null;
										} else if (accumulator_0 == ValueUtil.FALSE_VALUE) {
											exists = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator_0;
										}
										break;
									}
									/*@NonInvalid*/ PolicyStatement stmt = (PolicyStatement) ITERATOR_stmt.next();
									/**
									 *
									 * stmt.what.actions->exists(action | action = Action::Collecting) and
									 * not (stmt.whose = null
									 * ) and
									 * (stmt.whose = self.who or
									 *   stmt.whose.responsiblePersons->exists(rp | rp = self.who)
									 * ) and
									 * privacyPolicy.privacyPolicyHelper.isDateAfterInterval(stmt.when, self.when) and
									 * stmt.what.datas->exists(selectedData | selectedData.privacydata = data)
									 */
									/*@Caught*/ Object CAUGHT_and_2;
									try {
										final /*@NonInvalid*/ What what_0 = stmt.getWhat();
										/*@Caught*/ Object CAUGHT_and_1;
										try {
											/*@Caught*/ Object CAUGHT_and_0;
											try {
												/*@Caught*/ Object CAUGHT_and;
												try {
													final /*@NonInvalid*/ List<Action> actions = what_0.getActions();
													final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
															.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action,
																	actions);
													/*@Thrown*/ Object accumulator_1 = ValueUtil.FALSE_VALUE;
													Iterator<Object> ITERATOR_action_1 = BOXED_actions.iterator();
													/*@NonInvalid*/ Boolean exists_0;
													while (true) {
														if (!ITERATOR_action_1.hasNext()) {
															if (accumulator_1 == ValueUtil.FALSE_VALUE) {
																exists_0 = ValueUtil.FALSE_VALUE;
															} else {
																throw (InvalidValueException) accumulator_1;
															}
															break;
														}
														/*@NonInvalid*/ EnumerationLiteralId action_1 = (EnumerationLiteralId) ITERATOR_action_1
																.next();
														/**
														 * action = Action::Collecting
														 */
														final /*@NonInvalid*/ boolean eq = action_1 == PrivacyModelTables.ELITid_Collecting;
														//
														if (eq) { // Normal successful body evaluation result
															exists_0 = ValueUtil.TRUE_VALUE;
															break; // Stop immediately
														} else if (!eq) { // Normal unsuccessful body evaluation result
															; // Carry on
														} else { // Impossible badly typed result
															accumulator_1 = new InvalidValueException(
																	PivotMessages.NonBooleanBody, "exists");
														}
													}
													final /*@Thrown*/ Boolean and;
													if (exists_0 == ValueUtil.FALSE_VALUE) {
														and = ValueUtil.FALSE_VALUE;
													} else {
														final /*@NonInvalid*/ Principal whose = stmt.getWhose();
														final /*@NonInvalid*/ boolean eq_0 = whose == null;
														final /*@NonInvalid*/ Boolean not_0;
														if (!eq_0) {
															not_0 = ValueUtil.TRUE_VALUE;
														} else {
															if (eq_0) {
																not_0 = ValueUtil.FALSE_VALUE;
															} else {
																not_0 = null;
															}
														}
														if (not_0 == ValueUtil.FALSE_VALUE) {
															and = ValueUtil.FALSE_VALUE;
														} else {
															if ((exists_0 == null) || (not_0 == null)) {
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
													/*@Caught*/ Object CAUGHT_or;
													try {
														final /*@NonInvalid*/ Principal who = this.getWho();
														final /*@NonInvalid*/ Principal whose_0 = stmt.getWhose();
														final /*@NonInvalid*/ boolean eq_1 = who.equals(whose_0);
														final /*@Thrown*/ Boolean or;
														if (eq_1) {
															or = ValueUtil.TRUE_VALUE;
														} else {
															/*@Caught*/ Object CAUGHT_exists_1;
															try {
																if (whose_0 == null) {
																	throw new InvalidValueException(
																			"Null source for \'\'http://privacymodel\'::Principal::responsiblePersons\'");
																}
																final /*@Thrown*/ List<Principal> responsiblePersons = whose_0
																		.getResponsiblePersons();
																final /*@Thrown*/ OrderedSetValue BOXED_responsiblePersons = idResolver
																		.createOrderedSetOfAll(
																				PrivacyModelTables.ORD_CLSSid_Principal,
																				responsiblePersons);
																/*@Thrown*/ Object accumulator_2 = ValueUtil.FALSE_VALUE;
																Iterator<Object> ITERATOR_rp = BOXED_responsiblePersons
																		.iterator();
																/*@Thrown*/ Boolean exists_1;
																while (true) {
																	if (!ITERATOR_rp.hasNext()) {
																		if (accumulator_2 == ValueUtil.FALSE_VALUE) {
																			exists_1 = ValueUtil.FALSE_VALUE;
																		} else {
																			throw (InvalidValueException) accumulator_2;
																		}
																		break;
																	}
																	/*@NonInvalid*/ Principal rp = (Principal) ITERATOR_rp
																			.next();
																	/**
																	 * rp = self.who
																	 */
																	final /*@NonInvalid*/ boolean eq_2 = rp.equals(who);
																	//
																	if (eq_2) { // Normal successful body evaluation result
																		exists_1 = ValueUtil.TRUE_VALUE;
																		break; // Stop immediately
																	} else if (!eq_2) { // Normal unsuccessful body evaluation result
																		; // Carry on
																	} else { // Impossible badly typed result
																		accumulator_2 = new InvalidValueException(
																				PivotMessages.NonBooleanBody, "exists");
																	}
																}
																CAUGHT_exists_1 = exists_1;
															} catch (Exception e) {
																CAUGHT_exists_1 = ValueUtil.createInvalidValue(e);
															}
															if (CAUGHT_exists_1 == ValueUtil.TRUE_VALUE) {
																or = ValueUtil.TRUE_VALUE;
															} else {
																if (CAUGHT_exists_1 instanceof InvalidValueException) {
																	throw (InvalidValueException) CAUGHT_exists_1;
																}
																if (CAUGHT_exists_1 == null) {
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
														and_0 = ValueUtil.FALSE_VALUE;
													} else {
														if (CAUGHT_and instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_and;
														}
														if (CAUGHT_or instanceof InvalidValueException) {
															throw (InvalidValueException) CAUGHT_or;
														}
														if ((CAUGHT_and == null) || (CAUGHT_or == null)) {
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
												/*@Caught*/ Object CAUGHT_isDateAfterInterval;
												try {
													final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper = ((PrivacyPolicy) CAUGHT_privacyPolicy)
															.getPrivacyPolicyHelper();
													final /*@NonInvalid*/ AbstractTime when = stmt.getWhen();
													final /*@NonInvalid*/ Date when_0 = this.getWhen();
													final /*@Thrown*/ boolean isDateAfterInterval = privacyPolicyHelper
															.isDateAfterInterval(when, when_0);
													CAUGHT_isDateAfterInterval = isDateAfterInterval;
												} catch (Exception e) {
													CAUGHT_isDateAfterInterval = ValueUtil.createInvalidValue(e);
												}
												if (CAUGHT_isDateAfterInterval == ValueUtil.FALSE_VALUE) {
													and_1 = ValueUtil.FALSE_VALUE;
												} else {
													if (CAUGHT_and_0 instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_and_0;
													}
													if (CAUGHT_isDateAfterInterval instanceof InvalidValueException) {
														throw (InvalidValueException) CAUGHT_isDateAfterInterval;
													}
													if (CAUGHT_and_0 == null) {
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
											final /*@NonInvalid*/ List<SharedPrivacyData> datas = what_0.getDatas();
											final /*@NonInvalid*/ OrderedSetValue BOXED_datas = idResolver
													.createOrderedSetOfAll(
															PrivacyModelTables.ORD_CLSSid_SharedPrivacyData, datas);
											/*@Thrown*/ Object accumulator_3 = ValueUtil.FALSE_VALUE;
											Iterator<Object> ITERATOR_selectedData = BOXED_datas.iterator();
											/*@NonInvalid*/ Boolean exists_2;
											while (true) {
												if (!ITERATOR_selectedData.hasNext()) {
													if (accumulator_3 == ValueUtil.FALSE_VALUE) {
														exists_2 = ValueUtil.FALSE_VALUE;
													} else {
														throw (InvalidValueException) accumulator_3;
													}
													break;
												}
												/*@NonInvalid*/ SharedPrivacyData selectedData = (SharedPrivacyData) ITERATOR_selectedData
														.next();
												/**
												 * selectedData.privacydata = data
												 */
												final /*@NonInvalid*/ PrivacyData privacydata = selectedData
														.getPrivacydata();
												final /*@NonInvalid*/ boolean eq_3 = privacydata.equals(data);
												//
												if (eq_3) { // Normal successful body evaluation result
													exists_2 = ValueUtil.TRUE_VALUE;
													break; // Stop immediately
												} else if (!eq_3) { // Normal unsuccessful body evaluation result
													; // Carry on
												} else { // Impossible badly typed result
													accumulator_3 = new InvalidValueException(
															PivotMessages.NonBooleanBody, "exists");
												}
											}
											if (exists_2 == ValueUtil.FALSE_VALUE) {
												and_2 = ValueUtil.FALSE_VALUE;
											} else {
												if (CAUGHT_and_1 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_and_1;
												}
												if ((CAUGHT_and_1 == null) || (exists_2 == null)) {
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
									//
									if (CAUGHT_and_2 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
										exists = ValueUtil.TRUE_VALUE;
										break; // Stop immediately
									} else if (CAUGHT_and_2 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
										; // Carry on
									} else if (CAUGHT_and_2 == null) { // Abnormal null body evaluation result
										if (accumulator_0 == ValueUtil.FALSE_VALUE) {
											accumulator_0 = null; // Cache a null failure
										}
									} else if (CAUGHT_and_2 instanceof InvalidValueException) { // Abnormal exception evaluation result
										accumulator_0 = CAUGHT_and_2; // Cache an exception failure
									} else { // Impossible badly typed result
										accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
												"exists");
									}
								}
								CAUGHT_exists = exists;
							} catch (Exception e) {
								CAUGHT_exists = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_exists == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								forAll = ValueUtil.FALSE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_exists == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								; // Carry on
							} else if (CAUGHT_exists == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.TRUE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else if (CAUGHT_exists instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator = CAUGHT_exists; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
							}
						}
						local_0 = forAll;
					}
					final /*@Thrown*/ boolean eq_4 = local_0 == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_4) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art11, local_0);
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
	public boolean StopProcessingShouldBeExecutedAsSoonAsPossible(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::StopProcessingShouldBeExecutedAsSoonAsPossible";
		try {
			/**
			 *
			 * inv StopProcessingShouldBeExecutedAsSoonAsPossible:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = let
			 *             privacyPolicy : PrivacyPolicy[1] = PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *           in
			 *             if
			 *               not self.action.oclIsKindOf(ComplaintBasedOnAction)
			 *             then true
			 *             else
			 *               let
			 *                 basedOnAction : ComplaintBasedOnAction[1] = self.action.oclAsType(ComplaintBasedOnAction)
			 *               in
			 *                 if
			 *                   not (basedOnAction.denialReason = null
			 *                   )
			 *                 then true
			 *                 else
			 *                   privacyPolicy.policyStatements->exists(stmt |
			 *                     stmt.what.actions->exists(action | action = Action::StopProcessing) and
			 *                     not (stmt.causedBy = null
			 *                     ) and stmt.causedBy = self)
			 *                 endif
			 *             endif
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
					PrivacyModelPackage.Literals.COMPLAINT___STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_3;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
							.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
					final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
							executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
							TYP_privacyModel_c_c_PrivacyPolicy_0);
					final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
							.evaluate(allInstances);
					final /*@Thrown*/ PrivacyPolicy privacyPolicy = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
							.evaluate(asSequence);
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_ComplaintBasedOnAction_0 = idResolver
							.getClass(PrivacyModelTables.CLSSid_ComplaintBasedOnAction, null);
					final /*@NonInvalid*/ AbstractComplaintAction action = this.getAction();
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnAction_0).booleanValue();
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsKindOf) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsKindOf) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					if (not == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean local_1;
					if (not) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_basedOnAction;
						try {
							final /*@Thrown*/ ComplaintBasedOnAction basedOnAction = (ComplaintBasedOnAction) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnAction_0);
							CAUGHT_basedOnAction = basedOnAction;
						} catch (Exception e) {
							CAUGHT_basedOnAction = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ Object CAUGHT_eq;
						try {
							if (CAUGHT_basedOnAction instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_basedOnAction;
							}
							final /*@Thrown*/ Denial denialReason = ((ComplaintBasedOnAction) CAUGHT_basedOnAction)
									.getDenialReason();
							final /*@Thrown*/ boolean eq = denialReason == null;
							CAUGHT_eq = eq;
						} catch (Exception e) {
							CAUGHT_eq = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_eq instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq;
						}
						final /*@Thrown*/ Boolean not_0;
						if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
							not_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
								not_0 = ValueUtil.FALSE_VALUE;
							} else {
								not_0 = null;
							}
						}
						if (not_0 == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@Thrown*/ Boolean local_0;
						if (not_0) {
							local_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (privacyPolicy == null) {
								throw new InvalidValueException(
										"Null source for \'\'http://privacymodel\'::PrivacyPolicy::policyStatements\'");
							}
							final /*@Thrown*/ List<PolicyStatement> policyStatements = privacyPolicy
									.getPolicyStatements();
							final /*@Thrown*/ OrderedSetValue BOXED_policyStatements = idResolver.createOrderedSetOfAll(
									PrivacyModelTables.ORD_CLSSid_PolicyStatement, policyStatements);
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_stmt = BOXED_policyStatements.iterator();
							/*@Thrown*/ Boolean exists;
							while (true) {
								if (!ITERATOR_stmt.hasNext()) {
									if (accumulator == null) {
										exists = null;
									} else if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ PolicyStatement stmt = (PolicyStatement) ITERATOR_stmt.next();
								/**
								 *
								 * stmt.what.actions->exists(action | action = Action::StopProcessing) and
								 * not (stmt.causedBy = null
								 * ) and stmt.causedBy = self
								 */
								/*@Caught*/ Object CAUGHT_and_0;
								try {
									final /*@NonInvalid*/ Complaint causedBy_0 = stmt.getCausedBy();
									/*@Caught*/ Object CAUGHT_and;
									try {
										final /*@NonInvalid*/ What what = stmt.getWhat();
										final /*@NonInvalid*/ List<Action> actions = what.getActions();
										final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
												.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action, actions);
										/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
										Iterator<Object> ITERATOR_action_1 = BOXED_actions.iterator();
										/*@NonInvalid*/ Boolean exists_0;
										while (true) {
											if (!ITERATOR_action_1.hasNext()) {
												if (accumulator_0 == ValueUtil.FALSE_VALUE) {
													exists_0 = ValueUtil.FALSE_VALUE;
												} else {
													throw (InvalidValueException) accumulator_0;
												}
												break;
											}
											/*@NonInvalid*/ EnumerationLiteralId action_1 = (EnumerationLiteralId) ITERATOR_action_1
													.next();
											/**
											 * action = Action::StopProcessing
											 */
											final /*@NonInvalid*/ boolean eq_0 = action_1 == PrivacyModelTables.ELITid_StopProcessing;
											//
											if (eq_0) { // Normal successful body evaluation result
												exists_0 = ValueUtil.TRUE_VALUE;
												break; // Stop immediately
											} else if (!eq_0) { // Normal unsuccessful body evaluation result
												; // Carry on
											} else { // Impossible badly typed result
												accumulator_0 = new InvalidValueException(PivotMessages.NonBooleanBody,
														"exists");
											}
										}
										final /*@Thrown*/ Boolean and;
										if (exists_0 == ValueUtil.FALSE_VALUE) {
											and = ValueUtil.FALSE_VALUE;
										} else {
											final /*@NonInvalid*/ boolean eq_1 = causedBy_0 == null;
											final /*@NonInvalid*/ Boolean not_1;
											if (!eq_1) {
												not_1 = ValueUtil.TRUE_VALUE;
											} else {
												if (eq_1) {
													not_1 = ValueUtil.FALSE_VALUE;
												} else {
													not_1 = null;
												}
											}
											if (not_1 == ValueUtil.FALSE_VALUE) {
												and = ValueUtil.FALSE_VALUE;
											} else {
												if ((exists_0 == null) || (not_1 == null)) {
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
										final /*@NonInvalid*/ boolean eq_2 = this.equals(causedBy_0);
										if (!eq_2) {
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
								//
								if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (CAUGHT_and_0 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else if (CAUGHT_and_0 == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.FALSE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else if (CAUGHT_and_0 instanceof InvalidValueException) { // Abnormal exception evaluation result
									accumulator = CAUGHT_and_0; // Cache an exception failure
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							local_0 = exists;
						}
						local_1 = local_0;
					}
					final /*@Thrown*/ boolean eq_3 = local_1 == Boolean.TRUE;
					/*@Thrown*/ Object local_3;
					if (eq_3) {
						local_3 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_2 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art21, local_1);
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
	public boolean UserDoesntHavePermissionToWithdrawConsent(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::UserDoesntHavePermissionToWithdrawConsent";
		try {
			/**
			 *
			 * inv UserDoesntHavePermissionToWithdrawConsent:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             not self.action.oclIsKindOf(Withdraw)
			 *           then true
			 *           else
			 *             let
			 *               withdraw : Withdraw[1] = self.action.oclAsType(Withdraw)
			 *             in self.who = withdraw.subject.providedBy or
			 *               withdraw.subject.providedBy.responsiblePersons->exists(rp | rp = self.who)
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
					PrivacyModelPackage.Literals.COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_Withdraw_0 = idResolver
							.getClass(PrivacyModelTables.CLSSid_Withdraw, null);
					final /*@NonInvalid*/ AbstractComplaintAction action = this.getAction();
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, action, TYP_privacyModel_c_c_Withdraw_0).booleanValue();
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsKindOf) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsKindOf) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					if (not == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (not) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_withdraw;
						try {
							final /*@Thrown*/ Withdraw withdraw = (Withdraw) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, action, TYP_privacyModel_c_c_Withdraw_0);
							CAUGHT_withdraw = withdraw;
						} catch (Exception e) {
							CAUGHT_withdraw = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ Object CAUGHT_eq;
						try {
							final /*@NonInvalid*/ Principal who = this.getWho();
							if (CAUGHT_withdraw instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_withdraw;
							}
							final /*@Thrown*/ Consent subject = ((Withdraw) CAUGHT_withdraw).getSubject();
							final /*@Thrown*/ Principal providedBy = subject.getProvidedBy();
							final /*@Thrown*/ boolean eq = who.equals(providedBy);
							CAUGHT_eq = eq;
						} catch (Exception e) {
							CAUGHT_eq = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or;
						if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_exists;
							try {
								if (CAUGHT_withdraw instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_withdraw;
								}
								final /*@Thrown*/ Consent subject_0 = ((Withdraw) CAUGHT_withdraw).getSubject();
								final /*@Thrown*/ Principal providedBy_0 = subject_0.getProvidedBy();
								final /*@Thrown*/ List<Principal> responsiblePersons = providedBy_0
										.getResponsiblePersons();
								final /*@Thrown*/ OrderedSetValue BOXED_responsiblePersons = idResolver
										.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal,
												responsiblePersons);
								/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
								Iterator<Object> ITERATOR_rp = BOXED_responsiblePersons.iterator();
								/*@Thrown*/ Boolean exists;
								while (true) {
									if (!ITERATOR_rp.hasNext()) {
										if (accumulator == ValueUtil.FALSE_VALUE) {
											exists = ValueUtil.FALSE_VALUE;
										} else {
											throw (InvalidValueException) accumulator;
										}
										break;
									}
									/*@NonInvalid*/ Principal rp = (Principal) ITERATOR_rp.next();
									/**
									 * rp = self.who
									 */
									final /*@NonInvalid*/ Principal who_0 = this.getWho();
									final /*@NonInvalid*/ boolean eq_0 = rp.equals(who_0);
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
								CAUGHT_exists = exists;
							} catch (Exception e) {
								CAUGHT_exists = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
								or = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_eq instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_eq;
								}
								if (CAUGHT_exists instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_exists;
								}
								if (CAUGHT_exists == null) {
									or = null;
								} else {
									or = ValueUtil.FALSE_VALUE;
								}
							}
						}
						status = or;
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_1) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art7, status);
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
	public boolean ErasureShouldBeExecutedAsSoonAsPossible(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::ErasureShouldBeExecutedAsSoonAsPossible";
		try {
			/**
			 *
			 * inv ErasureShouldBeExecutedAsSoonAsPossible:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = doesPolicyStatementExists(Action::Erasure, ComplaintBasedOnDataType::Erasure)
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
					PrivacyModelPackage.Literals.COMPLAINT___ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ Action ECORE_ELITid_Erasure = (Action) idResolver.ecoreValueOf(Enumerator.class,
						PrivacyModelTables.ELITid_Erasure);
				final /*@NonInvalid*/ ComplaintBasedOnDataType ECORE_ELITid_Erasure_0 = (ComplaintBasedOnDataType) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_Erasure_0);
				final /*@NonInvalid*/ boolean status = this.doesPolicyStatementExists(ECORE_ELITid_Erasure,
						ECORE_ELITid_Erasure_0);
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
	public boolean WithdrawConsentShouldBeExecutedAsSoonAsPossible(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::WithdrawConsentShouldBeExecutedAsSoonAsPossible";
		try {
			/**
			 *
			 * inv WithdrawConsentShouldBeExecutedAsSoonAsPossible:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = let
			 *             privacyPolicy : PrivacyPolicy[1] = PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *           in
			 *             if not self.action.oclIsKindOf(Withdraw)
			 *             then true
			 *             else
			 *               privacyPolicy.policyStatements->exists(stmt |
			 *                 stmt.what.actions->exists(action | action = Action::StopProcessing) and
			 *                 not (stmt.whose = null
			 *                 ) and stmt.whose = self.who and
			 *                 privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(stmt.when, self.when) and
			 *                 not (stmt.causedBy = null
			 *                 ) and stmt.causedBy = self)
			 *             endif
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
					PrivacyModelPackage.Literals.COMPLAINT___WITHDRAW_CONSENT_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					/*@Caught*/ Object CAUGHT_privacyPolicy;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
								.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
						final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
								executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
								TYP_privacyModel_c_c_PrivacyPolicy_0);
						final /*@NonInvalid*/ SequenceValue asSequence = CollectionAsSequenceOperation.INSTANCE
								.evaluate(allInstances);
						final /*@Thrown*/ PrivacyPolicy privacyPolicy = (PrivacyPolicy) OrderedCollectionFirstOperation.INSTANCE
								.evaluate(asSequence);
						CAUGHT_privacyPolicy = privacyPolicy;
					} catch (Exception e) {
						CAUGHT_privacyPolicy = ValueUtil.createInvalidValue(e);
					}
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_Withdraw_0 = idResolver
							.getClass(PrivacyModelTables.CLSSid_Withdraw, null);
					final /*@NonInvalid*/ AbstractComplaintAction action = this.getAction();
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, action, TYP_privacyModel_c_c_Withdraw_0).booleanValue();
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsKindOf) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsKindOf) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					if (not == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean local_0;
					if (not) {
						local_0 = ValueUtil.TRUE_VALUE;
					} else {
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
								.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_PolicyStatement, policyStatements);
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_stmt = BOXED_policyStatements.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_stmt.hasNext()) {
								if (accumulator == null) {
									exists = null;
								} else if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ PolicyStatement stmt = (PolicyStatement) ITERATOR_stmt.next();
							/**
							 *
							 * stmt.what.actions->exists(action | action = Action::StopProcessing) and
							 * not (stmt.whose = null
							 * ) and stmt.whose = self.who and
							 * privacyPolicy.privacyPolicyHelper.isDateBeforeInterval(stmt.when, self.when) and
							 * not (stmt.causedBy = null
							 * ) and stmt.causedBy = self
							 */
							/*@Caught*/ Object CAUGHT_and_3;
							try {
								final /*@NonInvalid*/ Complaint causedBy_0 = stmt.getCausedBy();
								/*@Caught*/ Object CAUGHT_and_2;
								try {
									/*@Caught*/ Object CAUGHT_and_1;
									try {
										/*@Caught*/ Object CAUGHT_and_0;
										try {
											final /*@NonInvalid*/ Principal whose_0 = stmt.getWhose();
											/*@Caught*/ Object CAUGHT_and;
											try {
												final /*@NonInvalid*/ What what = stmt.getWhat();
												final /*@NonInvalid*/ List<Action> actions = what.getActions();
												final /*@NonInvalid*/ OrderedSetValue BOXED_actions = idResolver
														.createOrderedSetOfAll(PrivacyModelTables.ORD_ENUMid_Action,
																actions);
												/*@Thrown*/ Object accumulator_0 = ValueUtil.FALSE_VALUE;
												Iterator<Object> ITERATOR_action_0 = BOXED_actions.iterator();
												/*@NonInvalid*/ Boolean exists_0;
												while (true) {
													if (!ITERATOR_action_0.hasNext()) {
														if (accumulator_0 == ValueUtil.FALSE_VALUE) {
															exists_0 = ValueUtil.FALSE_VALUE;
														} else {
															throw (InvalidValueException) accumulator_0;
														}
														break;
													}
													/*@NonInvalid*/ EnumerationLiteralId action_0 = (EnumerationLiteralId) ITERATOR_action_0
															.next();
													/**
													 * action = Action::StopProcessing
													 */
													final /*@NonInvalid*/ boolean eq = action_0 == PrivacyModelTables.ELITid_StopProcessing;
													//
													if (eq) { // Normal successful body evaluation result
														exists_0 = ValueUtil.TRUE_VALUE;
														break; // Stop immediately
													} else if (!eq) { // Normal unsuccessful body evaluation result
														; // Carry on
													} else { // Impossible badly typed result
														accumulator_0 = new InvalidValueException(
																PivotMessages.NonBooleanBody, "exists");
													}
												}
												final /*@Thrown*/ Boolean and;
												if (exists_0 == ValueUtil.FALSE_VALUE) {
													and = ValueUtil.FALSE_VALUE;
												} else {
													final /*@NonInvalid*/ boolean eq_0 = whose_0 == null;
													final /*@NonInvalid*/ Boolean not_0;
													if (!eq_0) {
														not_0 = ValueUtil.TRUE_VALUE;
													} else {
														if (eq_0) {
															not_0 = ValueUtil.FALSE_VALUE;
														} else {
															not_0 = null;
														}
													}
													if (not_0 == ValueUtil.FALSE_VALUE) {
														and = ValueUtil.FALSE_VALUE;
													} else {
														if ((exists_0 == null) || (not_0 == null)) {
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
												final /*@NonInvalid*/ boolean eq_1 = who.equals(whose_0);
												if (!eq_1) {
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
											/*@Caught*/ Object CAUGHT_isDateBeforeInterval;
											try {
												final /*@Thrown*/ PrivacyPolicyHelper privacyPolicyHelper = ((PrivacyPolicy) CAUGHT_privacyPolicy)
														.getPrivacyPolicyHelper();
												final /*@NonInvalid*/ AbstractTime when = stmt.getWhen();
												final /*@NonInvalid*/ Date when_0 = this.getWhen();
												final /*@Thrown*/ boolean isDateBeforeInterval = privacyPolicyHelper
														.isDateBeforeInterval(when, when_0);
												CAUGHT_isDateBeforeInterval = isDateBeforeInterval;
											} catch (Exception e) {
												CAUGHT_isDateBeforeInterval = ValueUtil.createInvalidValue(e);
											}
											if (CAUGHT_isDateBeforeInterval == ValueUtil.FALSE_VALUE) {
												and_1 = ValueUtil.FALSE_VALUE;
											} else {
												if (CAUGHT_and_0 instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_and_0;
												}
												if (CAUGHT_isDateBeforeInterval instanceof InvalidValueException) {
													throw (InvalidValueException) CAUGHT_isDateBeforeInterval;
												}
												if (CAUGHT_and_0 == null) {
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
										final /*@NonInvalid*/ boolean eq_2 = causedBy_0 == null;
										final /*@NonInvalid*/ Boolean not_1;
										if (!eq_2) {
											not_1 = ValueUtil.TRUE_VALUE;
										} else {
											if (eq_2) {
												not_1 = ValueUtil.FALSE_VALUE;
											} else {
												not_1 = null;
											}
										}
										if (not_1 == ValueUtil.FALSE_VALUE) {
											and_2 = ValueUtil.FALSE_VALUE;
										} else {
											if (CAUGHT_and_1 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_and_1;
											}
											if ((CAUGHT_and_1 == null) || (not_1 == null)) {
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
									final /*@NonInvalid*/ boolean eq_3 = this.equals(causedBy_0);
									if (!eq_3) {
										and_3 = ValueUtil.FALSE_VALUE;
									} else {
										if (CAUGHT_and_2 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_and_2;
										}
										if (CAUGHT_and_2 == null) {
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
							//
							if (CAUGHT_and_3 == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_and_3 == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (CAUGHT_and_3 == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.FALSE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else if (CAUGHT_and_3 instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator = CAUGHT_and_3; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						local_0 = exists;
					}
					final /*@Thrown*/ boolean eq_4 = local_0 == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_4) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art7, local_0);
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
	public boolean SubjectShouldBeNotifiedAboutExistingComplaintForErasure(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::SubjectShouldBeNotifiedAboutExistingComplaintForErasure";
		try {
			/**
			 *
			 * inv SubjectShouldBeNotifiedAboutExistingComplaintForErasure:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             self.action.oclIsKindOf(ComplaintBasedOnData)
			 *           then
			 *             let
			 *               basedOnData : ComplaintBasedOnData[1] = self.action.oclAsType(ComplaintBasedOnData)
			 *             in
			 *               if basedOnData.type = ComplaintBasedOnDataType::Erasure
			 *               then
			 *                 PrivacyPolicy.allInstances()
			 *                 ->asSequence()
			 *                 ->first()
			 *                 .notifications->exists(notification | notification.causedBy = self and notification.type = NotificationType::Erasure)
			 *               else true
			 *               endif
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
					PrivacyModelPackage.Literals.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_ComplaintBasedOnData_0 = idResolver
							.getClass(PrivacyModelTables.CLSSid_ComplaintBasedOnData, null);
					final /*@NonInvalid*/ AbstractComplaintAction action = this.getAction();
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnData_0).booleanValue();
					/*@Thrown*/ Boolean status;
					if (oclIsKindOf) {
						final /*@Thrown*/ ComplaintBasedOnData basedOnData = (ComplaintBasedOnData) OclAnyOclAsTypeOperation.INSTANCE
								.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnData_0);
						final /*@Thrown*/ ComplaintBasedOnDataType type = basedOnData.getType();
						final /*@Thrown*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_ComplaintBasedOnDataType
								.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
						final /*@Thrown*/ boolean eq = BOXED_type == PrivacyModelTables.ELITid_Erasure_0;
						/*@Thrown*/ Boolean local_0;
						if (eq) {
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
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_notification = BOXED_notifications.iterator();
							/*@Thrown*/ Boolean exists;
							while (true) {
								if (!ITERATOR_notification.hasNext()) {
									if (accumulator == null) {
										exists = null;
									} else if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ privacyModel.Notification notification = (privacyModel.Notification) ITERATOR_notification
										.next();
								/**
								 * notification.causedBy = self and notification.type = NotificationType::Erasure
								 */
								final /*@NonInvalid*/ NotificationInfo causedBy = notification.getCausedBy();
								final /*@NonInvalid*/ boolean eq_0 = causedBy.equals(this);
								final /*@NonInvalid*/ Boolean and;
								if (!eq_0) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ NotificationType type_0 = notification.getType();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = PrivacyModelTables.ENUMid_NotificationType
											.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
									final /*@NonInvalid*/ boolean eq_1 = BOXED_type_0 == PrivacyModelTables.ELITid_Erasure_1;
									if (!eq_1) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
								//
								if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else if (and == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.FALSE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							local_0 = exists;
						} else {
							local_0 = ValueUtil.TRUE_VALUE;
						}
						status = local_0;
					} else {
						status = ValueUtil.TRUE_VALUE;
					}
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_2) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art19, status);
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
	public boolean RectificationShouldBeExecutedAsSoonAsPossible(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::RectificationShouldBeExecutedAsSoonAsPossible";
		try {
			/**
			 *
			 * inv RectificationShouldBeExecutedAsSoonAsPossible:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = doesPolicyStatementExists(Action::Rectification, ComplaintBasedOnDataType::Rectification)
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
					PrivacyModelPackage.Literals.COMPLAINT___RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ Action ECORE_ELITid_Rectification = (Action) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_Rectification);
				final /*@NonInvalid*/ ComplaintBasedOnDataType ECORE_ELITid_Rectification_0 = (ComplaintBasedOnDataType) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_Rectification_0);
				final /*@NonInvalid*/ boolean status = this.doesPolicyStatementExists(ECORE_ELITid_Rectification,
						ECORE_ELITid_Rectification_0);
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
	public boolean InvalidTypeOfPurposeForAnObject(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::InvalidTypeOfPurposeForAnObject";
		try {
			/**
			 *
			 * inv InvalidTypeOfPurposeForAnObject:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             not self.action.oclIsKindOf(ComplaintBasedOnAction)
			 *           then true
			 *           else
			 *             let
			 *               basedOnAction : ComplaintBasedOnAction[1] = self.action.oclAsType(ComplaintBasedOnAction)
			 *             in
			 *               if basedOnAction.statement.why = null or
			 *                 not (basedOnAction.denialReason = null
			 *                 )
			 *               then true
			 *               else
			 *                 not basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::PublicInterest,
			 *                   Sequence{ProcessingReasonSubtype::Prevention, ProcessingReasonSubtype::Investigation, ProcessingReasonSubtype::Detection, ProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats, ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other
			 *                   }) and
			 *                 (
			 *                   basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Marketing,
			 *                     Sequence{ProcessingReasonSubtype::None
			 *                     }) or
			 *                   basedOnAction.statement.why.containsAllowedPurposeReasonAndSubreason(ProcessingReason::Profiling,
			 *                     Sequence{ProcessingReasonSubtype::None
			 *                     })
			 *                 )
			 *               endif
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
					PrivacyModelPackage.Literals.COMPLAINT___INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_ComplaintBasedOnAction = idResolver
							.getClass(PrivacyModelTables.CLSSid_ComplaintBasedOnAction, null);
					final /*@NonInvalid*/ AbstractComplaintAction action = this.getAction();
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnAction).booleanValue();
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsKindOf) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsKindOf) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					if (not == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (not) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_basedOnAction;
						try {
							final /*@Thrown*/ ComplaintBasedOnAction basedOnAction = (ComplaintBasedOnAction) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnAction);
							CAUGHT_basedOnAction = basedOnAction;
						} catch (Exception e) {
							CAUGHT_basedOnAction = ValueUtil.createInvalidValue(e);
						}
						final /*@Thrown*/ Boolean or;
						/*@Caught*/ Object CAUGHT_not_0;
						try {
							/*@Caught*/ Object CAUGHT_eq;
							try {
								if (CAUGHT_basedOnAction instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_basedOnAction;
								}
								final /*@Thrown*/ Denial denialReason = ((ComplaintBasedOnAction) CAUGHT_basedOnAction)
										.getDenialReason();
								final /*@Thrown*/ boolean eq = denialReason == null;
								CAUGHT_eq = eq;
							} catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq;
							}
							final /*@Thrown*/ Boolean not_0;
							if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
								not_0 = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
									not_0 = ValueUtil.FALSE_VALUE;
								} else {
									not_0 = null;
								}
							}
							CAUGHT_not_0 = not_0;
						} catch (Exception e) {
							CAUGHT_not_0 = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_not_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_not_0;
						}
						or = (Boolean) CAUGHT_not_0;
						if (or == null) {
							throw new InvalidValueException("Null if condition");
						}
						/*@Thrown*/ Boolean local_0;
						if (or) {
							local_0 = ValueUtil.TRUE_VALUE;
						} else {
							/*@Caught*/ Object CAUGHT_not_1;
							try {
								/*@Caught*/ Object CAUGHT_containsAllowedPurposeReasonAndSubreason;
								try {
									if (CAUGHT_basedOnAction instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_basedOnAction;
									}
									final /*@Thrown*/ PolicyStatement statement = ((ComplaintBasedOnAction) CAUGHT_basedOnAction)
											.getStatement();
									final /*@Thrown*/ Purpose why = statement.getWhy();
									final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_PublicInterest = (ProcessingReason) idResolver
											.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_PublicInterest);
									final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_15 = ((IdResolverExtension) idResolver)
											.ecoreValueOfAll(ProcessingReasonSubtype.class,
													PrivacyModelTables.Sequence_6);
									final /*@Thrown*/ boolean containsAllowedPurposeReasonAndSubreason = why
											.containsAllowedPurposeReasonAndSubreason(ECORE_ELITid_PublicInterest,
													(EList<ProcessingReasonSubtype>) ECORE_Sequence_15);
									CAUGHT_containsAllowedPurposeReasonAndSubreason = containsAllowedPurposeReasonAndSubreason;
								} catch (Exception e) {
									CAUGHT_containsAllowedPurposeReasonAndSubreason = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_containsAllowedPurposeReasonAndSubreason instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_containsAllowedPurposeReasonAndSubreason;
								}
								final /*@Thrown*/ Boolean not_1;
								if (CAUGHT_containsAllowedPurposeReasonAndSubreason == ValueUtil.FALSE_VALUE) {
									not_1 = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_containsAllowedPurposeReasonAndSubreason == ValueUtil.TRUE_VALUE) {
										not_1 = ValueUtil.FALSE_VALUE;
									} else {
										not_1 = null;
									}
								}
								CAUGHT_not_1 = not_1;
							} catch (Exception e) {
								CAUGHT_not_1 = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean and;
							if (CAUGHT_not_1 == ValueUtil.FALSE_VALUE) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_or_0;
								try {
									/*@Caught*/ Object CAUGHT_containsAllowedPurposeReasonAndSubreason_0;
									try {
										if (CAUGHT_basedOnAction instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_basedOnAction;
										}
										final /*@Thrown*/ PolicyStatement statement_0 = ((ComplaintBasedOnAction) CAUGHT_basedOnAction)
												.getStatement();
										final /*@Thrown*/ Purpose why_0 = statement_0.getWhy();
										final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_Marketing = (ProcessingReason) idResolver
												.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_Marketing);
										final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_16 = ((IdResolverExtension) idResolver)
												.ecoreValueOfAll(ProcessingReasonSubtype.class,
														PrivacyModelTables.Sequence_4);
										final /*@Thrown*/ boolean containsAllowedPurposeReasonAndSubreason_0 = why_0
												.containsAllowedPurposeReasonAndSubreason(ECORE_ELITid_Marketing,
														(EList<ProcessingReasonSubtype>) ECORE_Sequence_16);
										CAUGHT_containsAllowedPurposeReasonAndSubreason_0 = containsAllowedPurposeReasonAndSubreason_0;
									} catch (Exception e) {
										CAUGHT_containsAllowedPurposeReasonAndSubreason_0 = ValueUtil
												.createInvalidValue(e);
									}
									final /*@Thrown*/ Boolean or_0;
									if (CAUGHT_containsAllowedPurposeReasonAndSubreason_0 == ValueUtil.TRUE_VALUE) {
										or_0 = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_containsAllowedPurposeReasonAndSubreason_1;
										try {
											if (CAUGHT_basedOnAction instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_basedOnAction;
											}
											final /*@Thrown*/ PolicyStatement statement_1 = ((ComplaintBasedOnAction) CAUGHT_basedOnAction)
													.getStatement();
											final /*@Thrown*/ Purpose why_1 = statement_1.getWhy();
											final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_Profiling = (ProcessingReason) idResolver
													.ecoreValueOf(Enumerator.class,
															PrivacyModelTables.ELITid_Profiling);
											final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_17 = ((IdResolverExtension) idResolver)
													.ecoreValueOfAll(ProcessingReasonSubtype.class,
															PrivacyModelTables.Sequence_4);
											final /*@Thrown*/ boolean containsAllowedPurposeReasonAndSubreason_1 = why_1
													.containsAllowedPurposeReasonAndSubreason(ECORE_ELITid_Profiling,
															(EList<ProcessingReasonSubtype>) ECORE_Sequence_17);
											CAUGHT_containsAllowedPurposeReasonAndSubreason_1 = containsAllowedPurposeReasonAndSubreason_1;
										} catch (Exception e) {
											CAUGHT_containsAllowedPurposeReasonAndSubreason_1 = ValueUtil
													.createInvalidValue(e);
										}
										if (CAUGHT_containsAllowedPurposeReasonAndSubreason_1 == ValueUtil.TRUE_VALUE) {
											or_0 = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_containsAllowedPurposeReasonAndSubreason_0 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_containsAllowedPurposeReasonAndSubreason_0;
											}
											if (CAUGHT_containsAllowedPurposeReasonAndSubreason_1 instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_containsAllowedPurposeReasonAndSubreason_1;
											}
											or_0 = ValueUtil.FALSE_VALUE;
										}
									}
									CAUGHT_or_0 = or_0;
								} catch (Exception e) {
									CAUGHT_or_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_or_0 == ValueUtil.FALSE_VALUE) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									if (CAUGHT_not_1 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_not_1;
									}
									if (CAUGHT_or_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_or_0;
									}
									if ((CAUGHT_not_1 == null) || (CAUGHT_or_0 == null)) {
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
					final /*@Thrown*/ boolean eq_0 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_0) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art21, status);
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
	public boolean UserDoesntHavePermissionToComplaint(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::UserDoesntHavePermissionToComplaint";
		try {
			/**
			 *
			 * inv UserDoesntHavePermissionToComplaint:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             not self.action.oclIsKindOf(ComplaintBasedOnAction)
			 *           then true
			 *           else
			 *             let
			 *               basedOnAction : ComplaintBasedOnAction[1] = self.action.oclAsType(ComplaintBasedOnAction)
			 *             in
			 *               not (basedOnAction.statement.whose = null
			 *               ) and
			 *               (basedOnAction.statement.whose = self.who or
			 *                 basedOnAction.statement.whose.responsiblePersons->exists(rp | rp = self.who)
			 *               )
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
					PrivacyModelPackage.Literals.COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_ComplaintBasedOnAction_0 = idResolver
							.getClass(PrivacyModelTables.CLSSid_ComplaintBasedOnAction, null);
					final /*@NonInvalid*/ AbstractComplaintAction action = this.getAction();
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnAction_0).booleanValue();
					final /*@NonInvalid*/ Boolean not;
					if (!oclIsKindOf) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (oclIsKindOf) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					if (not == null) {
						throw new InvalidValueException("Null if condition");
					}
					/*@Thrown*/ Boolean status;
					if (not) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_basedOnAction;
						try {
							final /*@Thrown*/ ComplaintBasedOnAction basedOnAction = (ComplaintBasedOnAction) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnAction_0);
							CAUGHT_basedOnAction = basedOnAction;
						} catch (Exception e) {
							CAUGHT_basedOnAction = ValueUtil.createInvalidValue(e);
						}
						/*@Caught*/ Object CAUGHT_not_0;
						try {
							/*@Caught*/ Object CAUGHT_eq;
							try {
								if (CAUGHT_basedOnAction instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_basedOnAction;
								}
								final /*@Thrown*/ PolicyStatement statement = ((ComplaintBasedOnAction) CAUGHT_basedOnAction)
										.getStatement();
								final /*@Thrown*/ Principal whose = statement.getWhose();
								final /*@Thrown*/ boolean eq = whose == null;
								CAUGHT_eq = eq;
							} catch (Exception e) {
								CAUGHT_eq = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_eq instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_eq;
							}
							final /*@Thrown*/ Boolean not_0;
							if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
								not_0 = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_eq == ValueUtil.TRUE_VALUE) {
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
							/*@Caught*/ Object CAUGHT_or;
							try {
								/*@Caught*/ Object CAUGHT_eq_0;
								try {
									if (CAUGHT_basedOnAction instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_basedOnAction;
									}
									final /*@Thrown*/ PolicyStatement statement_0 = ((ComplaintBasedOnAction) CAUGHT_basedOnAction)
											.getStatement();
									final /*@Thrown*/ Principal whose_0 = statement_0.getWhose();
									final /*@NonInvalid*/ Principal who = this.getWho();
									final /*@Thrown*/ boolean eq_0 = who.equals(whose_0);
									CAUGHT_eq_0 = eq_0;
								} catch (Exception e) {
									CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
								}
								final /*@Thrown*/ Boolean or;
								if (CAUGHT_eq_0 == ValueUtil.TRUE_VALUE) {
									or = ValueUtil.TRUE_VALUE;
								} else {
									/*@Caught*/ Object CAUGHT_exists;
									try {
										if (CAUGHT_basedOnAction instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_basedOnAction;
										}
										final /*@Thrown*/ PolicyStatement statement_1 = ((ComplaintBasedOnAction) CAUGHT_basedOnAction)
												.getStatement();
										final /*@Thrown*/ Principal whose_1 = statement_1.getWhose();
										if (whose_1 == null) {
											throw new InvalidValueException(
													"Null source for \'\'http://privacymodel\'::Principal::responsiblePersons\'");
										}
										final /*@Thrown*/ List<Principal> responsiblePersons = whose_1
												.getResponsiblePersons();
										final /*@Thrown*/ OrderedSetValue BOXED_responsiblePersons = idResolver
												.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal,
														responsiblePersons);
										/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
										Iterator<Object> ITERATOR_rp = BOXED_responsiblePersons.iterator();
										/*@Thrown*/ Boolean exists;
										while (true) {
											if (!ITERATOR_rp.hasNext()) {
												if (accumulator == ValueUtil.FALSE_VALUE) {
													exists = ValueUtil.FALSE_VALUE;
												} else {
													throw (InvalidValueException) accumulator;
												}
												break;
											}
											/*@NonInvalid*/ Principal rp = (Principal) ITERATOR_rp.next();
											/**
											 * rp = self.who
											 */
											final /*@NonInvalid*/ Principal who_0 = this.getWho();
											final /*@NonInvalid*/ boolean eq_1 = rp.equals(who_0);
											//
											if (eq_1) { // Normal successful body evaluation result
												exists = ValueUtil.TRUE_VALUE;
												break; // Stop immediately
											} else if (!eq_1) { // Normal unsuccessful body evaluation result
												; // Carry on
											} else { // Impossible badly typed result
												accumulator = new InvalidValueException(PivotMessages.NonBooleanBody,
														"exists");
											}
										}
										CAUGHT_exists = exists;
									} catch (Exception e) {
										CAUGHT_exists = ValueUtil.createInvalidValue(e);
									}
									if (CAUGHT_exists == ValueUtil.TRUE_VALUE) {
										or = ValueUtil.TRUE_VALUE;
									} else {
										if (CAUGHT_eq_0 instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_eq_0;
										}
										if (CAUGHT_exists instanceof InvalidValueException) {
											throw (InvalidValueException) CAUGHT_exists;
										}
										if (CAUGHT_exists == null) {
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
								and = ValueUtil.FALSE_VALUE;
							} else {
								if (CAUGHT_not_0 instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_not_0;
								}
								if (CAUGHT_or instanceof InvalidValueException) {
									throw (InvalidValueException) CAUGHT_or;
								}
								if ((CAUGHT_not_0 == null) || (CAUGHT_or == null)) {
									and = null;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
						}
						status = and;
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
	public boolean SubjectShouldBeNotifiedAboutWithdraw(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::SubjectShouldBeNotifiedAboutWithdraw";
		try {
			/**
			 *
			 * inv SubjectShouldBeNotifiedAboutWithdraw:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if self.action.oclIsKindOf(Withdraw)
			 *           then
			 *             PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first()
			 *             .notifications->exists(notification | notification.causedBy = self and notification.type = NotificationType::Withdraw)
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
					PrivacyModelPackage.Literals.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_Withdraw_0 = idResolver
							.getClass(PrivacyModelTables.CLSSid_Withdraw, null);
					final /*@NonInvalid*/ AbstractComplaintAction action = this.getAction();
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, action, TYP_privacyModel_c_c_Withdraw_0).booleanValue();
					/*@Thrown*/ Boolean status;
					if (oclIsKindOf) {
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
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_notification = BOXED_notifications.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_notification.hasNext()) {
								if (accumulator == null) {
									exists = null;
								} else if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ privacyModel.Notification notification = (privacyModel.Notification) ITERATOR_notification
									.next();
							/**
							 * notification.causedBy = self and notification.type = NotificationType::Withdraw
							 */
							final /*@NonInvalid*/ NotificationInfo causedBy = notification.getCausedBy();
							final /*@NonInvalid*/ boolean eq = causedBy.equals(this);
							final /*@NonInvalid*/ Boolean and;
							if (!eq) {
								and = ValueUtil.FALSE_VALUE;
							} else {
								final /*@NonInvalid*/ NotificationType type = notification.getType();
								final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_NotificationType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
								final /*@NonInvalid*/ boolean eq_0 = BOXED_type == PrivacyModelTables.ELITid_Withdraw;
								if (!eq_0) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									and = ValueUtil.TRUE_VALUE;
								}
							}
							//
							if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (and == null) { // Abnormal null body evaluation result
								if (accumulator == ValueUtil.FALSE_VALUE) {
									accumulator = null; // Cache a null failure
								}
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						status = exists;
					} else {
						status = ValueUtil.TRUE_VALUE;
					}
					final /*@Thrown*/ boolean eq_1 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_1) {
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
	public boolean SubjectShouldBeNotifiedAboutExistingComplaintForRectification(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Complaint::SubjectShouldBeNotifiedAboutExistingComplaintForRectification";
		try {
			/**
			 *
			 * inv SubjectShouldBeNotifiedAboutExistingComplaintForRectification:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if
			 *             self.action.oclIsKindOf(ComplaintBasedOnData)
			 *           then
			 *             let
			 *               basedOnData : ComplaintBasedOnData[1] = self.action.oclAsType(ComplaintBasedOnData)
			 *             in
			 *               if basedOnData.type = ComplaintBasedOnDataType::Rectification
			 *               then
			 *                 PrivacyPolicy.allInstances()
			 *                 ->asSequence()
			 *                 ->first()
			 *                 .notifications->exists(notification | notification.causedBy = self and notification.type = NotificationType::Rectification)
			 *               else true
			 *               endif
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
					PrivacyModelPackage.Literals.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_ComplaintBasedOnData = idResolver
							.getClass(PrivacyModelTables.CLSSid_ComplaintBasedOnData, null);
					final /*@NonInvalid*/ AbstractComplaintAction action = this.getAction();
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnData).booleanValue();
					/*@Thrown*/ Boolean status;
					if (oclIsKindOf) {
						final /*@Thrown*/ ComplaintBasedOnData basedOnData = (ComplaintBasedOnData) OclAnyOclAsTypeOperation.INSTANCE
								.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnData);
						final /*@Thrown*/ ComplaintBasedOnDataType type = basedOnData.getType();
						final /*@Thrown*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_ComplaintBasedOnDataType
								.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
						final /*@Thrown*/ boolean eq = BOXED_type == PrivacyModelTables.ELITid_Rectification_0;
						/*@Thrown*/ Boolean local_0;
						if (eq) {
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
							/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
							Iterator<Object> ITERATOR_notification = BOXED_notifications.iterator();
							/*@Thrown*/ Boolean exists;
							while (true) {
								if (!ITERATOR_notification.hasNext()) {
									if (accumulator == null) {
										exists = null;
									} else if (accumulator == ValueUtil.FALSE_VALUE) {
										exists = ValueUtil.FALSE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ privacyModel.Notification notification = (privacyModel.Notification) ITERATOR_notification
										.next();
								/**
								 * notification.causedBy = self and notification.type = NotificationType::Rectification
								 */
								final /*@NonInvalid*/ NotificationInfo causedBy = notification.getCausedBy();
								final /*@NonInvalid*/ boolean eq_0 = causedBy.equals(this);
								final /*@NonInvalid*/ Boolean and;
								if (!eq_0) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ NotificationType type_0 = notification.getType();
									final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = PrivacyModelTables.ENUMid_NotificationType
											.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
									final /*@NonInvalid*/ boolean eq_1 = BOXED_type_0 == PrivacyModelTables.ELITid_Rectification_1;
									if (!eq_1) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										and = ValueUtil.TRUE_VALUE;
									}
								}
								//
								if (and == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									exists = ValueUtil.TRUE_VALUE;
									break; // Stop immediately
								} else if (and == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									; // Carry on
								} else if (and == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.FALSE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
								}
							}
							local_0 = exists;
						} else {
							local_0 = ValueUtil.TRUE_VALUE;
						}
						status = local_0;
					} else {
						status = ValueUtil.TRUE_VALUE;
					}
					final /*@Thrown*/ boolean eq_2 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_2;
					if (eq_2) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Based_32_on_32_Art19, status);
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
		case PrivacyModelPackage.COMPLAINT___INVALID_TYPE_OF_PURPOSE_FOR_AN_OBJECT__DIAGNOSTICCHAIN_MAP:
			return InvalidTypeOfPurposeForAnObject((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___CANNOT_IDENTIFY_DATA_FROM_COMPLAINT__DIAGNOSTICCHAIN_MAP:
			return CannotIdentifyDataFromComplaint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_COMPLAINT__DIAGNOSTICCHAIN_MAP:
			return UserDoesntHavePermissionToComplaint((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_WITHDRAW__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutWithdraw((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___ERASURE_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP:
			return ErasureShouldBeExecutedAsSoonAsPossible((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___WITHDRAW_CONSENT_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP:
			return WithdrawConsentShouldBeExecutedAsSoonAsPossible((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_ERASURE__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutExistingComplaintForErasure((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___USER_DOESNT_HAVE_PERMISSION_TO_WITHDRAW_CONSENT__DIAGNOSTICCHAIN_MAP:
			return UserDoesntHavePermissionToWithdrawConsent((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___SUBJECT_SHOULD_BE_NOTIFIED_ABOUT_EXISTING_COMPLAINT_FOR_RECTIFICATION__DIAGNOSTICCHAIN_MAP:
			return SubjectShouldBeNotifiedAboutExistingComplaintForRectification((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___RECTIFICATION_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP:
			return RectificationShouldBeExecutedAsSoonAsPossible((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.COMPLAINT___STOP_PROCESSING_SHOULD_BE_EXECUTED_AS_SOON_AS_POSSIBLE__DIAGNOSTICCHAIN_MAP:
			return StopProcessingShouldBeExecutedAsSoonAsPossible((DiagnosticChain) arguments.get(0),
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
