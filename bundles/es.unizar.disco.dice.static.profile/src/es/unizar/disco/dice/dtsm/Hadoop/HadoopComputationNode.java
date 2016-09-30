/**
 */
package es.unizar.disco.dice.dtsm.Hadoop;

import es.unizar.disco.dice.dtsm.Core.CoreComputationNode;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Hadoop.HadoopComputationNode#getNCores <em>NCores</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage#getHadoopComputationNode()
 * @model
 * @generated
 */
public interface HadoopComputationNode extends CoreComputationNode {
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
	 * @see es.unizar.disco.dice.dtsm.Hadoop.HadoopPackage#getHadoopComputationNode_NCores()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" ordered="false"
	 * @generated
	 */
	EList<String> getNCores();

} // HadoopComputationNode
