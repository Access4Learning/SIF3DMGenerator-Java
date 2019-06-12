
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SchoolInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/datamodel/na/4.x}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="NCESId" type="{http://www.sifassociation.org/datamodel/na/4.x}NCESIdType" minOccurs="0"/>
 *         &lt;element name="SchoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="LEAInfoRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="OtherLEA" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="LEAInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SchoolType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SchoolFocusList" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolFocusListType" minOccurs="0"/>
 *         &lt;element name="SchoolURL" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolURLType" minOccurs="0"/>
 *         &lt;element name="PrincipalInfo" type="{http://www.sifassociation.org/datamodel/na/4.x}PrincipalInfoType" minOccurs="0"/>
 *         &lt;element name="SchoolContactList" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolContactListType" minOccurs="0"/>
 *         &lt;element name="AddressList" type="{http://www.sifassociation.org/datamodel/na/4.x}AddressListType" minOccurs="0"/>
 *         &lt;element name="AddressRefIdList" type="{http://www.sifassociation.org/datamodel/na/4.x}AddressRefIdListType" minOccurs="0"/>
 *         &lt;element name="PhoneNumberList" type="{http://www.sifassociation.org/datamodel/na/4.x}PhoneNumberListType" minOccurs="0"/>
 *         &lt;element name="IdentificationInfoList" type="{http://www.sifassociation.org/datamodel/na/4.x}IdentificationInfoListType" minOccurs="0"/>
 *         &lt;element name="SessionType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GradeLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelsType" minOccurs="0"/>
 *         &lt;element name="Title1Status" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OperationalStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}OperationalStatusType" minOccurs="0"/>
 *         &lt;element name="CongressionalDistrict" type="{http://www.sifassociation.org/datamodel/na/4.x}CongressionalDistrictType" minOccurs="0"/>
 *         &lt;element name="ActiveSchoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
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
@XmlType(name = "SchoolInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "localId",
    "stateProvinceId",
    "ncesId",
    "schoolName",
    "leaInfoRefId",
    "otherLEA",
    "schoolType",
    "schoolFocusList",
    "schoolURL",
    "principalInfo",
    "schoolContactList",
    "addressList",
    "addressRefIdList",
    "phoneNumberList",
    "identificationInfoList",
    "sessionType",
    "gradeLevels",
    "title1Status",
    "operationalStatus",
    "congressionalDistrict",
    "activeSchoolYear",
    "sifMetadata",
    "sifExtendedElements"
})
public class SchoolInfoType {

    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElement(name = "StateProvinceId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stateProvinceId;
    @XmlElement(name = "NCESId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ncesId;
    @XmlElement(name = "SchoolName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schoolName;
    @XmlElement(name = "LEAInfoRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaInfoRefId;
    @XmlElement(name = "OtherLEA", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolInfoType.OtherLEA otherLEA;
    @XmlElement(name = "SchoolType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolInfoType.SchoolType schoolType;
    @XmlElement(name = "SchoolFocusList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolFocusListType schoolFocusList;
    @XmlElement(name = "SchoolURL", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String schoolURL;
    @XmlElement(name = "PrincipalInfo", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PrincipalInfoType principalInfo;
    @XmlElement(name = "SchoolContactList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolContactListType schoolContactList;
    @XmlElement(name = "AddressList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AddressListType addressList;
    @XmlElement(name = "AddressRefIdList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AddressRefIdListType addressRefIdList;
    @XmlElement(name = "PhoneNumberList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PhoneNumberListType phoneNumberList;
    @XmlElement(name = "IdentificationInfoList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IdentificationInfoListType identificationInfoList;
    @XmlElement(name = "SessionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolInfoType.SessionType sessionType;
    @XmlElement(name = "GradeLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelsType gradeLevels;
    @XmlElement(name = "Title1Status", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolInfoType.Title1Status title1Status;
    @XmlElement(name = "OperationalStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OperationalStatusType operationalStatus;
    @XmlElement(name = "CongressionalDistrict", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String congressionalDistrict;
    @XmlElement(name = "ActiveSchoolYear", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar activeSchoolYear;
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
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the leaInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEAInfoRefId() {
        return leaInfoRefId;
    }

    /**
     * Sets the value of the leaInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEAInfoRefId(String value) {
        this.leaInfoRefId = value;
    }

    /**
     * Gets the value of the otherLEA property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolInfoType.OtherLEA }
     *     
     */
    public SchoolInfoType.OtherLEA getOtherLEA() {
        return otherLEA;
    }

    /**
     * Sets the value of the otherLEA property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolInfoType.OtherLEA }
     *     
     */
    public void setOtherLEA(SchoolInfoType.OtherLEA value) {
        this.otherLEA = value;
    }

    /**
     * Gets the value of the schoolType property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolInfoType.SchoolType }
     *     
     */
    public SchoolInfoType.SchoolType getSchoolType() {
        return schoolType;
    }

    /**
     * Sets the value of the schoolType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolInfoType.SchoolType }
     *     
     */
    public void setSchoolType(SchoolInfoType.SchoolType value) {
        this.schoolType = value;
    }

    /**
     * Gets the value of the schoolFocusList property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolFocusListType }
     *     
     */
    public SchoolFocusListType getSchoolFocusList() {
        return schoolFocusList;
    }

    /**
     * Sets the value of the schoolFocusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolFocusListType }
     *     
     */
    public void setSchoolFocusList(SchoolFocusListType value) {
        this.schoolFocusList = value;
    }

    /**
     * Gets the value of the schoolURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolURL() {
        return schoolURL;
    }

    /**
     * Sets the value of the schoolURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolURL(String value) {
        this.schoolURL = value;
    }

    /**
     * Gets the value of the principalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PrincipalInfoType }
     *     
     */
    public PrincipalInfoType getPrincipalInfo() {
        return principalInfo;
    }

    /**
     * Sets the value of the principalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrincipalInfoType }
     *     
     */
    public void setPrincipalInfo(PrincipalInfoType value) {
        this.principalInfo = value;
    }

    /**
     * Gets the value of the schoolContactList property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolContactListType }
     *     
     */
    public SchoolContactListType getSchoolContactList() {
        return schoolContactList;
    }

    /**
     * Sets the value of the schoolContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolContactListType }
     *     
     */
    public void setSchoolContactList(SchoolContactListType value) {
        this.schoolContactList = value;
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
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolInfoType.SessionType }
     *     
     */
    public SchoolInfoType.SessionType getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolInfoType.SessionType }
     *     
     */
    public void setSessionType(SchoolInfoType.SessionType value) {
        this.sessionType = value;
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
     * Gets the value of the title1Status property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolInfoType.Title1Status }
     *     
     */
    public SchoolInfoType.Title1Status getTitle1Status() {
        return title1Status;
    }

    /**
     * Sets the value of the title1Status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolInfoType.Title1Status }
     *     
     */
    public void setTitle1Status(SchoolInfoType.Title1Status value) {
        this.title1Status = value;
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
     * Gets the value of the activeSchoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActiveSchoolYear() {
        return activeSchoolYear;
    }

    /**
     * Sets the value of the activeSchoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActiveSchoolYear(XMLGregorianCalendar value) {
        this.activeSchoolYear = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="LEAInfo"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class OtherLEA {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the sifRefObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIFRefObject() {
            return sifRefObject;
        }

        /**
         * Sets the value of the sifRefObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIFRefObject(String value) {
            this.sifRefObject = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SchoolType {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class SessionType {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Title1Status {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }

}
