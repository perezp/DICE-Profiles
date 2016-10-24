/**
 */
package es.unizar.disco.dice.DDSM;

import es.unizar.disco.dice.Basic_Enumeration_Types.VMSize;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ddsm Vm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#isIs64os <em>Is64os</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getImageId <em>Image Id</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getMaxCores <em>Max Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getMaxRam <em>Max Ram</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getMaxStorage <em>Max Storage</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getMinCores <em>Min Cores</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getMinRam <em>Min Ram</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getMinStorage <em>Min Storage</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getOs <em>Os</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getSecurityGroup <em>Security Group</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getPrivateKey <em>Private Key</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getSshKey <em>Ssh Key</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getPublicAddress <em>Public Address</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getInstances <em>Instances</em>}</li>
 *   <li>{@link es.unizar.disco.dice.DDSM.DdsmVm#getGenericSize <em>Generic Size</em>}</li>
 * </ul>
 *
 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm()
 * @model
 * @generated
 */
public interface DdsmVm extends DdsmExternalComponent {
	/**
	 * Returns the value of the '<em><b>Is64os</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is64os</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is64os</em>' attribute.
	 * @see #setIs64os(boolean)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_Is64os()
	 * @model default="true" ordered="false"
	 * @generated
	 */
	boolean isIs64os();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#isIs64os <em>Is64os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is64os</em>' attribute.
	 * @see #isIs64os()
	 * @generated
	 */
	void setIs64os(boolean value);

	/**
	 * Returns the value of the '<em><b>Image Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Id</em>' attribute.
	 * @see #setImageId(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_ImageId()
	 * @model ordered="false"
	 * @generated
	 */
	String getImageId();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getImageId <em>Image Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Id</em>' attribute.
	 * @see #getImageId()
	 * @generated
	 */
	void setImageId(String value);

	/**
	 * Returns the value of the '<em><b>Max Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cores</em>' attribute.
	 * @see #setMaxCores(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_MaxCores()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getMaxCores();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMaxCores <em>Max Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cores</em>' attribute.
	 * @see #getMaxCores()
	 * @generated
	 */
	void setMaxCores(int value);

	/**
	 * Returns the value of the '<em><b>Max Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Ram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Ram</em>' attribute.
	 * @see #setMaxRam(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_MaxRam()
	 * @model ordered="false"
	 * @generated
	 */
	int getMaxRam();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMaxRam <em>Max Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Ram</em>' attribute.
	 * @see #getMaxRam()
	 * @generated
	 */
	void setMaxRam(int value);

	/**
	 * Returns the value of the '<em><b>Max Storage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Storage</em>' attribute.
	 * @see #setMaxStorage(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_MaxStorage()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	int getMaxStorage();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMaxStorage <em>Max Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Storage</em>' attribute.
	 * @see #getMaxStorage()
	 * @generated
	 */
	void setMaxStorage(int value);

	/**
	 * Returns the value of the '<em><b>Min Cores</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Cores</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Cores</em>' attribute.
	 * @see #setMinCores(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_MinCores()
	 * @model ordered="false"
	 * @generated
	 */
	int getMinCores();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMinCores <em>Min Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Cores</em>' attribute.
	 * @see #getMinCores()
	 * @generated
	 */
	void setMinCores(int value);

	/**
	 * Returns the value of the '<em><b>Min Ram</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Ram</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Ram</em>' attribute.
	 * @see #setMinRam(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_MinRam()
	 * @model ordered="false"
	 * @generated
	 */
	int getMinRam();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMinRam <em>Min Ram</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Ram</em>' attribute.
	 * @see #getMinRam()
	 * @generated
	 */
	void setMinRam(int value);

	/**
	 * Returns the value of the '<em><b>Min Storage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Storage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Storage</em>' attribute.
	 * @see #setMinStorage(int)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_MinStorage()
	 * @model default="0" ordered="false"
	 * @generated
	 */
	int getMinStorage();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getMinStorage <em>Min Storage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Storage</em>' attribute.
	 * @see #getMinStorage()
	 * @generated
	 */
	void setMinStorage(int value);

	/**
	 * Returns the value of the '<em><b>Os</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Os</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Os</em>' attribute.
	 * @see #setOs(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_Os()
	 * @model ordered="false"
	 * @generated
	 */
	String getOs();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getOs <em>Os</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Os</em>' attribute.
	 * @see #getOs()
	 * @generated
	 */
	void setOs(String value);

	/**
	 * Returns the value of the '<em><b>Security Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Group</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Group</em>' attribute.
	 * @see #setSecurityGroup(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_SecurityGroup()
	 * @model ordered="false"
	 * @generated
	 */
	String getSecurityGroup();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getSecurityGroup <em>Security Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Group</em>' attribute.
	 * @see #getSecurityGroup()
	 * @generated
	 */
	void setSecurityGroup(String value);

	/**
	 * Returns the value of the '<em><b>Private Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Private Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Private Key</em>' attribute.
	 * @see #setPrivateKey(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_PrivateKey()
	 * @model ordered="false"
	 * @generated
	 */
	String getPrivateKey();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getPrivateKey <em>Private Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Private Key</em>' attribute.
	 * @see #getPrivateKey()
	 * @generated
	 */
	void setPrivateKey(String value);

	/**
	 * Returns the value of the '<em><b>Ssh Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssh Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssh Key</em>' attribute.
	 * @see #setSshKey(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_SshKey()
	 * @model ordered="false"
	 * @generated
	 */
	String getSshKey();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getSshKey <em>Ssh Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssh Key</em>' attribute.
	 * @see #getSshKey()
	 * @generated
	 */
	void setSshKey(String value);

	/**
	 * Returns the value of the '<em><b>Public Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Address</em>' attribute.
	 * @see #setPublicAddress(String)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_PublicAddress()
	 * @model ordered="false"
	 * @generated
	 */
	String getPublicAddress();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getPublicAddress <em>Public Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Address</em>' attribute.
	 * @see #getPublicAddress()
	 * @generated
	 */
	void setPublicAddress(String value);

	/**
	 * Returns the value of the '<em><b>Instances</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' attribute.
	 * @see #setInstances(Integer)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_Instances()
	 * @model default="0" required="true" ordered="false"
	 * @generated
	 */
	Integer getInstances();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getInstances <em>Instances</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instances</em>' attribute.
	 * @see #getInstances()
	 * @generated
	 */
	void setInstances(Integer value);

	/**
	 * Returns the value of the '<em><b>Generic Size</b></em>' attribute.
	 * The literals are from the enumeration {@link es.unizar.disco.dice.Basic_Enumeration_Types.VMSize}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Size</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.VMSize
	 * @see #setGenericSize(VMSize)
	 * @see es.unizar.disco.dice.DDSM.DDSMPackage#getDdsmVm_GenericSize()
	 * @model ordered="false"
	 * @generated
	 */
	VMSize getGenericSize();

	/**
	 * Sets the value of the '{@link es.unizar.disco.dice.DDSM.DdsmVm#getGenericSize <em>Generic Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generic Size</em>' attribute.
	 * @see es.unizar.disco.dice.Basic_Enumeration_Types.VMSize
	 * @see #getGenericSize()
	 * @generated
	 */
	void setGenericSize(VMSize value);

} // DdsmVm
