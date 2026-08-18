/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.Iterator;
import java.util.List;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.messages.PivotMessages;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import privacyModel.Location;
import privacyModel.LocationType;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyModelTables;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link privacyModel.impl.LocationImpl#isIsEUMember <em>Is EU Member</em>}</li>
 *   <li>{@link privacyModel.impl.LocationImpl#getType <em>Type</em>}</li>
 *   <li>{@link privacyModel.impl.LocationImpl#getSubLocations <em>Sub Locations</em>}</li>
 *   <li>{@link privacyModel.impl.LocationImpl#getLegalAgeLimit <em>Legal Age Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends NamedElementImpl implements Location {
	/**
	 * The default value of the '{@link #isIsEUMember() <em>Is EU Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEUMember()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EU_MEMBER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEUMember() <em>Is EU Member</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEUMember()
	 * @generated
	 * @ordered
	 */
	protected boolean isEUMember = IS_EU_MEMBER_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final LocationType TYPE_EDEFAULT = LocationType.UNION;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected LocationType type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubLocations() <em>Sub Locations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> subLocations;

	/**
	 * The default value of the '{@link #getLegalAgeLimit() <em>Legal Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalAgeLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int LEGAL_AGE_LIMIT_EDEFAULT = 16;

	/**
	 * The cached value of the '{@link #getLegalAgeLimit() <em>Legal Age Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalAgeLimit()
	 * @generated
	 * @ordered
	 */
	protected int legalAgeLimit = LEGAL_AGE_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEUMember() {
		return isEUMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEUMember(boolean newIsEUMember) {
		boolean oldIsEUMember = isEUMember;
		isEUMember = newIsEUMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.LOCATION__IS_EU_MEMBER,
					oldIsEUMember, isEUMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(LocationType newType) {
		LocationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.LOCATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getSubLocations() {
		if (subLocations == null) {
			subLocations = new EObjectResolvingEList<Location>(Location.class, this,
					PrivacyModelPackage.LOCATION__SUB_LOCATIONS);
		}
		return subLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLegalAgeLimit() {
		return legalAgeLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalAgeLimit(int newLegalAgeLimit) {
		int oldLegalAgeLimit = legalAgeLimit;
		legalAgeLimit = newLegalAgeLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrivacyModelPackage.LOCATION__LEGAL_AGE_LIMIT,
					oldLegalAgeLimit, legalAgeLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals(final Location observed) {
		/**
		 *
		 * if self = observed
		 * then true
		 * else
		 *   self.subLocations->notEmpty() and
		 *   self.subLocations->exists(s | s.equals(observed))
		 * endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ boolean eq = this.equals(observed);
		/*@Thrown*/ Boolean local_0;
		if (eq) {
			local_0 = ValueUtil.TRUE_VALUE;
		} else {
			final /*@NonInvalid*/ List<Location> subLocations = this.getSubLocations();
			final /*@NonInvalid*/ OrderedSetValue BOXED_subLocations = idResolver
					.createOrderedSetOfAll(PrivacyModelTables.ORD_CLSSid_Location, subLocations);
			final /*@NonInvalid*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(BOXED_subLocations)
					.booleanValue();
			final /*@Thrown*/ Boolean and;
			if (!notEmpty) {
				and = ValueUtil.FALSE_VALUE;
			} else {
				/*@Caught*/ Object CAUGHT_exists;
				try {
					/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
					Iterator<Object> ITERATOR_s = BOXED_subLocations.iterator();
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
						/*@NonInvalid*/ Location s = (Location) ITERATOR_s.next();
						/**
						 * s.equals(observed)
						 */
						/*@Caught*/ Object CAUGHT_equals;
						try {
							final /*@Thrown*/ boolean equals = s.equals(observed);
							CAUGHT_equals = equals;
						} catch (Exception e) {
							CAUGHT_equals = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_equals == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							exists = ValueUtil.TRUE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_equals == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							; // Carry on
						} else if (CAUGHT_equals instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_equals; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
						}
					}
					CAUGHT_exists = exists;
				} catch (Exception e) {
					CAUGHT_exists = ValueUtil.createInvalidValue(e);
				}
				if (CAUGHT_exists == ValueUtil.FALSE_VALUE) {
					and = ValueUtil.FALSE_VALUE;
				} else {
					if (CAUGHT_exists instanceof InvalidValueException) {
						throw (InvalidValueException) CAUGHT_exists;
					}
					if (CAUGHT_exists == null) {
						and = null;
					} else {
						and = ValueUtil.TRUE_VALUE;
					}
				}
			}
			local_0 = and;
		}
		if (local_0 == null) {
			throw new InvalidValueException(
					"Null body for \'privacyModel::Location::equals(privacyModel::Location[?]) : Boolean[1]\'");
		}
		return local_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PrivacyModelPackage.LOCATION__IS_EU_MEMBER:
			return isIsEUMember();
		case PrivacyModelPackage.LOCATION__TYPE:
			return getType();
		case PrivacyModelPackage.LOCATION__SUB_LOCATIONS:
			return getSubLocations();
		case PrivacyModelPackage.LOCATION__LEGAL_AGE_LIMIT:
			return getLegalAgeLimit();
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
		case PrivacyModelPackage.LOCATION__IS_EU_MEMBER:
			setIsEUMember((Boolean) newValue);
			return;
		case PrivacyModelPackage.LOCATION__TYPE:
			setType((LocationType) newValue);
			return;
		case PrivacyModelPackage.LOCATION__SUB_LOCATIONS:
			getSubLocations().clear();
			getSubLocations().addAll((Collection<? extends Location>) newValue);
			return;
		case PrivacyModelPackage.LOCATION__LEGAL_AGE_LIMIT:
			setLegalAgeLimit((Integer) newValue);
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
		case PrivacyModelPackage.LOCATION__IS_EU_MEMBER:
			setIsEUMember(IS_EU_MEMBER_EDEFAULT);
			return;
		case PrivacyModelPackage.LOCATION__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case PrivacyModelPackage.LOCATION__SUB_LOCATIONS:
			getSubLocations().clear();
			return;
		case PrivacyModelPackage.LOCATION__LEGAL_AGE_LIMIT:
			setLegalAgeLimit(LEGAL_AGE_LIMIT_EDEFAULT);
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
		case PrivacyModelPackage.LOCATION__IS_EU_MEMBER:
			return isEUMember != IS_EU_MEMBER_EDEFAULT;
		case PrivacyModelPackage.LOCATION__TYPE:
			return type != TYPE_EDEFAULT;
		case PrivacyModelPackage.LOCATION__SUB_LOCATIONS:
			return subLocations != null && !subLocations.isEmpty();
		case PrivacyModelPackage.LOCATION__LEGAL_AGE_LIMIT:
			return legalAgeLimit != LEGAL_AGE_LIMIT_EDEFAULT;
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
		case PrivacyModelPackage.LOCATION___EQUALS__LOCATION:
			return equals((Location) arguments.get(0));
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
		result.append(" (isEUMember: ");
		result.append(isEUMember);
		result.append(", type: ");
		result.append(type);
		result.append(", legalAgeLimit: ");
		result.append(legalAgeLimit);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
