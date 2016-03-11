/**
 */
package es.unizar.disco.dice.DPIM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dice Filter Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DPIM.DiceFilterNode#getInputRatio <em>Input Ratio</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.DiceFilterNode#getOutputRation <em>Output Ration</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDiceFilterNode()
 * @model
 * @generated
 */
public interface DiceFilterNode extends DiceComponent {
	/**
	 * Returns the value of the '<em><b>Input Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Ratio</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Ratio</em>' attribute.
	 * @see #setInputRatio(String)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDiceFilterNode_InputRatio()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Frequency" ordered="false"
	 * @generated
	 */
	String getInputRatio();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.DiceFilterNode#getInputRatio <em>Input Ratio</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Ratio</em>' attribute.
	 * @see #getInputRatio()
	 * @generated
	 */
	void setInputRatio(String value);

	/**
	 * Returns the value of the '<em><b>Output Ration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output Ration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Ration</em>' attribute.
	 * @see #setOutputRation(String)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDiceFilterNode_OutputRation()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Frequency" ordered="false"
	 * @generated
	 */
	String getOutputRation();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.DiceFilterNode#getOutputRation <em>Output Ration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Ration</em>' attribute.
	 * @see #getOutputRation()
	 * @generated
	 */
	void setOutputRation(String value);

} // DiceFilterNode
