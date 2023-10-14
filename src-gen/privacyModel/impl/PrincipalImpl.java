/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import privacyModel.Location;
import privacyModel.Principal;
import privacyModel.PrincipalScope;
import privacyModel.PrincipalType;
import privacyModel.PrivacyModelPackage;
import privacyModel.util.PrivacyModelValidator;

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
	 * The cached invocation delegate for the '{@link #equals(privacyModel.Principal) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #equals(privacyModel.Principal)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EQUALS_PRINCIPAL__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PRINCIPAL___EQUALS__PRINCIPAL)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean equals(Principal observed) {
		try {
			return (Boolean) EQUALS_PRINCIPAL__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { observed }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached validation expression for the '{@link #NaturalPersonCanNotConatainsSubPrincipals(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Natural Person Can Not Conatains Sub Principals</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NaturalPersonCanNotConatainsSubPrincipals(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String NATURAL_PERSON_CAN_NOT_CONATAINS_SUB_PRINCIPALS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "\n"
			+ "\t\t\tif(self.type = PrincipalType::NaturalPerson) then\n" + "\t\t\t\tself.subPrincipals->isEmpty()\n"
			+ "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\t\tendif";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean NaturalPersonCanNotConatainsSubPrincipals(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRINCIPAL, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRINCIPAL___NATURAL_PERSON_CAN_NOT_CONATAINS_SUB_PRINCIPALS__DIAGNOSTICCHAIN_MAP,
				NATURAL_PERSON_CAN_NOT_CONATAINS_SUB_PRINCIPALS_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.PRINCIPAL__NATURAL_PERSON_CAN_NOT_CONATAINS_SUB_PRINCIPALS);
	}

	/**
	 * The cached validation expression for the '{@link #JuvenileShouldHaveResponsiblePerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Juvenile Should Have Responsible Person</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JuvenileShouldHaveResponsiblePerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Based on Art8',\n" + "\tstatus : Boolean = \n"
			+ "\t\tif(self.type = PrincipalType::NaturalPerson and self.age < PrivacyPolicy.allInstances()->asSequence()->first().owner.inhabits.legalAgeLimit) then\n"
			+ "\t\t\t\tnot(self.responsiblePersons->isEmpty())\n" + "\t\t\telse\n" + "\t\t\t\ttrue\n" + "\t\tendif\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean JuvenileShouldHaveResponsiblePerson(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.PRINCIPAL, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.PRINCIPAL___JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON__DIAGNOSTICCHAIN_MAP,
				JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.PRINCIPAL__JUVENILE_SHOULD_HAVE_RESPONSIBLE_PERSON);
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
		case PrivacyModelPackage.PRINCIPAL___NATURAL_PERSON_CAN_NOT_CONATAINS_SUB_PRINCIPALS__DIAGNOSTICCHAIN_MAP:
			return NaturalPersonCanNotConatainsSubPrincipals((DiagnosticChain) arguments.get(0),
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
