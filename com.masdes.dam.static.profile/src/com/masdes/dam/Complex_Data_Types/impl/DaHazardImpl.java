/**
 */
package com.masdes.dam.Complex_Data_Types.impl;

import com.masdes.dam.Basic_Enumeration_Types.FactorOrigin;
import com.masdes.dam.Basic_Enumeration_Types.Guideword;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;
import com.masdes.dam.Complex_Data_Types.DaError;
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
 * An implementation of the model object '<em><b>Da Hazard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getSeverity <em>Severity</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getOccurrenceProb <em>Occurrence Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getLikelihood <em>Likelihood</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getAccidentLikelihood <em>Accident Likelihood</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getGuideword <em>Guideword</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getAccident <em>Accident</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getCauseF <em>Cause F</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getCauseE <em>Cause E</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaHazardImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaHazardImpl extends MinimalEObjectImpl.Container implements DaHazard {
	/**
	 * The default value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected static final FactorOrigin ORIGIN_EDEFAULT = FactorOrigin.ENDOGENOUS;

	/**
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected FactorOrigin origin = ORIGIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSeverity() <em>Severity</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeverity()
	 * @generated
	 * @ordered
	 */
	protected EList<String> severity;

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
	 * The cached value of the '{@link #getLikelihood() <em>Likelihood</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLikelihood()
	 * @generated
	 * @ordered
	 */
	protected EList<String> likelihood;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected EList<String> level;

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
	 * The cached value of the '{@link #getAccidentLikelihood() <em>Accident Likelihood</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccidentLikelihood()
	 * @generated
	 * @ordered
	 */
	protected EList<String> accidentLikelihood;

	/**
	 * The cached value of the '{@link #getRisk() <em>Risk</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRisk()
	 * @generated
	 * @ordered
	 */
	protected EList<String> risk;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected EList<String> cost;

	/**
	 * The default value of the '{@link #getGuideword() <em>Guideword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideword()
	 * @generated
	 * @ordered
	 */
	protected static final Guideword GUIDEWORD_EDEFAULT = Guideword.VALUE;

	/**
	 * The cached value of the '{@link #getGuideword() <em>Guideword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuideword()
	 * @generated
	 * @ordered
	 */
	protected Guideword guideword = GUIDEWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccident() <em>Accident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccident()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCIDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccident() <em>Accident</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccident()
	 * @generated
	 * @ordered
	 */
	protected String accident = ACCIDENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCauseF() <em>Cause F</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseF()
	 * @generated
	 * @ordered
	 */
	protected EList<DaFault> causeF;

	/**
	 * The cached value of the '{@link #getCauseE() <em>Cause E</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCauseE()
	 * @generated
	 * @ordered
	 */
	protected EList<DaError> causeE;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaHazardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.DA_HAZARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FactorOrigin getOrigin() {
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrigin(FactorOrigin newOrigin) {
		FactorOrigin oldOrigin = origin;
		origin = newOrigin == null ? ORIGIN_EDEFAULT : newOrigin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_HAZARD__ORIGIN, oldOrigin, origin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSeverity() {
		if (severity == null) {
			severity = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_HAZARD__SEVERITY);
		}
		return severity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOccurrenceProb() {
		if (occurrenceProb == null) {
			occurrenceProb = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_HAZARD__OCCURRENCE_PROB);
		}
		return occurrenceProb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLikelihood() {
		if (likelihood == null) {
			likelihood = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_HAZARD__LIKELIHOOD);
		}
		return likelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLevel() {
		if (level == null) {
			level = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_HAZARD__LEVEL);
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLatency() {
		if (latency == null) {
			latency = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_HAZARD__LATENCY);
		}
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAccidentLikelihood() {
		if (accidentLikelihood == null) {
			accidentLikelihood = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_HAZARD__ACCIDENT_LIKELIHOOD);
		}
		return accidentLikelihood;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRisk() {
		if (risk == null) {
			risk = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_HAZARD__RISK);
		}
		return risk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCost() {
		if (cost == null) {
			cost = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_HAZARD__COST);
		}
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guideword getGuideword() {
		return guideword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuideword(Guideword newGuideword) {
		Guideword oldGuideword = guideword;
		guideword = newGuideword == null ? GUIDEWORD_EDEFAULT : newGuideword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_HAZARD__GUIDEWORD, oldGuideword, guideword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccident() {
		return accident;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccident(String newAccident) {
		String oldAccident = accident;
		accident = newAccident;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_HAZARD__ACCIDENT, oldAccident, accident));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFault> getCauseF() {
		if (causeF == null) {
			causeF = new EObjectContainmentEList<DaFault>(DaFault.class, this, Complex_Data_TypesPackage.DA_HAZARD__CAUSE_F);
		}
		return causeF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaError> getCauseE() {
		if (causeE == null) {
			causeE = new EObjectContainmentEList<DaError>(DaError.class, this, Complex_Data_TypesPackage.DA_HAZARD__CAUSE_E);
		}
		return causeE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_HAZARD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Complex_Data_TypesPackage.DA_HAZARD__CAUSE_F:
				return ((InternalEList<?>)getCauseF()).basicRemove(otherEnd, msgs);
			case Complex_Data_TypesPackage.DA_HAZARD__CAUSE_E:
				return ((InternalEList<?>)getCauseE()).basicRemove(otherEnd, msgs);
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
			case Complex_Data_TypesPackage.DA_HAZARD__ORIGIN:
				return getOrigin();
			case Complex_Data_TypesPackage.DA_HAZARD__SEVERITY:
				return getSeverity();
			case Complex_Data_TypesPackage.DA_HAZARD__OCCURRENCE_PROB:
				return getOccurrenceProb();
			case Complex_Data_TypesPackage.DA_HAZARD__LIKELIHOOD:
				return getLikelihood();
			case Complex_Data_TypesPackage.DA_HAZARD__LEVEL:
				return getLevel();
			case Complex_Data_TypesPackage.DA_HAZARD__LATENCY:
				return getLatency();
			case Complex_Data_TypesPackage.DA_HAZARD__ACCIDENT_LIKELIHOOD:
				return getAccidentLikelihood();
			case Complex_Data_TypesPackage.DA_HAZARD__RISK:
				return getRisk();
			case Complex_Data_TypesPackage.DA_HAZARD__COST:
				return getCost();
			case Complex_Data_TypesPackage.DA_HAZARD__GUIDEWORD:
				return getGuideword();
			case Complex_Data_TypesPackage.DA_HAZARD__ACCIDENT:
				return getAccident();
			case Complex_Data_TypesPackage.DA_HAZARD__CAUSE_F:
				return getCauseF();
			case Complex_Data_TypesPackage.DA_HAZARD__CAUSE_E:
				return getCauseE();
			case Complex_Data_TypesPackage.DA_HAZARD__DESCRIPTION:
				return getDescription();
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
			case Complex_Data_TypesPackage.DA_HAZARD__ORIGIN:
				setOrigin((FactorOrigin)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__SEVERITY:
				getSeverity().clear();
				getSeverity().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__OCCURRENCE_PROB:
				getOccurrenceProb().clear();
				getOccurrenceProb().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__LIKELIHOOD:
				getLikelihood().clear();
				getLikelihood().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__LEVEL:
				getLevel().clear();
				getLevel().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__LATENCY:
				getLatency().clear();
				getLatency().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__ACCIDENT_LIKELIHOOD:
				getAccidentLikelihood().clear();
				getAccidentLikelihood().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__RISK:
				getRisk().clear();
				getRisk().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__COST:
				getCost().clear();
				getCost().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__GUIDEWORD:
				setGuideword((Guideword)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__ACCIDENT:
				setAccident((String)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__CAUSE_F:
				getCauseF().clear();
				getCauseF().addAll((Collection<? extends DaFault>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__CAUSE_E:
				getCauseE().clear();
				getCauseE().addAll((Collection<? extends DaError>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__DESCRIPTION:
				setDescription((String)newValue);
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
			case Complex_Data_TypesPackage.DA_HAZARD__ORIGIN:
				setOrigin(ORIGIN_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__SEVERITY:
				getSeverity().clear();
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__OCCURRENCE_PROB:
				getOccurrenceProb().clear();
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__LIKELIHOOD:
				getLikelihood().clear();
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__LEVEL:
				getLevel().clear();
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__LATENCY:
				getLatency().clear();
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__ACCIDENT_LIKELIHOOD:
				getAccidentLikelihood().clear();
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__RISK:
				getRisk().clear();
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__COST:
				getCost().clear();
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__GUIDEWORD:
				setGuideword(GUIDEWORD_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__ACCIDENT:
				setAccident(ACCIDENT_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__CAUSE_F:
				getCauseF().clear();
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__CAUSE_E:
				getCauseE().clear();
				return;
			case Complex_Data_TypesPackage.DA_HAZARD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case Complex_Data_TypesPackage.DA_HAZARD__ORIGIN:
				return origin != ORIGIN_EDEFAULT;
			case Complex_Data_TypesPackage.DA_HAZARD__SEVERITY:
				return severity != null && !severity.isEmpty();
			case Complex_Data_TypesPackage.DA_HAZARD__OCCURRENCE_PROB:
				return occurrenceProb != null && !occurrenceProb.isEmpty();
			case Complex_Data_TypesPackage.DA_HAZARD__LIKELIHOOD:
				return likelihood != null && !likelihood.isEmpty();
			case Complex_Data_TypesPackage.DA_HAZARD__LEVEL:
				return level != null && !level.isEmpty();
			case Complex_Data_TypesPackage.DA_HAZARD__LATENCY:
				return latency != null && !latency.isEmpty();
			case Complex_Data_TypesPackage.DA_HAZARD__ACCIDENT_LIKELIHOOD:
				return accidentLikelihood != null && !accidentLikelihood.isEmpty();
			case Complex_Data_TypesPackage.DA_HAZARD__RISK:
				return risk != null && !risk.isEmpty();
			case Complex_Data_TypesPackage.DA_HAZARD__COST:
				return cost != null && !cost.isEmpty();
			case Complex_Data_TypesPackage.DA_HAZARD__GUIDEWORD:
				return guideword != GUIDEWORD_EDEFAULT;
			case Complex_Data_TypesPackage.DA_HAZARD__ACCIDENT:
				return ACCIDENT_EDEFAULT == null ? accident != null : !ACCIDENT_EDEFAULT.equals(accident);
			case Complex_Data_TypesPackage.DA_HAZARD__CAUSE_F:
				return causeF != null && !causeF.isEmpty();
			case Complex_Data_TypesPackage.DA_HAZARD__CAUSE_E:
				return causeE != null && !causeE.isEmpty();
			case Complex_Data_TypesPackage.DA_HAZARD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (origin: ");
		result.append(origin);
		result.append(", severity: ");
		result.append(severity);
		result.append(", occurrenceProb: ");
		result.append(occurrenceProb);
		result.append(", likelihood: ");
		result.append(likelihood);
		result.append(", level: ");
		result.append(level);
		result.append(", latency: ");
		result.append(latency);
		result.append(", accidentLikelihood: ");
		result.append(accidentLikelihood);
		result.append(", risk: ");
		result.append(risk);
		result.append(", cost: ");
		result.append(cost);
		result.append(", guideword: ");
		result.append(guideword);
		result.append(", accident: ");
		result.append(accident);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DaHazardImpl
