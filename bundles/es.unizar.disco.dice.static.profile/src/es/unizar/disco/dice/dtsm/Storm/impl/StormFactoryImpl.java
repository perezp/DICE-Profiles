/**
 */
package es.unizar.disco.dice.dtsm.Storm.impl;

import es.unizar.disco.dice.dtsm.Storm.*;

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
public class StormFactoryImpl extends EFactoryImpl implements StormFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StormFactory init() {
		try {
			StormFactory theStormFactory = (StormFactory)EPackage.Registry.INSTANCE.getEFactory(StormPackage.eNS_URI);
			if (theStormFactory != null) {
				return theStormFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StormFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormFactoryImpl() {
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
			case StormPackage.STORM_BOLT: return createStormBolt();
			case StormPackage.STORM_SPOUT: return createStormSpout();
			case StormPackage.STORM_SCENARIO_TOPOLOGY: return createStormScenarioTopology();
			case StormPackage.STORM_APPLICATION: return createStormApplication();
			case StormPackage.STORM_NIMBUS: return createStormNimbus();
			case StormPackage.STORM_SUPERVISOR: return createStormSupervisor();
			case StormPackage.STORM_ZOOKEEPER: return createStormZookeeper();
			case StormPackage.STORM_STREAM_STEP: return createStormStreamStep();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormBolt createStormBolt() {
		StormBoltImpl stormBolt = new StormBoltImpl();
		return stormBolt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormSpout createStormSpout() {
		StormSpoutImpl stormSpout = new StormSpoutImpl();
		return stormSpout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormScenarioTopology createStormScenarioTopology() {
		StormScenarioTopologyImpl stormScenarioTopology = new StormScenarioTopologyImpl();
		return stormScenarioTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormApplication createStormApplication() {
		StormApplicationImpl stormApplication = new StormApplicationImpl();
		return stormApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormNimbus createStormNimbus() {
		StormNimbusImpl stormNimbus = new StormNimbusImpl();
		return stormNimbus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormSupervisor createStormSupervisor() {
		StormSupervisorImpl stormSupervisor = new StormSupervisorImpl();
		return stormSupervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormZookeeper createStormZookeeper() {
		StormZookeeperImpl stormZookeeper = new StormZookeeperImpl();
		return stormZookeeper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormStreamStep createStormStreamStep() {
		StormStreamStepImpl stormStreamStep = new StormStreamStepImpl();
		return stormStreamStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormPackage getStormPackage() {
		return (StormPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StormPackage getPackage() {
		return StormPackage.eINSTANCE;
	}

} //StormFactoryImpl
