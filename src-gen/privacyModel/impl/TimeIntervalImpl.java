/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import privacyModel.PrivacyModelPackage;
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
	 * The cached invocation delegate for the '{@link #isTypeDefinedWithOtherType(privacyModel.TimePreposition, privacyModel.TimePreposition) <em>Is Type Defined With Other Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeDefinedWithOtherType(privacyModel.TimePreposition, privacyModel.TimePreposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_TYPE_DEFINED_WITH_OTHER_TYPE_TIME_PREPOSITION_TIME_PREPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.TIME_INTERVAL___IS_TYPE_DEFINED_WITH_OTHER_TYPE__TIMEPREPOSITION_TIMEPREPOSITION)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypeDefinedWithOtherType(TimePreposition firstPrepositionType,
			TimePreposition secondPrepositionType) {
		try {
			return (Boolean) IS_TYPE_DEFINED_WITH_OTHER_TYPE_TIME_PREPOSITION_TIME_PREPOSITION__EINVOCATION_DELEGATE
					.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2,
							new Object[] { firstPrepositionType, secondPrepositionType }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isTypeForbidden(privacyModel.TimePreposition) <em>Is Type Forbidden</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTypeForbidden(privacyModel.TimePreposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_TYPE_FORBIDDEN_TIME_PREPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.TIME_INTERVAL___IS_TYPE_FORBIDDEN__TIMEPREPOSITION)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTypeForbidden(TimePreposition prepositionType) {
		try {
			return (Boolean) IS_TYPE_FORBIDDEN_TIME_PREPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(1, new Object[] { prepositionType }));
		} catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isValid(privacyModel.TimePreposition, privacyModel.TimePreposition) <em>Is Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValid(privacyModel.TimePreposition, privacyModel.TimePreposition)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_VALID_TIME_PREPOSITION_TIME_PREPOSITION__EINVOCATION_DELEGATE = ((EOperation.Internal) PrivacyModelPackage.Literals.TIME_INTERVAL___IS_VALID__TIMEPREPOSITION_TIMEPREPOSITION)
			.getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isValid(TimePreposition firstPrepositionType, TimePreposition secondPrepositionType) {
		try {
			return (Boolean) IS_VALID_TIME_PREPOSITION_TIME_PREPOSITION__EINVOCATION_DELEGATE.dynamicInvoke(this,
					new BasicEList.UnmodifiableEList<Object>(2,
							new Object[] { firstPrepositionType, secondPrepositionType }));
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case PrivacyModelPackage.TIME_INTERVAL___IS_TYPE_DEFINED_WITH_OTHER_TYPE__TIMEPREPOSITION_TIMEPREPOSITION:
			return isTypeDefinedWithOtherType((TimePreposition) arguments.get(0), (TimePreposition) arguments.get(1));
		case PrivacyModelPackage.TIME_INTERVAL___IS_TYPE_FORBIDDEN__TIMEPREPOSITION:
			return isTypeForbidden((TimePreposition) arguments.get(0));
		case PrivacyModelPackage.TIME_INTERVAL___IS_VALID__TIMEPREPOSITION_TIMEPREPOSITION:
			return isValid((TimePreposition) arguments.get(0), (TimePreposition) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TimeIntervalImpl
