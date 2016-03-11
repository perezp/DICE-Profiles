/**
 */
package es.unizar.disco.dice.DPIM;

import com.masdes.dam.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;

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
 * @see es.unizar.disco.dice.DPIM.DPIMFactory
 * @model kind="package"
 * @generated
 */
public interface DPIMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "DPIM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/profiles/DPIM/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "DPIM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DPIMPackage eINSTANCE = es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DiceComponentImpl <em>Dice Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DiceComponentImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceComponent()
	 * @generated
	 */
	int DICE_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__RES_MULT = CorePackage.DA_COMPONENT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__IS_PROTECTED = CorePackage.DA_COMPONENT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__IS_ACTIVE = CorePackage.DA_COMPONENT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__BASE_PROPERTY = CorePackage.DA_COMPONENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__BASE_INSTANCE_SPECIFICATION = CorePackage.DA_COMPONENT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__BASE_CLASSIFIER = CorePackage.DA_COMPONENT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__BASE_LIFELINE = CorePackage.DA_COMPONENT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__BASE_CONNECTABLE_ELEMENT = CorePackage.DA_COMPONENT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__STATEFUL = CorePackage.DA_COMPONENT__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__ORIGIN = CorePackage.DA_COMPONENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__FAILURE_COVERAGE = CorePackage.DA_COMPONENT__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__PERC_PERM_FAULT = CorePackage.DA_COMPONENT__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__SS_AVAIL = CorePackage.DA_COMPONENT__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__UNRELIABILITY = CorePackage.DA_COMPONENT__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__RELIABILITY = CorePackage.DA_COMPONENT__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__MISSION_TIME = CorePackage.DA_COMPONENT__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__AVAIL_LEVEL = CorePackage.DA_COMPONENT__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__RELIABILITY_LEVEL = CorePackage.DA_COMPONENT__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__SAFETY_LEVEL = CorePackage.DA_COMPONENT__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__COMPLEXITY = CorePackage.DA_COMPONENT__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__FAULT = CorePackage.DA_COMPONENT__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__ERROR = CorePackage.DA_COMPONENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__FAILURE = CorePackage.DA_COMPONENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__HAZARD = CorePackage.DA_COMPONENT__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__REPAIR = CorePackage.DA_COMPONENT__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__SUBSTITUTED_BY = CorePackage.DA_COMPONENT__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__THROUGHPUT = CorePackage.DA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__TYPE = CorePackage.DA_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__TARGET_TECH = CorePackage.DA_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT__PROC_TYPE = CorePackage.DA_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dice Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_COMPONENT_FEATURE_COUNT = CorePackage.DA_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DiceFilterNodeImpl <em>Dice Filter Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DiceFilterNodeImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceFilterNode()
	 * @generated
	 */
	int DICE_FILTER_NODE = 1;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__RES_MULT = DICE_COMPONENT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__IS_PROTECTED = DICE_COMPONENT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__IS_ACTIVE = DICE_COMPONENT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__BASE_PROPERTY = DICE_COMPONENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__BASE_INSTANCE_SPECIFICATION = DICE_COMPONENT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__BASE_CLASSIFIER = DICE_COMPONENT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__BASE_LIFELINE = DICE_COMPONENT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__BASE_CONNECTABLE_ELEMENT = DICE_COMPONENT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__STATEFUL = DICE_COMPONENT__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__ORIGIN = DICE_COMPONENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__FAILURE_COVERAGE = DICE_COMPONENT__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__PERC_PERM_FAULT = DICE_COMPONENT__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__SS_AVAIL = DICE_COMPONENT__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__UNRELIABILITY = DICE_COMPONENT__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__RELIABILITY = DICE_COMPONENT__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__MISSION_TIME = DICE_COMPONENT__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__AVAIL_LEVEL = DICE_COMPONENT__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__RELIABILITY_LEVEL = DICE_COMPONENT__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__SAFETY_LEVEL = DICE_COMPONENT__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__COMPLEXITY = DICE_COMPONENT__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__FAULT = DICE_COMPONENT__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__ERROR = DICE_COMPONENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__FAILURE = DICE_COMPONENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__HAZARD = DICE_COMPONENT__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__REPAIR = DICE_COMPONENT__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__SUBSTITUTED_BY = DICE_COMPONENT__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__THROUGHPUT = DICE_COMPONENT__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__TYPE = DICE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__TARGET_TECH = DICE_COMPONENT__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__PROC_TYPE = DICE_COMPONENT__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Input Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__INPUT_RATIO = DICE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Ration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE__OUTPUT_RATION = DICE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dice Filter Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_FILTER_NODE_FEATURE_COUNT = DICE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DiceVisualizationNodeImpl <em>Dice Visualization Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DiceVisualizationNodeImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceVisualizationNode()
	 * @generated
	 */
	int DICE_VISUALIZATION_NODE = 2;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__RES_MULT = DICE_COMPONENT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__IS_PROTECTED = DICE_COMPONENT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__IS_ACTIVE = DICE_COMPONENT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__BASE_PROPERTY = DICE_COMPONENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__BASE_INSTANCE_SPECIFICATION = DICE_COMPONENT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__BASE_CLASSIFIER = DICE_COMPONENT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__BASE_LIFELINE = DICE_COMPONENT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__BASE_CONNECTABLE_ELEMENT = DICE_COMPONENT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__STATEFUL = DICE_COMPONENT__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__ORIGIN = DICE_COMPONENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__FAILURE_COVERAGE = DICE_COMPONENT__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__PERC_PERM_FAULT = DICE_COMPONENT__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__SS_AVAIL = DICE_COMPONENT__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__UNRELIABILITY = DICE_COMPONENT__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__RELIABILITY = DICE_COMPONENT__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__MISSION_TIME = DICE_COMPONENT__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__AVAIL_LEVEL = DICE_COMPONENT__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__RELIABILITY_LEVEL = DICE_COMPONENT__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__SAFETY_LEVEL = DICE_COMPONENT__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__COMPLEXITY = DICE_COMPONENT__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__FAULT = DICE_COMPONENT__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__ERROR = DICE_COMPONENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__FAILURE = DICE_COMPONENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__HAZARD = DICE_COMPONENT__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__REPAIR = DICE_COMPONENT__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__SUBSTITUTED_BY = DICE_COMPONENT__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__THROUGHPUT = DICE_COMPONENT__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__TYPE = DICE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__TARGET_TECH = DICE_COMPONENT__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE__PROC_TYPE = DICE_COMPONENT__PROC_TYPE;

	/**
	 * The number of structural features of the '<em>Dice Visualization Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_VISUALIZATION_NODE_FEATURE_COUNT = DICE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DiceSourceNodeImpl <em>Dice Source Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DiceSourceNodeImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceSourceNode()
	 * @generated
	 */
	int DICE_SOURCE_NODE = 3;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__RES_MULT = DICE_COMPONENT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__IS_PROTECTED = DICE_COMPONENT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__IS_ACTIVE = DICE_COMPONENT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__BASE_PROPERTY = DICE_COMPONENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__BASE_INSTANCE_SPECIFICATION = DICE_COMPONENT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__BASE_CLASSIFIER = DICE_COMPONENT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__BASE_LIFELINE = DICE_COMPONENT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__BASE_CONNECTABLE_ELEMENT = DICE_COMPONENT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__STATEFUL = DICE_COMPONENT__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__ORIGIN = DICE_COMPONENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__FAILURE_COVERAGE = DICE_COMPONENT__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__PERC_PERM_FAULT = DICE_COMPONENT__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__SS_AVAIL = DICE_COMPONENT__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__UNRELIABILITY = DICE_COMPONENT__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__RELIABILITY = DICE_COMPONENT__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__MISSION_TIME = DICE_COMPONENT__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__AVAIL_LEVEL = DICE_COMPONENT__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__RELIABILITY_LEVEL = DICE_COMPONENT__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__SAFETY_LEVEL = DICE_COMPONENT__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__COMPLEXITY = DICE_COMPONENT__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__FAULT = DICE_COMPONENT__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__ERROR = DICE_COMPONENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__FAILURE = DICE_COMPONENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__HAZARD = DICE_COMPONENT__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__REPAIR = DICE_COMPONENT__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__SUBSTITUTED_BY = DICE_COMPONENT__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__THROUGHPUT = DICE_COMPONENT__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__TYPE = DICE_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__TARGET_TECH = DICE_COMPONENT__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__PROC_TYPE = DICE_COMPONENT__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__STORE = DICE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__PROVIDES = DICE_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__SOURCE_TYPE = DICE_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE__RATE = DICE_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dice Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_SOURCE_NODE_FEATURE_COUNT = DICE_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DiceStorageResourceImpl <em>Dice Storage Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DiceStorageResourceImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceStorageResource()
	 * @generated
	 */
	int DICE_STORAGE_RESOURCE = 4;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__RES_MULT = GRMPackage.STORAGE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__IS_PROTECTED = GRMPackage.STORAGE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__IS_ACTIVE = GRMPackage.STORAGE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__BASE_PROPERTY = GRMPackage.STORAGE_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__BASE_INSTANCE_SPECIFICATION = GRMPackage.STORAGE_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__BASE_CLASSIFIER = GRMPackage.STORAGE_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__BASE_LIFELINE = GRMPackage.STORAGE_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__BASE_CONNECTABLE_ELEMENT = GRMPackage.STORAGE_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__ELEMENT_SIZE = GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Responds To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__RESPONDS_TO = GRMPackage.STORAGE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Crud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE__CRUD_RATE = GRMPackage.STORAGE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dice Storage Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_STORAGE_RESOURCE_FEATURE_COUNT = GRMPackage.STORAGE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DiceChannelImpl <em>Dice Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DiceChannelImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceChannel()
	 * @generated
	 */
	int DICE_CHANNEL = 5;

	/**
	 * The feature id for the '<em><b>Coupling</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__COUPLING = CorePackage.DA_CONNECTOR__COUPLING;

	/**
	 * The feature id for the '<em><b>Error Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__ERROR_PROP = CorePackage.DA_CONNECTOR__ERROR_PROP;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__FAILURE = CorePackage.DA_CONNECTOR__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__HAZARD = CorePackage.DA_CONNECTOR__HAZARD;

	/**
	 * The feature id for the '<em><b>Base Invocation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__BASE_INVOCATION_ACTION = CorePackage.DA_CONNECTOR__BASE_INVOCATION_ACTION;

	/**
	 * The feature id for the '<em><b>Base Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__BASE_EXTEND = CorePackage.DA_CONNECTOR__BASE_EXTEND;

	/**
	 * The feature id for the '<em><b>Base Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__BASE_INCLUDE = CorePackage.DA_CONNECTOR__BASE_INCLUDE;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__BASE_MESSAGE = CorePackage.DA_CONNECTOR__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__BASE_CONNECTOR = CorePackage.DA_CONNECTOR__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__BASE_DEPENDENCY = CorePackage.DA_CONNECTOR__BASE_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__BASE_ASSOCIATION = CorePackage.DA_CONNECTOR__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__RATE = CorePackage.DA_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Broker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__MESSAGE_BROKER = CorePackage.DA_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channel Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL__CHANNEL_DESCRIPTION = CorePackage.DA_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dice Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DICE_CHANNEL_FEATURE_COUNT = CorePackage.DA_CONNECTOR_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DiceComponent <em>Dice Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Component</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceComponent
	 * @generated
	 */
	EClass getDiceComponent();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceComponent#getThroughput <em>Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Throughput</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceComponent#getThroughput()
	 * @see #getDiceComponent()
	 * @generated
	 */
	EAttribute getDiceComponent_Throughput();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceComponent#getType()
	 * @see #getDiceComponent()
	 * @generated
	 */
	EAttribute getDiceComponent_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceComponent#getTargetTech <em>Target Tech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Tech</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceComponent#getTargetTech()
	 * @see #getDiceComponent()
	 * @generated
	 */
	EAttribute getDiceComponent_TargetTech();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceComponent#getProcType <em>Proc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Type</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceComponent#getProcType()
	 * @see #getDiceComponent()
	 * @generated
	 */
	EAttribute getDiceComponent_ProcType();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DiceFilterNode <em>Dice Filter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Filter Node</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceFilterNode
	 * @generated
	 */
	EClass getDiceFilterNode();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceFilterNode#getInputRatio <em>Input Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Ratio</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceFilterNode#getInputRatio()
	 * @see #getDiceFilterNode()
	 * @generated
	 */
	EAttribute getDiceFilterNode_InputRatio();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceFilterNode#getOutputRation <em>Output Ration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Ration</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceFilterNode#getOutputRation()
	 * @see #getDiceFilterNode()
	 * @generated
	 */
	EAttribute getDiceFilterNode_OutputRation();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DiceVisualizationNode <em>Dice Visualization Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Visualization Node</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceVisualizationNode
	 * @generated
	 */
	EClass getDiceVisualizationNode();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DiceSourceNode <em>Dice Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Source Node</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceSourceNode
	 * @generated
	 */
	EClass getDiceSourceNode();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.DPIM.DiceSourceNode#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Store</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceSourceNode#getStore()
	 * @see #getDiceSourceNode()
	 * @generated
	 */
	EReference getDiceSourceNode_Store();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.DPIM.DiceSourceNode#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provides</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceSourceNode#getProvides()
	 * @see #getDiceSourceNode()
	 * @generated
	 */
	EReference getDiceSourceNode_Provides();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceSourceNode#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceSourceNode#getSourceType()
	 * @see #getDiceSourceNode()
	 * @generated
	 */
	EAttribute getDiceSourceNode_SourceType();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceSourceNode#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceSourceNode#getRate()
	 * @see #getDiceSourceNode()
	 * @generated
	 */
	EAttribute getDiceSourceNode_Rate();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DiceStorageResource <em>Dice Storage Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Storage Resource</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceStorageResource
	 * @generated
	 */
	EClass getDiceStorageResource();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.DPIM.DiceStorageResource#getRespondsTo <em>Responds To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responds To</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceStorageResource#getRespondsTo()
	 * @see #getDiceStorageResource()
	 * @generated
	 */
	EReference getDiceStorageResource_RespondsTo();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceStorageResource#getCrudRate <em>Crud Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crud Rate</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceStorageResource#getCrudRate()
	 * @see #getDiceStorageResource()
	 * @generated
	 */
	EAttribute getDiceStorageResource_CrudRate();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DiceChannel <em>Dice Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dice Channel</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceChannel
	 * @generated
	 */
	EClass getDiceChannel();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceChannel#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceChannel#getRate()
	 * @see #getDiceChannel()
	 * @generated
	 */
	EAttribute getDiceChannel_Rate();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DiceChannel#getMessageBroker <em>Message Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Broker</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceChannel#getMessageBroker()
	 * @see #getDiceChannel()
	 * @generated
	 */
	EAttribute getDiceChannel_MessageBroker();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.DPIM.DiceChannel#getChannelDescription <em>Channel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel Description</em>'.
	 * @see es.unizar.disco.dice.DPIM.DiceChannel#getChannelDescription()
	 * @see #getDiceChannel()
	 * @generated
	 */
	EReference getDiceChannel_ChannelDescription();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DPIMFactory getDPIMFactory();

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
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DiceComponentImpl <em>Dice Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DiceComponentImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceComponent()
		 * @generated
		 */
		EClass DICE_COMPONENT = eINSTANCE.getDiceComponent();

		/**
		 * The meta object literal for the '<em><b>Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_COMPONENT__THROUGHPUT = eINSTANCE.getDiceComponent_Throughput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_COMPONENT__TYPE = eINSTANCE.getDiceComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Target Tech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_COMPONENT__TARGET_TECH = eINSTANCE.getDiceComponent_TargetTech();

		/**
		 * The meta object literal for the '<em><b>Proc Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_COMPONENT__PROC_TYPE = eINSTANCE.getDiceComponent_ProcType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DiceFilterNodeImpl <em>Dice Filter Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DiceFilterNodeImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceFilterNode()
		 * @generated
		 */
		EClass DICE_FILTER_NODE = eINSTANCE.getDiceFilterNode();

		/**
		 * The meta object literal for the '<em><b>Input Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_FILTER_NODE__INPUT_RATIO = eINSTANCE.getDiceFilterNode_InputRatio();

		/**
		 * The meta object literal for the '<em><b>Output Ration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_FILTER_NODE__OUTPUT_RATION = eINSTANCE.getDiceFilterNode_OutputRation();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DiceVisualizationNodeImpl <em>Dice Visualization Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DiceVisualizationNodeImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceVisualizationNode()
		 * @generated
		 */
		EClass DICE_VISUALIZATION_NODE = eINSTANCE.getDiceVisualizationNode();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DiceSourceNodeImpl <em>Dice Source Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DiceSourceNodeImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceSourceNode()
		 * @generated
		 */
		EClass DICE_SOURCE_NODE = eINSTANCE.getDiceSourceNode();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_SOURCE_NODE__STORE = eINSTANCE.getDiceSourceNode_Store();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_SOURCE_NODE__PROVIDES = eINSTANCE.getDiceSourceNode_Provides();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_SOURCE_NODE__SOURCE_TYPE = eINSTANCE.getDiceSourceNode_SourceType();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_SOURCE_NODE__RATE = eINSTANCE.getDiceSourceNode_Rate();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DiceStorageResourceImpl <em>Dice Storage Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DiceStorageResourceImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceStorageResource()
		 * @generated
		 */
		EClass DICE_STORAGE_RESOURCE = eINSTANCE.getDiceStorageResource();

		/**
		 * The meta object literal for the '<em><b>Responds To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_STORAGE_RESOURCE__RESPONDS_TO = eINSTANCE.getDiceStorageResource_RespondsTo();

		/**
		 * The meta object literal for the '<em><b>Crud Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_STORAGE_RESOURCE__CRUD_RATE = eINSTANCE.getDiceStorageResource_CrudRate();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DiceChannelImpl <em>Dice Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DiceChannelImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDiceChannel()
		 * @generated
		 */
		EClass DICE_CHANNEL = eINSTANCE.getDiceChannel();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_CHANNEL__RATE = eINSTANCE.getDiceChannel_Rate();

		/**
		 * The meta object literal for the '<em><b>Message Broker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DICE_CHANNEL__MESSAGE_BROKER = eINSTANCE.getDiceChannel_MessageBroker();

		/**
		 * The meta object literal for the '<em><b>Channel Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DICE_CHANNEL__CHANNEL_DESCRIPTION = eINSTANCE.getDiceChannel_ChannelDescription();

	}

} //DPIMPackage
