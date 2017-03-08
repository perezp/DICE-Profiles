/**
 */
package es.unizar.disco.dice.DTSM.Spark;

import es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getNAssignedCores <em>NAssigned Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getNAssignedMemory <em>NAssigned Memory</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getJobSchedule <em>Job Schedule</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkScenario()
 * @model
 * @generated
 */
public interface SparkScenario extends GaScenario {
	/**
	 * Returns the value of the '<em><b>NAssigned Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NAssigned Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NAssigned Cores</em>' attribute.
	 * @see #setNAssignedCores(String)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkScenario_NAssignedCores()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getNAssignedCores();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getNAssignedCores <em>NAssigned Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NAssigned Cores</em>' attribute.
	 * @see #getNAssignedCores()
	 * @generated
	 */
	void setNAssignedCores(String value);

	/**
	 * Returns the value of the '<em><b>NAssigned Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NAssigned Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NAssigned Memory</em>' attribute.
	 * @see #setNAssignedMemory(String)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkScenario_NAssignedMemory()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getNAssignedMemory();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getNAssignedMemory <em>NAssigned Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NAssigned Memory</em>' attribute.
	 * @see #getNAssignedMemory()
	 * @generated
	 */
	void setNAssignedMemory(String value);

	/**
	 * Returns the value of the '<em><b>Job Schedule</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Schedule</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Schedule</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling
	 * @see #setJobSchedule(Scheduling)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkScenario_JobSchedule()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Scheduling getJobSchedule();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getJobSchedule <em>Job Schedule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Schedule</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Scheduling
	 * @see #getJobSchedule()
	 * @generated
	 */
	void setJobSchedule(Scheduling value);

} // SparkScenario
