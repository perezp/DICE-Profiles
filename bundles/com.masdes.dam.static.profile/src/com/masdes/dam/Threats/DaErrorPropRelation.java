/**
 */
package com.masdes.dam.Threats;

import com.masdes.dam.Complex_Data_Types.DaErrorPropagation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Error Prop Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Threats.DaErrorPropRelation#getPropagationExpr <em>Propagation Expr</em>}</li>
 *   <li>{@link com.masdes.dam.Threats.DaErrorPropRelation#getErrorProp <em>Error Prop</em>}</li>
 *   <li>{@link com.masdes.dam.Threats.DaErrorPropRelation#getBase_Constraint <em>Base Constraint</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Threats.ThreatsPackage#getDaErrorPropRelation()
 * @model
 * @generated
 */
public interface DaErrorPropRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>Propagation Expr</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Propagation Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Propagation Expr</em>' attribute.
	 * @see #setPropagationExpr(String)
	 * @see com.masdes.dam.Threats.ThreatsPackage#getDaErrorPropRelation_PropagationExpr()
	 * @model default="" dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPropagationExpr();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Threats.DaErrorPropRelation#getPropagationExpr <em>Propagation Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Propagation Expr</em>' attribute.
	 * @see #getPropagationExpr()
	 * @generated
	 */
	void setPropagationExpr(String value);

	/**
	 * Returns the value of the '<em><b>Error Prop</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Prop</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Prop</em>' containment reference list.
	 * @see com.masdes.dam.Threats.ThreatsPackage#getDaErrorPropRelation_ErrorProp()
	 * @model containment="true"
	 * @generated
	 */
	EList<DaErrorPropagation> getErrorProp();

	/**
	 * Returns the value of the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Constraint</em>' reference.
	 * @see #setBase_Constraint(Constraint)
	 * @see com.masdes.dam.Threats.ThreatsPackage#getDaErrorPropRelation_Base_Constraint()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Constraint getBase_Constraint();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Threats.DaErrorPropRelation#getBase_Constraint <em>Base Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Constraint</em>' reference.
	 * @see #getBase_Constraint()
	 * @generated
	 */
	void setBase_Constraint(Constraint value);

} // DaErrorPropRelation
