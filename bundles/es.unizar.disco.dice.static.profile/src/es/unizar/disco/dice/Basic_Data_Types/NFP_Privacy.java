/**
 */
package es.unizar.disco.dice.Basic_Data_Types;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.SourceKind;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFP Privacy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getExpr <em>Expr</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage#getNFP_Privacy()
 * @model
 * @generated
 */
public interface NFP_Privacy extends EObject {
	/**
	 * Returns the value of the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expr</em>' attribute.
	 * @see #setExpr(String)
	 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage#getNFP_Privacy_Expr()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.VSL_Expression" required="true" ordered="false"
	 * @generated
	 */
	String getExpr();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getExpr <em>Expr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expr</em>' attribute.
	 * @see #getExpr()
	 * @generated
	 */
	void setExpr(String value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.SourceKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' attribute.
	 * @see org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.SourceKind
	 * @see #setSource(SourceKind)
	 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage#getNFP_Privacy_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SourceKind getSource();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getSource <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' attribute.
	 * @see org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.SourceKind
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SourceKind value);

} // NFP_Privacy
