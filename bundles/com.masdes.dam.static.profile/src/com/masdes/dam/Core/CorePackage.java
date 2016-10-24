/**
 */
package com.masdes.dam.Core;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;

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
 * @see com.masdes.dam.Core.CoreFactory
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
	String eNS_URI = "http://com.masdes.dam/profiles/Core/1.0";

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
	CorePackage eINSTANCE = com.masdes.dam.Core.impl.CorePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.masdes.dam.Core.impl.DaComponentImpl <em>Da Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Core.impl.DaComponentImpl
	 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaComponent()
	 * @generated
	 */
	int DA_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__RES_MULT = GRMPackage.RESOURCE__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__IS_PROTECTED = GRMPackage.RESOURCE__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__IS_ACTIVE = GRMPackage.RESOURCE__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__BASE_PROPERTY = GRMPackage.RESOURCE__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__BASE_INSTANCE_SPECIFICATION = GRMPackage.RESOURCE__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__BASE_CLASSIFIER = GRMPackage.RESOURCE__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__BASE_LIFELINE = GRMPackage.RESOURCE__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__BASE_CONNECTABLE_ELEMENT = GRMPackage.RESOURCE__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__STATEFUL = GRMPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__ORIGIN = GRMPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__FAILURE_COVERAGE = GRMPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__PERC_PERM_FAULT = GRMPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__SS_AVAIL = GRMPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__UNRELIABILITY = GRMPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__RELIABILITY = GRMPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__MISSION_TIME = GRMPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__AVAIL_LEVEL = GRMPackage.RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__RELIABILITY_LEVEL = GRMPackage.RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__SAFETY_LEVEL = GRMPackage.RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__COMPLEXITY = GRMPackage.RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__FAULT = GRMPackage.RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__ERROR = GRMPackage.RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__FAILURE = GRMPackage.RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__HAZARD = GRMPackage.RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__REPAIR = GRMPackage.RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT__SUBSTITUTED_BY = GRMPackage.RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The number of structural features of the '<em>Da Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_COMPONENT_FEATURE_COUNT = GRMPackage.RESOURCE_FEATURE_COUNT + 18;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Core.impl.DaServiceImpl <em>Da Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Core.impl.DaServiceImpl
	 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaService()
	 * @generated
	 */
	int DA_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__EXEC_TIME = GQAMPackage.GA_SCENARIO__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__ALLOCATED_MEMORY = GQAMPackage.GA_SCENARIO__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__USED_MEMORY = GQAMPackage.GA_SCENARIO__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__POWER_PEAK = GQAMPackage.GA_SCENARIO__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__ENERGY = GQAMPackage.GA_SCENARIO__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__BASE_NAMED_ELEMENT = GQAMPackage.GA_SCENARIO__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__SUB_USAGE = GQAMPackage.GA_SCENARIO__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__USED_RESOURCES = GQAMPackage.GA_SCENARIO__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__MSG_SIZE = GQAMPackage.GA_SCENARIO__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__ON = GQAMPackage.GA_SCENARIO__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__BASE_ACTION = GQAMPackage.GA_SCENARIO__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__BASE_BEHAVIOR = GQAMPackage.GA_SCENARIO__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__BASE_MESSAGE = GQAMPackage.GA_SCENARIO__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__DURATION = GQAMPackage.GA_SCENARIO__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__START = GQAMPackage.GA_SCENARIO__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__FINISH = GQAMPackage.GA_SCENARIO__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__CAUSE = GQAMPackage.GA_SCENARIO__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__HOST_DEMAND = GQAMPackage.GA_SCENARIO__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__HOST_DEMAND_OPS = GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__INTER_OCC_T = GQAMPackage.GA_SCENARIO__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__THROUGHPUT = GQAMPackage.GA_SCENARIO__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__RESP_T = GQAMPackage.GA_SCENARIO__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__UTILIZATION = GQAMPackage.GA_SCENARIO__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__UTILIZATION_ON_HOST = GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__ROOT = GQAMPackage.GA_SCENARIO__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__STEPS = GQAMPackage.GA_SCENARIO__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__PARENT_STEP = GQAMPackage.GA_SCENARIO__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__TIMING = GQAMPackage.GA_SCENARIO__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__EXEC_PROB = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__SS_AVAIL = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__INST_AVAIL = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__UNRELIABILITY = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__RELIABILITY = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__MISSION_TIME = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__AVAIL_LEVEL = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__RELIAB_LEVEL = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__SAFETY_LEVEL = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__COMPLEXITY = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__FAILURE = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__HAZARD = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__RECOVERY = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__CONF_LEVEL = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE__INTEG_LEVEL = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Da Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_FEATURE_COUNT = GQAMPackage.GA_SCENARIO_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Core.impl.DaStepImpl <em>Da Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Core.impl.DaStepImpl
	 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaStep()
	 * @generated
	 */
	int DA_STEP = 2;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__EXEC_TIME = DA_SERVICE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__ALLOCATED_MEMORY = DA_SERVICE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__USED_MEMORY = DA_SERVICE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__POWER_PEAK = DA_SERVICE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__ENERGY = DA_SERVICE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__BASE_NAMED_ELEMENT = DA_SERVICE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__SUB_USAGE = DA_SERVICE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__USED_RESOURCES = DA_SERVICE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__MSG_SIZE = DA_SERVICE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__ON = DA_SERVICE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__BASE_ACTION = DA_SERVICE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__BASE_BEHAVIOR = DA_SERVICE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__BASE_MESSAGE = DA_SERVICE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__DURATION = DA_SERVICE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__START = DA_SERVICE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__FINISH = DA_SERVICE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__CAUSE = DA_SERVICE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__HOST_DEMAND = DA_SERVICE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__HOST_DEMAND_OPS = DA_SERVICE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__INTER_OCC_T = DA_SERVICE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__THROUGHPUT = DA_SERVICE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__RESP_T = DA_SERVICE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__UTILIZATION = DA_SERVICE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__UTILIZATION_ON_HOST = DA_SERVICE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__ROOT = DA_SERVICE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__STEPS = DA_SERVICE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__PARENT_STEP = DA_SERVICE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__TIMING = DA_SERVICE__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__EXEC_PROB = DA_SERVICE__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__SS_AVAIL = DA_SERVICE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__INST_AVAIL = DA_SERVICE__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__UNRELIABILITY = DA_SERVICE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__RELIABILITY = DA_SERVICE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__MISSION_TIME = DA_SERVICE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__AVAIL_LEVEL = DA_SERVICE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__RELIAB_LEVEL = DA_SERVICE__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__SAFETY_LEVEL = DA_SERVICE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__COMPLEXITY = DA_SERVICE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__FAILURE = DA_SERVICE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__HAZARD = DA_SERVICE__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__RECOVERY = DA_SERVICE__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__CONF_LEVEL = DA_SERVICE__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__INTEG_LEVEL = DA_SERVICE__INTEG_LEVEL;

	/**
	 * The feature id for the '<em><b>Is Atomic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__IS_ATOMIC = DA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Block T</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__BLOCK_T = DA_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__REP = DA_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__PROB = DA_SERVICE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__PRIORITY = DA_SERVICE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Concur Res</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__CONCUR_RES = DA_SERVICE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__HOST = DA_SERVICE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Serv Demand</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__SERV_DEMAND = DA_SERVICE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Serv Count</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__SERV_COUNT = DA_SERVICE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Self Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__SELF_DELAY = DA_SERVICE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__SCENARIO = DA_SERVICE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Child Scenario</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__CHILD_SCENARIO = DA_SERVICE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__KIND = DA_SERVICE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__ERROR = DA_SERVICE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP__FAULT = DA_SERVICE_FEATURE_COUNT + 14;

	/**
	 * The number of structural features of the '<em>Da Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_STEP_FEATURE_COUNT = DA_SERVICE_FEATURE_COUNT + 15;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Core.impl.DaResistanceImpl <em>Da Resistance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Core.impl.DaResistanceImpl
	 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaResistance()
	 * @generated
	 */
	int DA_RESISTANCE = 3;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__EXEC_TIME = DA_SERVICE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__ALLOCATED_MEMORY = DA_SERVICE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__USED_MEMORY = DA_SERVICE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__POWER_PEAK = DA_SERVICE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__ENERGY = DA_SERVICE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__BASE_NAMED_ELEMENT = DA_SERVICE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__SUB_USAGE = DA_SERVICE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__USED_RESOURCES = DA_SERVICE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__MSG_SIZE = DA_SERVICE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__ON = DA_SERVICE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__BASE_ACTION = DA_SERVICE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__BASE_BEHAVIOR = DA_SERVICE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__BASE_MESSAGE = DA_SERVICE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__DURATION = DA_SERVICE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__START = DA_SERVICE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__FINISH = DA_SERVICE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__CAUSE = DA_SERVICE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__HOST_DEMAND = DA_SERVICE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__HOST_DEMAND_OPS = DA_SERVICE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__INTER_OCC_T = DA_SERVICE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__THROUGHPUT = DA_SERVICE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__RESP_T = DA_SERVICE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__UTILIZATION = DA_SERVICE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__UTILIZATION_ON_HOST = DA_SERVICE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__ROOT = DA_SERVICE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__STEPS = DA_SERVICE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__PARENT_STEP = DA_SERVICE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__TIMING = DA_SERVICE__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__EXEC_PROB = DA_SERVICE__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__SS_AVAIL = DA_SERVICE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__INST_AVAIL = DA_SERVICE__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__UNRELIABILITY = DA_SERVICE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__RELIABILITY = DA_SERVICE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__MISSION_TIME = DA_SERVICE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__AVAIL_LEVEL = DA_SERVICE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__RELIAB_LEVEL = DA_SERVICE__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__SAFETY_LEVEL = DA_SERVICE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__COMPLEXITY = DA_SERVICE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__FAILURE = DA_SERVICE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__HAZARD = DA_SERVICE__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__RECOVERY = DA_SERVICE__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__CONF_LEVEL = DA_SERVICE__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__INTEG_LEVEL = DA_SERVICE__INTEG_LEVEL;

	/**
	 * The feature id for the '<em><b>Coverage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE__COVERAGE = DA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Da Resistance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RESISTANCE_FEATURE_COUNT = DA_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Core.impl.DaRecognitionImpl <em>Da Recognition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Core.impl.DaRecognitionImpl
	 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaRecognition()
	 * @generated
	 */
	int DA_RECOGNITION = 4;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__EXEC_TIME = DA_SERVICE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__ALLOCATED_MEMORY = DA_SERVICE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__USED_MEMORY = DA_SERVICE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__POWER_PEAK = DA_SERVICE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__ENERGY = DA_SERVICE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__BASE_NAMED_ELEMENT = DA_SERVICE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__SUB_USAGE = DA_SERVICE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__USED_RESOURCES = DA_SERVICE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__MSG_SIZE = DA_SERVICE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__ON = DA_SERVICE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__BASE_ACTION = DA_SERVICE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__BASE_BEHAVIOR = DA_SERVICE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__BASE_MESSAGE = DA_SERVICE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__DURATION = DA_SERVICE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__START = DA_SERVICE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__FINISH = DA_SERVICE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__CAUSE = DA_SERVICE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__HOST_DEMAND = DA_SERVICE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__HOST_DEMAND_OPS = DA_SERVICE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__INTER_OCC_T = DA_SERVICE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__THROUGHPUT = DA_SERVICE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__RESP_T = DA_SERVICE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__UTILIZATION = DA_SERVICE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__UTILIZATION_ON_HOST = DA_SERVICE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__ROOT = DA_SERVICE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__STEPS = DA_SERVICE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__PARENT_STEP = DA_SERVICE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__TIMING = DA_SERVICE__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__EXEC_PROB = DA_SERVICE__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__SS_AVAIL = DA_SERVICE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__INST_AVAIL = DA_SERVICE__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__UNRELIABILITY = DA_SERVICE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__RELIABILITY = DA_SERVICE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__MISSION_TIME = DA_SERVICE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__AVAIL_LEVEL = DA_SERVICE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__RELIAB_LEVEL = DA_SERVICE__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__SAFETY_LEVEL = DA_SERVICE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__COMPLEXITY = DA_SERVICE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__FAILURE = DA_SERVICE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__HAZARD = DA_SERVICE__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__RECOVERY = DA_SERVICE__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__CONF_LEVEL = DA_SERVICE__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION__INTEG_LEVEL = DA_SERVICE__INTEG_LEVEL;

	/**
	 * The number of structural features of the '<em>Da Recognition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOGNITION_FEATURE_COUNT = DA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Core.impl.DaRecoveryImpl <em>Da Recovery</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Core.impl.DaRecoveryImpl
	 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaRecovery()
	 * @generated
	 */
	int DA_RECOVERY = 5;

	/**
	 * The feature id for the '<em><b>Exec Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__EXEC_TIME = DA_SERVICE__EXEC_TIME;

	/**
	 * The feature id for the '<em><b>Allocated Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__ALLOCATED_MEMORY = DA_SERVICE__ALLOCATED_MEMORY;

	/**
	 * The feature id for the '<em><b>Used Memory</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__USED_MEMORY = DA_SERVICE__USED_MEMORY;

	/**
	 * The feature id for the '<em><b>Power Peak</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__POWER_PEAK = DA_SERVICE__POWER_PEAK;

	/**
	 * The feature id for the '<em><b>Energy</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__ENERGY = DA_SERVICE__ENERGY;

	/**
	 * The feature id for the '<em><b>Base Named Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__BASE_NAMED_ELEMENT = DA_SERVICE__BASE_NAMED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Sub Usage</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__SUB_USAGE = DA_SERVICE__SUB_USAGE;

	/**
	 * The feature id for the '<em><b>Used Resources</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__USED_RESOURCES = DA_SERVICE__USED_RESOURCES;

	/**
	 * The feature id for the '<em><b>Msg Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__MSG_SIZE = DA_SERVICE__MSG_SIZE;

	/**
	 * The feature id for the '<em><b>On</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__ON = DA_SERVICE__ON;

	/**
	 * The feature id for the '<em><b>Base Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__BASE_ACTION = DA_SERVICE__BASE_ACTION;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__BASE_BEHAVIOR = DA_SERVICE__BASE_BEHAVIOR;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__BASE_MESSAGE = DA_SERVICE__BASE_MESSAGE;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__DURATION = DA_SERVICE__DURATION;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__START = DA_SERVICE__START;

	/**
	 * The feature id for the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__FINISH = DA_SERVICE__FINISH;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__CAUSE = DA_SERVICE__CAUSE;

	/**
	 * The feature id for the '<em><b>Host Demand</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__HOST_DEMAND = DA_SERVICE__HOST_DEMAND;

	/**
	 * The feature id for the '<em><b>Host Demand Ops</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__HOST_DEMAND_OPS = DA_SERVICE__HOST_DEMAND_OPS;

	/**
	 * The feature id for the '<em><b>Inter Occ T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__INTER_OCC_T = DA_SERVICE__INTER_OCC_T;

	/**
	 * The feature id for the '<em><b>Throughput</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__THROUGHPUT = DA_SERVICE__THROUGHPUT;

	/**
	 * The feature id for the '<em><b>Resp T</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__RESP_T = DA_SERVICE__RESP_T;

	/**
	 * The feature id for the '<em><b>Utilization</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__UTILIZATION = DA_SERVICE__UTILIZATION;

	/**
	 * The feature id for the '<em><b>Utilization On Host</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__UTILIZATION_ON_HOST = DA_SERVICE__UTILIZATION_ON_HOST;

	/**
	 * The feature id for the '<em><b>Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__ROOT = DA_SERVICE__ROOT;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__STEPS = DA_SERVICE__STEPS;

	/**
	 * The feature id for the '<em><b>Parent Step</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__PARENT_STEP = DA_SERVICE__PARENT_STEP;

	/**
	 * The feature id for the '<em><b>Timing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__TIMING = DA_SERVICE__TIMING;

	/**
	 * The feature id for the '<em><b>Exec Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__EXEC_PROB = DA_SERVICE__EXEC_PROB;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__SS_AVAIL = DA_SERVICE__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Inst Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__INST_AVAIL = DA_SERVICE__INST_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__UNRELIABILITY = DA_SERVICE__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__RELIABILITY = DA_SERVICE__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__MISSION_TIME = DA_SERVICE__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__AVAIL_LEVEL = DA_SERVICE__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliab Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__RELIAB_LEVEL = DA_SERVICE__RELIAB_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__SAFETY_LEVEL = DA_SERVICE__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__COMPLEXITY = DA_SERVICE__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__FAILURE = DA_SERVICE__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__HAZARD = DA_SERVICE__HAZARD;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__RECOVERY = DA_SERVICE__RECOVERY;

	/**
	 * The feature id for the '<em><b>Conf Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__CONF_LEVEL = DA_SERVICE__CONF_LEVEL;

	/**
	 * The feature id for the '<em><b>Integ Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY__INTEG_LEVEL = DA_SERVICE__INTEG_LEVEL;

	/**
	 * The number of structural features of the '<em>Da Recovery</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_RECOVERY_FEATURE_COUNT = DA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Core.impl.DaServiceModeImpl <em>Da Service Mode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Core.impl.DaServiceModeImpl
	 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaServiceMode()
	 * @generated
	 */
	int DA_SERVICE_MODE = 6;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_MODE__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Qos</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_MODE__QOS = 1;

	/**
	 * The feature id for the '<em><b>Prob</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_MODE__PROB = 2;

	/**
	 * The feature id for the '<em><b>Base State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_MODE__BASE_STATE = 3;

	/**
	 * The number of structural features of the '<em>Da Service Mode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_MODE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Core.impl.DaServiceRequestImpl <em>Da Service Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Core.impl.DaServiceRequestImpl
	 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaServiceRequest()
	 * @generated
	 */
	int DA_SERVICE_REQUEST = 7;

	/**
	 * The feature id for the '<em><b>Access Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_REQUEST__ACCESS_PROB = 0;

	/**
	 * The feature id for the '<em><b>Service Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_REQUEST__SERVICE_PROB = 1;

	/**
	 * The feature id for the '<em><b>Request</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_REQUEST__REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_REQUEST__BASE_CLASSIFIER = 3;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_REQUEST__BASE_LIFELINE = 4;

	/**
	 * The feature id for the '<em><b>Base Interaction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_REQUEST__BASE_INTERACTION = 5;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_REQUEST__BASE_INSTANCE_SPECIFICATION = 6;

	/**
	 * The number of structural features of the '<em>Da Service Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SERVICE_REQUEST_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Core.impl.DaConnectorImpl <em>Da Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Core.impl.DaConnectorImpl
	 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaConnector()
	 * @generated
	 */
	int DA_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Coupling</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__COUPLING = 0;

	/**
	 * The feature id for the '<em><b>Error Prop</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__ERROR_PROP = 1;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__FAILURE = 2;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__HAZARD = 3;

	/**
	 * The feature id for the '<em><b>Base Invocation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__BASE_INVOCATION_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Base Extend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__BASE_EXTEND = 5;

	/**
	 * The feature id for the '<em><b>Base Include</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__BASE_INCLUDE = 6;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__BASE_MESSAGE = 7;

	/**
	 * The feature id for the '<em><b>Base Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__BASE_CONNECTOR = 8;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__BASE_DEPENDENCY = 9;

	/**
	 * The feature id for the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR__BASE_ASSOCIATION = 10;

	/**
	 * The number of structural features of the '<em>Da Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONNECTOR_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Core.impl.DaChangeImpl <em>Da Change</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Core.impl.DaChangeImpl
	 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaChange()
	 * @generated
	 */
	int DA_CHANGE = 9;

	/**
	 * The feature id for the '<em><b>Threats</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CHANGE__THREATS = 0;

	/**
	 * The feature id for the '<em><b>Recognition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CHANGE__RECOGNITION = 1;

	/**
	 * The feature id for the '<em><b>Recovery</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CHANGE__RECOVERY = 2;

	/**
	 * The feature id for the '<em><b>Resistance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CHANGE__RESISTANCE = 3;

	/**
	 * The feature id for the '<em><b>Base Transition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CHANGE__BASE_TRANSITION = 4;

	/**
	 * The number of structural features of the '<em>Da Change</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CHANGE_FEATURE_COUNT = 5;

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Core.DaComponent <em>Da Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Component</em>'.
	 * @see com.masdes.dam.Core.DaComponent
	 * @generated
	 */
	EClass getDaComponent();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Core.DaComponent#isStateful <em>Stateful</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stateful</em>'.
	 * @see com.masdes.dam.Core.DaComponent#isStateful()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_Stateful();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Core.DaComponent#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getOrigin()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_Origin();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaComponent#getFailureCoverage <em>Failure Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Failure Coverage</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getFailureCoverage()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_FailureCoverage();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaComponent#getPercPermFault <em>Perc Perm Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Perc Perm Fault</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getPercPermFault()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_PercPermFault();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaComponent#getSsAvail <em>Ss Avail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ss Avail</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getSsAvail()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_SsAvail();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaComponent#getUnreliability <em>Unreliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unreliability</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getUnreliability()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_Unreliability();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaComponent#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reliability</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getReliability()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_Reliability();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaComponent#getMissionTime <em>Mission Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mission Time</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getMissionTime()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_MissionTime();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaComponent#getAvailLevel <em>Avail Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Avail Level</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getAvailLevel()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_AvailLevel();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaComponent#getReliabilityLevel <em>Reliability Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reliability Level</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getReliabilityLevel()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_ReliabilityLevel();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaComponent#getSafetyLevel <em>Safety Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Safety Level</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getSafetyLevel()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_SafetyLevel();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaComponent#getComplexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Complexity</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getComplexity()
	 * @see #getDaComponent()
	 * @generated
	 */
	EAttribute getDaComponent_Complexity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaComponent#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getFault()
	 * @see #getDaComponent()
	 * @generated
	 */
	EReference getDaComponent_Fault();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaComponent#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getError()
	 * @see #getDaComponent()
	 * @generated
	 */
	EReference getDaComponent_Error();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaComponent#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getFailure()
	 * @see #getDaComponent()
	 * @generated
	 */
	EReference getDaComponent_Failure();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaComponent#getHazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getHazard()
	 * @see #getDaComponent()
	 * @generated
	 */
	EReference getDaComponent_Hazard();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaComponent#getRepair <em>Repair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Repair</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getRepair()
	 * @see #getDaComponent()
	 * @generated
	 */
	EReference getDaComponent_Repair();

	/**
	 * Returns the meta object for the reference list '{@link com.masdes.dam.Core.DaComponent#getSubstitutedBy <em>Substituted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substituted By</em>'.
	 * @see com.masdes.dam.Core.DaComponent#getSubstitutedBy()
	 * @see #getDaComponent()
	 * @generated
	 */
	EReference getDaComponent_SubstitutedBy();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Core.DaService <em>Da Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Service</em>'.
	 * @see com.masdes.dam.Core.DaService
	 * @generated
	 */
	EClass getDaService();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getExecProb <em>Exec Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Exec Prob</em>'.
	 * @see com.masdes.dam.Core.DaService#getExecProb()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_ExecProb();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getSsAvail <em>Ss Avail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ss Avail</em>'.
	 * @see com.masdes.dam.Core.DaService#getSsAvail()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_SsAvail();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getInstAvail <em>Inst Avail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Inst Avail</em>'.
	 * @see com.masdes.dam.Core.DaService#getInstAvail()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_InstAvail();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getUnreliability <em>Unreliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unreliability</em>'.
	 * @see com.masdes.dam.Core.DaService#getUnreliability()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_Unreliability();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getReliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reliability</em>'.
	 * @see com.masdes.dam.Core.DaService#getReliability()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_Reliability();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getMissionTime <em>Mission Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mission Time</em>'.
	 * @see com.masdes.dam.Core.DaService#getMissionTime()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_MissionTime();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getAvailLevel <em>Avail Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Avail Level</em>'.
	 * @see com.masdes.dam.Core.DaService#getAvailLevel()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_AvailLevel();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getReliabLevel <em>Reliab Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reliab Level</em>'.
	 * @see com.masdes.dam.Core.DaService#getReliabLevel()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_ReliabLevel();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getSafetyLevel <em>Safety Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Safety Level</em>'.
	 * @see com.masdes.dam.Core.DaService#getSafetyLevel()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_SafetyLevel();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getComplexity <em>Complexity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Complexity</em>'.
	 * @see com.masdes.dam.Core.DaService#getComplexity()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_Complexity();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaService#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure</em>'.
	 * @see com.masdes.dam.Core.DaService#getFailure()
	 * @see #getDaService()
	 * @generated
	 */
	EReference getDaService_Failure();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaService#getHazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard</em>'.
	 * @see com.masdes.dam.Core.DaService#getHazard()
	 * @see #getDaService()
	 * @generated
	 */
	EReference getDaService_Hazard();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaService#getRecovery <em>Recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recovery</em>'.
	 * @see com.masdes.dam.Core.DaService#getRecovery()
	 * @see #getDaService()
	 * @generated
	 */
	EReference getDaService_Recovery();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getConfLevel <em>Conf Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Conf Level</em>'.
	 * @see com.masdes.dam.Core.DaService#getConfLevel()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_ConfLevel();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaService#getIntegLevel <em>Integ Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Integ Level</em>'.
	 * @see com.masdes.dam.Core.DaService#getIntegLevel()
	 * @see #getDaService()
	 * @generated
	 */
	EAttribute getDaService_IntegLevel();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Core.DaStep <em>Da Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Step</em>'.
	 * @see com.masdes.dam.Core.DaStep
	 * @generated
	 */
	EClass getDaStep();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Core.DaStep#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.masdes.dam.Core.DaStep#getKind()
	 * @see #getDaStep()
	 * @generated
	 */
	EAttribute getDaStep_Kind();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaStep#getError <em>Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error</em>'.
	 * @see com.masdes.dam.Core.DaStep#getError()
	 * @see #getDaStep()
	 * @generated
	 */
	EReference getDaStep_Error();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaStep#getFault <em>Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fault</em>'.
	 * @see com.masdes.dam.Core.DaStep#getFault()
	 * @see #getDaStep()
	 * @generated
	 */
	EReference getDaStep_Fault();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Core.DaResistance <em>Da Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Resistance</em>'.
	 * @see com.masdes.dam.Core.DaResistance
	 * @generated
	 */
	EClass getDaResistance();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Core.DaResistance#getCoverage <em>Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coverage</em>'.
	 * @see com.masdes.dam.Core.DaResistance#getCoverage()
	 * @see #getDaResistance()
	 * @generated
	 */
	EAttribute getDaResistance_Coverage();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Core.DaRecognition <em>Da Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Recognition</em>'.
	 * @see com.masdes.dam.Core.DaRecognition
	 * @generated
	 */
	EClass getDaRecognition();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Core.DaRecovery <em>Da Recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Recovery</em>'.
	 * @see com.masdes.dam.Core.DaRecovery
	 * @generated
	 */
	EClass getDaRecovery();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Core.DaServiceMode <em>Da Service Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Service Mode</em>'.
	 * @see com.masdes.dam.Core.DaServiceMode
	 * @generated
	 */
	EClass getDaServiceMode();

	/**
	 * Returns the meta object for the reference list '{@link com.masdes.dam.Core.DaServiceMode#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service</em>'.
	 * @see com.masdes.dam.Core.DaServiceMode#getService()
	 * @see #getDaServiceMode()
	 * @generated
	 */
	EReference getDaServiceMode_Service();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaServiceMode#getQos <em>Qos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qos</em>'.
	 * @see com.masdes.dam.Core.DaServiceMode#getQos()
	 * @see #getDaServiceMode()
	 * @generated
	 */
	EReference getDaServiceMode_Qos();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Core.DaServiceMode#getProb <em>Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prob</em>'.
	 * @see com.masdes.dam.Core.DaServiceMode#getProb()
	 * @see #getDaServiceMode()
	 * @generated
	 */
	EAttribute getDaServiceMode_Prob();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaServiceMode#getBase_State <em>Base State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base State</em>'.
	 * @see com.masdes.dam.Core.DaServiceMode#getBase_State()
	 * @see #getDaServiceMode()
	 * @generated
	 */
	EReference getDaServiceMode_Base_State();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Core.DaServiceRequest <em>Da Service Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Service Request</em>'.
	 * @see com.masdes.dam.Core.DaServiceRequest
	 * @generated
	 */
	EClass getDaServiceRequest();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaServiceRequest#getAccessProb <em>Access Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Access Prob</em>'.
	 * @see com.masdes.dam.Core.DaServiceRequest#getAccessProb()
	 * @see #getDaServiceRequest()
	 * @generated
	 */
	EAttribute getDaServiceRequest_AccessProb();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaServiceRequest#getServiceProb <em>Service Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service Prob</em>'.
	 * @see com.masdes.dam.Core.DaServiceRequest#getServiceProb()
	 * @see #getDaServiceRequest()
	 * @generated
	 */
	EAttribute getDaServiceRequest_ServiceProb();

	/**
	 * Returns the meta object for the reference list '{@link com.masdes.dam.Core.DaServiceRequest#getRequest <em>Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Request</em>'.
	 * @see com.masdes.dam.Core.DaServiceRequest#getRequest()
	 * @see #getDaServiceRequest()
	 * @generated
	 */
	EReference getDaServiceRequest_Request();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaServiceRequest#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see com.masdes.dam.Core.DaServiceRequest#getBase_Classifier()
	 * @see #getDaServiceRequest()
	 * @generated
	 */
	EReference getDaServiceRequest_Base_Classifier();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaServiceRequest#getBase_Lifeline <em>Base Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Lifeline</em>'.
	 * @see com.masdes.dam.Core.DaServiceRequest#getBase_Lifeline()
	 * @see #getDaServiceRequest()
	 * @generated
	 */
	EReference getDaServiceRequest_Base_Lifeline();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaServiceRequest#getBase_Interaction <em>Base Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Interaction</em>'.
	 * @see com.masdes.dam.Core.DaServiceRequest#getBase_Interaction()
	 * @see #getDaServiceRequest()
	 * @generated
	 */
	EReference getDaServiceRequest_Base_Interaction();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaServiceRequest#getBase_InstanceSpecification <em>Base Instance Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Instance Specification</em>'.
	 * @see com.masdes.dam.Core.DaServiceRequest#getBase_InstanceSpecification()
	 * @see #getDaServiceRequest()
	 * @generated
	 */
	EReference getDaServiceRequest_Base_InstanceSpecification();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Core.DaConnector <em>Da Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Connector</em>'.
	 * @see com.masdes.dam.Core.DaConnector
	 * @generated
	 */
	EClass getDaConnector();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Core.DaConnector#getCoupling <em>Coupling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coupling</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getCoupling()
	 * @see #getDaConnector()
	 * @generated
	 */
	EAttribute getDaConnector_Coupling();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaConnector#getErrorProp <em>Error Prop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Error Prop</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getErrorProp()
	 * @see #getDaConnector()
	 * @generated
	 */
	EReference getDaConnector_ErrorProp();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaConnector#getFailure <em>Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failure</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getFailure()
	 * @see #getDaConnector()
	 * @generated
	 */
	EReference getDaConnector_Failure();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Core.DaConnector#getHazard <em>Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hazard</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getHazard()
	 * @see #getDaConnector()
	 * @generated
	 */
	EReference getDaConnector_Hazard();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaConnector#getBase_InvocationAction <em>Base Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Invocation Action</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getBase_InvocationAction()
	 * @see #getDaConnector()
	 * @generated
	 */
	EReference getDaConnector_Base_InvocationAction();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaConnector#getBase_Extend <em>Base Extend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Extend</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getBase_Extend()
	 * @see #getDaConnector()
	 * @generated
	 */
	EReference getDaConnector_Base_Extend();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaConnector#getBase_Include <em>Base Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Include</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getBase_Include()
	 * @see #getDaConnector()
	 * @generated
	 */
	EReference getDaConnector_Base_Include();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaConnector#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getBase_Message()
	 * @see #getDaConnector()
	 * @generated
	 */
	EReference getDaConnector_Base_Message();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaConnector#getBase_Connector <em>Base Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Connector</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getBase_Connector()
	 * @see #getDaConnector()
	 * @generated
	 */
	EReference getDaConnector_Base_Connector();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaConnector#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getBase_Dependency()
	 * @see #getDaConnector()
	 * @generated
	 */
	EReference getDaConnector_Base_Dependency();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaConnector#getBase_Association <em>Base Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Association</em>'.
	 * @see com.masdes.dam.Core.DaConnector#getBase_Association()
	 * @see #getDaConnector()
	 * @generated
	 */
	EReference getDaConnector_Base_Association();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Core.DaChange <em>Da Change</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Change</em>'.
	 * @see com.masdes.dam.Core.DaChange
	 * @generated
	 */
	EClass getDaChange();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaChange#getThreats <em>Threats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Threats</em>'.
	 * @see com.masdes.dam.Core.DaChange#getThreats()
	 * @see #getDaChange()
	 * @generated
	 */
	EReference getDaChange_Threats();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaChange#getRecognition <em>Recognition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recognition</em>'.
	 * @see com.masdes.dam.Core.DaChange#getRecognition()
	 * @see #getDaChange()
	 * @generated
	 */
	EReference getDaChange_Recognition();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaChange#getRecovery <em>Recovery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recovery</em>'.
	 * @see com.masdes.dam.Core.DaChange#getRecovery()
	 * @see #getDaChange()
	 * @generated
	 */
	EReference getDaChange_Recovery();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaChange#getResistance <em>Resistance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resistance</em>'.
	 * @see com.masdes.dam.Core.DaChange#getResistance()
	 * @see #getDaChange()
	 * @generated
	 */
	EReference getDaChange_Resistance();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Core.DaChange#getBase_Transition <em>Base Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Transition</em>'.
	 * @see com.masdes.dam.Core.DaChange#getBase_Transition()
	 * @see #getDaChange()
	 * @generated
	 */
	EReference getDaChange_Base_Transition();

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
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.masdes.dam.Core.impl.DaComponentImpl <em>Da Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Core.impl.DaComponentImpl
		 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaComponent()
		 * @generated
		 */
		EClass DA_COMPONENT = eINSTANCE.getDaComponent();

		/**
		 * The meta object literal for the '<em><b>Stateful</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__STATEFUL = eINSTANCE.getDaComponent_Stateful();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__ORIGIN = eINSTANCE.getDaComponent_Origin();

		/**
		 * The meta object literal for the '<em><b>Failure Coverage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__FAILURE_COVERAGE = eINSTANCE.getDaComponent_FailureCoverage();

		/**
		 * The meta object literal for the '<em><b>Perc Perm Fault</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__PERC_PERM_FAULT = eINSTANCE.getDaComponent_PercPermFault();

		/**
		 * The meta object literal for the '<em><b>Ss Avail</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__SS_AVAIL = eINSTANCE.getDaComponent_SsAvail();

		/**
		 * The meta object literal for the '<em><b>Unreliability</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__UNRELIABILITY = eINSTANCE.getDaComponent_Unreliability();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__RELIABILITY = eINSTANCE.getDaComponent_Reliability();

		/**
		 * The meta object literal for the '<em><b>Mission Time</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__MISSION_TIME = eINSTANCE.getDaComponent_MissionTime();

		/**
		 * The meta object literal for the '<em><b>Avail Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__AVAIL_LEVEL = eINSTANCE.getDaComponent_AvailLevel();

		/**
		 * The meta object literal for the '<em><b>Reliability Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__RELIABILITY_LEVEL = eINSTANCE.getDaComponent_ReliabilityLevel();

		/**
		 * The meta object literal for the '<em><b>Safety Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__SAFETY_LEVEL = eINSTANCE.getDaComponent_SafetyLevel();

		/**
		 * The meta object literal for the '<em><b>Complexity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_COMPONENT__COMPLEXITY = eINSTANCE.getDaComponent_Complexity();

		/**
		 * The meta object literal for the '<em><b>Fault</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_COMPONENT__FAULT = eINSTANCE.getDaComponent_Fault();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_COMPONENT__ERROR = eINSTANCE.getDaComponent_Error();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_COMPONENT__FAILURE = eINSTANCE.getDaComponent_Failure();

		/**
		 * The meta object literal for the '<em><b>Hazard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_COMPONENT__HAZARD = eINSTANCE.getDaComponent_Hazard();

		/**
		 * The meta object literal for the '<em><b>Repair</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_COMPONENT__REPAIR = eINSTANCE.getDaComponent_Repair();

		/**
		 * The meta object literal for the '<em><b>Substituted By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_COMPONENT__SUBSTITUTED_BY = eINSTANCE.getDaComponent_SubstitutedBy();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Core.impl.DaServiceImpl <em>Da Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Core.impl.DaServiceImpl
		 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaService()
		 * @generated
		 */
		EClass DA_SERVICE = eINSTANCE.getDaService();

		/**
		 * The meta object literal for the '<em><b>Exec Prob</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__EXEC_PROB = eINSTANCE.getDaService_ExecProb();

		/**
		 * The meta object literal for the '<em><b>Ss Avail</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__SS_AVAIL = eINSTANCE.getDaService_SsAvail();

		/**
		 * The meta object literal for the '<em><b>Inst Avail</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__INST_AVAIL = eINSTANCE.getDaService_InstAvail();

		/**
		 * The meta object literal for the '<em><b>Unreliability</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__UNRELIABILITY = eINSTANCE.getDaService_Unreliability();

		/**
		 * The meta object literal for the '<em><b>Reliability</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__RELIABILITY = eINSTANCE.getDaService_Reliability();

		/**
		 * The meta object literal for the '<em><b>Mission Time</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__MISSION_TIME = eINSTANCE.getDaService_MissionTime();

		/**
		 * The meta object literal for the '<em><b>Avail Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__AVAIL_LEVEL = eINSTANCE.getDaService_AvailLevel();

		/**
		 * The meta object literal for the '<em><b>Reliab Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__RELIAB_LEVEL = eINSTANCE.getDaService_ReliabLevel();

		/**
		 * The meta object literal for the '<em><b>Safety Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__SAFETY_LEVEL = eINSTANCE.getDaService_SafetyLevel();

		/**
		 * The meta object literal for the '<em><b>Complexity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__COMPLEXITY = eINSTANCE.getDaService_Complexity();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE__FAILURE = eINSTANCE.getDaService_Failure();

		/**
		 * The meta object literal for the '<em><b>Hazard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE__HAZARD = eINSTANCE.getDaService_Hazard();

		/**
		 * The meta object literal for the '<em><b>Recovery</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE__RECOVERY = eINSTANCE.getDaService_Recovery();

		/**
		 * The meta object literal for the '<em><b>Conf Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__CONF_LEVEL = eINSTANCE.getDaService_ConfLevel();

		/**
		 * The meta object literal for the '<em><b>Integ Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE__INTEG_LEVEL = eINSTANCE.getDaService_IntegLevel();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Core.impl.DaStepImpl <em>Da Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Core.impl.DaStepImpl
		 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaStep()
		 * @generated
		 */
		EClass DA_STEP = eINSTANCE.getDaStep();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_STEP__KIND = eINSTANCE.getDaStep_Kind();

		/**
		 * The meta object literal for the '<em><b>Error</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_STEP__ERROR = eINSTANCE.getDaStep_Error();

		/**
		 * The meta object literal for the '<em><b>Fault</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_STEP__FAULT = eINSTANCE.getDaStep_Fault();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Core.impl.DaResistanceImpl <em>Da Resistance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Core.impl.DaResistanceImpl
		 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaResistance()
		 * @generated
		 */
		EClass DA_RESISTANCE = eINSTANCE.getDaResistance();

		/**
		 * The meta object literal for the '<em><b>Coverage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_RESISTANCE__COVERAGE = eINSTANCE.getDaResistance_Coverage();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Core.impl.DaRecognitionImpl <em>Da Recognition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Core.impl.DaRecognitionImpl
		 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaRecognition()
		 * @generated
		 */
		EClass DA_RECOGNITION = eINSTANCE.getDaRecognition();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Core.impl.DaRecoveryImpl <em>Da Recovery</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Core.impl.DaRecoveryImpl
		 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaRecovery()
		 * @generated
		 */
		EClass DA_RECOVERY = eINSTANCE.getDaRecovery();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Core.impl.DaServiceModeImpl <em>Da Service Mode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Core.impl.DaServiceModeImpl
		 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaServiceMode()
		 * @generated
		 */
		EClass DA_SERVICE_MODE = eINSTANCE.getDaServiceMode();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE_MODE__SERVICE = eINSTANCE.getDaServiceMode_Service();

		/**
		 * The meta object literal for the '<em><b>Qos</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE_MODE__QOS = eINSTANCE.getDaServiceMode_Qos();

		/**
		 * The meta object literal for the '<em><b>Prob</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE_MODE__PROB = eINSTANCE.getDaServiceMode_Prob();

		/**
		 * The meta object literal for the '<em><b>Base State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE_MODE__BASE_STATE = eINSTANCE.getDaServiceMode_Base_State();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Core.impl.DaServiceRequestImpl <em>Da Service Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Core.impl.DaServiceRequestImpl
		 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaServiceRequest()
		 * @generated
		 */
		EClass DA_SERVICE_REQUEST = eINSTANCE.getDaServiceRequest();

		/**
		 * The meta object literal for the '<em><b>Access Prob</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE_REQUEST__ACCESS_PROB = eINSTANCE.getDaServiceRequest_AccessProb();

		/**
		 * The meta object literal for the '<em><b>Service Prob</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SERVICE_REQUEST__SERVICE_PROB = eINSTANCE.getDaServiceRequest_ServiceProb();

		/**
		 * The meta object literal for the '<em><b>Request</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE_REQUEST__REQUEST = eINSTANCE.getDaServiceRequest_Request();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE_REQUEST__BASE_CLASSIFIER = eINSTANCE.getDaServiceRequest_Base_Classifier();

		/**
		 * The meta object literal for the '<em><b>Base Lifeline</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE_REQUEST__BASE_LIFELINE = eINSTANCE.getDaServiceRequest_Base_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Base Interaction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE_REQUEST__BASE_INTERACTION = eINSTANCE.getDaServiceRequest_Base_Interaction();

		/**
		 * The meta object literal for the '<em><b>Base Instance Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SERVICE_REQUEST__BASE_INSTANCE_SPECIFICATION = eINSTANCE.getDaServiceRequest_Base_InstanceSpecification();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Core.impl.DaConnectorImpl <em>Da Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Core.impl.DaConnectorImpl
		 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaConnector()
		 * @generated
		 */
		EClass DA_CONNECTOR = eINSTANCE.getDaConnector();

		/**
		 * The meta object literal for the '<em><b>Coupling</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_CONNECTOR__COUPLING = eINSTANCE.getDaConnector_Coupling();

		/**
		 * The meta object literal for the '<em><b>Error Prop</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CONNECTOR__ERROR_PROP = eINSTANCE.getDaConnector_ErrorProp();

		/**
		 * The meta object literal for the '<em><b>Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CONNECTOR__FAILURE = eINSTANCE.getDaConnector_Failure();

		/**
		 * The meta object literal for the '<em><b>Hazard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CONNECTOR__HAZARD = eINSTANCE.getDaConnector_Hazard();

		/**
		 * The meta object literal for the '<em><b>Base Invocation Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CONNECTOR__BASE_INVOCATION_ACTION = eINSTANCE.getDaConnector_Base_InvocationAction();

		/**
		 * The meta object literal for the '<em><b>Base Extend</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CONNECTOR__BASE_EXTEND = eINSTANCE.getDaConnector_Base_Extend();

		/**
		 * The meta object literal for the '<em><b>Base Include</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CONNECTOR__BASE_INCLUDE = eINSTANCE.getDaConnector_Base_Include();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CONNECTOR__BASE_MESSAGE = eINSTANCE.getDaConnector_Base_Message();

		/**
		 * The meta object literal for the '<em><b>Base Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CONNECTOR__BASE_CONNECTOR = eINSTANCE.getDaConnector_Base_Connector();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CONNECTOR__BASE_DEPENDENCY = eINSTANCE.getDaConnector_Base_Dependency();

		/**
		 * The meta object literal for the '<em><b>Base Association</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CONNECTOR__BASE_ASSOCIATION = eINSTANCE.getDaConnector_Base_Association();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Core.impl.DaChangeImpl <em>Da Change</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Core.impl.DaChangeImpl
		 * @see com.masdes.dam.Core.impl.CorePackageImpl#getDaChange()
		 * @generated
		 */
		EClass DA_CHANGE = eINSTANCE.getDaChange();

		/**
		 * The meta object literal for the '<em><b>Threats</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CHANGE__THREATS = eINSTANCE.getDaChange_Threats();

		/**
		 * The meta object literal for the '<em><b>Recognition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CHANGE__RECOGNITION = eINSTANCE.getDaChange_Recognition();

		/**
		 * The meta object literal for the '<em><b>Recovery</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CHANGE__RECOVERY = eINSTANCE.getDaChange_Recovery();

		/**
		 * The meta object literal for the '<em><b>Resistance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CHANGE__RESISTANCE = eINSTANCE.getDaChange_Resistance();

		/**
		 * The meta object literal for the '<em><b>Base Transition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_CHANGE__BASE_TRANSITION = eINSTANCE.getDaChange_Base_Transition();

	}

} //CorePackage
