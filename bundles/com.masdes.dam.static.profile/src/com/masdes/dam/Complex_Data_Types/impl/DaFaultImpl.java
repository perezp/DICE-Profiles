/**
 */
package com.masdes.dam.Complex_Data_Types.impl;

import com.masdes.dam.Basic_Enumeration_Types.Capability;
import com.masdes.dam.Basic_Enumeration_Types.Intent;
import com.masdes.dam.Basic_Enumeration_Types.Objective;
import com.masdes.dam.Basic_Enumeration_Types.Origin;
import com.masdes.dam.Basic_Enumeration_Types.Persistency;
import com.masdes.dam.Basic_Enumeration_Types.PhaseCreation;
import com.masdes.dam.Basic_Enumeration_Types.PhenomCause;
import com.masdes.dam.Basic_Enumeration_Types.SysBoundaries;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;
import com.masdes.dam.Complex_Data_Types.DaError;
import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaFault;
import com.masdes.dam.Complex_Data_Types.DaHazard;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Da Fault</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getOccurrenceRate <em>Occurrence Rate</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getOccurrenceProb <em>Occurrence Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getOccurrenceDist <em>Occurrence Dist</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getPersistency <em>Persistency</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getEffectE <em>Effect E</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getEffectF <em>Effect F</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getEffectH <em>Effect H</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getPhaseCreation <em>Phase Creation</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getSysBoundaries <em>Sys Boundaries</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getPhenomCause <em>Phenom Cause</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getDimension <em>Dimension</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getObjective <em>Objective</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getIntent <em>Intent</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFaultImpl#getCapability <em>Capability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaFaultImpl extends MinimalEObjectImpl.Container implements DaFault {
	/**
	 * The cached value of the '{@link #getOccurrenceRate() <em>Occurrence Rate</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceRate()
	 * @generated
	 * @ordered
	 */
	protected EList<String> occurrenceRate;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected EList<String> latency;

	/**
	 * The cached value of the '{@link #getOccurrenceProb() <em>Occurrence Prob</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceProb()
	 * @generated
	 * @ordered
	 */
	protected EList<String> occurrenceProb;

	/**
	 * The cached value of the '{@link #getOccurrenceDist() <em>Occurrence Dist</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDist()
	 * @generated
	 * @ordered
	 */
	protected EList<String> occurrenceDist;

	/**
	 * The default value of the '{@link #getPersistency() <em>Persistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistency()
	 * @generated
	 * @ordered
	 */
	protected static final Persistency PERSISTENCY_EDEFAULT = Persistency.TRANSIENT;

	/**
	 * The cached value of the '{@link #getPersistency() <em>Persistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistency()
	 * @generated
	 * @ordered
	 */
	protected Persistency persistency = PERSISTENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected EList<String> duration;

	/**
	 * The cached value of the '{@link #getEffectE() <em>Effect E</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectE()
	 * @generated
	 * @ordered
	 */
	protected EList<DaError> effectE;

	/**
	 * The cached value of the '{@link #getEffectF() <em>Effect F</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectF()
	 * @generated
	 * @ordered
	 */
	protected EList<DaFailure> effectF;

	/**
	 * The cached value of the '{@link #getEffectH() <em>Effect H</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectH()
	 * @generated
	 * @ordered
	 */
	protected EList<DaHazard> effectH;

	/**
	 * The cached value of the '{@link #getPhaseCreation() <em>Phase Creation</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhaseCreation()
	 * @generated
	 * @ordered
	 */
	protected EList<PhaseCreation> phaseCreation;

	/**
	 * The cached value of the '{@link #getSysBoundaries() <em>Sys Boundaries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSysBoundaries()
	 * @generated
	 * @ordered
	 */
	protected EList<SysBoundaries> sysBoundaries;

	/**
	 * The cached value of the '{@link #getPhenomCause() <em>Phenom Cause</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhenomCause()
	 * @generated
	 * @ordered
	 */
	protected EList<PhenomCause> phenomCause;

	/**
	 * The cached value of the '{@link #getDimension() <em>Dimension</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<Origin> dimension;

	/**
	 * The cached value of the '{@link #getObjective() <em>Objective</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjective()
	 * @generated
	 * @ordered
	 */
	protected EList<Objective> objective;

	/**
	 * The cached value of the '{@link #getIntent() <em>Intent</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntent()
	 * @generated
	 * @ordered
	 */
	protected EList<Intent> intent;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capability;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaFaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.DA_FAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOccurrenceRate() {
		if (occurrenceRate == null) {
			occurrenceRate = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_RATE);
		}
		return occurrenceRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLatency() {
		if (latency == null) {
			latency = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAULT__LATENCY);
		}
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOccurrenceProb() {
		if (occurrenceProb == null) {
			occurrenceProb = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_PROB);
		}
		return occurrenceProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOccurrenceDist() {
		if (occurrenceDist == null) {
			occurrenceDist = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_DIST);
		}
		return occurrenceDist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Persistency getPersistency() {
		return persistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistency(Persistency newPersistency) {
		Persistency oldPersistency = persistency;
		persistency = newPersistency == null ? PERSISTENCY_EDEFAULT : newPersistency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_FAULT__PERSISTENCY, oldPersistency, persistency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDuration() {
		if (duration == null) {
			duration = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAULT__DURATION);
		}
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaError> getEffectE() {
		if (effectE == null) {
			effectE = new EObjectContainmentEList<DaError>(DaError.class, this, Complex_Data_TypesPackage.DA_FAULT__EFFECT_E);
		}
		return effectE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFailure> getEffectF() {
		if (effectF == null) {
			effectF = new EObjectContainmentEList<DaFailure>(DaFailure.class, this, Complex_Data_TypesPackage.DA_FAULT__EFFECT_F);
		}
		return effectF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaHazard> getEffectH() {
		if (effectH == null) {
			effectH = new EObjectContainmentEList<DaHazard>(DaHazard.class, this, Complex_Data_TypesPackage.DA_FAULT__EFFECT_H);
		}
		return effectH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhaseCreation> getPhaseCreation() {
		if (phaseCreation == null) {
			phaseCreation = new EDataTypeUniqueEList<PhaseCreation>(PhaseCreation.class, this, Complex_Data_TypesPackage.DA_FAULT__PHASE_CREATION);
		}
		return phaseCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SysBoundaries> getSysBoundaries() {
		if (sysBoundaries == null) {
			sysBoundaries = new EDataTypeUniqueEList<SysBoundaries>(SysBoundaries.class, this, Complex_Data_TypesPackage.DA_FAULT__SYS_BOUNDARIES);
		}
		return sysBoundaries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PhenomCause> getPhenomCause() {
		if (phenomCause == null) {
			phenomCause = new EDataTypeUniqueEList<PhenomCause>(PhenomCause.class, this, Complex_Data_TypesPackage.DA_FAULT__PHENOM_CAUSE);
		}
		return phenomCause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Origin> getDimension() {
		if (dimension == null) {
			dimension = new EDataTypeUniqueEList<Origin>(Origin.class, this, Complex_Data_TypesPackage.DA_FAULT__DIMENSION);
		}
		return dimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Objective> getObjective() {
		if (objective == null) {
			objective = new EDataTypeUniqueEList<Objective>(Objective.class, this, Complex_Data_TypesPackage.DA_FAULT__OBJECTIVE);
		}
		return objective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Intent> getIntent() {
		if (intent == null) {
			intent = new EDataTypeUniqueEList<Intent>(Intent.class, this, Complex_Data_TypesPackage.DA_FAULT__INTENT);
		}
		return intent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapability() {
		if (capability == null) {
			capability = new EDataTypeUniqueEList<Capability>(Capability.class, this, Complex_Data_TypesPackage.DA_FAULT__CAPABILITY);
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_E:
				return ((InternalEList<?>)getEffectE()).basicRemove(otherEnd, msgs);
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_F:
				return ((InternalEList<?>)getEffectF()).basicRemove(otherEnd, msgs);
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_H:
				return ((InternalEList<?>)getEffectH()).basicRemove(otherEnd, msgs);
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
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_RATE:
				return getOccurrenceRate();
			case Complex_Data_TypesPackage.DA_FAULT__LATENCY:
				return getLatency();
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_PROB:
				return getOccurrenceProb();
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_DIST:
				return getOccurrenceDist();
			case Complex_Data_TypesPackage.DA_FAULT__PERSISTENCY:
				return getPersistency();
			case Complex_Data_TypesPackage.DA_FAULT__DURATION:
				return getDuration();
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_E:
				return getEffectE();
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_F:
				return getEffectF();
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_H:
				return getEffectH();
			case Complex_Data_TypesPackage.DA_FAULT__PHASE_CREATION:
				return getPhaseCreation();
			case Complex_Data_TypesPackage.DA_FAULT__SYS_BOUNDARIES:
				return getSysBoundaries();
			case Complex_Data_TypesPackage.DA_FAULT__PHENOM_CAUSE:
				return getPhenomCause();
			case Complex_Data_TypesPackage.DA_FAULT__DIMENSION:
				return getDimension();
			case Complex_Data_TypesPackage.DA_FAULT__OBJECTIVE:
				return getObjective();
			case Complex_Data_TypesPackage.DA_FAULT__INTENT:
				return getIntent();
			case Complex_Data_TypesPackage.DA_FAULT__CAPABILITY:
				return getCapability();
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
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_RATE:
				getOccurrenceRate().clear();
				getOccurrenceRate().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__LATENCY:
				getLatency().clear();
				getLatency().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_PROB:
				getOccurrenceProb().clear();
				getOccurrenceProb().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_DIST:
				getOccurrenceDist().clear();
				getOccurrenceDist().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__PERSISTENCY:
				setPersistency((Persistency)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__DURATION:
				getDuration().clear();
				getDuration().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_E:
				getEffectE().clear();
				getEffectE().addAll((Collection<? extends DaError>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_F:
				getEffectF().clear();
				getEffectF().addAll((Collection<? extends DaFailure>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_H:
				getEffectH().clear();
				getEffectH().addAll((Collection<? extends DaHazard>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__PHASE_CREATION:
				getPhaseCreation().clear();
				getPhaseCreation().addAll((Collection<? extends PhaseCreation>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__SYS_BOUNDARIES:
				getSysBoundaries().clear();
				getSysBoundaries().addAll((Collection<? extends SysBoundaries>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__PHENOM_CAUSE:
				getPhenomCause().clear();
				getPhenomCause().addAll((Collection<? extends PhenomCause>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__DIMENSION:
				getDimension().clear();
				getDimension().addAll((Collection<? extends Origin>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__OBJECTIVE:
				getObjective().clear();
				getObjective().addAll((Collection<? extends Objective>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__INTENT:
				getIntent().clear();
				getIntent().addAll((Collection<? extends Intent>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__CAPABILITY:
				getCapability().clear();
				getCapability().addAll((Collection<? extends Capability>)newValue);
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
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_RATE:
				getOccurrenceRate().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__LATENCY:
				getLatency().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_PROB:
				getOccurrenceProb().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_DIST:
				getOccurrenceDist().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__PERSISTENCY:
				setPersistency(PERSISTENCY_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DA_FAULT__DURATION:
				getDuration().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_E:
				getEffectE().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_F:
				getEffectF().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_H:
				getEffectH().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__PHASE_CREATION:
				getPhaseCreation().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__SYS_BOUNDARIES:
				getSysBoundaries().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__PHENOM_CAUSE:
				getPhenomCause().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__DIMENSION:
				getDimension().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__OBJECTIVE:
				getObjective().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__INTENT:
				getIntent().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAULT__CAPABILITY:
				getCapability().clear();
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
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_RATE:
				return occurrenceRate != null && !occurrenceRate.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__LATENCY:
				return latency != null && !latency.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_PROB:
				return occurrenceProb != null && !occurrenceProb.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__OCCURRENCE_DIST:
				return occurrenceDist != null && !occurrenceDist.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__PERSISTENCY:
				return persistency != PERSISTENCY_EDEFAULT;
			case Complex_Data_TypesPackage.DA_FAULT__DURATION:
				return duration != null && !duration.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_E:
				return effectE != null && !effectE.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_F:
				return effectF != null && !effectF.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__EFFECT_H:
				return effectH != null && !effectH.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__PHASE_CREATION:
				return phaseCreation != null && !phaseCreation.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__SYS_BOUNDARIES:
				return sysBoundaries != null && !sysBoundaries.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__PHENOM_CAUSE:
				return phenomCause != null && !phenomCause.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__DIMENSION:
				return dimension != null && !dimension.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__OBJECTIVE:
				return objective != null && !objective.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__INTENT:
				return intent != null && !intent.isEmpty();
			case Complex_Data_TypesPackage.DA_FAULT__CAPABILITY:
				return capability != null && !capability.isEmpty();
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
		result.append(" (occurrenceRate: ");
		result.append(occurrenceRate);
		result.append(", latency: ");
		result.append(latency);
		result.append(", occurrenceProb: ");
		result.append(occurrenceProb);
		result.append(", occurrenceDist: ");
		result.append(occurrenceDist);
		result.append(", persistency: ");
		result.append(persistency);
		result.append(", duration: ");
		result.append(duration);
		result.append(", phaseCreation: ");
		result.append(phaseCreation);
		result.append(", sysBoundaries: ");
		result.append(sysBoundaries);
		result.append(", phenomCause: ");
		result.append(phenomCause);
		result.append(", dimension: ");
		result.append(dimension);
		result.append(", objective: ");
		result.append(objective);
		result.append(", intent: ");
		result.append(intent);
		result.append(", capability: ");
		result.append(capability);
		result.append(')');
		return result.toString();
	}

} //DaFaultImpl
