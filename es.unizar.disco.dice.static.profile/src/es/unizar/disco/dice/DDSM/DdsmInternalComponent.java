/**
 */
package es.unizar.disco.dice.DDSM;

import es.unizar.disco.dice.Basic_Enumeration_Types.DDSMcomponentType;

import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Internal Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getRequiredPort <em>Required Port</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#isFrontEnd <em>Is Front End</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getComponentType <em>Component Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getBase_Node <em>Base Node</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent()
 * @model
 * @generated
 */
public interface DdsmInternalComponent extends DdsmComponent {
	/**
	 * Returns the value of the '<em><b>Required Port</b></em>' reference list.
	 * The list contents are of type {@link es.unizar.disco.dice.DDSM.DdsmPort}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Port</em>' reference list.
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_RequiredPort()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DdsmPort> getRequiredPort();

	/**
	 * Returns the value of the '<em><b>Is Front End</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Front End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Front End</em>' attribute.
	 * @see #setIsFrontEnd(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_IsFrontEnd()
	 * @model default="false" required="true" ordered="false"
	 * @generated
	 */
	boolean isFrontEnd();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#isFrontEnd <em>Is Front End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Front End</em>' attribute.
	 * @see #isFrontEnd()
	 * @generated
	 */
	void setIsFrontEnd(boolean value);

	/**
	 * Returns the value of the '<em><b>Component Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.DDSMcomponentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.DDSMcomponentType
	 * @see #setComponentType(DDSMcomponentType)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_ComponentType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DDSMcomponentType getComponentType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getComponentType <em>Component Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.DDSMcomponentType
	 * @see #getComponentType()
	 * @generated
	 */
	void setComponentType(DDSMcomponentType value);

	/**
	 * Returns the value of the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Node</em>' reference.
	 * @see #setBase_Node(Node)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmInternalComponent_Base_Node()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Node getBase_Node();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmInternalComponent#getBase_Node <em>Base Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Node</em>' reference.
	 * @see #getBase_Node()
	 * @generated
	 */
	void setBase_Node(Node value);

} // DdsmInternalComponent
