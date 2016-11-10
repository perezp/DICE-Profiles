/**
 */
package es.unizar.disco.dice.DTSM.Storm;

import es.unizar.disco.dice.DTSM.Core.CoreComputationNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormApplication#getHasMasterNode <em>Has Master Node</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormApplication#getHasSlaveNode <em>Has Slave Node</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Storm.StormApplication#getDependsOnZookeeper <em>Depends On Zookeeper</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormApplication()
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
	 * @see #setHasMasterNode(StormNimbus)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormApplication_HasMasterNode()
	 * @model ordered="false"
	 * @generated
	 */
	StormNimbus getHasMasterNode();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormApplication#getHasMasterNode <em>Has Master Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Master Node</em>' reference.
	 * @see #getHasMasterNode()
	 * @generated
	 */
	void setHasMasterNode(StormNimbus value);

	/**
	 * Returns the value of the '<em><b>Has Slave Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Slave Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Slave Node</em>' reference.
	 * @see #setHasSlaveNode(StormSupervisor)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormApplication_HasSlaveNode()
	 * @model ordered="false"
	 * @generated
	 */
	StormSupervisor getHasSlaveNode();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormApplication#getHasSlaveNode <em>Has Slave Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Slave Node</em>' reference.
	 * @see #getHasSlaveNode()
	 * @generated
	 */
	void setHasSlaveNode(StormSupervisor value);

	/**
	 * Returns the value of the '<em><b>Depends On Zookeeper</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Depends On Zookeeper</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depends On Zookeeper</em>' reference.
	 * @see #setDependsOnZookeeper(StormZookeeper)
	 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage#getStormApplication_DependsOnZookeeper()
	 * @model ordered="false"
	 * @generated
	 */
	StormZookeeper getDependsOnZookeeper();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DTSM.Storm.StormApplication#getDependsOnZookeeper <em>Depends On Zookeeper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depends On Zookeeper</em>' reference.
	 * @see #getDependsOnZookeeper()
	 * @generated
	 */
	void setDependsOnZookeeper(StormZookeeper value);

} // StormApplication
