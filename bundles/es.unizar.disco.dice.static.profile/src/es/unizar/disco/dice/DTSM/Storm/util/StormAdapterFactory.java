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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedElement;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedProcessing;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DTSM.Storm.StormPackage
 * @generated
 */
public class StormAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StormPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StormPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StormSwitch<Adapter> modelSwitch =
		new StormSwitch<Adapter>() {
			@Override
			public Adapter caseStormBolt(StormBolt object) {
				return createStormBoltAdapter();
			}
			@Override
			public Adapter caseStormSpout(StormSpout object) {
				return createStormSpoutAdapter();
			}
			@Override
			public Adapter caseStormScenarioTopology(StormScenarioTopology object) {
				return createStormScenarioTopologyAdapter();
			}
			@Override
			public Adapter caseStormApplication(StormApplication object) {
				return createStormApplicationAdapter();
			}
			@Override
			public Adapter caseStormNimbus(StormNimbus object) {
				return createStormNimbusAdapter();
			}
			@Override
			public Adapter caseStormSupervisor(StormSupervisor object) {
				return createStormSupervisorAdapter();
			}
			@Override
			public Adapter caseStormZookeeper(StormZookeeper object) {
				return createStormZookeeperAdapter();
			}
			@Override
			public Adapter caseStormStreamStep(StormStreamStep object) {
				return createStormStreamStepAdapter();
			}
			@Override
			public Adapter caseResourceUsage(ResourceUsage object) {
				return createResourceUsageAdapter();
			}
			@Override
			public Adapter caseTimedElement(TimedElement object) {
				return createTimedElementAdapter();
			}
			@Override
			public Adapter caseTimedProcessing(TimedProcessing object) {
				return createTimedProcessingAdapter();
			}
			@Override
			public Adapter caseGaScenario(GaScenario object) {
				return createGaScenarioAdapter();
			}
			@Override
			public Adapter caseGaStep(GaStep object) {
				return createGaStepAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseDaComponent(DaComponent object) {
				return createDaComponentAdapter();
			}
			@Override
			public Adapter caseDpimComputationNode(DpimComputationNode object) {
				return createDpimComputationNodeAdapter();
			}
			@Override
			public Adapter caseDpimSourceNode(DpimSourceNode object) {
				return createDpimSourceNodeAdapter();
			}
			@Override
			public Adapter caseCoreDAGNode(CoreDAGNode object) {
				return createCoreDAGNodeAdapter();
			}
			@Override
			public Adapter caseCoreDAGSourceNode(CoreDAGSourceNode object) {
				return createCoreDAGSourceNodeAdapter();
			}
			@Override
			public Adapter caseDaService(DaService object) {
				return createDaServiceAdapter();
			}
			@Override
			public Adapter caseCoreDirectAcyclicGraph(CoreDirectAcyclicGraph object) {
				return createCoreDirectAcyclicGraphAdapter();
			}
			@Override
			public Adapter caseCoreComputationNode(CoreComputationNode object) {
				return createCoreComputationNodeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Storm.StormBolt <em>Bolt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormBolt
	 * @generated
	 */
	public Adapter createStormBoltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Storm.StormSpout <em>Spout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSpout
	 * @generated
	 */
	public Adapter createStormSpoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology <em>Scenario Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormScenarioTopology
	 * @generated
	 */
	public Adapter createStormScenarioTopologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Storm.StormApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormApplication
	 * @generated
	 */
	public Adapter createStormApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Storm.StormNimbus <em>Nimbus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormNimbus
	 * @generated
	 */
	public Adapter createStormNimbusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Storm.StormSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormSupervisor
	 * @generated
	 */
	public Adapter createStormSupervisorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Storm.StormZookeeper <em>Zookeeper</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormZookeeper
	 * @generated
	 */
	public Adapter createStormZookeeperAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Storm.StormStreamStep <em>Stream Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Storm.StormStreamStep
	 * @generated
	 */
	public Adapter createStormStreamStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage <em>Resource Usage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage
	 * @generated
	 */
	public Adapter createResourceUsageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedElement <em>Timed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedElement
	 * @generated
	 */
	public Adapter createTimedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedProcessing <em>Timed Processing</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedProcessing
	 * @generated
	 */
	public Adapter createTimedProcessingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario <em>Ga Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario
	 * @generated
	 */
	public Adapter createGaScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep <em>Ga Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep
	 * @generated
	 */
	public Adapter createGaStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaComponent <em>Da Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaComponent
	 * @generated
	 */
	public Adapter createDaComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DPIM.DpimComputationNode <em>Dpim Computation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DPIM.DpimComputationNode
	 * @generated
	 */
	public Adapter createDpimComputationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DPIM.DpimSourceNode <em>Dpim Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DPIM.DpimSourceNode
	 * @generated
	 */
	public Adapter createDpimSourceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Core.CoreDAGNode <em>DAG Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDAGNode
	 * @generated
	 */
	public Adapter createCoreDAGNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Core.CoreDAGSourceNode <em>DAG Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDAGSourceNode
	 * @generated
	 */
	public Adapter createCoreDAGSourceNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaService <em>Da Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaService
	 * @generated
	 */
	public Adapter createDaServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph <em>Direct Acyclic Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph
	 * @generated
	 */
	public Adapter createCoreDirectAcyclicGraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Core.CoreComputationNode <em>Computation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreComputationNode
	 * @generated
	 */
	public Adapter createCoreComputationNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StormAdapterFactory
