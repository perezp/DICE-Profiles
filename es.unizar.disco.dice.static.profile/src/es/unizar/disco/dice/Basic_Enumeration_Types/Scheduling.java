/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scheduling</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getScheduling()
 * @model
 * @generated
 */
public enum Scheduling implements Enumerator {
	/**
	 * The '<em><b>Capacity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPACITY_VALUE
	 * @generated
	 * @ordered
	 */
	CAPACITY(0, "capacity", "capacity"),

	/**
	 * The '<em><b>Fifo</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIFO_VALUE
	 * @generated
	 * @ordered
	 */
	FIFO(1, "fifo", "fifo"),

	/**
	 * The '<em><b>Fair</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAIR_VALUE
	 * @generated
	 * @ordered
	 */
	FAIR(2, "fair", "fair");

	/**
	 * The '<em><b>Capacity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Capacity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAPACITY
	 * @model name="capacity"
	 * @generated
	 * @ordered
	 */
	public static final int CAPACITY_VALUE = 0;

	/**
	 * The '<em><b>Fifo</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fifo</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIFO
	 * @model name="fifo"
	 * @generated
	 * @ordered
	 */
	public static final int FIFO_VALUE = 1;

	/**
	 * The '<em><b>Fair</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fair</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAIR
	 * @model name="fair"
	 * @generated
	 * @ordered
	 */
	public static final int FAIR_VALUE = 2;

	/**
	 * An array of all the '<em><b>Scheduling</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Scheduling[] VALUES_ARRAY =
		new Scheduling[] {
			CAPACITY,
			FIFO,
			FAIR,
		};

	/**
	 * A public read-only list of all the '<em><b>Scheduling</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Scheduling> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scheduling</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scheduling get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scheduling result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scheduling getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Scheduling result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scheduling</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Scheduling get(int value) {
		switch (value) {
			case CAPACITY_VALUE: return CAPACITY;
			case FIFO_VALUE: return FIFO;
			case FAIR_VALUE: return FAIR;
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
	private Scheduling(int value, String name, String literal) {
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
	
} //Scheduling
