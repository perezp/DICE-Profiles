/**
 */
package es.unizar.disco.dice.DTSM.Spark;

import es.unizar.disco.dice.DTSM.Core.CoreComputationNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkNode#getParallelize <em>Parallelize</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkNode#getNCores <em>NCores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkNode#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkNode()
 * @model
 * @generated
 */
public interface SparkNode extends CoreComputationNode {
	/**
	 * Returns the value of the '<em><b>Parallelize</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallelize</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallelize</em>' attribute list.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkNode_Parallelize()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	EList<String> getParallelize();

	/**
	 * Returns the value of the '<em><b>NCores</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NCores</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NCores</em>' attribute list.
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkNode_NCores()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	EList<String> getNCores();

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
