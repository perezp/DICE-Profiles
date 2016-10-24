/**
 */
package com.masdes.dam.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Detectabillity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getDetectabillity()
 * @model
 * @generated
 */
public enum Detectabillity implements Enumerator {
	/**
	 * The '<em><b>Signaled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNALED_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNALED(0, "signaled", "signaled"),

	/**
	 * The '<em><b>Unsignaled</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNSIGNALED_VALUE
	 * @generated
	 * @ordered
	 */
	UNSIGNALED(1, "unsignaled", "unsignaled");

	/**
	 * The '<em><b>Signaled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Signaled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNALED
	 * @model name="signaled"
	 * @generated
	 * @ordered
	 */
	public static final int SIGNALED_VALUE = 0;

	/**
	 * The '<em><b>Unsignaled</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unsignaled</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNSIGNALED
	 * @model name="unsignaled"
	 * @generated
	 * @ordered
	 */
	public static final int UNSIGNALED_VALUE = 1;

	/**
	 * An array of all the '<em><b>Detectabillity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Detectabillity[] VALUES_ARRAY =
		new Detectabillity[] {
			SIGNALED,
			UNSIGNALED,
		};

	/**
	 * A public read-only list of all the '<em><b>Detectabillity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Detectabillity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Detectabillity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Detectabillity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Detectabillity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Detectabillity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Detectabillity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Detectabillity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Detectabillity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Detectabillity get(int value) {
		switch (value) {
			case SIGNALED_VALUE: return SIGNALED;
			case UNSIGNALED_VALUE: return UNSIGNALED;
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
	private Detectabillity(int value, String name, String literal) {
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
	
} //Detectabillity
