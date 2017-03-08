/**
 */
package es.unizar.disco.dice.DTSM.Spark;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation#getRDDAvailable <em>RDD Available</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation#getRDD <em>RDD</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation#getOpType <em>Op Type</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkOperation()
 * @model
 * @generated
 */
public interface SparkOperation extends GaStep {
	/**
	 * Returns the value of the '<em><b>RDD Available</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDD Available</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDD Available</em>' attribute.
	 * @see #setRDDAvailable(String)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkOperation_RDDAvailable()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getRDDAvailable();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation#getRDDAvailable <em>RDD Available</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDD Available</em>' attribute.
	 * @see #getRDDAvailable()
	 * @generated
	 */
	void setRDDAvailable(String value);

	/**
	 * Returns the value of the '<em><b>RDD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDD</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDD</em>' attribute.
	 * @see #setRDD(String)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkOperation_RDD()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getRDD();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation#getRDD <em>RDD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RDD</em>' attribute.
	 * @see #getRDD()
	 * @generated
	 */
	void setRDD(String value);

	/**
	 * Returns the value of the '<em><b>Op Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation
	 * @see #setOpType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkOperation_OpType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation getOpType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation#getOpType <em>Op Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation
	 * @see #getOpType()
	 * @generated
	 */
	void setOpType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkOperation value);

} // SparkOperation
