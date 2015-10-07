/**
 */
package com.masdes.dam.Basic_Enumeration_Types.impl;

import com.masdes.dam.Basic_Data_Types.Basic_Data_TypesPackage;

import com.masdes.dam.Basic_Data_Types.impl.Basic_Data_TypesPackageImpl;

import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesFactory;
import com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage;
import com.masdes.dam.Basic_Enumeration_Types.Capability;
import com.masdes.dam.Basic_Enumeration_Types.Consistency;
import com.masdes.dam.Basic_Enumeration_Types.CriticalLevel;
import com.masdes.dam.Basic_Enumeration_Types.DaCurrKind;
import com.masdes.dam.Basic_Enumeration_Types.DaFrequencyUnitKind;
import com.masdes.dam.Basic_Enumeration_Types.Detectabillity;
import com.masdes.dam.Basic_Enumeration_Types.Domain;
import com.masdes.dam.Basic_Enumeration_Types.FactorOrigin;
import com.masdes.dam.Basic_Enumeration_Types.Guideword;
import com.masdes.dam.Basic_Enumeration_Types.Intent;
import com.masdes.dam.Basic_Enumeration_Types.Level;
import com.masdes.dam.Basic_Enumeration_Types.Likelihood;
import com.masdes.dam.Basic_Enumeration_Types.MetricName;
import com.masdes.dam.Basic_Enumeration_Types.Objective;
import com.masdes.dam.Basic_Enumeration_Types.Origin;
import com.masdes.dam.Basic_Enumeration_Types.Persistency;
import com.masdes.dam.Basic_Enumeration_Types.PhaseCreation;
import com.masdes.dam.Basic_Enumeration_Types.PhenomCause;
import com.masdes.dam.Basic_Enumeration_Types.SkillType;
import com.masdes.dam.Basic_Enumeration_Types.StepKind;
import com.masdes.dam.Basic_Enumeration_Types.SysBoundaries;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;

import com.masdes.dam.Complex_Data_Types.impl.Complex_Data_TypesPackageImpl;

import com.masdes.dam.Core.CorePackage;

import com.masdes.dam.Core.impl.CorePackageImpl;

import com.masdes.dam.DAM.DAMPackage;

import com.masdes.dam.DAM.impl.DAMPackageImpl;

import com.masdes.dam.Maintenance.MaintenancePackage;

import com.masdes.dam.Maintenance.impl.MaintenancePackageImpl;

import com.masdes.dam.Redundancy.RedundancyPackage;

import com.masdes.dam.Redundancy.impl.RedundancyPackageImpl;

import com.masdes.dam.Threats.ThreatsPackage;

import com.masdes.dam.Threats.impl.ThreatsPackageImpl;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.papyrus.MARTE.MARTEPackage;

import org.eclipse.papyrus.MARTE_Library.BasicNFP_Types.BasicNFP_TypesPackage;

import org.eclipse.papyrus.MARTE_Library.GRM_BasicTypes.GRM_BasicTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_DataTypes.MARTE_DataTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MARTE_PrimitivesTypes.MARTE_PrimitivesTypesPackage;

import org.eclipse.papyrus.MARTE_Library.MeasurementUnits.MeasurementUnitsPackage;

import org.eclipse.papyrus.MARTE_Library.RS_Library.RS_LibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeLibrary.TimeLibraryPackage;

import org.eclipse.papyrus.MARTE_Library.TimeTypesLibrary.TimeTypesLibraryPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Basic_Enumeration_TypesPackageImpl extends EPackageImpl implements Basic_Enumeration_TypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum persistencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum domainEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum consistencyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum detectabillityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum factorOriginEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum guidewordEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum phaseCreationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sysBoundariesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum phenomCauseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectiveEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum capabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum metricNameEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daFrequencyUnitKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum criticalLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum likelihoodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum skillTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum daCurrKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum originEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.masdes.dam.Basic_Enumeration_Types.Basic_Enumeration_TypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Basic_Enumeration_TypesPackageImpl() {
		super(eNS_URI, Basic_Enumeration_TypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Basic_Enumeration_TypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Basic_Enumeration_TypesPackage init() {
		if (isInited) return (Basic_Enumeration_TypesPackage)EPackage.Registry.INSTANCE.getEPackage(Basic_Enumeration_TypesPackage.eNS_URI);

		// Obtain or create and register package
		Basic_Enumeration_TypesPackageImpl theBasic_Enumeration_TypesPackage = (Basic_Enumeration_TypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Basic_Enumeration_TypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Basic_Enumeration_TypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MARTEPackage.eINSTANCE.eClass();
		MeasurementUnitsPackage.eINSTANCE.eClass();
		GRM_BasicTypesPackage.eINSTANCE.eClass();
		MARTE_DataTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();
		TimeTypesLibraryPackage.eINSTANCE.eClass();
		TimeLibraryPackage.eINSTANCE.eClass();
		RS_LibraryPackage.eINSTANCE.eClass();
		MARTE_PrimitivesTypesPackage.eINSTANCE.eClass();
		BasicNFP_TypesPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		DAMPackageImpl theDAMPackage = (DAMPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(DAMPackage.eNS_URI) instanceof DAMPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(DAMPackage.eNS_URI) : DAMPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);
		RedundancyPackageImpl theRedundancyPackage = (RedundancyPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RedundancyPackage.eNS_URI) instanceof RedundancyPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RedundancyPackage.eNS_URI) : RedundancyPackage.eINSTANCE);
		ThreatsPackageImpl theThreatsPackage = (ThreatsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) instanceof ThreatsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ThreatsPackage.eNS_URI) : ThreatsPackage.eINSTANCE);
		MaintenancePackageImpl theMaintenancePackage = (MaintenancePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI) instanceof MaintenancePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MaintenancePackage.eNS_URI) : MaintenancePackage.eINSTANCE);
		Complex_Data_TypesPackageImpl theComplex_Data_TypesPackage = (Complex_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI) instanceof Complex_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Complex_Data_TypesPackage.eNS_URI) : Complex_Data_TypesPackage.eINSTANCE);
		Basic_Data_TypesPackageImpl theBasic_Data_TypesPackage = (Basic_Data_TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI) instanceof Basic_Data_TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Basic_Data_TypesPackage.eNS_URI) : Basic_Data_TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theBasic_Enumeration_TypesPackage.createPackageContents();
		theDAMPackage.createPackageContents();
		theCorePackage.createPackageContents();
		theRedundancyPackage.createPackageContents();
		theThreatsPackage.createPackageContents();
		theMaintenancePackage.createPackageContents();
		theComplex_Data_TypesPackage.createPackageContents();
		theBasic_Data_TypesPackage.createPackageContents();

		// Initialize created meta-data
		theBasic_Enumeration_TypesPackage.initializePackageContents();
		theDAMPackage.initializePackageContents();
		theCorePackage.initializePackageContents();
		theRedundancyPackage.initializePackageContents();
		theThreatsPackage.initializePackageContents();
		theMaintenancePackage.initializePackageContents();
		theComplex_Data_TypesPackage.initializePackageContents();
		theBasic_Data_TypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBasic_Enumeration_TypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Basic_Enumeration_TypesPackage.eNS_URI, theBasic_Enumeration_TypesPackage);
		return theBasic_Enumeration_TypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPersistency() {
		return persistencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDomain() {
		return domainEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConsistency() {
		return consistencyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDetectabillity() {
		return detectabillityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFactorOrigin() {
		return factorOriginEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGuideword() {
		return guidewordEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhaseCreation() {
		return phaseCreationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSysBoundaries() {
		return sysBoundariesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPhenomCause() {
		return phenomCauseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getObjective() {
		return objectiveEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntent() {
		return intentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCapability() {
		return capabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMetricName() {
		return metricNameEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDaFrequencyUnitKind() {
		return daFrequencyUnitKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCriticalLevel() {
		return criticalLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevel() {
		return levelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLikelihood() {
		return likelihoodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStepKind() {
		return stepKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSkillType() {
		return skillTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDaCurrKind() {
		return daCurrKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrigin() {
		return originEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basic_Enumeration_TypesFactory getBasic_Enumeration_TypesFactory() {
		return (Basic_Enumeration_TypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create enums
		persistencyEEnum = createEEnum(PERSISTENCY);
		domainEEnum = createEEnum(DOMAIN);
		consistencyEEnum = createEEnum(CONSISTENCY);
		detectabillityEEnum = createEEnum(DETECTABILLITY);
		factorOriginEEnum = createEEnum(FACTOR_ORIGIN);
		guidewordEEnum = createEEnum(GUIDEWORD);
		phaseCreationEEnum = createEEnum(PHASE_CREATION);
		sysBoundariesEEnum = createEEnum(SYS_BOUNDARIES);
		phenomCauseEEnum = createEEnum(PHENOM_CAUSE);
		objectiveEEnum = createEEnum(OBJECTIVE);
		intentEEnum = createEEnum(INTENT);
		capabilityEEnum = createEEnum(CAPABILITY);
		metricNameEEnum = createEEnum(METRIC_NAME);
		daFrequencyUnitKindEEnum = createEEnum(DA_FREQUENCY_UNIT_KIND);
		criticalLevelEEnum = createEEnum(CRITICAL_LEVEL);
		levelEEnum = createEEnum(LEVEL);
		likelihoodEEnum = createEEnum(LIKELIHOOD);
		stepKindEEnum = createEEnum(STEP_KIND);
		skillTypeEEnum = createEEnum(SKILL_TYPE);
		daCurrKindEEnum = createEEnum(DA_CURR_KIND);
		originEEnum = createEEnum(ORIGIN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Initialize enums and add enum literals
		initEEnum(persistencyEEnum, Persistency.class, "Persistency");
		addEEnumLiteral(persistencyEEnum, Persistency.TRANSIENT);
		addEEnumLiteral(persistencyEEnum, Persistency.PERMANENT);

		initEEnum(domainEEnum, Domain.class, "Domain");
		addEEnumLiteral(domainEEnum, Domain.CONTENT);
		addEEnumLiteral(domainEEnum, Domain.EARLY_TIMING);
		addEEnumLiteral(domainEEnum, Domain.LATE_TIMING);
		addEEnumLiteral(domainEEnum, Domain.HALT);
		addEEnumLiteral(domainEEnum, Domain.ERRATIC);

		initEEnum(consistencyEEnum, Consistency.class, "Consistency");
		addEEnumLiteral(consistencyEEnum, Consistency.CONSISTENT);
		addEEnumLiteral(consistencyEEnum, Consistency.INCONSISTENT);

		initEEnum(detectabillityEEnum, Detectabillity.class, "Detectabillity");
		addEEnumLiteral(detectabillityEEnum, Detectabillity.SIGNALED);
		addEEnumLiteral(detectabillityEEnum, Detectabillity.UNSIGNALED);

		initEEnum(factorOriginEEnum, FactorOrigin.class, "FactorOrigin");
		addEEnumLiteral(factorOriginEEnum, FactorOrigin.ENDOGENOUS);
		addEEnumLiteral(factorOriginEEnum, FactorOrigin.EXOGENOUS);

		initEEnum(guidewordEEnum, Guideword.class, "Guideword");
		addEEnumLiteral(guidewordEEnum, Guideword.VALUE);
		addEEnumLiteral(guidewordEEnum, Guideword.OMISSION);
		addEEnumLiteral(guidewordEEnum, Guideword.COMMISSION);

		initEEnum(phaseCreationEEnum, PhaseCreation.class, "PhaseCreation");
		addEEnumLiteral(phaseCreationEEnum, PhaseCreation.DEVELOPMENT);
		addEEnumLiteral(phaseCreationEEnum, PhaseCreation.OPERATIONAL);

		initEEnum(sysBoundariesEEnum, SysBoundaries.class, "SysBoundaries");
		addEEnumLiteral(sysBoundariesEEnum, SysBoundaries.INTERNAL);
		addEEnumLiteral(sysBoundariesEEnum, SysBoundaries.EXTERNAL);

		initEEnum(phenomCauseEEnum, PhenomCause.class, "PhenomCause");
		addEEnumLiteral(phenomCauseEEnum, PhenomCause.NATURAL);
		addEEnumLiteral(phenomCauseEEnum, PhenomCause.HUMAN_MADE);

		initEEnum(objectiveEEnum, Objective.class, "Objective");
		addEEnumLiteral(objectiveEEnum, Objective.MALICIOUS);
		addEEnumLiteral(objectiveEEnum, Objective.NON_MALICIOUS);

		initEEnum(intentEEnum, Intent.class, "Intent");
		addEEnumLiteral(intentEEnum, Intent.DELIBERATE);
		addEEnumLiteral(intentEEnum, Intent.NON_DELIBERATE);

		initEEnum(capabilityEEnum, Capability.class, "Capability");
		addEEnumLiteral(capabilityEEnum, Capability.ACCIDENTAL);
		addEEnumLiteral(capabilityEEnum, Capability.INCOMPETENCE);

		initEEnum(metricNameEEnum, MetricName.class, "MetricName");
		addEEnumLiteral(metricNameEEnum, MetricName.SS_AVAIL);
		addEEnumLiteral(metricNameEEnum, MetricName.INST_AVAIL);
		addEEnumLiteral(metricNameEEnum, MetricName.UNRELIABILITY);
		addEEnumLiteral(metricNameEEnum, MetricName.RELIABILITY);
		addEEnumLiteral(metricNameEEnum, MetricName.MISSION_TIME);
		addEEnumLiteral(metricNameEEnum, MetricName.AVAIL_LEVEL);
		addEEnumLiteral(metricNameEEnum, MetricName.RELIAB_LEVEL);
		addEEnumLiteral(metricNameEEnum, MetricName.SAFETY_LEVEL);
		addEEnumLiteral(metricNameEEnum, MetricName.RESP_T);
		addEEnumLiteral(metricNameEEnum, MetricName.CONF_LEVEL);
		addEEnumLiteral(metricNameEEnum, MetricName.INTEG_LEVEL);

		initEEnum(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.class, "DaFrequencyUnitKind");
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FT_S);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FT_MS);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FT_MIN);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FT_HR);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FT_DAY);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FT_MONTH);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FT_YR);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FAIL_S);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FAIL_MS);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FAIL_MIN);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FAIL_HR);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FAIL_DAY);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FAIL_MONTH);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.FAIL_YR);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REPAIR_S);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REPAIR_MS);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REPAIR_MIN);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REPAIR_HR);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REPAIR_DAY);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REPAIR_MONTH);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REPAIR_YR);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REC_S);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REC_MS);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REC_MIN);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REC_HR);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REC_DAY);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REC_MONTH);
		addEEnumLiteral(daFrequencyUnitKindEEnum, DaFrequencyUnitKind.REC_YR);

		initEEnum(criticalLevelEEnum, CriticalLevel.class, "CriticalLevel");
		addEEnumLiteral(criticalLevelEEnum, CriticalLevel.MINOR);
		addEEnumLiteral(criticalLevelEEnum, CriticalLevel.MARGINAL);
		addEEnumLiteral(criticalLevelEEnum, CriticalLevel.MAJOR);
		addEEnumLiteral(criticalLevelEEnum, CriticalLevel.CATASTROPHIC);

		initEEnum(levelEEnum, Level.class, "Level");
		addEEnumLiteral(levelEEnum, Level.VERY_HIGH);
		addEEnumLiteral(levelEEnum, Level.HIGH);
		addEEnumLiteral(levelEEnum, Level.MEDIUM);
		addEEnumLiteral(levelEEnum, Level.LOW);

		initEEnum(likelihoodEEnum, Likelihood.class, "Likelihood");
		addEEnumLiteral(likelihoodEEnum, Likelihood.FREQUENT);
		addEEnumLiteral(likelihoodEEnum, Likelihood.MODERATE);
		addEEnumLiteral(likelihoodEEnum, Likelihood.OCCASIONAL);
		addEEnumLiteral(likelihoodEEnum, Likelihood.REMOTE);
		addEEnumLiteral(likelihoodEEnum, Likelihood.UNLIKELY);
		addEEnumLiteral(likelihoodEEnum, Likelihood.IMPOSSIBLE);

		initEEnum(stepKindEEnum, StepKind.class, "StepKind");
		addEEnumLiteral(stepKindEEnum, StepKind.ERROR);
		addEEnumLiteral(stepKindEEnum, StepKind.FAILURE);
		addEEnumLiteral(stepKindEEnum, StepKind.HAZARD);
		addEEnumLiteral(stepKindEEnum, StepKind.REALLOCATION);
		addEEnumLiteral(stepKindEEnum, StepKind.REPLACEMENT);
		addEEnumLiteral(stepKindEEnum, StepKind.ACTIVATION);
		addEEnumLiteral(stepKindEEnum, StepKind.FAULT);

		initEEnum(skillTypeEEnum, SkillType.class, "SkillType");
		addEEnumLiteral(skillTypeEEnum, SkillType.HW_TECHNICIAN);
		addEEnumLiteral(skillTypeEEnum, SkillType.SW_TECHNICIAN);

		initEEnum(daCurrKindEEnum, DaCurrKind.class, "DaCurrKind");
		addEEnumLiteral(daCurrKindEEnum, DaCurrKind.EURO);
		addEEnumLiteral(daCurrKindEEnum, DaCurrKind.DOLLAR);

		initEEnum(originEEnum, Origin.class, "Origin");
		addEEnumLiteral(originEEnum, Origin.HW);
		addEEnumLiteral(originEEnum, Origin.SW);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "originalName", "Enumeration_Types"
		   });
	}

} //Basic_Enumeration_TypesPackageImpl
