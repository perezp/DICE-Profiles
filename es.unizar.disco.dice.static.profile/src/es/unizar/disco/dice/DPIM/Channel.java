/**
 */
package es.unizar.disco.dice.DPIM;

import com.masdes.dam.Core.DaConnector;

import es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DPIM.Channel#getRate <em>Rate</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.Channel#getMessageBroker <em>Message Broker</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.Channel#getChannelDescription <em>Channel Description</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getChannel()
 * @model
 * @generated
 */
public interface Channel extends DaConnector {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(String)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getChannel_Rate()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Frequency" ordered="false"
	 * @generated
	 */
	String getRate();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.Channel#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(String value);

	/**
	 * Returns the value of the '<em><b>Message Broker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Broker</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Broker</em>' attribute.
	 * @see #setMessageBroker(String)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getChannel_MessageBroker()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getMessageBroker();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.Channel#getMessageBroker <em>Message Broker</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Broker</em>' attribute.
	 * @see #getMessageBroker()
	 * @generated
	 */
	void setMessageBroker(String value);

	/**
	 * Returns the value of the '<em><b>Channel Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channel Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel Description</em>' containment reference.
	 * @see #setChannelDescription(DiceChannelSpecification)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getChannel_ChannelDescription()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DiceChannelSpecification getChannelDescription();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.Channel#getChannelDescription <em>Channel Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel Description</em>' containment reference.
	 * @see #getChannelDescription()
	 * @generated
	 */
	void setChannelDescription(DiceChannelSpecification value);

} // Channel
