/**
 */
package es.unizar.disco.dice.Complex_Data_Types.impl;

import es.unizar.disco.dice.Basic_Enumeration_Types.RefDataFormatType;
import es.unizar.disco.dice.Basic_Enumeration_Types.RefType;

import es.unizar.disco.dice.Complex_Data_Types.Complex_Data_TypesPackage;
import es.unizar.disco.dice.Complex_Data_Types.DiceDataSpecification;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dice Data Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl#getSize <em>Size</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl#getRefModel <em>Ref Model</em>}</li>
 *   <li>{@link es.unizar.disco.dice.Complex_Data_Types.impl.DiceDataSpecificationImpl#getRefDataFormat <em>Ref Data Format</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiceDataSpecificationImpl extends MinimalEObjectImpl.Container implements DiceDataSpecification {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final String SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected String size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefModel() <em>Ref Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefModel()
	 * @generated
	 * @ordered
	 */
	protected static final RefType REF_MODEL_EDEFAULT = RefType.NO_SQL;

	/**
	 * The cached value of the '{@link #getRefModel() <em>Ref Model</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefModel()
	 * @generated
	 * @ordered
	 */
	protected RefType refModel = REF_MODEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefDataFormat() <em>Ref Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDataFormat()
	 * @generated
	 * @ordered
	 */
	protected static final RefDataFormatType REF_DATA_FORMAT_EDEFAULT = RefDataFormatType.JSON;

	/**
	 * The cached value of the '{@link #getRefDataFormat() <em>Ref Data Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefDataFormat()
	 * @generated
	 * @ordered
	 */
	protected RefDataFormatType refDataFormat = REF_DATA_FORMAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiceDataSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Complex_Data_TypesPackage.Literals.DICE_DATA_SPECIFICATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(String newSize) {
		String oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefType getRefModel() {
		return refModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefModel(RefType newRefModel) {
		RefType oldRefModel = refModel;
		refModel = newRefModel == null ? REF_MODEL_EDEFAULT : newRefModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__REF_MODEL, oldRefModel, refModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefDataFormatType getRefDataFormat() {
		return refDataFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefDataFormat(RefDataFormatType newRefDataFormat) {
		RefDataFormatType oldRefDataFormat = refDataFormat;
		refDataFormat = newRefDataFormat == null ? REF_DATA_FORMAT_EDEFAULT : newRefDataFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__REF_DATA_FORMAT, oldRefDataFormat, refDataFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__DESCRIPTION:
				return getDescription();
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__SIZE:
				return getSize();
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__REF_MODEL:
				return getRefModel();
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__REF_DATA_FORMAT:
				return getRefDataFormat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__SIZE:
				setSize((String)newValue);
				return;
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__REF_MODEL:
				setRefModel((RefType)newValue);
				return;
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__REF_DATA_FORMAT:
				setRefDataFormat((RefDataFormatType)newValue);
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
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__REF_MODEL:
				setRefModel(REF_MODEL_EDEFAULT);
				return;
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__REF_DATA_FORMAT:
				setRefDataFormat(REF_DATA_FORMAT_EDEFAULT);
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
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__REF_MODEL:
				return refModel != REF_MODEL_EDEFAULT;
			case Complex_Data_TypesPackage.DICE_DATA_SPECIFICATION__REF_DATA_FORMAT:
				return refDataFormat != REF_DATA_FORMAT_EDEFAULT;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", size: ");
		result.append(size);
		result.append(", refModel: ");
		result.append(refModel);
		result.append(", refDataFormat: ");
		result.append(refDataFormat);
		result.append(')');
		return result.toString();
	}

} //DiceDataSpecificationImpl
