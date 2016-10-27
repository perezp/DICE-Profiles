/**
 */
package es.unizar.disco.dice.DDSM.util;

import es.unizar.disco.dice.DDSM.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DDSM.DDSMPackage
 * @generated
 */
public class DDSMSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DDSMPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DDSMSwitch() {
		if (modelPackage == null) {
			modelPackage = DDSMPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DDSMPackage.DDSM_EXTERNAL_COMPONENT: {
				DdsmExternalComponent ddsmExternalComponent = (DdsmExternalComponent)theEObject;
				T result = caseDdsmExternalComponent(ddsmExternalComponent);
				if (result == null) result = caseDdsmComponent(ddsmExternalComponent);
				if (result == null) result = caseDdsmCloudElement(ddsmExternalComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_COMPONENT: {
				DdsmComponent ddsmComponent = (DdsmComponent)theEObject;
				T result = caseDdsmComponent(ddsmComponent);
				if (result == null) result = caseDdsmCloudElement(ddsmComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_CLOUD_ELEMENT: {
				DdsmCloudElement ddsmCloudElement = (DdsmCloudElement)theEObject;
				T result = caseDdsmCloudElement(ddsmCloudElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_RESOURCE: {
				DdsmResource ddsmResource = (DdsmResource)theEObject;
				T result = caseDdsmResource(ddsmResource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_PORT: {
				DdsmPort ddsmPort = (DdsmPort)theEObject;
				T result = caseDdsmPort(ddsmPort);
				if (result == null) result = caseDdsmCloudElement(ddsmPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_INTERNAL_COMPONENT: {
				DdsmInternalComponent ddsmInternalComponent = (DdsmInternalComponent)theEObject;
				T result = caseDdsmInternalComponent(ddsmInternalComponent);
				if (result == null) result = caseDdsmComponent(ddsmInternalComponent);
				if (result == null) result = caseDdsmCloudElement(ddsmInternalComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_CLUSTER: {
				DdsmCluster ddsmCluster = (DdsmCluster)theEObject;
				T result = caseDdsmCluster(ddsmCluster);
				if (result == null) result = caseDdsmExternalComponent(ddsmCluster);
				if (result == null) result = caseDdsmComponent(ddsmCluster);
				if (result == null) result = caseDdsmCloudElement(ddsmCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_VM: {
				DdsmVm ddsmVm = (DdsmVm)theEObject;
				T result = caseDdsmVm(ddsmVm);
				if (result == null) result = caseDdsmExternalComponent(ddsmVm);
				if (result == null) result = caseDdsmComponent(ddsmVm);
				if (result == null) result = caseDdsmCloudElement(ddsmVm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_YARN_RESOURCE_MANAGER: {
				DdsmYarnResourceManager ddsmYarnResourceManager = (DdsmYarnResourceManager)theEObject;
				T result = caseDdsmYarnResourceManager(ddsmYarnResourceManager);
				if (result == null) result = caseDdsmInternalComponent(ddsmYarnResourceManager);
				if (result == null) result = caseDdsmComponent(ddsmYarnResourceManager);
				if (result == null) result = caseDdsmCloudElement(ddsmYarnResourceManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_ZOOKEEPER_SERVER: {
				DdsmZookeeperServer ddsmZookeeperServer = (DdsmZookeeperServer)theEObject;
				T result = caseDdsmZookeeperServer(ddsmZookeeperServer);
				if (result == null) result = caseDdsmInternalComponent(ddsmZookeeperServer);
				if (result == null) result = caseDdsmComponent(ddsmZookeeperServer);
				if (result == null) result = caseDdsmCloudElement(ddsmZookeeperServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_KAFKA: {
				DdsmKafka ddsmKafka = (DdsmKafka)theEObject;
				T result = caseDdsmKafka(ddsmKafka);
				if (result == null) result = caseDdsmInternalComponent(ddsmKafka);
				if (result == null) result = caseDdsmComponent(ddsmKafka);
				if (result == null) result = caseDdsmCloudElement(ddsmKafka);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_NIMBUS: {
				DdsmNimbus ddsmNimbus = (DdsmNimbus)theEObject;
				T result = caseDdsmNimbus(ddsmNimbus);
				if (result == null) result = caseDdsmInternalComponent(ddsmNimbus);
				if (result == null) result = caseDdsmComponent(ddsmNimbus);
				if (result == null) result = caseDdsmCloudElement(ddsmNimbus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_JOB_SUBMISSION: {
				DdsmJobSubmission ddsmJobSubmission = (DdsmJobSubmission)theEObject;
				T result = caseDdsmJobSubmission(ddsmJobSubmission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_SUPERVISOR: {
				DdsmSupervisor ddsmSupervisor = (DdsmSupervisor)theEObject;
				T result = caseDdsmSupervisor(ddsmSupervisor);
				if (result == null) result = caseDdsmInternalComponent(ddsmSupervisor);
				if (result == null) result = caseDdsmComponent(ddsmSupervisor);
				if (result == null) result = caseDdsmCloudElement(ddsmSupervisor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_STORM_CLUSTER: {
				DdsmStormCluster ddsmStormCluster = (DdsmStormCluster)theEObject;
				T result = caseDdsmStormCluster(ddsmStormCluster);
				if (result == null) result = caseDdsmInternalComponent(ddsmStormCluster);
				if (result == null) result = caseDdsmComponent(ddsmStormCluster);
				if (result == null) result = caseDdsmCloudElement(ddsmStormCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_BIG_DATA_JOB: {
				DdsmBigDataJob ddsmBigDataJob = (DdsmBigDataJob)theEObject;
				T result = caseDdsmBigDataJob(ddsmBigDataJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DDSMPackage.DDSM_JOB_DEPLOYED_FROM: {
				DdsmJobDeployedFrom ddsmJobDeployedFrom = (DdsmJobDeployedFrom)theEObject;
				T result = caseDdsmJobDeployedFrom(ddsmJobDeployedFrom);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm External Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm External Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmExternalComponent(DdsmExternalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmComponent(DdsmComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Cloud Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Cloud Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmCloudElement(DdsmCloudElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmResource(DdsmResource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmPort(DdsmPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Internal Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Internal Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmInternalComponent(DdsmInternalComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmCluster(DdsmCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Vm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Vm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmVm(DdsmVm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Yarn Resource Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Yarn Resource Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmYarnResourceManager(DdsmYarnResourceManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Zookeeper Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Zookeeper Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmZookeeperServer(DdsmZookeeperServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Kafka</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Kafka</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmKafka(DdsmKafka object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Nimbus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Nimbus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmNimbus(DdsmNimbus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Job Submission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Job Submission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmJobSubmission(DdsmJobSubmission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Supervisor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Supervisor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmSupervisor(DdsmSupervisor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Storm Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Storm Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmStormCluster(DdsmStormCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Big Data Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Big Data Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmBigDataJob(DdsmBigDataJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ddsm Job Deployed From</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ddsm Job Deployed From</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdsmJobDeployedFrom(DdsmJobDeployedFrom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //DDSMSwitch
