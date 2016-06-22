/**
 */
package es.unizar.disco.dice.DPIM;

import com.masdes.dam.Core.DaComponent;

import es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType;
import es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType;
import es.unizar.disco.dice.Basic_Enumeration_Types.TechType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dpim Computation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getType <em>Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getTargetTech <em>Target Tech</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getProcType <em>Proc Type</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDpimComputationNode()
 * @model
 * @generated
 */
public interface DpimComputationNode extends DaComponent {
	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Throughput</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' attribute.
	 * @see #setThroughput(String)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDpimComputationNode_Throughput()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Frequency" ordered="false"
	 * @generated
	 */
	String getThroughput();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getThroughput <em>Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' attribute.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType
	 * @see #setType(ComputationType)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDpimComputationNode_Type()
	 * @model ordered="false"
	 * @generated
	 */
	ComputationType getType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType
	 * @see #getType()
	 * @generated
	 */
	void setType(ComputationType value);

	/**
	 * Returns the value of the '<em><b>Target Tech</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.TechType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Tech</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Tech</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.TechType
	 * @see #setTargetTech(TechType)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDpimComputationNode_TargetTech()
	 * @model ordered="false"
	 * @generated
	 */
	TechType getTargetTech();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getTargetTech <em>Target Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Tech</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.TechType
	 * @see #getTargetTech()
	 * @generated
	 */
	void setTargetTech(TechType value);

	/**
	 * Returns the value of the '<em><b>Proc Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proc Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proc Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType
	 * @see #setProcType(ProcessingType)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getDpimComputationNode_ProcType()
	 * @model ordered="false"
	 * @generated
	 */
	ProcessingType getProcType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getProcType <em>Proc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proc Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType
	 * @see #getProcType()
	 * @generated
	 */
	void setProcType(ProcessingType value);

} // DpimComputationNode
