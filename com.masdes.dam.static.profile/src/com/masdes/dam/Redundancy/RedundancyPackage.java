/**
 */
package com.masdes.dam.Redundancy;

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
 * @see com.masdes.dam.Redundancy.RedundancyFactory
 * @model kind="package"
 * @generated
 */
public interface RedundancyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Redundancy";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.masdes.dam/profiles/Redundancy/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Redundancy";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RedundancyPackage eINSTANCE = com.masdes.dam.Redundancy.impl.RedundancyPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.masdes.dam.Redundancy.impl.DaControllerImpl <em>Da Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Redundancy.impl.DaControllerImpl
	 * @see com.masdes.dam.Redundancy.impl.RedundancyPackageImpl#getDaController()
	 * @generated
	 */
	int DA_CONTROLLER = 0;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__RES_MULT = CorePackage.DA_COMPONENT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__IS_PROTECTED = CorePackage.DA_COMPONENT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__IS_ACTIVE = CorePackage.DA_COMPONENT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__BASE_PROPERTY = CorePackage.DA_COMPONENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__BASE_INSTANCE_SPECIFICATION = CorePackage.DA_COMPONENT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__BASE_CLASSIFIER = CorePackage.DA_COMPONENT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__BASE_LIFELINE = CorePackage.DA_COMPONENT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__BASE_CONNECTABLE_ELEMENT = CorePackage.DA_COMPONENT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__STATEFUL = CorePackage.DA_COMPONENT__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__ORIGIN = CorePackage.DA_COMPONENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__FAILURE_COVERAGE = CorePackage.DA_COMPONENT__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__PERC_PERM_FAULT = CorePackage.DA_COMPONENT__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__SS_AVAIL = CorePackage.DA_COMPONENT__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__UNRELIABILITY = CorePackage.DA_COMPONENT__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__RELIABILITY = CorePackage.DA_COMPONENT__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__MISSION_TIME = CorePackage.DA_COMPONENT__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__AVAIL_LEVEL = CorePackage.DA_COMPONENT__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__RELIABILITY_LEVEL = CorePackage.DA_COMPONENT__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__SAFETY_LEVEL = CorePackage.DA_COMPONENT__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__COMPLEXITY = CorePackage.DA_COMPONENT__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__FAULT = CorePackage.DA_COMPONENT__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__ERROR = CorePackage.DA_COMPONENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__FAILURE = CorePackage.DA_COMPONENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__HAZARD = CorePackage.DA_COMPONENT__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__REPAIR = CorePackage.DA_COMPONENT__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER__SUBSTITUTED_BY = CorePackage.DA_COMPONENT__SUBSTITUTED_BY;

	/**
	 * The number of structural features of the '<em>Da Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_CONTROLLER_FEATURE_COUNT = CorePackage.DA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Redundancy.impl.DaVariantImpl <em>Da Variant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Redundancy.impl.DaVariantImpl
	 * @see com.masdes.dam.Redundancy.impl.RedundancyPackageImpl#getDaVariant()
	 * @generated
	 */
	int DA_VARIANT = 1;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__RES_MULT = CorePackage.DA_COMPONENT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__IS_PROTECTED = CorePackage.DA_COMPONENT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__IS_ACTIVE = CorePackage.DA_COMPONENT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__BASE_PROPERTY = CorePackage.DA_COMPONENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__BASE_INSTANCE_SPECIFICATION = CorePackage.DA_COMPONENT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__BASE_CLASSIFIER = CorePackage.DA_COMPONENT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__BASE_LIFELINE = CorePackage.DA_COMPONENT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__BASE_CONNECTABLE_ELEMENT = CorePackage.DA_COMPONENT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__STATEFUL = CorePackage.DA_COMPONENT__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__ORIGIN = CorePackage.DA_COMPONENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__FAILURE_COVERAGE = CorePackage.DA_COMPONENT__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__PERC_PERM_FAULT = CorePackage.DA_COMPONENT__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__SS_AVAIL = CorePackage.DA_COMPONENT__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__UNRELIABILITY = CorePackage.DA_COMPONENT__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__RELIABILITY = CorePackage.DA_COMPONENT__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__MISSION_TIME = CorePackage.DA_COMPONENT__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__AVAIL_LEVEL = CorePackage.DA_COMPONENT__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__RELIABILITY_LEVEL = CorePackage.DA_COMPONENT__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__SAFETY_LEVEL = CorePackage.DA_COMPONENT__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__COMPLEXITY = CorePackage.DA_COMPONENT__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__FAULT = CorePackage.DA_COMPONENT__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__ERROR = CorePackage.DA_COMPONENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__FAILURE = CorePackage.DA_COMPONENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__HAZARD = CorePackage.DA_COMPONENT__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__REPAIR = CorePackage.DA_COMPONENT__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT__SUBSTITUTED_BY = CorePackage.DA_COMPONENT__SUBSTITUTED_BY;

	/**
	 * The number of structural features of the '<em>Da Variant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_VARIANT_FEATURE_COUNT = CorePackage.DA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Redundancy.impl.DaAdjudicatorImpl <em>Da Adjudicator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Redundancy.impl.DaAdjudicatorImpl
	 * @see com.masdes.dam.Redundancy.impl.RedundancyPackageImpl#getDaAdjudicator()
	 * @generated
	 */
	int DA_ADJUDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__RES_MULT = CorePackage.DA_COMPONENT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__IS_PROTECTED = CorePackage.DA_COMPONENT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__IS_ACTIVE = CorePackage.DA_COMPONENT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__BASE_PROPERTY = CorePackage.DA_COMPONENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__BASE_INSTANCE_SPECIFICATION = CorePackage.DA_COMPONENT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__BASE_CLASSIFIER = CorePackage.DA_COMPONENT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__BASE_LIFELINE = CorePackage.DA_COMPONENT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__BASE_CONNECTABLE_ELEMENT = CorePackage.DA_COMPONENT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__STATEFUL = CorePackage.DA_COMPONENT__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__ORIGIN = CorePackage.DA_COMPONENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__FAILURE_COVERAGE = CorePackage.DA_COMPONENT__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__PERC_PERM_FAULT = CorePackage.DA_COMPONENT__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__SS_AVAIL = CorePackage.DA_COMPONENT__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__UNRELIABILITY = CorePackage.DA_COMPONENT__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__RELIABILITY = CorePackage.DA_COMPONENT__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__MISSION_TIME = CorePackage.DA_COMPONENT__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__AVAIL_LEVEL = CorePackage.DA_COMPONENT__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__RELIABILITY_LEVEL = CorePackage.DA_COMPONENT__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__SAFETY_LEVEL = CorePackage.DA_COMPONENT__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__COMPLEXITY = CorePackage.DA_COMPONENT__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__FAULT = CorePackage.DA_COMPONENT__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__ERROR = CorePackage.DA_COMPONENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__FAILURE = CorePackage.DA_COMPONENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__HAZARD = CorePackage.DA_COMPONENT__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__REPAIR = CorePackage.DA_COMPONENT__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__SUBSTITUTED_BY = CorePackage.DA_COMPONENT__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Error Detec Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR__ERROR_DETEC_COVERAGE = CorePackage.DA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Da Adjudicator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_ADJUDICATOR_FEATURE_COUNT = CorePackage.DA_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Redundancy.impl.DaRedundantStructureImpl <em>Da Redundant Structure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Redundancy.impl.DaRedundantStructureImpl
	 * @see com.masdes.dam.Redundancy.impl.RedundancyPackageImpl#getDaRedundantStructure()
	 * @generated
	 */
	int DA_REDUNDANT_STRUCTURE = 3;

	/**
	 * The feature id for the '<em><b>Common Mode Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REDUNDANT_STRUCTURE__COMMON_MODE_FAILURE = 0;

	/**
	 * The feature id for the '<em><b>Common Mode Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REDUNDANT_STRUCTURE__COMMON_MODE_HAZARD = 1;

	/**
	 * The feature id for the '<em><b>FTlevel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REDUNDANT_STRUCTURE__FTLEVEL = 2;

	/**
	 * The feature id for the '<em><b>Base Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REDUNDANT_STRUCTURE__BASE_PACKAGE = 3;

	/**
	 * The number of structural features of the '<em>Da Redundant Structure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_REDUNDANT_STRUCTURE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.masdes.dam.Redundancy.impl.DaSpareImpl <em>Da Spare</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.masdes.dam.Redundancy.impl.DaSpareImpl
	 * @see com.masdes.dam.Redundancy.impl.RedundancyPackageImpl#getDaSpare()
	 * @generated
	 */
	int DA_SPARE = 4;

	/**
	 * The feature id for the '<em><b>Res Mult</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__RES_MULT = CorePackage.DA_COMPONENT__RES_MULT;

	/**
	 * The feature id for the '<em><b>Is Protected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__IS_PROTECTED = CorePackage.DA_COMPONENT__IS_PROTECTED;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__IS_ACTIVE = CorePackage.DA_COMPONENT__IS_ACTIVE;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__BASE_PROPERTY = CorePackage.DA_COMPONENT__BASE_PROPERTY;

	/**
	 * The feature id for the '<em><b>Base Instance Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__BASE_INSTANCE_SPECIFICATION = CorePackage.DA_COMPONENT__BASE_INSTANCE_SPECIFICATION;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__BASE_CLASSIFIER = CorePackage.DA_COMPONENT__BASE_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Base Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__BASE_LIFELINE = CorePackage.DA_COMPONENT__BASE_LIFELINE;

	/**
	 * The feature id for the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__BASE_CONNECTABLE_ELEMENT = CorePackage.DA_COMPONENT__BASE_CONNECTABLE_ELEMENT;

	/**
	 * The feature id for the '<em><b>Stateful</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__STATEFUL = CorePackage.DA_COMPONENT__STATEFUL;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__ORIGIN = CorePackage.DA_COMPONENT__ORIGIN;

	/**
	 * The feature id for the '<em><b>Failure Coverage</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__FAILURE_COVERAGE = CorePackage.DA_COMPONENT__FAILURE_COVERAGE;

	/**
	 * The feature id for the '<em><b>Perc Perm Fault</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__PERC_PERM_FAULT = CorePackage.DA_COMPONENT__PERC_PERM_FAULT;

	/**
	 * The feature id for the '<em><b>Ss Avail</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__SS_AVAIL = CorePackage.DA_COMPONENT__SS_AVAIL;

	/**
	 * The feature id for the '<em><b>Unreliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__UNRELIABILITY = CorePackage.DA_COMPONENT__UNRELIABILITY;

	/**
	 * The feature id for the '<em><b>Reliability</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__RELIABILITY = CorePackage.DA_COMPONENT__RELIABILITY;

	/**
	 * The feature id for the '<em><b>Mission Time</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__MISSION_TIME = CorePackage.DA_COMPONENT__MISSION_TIME;

	/**
	 * The feature id for the '<em><b>Avail Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__AVAIL_LEVEL = CorePackage.DA_COMPONENT__AVAIL_LEVEL;

	/**
	 * The feature id for the '<em><b>Reliability Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__RELIABILITY_LEVEL = CorePackage.DA_COMPONENT__RELIABILITY_LEVEL;

	/**
	 * The feature id for the '<em><b>Safety Level</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__SAFETY_LEVEL = CorePackage.DA_COMPONENT__SAFETY_LEVEL;

	/**
	 * The feature id for the '<em><b>Complexity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__COMPLEXITY = CorePackage.DA_COMPONENT__COMPLEXITY;

	/**
	 * The feature id for the '<em><b>Fault</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__FAULT = CorePackage.DA_COMPONENT__FAULT;

	/**
	 * The feature id for the '<em><b>Error</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__ERROR = CorePackage.DA_COMPONENT__ERROR;

	/**
	 * The feature id for the '<em><b>Failure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__FAILURE = CorePackage.DA_COMPONENT__FAILURE;

	/**
	 * The feature id for the '<em><b>Hazard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__HAZARD = CorePackage.DA_COMPONENT__HAZARD;

	/**
	 * The feature id for the '<em><b>Repair</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__REPAIR = CorePackage.DA_COMPONENT__REPAIR;

	/**
	 * The feature id for the '<em><b>Substituted By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__SUBSTITUTED_BY = CorePackage.DA_COMPONENT__SUBSTITUTED_BY;

	/**
	 * The feature id for the '<em><b>Dormancy Factor</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__DORMANCY_FACTOR = CorePackage.DA_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Substitute For</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE__SUBSTITUTE_FOR = CorePackage.DA_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Da Spare</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DA_SPARE_FEATURE_COUNT = CorePackage.DA_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Redundancy.DaController <em>Da Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Controller</em>'.
	 * @see com.masdes.dam.Redundancy.DaController
	 * @generated
	 */
	EClass getDaController();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Redundancy.DaVariant <em>Da Variant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Variant</em>'.
	 * @see com.masdes.dam.Redundancy.DaVariant
	 * @generated
	 */
	EClass getDaVariant();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Redundancy.DaAdjudicator <em>Da Adjudicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Adjudicator</em>'.
	 * @see com.masdes.dam.Redundancy.DaAdjudicator
	 * @generated
	 */
	EClass getDaAdjudicator();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Redundancy.DaAdjudicator#getErrorDetecCoverage <em>Error Detec Coverage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Error Detec Coverage</em>'.
	 * @see com.masdes.dam.Redundancy.DaAdjudicator#getErrorDetecCoverage()
	 * @see #getDaAdjudicator()
	 * @generated
	 */
	EAttribute getDaAdjudicator_ErrorDetecCoverage();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Redundancy.DaRedundantStructure <em>Da Redundant Structure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Redundant Structure</em>'.
	 * @see com.masdes.dam.Redundancy.DaRedundantStructure
	 * @generated
	 */
	EClass getDaRedundantStructure();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Redundancy.DaRedundantStructure#getCommonModeFailure <em>Common Mode Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Common Mode Failure</em>'.
	 * @see com.masdes.dam.Redundancy.DaRedundantStructure#getCommonModeFailure()
	 * @see #getDaRedundantStructure()
	 * @generated
	 */
	EReference getDaRedundantStructure_CommonModeFailure();

	/**
	 * Returns the meta object for the containment reference list '{@link com.masdes.dam.Redundancy.DaRedundantStructure#getCommonModeHazard <em>Common Mode Hazard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Common Mode Hazard</em>'.
	 * @see com.masdes.dam.Redundancy.DaRedundantStructure#getCommonModeHazard()
	 * @see #getDaRedundantStructure()
	 * @generated
	 */
	EReference getDaRedundantStructure_CommonModeHazard();

	/**
	 * Returns the meta object for the attribute '{@link com.masdes.dam.Redundancy.DaRedundantStructure#getFTlevel <em>FTlevel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FTlevel</em>'.
	 * @see com.masdes.dam.Redundancy.DaRedundantStructure#getFTlevel()
	 * @see #getDaRedundantStructure()
	 * @generated
	 */
	EAttribute getDaRedundantStructure_FTlevel();

	/**
	 * Returns the meta object for the reference '{@link com.masdes.dam.Redundancy.DaRedundantStructure#getBase_Package <em>Base Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Package</em>'.
	 * @see com.masdes.dam.Redundancy.DaRedundantStructure#getBase_Package()
	 * @see #getDaRedundantStructure()
	 * @generated
	 */
	EReference getDaRedundantStructure_Base_Package();

	/**
	 * Returns the meta object for class '{@link com.masdes.dam.Redundancy.DaSpare <em>Da Spare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Da Spare</em>'.
	 * @see com.masdes.dam.Redundancy.DaSpare
	 * @generated
	 */
	EClass getDaSpare();

	/**
	 * Returns the meta object for the attribute list '{@link com.masdes.dam.Redundancy.DaSpare#getDormancyFactor <em>Dormancy Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dormancy Factor</em>'.
	 * @see com.masdes.dam.Redundancy.DaSpare#getDormancyFactor()
	 * @see #getDaSpare()
	 * @generated
	 */
	EAttribute getDaSpare_DormancyFactor();

	/**
	 * Returns the meta object for the reference list '{@link com.masdes.dam.Redundancy.DaSpare#getSubstituteFor <em>Substitute For</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Substitute For</em>'.
	 * @see com.masdes.dam.Redundancy.DaSpare#getSubstituteFor()
	 * @see #getDaSpare()
	 * @generated
	 */
	EReference getDaSpare_SubstituteFor();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RedundancyFactory getRedundancyFactory();

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
		 * The meta object literal for the '{@link com.masdes.dam.Redundancy.impl.DaControllerImpl <em>Da Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Redundancy.impl.DaControllerImpl
		 * @see com.masdes.dam.Redundancy.impl.RedundancyPackageImpl#getDaController()
		 * @generated
		 */
		EClass DA_CONTROLLER = eINSTANCE.getDaController();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Redundancy.impl.DaVariantImpl <em>Da Variant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Redundancy.impl.DaVariantImpl
		 * @see com.masdes.dam.Redundancy.impl.RedundancyPackageImpl#getDaVariant()
		 * @generated
		 */
		EClass DA_VARIANT = eINSTANCE.getDaVariant();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Redundancy.impl.DaAdjudicatorImpl <em>Da Adjudicator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Redundancy.impl.DaAdjudicatorImpl
		 * @see com.masdes.dam.Redundancy.impl.RedundancyPackageImpl#getDaAdjudicator()
		 * @generated
		 */
		EClass DA_ADJUDICATOR = eINSTANCE.getDaAdjudicator();

		/**
		 * The meta object literal for the '<em><b>Error Detec Coverage</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_ADJUDICATOR__ERROR_DETEC_COVERAGE = eINSTANCE.getDaAdjudicator_ErrorDetecCoverage();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Redundancy.impl.DaRedundantStructureImpl <em>Da Redundant Structure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Redundancy.impl.DaRedundantStructureImpl
		 * @see com.masdes.dam.Redundancy.impl.RedundancyPackageImpl#getDaRedundantStructure()
		 * @generated
		 */
		EClass DA_REDUNDANT_STRUCTURE = eINSTANCE.getDaRedundantStructure();

		/**
		 * The meta object literal for the '<em><b>Common Mode Failure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_REDUNDANT_STRUCTURE__COMMON_MODE_FAILURE = eINSTANCE.getDaRedundantStructure_CommonModeFailure();

		/**
		 * The meta object literal for the '<em><b>Common Mode Hazard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_REDUNDANT_STRUCTURE__COMMON_MODE_HAZARD = eINSTANCE.getDaRedundantStructure_CommonModeHazard();

		/**
		 * The meta object literal for the '<em><b>FTlevel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_REDUNDANT_STRUCTURE__FTLEVEL = eINSTANCE.getDaRedundantStructure_FTlevel();

		/**
		 * The meta object literal for the '<em><b>Base Package</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_REDUNDANT_STRUCTURE__BASE_PACKAGE = eINSTANCE.getDaRedundantStructure_Base_Package();

		/**
		 * The meta object literal for the '{@link com.masdes.dam.Redundancy.impl.DaSpareImpl <em>Da Spare</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.masdes.dam.Redundancy.impl.DaSpareImpl
		 * @see com.masdes.dam.Redundancy.impl.RedundancyPackageImpl#getDaSpare()
		 * @generated
		 */
		EClass DA_SPARE = eINSTANCE.getDaSpare();

		/**
		 * The meta object literal for the '<em><b>Dormancy Factor</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DA_SPARE__DORMANCY_FACTOR = eINSTANCE.getDaSpare_DormancyFactor();

		/**
		 * The meta object literal for the '<em><b>Substitute For</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DA_SPARE__SUBSTITUTE_FOR = eINSTANCE.getDaSpare_SubstituteFor();

	}

} //RedundancyPackage
