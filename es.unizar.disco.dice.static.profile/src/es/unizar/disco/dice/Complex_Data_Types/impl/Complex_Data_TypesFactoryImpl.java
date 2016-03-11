/**
 */
package es.unizar.disco.dice.Complex_Data_Types.impl;

import es.unizar.disco.dice.Complex_Data_Types.*;

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
public class Complex_Data_TypesFactoryImpl extends EFactoryImpl implements Complex_Data_TypesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Complex_Data_TypesFactory init() {
		try {
			Complex_Data_TypesFactory theComplex_Data_TypesFactory = (Complex_Data_TypesFactory)EPackage.Registry.INSTANCE.getEFactory(Complex_Data_TypesPackage.eNS_URI);
			if (theComplex_Data_TypesFactory != null) {
				return theComplex_Data_TypesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Complex_Data_TypesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complex_Data_TypesFactoryImpl() {
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
			case Complex_Data_TypesPackage.DICE_DATA_VOLUME: return createDiceDataVolume();
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION: return createDiceDataSpecification();
			case Complex_Data_TypesPackage.DICE_CHANNEL_SPECIFICATION: return createDiceChannelSpecification();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceDataVolume createDiceDataVolume() {
		DiceDataVolumeImpl diceDataVolume = new DiceDataVolumeImpl();
		return diceDataVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceDataSpecification createDiceDataSpecification() {
		DiceDataSpecificationImpl diceDataSpecification = new DiceDataSpecificationImpl();
		return diceDataSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceChannelSpecification createDiceChannelSpecification() {
		DiceChannelSpecificationImpl diceChannelSpecification = new DiceChannelSpecificationImpl();
		return diceChannelSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Complex_Data_TypesPackage getComplex_Data_TypesPackage() {
		return (Complex_Data_TypesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Complex_Data_TypesPackage getPackage() {
		return Complex_Data_TypesPackage.eINSTANCE;
	}

} //Complex_Data_TypesFactoryImpl
