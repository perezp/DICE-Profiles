/**
 */
package es.unizar.disco.dice.DTSM.Hadoop;

import es.unizar.disco.dice.Basic_Enumeration_Types.ReduceType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reduce</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopReduce#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopReduce()
 * @model
 * @generated
 */
public interface HadoopReduce extends HadoopOperation {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.ReduceType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ReduceType
	 * @see #setType(ReduceType)
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage#getHadoopReduce_Type()
	 * @model ordered="false"
	 * @generated
	 */
	ReduceType getType();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopReduce#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ReduceType
	 * @see #getType()
	 * @generated
	 */
	void setType(ReduceType value);

} // HadoopReduce
