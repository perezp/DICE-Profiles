/**
 */
package es.unizar.disco.dice.DTSM.Storm;

import es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario Topology</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getQueueThreshold <em>Queue Threshold</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getMaxTaskParallelism <em>Max Task Parallelism</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getMaxSpoutPending <em>Max Spout Pending</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#isReliable <em>Is Reliable</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormScenarioTopology()
 * @model
 * @generated
 */
public interface StormScenarioTopology extends CoreDirectAcyclicGraph {
	/**
	 * Returns the value of the '<em><b>Queue Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue Threshold</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queue Threshold</em>' attribute.
	 * @see #setQueueThreshold(int)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormScenarioTopology_QueueThreshold()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getQueueThreshold();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getQueueThreshold <em>Queue Threshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Queue Threshold</em>' attribute.
	 * @see #getQueueThreshold()
	 * @generated
	 */
	void setQueueThreshold(int value);

	/**
	 * Returns the value of the '<em><b>Max Task Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Task Parallelism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Task Parallelism</em>' attribute.
	 * @see #setMaxTaskParallelism(int)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormScenarioTopology_MaxTaskParallelism()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMaxTaskParallelism();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getMaxTaskParallelism <em>Max Task Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Task Parallelism</em>' attribute.
	 * @see #getMaxTaskParallelism()
	 * @generated
	 */
	void setMaxTaskParallelism(int value);

	/**
	 * Returns the value of the '<em><b>Max Spout Pending</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Spout Pending</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Spout Pending</em>' attribute.
	 * @see #setMaxSpoutPending(int)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormScenarioTopology_MaxSpoutPending()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMaxSpoutPending();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#getMaxSpoutPending <em>Max Spout Pending</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Spout Pending</em>' attribute.
	 * @see #getMaxSpoutPending()
	 * @generated
	 */
	void setMaxSpoutPending(int value);

	/**
	 * Returns the value of the '<em><b>Is Reliable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Reliable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reliable</em>' attribute.
	 * @see #setIsReliable(boolean)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormScenarioTopology_IsReliable()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isReliable();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology#isReliable <em>Is Reliable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reliable</em>' attribute.
	 * @see #isReliable()
	 * @generated
	 */
	void setIsReliable(boolean value);

} // StormScenarioTopology
