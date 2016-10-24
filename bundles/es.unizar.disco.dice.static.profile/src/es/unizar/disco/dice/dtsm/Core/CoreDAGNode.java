/**
 */
package es.unizar.disco.dice.dtsm.Core;

import es.unizar.disco.dice.Basic_Enumeration_Types.WorkflowOperation;

import es.unizar.disco.dice.DPIM.DpimSourceNode;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAG Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreDAGNode#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreDAGNode#getOperation <em>Operation</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreDAGNode#getHasSuccessor <em>Has Successor</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreDAGNode()
 * @model abstract="true"
 * @generated
 */
public interface CoreDAGNode extends GaStep, DpimSourceNode {
	/**
	 * Returns the value of the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parallelism</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parallelism</em>' attribute.
	 * @see #setParallelism(String)
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreDAGNode_Parallelism()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getParallelism();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Core.CoreDAGNode#getParallelism <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parallelism</em>' attribute.
	 * @see #getParallelism()
	 * @generated
	 */
	void setParallelism(String value);

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.WorkflowOperation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.WorkflowOperation
	 * @see #setOperation(WorkflowOperation)
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreDAGNode_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	WorkflowOperation getOperation();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Core.CoreDAGNode#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.WorkflowOperation
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(WorkflowOperation value);

	/**
	 * Returns the value of the '<em><b>Has Successor</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.dtsm.Core.CoreDAGNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Successor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Successor</em>' reference list.
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreDAGNode_HasSuccessor()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CoreDAGNode> getHasSuccessor();

} // CoreDAGNode
