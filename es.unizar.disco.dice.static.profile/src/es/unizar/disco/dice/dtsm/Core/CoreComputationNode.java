/**
 */
package es.unizar.disco.dice.dtsm.Core;

import es.unizar.disco.dice.DPIM.DpimComputationNode;

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
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreComputationNode#getHasSuccessor <em>Has Successor</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreComputationNode#getProcessInputData <em>Process Input Data</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreComputationNode#getRealise <em>Realise</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreComputationNode#getProduceOutputData <em>Produce Output Data</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreComputationNode()
 * @model abstract="true"
 * @generated
 */
public interface CoreComputationNode extends DpimComputationNode {
	/**
	 * Returns the value of the '<em><b>Has Successor</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.dtsm.Core.CoreComputationNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Successor</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Successor</em>' reference list.
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreComputationNode_HasSuccessor()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CoreComputationNode> getHasSuccessor();

	/**
	 * Returns the value of the '<em><b>Process Input Data</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.dtsm.Core.CoreData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Input Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Input Data</em>' reference list.
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreComputationNode_ProcessInputData()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CoreData> getProcessInputData();

	/**
	 * Returns the value of the '<em><b>Realise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Realise</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Realise</em>' reference.
	 * @see #setRealise(CoreDirectAcyclicGraph)
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreComputationNode_Realise()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CoreDirectAcyclicGraph getRealise();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Core.CoreComputationNode#getRealise <em>Realise</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Realise</em>' reference.
	 * @see #getRealise()
	 * @generated
	 */
	void setRealise(CoreDirectAcyclicGraph value);

	/**
	 * Returns the value of the '<em><b>Produce Output Data</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.dtsm.Core.CoreData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produce Output Data</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produce Output Data</em>' reference list.
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreComputationNode_ProduceOutputData()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CoreData> getProduceOutputData();

} // CoreComputationNode
