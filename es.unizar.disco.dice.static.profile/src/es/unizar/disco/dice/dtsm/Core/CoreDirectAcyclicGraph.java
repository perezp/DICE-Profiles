/**
 */
package es.unizar.disco.dice.dtsm.Core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Direct Acyclic Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreDirectAcyclicGraph#getHasSourceNode <em>Has Source Node</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreDirectAcyclicGraph#getBase_Class <em>Base Class</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreDirectAcyclicGraph()
 * @model
 * @generated
 */
public interface CoreDirectAcyclicGraph extends GaScenario {
	/**
	 * Returns the value of the '<em><b>Has Source Node</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.dtsm.Core.CoreDAGSourceNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Source Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Source Node</em>' reference list.
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreDirectAcyclicGraph_HasSourceNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CoreDAGSourceNode> getHasSourceNode();

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreDirectAcyclicGraph_Base_Class()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Core.CoreDirectAcyclicGraph#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

} // CoreDirectAcyclicGraph
