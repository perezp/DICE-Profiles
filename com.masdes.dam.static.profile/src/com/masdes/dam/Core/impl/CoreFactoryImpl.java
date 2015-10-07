/**
 */
package com.masdes.dam.Core.impl;

import com.masdes.dam.Core.*;

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
public class CoreFactoryImpl extends EFactoryImpl implements CoreFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CoreFactory init() {
		try {
			CoreFactory theCoreFactory = (CoreFactory)EPackage.Registry.INSTANCE.getEFactory(CorePackage.eNS_URI);
			if (theCoreFactory != null) {
				return theCoreFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CoreFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreFactoryImpl() {
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
			case CorePackage.DA_COMPONENT: return createDaComponent();
			case CorePackage.DA_SERVICE: return createDaService();
			case CorePackage.DA_STEP: return createDaStep();
			case CorePackage.DA_RESISTANCE: return createDaResistance();
			case CorePackage.DA_RECOGNITION: return createDaRecognition();
			case CorePackage.DA_RECOVERY: return createDaRecovery();
			case CorePackage.DA_SERVICE_MODE: return createDaServiceMode();
			case CorePackage.DA_SERVICE_REQUEST: return createDaServiceRequest();
			case CorePackage.DA_CONNECTOR: return createDaConnector();
			case CorePackage.DA_CHANGE: return createDaChange();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaComponent createDaComponent() {
		DaComponentImpl daComponent = new DaComponentImpl();
		return daComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaService createDaService() {
		DaServiceImpl daService = new DaServiceImpl();
		return daService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaStep createDaStep() {
		DaStepImpl daStep = new DaStepImpl();
		return daStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaResistance createDaResistance() {
		DaResistanceImpl daResistance = new DaResistanceImpl();
		return daResistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaRecognition createDaRecognition() {
		DaRecognitionImpl daRecognition = new DaRecognitionImpl();
		return daRecognition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaRecovery createDaRecovery() {
		DaRecoveryImpl daRecovery = new DaRecoveryImpl();
		return daRecovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaServiceMode createDaServiceMode() {
		DaServiceModeImpl daServiceMode = new DaServiceModeImpl();
		return daServiceMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaServiceRequest createDaServiceRequest() {
		DaServiceRequestImpl daServiceRequest = new DaServiceRequestImpl();
		return daServiceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaConnector createDaConnector() {
		DaConnectorImpl daConnector = new DaConnectorImpl();
		return daConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DaChange createDaChange() {
		DaChangeImpl daChange = new DaChangeImpl();
		return daChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CorePackage getCorePackage() {
		return (CorePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CorePackage getPackage() {
		return CorePackage.eINSTANCE;
	}

} //CoreFactoryImpl
