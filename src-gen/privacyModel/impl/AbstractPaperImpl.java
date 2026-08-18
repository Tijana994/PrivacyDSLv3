/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.library.oclany.OclComparableGreaterThanOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.TupleValue;
import privacyModel.AbstractPaper;
import privacyModel.Principal;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyModelTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Paper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.AbstractPaperImpl#getProvidedBy <em>Provided By</em>}</li>
 *   <li>{@link privacyModel.impl.AbstractPaperImpl#getTerminationExplanation <em>Termination Explanation</em>}</li>
 *   <li>{@link privacyModel.impl.AbstractPaperImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link privacyModel.impl.AbstractPaperImpl#getTerminationDate <em>Termination Date</em>}</li>
 *   <li>{@link privacyModel.impl.AbstractPaperImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link privacyModel.impl.AbstractPaperImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractPaperImpl extends NamedElementImpl implements AbstractPaper {
	/**
	 * The cached value of the '{@link #getProvidedBy() <em>Provided By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedBy()
	 * @generated
	 * @ordered
	 */
	protected Principal providedBy;

	/**
	 * The default value of the '{@link #getTerminationExplanation() <em>Termination Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationExplanation()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMINATION_EXPLANATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminationExplanation() <em>Termination Explanation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationExplanation()
	 * @generated
	 * @ordered
	 */
	protected String terminationExplanation = TERMINATION_EXPLANATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTerminationDate() <em>Termination Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TERMINATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTerminationDate() <em>Termination Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerminationDate()
	 * @generated
	 * @ordered
	 */
	protected Date terminationDate = TERMINATION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPaperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.ABSTRACT_PAPER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal getProvidedBy() {
		if (providedBy != null && providedBy.eIsProxy()) {
			InternalEObject oldProvidedBy = (InternalEObject) providedBy;
			providedBy = (Principal) eResolveProxy(oldProvidedBy);
			if (providedBy != oldProvidedBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							PrivacyModelPackage.ABSTRACT_PAPER__PROVIDED_BY, oldProvidedBy, providedBy));
			}
		}
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Principal basicGetProvidedBy() {
		return providedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvidedBy(Principal newProvidedBy) {
		Principal oldProvidedBy = providedBy;
		providedBy = newProvidedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.ABSTRACT_PAPER__PROVIDED_BY,
					oldProvidedBy, providedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTerminationExplanation() {
		return terminationExplanation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminationExplanation(String newTerminationExplanation) {
		String oldTerminationExplanation = terminationExplanation;
		terminationExplanation = newTerminationExplanation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PrivacyModelPackage.ABSTRACT_PAPER__TERMINATION_EXPLANATION, oldTerminationExplanation,
					terminationExplanation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.ABSTRACT_PAPER__START_DATE,
					oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTerminationDate() {
		return terminationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerminationDate(Date newTerminationDate) {
		Date oldTerminationDate = terminationDate;
		terminationDate = newTerminationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.ABSTRACT_PAPER__TERMINATION_DATE,
					oldTerminationDate, terminationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.ABSTRACT_PAPER__LOCATION,
					oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.ABSTRACT_PAPER__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean StartDateShouldBeBeforeTerminationDate(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "AbstractPaper::StartDateShouldBeBeforeTerminationDate";
		try {
			/**
			 *
			 * inv StartDateShouldBeBeforeTerminationDate:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let status : Boolean[?] = self.terminationDate = null or
			 *           not (self.startDate > self.terminationDate
			 *           )
			 *         in
			 *           if status = true
			 *           then true
			 *           else
			 *             Tuple{message = 'Termination date is before start date', status = status
			 *             }
			 *           endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.ABSTRACT_PAPER___START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				/*@Caught*/ Object CAUGHT_local_1;
				try {
					final /*@NonInvalid*/ Date terminationDate = this.getTerminationDate();
					final /*@NonInvalid*/ boolean eq = terminationDate == null;
					final /*@Thrown*/ Boolean status;
					if (eq) {
						status = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_not;
						try {
							/*@Caught*/ Object CAUGHT_gt;
							try {
								final /*@NonInvalid*/ Date startDate = this.getStartDate();
								if (terminationDate == null) {
									throw new InvalidValueException(
											"Null \'\'OclSelf\'\' rather than \'\'OclVoid\'\' value required");
								}
								if (terminationDate instanceof InvalidValueException) {
									throw (InvalidValueException) terminationDate;
								}
								final /*@Thrown*/ boolean gt = OclComparableGreaterThanOperation.INSTANCE
										.evaluate(executor, startDate, terminationDate).booleanValue();
								CAUGHT_gt = gt;
							} catch (Exception e) {
								CAUGHT_gt = ValueUtil.createInvalidValue(e);
							}
							if (CAUGHT_gt instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_gt;
							}
							final /*@Thrown*/ Boolean not;
							if (CAUGHT_gt == ValueUtil.FALSE_VALUE) {
								not = ValueUtil.TRUE_VALUE;
							} else {
								if (CAUGHT_gt == ValueUtil.TRUE_VALUE) {
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
							status = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_not instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_not;
							}
							if (CAUGHT_not == null) {
								status = null;
							} else {
								status = ValueUtil.FALSE_VALUE;
							}
						}
					}
					final /*@Thrown*/ boolean eq_0 = status == Boolean.TRUE;
					/*@Thrown*/ Object local_1;
					if (eq_0) {
						local_1 = ValueUtil.TRUE_VALUE;
					} else {
						final /*@Thrown*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
								PrivacyModelTables.STR_Termination_32_date_32_is_32_before_32_start_32_date, status);
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.ABSTRACT_PAPER__PROVIDED_BY:
			if (resolve)
				return getProvidedBy();
			return basicGetProvidedBy();
		case PrivacyModelPackage.ABSTRACT_PAPER__TERMINATION_EXPLANATION:
			return getTerminationExplanation();
		case PrivacyModelPackage.ABSTRACT_PAPER__START_DATE:
			return getStartDate();
		case PrivacyModelPackage.ABSTRACT_PAPER__TERMINATION_DATE:
			return getTerminationDate();
		case PrivacyModelPackage.ABSTRACT_PAPER__LOCATION:
			return getLocation();
		case PrivacyModelPackage.ABSTRACT_PAPER__DESCRIPTION:
			return getDescription();
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
		case PrivacyModelPackage.ABSTRACT_PAPER__PROVIDED_BY:
			setProvidedBy((Principal) newValue);
			return;
		case PrivacyModelPackage.ABSTRACT_PAPER__TERMINATION_EXPLANATION:
			setTerminationExplanation((String) newValue);
			return;
		case PrivacyModelPackage.ABSTRACT_PAPER__START_DATE:
			setStartDate((Date) newValue);
			return;
		case PrivacyModelPackage.ABSTRACT_PAPER__TERMINATION_DATE:
			setTerminationDate((Date) newValue);
			return;
		case PrivacyModelPackage.ABSTRACT_PAPER__LOCATION:
			setLocation((String) newValue);
			return;
		case PrivacyModelPackage.ABSTRACT_PAPER__DESCRIPTION:
			setDescription((String) newValue);
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
		case PrivacyModelPackage.ABSTRACT_PAPER__PROVIDED_BY:
			setProvidedBy((Principal) null);
			return;
		case PrivacyModelPackage.ABSTRACT_PAPER__TERMINATION_EXPLANATION:
			setTerminationExplanation(TERMINATION_EXPLANATION_EDEFAULT);
			return;
		case PrivacyModelPackage.ABSTRACT_PAPER__START_DATE:
			setStartDate(START_DATE_EDEFAULT);
			return;
		case PrivacyModelPackage.ABSTRACT_PAPER__TERMINATION_DATE:
			setTerminationDate(TERMINATION_DATE_EDEFAULT);
			return;
		case PrivacyModelPackage.ABSTRACT_PAPER__LOCATION:
			setLocation(LOCATION_EDEFAULT);
			return;
		case PrivacyModelPackage.ABSTRACT_PAPER__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case PrivacyModelPackage.ABSTRACT_PAPER__PROVIDED_BY:
			return providedBy != null;
		case PrivacyModelPackage.ABSTRACT_PAPER__TERMINATION_EXPLANATION:
			return TERMINATION_EXPLANATION_EDEFAULT == null ? terminationExplanation != null
					: !TERMINATION_EXPLANATION_EDEFAULT.equals(terminationExplanation);
		case PrivacyModelPackage.ABSTRACT_PAPER__START_DATE:
			return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
		case PrivacyModelPackage.ABSTRACT_PAPER__TERMINATION_DATE:
			return TERMINATION_DATE_EDEFAULT == null ? terminationDate != null
					: !TERMINATION_DATE_EDEFAULT.equals(terminationDate);
		case PrivacyModelPackage.ABSTRACT_PAPER__LOCATION:
			return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
		case PrivacyModelPackage.ABSTRACT_PAPER__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		case PrivacyModelPackage.ABSTRACT_PAPER___START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__DIAGNOSTICCHAIN_MAP:
			return StartDateShouldBeBeforeTerminationDate((DiagnosticChain) arguments.get(0),
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
		result.append(" (terminationExplanation: ");
		result.append(terminationExplanation);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", terminationDate: ");
		result.append(terminationDate);
		result.append(", location: ");
		result.append(location);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AbstractPaperImpl
