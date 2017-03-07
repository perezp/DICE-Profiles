/**
 */
package es.unizar.disco.dice.DTSM.Spark;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent#getSparkPopulation <em>Spark Population</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent#getSparkExtDelay <em>Spark Ext Delay</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkWorkloadEvent()
 * @model
 * @generated
 */
public interface SparkWorkloadEvent extends GaWorkloadEvent {

	/**
	 * Returns the value of the '<em><b>Spark Population</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spark Population</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spark Population</em>' attribute.
	 * @see #setSparkPopulation(String)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkWorkloadEvent_SparkPopulation()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getSparkPopulation();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent#getSparkPopulation <em>Spark Population</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spark Population</em>' attribute.
	 * @see #getSparkPopulation()
	 * @generated
	 */
	void setSparkPopulation(String value);

	/**
	 * Returns the value of the '<em><b>Spark Ext Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spark Ext Delay</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spark Ext Delay</em>' attribute.
	 * @see #setSparkExtDelay(String)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkWorkloadEvent_SparkExtDelay()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Duration" required="true" ordered="false"
	 * @generated
	 */
	String getSparkExtDelay();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkWorkloadEvent#getSparkExtDelay <em>Spark Ext Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spark Ext Delay</em>' attribute.
	 * @see #getSparkExtDelay()
	 * @generated
	 */
	void setSparkExtDelay(String value);
} // SparkWorkloadEvent
