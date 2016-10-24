/**
 */
package es.unizar.disco.dice.dtsm.Core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Storage Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreStorageNode#getDatabase <em>Database</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreStorageNode#getUser <em>User</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.CoreStorageNode#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreStorageNode()
 * @model abstract="true"
 * @generated
 */
public interface CoreStorageNode extends CoreDataSource {
	/**
	 * Returns the value of the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database</em>' attribute.
	 * @see #setDatabase(String)
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreStorageNode_Database()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDatabase();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Core.CoreStorageNode#getDatabase <em>Database</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Database</em>' attribute.
	 * @see #getDatabase()
	 * @generated
	 */
	void setDatabase(String value);

	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreStorageNode_User()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Core.CoreStorageNode#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see es.unizar.disco.dice.dtsm.Core.CorePackage#getCoreStorageNode_Password()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Core.CoreStorageNode#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

} // CoreStorageNode
