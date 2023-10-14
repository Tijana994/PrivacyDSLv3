/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import privacyModel.AbstractPaper;
import privacyModel.Principal;
import privacyModel.PrivacyModelPackage;
import privacyModel.util.PrivacyModelValidator;

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
	 * The cached validation expression for the '{@link #StartDateShouldBeBeforeTerminationDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Start Date Should Be Before Termination Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #StartDateShouldBeBeforeTerminationDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Terminationdate is after startdate!',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.terminationDate = null or (not(self.startDate > self.terminationDate))\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean StartDateShouldBeBeforeTerminationDate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.ABSTRACT_PAPER, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.ABSTRACT_PAPER___START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE__DIAGNOSTICCHAIN_MAP,
				START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.ABSTRACT_PAPER__START_DATE_SHOULD_BE_BEFORE_TERMINATION_DATE);
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
