/**
 */
package es.unizar.disco.dice.DTSM.Hadoop;

import es.unizar.disco.dice.Basic_Enumeration_Types.MapType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMap#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopMap()
 * @model
 * @generated
 */
public interface HadoopMap extends HadoopOperation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.MapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.MapType
	 * @see #setType(MapType)
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopMap_Type()
	 * @model ordered="false"
	 * @generated
	 */
	MapType getType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMap#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.MapType
	 * @see #getType()
	 * @generated
	 */
	void setType(MapType value);

} // HadoopMap
