/**
 */
package es.unizar.disco.dice.Basic_Enumeration_Types;

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
 * @see es.unizar.disco.dice.Basic_Enumeration_Types.Basic_Enumeration_TypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Enumeration_Types'"
 * @generated
 */
public interface Basic_Enumeration_TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Basic_Enumeration_Types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/libraries/Basic_Enumeration_Types/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Basic_Enumeration_Types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Basic_Enumeration_TypesPackage eINSTANCE = es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.RefType <em>Ref Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.RefType
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getRefType()
	 * @generated
	 */
	int REF_TYPE = 0;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType <em>Ref Data Format Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getRefDataFormatType()
	 * @generated
	 */
	int REF_DATA_FORMAT_TYPE = 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.TechType <em>Tech Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.TechType
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getTechType()
	 * @generated
	 */
	int TECH_TYPE = 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType <em>Processing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getProcessingType()
	 * @generated
	 */
	int PROCESSING_TYPE = 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.SourceType <em>Source Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SourceType
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getSourceType()
	 * @generated
	 */
	int SOURCE_TYPE = 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType <em>Computation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getComputationType()
	 * @generated
	 */
	int COMPUTATION_TYPE = 5;


	/**
	 * Returns the meta object for enum '{@link es.unizar.disco.dice.Basic_Enumeration_Types.RefType <em>Ref Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ref Type</em>'.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.RefType
	 * @generated
	 */
	EEnum getRefType();

	/**
	 * Returns the meta object for enum '{@link es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType <em>Ref Data Format Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ref Data Format Type</em>'.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType
	 * @generated
	 */
	EEnum getRefDataFormatType();

	/**
	 * Returns the meta object for enum '{@link es.unizar.disco.dice.Basic_Enumeration_Types.TechType <em>Tech Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tech Type</em>'.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.TechType
	 * @generated
	 */
	EEnum getTechType();

	/**
	 * Returns the meta object for enum '{@link es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType <em>Processing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Processing Type</em>'.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType
	 * @generated
	 */
	EEnum getProcessingType();

	/**
	 * Returns the meta object for enum '{@link es.unizar.disco.dice.Basic_Enumeration_Types.SourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Source Type</em>'.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SourceType
	 * @generated
	 */
	EEnum getSourceType();

	/**
	 * Returns the meta object for enum '{@link es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType <em>Computation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Computation Type</em>'.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType
	 * @generated
	 */
	EEnum getComputationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Basic_Enumeration_TypesFactory getBasic_Enumeration_TypesFactory();

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
		 * The meta object literal for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.RefType <em>Ref Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.RefType
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getRefType()
		 * @generated
		 */
		EEnum REF_TYPE = eINSTANCE.getRefType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType <em>Ref Data Format Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getRefDataFormatType()
		 * @generated
		 */
		EEnum REF_DATA_FORMAT_TYPE = eINSTANCE.getRefDataFormatType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.TechType <em>Tech Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.TechType
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getTechType()
		 * @generated
		 */
		EEnum TECH_TYPE = eINSTANCE.getTechType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType <em>Processing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getProcessingType()
		 * @generated
		 */
		EEnum PROCESSING_TYPE = eINSTANCE.getProcessingType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.SourceType <em>Source Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.SourceType
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getSourceType()
		 * @generated
		 */
		EEnum SOURCE_TYPE = eINSTANCE.getSourceType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType <em>Computation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType
		 * @see es.unizar.disco.dice.Basic_Enumeration_Types.impl.Basic_Enumeration_TypesPackageImpl#getComputationType()
		 * @generated
		 */
		EEnum COMPUTATION_TYPE = eINSTANCE.getComputationType();

	}

} //Basic_Enumeration_TypesPackage
