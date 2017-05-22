/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Spark Reduce</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#getSparkReduce()
 * @model
 * @generated
 */
public enum SparkReduce implements Enumerator {
	/**
	 * The '<em><b>Reduce</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REDUCE_VALUE
	 * @generated
	 * @ordered
	 */
	REDUCE(0, "Reduce", "Reduce"),

	/**
	 * The '<em><b>Sample</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SAMPLE(1, "Sample", "Sample"), /**
	 * The '<em><b>Collect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLECT_VALUE
	 * @generated
	 * @ordered
	 */
	COLLECT(2, "Collect", "Collect"), /**
	 * The '<em><b>Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT(3, "Count", "Count"),

	/**
	 * The '<em><b>Save As</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVE_AS_VALUE
	 * @generated
	 * @ordered
	 */
	SAVE_AS(4, "SaveAs", "SaveAs"), /**
	 * The '<em><b>Count By Key</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUNT_BY_KEY_VALUE
	 * @generated
	 * @ordered
	 */
	COUNT_BY_KEY(5, "CountByKey", "CountByKey"), /**
	 * The '<em><b>For Each</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOR_EACH_VALUE
	 * @generated
	 * @ordered
	 */
	FOR_EACH(6, "ForEach", "ForEach");

	/**
	 * The '<em><b>Reduce</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reduce</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REDUCE
	 * @model name="Reduce"
	 * @generated
	 * @ordered
	 */
	public static final int REDUCE_VALUE = 0;

	/**
	 * The '<em><b>Sample</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sample</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAMPLE
	 * @model name="Sample"
	 * @generated
	 * @ordered
	 */
	public static final int SAMPLE_VALUE = 1;

	/**
	 * The '<em><b>Collect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLECT
	 * @model name="Collect"
	 * @generated
	 * @ordered
	 */
	public static final int COLLECT_VALUE = 2;

	/**
	 * The '<em><b>Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Count</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNT
	 * @model name="Count"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_VALUE = 3;

	/**
	 * The '<em><b>Save As</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Save As</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAVE_AS
	 * @model name="SaveAs"
	 * @generated
	 * @ordered
	 */
	public static final int SAVE_AS_VALUE = 4;

	/**
	 * The '<em><b>Count By Key</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Count By Key</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUNT_BY_KEY
	 * @model name="CountByKey"
	 * @generated
	 * @ordered
	 */
	public static final int COUNT_BY_KEY_VALUE = 5;

	/**
	 * The '<em><b>For Each</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>For Each</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOR_EACH
	 * @model name="ForEach"
	 * @generated
	 * @ordered
	 */
	public static final int FOR_EACH_VALUE = 6;

	/**
	 * An array of all the '<em><b>Spark Reduce</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SparkReduce[] VALUES_ARRAY =
		new SparkReduce[] {
			REDUCE,
			SAMPLE,
			COLLECT,
			COUNT,
			SAVE_AS,
			COUNT_BY_KEY,
			FOR_EACH,
		};

	/**
	 * A public read-only list of all the '<em><b>Spark Reduce</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SparkReduce> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Spark Reduce</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkReduce get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SparkReduce result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spark Reduce</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkReduce getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SparkReduce result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Spark Reduce</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SparkReduce get(int value) {
		switch (value) {
			case REDUCE_VALUE: return REDUCE;
			case SAMPLE_VALUE: return SAMPLE;
			case COLLECT_VALUE: return COLLECT;
			case COUNT_VALUE: return COUNT;
			case SAVE_AS_VALUE: return SAVE_AS;
			case COUNT_BY_KEY_VALUE: return COUNT_BY_KEY;
			case FOR_EACH_VALUE: return FOR_EACH;
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
	private SparkReduce(int value, String name, String literal) {
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
	
} //SparkReduce
