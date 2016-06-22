/**
 */
package es.unizar.disco.dice.dtsm.Storm;

import es.unizar.disco.dice.dtsm.Core.CoreDAGNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bolt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormBolt#getD <em>D</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormBolt#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormBolt#getSigma <em>Sigma</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormBolt#getMinRebootTime <em>Min Reboot Time</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormBolt#getMaxRebootTime <em>Max Reboot Time</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormBolt()
 * @model
 * @generated
 */
public interface StormBolt extends CoreDAGNode {
	/**
	 * Returns the value of the '<em><b>D</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>D</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>D</em>' attribute.
	 * @see #setD(String)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormBolt_D()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getD();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormBolt#getD <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>D</em>' attribute.
	 * @see #getD()
	 * @generated
	 */
	void setD(String value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(String)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormBolt_Alpha()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getAlpha();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormBolt#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(String value);

	/**
	 * Returns the value of the '<em><b>Sigma</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sigma</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sigma</em>' attribute.
	 * @see #setSigma(String)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormBolt_Sigma()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getSigma();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormBolt#getSigma <em>Sigma</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sigma</em>' attribute.
	 * @see #getSigma()
	 * @generated
	 */
	void setSigma(String value);

	/**
	 * Returns the value of the '<em><b>Min Reboot Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Reboot Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Reboot Time</em>' attribute.
	 * @see #setMinRebootTime(String)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormBolt_MinRebootTime()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getMinRebootTime();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormBolt#getMinRebootTime <em>Min Reboot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Reboot Time</em>' attribute.
	 * @see #getMinRebootTime()
	 * @generated
	 */
	void setMinRebootTime(String value);

	/**
	 * Returns the value of the '<em><b>Max Reboot Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Reboot Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Reboot Time</em>' attribute.
	 * @see #setMaxRebootTime(String)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormBolt_MaxRebootTime()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" ordered="false"
	 * @generated
	 */
	String getMaxRebootTime();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormBolt#getMaxRebootTime <em>Max Reboot Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Reboot Time</em>' attribute.
	 * @see #getMaxRebootTime()
	 * @generated
	 */
	void setMaxRebootTime(String value);

} // StormBolt
