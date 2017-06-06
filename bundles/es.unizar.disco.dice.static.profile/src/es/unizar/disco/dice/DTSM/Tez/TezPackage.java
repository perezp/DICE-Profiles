/**
 */
package es.unizar.disco.dice.DTSM.Tez;

import es.unizar.disco.dice.DTSM.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

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
 * @see es.unizar.disco.dice.DTSM.Tez.TezFactory
 * @model kind="package"
 * @generated
 */
public interface TezPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Tez";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://es.unizar.disco.dice/profiles/DTSM/Tez/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Tez";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TezPackage eINSTANCE = es.unizar.disco.dice.DTSM.Tez.impl.TezPackageImpl.init();

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Tez.impl.TezVertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezVertexImpl
	 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezPackageImpl#getTezVertex()
	 * @generated
	 */
	int TEZ_VERTEX = 0;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__EXEC_TIME = CorePackage.CORE_DAG_NODE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__ALLOCATED_MEMORY = CorePackage.CORE_DAG_NODE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__USED_MEMORY = CorePackage.CORE_DAG_NODE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__POWER_PEAK = CorePackage.CORE_DAG_NODE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__ENERGY = CorePackage.CORE_DAG_NODE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__BASE_NAMED_ELEMENT = CorePackage.CORE_DAG_NODE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__SUB_USAGE = CorePackage.CORE_DAG_NODE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__USED_RESOURCES = CorePackage.CORE_DAG_NODE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__MSG_SIZE = CorePackage.CORE_DAG_NODE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__ON = CorePackage.CORE_DAG_NODE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__BASE_ACTION = CorePackage.CORE_DAG_NODE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__BASE_BEHAVIOR = CorePackage.CORE_DAG_NODE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__BASE_MESSAGE = CorePackage.CORE_DAG_NODE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__DURATION = CorePackage.CORE_DAG_NODE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__START = CorePackage.CORE_DAG_NODE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__FINISH = CorePackage.CORE_DAG_NODE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__CAUSE = CorePackage.CORE_DAG_NODE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__HOST_DEMAND = CorePackage.CORE_DAG_NODE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__HOST_DEMAND_OPS = CorePackage.CORE_DAG_NODE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__INTER_OCC_T = CorePackage.CORE_DAG_NODE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__THROUGHPUT = CorePackage.CORE_DAG_NODE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__RESP_T = CorePackage.CORE_DAG_NODE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__UTILIZATION = CorePackage.CORE_DAG_NODE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__UTILIZATION_ON_HOST = CorePackage.CORE_DAG_NODE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__ROOT = CorePackage.CORE_DAG_NODE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__STEPS = CorePackage.CORE_DAG_NODE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__PARENT_STEP = CorePackage.CORE_DAG_NODE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__TIMING = CorePackage.CORE_DAG_NODE__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__IS_ATOMIC = CorePackage.CORE_DAG_NODE__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__BLOCK_T = CorePackage.CORE_DAG_NODE__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__REP = CorePackage.CORE_DAG_NODE__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__PROB = CorePackage.CORE_DAG_NODE__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__PRIORITY = CorePackage.CORE_DAG_NODE__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__CONCUR_RES = CorePackage.CORE_DAG_NODE__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__HOST = CorePackage.CORE_DAG_NODE__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__SERV_DEMAND = CorePackage.CORE_DAG_NODE__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__SERV_COUNT = CorePackage.CORE_DAG_NODE__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__SELF_DELAY = CorePackage.CORE_DAG_NODE__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__SCENARIO = CorePackage.CORE_DAG_NODE__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__CHILD_SCENARIO = CorePackage.CORE_DAG_NODE__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__RES_MULT = CorePackage.CORE_DAG_NODE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__IS_PROTECTED = CorePackage.CORE_DAG_NODE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__IS_ACTIVE = CorePackage.CORE_DAG_NODE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__BASE_PROPERTY = CorePackage.CORE_DAG_NODE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__BASE_INSTANCE_SPECIFICATION = CorePackage.CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__BASE_CLASSIFIER = CorePackage.CORE_DAG_NODE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__BASE_LIFELINE = CorePackage.CORE_DAG_NODE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__BASE_CONNECTABLE_ELEMENT = CorePackage.CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__STATEFUL = CorePackage.CORE_DAG_NODE__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__ORIGIN = CorePackage.CORE_DAG_NODE__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__FAILURE_COVERAGE = CorePackage.CORE_DAG_NODE__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__PERC_PERM_FAULT = CorePackage.CORE_DAG_NODE__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__SS_AVAIL = CorePackage.CORE_DAG_NODE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__UNRELIABILITY = CorePackage.CORE_DAG_NODE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__RELIABILITY = CorePackage.CORE_DAG_NODE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__MISSION_TIME = CorePackage.CORE_DAG_NODE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__AVAIL_LEVEL = CorePackage.CORE_DAG_NODE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__RELIABILITY_LEVEL = CorePackage.CORE_DAG_NODE__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__SAFETY_LEVEL = CorePackage.CORE_DAG_NODE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__COMPLEXITY = CorePackage.CORE_DAG_NODE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__FAULT = CorePackage.CORE_DAG_NODE__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__ERROR = CorePackage.CORE_DAG_NODE__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__FAILURE = CorePackage.CORE_DAG_NODE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__HAZARD = CorePackage.CORE_DAG_NODE__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__REPAIR = CorePackage.CORE_DAG_NODE__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__SUBSTITUTED_BY = CorePackage.CORE_DAG_NODE__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Node Throughput</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__NODE_THROUGHPUT = CorePackage.CORE_DAG_NODE__NODE_THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__TYPE = CorePackage.CORE_DAG_NODE__TYPE;

	/**
	 * The feature id for the '<em><b>Target Tech</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__TARGET_TECH = CorePackage.CORE_DAG_NODE__TARGET_TECH;

	/**
	 * The feature id for the '<em><b>Proc Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__PROC_TYPE = CorePackage.CORE_DAG_NODE__PROC_TYPE;

	/**
	 * The feature id for the '<em><b>Store</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__STORE = CorePackage.CORE_DAG_NODE__STORE;

	/**
	 * The feature id for the '<em><b>Provides</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__PROVIDES = CorePackage.CORE_DAG_NODE__PROVIDES;

	/**
	 * The feature id for the '<em><b>Source Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__SOURCE_TYPE = CorePackage.CORE_DAG_NODE__SOURCE_TYPE;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__RATE = CorePackage.CORE_DAG_NODE__RATE;

	/**
	 * The feature id for the '<em><b>Parallelism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__PARALLELISM = CorePackage.CORE_DAG_NODE__PARALLELISM;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__OPERATION = CorePackage.CORE_DAG_NODE__OPERATION;

	/**
	 * The feature id for the '<em><b>Has Successor</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__HAS_SUCCESSOR = CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR;

	/**
	 * The feature id for the '<em><b>Task Input Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__TASK_INPUT_SIZE = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Min Src Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__MIN_SRC_FRACTION = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Max Scr Fraction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__MAX_SCR_FRACTION = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Virtual Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__VIRTUAL_CORES = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX__MEMORY = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_VERTEX_FEATURE_COUNT = CorePackage.CORE_DAG_NODE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Tez.impl.TezEdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezEdgeImpl
	 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezPackageImpl#getTezEdge()
	 * @generated
	 */
	int TEZ_EDGE = 1;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__EXEC_TIME = GQAMPackage.GA_STEP__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__ALLOCATED_MEMORY = GQAMPackage.GA_STEP__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__USED_MEMORY = GQAMPackage.GA_STEP__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__POWER_PEAK = GQAMPackage.GA_STEP__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__ENERGY = GQAMPackage.GA_STEP__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__BASE_NAMED_ELEMENT = GQAMPackage.GA_STEP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__SUB_USAGE = GQAMPackage.GA_STEP__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__USED_RESOURCES = GQAMPackage.GA_STEP__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__MSG_SIZE = GQAMPackage.GA_STEP__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__ON = GQAMPackage.GA_STEP__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__BASE_ACTION = GQAMPackage.GA_STEP__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__BASE_BEHAVIOR = GQAMPackage.GA_STEP__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__BASE_MESSAGE = GQAMPackage.GA_STEP__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__DURATION = GQAMPackage.GA_STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__START = GQAMPackage.GA_STEP__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__FINISH = GQAMPackage.GA_STEP__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__CAUSE = GQAMPackage.GA_STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__HOST_DEMAND = GQAMPackage.GA_STEP__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__HOST_DEMAND_OPS = GQAMPackage.GA_STEP__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__INTER_OCC_T = GQAMPackage.GA_STEP__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__THROUGHPUT = GQAMPackage.GA_STEP__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__RESP_T = GQAMPackage.GA_STEP__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__UTILIZATION = GQAMPackage.GA_STEP__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__UTILIZATION_ON_HOST = GQAMPackage.GA_STEP__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__ROOT = GQAMPackage.GA_STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__STEPS = GQAMPackage.GA_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__PARENT_STEP = GQAMPackage.GA_STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__TIMING = GQAMPackage.GA_STEP__TIMING;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__IS_ATOMIC = GQAMPackage.GA_STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__BLOCK_T = GQAMPackage.GA_STEP__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__REP = GQAMPackage.GA_STEP__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__PROB = GQAMPackage.GA_STEP__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__PRIORITY = GQAMPackage.GA_STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__CONCUR_RES = GQAMPackage.GA_STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__HOST = GQAMPackage.GA_STEP__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__SERV_DEMAND = GQAMPackage.GA_STEP__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__SERV_COUNT = GQAMPackage.GA_STEP__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__SELF_DELAY = GQAMPackage.GA_STEP__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__SCENARIO = GQAMPackage.GA_STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__CHILD_SCENARIO = GQAMPackage.GA_STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Data Movement Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE__DATA_MOVEMENT_TYPE = GQAMPackage.GA_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_EDGE_FEATURE_COUNT = GQAMPackage.GA_STEP_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link es.unizar.disco.dice.DTSM.Tez.impl.TezScenarioImpl <em>Scenario</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezScenarioImpl
	 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezPackageImpl#getTezScenario()
	 * @generated
	 */
	int TEZ_SCENARIO = 2;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__EXEC_TIME = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__ALLOCATED_MEMORY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__USED_MEMORY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__POWER_PEAK = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__ENERGY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__BASE_NAMED_ELEMENT = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__SUB_USAGE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__USED_RESOURCES = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__MSG_SIZE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__ON = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__BASE_ACTION = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__BASE_BEHAVIOR = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__BASE_MESSAGE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__DURATION = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__START = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__FINISH = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__CAUSE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__HOST_DEMAND = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__HOST_DEMAND_OPS = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__INTER_OCC_T = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__THROUGHPUT = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__RESP_T = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__UTILIZATION = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__UTILIZATION_ON_HOST = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__ROOT = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__STEPS = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__PARENT_STEP = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__TIMING = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__EXEC_PROB = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__SS_AVAIL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__INST_AVAIL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__UNRELIABILITY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__RELIABILITY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__MISSION_TIME = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__AVAIL_LEVEL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__RELIAB_LEVEL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__SAFETY_LEVEL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__COMPLEXITY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__FAILURE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__HAZARD = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__RECOVERY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__CONF_LEVEL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__INTEG_LEVEL = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__INTEG_LEVEL;

	/**
	 * The feature id for the '<em><b>Has Source Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__HAS_SOURCE_NODE = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__HAS_SOURCE_NODE;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__BASE_CLASS = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH__BASE_CLASS;

	/**
	 * The feature id for the '<em><b>Max Task Paralellism</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__MAX_TASK_PARALELLISM = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Am Virtual Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__AM_VIRTUAL_CORES = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Am Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__AM_MEMORY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Task Virtual Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__TASK_VIRTUAL_CORES = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Task Memory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO__TASK_MEMORY = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEZ_SCENARIO_FEATURE_COUNT = CorePackage.CORE_DIRECT_ACYCLIC_GRAPH_FEATURE_COUNT + 5;


	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezVertex
	 * @generated
	 */
	EClass getTezVertex();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getTaskInputSize <em>Task Input Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Input Size</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezVertex#getTaskInputSize()
	 * @see #getTezVertex()
	 * @generated
	 */
	EAttribute getTezVertex_TaskInputSize();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getMinSrcFraction <em>Min Src Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Src Fraction</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezVertex#getMinSrcFraction()
	 * @see #getTezVertex()
	 * @generated
	 */
	EAttribute getTezVertex_MinSrcFraction();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getMaxScrFraction <em>Max Scr Fraction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Scr Fraction</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezVertex#getMaxScrFraction()
	 * @see #getTezVertex()
	 * @generated
	 */
	EAttribute getTezVertex_MaxScrFraction();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getVirtualCores <em>Virtual Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Virtual Cores</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezVertex#getVirtualCores()
	 * @see #getTezVertex()
	 * @generated
	 */
	EAttribute getTezVertex_VirtualCores();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezVertex#getMemory <em>Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Memory</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezVertex#getMemory()
	 * @see #getTezVertex()
	 * @generated
	 */
	EAttribute getTezVertex_Memory();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Tez.TezEdge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezEdge
	 * @generated
	 */
	EClass getTezEdge();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezEdge#getDataMovementType <em>Data Movement Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Movement Type</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezEdge#getDataMovementType()
	 * @see #getTezEdge()
	 * @generated
	 */
	EAttribute getTezEdge_DataMovementType();

	/**
	 * Returns the meta object for class '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezScenario
	 * @generated
	 */
	EClass getTezScenario();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getMaxTaskParalellism <em>Max Task Paralellism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Task Paralellism</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezScenario#getMaxTaskParalellism()
	 * @see #getTezScenario()
	 * @generated
	 */
	EAttribute getTezScenario_MaxTaskParalellism();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getAmVirtualCores <em>Am Virtual Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Am Virtual Cores</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezScenario#getAmVirtualCores()
	 * @see #getTezScenario()
	 * @generated
	 */
	EAttribute getTezScenario_AmVirtualCores();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getAmMemory <em>Am Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Am Memory</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezScenario#getAmMemory()
	 * @see #getTezScenario()
	 * @generated
	 */
	EAttribute getTezScenario_AmMemory();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getTaskVirtualCores <em>Task Virtual Cores</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Virtual Cores</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezScenario#getTaskVirtualCores()
	 * @see #getTezScenario()
	 * @generated
	 */
	EAttribute getTezScenario_TaskVirtualCores();

	/**
	 * Returns the meta object for the attribute '{@link es.unizar.disco.dice.DTSM.Tez.TezScenario#getTaskMemory <em>Task Memory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Task Memory</em>'.
	 * @see es.unizar.disco.dice.DTSM.Tez.TezScenario#getTaskMemory()
	 * @see #getTezScenario()
	 * @generated
	 */
	EAttribute getTezScenario_TaskMemory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TezFactory getTezFactory();

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
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Tez.impl.TezVertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezVertexImpl
		 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezPackageImpl#getTezVertex()
		 * @generated
		 */
		EClass TEZ_VERTEX = eINSTANCE.getTezVertex();

		/**
		 * The meta object literal for the '<em><b>Task Input Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_VERTEX__TASK_INPUT_SIZE = eINSTANCE.getTezVertex_TaskInputSize();

		/**
		 * The meta object literal for the '<em><b>Min Src Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_VERTEX__MIN_SRC_FRACTION = eINSTANCE.getTezVertex_MinSrcFraction();

		/**
		 * The meta object literal for the '<em><b>Max Scr Fraction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_VERTEX__MAX_SCR_FRACTION = eINSTANCE.getTezVertex_MaxScrFraction();

		/**
		 * The meta object literal for the '<em><b>Virtual Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_VERTEX__VIRTUAL_CORES = eINSTANCE.getTezVertex_VirtualCores();

		/**
		 * The meta object literal for the '<em><b>Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_VERTEX__MEMORY = eINSTANCE.getTezVertex_Memory();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Tez.impl.TezEdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezEdgeImpl
		 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezPackageImpl#getTezEdge()
		 * @generated
		 */
		EClass TEZ_EDGE = eINSTANCE.getTezEdge();

		/**
		 * The meta object literal for the '<em><b>Data Movement Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_EDGE__DATA_MOVEMENT_TYPE = eINSTANCE.getTezEdge_DataMovementType();

		/**
		 * The meta object literal for the '{@link es.unizar.disco.dice.DTSM.Tez.impl.TezScenarioImpl <em>Scenario</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezScenarioImpl
		 * @see es.unizar.disco.dice.DTSM.Tez.impl.TezPackageImpl#getTezScenario()
		 * @generated
		 */
		EClass TEZ_SCENARIO = eINSTANCE.getTezScenario();

		/**
		 * The meta object literal for the '<em><b>Max Task Paralellism</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_SCENARIO__MAX_TASK_PARALELLISM = eINSTANCE.getTezScenario_MaxTaskParalellism();

		/**
		 * The meta object literal for the '<em><b>Am Virtual Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_SCENARIO__AM_VIRTUAL_CORES = eINSTANCE.getTezScenario_AmVirtualCores();

		/**
		 * The meta object literal for the '<em><b>Am Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_SCENARIO__AM_MEMORY = eINSTANCE.getTezScenario_AmMemory();

		/**
		 * The meta object literal for the '<em><b>Task Virtual Cores</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_SCENARIO__TASK_VIRTUAL_CORES = eINSTANCE.getTezScenario_TaskVirtualCores();

		/**
		 * The meta object literal for the '<em><b>Task Memory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEZ_SCENARIO__TASK_MEMORY = eINSTANCE.getTezScenario_TaskMemory();

	}

} //TezPackage
