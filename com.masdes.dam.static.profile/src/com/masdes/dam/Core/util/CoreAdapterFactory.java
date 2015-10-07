/**
 */
package com.masdes.dam.Core.util;

import com.masdes.dam.Core.*;

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
 * @see com.masdes.dam.Core.CorePackage
 * @generated
 */
public class CoreAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
	protected CoreSwitch<Adapter> modelSwitch =
		new CoreSwitch<Adapter>() {
			@Override
			public Adapter caseDaComponent(DaComponent object) {
				return createDaComponentAdapter();
			}
			@Override
			public Adapter caseDaService(DaService object) {
				return createDaServiceAdapter();
			}
			@Override
			public Adapter caseDaStep(DaStep object) {
				return createDaStepAdapter();
			}
			@Override
			public Adapter caseDaResistance(DaResistance object) {
				return createDaResistanceAdapter();
			}
			@Override
			public Adapter caseDaRecognition(DaRecognition object) {
				return createDaRecognitionAdapter();
			}
			@Override
			public Adapter caseDaRecovery(DaRecovery object) {
				return createDaRecoveryAdapter();
			}
			@Override
			public Adapter caseDaServiceMode(DaServiceMode object) {
				return createDaServiceModeAdapter();
			}
			@Override
			public Adapter caseDaServiceRequest(DaServiceRequest object) {
				return createDaServiceRequestAdapter();
			}
			@Override
			public Adapter caseDaConnector(DaConnector object) {
				return createDaConnectorAdapter();
			}
			@Override
			public Adapter caseDaChange(DaChange object) {
				return createDaChangeAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaStep <em>Da Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaStep
	 * @generated
	 */
	public Adapter createDaStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaResistance <em>Da Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaResistance
	 * @generated
	 */
	public Adapter createDaResistanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaRecognition <em>Da Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaRecognition
	 * @generated
	 */
	public Adapter createDaRecognitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaRecovery <em>Da Recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaRecovery
	 * @generated
	 */
	public Adapter createDaRecoveryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaServiceMode <em>Da Service Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaServiceMode
	 * @generated
	 */
	public Adapter createDaServiceModeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaServiceRequest <em>Da Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaServiceRequest
	 * @generated
	 */
	public Adapter createDaServiceRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaConnector <em>Da Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaConnector
	 * @generated
	 */
	public Adapter createDaConnectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.masdes.dam.Core.DaChange <em>Da Change</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.masdes.dam.Core.DaChange
	 * @generated
	 */
	public Adapter createDaChangeAdapter() {
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

} //CoreAdapterFactory
