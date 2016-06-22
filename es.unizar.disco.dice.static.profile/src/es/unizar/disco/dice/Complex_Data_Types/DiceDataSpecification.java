/**
 */
package es.unizar.disco.dice.Complex_Data_Types;

import es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType;
import es.unizar.disco.dice.Basic_Enumeration_Types.RefType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dice Data Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getDescription <em>Description</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getSize <em>Size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefModel <em>Ref Model</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefDataFormat <em>Ref Data Format</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getDiceDataSpecification()
 * @model
 * @generated
 */
public interface DiceDataSpecification extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getDiceDataSpecification_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(String)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getDiceDataSpecification_Size()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_DataSize" ordered="false"
	 * @generated
	 */
	String getSize();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(String value);

	/**
	 * Returns the value of the '<em><b>Ref Model</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.RefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Model</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Model</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.RefType
	 * @see #setRefModel(RefType)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getDiceDataSpecification_RefModel()
	 * @model ordered="false"
	 * @generated
	 */
	RefType getRefModel();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefModel <em>Ref Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Model</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.RefType
	 * @see #getRefModel()
	 * @generated
	 */
	void setRefModel(RefType value);

	/**
	 * Returns the value of the '<em><b>Ref Data Format</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Data Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Data Format</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType
	 * @see #setRefDataFormat(RefDataFormatType)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getDiceDataSpecification_RefDataFormat()
	 * @model ordered="false"
	 * @generated
	 */
	RefDataFormatType getRefDataFormat();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefDataFormat <em>Ref Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Data Format</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType
	 * @see #getRefDataFormat()
	 * @generated
	 */
	void setRefDataFormat(RefDataFormatType value);

} // DiceDataSpecification
