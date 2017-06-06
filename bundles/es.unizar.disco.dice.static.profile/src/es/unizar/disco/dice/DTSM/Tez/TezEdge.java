/**
 */
package es.unizar.disco.dice.DTSM.Tez;

import es.unizar.disco.dice.Basic_Enumeration_Types.DataMovementType;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezEdge#getDataMovementType <em>Data Movement Type</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezEdge()
 * @model
 * @generated
 */
public interface TezEdge extends GaStep {
	/**
	 * Returns the value of the '<em><b>Data Movement Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.DataMovementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Movement Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Movement Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.DataMovementType
	 * @see #setDataMovementType(DataMovementType)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezEdge_DataMovementType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DataMovementType getDataMovementType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezEdge#getDataMovementType <em>Data Movement Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Movement Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.DataMovementType
	 * @see #getDataMovementType()
	 * @generated
	 */
	void setDataMovementType(DataMovementType value);

} // TezEdge
