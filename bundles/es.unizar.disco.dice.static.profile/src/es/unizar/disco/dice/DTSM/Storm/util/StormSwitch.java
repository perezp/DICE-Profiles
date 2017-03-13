/**
 */
package es.unizar.disco.dice.DTSM.Storm.util;

import com.masdes.dam.Core.DaComponent;
import com.masdes.dam.Core.DaService;

import es.unizar.disco.dice.DPIM.DpimComputationNode;
import es.unizar.disco.dice.DPIM.DpimSourceNode;

import es.unizar.disco.dice.DTSM.Core.CoreComputationNode;
import es.unizar.disco.dice.DTSM.Core.CoreDAGNode;
import es.unizar.disco.dice.DTSM.Core.CoreDAGSourceNode;
import es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph;

import es.unizar.disco.dice.DTSM.Storm.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

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
 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage
 * @generated
 */
public class StormSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StormPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormSwitch() {
		if (modelPackage == null) {
			modelPackage = StormPackage.eINSTANCE;
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
			case StormPackage.STORM_BOLT: {
				StormBolt stormBolt = (StormBolt)theEObject;
				T result = caseStormBolt(stormBolt);
				if (result == null) result = caseCoreDAGNode(stormBolt);
				if (result == null) result = caseGaStep(stormBolt);
				if (result == null) result = caseDpimSourceNode(stormBolt);
				if (result == null) result = caseGaScenario(stormBolt);
				if (result == null) result = caseDpimComputationNode(stormBolt);
				if (result == null) result = caseResourceUsage(stormBolt);
				if (result == null) result = caseTimedProcessing(stormBolt);
				if (result == null) result = caseDaComponent(stormBolt);
				if (result == null) result = caseTimedElement(stormBolt);
				if (result == null) result = caseResource(stormBolt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StormPackage.STORM_SPOUT: {
				StormSpout stormSpout = (StormSpout)theEObject;
				T result = caseStormSpout(stormSpout);
				if (result == null) result = caseCoreDAGSourceNode(stormSpout);
				if (result == null) result = caseCoreDAGNode(stormSpout);
				if (result == null) result = caseGaStep(stormSpout);
				if (result == null) result = caseDpimSourceNode(stormSpout);
				if (result == null) result = caseGaScenario(stormSpout);
				if (result == null) result = caseDpimComputationNode(stormSpout);
				if (result == null) result = caseResourceUsage(stormSpout);
				if (result == null) result = caseTimedProcessing(stormSpout);
				if (result == null) result = caseDaComponent(stormSpout);
				if (result == null) result = caseTimedElement(stormSpout);
				if (result == null) result = caseResource(stormSpout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StormPackage.STORM_SCENARIO_TOPOLOGY: {
				StormScenarioTopology stormScenarioTopology = (StormScenarioTopology)theEObject;
				T result = caseStormScenarioTopology(stormScenarioTopology);
				if (result == null) result = caseCoreDirectAcyclicGraph(stormScenarioTopology);
				if (result == null) result = caseDaService(stormScenarioTopology);
				if (result == null) result = caseGaScenario(stormScenarioTopology);
				if (result == null) result = caseResourceUsage(stormScenarioTopology);
				if (result == null) result = caseTimedProcessing(stormScenarioTopology);
				if (result == null) result = caseTimedElement(stormScenarioTopology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StormPackage.STORM_APPLICATION: {
				StormApplication stormApplication = (StormApplication)theEObject;
				T result = caseStormApplication(stormApplication);
				if (result == null) result = caseCoreComputationNode(stormApplication);
				if (result == null) result = caseDpimComputationNode(stormApplication);
				if (result == null) result = caseDaComponent(stormApplication);
				if (result == null) result = caseResource(stormApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StormPackage.STORM_NIMBUS: {
				StormNimbus stormNimbus = (StormNimbus)theEObject;
				T result = caseStormNimbus(stormNimbus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StormPackage.STORM_SUPERVISOR: {
				StormSupervisor stormSupervisor = (StormSupervisor)theEObject;
				T result = caseStormSupervisor(stormSupervisor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StormPackage.STORM_ZOOKEEPER: {
				StormZookeeper stormZookeeper = (StormZookeeper)theEObject;
				T result = caseStormZookeeper(stormZookeeper);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StormPackage.STORM_STREAM_STEP: {
				StormStreamStep stormStreamStep = (StormStreamStep)theEObject;
				T result = caseStormStreamStep(stormStreamStep);
				if (result == null) result = caseGaStep(stormStreamStep);
				if (result == null) result = caseGaScenario(stormStreamStep);
				if (result == null) result = caseResourceUsage(stormStreamStep);
				if (result == null) result = caseTimedProcessing(stormStreamStep);
				if (result == null) result = caseTimedElement(stormStreamStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bolt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bolt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormBolt(StormBolt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormSpout(StormSpout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scenario Topology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scenario Topology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormScenarioTopology(StormScenarioTopology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormApplication(StormApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nimbus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nimbus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormNimbus(StormNimbus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supervisor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supervisor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormSupervisor(StormSupervisor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zookeeper</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zookeeper</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormZookeeper(StormZookeeper object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stream Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stream Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStormStreamStep(StormStreamStep object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Dpim Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dpim Source Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDpimSourceNode(DpimSourceNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAG Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAG Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreDAGNode(CoreDAGNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DAG Source Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DAG Source Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreDAGSourceNode(CoreDAGSourceNode object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Direct Acyclic Graph</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Direct Acyclic Graph</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoreDirectAcyclicGraph(CoreDirectAcyclicGraph object) {
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

} //StormSwitch
