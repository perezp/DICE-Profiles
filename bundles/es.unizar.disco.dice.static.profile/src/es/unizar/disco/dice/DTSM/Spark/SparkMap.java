/**
 */
package es.unizar.disco.dice.DTSM.Spark;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.SparkMap#getMapType <em>Map Type</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkMap()
 * @model
 * @generated
 */
public interface SparkMap extends SparkOperation {
	/**
	 * Returns the value of the '<em><b>Map Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.SparkMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SparkMap
	 * @see #setMapType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkMap)
	 * @see es.unizar.disco.dice.DTSM.Spark.SparkPackage#getSparkMap_MapType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	es.unizar.disco.dice.Basic_Enumeration_Types.SparkMap getMapType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Spark.SparkMap#getMapType <em>Map Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SparkMap
	 * @see #getMapType()
	 * @generated
	 */
	void setMapType(es.unizar.disco.dice.Basic_Enumeration_Types.SparkMap value);

} // SparkMap
