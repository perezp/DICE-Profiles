/**
 */
package es.unizar.disco.dice.DDSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DDSM.DDSMPackage
 * @generated
 */
public interface DDSMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DDSMFactory eINSTANCE = es.unizar.disco.dice.DDSM.impl.DDSMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Ddsm External Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm External Component</em>'.
	 * @generated
	 */
	DdsmExternalComponent createDdsmExternalComponent();

	/**
	 * Returns a new object of class '<em>Ddsm Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Resource</em>'.
	 * @generated
	 */
	DdsmResource createDdsmResource();

	/**
	 * Returns a new object of class '<em>Ddsm Port</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Port</em>'.
	 * @generated
	 */
	DdsmPort createDdsmPort();

	/**
	 * Returns a new object of class '<em>Ddsm Internal Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Internal Component</em>'.
	 * @generated
	 */
	DdsmInternalComponent createDdsmInternalComponent();

	/**
	 * Returns a new object of class '<em>Ddsm Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Cluster</em>'.
	 * @generated
	 */
	DdsmCluster createDdsmCluster();

	/**
	 * Returns a new object of class '<em>Ddsm Vm</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Vm</em>'.
	 * @generated
	 */
	DdsmVm createDdsmVm();

	/**
	 * Returns a new object of class '<em>Ddsm Yarn Resource Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Yarn Resource Manager</em>'.
	 * @generated
	 */
	DdsmYarnResourceManager createDdsmYarnResourceManager();

	/**
	 * Returns a new object of class '<em>Ddsm Zookeeper Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Zookeeper Server</em>'.
	 * @generated
	 */
	DdsmZookeeperServer createDdsmZookeeperServer();

	/**
	 * Returns a new object of class '<em>Ddsm Kafka</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Kafka</em>'.
	 * @generated
	 */
	DdsmKafka createDdsmKafka();

	/**
	 * Returns a new object of class '<em>Ddsm Nimbus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Nimbus</em>'.
	 * @generated
	 */
	DdsmNimbus createDdsmNimbus();

	/**
	 * Returns a new object of class '<em>Ddsm Job Submission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Job Submission</em>'.
	 * @generated
	 */
	DdsmJobSubmission createDdsmJobSubmission();

	/**
	 * Returns a new object of class '<em>Ddsm Supervisor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Supervisor</em>'.
	 * @generated
	 */
	DdsmSupervisor createDdsmSupervisor();

	/**
	 * Returns a new object of class '<em>Ddsm Storm Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Storm Cluster</em>'.
	 * @generated
	 */
	DdsmStormCluster createDdsmStormCluster();

	/**
	 * Returns a new object of class '<em>Ddsm Big Data Job</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Big Data Job</em>'.
	 * @generated
	 */
	DdsmBigDataJob createDdsmBigDataJob();

	/**
	 * Returns a new object of class '<em>Ddsm Job Deployed From</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ddsm Job Deployed From</em>'.
	 * @generated
	 */
	DdsmJobDeployedFrom createDdsmJobDeployedFrom();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DDSMPackage getDDSMPackage();

} //DDSMFactory
