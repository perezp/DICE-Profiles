/**
 */
package es.unizar.disco.dice.DTSM.Spark;

import es.unizar.disco.dice.Basic_Enumeration_Types.ReduceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkReduce#getOpType <em>Op Type</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkReduce()
 * @model
 * @generated
 */
public interface SparkReduce extends SparkTransformation {
	/**
	 * Returns the value of the '<em><b>Op Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.ReduceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ReduceType
	 * @see #setOpType(ReduceType)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkReduce_OpType()
	 * @model ordered="false"
	 * @generated
	 */
	ReduceType getOpType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkReduce#getOpType <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ReduceType
	 * @see #getOpType()
	 * @generated
	 */
	void setOpType(ReduceType value);

} // SparkReduce
