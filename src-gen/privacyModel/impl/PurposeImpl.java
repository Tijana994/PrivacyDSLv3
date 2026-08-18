/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.EnumerationLiteralId;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.IdResolver.IdResolverExtension;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
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
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyModelTables;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid(final Purpose purpose) {
		/**
		 *
		 * not (purpose.processingReason = null
		 * ) and
		 * not (purpose.processingReasonSubtype = null
		 * ) and self.processingReason = purpose.processingReason and self.processingReasonSubtype = purpose.processingReasonSubtype or
		 * self.subPurposes->notEmpty() and
		 * self.subPurposes->exists(s | s.isValid(purpose))
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		/*@Caught*/ Object CAUGHT_and_1;
		try {
			/*@Caught*/ Object CAUGHT_and_0;
			try {
				/*@Caught*/ Object CAUGHT_and;
				try {
					final /*@NonInvalid*/ Boolean not_0 = ValueUtil.TRUE_VALUE;
					final /*@Thrown*/ Boolean and;
					if (not_0 == ValueUtil.FALSE_VALUE) {
						and = ValueUtil.FALSE_VALUE;
					} else {
						if (not_0 == ValueUtil.FALSE_VALUE) {
							and = ValueUtil.FALSE_VALUE;
						} else {
							if ((not_0 == null) || (not_0 == null)) {
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
					/*@Caught*/ Object CAUGHT_eq;
					try {
						final /*@NonInvalid*/ ProcessingReason processingReason_0 = this.getProcessingReason();
						if (purpose == null) {
							throw new InvalidValueException(
									"Null source for \'\'http://privacymodel\'::Purpose::processingReason\'");
						}
						final /*@Thrown*/ ProcessingReason processingReason_1 = purpose.getProcessingReason();
						final /*@Thrown*/ boolean eq = processingReason_0.equals(processingReason_1);
						CAUGHT_eq = eq;
					} catch (Exception e) {
						CAUGHT_eq = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_eq == ValueUtil.FALSE_VALUE) {
						and_0 = ValueUtil.FALSE_VALUE;
					} else {
						if (CAUGHT_and instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_and;
						}
						if (CAUGHT_eq instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_eq;
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
				/*@Caught*/ Object CAUGHT_eq_0;
				try {
					final /*@NonInvalid*/ ProcessingReasonSubtype processingReasonSubtype = this
							.getProcessingReasonSubtype();
					if (purpose == null) {
						throw new InvalidValueException(
								"Null source for \'\'http://privacymodel\'::Purpose::processingReasonSubtype\'");
					}
					final /*@Thrown*/ ProcessingReasonSubtype processingReasonSubtype_0 = purpose
							.getProcessingReasonSubtype();
					final /*@Thrown*/ boolean eq_0 = processingReasonSubtype.equals(processingReasonSubtype_0);
					CAUGHT_eq_0 = eq_0;
				} catch (Exception e) {
					CAUGHT_eq_0 = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_eq_0 == ValueUtil.FALSE_VALUE) {
					and_1 = ValueUtil.FALSE_VALUE;
				} else {
					if (CAUGHT_and_0 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_and_0;
					}
					if (CAUGHT_eq_0 instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_eq_0;
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
		final /*@Thrown*/ Boolean or;
		if (CAUGHT_and_1 == ValueUtil.TRUE_VALUE) {
			or = ValueUtil.TRUE_VALUE;
		} else {
			/*@Caught*/ Object CAUGHT_and_2;
			try {
				final /*@NonInvalid*/ List<Purpose> subPurposes = this.getSubPurposes();
				final /*@NonInvalid*/ OrderedSetValue BOXED_subPurposes = idResolver
						.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Purpose, subPurposes);
				final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE
						.evaluate(BOXED_subPurposes).booleanValue();
				final /*@Thrown*/ Boolean and_2;
				if (!notEmpty) {
					and_2 = ValueUtil.FALSE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_exists;
					try {
						/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
						Iterator<Object> ITERATOR_s = BOXED_subPurposes.iterator();
						/*@Thrown*/ Boolean exists;
						while (true) {
							if (!ITERATOR_s.hasNext()) {
								if (accumulator == ValueUtil.FALSE_VALUE) {
									exists = ValueUtil.FALSE_VALUE;
								} else {
									throw (InvalidValueException) accumulator;
								}
								break;
							}
							/*@NonInvalid*/ Purpose s = (Purpose) ITERATOR_s.next();
							/**
							 * s.isValid(purpose)
							 */
							/*@Caught*/ Object CAUGHT_isValid;
							try {
								final /*@Thrown*/ boolean isValid = s.isValid(purpose);
								CAUGHT_isValid = isValid;
							} catch (Exception e) {
								CAUGHT_isValid = ValueUtil.createInvalidValue(e);
							}
							//
							if (CAUGHT_isValid == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
								exists = ValueUtil.TRUE_VALUE;
								break; // Stop immediately
							} else if (CAUGHT_isValid == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
								; // Carry on
							} else if (CAUGHT_isValid instanceof InvalidValueException) { // Abnormal exception evaluation result
								accumulator = CAUGHT_isValid; // Cache an exception failure
							} else { // Impossible badly typed result
								accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
							}
						}
						CAUGHT_exists = exists;
					} catch (Exception e) {
						CAUGHT_exists = ValueUtil.createInvalidValue(e);
					}
					if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
						and_2 = ValueUtil.FALSE_VALUE;
					} else {
						if (CAUGHT_exists instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_exists;
						}
						if (CAUGHT_exists == null) {
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
				or = ValueUtil.TRUE_VALUE;
			} else {
				if (CAUGHT_and_1 instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_and_1;
				}
				if (CAUGHT_and_2 instanceof InvalidValueException) {
					throw (InvalidValueException) CAUGHT_and_2;
				}
				if ((CAUGHT_and_1 == null) || (CAUGHT_and_2 == null)) {
					or = null;
				} else {
					or = ValueUtil.FALSE_VALUE;
				}
			}
		}
		if (or == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::Purpose::isValid(privacyModel::Purpose[?]) : Boolean[1]\'");
		}
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubPurposeValid(final ProcessingReason reason, final EList<ProcessingReasonSubtype> subreasons) {
		/**
		 *
		 * if self.processingReason = reason
		 * then
		 *   if self.processingReasonSubtype = null
		 *   then true
		 *   else
		 *     subreasons->exists(r | r = self.processingReasonSubtype)
		 *   endif
		 * else true
		 * endif
		 */
		assert subreasons != null;
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ ProcessingReason processingReason_0 = this.getProcessingReason();
		final /*@NonInvalid*/ boolean eq = processingReason_0.equals(reason);
		/*@NonInvalid*/ Boolean local_0;
		if (eq) {
			final /*@NonInvalid*/ SequenceValue BOXED_subreasons = idResolver
					.createSequenceOfAll(PrivacyModelTables.SEQ_ENUMid_ProcessingReasonSubtype, subreasons);
			/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
			Iterator<Object> ITERATOR_r = BOXED_subreasons.iterator();
			/*@NonInvalid*/ Boolean exists;
			while (true) {
				if (!ITERATOR_r.hasNext()) {
					if (accumulator == ValueUtil.FALSE_VALUE) {
						exists = ValueUtil.FALSE_VALUE;
					} else {
						throw (InvalidValueException) accumulator;
					}
					break;
				}
				/*@NonInvalid*/ EnumerationLiteralId r = (EnumerationLiteralId) ITERATOR_r.next();
				/**
				 * r = self.processingReasonSubtype
				 */
				final /*@NonInvalid*/ ProcessingReasonSubtype processingReasonSubtype = this
						.getProcessingReasonSubtype();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_processingReasonSubtype = PrivacyModelTables.ENUMid_ProcessingReasonSubtype
						.getEnumerationLiteralId(ClassUtil.nonNullState(processingReasonSubtype.getName()));
				final /*@NonInvalid*/ boolean eq_0 = r == BOXED_processingReasonSubtype;
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
			local_0 = exists;
		} else {
			local_0 = ValueUtil.TRUE_VALUE;
		}
		if (local_0 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::Purpose::isSubPurposeValid(privacyModel::ProcessingReason[?],Sequence(privacyModel::ProcessingReasonSubtype)) : Boolean[1]\'");
		}
		return local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean containsAllowedPurposeReasonAndSubreason(final ProcessingReason allowedReason,
			final EList<ProcessingReasonSubtype> allowedSubreasons) {
		/**
		 * allowedReason = self.processingReason and
		 * allowedSubreasons->exists(r | r = self.processingReasonSubtype)
		 */
		assert allowedSubreasons != null;
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ ProcessingReason processingReason_0 = this.getProcessingReason();
		final /*@NonInvalid*/ boolean eq = allowedReason.equals(processingReason_0);
		final /*@Thrown*/ Boolean and;
		if (!eq) {
			and = ValueUtil.FALSE_VALUE;
		} else {
			final /*@NonInvalid*/ SequenceValue BOXED_allowedSubreasons = idResolver
					.createSequenceOfAll(PrivacyModelTables.SEQ_ENUMid_ProcessingReasonSubtype, allowedSubreasons);
			/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
			Iterator<Object> ITERATOR_r = BOXED_allowedSubreasons.iterator();
			/*@NonInvalid*/ Boolean exists;
			while (true) {
				if (!ITERATOR_r.hasNext()) {
					if (accumulator == ValueUtil.FALSE_VALUE) {
						exists = ValueUtil.FALSE_VALUE;
					} else {
						throw (InvalidValueException) accumulator;
					}
					break;
				}
				/*@NonInvalid*/ EnumerationLiteralId r = (EnumerationLiteralId) ITERATOR_r.next();
				/**
				 * r = self.processingReasonSubtype
				 */
				final /*@NonInvalid*/ ProcessingReasonSubtype processingReasonSubtype = this
						.getProcessingReasonSubtype();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_processingReasonSubtype = PrivacyModelTables.ENUMid_ProcessingReasonSubtype
						.getEnumerationLiteralId(ClassUtil.nonNullState(processingReasonSubtype.getName()));
				final /*@NonInvalid*/ boolean eq_0 = r == BOXED_processingReasonSubtype;
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
			if (exists == ValueUtil.FALSE_VALUE) {
				and = ValueUtil.FALSE_VALUE;
			} else {
				if (exists == null) {
					and = null;
				} else {
					and = ValueUtil.TRUE_VALUE;
				}
			}
		}
		if (and == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::Purpose::containsAllowedPurposeReasonAndSubreason(privacyModel::ProcessingReason[1],Sequence(privacyModel::ProcessingReasonSubtype)) : Boolean[1]\'");
		}
		return and;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean PublicInterestShouldNotContainThisSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::PublicInterestShouldNotContainThisSubReason";
		try {
			/**
			 *
			 * inv PublicInterestShouldNotContainThisSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::PublicInterest,
			 *           Sequence{ProcessingReasonSubtype::Prevention, ProcessingReasonSubtype::Investigation, ProcessingReasonSubtype::Detection, ProcessingReasonSubtype::Prosecution, ProcessingReasonSubtype::PreventionOfThreats, ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___PUBLIC_INTEREST_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_PublicInterest = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_PublicInterest);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_6 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_6);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_PublicInterest,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_6);
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
	public boolean PublicHealthShouldNotContainSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::PublicHealthShouldNotContainSubReason";
		try {
			/**
			 *
			 * inv PublicHealthShouldNotContainSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::PublicHealth,
			 *           Sequence{ProcessingReasonSubtype::None
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___PUBLIC_HEALTH_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_PublicHealth = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_PublicHealth);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_4 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_4);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_PublicHealth,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_4);
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
	public boolean OutOfScopeShouldNotContainThisSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::OutOfScopeShouldNotContainThisSubReason";
		try {
			/**
			 *
			 * inv OutOfScopeShouldNotContainThisSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::OutOfScope,
			 *           Sequence{ProcessingReasonSubtype::OutOfEU, ProcessingReasonSubtype::PersonalActivity, ProcessingReasonSubtype::SpecialScopeOfActivity, ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___OUT_OF_SCOPE_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_OutOfScope = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_OutOfScope);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_5 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_5);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_OutOfScope,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_5);
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
	public boolean ProfilingShouldNotContainSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::ProfilingShouldNotContainSubReason";
		try {
			/**
			 *
			 * inv ProfilingShouldNotContainSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::Profiling,
			 *           Sequence{ProcessingReasonSubtype::None
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___PROFILING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_Profiling = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_Profiling);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_11 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_4);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_Profiling,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_11);
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
	public boolean StopProcessingShouldNotContainSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::StopProcessingShouldNotContainSubReason";
		try {
			/**
			 *
			 * inv StopProcessingShouldNotContainSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::StopProcessing,
			 *           Sequence{ProcessingReasonSubtype::None
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___STOP_PROCESSING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_StopProcessing_0 = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_StopProcessing_0);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_14 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_4);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_StopProcessing_0,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_14);
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
	public boolean MarketingShouldNotContainSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::MarketingShouldNotContainSubReason";
		try {
			/**
			 *
			 * inv MarketingShouldNotContainSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::Marketing,
			 *           Sequence{ProcessingReasonSubtype::None
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___MARKETING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_Marketing = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_Marketing);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_9 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_4);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_Marketing,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_9);
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
	public boolean ExercisingSpecificRightsPurposesCannotContainThisSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::ExercisingSpecificRightsPurposesCannotContainThisSubReason";
		try {
			/**
			 *
			 * inv ExercisingSpecificRightsPurposesCannotContainThisSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::ExercisingSpecificRights,
			 *           Sequence{ProcessingReasonSubtype::Employment, ProcessingReasonSubtype::SocialSecurity, ProcessingReasonSubtype::SocialProtection, ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___EXERCISING_SPECIFIC_RIGHTS_PURPOSES_CANNOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_ExercisingSpecificRights = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_ExercisingSpecificRights);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_8 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_8);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_ExercisingSpecificRights,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_8);
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
	public boolean ProtectTheVitalInterestsOfTheDataSubjectShouldNotContainThisSubReason(
			final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Purpose::ProtectTheVitalInterestsOfTheDataSubjectShouldNotContainThisSubReason";
		try {
			/**
			 *
			 * inv ProtectTheVitalInterestsOfTheDataSubjectShouldNotContainThisSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::ProtectTheVitalInterestsOfTheDataSubject,
			 *           Sequence{ProcessingReasonSubtype::PhysicallyIncapable, ProcessingReasonSubtype::LegallyIncapable, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::None
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_ProtectTheVitalInterestsOfTheDataSubject = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class,
								PrivacyModelTables.ELITid_ProtectTheVitalInterestsOfTheDataSubject);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_12 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_12);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(
						ECORE_ELITid_ProtectTheVitalInterestsOfTheDataSubject,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_12);
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
	public boolean LegitimateInterestsShouldNotContainThisSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::LegitimateInterestsShouldNotContainThisSubReason";
		try {
			/**
			 *
			 * inv LegitimateInterestsShouldNotContainThisSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::LegitimateInterests,
			 *           Sequence{ProcessingReasonSubtype::None
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___LEGITIMATE_INTERESTS_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_LegitimateInterests = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_LegitimateInterests);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_13 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_4);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_LegitimateInterests,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_13);
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
	public boolean ResearchShouldNotContainThisSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::ResearchShouldNotContainThisSubReason";
		try {
			/**
			 *
			 * inv ResearchShouldNotContainThisSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::Research,
			 *           Sequence{ProcessingReasonSubtype::None, ProcessingReasonSubtype::Other, ProcessingReasonSubtype::Scientific, ProcessingReasonSubtype::Historical, ProcessingReasonSubtype::Statistical
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___RESEARCH_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_Research = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_Research);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_3 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_3);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_Research,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_3);
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
	public boolean StatisticalPurposesShouldNotContainSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::StatisticalPurposesShouldNotContainSubReason";
		try {
			/**
			 *
			 * inv StatisticalPurposesShouldNotContainSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::StatisticalPurposes,
			 *           Sequence{ProcessingReasonSubtype::None
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___STATISTICAL_PURPOSES_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_StatisticalPurposes = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_StatisticalPurposes);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_7 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_4);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_StatisticalPurposes,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_7);
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
	public boolean TestingShouldNotContainSubReason(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Purpose::TestingShouldNotContainSubReason";
		try {
			/**
			 *
			 * inv TestingShouldNotContainSubReason:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = isSubPurposeValid(ProcessingReason::Testing,
			 *           Sequence{ProcessingReasonSubtype::None
			 *           })
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PURPOSE___TESTING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ ProcessingReason ECORE_ELITid_Testing = (ProcessingReason) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_Testing);
				final /*@NonInvalid*/ List<ProcessingReasonSubtype> ECORE_Sequence_10 = ((IdResolverExtension) idResolver)
						.ecoreValueOfAll(ProcessingReasonSubtype.class, PrivacyModelTables.Sequence_4);
				final /*@NonInvalid*/ boolean result = this.isSubPurposeValid(ECORE_ELITid_Testing,
						(EList<ProcessingReasonSubtype>) ECORE_Sequence_10);
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
		case PrivacyModelPackage.PURPOSE___PUBLIC_INTEREST_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return PublicInterestShouldNotContainThisSubReason((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___PUBLIC_HEALTH_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return PublicHealthShouldNotContainSubReason((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___OUT_OF_SCOPE_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return OutOfScopeShouldNotContainThisSubReason((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___PROFILING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return ProfilingShouldNotContainSubReason((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___STOP_PROCESSING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return StopProcessingShouldNotContainSubReason((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___MARKETING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return MarketingShouldNotContainSubReason((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___EXERCISING_SPECIFIC_RIGHTS_PURPOSES_CANNOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return ExercisingSpecificRightsPurposesCannotContainThisSubReason((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___PROTECT_THE_VITAL_INTERESTS_OF_THE_DATA_SUBJECT_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return ProtectTheVitalInterestsOfTheDataSubjectShouldNotContainThisSubReason(
					(DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___LEGITIMATE_INTERESTS_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return LegitimateInterestsShouldNotContainThisSubReason((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___RESEARCH_SHOULD_NOT_CONTAIN_THIS_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return ResearchShouldNotContainThisSubReason((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___STATISTICAL_PURPOSES_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return StatisticalPurposesShouldNotContainSubReason((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PURPOSE___TESTING_SHOULD_NOT_CONTAIN_SUB_REASON__DIAGNOSTICCHAIN_MAP:
			return TestingShouldNotContainSubReason((DiagnosticChain) arguments.get(0),
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
