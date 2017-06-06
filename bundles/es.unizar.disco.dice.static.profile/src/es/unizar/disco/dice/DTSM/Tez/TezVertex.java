/**
 */
package es.unizar.disco.dice.DTSM.Tez;

import es.unizar.disco.dice.DTSM.Core.CoreDAGNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getTaskInputSize <em>Task Input Size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getMinSrcFraction <em>Min Src Fraction</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getMaxScrFraction <em>Max Scr Fraction</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getVirtualCores <em>Virtual Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezVertex()
 * @model
 * @generated
 */
public interface TezVertex extends CoreDAGNode {
	/**
	 * Returns the value of the '<em><b>Task Input Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task Input Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task Input Size</em>' attribute.
	 * @see #setTaskInputSize(String)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezVertex_TaskInputSize()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getTaskInputSize();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getTaskInputSize <em>Task Input Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task Input Size</em>' attribute.
	 * @see #getTaskInputSize()
	 * @generated
	 */
	void setTaskInputSize(String value);

	/**
	 * Returns the value of the '<em><b>Min Src Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Src Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Src Fraction</em>' attribute.
	 * @see #setMinSrcFraction(String)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezVertex_MinSrcFraction()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" required="true" ordered="false"
	 * @generated
	 */
	String getMinSrcFraction();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getMinSrcFraction <em>Min Src Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Src Fraction</em>' attribute.
	 * @see #getMinSrcFraction()
	 * @generated
	 */
	void setMinSrcFraction(String value);

	/**
	 * Returns the value of the '<em><b>Max Scr Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Scr Fraction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Scr Fraction</em>' attribute.
	 * @see #setMaxScrFraction(String)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezVertex_MaxScrFraction()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Real" required="true" ordered="false"
	 * @generated
	 */
	String getMaxScrFraction();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getMaxScrFraction <em>Max Scr Fraction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Scr Fraction</em>' attribute.
	 * @see #getMaxScrFraction()
	 * @generated
	 */
	void setMaxScrFraction(String value);

	/**
	 * Returns the value of the '<em><b>Virtual Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Virtual Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Virtual Cores</em>' attribute.
	 * @see #setVirtualCores(String)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezVertex_VirtualCores()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getVirtualCores();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getVirtualCores <em>Virtual Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual Cores</em>' attribute.
	 * @see #getVirtualCores()
	 * @generated
	 */
	void setVirtualCores(String value);

	/**
	 * Returns the value of the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memory</em>' attribute.
	 * @see #setMemory(String)
	 * @see es.unizar.disco.dice.DTSM.Tez.TezPackage#getTezVertex_Memory()
	 * @model dataType="org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.NFP_Integer" required="true" ordered="false"
	 * @generated
	 */
	String getMemory();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getMemory <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memory</em>' attribute.
	 * @see #getMemory()
	 * @generated
	 */
	void setMemory(String value);

} // TezVertex
