/**
 */
package es.unizar.disco.dice.Basic_Data_Types;

import es.unizar.disco.dice.Basic_Enumeration_Types.LifeCycleElementType;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptId <em>Script Id</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptUri <em>Script Uri</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptKind <em>Script Kind</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage#getScriptType()
 * @model
 * @generated
 */
public interface ScriptType extends EObject {
	/**
	 * Returns the value of the '<em><b>Script Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Id</em>' attribute.
	 * @see #setScriptId(String)
	 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage#getScriptType_ScriptId()
	 * @model ordered="false"
	 * @generated
	 */
	String getScriptId();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptId <em>Script Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Id</em>' attribute.
	 * @see #getScriptId()
	 * @generated
	 */
	void setScriptId(String value);

	/**
	 * Returns the value of the '<em><b>Script Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Uri</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Uri</em>' attribute.
	 * @see #setScriptUri(String)
	 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage#getScriptType_ScriptUri()
	 * @model ordered="false"
	 * @generated
	 */
	String getScriptUri();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptUri <em>Script Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Uri</em>' attribute.
	 * @see #getScriptUri()
	 * @generated
	 */
	void setScriptUri(String value);

	/**
	 * Returns the value of the '<em><b>Script Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.LifeCycleElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Script Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Script Kind</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.LifeCycleElementType
	 * @see #setScriptKind(LifeCycleElementType)
	 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage#getScriptType_ScriptKind()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LifeCycleElementType getScriptKind();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Basic_Data_Types.ScriptType#getScriptKind <em>Script Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Script Kind</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.LifeCycleElementType
	 * @see #getScriptKind()
	 * @generated
	 */
	void setScriptKind(LifeCycleElementType value);

} // ScriptType
