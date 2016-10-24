/**
 */
package com.masdes.dam.Complex_Data_Types;

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
 * @see com.masdes.dam.Complex_Data_Types.Complex_Data_TypesFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Data_Types'"
 * @generated
 */
public interface Complex_Data_TypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Complex_Data_Types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.masdes.dam/libraries/Complex_Data_Types/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Complex_Data_Types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Complex_Data_TypesPackage eINSTANCE = com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorImpl <em>Da Error</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Complex_Data_Types.impl.DaErrorImpl
	 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaError()
	 * @generated
	 */
	int DA_ERROR = 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR__LATENCY = 0;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR__PROBABILITY = 1;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR__CAUSE = 2;

	/**
	 * The feature id for the '<em><b>Effect F</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR__EFFECT_F = 3;

	/**
	 * The feature id for the '<em><b>Effect H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR__EFFECT_H = 4;

	/**
	 * The number of structural features of the '<em>Da Error</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl <em>Da Fault</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl
	 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaFault()
	 * @generated
	 */
	int DA_FAULT = 1;

	/**
	 * The feature id for the '<em><b>Occurrence Rate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__OCCURRENCE_RATE = 0;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__LATENCY = 1;

	/**
	 * The feature id for the '<em><b>Occurrence Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__OCCURRENCE_PROB = 2;

	/**
	 * The feature id for the '<em><b>Occurrence Dist</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__OCCURRENCE_DIST = 3;

	/**
	 * The feature id for the '<em><b>Persistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__PERSISTENCY = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__DURATION = 5;

	/**
	 * The feature id for the '<em><b>Effect E</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__EFFECT_E = 6;

	/**
	 * The feature id for the '<em><b>Effect F</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__EFFECT_F = 7;

	/**
	 * The feature id for the '<em><b>Effect H</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__EFFECT_H = 8;

	/**
	 * The feature id for the '<em><b>Phase Creation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__PHASE_CREATION = 9;

	/**
	 * The feature id for the '<em><b>Sys Boundaries</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__SYS_BOUNDARIES = 10;

	/**
	 * The feature id for the '<em><b>Phenom Cause</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__PHENOM_CAUSE = 11;

	/**
	 * The feature id for the '<em><b>Dimension</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__DIMENSION = 12;

	/**
	 * The feature id for the '<em><b>Objective</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__OBJECTIVE = 13;

	/**
	 * The feature id for the '<em><b>Intent</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__INTENT = 14;

	/**
	 * The feature id for the '<em><b>Capability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT__CAPABILITY = 15;

	/**
	 * The number of structural features of the '<em>Da Fault</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAULT_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl <em>Da Failure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl
	 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaFailure()
	 * @generated
	 */
	int DA_FAILURE = 2;

	/**
	 * The feature id for the '<em><b>Occurrence Rate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__OCCURRENCE_RATE = 0;

	/**
	 * The feature id for the '<em><b>MTTF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__MTTF = 1;

	/**
	 * The feature id for the '<em><b>MTBF</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__MTBF = 2;

	/**
	 * The feature id for the '<em><b>Occurrence Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__OCCURRENCE_PROB = 3;

	/**
	 * The feature id for the '<em><b>Occurrence Dist</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__OCCURRENCE_DIST = 4;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__DOMAIN = 5;

	/**
	 * The feature id for the '<em><b>Consistency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__CONSISTENCY = 6;

	/**
	 * The feature id for the '<em><b>Consequence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__CONSEQUENCE = 7;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__RISK = 8;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__COST = 9;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__CONDITION = 10;

	/**
	 * The feature id for the '<em><b>Cause F</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__CAUSE_F = 11;

	/**
	 * The feature id for the '<em><b>Cause E</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__CAUSE_E = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__DESCRIPTION = 13;

	/**
	 * The feature id for the '<em><b>Detectability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE__DETECTABILITY = 14;

	/**
	 * The number of structural features of the '<em>Da Failure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_FAILURE_FEATURE_COUNT = 15;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl <em>Da Hazard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl
	 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaHazard()
	 * @generated
	 */
	int DA_HAZARD = 3;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Severity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__SEVERITY = 1;

	/**
	 * The feature id for the '<em><b>Occurrence Prob</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__OCCURRENCE_PROB = 2;

	/**
	 * The feature id for the '<em><b>Likelihood</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__LIKELIHOOD = 3;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Latency</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__LATENCY = 5;

	/**
	 * The feature id for the '<em><b>Accident Likelihood</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__ACCIDENT_LIKELIHOOD = 6;

	/**
	 * The feature id for the '<em><b>Risk</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__RISK = 7;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__COST = 8;

	/**
	 * The feature id for the '<em><b>Guideword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__GUIDEWORD = 9;

	/**
	 * The feature id for the '<em><b>Accident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__ACCIDENT = 10;

	/**
	 * The feature id for the '<em><b>Cause F</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__CAUSE_F = 11;

	/**
	 * The feature id for the '<em><b>Cause E</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__CAUSE_E = 12;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD__DESCRIPTION = 13;

	/**
	 * The number of structural features of the '<em>Da Hazard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_HAZARD_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorPropagationImpl <em>Da Error Propagation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Complex_Data_Types.impl.DaErrorPropagationImpl
	 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaErrorPropagation()
	 * @generated
	 */
	int DA_ERROR_PROPAGATION = 4;

	/**
	 * The feature id for the '<em><b>Probability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_PROPAGATION__PROBABILITY = 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_PROPAGATION__FROM = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_PROPAGATION__TO = 2;

	/**
	 * The feature id for the '<em><b>Cause</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_PROPAGATION__CAUSE = 3;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_PROPAGATION__EFFECT = 4;

	/**
	 * The number of structural features of the '<em>Da Error Propagation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ERROR_PROPAGATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaRecImpl <em>Da Rec</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Complex_Data_Types.impl.DaRecImpl
	 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaRec()
	 * @generated
	 */
	int DA_REC = 5;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REC__RATE = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REC__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REC__DISTRIBUTION = 2;

	/**
	 * The feature id for the '<em><b>Coverage Factor</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REC__COVERAGE_FACTOR = 3;

	/**
	 * The number of structural features of the '<em>Da Rec</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REC_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaRepairImpl <em>Da Repair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Complex_Data_Types.impl.DaRepairImpl
	 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaRepair()
	 * @generated
	 */
	int DA_REPAIR = 6;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPAIR__RATE = 0;

	/**
	 * The feature id for the '<em><b>MTTR</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPAIR__MTTR = 1;

	/**
	 * The feature id for the '<em><b>Distribution</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPAIR__DISTRIBUTION = 2;

	/**
	 * The number of structural features of the '<em>Da Repair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REPAIR_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaSurvivabilityImpl <em>Da Survivability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Complex_Data_Types.impl.DaSurvivabilityImpl
	 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaSurvivability()
	 * @generated
	 */
	int DA_SURVIVABILITY = 7;

	/**
	 * The feature id for the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SURVIVABILITY__METRIC = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SURVIVABILITY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Da Survivability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SURVIVABILITY_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Complex_Data_Types.DaError <em>Da Error</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Error</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaError
	 * @generated
	 */
	EClass getDaError();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaError#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Latency</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaError#getLatency()
	 * @see #getDaError()
	 * @generated
	 */
	EAttribute getDaError_Latency();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaError#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Probability</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaError#getProbability()
	 * @see #getDaError()
	 * @generated
	 */
	EAttribute getDaError_Probability();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Complex_Data_Types.DaError#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cause</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaError#getCause()
	 * @see #getDaError()
	 * @generated
	 */
	EReference getDaError_Cause();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Complex_Data_Types.DaError#getEffectF <em>Effect F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect F</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaError#getEffectF()
	 * @see #getDaError()
	 * @generated
	 */
	EReference getDaError_EffectF();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Complex_Data_Types.DaError#getEffectH <em>Effect H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect H</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaError#getEffectH()
	 * @see #getDaError()
	 * @generated
	 */
	EReference getDaError_EffectH();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Complex_Data_Types.DaFault <em>Da Fault</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Fault</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault
	 * @generated
	 */
	EClass getDaFault();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getOccurrenceRate <em>Occurrence Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Occurrence Rate</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getOccurrenceRate()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_OccurrenceRate();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Latency</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getLatency()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_Latency();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getOccurrenceProb <em>Occurrence Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Occurrence Prob</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getOccurrenceProb()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_OccurrenceProb();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getOccurrenceDist <em>Occurrence Dist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Occurrence Dist</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getOccurrenceDist()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_OccurrenceDist();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaFault#getPersistency <em>Persistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistency</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getPersistency()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_Persistency();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Duration</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getDuration()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getEffectE <em>Effect E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect E</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getEffectE()
	 * @see #getDaFault()
	 * @generated
	 */
	EReference getDaFault_EffectE();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getEffectF <em>Effect F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect F</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getEffectF()
	 * @see #getDaFault()
	 * @generated
	 */
	EReference getDaFault_EffectF();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getEffectH <em>Effect H</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect H</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getEffectH()
	 * @see #getDaFault()
	 * @generated
	 */
	EReference getDaFault_EffectH();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getPhaseCreation <em>Phase Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phase Creation</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getPhaseCreation()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_PhaseCreation();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getSysBoundaries <em>Sys Boundaries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Sys Boundaries</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getSysBoundaries()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_SysBoundaries();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getPhenomCause <em>Phenom Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Phenom Cause</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getPhenomCause()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_PhenomCause();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getDimension <em>Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dimension</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getDimension()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_Dimension();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getObjective <em>Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Objective</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getObjective()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_Objective();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getIntent <em>Intent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Intent</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getIntent()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_Intent();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFault#getCapability <em>Capability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Capability</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFault#getCapability()
	 * @see #getDaFault()
	 * @generated
	 */
	EAttribute getDaFault_Capability();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Complex_Data_Types.DaFailure <em>Da Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Failure</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure
	 * @generated
	 */
	EClass getDaFailure();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getOccurrenceRate <em>Occurrence Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Occurrence Rate</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getOccurrenceRate()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_OccurrenceRate();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getMTTF <em>MTTF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>MTTF</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getMTTF()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_MTTF();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getMTBF <em>MTBF</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>MTBF</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getMTBF()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_MTBF();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getOccurrenceProb <em>Occurrence Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Occurrence Prob</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getOccurrenceProb()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_OccurrenceProb();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getOccurrenceDist <em>Occurrence Dist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Occurrence Dist</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getOccurrenceDist()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_OccurrenceDist();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getDomain()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_Domain();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getConsistency <em>Consistency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Consistency</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getConsistency()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_Consistency();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getConsequence <em>Consequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Consequence</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getConsequence()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_Consequence();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Risk</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getRisk()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_Risk();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cost</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getCost()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_Cost();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getCondition()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getCauseF <em>Cause F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cause F</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getCauseF()
	 * @see #getDaFailure()
	 * @generated
	 */
	EReference getDaFailure_CauseF();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getCauseE <em>Cause E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cause E</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getCauseE()
	 * @see #getDaFailure()
	 * @generated
	 */
	EReference getDaFailure_CauseE();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getDescription()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_Description();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaFailure#getDetectability <em>Detectability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Detectability</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaFailure#getDetectability()
	 * @see #getDaFailure()
	 * @generated
	 */
	EAttribute getDaFailure_Detectability();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Complex_Data_Types.DaHazard <em>Da Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Hazard</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard
	 * @generated
	 */
	EClass getDaHazard();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Origin</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getOrigin()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_Origin();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getSeverity <em>Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Severity</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getSeverity()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_Severity();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getOccurrenceProb <em>Occurrence Prob</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Occurrence Prob</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getOccurrenceProb()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_OccurrenceProb();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getLikelihood <em>Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Likelihood</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getLikelihood()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_Likelihood();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Level</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getLevel()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_Level();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getLatency <em>Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Latency</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getLatency()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_Latency();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getAccidentLikelihood <em>Accident Likelihood</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Accident Likelihood</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getAccidentLikelihood()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_AccidentLikelihood();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getRisk <em>Risk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Risk</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getRisk()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_Risk();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cost</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getCost()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_Cost();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getGuideword <em>Guideword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guideword</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getGuideword()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_Guideword();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getAccident <em>Accident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accident</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getAccident()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_Accident();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getCauseF <em>Cause F</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cause F</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getCauseF()
	 * @see #getDaHazard()
	 * @generated
	 */
	EReference getDaHazard_CauseF();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getCauseE <em>Cause E</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cause E</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getCauseE()
	 * @see #getDaHazard()
	 * @generated
	 */
	EReference getDaHazard_CauseE();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaHazard#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaHazard#getDescription()
	 * @see #getDaHazard()
	 * @generated
	 */
	EAttribute getDaHazard_Description();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation <em>Da Error Propagation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Error Propagation</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaErrorPropagation
	 * @generated
	 */
	EClass getDaErrorPropagation();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getProbability <em>Probability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Probability</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getProbability()
	 * @see #getDaErrorPropagation()
	 * @generated
	 */
	EAttribute getDaErrorPropagation_Probability();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getFrom()
	 * @see #getDaErrorPropagation()
	 * @generated
	 */
	EAttribute getDaErrorPropagation_From();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getTo()
	 * @see #getDaErrorPropagation()
	 * @generated
	 */
	EAttribute getDaErrorPropagation_To();

	/**
	 * Returns the meta object for the containment reference '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getCause <em>Cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cause</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getCause()
	 * @see #getDaErrorPropagation()
	 * @generated
	 */
	EReference getDaErrorPropagation_Cause();

	/**
	 * Returns the meta object for the containment reference '{@link com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaErrorPropagation#getEffect()
	 * @see #getDaErrorPropagation()
	 * @generated
	 */
	EReference getDaErrorPropagation_Effect();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Complex_Data_Types.DaRec <em>Da Rec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Rec</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaRec
	 * @generated
	 */
	EClass getDaRec();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaRec#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rate</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaRec#getRate()
	 * @see #getDaRec()
	 * @generated
	 */
	EAttribute getDaRec_Rate();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaRec#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Duration</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaRec#getDuration()
	 * @see #getDaRec()
	 * @generated
	 */
	EAttribute getDaRec_Duration();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaRec#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Distribution</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaRec#getDistribution()
	 * @see #getDaRec()
	 * @generated
	 */
	EAttribute getDaRec_Distribution();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaRec#getCoverageFactor <em>Coverage Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coverage Factor</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaRec#getCoverageFactor()
	 * @see #getDaRec()
	 * @generated
	 */
	EAttribute getDaRec_CoverageFactor();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Complex_Data_Types.DaRepair <em>Da Repair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Repair</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaRepair
	 * @generated
	 */
	EClass getDaRepair();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaRepair#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rate</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaRepair#getRate()
	 * @see #getDaRepair()
	 * @generated
	 */
	EAttribute getDaRepair_Rate();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaRepair#getMTTR <em>MTTR</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>MTTR</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaRepair#getMTTR()
	 * @see #getDaRepair()
	 * @generated
	 */
	EAttribute getDaRepair_MTTR();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaRepair#getDistribution <em>Distribution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Distribution</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaRepair#getDistribution()
	 * @see #getDaRepair()
	 * @generated
	 */
	EAttribute getDaRepair_Distribution();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Complex_Data_Types.DaSurvivability <em>Da Survivability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Survivability</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaSurvivability
	 * @generated
	 */
	EClass getDaSurvivability();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Complex_Data_Types.DaSurvivability#getMetric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metric</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaSurvivability#getMetric()
	 * @see #getDaSurvivability()
	 * @generated
	 */
	EAttribute getDaSurvivability_Metric();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Complex_Data_Types.DaSurvivability#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see com.masdes.dam.Complex_Data_Types.DaSurvivability#getValue()
	 * @see #getDaSurvivability()
	 * @generated
	 */
	EAttribute getDaSurvivability_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Complex_Data_TypesFactory getComplex_Data_TypesFactory();

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
		 * The meta object literal for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorImpl <em>Da Error</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Complex_Data_Types.impl.DaErrorImpl
		 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaError()
		 * @generated
		 */
		EClass DA_ERROR = eINSTANCE.getDaError();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_ERROR__LATENCY = eINSTANCE.getDaError_Latency();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_ERROR__PROBABILITY = eINSTANCE.getDaError_Probability();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_ERROR__CAUSE = eINSTANCE.getDaError_Cause();

		/**
		 * The meta object literal for the '<em><b>Effect F</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_ERROR__EFFECT_F = eINSTANCE.getDaError_EffectF();

		/**
		 * The meta object literal for the '<em><b>Effect H</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_ERROR__EFFECT_H = eINSTANCE.getDaError_EffectH();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl <em>Da Fault</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl
		 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaFault()
		 * @generated
		 */
		EClass DA_FAULT = eINSTANCE.getDaFault();

		/**
		 * The meta object literal for the '<em><b>Occurrence Rate</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__OCCURRENCE_RATE = eINSTANCE.getDaFault_OccurrenceRate();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__LATENCY = eINSTANCE.getDaFault_Latency();

		/**
		 * The meta object literal for the '<em><b>Occurrence Prob</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__OCCURRENCE_PROB = eINSTANCE.getDaFault_OccurrenceProb();

		/**
		 * The meta object literal for the '<em><b>Occurrence Dist</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__OCCURRENCE_DIST = eINSTANCE.getDaFault_OccurrenceDist();

		/**
		 * The meta object literal for the '<em><b>Persistency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__PERSISTENCY = eINSTANCE.getDaFault_Persistency();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__DURATION = eINSTANCE.getDaFault_Duration();

		/**
		 * The meta object literal for the '<em><b>Effect E</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_FAULT__EFFECT_E = eINSTANCE.getDaFault_EffectE();

		/**
		 * The meta object literal for the '<em><b>Effect F</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_FAULT__EFFECT_F = eINSTANCE.getDaFault_EffectF();

		/**
		 * The meta object literal for the '<em><b>Effect H</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_FAULT__EFFECT_H = eINSTANCE.getDaFault_EffectH();

		/**
		 * The meta object literal for the '<em><b>Phase Creation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__PHASE_CREATION = eINSTANCE.getDaFault_PhaseCreation();

		/**
		 * The meta object literal for the '<em><b>Sys Boundaries</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__SYS_BOUNDARIES = eINSTANCE.getDaFault_SysBoundaries();

		/**
		 * The meta object literal for the '<em><b>Phenom Cause</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__PHENOM_CAUSE = eINSTANCE.getDaFault_PhenomCause();

		/**
		 * The meta object literal for the '<em><b>Dimension</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__DIMENSION = eINSTANCE.getDaFault_Dimension();

		/**
		 * The meta object literal for the '<em><b>Objective</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__OBJECTIVE = eINSTANCE.getDaFault_Objective();

		/**
		 * The meta object literal for the '<em><b>Intent</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__INTENT = eINSTANCE.getDaFault_Intent();

		/**
		 * The meta object literal for the '<em><b>Capability</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAULT__CAPABILITY = eINSTANCE.getDaFault_Capability();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl <em>Da Failure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl
		 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaFailure()
		 * @generated
		 */
		EClass DA_FAILURE = eINSTANCE.getDaFailure();

		/**
		 * The meta object literal for the '<em><b>Occurrence Rate</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__OCCURRENCE_RATE = eINSTANCE.getDaFailure_OccurrenceRate();

		/**
		 * The meta object literal for the '<em><b>MTTF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__MTTF = eINSTANCE.getDaFailure_MTTF();

		/**
		 * The meta object literal for the '<em><b>MTBF</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__MTBF = eINSTANCE.getDaFailure_MTBF();

		/**
		 * The meta object literal for the '<em><b>Occurrence Prob</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__OCCURRENCE_PROB = eINSTANCE.getDaFailure_OccurrenceProb();

		/**
		 * The meta object literal for the '<em><b>Occurrence Dist</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__OCCURRENCE_DIST = eINSTANCE.getDaFailure_OccurrenceDist();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__DOMAIN = eINSTANCE.getDaFailure_Domain();

		/**
		 * The meta object literal for the '<em><b>Consistency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__CONSISTENCY = eINSTANCE.getDaFailure_Consistency();

		/**
		 * The meta object literal for the '<em><b>Consequence</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__CONSEQUENCE = eINSTANCE.getDaFailure_Consequence();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__RISK = eINSTANCE.getDaFailure_Risk();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__COST = eINSTANCE.getDaFailure_Cost();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__CONDITION = eINSTANCE.getDaFailure_Condition();

		/**
		 * The meta object literal for the '<em><b>Cause F</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_FAILURE__CAUSE_F = eINSTANCE.getDaFailure_CauseF();

		/**
		 * The meta object literal for the '<em><b>Cause E</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_FAILURE__CAUSE_E = eINSTANCE.getDaFailure_CauseE();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__DESCRIPTION = eINSTANCE.getDaFailure_Description();

		/**
		 * The meta object literal for the '<em><b>Detectability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_FAILURE__DETECTABILITY = eINSTANCE.getDaFailure_Detectability();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl <em>Da Hazard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl
		 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaHazard()
		 * @generated
		 */
		EClass DA_HAZARD = eINSTANCE.getDaHazard();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__ORIGIN = eINSTANCE.getDaHazard_Origin();

		/**
		 * The meta object literal for the '<em><b>Severity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__SEVERITY = eINSTANCE.getDaHazard_Severity();

		/**
		 * The meta object literal for the '<em><b>Occurrence Prob</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__OCCURRENCE_PROB = eINSTANCE.getDaHazard_OccurrenceProb();

		/**
		 * The meta object literal for the '<em><b>Likelihood</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__LIKELIHOOD = eINSTANCE.getDaHazard_Likelihood();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__LEVEL = eINSTANCE.getDaHazard_Level();

		/**
		 * The meta object literal for the '<em><b>Latency</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__LATENCY = eINSTANCE.getDaHazard_Latency();

		/**
		 * The meta object literal for the '<em><b>Accident Likelihood</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__ACCIDENT_LIKELIHOOD = eINSTANCE.getDaHazard_AccidentLikelihood();

		/**
		 * The meta object literal for the '<em><b>Risk</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__RISK = eINSTANCE.getDaHazard_Risk();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__COST = eINSTANCE.getDaHazard_Cost();

		/**
		 * The meta object literal for the '<em><b>Guideword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__GUIDEWORD = eINSTANCE.getDaHazard_Guideword();

		/**
		 * The meta object literal for the '<em><b>Accident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__ACCIDENT = eINSTANCE.getDaHazard_Accident();

		/**
		 * The meta object literal for the '<em><b>Cause F</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_HAZARD__CAUSE_F = eINSTANCE.getDaHazard_CauseF();

		/**
		 * The meta object literal for the '<em><b>Cause E</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_HAZARD__CAUSE_E = eINSTANCE.getDaHazard_CauseE();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_HAZARD__DESCRIPTION = eINSTANCE.getDaHazard_Description();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaErrorPropagationImpl <em>Da Error Propagation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Complex_Data_Types.impl.DaErrorPropagationImpl
		 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaErrorPropagation()
		 * @generated
		 */
		EClass DA_ERROR_PROPAGATION = eINSTANCE.getDaErrorPropagation();

		/**
		 * The meta object literal for the '<em><b>Probability</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_ERROR_PROPAGATION__PROBABILITY = eINSTANCE.getDaErrorPropagation_Probability();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_ERROR_PROPAGATION__FROM = eINSTANCE.getDaErrorPropagation_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_ERROR_PROPAGATION__TO = eINSTANCE.getDaErrorPropagation_To();

		/**
		 * The meta object literal for the '<em><b>Cause</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_ERROR_PROPAGATION__CAUSE = eINSTANCE.getDaErrorPropagation_Cause();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_ERROR_PROPAGATION__EFFECT = eINSTANCE.getDaErrorPropagation_Effect();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaRecImpl <em>Da Rec</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Complex_Data_Types.impl.DaRecImpl
		 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaRec()
		 * @generated
		 */
		EClass DA_REC = eINSTANCE.getDaRec();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_REC__RATE = eINSTANCE.getDaRec_Rate();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_REC__DURATION = eINSTANCE.getDaRec_Duration();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_REC__DISTRIBUTION = eINSTANCE.getDaRec_Distribution();

		/**
		 * The meta object literal for the '<em><b>Coverage Factor</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_REC__COVERAGE_FACTOR = eINSTANCE.getDaRec_CoverageFactor();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaRepairImpl <em>Da Repair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Complex_Data_Types.impl.DaRepairImpl
		 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaRepair()
		 * @generated
		 */
		EClass DA_REPAIR = eINSTANCE.getDaRepair();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_REPAIR__RATE = eINSTANCE.getDaRepair_Rate();

		/**
		 * The meta object literal for the '<em><b>MTTR</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_REPAIR__MTTR = eINSTANCE.getDaRepair_MTTR();

		/**
		 * The meta object literal for the '<em><b>Distribution</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_REPAIR__DISTRIBUTION = eINSTANCE.getDaRepair_Distribution();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Complex_Data_Types.impl.DaSurvivabilityImpl <em>Da Survivability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Complex_Data_Types.impl.DaSurvivabilityImpl
		 * @see com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl#getDaSurvivability()
		 * @generated
		 */
		EClass DA_SURVIVABILITY = eINSTANCE.getDaSurvivability();

		/**
		 * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SURVIVABILITY__METRIC = eINSTANCE.getDaSurvivability_Metric();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SURVIVABILITY__VALUE = eINSTANCE.getDaSurvivability_Value();

	}

} //Complex_Data_TypesPackage
