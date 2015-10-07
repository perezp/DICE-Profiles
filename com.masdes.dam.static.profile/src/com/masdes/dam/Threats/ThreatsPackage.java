/**
 */
package com.masdes.dam.Threats;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

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
 * @see com.masdes.dam.Threats.ThreatsFactory
 * @model kind="package"
 * @generated
 */
public interface ThreatsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Threats";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.masdes.dam/profiles/Threats/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Threats";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ThreatsPackage eINSTANCE = com.masdes.dam.Threats.impl.ThreatsPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.masdes.dam.Threats.impl.DaErrorPropRelationImpl <em>Da Error Prop Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Threats.impl.DaErrorPropRelationImpl
	 * @see com.masdes.dam.Threats.impl.ThreatsPackageImpl#getDaErrorPropRelation()
	 * @generated
	 */
	int DA_ERROR_PROP_RELATION = 0;

	/**
	 * The feature id for the '<em><b>Propagation Expr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_PROP_RELATION__PROPAGATION_EXPR = 0;

	/**
	 * The feature id for the '<em><b>Error Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_PROP_RELATION__ERROR_PROP = 1;

	/**
	 * The feature id for the '<em><b>Base Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_PROP_RELATION__BASE_CONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Da Error Prop Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_PROP_RELATION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Threats.impl.DaFaultGeneratorImpl <em>Da Fault Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Threats.impl.DaFaultGeneratorImpl
	 * @see com.masdes.dam.Threats.impl.ThreatsPackageImpl#getDaFaultGenerator()
	 * @generated
	 */
	int DA_FAULT_GENERATOR = 1;

	/**
	 * The feature id for the '<em><b>Pop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT_GENERATOR__POP = GQAMPackage.GA_WORKLOAD_GENERATOR__POP;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT_GENERATOR__BASE_BEHAVIOR = GQAMPackage.GA_WORKLOAD_GENERATOR__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Number Of Faults</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT_GENERATOR__NUMBER_OF_FAULTS = GQAMPackage.GA_WORKLOAD_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT_GENERATOR__FAULT = GQAMPackage.GA_WORKLOAD_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Da Fault Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT_GENERATOR_FEATURE_COUNT = GQAMPackage.GA_WORKLOAD_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Threats.DaErrorPropRelation <em>Da Error Prop Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Error Prop Relation</em>'.
	 * @see com.masdes.dam.Threats.DaErrorPropRelation
	 * @generated
	 */
	EClass getDaErrorPropRelation();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Threats.DaErrorPropRelation#getPropagationExpr <em>Propagation Expr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Propagation Expr</em>'.
	 * @see com.masdes.dam.Threats.DaErrorPropRelation#getPropagationExpr()
	 * @see #getDaErrorPropRelation()
	 * @generated
	 */
	EAttribute getDaErrorPropRelation_PropagationExpr();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Threats.DaErrorPropRelation#getErrorProp <em>Error Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Prop</em>'.
	 * @see com.masdes.dam.Threats.DaErrorPropRelation#getErrorProp()
	 * @see #getDaErrorPropRelation()
	 * @generated
	 */
	EReference getDaErrorPropRelation_ErrorProp();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Threats.DaErrorPropRelation#getBase_Constraint <em>Base Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Constraint</em>'.
	 * @see com.masdes.dam.Threats.DaErrorPropRelation#getBase_Constraint()
	 * @see #getDaErrorPropRelation()
	 * @generated
	 */
	EReference getDaErrorPropRelation_Base_Constraint();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Threats.DaFaultGenerator <em>Da Fault Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Fault Generator</em>'.
	 * @see com.masdes.dam.Threats.DaFaultGenerator
	 * @generated
	 */
	EClass getDaFaultGenerator();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Threats.DaFaultGenerator#getNumberOfFaults <em>Number Of Faults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Number Of Faults</em>'.
	 * @see com.masdes.dam.Threats.DaFaultGenerator#getNumberOfFaults()
	 * @see #getDaFaultGenerator()
	 * @generated
	 */
	EAttribute getDaFaultGenerator_NumberOfFaults();

	/**
	 * Returns the meta object for the containment reference '{@link com.masdes.dam.Threats.DaFaultGenerator#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fault</em>'.
	 * @see com.masdes.dam.Threats.DaFaultGenerator#getFault()
	 * @see #getDaFaultGenerator()
	 * @generated
	 */
	EReference getDaFaultGenerator_Fault();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ThreatsFactory getThreatsFactory();

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
		 * The meta object literal for the '{@link com.masdes.dam.Threats.impl.DaErrorPropRelationImpl <em>Da Error Prop Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Threats.impl.DaErrorPropRelationImpl
		 * @see com.masdes.dam.Threats.impl.ThreatsPackageImpl#getDaErrorPropRelation()
		 * @generated
		 */
		EClass DA_ERROR_PROP_RELATION = eINSTANCE.getDaErrorPropRelation();

		/**
		 * The meta object literal for the '<em><b>Propagation Expr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_ERROR_PROP_RELATION__PROPAGATION_EXPR = eINSTANCE.getDaErrorPropRelation_PropagationExpr();

		/**
		 * The meta object literal for the '<em><b>Error Prop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_ERROR_PROP_RELATION__ERROR_PROP = eINSTANCE.getDaErrorPropRelation_ErrorProp();

		/**
		 * The meta object literal for the '<em><b>Base Constraint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_ERROR_PROP_RELATION__BASE_CONSTRAINT = eINSTANCE.getDaErrorPropRelation_Base_Constraint();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Threats.impl.DaFaultGeneratorImpl <em>Da Fault Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Threats.impl.DaFaultGeneratorImpl
		 * @see com.masdes.dam.Threats.impl.ThreatsPackageImpl#getDaFaultGenerator()
		 * @generated
		 */
		EClass DA_FAULT_GENERATOR = eINSTANCE.getDaFaultGenerator();

		/**
		 * The meta object literal for the '<em><b>Number Of Faults</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT_GENERATOR__NUMBER_OF_FAULTS = eINSTANCE.getDaFaultGenerator_NumberOfFaults();

		/**
		 * The meta object literal for the '<em><b>Fault</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_FAULT_GENERATOR__FAULT = eINSTANCE.getDaFaultGenerator_Fault();

	}

} //ThreatsPackage
