/**
 */
package es.unizar.disco.dice.DPIM;

import es.unizar.disco.dice.Basic_Enumeration_Types.SourceType;

import es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification;
import es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dpim Source Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getStore <em>Store</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getProvides <em>Provides</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getRate <em>Rate</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDpimSourceNode()
 * @model
 * @generated
 */
public interface DpimSourceNode extends DpimComputationNode {
	/**
	 * Returns the value of the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Store</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store</em>' containment reference.
	 * @see #setStore(DiceDataVolume)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDpimSourceNode_Store()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DiceDataVolume getStore();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getStore <em>Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store</em>' containment reference.
	 * @see #getStore()
	 * @generated
	 */
	void setStore(DiceDataVolume value);

	/**
	 * Returns the value of the '<em><b>Provides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provides</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provides</em>' containment reference.
	 * @see #setProvides(DiceDataSpecification)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDpimSourceNode_Provides()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DiceDataSpecification getProvides();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getProvides <em>Provides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provides</em>' containment reference.
	 * @see #getProvides()
	 * @generated
	 */
	void setProvides(DiceDataSpecification value);

	/**
	 * Returns the value of the '<em><b>Source Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.SourceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SourceType
	 * @see #setSourceType(SourceType)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDpimSourceNode_SourceType()
	 * @model ordered="false"
	 * @generated
	 */
	SourceType getSourceType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getSourceType <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SourceType
	 * @see #getSourceType()
	 * @generated
	 */
	void setSourceType(SourceType value);

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
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDpimSourceNode_Rate()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Frequency" ordered="false"
	 * @generated
	 */
	String getRate();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(String value);

} // DpimSourceNode
