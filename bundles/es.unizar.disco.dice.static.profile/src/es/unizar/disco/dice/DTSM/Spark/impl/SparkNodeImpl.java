/**
 */
package es.unizar.disco.dice.DTSM.Spark.impl;

import es.unizar.disco.dice.DTSM.Core.impl.CoreComputationNodeImpl;

import es.unizar.disco.dice.DTSM.Spark.SparkNode;
import es.unizar.disco.dice.DTSM.Spark.SparkPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaTimedObs;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaWorkloadEvent;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.GRMPackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.Resource;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.ResourceUsage;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.Clock;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimePackage;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedElement;
import org.eclipse.papyrus.MARTE.MARTE_Foundations.Time.TimedProcessing;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Event;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getExecTime <em>Exec Time</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getAllocatedMemory <em>Allocated Memory</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getUsedMemory <em>Used Memory</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getPowerPeak <em>Power Peak</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getEnergy <em>Energy</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getBase_NamedElement <em>Base Named Element</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getSubUsage <em>Sub Usage</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getUsedResources <em>Used Resources</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getMsgSize <em>Msg Size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getOn <em>On</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getBase_Action <em>Base Action</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getBase_Behavior <em>Base Behavior</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getBase_Message <em>Base Message</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getStart <em>Start</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getFinish <em>Finish</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getCause <em>Cause</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getHostDemand <em>Host Demand</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getHostDemandOps <em>Host Demand Ops</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getInterOccT <em>Inter Occ T</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getRespT <em>Resp T</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getUtilization <em>Utilization</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getUtilizationOnHost <em>Utilization On Host</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getRoot <em>Root</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getParentStep <em>Parent Step</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getTiming <em>Timing</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getNCores <em>NCores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DTSM.Spark.impl.SparkNodeImpl#getMemory <em>Memory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SparkNodeImpl extends CoreComputationNodeImpl implements SparkNode {
	/**
	 * The cached value of the '{@link #getExecTime() <em>Exec Time</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecTime()
	 * @generated
	 * @ordered
	 */
	protected EList<String> execTime;

	/**
	 * The cached value of the '{@link #getAllocatedMemory() <em>Allocated Memory</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatedMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<String> allocatedMemory;

	/**
	 * The cached value of the '{@link #getUsedMemory() <em>Used Memory</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedMemory()
	 * @generated
	 * @ordered
	 */
	protected EList<String> usedMemory;

	/**
	 * The cached value of the '{@link #getPowerPeak() <em>Power Peak</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerPeak()
	 * @generated
	 * @ordered
	 */
	protected EList<String> powerPeak;

	/**
	 * The cached value of the '{@link #getEnergy() <em>Energy</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnergy()
	 * @generated
	 * @ordered
	 */
	protected EList<String> energy;

	/**
	 * The cached value of the '{@link #getBase_NamedElement() <em>Base Named Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_NamedElement()
	 * @generated
	 * @ordered
	 */
	protected NamedElement base_NamedElement;

	/**
	 * The cached value of the '{@link #getSubUsage() <em>Sub Usage</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubUsage()
	 * @generated
	 * @ordered
	 */
	protected EList<ResourceUsage> subUsage;

	/**
	 * The cached value of the '{@link #getUsedResources() <em>Used Resources</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedResources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> usedResources;

	/**
	 * The cached value of the '{@link #getMsgSize() <em>Msg Size</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMsgSize()
	 * @generated
	 * @ordered
	 */
	protected EList<String> msgSize;

	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> on;

	/**
	 * The cached value of the '{@link #getBase_Action() <em>Base Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Action()
	 * @generated
	 * @ordered
	 */
	protected Action base_Action;

	/**
	 * The cached value of the '{@link #getBase_Behavior() <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Behavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior base_Behavior;

	/**
	 * The cached value of the '{@link #getBase_Message() <em>Base Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Message()
	 * @generated
	 * @ordered
	 */
	protected Message base_Message;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification duration;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected Event start;

	/**
	 * The cached value of the '{@link #getFinish() <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinish()
	 * @generated
	 * @ordered
	 */
	protected Event finish;

	/**
	 * The cached value of the '{@link #getCause() <em>Cause</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCause()
	 * @generated
	 * @ordered
	 */
	protected GaWorkloadEvent cause;

	/**
	 * The cached value of the '{@link #getHostDemand() <em>Host Demand</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemand()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hostDemand;

	/**
	 * The cached value of the '{@link #getHostDemandOps() <em>Host Demand Ops</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostDemandOps()
	 * @generated
	 * @ordered
	 */
	protected EList<String> hostDemandOps;

	/**
	 * The cached value of the '{@link #getInterOccT() <em>Inter Occ T</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterOccT()
	 * @generated
	 * @ordered
	 */
	protected EList<String> interOccT;

	/**
	 * The cached value of the '{@link #getThroughput() <em>Throughput</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThroughput()
	 * @generated
	 * @ordered
	 */
	protected EList<String> throughput;

	/**
	 * The cached value of the '{@link #getRespT() <em>Resp T</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespT()
	 * @generated
	 * @ordered
	 */
	protected EList<String> respT;

	/**
	 * The cached value of the '{@link #getUtilization() <em>Utilization</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilization()
	 * @generated
	 * @ordered
	 */
	protected EList<String> utilization;

	/**
	 * The cached value of the '{@link #getUtilizationOnHost() <em>Utilization On Host</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilizationOnHost()
	 * @generated
	 * @ordered
	 */
	protected EList<String> utilizationOnHost;

	/**
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected GaStep root;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<GaStep> steps;

	/**
	 * The cached value of the '{@link #getParentStep() <em>Parent Step</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentStep()
	 * @generated
	 * @ordered
	 */
	protected EList<GaStep> parentStep;

	/**
	 * The cached value of the '{@link #getTiming() <em>Timing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiming()
	 * @generated
	 * @ordered
	 */
	protected EList<GaTimedObs> timing;

	/**
	 * The default value of the '{@link #getNCores() <em>NCores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNCores()
	 * @generated
	 * @ordered
	 */
	protected static final String NCORES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNCores() <em>NCores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNCores()
	 * @generated
	 * @ordered
	 */
	protected String nCores = NCORES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected static final String MEMORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMemory() <em>Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemory()
	 * @generated
	 * @ordered
	 */
	protected String memory = MEMORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SparkNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SparkPackage.Literals.SPARK_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExecTime() {
		if (execTime == null) {
			execTime = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__EXEC_TIME);
		}
		return execTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllocatedMemory() {
		if (allocatedMemory == null) {
			allocatedMemory = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__ALLOCATED_MEMORY);
		}
		return allocatedMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUsedMemory() {
		if (usedMemory == null) {
			usedMemory = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__USED_MEMORY);
		}
		return usedMemory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPowerPeak() {
		if (powerPeak == null) {
			powerPeak = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__POWER_PEAK);
		}
		return powerPeak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnergy() {
		if (energy == null) {
			energy = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__ENERGY);
		}
		return energy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement getBase_NamedElement() {
		if (base_NamedElement != null && base_NamedElement.eIsProxy()) {
			InternalEObject oldBase_NamedElement = (InternalEObject)base_NamedElement;
			base_NamedElement = (NamedElement)eResolveProxy(oldBase_NamedElement);
			if (base_NamedElement != oldBase_NamedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SparkPackage.SPARK_NODE__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
			}
		}
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamedElement basicGetBase_NamedElement() {
		return base_NamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_NamedElement(NamedElement newBase_NamedElement) {
		NamedElement oldBase_NamedElement = base_NamedElement;
		base_NamedElement = newBase_NamedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__BASE_NAMED_ELEMENT, oldBase_NamedElement, base_NamedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceUsage> getSubUsage() {
		if (subUsage == null) {
			subUsage = new EObjectResolvingEList<ResourceUsage>(ResourceUsage.class, this, SparkPackage.SPARK_NODE__SUB_USAGE);
		}
		return subUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getUsedResources() {
		if (usedResources == null) {
			usedResources = new EObjectResolvingEList<Resource>(Resource.class, this, SparkPackage.SPARK_NODE__USED_RESOURCES);
		}
		return usedResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMsgSize() {
		if (msgSize == null) {
			msgSize = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__MSG_SIZE);
		}
		return msgSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clock> getOn() {
		if (on == null) {
			on = new EObjectResolvingEList<Clock>(Clock.class, this, SparkPackage.SPARK_NODE__ON);
		}
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getBase_Action() {
		if (base_Action != null && base_Action.eIsProxy()) {
			InternalEObject oldBase_Action = (InternalEObject)base_Action;
			base_Action = (Action)eResolveProxy(oldBase_Action);
			if (base_Action != oldBase_Action) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SparkPackage.SPARK_NODE__BASE_ACTION, oldBase_Action, base_Action));
			}
		}
		return base_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action basicGetBase_Action() {
		return base_Action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Action(Action newBase_Action) {
		Action oldBase_Action = base_Action;
		base_Action = newBase_Action;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__BASE_ACTION, oldBase_Action, base_Action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBase_Behavior() {
		if (base_Behavior != null && base_Behavior.eIsProxy()) {
			InternalEObject oldBase_Behavior = (InternalEObject)base_Behavior;
			base_Behavior = (Behavior)eResolveProxy(oldBase_Behavior);
			if (base_Behavior != oldBase_Behavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SparkPackage.SPARK_NODE__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
			}
		}
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBase_Behavior() {
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Behavior(Behavior newBase_Behavior) {
		Behavior oldBase_Behavior = base_Behavior;
		base_Behavior = newBase_Behavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getBase_Message() {
		if (base_Message != null && base_Message.eIsProxy()) {
			InternalEObject oldBase_Message = (InternalEObject)base_Message;
			base_Message = (Message)eResolveProxy(oldBase_Message);
			if (base_Message != oldBase_Message) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SparkPackage.SPARK_NODE__BASE_MESSAGE, oldBase_Message, base_Message));
			}
		}
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetBase_Message() {
		return base_Message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Message(Message newBase_Message) {
		Message oldBase_Message = base_Message;
		base_Message = newBase_Message;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__BASE_MESSAGE, oldBase_Message, base_Message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDuration(ValueSpecification newDuration, NotificationChain msgs) {
		ValueSpecification oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__DURATION, oldDuration, newDuration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(ValueSpecification newDuration) {
		if (newDuration != duration) {
			NotificationChain msgs = null;
			if (duration != null)
				msgs = ((InternalEObject)duration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SparkPackage.SPARK_NODE__DURATION, null, msgs);
			if (newDuration != null)
				msgs = ((InternalEObject)newDuration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SparkPackage.SPARK_NODE__DURATION, null, msgs);
			msgs = basicSetDuration(newDuration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__DURATION, newDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (Event)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SparkPackage.SPARK_NODE__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Event newStart) {
		Event oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event getFinish() {
		if (finish != null && finish.eIsProxy()) {
			InternalEObject oldFinish = (InternalEObject)finish;
			finish = (Event)eResolveProxy(oldFinish);
			if (finish != oldFinish) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SparkPackage.SPARK_NODE__FINISH, oldFinish, finish));
			}
		}
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event basicGetFinish() {
		return finish;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinish(Event newFinish) {
		Event oldFinish = finish;
		finish = newFinish;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__FINISH, oldFinish, finish));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaWorkloadEvent getCause() {
		if (cause != null && cause.eIsProxy()) {
			InternalEObject oldCause = (InternalEObject)cause;
			cause = (GaWorkloadEvent)eResolveProxy(oldCause);
			if (cause != oldCause) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SparkPackage.SPARK_NODE__CAUSE, oldCause, cause));
			}
		}
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaWorkloadEvent basicGetCause() {
		return cause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCause(GaWorkloadEvent newCause) {
		GaWorkloadEvent oldCause = cause;
		cause = newCause;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__CAUSE, oldCause, cause));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHostDemand() {
		if (hostDemand == null) {
			hostDemand = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__HOST_DEMAND);
		}
		return hostDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getHostDemandOps() {
		if (hostDemandOps == null) {
			hostDemandOps = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__HOST_DEMAND_OPS);
		}
		return hostDemandOps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInterOccT() {
		if (interOccT == null) {
			interOccT = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__INTER_OCC_T);
		}
		return interOccT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getThroughput() {
		if (throughput == null) {
			throughput = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__THROUGHPUT);
		}
		return throughput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRespT() {
		if (respT == null) {
			respT = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__RESP_T);
		}
		return respT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUtilization() {
		if (utilization == null) {
			utilization = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__UTILIZATION);
		}
		return utilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUtilizationOnHost() {
		if (utilizationOnHost == null) {
			utilizationOnHost = new EDataTypeUniqueEList<String>(String.class, this, SparkPackage.SPARK_NODE__UTILIZATION_ON_HOST);
		}
		return utilizationOnHost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaStep getRoot() {
		if (root != null && root.eIsProxy()) {
			InternalEObject oldRoot = (InternalEObject)root;
			root = (GaStep)eResolveProxy(oldRoot);
			if (root != oldRoot) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SparkPackage.SPARK_NODE__ROOT, oldRoot, root));
			}
		}
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaStep basicGetRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(GaStep newRoot) {
		GaStep oldRoot = root;
		root = newRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__ROOT, oldRoot, root));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GaStep> getSteps() {
		if (steps == null) {
			steps = new EObjectWithInverseResolvingEList<GaStep>(GaStep.class, this, SparkPackage.SPARK_NODE__STEPS, GQAMPackage.GA_STEP__SCENARIO);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GaStep> getParentStep() {
		if (parentStep == null) {
			parentStep = new EObjectWithInverseResolvingEList<GaStep>(GaStep.class, this, SparkPackage.SPARK_NODE__PARENT_STEP, GQAMPackage.GA_STEP__CHILD_SCENARIO);
		}
		return parentStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GaTimedObs> getTiming() {
		if (timing == null) {
			timing = new EObjectResolvingEList<GaTimedObs>(GaTimedObs.class, this, SparkPackage.SPARK_NODE__TIMING);
		}
		return timing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNCores() {
		return nCores;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNCores(String newNCores) {
		String oldNCores = nCores;
		nCores = newNCores;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__NCORES, oldNCores, nCores));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMemory() {
		return memory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemory(String newMemory) {
		String oldMemory = memory;
		memory = newMemory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SparkPackage.SPARK_NODE__MEMORY, oldMemory, memory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SparkPackage.SPARK_NODE__STEPS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSteps()).basicAdd(otherEnd, msgs);
			case SparkPackage.SPARK_NODE__PARENT_STEP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParentStep()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SparkPackage.SPARK_NODE__DURATION:
				return basicSetDuration(null, msgs);
			case SparkPackage.SPARK_NODE__STEPS:
				return ((InternalEList<?>)getSteps()).basicRemove(otherEnd, msgs);
			case SparkPackage.SPARK_NODE__PARENT_STEP:
				return ((InternalEList<?>)getParentStep()).basicRemove(otherEnd, msgs);
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
			case SparkPackage.SPARK_NODE__EXEC_TIME:
				return getExecTime();
			case SparkPackage.SPARK_NODE__ALLOCATED_MEMORY:
				return getAllocatedMemory();
			case SparkPackage.SPARK_NODE__USED_MEMORY:
				return getUsedMemory();
			case SparkPackage.SPARK_NODE__POWER_PEAK:
				return getPowerPeak();
			case SparkPackage.SPARK_NODE__ENERGY:
				return getEnergy();
			case SparkPackage.SPARK_NODE__BASE_NAMED_ELEMENT:
				if (resolve) return getBase_NamedElement();
				return basicGetBase_NamedElement();
			case SparkPackage.SPARK_NODE__SUB_USAGE:
				return getSubUsage();
			case SparkPackage.SPARK_NODE__USED_RESOURCES:
				return getUsedResources();
			case SparkPackage.SPARK_NODE__MSG_SIZE:
				return getMsgSize();
			case SparkPackage.SPARK_NODE__ON:
				return getOn();
			case SparkPackage.SPARK_NODE__BASE_ACTION:
				if (resolve) return getBase_Action();
				return basicGetBase_Action();
			case SparkPackage.SPARK_NODE__BASE_BEHAVIOR:
				if (resolve) return getBase_Behavior();
				return basicGetBase_Behavior();
			case SparkPackage.SPARK_NODE__BASE_MESSAGE:
				if (resolve) return getBase_Message();
				return basicGetBase_Message();
			case SparkPackage.SPARK_NODE__DURATION:
				return getDuration();
			case SparkPackage.SPARK_NODE__START:
				if (resolve) return getStart();
				return basicGetStart();
			case SparkPackage.SPARK_NODE__FINISH:
				if (resolve) return getFinish();
				return basicGetFinish();
			case SparkPackage.SPARK_NODE__CAUSE:
				if (resolve) return getCause();
				return basicGetCause();
			case SparkPackage.SPARK_NODE__HOST_DEMAND:
				return getHostDemand();
			case SparkPackage.SPARK_NODE__HOST_DEMAND_OPS:
				return getHostDemandOps();
			case SparkPackage.SPARK_NODE__INTER_OCC_T:
				return getInterOccT();
			case SparkPackage.SPARK_NODE__THROUGHPUT:
				return getThroughput();
			case SparkPackage.SPARK_NODE__RESP_T:
				return getRespT();
			case SparkPackage.SPARK_NODE__UTILIZATION:
				return getUtilization();
			case SparkPackage.SPARK_NODE__UTILIZATION_ON_HOST:
				return getUtilizationOnHost();
			case SparkPackage.SPARK_NODE__ROOT:
				if (resolve) return getRoot();
				return basicGetRoot();
			case SparkPackage.SPARK_NODE__STEPS:
				return getSteps();
			case SparkPackage.SPARK_NODE__PARENT_STEP:
				return getParentStep();
			case SparkPackage.SPARK_NODE__TIMING:
				return getTiming();
			case SparkPackage.SPARK_NODE__NCORES:
				return getNCores();
			case SparkPackage.SPARK_NODE__MEMORY:
				return getMemory();
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
			case SparkPackage.SPARK_NODE__EXEC_TIME:
				getExecTime().clear();
				getExecTime().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__ALLOCATED_MEMORY:
				getAllocatedMemory().clear();
				getAllocatedMemory().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__USED_MEMORY:
				getUsedMemory().clear();
				getUsedMemory().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__POWER_PEAK:
				getPowerPeak().clear();
				getPowerPeak().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__ENERGY:
				getEnergy().clear();
				getEnergy().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)newValue);
				return;
			case SparkPackage.SPARK_NODE__SUB_USAGE:
				getSubUsage().clear();
				getSubUsage().addAll((Collection<? extends ResourceUsage>)newValue);
				return;
			case SparkPackage.SPARK_NODE__USED_RESOURCES:
				getUsedResources().clear();
				getUsedResources().addAll((Collection<? extends Resource>)newValue);
				return;
			case SparkPackage.SPARK_NODE__MSG_SIZE:
				getMsgSize().clear();
				getMsgSize().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__ON:
				getOn().clear();
				getOn().addAll((Collection<? extends Clock>)newValue);
				return;
			case SparkPackage.SPARK_NODE__BASE_ACTION:
				setBase_Action((Action)newValue);
				return;
			case SparkPackage.SPARK_NODE__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)newValue);
				return;
			case SparkPackage.SPARK_NODE__BASE_MESSAGE:
				setBase_Message((Message)newValue);
				return;
			case SparkPackage.SPARK_NODE__DURATION:
				setDuration((ValueSpecification)newValue);
				return;
			case SparkPackage.SPARK_NODE__START:
				setStart((Event)newValue);
				return;
			case SparkPackage.SPARK_NODE__FINISH:
				setFinish((Event)newValue);
				return;
			case SparkPackage.SPARK_NODE__CAUSE:
				setCause((GaWorkloadEvent)newValue);
				return;
			case SparkPackage.SPARK_NODE__HOST_DEMAND:
				getHostDemand().clear();
				getHostDemand().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__HOST_DEMAND_OPS:
				getHostDemandOps().clear();
				getHostDemandOps().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__INTER_OCC_T:
				getInterOccT().clear();
				getInterOccT().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__THROUGHPUT:
				getThroughput().clear();
				getThroughput().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__RESP_T:
				getRespT().clear();
				getRespT().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__UTILIZATION:
				getUtilization().clear();
				getUtilization().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__UTILIZATION_ON_HOST:
				getUtilizationOnHost().clear();
				getUtilizationOnHost().addAll((Collection<? extends String>)newValue);
				return;
			case SparkPackage.SPARK_NODE__ROOT:
				setRoot((GaStep)newValue);
				return;
			case SparkPackage.SPARK_NODE__STEPS:
				getSteps().clear();
				getSteps().addAll((Collection<? extends GaStep>)newValue);
				return;
			case SparkPackage.SPARK_NODE__PARENT_STEP:
				getParentStep().clear();
				getParentStep().addAll((Collection<? extends GaStep>)newValue);
				return;
			case SparkPackage.SPARK_NODE__TIMING:
				getTiming().clear();
				getTiming().addAll((Collection<? extends GaTimedObs>)newValue);
				return;
			case SparkPackage.SPARK_NODE__NCORES:
				setNCores((String)newValue);
				return;
			case SparkPackage.SPARK_NODE__MEMORY:
				setMemory((String)newValue);
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
			case SparkPackage.SPARK_NODE__EXEC_TIME:
				getExecTime().clear();
				return;
			case SparkPackage.SPARK_NODE__ALLOCATED_MEMORY:
				getAllocatedMemory().clear();
				return;
			case SparkPackage.SPARK_NODE__USED_MEMORY:
				getUsedMemory().clear();
				return;
			case SparkPackage.SPARK_NODE__POWER_PEAK:
				getPowerPeak().clear();
				return;
			case SparkPackage.SPARK_NODE__ENERGY:
				getEnergy().clear();
				return;
			case SparkPackage.SPARK_NODE__BASE_NAMED_ELEMENT:
				setBase_NamedElement((NamedElement)null);
				return;
			case SparkPackage.SPARK_NODE__SUB_USAGE:
				getSubUsage().clear();
				return;
			case SparkPackage.SPARK_NODE__USED_RESOURCES:
				getUsedResources().clear();
				return;
			case SparkPackage.SPARK_NODE__MSG_SIZE:
				getMsgSize().clear();
				return;
			case SparkPackage.SPARK_NODE__ON:
				getOn().clear();
				return;
			case SparkPackage.SPARK_NODE__BASE_ACTION:
				setBase_Action((Action)null);
				return;
			case SparkPackage.SPARK_NODE__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)null);
				return;
			case SparkPackage.SPARK_NODE__BASE_MESSAGE:
				setBase_Message((Message)null);
				return;
			case SparkPackage.SPARK_NODE__DURATION:
				setDuration((ValueSpecification)null);
				return;
			case SparkPackage.SPARK_NODE__START:
				setStart((Event)null);
				return;
			case SparkPackage.SPARK_NODE__FINISH:
				setFinish((Event)null);
				return;
			case SparkPackage.SPARK_NODE__CAUSE:
				setCause((GaWorkloadEvent)null);
				return;
			case SparkPackage.SPARK_NODE__HOST_DEMAND:
				getHostDemand().clear();
				return;
			case SparkPackage.SPARK_NODE__HOST_DEMAND_OPS:
				getHostDemandOps().clear();
				return;
			case SparkPackage.SPARK_NODE__INTER_OCC_T:
				getInterOccT().clear();
				return;
			case SparkPackage.SPARK_NODE__THROUGHPUT:
				getThroughput().clear();
				return;
			case SparkPackage.SPARK_NODE__RESP_T:
				getRespT().clear();
				return;
			case SparkPackage.SPARK_NODE__UTILIZATION:
				getUtilization().clear();
				return;
			case SparkPackage.SPARK_NODE__UTILIZATION_ON_HOST:
				getUtilizationOnHost().clear();
				return;
			case SparkPackage.SPARK_NODE__ROOT:
				setRoot((GaStep)null);
				return;
			case SparkPackage.SPARK_NODE__STEPS:
				getSteps().clear();
				return;
			case SparkPackage.SPARK_NODE__PARENT_STEP:
				getParentStep().clear();
				return;
			case SparkPackage.SPARK_NODE__TIMING:
				getTiming().clear();
				return;
			case SparkPackage.SPARK_NODE__NCORES:
				setNCores(NCORES_EDEFAULT);
				return;
			case SparkPackage.SPARK_NODE__MEMORY:
				setMemory(MEMORY_EDEFAULT);
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
			case SparkPackage.SPARK_NODE__EXEC_TIME:
				return execTime != null && !execTime.isEmpty();
			case SparkPackage.SPARK_NODE__ALLOCATED_MEMORY:
				return allocatedMemory != null && !allocatedMemory.isEmpty();
			case SparkPackage.SPARK_NODE__USED_MEMORY:
				return usedMemory != null && !usedMemory.isEmpty();
			case SparkPackage.SPARK_NODE__POWER_PEAK:
				return powerPeak != null && !powerPeak.isEmpty();
			case SparkPackage.SPARK_NODE__ENERGY:
				return energy != null && !energy.isEmpty();
			case SparkPackage.SPARK_NODE__BASE_NAMED_ELEMENT:
				return base_NamedElement != null;
			case SparkPackage.SPARK_NODE__SUB_USAGE:
				return subUsage != null && !subUsage.isEmpty();
			case SparkPackage.SPARK_NODE__USED_RESOURCES:
				return usedResources != null && !usedResources.isEmpty();
			case SparkPackage.SPARK_NODE__MSG_SIZE:
				return msgSize != null && !msgSize.isEmpty();
			case SparkPackage.SPARK_NODE__ON:
				return on != null && !on.isEmpty();
			case SparkPackage.SPARK_NODE__BASE_ACTION:
				return base_Action != null;
			case SparkPackage.SPARK_NODE__BASE_BEHAVIOR:
				return base_Behavior != null;
			case SparkPackage.SPARK_NODE__BASE_MESSAGE:
				return base_Message != null;
			case SparkPackage.SPARK_NODE__DURATION:
				return duration != null;
			case SparkPackage.SPARK_NODE__START:
				return start != null;
			case SparkPackage.SPARK_NODE__FINISH:
				return finish != null;
			case SparkPackage.SPARK_NODE__CAUSE:
				return cause != null;
			case SparkPackage.SPARK_NODE__HOST_DEMAND:
				return hostDemand != null && !hostDemand.isEmpty();
			case SparkPackage.SPARK_NODE__HOST_DEMAND_OPS:
				return hostDemandOps != null && !hostDemandOps.isEmpty();
			case SparkPackage.SPARK_NODE__INTER_OCC_T:
				return interOccT != null && !interOccT.isEmpty();
			case SparkPackage.SPARK_NODE__THROUGHPUT:
				return throughput != null && !throughput.isEmpty();
			case SparkPackage.SPARK_NODE__RESP_T:
				return respT != null && !respT.isEmpty();
			case SparkPackage.SPARK_NODE__UTILIZATION:
				return utilization != null && !utilization.isEmpty();
			case SparkPackage.SPARK_NODE__UTILIZATION_ON_HOST:
				return utilizationOnHost != null && !utilizationOnHost.isEmpty();
			case SparkPackage.SPARK_NODE__ROOT:
				return root != null;
			case SparkPackage.SPARK_NODE__STEPS:
				return steps != null && !steps.isEmpty();
			case SparkPackage.SPARK_NODE__PARENT_STEP:
				return parentStep != null && !parentStep.isEmpty();
			case SparkPackage.SPARK_NODE__TIMING:
				return timing != null && !timing.isEmpty();
			case SparkPackage.SPARK_NODE__NCORES:
				return NCORES_EDEFAULT == null ? nCores != null : !NCORES_EDEFAULT.equals(nCores);
			case SparkPackage.SPARK_NODE__MEMORY:
				return MEMORY_EDEFAULT == null ? memory != null : !MEMORY_EDEFAULT.equals(memory);
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
		if (baseClass == ResourceUsage.class) {
			switch (derivedFeatureID) {
				case SparkPackage.SPARK_NODE__EXEC_TIME: return GRMPackage.RESOURCE_USAGE__EXEC_TIME;
				case SparkPackage.SPARK_NODE__ALLOCATED_MEMORY: return GRMPackage.RESOURCE_USAGE__ALLOCATED_MEMORY;
				case SparkPackage.SPARK_NODE__USED_MEMORY: return GRMPackage.RESOURCE_USAGE__USED_MEMORY;
				case SparkPackage.SPARK_NODE__POWER_PEAK: return GRMPackage.RESOURCE_USAGE__POWER_PEAK;
				case SparkPackage.SPARK_NODE__ENERGY: return GRMPackage.RESOURCE_USAGE__ENERGY;
				case SparkPackage.SPARK_NODE__BASE_NAMED_ELEMENT: return GRMPackage.RESOURCE_USAGE__BASE_NAMED_ELEMENT;
				case SparkPackage.SPARK_NODE__SUB_USAGE: return GRMPackage.RESOURCE_USAGE__SUB_USAGE;
				case SparkPackage.SPARK_NODE__USED_RESOURCES: return GRMPackage.RESOURCE_USAGE__USED_RESOURCES;
				case SparkPackage.SPARK_NODE__MSG_SIZE: return GRMPackage.RESOURCE_USAGE__MSG_SIZE;
				default: return -1;
			}
		}
		if (baseClass == TimedElement.class) {
			switch (derivedFeatureID) {
				case SparkPackage.SPARK_NODE__ON: return TimePackage.TIMED_ELEMENT__ON;
				default: return -1;
			}
		}
		if (baseClass == TimedProcessing.class) {
			switch (derivedFeatureID) {
				case SparkPackage.SPARK_NODE__BASE_ACTION: return TimePackage.TIMED_PROCESSING__BASE_ACTION;
				case SparkPackage.SPARK_NODE__BASE_BEHAVIOR: return TimePackage.TIMED_PROCESSING__BASE_BEHAVIOR;
				case SparkPackage.SPARK_NODE__BASE_MESSAGE: return TimePackage.TIMED_PROCESSING__BASE_MESSAGE;
				case SparkPackage.SPARK_NODE__DURATION: return TimePackage.TIMED_PROCESSING__DURATION;
				case SparkPackage.SPARK_NODE__START: return TimePackage.TIMED_PROCESSING__START;
				case SparkPackage.SPARK_NODE__FINISH: return TimePackage.TIMED_PROCESSING__FINISH;
				default: return -1;
			}
		}
		if (baseClass == GaScenario.class) {
			switch (derivedFeatureID) {
				case SparkPackage.SPARK_NODE__CAUSE: return GQAMPackage.GA_SCENARIO__CAUSE;
				case SparkPackage.SPARK_NODE__HOST_DEMAND: return GQAMPackage.GA_SCENARIO__HOST_DEMAND;
				case SparkPackage.SPARK_NODE__HOST_DEMAND_OPS: return GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS;
				case SparkPackage.SPARK_NODE__INTER_OCC_T: return GQAMPackage.GA_SCENARIO__INTER_OCC_T;
				case SparkPackage.SPARK_NODE__THROUGHPUT: return GQAMPackage.GA_SCENARIO__THROUGHPUT;
				case SparkPackage.SPARK_NODE__RESP_T: return GQAMPackage.GA_SCENARIO__RESP_T;
				case SparkPackage.SPARK_NODE__UTILIZATION: return GQAMPackage.GA_SCENARIO__UTILIZATION;
				case SparkPackage.SPARK_NODE__UTILIZATION_ON_HOST: return GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST;
				case SparkPackage.SPARK_NODE__ROOT: return GQAMPackage.GA_SCENARIO__ROOT;
				case SparkPackage.SPARK_NODE__STEPS: return GQAMPackage.GA_SCENARIO__STEPS;
				case SparkPackage.SPARK_NODE__PARENT_STEP: return GQAMPackage.GA_SCENARIO__PARENT_STEP;
				case SparkPackage.SPARK_NODE__TIMING: return GQAMPackage.GA_SCENARIO__TIMING;
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
		if (baseClass == ResourceUsage.class) {
			switch (baseFeatureID) {
				case GRMPackage.RESOURCE_USAGE__EXEC_TIME: return SparkPackage.SPARK_NODE__EXEC_TIME;
				case GRMPackage.RESOURCE_USAGE__ALLOCATED_MEMORY: return SparkPackage.SPARK_NODE__ALLOCATED_MEMORY;
				case GRMPackage.RESOURCE_USAGE__USED_MEMORY: return SparkPackage.SPARK_NODE__USED_MEMORY;
				case GRMPackage.RESOURCE_USAGE__POWER_PEAK: return SparkPackage.SPARK_NODE__POWER_PEAK;
				case GRMPackage.RESOURCE_USAGE__ENERGY: return SparkPackage.SPARK_NODE__ENERGY;
				case GRMPackage.RESOURCE_USAGE__BASE_NAMED_ELEMENT: return SparkPackage.SPARK_NODE__BASE_NAMED_ELEMENT;
				case GRMPackage.RESOURCE_USAGE__SUB_USAGE: return SparkPackage.SPARK_NODE__SUB_USAGE;
				case GRMPackage.RESOURCE_USAGE__USED_RESOURCES: return SparkPackage.SPARK_NODE__USED_RESOURCES;
				case GRMPackage.RESOURCE_USAGE__MSG_SIZE: return SparkPackage.SPARK_NODE__MSG_SIZE;
				default: return -1;
			}
		}
		if (baseClass == TimedElement.class) {
			switch (baseFeatureID) {
				case TimePackage.TIMED_ELEMENT__ON: return SparkPackage.SPARK_NODE__ON;
				default: return -1;
			}
		}
		if (baseClass == TimedProcessing.class) {
			switch (baseFeatureID) {
				case TimePackage.TIMED_PROCESSING__BASE_ACTION: return SparkPackage.SPARK_NODE__BASE_ACTION;
				case TimePackage.TIMED_PROCESSING__BASE_BEHAVIOR: return SparkPackage.SPARK_NODE__BASE_BEHAVIOR;
				case TimePackage.TIMED_PROCESSING__BASE_MESSAGE: return SparkPackage.SPARK_NODE__BASE_MESSAGE;
				case TimePackage.TIMED_PROCESSING__DURATION: return SparkPackage.SPARK_NODE__DURATION;
				case TimePackage.TIMED_PROCESSING__START: return SparkPackage.SPARK_NODE__START;
				case TimePackage.TIMED_PROCESSING__FINISH: return SparkPackage.SPARK_NODE__FINISH;
				default: return -1;
			}
		}
		if (baseClass == GaScenario.class) {
			switch (baseFeatureID) {
				case GQAMPackage.GA_SCENARIO__CAUSE: return SparkPackage.SPARK_NODE__CAUSE;
				case GQAMPackage.GA_SCENARIO__HOST_DEMAND: return SparkPackage.SPARK_NODE__HOST_DEMAND;
				case GQAMPackage.GA_SCENARIO__HOST_DEMAND_OPS: return SparkPackage.SPARK_NODE__HOST_DEMAND_OPS;
				case GQAMPackage.GA_SCENARIO__INTER_OCC_T: return SparkPackage.SPARK_NODE__INTER_OCC_T;
				case GQAMPackage.GA_SCENARIO__THROUGHPUT: return SparkPackage.SPARK_NODE__THROUGHPUT;
				case GQAMPackage.GA_SCENARIO__RESP_T: return SparkPackage.SPARK_NODE__RESP_T;
				case GQAMPackage.GA_SCENARIO__UTILIZATION: return SparkPackage.SPARK_NODE__UTILIZATION;
				case GQAMPackage.GA_SCENARIO__UTILIZATION_ON_HOST: return SparkPackage.SPARK_NODE__UTILIZATION_ON_HOST;
				case GQAMPackage.GA_SCENARIO__ROOT: return SparkPackage.SPARK_NODE__ROOT;
				case GQAMPackage.GA_SCENARIO__STEPS: return SparkPackage.SPARK_NODE__STEPS;
				case GQAMPackage.GA_SCENARIO__PARENT_STEP: return SparkPackage.SPARK_NODE__PARENT_STEP;
				case GQAMPackage.GA_SCENARIO__TIMING: return SparkPackage.SPARK_NODE__TIMING;
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
		result.append(" (execTime: ");
		result.append(execTime);
		result.append(", allocatedMemory: ");
		result.append(allocatedMemory);
		result.append(", usedMemory: ");
		result.append(usedMemory);
		result.append(", powerPeak: ");
		result.append(powerPeak);
		result.append(", energy: ");
		result.append(energy);
		result.append(", msgSize: ");
		result.append(msgSize);
		result.append(", hostDemand: ");
		result.append(hostDemand);
		result.append(", hostDemandOps: ");
		result.append(hostDemandOps);
		result.append(", interOccT: ");
		result.append(interOccT);
		result.append(", throughput: ");
		result.append(throughput);
		result.append(", respT: ");
		result.append(respT);
		result.append(", utilization: ");
		result.append(utilization);
		result.append(", utilizationOnHost: ");
		result.append(utilizationOnHost);
		result.append(", nCores: ");
		result.append(nCores);
		result.append(", Memory: ");
		result.append(memory);
		result.append(')');
		return result.toString();
	}

} //SparkNodeImpl
