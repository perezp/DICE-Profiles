/**
 */
package es.unizar.disco.dice.DPIM;

import es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.StorageResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storagate Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DPIM.StoragateNode#getRespondsTo <em>Responds To</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DPIM.StoragateNode#getCrudRate <em>Crud Rate</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getStoragateNode()
 * @model
 * @generated
 */
public interface StoragateNode extends ComputationNode, StorageResource {
	/**
	 * Returns the value of the '<em><b>Responds To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responds To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responds To</em>' containment reference.
	 * @see #setRespondsTo(DiceDataSpecification)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getStoragateNode_RespondsTo()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	DiceDataSpecification getRespondsTo();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.StoragateNode#getRespondsTo <em>Responds To</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Responds To</em>' containment reference.
	 * @see #getRespondsTo()
	 * @generated
	 */
	void setRespondsTo(DiceDataSpecification value);

	/**
	 * Returns the value of the '<em><b>Crud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Crud Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Crud Rate</em>' attribute.
	 * @see #setCrudRate(String)
	 * @see es.unizar.disco.dice.DPIM.DPIMPackage#getStoragateNode_CrudRate()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Frequency" ordered="false"
	 * @generated
	 */
	String getCrudRate();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DPIM.StoragateNode#getCrudRate <em>Crud Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Crud Rate</em>' attribute.
	 * @see #getCrudRate()
	 * @generated
	 */
	void setCrudRate(String value);

} // StoragateNode
