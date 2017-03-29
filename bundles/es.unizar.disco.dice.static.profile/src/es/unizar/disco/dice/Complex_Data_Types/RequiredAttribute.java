/**
 */
package es.unizar.disco.dice.Complex_Data_Types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Required Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute#getReferenceNode <em>Reference Node</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute#getAttributeName <em>Attribute Name</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getRequiredAttribute()
 * @model
 * @generated
 */
public interface RequiredAttribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Node</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Node</em>' attribute.
	 * @see #setReferenceNode(String)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getRequiredAttribute_ReferenceNode()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getReferenceNode();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute#getReferenceNode <em>Reference Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Node</em>' attribute.
	 * @see #getReferenceNode()
	 * @generated
	 */
	void setReferenceNode(String value);

	/**
	 * Returns the value of the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Name</em>' attribute.
	 * @see #setAttributeName(String)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getRequiredAttribute_AttributeName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getAttributeName();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.RequiredAttribute#getAttributeName <em>Attribute Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Name</em>' attribute.
	 * @see #getAttributeName()
	 * @generated
	 */
	void setAttributeName(String value);

} // RequiredAttribute
