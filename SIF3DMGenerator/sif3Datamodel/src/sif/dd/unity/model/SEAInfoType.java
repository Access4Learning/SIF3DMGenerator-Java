
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SEAInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEAInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType" minOccurs="0"/>
 *         &lt;element name="NCESId" type="{http://www.sifassociation.org/datamodel/na/4.x}NCESIdType" minOccurs="0"/>
 *         &lt;element name="SEAName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="SEAURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="CSSOContact" type="{http://www.sifassociation.org/datamodel/na/4.x}ContactInfoType"/>
 *         &lt;element name="SEAContactList" type="{http://www.sifassociation.org/datamodel/na/4.x}SEAContactListType" minOccurs="0"/>
 *         &lt;element name="PhoneNumberList" type="{http://www.sifassociation.org/datamodel/na/4.x}PhoneNumberListType" minOccurs="0"/>
 *         &lt;element name="AddressList" type="{http://www.sifassociation.org/datamodel/na/4.x}AddressListType" minOccurs="0"/>
 *         &lt;element name="OperationalStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}OperationalStatusType" minOccurs="0"/>
 *         &lt;element name="EDENInfo" type="{http://www.sifassociation.org/datamodel/na/4.x}EDENInfoType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEAInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "localId",
    "ncesId",
    "seaName",
    "seaurl",
    "cssoContact",
    "seaContactList",
    "phoneNumberList",
    "addressList",
    "operationalStatus",
    "edenInfo",
    "sifMetadata",
    "sifExtendedElements"
})
public class SEAInfoType {

    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElement(name = "NCESId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ncesId;
    @XmlElement(name = "SEAName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String seaName;
    @XmlElement(name = "SEAURL", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String seaurl;
    @XmlElement(name = "CSSOContact", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected ContactInfoType cssoContact;
    @XmlElement(name = "SEAContactList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SEAContactListType seaContactList;
    @XmlElement(name = "PhoneNumberList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PhoneNumberListType phoneNumberList;
    @XmlElement(name = "AddressList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AddressListType addressList;
    @XmlElement(name = "OperationalStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OperationalStatusType operationalStatus;
    @XmlElement(name = "EDENInfo", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EDENInfoType edenInfo;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the ncesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCESId() {
        return ncesId;
    }

    /**
     * Sets the value of the ncesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCESId(String value) {
        this.ncesId = value;
    }

    /**
     * Gets the value of the seaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEAName() {
        return seaName;
    }

    /**
     * Sets the value of the seaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEAName(String value) {
        this.seaName = value;
    }

    /**
     * Gets the value of the seaurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEAURL() {
        return seaurl;
    }

    /**
     * Sets the value of the seaurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEAURL(String value) {
        this.seaurl = value;
    }

    /**
     * Gets the value of the cssoContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getCSSOContact() {
        return cssoContact;
    }

    /**
     * Sets the value of the cssoContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setCSSOContact(ContactInfoType value) {
        this.cssoContact = value;
    }

    /**
     * Gets the value of the seaContactList property.
     * 
     * @return
     *     possible object is
     *     {@link SEAContactListType }
     *     
     */
    public SEAContactListType getSEAContactList() {
        return seaContactList;
    }

    /**
     * Sets the value of the seaContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SEAContactListType }
     *     
     */
    public void setSEAContactList(SEAContactListType value) {
        this.seaContactList = value;
    }

    /**
     * Gets the value of the phoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberListType }
     *     
     */
    public PhoneNumberListType getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Sets the value of the phoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberListType }
     *     
     */
    public void setPhoneNumberList(PhoneNumberListType value) {
        this.phoneNumberList = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link AddressListType }
     *     
     */
    public AddressListType getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressListType }
     *     
     */
    public void setAddressList(AddressListType value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the operationalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OperationalStatusType }
     *     
     */
    public OperationalStatusType getOperationalStatus() {
        return operationalStatus;
    }

    /**
     * Sets the value of the operationalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationalStatusType }
     *     
     */
    public void setOperationalStatus(OperationalStatusType value) {
        this.operationalStatus = value;
    }

    /**
     * Gets the value of the edenInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EDENInfoType }
     *     
     */
    public EDENInfoType getEDENInfo() {
        return edenInfo;
    }

    /**
     * Sets the value of the edenInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDENInfoType }
     *     
     */
    public void setEDENInfo(EDENInfoType value) {
        this.edenInfo = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SIFMetadataType }
     *     
     */
    public SIFMetadataType getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFMetadataType }
     *     
     */
    public void setSIFMetadata(SIFMetadataType value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
        this.sifExtendedElements = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
