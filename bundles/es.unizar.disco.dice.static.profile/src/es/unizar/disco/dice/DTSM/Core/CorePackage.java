/**
 */
package es.unizar.disco.dice.DTSM.Core;

import es.unizar.disco.dice.DPIM.DPIMPackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.DTSM.Core.CoreFactory
 * @model kind="package"
 * @generated
 */
public interface CorePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Core";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/profiles/DTSM/Core/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Core";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CorePackage eINSTANCE = es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl <em>Computation Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreComputationNode()
	 * @generated
	 */
	int CORE_COMPUTATION_NODE = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__RES_MULT = DPIMPackage.DPIM_COMPUTATION_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__IS_PROTECTED = DPIMPackage.DPIM_COMPUTATION_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__IS_ACTIVE = DPIMPackage.DPIM_COMPUTATION_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__BASE_PROPERTY = DPIMPackage.DPIM_COMPUTATION_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__BASE_INSTANCE_SPECIFICATION = DPIMPackage.DPIM_COMPUTATION_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__BASE_CLASSIFIER = DPIMPackage.DPIM_COMPUTATION_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__BASE_LIFELINE = DPIMPackage.DPIM_COMPUTATION_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__BASE_CONNECTABLE_ELEMENT = DPIMPackage.DPIM_COMPUTATION_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__STATEFUL = DPIMPackage.DPIM_COMPUTATION_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__ORIGIN = DPIMPackage.DPIM_COMPUTATION_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__FAILURE_COVERAGE = DPIMPackage.DPIM_COMPUTATION_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__PERC_PERM_FAULT = DPIMPackage.DPIM_COMPUTATION_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__SS_AVAIL = DPIMPackage.DPIM_COMPUTATION_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__UNRELIABILITY = DPIMPackage.DPIM_COMPUTATION_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__RELIABILITY = DPIMPackage.DPIM_COMPUTATION_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__MISSION_TIME = DPIMPackage.DPIM_COMPUTATION_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__AVAIL_LEVEL = DPIMPackage.DPIM_COMPUTATION_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__RELIABILITY_LEVEL = DPIMPackage.DPIM_COMPUTATION_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__SAFETY_LEVEL = DPIMPackage.DPIM_COMPUTATION_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__COMPLEXITY = DPIMPackage.DPIM_COMPUTATION_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__FAULT = DPIMPackage.DPIM_COMPUTATION_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__ERROR = DPIMPackage.DPIM_COMPUTATION_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__FAILURE = DPIMPackage.DPIM_COMPUTATION_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__HAZARD = DPIMPackage.DPIM_COMPUTATION_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__REPAIR = DPIMPackage.DPIM_COMPUTATION_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__SUBSTITUTED_BY = DPIMPackage.DPIM_COMPUTATION_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__NODE_THROUGHPUT = DPIMPackage.DPIM_COMPUTATION_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__TYPE = DPIMPackage.DPIM_COMPUTATION_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__TARGET_TECH = DPIMPackage.DPIM_COMPUTATION_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__PROC_TYPE = DPIMPackage.DPIM_COMPUTATION_NODE__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Has Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__HAS_SUCCESSOR = DPIMPackage.DPIM_COMPUTATION_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Process Input Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__PROCESS_INPUT_DATA = DPIMPackage.DPIM_COMPUTATION_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Realise</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__REALISE = DPIMPackage.DPIM_COMPUTATION_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Produce Output Data</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA = DPIMPackage.DPIM_COMPUTATION_NODE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Computation Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_COMPUTATION_NODE_FEATURE_COUNT = DPIMPackage.DPIM_COMPUTATION_NODE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreDataImpl
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreData()
	 * @generated
	 */
	int CORE_DATA = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA__LOCATION = 0;

	/**
	 * The feature id for the '<em><b>Has Specification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA__HAS_SPECIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Has Volume</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA__HAS_VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA__BASE_CLASS = 3;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreDataSourceImpl <em>Data Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreDataSourceImpl
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreDataSource()
	 * @generated
	 */
	int CORE_DATA_SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__RES_MULT = DPIMPackage.DPIM_STORAGE_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__IS_PROTECTED = DPIMPackage.DPIM_STORAGE_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__IS_ACTIVE = DPIMPackage.DPIM_STORAGE_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__BASE_PROPERTY = DPIMPackage.DPIM_STORAGE_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__BASE_INSTANCE_SPECIFICATION = DPIMPackage.DPIM_STORAGE_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__BASE_CLASSIFIER = DPIMPackage.DPIM_STORAGE_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__BASE_LIFELINE = DPIMPackage.DPIM_STORAGE_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__BASE_CONNECTABLE_ELEMENT = DPIMPackage.DPIM_STORAGE_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__ELEMENT_SIZE = DPIMPackage.DPIM_STORAGE_NODE__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Responds To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__RESPONDS_TO = DPIMPackage.DPIM_STORAGE_NODE__RESPONDS_TO;

	/**
	 * The feature id for the '<em><b>Crud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE__CRUD_RATE = DPIMPackage.DPIM_STORAGE_NODE__CRUD_RATE;

	/**
	 * The number of structural features of the '<em>Data Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DATA_SOURCE_FEATURE_COUNT = DPIMPackage.DPIM_STORAGE_NODE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreDirectAcyclicGraphImpl <em>Direct Acyclic Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreDirectAcyclicGraphImpl
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreDirectAcyclicGraph()
	 * @generated
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__EXEC_TIME = com.masdes.dam.Core.CorePackage.DA_SERVICE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__ALLOCATED_MEMORY = com.masdes.dam.Core.CorePackage.DA_SERVICE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__USED_MEMORY = com.masdes.dam.Core.CorePackage.DA_SERVICE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__POWER_PEAK = com.masdes.dam.Core.CorePackage.DA_SERVICE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__ENERGY = com.masdes.dam.Core.CorePackage.DA_SERVICE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__BASE_NAMED_ELEMENT = com.masdes.dam.Core.CorePackage.DA_SERVICE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__SUB_USAGE = com.masdes.dam.Core.CorePackage.DA_SERVICE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__USED_RESOURCES = com.masdes.dam.Core.CorePackage.DA_SERVICE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__MSG_SIZE = com.masdes.dam.Core.CorePackage.DA_SERVICE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__ON = com.masdes.dam.Core.CorePackage.DA_SERVICE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__BASE_ACTION = com.masdes.dam.Core.CorePackage.DA_SERVICE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__BASE_BEHAVIOR = com.masdes.dam.Core.CorePackage.DA_SERVICE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__BASE_MESSAGE = com.masdes.dam.Core.CorePackage.DA_SERVICE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__DURATION = com.masdes.dam.Core.CorePackage.DA_SERVICE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__START = com.masdes.dam.Core.CorePackage.DA_SERVICE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__FINISH = com.masdes.dam.Core.CorePackage.DA_SERVICE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__CAUSE = com.masdes.dam.Core.CorePackage.DA_SERVICE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__HOST_DEMAND = com.masdes.dam.Core.CorePackage.DA_SERVICE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__HOST_DEMAND_OPS = com.masdes.dam.Core.CorePackage.DA_SERVICE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__INTER_OCC_T = com.masdes.dam.Core.CorePackage.DA_SERVICE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__THROUGHPUT = com.masdes.dam.Core.CorePackage.DA_SERVICE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__RESP_T = com.masdes.dam.Core.CorePackage.DA_SERVICE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__UTILIZATION = com.masdes.dam.Core.CorePackage.DA_SERVICE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__UTILIZATION_ON_HOST = com.masdes.dam.Core.CorePackage.DA_SERVICE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__ROOT = com.masdes.dam.Core.CorePackage.DA_SERVICE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__STEPS = com.masdes.dam.Core.CorePackage.DA_SERVICE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__PARENT_STEP = com.masdes.dam.Core.CorePackage.DA_SERVICE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__TIMING = com.masdes.dam.Core.CorePackage.DA_SERVICE__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__EXEC_PROB = com.masdes.dam.Core.CorePackage.DA_SERVICE__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__SS_AVAIL = com.masdes.dam.Core.CorePackage.DA_SERVICE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__INST_AVAIL = com.masdes.dam.Core.CorePackage.DA_SERVICE__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__UNRELIABILITY = com.masdes.dam.Core.CorePackage.DA_SERVICE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__RELIABILITY = com.masdes.dam.Core.CorePackage.DA_SERVICE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__MISSION_TIME = com.masdes.dam.Core.CorePackage.DA_SERVICE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__AVAIL_LEVEL = com.masdes.dam.Core.CorePackage.DA_SERVICE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__RELIAB_LEVEL = com.masdes.dam.Core.CorePackage.DA_SERVICE__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__SAFETY_LEVEL = com.masdes.dam.Core.CorePackage.DA_SERVICE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__COMPLEXITY = com.masdes.dam.Core.CorePackage.DA_SERVICE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__FAILURE = com.masdes.dam.Core.CorePackage.DA_SERVICE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__HAZARD = com.masdes.dam.Core.CorePackage.DA_SERVICE__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__RECOVERY = com.masdes.dam.Core.CorePackage.DA_SERVICE__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__CONF_LEVEL = com.masdes.dam.Core.CorePackage.DA_SERVICE__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__INTEG_LEVEL = com.masdes.dam.Core.CorePackage.DA_SERVICE__INTEG_LEVEL;

	/**
	 * The feature id for the '<em><b>Has Source Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__HAS_SOURCE_NODE = com.masdes.dam.Core.CorePackage.DA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH__BASE_CLASS = com.masdes.dam.Core.CorePackage.DA_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Direct Acyclic Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT = com.masdes.dam.Core.CorePackage.DA_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreDAGNodeImpl <em>DAG Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreDAGNodeImpl
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreDAGNode()
	 * @generated
	 */
	int CORE_DAG_NODE = 5;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__EXEC_TIME = GQAMPackage.GA_STEP__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__ALLOCATED_MEMORY = GQAMPackage.GA_STEP__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__USED_MEMORY = GQAMPackage.GA_STEP__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__POWER_PEAK = GQAMPackage.GA_STEP__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__ENERGY = GQAMPackage.GA_STEP__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__BASE_NAMED_ELEMENT = GQAMPackage.GA_STEP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__SUB_USAGE = GQAMPackage.GA_STEP__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__USED_RESOURCES = GQAMPackage.GA_STEP__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__MSG_SIZE = GQAMPackage.GA_STEP__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__ON = GQAMPackage.GA_STEP__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__BASE_ACTION = GQAMPackage.GA_STEP__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__BASE_BEHAVIOR = GQAMPackage.GA_STEP__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__BASE_MESSAGE = GQAMPackage.GA_STEP__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__DURATION = GQAMPackage.GA_STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__START = GQAMPackage.GA_STEP__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__FINISH = GQAMPackage.GA_STEP__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__CAUSE = GQAMPackage.GA_STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__HOST_DEMAND = GQAMPackage.GA_STEP__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__HOST_DEMAND_OPS = GQAMPackage.GA_STEP__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__INTER_OCC_T = GQAMPackage.GA_STEP__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__THROUGHPUT = GQAMPackage.GA_STEP__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__RESP_T = GQAMPackage.GA_STEP__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__UTILIZATION = GQAMPackage.GA_STEP__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__UTILIZATION_ON_HOST = GQAMPackage.GA_STEP__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__ROOT = GQAMPackage.GA_STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__STEPS = GQAMPackage.GA_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__PARENT_STEP = GQAMPackage.GA_STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__TIMING = GQAMPackage.GA_STEP__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__IS_ATOMIC = GQAMPackage.GA_STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__BLOCK_T = GQAMPackage.GA_STEP__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__REP = GQAMPackage.GA_STEP__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__PROB = GQAMPackage.GA_STEP__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__PRIORITY = GQAMPackage.GA_STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__CONCUR_RES = GQAMPackage.GA_STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__HOST = GQAMPackage.GA_STEP__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__SERV_DEMAND = GQAMPackage.GA_STEP__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__SERV_COUNT = GQAMPackage.GA_STEP__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__SELF_DELAY = GQAMPackage.GA_STEP__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__SCENARIO = GQAMPackage.GA_STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__CHILD_SCENARIO = GQAMPackage.GA_STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__RES_MULT = GQAMPackage.GA_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__IS_PROTECTED = GQAMPackage.GA_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__IS_ACTIVE = GQAMPackage.GA_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__BASE_PROPERTY = GQAMPackage.GA_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION = GQAMPackage.GA_STEP_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__BASE_CLASSIFIER = GQAMPackage.GA_STEP_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__BASE_LIFELINE = GQAMPackage.GA_STEP_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT = GQAMPackage.GA_STEP_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__STATEFUL = GQAMPackage.GA_STEP_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__ORIGIN = GQAMPackage.GA_STEP_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__FAILURE_COVERAGE = GQAMPackage.GA_STEP_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__PERC_PERM_FAULT = GQAMPackage.GA_STEP_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__SS_AVAIL = GQAMPackage.GA_STEP_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__UNRELIABILITY = GQAMPackage.GA_STEP_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__RELIABILITY = GQAMPackage.GA_STEP_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__MISSION_TIME = GQAMPackage.GA_STEP_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__AVAIL_LEVEL = GQAMPackage.GA_STEP_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__RELIABILITY_LEVEL = GQAMPackage.GA_STEP_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__SAFETY_LEVEL = GQAMPackage.GA_STEP_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__COMPLEXITY = GQAMPackage.GA_STEP_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__FAULT = GQAMPackage.GA_STEP_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__ERROR = GQAMPackage.GA_STEP_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__FAILURE = GQAMPackage.GA_STEP_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__HAZARD = GQAMPackage.GA_STEP_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__REPAIR = GQAMPackage.GA_STEP_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__SUBSTITUTED_BY = GQAMPackage.GA_STEP_FEATURE_COUNT + 25;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__NODE_THROUGHPUT = GQAMPackage.GA_STEP_FEATURE_COUNT + 26;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__TYPE = GQAMPackage.GA_STEP_FEATURE_COUNT + 27;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__TARGET_TECH = GQAMPackage.GA_STEP_FEATURE_COUNT + 28;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__PROC_TYPE = GQAMPackage.GA_STEP_FEATURE_COUNT + 29;

	/**
	 * The feature id for the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__STORE = GQAMPackage.GA_STEP_FEATURE_COUNT + 30;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__PROVIDES = GQAMPackage.GA_STEP_FEATURE_COUNT + 31;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__SOURCE_TYPE = GQAMPackage.GA_STEP_FEATURE_COUNT + 32;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__RATE = GQAMPackage.GA_STEP_FEATURE_COUNT + 33;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__PARALLELISM = GQAMPackage.GA_STEP_FEATURE_COUNT + 34;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__OPERATION = GQAMPackage.GA_STEP_FEATURE_COUNT + 35;

	/**
	 * The feature id for the '<em><b>Has Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE__HAS_SUCCESSOR = GQAMPackage.GA_STEP_FEATURE_COUNT + 36;

	/**
	 * The number of structural features of the '<em>DAG Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_NODE_FEATURE_COUNT = GQAMPackage.GA_STEP_FEATURE_COUNT + 37;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreDAGSourceNodeImpl <em>DAG Source Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreDAGSourceNodeImpl
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreDAGSourceNode()
	 * @generated
	 */
	int CORE_DAG_SOURCE_NODE = 4;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__EXEC_TIME = CORE_DAG_NODE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__ALLOCATED_MEMORY = CORE_DAG_NODE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__USED_MEMORY = CORE_DAG_NODE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__POWER_PEAK = CORE_DAG_NODE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__ENERGY = CORE_DAG_NODE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__BASE_NAMED_ELEMENT = CORE_DAG_NODE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__SUB_USAGE = CORE_DAG_NODE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__USED_RESOURCES = CORE_DAG_NODE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__MSG_SIZE = CORE_DAG_NODE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__ON = CORE_DAG_NODE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__BASE_ACTION = CORE_DAG_NODE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__BASE_BEHAVIOR = CORE_DAG_NODE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__BASE_MESSAGE = CORE_DAG_NODE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__DURATION = CORE_DAG_NODE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__START = CORE_DAG_NODE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__FINISH = CORE_DAG_NODE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__CAUSE = CORE_DAG_NODE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__HOST_DEMAND = CORE_DAG_NODE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__HOST_DEMAND_OPS = CORE_DAG_NODE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__INTER_OCC_T = CORE_DAG_NODE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__THROUGHPUT = CORE_DAG_NODE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__RESP_T = CORE_DAG_NODE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__UTILIZATION = CORE_DAG_NODE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__UTILIZATION_ON_HOST = CORE_DAG_NODE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__ROOT = CORE_DAG_NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__STEPS = CORE_DAG_NODE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__PARENT_STEP = CORE_DAG_NODE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__TIMING = CORE_DAG_NODE__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__IS_ATOMIC = CORE_DAG_NODE__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__BLOCK_T = CORE_DAG_NODE__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__REP = CORE_DAG_NODE__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__PROB = CORE_DAG_NODE__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__PRIORITY = CORE_DAG_NODE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__CONCUR_RES = CORE_DAG_NODE__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__HOST = CORE_DAG_NODE__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__SERV_DEMAND = CORE_DAG_NODE__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__SERV_COUNT = CORE_DAG_NODE__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__SELF_DELAY = CORE_DAG_NODE__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__SCENARIO = CORE_DAG_NODE__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__CHILD_SCENARIO = CORE_DAG_NODE__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__RES_MULT = CORE_DAG_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__IS_PROTECTED = CORE_DAG_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__IS_ACTIVE = CORE_DAG_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__BASE_PROPERTY = CORE_DAG_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__BASE_INSTANCE_SPECIFICATION = CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__BASE_CLASSIFIER = CORE_DAG_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__BASE_LIFELINE = CORE_DAG_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__BASE_CONNECTABLE_ELEMENT = CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__STATEFUL = CORE_DAG_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__ORIGIN = CORE_DAG_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__FAILURE_COVERAGE = CORE_DAG_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__PERC_PERM_FAULT = CORE_DAG_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__SS_AVAIL = CORE_DAG_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__UNRELIABILITY = CORE_DAG_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__RELIABILITY = CORE_DAG_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__MISSION_TIME = CORE_DAG_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__AVAIL_LEVEL = CORE_DAG_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__RELIABILITY_LEVEL = CORE_DAG_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__SAFETY_LEVEL = CORE_DAG_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__COMPLEXITY = CORE_DAG_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__FAULT = CORE_DAG_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__ERROR = CORE_DAG_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__FAILURE = CORE_DAG_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__HAZARD = CORE_DAG_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__REPAIR = CORE_DAG_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__SUBSTITUTED_BY = CORE_DAG_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__NODE_THROUGHPUT = CORE_DAG_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__TYPE = CORE_DAG_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__TARGET_TECH = CORE_DAG_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__PROC_TYPE = CORE_DAG_NODE__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__STORE = CORE_DAG_NODE__STORE;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__PROVIDES = CORE_DAG_NODE__PROVIDES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__SOURCE_TYPE = CORE_DAG_NODE__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__RATE = CORE_DAG_NODE__RATE;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__PARALLELISM = CORE_DAG_NODE__PARALLELISM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__OPERATION = CORE_DAG_NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>Has Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__HAS_SUCCESSOR = CORE_DAG_NODE__HAS_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Read From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE__READ_FROM = CORE_DAG_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DAG Source Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_DAG_SOURCE_NODE_FEATURE_COUNT = CORE_DAG_NODE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreStorageNodeImpl <em>Storage Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreStorageNodeImpl
	 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreStorageNode()
	 * @generated
	 */
	int CORE_STORAGE_NODE = 6;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__RES_MULT = CORE_DATA_SOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__IS_PROTECTED = CORE_DATA_SOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__IS_ACTIVE = CORE_DATA_SOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__BASE_PROPERTY = CORE_DATA_SOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__BASE_INSTANCE_SPECIFICATION = CORE_DATA_SOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__BASE_CLASSIFIER = CORE_DATA_SOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__BASE_LIFELINE = CORE_DATA_SOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__BASE_CONNECTABLE_ELEMENT = CORE_DATA_SOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Element Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__ELEMENT_SIZE = CORE_DATA_SOURCE__ELEMENT_SIZE;

	/**
	 * The feature id for the '<em><b>Responds To</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__RESPONDS_TO = CORE_DATA_SOURCE__RESPONDS_TO;

	/**
	 * The feature id for the '<em><b>Crud Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__CRUD_RATE = CORE_DATA_SOURCE__CRUD_RATE;

	/**
	 * The feature id for the '<em><b>Database</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__DATABASE = CORE_DATA_SOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__USER = CORE_DATA_SOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE__PASSWORD = CORE_DATA_SOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Storage Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORE_STORAGE_NODE_FEATURE_COUNT = CORE_DATA_SOURCE_FEATURE_COUNT + 3;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Core.CoreComputationNode <em>Computation Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Computation Node</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreComputationNode
	 * @generated
	 */
	EClass getCoreComputationNode();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DTSM.Core.CoreComputationNode#getHasSuccessor <em>Has Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Successor</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreComputationNode#getHasSuccessor()
	 * @see #getCoreComputationNode()
	 * @generated
	 */
	EReference getCoreComputationNode_HasSuccessor();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DTSM.Core.CoreComputationNode#getProcessInputData <em>Process Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Process Input Data</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreComputationNode#getProcessInputData()
	 * @see #getCoreComputationNode()
	 * @generated
	 */
	EReference getCoreComputationNode_ProcessInputData();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Core.CoreComputationNode#getRealise <em>Realise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Realise</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreComputationNode#getRealise()
	 * @see #getCoreComputationNode()
	 * @generated
	 */
	EReference getCoreComputationNode_Realise();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DTSM.Core.CoreComputationNode#getProduceOutputData <em>Produce Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Produce Output Data</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreComputationNode#getProduceOutputData()
	 * @see #getCoreComputationNode()
	 * @generated
	 */
	EReference getCoreComputationNode_ProduceOutputData();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Core.CoreData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreData
	 * @generated
	 */
	EClass getCoreData();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DTSM.Core.CoreData#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Location</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreData#getLocation()
	 * @see #getCoreData()
	 * @generated
	 */
	EReference getCoreData_Location();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.DTSM.Core.CoreData#getHasSpecification <em>Has Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Specification</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreData#getHasSpecification()
	 * @see #getCoreData()
	 * @generated
	 */
	EReference getCoreData_HasSpecification();

	/**
	 * Returns the meta object for the containment reference '{@link es.unizar.disco.dice.DTSM.Core.CoreData#getHasVolume <em>Has Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Has Volume</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreData#getHasVolume()
	 * @see #getCoreData()
	 * @generated
	 */
	EReference getCoreData_HasVolume();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Core.CoreData#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreData#getBase_Class()
	 * @see #getCoreData()
	 * @generated
	 */
	EReference getCoreData_Base_Class();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Core.CoreDataSource <em>Data Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Source</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDataSource
	 * @generated
	 */
	EClass getCoreDataSource();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph <em>Direct Acyclic Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Direct Acyclic Graph</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph
	 * @generated
	 */
	EClass getCoreDirectAcyclicGraph();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph#getHasSourceNode <em>Has Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Source Node</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph#getHasSourceNode()
	 * @see #getCoreDirectAcyclicGraph()
	 * @generated
	 */
	EReference getCoreDirectAcyclicGraph_HasSourceNode();

	/**
	 * Returns the meta object for the reference '{@link es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDirectAcyclicGraph#getBase_Class()
	 * @see #getCoreDirectAcyclicGraph()
	 * @generated
	 */
	EReference getCoreDirectAcyclicGraph_Base_Class();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Core.CoreDAGSourceNode <em>DAG Source Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAG Source Node</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDAGSourceNode
	 * @generated
	 */
	EClass getCoreDAGSourceNode();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DTSM.Core.CoreDAGSourceNode#getReadFrom <em>Read From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Read From</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDAGSourceNode#getReadFrom()
	 * @see #getCoreDAGSourceNode()
	 * @generated
	 */
	EReference getCoreDAGSourceNode_ReadFrom();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Core.CoreDAGNode <em>DAG Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DAG Node</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDAGNode
	 * @generated
	 */
	EClass getCoreDAGNode();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Core.CoreDAGNode#getParallelism <em>Parallelism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parallelism</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDAGNode#getParallelism()
	 * @see #getCoreDAGNode()
	 * @generated
	 */
	EAttribute getCoreDAGNode_Parallelism();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Core.CoreDAGNode#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDAGNode#getOperation()
	 * @see #getCoreDAGNode()
	 * @generated
	 */
	EAttribute getCoreDAGNode_Operation();

	/**
	 * Returns the meta object for the reference list '{@link es.unizar.disco.dice.DTSM.Core.CoreDAGNode#getHasSuccessor <em>Has Successor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has Successor</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreDAGNode#getHasSuccessor()
	 * @see #getCoreDAGNode()
	 * @generated
	 */
	EReference getCoreDAGNode_HasSuccessor();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Core.CoreStorageNode <em>Storage Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Storage Node</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreStorageNode
	 * @generated
	 */
	EClass getCoreStorageNode();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Core.CoreStorageNode#getDatabase <em>Database</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Database</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreStorageNode#getDatabase()
	 * @see #getCoreStorageNode()
	 * @generated
	 */
	EAttribute getCoreStorageNode_Database();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Core.CoreStorageNode#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreStorageNode#getUser()
	 * @see #getCoreStorageNode()
	 * @generated
	 */
	EAttribute getCoreStorageNode_User();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Core.CoreStorageNode#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see es.unizar.disco.dice.DTSM.Core.CoreStorageNode#getPassword()
	 * @see #getCoreStorageNode()
	 * @generated
	 */
	EAttribute getCoreStorageNode_Password();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CoreFactory getCoreFactory();

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
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl <em>Computation Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreComputationNode()
		 * @generated
		 */
		EClass CORE_COMPUTATION_NODE = eINSTANCE.getCoreComputationNode();

		/**
		 * The meta object literal for the '<em><b>Has Successor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_COMPUTATION_NODE__HAS_SUCCESSOR = eINSTANCE.getCoreComputationNode_HasSuccessor();

		/**
		 * The meta object literal for the '<em><b>Process Input Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_COMPUTATION_NODE__PROCESS_INPUT_DATA = eINSTANCE.getCoreComputationNode_ProcessInputData();

		/**
		 * The meta object literal for the '<em><b>Realise</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_COMPUTATION_NODE__REALISE = eINSTANCE.getCoreComputationNode_Realise();

		/**
		 * The meta object literal for the '<em><b>Produce Output Data</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_COMPUTATION_NODE__PRODUCE_OUTPUT_DATA = eINSTANCE.getCoreComputationNode_ProduceOutputData();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreDataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreDataImpl
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreData()
		 * @generated
		 */
		EClass CORE_DATA = eINSTANCE.getCoreData();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_DATA__LOCATION = eINSTANCE.getCoreData_Location();

		/**
		 * The meta object literal for the '<em><b>Has Specification</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_DATA__HAS_SPECIFICATION = eINSTANCE.getCoreData_HasSpecification();

		/**
		 * The meta object literal for the '<em><b>Has Volume</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_DATA__HAS_VOLUME = eINSTANCE.getCoreData_HasVolume();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_DATA__BASE_CLASS = eINSTANCE.getCoreData_Base_Class();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreDataSourceImpl <em>Data Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreDataSourceImpl
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreDataSource()
		 * @generated
		 */
		EClass CORE_DATA_SOURCE = eINSTANCE.getCoreDataSource();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreDirectAcyclicGraphImpl <em>Direct Acyclic Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreDirectAcyclicGraphImpl
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreDirectAcyclicGraph()
		 * @generated
		 */
		EClass CORE_DIRECT_ACYCLIC_GRAPH = eINSTANCE.getCoreDirectAcyclicGraph();

		/**
		 * The meta object literal for the '<em><b>Has Source Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_DIRECT_ACYCLIC_GRAPH__HAS_SOURCE_NODE = eINSTANCE.getCoreDirectAcyclicGraph_HasSourceNode();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_DIRECT_ACYCLIC_GRAPH__BASE_CLASS = eINSTANCE.getCoreDirectAcyclicGraph_Base_Class();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreDAGSourceNodeImpl <em>DAG Source Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreDAGSourceNodeImpl
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreDAGSourceNode()
		 * @generated
		 */
		EClass CORE_DAG_SOURCE_NODE = eINSTANCE.getCoreDAGSourceNode();

		/**
		 * The meta object literal for the '<em><b>Read From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_DAG_SOURCE_NODE__READ_FROM = eINSTANCE.getCoreDAGSourceNode_ReadFrom();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreDAGNodeImpl <em>DAG Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreDAGNodeImpl
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreDAGNode()
		 * @generated
		 */
		EClass CORE_DAG_NODE = eINSTANCE.getCoreDAGNode();

		/**
		 * The meta object literal for the '<em><b>Parallelism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_DAG_NODE__PARALLELISM = eINSTANCE.getCoreDAGNode_Parallelism();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_DAG_NODE__OPERATION = eINSTANCE.getCoreDAGNode_Operation();

		/**
		 * The meta object literal for the '<em><b>Has Successor</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORE_DAG_NODE__HAS_SUCCESSOR = eINSTANCE.getCoreDAGNode_HasSuccessor();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Core.impl.CoreStorageNodeImpl <em>Storage Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CoreStorageNodeImpl
		 * @see es.unizar.disco.dice.DTSM.Core.impl.CorePackageImpl#getCoreStorageNode()
		 * @generated
		 */
		EClass CORE_STORAGE_NODE = eINSTANCE.getCoreStorageNode();

		/**
		 * The meta object literal for the '<em><b>Database</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_STORAGE_NODE__DATABASE = eINSTANCE.getCoreStorageNode_Database();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_STORAGE_NODE__USER = eINSTANCE.getCoreStorageNode_User();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORE_STORAGE_NODE__PASSWORD = eINSTANCE.getCoreStorageNode_Password();

	}

} //CorePackage
