/**
 */
package privacyModel.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
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
import privacyModel.util.PrivacyModelValidator;

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
	 * The cached validation expression for the '{@link #AfterStatementBeforeBeforeStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>After Statement Before Before Statement</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AfterStatementBeforeBeforeStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'After interval should be defined before before interval',\n"
			+ "\tstatus : Boolean = \n" + "\t\t\tself.isValid(TimePreposition::after, TimePreposition::before)\n"
			+ "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AfterStatementBeforeBeforeStatement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.TIME_INTERVAL, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.TIME_INTERVAL___AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT__DIAGNOSTICCHAIN_MAP,
				AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.TIME_INTERVAL__AFTER_STATEMENT_BEFORE_BEFORE_STATEMENT);
	}

	/**
	 * The cached validation expression for the '{@link #UntilTypeShouldBeDefinedAlone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Until Type Should Be Defined Alone</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UntilTypeShouldBeDefinedAlone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'Until statement should be defined alone',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.isTypeForbidden(TimePreposition::until)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean UntilTypeShouldBeDefinedAlone(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.TIME_INTERVAL, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.TIME_INTERVAL___UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP,
				UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.TIME_INTERVAL__UNTIL_TYPE_SHOULD_BE_DEFINED_ALONE);
	}

	/**
	 * The cached validation expression for the '{@link #FromStatementBeforeToStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>From Statement Before To Statement</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FromStatementBeforeToStatement(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_STATEMENT_BEFORE_TO_STATEMENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'From interval should be defined before to interval',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.isValid(TimePreposition::from, TimePreposition::to)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean FromStatementBeforeToStatement(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.TIME_INTERVAL, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.TIME_INTERVAL___FROM_STATEMENT_BEFORE_TO_STATEMENT__DIAGNOSTICCHAIN_MAP,
				FROM_STATEMENT_BEFORE_TO_STATEMENT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.TIME_INTERVAL__FROM_STATEMENT_BEFORE_TO_STATEMENT);
	}

	/**
	 * The cached validation expression for the '{@link #OnlyFromOrFromWithTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only From Or From With To</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OnlyFromOrFromWithTo(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ONLY_FROM_OR_FROM_WITH_TO_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'From interval should be defined alone or with to interval',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t\tself.isTypeDefinedWithOtherType(TimePreposition::from, TimePreposition::to)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyFromOrFromWithTo(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.TIME_INTERVAL, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.TIME_INTERVAL___ONLY_FROM_OR_FROM_WITH_TO__DIAGNOSTICCHAIN_MAP,
				ONLY_FROM_OR_FROM_WITH_TO_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.TIME_INTERVAL__ONLY_FROM_OR_FROM_WITH_TO);
	}

	/**
	 * The cached validation expression for the '{@link #OnlyAfterOrAfterWithBefore(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Only After Or After With Before</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OnlyAfterOrAfterWithBefore(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String ONLY_AFTER_OR_AFTER_WITH_BEFORE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'After interval should be defined alone or with before interval',\n"
			+ "\tstatus : Boolean = \n"
			+ "\t\t\tself.isTypeDefinedWithOtherType(TimePreposition::after, TimePreposition::before)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean OnlyAfterOrAfterWithBefore(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.TIME_INTERVAL, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.TIME_INTERVAL___ONLY_AFTER_OR_AFTER_WITH_BEFORE__DIAGNOSTICCHAIN_MAP,
				ONLY_AFTER_OR_AFTER_WITH_BEFORE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.TIME_INTERVAL__ONLY_AFTER_OR_AFTER_WITH_BEFORE);
	}

	/**
	 * The cached validation expression for the '{@link #AtTypeShouldBeDefinedAlone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>At Type Should Be Defined Alone</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AtTypeShouldBeDefinedAlone(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String AT_TYPE_SHOULD_BE_DEFINED_ALONE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "Tuple {\n"
			+ "\tmessage : String = 'At statement should be defined alone',\n" + "\tstatus : Boolean = \n"
			+ "\t\t\tself.isTypeForbidden(TimePreposition::at)\n" + "}.status";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean AtTypeShouldBeDefinedAlone(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return PrivacyModelValidator.validate(PrivacyModelPackage.Literals.TIME_INTERVAL, this, diagnostics, context,
				"http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				PrivacyModelPackage.Literals.TIME_INTERVAL___AT_TYPE_SHOULD_BE_DEFINED_ALONE__DIAGNOSTICCHAIN_MAP,
				AT_TYPE_SHOULD_BE_DEFINED_ALONE_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION, Diagnostic.ERROR,
				PrivacyModelValidator.DIAGNOSTIC_SOURCE,
				PrivacyModelValidator.TIME_INTERVAL__AT_TYPE_SHOULD_BE_DEFINED_ALONE);
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
