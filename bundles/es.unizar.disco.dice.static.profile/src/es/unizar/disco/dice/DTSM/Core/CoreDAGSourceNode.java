/**
 */
package es.unizar.disco.dice.DTSM.Core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DAG Source Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Core.CoreDAGSourceNode#getReadFrom <em>Read From</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Core.CorePackage#getCoreDAGSourceNode()
 * @model abstract="true"
 * @generated
 */
public interface CoreDAGSourceNode extends CoreDAGNode {
	/**
	 * Returns the value of the '<em><b>Read From</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.DTSM.Core.CoreDataSource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read From</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read From</em>' reference list.
	 * @see es.unizar.disco.dice.DTSM.Core.CorePackage#getCoreDAGSourceNode_ReadFrom()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	EList<CoreDataSource> getReadFrom();

} // CoreDAGSourceNode
