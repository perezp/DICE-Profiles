/**
 */
package es.unizar.disco.dice.DTSM.Hadoop.util;

import com.masdes.dam.Core.DaComponent;
import com.masdes.dam.Core.DaService;

import es.unizar.disco.dice.DPIM.DpimComputationNode;

import es.unizar.disco.dice.DTSM.Core.CoreComputationNode;

import es.unizar.disco.dice.DTSM.Hadoop.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedElement;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedProcessing;

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
 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage
 * @generated
 */
public class HadoopSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HadoopPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopSwitch() {
		if (modelPackage == null) {
			modelPackage = HadoopPackage.eINSTANCE;
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
			case HadoopPackage.HADOOP_MAP_REDUCE_JOB: {
				HadoopMapReduceJob hadoopMapReduceJob = (HadoopMapReduceJob)theEObject;
				T result = caseHadoopMapReduceJob(hadoopMapReduceJob);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopPackage.HADOOP_MAP_REDUCE_PHASE: {
				HadoopMapReducePhase hadoopMapReducePhase = (HadoopMapReducePhase)theEObject;
				T result = caseHadoopMapReducePhase(hadoopMapReducePhase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopPackage.HADOOP_MAP: {
				HadoopMap hadoopMap = (HadoopMap)theEObject;
				T result = caseHadoopMap(hadoopMap);
				if (result == null) result = caseHadoopOperation(hadoopMap);
				if (result == null) result = caseGaStep(hadoopMap);
				if (result == null) result = caseGaScenario(hadoopMap);
				if (result == null) result = caseResourceUsage(hadoopMap);
				if (result == null) result = caseTimedProcessing(hadoopMap);
				if (result == null) result = caseTimedElement(hadoopMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopPackage.HADOOP_OPERATION: {
				HadoopOperation hadoopOperation = (HadoopOperation)theEObject;
				T result = caseHadoopOperation(hadoopOperation);
				if (result == null) result = caseGaStep(hadoopOperation);
				if (result == null) result = caseGaScenario(hadoopOperation);
				if (result == null) result = caseResourceUsage(hadoopOperation);
				if (result == null) result = caseTimedProcessing(hadoopOperation);
				if (result == null) result = caseTimedElement(hadoopOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopPackage.HADOOP_REDUCE: {
				HadoopReduce hadoopReduce = (HadoopReduce)theEObject;
				T result = caseHadoopReduce(hadoopReduce);
				if (result == null) result = caseHadoopOperation(hadoopReduce);
				if (result == null) result = caseGaStep(hadoopReduce);
				if (result == null) result = caseGaScenario(hadoopReduce);
				if (result == null) result = caseResourceUsage(hadoopReduce);
				if (result == null) result = caseTimedProcessing(hadoopReduce);
				if (result == null) result = caseTimedElement(hadoopReduce);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopPackage.HADOOP_SCENARIO: {
				HadoopScenario hadoopScenario = (HadoopScenario)theEObject;
				T result = caseHadoopScenario(hadoopScenario);
				if (result == null) result = caseDaService(hadoopScenario);
				if (result == null) result = caseGaScenario(hadoopScenario);
				if (result == null) result = caseResourceUsage(hadoopScenario);
				if (result == null) result = caseTimedProcessing(hadoopScenario);
				if (result == null) result = caseTimedElement(hadoopScenario);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopPackage.HADOOP_WORKLOAD_EVENT: {
				HadoopWorkloadEvent hadoopWorkloadEvent = (HadoopWorkloadEvent)theEObject;
				T result = caseHadoopWorkloadEvent(hadoopWorkloadEvent);
				if (result == null) result = caseGaWorkloadEvent(hadoopWorkloadEvent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HadoopPackage.HADOOP_COMPUTATION_NODE: {
				HadoopComputationNode hadoopComputationNode = (HadoopComputationNode)theEObject;
				T result = caseHadoopComputationNode(hadoopComputationNode);
				if (result == null) result = caseCoreComputationNode(hadoopComputationNode);
				if (result == null) result = caseDpimComputationNode(hadoopComputationNode);
				if (result == null) result = caseDaComponent(hadoopComputationNode);
				if (result == null) result = caseResource(hadoopComputationNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Reduce Job</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Reduce Job</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopMapReduceJob(HadoopMapReduceJob object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Reduce Phase</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Reduce Phase</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopMapReducePhase(HadoopMapReducePhase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopMap(HadoopMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopOperation(HadoopOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reduce</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reduce</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopReduce(HadoopReduce object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopScenario(HadoopScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workload Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopWorkloadEvent(HadoopWorkloadEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHadoopComputationNode(HadoopComputationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Usage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceUsage(ResourceUsage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedElement(TimedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timed Processing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timed Processing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimedProcessing(TimedProcessing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ga Scenario</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ga Scenario</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGaScenario(GaScenario object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ga Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ga Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGaStep(GaStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaService(DaService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ga Workload Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ga Workload Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGaWorkloadEvent(GaWorkloadEvent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Da Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Da Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaComponent(DaComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dpim Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dpim Computation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDpimComputationNode(DpimComputationNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computation Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computation Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreComputationNode(CoreComputationNode object) {
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

} //HadoopSwitch
