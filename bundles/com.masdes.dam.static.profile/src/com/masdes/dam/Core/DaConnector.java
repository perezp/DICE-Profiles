/**
 */
package com.masdes.dam.Core;

import com.masdes.dam.Complex_Data_Types.DaErrorPropagation;
import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaHazard;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Connector;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.Extend;
import org.eclipse.uml2.uml.Include;
import org.eclipse.uml2.uml.InvocationAction;
import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Da Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getCoupling <em>Coupling</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getErrorProp <em>Error Prop</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getHazard <em>Hazard</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getBase_InvocationAction <em>Base Invocation Action</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getBase_Extend <em>Base Extend</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getBase_Include <em>Base Include</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getBase_Connector <em>Base Connector</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link com.masdes.dam.Core.DaConnector#getBase_Association <em>Base Association</em>}</li>
 * </ul>
 *
 * @see com.masdes.dam.Core.CorePackage#getDaConnector()
 * @model
 * @generated
 */
public interface DaConnector extends EObject {
	/**
	 * Returns the value of the '<em><b>Coupling</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coupling</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupling</em>' attribute list.
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_Coupling()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	EList<String> getCoupling();

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
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_ErrorProp()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaErrorPropagation> getErrorProp();

	/**
	 * Returns the value of the '<em><b>Failure</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaFailure}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Failure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failure</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_Failure()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaFailure> getFailure();

	/**
	 * Returns the value of the '<em><b>Hazard</b></em>' containment reference list.
	 * The list contents are of type {@link com.masdes.dam.Complex_Data_Types.DaHazard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hazard</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hazard</em>' containment reference list.
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_Hazard()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<DaHazard> getHazard();

	/**
	 * Returns the value of the '<em><b>Base Invocation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Invocation Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Invocation Action</em>' reference.
	 * @see #setBase_InvocationAction(InvocationAction)
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_Base_InvocationAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InvocationAction getBase_InvocationAction();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaConnector#getBase_InvocationAction <em>Base Invocation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Invocation Action</em>' reference.
	 * @see #getBase_InvocationAction()
	 * @generated
	 */
	void setBase_InvocationAction(InvocationAction value);

	/**
	 * Returns the value of the '<em><b>Base Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Extend</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Extend</em>' reference.
	 * @see #setBase_Extend(Extend)
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_Base_Extend()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Extend getBase_Extend();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaConnector#getBase_Extend <em>Base Extend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Extend</em>' reference.
	 * @see #getBase_Extend()
	 * @generated
	 */
	void setBase_Extend(Extend value);

	/**
	 * Returns the value of the '<em><b>Base Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Include</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Include</em>' reference.
	 * @see #setBase_Include(Include)
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_Base_Include()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Include getBase_Include();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaConnector#getBase_Include <em>Base Include</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Include</em>' reference.
	 * @see #getBase_Include()
	 * @generated
	 */
	void setBase_Include(Include value);

	/**
	 * Returns the value of the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Message</em>' reference.
	 * @see #setBase_Message(Message)
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_Base_Message()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Message getBase_Message();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaConnector#getBase_Message <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Message</em>' reference.
	 * @see #getBase_Message()
	 * @generated
	 */
	void setBase_Message(Message value);

	/**
	 * Returns the value of the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connector</em>' reference.
	 * @see #setBase_Connector(Connector)
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_Base_Connector()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Connector getBase_Connector();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaConnector#getBase_Connector <em>Base Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connector</em>' reference.
	 * @see #getBase_Connector()
	 * @generated
	 */
	void setBase_Connector(Connector value);

	/**
	 * Returns the value of the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Dependency</em>' reference.
	 * @see #setBase_Dependency(Dependency)
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_Base_Dependency()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaConnector#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Association</em>' reference.
	 * @see #setBase_Association(Association)
	 * @see com.masdes.dam.Core.CorePackage#getDaConnector_Base_Association()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Sets the value of the '{@link com.masdes.dam.Core.DaConnector#getBase_Association <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Association</em>' reference.
	 * @see #getBase_Association()
	 * @generated
	 */
	void setBase_Association(Association value);

} // DaConnector
