/**
 */
package es.unizar.disco.dice.DTSM.Spark;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkReduce#getReduceType <em>Reduce Type</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkReduce()
 * @model
 * @generated
 */
public interface SparkReduce extends SparkOperation {
	/**
	 * Returns the value of the '<em><b>Reduce Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reduce Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reduce Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce
	 * @see #setReduceType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkReduce_ReduceType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce getReduceType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkReduce#getReduceType <em>Reduce Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reduce Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce
	 * @see #getReduceType()
	 * @generated
	 */
	void setReduceType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkReduce value);

} // SparkReduce
