/**
 */
package es.unizar.disco.dice.DDSM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Zookeeper Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * self.componentType=DDSMcomponentType::PeerNode
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getTickTime <em>Tick Time</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getSyncLimit <em>Sync Limit</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getInitLimit <em>Init Limit</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmZookeeperServer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='ZookeeperServerTypePeefNode'"
 * @generated
 */
public interface DdsmZookeeperServer extends DdsmInternalComponent {
	/**
	 * Returns the value of the '<em><b>Tick Time</b></em>' attribute.
	 * The default value is <code>"1500"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tick Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tick Time</em>' attribute.
	 * @see #setTickTime(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmZookeeperServer_TickTime()
	 * @model default="1500" required="true" ordered="false"
	 * @generated
	 */
	int getTickTime();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getTickTime <em>Tick Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tick Time</em>' attribute.
	 * @see #getTickTime()
	 * @generated
	 */
	void setTickTime(int value);

	/**
	 * Returns the value of the '<em><b>Sync Limit</b></em>' attribute.
	 * The default value is <code>"10"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Limit</em>' attribute.
	 * @see #setSyncLimit(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmZookeeperServer_SyncLimit()
	 * @model default="10" required="true" ordered="false"
	 * @generated
	 */
	int getSyncLimit();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getSyncLimit <em>Sync Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Limit</em>' attribute.
	 * @see #getSyncLimit()
	 * @generated
	 */
	void setSyncLimit(int value);

	/**
	 * Returns the value of the '<em><b>Init Limit</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Init Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Init Limit</em>' attribute.
	 * @see #setInitLimit(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmZookeeperServer_InitLimit()
	 * @model default="5" required="true" ordered="false"
	 * @generated
	 */
	int getInitLimit();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmZookeeperServer#getInitLimit <em>Init Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Init Limit</em>' attribute.
	 * @see #getInitLimit()
	 * @generated
	 */
	void setInitLimit(int value);

} // DdsmZookeeperServer
