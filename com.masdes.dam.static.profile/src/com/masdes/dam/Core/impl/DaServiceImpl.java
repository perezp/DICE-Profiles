/**
 */
package com.masdes.dam.Core.impl;

import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaHazard;
import com.masdes.dam.Complex_Data_Types.DaRec;

import com.masdes.dam.Core.CorePackage;
import com.masdes.dam.Core.DaService;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.papyrus.MARTE.MARTE_AnalysisModel.GQAM.impl.GaScenarioImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getExecProb <em>Exec Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getSsAvail <em>Ss Avail</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getInstAvail <em>Inst Avail</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getUnreliability <em>Unreliability</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getReliability <em>Reliability</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getMissionTime <em>Mission Time</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getAvailLevel <em>Avail Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getReliabLevel <em>Reliab Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getSafetyLevel <em>Safety Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getFailure <em>Failure</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getHazard <em>Hazard</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getRecovery <em>Recovery</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getConfLevel <em>Conf Level</em>}</li>
 *   <li>{@link com.masdes.dam.Core.impl.DaServiceImpl#getIntegLevel <em>Integ Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaServiceImpl extends GaScenarioImpl implements DaService {
	/**
	 * The cached value of the '{@link #getExecProb() <em>Exec Prob</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecProb()
	 * @generated
	 * @ordered
	 */
	protected EList<String> execProb;

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
	 * The cached value of the '{@link #getInstAvail() <em>Inst Avail</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstAvail()
	 * @generated
	 * @ordered
	 */
	protected EList<String> instAvail;

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
	 * The cached value of the '{@link #getReliabLevel() <em>Reliab Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReliabLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> reliabLevel;

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
	 * The cached value of the '{@link #getRecovery() <em>Recovery</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecovery()
	 * @generated
	 * @ordered
	 */
	protected EList<DaRec> recovery;

	/**
	 * The cached value of the '{@link #getConfLevel() <em>Conf Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> confLevel;

	/**
	 * The cached value of the '{@link #getIntegLevel() <em>Integ Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> integLevel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.DA_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExecProb() {
		if (execProb == null) {
			execProb = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__EXEC_PROB);
		}
		return execProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSsAvail() {
		if (ssAvail == null) {
			ssAvail = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__SS_AVAIL);
		}
		return ssAvail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getInstAvail() {
		if (instAvail == null) {
			instAvail = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__INST_AVAIL);
		}
		return instAvail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getUnreliability() {
		if (unreliability == null) {
			unreliability = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__UNRELIABILITY);
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
			reliability = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__RELIABILITY);
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
			missionTime = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__MISSION_TIME);
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
			availLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__AVAIL_LEVEL);
		}
		return availLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getReliabLevel() {
		if (reliabLevel == null) {
			reliabLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__RELIAB_LEVEL);
		}
		return reliabLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSafetyLevel() {
		if (safetyLevel == null) {
			safetyLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__SAFETY_LEVEL);
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
			complexity = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__COMPLEXITY);
		}
		return complexity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFailure> getFailure() {
		if (failure == null) {
			failure = new EObjectContainmentEList<DaFailure>(DaFailure.class, this, CorePackage.DA_SERVICE__FAILURE);
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
			hazard = new EObjectContainmentEList<DaHazard>(DaHazard.class, this, CorePackage.DA_SERVICE__HAZARD);
		}
		return hazard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaRec> getRecovery() {
		if (recovery == null) {
			recovery = new EObjectContainmentEList<DaRec>(DaRec.class, this, CorePackage.DA_SERVICE__RECOVERY);
		}
		return recovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConfLevel() {
		if (confLevel == null) {
			confLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__CONF_LEVEL);
		}
		return confLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIntegLevel() {
		if (integLevel == null) {
			integLevel = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.DA_SERVICE__INTEG_LEVEL);
		}
		return integLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.DA_SERVICE__FAILURE:
				return ((InternalEList<?>)getFailure()).basicRemove(otherEnd, msgs);
			case CorePackage.DA_SERVICE__HAZARD:
				return ((InternalEList<?>)getHazard()).basicRemove(otherEnd, msgs);
			case CorePackage.DA_SERVICE__RECOVERY:
				return ((InternalEList<?>)getRecovery()).basicRemove(otherEnd, msgs);
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
			case CorePackage.DA_SERVICE__EXEC_PROB:
				return getExecProb();
			case CorePackage.DA_SERVICE__SS_AVAIL:
				return getSsAvail();
			case CorePackage.DA_SERVICE__INST_AVAIL:
				return getInstAvail();
			case CorePackage.DA_SERVICE__UNRELIABILITY:
				return getUnreliability();
			case CorePackage.DA_SERVICE__RELIABILITY:
				return getReliability();
			case CorePackage.DA_SERVICE__MISSION_TIME:
				return getMissionTime();
			case CorePackage.DA_SERVICE__AVAIL_LEVEL:
				return getAvailLevel();
			case CorePackage.DA_SERVICE__RELIAB_LEVEL:
				return getReliabLevel();
			case CorePackage.DA_SERVICE__SAFETY_LEVEL:
				return getSafetyLevel();
			case CorePackage.DA_SERVICE__COMPLEXITY:
				return getComplexity();
			case CorePackage.DA_SERVICE__FAILURE:
				return getFailure();
			case CorePackage.DA_SERVICE__HAZARD:
				return getHazard();
			case CorePackage.DA_SERVICE__RECOVERY:
				return getRecovery();
			case CorePackage.DA_SERVICE__CONF_LEVEL:
				return getConfLevel();
			case CorePackage.DA_SERVICE__INTEG_LEVEL:
				return getIntegLevel();
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
			case CorePackage.DA_SERVICE__EXEC_PROB:
				getExecProb().clear();
				getExecProb().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__SS_AVAIL:
				getSsAvail().clear();
				getSsAvail().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__INST_AVAIL:
				getInstAvail().clear();
				getInstAvail().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__UNRELIABILITY:
				getUnreliability().clear();
				getUnreliability().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__RELIABILITY:
				getReliability().clear();
				getReliability().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__MISSION_TIME:
				getMissionTime().clear();
				getMissionTime().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__AVAIL_LEVEL:
				getAvailLevel().clear();
				getAvailLevel().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__RELIAB_LEVEL:
				getReliabLevel().clear();
				getReliabLevel().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__SAFETY_LEVEL:
				getSafetyLevel().clear();
				getSafetyLevel().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__COMPLEXITY:
				getComplexity().clear();
				getComplexity().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__FAILURE:
				getFailure().clear();
				getFailure().addAll((Collection<? extends DaFailure>)newValue);
				return;
			case CorePackage.DA_SERVICE__HAZARD:
				getHazard().clear();
				getHazard().addAll((Collection<? extends DaHazard>)newValue);
				return;
			case CorePackage.DA_SERVICE__RECOVERY:
				getRecovery().clear();
				getRecovery().addAll((Collection<? extends DaRec>)newValue);
				return;
			case CorePackage.DA_SERVICE__CONF_LEVEL:
				getConfLevel().clear();
				getConfLevel().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.DA_SERVICE__INTEG_LEVEL:
				getIntegLevel().clear();
				getIntegLevel().addAll((Collection<? extends String>)newValue);
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
			case CorePackage.DA_SERVICE__EXEC_PROB:
				getExecProb().clear();
				return;
			case CorePackage.DA_SERVICE__SS_AVAIL:
				getSsAvail().clear();
				return;
			case CorePackage.DA_SERVICE__INST_AVAIL:
				getInstAvail().clear();
				return;
			case CorePackage.DA_SERVICE__UNRELIABILITY:
				getUnreliability().clear();
				return;
			case CorePackage.DA_SERVICE__RELIABILITY:
				getReliability().clear();
				return;
			case CorePackage.DA_SERVICE__MISSION_TIME:
				getMissionTime().clear();
				return;
			case CorePackage.DA_SERVICE__AVAIL_LEVEL:
				getAvailLevel().clear();
				return;
			case CorePackage.DA_SERVICE__RELIAB_LEVEL:
				getReliabLevel().clear();
				return;
			case CorePackage.DA_SERVICE__SAFETY_LEVEL:
				getSafetyLevel().clear();
				return;
			case CorePackage.DA_SERVICE__COMPLEXITY:
				getComplexity().clear();
				return;
			case CorePackage.DA_SERVICE__FAILURE:
				getFailure().clear();
				return;
			case CorePackage.DA_SERVICE__HAZARD:
				getHazard().clear();
				return;
			case CorePackage.DA_SERVICE__RECOVERY:
				getRecovery().clear();
				return;
			case CorePackage.DA_SERVICE__CONF_LEVEL:
				getConfLevel().clear();
				return;
			case CorePackage.DA_SERVICE__INTEG_LEVEL:
				getIntegLevel().clear();
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
			case CorePackage.DA_SERVICE__EXEC_PROB:
				return execProb != null && !execProb.isEmpty();
			case CorePackage.DA_SERVICE__SS_AVAIL:
				return ssAvail != null && !ssAvail.isEmpty();
			case CorePackage.DA_SERVICE__INST_AVAIL:
				return instAvail != null && !instAvail.isEmpty();
			case CorePackage.DA_SERVICE__UNRELIABILITY:
				return unreliability != null && !unreliability.isEmpty();
			case CorePackage.DA_SERVICE__RELIABILITY:
				return reliability != null && !reliability.isEmpty();
			case CorePackage.DA_SERVICE__MISSION_TIME:
				return missionTime != null && !missionTime.isEmpty();
			case CorePackage.DA_SERVICE__AVAIL_LEVEL:
				return availLevel != null && !availLevel.isEmpty();
			case CorePackage.DA_SERVICE__RELIAB_LEVEL:
				return reliabLevel != null && !reliabLevel.isEmpty();
			case CorePackage.DA_SERVICE__SAFETY_LEVEL:
				return safetyLevel != null && !safetyLevel.isEmpty();
			case CorePackage.DA_SERVICE__COMPLEXITY:
				return complexity != null && !complexity.isEmpty();
			case CorePackage.DA_SERVICE__FAILURE:
				return failure != null && !failure.isEmpty();
			case CorePackage.DA_SERVICE__HAZARD:
				return hazard != null && !hazard.isEmpty();
			case CorePackage.DA_SERVICE__RECOVERY:
				return recovery != null && !recovery.isEmpty();
			case CorePackage.DA_SERVICE__CONF_LEVEL:
				return confLevel != null && !confLevel.isEmpty();
			case CorePackage.DA_SERVICE__INTEG_LEVEL:
				return integLevel != null && !integLevel.isEmpty();
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
		result.append(" (execProb: ");
		result.append(execProb);
		result.append(", ssAvail: ");
		result.append(ssAvail);
		result.append(", instAvail: ");
		result.append(instAvail);
		result.append(", unreliability: ");
		result.append(unreliability);
		result.append(", reliability: ");
		result.append(reliability);
		result.append(", missionTime: ");
		result.append(missionTime);
		result.append(", availLevel: ");
		result.append(availLevel);
		result.append(", reliabLevel: ");
		result.append(reliabLevel);
		result.append(", safetyLevel: ");
		result.append(safetyLevel);
		result.append(", complexity: ");
		result.append(complexity);
		result.append(", confLevel: ");
		result.append(confLevel);
		result.append(", integLevel: ");
		result.append(integLevel);
		result.append(')');
		return result.toString();
	}

} //DaServiceImpl
