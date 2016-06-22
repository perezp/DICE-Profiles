/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Processing Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getProcessingType()
 * @model
 * @generated
 */
public enum ProcessingType implements Enumerator {
	/**
	 * The '<em><b>Synch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYNCH_VALUE
	 * @generated
	 * @ordered
	 */
	SYNCH(0, "synch", "synch"),

	/**
	 * The '<em><b>Asynch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASYNCH_VALUE
	 * @generated
	 * @ordered
	 */
	ASYNCH(1, "asynch", "asynch"),

	/**
	 * The '<em><b>Policy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POLICY_VALUE
	 * @generated
	 * @ordered
	 */
	POLICY(2, "policy", "policy");

	/**
	 * The '<em><b>Synch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Synch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYNCH
	 * @model name="synch"
	 * @generated
	 * @ordered
	 */
	public static final int SYNCH_VALUE = 0;

	/**
	 * The '<em><b>Asynch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Asynch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASYNCH
	 * @model name="asynch"
	 * @generated
	 * @ordered
	 */
	public static final int ASYNCH_VALUE = 1;

	/**
	 * The '<em><b>Policy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Policy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POLICY
	 * @model name="policy"
	 * @generated
	 * @ordered
	 */
	public static final int POLICY_VALUE = 2;

	/**
	 * An array of all the '<em><b>Processing Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProcessingType[] VALUES_ARRAY =
		new ProcessingType[] {
			SYNCH,
			ASYNCH,
			POLICY,
		};

	/**
	 * A public read-only list of all the '<em><b>Processing Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProcessingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Processing Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProcessingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Processing Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ProcessingType get(int value) {
		switch (value) {
			case SYNCH_VALUE: return SYNCH;
			case ASYNCH_VALUE: return ASYNCH;
			case POLICY_VALUE: return POLICY;
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
	private ProcessingType(int value, String name, String literal) {
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
	
} //ProcessingType
