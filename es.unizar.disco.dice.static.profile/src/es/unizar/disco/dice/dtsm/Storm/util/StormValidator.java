/**
 */
package es.unizar.disco.dice.dtsm.Storm.util;

import es.unizar.disco.dice.dtsm.Storm.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.util.FeatureMapUtil;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see es.unizar.disco.dice.dtsm.Storm.StormPackage
 * @generated
 */
public class StormValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final StormValidator INSTANCE = new StormValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "es.unizar.disco.dice.dtsm.Storm";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StormValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return StormPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case StormPackage.STORM_BOLT:
				return validateStormBolt((StormBolt)value, diagnostics, context);
			case StormPackage.STORM_SPOUT:
				return validateStormSpout((StormSpout)value, diagnostics, context);
			case StormPackage.STORM_SCENARIO_TOPOLOGY:
				return validateStormScenarioTopology((StormScenarioTopology)value, diagnostics, context);
			case StormPackage.STORM_APPLICATION:
				return validateStormApplication((StormApplication)value, diagnostics, context);
			case StormPackage.STORM_NIMBUS:
				return validateStormNimbus((StormNimbus)value, diagnostics, context);
			case StormPackage.STORM_SUPERVISOR:
				return validateStormSupervisor((StormSupervisor)value, diagnostics, context);
			case StormPackage.STORM_ZOOKEEPER:
				return validateStormZookeeper((StormZookeeper)value, diagnostics, context);
			case StormPackage.STORM_STREAM_STEP:
				return validateStormStreamStep((StormStreamStep)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStormBolt(StormBolt stormBolt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stormBolt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStormSpout(StormSpout stormSpout, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stormSpout, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStormScenarioTopology(StormScenarioTopology stormScenarioTopology, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stormScenarioTopology, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStormApplication(StormApplication stormApplication, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stormApplication, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStormNimbus(StormNimbus stormNimbus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stormNimbus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStormSupervisor(StormSupervisor stormSupervisor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stormSupervisor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStormZookeeper(StormZookeeper stormZookeeper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stormZookeeper, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStormStreamStep(StormStreamStep stormStreamStep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stormStreamStep, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private String getRedefinitionDetail(EClass eClass, String featureName, String key) {
		List<EClass> eClasses = new ArrayList<EClass>();
		eClasses.add(eClass);
		eClasses.addAll(eClass.getEAllSuperTypes());
		String redefinitionDetail = null;
		for (Iterator<EClass> eClassesIterator = eClasses.iterator(); redefinitionDetail == null && eClassesIterator.hasNext(); ) {
			EAnnotation eAnnotation = eClassesIterator.next().getEAnnotation("duplicates");
			if (eAnnotation != null) {
				EAnnotation nestedEAnnotation = eAnnotation.getEAnnotation(featureName);
				if (nestedEAnnotation != null) {
					redefinitionDetail = nestedEAnnotation.getDetails().get(key);
				}
			}
		}
		return redefinitionDetail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int getLowerBound(EObject eObject, EStructuralFeature eStructuralFeature) {
		String redefinitionDetail = getRedefinitionDetail(eObject.eClass(), eStructuralFeature.getName(), "lowerBound");
		if (redefinitionDetail != null && redefinitionDetail.length() > 0) {
			try {
				return Integer.parseInt(redefinitionDetail);
			}
			catch (Exception e) {
				// do nothing
			}
		}
		return eStructuralFeature.getLowerBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected int getUpperBound(EObject eObject, EStructuralFeature eStructuralFeature) {
		String redefinitionDetail = getRedefinitionDetail(eObject.eClass(), eStructuralFeature.getName(), "upperBound");
		if (redefinitionDetail != null && redefinitionDetail.length() > 0) {
			try {
				return Integer.parseInt(redefinitionDetail);
			}
			catch (Exception e) {
				// do nothing
			}
		}
		return eStructuralFeature.getUpperBound();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean isEcoreString(String key) {
		return super.isEcoreString(key)
			|| "_UI_FeatureHasTooFewValues_diagnostic".equals(key)
			|| "_UI_FeatureHasTooManyValues_diagnostic".equals(key)
			|| "_UI_RequiredFeatureMustBeSet_diagnostic".equals(key);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate_MultiplicityConforms(EObject eObject, EStructuralFeature eStructuralFeature, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = true;
		if (eStructuralFeature.isMany()) {
			if (FeatureMapUtil.isFeatureMap(eStructuralFeature) && ExtendedMetaData.INSTANCE.isDocumentRoot(eObject.eClass())) {
				result = super.validate_MultiplicityConforms(eObject, eStructuralFeature, diagnostics, context);
			}
			else {
				int lowerBound = getLowerBound(eObject, eStructuralFeature);
				if (lowerBound > 0) {
					int size = ((List<?>) eObject.eGet(eStructuralFeature)).size();
					if (size < lowerBound) {
						result = false;
						if (diagnostics != null) {
							diagnostics.add
								(createDiagnostic
									(Diagnostic.ERROR,
									EObjectValidator.DIAGNOSTIC_SOURCE,
									EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS,
									"_UI_FeatureHasTooFewValues_diagnostic",
									new Object [] {
										getFeatureLabel(eStructuralFeature, context),
										getObjectLabel(eObject, context),
										size,
										lowerBound
									},
									new Object [] { eObject, eStructuralFeature },
									context));
						}
					}
					int upperBound = getUpperBound(eObject, eStructuralFeature);
					if (upperBound > 0 && size > upperBound) {
						result = false;
						if (diagnostics != null) {
							diagnostics.add
								(createDiagnostic
									(Diagnostic.ERROR,
									EObjectValidator.DIAGNOSTIC_SOURCE,
									EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS,
									"_UI_FeatureHasTooManyValues_diagnostic",
									new Object [] {
										getFeatureLabel(eStructuralFeature, context),
										getObjectLabel(eObject, context),
										size,
										upperBound
									},
									new Object [] { eObject, eStructuralFeature },
									context));
						}
					}
				}
				else {
					int upperBound = getUpperBound(eObject, eStructuralFeature);
					if (upperBound > 0) {
						int size = ((List<?>) eObject.eGet(eStructuralFeature)).size();
						if (size > upperBound) {
							result = false;
							if (diagnostics != null) {
								diagnostics.add
									(createDiagnostic
										(Diagnostic.ERROR,
										EObjectValidator.DIAGNOSTIC_SOURCE,
										EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS,
										"_UI_FeatureHasTooManyValues_diagnostic",
										new Object [] {
											getFeatureLabel(eStructuralFeature, context),
											getObjectLabel(eObject, context),
											size,
											upperBound
										},
										new Object [] { eObject, eStructuralFeature },
										context));
							}
						}
					}
				}
			}
		}
		else if (getLowerBound(eObject, eStructuralFeature) >= 1) {
			if (eStructuralFeature.isUnsettable() ? !eObject.eIsSet(eStructuralFeature) : eObject.eGet(eStructuralFeature, false) == null) {
				result = false;
				if (diagnostics != null) {
					diagnostics.add
						(createDiagnostic
							(Diagnostic.ERROR,
							EObjectValidator.DIAGNOSTIC_SOURCE,
							EObjectValidator.EOBJECT__EVERY_MULTIPCITY_CONFORMS,
							"_UI_RequiredFeatureMustBeSet_diagnostic",
							new Object [] { getFeatureLabel(eStructuralFeature, context), getObjectLabel(eObject, context) },
							new Object [] { eObject, eStructuralFeature },
							context));
				}
			}
		}
		return result;
	}
} //StormValidator
