/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import privacyModel.Location;
import privacyModel.LocationType;
import privacyModel.PrivacyModelPackage;

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
	 * The cached invocation delegate for the '{@link #equals(privacyModel.Location) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equals(privacyModel.Location)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EQUALS_LOCATION__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.LOCATION___EQUALS__LOCATION)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals(Location observed) {
		try {
			return (Boolean) EQUALS_LOCATION__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { observed }));
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
