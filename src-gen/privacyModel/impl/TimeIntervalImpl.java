/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
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
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.TupleValue;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyModelTables;
import privacyModel.TimeInterval;
import privacyModel.TimePreposition;
import privacyModel.TimeStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Interval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.TimeIntervalImpl#getStart <em>Start</em>}</li>
 *   <li>{@link privacyModel.impl.TimeIntervalImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeIntervalImpl extends AbstractTimeImpl implements TimeInterval {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected TimeStatement start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected TimeStatement end;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimeIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.TIME_INTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStatement getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(TimeStatement newStart, NotificationChain msgs) {
		TimeStatement oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.TIME_INTERVAL__START, oldStart, newStart);
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
	public void setStart(TimeStatement newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject) start).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.TIME_INTERVAL__START, null, msgs);
			if (newStart != null)
				msgs = ((InternalEObject) newStart).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.TIME_INTERVAL__START, null, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.TIME_INTERVAL__START, newStart,
					newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStatement getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(TimeStatement newEnd, NotificationChain msgs) {
		TimeStatement oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.TIME_INTERVAL__END, oldEnd, newEnd);
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
	public void setEnd(TimeStatement newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject) end).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.TIME_INTERVAL__END, null, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject) newEnd).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PrivacyModelPackage.TIME_INTERVAL__END, null, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.TIME_INTERVAL__END, newEnd,
					newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypeDefinedWithOtherType(final TimePreposition firstPrepositionType,
			final TimePreposition secondPrepositionType) {
		/**
		 *
		 * if self.start.preposition = firstPrepositionType
		 * then self.end.preposition = secondPrepositionType
		 * else true
		 * endif
		 */
		final /*@NonInvalid*/ TimeStatement start = this.getStart();
		final /*@NonInvalid*/ TimePreposition preposition = start.getPreposition();
		final /*@NonInvalid*/ boolean eq = preposition.equals(firstPrepositionType);
		/*@NonInvalid*/ boolean local_0;
		if (eq) {
			final /*@NonInvalid*/ TimeStatement end = this.getEnd();
			final /*@NonInvalid*/ TimePreposition preposition_0 = end.getPreposition();
			final /*@NonInvalid*/ boolean eq_0 = preposition_0.equals(secondPrepositionType);
			local_0 = eq_0;
		} else {
			local_0 = true;
		}
		return local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypeForbidden(final TimePreposition prepositionType) {
		/**
		 *
		 * if self.start.preposition = prepositionType or self.end.preposition = prepositionType
		 * then false
		 * else true
		 * endif
		 */
		final /*@NonInvalid*/ TimeStatement start = this.getStart();
		final /*@NonInvalid*/ TimePreposition preposition = start.getPreposition();
		final /*@NonInvalid*/ boolean eq = preposition.equals(prepositionType);
		final /*@NonInvalid*/ Boolean or;
		if (eq) {
			or = ValueUtil.TRUE_VALUE;
		} else {
			final /*@NonInvalid*/ TimeStatement end = this.getEnd();
			final /*@NonInvalid*/ TimePreposition preposition_0 = end.getPreposition();
			final /*@NonInvalid*/ boolean eq_0 = preposition_0.equals(prepositionType);
			if (eq_0) {
				or = ValueUtil.TRUE_VALUE;
			} else {
				or = ValueUtil.FALSE_VALUE;
			}
		}
		if (or == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@NonInvalid*/ boolean local_0;
		if (or) {
			local_0 = false;
		} else {
			local_0 = true;
		}
		return local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid(final TimePreposition firstPrepositionType, final TimePreposition secondPrepositionType) {
		/**
		 *
		 * if self.start.preposition = firstPrepositionType and self.end.preposition = secondPrepositionType
		 * then self.start.dateTime < self.end.dateTime
		 * else
		 *   if self.end.preposition = firstPrepositionType and self.start.preposition = secondPrepositionType
		 *   then false
		 *   else true
		 *   endif
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ TimeStatement end_0 = this.getEnd();
		final /*@NonInvalid*/ TimeStatement start_0 = this.getStart();
		final /*@NonInvalid*/ TimePreposition preposition_0 = end_0.getPreposition();
		final /*@NonInvalid*/ TimePreposition preposition = start_0.getPreposition();
		final /*@NonInvalid*/ boolean eq = preposition.equals(firstPrepositionType);
		final /*@NonInvalid*/ Boolean and;
		if (!eq) {
			and = ValueUtil.FALSE_VALUE;
		} else {
			final /*@NonInvalid*/ boolean eq_0 = preposition_0.equals(secondPrepositionType);
			if (!eq_0) {
				and = ValueUtil.FALSE_VALUE;
			} else {
				and = ValueUtil.TRUE_VALUE;
			}
		}
		if (and == null) {
			throw new InvalidValueException("Null if condition");
		}
		/*@NonInvalid*/ boolean local_1;
		if (and) {
			final /*@NonInvalid*/ Date dateTime = start_0.getDateTime();
			final /*@NonInvalid*/ Date dateTime_0 = end_0.getDateTime();
			final /*@NonInvalid*/ boolean lt = OclComparableLessThanOperation.INSTANCE
					.evaluate(executor, dateTime, dateTime_0).booleanValue();
			local_1 = lt;
		} else {
			final /*@NonInvalid*/ boolean eq_1 = preposition_0.equals(firstPrepositionType);
			final /*@NonInvalid*/ Boolean and_0;
			if (!eq_1) {
				and_0 = ValueUtil.FALSE_VALUE;
			} else {
				final /*@NonInvalid*/ boolean eq_2 = preposition.equals(secondPrepositionType);
				if (!eq_2) {
					and_0 = ValueUtil.FALSE_VALUE;
				} else {
					and_0 = ValueUtil.TRUE_VALUE;
				}
			}
			if (and_0 == null) {
				throw new InvalidValueException("Null if condition");
			}
			/*@NonInvalid*/ boolean local_0;
			if (and_0) {
				local_0 = false;
			} else {
				local_0 = true;
			}
			local_1 = local_0;
		}
		return local_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AfterStatementBeforeBeforeStatement(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "TimeInterval::AfterStatementBeforeBeforeStatement";
		try {
			/**
			 *
			 * inv AfterStatementBeforeBeforeStatement:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.isValid(TimePreposition::after, TimePreposition::before)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'After interval should be defined before before interval', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.TIME_INTERVAL___AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ TimePreposition ECORE_ELITid_after = (TimePreposition) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_after);
				final /*@NonInvalid*/ TimePreposition ECORE_ELITid_before = (TimePreposition) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_before);
				final /*@NonInvalid*/ boolean status = this.isValid(ECORE_ELITid_after, ECORE_ELITid_before);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_After_32_interval_32_should_32_be_32_defined_32_before_32_before_32_interval,
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
	public boolean UntilTypeShouldBeDefinedAlone(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "TimeInterval::UntilTypeShouldBeDefinedAlone";
		try {
			/**
			 *
			 * inv UntilTypeShouldBeDefinedAlone:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.isTypeForbidden(TimePreposition::until)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Until statement should be defined alone', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.TIME_INTERVAL___UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ TimePreposition ECORE_ELITid_until = (TimePreposition) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_until);
				final /*@NonInvalid*/ boolean status = this.isTypeForbidden(ECORE_ELITid_until);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Until_32_statement_32_should_32_be_32_defined_32_alone, status);
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
	public boolean FromStatementBeforeToStatement(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "TimeInterval::FromStatementBeforeToStatement";
		try {
			/**
			 *
			 * inv FromStatementBeforeToStatement:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.isValid(TimePreposition::from, TimePreposition::to)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'From interval should be defined before to interval', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.TIME_INTERVAL___FROM_STATEMENT_BEFORE_TO_STATEMENT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ TimePreposition ECORE_ELITid_from = (TimePreposition) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_from);
				final /*@NonInvalid*/ TimePreposition ECORE_ELITid_to = (TimePreposition) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_to);
				final /*@NonInvalid*/ boolean status = this.isValid(ECORE_ELITid_from, ECORE_ELITid_to);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_From_32_interval_32_should_32_be_32_defined_32_before_32_to_32_interval,
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
	public boolean OnlyFromOrFromWithTo(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "TimeInterval::OnlyFromOrFromWithTo";
		try {
			/**
			 *
			 * inv OnlyFromOrFromWithTo:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.isTypeDefinedWithOtherType(TimePreposition::from, TimePreposition::to)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'From interval should be defined alone or with to interval', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.TIME_INTERVAL___ONLY_FROM_OR_FROM_WITH_TO__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ TimePreposition ECORE_ELITid_from = (TimePreposition) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_from);
				final /*@NonInvalid*/ TimePreposition ECORE_ELITid_to = (TimePreposition) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_to);
				final /*@NonInvalid*/ boolean status = this.isTypeDefinedWithOtherType(ECORE_ELITid_from,
						ECORE_ELITid_to);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_From_32_interval_32_should_32_be_32_defined_32_alone_32_or_32_with_32_to_32_interval,
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
	public boolean OnlyAfterOrAfterWithBefore(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "TimeInterval::OnlyAfterOrAfterWithBefore";
		try {
			/**
			 *
			 * inv OnlyAfterOrAfterWithBefore:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.isTypeDefinedWithOtherType(TimePreposition::after, TimePreposition::before)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'After interval should be defined alone or with before interval', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.TIME_INTERVAL___ONLY_AFTER_OR_AFTER_WITH_BEFORE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ TimePreposition ECORE_ELITid_after = (TimePreposition) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_after);
				final /*@NonInvalid*/ TimePreposition ECORE_ELITid_before = (TimePreposition) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_before);
				final /*@NonInvalid*/ boolean status = this.isTypeDefinedWithOtherType(ECORE_ELITid_after,
						ECORE_ELITid_before);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_After_32_interval_32_should_32_be_32_defined_32_alone_32_or_32_with_32_before_32_interval,
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
	public boolean AtTypeShouldBeDefinedAlone(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "TimeInterval::AtTypeShouldBeDefinedAlone";
		try {
			/**
			 *
			 * inv AtTypeShouldBeDefinedAlone:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[1] = self.isTypeForbidden(TimePreposition::at)
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'At statement should be defined alone', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.TIME_INTERVAL___AT_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ TimePreposition ECORE_ELITid_at = (TimePreposition) idResolver
						.ecoreValueOf(Enumerator.class, PrivacyModelTables.ELITid_at);
				final /*@NonInvalid*/ boolean status = this.isTypeForbidden(ECORE_ELITid_at);
				/*@NonInvalid*/ Object local_1;
				if (status) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_At_32_statement_32_should_32_be_32_defined_32_alone, status);
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
		case PrivacyModelPackage.TIME_INTERVAL__START:
			return basicSetStart(null, msgs);
		case PrivacyModelPackage.TIME_INTERVAL__END:
			return basicSetEnd(null, msgs);
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
		case PrivacyModelPackage.TIME_INTERVAL__START:
			return getStart();
		case PrivacyModelPackage.TIME_INTERVAL__END:
			return getEnd();
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
		case PrivacyModelPackage.TIME_INTERVAL__START:
			setStart((TimeStatement) newValue);
			return;
		case PrivacyModelPackage.TIME_INTERVAL__END:
			setEnd((TimeStatement) newValue);
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
		case PrivacyModelPackage.TIME_INTERVAL__START:
			setStart((TimeStatement) null);
			return;
		case PrivacyModelPackage.TIME_INTERVAL__END:
			setEnd((TimeStatement) null);
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
		case PrivacyModelPackage.TIME_INTERVAL__START:
			return start != null;
		case PrivacyModelPackage.TIME_INTERVAL__END:
			return end != null;
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
		case PrivacyModelPackage.TIME_INTERVAL___IS_TYPE_DEFINED_WITH_OTHER_TYPE__TIMEPREPOSITION_TIMEPREPOSITION:
			return isTypeDefinedWithOtherType((TimePreposition) arguments.get(0), (TimePreposition) arguments.get(1));
		case PrivacyModelPackage.TIME_INTERVAL___IS_TYPE_FORBIDDEN__TIMEPREPOSITION:
			return isTypeForbidden((TimePreposition) arguments.get(0));
		case PrivacyModelPackage.TIME_INTERVAL___IS_VALID__TIMEPREPOSITION_TIMEPREPOSITION:
			return isValid((TimePreposition) arguments.get(0), (TimePreposition) arguments.get(1));
		case PrivacyModelPackage.TIME_INTERVAL___AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT__DIAGNOSTICCHAIN_MAP:
			return AfterStatementBeforeBeforeStatement((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.TIME_INTERVAL___UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP:
			return UntilTypeShouldBeDefinedAlone((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.TIME_INTERVAL___FROM_STATEMENT_BEFORE_TO_STATEMENT__DIAGNOSTICCHAIN_MAP:
			return FromStatementBeforeToStatement((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.TIME_INTERVAL___ONLY_FROM_OR_FROM_WITH_TO__DIAGNOSTICCHAIN_MAP:
			return OnlyFromOrFromWithTo((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.TIME_INTERVAL___ONLY_AFTER_OR_AFTER_WITH_BEFORE__DIAGNOSTICCHAIN_MAP:
			return OnlyAfterOrAfterWithBefore((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.TIME_INTERVAL___AT_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP:
			return AtTypeShouldBeDefinedAlone((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TimeIntervalImpl
