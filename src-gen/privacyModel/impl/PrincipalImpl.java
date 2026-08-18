/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
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
import org.eclipse.ocl.pivot.library.classifier.ClassifierAllInstancesOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionAsSequenceOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.OrderedCollectionFirstOperation;
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
import org.eclipse.ocl.pivot.values.SequenceValue;
import org.eclipse.ocl.pivot.values.SetValue;
import org.eclipse.ocl.pivot.values.TupleValue;
import privacyModel.Location;
import privacyModel.Principal;
import privacyModel.PrincipalScope;
import privacyModel.PrincipalType;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyModelTables;
import privacyModel.PrivacyPolicy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Principal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.PrincipalImpl#getSubPrincipals <em>Sub Principals</em>}</li>
 *   <li>{@link privacyModel.impl.PrincipalImpl#getType <em>Type</em>}</li>
 *   <li>{@link privacyModel.impl.PrincipalImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link privacyModel.impl.PrincipalImpl#getResponsiblePersons <em>Responsible Persons</em>}</li>
 *   <li>{@link privacyModel.impl.PrincipalImpl#getInhabits <em>Inhabits</em>}</li>
 *   <li>{@link privacyModel.impl.PrincipalImpl#getBirthdate <em>Birthdate</em>}</li>
 *   <li>{@link privacyModel.impl.PrincipalImpl#getAge <em>Age</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrincipalImpl extends NamedElementImpl implements Principal {
	/**
	 * The cached value of the '{@link #getSubPrincipals() <em>Sub Principals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPrincipals()
	 * @generated
	 * @ordered
	 */
	protected EList<Principal> subPrincipals;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final PrincipalType TYPE_EDEFAULT = PrincipalType.LEGAL_ENTITY;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected PrincipalType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final PrincipalScope SCOPE_EDEFAULT = PrincipalScope.IN;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected PrincipalScope scope = SCOPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResponsiblePersons() <em>Responsible Persons</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsiblePersons()
	 * @generated
	 * @ordered
	 */
	protected EList<Principal> responsiblePersons;

	/**
	 * The cached value of the '{@link #getInhabits() <em>Inhabits</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInhabits()
	 * @generated
	 * @ordered
	 */
	protected Location inhabits;

	/**
	 * The default value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected static final Date BIRTHDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBirthdate() <em>Birthdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthdate()
	 * @generated
	 * @ordered
	 */
	protected Date birthdate = BIRTHDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrincipalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.PRINCIPAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Principal> getSubPrincipals() {
		if (subPrincipals == null) {
			subPrincipals = new EObjectResolvingEList<Principal>(Principal.class, this,
					PrivacyModelPackage.PRINCIPAL__SUB_PRINCIPALS);
		}
		return subPrincipals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipalType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PrincipalType newType) {
		PrincipalType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.PRINCIPAL__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrincipalScope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(PrincipalScope newScope) {
		PrincipalScope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.PRINCIPAL__SCOPE, oldScope,
					scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Principal> getResponsiblePersons() {
		if (responsiblePersons == null) {
			responsiblePersons = new EObjectResolvingEList<Principal>(Principal.class, this,
					PrivacyModelPackage.PRINCIPAL__RESPONSIBLE_PERSONS);
		}
		return responsiblePersons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getInhabits() {
		if (inhabits != null && inhabits.eIsProxy()) {
			InternalEObject oldInhabits = (InternalEObject) inhabits;
			inhabits = (Location) eResolveProxy(oldInhabits);
			if (inhabits != oldInhabits) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrivacyModelPackage.PRINCIPAL__INHABITS,
							oldInhabits, inhabits));
			}
		}
		return inhabits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetInhabits() {
		return inhabits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInhabits(Location newInhabits) {
		Location oldInhabits = inhabits;
		inhabits = newInhabits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.PRINCIPAL__INHABITS, oldInhabits,
					inhabits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBirthdate() {
		return birthdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBirthdate(Date newBirthdate) {
		Date oldBirthdate = birthdate;
		birthdate = newBirthdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.PRINCIPAL__BIRTHDATE,
					oldBirthdate, birthdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.PRINCIPAL__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals(final Principal observed) {
		/**
		 * self = observed or
		 * self.subPrincipals->exists(principal | principal = observed)
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ boolean eq = this.equals(observed);
		final /*@Thrown*/ Boolean or;
		if (eq) {
			or = ValueUtil.TRUE_VALUE;
		} else {
			final /*@NonInvalid*/ List<Principal> subPrincipals = this.getSubPrincipals();
			final /*@NonInvalid*/ OrderedSetValue BOXED_subPrincipals = idResolver
					.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal, subPrincipals);
			/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
			Iterator<Object> ITERATOR_principal = BOXED_subPrincipals.iterator();
			/*@NonInvalid*/ Boolean exists;
			while (true) {
				if (!ITERATOR_principal.hasNext()) {
					if (accumulator == ValueUtil.FALSE_VALUE) {
						exists = ValueUtil.FALSE_VALUE;
					} else {
						throw (InvalidValueException) accumulator;
					}
					break;
				}
				/*@NonInvalid*/ Principal principal = (Principal) ITERATOR_principal.next();
				/**
				 * principal = observed
				 */
				final /*@NonInvalid*/ boolean eq_0 = principal.equals(observed);
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
			throw new InvalidValueException(
					"Null body for \'privacyModel::Principal::equals(privacyModel::Principal[?]) : Boolean[1]\'");
		}
		return or;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NaturalPersonCannotContainSubPrincipals(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Principal::NaturalPersonCannotContainSubPrincipals";
		try {
			/**
			 *
			 * inv NaturalPersonCannotContainSubPrincipals:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = if self.type = PrincipalType::NaturalPerson
			 *         then self.subPrincipals->isEmpty()
			 *         else true
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this, context);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					PrivacyModelPackage.Literals.PRINCIPAL___NATURAL_PERSON_CANNOT_CONTAIN_SUB_PRINCIPALS__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_0;
			if (le) {
				local_0 = true;
			} else {
				final /*@NonInvalid*/ PrincipalType type = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_PrincipalType
						.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
				final /*@NonInvalid*/ boolean eq = BOXED_type == PrivacyModelTables.ELITid_NaturalPerson;
				/*@NonInvalid*/ boolean result;
				if (eq) {
					final /*@NonInvalid*/ List<Principal> subPrincipals = this.getSubPrincipals();
					final /*@NonInvalid*/ OrderedSetValue BOXED_subPrincipals = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal, subPrincipals);
					final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
							.evaluate(BOXED_subPrincipals).booleanValue();
					result = isEmpty;
				} else {
					result = true;
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
	public boolean JuvenileShouldHaveResponsiblePerson(final DiagnosticChain diagnostics,
			final Map<Object, Object> context) {
		final String constraintName = "Principal::JuvenileShouldHaveResponsiblePerson";
		try {
			/**
			 *
			 * inv JuvenileShouldHaveResponsiblePerson:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : OclAny[1] = let
			 *           status : Boolean[?] = if self.type = PrincipalType::NaturalPerson and self.age <
			 *             PrivacyPolicy.allInstances()
			 *             ->asSequence()
			 *             ->first().owner.inhabits.legalAgeLimit
			 *           then not self.responsiblePersons->isEmpty()
			 *           else true
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
					PrivacyModelPackage.Literals.PRINCIPAL___JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, PrivacyModelTables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean local_2;
			if (le) {
				local_2 = true;
			} else {
				final /*@NonInvalid*/ PrincipalType type = this.getType();
				final /*@NonInvalid*/ EnumerationLiteralId BOXED_type = PrivacyModelTables.ENUMid_PrincipalType
						.getEnumerationLiteralId(ClassUtil.nonNullState(type.getName()));
				final /*@NonInvalid*/ boolean eq = BOXED_type == PrivacyModelTables.ELITid_NaturalPerson;
				final /*@Thrown*/ Boolean and;
				if (!eq) {
					and = ValueUtil.FALSE_VALUE;
				} else {
					/*@Caught*/ Object CAUGHT_lt;
					try {
						final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_privacyModel_c_c_PrivacyPolicy_0 = idResolver
								.getClass(PrivacyModelTables.CLSSid_PrivacyPolicy, null);
						final /*@NonInvalid*/ int age = this.getAge();
						final /*@NonInvalid*/ IntegerValue BOXED_age = ValueUtil.integerValueOf(age);
						final /*@NonInvalid*/ SetValue allInstances = ClassifierAllInstancesOperation.INSTANCE.evaluate(
								executor, PrivacyModelTables.SET_CLSSid_PrivacyPolicy,
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
						final /*@Thrown*/ IntegerValue BOXED_legalAgeLimit = ValueUtil.integerValueOf(legalAgeLimit);
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
						if (CAUGHT_lt instanceof InvalidValueException) {
							throw (InvalidValueException) CAUGHT_lt;
						}
						and = ValueUtil.TRUE_VALUE;
					}
				}
				if (and == null) {
					throw new InvalidValueException("Null if condition");
				}
				/*@NonInvalid*/ Boolean status;
				if (and) {
					final /*@NonInvalid*/ List<Principal> responsiblePersons = this.getResponsiblePersons();
					final /*@NonInvalid*/ OrderedSetValue BOXED_responsiblePersons = idResolver
							.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Principal, responsiblePersons);
					final /*@NonInvalid*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
							.evaluate(BOXED_responsiblePersons).booleanValue();
					final /*@NonInvalid*/ Boolean not;
					if (!isEmpty) {
						not = ValueUtil.TRUE_VALUE;
					} else {
						if (isEmpty) {
							not = ValueUtil.FALSE_VALUE;
						} else {
							not = null;
						}
					}
					status = not;
				} else {
					status = ValueUtil.TRUE_VALUE;
				}
				final /*@NonInvalid*/ boolean eq_0 = status == Boolean.TRUE;
				/*@NonInvalid*/ Object local_1;
				if (eq_0) {
					local_1 = ValueUtil.TRUE_VALUE;
				} else {
					final /*@NonInvalid*/ TupleValue local_0 = ValueUtil.createTupleOfEach(PrivacyModelTables.TUPLid_,
							PrivacyModelTables.STR_Based_32_on_32_Art8, status);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.PRINCIPAL__SUB_PRINCIPALS:
			return getSubPrincipals();
		case PrivacyModelPackage.PRINCIPAL__TYPE:
			return getType();
		case PrivacyModelPackage.PRINCIPAL__SCOPE:
			return getScope();
		case PrivacyModelPackage.PRINCIPAL__RESPONSIBLE_PERSONS:
			return getResponsiblePersons();
		case PrivacyModelPackage.PRINCIPAL__INHABITS:
			if (resolve)
				return getInhabits();
			return basicGetInhabits();
		case PrivacyModelPackage.PRINCIPAL__BIRTHDATE:
			return getBirthdate();
		case PrivacyModelPackage.PRINCIPAL__AGE:
			return getAge();
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
		case PrivacyModelPackage.PRINCIPAL__SUB_PRINCIPALS:
			getSubPrincipals().clear();
			getSubPrincipals().addAll((Collection<? extends Principal>) newValue);
			return;
		case PrivacyModelPackage.PRINCIPAL__TYPE:
			setType((PrincipalType) newValue);
			return;
		case PrivacyModelPackage.PRINCIPAL__SCOPE:
			setScope((PrincipalScope) newValue);
			return;
		case PrivacyModelPackage.PRINCIPAL__RESPONSIBLE_PERSONS:
			getResponsiblePersons().clear();
			getResponsiblePersons().addAll((Collection<? extends Principal>) newValue);
			return;
		case PrivacyModelPackage.PRINCIPAL__INHABITS:
			setInhabits((Location) newValue);
			return;
		case PrivacyModelPackage.PRINCIPAL__BIRTHDATE:
			setBirthdate((Date) newValue);
			return;
		case PrivacyModelPackage.PRINCIPAL__AGE:
			setAge((Integer) newValue);
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
		case PrivacyModelPackage.PRINCIPAL__SUB_PRINCIPALS:
			getSubPrincipals().clear();
			return;
		case PrivacyModelPackage.PRINCIPAL__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case PrivacyModelPackage.PRINCIPAL__SCOPE:
			setScope(SCOPE_EDEFAULT);
			return;
		case PrivacyModelPackage.PRINCIPAL__RESPONSIBLE_PERSONS:
			getResponsiblePersons().clear();
			return;
		case PrivacyModelPackage.PRINCIPAL__INHABITS:
			setInhabits((Location) null);
			return;
		case PrivacyModelPackage.PRINCIPAL__BIRTHDATE:
			setBirthdate(BIRTHDATE_EDEFAULT);
			return;
		case PrivacyModelPackage.PRINCIPAL__AGE:
			setAge(AGE_EDEFAULT);
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
		case PrivacyModelPackage.PRINCIPAL__SUB_PRINCIPALS:
			return subPrincipals != null && !subPrincipals.isEmpty();
		case PrivacyModelPackage.PRINCIPAL__TYPE:
			return type != TYPE_EDEFAULT;
		case PrivacyModelPackage.PRINCIPAL__SCOPE:
			return scope != SCOPE_EDEFAULT;
		case PrivacyModelPackage.PRINCIPAL__RESPONSIBLE_PERSONS:
			return responsiblePersons != null && !responsiblePersons.isEmpty();
		case PrivacyModelPackage.PRINCIPAL__INHABITS:
			return inhabits != null;
		case PrivacyModelPackage.PRINCIPAL__BIRTHDATE:
			return BIRTHDATE_EDEFAULT == null ? birthdate != null : !BIRTHDATE_EDEFAULT.equals(birthdate);
		case PrivacyModelPackage.PRINCIPAL__AGE:
			return age != AGE_EDEFAULT;
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
		case PrivacyModelPackage.PRINCIPAL___EQUALS__PRINCIPAL:
			return equals((Principal) arguments.get(0));
		case PrivacyModelPackage.PRINCIPAL___NATURAL_PERSON_CANNOT_CONTAIN_SUB_PRINCIPALS__DIAGNOSTICCHAIN_MAP:
			return NaturalPersonCannotContainSubPrincipals((DiagnosticChain) arguments.get(0),
					(Map<Object, Object>) arguments.get(1));
		case PrivacyModelPackage.PRINCIPAL___JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP:
			return JuvenileShouldHaveResponsiblePerson((DiagnosticChain) arguments.get(0),
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
		result.append(", scope: ");
		result.append(scope);
		result.append(", birthdate: ");
		result.append(birthdate);
		result.append(", age: ");
		result.append(age);
		result.append(')');
		return result.toString();
	}

} //PrincipalImpl
