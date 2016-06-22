/**
 */
package es.unizar.disco.dice.dtsm.Storm;

import es.unizar.disco.dice.dtsm.Core.CoreDAGSourceNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormSpout#getAvgEmitRate <em>Avg Emit Rate</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormSpout()
 * @model
 * @generated
 */
public interface StormSpout extends CoreDAGSourceNode {
	/**
	 * Returns the value of the '<em><b>Avg Emit Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Avg Emit Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avg Emit Rate</em>' attribute.
	 * @see #setAvgEmitRate(String)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormSpout_AvgEmitRate()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getAvgEmitRate();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormSpout#getAvgEmitRate <em>Avg Emit Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Avg Emit Rate</em>' attribute.
	 * @see #getAvgEmitRate()
	 * @generated
	 */
	void setAvgEmitRate(String value);

} // StormSpout
