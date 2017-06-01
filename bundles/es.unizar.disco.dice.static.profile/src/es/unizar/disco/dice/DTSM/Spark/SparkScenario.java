/**
 */
package es.unizar.disco.dice.DTSM.Spark;

import com.masdes.dam.Core.DaService;

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
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getSparkDefaultParallelism <em>Spark Default Parallelism</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkScenario()
 * @model
 * @generated
 */
public interface SparkScenario extends DaService {
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
	 * Returns the value of the '<em><b>Spark Default Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spark Default Parallelism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spark Default Parallelism</em>' attribute.
	 * @see #setSparkDefaultParallelism(String)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkScenario_SparkDefaultParallelism()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getSparkDefaultParallelism();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkScenario#getSparkDefaultParallelism <em>Spark Default Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spark Default Parallelism</em>' attribute.
	 * @see #getSparkDefaultParallelism()
	 * @generated
	 */
	void setSparkDefaultParallelism(String value);

} // SparkScenario
