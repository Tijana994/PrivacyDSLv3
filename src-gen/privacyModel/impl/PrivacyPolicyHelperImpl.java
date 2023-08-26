/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import privacyModel.AbstractTime;
import privacyModel.PrivacyModelPackage;
import privacyModel.PrivacyPolicyHelper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privacy Policy Helper</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PrivacyPolicyHelperImpl extends MinimalEObjectImpl.Container implements PrivacyPolicyHelper {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivacyPolicyHelperImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER;
	}

	/**
	 * The cached invocation delegate for the '{@link #isPolicyControlValid(java.lang.String) <em>Is Policy Control Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPolicyControlValid(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_POLICY_CONTROL_VALID_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER___IS_POLICY_CONTROL_VALID__STRING)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPolicyControlValid(String policyControl) {
		try {
			return (Boolean) IS_POLICY_CONTROL_VALID_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { policyControl }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isDataSourceValid(java.lang.String) <em>Is Data Source Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDataSourceValid(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_DATA_SOURCE_VALID_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER___IS_DATA_SOURCE_VALID__STRING)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDataSourceValid(String dataSource) {
		try {
			return (Boolean) IS_DATA_SOURCE_VALID_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { dataSource }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #areIntervalsOverlap(privacyModel.AbstractTime, privacyModel.AbstractTime) <em>Are Intervals Overlap</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #areIntervalsOverlap(privacyModel.AbstractTime, privacyModel.AbstractTime)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ARE_INTERVALS_OVERLAP_ABSTRACT_TIME_ABSTRACT_TIME__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER___ARE_INTERVALS_OVERLAP__ABSTRACTTIME_ABSTRACTTIME)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areIntervalsOverlap(AbstractTime time1, AbstractTime time2) {
		try {
			return (Boolean) ARE_INTERVALS_OVERLAP_ABSTRACT_TIME_ABSTRACT_TIME__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(2, new Object[] { time1, time2 }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #areDatesOverlap(privacyModel.AbstractTime, java.util.Date) <em>Are Dates Overlap</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #areDatesOverlap(privacyModel.AbstractTime, java.util.Date)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ARE_DATES_OVERLAP_ABSTRACT_TIME_DATE__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER___ARE_DATES_OVERLAP__ABSTRACTTIME_DATE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean areDatesOverlap(AbstractTime time, Date date) {
		try {
			return (Boolean) ARE_DATES_OVERLAP_ABSTRACT_TIME_DATE__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(2, new Object[] { time, date }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #doesIntervalStartBeforeInterval(privacyModel.AbstractTime, privacyModel.AbstractTime) <em>Does Interval Start Before Interval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #doesIntervalStartBeforeInterval(privacyModel.AbstractTime, privacyModel.AbstractTime)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DOES_INTERVAL_START_BEFORE_INTERVAL_ABSTRACT_TIME_ABSTRACT_TIME__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER___DOES_INTERVAL_START_BEFORE_INTERVAL__ABSTRACTTIME_ABSTRACTTIME)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean doesIntervalStartBeforeInterval(AbstractTime startInterval, AbstractTime finishInterval) {
		try {
			return (Boolean) DOES_INTERVAL_START_BEFORE_INTERVAL_ABSTRACT_TIME_ABSTRACT_TIME__EINVOCATION_DELEGATE
					.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2,
							new Object[] { startInterval, finishInterval }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isDateBeforeInterval(privacyModel.AbstractTime, java.util.Date) <em>Is Date Before Interval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDateBeforeInterval(privacyModel.AbstractTime, java.util.Date)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_DATE_BEFORE_INTERVAL_ABSTRACT_TIME_DATE__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER___IS_DATE_BEFORE_INTERVAL__ABSTRACTTIME_DATE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDateBeforeInterval(AbstractTime time, Date date) {
		try {
			return (Boolean) IS_DATE_BEFORE_INTERVAL_ABSTRACT_TIME_DATE__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(2, new Object[] { time, date }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isDateAfterInterval(privacyModel.AbstractTime, java.util.Date) <em>Is Date After Interval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDateAfterInterval(privacyModel.AbstractTime, java.util.Date)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_DATE_AFTER_INTERVAL_ABSTRACT_TIME_DATE__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER___IS_DATE_AFTER_INTERVAL__ABSTRACTTIME_DATE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDateAfterInterval(AbstractTime time, Date date) {
		try {
			return (Boolean) IS_DATE_AFTER_INTERVAL_ABSTRACT_TIME_DATE__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(2, new Object[] { time, date }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isDateInInterval(privacyModel.AbstractTime, java.util.Date) <em>Is Date In Interval</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDateInInterval(privacyModel.AbstractTime, java.util.Date)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_DATE_IN_INTERVAL_ABSTRACT_TIME_DATE__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.PRIVACY_POLICY_HELPER___IS_DATE_IN_INTERVAL__ABSTRACTTIME_DATE)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDateInInterval(AbstractTime time, Date date) {
		try {
			return (Boolean) IS_DATE_IN_INTERVAL_ABSTRACT_TIME_DATE__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(2, new Object[] { time, date }));
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___IS_POLICY_CONTROL_VALID__STRING:
			return isPolicyControlValid((String) arguments.get(0));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___IS_DATA_SOURCE_VALID__STRING:
			return isDataSourceValid((String) arguments.get(0));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___ARE_INTERVALS_OVERLAP__ABSTRACTTIME_ABSTRACTTIME:
			return areIntervalsOverlap((AbstractTime) arguments.get(0), (AbstractTime) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___ARE_DATES_OVERLAP__ABSTRACTTIME_DATE:
			return areDatesOverlap((AbstractTime) arguments.get(0), (Date) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___DOES_INTERVAL_START_BEFORE_INTERVAL__ABSTRACTTIME_ABSTRACTTIME:
			return doesIntervalStartBeforeInterval((AbstractTime) arguments.get(0), (AbstractTime) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___IS_DATE_BEFORE_INTERVAL__ABSTRACTTIME_DATE:
			return isDateBeforeInterval((AbstractTime) arguments.get(0), (Date) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___IS_DATE_AFTER_INTERVAL__ABSTRACTTIME_DATE:
			return isDateAfterInterval((AbstractTime) arguments.get(0), (Date) arguments.get(1));
		case PrivacyModelPackage.PRIVACY_POLICY_HELPER___IS_DATE_IN_INTERVAL__ABSTRACTTIME_DATE:
			return isDateInInterval((AbstractTime) arguments.get(0), (Date) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //PrivacyPolicyHelperImpl
