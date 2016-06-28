/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Tech Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getTechType()
 * @model
 * @generated
 */
public enum TechType implements Enumerator {
	/**
	 * The '<em><b>Hadoop</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HADOOP_VALUE
	 * @generated
	 * @ordered
	 */
	HADOOP(0, "hadoop", "hadoop"), /**
	 * The '<em><b>Spark</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPARK_VALUE
	 * @generated
	 * @ordered
	 */
	SPARK(1, "spark", "spark"), /**
	 * The '<em><b>Storm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STORM_VALUE
	 * @generated
	 * @ordered
	 */
	STORM(2, "storm", "storm"), /**
	 * The '<em><b>Oryx2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORYX2_VALUE
	 * @generated
	 * @ordered
	 */
	ORYX2(3, "oryx2", "oryx2");

	/**
	 * The '<em><b>Hadoop</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hadoop</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HADOOP
	 * @model name="hadoop"
	 * @generated
	 * @ordered
	 */
	public static final int HADOOP_VALUE = 0;

	/**
	 * The '<em><b>Spark</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spark</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPARK
	 * @model name="spark"
	 * @generated
	 * @ordered
	 */
	public static final int SPARK_VALUE = 1;

	/**
	 * The '<em><b>Storm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Storm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STORM
	 * @model name="storm"
	 * @generated
	 * @ordered
	 */
	public static final int STORM_VALUE = 2;

	/**
	 * The '<em><b>Oryx2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oryx2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORYX2
	 * @model name="oryx2"
	 * @generated
	 * @ordered
	 */
	public static final int ORYX2_VALUE = 3;

	/**
	 * An array of all the '<em><b>Tech Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TechType[] VALUES_ARRAY =
		new TechType[] {
			HADOOP,
			SPARK,
			STORM,
			ORYX2,
		};

	/**
	 * A public read-only list of all the '<em><b>Tech Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TechType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tech Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TechType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TechType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tech Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TechType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TechType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tech Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static TechType get(int value) {
		switch (value) {
			case HADOOP_VALUE: return HADOOP;
			case SPARK_VALUE: return SPARK;
			case STORM_VALUE: return STORM;
			case ORYX2_VALUE: return ORYX2;
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
	private TechType(int value, String name, String literal) {
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
	
} //TechType
