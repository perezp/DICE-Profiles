/**
 */
package es.unizar.disco.dice.Basic_Data_Types;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.Basic_Data_Types.Basic_Data_TypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Data_Types'"
 * @generated
 */
public interface Basic_Data_TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Basic_Data_Types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/libraries/Basic_Data_Types/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Basic_Data_Types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Basic_Data_TypesPackage eINSTANCE = es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.Basic_Data_Types.impl.NFP_PrivacyImpl <em>NFP Privacy</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.Basic_Data_Types.impl.NFP_PrivacyImpl
	 * @see es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl#getNFP_Privacy()
	 * @generated
	 */
	int NFP_PRIVACY = 0;

	/**
	 * The feature id for the '<em><b>Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRIVACY__EXPR = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRIVACY__SOURCE = 1;

	/**
	 * The number of structural features of the '<em>NFP Privacy</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NFP_PRIVACY_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy <em>NFP Privacy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFP Privacy</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy
	 * @generated
	 */
	EClass getNFP_Privacy();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getExpr <em>Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expr</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getExpr()
	 * @see #getNFP_Privacy()
	 * @generated
	 */
	EAttribute getNFP_Privacy_Expr();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see es.unizar.disco.dice.Basic_Data_Types.NFP_Privacy#getSource()
	 * @see #getNFP_Privacy()
	 * @generated
	 */
	EAttribute getNFP_Privacy_Source();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Basic_Data_TypesFactory getBasic_Data_TypesFactory();

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
		 * The meta object literal for the '{@link es.unizar.disco.dice.Basic_Data_Types.impl.NFP_PrivacyImpl <em>NFP Privacy</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.Basic_Data_Types.impl.NFP_PrivacyImpl
		 * @see es.unizar.disco.dice.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl#getNFP_Privacy()
		 * @generated
		 */
		EClass NFP_PRIVACY = eINSTANCE.getNFP_Privacy();

		/**
		 * The meta object literal for the '<em><b>Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_PRIVACY__EXPR = eINSTANCE.getNFP_Privacy_Expr();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NFP_PRIVACY__SOURCE = eINSTANCE.getNFP_Privacy_Source();

	}

} //Basic_Data_TypesPackage
