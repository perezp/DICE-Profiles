/**
 */
package com.masdes.dam.Core.impl;

import com.masdes.dam.Basic_Enumeration_Types.StepKind;

import com.masdes.dam.Complex_Data_Types.DaError;
import com.masdes.dam.Complex_Data_Types.DaFault;

import com.masdes.dam.Core.CorePackage;
import com.masdes.dam.Core.DaStep;

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

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GQAMPackage;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaExecHost;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaRequestedService;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaScenario;
import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.GaStep;

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.SchedulableResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getIsAtomic <em>Is Atomic</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getBlockT <em>Block T</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getRep <em>Rep</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getProb <em>Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getConcurRes <em>Concur Res</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getHost <em>Host</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getServDemand <em>Serv Demand</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getServCount <em>Serv Count</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getSelfDelay <em>Self Delay</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getScenario <em>Scenario</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getChildScenario <em>Child Scenario</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getError <em>Error</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaStepImpl#getFault <em>Fault</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaStepImpl extends DaServiceImpl implements DaStep {
	/**
	 * The default value of the '{@link #getIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtomic()
	 * @generated
	 * @ordered
	 */
	protected static final String IS_ATOMIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsAtomic() <em>Is Atomic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAtomic()
	 * @generated
	 * @ordered
	 */
	protected String isAtomic = IS_ATOMIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getBlockT() <em>Block T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockT()
	 * @generated
	 * @ordered
	 */
	protected static final String BLOCK_T_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBlockT() <em>Block T</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockT()
	 * @generated
	 * @ordered
	 */
	protected String blockT = BLOCK_T_EDEFAULT;

	/**
	 * The default value of the '{@link #getRep() <em>Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRep()
	 * @generated
	 * @ordered
	 */
	protected static final String REP_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getRep() <em>Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRep()
	 * @generated
	 * @ordered
	 */
	protected String rep = REP_EDEFAULT;

	/**
	 * The default value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected static final String PROB_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getProb() <em>Prob</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProb()
	 * @generated
	 * @ordered
	 */
	protected String prob = PROB_EDEFAULT;

	/**
	 * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected String priority = PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConcurRes() <em>Concur Res</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurRes()
	 * @generated
	 * @ordered
	 */
	protected SchedulableResource concurRes;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected GaExecHost host;

	/**
	 * The cached value of the '{@link #getServDemand() <em>Serv Demand</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServDemand()
	 * @generated
	 * @ordered
	 */
	protected EList<GaRequestedService> servDemand;

	/**
	 * The cached value of the '{@link #getServCount() <em>Serv Count</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServCount()
	 * @generated
	 * @ordered
	 */
	protected EList<String> servCount;

	/**
	 * The default value of the '{@link #getSelfDelay() <em>Self Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfDelay()
	 * @generated
	 * @ordered
	 */
	protected static final String SELF_DELAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelfDelay() <em>Self Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfDelay()
	 * @generated
	 * @ordered
	 */
	protected String selfDelay = SELF_DELAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScenario() <em>Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScenario()
	 * @generated
	 * @ordered
	 */
	protected GaScenario scenario;

	/**
	 * The cached value of the '{@link #getChildScenario() <em>Child Scenario</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildScenario()
	 * @generated
	 * @ordered
	 */
	protected GaScenario childScenario;

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final StepKind KIND_EDEFAULT = StepKind.ERROR;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected StepKind kind = KIND_EDEFAULT;

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
	 * The cached value of the '{@link #getFault() <em>Fault</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFault()
	 * @generated
	 * @ordered
	 */
	protected EList<DaFault> fault;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DA_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIsAtomic() {
		return isAtomic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAtomic(String newIsAtomic) {
		String oldIsAtomic = isAtomic;
		isAtomic = newIsAtomic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__IS_ATOMIC, oldIsAtomic, isAtomic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBlockT() {
		return blockT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlockT(String newBlockT) {
		String oldBlockT = blockT;
		blockT = newBlockT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__BLOCK_T, oldBlockT, blockT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRep() {
		return rep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRep(String newRep) {
		String oldRep = rep;
		rep = newRep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__REP, oldRep, rep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProb() {
		return prob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProb(String newProb) {
		String oldProb = prob;
		prob = newProb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__PROB, oldProb, prob));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(String newPriority) {
		String oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource getConcurRes() {
		if (concurRes != null && concurRes.eIsProxy()) {
			InternalEObject oldConcurRes = (InternalEObject)concurRes;
			concurRes = (SchedulableResource)eResolveProxy(oldConcurRes);
			if (concurRes != oldConcurRes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_STEP__CONCUR_RES, oldConcurRes, concurRes));
			}
		}
		return concurRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulableResource basicGetConcurRes() {
		return concurRes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurRes(SchedulableResource newConcurRes) {
		SchedulableResource oldConcurRes = concurRes;
		concurRes = newConcurRes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__CONCUR_RES, oldConcurRes, concurRes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaExecHost getHost() {
		if (host != null && host.eIsProxy()) {
			InternalEObject oldHost = (InternalEObject)host;
			host = (GaExecHost)eResolveProxy(oldHost);
			if (host != oldHost) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_STEP__HOST, oldHost, host));
			}
		}
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaExecHost basicGetHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(GaExecHost newHost) {
		GaExecHost oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GaRequestedService> getServDemand() {
		if (servDemand == null) {
			servDemand = new EObjectResolvingEList<GaRequestedService>(GaRequestedService.class, this, CorePackage.DA_STEP__SERV_DEMAND);
		}
		return servDemand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServCount() {
		if (servCount == null) {
			servCount = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_STEP__SERV_COUNT);
		}
		return servCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelfDelay() {
		return selfDelay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelfDelay(String newSelfDelay) {
		String oldSelfDelay = selfDelay;
		selfDelay = newSelfDelay;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__SELF_DELAY, oldSelfDelay, selfDelay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaScenario getScenario() {
		if (scenario != null && scenario.eIsProxy()) {
			InternalEObject oldScenario = (InternalEObject)scenario;
			scenario = (GaScenario)eResolveProxy(oldScenario);
			if (scenario != oldScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_STEP__SCENARIO, oldScenario, scenario));
			}
		}
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaScenario basicGetScenario() {
		return scenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetScenario(GaScenario newScenario, NotificationChain msgs) {
		GaScenario oldScenario = scenario;
		scenario = newScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__SCENARIO, oldScenario, newScenario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScenario(GaScenario newScenario) {
		if (newScenario != scenario) {
			NotificationChain msgs = null;
			if (scenario != null)
				msgs = ((InternalEObject)scenario).eInverseRemove(this, GQAMPackage.GA_SCENARIO__STEPS, GaScenario.class, msgs);
			if (newScenario != null)
				msgs = ((InternalEObject)newScenario).eInverseAdd(this, GQAMPackage.GA_SCENARIO__STEPS, GaScenario.class, msgs);
			msgs = basicSetScenario(newScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__SCENARIO, newScenario, newScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaScenario getChildScenario() {
		if (childScenario != null && childScenario.eIsProxy()) {
			InternalEObject oldChildScenario = (InternalEObject)childScenario;
			childScenario = (GaScenario)eResolveProxy(oldChildScenario);
			if (childScenario != oldChildScenario) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.DA_STEP__CHILD_SCENARIO, oldChildScenario, childScenario));
			}
		}
		return childScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaScenario basicGetChildScenario() {
		return childScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChildScenario(GaScenario newChildScenario, NotificationChain msgs) {
		GaScenario oldChildScenario = childScenario;
		childScenario = newChildScenario;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__CHILD_SCENARIO, oldChildScenario, newChildScenario);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildScenario(GaScenario newChildScenario) {
		if (newChildScenario != childScenario) {
			NotificationChain msgs = null;
			if (childScenario != null)
				msgs = ((InternalEObject)childScenario).eInverseRemove(this, GQAMPackage.GA_SCENARIO__PARENT_STEP, GaScenario.class, msgs);
			if (newChildScenario != null)
				msgs = ((InternalEObject)newChildScenario).eInverseAdd(this, GQAMPackage.GA_SCENARIO__PARENT_STEP, GaScenario.class, msgs);
			msgs = basicSetChildScenario(newChildScenario, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__CHILD_SCENARIO, newChildScenario, newChildScenario));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKind(StepKind newKind) {
		StepKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_STEP__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaError> getError() {
		if (error == null) {
			error = new EObjectContainmentEList<DaError>(DaError.class, this, CorePackage.DA_STEP__ERROR);
		}
		return error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFault> getFault() {
		if (fault == null) {
			fault = new EObjectContainmentEList<DaFault>(DaFault.class, this, CorePackage.DA_STEP__FAULT);
		}
		return fault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DA_STEP__SCENARIO:
				if (scenario != null)
					msgs = ((InternalEObject)scenario).eInverseRemove(this, GQAMPackage.GA_SCENARIO__STEPS, GaScenario.class, msgs);
				return basicSetScenario((GaScenario)otherEnd, msgs);
			case CorePackage.DA_STEP__CHILD_SCENARIO:
				if (childScenario != null)
					msgs = ((InternalEObject)childScenario).eInverseRemove(this, GQAMPackage.GA_SCENARIO__PARENT_STEP, GaScenario.class, msgs);
				return basicSetChildScenario((GaScenario)otherEnd, msgs);
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
			case CorePackage.DA_STEP__SCENARIO:
				return basicSetScenario(null, msgs);
			case CorePackage.DA_STEP__CHILD_SCENARIO:
				return basicSetChildScenario(null, msgs);
			case CorePackage.DA_STEP__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
			case CorePackage.DA_STEP__FAULT:
				return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DA_STEP__IS_ATOMIC:
				return getIsAtomic();
			case CorePackage.DA_STEP__BLOCK_T:
				return getBlockT();
			case CorePackage.DA_STEP__REP:
				return getRep();
			case CorePackage.DA_STEP__PROB:
				return getProb();
			case CorePackage.DA_STEP__PRIORITY:
				return getPriority();
			case CorePackage.DA_STEP__CONCUR_RES:
				if (resolve) return getConcurRes();
				return basicGetConcurRes();
			case CorePackage.DA_STEP__HOST:
				if (resolve) return getHost();
				return basicGetHost();
			case CorePackage.DA_STEP__SERV_DEMAND:
				return getServDemand();
			case CorePackage.DA_STEP__SERV_COUNT:
				return getServCount();
			case CorePackage.DA_STEP__SELF_DELAY:
				return getSelfDelay();
			case CorePackage.DA_STEP__SCENARIO:
				if (resolve) return getScenario();
				return basicGetScenario();
			case CorePackage.DA_STEP__CHILD_SCENARIO:
				if (resolve) return getChildScenario();
				return basicGetChildScenario();
			case CorePackage.DA_STEP__KIND:
				return getKind();
			case CorePackage.DA_STEP__ERROR:
				return getError();
			case CorePackage.DA_STEP__FAULT:
				return getFault();
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
			case CorePackage.DA_STEP__IS_ATOMIC:
				setIsAtomic((String)newValue);
				return;
			case CorePackage.DA_STEP__BLOCK_T:
				setBlockT((String)newValue);
				return;
			case CorePackage.DA_STEP__REP:
				setRep((String)newValue);
				return;
			case CorePackage.DA_STEP__PROB:
				setProb((String)newValue);
				return;
			case CorePackage.DA_STEP__PRIORITY:
				setPriority((String)newValue);
				return;
			case CorePackage.DA_STEP__CONCUR_RES:
				setConcurRes((SchedulableResource)newValue);
				return;
			case CorePackage.DA_STEP__HOST:
				setHost((GaExecHost)newValue);
				return;
			case CorePackage.DA_STEP__SERV_DEMAND:
				getServDemand().clear();
				getServDemand().addAll((Collection<? extends GaRequestedService>)newValue);
				return;
			case CorePackage.DA_STEP__SERV_COUNT:
				getServCount().clear();
				getServCount().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_STEP__SELF_DELAY:
				setSelfDelay((String)newValue);
				return;
			case CorePackage.DA_STEP__SCENARIO:
				setScenario((GaScenario)newValue);
				return;
			case CorePackage.DA_STEP__CHILD_SCENARIO:
				setChildScenario((GaScenario)newValue);
				return;
			case CorePackage.DA_STEP__KIND:
				setKind((StepKind)newValue);
				return;
			case CorePackage.DA_STEP__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends DaError>)newValue);
				return;
			case CorePackage.DA_STEP__FAULT:
				getFault().clear();
				getFault().addAll((Collection<? extends DaFault>)newValue);
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
			case CorePackage.DA_STEP__IS_ATOMIC:
				setIsAtomic(IS_ATOMIC_EDEFAULT);
				return;
			case CorePackage.DA_STEP__BLOCK_T:
				setBlockT(BLOCK_T_EDEFAULT);
				return;
			case CorePackage.DA_STEP__REP:
				setRep(REP_EDEFAULT);
				return;
			case CorePackage.DA_STEP__PROB:
				setProb(PROB_EDEFAULT);
				return;
			case CorePackage.DA_STEP__PRIORITY:
				setPriority(PRIORITY_EDEFAULT);
				return;
			case CorePackage.DA_STEP__CONCUR_RES:
				setConcurRes((SchedulableResource)null);
				return;
			case CorePackage.DA_STEP__HOST:
				setHost((GaExecHost)null);
				return;
			case CorePackage.DA_STEP__SERV_DEMAND:
				getServDemand().clear();
				return;
			case CorePackage.DA_STEP__SERV_COUNT:
				getServCount().clear();
				return;
			case CorePackage.DA_STEP__SELF_DELAY:
				setSelfDelay(SELF_DELAY_EDEFAULT);
				return;
			case CorePackage.DA_STEP__SCENARIO:
				setScenario((GaScenario)null);
				return;
			case CorePackage.DA_STEP__CHILD_SCENARIO:
				setChildScenario((GaScenario)null);
				return;
			case CorePackage.DA_STEP__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case CorePackage.DA_STEP__ERROR:
				getError().clear();
				return;
			case CorePackage.DA_STEP__FAULT:
				getFault().clear();
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
			case CorePackage.DA_STEP__IS_ATOMIC:
				return IS_ATOMIC_EDEFAULT == null ? isAtomic != null : !IS_ATOMIC_EDEFAULT.equals(isAtomic);
			case CorePackage.DA_STEP__BLOCK_T:
				return BLOCK_T_EDEFAULT == null ? blockT != null : !BLOCK_T_EDEFAULT.equals(blockT);
			case CorePackage.DA_STEP__REP:
				return REP_EDEFAULT == null ? rep != null : !REP_EDEFAULT.equals(rep);
			case CorePackage.DA_STEP__PROB:
				return PROB_EDEFAULT == null ? prob != null : !PROB_EDEFAULT.equals(prob);
			case CorePackage.DA_STEP__PRIORITY:
				return PRIORITY_EDEFAULT == null ? priority != null : !PRIORITY_EDEFAULT.equals(priority);
			case CorePackage.DA_STEP__CONCUR_RES:
				return concurRes != null;
			case CorePackage.DA_STEP__HOST:
				return host != null;
			case CorePackage.DA_STEP__SERV_DEMAND:
				return servDemand != null && !servDemand.isEmpty();
			case CorePackage.DA_STEP__SERV_COUNT:
				return servCount != null && !servCount.isEmpty();
			case CorePackage.DA_STEP__SELF_DELAY:
				return SELF_DELAY_EDEFAULT == null ? selfDelay != null : !SELF_DELAY_EDEFAULT.equals(selfDelay);
			case CorePackage.DA_STEP__SCENARIO:
				return scenario != null;
			case CorePackage.DA_STEP__CHILD_SCENARIO:
				return childScenario != null;
			case CorePackage.DA_STEP__KIND:
				return kind != KIND_EDEFAULT;
			case CorePackage.DA_STEP__ERROR:
				return error != null && !error.isEmpty();
			case CorePackage.DA_STEP__FAULT:
				return fault != null && !fault.isEmpty();
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
		if (baseClass == GaStep.class) {
			switch (derivedFeatureID) {
				case CorePackage.DA_STEP__IS_ATOMIC: return GQAMPackage.GA_STEP__IS_ATOMIC;
				case CorePackage.DA_STEP__BLOCK_T: return GQAMPackage.GA_STEP__BLOCK_T;
				case CorePackage.DA_STEP__REP: return GQAMPackage.GA_STEP__REP;
				case CorePackage.DA_STEP__PROB: return GQAMPackage.GA_STEP__PROB;
				case CorePackage.DA_STEP__PRIORITY: return GQAMPackage.GA_STEP__PRIORITY;
				case CorePackage.DA_STEP__CONCUR_RES: return GQAMPackage.GA_STEP__CONCUR_RES;
				case CorePackage.DA_STEP__HOST: return GQAMPackage.GA_STEP__HOST;
				case CorePackage.DA_STEP__SERV_DEMAND: return GQAMPackage.GA_STEP__SERV_DEMAND;
				case CorePackage.DA_STEP__SERV_COUNT: return GQAMPackage.GA_STEP__SERV_COUNT;
				case CorePackage.DA_STEP__SELF_DELAY: return GQAMPackage.GA_STEP__SELF_DELAY;
				case CorePackage.DA_STEP__SCENARIO: return GQAMPackage.GA_STEP__SCENARIO;
				case CorePackage.DA_STEP__CHILD_SCENARIO: return GQAMPackage.GA_STEP__CHILD_SCENARIO;
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
		if (baseClass == GaStep.class) {
			switch (baseFeatureID) {
				case GQAMPackage.GA_STEP__IS_ATOMIC: return CorePackage.DA_STEP__IS_ATOMIC;
				case GQAMPackage.GA_STEP__BLOCK_T: return CorePackage.DA_STEP__BLOCK_T;
				case GQAMPackage.GA_STEP__REP: return CorePackage.DA_STEP__REP;
				case GQAMPackage.GA_STEP__PROB: return CorePackage.DA_STEP__PROB;
				case GQAMPackage.GA_STEP__PRIORITY: return CorePackage.DA_STEP__PRIORITY;
				case GQAMPackage.GA_STEP__CONCUR_RES: return CorePackage.DA_STEP__CONCUR_RES;
				case GQAMPackage.GA_STEP__HOST: return CorePackage.DA_STEP__HOST;
				case GQAMPackage.GA_STEP__SERV_DEMAND: return CorePackage.DA_STEP__SERV_DEMAND;
				case GQAMPackage.GA_STEP__SERV_COUNT: return CorePackage.DA_STEP__SERV_COUNT;
				case GQAMPackage.GA_STEP__SELF_DELAY: return CorePackage.DA_STEP__SELF_DELAY;
				case GQAMPackage.GA_STEP__SCENARIO: return CorePackage.DA_STEP__SCENARIO;
				case GQAMPackage.GA_STEP__CHILD_SCENARIO: return CorePackage.DA_STEP__CHILD_SCENARIO;
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
		result.append(" (isAtomic: ");
		result.append(isAtomic);
		result.append(", blockT: ");
		result.append(blockT);
		result.append(", rep: ");
		result.append(rep);
		result.append(", prob: ");
		result.append(prob);
		result.append(", priority: ");
		result.append(priority);
		result.append(", servCount: ");
		result.append(servCount);
		result.append(", selfDelay: ");
		result.append(selfDelay);
		result.append(", kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //DaStepImpl
