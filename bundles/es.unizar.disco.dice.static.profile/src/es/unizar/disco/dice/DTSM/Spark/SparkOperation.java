/**
 */
package es.unizar.disco.dice.DTSM.Spark;

import org.eclipse.emf.common.util.EList;

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
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkOperation#getFunction <em>Function</em>}</li>
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
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
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
	 * Returns the value of the '<em><b>RDD</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RDD</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RDD</em>' attribute list.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkOperation_RDD()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	EList<String> getRDD();

	/**
	 * Returns the value of the '<em><b>Function</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function</em>' attribute list.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkOperation_Function()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" ordered="false"
	 * @generated
	 */
	EList<String> getFunction();

} // SparkOperation
