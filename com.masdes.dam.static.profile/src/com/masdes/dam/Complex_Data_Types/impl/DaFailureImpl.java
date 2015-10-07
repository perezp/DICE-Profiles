/**
 */
package com.masdes.dam.Complex_Data_Types.impl;

import com.masdes.dam.Basic_Enumeration_Types.Consistency;
import com.masdes.dam.Basic_Enumeration_Types.Detectabillity;
import com.masdes.dam.Basic_Enumeration_Types.Domain;

import com.masdes.dam.Complex_Data_Types.Complex_Data_TypesPackage;
import com.masdes.dam.Complex_Data_Types.DaError;
import com.masdes.dam.Complex_Data_Types.DaFailure;
import com.masdes.dam.Complex_Data_Types.DaFault;

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
 * An implementation of the model object '<em><b>Da Failure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getOccurrenceRate <em>Occurrence Rate</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getMTTF <em>MTTF</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getMTBF <em>MTBF</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getOccurrenceProb <em>Occurrence Prob</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getOccurrenceDist <em>Occurrence Dist</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getConsistency <em>Consistency</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getConsequence <em>Consequence</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getRisk <em>Risk</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getCauseF <em>Cause F</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getCauseE <em>Cause E</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.masdes.dam.Complex_Data_Types.impl.DaFailureImpl#getDetectability <em>Detectability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DaFailureImpl extends MinimalEObjectImpl.Container implements DaFailure {
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
	 * The cached value of the '{@link #getMTTF() <em>MTTF</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTTF()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mttf;

	/**
	 * The cached value of the '{@link #getMTBF() <em>MTBF</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMTBF()
	 * @generated
	 * @ordered
	 */
	protected EList<String> mtbf;

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
	 * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected static final Domain DOMAIN_EDEFAULT = Domain.CONTENT;

	/**
	 * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomain()
	 * @generated
	 * @ordered
	 */
	protected Domain domain = DOMAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getConsistency() <em>Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistency()
	 * @generated
	 * @ordered
	 */
	protected static final Consistency CONSISTENCY_EDEFAULT = Consistency.CONSISTENT;

	/**
	 * The cached value of the '{@link #getConsistency() <em>Consistency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsistency()
	 * @generated
	 * @ordered
	 */
	protected Consistency consistency = CONSISTENCY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConsequence() <em>Consequence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsequence()
	 * @generated
	 * @ordered
	 */
	protected EList<String> consequence;

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
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

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
	 * The default value of the '{@link #getDetectability() <em>Detectability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectability()
	 * @generated
	 * @ordered
	 */
	protected static final Detectabillity DETECTABILITY_EDEFAULT = Detectabillity.SIGNALED;

	/**
	 * The cached value of the '{@link #getDetectability() <em>Detectability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetectability()
	 * @generated
	 * @ordered
	 */
	protected Detectabillity detectability = DETECTABILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaFailureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.DA_FAILURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOccurrenceRate() {
		if (occurrenceRate == null) {
			occurrenceRate = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_RATE);
		}
		return occurrenceRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMTTF() {
		if (mttf == null) {
			mttf = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAILURE__MTTF);
		}
		return mttf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMTBF() {
		if (mtbf == null) {
			mtbf = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAILURE__MTBF);
		}
		return mtbf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getOccurrenceProb() {
		if (occurrenceProb == null) {
			occurrenceProb = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_PROB);
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
			occurrenceDist = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_DIST);
		}
		return occurrenceDist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomain() {
		return domain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomain(Domain newDomain) {
		Domain oldDomain = domain;
		domain = newDomain == null ? DOMAIN_EDEFAULT : newDomain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_FAILURE__DOMAIN, oldDomain, domain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consistency getConsistency() {
		return consistency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConsistency(Consistency newConsistency) {
		Consistency oldConsistency = consistency;
		consistency = newConsistency == null ? CONSISTENCY_EDEFAULT : newConsistency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_FAILURE__CONSISTENCY, oldConsistency, consistency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConsequence() {
		if (consequence == null) {
			consequence = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAILURE__CONSEQUENCE);
		}
		return consequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRisk() {
		if (risk == null) {
			risk = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAILURE__RISK);
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
			cost = new EDataTypeUniqueEList<String>(String.class, this, Complex_Data_TypesPackage.DA_FAILURE__COST);
		}
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_FAILURE__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DaFault> getCauseF() {
		if (causeF == null) {
			causeF = new EObjectContainmentEList<DaFault>(DaFault.class, this, Complex_Data_TypesPackage.DA_FAILURE__CAUSE_F);
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
			causeE = new EObjectContainmentEList<DaError>(DaError.class, this, Complex_Data_TypesPackage.DA_FAILURE__CAUSE_E);
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
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_FAILURE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Detectabillity getDetectability() {
		return detectability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetectability(Detectabillity newDetectability) {
		Detectabillity oldDetectability = detectability;
		detectability = newDetectability == null ? DETECTABILITY_EDEFAULT : newDetectability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DA_FAILURE__DETECTABILITY, oldDetectability, detectability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Complex_Data_TypesPackage.DA_FAILURE__CAUSE_F:
				return ((InternalEList<?>)getCauseF()).basicRemove(otherEnd, msgs);
			case Complex_Data_TypesPackage.DA_FAILURE__CAUSE_E:
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
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_RATE:
				return getOccurrenceRate();
			case Complex_Data_TypesPackage.DA_FAILURE__MTTF:
				return getMTTF();
			case Complex_Data_TypesPackage.DA_FAILURE__MTBF:
				return getMTBF();
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_PROB:
				return getOccurrenceProb();
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_DIST:
				return getOccurrenceDist();
			case Complex_Data_TypesPackage.DA_FAILURE__DOMAIN:
				return getDomain();
			case Complex_Data_TypesPackage.DA_FAILURE__CONSISTENCY:
				return getConsistency();
			case Complex_Data_TypesPackage.DA_FAILURE__CONSEQUENCE:
				return getConsequence();
			case Complex_Data_TypesPackage.DA_FAILURE__RISK:
				return getRisk();
			case Complex_Data_TypesPackage.DA_FAILURE__COST:
				return getCost();
			case Complex_Data_TypesPackage.DA_FAILURE__CONDITION:
				return getCondition();
			case Complex_Data_TypesPackage.DA_FAILURE__CAUSE_F:
				return getCauseF();
			case Complex_Data_TypesPackage.DA_FAILURE__CAUSE_E:
				return getCauseE();
			case Complex_Data_TypesPackage.DA_FAILURE__DESCRIPTION:
				return getDescription();
			case Complex_Data_TypesPackage.DA_FAILURE__DETECTABILITY:
				return getDetectability();
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
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_RATE:
				getOccurrenceRate().clear();
				getOccurrenceRate().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__MTTF:
				getMTTF().clear();
				getMTTF().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__MTBF:
				getMTBF().clear();
				getMTBF().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_PROB:
				getOccurrenceProb().clear();
				getOccurrenceProb().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_DIST:
				getOccurrenceDist().clear();
				getOccurrenceDist().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__DOMAIN:
				setDomain((Domain)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__CONSISTENCY:
				setConsistency((Consistency)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__CONSEQUENCE:
				getConsequence().clear();
				getConsequence().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__RISK:
				getRisk().clear();
				getRisk().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__COST:
				getCost().clear();
				getCost().addAll((Collection<? extends String>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__CONDITION:
				setCondition((String)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__CAUSE_F:
				getCauseF().clear();
				getCauseF().addAll((Collection<? extends DaFault>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__CAUSE_E:
				getCauseE().clear();
				getCauseE().addAll((Collection<? extends DaError>)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__DETECTABILITY:
				setDetectability((Detectabillity)newValue);
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
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_RATE:
				getOccurrenceRate().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__MTTF:
				getMTTF().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__MTBF:
				getMTBF().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_PROB:
				getOccurrenceProb().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_DIST:
				getOccurrenceDist().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__DOMAIN:
				setDomain(DOMAIN_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__CONSISTENCY:
				setConsistency(CONSISTENCY_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__CONSEQUENCE:
				getConsequence().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__RISK:
				getRisk().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__COST:
				getCost().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__CAUSE_F:
				getCauseF().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__CAUSE_E:
				getCauseE().clear();
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DA_FAILURE__DETECTABILITY:
				setDetectability(DETECTABILITY_EDEFAULT);
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
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_RATE:
				return occurrenceRate != null && !occurrenceRate.isEmpty();
			case Complex_Data_TypesPackage.DA_FAILURE__MTTF:
				return mttf != null && !mttf.isEmpty();
			case Complex_Data_TypesPackage.DA_FAILURE__MTBF:
				return mtbf != null && !mtbf.isEmpty();
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_PROB:
				return occurrenceProb != null && !occurrenceProb.isEmpty();
			case Complex_Data_TypesPackage.DA_FAILURE__OCCURRENCE_DIST:
				return occurrenceDist != null && !occurrenceDist.isEmpty();
			case Complex_Data_TypesPackage.DA_FAILURE__DOMAIN:
				return domain != DOMAIN_EDEFAULT;
			case Complex_Data_TypesPackage.DA_FAILURE__CONSISTENCY:
				return consistency != CONSISTENCY_EDEFAULT;
			case Complex_Data_TypesPackage.DA_FAILURE__CONSEQUENCE:
				return consequence != null && !consequence.isEmpty();
			case Complex_Data_TypesPackage.DA_FAILURE__RISK:
				return risk != null && !risk.isEmpty();
			case Complex_Data_TypesPackage.DA_FAILURE__COST:
				return cost != null && !cost.isEmpty();
			case Complex_Data_TypesPackage.DA_FAILURE__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case Complex_Data_TypesPackage.DA_FAILURE__CAUSE_F:
				return causeF != null && !causeF.isEmpty();
			case Complex_Data_TypesPackage.DA_FAILURE__CAUSE_E:
				return causeE != null && !causeE.isEmpty();
			case Complex_Data_TypesPackage.DA_FAILURE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Complex_Data_TypesPackage.DA_FAILURE__DETECTABILITY:
				return detectability != DETECTABILITY_EDEFAULT;
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
		result.append(", MTTF: ");
		result.append(mttf);
		result.append(", MTBF: ");
		result.append(mtbf);
		result.append(", occurrenceProb: ");
		result.append(occurrenceProb);
		result.append(", occurrenceDist: ");
		result.append(occurrenceDist);
		result.append(", domain: ");
		result.append(domain);
		result.append(", consistency: ");
		result.append(consistency);
		result.append(", consequence: ");
		result.append(consequence);
		result.append(", risk: ");
		result.append(risk);
		result.append(", cost: ");
		result.append(cost);
		result.append(", condition: ");
		result.append(condition);
		result.append(", description: ");
		result.append(description);
		result.append(", detectability: ");
		result.append(detectability);
		result.append(')');
		return result.toString();
	}

} //DaFailureImpl
