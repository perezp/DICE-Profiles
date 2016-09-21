/**
 */
package com.masdes.dam.Core.impl;

import com.masdes.dam.Basic_Enumeration_Types.Origin;

import com.masdes.dam.Complex_Data_Types.DaError;
import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaFault;
import com.masdes.dam.Complex_Data_Types.DaHazard;
import com.masdes.dam.Complex_Data_Types.DaRepair;

import com.masdes.dam.Core.CorePackage;
import com.masdes.dam.Core.DaComponent;

import com.masdes.dam.Redundancy.DaSpare;

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

import org.eclipse.papyrus.MARTE.MARTE_Foundations.GRM.impl.ResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#isStateful <em>Stateful</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getFailureCoverage <em>Failure Coverage</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getPercPermFault <em>Perc Perm Fault</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getSsAvail <em>Ss Avail</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getUnreliability <em>Unreliability</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getMissionTime <em>Mission Time</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getAvailLevel <em>Avail Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getReliabilityLevel <em>Reliability Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getSafetyLevel <em>Safety Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getFault <em>Fault</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getError <em>Error</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getHazard <em>Hazard</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getRepair <em>Repair</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaComponentImpl#getSubstitutedBy <em>Substituted By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaComponentImpl extends ResourceImpl implements DaComponent {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DA_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_COMPONENT__STATEFUL, oldStateful, stateful));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.DA_COMPONENT__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getFailureCoverage() {
		if (failureCoverage == null) {
			failureCoverage = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_COMPONENT__FAILURE_COVERAGE);
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
			percPermFault = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_COMPONENT__PERC_PERM_FAULT);
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
			ssAvail = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_COMPONENT__SS_AVAIL);
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
			unreliability = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_COMPONENT__UNRELIABILITY);
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
			reliability = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_COMPONENT__RELIABILITY);
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
			missionTime = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_COMPONENT__MISSION_TIME);
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
			availLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_COMPONENT__AVAIL_LEVEL);
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
			reliabilityLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_COMPONENT__RELIABILITY_LEVEL);
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
			safetyLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_COMPONENT__SAFETY_LEVEL);
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
			complexity = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_COMPONENT__COMPLEXITY);
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
			fault = new EObjectContainmentEList<DaFault>(DaFault.class, this, CorePackage.DA_COMPONENT__FAULT);
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
			error = new EObjectContainmentEList<DaError>(DaError.class, this, CorePackage.DA_COMPONENT__ERROR);
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
			failure = new EObjectContainmentEList<DaFailure>(DaFailure.class, this, CorePackage.DA_COMPONENT__FAILURE);
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
			hazard = new EObjectContainmentEList<DaHazard>(DaHazard.class, this, CorePackage.DA_COMPONENT__HAZARD);
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
			repair = new EObjectContainmentEList<DaRepair>(DaRepair.class, this, CorePackage.DA_COMPONENT__REPAIR);
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
			substitutedBy = new EObjectResolvingEList<DaSpare>(DaSpare.class, this, CorePackage.DA_COMPONENT__SUBSTITUTED_BY);
		}
		return substitutedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DA_COMPONENT__FAULT:
				return ((InternalEList<?>)getFault()).basicRemove(otherEnd, msgs);
			case CorePackage.DA_COMPONENT__ERROR:
				return ((InternalEList<?>)getError()).basicRemove(otherEnd, msgs);
			case CorePackage.DA_COMPONENT__FAILURE:
				return ((InternalEList<?>)getFailure()).basicRemove(otherEnd, msgs);
			case CorePackage.DA_COMPONENT__HAZARD:
				return ((InternalEList<?>)getHazard()).basicRemove(otherEnd, msgs);
			case CorePackage.DA_COMPONENT__REPAIR:
				return ((InternalEList<?>)getRepair()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DA_COMPONENT__STATEFUL:
				return isStateful();
			case CorePackage.DA_COMPONENT__ORIGIN:
				return getOrigin();
			case CorePackage.DA_COMPONENT__FAILURE_COVERAGE:
				return getFailureCoverage();
			case CorePackage.DA_COMPONENT__PERC_PERM_FAULT:
				return getPercPermFault();
			case CorePackage.DA_COMPONENT__SS_AVAIL:
				return getSsAvail();
			case CorePackage.DA_COMPONENT__UNRELIABILITY:
				return getUnreliability();
			case CorePackage.DA_COMPONENT__RELIABILITY:
				return getReliability();
			case CorePackage.DA_COMPONENT__MISSION_TIME:
				return getMissionTime();
			case CorePackage.DA_COMPONENT__AVAIL_LEVEL:
				return getAvailLevel();
			case CorePackage.DA_COMPONENT__RELIABILITY_LEVEL:
				return getReliabilityLevel();
			case CorePackage.DA_COMPONENT__SAFETY_LEVEL:
				return getSafetyLevel();
			case CorePackage.DA_COMPONENT__COMPLEXITY:
				return getComplexity();
			case CorePackage.DA_COMPONENT__FAULT:
				return getFault();
			case CorePackage.DA_COMPONENT__ERROR:
				return getError();
			case CorePackage.DA_COMPONENT__FAILURE:
				return getFailure();
			case CorePackage.DA_COMPONENT__HAZARD:
				return getHazard();
			case CorePackage.DA_COMPONENT__REPAIR:
				return getRepair();
			case CorePackage.DA_COMPONENT__SUBSTITUTED_BY:
				return getSubstitutedBy();
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
			case CorePackage.DA_COMPONENT__STATEFUL:
				setStateful((Boolean)newValue);
				return;
			case CorePackage.DA_COMPONENT__ORIGIN:
				setOrigin((Origin)newValue);
				return;
			case CorePackage.DA_COMPONENT__FAILURE_COVERAGE:
				getFailureCoverage().clear();
				getFailureCoverage().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_COMPONENT__PERC_PERM_FAULT:
				getPercPermFault().clear();
				getPercPermFault().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_COMPONENT__SS_AVAIL:
				getSsAvail().clear();
				getSsAvail().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_COMPONENT__UNRELIABILITY:
				getUnreliability().clear();
				getUnreliability().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_COMPONENT__RELIABILITY:
				getReliability().clear();
				getReliability().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_COMPONENT__MISSION_TIME:
				getMissionTime().clear();
				getMissionTime().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_COMPONENT__AVAIL_LEVEL:
				getAvailLevel().clear();
				getAvailLevel().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_COMPONENT__RELIABILITY_LEVEL:
				getReliabilityLevel().clear();
				getReliabilityLevel().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_COMPONENT__SAFETY_LEVEL:
				getSafetyLevel().clear();
				getSafetyLevel().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_COMPONENT__COMPLEXITY:
				getComplexity().clear();
				getComplexity().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_COMPONENT__FAULT:
				getFault().clear();
				getFault().addAll((Collection<? extends DaFault>)newValue);
				return;
			case CorePackage.DA_COMPONENT__ERROR:
				getError().clear();
				getError().addAll((Collection<? extends DaError>)newValue);
				return;
			case CorePackage.DA_COMPONENT__FAILURE:
				getFailure().clear();
				getFailure().addAll((Collection<? extends DaFailure>)newValue);
				return;
			case CorePackage.DA_COMPONENT__HAZARD:
				getHazard().clear();
				getHazard().addAll((Collection<? extends DaHazard>)newValue);
				return;
			case CorePackage.DA_COMPONENT__REPAIR:
				getRepair().clear();
				getRepair().addAll((Collection<? extends DaRepair>)newValue);
				return;
			case CorePackage.DA_COMPONENT__SUBSTITUTED_BY:
				getSubstitutedBy().clear();
				getSubstitutedBy().addAll((Collection<? extends DaSpare>)newValue);
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
			case CorePackage.DA_COMPONENT__STATEFUL:
				setStateful(STATEFUL_EDEFAULT);
				return;
			case CorePackage.DA_COMPONENT__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case CorePackage.DA_COMPONENT__FAILURE_COVERAGE:
				getFailureCoverage().clear();
				return;
			case CorePackage.DA_COMPONENT__PERC_PERM_FAULT:
				getPercPermFault().clear();
				return;
			case CorePackage.DA_COMPONENT__SS_AVAIL:
				getSsAvail().clear();
				return;
			case CorePackage.DA_COMPONENT__UNRELIABILITY:
				getUnreliability().clear();
				return;
			case CorePackage.DA_COMPONENT__RELIABILITY:
				getReliability().clear();
				return;
			case CorePackage.DA_COMPONENT__MISSION_TIME:
				getMissionTime().clear();
				return;
			case CorePackage.DA_COMPONENT__AVAIL_LEVEL:
				getAvailLevel().clear();
				return;
			case CorePackage.DA_COMPONENT__RELIABILITY_LEVEL:
				getReliabilityLevel().clear();
				return;
			case CorePackage.DA_COMPONENT__SAFETY_LEVEL:
				getSafetyLevel().clear();
				return;
			case CorePackage.DA_COMPONENT__COMPLEXITY:
				getComplexity().clear();
				return;
			case CorePackage.DA_COMPONENT__FAULT:
				getFault().clear();
				return;
			case CorePackage.DA_COMPONENT__ERROR:
				getError().clear();
				return;
			case CorePackage.DA_COMPONENT__FAILURE:
				getFailure().clear();
				return;
			case CorePackage.DA_COMPONENT__HAZARD:
				getHazard().clear();
				return;
			case CorePackage.DA_COMPONENT__REPAIR:
				getRepair().clear();
				return;
			case CorePackage.DA_COMPONENT__SUBSTITUTED_BY:
				getSubstitutedBy().clear();
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
			case CorePackage.DA_COMPONENT__STATEFUL:
				return stateful != STATEFUL_EDEFAULT;
			case CorePackage.DA_COMPONENT__ORIGIN:
				return origin != ORIGIN_EDEFAULT;
			case CorePackage.DA_COMPONENT__FAILURE_COVERAGE:
				return failureCoverage != null && !failureCoverage.isEmpty();
			case CorePackage.DA_COMPONENT__PERC_PERM_FAULT:
				return percPermFault != null && !percPermFault.isEmpty();
			case CorePackage.DA_COMPONENT__SS_AVAIL:
				return ssAvail != null && !ssAvail.isEmpty();
			case CorePackage.DA_COMPONENT__UNRELIABILITY:
				return unreliability != null && !unreliability.isEmpty();
			case CorePackage.DA_COMPONENT__RELIABILITY:
				return reliability != null && !reliability.isEmpty();
			case CorePackage.DA_COMPONENT__MISSION_TIME:
				return missionTime != null && !missionTime.isEmpty();
			case CorePackage.DA_COMPONENT__AVAIL_LEVEL:
				return availLevel != null && !availLevel.isEmpty();
			case CorePackage.DA_COMPONENT__RELIABILITY_LEVEL:
				return reliabilityLevel != null && !reliabilityLevel.isEmpty();
			case CorePackage.DA_COMPONENT__SAFETY_LEVEL:
				return safetyLevel != null && !safetyLevel.isEmpty();
			case CorePackage.DA_COMPONENT__COMPLEXITY:
				return complexity != null && !complexity.isEmpty();
			case CorePackage.DA_COMPONENT__FAULT:
				return fault != null && !fault.isEmpty();
			case CorePackage.DA_COMPONENT__ERROR:
				return error != null && !error.isEmpty();
			case CorePackage.DA_COMPONENT__FAILURE:
				return failure != null && !failure.isEmpty();
			case CorePackage.DA_COMPONENT__HAZARD:
				return hazard != null && !hazard.isEmpty();
			case CorePackage.DA_COMPONENT__REPAIR:
				return repair != null && !repair.isEmpty();
			case CorePackage.DA_COMPONENT__SUBSTITUTED_BY:
				return substitutedBy != null && !substitutedBy.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (stateful: ");
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
		result.append(')');
		return result.toString();
	}

} //DaComponentImpl
