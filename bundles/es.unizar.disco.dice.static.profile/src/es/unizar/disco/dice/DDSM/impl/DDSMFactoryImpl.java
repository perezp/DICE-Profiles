/**
 */
package es.unizar.disco.dice.DDSM.impl;

import es.unizar.disco.dice.DDSM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DDSMFactoryImpl extends EFactoryImpl implements DDSMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DDSMFactory init() {
		try {
			DDSMFactory theDDSMFactory = (DDSMFactory)EPackage.Registry.INSTANCE.getEFactory(DDSMPackage.eNS_URI);
			if (theDDSMFactory != null) {
				return theDDSMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DDSMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT: return createDdsmExternalComponent();
			case DDSMPackage.DDSM_RESOURCE: return createDdsmResource();
			case DDSMPackage.DDSM_PORT: return createDdsmPort();
			case DDSMPackage.DDSM_INTERNAL_COMPONENT: return createDdsmInternalComponent();
			case DDSMPackage.DDSM_CLUSTER: return createDdsmCluster();
			case DDSMPackage.DDSM_VM: return createDdsmVm();
			case DDSMPackage.DDSM_YARN_RESOURCE_MANAGER: return createDdsmYarnResourceManager();
			case DDSMPackage.DDSM_ZOOKEEPER_SERVER: return createDdsmZookeeperServer();
			case DDSMPackage.DDSM_KAFKA: return createDdsmKafka();
			case DDSMPackage.DDSM_NIMBUS: return createDdsmNimbus();
			case DDSMPackage.DDSM_JOB_SUBMISSION: return createDdsmJobSubmission();
			case DDSMPackage.DDSM_SUPERVISOR: return createDdsmSupervisor();
			case DDSMPackage.DDSM_STORM_CLUSTER: return createDdsmStormCluster();
			case DDSMPackage.DDSM_BIG_DATA_JOB: return createDdsmBigDataJob();
			case DDSMPackage.DDSM_JOB_DEPLOYED_FROM: return createDdsmJobDeployedFrom();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmExternalComponent createDdsmExternalComponent() {
		DdsmExternalComponentImpl ddsmExternalComponent = new DdsmExternalComponentImpl();
		return ddsmExternalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmResource createDdsmResource() {
		DdsmResourceImpl ddsmResource = new DdsmResourceImpl();
		return ddsmResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmPort createDdsmPort() {
		DdsmPortImpl ddsmPort = new DdsmPortImpl();
		return ddsmPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmInternalComponent createDdsmInternalComponent() {
		DdsmInternalComponentImpl ddsmInternalComponent = new DdsmInternalComponentImpl();
		return ddsmInternalComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmCluster createDdsmCluster() {
		DdsmClusterImpl ddsmCluster = new DdsmClusterImpl();
		return ddsmCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmVm createDdsmVm() {
		DdsmVmImpl ddsmVm = new DdsmVmImpl();
		return ddsmVm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmYarnResourceManager createDdsmYarnResourceManager() {
		DdsmYarnResourceManagerImpl ddsmYarnResourceManager = new DdsmYarnResourceManagerImpl();
		return ddsmYarnResourceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmZookeeperServer createDdsmZookeeperServer() {
		DdsmZookeeperServerImpl ddsmZookeeperServer = new DdsmZookeeperServerImpl();
		return ddsmZookeeperServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmKafka createDdsmKafka() {
		DdsmKafkaImpl ddsmKafka = new DdsmKafkaImpl();
		return ddsmKafka;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmNimbus createDdsmNimbus() {
		DdsmNimbusImpl ddsmNimbus = new DdsmNimbusImpl();
		return ddsmNimbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmJobSubmission createDdsmJobSubmission() {
		DdsmJobSubmissionImpl ddsmJobSubmission = new DdsmJobSubmissionImpl();
		return ddsmJobSubmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmSupervisor createDdsmSupervisor() {
		DdsmSupervisorImpl ddsmSupervisor = new DdsmSupervisorImpl();
		return ddsmSupervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmStormCluster createDdsmStormCluster() {
		DdsmStormClusterImpl ddsmStormCluster = new DdsmStormClusterImpl();
		return ddsmStormCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmBigDataJob createDdsmBigDataJob() {
		DdsmBigDataJobImpl ddsmBigDataJob = new DdsmBigDataJobImpl();
		return ddsmBigDataJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdsmJobDeployedFrom createDdsmJobDeployedFrom() {
		DdsmJobDeployedFromImpl ddsmJobDeployedFrom = new DdsmJobDeployedFromImpl();
		return ddsmJobDeployedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMPackage getDDSMPackage() {
		return (DDSMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DDSMPackage getPackage() {
		return DDSMPackage.eINSTANCE;
	}

} //DDSMFactoryImpl
