/**
 */
package es.unizar.disco.dice.Complex_Data_Types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Data_Types'"
 * @generated
 */
public interface Complex_Data_TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Complex_Data_Types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/libraries/Complex_Data_Types/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Complex_Data_Types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Complex_Data_TypesPackage eINSTANCE = es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataVolumeImpl <em>Dice Data Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataVolumeImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceDataVolume()
	 * @generated
	 */
	int DICE_DATA_VOLUME = 0;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_VOLUME__VOLUME = 0;

	/**
	 * The number of structural features of the '<em>Dice Data Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_VOLUME_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl <em>Dice Data Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceDataSpecification()
	 * @generated
	 */
	int DICE_DATA_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_SPECIFICATION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_SPECIFICATION__SIZE = 1;

	/**
	 * The feature id for the '<em><b>Ref Model</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_SPECIFICATION__REF_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Ref Data Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_SPECIFICATION__REF_DATA_FORMAT = 3;

	/**
	 * The number of structural features of the '<em>Dice Data Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_DATA_SPECIFICATION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceChannelSpecificationImpl <em>Dice Channel Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceChannelSpecificationImpl
	 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceChannelSpecification()
	 * @generated
	 */
	int DICE_CHANNEL_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL_SPECIFICATION__RATE = 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL_SPECIFICATION__SIZE = 1;

	/**
	 * The number of structural features of the '<em>Dice Channel Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL_SPECIFICATION_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume <em>Dice Data Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Data Volume</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume
	 * @generated
	 */
	EClass getDiceDataVolume();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume#getVolume()
	 * @see #getDiceDataVolume()
	 * @generated
	 */
	EAttribute getDiceDataVolume_Volume();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification <em>Dice Data Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Data Specification</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification
	 * @generated
	 */
	EClass getDiceDataSpecification();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getDescription()
	 * @see #getDiceDataSpecification()
	 * @generated
	 */
	EAttribute getDiceDataSpecification_Description();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getSize()
	 * @see #getDiceDataSpecification()
	 * @generated
	 */
	EAttribute getDiceDataSpecification_Size();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefModel <em>Ref Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Model</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefModel()
	 * @see #getDiceDataSpecification()
	 * @generated
	 */
	EAttribute getDiceDataSpecification_RefModel();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefDataFormat <em>Ref Data Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ref Data Format</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification#getRefDataFormat()
	 * @see #getDiceDataSpecification()
	 * @generated
	 */
	EAttribute getDiceDataSpecification_RefDataFormat();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification <em>Dice Channel Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Channel Specification</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification
	 * @generated
	 */
	EClass getDiceChannelSpecification();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification#getRate()
	 * @see #getDiceChannelSpecification()
	 * @generated
	 */
	EAttribute getDiceChannelSpecification_Rate();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see es.unizar.disco.dice.Complex_Data_Types.DiceChannelSpecification#getSize()
	 * @see #getDiceChannelSpecification()
	 * @generated
	 */
	EAttribute getDiceChannelSpecification_Size();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Complex_Data_TypesFactory getComplex_Data_TypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataVolumeImpl <em>Dice Data Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataVolumeImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceDataVolume()
		 * @generated
		 */
		EClass DICE_DATA_VOLUME = eINSTANCE.getDiceDataVolume();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_DATA_VOLUME__VOLUME = eINSTANCE.getDiceDataVolume_Volume();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl <em>Dice Data Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceDataSpecification()
		 * @generated
		 */
		EClass DICE_DATA_SPECIFICATION = eINSTANCE.getDiceDataSpecification();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_DATA_SPECIFICATION__DESCRIPTION = eINSTANCE.getDiceDataSpecification_Description();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_DATA_SPECIFICATION__SIZE = eINSTANCE.getDiceDataSpecification_Size();

		/**
		 * The meta object literal for the '<em><b>Ref Model</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_DATA_SPECIFICATION__REF_MODEL = eINSTANCE.getDiceDataSpecification_RefModel();

		/**
		 * The meta object literal for the '<em><b>Ref Data Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_DATA_SPECIFICATION__REF_DATA_FORMAT = eINSTANCE.getDiceDataSpecification_RefDataFormat();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceChannelSpecificationImpl <em>Dice Channel Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.DiceChannelSpecificationImpl
		 * @see es.unizar.disco.dice.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDiceChannelSpecification()
		 * @generated
		 */
		EClass DICE_CHANNEL_SPECIFICATION = eINSTANCE.getDiceChannelSpecification();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_CHANNEL_SPECIFICATION__RATE = eINSTANCE.getDiceChannelSpecification_Rate();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_CHANNEL_SPECIFICATION__SIZE = eINSTANCE.getDiceChannelSpecification_Size();

	}

} //Complex_Data_TypesPackage
