/**
 */
package es.unizar.disco.dice.DTSM.Spark;

import es.unizar.disco.dice.DTSM.Core.CoreComputationNode;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkNode#getNCores <em>NCores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkNode#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkNode()
 * @model
 * @generated
 */
public interface SparkNode extends CoreComputationNode, GaScenario {
	/**
	 * Returns the value of the '<em><b>NCores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NCores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NCores</em>' attribute.
	 * @see #setNCores(String)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkNode_NCores()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getNCores();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkNode#getNCores <em>NCores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NCores</em>' attribute.
	 * @see #getNCores()
	 * @generated
	 */
	void setNCores(String value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(String)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkNode_Memory()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Boolean" required="true" ordered="false"
	 * @generated
	 */
	String getMemory();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkNode#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(String value);

} // SparkNode
