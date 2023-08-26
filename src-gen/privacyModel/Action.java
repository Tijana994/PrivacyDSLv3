/**
 */
package privacyModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see privacyModel.PrivacyModelPackage#getAction()
 * @model
 * @generated
 */
public enum Action implements Enumerator {
	/**
	 * The '<em><b>Store</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORE_VALUE
	 * @generated
	 * @ordered
	 */
	STORE(0, "Store", "Store"),

	/**
	 * The '<em><b>Access</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	ACCESS(1, "Access", "Access"),

	/**
	 * The '<em><b>Collecting</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTING_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECTING(2, "Collecting", "Collecting"),

	/**
	 * The '<em><b>Profiling</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFILING_VALUE
	 * @generated
	 * @ordered
	 */
	PROFILING(6, "Profiling", "Profiling"),

	/**
	 * The '<em><b>Erasure</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERASURE_VALUE
	 * @generated
	 * @ordered
	 */
	ERASURE(7, "Erasure", "Erasure"),

	/**
	 * The '<em><b>Rectification</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTIFICATION_VALUE
	 * @generated
	 * @ordered
	 */
	RECTIFICATION(8, "Rectification", "Rectification"),

	/**
	 * The '<em><b>Transfer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER(6, "Transfer", "Transfer"),

	/**
	 * The '<em><b>Stop Processing</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESSING_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_PROCESSING(7, "StopProcessing", "StopProcessing");

	/**
	 * The '<em><b>Store</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORE
	 * @model name="Store"
	 * @generated
	 * @ordered
	 */
	public static final int STORE_VALUE = 0;

	/**
	 * The '<em><b>Access</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACCESS
	 * @model name="Access"
	 * @generated
	 * @ordered
	 */
	public static final int ACCESS_VALUE = 1;

	/**
	 * The '<em><b>Collecting</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECTING
	 * @model name="Collecting"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECTING_VALUE = 2;

	/**
	 * The '<em><b>Profiling</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROFILING
	 * @model name="Profiling"
	 * @generated
	 * @ordered
	 */
	public static final int PROFILING_VALUE = 6;

	/**
	 * The '<em><b>Erasure</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERASURE
	 * @model name="Erasure"
	 * @generated
	 * @ordered
	 */
	public static final int ERASURE_VALUE = 7;

	/**
	 * The '<em><b>Rectification</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECTIFICATION
	 * @model name="Rectification"
	 * @generated
	 * @ordered
	 */
	public static final int RECTIFICATION_VALUE = 8;

	/**
	 * The '<em><b>Transfer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFER
	 * @model name="Transfer"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_VALUE = 6;

	/**
	 * The '<em><b>Stop Processing</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_PROCESSING
	 * @model name="StopProcessing"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_PROCESSING_VALUE = 7;

	/**
	 * An array of all the '<em><b>Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Action[] VALUES_ARRAY = new Action[] { STORE, ACCESS, COLLECTING, PROFILING, ERASURE,
			RECTIFICATION, TRANSFER, STOP_PROCESSING, };

	/**
	 * A public read-only list of all the '<em><b>Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Action> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Action get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Action result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Action getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Action result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Action get(int value) {
		switch (value) {
		case STORE_VALUE:
			return STORE;
		case ACCESS_VALUE:
			return ACCESS;
		case COLLECTING_VALUE:
			return COLLECTING;
		case PROFILING_VALUE:
			return PROFILING;
		case ERASURE_VALUE:
			return ERASURE;
		case RECTIFICATION_VALUE:
			return RECTIFICATION;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Action(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //Action
