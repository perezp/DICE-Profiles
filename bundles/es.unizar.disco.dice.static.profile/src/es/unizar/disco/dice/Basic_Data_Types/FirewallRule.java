/**
 */
package es.unizar.disco.dice.Basic_Data_Types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Firewall Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.FirewallRule#getAllowedIpPrefix <em>Allowed Ip Prefix</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Basic_Data_Types.FirewallRule#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage#getFirewallRule()
 * @model
 * @generated
 */
public interface FirewallRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Allowed Ip Prefix</b></em>' attribute.
	 * The default value is <code>"0.0.0.0/0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allowed Ip Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allowed Ip Prefix</em>' attribute.
	 * @see #setAllowedIpPrefix(String)
	 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage#getFirewallRule_AllowedIpPrefix()
	 * @model default="0.0.0.0/0" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAllowedIpPrefix();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Basic_Data_Types.FirewallRule#getAllowedIpPrefix <em>Allowed Ip Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allowed Ip Prefix</em>' attribute.
	 * @see #getAllowedIpPrefix()
	 * @generated
	 */
	void setAllowedIpPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesPackage#getFirewallRule_Port()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Basic_Data_Types.FirewallRule#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

} // FirewallRule
