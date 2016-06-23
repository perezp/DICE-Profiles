/**
 */
package es.unizar.disco.dice.dtsm.Core.impl;

import com.masdes.dam.Basic_Enumeration_Types.Origin;

import com.masdes.dam.Complex_Data_Types.DaError;
import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaFault;
import com.masdes.dam.Complex_Data_Types.DaHazard;
import com.masdes.dam.Complex_Data_Types.DaRepair;

import com.masdes.dam.Core.DaComponent;

import com.masdes.dam.Redundancy.DaSpare;

import es.unizar.disco.dice.Basic_Enumeration_Types.ComputationType;
import es.unizar.disco.dice.Basic_Enumeration_Types.ProcessingType;
import es.unizar.disco.dice.Basic_Enumeration_Types.SourceType;
import es.unizar.disco.dice.Basic_Enumeration_Types.TechType;
import es.unizar.disco.dice.Basic_Enumeration_Types.WorkflowOperation;

import es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification;
import es.unizar.disco.dice.Complex_Data_Types.DiceDataVolume;

import es.unizar.disco.dice.DPIM.DPIMPackage;
import es.unizar.disco.dice.DPIM.DpimComputationNode;
import es.unizar.disco.dice.DPIM.DpimSourceNode;

import es.unizar.disco.dice.dtsm.Core.CoreDAGNode;
import es.unizar.disco.dice.dtsm.Core.CorePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GaStepImpl;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;

import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.ConnectableElement;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DAG Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getResMult <em>Res Mult</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#isIsProtected <em>Is Protected</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getBase_InstanceSpecification <em>Base Instance Specification</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getBase_Classifier <em>Base Classifier</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getBase_Lifeline <em>Base Lifeline</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getBase_ConnectableElement <em>Base Connectable Element</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#isStateful <em>Stateful</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getFailureCoverage <em>Failure Coverage</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getPercPermFault <em>Perc Perm Fault</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getSsAvail <em>Ss Avail</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getUnreliability <em>Unreliability</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getMissionTime <em>Mission Time</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getAvailLevel <em>Avail Level</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getReliabilityLevel <em>Reliability Level</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getSafetyLevel <em>Safety Level</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getError <em>Error</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getHazard <em>Hazard</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getRepair <em>Repair</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getSubstitutedBy <em>Substituted By</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getNodeThroughput <em>Node Throughput</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getType <em>Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getTargetTech <em>Target Tech</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getProcType <em>Proc Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getStore <em>Store</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getProvides <em>Provides</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getRate <em>Rate</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getParallelism <em>Parallelism</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link es.unizar.disco.dice.dtsm.Core.impl.CoreDAGNodeImpl#getHasSuccessor <em>Has Successor</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class CoreDAGNodeImpl extends GaStepImpl implements CoreDAGNode {
	/**
	 * The default value of the '{@link #getResMult() <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMult()
	 * @generated
	 * @ordered
	 */
	protected static final String RES_MULT_EDEFAULT = "1";

	/**
	 * The cached value of the '{@link #getResMult() <em>Res Mult</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResMult()
	 * @generated
	 * @ordered
	 */
	protected String resMult = RES_MULT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProtected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PROTECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsProtected() <em>Is Protected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsProtected()
	 * @generated
	 * @ordered
	 */
	protected boolean isProtected = IS_PROTECTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsActive() <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsActive()
	 * @generated
	 * @ordered
	 */
	protected boolean isActive = IS_ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * The cached value of the '{@link #getBase_InstanceSpecification() <em>Base Instance Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InstanceSpecification()
	 * @generated
	 * @ordered
	 */
	protected InstanceSpecification base_InstanceSpecification;

	/**
	 * The cached value of the '{@link #getBase_Classifier() <em>Base Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Classifier()
	 * @generated
	 * @ordered
	 */
	protected Classifier base_Classifier;

	/**
	 * The cached value of the '{@link #getBase_Lifeline() <em>Base Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Lifeline()
	 * @generated
	 * @ordered
	 */
	protected Lifeline base_Lifeline;

	/**
	 * The cached value of the '{@link #getBase_ConnectableElement() <em>Base Connectable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ConnectableElement()
	 * @generated
	 * @ordered
	 */
	protected ConnectableElement base_ConnectableElement;

	/**
	 * The default value of the '{@link #isStateful() <em>Stateful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStateful()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STATEFUL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStateful() <em>Stateful</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStateful()
	 * @generated
	 * @ordered
	 */
	protected boolean stateful = STATEFUL_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final Origin ORIGIN_EDEFAULT = Origin.HW;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected Origin origin = ORIGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFailureCoverage() <em>Failure Coverage</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailureCoverage()
	 * @generated
	 * @ordered
	 */
	protected EList<String> failureCoverage;

	/**
	 * The cached value of the '{@link #getPercPermFault() <em>Perc Perm Fault</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercPermFault()
	 * @generated
	 * @ordered
	 */
	protected EList<String> percPermFault;

	/**
	 * The cached value of the '{@link #getSsAvail() <em>Ss Avail</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsAvail()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ssAvail;

	/**
	 * The cached value of the '{@link #getUnreliability() <em>Unreliability</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnreliability()
	 * @generated
	 * @ordered
	 */
	protected EList<String> unreliability;

	/**
	 * The cached value of the '{@link #getReliability() <em>Reliability</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliability()
	 * @generated
	 * @ordered
	 */
	protected EList<String> reliability;

	/**
	 * The cached value of the '{@link #getMissionTime() <em>Mission Time</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMissionTime()
	 * @generated
	 * @ordered
	 */
	protected EList<String> missionTime;

	/**
	 * The cached value of the '{@link #getAvailLevel() <em>Avail Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> availLevel;

	/**
	 * The cached value of the '{@link #getReliabilityLevel() <em>Reliability Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabilityLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> reliabilityLevel;

	/**
	 * The cached value of the '{@link #getSafetyLevel() <em>Safety Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSafetyLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> safetyLevel;

	/**
	 * The cached value of the '{@link #getComplexity() <em>Complexity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComplexity()
	 * @generated
	 * @ordered
	 */
	protected EList<String> complexity;

	/**
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected EList<DaFault> fault;

	/**
	 * The cached value of the '{@link #getError() <em>Error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getError()
	 * @generated
	 * @ordered
	 */
	protected EList<DaError> error;

	/**
	 * The cached value of the '{@link #getFailure() <em>Failure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailure()
	 * @generated
	 * @ordered
	 */
	protected EList<DaFailure> failure;

	/**
	 * The cached value of the '{@link #getHazard() <em>Hazard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHazard()
	 * @generated
	 * @ordered
	 */
	protected EList<DaHazard> hazard;

	/**
	 * The cached value of the '{@link #getRepair() <em>Repair</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepair()
	 * @generated
	 * @ordered
	 */
	protected EList<DaRepair> repair;

	/**
	 * The cached value of the '{@link #getSubstitutedBy() <em>Substituted By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<DaSpare> substitutedBy;

	/**
	 * The default value of the '{@link #getNodeThroughput() <em>Node Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeThroughput()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_THROUGHPUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeThroughput() <em>Node Throughput</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeThroughput()
	 * @generated
	 * @ordered
	 */
	protected String nodeThroughput = NODE_THROUGHPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final ComputationType TYPE_EDEFAULT = ComputationType.DISTRIBUTED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ComputationType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetTech() <em>Target Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTech()
	 * @generated
	 * @ordered
	 */
	protected static final TechType TARGET_TECH_EDEFAULT = TechType.RDD;

	/**
	 * The cached value of the '{@link #getTargetTech() <em>Target Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetTech()
	 * @generated
	 * @ordered
	 */
	protected TechType targetTech = TARGET_TECH_EDEFAULT;

	/**
	 * The default value of the '{@link #getProcType() <em>Proc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessingType PROC_TYPE_EDEFAULT = ProcessingType.SYNCH;

	/**
	 * The cached value of the '{@link #getProcType() <em>Proc Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcType()
	 * @generated
	 * @ordered
	 */
	protected ProcessingType procType = PROC_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStore() <em>Store</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStore()
	 * @generated
	 * @ordered
	 */
	protected DiceDataVolume store;

	/**
	 * The cached value of the '{@link #getProvides() <em>Provides</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvides()
	 * @generated
	 * @ordered
	 */
	protected DiceDataSpecification provides;

	/**
	 * The default value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected static final SourceType SOURCE_TYPE_EDEFAULT = SourceType.SHARED_STORAGE;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected SourceType sourceType = SOURCE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected static final String RATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRate() <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRate()
	 * @generated
	 * @ordered
	 */
	protected String rate = RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected static final String PARALLELISM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParallelism() <em>Parallelism</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParallelism()
	 * @generated
	 * @ordered
	 */
	protected String parallelism = PARALLELISM_EDEFAULT;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final WorkflowOperation OPERATION_EDEFAULT = WorkflowOperation.GROUP_BY;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected WorkflowOperation operation = OPERATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHasSuccessor() <em>Has Successor</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasSuccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<CoreDAGNode> hasSuccessor;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoreDAGNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.CORE_DAG_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResMult() {
		return resMult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResMult(String newResMult) {
		String oldResMult = resMult;
		resMult = newResMult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__RES_MULT, oldResMult, resMult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsProtected() {
		return isProtected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsProtected(boolean newIsProtected) {
		boolean oldIsProtected = isProtected;
		isProtected = newIsProtected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__IS_PROTECTED, oldIsProtected, isProtected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsActive() {
		return isActive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsActive(boolean newIsActive) {
		boolean oldIsActive = isActive;
		isActive = newIsActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__IS_ACTIVE, oldIsActive, isActive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CORE_DAG_NODE__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification getBase_InstanceSpecification() {
		if (base_InstanceSpecification != null && base_InstanceSpecification.eIsProxy()) {
			InternalEObject oldBase_InstanceSpecification = (InternalEObject)base_InstanceSpecification;
			base_InstanceSpecification = (InstanceSpecification)eResolveProxy(oldBase_InstanceSpecification);
			if (base_InstanceSpecification != oldBase_InstanceSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION, oldBase_InstanceSpecification, base_InstanceSpecification));
			}
		}
		return base_InstanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstanceSpecification basicGetBase_InstanceSpecification() {
		return base_InstanceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_InstanceSpecification(InstanceSpecification newBase_InstanceSpecification) {
		InstanceSpecification oldBase_InstanceSpecification = base_InstanceSpecification;
		base_InstanceSpecification = newBase_InstanceSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION, oldBase_InstanceSpecification, base_InstanceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier getBase_Classifier() {
		if (base_Classifier != null && base_Classifier.eIsProxy()) {
			InternalEObject oldBase_Classifier = (InternalEObject)base_Classifier;
			base_Classifier = (Classifier)eResolveProxy(oldBase_Classifier);
			if (base_Classifier != oldBase_Classifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CORE_DAG_NODE__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
			}
		}
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Classifier basicGetBase_Classifier() {
		return base_Classifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Classifier(Classifier newBase_Classifier) {
		Classifier oldBase_Classifier = base_Classifier;
		base_Classifier = newBase_Classifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__BASE_CLASSIFIER, oldBase_Classifier, base_Classifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getBase_Lifeline() {
		if (base_Lifeline != null && base_Lifeline.eIsProxy()) {
			InternalEObject oldBase_Lifeline = (InternalEObject)base_Lifeline;
			base_Lifeline = (Lifeline)eResolveProxy(oldBase_Lifeline);
			if (base_Lifeline != oldBase_Lifeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CORE_DAG_NODE__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
			}
		}
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetBase_Lifeline() {
		return base_Lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Lifeline(Lifeline newBase_Lifeline) {
		Lifeline oldBase_Lifeline = base_Lifeline;
		base_Lifeline = newBase_Lifeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__BASE_LIFELINE, oldBase_Lifeline, base_Lifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement getBase_ConnectableElement() {
		if (base_ConnectableElement != null && base_ConnectableElement.eIsProxy()) {
			InternalEObject oldBase_ConnectableElement = (InternalEObject)base_ConnectableElement;
			base_ConnectableElement = (ConnectableElement)eResolveProxy(oldBase_ConnectableElement);
			if (base_ConnectableElement != oldBase_ConnectableElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT, oldBase_ConnectableElement, base_ConnectableElement));
			}
		}
		return base_ConnectableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectableElement basicGetBase_ConnectableElement() {
		return base_ConnectableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ConnectableElement(ConnectableElement newBase_ConnectableElement) {
		ConnectableElement oldBase_ConnectableElement = base_ConnectableElement;
		base_ConnectableElement = newBase_ConnectableElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT, oldBase_ConnectableElement, base_ConnectableElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStateful() {
		return stateful;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateful(boolean newStateful) {
		boolean oldStateful = stateful;
		stateful = newStateful;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__STATEFUL, oldStateful, stateful));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Origin getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(Origin newOrigin) {
		Origin oldOrigin = origin;
		origin = newOrigin == null ? ORIGIN_EDEFAULT : newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFailureCoverage() {
		if (failureCoverage == null) {
			failureCoverage = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CORE_DAG_NODE__FAILURE_COVERAGE);
		}
		return failureCoverage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPercPermFault() {
		if (percPermFault == null) {
			percPermFault = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CORE_DAG_NODE__PERC_PERM_FAULT);
		}
		return percPermFault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSsAvail() {
		if (ssAvail == null) {
			ssAvail = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CORE_DAG_NODE__SS_AVAIL);
		}
		return ssAvail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUnreliability() {
		if (unreliability == null) {
			unreliability = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CORE_DAG_NODE__UNRELIABILITY);
		}
		return unreliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReliability() {
		if (reliability == null) {
			reliability = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CORE_DAG_NODE__RELIABILITY);
		}
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMissionTime() {
		if (missionTime == null) {
			missionTime = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CORE_DAG_NODE__MISSION_TIME);
		}
		return missionTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailLevel() {
		if (availLevel == null) {
			availLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CORE_DAG_NODE__AVAIL_LEVEL);
		}
		return availLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReliabilityLevel() {
		if (reliabilityLevel == null) {
			reliabilityLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CORE_DAG_NODE__RELIABILITY_LEVEL);
		}
		return reliabilityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSafetyLevel() {
		if (safetyLevel == null) {
			safetyLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CORE_DAG_NODE__SAFETY_LEVEL);
		}
		return safetyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getComplexity() {
		if (complexity == null) {
			complexity = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.CORE_DAG_NODE__COMPLEXITY);
		}
		return complexity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFault> getFault() {
		if (fault == null) {
			fault = new EObjectContainmentEList<DaFault>(DaFault.class, this, CorePackage.CORE_DAG_NODE__FAULT);
		}
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaError> getError() {
		if (error == null) {
			error = new EObjectContainmentEList<DaError>(DaError.class, this, CorePackage.CORE_DAG_NODE__ERROR);
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFailure> getFailure() {
		if (failure == null) {
			failure = new EObjectContainmentEList<DaFailure>(DaFailure.class, this, CorePackage.CORE_DAG_NODE__FAILURE);
		}
		return failure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaHazard> getHazard() {
		if (hazard == null) {
			hazard = new EObjectContainmentEList<DaHazard>(DaHazard.class, this, CorePackage.CORE_DAG_NODE__HAZARD);
		}
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaRepair> getRepair() {
		if (repair == null) {
			repair = new EObjectContainmentEList<DaRepair>(DaRepair.class, this, CorePackage.CORE_DAG_NODE__REPAIR);
		}
		return repair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaSpare> getSubstitutedBy() {
		if (substitutedBy == null) {
			substitutedBy = new EObjectResolvingEList<DaSpare>(DaSpare.class, this, CorePackage.CORE_DAG_NODE__SUBSTITUTED_BY);
		}
		return substitutedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNodeThroughput() {
		return nodeThroughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeThroughput(String newNodeThroughput) {
		String oldNodeThroughput = nodeThroughput;
		nodeThroughput = newNodeThroughput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__NODE_THROUGHPUT, oldNodeThroughput, nodeThroughput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComputationType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ComputationType newType) {
		ComputationType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TechType getTargetTech() {
		return targetTech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetTech(TechType newTargetTech) {
		TechType oldTargetTech = targetTech;
		targetTech = newTargetTech == null ? TARGET_TECH_EDEFAULT : newTargetTech;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__TARGET_TECH, oldTargetTech, targetTech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessingType getProcType() {
		return procType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcType(ProcessingType newProcType) {
		ProcessingType oldProcType = procType;
		procType = newProcType == null ? PROC_TYPE_EDEFAULT : newProcType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__PROC_TYPE, oldProcType, procType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceDataVolume getStore() {
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStore(DiceDataVolume newStore, NotificationChain msgs) {
		DiceDataVolume oldStore = store;
		store = newStore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__STORE, oldStore, newStore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStore(DiceDataVolume newStore) {
		if (newStore != store) {
			NotificationChain msgs = null;
			if (store != null)
				msgs = ((InternalEObject)store).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CORE_DAG_NODE__STORE, null, msgs);
			if (newStore != null)
				msgs = ((InternalEObject)newStore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CORE_DAG_NODE__STORE, null, msgs);
			msgs = basicSetStore(newStore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__STORE, newStore, newStore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiceDataSpecification getProvides() {
		return provides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvides(DiceDataSpecification newProvides, NotificationChain msgs) {
		DiceDataSpecification oldProvides = provides;
		provides = newProvides;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__PROVIDES, oldProvides, newProvides);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvides(DiceDataSpecification newProvides) {
		if (newProvides != provides) {
			NotificationChain msgs = null;
			if (provides != null)
				msgs = ((InternalEObject)provides).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.CORE_DAG_NODE__PROVIDES, null, msgs);
			if (newProvides != null)
				msgs = ((InternalEObject)newProvides).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.CORE_DAG_NODE__PROVIDES, null, msgs);
			msgs = basicSetProvides(newProvides, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__PROVIDES, newProvides, newProvides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceType getSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(SourceType newSourceType) {
		SourceType oldSourceType = sourceType;
		sourceType = newSourceType == null ? SOURCE_TYPE_EDEFAULT : newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRate() {
		return rate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRate(String newRate) {
		String oldRate = rate;
		rate = newRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__RATE, oldRate, rate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParallelism() {
		return parallelism;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParallelism(String newParallelism) {
		String oldParallelism = parallelism;
		parallelism = newParallelism;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__PARALLELISM, oldParallelism, parallelism));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkflowOperation getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(WorkflowOperation newOperation) {
		WorkflowOperation oldOperation = operation;
		operation = newOperation == null ? OPERATION_EDEFAULT : newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.CORE_DAG_NODE__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CoreDAGNode> getHasSuccessor() {
		if (hasSuccessor == null) {
			hasSuccessor = new EObjectResolvingEList<CoreDAGNode>(CoreDAGNode.class, this, CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR);
		}
		return hasSuccessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.CORE_DAG_NODE__FAULT:
				return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_DAG_NODE__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_DAG_NODE__FAILURE:
				return ((InternalEList<?>)getFailure()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_DAG_NODE__HAZARD:
				return ((InternalEList<?>)getHazard()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_DAG_NODE__REPAIR:
				return ((InternalEList<?>)getRepair()).basicRemove(otherEnd, msgs);
			case CorePackage.CORE_DAG_NODE__STORE:
				return basicSetStore(null, msgs);
			case CorePackage.CORE_DAG_NODE__PROVIDES:
				return basicSetProvides(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.CORE_DAG_NODE__RES_MULT:
				return getResMult();
			case CorePackage.CORE_DAG_NODE__IS_PROTECTED:
				return isIsProtected();
			case CorePackage.CORE_DAG_NODE__IS_ACTIVE:
				return isIsActive();
			case CorePackage.CORE_DAG_NODE__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
			case CorePackage.CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION:
				if (resolve) return getBase_InstanceSpecification();
				return basicGetBase_InstanceSpecification();
			case CorePackage.CORE_DAG_NODE__BASE_CLASSIFIER:
				if (resolve) return getBase_Classifier();
				return basicGetBase_Classifier();
			case CorePackage.CORE_DAG_NODE__BASE_LIFELINE:
				if (resolve) return getBase_Lifeline();
				return basicGetBase_Lifeline();
			case CorePackage.CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT:
				if (resolve) return getBase_ConnectableElement();
				return basicGetBase_ConnectableElement();
			case CorePackage.CORE_DAG_NODE__STATEFUL:
				return isStateful();
			case CorePackage.CORE_DAG_NODE__ORIGIN:
				return getOrigin();
			case CorePackage.CORE_DAG_NODE__FAILURE_COVERAGE:
				return getFailureCoverage();
			case CorePackage.CORE_DAG_NODE__PERC_PERM_FAULT:
				return getPercPermFault();
			case CorePackage.CORE_DAG_NODE__SS_AVAIL:
				return getSsAvail();
			case CorePackage.CORE_DAG_NODE__UNRELIABILITY:
				return getUnreliability();
			case CorePackage.CORE_DAG_NODE__RELIABILITY:
				return getReliability();
			case CorePackage.CORE_DAG_NODE__MISSION_TIME:
				return getMissionTime();
			case CorePackage.CORE_DAG_NODE__AVAIL_LEVEL:
				return getAvailLevel();
			case CorePackage.CORE_DAG_NODE__RELIABILITY_LEVEL:
				return getReliabilityLevel();
			case CorePackage.CORE_DAG_NODE__SAFETY_LEVEL:
				return getSafetyLevel();
			case CorePackage.CORE_DAG_NODE__COMPLEXITY:
				return getComplexity();
			case CorePackage.CORE_DAG_NODE__FAULT:
				return getFault();
			case CorePackage.CORE_DAG_NODE__ERROR:
				return getError();
			case CorePackage.CORE_DAG_NODE__FAILURE:
				return getFailure();
			case CorePackage.CORE_DAG_NODE__HAZARD:
				return getHazard();
			case CorePackage.CORE_DAG_NODE__REPAIR:
				return getRepair();
			case CorePackage.CORE_DAG_NODE__SUBSTITUTED_BY:
				return getSubstitutedBy();
			case CorePackage.CORE_DAG_NODE__NODE_THROUGHPUT:
				return getNodeThroughput();
			case CorePackage.CORE_DAG_NODE__TYPE:
				return getType();
			case CorePackage.CORE_DAG_NODE__TARGET_TECH:
				return getTargetTech();
			case CorePackage.CORE_DAG_NODE__PROC_TYPE:
				return getProcType();
			case CorePackage.CORE_DAG_NODE__STORE:
				return getStore();
			case CorePackage.CORE_DAG_NODE__PROVIDES:
				return getProvides();
			case CorePackage.CORE_DAG_NODE__SOURCE_TYPE:
				return getSourceType();
			case CorePackage.CORE_DAG_NODE__RATE:
				return getRate();
			case CorePackage.CORE_DAG_NODE__PARALLELISM:
				return getParallelism();
			case CorePackage.CORE_DAG_NODE__OPERATION:
				return getOperation();
			case CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR:
				return getHasSuccessor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.CORE_DAG_NODE__RES_MULT:
				setResMult((String)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__IS_PROTECTED:
				setIsProtected((Boolean)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__IS_ACTIVE:
				setIsActive((Boolean)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__BASE_PROPERTY:
				setBase_Property((Property)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION:
				setBase_InstanceSpecification((InstanceSpecification)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT:
				setBase_ConnectableElement((ConnectableElement)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__STATEFUL:
				setStateful((Boolean)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__ORIGIN:
				setOrigin((Origin)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__FAILURE_COVERAGE:
				getFailureCoverage().clear();
				getFailureCoverage().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__PERC_PERM_FAULT:
				getPercPermFault().clear();
				getPercPermFault().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__SS_AVAIL:
				getSsAvail().clear();
				getSsAvail().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__UNRELIABILITY:
				getUnreliability().clear();
				getUnreliability().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__RELIABILITY:
				getReliability().clear();
				getReliability().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__MISSION_TIME:
				getMissionTime().clear();
				getMissionTime().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__AVAIL_LEVEL:
				getAvailLevel().clear();
				getAvailLevel().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__RELIABILITY_LEVEL:
				getReliabilityLevel().clear();
				getReliabilityLevel().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__SAFETY_LEVEL:
				getSafetyLevel().clear();
				getSafetyLevel().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__COMPLEXITY:
				getComplexity().clear();
				getComplexity().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__FAULT:
				getFault().clear();
				getFault().addAll((Collection<? extends DaFault>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends DaError>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__FAILURE:
				getFailure().clear();
				getFailure().addAll((Collection<? extends DaFailure>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__HAZARD:
				getHazard().clear();
				getHazard().addAll((Collection<? extends DaHazard>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__REPAIR:
				getRepair().clear();
				getRepair().addAll((Collection<? extends DaRepair>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__SUBSTITUTED_BY:
				getSubstitutedBy().clear();
				getSubstitutedBy().addAll((Collection<? extends DaSpare>)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__NODE_THROUGHPUT:
				setNodeThroughput((String)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__TYPE:
				setType((ComputationType)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__TARGET_TECH:
				setTargetTech((TechType)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__PROC_TYPE:
				setProcType((ProcessingType)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__STORE:
				setStore((DiceDataVolume)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__PROVIDES:
				setProvides((DiceDataSpecification)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__SOURCE_TYPE:
				setSourceType((SourceType)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__RATE:
				setRate((String)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__PARALLELISM:
				setParallelism((String)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__OPERATION:
				setOperation((WorkflowOperation)newValue);
				return;
			case CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR:
				getHasSuccessor().clear();
				getHasSuccessor().addAll((Collection<? extends CoreDAGNode>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.CORE_DAG_NODE__RES_MULT:
				setResMult(RES_MULT_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__IS_PROTECTED:
				setIsProtected(IS_PROTECTED_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__IS_ACTIVE:
				setIsActive(IS_ACTIVE_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__BASE_PROPERTY:
				setBase_Property((Property)null);
				return;
			case CorePackage.CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION:
				setBase_InstanceSpecification((InstanceSpecification)null);
				return;
			case CorePackage.CORE_DAG_NODE__BASE_CLASSIFIER:
				setBase_Classifier((Classifier)null);
				return;
			case CorePackage.CORE_DAG_NODE__BASE_LIFELINE:
				setBase_Lifeline((Lifeline)null);
				return;
			case CorePackage.CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT:
				setBase_ConnectableElement((ConnectableElement)null);
				return;
			case CorePackage.CORE_DAG_NODE__STATEFUL:
				setStateful(STATEFUL_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__FAILURE_COVERAGE:
				getFailureCoverage().clear();
				return;
			case CorePackage.CORE_DAG_NODE__PERC_PERM_FAULT:
				getPercPermFault().clear();
				return;
			case CorePackage.CORE_DAG_NODE__SS_AVAIL:
				getSsAvail().clear();
				return;
			case CorePackage.CORE_DAG_NODE__UNRELIABILITY:
				getUnreliability().clear();
				return;
			case CorePackage.CORE_DAG_NODE__RELIABILITY:
				getReliability().clear();
				return;
			case CorePackage.CORE_DAG_NODE__MISSION_TIME:
				getMissionTime().clear();
				return;
			case CorePackage.CORE_DAG_NODE__AVAIL_LEVEL:
				getAvailLevel().clear();
				return;
			case CorePackage.CORE_DAG_NODE__RELIABILITY_LEVEL:
				getReliabilityLevel().clear();
				return;
			case CorePackage.CORE_DAG_NODE__SAFETY_LEVEL:
				getSafetyLevel().clear();
				return;
			case CorePackage.CORE_DAG_NODE__COMPLEXITY:
				getComplexity().clear();
				return;
			case CorePackage.CORE_DAG_NODE__FAULT:
				getFault().clear();
				return;
			case CorePackage.CORE_DAG_NODE__ERROR:
				getError().clear();
				return;
			case CorePackage.CORE_DAG_NODE__FAILURE:
				getFailure().clear();
				return;
			case CorePackage.CORE_DAG_NODE__HAZARD:
				getHazard().clear();
				return;
			case CorePackage.CORE_DAG_NODE__REPAIR:
				getRepair().clear();
				return;
			case CorePackage.CORE_DAG_NODE__SUBSTITUTED_BY:
				getSubstitutedBy().clear();
				return;
			case CorePackage.CORE_DAG_NODE__NODE_THROUGHPUT:
				setNodeThroughput(NODE_THROUGHPUT_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__TARGET_TECH:
				setTargetTech(TARGET_TECH_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__PROC_TYPE:
				setProcType(PROC_TYPE_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__STORE:
				setStore((DiceDataVolume)null);
				return;
			case CorePackage.CORE_DAG_NODE__PROVIDES:
				setProvides((DiceDataSpecification)null);
				return;
			case CorePackage.CORE_DAG_NODE__SOURCE_TYPE:
				setSourceType(SOURCE_TYPE_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__RATE:
				setRate(RATE_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__PARALLELISM:
				setParallelism(PARALLELISM_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__OPERATION:
				setOperation(OPERATION_EDEFAULT);
				return;
			case CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR:
				getHasSuccessor().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.CORE_DAG_NODE__RES_MULT:
				return RES_MULT_EDEFAULT == null ? resMult != null : !RES_MULT_EDEFAULT.equals(resMult);
			case CorePackage.CORE_DAG_NODE__IS_PROTECTED:
				return isProtected != IS_PROTECTED_EDEFAULT;
			case CorePackage.CORE_DAG_NODE__IS_ACTIVE:
				return isActive != IS_ACTIVE_EDEFAULT;
			case CorePackage.CORE_DAG_NODE__BASE_PROPERTY:
				return base_Property != null;
			case CorePackage.CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION:
				return base_InstanceSpecification != null;
			case CorePackage.CORE_DAG_NODE__BASE_CLASSIFIER:
				return base_Classifier != null;
			case CorePackage.CORE_DAG_NODE__BASE_LIFELINE:
				return base_Lifeline != null;
			case CorePackage.CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT:
				return base_ConnectableElement != null;
			case CorePackage.CORE_DAG_NODE__STATEFUL:
				return stateful != STATEFUL_EDEFAULT;
			case CorePackage.CORE_DAG_NODE__ORIGIN:
				return origin != ORIGIN_EDEFAULT;
			case CorePackage.CORE_DAG_NODE__FAILURE_COVERAGE:
				return failureCoverage != null && !failureCoverage.isEmpty();
			case CorePackage.CORE_DAG_NODE__PERC_PERM_FAULT:
				return percPermFault != null && !percPermFault.isEmpty();
			case CorePackage.CORE_DAG_NODE__SS_AVAIL:
				return ssAvail != null && !ssAvail.isEmpty();
			case CorePackage.CORE_DAG_NODE__UNRELIABILITY:
				return unreliability != null && !unreliability.isEmpty();
			case CorePackage.CORE_DAG_NODE__RELIABILITY:
				return reliability != null && !reliability.isEmpty();
			case CorePackage.CORE_DAG_NODE__MISSION_TIME:
				return missionTime != null && !missionTime.isEmpty();
			case CorePackage.CORE_DAG_NODE__AVAIL_LEVEL:
				return availLevel != null && !availLevel.isEmpty();
			case CorePackage.CORE_DAG_NODE__RELIABILITY_LEVEL:
				return reliabilityLevel != null && !reliabilityLevel.isEmpty();
			case CorePackage.CORE_DAG_NODE__SAFETY_LEVEL:
				return safetyLevel != null && !safetyLevel.isEmpty();
			case CorePackage.CORE_DAG_NODE__COMPLEXITY:
				return complexity != null && !complexity.isEmpty();
			case CorePackage.CORE_DAG_NODE__FAULT:
				return fault != null && !fault.isEmpty();
			case CorePackage.CORE_DAG_NODE__ERROR:
				return error != null && !error.isEmpty();
			case CorePackage.CORE_DAG_NODE__FAILURE:
				return failure != null && !failure.isEmpty();
			case CorePackage.CORE_DAG_NODE__HAZARD:
				return hazard != null && !hazard.isEmpty();
			case CorePackage.CORE_DAG_NODE__REPAIR:
				return repair != null && !repair.isEmpty();
			case CorePackage.CORE_DAG_NODE__SUBSTITUTED_BY:
				return substitutedBy != null && !substitutedBy.isEmpty();
			case CorePackage.CORE_DAG_NODE__NODE_THROUGHPUT:
				return NODE_THROUGHPUT_EDEFAULT == null ? nodeThroughput != null : !NODE_THROUGHPUT_EDEFAULT.equals(nodeThroughput);
			case CorePackage.CORE_DAG_NODE__TYPE:
				return type != TYPE_EDEFAULT;
			case CorePackage.CORE_DAG_NODE__TARGET_TECH:
				return targetTech != TARGET_TECH_EDEFAULT;
			case CorePackage.CORE_DAG_NODE__PROC_TYPE:
				return procType != PROC_TYPE_EDEFAULT;
			case CorePackage.CORE_DAG_NODE__STORE:
				return store != null;
			case CorePackage.CORE_DAG_NODE__PROVIDES:
				return provides != null;
			case CorePackage.CORE_DAG_NODE__SOURCE_TYPE:
				return sourceType != SOURCE_TYPE_EDEFAULT;
			case CorePackage.CORE_DAG_NODE__RATE:
				return RATE_EDEFAULT == null ? rate != null : !RATE_EDEFAULT.equals(rate);
			case CorePackage.CORE_DAG_NODE__PARALLELISM:
				return PARALLELISM_EDEFAULT == null ? parallelism != null : !PARALLELISM_EDEFAULT.equals(parallelism);
			case CorePackage.CORE_DAG_NODE__OPERATION:
				return operation != OPERATION_EDEFAULT;
			case CorePackage.CORE_DAG_NODE__HAS_SUCCESSOR:
				return hasSuccessor != null && !hasSuccessor.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Resource.class) {
			switch (derivedFeatureID) {
				case CorePackage.CORE_DAG_NODE__RES_MULT: return GRMPackage.RESOURCE__RES_MULT;
				case CorePackage.CORE_DAG_NODE__IS_PROTECTED: return GRMPackage.RESOURCE__IS_PROTECTED;
				case CorePackage.CORE_DAG_NODE__IS_ACTIVE: return GRMPackage.RESOURCE__IS_ACTIVE;
				case CorePackage.CORE_DAG_NODE__BASE_PROPERTY: return GRMPackage.RESOURCE__BASE_PROPERTY;
				case CorePackage.CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION: return GRMPackage.RESOURCE__BASE_INSTANCE_SPECIFICATION;
				case CorePackage.CORE_DAG_NODE__BASE_CLASSIFIER: return GRMPackage.RESOURCE__BASE_CLASSIFIER;
				case CorePackage.CORE_DAG_NODE__BASE_LIFELINE: return GRMPackage.RESOURCE__BASE_LIFELINE;
				case CorePackage.CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT: return GRMPackage.RESOURCE__BASE_CONNECTABLE_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DaComponent.class) {
			switch (derivedFeatureID) {
				case CorePackage.CORE_DAG_NODE__STATEFUL: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__STATEFUL;
				case CorePackage.CORE_DAG_NODE__ORIGIN: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__ORIGIN;
				case CorePackage.CORE_DAG_NODE__FAILURE_COVERAGE: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__FAILURE_COVERAGE;
				case CorePackage.CORE_DAG_NODE__PERC_PERM_FAULT: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__PERC_PERM_FAULT;
				case CorePackage.CORE_DAG_NODE__SS_AVAIL: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__SS_AVAIL;
				case CorePackage.CORE_DAG_NODE__UNRELIABILITY: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__UNRELIABILITY;
				case CorePackage.CORE_DAG_NODE__RELIABILITY: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__RELIABILITY;
				case CorePackage.CORE_DAG_NODE__MISSION_TIME: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__MISSION_TIME;
				case CorePackage.CORE_DAG_NODE__AVAIL_LEVEL: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__AVAIL_LEVEL;
				case CorePackage.CORE_DAG_NODE__RELIABILITY_LEVEL: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__RELIABILITY_LEVEL;
				case CorePackage.CORE_DAG_NODE__SAFETY_LEVEL: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__SAFETY_LEVEL;
				case CorePackage.CORE_DAG_NODE__COMPLEXITY: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__COMPLEXITY;
				case CorePackage.CORE_DAG_NODE__FAULT: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__FAULT;
				case CorePackage.CORE_DAG_NODE__ERROR: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__ERROR;
				case CorePackage.CORE_DAG_NODE__FAILURE: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__FAILURE;
				case CorePackage.CORE_DAG_NODE__HAZARD: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__HAZARD;
				case CorePackage.CORE_DAG_NODE__REPAIR: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__REPAIR;
				case CorePackage.CORE_DAG_NODE__SUBSTITUTED_BY: return com.masdes.dam.Core.CorePackage.DA_COMPONENT__SUBSTITUTED_BY;
				default: return -1;
			}
		}
		if (baseClass == DpimComputationNode.class) {
			switch (derivedFeatureID) {
				case CorePackage.CORE_DAG_NODE__NODE_THROUGHPUT: return DPIMPackage.DPIM_COMPUTATION_NODE__NODE_THROUGHPUT;
				case CorePackage.CORE_DAG_NODE__TYPE: return DPIMPackage.DPIM_COMPUTATION_NODE__TYPE;
				case CorePackage.CORE_DAG_NODE__TARGET_TECH: return DPIMPackage.DPIM_COMPUTATION_NODE__TARGET_TECH;
				case CorePackage.CORE_DAG_NODE__PROC_TYPE: return DPIMPackage.DPIM_COMPUTATION_NODE__PROC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == DpimSourceNode.class) {
			switch (derivedFeatureID) {
				case CorePackage.CORE_DAG_NODE__STORE: return DPIMPackage.DPIM_SOURCE_NODE__STORE;
				case CorePackage.CORE_DAG_NODE__PROVIDES: return DPIMPackage.DPIM_SOURCE_NODE__PROVIDES;
				case CorePackage.CORE_DAG_NODE__SOURCE_TYPE: return DPIMPackage.DPIM_SOURCE_NODE__SOURCE_TYPE;
				case CorePackage.CORE_DAG_NODE__RATE: return DPIMPackage.DPIM_SOURCE_NODE__RATE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Resource.class) {
			switch (baseFeatureID) {
				case GRMPackage.RESOURCE__RES_MULT: return CorePackage.CORE_DAG_NODE__RES_MULT;
				case GRMPackage.RESOURCE__IS_PROTECTED: return CorePackage.CORE_DAG_NODE__IS_PROTECTED;
				case GRMPackage.RESOURCE__IS_ACTIVE: return CorePackage.CORE_DAG_NODE__IS_ACTIVE;
				case GRMPackage.RESOURCE__BASE_PROPERTY: return CorePackage.CORE_DAG_NODE__BASE_PROPERTY;
				case GRMPackage.RESOURCE__BASE_INSTANCE_SPECIFICATION: return CorePackage.CORE_DAG_NODE__BASE_INSTANCE_SPECIFICATION;
				case GRMPackage.RESOURCE__BASE_CLASSIFIER: return CorePackage.CORE_DAG_NODE__BASE_CLASSIFIER;
				case GRMPackage.RESOURCE__BASE_LIFELINE: return CorePackage.CORE_DAG_NODE__BASE_LIFELINE;
				case GRMPackage.RESOURCE__BASE_CONNECTABLE_ELEMENT: return CorePackage.CORE_DAG_NODE__BASE_CONNECTABLE_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == DaComponent.class) {
			switch (baseFeatureID) {
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__STATEFUL: return CorePackage.CORE_DAG_NODE__STATEFUL;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__ORIGIN: return CorePackage.CORE_DAG_NODE__ORIGIN;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__FAILURE_COVERAGE: return CorePackage.CORE_DAG_NODE__FAILURE_COVERAGE;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__PERC_PERM_FAULT: return CorePackage.CORE_DAG_NODE__PERC_PERM_FAULT;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__SS_AVAIL: return CorePackage.CORE_DAG_NODE__SS_AVAIL;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__UNRELIABILITY: return CorePackage.CORE_DAG_NODE__UNRELIABILITY;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__RELIABILITY: return CorePackage.CORE_DAG_NODE__RELIABILITY;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__MISSION_TIME: return CorePackage.CORE_DAG_NODE__MISSION_TIME;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__AVAIL_LEVEL: return CorePackage.CORE_DAG_NODE__AVAIL_LEVEL;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__RELIABILITY_LEVEL: return CorePackage.CORE_DAG_NODE__RELIABILITY_LEVEL;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__SAFETY_LEVEL: return CorePackage.CORE_DAG_NODE__SAFETY_LEVEL;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__COMPLEXITY: return CorePackage.CORE_DAG_NODE__COMPLEXITY;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__FAULT: return CorePackage.CORE_DAG_NODE__FAULT;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__ERROR: return CorePackage.CORE_DAG_NODE__ERROR;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__FAILURE: return CorePackage.CORE_DAG_NODE__FAILURE;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__HAZARD: return CorePackage.CORE_DAG_NODE__HAZARD;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__REPAIR: return CorePackage.CORE_DAG_NODE__REPAIR;
				case com.masdes.dam.Core.CorePackage.DA_COMPONENT__SUBSTITUTED_BY: return CorePackage.CORE_DAG_NODE__SUBSTITUTED_BY;
				default: return -1;
			}
		}
		if (baseClass == DpimComputationNode.class) {
			switch (baseFeatureID) {
				case DPIMPackage.DPIM_COMPUTATION_NODE__NODE_THROUGHPUT: return CorePackage.CORE_DAG_NODE__NODE_THROUGHPUT;
				case DPIMPackage.DPIM_COMPUTATION_NODE__TYPE: return CorePackage.CORE_DAG_NODE__TYPE;
				case DPIMPackage.DPIM_COMPUTATION_NODE__TARGET_TECH: return CorePackage.CORE_DAG_NODE__TARGET_TECH;
				case DPIMPackage.DPIM_COMPUTATION_NODE__PROC_TYPE: return CorePackage.CORE_DAG_NODE__PROC_TYPE;
				default: return -1;
			}
		}
		if (baseClass == DpimSourceNode.class) {
			switch (baseFeatureID) {
				case DPIMPackage.DPIM_SOURCE_NODE__STORE: return CorePackage.CORE_DAG_NODE__STORE;
				case DPIMPackage.DPIM_SOURCE_NODE__PROVIDES: return CorePackage.CORE_DAG_NODE__PROVIDES;
				case DPIMPackage.DPIM_SOURCE_NODE__SOURCE_TYPE: return CorePackage.CORE_DAG_NODE__SOURCE_TYPE;
				case DPIMPackage.DPIM_SOURCE_NODE__RATE: return CorePackage.CORE_DAG_NODE__RATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resMult: ");
		result.append(resMult);
		result.append(", isProtected: ");
		result.append(isProtected);
		result.append(", isActive: ");
		result.append(isActive);
		result.append(", stateful: ");
		result.append(stateful);
		result.append(", origin: ");
		result.append(origin);
		result.append(", failureCoverage: ");
		result.append(failureCoverage);
		result.append(", percPermFault: ");
		result.append(percPermFault);
		result.append(", ssAvail: ");
		result.append(ssAvail);
		result.append(", unreliability: ");
		result.append(unreliability);
		result.append(", reliability: ");
		result.append(reliability);
		result.append(", missionTime: ");
		result.append(missionTime);
		result.append(", availLevel: ");
		result.append(availLevel);
		result.append(", reliabilityLevel: ");
		result.append(reliabilityLevel);
		result.append(", safetyLevel: ");
		result.append(safetyLevel);
		result.append(", complexity: ");
		result.append(complexity);
		result.append(", nodeThroughput: ");
		result.append(nodeThroughput);
		result.append(", type: ");
		result.append(type);
		result.append(", targetTech: ");
		result.append(targetTech);
		result.append(", procType: ");
		result.append(procType);
		result.append(", sourceType: ");
		result.append(sourceType);
		result.append(", rate: ");
		result.append(rate);
		result.append(", parallelism: ");
		result.append(parallelism);
		result.append(", operation: ");
		result.append(operation);
		result.append(')');
		return result.toString();
	}

} //CoreDAGNodeImpl
