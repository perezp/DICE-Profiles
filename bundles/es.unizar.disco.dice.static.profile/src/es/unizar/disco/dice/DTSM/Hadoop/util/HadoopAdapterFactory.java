/**
 */
package es.unizar.disco.dice.DTSM.Hadoop.util;

import com.masdes.dam.Core.DaComponent;
import com.masdes.dam.Core.DaService;

import es.unizar.disco.dice.DPIM.DpimComputationNode;

import es.unizar.disco.dice.DTSM.Core.CoreComputationNode;

import es.unizar.disco.dice.DTSM.Hadoop.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedElement;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedProcessing;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopPackage
 * @generated
 */
public class HadoopAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HadoopPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HadoopAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = HadoopPackage.eINSTANCE;
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
	protected HadoopSwitch<Adapter> modelSwitch =
		new HadoopSwitch<Adapter>() {
			@Override
			public Adapter caseHadoopMapReduceJob(HadoopMapReduceJob object) {
				return createHadoopMapReduceJobAdapter();
			}
			@Override
			public Adapter caseHadoopMapReducePhase(HadoopMapReducePhase object) {
				return createHadoopMapReducePhaseAdapter();
			}
			@Override
			public Adapter caseHadoopMap(HadoopMap object) {
				return createHadoopMapAdapter();
			}
			@Override
			public Adapter caseHadoopOperation(HadoopOperation object) {
				return createHadoopOperationAdapter();
			}
			@Override
			public Adapter caseHadoopReduce(HadoopReduce object) {
				return createHadoopReduceAdapter();
			}
			@Override
			public Adapter caseHadoopScenario(HadoopScenario object) {
				return createHadoopScenarioAdapter();
			}
			@Override
			public Adapter caseHadoopWorkloadEvent(HadoopWorkloadEvent object) {
				return createHadoopWorkloadEventAdapter();
			}
			@Override
			public Adapter caseHadoopComputationNode(HadoopComputationNode object) {
				return createHadoopComputationNodeAdapter();
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
			public Adapter caseDaService(DaService object) {
				return createDaServiceAdapter();
			}
			@Override
			public Adapter caseGaWorkloadEvent(GaWorkloadEvent object) {
				return createGaWorkloadEventAdapter();
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
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob <em>Map Reduce Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReduceJob
	 * @generated
	 */
	public Adapter createHadoopMapReduceJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase <em>Map Reduce Phase</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMapReducePhase
	 * @generated
	 */
	public Adapter createHadoopMapReducePhaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopMap
	 * @generated
	 */
	public Adapter createHadoopMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopOperation
	 * @generated
	 */
	public Adapter createHadoopOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopReduce <em>Reduce</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopReduce
	 * @generated
	 */
	public Adapter createHadoopReduceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopScenario
	 * @generated
	 */
	public Adapter createHadoopScenarioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent <em>Workload Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopWorkloadEvent
	 * @generated
	 */
	public Adapter createHadoopWorkloadEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link es.unizar.disco.dice.DTSM.Hadoop.HadoopComputationNode <em>Computation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see es.unizar.disco.dice.DTSM.Hadoop.HadoopComputationNode
	 * @generated
	 */
	public Adapter createHadoopComputationNodeAdapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent <em>Ga Workload Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent
	 * @generated
	 */
	public Adapter createGaWorkloadEventAdapter() {
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

} //HadoopAdapterFactory
