/**
 */
package com.masdes.dam.DAM;

import org.eclipse.emf.ecore.EEnum;
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
 * @see com.masdes.dam.DAM.DAMFactory
 * @model kind="package"
 * @generated
 */
public interface DAMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DAM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.masdes.dam/profiles/DAM/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DAM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DAMPackage eINSTANCE = com.masdes.dam.DAM.impl.DAMPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.masdes.dam.DAM.dummy <em>dummy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.DAM.dummy
	 * @see com.masdes.dam.DAM.impl.DAMPackageImpl#getdummy()
	 * @generated
	 */
	int DUMMY = 0;


	/**
	 * Returns the meta object for enum '{@link com.masdes.dam.DAM.dummy <em>dummy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>dummy</em>'.
	 * @see com.masdes.dam.DAM.dummy
	 * @generated
	 */
	EEnum getdummy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DAMFactory getDAMFactory();

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
		 * The meta object literal for the '{@link com.masdes.dam.DAM.dummy <em>dummy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.DAM.dummy
		 * @see com.masdes.dam.DAM.impl.DAMPackageImpl#getdummy()
		 * @generated
		 */
		EEnum DUMMY = eINSTANCE.getdummy();

	}

} //DAMPackage
