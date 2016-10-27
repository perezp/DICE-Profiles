/**
 */
package es.unizar.disco.dice.DDSM.util;

import es.unizar.disco.dice.DDSM.*;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DDSM.DDSMPackage
 * @generated
 */
public class DDSMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final DDSMValidator INSTANCE = new DDSMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "es.unizar.disco.dice.DDSM";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Yarn Type Master Node' of 'Ddsm Yarn Resource Manager'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DDSM_YARN_RESOURCE_MANAGER__YARN_TYPE_MASTER_NODE = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Zookeeper Server Type Peef Node' of 'Ddsm Zookeeper Server'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DDSM_ZOOKEEPER_SERVER__ZOOKEEPER_SERVER_TYPE_PEEF_NODE = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Nimbus Type Master Node' of 'Ddsm Nimbus'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DDSM_NIMBUS__NIMBUS_TYPE_MASTER_NODE = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Supervisor Type Slave Node' of 'Ddsm Supervisor'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DDSM_SUPERVISOR__SUPERVISOR_TYPE_SLAVE_NODE = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Storm Cluster Type Master Slave Platform' of 'Ddsm Storm Cluster'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int DDSM_STORM_CLUSTER__STORM_CLUSTER_TYPE_MASTER_SLAVE_PLATFORM = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 5;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return DDSMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT:
				return validateDdsmExternalComponent((DdsmExternalComponent)value, diagnostics, context);
			case DDSMPackage.DDSM_COMPONENT:
				return validateDdsmComponent((DdsmComponent)value, diagnostics, context);
			case DDSMPackage.DDSM_CLOUD_ELEMENT:
				return validateDdsmCloudElement((DdsmCloudElement)value, diagnostics, context);
			case DDSMPackage.DDSM_RESOURCE:
				return validateDdsmResource((DdsmResource)value, diagnostics, context);
			case DDSMPackage.DDSM_PORT:
				return validateDdsmPort((DdsmPort)value, diagnostics, context);
			case DDSMPackage.DDSM_INTERNAL_COMPONENT:
				return validateDdsmInternalComponent((DdsmInternalComponent)value, diagnostics, context);
			case DDSMPackage.DDSM_CLUSTER:
				return validateDdsmCluster((DdsmCluster)value, diagnostics, context);
			case DDSMPackage.DDSM_VM:
				return validateDdsmVm((DdsmVm)value, diagnostics, context);
			case DDSMPackage.DDSM_YARN_RESOURCE_MANAGER:
				return validateDdsmYarnResourceManager((DdsmYarnResourceManager)value, diagnostics, context);
			case DDSMPackage.DDSM_ZOOKEEPER_SERVER:
				return validateDdsmZookeeperServer((DdsmZookeeperServer)value, diagnostics, context);
			case DDSMPackage.DDSM_KAFKA:
				return validateDdsmKafka((DdsmKafka)value, diagnostics, context);
			case DDSMPackage.DDSM_NIMBUS:
				return validateDdsmNimbus((DdsmNimbus)value, diagnostics, context);
			case DDSMPackage.DDSM_JOB_SUBMISSION:
				return validateDdsmJobSubmission((DdsmJobSubmission)value, diagnostics, context);
			case DDSMPackage.DDSM_SUPERVISOR:
				return validateDdsmSupervisor((DdsmSupervisor)value, diagnostics, context);
			case DDSMPackage.DDSM_STORM_CLUSTER:
				return validateDdsmStormCluster((DdsmStormCluster)value, diagnostics, context);
			case DDSMPackage.DDSM_BIG_DATA_JOB:
				return validateDdsmBigDataJob((DdsmBigDataJob)value, diagnostics, context);
			case DDSMPackage.DDSM_JOB_DEPLOYED_FROM:
				return validateDdsmJobDeployedFrom((DdsmJobDeployedFrom)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmExternalComponent(DdsmExternalComponent ddsmExternalComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmExternalComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmComponent(DdsmComponent ddsmComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmCloudElement(DdsmCloudElement ddsmCloudElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmCloudElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmResource(DdsmResource ddsmResource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmResource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmPort(DdsmPort ddsmPort, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmPort, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmInternalComponent(DdsmInternalComponent ddsmInternalComponent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmInternalComponent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmCluster(DdsmCluster ddsmCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmCluster, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmVm(DdsmVm ddsmVm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmVm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmYarnResourceManager(DdsmYarnResourceManager ddsmYarnResourceManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ddsmYarnResourceManager, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ddsmYarnResourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ddsmYarnResourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ddsmYarnResourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ddsmYarnResourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ddsmYarnResourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ddsmYarnResourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ddsmYarnResourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ddsmYarnResourceManager, diagnostics, context);
		if (result || diagnostics != null) result &= validateDdsmYarnResourceManager_YarnTypeMasterNode(ddsmYarnResourceManager, diagnostics, context);
		return result;
	}

	/**
	 * Validates the YarnTypeMasterNode constraint of '<em>Ddsm Yarn Resource Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmYarnResourceManager_YarnTypeMasterNode(DdsmYarnResourceManager ddsmYarnResourceManager, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ddsmYarnResourceManager.YarnTypeMasterNode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmZookeeperServer(DdsmZookeeperServer ddsmZookeeperServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ddsmZookeeperServer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ddsmZookeeperServer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ddsmZookeeperServer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ddsmZookeeperServer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ddsmZookeeperServer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ddsmZookeeperServer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ddsmZookeeperServer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ddsmZookeeperServer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ddsmZookeeperServer, diagnostics, context);
		if (result || diagnostics != null) result &= validateDdsmZookeeperServer_ZookeeperServerTypePeefNode(ddsmZookeeperServer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ZookeeperServerTypePeefNode constraint of '<em>Ddsm Zookeeper Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmZookeeperServer_ZookeeperServerTypePeefNode(DdsmZookeeperServer ddsmZookeeperServer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ddsmZookeeperServer.ZookeeperServerTypePeefNode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmKafka(DdsmKafka ddsmKafka, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmKafka, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmNimbus(DdsmNimbus ddsmNimbus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ddsmNimbus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ddsmNimbus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ddsmNimbus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ddsmNimbus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ddsmNimbus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ddsmNimbus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ddsmNimbus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ddsmNimbus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ddsmNimbus, diagnostics, context);
		if (result || diagnostics != null) result &= validateDdsmNimbus_NimbusTypeMasterNode(ddsmNimbus, diagnostics, context);
		return result;
	}

	/**
	 * Validates the NimbusTypeMasterNode constraint of '<em>Ddsm Nimbus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmNimbus_NimbusTypeMasterNode(DdsmNimbus ddsmNimbus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ddsmNimbus.NimbusTypeMasterNode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmJobSubmission(DdsmJobSubmission ddsmJobSubmission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmJobSubmission, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmSupervisor(DdsmSupervisor ddsmSupervisor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ddsmSupervisor, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ddsmSupervisor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ddsmSupervisor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ddsmSupervisor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ddsmSupervisor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ddsmSupervisor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ddsmSupervisor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ddsmSupervisor, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ddsmSupervisor, diagnostics, context);
		if (result || diagnostics != null) result &= validateDdsmSupervisor_SupervisorTypeSlaveNode(ddsmSupervisor, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SupervisorTypeSlaveNode constraint of '<em>Ddsm Supervisor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmSupervisor_SupervisorTypeSlaveNode(DdsmSupervisor ddsmSupervisor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ddsmSupervisor.SupervisorTypeSlaveNode(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmStormCluster(DdsmStormCluster ddsmStormCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ddsmStormCluster, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ddsmStormCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ddsmStormCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ddsmStormCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ddsmStormCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ddsmStormCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ddsmStormCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ddsmStormCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ddsmStormCluster, diagnostics, context);
		if (result || diagnostics != null) result &= validateDdsmStormCluster_StormClusterTypeMasterSlavePlatform(ddsmStormCluster, diagnostics, context);
		return result;
	}

	/**
	 * Validates the StormClusterTypeMasterSlavePlatform constraint of '<em>Ddsm Storm Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmStormCluster_StormClusterTypeMasterSlavePlatform(DdsmStormCluster ddsmStormCluster, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ddsmStormCluster.StormClusterTypeMasterSlavePlatform(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmBigDataJob(DdsmBigDataJob ddsmBigDataJob, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmBigDataJob, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdsmJobDeployedFrom(DdsmJobDeployedFrom ddsmJobDeployedFrom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddsmJobDeployedFrom, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //DDSMValidator
