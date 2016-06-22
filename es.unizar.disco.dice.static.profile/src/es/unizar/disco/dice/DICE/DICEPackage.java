/**
 */
package es.unizar.disco.dice.DICE;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DICE.DICEFactory
 * @model kind="package"
 * @generated
 */
public interface DICEPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DICE";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/profiles/DICE/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DICE";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DICEPackage eINSTANCE = es.unizar.disco.dice.DICE.impl.DICEPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DICE.Dummy <em>Dummy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DICE.Dummy
	 * @see es.unizar.disco.dice.DICE.impl.DICEPackageImpl#getDummy()
	 * @generated
	 */
	int DUMMY = 0;


	/**
	 * Returns the meta object for enum '{@link es.unizar.disco.dice.DICE.Dummy <em>Dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dummy</em>'.
	 * @see es.unizar.disco.dice.DICE.Dummy
	 * @generated
	 */
	EEnum getDummy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DICEFactory getDICEFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DICE.Dummy <em>Dummy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DICE.Dummy
		 * @see es.unizar.disco.dice.DICE.impl.DICEPackageImpl#getDummy()
		 * @generated
		 */
		EEnum DUMMY = eINSTANCE.getDummy();

	}

} //DICEPackage
