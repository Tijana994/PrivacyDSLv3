/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.ClassUtil;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.TupleValue;
import privacyModel.AbstractComplaintAction;
import privacyModel.Complaint;
import privacyModel.ComplaintBasedOnData;
import privacyModel.ComplaintBasedOnDataType;
import privacyModel.Notification;
import privacyModel.NotificationInfo;
import privacyModel.NotificationType;
import privacyModel.Principal;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyModelTables;

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
	public boolean ShouldDefineCausedByAsErasure(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Notification::ShouldDefineCausedByAsErasure";
		try {
			/**
			 *
			 * inv ShouldDefineCausedByAsErasure:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = if type = NotificationType::Erasure
			 *           then
			 *             if causedBy.oclIsKindOf(Complaint)
			 *             then
			 *               let
			 *                 complaint : Complaint[1] = causedBy.oclAsType(Complaint)
			 *               in
			 *                 if
			 *                   complaint.action.oclIsKindOf(ComplaintBasedOnData)
			 *                 then
			 *                   let
			 *                     basedOnData : ComplaintBasedOnData[1] = complaint.action.oclAsType(ComplaintBasedOnData)
			 *                   in basedOnData.type = ComplaintBasedOnDataType::Erasure
			 *                 else false
			 *                 endif
			 *             else false
			 *             endif
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'NotifyAboutErasure should contain causedBy with complaint Erasure', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_ERASURE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_3;
				try {
					final /*@NonInvalid*/ NotificationType type_0 = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = PrivacyModelTables.ENUMid_NotificationType
							.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type_0 == PrivacyModelTables.ELITid_Erasure_1;
					/*@Thrown*/ boolean status;
					if (eq) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_Complaint_0 = idResolver
								.getClass(PrivacyModelTables.CLSSid_Complaint, null);
						final /*@NonInvalid*/ NotificationInfo causedBy = this.getCausedBy();
						final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
								.evaluate(executor, causedBy, TYP_privacyModel_c_c_Complaint_0).booleanValue();
						/*@Thrown*/ boolean local_1;
						if (oclIsKindOf) {
							final /*@Thrown*/ Complaint complaint = (Complaint) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, causedBy, TYP_privacyModel_c_c_Complaint_0);
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_ComplaintBasedOnData_0 = idResolver
									.getClass(PrivacyModelTables.CLSSid_ComplaintBasedOnData, null);
							final /*@Thrown*/ AbstractComplaintAction action = complaint.getAction();
							final /*@Thrown*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE
									.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnData_0)
									.booleanValue();
							/*@Thrown*/ boolean local_0;
							if (oclIsKindOf_0) {
								final /*@Thrown*/ ComplaintBasedOnData basedOnData = (ComplaintBasedOnData) OclAnyOclAsTypeOperation.INSTANCE
										.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnData_0);
								final /*@Thrown*/ ComplaintBasedOnDataType type_1 = basedOnData.getType();
								final /*@Thrown*/ EnumerationLiteralId BOXED_type_1 = PrivacyModelTables.ENUMid_ComplaintBasedOnDataType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type_1.getName()));
								final /*@Thrown*/ boolean eq_0 = BOXED_type_1 == PrivacyModelTables.ELITid_Erasure_0;
								local_0 = eq_0;
							} else {
								local_0 = false;
							}
							local_1 = local_0;
						} else {
							local_1 = false;
						}
						status = local_1;
					} else {
						status = true;
					}
					/*@Thrown*/ Object local_3;
					if (status) {
						local_3 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_2 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_NotifyAboutErasure_32_should_32_contain_32_causedBy_32_with_32_complaint_32_Erasur,
								status);
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
	public boolean ShouldDefineCausedByAsPrivacyPolicy(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Notification::ShouldDefineCausedByAsPrivacyPolicy";
		try {
			/**
			 *
			 * inv ShouldDefineCausedByAsPrivacyPolicy:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = if type = NotificationType::DataCollecting or type = NotificationType::StopProcessing or type = NotificationType::ExecutedRectification or type = NotificationType::ExecutedErasure
			 *           then causedBy.oclIsKindOf(PolicyStatement)
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'NotifyAboutCollecting or StopProcessing should contain causedBy with policy statement', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_PRIVACY_POLICY__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ NotificationType type_3 = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_3 = PrivacyModelTables.ENUMid_NotificationType
						.getEnumerationLiteralId(ClassUtil.nonNullState(type_3.getName()));
				/*@Caught*/ Object CAUGHT_or_0;
				try {
					final /*@NonInvalid*/ boolean eq = BOXED_type_3 == PrivacyModelTables.ELITid_DataCollecting;
					final /*@NonInvalid*/ Boolean or;
					if (eq) {
						or = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ boolean eq_0 = BOXED_type_3 == PrivacyModelTables.ELITid_StopProcessing_1;
						if (eq_0) {
							or = ValueUtil.TRUE_VALUE;
						} else {
							or = ValueUtil.FALSE_VALUE;
						}
					}
					final /*@Thrown*/ Boolean or_0;
					if (or == ValueUtil.TRUE_VALUE) {
						or_0 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@NonInvalid*/ boolean eq_1 = BOXED_type_3 == PrivacyModelTables.ELITid_ExecutedRectification;
						if (eq_1) {
							or_0 = ValueUtil.TRUE_VALUE;
						} else {
							if (or == null) {
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
					final /*@NonInvalid*/ boolean eq_2 = BOXED_type_3 == PrivacyModelTables.ELITid_ExecutedErasure;
					if (eq_2) {
						or_1 = ValueUtil.TRUE_VALUE;
					} else {
						if (CAUGHT_or_0 instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_or_0;
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
				/*@NonInvalid*/ boolean status;
				if (or_1) {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PolicyStatement = idResolver
							.getClass(PrivacyModelTables.CLSSid_PolicyStatement, null);
					final /*@NonInvalid*/ NotificationInfo causedBy = this.getCausedBy();
					final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
							.evaluate(executor, causedBy, TYP_privacyModel_c_c_PolicyStatement).booleanValue();
					status = oclIsKindOf;
				} else {
					status = true;
				}
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_NotifyAboutCollecting_32_or_32_StopProcessing_32_should_32_contain_32_causedBy_32,
							status);
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
	public boolean ShouldDefineCausedByAsWithdraw(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Notification::ShouldDefineCausedByAsWithdraw";
		try {
			/**
			 *
			 * inv ShouldDefineCausedByAsWithdraw:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = if type = NotificationType::Withdraw
			 *           then
			 *             if causedBy.oclIsKindOf(Complaint)
			 *             then
			 *               let
			 *                 complaint : Complaint[1] = causedBy.oclAsType(Complaint)
			 *               in complaint.action.oclIsKindOf(Withdraw)
			 *             else false
			 *             endif
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'NotifyAboutWithdraw should contain causedBy with complaint Withdraw', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_WITHDRAW__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_3;
			if (le) {
				local_3 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_2;
				try {
					final /*@NonInvalid*/ NotificationType type_0 = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = PrivacyModelTables.ENUMid_NotificationType
							.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type_0 == PrivacyModelTables.ELITid_Withdraw;
					/*@Thrown*/ boolean status;
					if (eq) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_Complaint = idResolver
								.getClass(PrivacyModelTables.CLSSid_Complaint, null);
						final /*@NonInvalid*/ NotificationInfo causedBy = this.getCausedBy();
						final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
								.evaluate(executor, causedBy, TYP_privacyModel_c_c_Complaint).booleanValue();
						/*@Thrown*/ boolean local_0;
						if (oclIsKindOf) {
							final /*@Thrown*/ Complaint complaint = (Complaint) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, causedBy, TYP_privacyModel_c_c_Complaint);
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_Withdraw_0 = idResolver
									.getClass(PrivacyModelTables.CLSSid_Withdraw, null);
							final /*@Thrown*/ AbstractComplaintAction action = complaint.getAction();
							final /*@Thrown*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE
									.evaluate(executor, action, TYP_privacyModel_c_c_Withdraw_0).booleanValue();
							local_0 = oclIsKindOf_0;
						} else {
							local_0 = false;
						}
						status = local_0;
					} else {
						status = true;
					}
					/*@Thrown*/ Object local_2;
					if (status) {
						local_2 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_1 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_NotifyAboutWithdraw_32_should_32_contain_32_causedBy_32_with_32_complaint_32_Withd,
								status);
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
	public boolean ShouldDefineCausedByAsRectification(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Notification::ShouldDefineCausedByAsRectification";
		try {
			/**
			 *
			 * inv ShouldDefineCausedByAsRectification:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = if type = NotificationType::Rectification
			 *           then
			 *             if causedBy.oclIsKindOf(Complaint)
			 *             then
			 *               let
			 *                 complaint : Complaint[1] = causedBy.oclAsType(Complaint)
			 *               in
			 *                 if
			 *                   complaint.action.oclIsKindOf(ComplaintBasedOnData)
			 *                 then
			 *                   let
			 *                     basedOnData : ComplaintBasedOnData[1] = complaint.action.oclAsType(ComplaintBasedOnData)
			 *                   in basedOnData.type = ComplaintBasedOnDataType::Rectification
			 *                 else false
			 *                 endif
			 *             else false
			 *             endif
			 *           else true
			 *           endif
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'NotifyAboutRectification should contain causedBy with complaint Rectification', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.NOTIFICATION___SHOULD_DEFINE_CAUSED_BY_AS_RECTIFICATION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_4;
			if (le) {
				local_4 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_3;
				try {
					final /*@NonInvalid*/ NotificationType type_0 = this.getType();
					final /*@NonInvalid*/ EnumerationLiteralId BOXED_type_0 = PrivacyModelTables.ENUMid_NotificationType
							.getEnumerationLiteralId(ClassUtil.nonNullState(type_0.getName()));
					final /*@NonInvalid*/ boolean eq = BOXED_type_0 == PrivacyModelTables.ELITid_Rectification_1;
					/*@Thrown*/ boolean status;
					if (eq) {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_Complaint_0 = idResolver
								.getClass(PrivacyModelTables.CLSSid_Complaint, null);
						final /*@NonInvalid*/ NotificationInfo causedBy = this.getCausedBy();
						final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
								.evaluate(executor, causedBy, TYP_privacyModel_c_c_Complaint_0).booleanValue();
						/*@Thrown*/ boolean local_1;
						if (oclIsKindOf) {
							final /*@Thrown*/ Complaint complaint = (Complaint) OclAnyOclAsTypeOperation.INSTANCE
									.evaluate(executor, causedBy, TYP_privacyModel_c_c_Complaint_0);
							final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_ComplaintBasedOnData_0 = idResolver
									.getClass(PrivacyModelTables.CLSSid_ComplaintBasedOnData, null);
							final /*@Thrown*/ AbstractComplaintAction action = complaint.getAction();
							final /*@Thrown*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE
									.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnData_0)
									.booleanValue();
							/*@Thrown*/ boolean local_0;
							if (oclIsKindOf_0) {
								final /*@Thrown*/ ComplaintBasedOnData basedOnData = (ComplaintBasedOnData) OclAnyOclAsTypeOperation.INSTANCE
										.evaluate(executor, action, TYP_privacyModel_c_c_ComplaintBasedOnData_0);
								final /*@Thrown*/ ComplaintBasedOnDataType type_1 = basedOnData.getType();
								final /*@Thrown*/ EnumerationLiteralId BOXED_type_1 = PrivacyModelTables.ENUMid_ComplaintBasedOnDataType
										.getEnumerationLiteralId(ClassUtil.nonNullState(type_1.getName()));
								final /*@Thrown*/ boolean eq_0 = BOXED_type_1 == PrivacyModelTables.ELITid_Rectification_0;
								local_0 = eq_0;
							} else {
								local_0 = false;
							}
							local_1 = local_0;
						} else {
							local_1 = false;
						}
						status = local_1;
					} else {
						status = true;
					}
					/*@Thrown*/ Object local_3;
					if (status) {
						local_3 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_2 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_NotifyAboutRectification_32_should_32_contain_32_causedBy_32_with_32_complaint_32,
								status);
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
