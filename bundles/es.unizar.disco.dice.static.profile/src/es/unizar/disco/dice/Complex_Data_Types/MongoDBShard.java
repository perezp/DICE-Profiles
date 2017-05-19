/**
 */
package es.unizar.disco.dice.Complex_Data_Types;

import es.unizar.disco.dice.Basic_Enumeration_Types.VMSize;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mongo DB Shard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.MongoDBShard#getNInstances <em>NInstances</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.MongoDBShard#getHostSize <em>Host Size</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getMongoDBShard()
 * @model
 * @generated
 */
public interface MongoDBShard extends EObject {
	/**
	 * Returns the value of the '<em><b>NInstances</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>NInstances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NInstances</em>' attribute.
	 * @see #setNInstances(int)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getMongoDBShard_NInstances()
	 * @model default="1" dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getNInstances();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.MongoDBShard#getNInstances <em>NInstances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NInstances</em>' attribute.
	 * @see #getNInstances()
	 * @generated
	 */
	void setNInstances(int value);

	/**
	 * Returns the value of the '<em><b>Host Size</b></em>' attribute.
	 * The default value is <code>"Small"</code>.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.VMSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host Size</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.VMSize
	 * @see #setHostSize(VMSize)
	 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage#getMongoDBShard_HostSize()
	 * @model default="Small" ordered="false"
	 * @generated
	 */
	VMSize getHostSize();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.Complex_Data_Types.MongoDBShard#getHostSize <em>Host Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Size</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.VMSize
	 * @see #getHostSize()
	 * @generated
	 */
	void setHostSize(VMSize value);

} // MongoDBShard
