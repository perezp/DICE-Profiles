/**
 */
package es.unizar.disco.dice.DPIM.impl;

import es.unizar.disco.dice.DPIM.*;

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
public class DPIMFactoryImpl extends EFactoryImpl implements DPIMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DPIMFactory init() {
		try {
			DPIMFactory theDPIMFactory = (DPIMFactory)EPackage.Registry.INSTANCE.getEFactory(DPIMPackage.eNS_URI);
			if (theDPIMFactory != null) {
				return theDPIMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DPIMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPIMFactoryImpl() {
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
			case DPIMPackage.DICE_COMPONENT: return createDiceComponent();
			case DPIMPackage.DICE_FILTER_NODE: return createDiceFilterNode();
			case DPIMPackage.DICE_VISUALIZATION_NODE: return createDiceVisualizationNode();
			case DPIMPackage.DICE_SOURCE_NODE: return createDiceSourceNode();
			case DPIMPackage.DICE_STORAGE_RESOURCE: return createDiceStorageResource();
			case DPIMPackage.DICE_CHANNEL: return createDiceChannel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceComponent createDiceComponent() {
		DiceComponentImpl diceComponent = new DiceComponentImpl();
		return diceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceFilterNode createDiceFilterNode() {
		DiceFilterNodeImpl diceFilterNode = new DiceFilterNodeImpl();
		return diceFilterNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceVisualizationNode createDiceVisualizationNode() {
		DiceVisualizationNodeImpl diceVisualizationNode = new DiceVisualizationNodeImpl();
		return diceVisualizationNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceSourceNode createDiceSourceNode() {
		DiceSourceNodeImpl diceSourceNode = new DiceSourceNodeImpl();
		return diceSourceNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceStorageResource createDiceStorageResource() {
		DiceStorageResourceImpl diceStorageResource = new DiceStorageResourceImpl();
		return diceStorageResource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceChannel createDiceChannel() {
		DiceChannelImpl diceChannel = new DiceChannelImpl();
		return diceChannel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DPIMPackage getDPIMPackage() {
		return (DPIMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DPIMPackage getPackage() {
		return DPIMPackage.eINSTANCE;
	}

} //DPIMFactoryImpl
