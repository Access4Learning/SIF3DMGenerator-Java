
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
 * <p>Java class for LEAInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LEAInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType"/>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/datamodel/na/4.x}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="NCESId" type="{http://www.sifassociation.org/datamodel/na/4.x}NCESIdType" minOccurs="0"/>
 *         &lt;element name="LEAName" type="{http://www.sifassociation.org/datamodel/na/4.x}LEANameType"/>
 *         &lt;element name="LEAURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="EducationAgencyType" type="{http://www.sifassociation.org/datamodel/na/4.x}EducationAgencyTypeType" minOccurs="0"/>
 *         &lt;element name="LEAContactList" type="{http://www.sifassociation.org/datamodel/na/4.x}LEAContactListType" minOccurs="0"/>
 *         &lt;element name="PhoneNumberList" type="{http://www.sifassociation.org/datamodel/na/4.x}PhoneNumberListType" minOccurs="0"/>
 *         &lt;element name="AddressList" type="{http://www.sifassociation.org/datamodel/na/4.x}AddressListType" minOccurs="0"/>
 *         &lt;element name="AddressRefIdList" type="{http://www.sifassociation.org/datamodel/na/4.x}AddressRefIdListType" minOccurs="0"/>
 *         &lt;element name="IdentificationInfoList" type="{http://www.sifassociation.org/datamodel/na/4.x}IdentificationInfoListType" minOccurs="0"/>
 *         &lt;element name="GradeLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelsType" minOccurs="0"/>
 *         &lt;element name="OperationalStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}OperationalStatusType" minOccurs="0"/>
 *         &lt;element name="CongressionalDistrict" type="{http://www.sifassociation.org/datamodel/na/4.x}CongressionalDistrictType" minOccurs="0"/>
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
@XmlType(name = "LEAInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "localId",
    "stateProvinceId",
    "ncesId",
    "leaName",
    "leaurl",
    "educationAgencyType",
    "leaContactList",
    "phoneNumberList",
    "addressList",
    "addressRefIdList",
    "identificationInfoList",
    "gradeLevels",
    "operationalStatus",
    "congressionalDistrict",
    "sifMetadata",
    "sifExtendedElements"
})
public class LEAInfoType {

    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElement(name = "StateProvinceId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stateProvinceId;
    @XmlElement(name = "NCESId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ncesId;
    @XmlElement(name = "LEAName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String leaName;
    @XmlElement(name = "LEAURL", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String leaurl;
    @XmlElement(name = "EducationAgencyType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EducationAgencyTypeType educationAgencyType;
    @XmlElement(name = "LEAContactList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LEAContactListType leaContactList;
    @XmlElement(name = "PhoneNumberList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PhoneNumberListType phoneNumberList;
    @XmlElement(name = "AddressList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AddressListType addressList;
    @XmlElement(name = "AddressRefIdList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AddressRefIdListType addressRefIdList;
    @XmlElement(name = "IdentificationInfoList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IdentificationInfoListType identificationInfoList;
    @XmlElement(name = "GradeLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelsType gradeLevels;
    @XmlElement(name = "OperationalStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OperationalStatusType operationalStatus;
    @XmlElement(name = "CongressionalDistrict", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String congressionalDistrict;
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
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceId(String value) {
        this.stateProvinceId = value;
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
     * Gets the value of the leaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEAName() {
        return leaName;
    }

    /**
     * Sets the value of the leaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEAName(String value) {
        this.leaName = value;
    }

    /**
     * Gets the value of the leaurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEAURL() {
        return leaurl;
    }

    /**
     * Sets the value of the leaurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEAURL(String value) {
        this.leaurl = value;
    }

    /**
     * Gets the value of the educationAgencyType property.
     * 
     * @return
     *     possible object is
     *     {@link EducationAgencyTypeType }
     *     
     */
    public EducationAgencyTypeType getEducationAgencyType() {
        return educationAgencyType;
    }

    /**
     * Sets the value of the educationAgencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EducationAgencyTypeType }
     *     
     */
    public void setEducationAgencyType(EducationAgencyTypeType value) {
        this.educationAgencyType = value;
    }

    /**
     * Gets the value of the leaContactList property.
     * 
     * @return
     *     possible object is
     *     {@link LEAContactListType }
     *     
     */
    public LEAContactListType getLEAContactList() {
        return leaContactList;
    }

    /**
     * Sets the value of the leaContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEAContactListType }
     *     
     */
    public void setLEAContactList(LEAContactListType value) {
        this.leaContactList = value;
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
     * Gets the value of the addressRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AddressRefIdListType }
     *     
     */
    public AddressRefIdListType getAddressRefIdList() {
        return addressRefIdList;
    }

    /**
     * Sets the value of the addressRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressRefIdListType }
     *     
     */
    public void setAddressRefIdList(AddressRefIdListType value) {
        this.addressRefIdList = value;
    }

    /**
     * Gets the value of the identificationInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInfoListType }
     *     
     */
    public IdentificationInfoListType getIdentificationInfoList() {
        return identificationInfoList;
    }

    /**
     * Sets the value of the identificationInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInfoListType }
     *     
     */
    public void setIdentificationInfoList(IdentificationInfoListType value) {
        this.identificationInfoList = value;
    }

    /**
     * Gets the value of the gradeLevels property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelsType }
     *     
     */
    public GradeLevelsType getGradeLevels() {
        return gradeLevels;
    }

    /**
     * Sets the value of the gradeLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelsType }
     *     
     */
    public void setGradeLevels(GradeLevelsType value) {
        this.gradeLevels = value;
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
     * Gets the value of the congressionalDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCongressionalDistrict() {
        return congressionalDistrict;
    }

    /**
     * Sets the value of the congressionalDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCongressionalDistrict(String value) {
        this.congressionalDistrict = value;
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
