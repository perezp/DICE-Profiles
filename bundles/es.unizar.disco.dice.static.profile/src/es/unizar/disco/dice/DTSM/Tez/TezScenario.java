/**
 */
package es.unizar.disco.dice.DTSM.Tez;

import es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scenario</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getMaxTaskParalellism <em>Max Task Paralellism</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getAmVirtualCores <em>Am Virtual Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getAmMemory <em>Am Memory</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getTaskVirtualCores <em>Task Virtual Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getTaskMemory <em>Task Memory</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezScenario()
 * @model
 * @generated
 */
public interface TezScenario extends CoreDirectAcyclicGraph {
	/**
	 * Returns the value of the '<em><b>Max Task Paralellism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Task Paralellism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Task Paralellism</em>' attribute.
	 * @see #setMaxTaskParalellism(String)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezScenario_MaxTaskParalellism()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getMaxTaskParalellism();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getMaxTaskParalellism <em>Max Task Paralellism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Task Paralellism</em>' attribute.
	 * @see #getMaxTaskParalellism()
	 * @generated
	 */
	void setMaxTaskParalellism(String value);

	/**
	 * Returns the value of the '<em><b>Am Virtual Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Am Virtual Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Am Virtual Cores</em>' attribute.
	 * @see #setAmVirtualCores(String)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezScenario_AmVirtualCores()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getAmVirtualCores();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getAmVirtualCores <em>Am Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Am Virtual Cores</em>' attribute.
	 * @see #getAmVirtualCores()
	 * @generated
	 */
	void setAmVirtualCores(String value);

	/**
	 * Returns the value of the '<em><b>Am Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Am Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Am Memory</em>' attribute.
	 * @see #setAmMemory(String)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezScenario_AmMemory()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getAmMemory();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getAmMemory <em>Am Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Am Memory</em>' attribute.
	 * @see #getAmMemory()
	 * @generated
	 */
	void setAmMemory(String value);

	/**
	 * Returns the value of the '<em><b>Task Virtual Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Virtual Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Virtual Cores</em>' attribute.
	 * @see #setTaskVirtualCores(String)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezScenario_TaskVirtualCores()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getTaskVirtualCores();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getTaskVirtualCores <em>Task Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Virtual Cores</em>' attribute.
	 * @see #getTaskVirtualCores()
	 * @generated
	 */
	void setTaskVirtualCores(String value);

	/**
	 * Returns the value of the '<em><b>Task Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Memory</em>' attribute.
	 * @see #setTaskMemory(String)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezScenario_TaskMemory()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getTaskMemory();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getTaskMemory <em>Task Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Memory</em>' attribute.
	 * @see #getTaskMemory()
	 * @generated
	 */
	void setTaskMemory(String value);

} // TezScenario
