/**
 */
package es.unizar.disco.dice.dtsm.Storm;

import es.unizar.disco.dice.dtsm.Core.CoreComputationNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormApplication#getHasMasterNode <em>Has Master Node</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormApplication#getHasSlaveNode <em>Has Slave Node</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Storm.StormApplication#getDependsOnZookeeper <em>Depends On Zookeeper</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormApplication()
 * @model
 * @generated
 */
public interface StormApplication extends CoreComputationNode {
	/**
	 * Returns the value of the '<em><b>Has Master Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Master Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Master Node</em>' reference.
	 * @see #setHasMasterNode(Nimbus)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormApplication_HasMasterNode()
	 * @model ordered="false"
	 * @generated
	 */
	Nimbus getHasMasterNode();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormApplication#getHasMasterNode <em>Has Master Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Master Node</em>' reference.
	 * @see #getHasMasterNode()
	 * @generated
	 */
	void setHasMasterNode(Nimbus value);

	/**
	 * Returns the value of the '<em><b>Has Slave Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Slave Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Slave Node</em>' reference.
	 * @see #setHasSlaveNode(Supervisor)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormApplication_HasSlaveNode()
	 * @model ordered="false"
	 * @generated
	 */
	Supervisor getHasSlaveNode();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormApplication#getHasSlaveNode <em>Has Slave Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Slave Node</em>' reference.
	 * @see #getHasSlaveNode()
	 * @generated
	 */
	void setHasSlaveNode(Supervisor value);

	/**
	 * Returns the value of the '<em><b>Depends On Zookeeper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On Zookeeper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On Zookeeper</em>' reference.
	 * @see #setDependsOnZookeeper(Zookeeper)
	 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage#getStormApplication_DependsOnZookeeper()
	 * @model ordered="false"
	 * @generated
	 */
	Zookeeper getDependsOnZookeeper();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.dtsm.Storm.StormApplication#getDependsOnZookeeper <em>Depends On Zookeeper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On Zookeeper</em>' reference.
	 * @see #getDependsOnZookeeper()
	 * @generated
	 */
	void setDependsOnZookeeper(Zookeeper value);

} // StormApplication
