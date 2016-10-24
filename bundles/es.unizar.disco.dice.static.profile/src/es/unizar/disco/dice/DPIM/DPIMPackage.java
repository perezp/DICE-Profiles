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
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DpimComputationNodeImpl <em>Dpim Computation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DpimComputationNodeImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimComputationNode()
	 * @generated
	 */
	int DPIM_COMPUTATION_NODE = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__RES_MULT = CorePackage.DA_COMPONENT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__IS_PROTECTED = CorePackage.DA_COMPONENT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__IS_ACTIVE = CorePackage.DA_COMPONENT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__BASE_PROPERTY = CorePackage.DA_COMPONENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__BASE_INSTANCE_SPECIFICATION = CorePackage.DA_COMPONENT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__BASE_CLASSIFIER = CorePackage.DA_COMPONENT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__BASE_LIFELINE = CorePackage.DA_COMPONENT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__BASE_CONNECTABLE_ELEMENT = CorePackage.DA_COMPONENT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__STATEFUL = CorePackage.DA_COMPONENT__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__ORIGIN = CorePackage.DA_COMPONENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__FAILURE_COVERAGE = CorePackage.DA_COMPONENT__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__PERC_PERM_FAULT = CorePackage.DA_COMPONENT__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__SS_AVAIL = CorePackage.DA_COMPONENT__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__UNRELIABILITY = CorePackage.DA_COMPONENT__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__RELIABILITY = CorePackage.DA_COMPONENT__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__MISSION_TIME = CorePackage.DA_COMPONENT__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__AVAIL_LEVEL = CorePackage.DA_COMPONENT__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__RELIABILITY_LEVEL = CorePackage.DA_COMPONENT__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__SAFETY_LEVEL = CorePackage.DA_COMPONENT__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__COMPLEXITY = CorePackage.DA_COMPONENT__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__FAULT = CorePackage.DA_COMPONENT__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__ERROR = CorePackage.DA_COMPONENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__FAILURE = CorePackage.DA_COMPONENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__HAZARD = CorePackage.DA_COMPONENT__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__REPAIR = CorePackage.DA_COMPONENT__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__SUBSTITUTED_BY = CorePackage.DA_COMPONENT__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__NODE_THROUGHPUT = CorePackage.DA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__TYPE = CorePackage.DA_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__TARGET_TECH = CorePackage.DA_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE__PROC_TYPE = CorePackage.DA_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dpim Computation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_COMPUTATION_NODE_FEATURE_COUNT = CorePackage.DA_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DpimFilterNodeImpl <em>Dpim Filter Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DpimFilterNodeImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimFilterNode()
	 * @generated
	 */
	int DPIM_FILTER_NODE = 1;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__RES_MULT = DPIM_COMPUTATION_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__IS_PROTECTED = DPIM_COMPUTATION_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__IS_ACTIVE = DPIM_COMPUTATION_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__BASE_PROPERTY = DPIM_COMPUTATION_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__BASE_INSTANCE_SPECIFICATION = DPIM_COMPUTATION_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__BASE_CLASSIFIER = DPIM_COMPUTATION_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__BASE_LIFELINE = DPIM_COMPUTATION_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__BASE_CONNECTABLE_ELEMENT = DPIM_COMPUTATION_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__STATEFUL = DPIM_COMPUTATION_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__ORIGIN = DPIM_COMPUTATION_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__FAILURE_COVERAGE = DPIM_COMPUTATION_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__PERC_PERM_FAULT = DPIM_COMPUTATION_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__SS_AVAIL = DPIM_COMPUTATION_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__UNRELIABILITY = DPIM_COMPUTATION_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__RELIABILITY = DPIM_COMPUTATION_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__MISSION_TIME = DPIM_COMPUTATION_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__AVAIL_LEVEL = DPIM_COMPUTATION_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__RELIABILITY_LEVEL = DPIM_COMPUTATION_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__SAFETY_LEVEL = DPIM_COMPUTATION_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__COMPLEXITY = DPIM_COMPUTATION_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__FAULT = DPIM_COMPUTATION_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__ERROR = DPIM_COMPUTATION_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__FAILURE = DPIM_COMPUTATION_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__HAZARD = DPIM_COMPUTATION_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__REPAIR = DPIM_COMPUTATION_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__SUBSTITUTED_BY = DPIM_COMPUTATION_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__NODE_THROUGHPUT = DPIM_COMPUTATION_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__TYPE = DPIM_COMPUTATION_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__TARGET_TECH = DPIM_COMPUTATION_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__PROC_TYPE = DPIM_COMPUTATION_NODE__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Input Ratio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__INPUT_RATIO = DPIM_COMPUTATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Output Ration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE__OUTPUT_RATION = DPIM_COMPUTATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dpim Filter Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_FILTER_NODE_FEATURE_COUNT = DPIM_COMPUTATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DpimVisualizationNodeImpl <em>Dpim Visualization Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DpimVisualizationNodeImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimVisualizationNode()
	 * @generated
	 */
	int DPIM_VISUALIZATION_NODE = 2;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__RES_MULT = DPIM_COMPUTATION_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__IS_PROTECTED = DPIM_COMPUTATION_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__IS_ACTIVE = DPIM_COMPUTATION_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__BASE_PROPERTY = DPIM_COMPUTATION_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__BASE_INSTANCE_SPECIFICATION = DPIM_COMPUTATION_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__BASE_CLASSIFIER = DPIM_COMPUTATION_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__BASE_LIFELINE = DPIM_COMPUTATION_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__BASE_CONNECTABLE_ELEMENT = DPIM_COMPUTATION_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__STATEFUL = DPIM_COMPUTATION_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__ORIGIN = DPIM_COMPUTATION_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__FAILURE_COVERAGE = DPIM_COMPUTATION_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__PERC_PERM_FAULT = DPIM_COMPUTATION_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__SS_AVAIL = DPIM_COMPUTATION_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__UNRELIABILITY = DPIM_COMPUTATION_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__RELIABILITY = DPIM_COMPUTATION_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__MISSION_TIME = DPIM_COMPUTATION_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__AVAIL_LEVEL = DPIM_COMPUTATION_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__RELIABILITY_LEVEL = DPIM_COMPUTATION_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__SAFETY_LEVEL = DPIM_COMPUTATION_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__COMPLEXITY = DPIM_COMPUTATION_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__FAULT = DPIM_COMPUTATION_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__ERROR = DPIM_COMPUTATION_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__FAILURE = DPIM_COMPUTATION_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__HAZARD = DPIM_COMPUTATION_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__REPAIR = DPIM_COMPUTATION_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__SUBSTITUTED_BY = DPIM_COMPUTATION_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__NODE_THROUGHPUT = DPIM_COMPUTATION_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__TYPE = DPIM_COMPUTATION_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__TARGET_TECH = DPIM_COMPUTATION_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE__PROC_TYPE = DPIM_COMPUTATION_NODE__PROC_TYPE;

	/**
	 * The number of structural features of the '<em>Dpim Visualization Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_VISUALIZATION_NODE_FEATURE_COUNT = DPIM_COMPUTATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DpimSourceNodeImpl <em>Dpim Source Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DpimSourceNodeImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimSourceNode()
	 * @generated
	 */
	int DPIM_SOURCE_NODE = 3;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__RES_MULT = DPIM_COMPUTATION_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__IS_PROTECTED = DPIM_COMPUTATION_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__IS_ACTIVE = DPIM_COMPUTATION_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__BASE_PROPERTY = DPIM_COMPUTATION_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__BASE_INSTANCE_SPECIFICATION = DPIM_COMPUTATION_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__BASE_CLASSIFIER = DPIM_COMPUTATION_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__BASE_LIFELINE = DPIM_COMPUTATION_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__BASE_CONNECTABLE_ELEMENT = DPIM_COMPUTATION_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__STATEFUL = DPIM_COMPUTATION_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__ORIGIN = DPIM_COMPUTATION_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__FAILURE_COVERAGE = DPIM_COMPUTATION_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__PERC_PERM_FAULT = DPIM_COMPUTATION_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__SS_AVAIL = DPIM_COMPUTATION_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__UNRELIABILITY = DPIM_COMPUTATION_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__RELIABILITY = DPIM_COMPUTATION_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__MISSION_TIME = DPIM_COMPUTATION_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__AVAIL_LEVEL = DPIM_COMPUTATION_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__RELIABILITY_LEVEL = DPIM_COMPUTATION_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__SAFETY_LEVEL = DPIM_COMPUTATION_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__COMPLEXITY = DPIM_COMPUTATION_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__FAULT = DPIM_COMPUTATION_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__ERROR = DPIM_COMPUTATION_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__FAILURE = DPIM_COMPUTATION_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__HAZARD = DPIM_COMPUTATION_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__REPAIR = DPIM_COMPUTATION_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__SUBSTITUTED_BY = DPIM_COMPUTATION_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__NODE_THROUGHPUT = DPIM_COMPUTATION_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__TYPE = DPIM_COMPUTATION_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__TARGET_TECH = DPIM_COMPUTATION_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__PROC_TYPE = DPIM_COMPUTATION_NODE__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__STORE = DPIM_COMPUTATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__PROVIDES = DPIM_COMPUTATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__SOURCE_TYPE = DPIM_COMPUTATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE__RATE = DPIM_COMPUTATION_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dpim Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SOURCE_NODE_FEATURE_COUNT = DPIM_COMPUTATION_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DpimStorageNodeImpl <em>Dpim Storage Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DpimStorageNodeImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimStorageNode()
	 * @generated
	 */
	int DPIM_STORAGE_NODE = 4;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__RES_MULT = GRMPackage.STORAGE_RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__IS_PROTECTED = GRMPackage.STORAGE_RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__IS_ACTIVE = GRMPackage.STORAGE_RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__BASE_PROPERTY = GRMPackage.STORAGE_RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__BASE_INSTANCE_SPECIFICATION = GRMPackage.STORAGE_RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__BASE_CLASSIFIER = GRMPackage.STORAGE_RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__BASE_LIFELINE = GRMPackage.STORAGE_RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__BASE_CONNECTABLE_ELEMENT = GRMPackage.STORAGE_RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__ELEMENT_SIZE = GRMPackage.STORAGE_RESOURCE__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Responds To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__RESPONDS_TO = GRMPackage.STORAGE_RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Crud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE__CRUD_RATE = GRMPackage.STORAGE_RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dpim Storage Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_STORAGE_NODE_FEATURE_COUNT = GRMPackage.STORAGE_RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DpimChannelImpl <em>Dpim Channel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DpimChannelImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimChannel()
	 * @generated
	 */
	int DPIM_CHANNEL = 5;

	/**
	 * The feature id for the '<em><b>Coupling</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__COUPLING = CorePackage.DA_CONNECTOR__COUPLING;

	/**
	 * The feature id for the '<em><b>Error Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__ERROR_PROP = CorePackage.DA_CONNECTOR__ERROR_PROP;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__FAILURE = CorePackage.DA_CONNECTOR__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__HAZARD = CorePackage.DA_CONNECTOR__HAZARD;

	/**
	 * The feature id for the '<em><b>Base Invocation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__BASE_INVOCATION_ACTION = CorePackage.DA_CONNECTOR__BASE_INVOCATION_ACTION;

	/**
	 * The feature id for the '<em><b>Base Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__BASE_EXTEND = CorePackage.DA_CONNECTOR__BASE_EXTEND;

	/**
	 * The feature id for the '<em><b>Base Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__BASE_INCLUDE = CorePackage.DA_CONNECTOR__BASE_INCLUDE;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__BASE_MESSAGE = CorePackage.DA_CONNECTOR__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__BASE_CONNECTOR = CorePackage.DA_CONNECTOR__BASE_CONNECTOR;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__BASE_DEPENDENCY = CorePackage.DA_CONNECTOR__BASE_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__BASE_ASSOCIATION = CorePackage.DA_CONNECTOR__BASE_ASSOCIATION;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__RATE = CorePackage.DA_CONNECTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Message Broker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__MESSAGE_BROKER = CorePackage.DA_CONNECTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Channel Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL__CHANNEL_DESCRIPTION = CorePackage.DA_CONNECTOR_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dpim Channel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_CHANNEL_FEATURE_COUNT = CorePackage.DA_CONNECTOR_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DPIM.impl.DpimScenarioImpl <em>Dpim Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DPIM.impl.DpimScenarioImpl
	 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimScenario()
	 * @generated
	 */
	int DPIM_SCENARIO = 6;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__EXEC_TIME = CorePackage.DA_SERVICE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__ALLOCATED_MEMORY = CorePackage.DA_SERVICE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__USED_MEMORY = CorePackage.DA_SERVICE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__POWER_PEAK = CorePackage.DA_SERVICE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__ENERGY = CorePackage.DA_SERVICE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__BASE_NAMED_ELEMENT = CorePackage.DA_SERVICE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__SUB_USAGE = CorePackage.DA_SERVICE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__USED_RESOURCES = CorePackage.DA_SERVICE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__MSG_SIZE = CorePackage.DA_SERVICE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__ON = CorePackage.DA_SERVICE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__BASE_ACTION = CorePackage.DA_SERVICE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__BASE_BEHAVIOR = CorePackage.DA_SERVICE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__BASE_MESSAGE = CorePackage.DA_SERVICE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__DURATION = CorePackage.DA_SERVICE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__START = CorePackage.DA_SERVICE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__FINISH = CorePackage.DA_SERVICE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__CAUSE = CorePackage.DA_SERVICE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__HOST_DEMAND = CorePackage.DA_SERVICE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__HOST_DEMAND_OPS = CorePackage.DA_SERVICE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__INTER_OCC_T = CorePackage.DA_SERVICE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__THROUGHPUT = CorePackage.DA_SERVICE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__RESP_T = CorePackage.DA_SERVICE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__UTILIZATION = CorePackage.DA_SERVICE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__UTILIZATION_ON_HOST = CorePackage.DA_SERVICE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__ROOT = CorePackage.DA_SERVICE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__STEPS = CorePackage.DA_SERVICE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__PARENT_STEP = CorePackage.DA_SERVICE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__TIMING = CorePackage.DA_SERVICE__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__EXEC_PROB = CorePackage.DA_SERVICE__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__SS_AVAIL = CorePackage.DA_SERVICE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__INST_AVAIL = CorePackage.DA_SERVICE__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__UNRELIABILITY = CorePackage.DA_SERVICE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__RELIABILITY = CorePackage.DA_SERVICE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__MISSION_TIME = CorePackage.DA_SERVICE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__AVAIL_LEVEL = CorePackage.DA_SERVICE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__RELIAB_LEVEL = CorePackage.DA_SERVICE__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__SAFETY_LEVEL = CorePackage.DA_SERVICE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__COMPLEXITY = CorePackage.DA_SERVICE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__FAILURE = CorePackage.DA_SERVICE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__HAZARD = CorePackage.DA_SERVICE__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__RECOVERY = CorePackage.DA_SERVICE__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__CONF_LEVEL = CorePackage.DA_SERVICE__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO__INTEG_LEVEL = CorePackage.DA_SERVICE__INTEG_LEVEL;

	/**
	 * The number of structural features of the '<em>Dpim Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DPIM_SCENARIO_FEATURE_COUNT = CorePackage.DA_SERVICE_FEATURE_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DpimComputationNode <em>Dpim Computation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dpim Computation Node</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimComputationNode
	 * @generated
	 */
	EClass getDpimComputationNode();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getNodeThroughput <em>Node Throughput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Node Throughput</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimComputationNode#getNodeThroughput()
	 * @see #getDpimComputationNode()
	 * @generated
	 */
	EAttribute getDpimComputationNode_NodeThroughput();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimComputationNode#getType()
	 * @see #getDpimComputationNode()
	 * @generated
	 */
	EAttribute getDpimComputationNode_Type();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getTargetTech <em>Target Tech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Tech</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimComputationNode#getTargetTech()
	 * @see #getDpimComputationNode()
	 * @generated
	 */
	EAttribute getDpimComputationNode_TargetTech();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimComputationNode#getProcType <em>Proc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proc Type</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimComputationNode#getProcType()
	 * @see #getDpimComputationNode()
	 * @generated
	 */
	EAttribute getDpimComputationNode_ProcType();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DpimFilterNode <em>Dpim Filter Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dpim Filter Node</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimFilterNode
	 * @generated
	 */
	EClass getDpimFilterNode();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimFilterNode#getInputRatio <em>Input Ratio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Ratio</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimFilterNode#getInputRatio()
	 * @see #getDpimFilterNode()
	 * @generated
	 */
	EAttribute getDpimFilterNode_InputRatio();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimFilterNode#getOutputRation <em>Output Ration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output Ration</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimFilterNode#getOutputRation()
	 * @see #getDpimFilterNode()
	 * @generated
	 */
	EAttribute getDpimFilterNode_OutputRation();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DpimVisualizationNode <em>Dpim Visualization Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dpim Visualization Node</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimVisualizationNode
	 * @generated
	 */
	EClass getDpimVisualizationNode();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DpimSourceNode <em>Dpim Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dpim Source Node</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimSourceNode
	 * @generated
	 */
	EClass getDpimSourceNode();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getStore <em>Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Store</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimSourceNode#getStore()
	 * @see #getDpimSourceNode()
	 * @generated
	 */
	EReference getDpimSourceNode_Store();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getProvides <em>Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Provides</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimSourceNode#getProvides()
	 * @see #getDpimSourceNode()
	 * @generated
	 */
	EReference getDpimSourceNode_Provides();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getSourceType <em>Source Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Type</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimSourceNode#getSourceType()
	 * @see #getDpimSourceNode()
	 * @generated
	 */
	EAttribute getDpimSourceNode_SourceType();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimSourceNode#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimSourceNode#getRate()
	 * @see #getDpimSourceNode()
	 * @generated
	 */
	EAttribute getDpimSourceNode_Rate();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DpimStorageNode <em>Dpim Storage Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dpim Storage Node</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimStorageNode
	 * @generated
	 */
	EClass getDpimStorageNode();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.DPIM.DpimStorageNode#getRespondsTo <em>Responds To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Responds To</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimStorageNode#getRespondsTo()
	 * @see #getDpimStorageNode()
	 * @generated
	 */
	EReference getDpimStorageNode_RespondsTo();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimStorageNode#getCrudRate <em>Crud Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Crud Rate</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimStorageNode#getCrudRate()
	 * @see #getDpimStorageNode()
	 * @generated
	 */
	EAttribute getDpimStorageNode_CrudRate();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DpimChannel <em>Dpim Channel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dpim Channel</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimChannel
	 * @generated
	 */
	EClass getDpimChannel();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimChannel#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimChannel#getRate()
	 * @see #getDpimChannel()
	 * @generated
	 */
	EAttribute getDpimChannel_Rate();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DPIM.DpimChannel#getMessageBroker <em>Message Broker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message Broker</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimChannel#getMessageBroker()
	 * @see #getDpimChannel()
	 * @generated
	 */
	EAttribute getDpimChannel_MessageBroker();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.DPIM.DpimChannel#getChannelDescription <em>Channel Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Channel Description</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimChannel#getChannelDescription()
	 * @see #getDpimChannel()
	 * @generated
	 */
	EReference getDpimChannel_ChannelDescription();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DPIM.DpimScenario <em>Dpim Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dpim Scenario</em>'.
	 * @see es.unizar.disco.dice.DPIM.DpimScenario
	 * @generated
	 */
	EClass getDpimScenario();

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
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DpimComputationNodeImpl <em>Dpim Computation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DpimComputationNodeImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimComputationNode()
		 * @generated
		 */
		EClass DPIM_COMPUTATION_NODE = eINSTANCE.getDpimComputationNode();

		/**
		 * The meta object literal for the '<em><b>Node Throughput</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_COMPUTATION_NODE__NODE_THROUGHPUT = eINSTANCE.getDpimComputationNode_NodeThroughput();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_COMPUTATION_NODE__TYPE = eINSTANCE.getDpimComputationNode_Type();

		/**
		 * The meta object literal for the '<em><b>Target Tech</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_COMPUTATION_NODE__TARGET_TECH = eINSTANCE.getDpimComputationNode_TargetTech();

		/**
		 * The meta object literal for the '<em><b>Proc Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_COMPUTATION_NODE__PROC_TYPE = eINSTANCE.getDpimComputationNode_ProcType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DpimFilterNodeImpl <em>Dpim Filter Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DpimFilterNodeImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimFilterNode()
		 * @generated
		 */
		EClass DPIM_FILTER_NODE = eINSTANCE.getDpimFilterNode();

		/**
		 * The meta object literal for the '<em><b>Input Ratio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_FILTER_NODE__INPUT_RATIO = eINSTANCE.getDpimFilterNode_InputRatio();

		/**
		 * The meta object literal for the '<em><b>Output Ration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_FILTER_NODE__OUTPUT_RATION = eINSTANCE.getDpimFilterNode_OutputRation();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DpimVisualizationNodeImpl <em>Dpim Visualization Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DpimVisualizationNodeImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimVisualizationNode()
		 * @generated
		 */
		EClass DPIM_VISUALIZATION_NODE = eINSTANCE.getDpimVisualizationNode();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DpimSourceNodeImpl <em>Dpim Source Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DpimSourceNodeImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimSourceNode()
		 * @generated
		 */
		EClass DPIM_SOURCE_NODE = eINSTANCE.getDpimSourceNode();

		/**
		 * The meta object literal for the '<em><b>Store</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPIM_SOURCE_NODE__STORE = eINSTANCE.getDpimSourceNode_Store();

		/**
		 * The meta object literal for the '<em><b>Provides</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPIM_SOURCE_NODE__PROVIDES = eINSTANCE.getDpimSourceNode_Provides();

		/**
		 * The meta object literal for the '<em><b>Source Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_SOURCE_NODE__SOURCE_TYPE = eINSTANCE.getDpimSourceNode_SourceType();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_SOURCE_NODE__RATE = eINSTANCE.getDpimSourceNode_Rate();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DpimStorageNodeImpl <em>Dpim Storage Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DpimStorageNodeImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimStorageNode()
		 * @generated
		 */
		EClass DPIM_STORAGE_NODE = eINSTANCE.getDpimStorageNode();

		/**
		 * The meta object literal for the '<em><b>Responds To</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPIM_STORAGE_NODE__RESPONDS_TO = eINSTANCE.getDpimStorageNode_RespondsTo();

		/**
		 * The meta object literal for the '<em><b>Crud Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_STORAGE_NODE__CRUD_RATE = eINSTANCE.getDpimStorageNode_CrudRate();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DpimChannelImpl <em>Dpim Channel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DpimChannelImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimChannel()
		 * @generated
		 */
		EClass DPIM_CHANNEL = eINSTANCE.getDpimChannel();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_CHANNEL__RATE = eINSTANCE.getDpimChannel_Rate();

		/**
		 * The meta object literal for the '<em><b>Message Broker</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DPIM_CHANNEL__MESSAGE_BROKER = eINSTANCE.getDpimChannel_MessageBroker();

		/**
		 * The meta object literal for the '<em><b>Channel Description</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DPIM_CHANNEL__CHANNEL_DESCRIPTION = eINSTANCE.getDpimChannel_ChannelDescription();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DPIM.impl.DpimScenarioImpl <em>Dpim Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DPIM.impl.DpimScenarioImpl
		 * @see es.unizar.disco.dice.DPIM.impl.DPIMPackageImpl#getDpimScenario()
		 * @generated
		 */
		EClass DPIM_SCENARIO = eINSTANCE.getDpimScenario();

	}

} //DPIMPackage
