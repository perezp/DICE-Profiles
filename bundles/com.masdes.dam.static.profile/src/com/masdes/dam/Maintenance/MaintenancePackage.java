/**
 */
package com.masdes.dam.Maintenance;

import com.masdes.dam.Core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see com.masdes.dam.Maintenance.MaintenanceFactory
 * @model kind="package"
 * @generated
 */
public interface MaintenancePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Maintenance";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.masdes.dam/profiles/Maintenance/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Maintenance";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MaintenancePackage eINSTANCE = com.masdes.dam.Maintenance.impl.MaintenancePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.masdes.dam.Maintenance.impl.DaReplacementStepImpl <em>Da Replacement Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Maintenance.impl.DaReplacementStepImpl
	 * @see com.masdes.dam.Maintenance.impl.MaintenancePackageImpl#getDaReplacementStep()
	 * @generated
	 */
	int DA_REPLACEMENT_STEP = 0;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__EXEC_TIME = CorePackage.DA_STEP__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__ALLOCATED_MEMORY = CorePackage.DA_STEP__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__USED_MEMORY = CorePackage.DA_STEP__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__POWER_PEAK = CorePackage.DA_STEP__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__ENERGY = CorePackage.DA_STEP__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__BASE_NAMED_ELEMENT = CorePackage.DA_STEP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__SUB_USAGE = CorePackage.DA_STEP__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__USED_RESOURCES = CorePackage.DA_STEP__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__MSG_SIZE = CorePackage.DA_STEP__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__ON = CorePackage.DA_STEP__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__BASE_ACTION = CorePackage.DA_STEP__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__BASE_BEHAVIOR = CorePackage.DA_STEP__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__BASE_MESSAGE = CorePackage.DA_STEP__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__DURATION = CorePackage.DA_STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__START = CorePackage.DA_STEP__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__FINISH = CorePackage.DA_STEP__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__CAUSE = CorePackage.DA_STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__HOST_DEMAND = CorePackage.DA_STEP__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__HOST_DEMAND_OPS = CorePackage.DA_STEP__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__INTER_OCC_T = CorePackage.DA_STEP__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__THROUGHPUT = CorePackage.DA_STEP__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__RESP_T = CorePackage.DA_STEP__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__UTILIZATION = CorePackage.DA_STEP__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__UTILIZATION_ON_HOST = CorePackage.DA_STEP__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__ROOT = CorePackage.DA_STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__STEPS = CorePackage.DA_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__PARENT_STEP = CorePackage.DA_STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__TIMING = CorePackage.DA_STEP__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__EXEC_PROB = CorePackage.DA_STEP__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__SS_AVAIL = CorePackage.DA_STEP__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__INST_AVAIL = CorePackage.DA_STEP__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__UNRELIABILITY = CorePackage.DA_STEP__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__RELIABILITY = CorePackage.DA_STEP__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__MISSION_TIME = CorePackage.DA_STEP__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__AVAIL_LEVEL = CorePackage.DA_STEP__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__RELIAB_LEVEL = CorePackage.DA_STEP__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__SAFETY_LEVEL = CorePackage.DA_STEP__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__COMPLEXITY = CorePackage.DA_STEP__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__FAILURE = CorePackage.DA_STEP__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__HAZARD = CorePackage.DA_STEP__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__RECOVERY = CorePackage.DA_STEP__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__CONF_LEVEL = CorePackage.DA_STEP__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__INTEG_LEVEL = CorePackage.DA_STEP__INTEG_LEVEL;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__IS_ATOMIC = CorePackage.DA_STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__BLOCK_T = CorePackage.DA_STEP__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__REP = CorePackage.DA_STEP__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__PROB = CorePackage.DA_STEP__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__PRIORITY = CorePackage.DA_STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__CONCUR_RES = CorePackage.DA_STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__HOST = CorePackage.DA_STEP__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__SERV_DEMAND = CorePackage.DA_STEP__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__SERV_COUNT = CorePackage.DA_STEP__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__SELF_DELAY = CorePackage.DA_STEP__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__SCENARIO = CorePackage.DA_STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__CHILD_SCENARIO = CorePackage.DA_STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__KIND = CorePackage.DA_STEP__KIND;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__ERROR = CorePackage.DA_STEP__ERROR;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__FAULT = CorePackage.DA_STEP__FAULT;

	/**
	 * The feature id for the '<em><b>Kind Rep S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__KIND_REP_S = CorePackage.DA_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Replace</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__REPLACE = CorePackage.DA_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>With</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP__WITH = CorePackage.DA_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Da Replacement Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPLACEMENT_STEP_FEATURE_COUNT = CorePackage.DA_STEP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Maintenance.impl.DaReallocationStepImpl <em>Da Reallocation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Maintenance.impl.DaReallocationStepImpl
	 * @see com.masdes.dam.Maintenance.impl.MaintenancePackageImpl#getDaReallocationStep()
	 * @generated
	 */
	int DA_REALLOCATION_STEP = 1;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__EXEC_TIME = CorePackage.DA_STEP__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__ALLOCATED_MEMORY = CorePackage.DA_STEP__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__USED_MEMORY = CorePackage.DA_STEP__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__POWER_PEAK = CorePackage.DA_STEP__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__ENERGY = CorePackage.DA_STEP__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__BASE_NAMED_ELEMENT = CorePackage.DA_STEP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__SUB_USAGE = CorePackage.DA_STEP__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__USED_RESOURCES = CorePackage.DA_STEP__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__MSG_SIZE = CorePackage.DA_STEP__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__ON = CorePackage.DA_STEP__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__BASE_ACTION = CorePackage.DA_STEP__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__BASE_BEHAVIOR = CorePackage.DA_STEP__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__BASE_MESSAGE = CorePackage.DA_STEP__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__DURATION = CorePackage.DA_STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__START = CorePackage.DA_STEP__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__FINISH = CorePackage.DA_STEP__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__CAUSE = CorePackage.DA_STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__HOST_DEMAND = CorePackage.DA_STEP__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__HOST_DEMAND_OPS = CorePackage.DA_STEP__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__INTER_OCC_T = CorePackage.DA_STEP__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__THROUGHPUT = CorePackage.DA_STEP__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__RESP_T = CorePackage.DA_STEP__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__UTILIZATION = CorePackage.DA_STEP__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__UTILIZATION_ON_HOST = CorePackage.DA_STEP__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__ROOT = CorePackage.DA_STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__STEPS = CorePackage.DA_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__PARENT_STEP = CorePackage.DA_STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__TIMING = CorePackage.DA_STEP__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__EXEC_PROB = CorePackage.DA_STEP__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__SS_AVAIL = CorePackage.DA_STEP__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__INST_AVAIL = CorePackage.DA_STEP__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__UNRELIABILITY = CorePackage.DA_STEP__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__RELIABILITY = CorePackage.DA_STEP__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__MISSION_TIME = CorePackage.DA_STEP__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__AVAIL_LEVEL = CorePackage.DA_STEP__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__RELIAB_LEVEL = CorePackage.DA_STEP__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__SAFETY_LEVEL = CorePackage.DA_STEP__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__COMPLEXITY = CorePackage.DA_STEP__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__FAILURE = CorePackage.DA_STEP__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__HAZARD = CorePackage.DA_STEP__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__RECOVERY = CorePackage.DA_STEP__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__CONF_LEVEL = CorePackage.DA_STEP__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__INTEG_LEVEL = CorePackage.DA_STEP__INTEG_LEVEL;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__IS_ATOMIC = CorePackage.DA_STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__BLOCK_T = CorePackage.DA_STEP__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__REP = CorePackage.DA_STEP__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__PROB = CorePackage.DA_STEP__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__PRIORITY = CorePackage.DA_STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__CONCUR_RES = CorePackage.DA_STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__HOST = CorePackage.DA_STEP__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__SERV_DEMAND = CorePackage.DA_STEP__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__SERV_COUNT = CorePackage.DA_STEP__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__SELF_DELAY = CorePackage.DA_STEP__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__SCENARIO = CorePackage.DA_STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__CHILD_SCENARIO = CorePackage.DA_STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__KIND = CorePackage.DA_STEP__KIND;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__ERROR = CorePackage.DA_STEP__ERROR;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__FAULT = CorePackage.DA_STEP__FAULT;

	/**
	 * The feature id for the '<em><b>Kind Real S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__KIND_REAL_S = CorePackage.DA_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Map</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__MAP = CorePackage.DA_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP__TO = CorePackage.DA_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Da Reallocation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REALLOCATION_STEP_FEATURE_COUNT = CorePackage.DA_STEP_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Maintenance.impl.DaActivationStepImpl <em>Da Activation Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Maintenance.impl.DaActivationStepImpl
	 * @see com.masdes.dam.Maintenance.impl.MaintenancePackageImpl#getDaActivationStep()
	 * @generated
	 */
	int DA_ACTIVATION_STEP = 2;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__EXEC_TIME = CorePackage.DA_STEP__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__ALLOCATED_MEMORY = CorePackage.DA_STEP__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__USED_MEMORY = CorePackage.DA_STEP__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__POWER_PEAK = CorePackage.DA_STEP__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__ENERGY = CorePackage.DA_STEP__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__BASE_NAMED_ELEMENT = CorePackage.DA_STEP__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__SUB_USAGE = CorePackage.DA_STEP__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__USED_RESOURCES = CorePackage.DA_STEP__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__MSG_SIZE = CorePackage.DA_STEP__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__ON = CorePackage.DA_STEP__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__BASE_ACTION = CorePackage.DA_STEP__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__BASE_BEHAVIOR = CorePackage.DA_STEP__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__BASE_MESSAGE = CorePackage.DA_STEP__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__DURATION = CorePackage.DA_STEP__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__START = CorePackage.DA_STEP__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__FINISH = CorePackage.DA_STEP__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__CAUSE = CorePackage.DA_STEP__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__HOST_DEMAND = CorePackage.DA_STEP__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__HOST_DEMAND_OPS = CorePackage.DA_STEP__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__INTER_OCC_T = CorePackage.DA_STEP__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__THROUGHPUT = CorePackage.DA_STEP__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__RESP_T = CorePackage.DA_STEP__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__UTILIZATION = CorePackage.DA_STEP__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__UTILIZATION_ON_HOST = CorePackage.DA_STEP__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__ROOT = CorePackage.DA_STEP__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__STEPS = CorePackage.DA_STEP__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__PARENT_STEP = CorePackage.DA_STEP__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__TIMING = CorePackage.DA_STEP__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__EXEC_PROB = CorePackage.DA_STEP__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__SS_AVAIL = CorePackage.DA_STEP__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__INST_AVAIL = CorePackage.DA_STEP__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__UNRELIABILITY = CorePackage.DA_STEP__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__RELIABILITY = CorePackage.DA_STEP__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__MISSION_TIME = CorePackage.DA_STEP__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__AVAIL_LEVEL = CorePackage.DA_STEP__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__RELIAB_LEVEL = CorePackage.DA_STEP__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__SAFETY_LEVEL = CorePackage.DA_STEP__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__COMPLEXITY = CorePackage.DA_STEP__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__FAILURE = CorePackage.DA_STEP__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__HAZARD = CorePackage.DA_STEP__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__RECOVERY = CorePackage.DA_STEP__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__CONF_LEVEL = CorePackage.DA_STEP__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__INTEG_LEVEL = CorePackage.DA_STEP__INTEG_LEVEL;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__IS_ATOMIC = CorePackage.DA_STEP__IS_ATOMIC;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__BLOCK_T = CorePackage.DA_STEP__BLOCK_T;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__REP = CorePackage.DA_STEP__REP;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__PROB = CorePackage.DA_STEP__PROB;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__PRIORITY = CorePackage.DA_STEP__PRIORITY;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__CONCUR_RES = CorePackage.DA_STEP__CONCUR_RES;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__HOST = CorePackage.DA_STEP__HOST;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__SERV_DEMAND = CorePackage.DA_STEP__SERV_DEMAND;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__SERV_COUNT = CorePackage.DA_STEP__SERV_COUNT;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__SELF_DELAY = CorePackage.DA_STEP__SELF_DELAY;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__SCENARIO = CorePackage.DA_STEP__SCENARIO;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__CHILD_SCENARIO = CorePackage.DA_STEP__CHILD_SCENARIO;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__KIND = CorePackage.DA_STEP__KIND;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__ERROR = CorePackage.DA_STEP__ERROR;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__FAULT = CorePackage.DA_STEP__FAULT;

	/**
	 * The feature id for the '<em><b>Kind Act S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__KIND_ACT_S = CorePackage.DA_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Prio</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__PRIO = CorePackage.DA_STEP_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Preemption</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__PREEMPTION = CorePackage.DA_STEP_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Fail Cause</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__FAIL_CAUSE = CorePackage.DA_STEP_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Agents</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP__AGENTS = CorePackage.DA_STEP_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Da Activation Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ACTIVATION_STEP_FEATURE_COUNT = CorePackage.DA_STEP_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Maintenance.impl.DaAgentGroupImpl <em>Da Agent Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Maintenance.impl.DaAgentGroupImpl
	 * @see com.masdes.dam.Maintenance.impl.MaintenancePackageImpl#getDaAgentGroup()
	 * @generated
	 */
	int DA_AGENT_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Skill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_AGENT_GROUP__SKILL = 0;

	/**
	 * The feature id for the '<em><b>Correctness</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_AGENT_GROUP__CORRECTNESS = 1;

	/**
	 * The feature id for the '<em><b>Agent Number</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_AGENT_GROUP__AGENT_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_AGENT_GROUP__BASE_CLASSIFIER = 3;

	/**
	 * The number of structural features of the '<em>Da Agent Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_AGENT_GROUP_FEATURE_COUNT = 4;

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Maintenance.DaReplacementStep <em>Da Replacement Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Replacement Step</em>'.
	 * @see com.masdes.dam.Maintenance.DaReplacementStep
	 * @generated
	 */
	EClass getDaReplacementStep();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Maintenance.DaReplacementStep#getKindRepS <em>Kind Rep S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Rep S</em>'.
	 * @see com.masdes.dam.Maintenance.DaReplacementStep#getKindRepS()
	 * @see #getDaReplacementStep()
	 * @generated
	 */
	EAttribute getDaReplacementStep_KindRepS();

	/**
	 * Returns the meta object for the reference list '{@link com.masdes.dam.Maintenance.DaReplacementStep#getReplace <em>Replace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Replace</em>'.
	 * @see com.masdes.dam.Maintenance.DaReplacementStep#getReplace()
	 * @see #getDaReplacementStep()
	 * @generated
	 */
	EReference getDaReplacementStep_Replace();

	/**
	 * Returns the meta object for the reference list '{@link com.masdes.dam.Maintenance.DaReplacementStep#getWith <em>With</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>With</em>'.
	 * @see com.masdes.dam.Maintenance.DaReplacementStep#getWith()
	 * @see #getDaReplacementStep()
	 * @generated
	 */
	EReference getDaReplacementStep_With();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Maintenance.DaReallocationStep <em>Da Reallocation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Reallocation Step</em>'.
	 * @see com.masdes.dam.Maintenance.DaReallocationStep
	 * @generated
	 */
	EClass getDaReallocationStep();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Maintenance.DaReallocationStep#getKindRealS <em>Kind Real S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Real S</em>'.
	 * @see com.masdes.dam.Maintenance.DaReallocationStep#getKindRealS()
	 * @see #getDaReallocationStep()
	 * @generated
	 */
	EAttribute getDaReallocationStep_KindRealS();

	/**
	 * Returns the meta object for the reference list '{@link com.masdes.dam.Maintenance.DaReallocationStep#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Map</em>'.
	 * @see com.masdes.dam.Maintenance.DaReallocationStep#getMap()
	 * @see #getDaReallocationStep()
	 * @generated
	 */
	EReference getDaReallocationStep_Map();

	/**
	 * Returns the meta object for the reference list '{@link com.masdes.dam.Maintenance.DaReallocationStep#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>To</em>'.
	 * @see com.masdes.dam.Maintenance.DaReallocationStep#getTo()
	 * @see #getDaReallocationStep()
	 * @generated
	 */
	EReference getDaReallocationStep_To();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Maintenance.DaActivationStep <em>Da Activation Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Activation Step</em>'.
	 * @see com.masdes.dam.Maintenance.DaActivationStep
	 * @generated
	 */
	EClass getDaActivationStep();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Maintenance.DaActivationStep#getKindActS <em>Kind Act S</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind Act S</em>'.
	 * @see com.masdes.dam.Maintenance.DaActivationStep#getKindActS()
	 * @see #getDaActivationStep()
	 * @generated
	 */
	EAttribute getDaActivationStep_KindActS();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Maintenance.DaActivationStep#getPrio <em>Prio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prio</em>'.
	 * @see com.masdes.dam.Maintenance.DaActivationStep#getPrio()
	 * @see #getDaActivationStep()
	 * @generated
	 */
	EAttribute getDaActivationStep_Prio();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Maintenance.DaActivationStep#getPreemption <em>Preemption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Preemption</em>'.
	 * @see com.masdes.dam.Maintenance.DaActivationStep#getPreemption()
	 * @see #getDaActivationStep()
	 * @generated
	 */
	EAttribute getDaActivationStep_Preemption();

	/**
	 * Returns the meta object for the reference list '{@link com.masdes.dam.Maintenance.DaActivationStep#getFailCause <em>Fail Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fail Cause</em>'.
	 * @see com.masdes.dam.Maintenance.DaActivationStep#getFailCause()
	 * @see #getDaActivationStep()
	 * @generated
	 */
	EReference getDaActivationStep_FailCause();

	/**
	 * Returns the meta object for the reference list '{@link com.masdes.dam.Maintenance.DaActivationStep#getAgents <em>Agents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Agents</em>'.
	 * @see com.masdes.dam.Maintenance.DaActivationStep#getAgents()
	 * @see #getDaActivationStep()
	 * @generated
	 */
	EReference getDaActivationStep_Agents();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Maintenance.DaAgentGroup <em>Da Agent Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Agent Group</em>'.
	 * @see com.masdes.dam.Maintenance.DaAgentGroup
	 * @generated
	 */
	EClass getDaAgentGroup();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Maintenance.DaAgentGroup#getSkill <em>Skill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skill</em>'.
	 * @see com.masdes.dam.Maintenance.DaAgentGroup#getSkill()
	 * @see #getDaAgentGroup()
	 * @generated
	 */
	EAttribute getDaAgentGroup_Skill();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Maintenance.DaAgentGroup#getCorrectness <em>Correctness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Correctness</em>'.
	 * @see com.masdes.dam.Maintenance.DaAgentGroup#getCorrectness()
	 * @see #getDaAgentGroup()
	 * @generated
	 */
	EAttribute getDaAgentGroup_Correctness();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Maintenance.DaAgentGroup#getAgentNumber <em>Agent Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Agent Number</em>'.
	 * @see com.masdes.dam.Maintenance.DaAgentGroup#getAgentNumber()
	 * @see #getDaAgentGroup()
	 * @generated
	 */
	EAttribute getDaAgentGroup_AgentNumber();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Maintenance.DaAgentGroup#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see com.masdes.dam.Maintenance.DaAgentGroup#getBase_Classifier()
	 * @see #getDaAgentGroup()
	 * @generated
	 */
	EReference getDaAgentGroup_Base_Classifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MaintenanceFactory getMaintenanceFactory();

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
		 * The meta object literal for the '{@link com.masdes.dam.Maintenance.impl.DaReplacementStepImpl <em>Da Replacement Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Maintenance.impl.DaReplacementStepImpl
		 * @see com.masdes.dam.Maintenance.impl.MaintenancePackageImpl#getDaReplacementStep()
		 * @generated
		 */
		EClass DA_REPLACEMENT_STEP = eINSTANCE.getDaReplacementStep();

		/**
		 * The meta object literal for the '<em><b>Kind Rep S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_REPLACEMENT_STEP__KIND_REP_S = eINSTANCE.getDaReplacementStep_KindRepS();

		/**
		 * The meta object literal for the '<em><b>Replace</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_REPLACEMENT_STEP__REPLACE = eINSTANCE.getDaReplacementStep_Replace();

		/**
		 * The meta object literal for the '<em><b>With</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_REPLACEMENT_STEP__WITH = eINSTANCE.getDaReplacementStep_With();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Maintenance.impl.DaReallocationStepImpl <em>Da Reallocation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Maintenance.impl.DaReallocationStepImpl
		 * @see com.masdes.dam.Maintenance.impl.MaintenancePackageImpl#getDaReallocationStep()
		 * @generated
		 */
		EClass DA_REALLOCATION_STEP = eINSTANCE.getDaReallocationStep();

		/**
		 * The meta object literal for the '<em><b>Kind Real S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_REALLOCATION_STEP__KIND_REAL_S = eINSTANCE.getDaReallocationStep_KindRealS();

		/**
		 * The meta object literal for the '<em><b>Map</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_REALLOCATION_STEP__MAP = eINSTANCE.getDaReallocationStep_Map();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_REALLOCATION_STEP__TO = eINSTANCE.getDaReallocationStep_To();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Maintenance.impl.DaActivationStepImpl <em>Da Activation Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Maintenance.impl.DaActivationStepImpl
		 * @see com.masdes.dam.Maintenance.impl.MaintenancePackageImpl#getDaActivationStep()
		 * @generated
		 */
		EClass DA_ACTIVATION_STEP = eINSTANCE.getDaActivationStep();

		/**
		 * The meta object literal for the '<em><b>Kind Act S</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_ACTIVATION_STEP__KIND_ACT_S = eINSTANCE.getDaActivationStep_KindActS();

		/**
		 * The meta object literal for the '<em><b>Prio</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_ACTIVATION_STEP__PRIO = eINSTANCE.getDaActivationStep_Prio();

		/**
		 * The meta object literal for the '<em><b>Preemption</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_ACTIVATION_STEP__PREEMPTION = eINSTANCE.getDaActivationStep_Preemption();

		/**
		 * The meta object literal for the '<em><b>Fail Cause</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_ACTIVATION_STEP__FAIL_CAUSE = eINSTANCE.getDaActivationStep_FailCause();

		/**
		 * The meta object literal for the '<em><b>Agents</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_ACTIVATION_STEP__AGENTS = eINSTANCE.getDaActivationStep_Agents();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Maintenance.impl.DaAgentGroupImpl <em>Da Agent Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Maintenance.impl.DaAgentGroupImpl
		 * @see com.masdes.dam.Maintenance.impl.MaintenancePackageImpl#getDaAgentGroup()
		 * @generated
		 */
		EClass DA_AGENT_GROUP = eINSTANCE.getDaAgentGroup();

		/**
		 * The meta object literal for the '<em><b>Skill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_AGENT_GROUP__SKILL = eINSTANCE.getDaAgentGroup_Skill();

		/**
		 * The meta object literal for the '<em><b>Correctness</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_AGENT_GROUP__CORRECTNESS = eINSTANCE.getDaAgentGroup_Correctness();

		/**
		 * The meta object literal for the '<em><b>Agent Number</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_AGENT_GROUP__AGENT_NUMBER = eINSTANCE.getDaAgentGroup_AgentNumber();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_AGENT_GROUP__BASE_CLASSIFIER = eINSTANCE.getDaAgentGroup_Base_Classifier();

	}

} //MaintenancePackage
