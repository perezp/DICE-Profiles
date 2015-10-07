/**
 */
package com.masdes.dam.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Objective</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getObjective()
 * @model
 * @generated
 */
public enum Objective implements Enumerator {
	/**
	 * The '<em><b>Malicious</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MALICIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	MALICIOUS(0, "malicious", "malicious"),

	/**
	 * The '<em><b>Non Malicious</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NON_MALICIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	NON_MALICIOUS(1, "nonMalicious", "nonMalicious");

	/**
	 * The '<em><b>Malicious</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Malicious</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MALICIOUS
	 * @model name="malicious"
	 * @generated
	 * @ordered
	 */
	public static final int MALICIOUS_VALUE = 0;

	/**
	 * The '<em><b>Non Malicious</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Non Malicious</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NON_MALICIOUS
	 * @model name="nonMalicious"
	 * @generated
	 * @ordered
	 */
	public static final int NON_MALICIOUS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Objective</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Objective[] VALUES_ARRAY =
		new Objective[] {
			MALICIOUS,
			NON_MALICIOUS,
		};

	/**
	 * A public read-only list of all the '<em><b>Objective</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Objective> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Objective</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Objective get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Objective result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Objective</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Objective getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Objective result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Objective</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Objective get(int value) {
		switch (value) {
			case MALICIOUS_VALUE: return MALICIOUS;
			case NON_MALICIOUS_VALUE: return NON_MALICIOUS;
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
	private Objective(int value, String name, String literal) {
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
	
} //Objective
