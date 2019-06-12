
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
 * <p>Java class for StudentPersonalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentPersonalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertMessages" type="{http://www.sifassociation.org/datamodel/na/4.x}AlertMessagesType" minOccurs="0"/>
 *         &lt;element name="MedicalAlertMessages" type="{http://www.sifassociation.org/datamodel/na/4.x}MedicalAlertMessagesType" minOccurs="0"/>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType"/>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/datamodel/na/4.x}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="ElectronicIdList" type="{http://www.sifassociation.org/datamodel/na/4.x}ElectronicIdListType" minOccurs="0"/>
 *         &lt;element name="OtherIdList" type="{http://www.sifassociation.org/datamodel/na/4.x}OtherIdListType" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.sifassociation.org/datamodel/na/4.x}NameOfRecordType"/>
 *         &lt;element name="OtherNames" type="{http://www.sifassociation.org/datamodel/na/4.x}OtherNamesType" minOccurs="0"/>
 *         &lt;element name="Demographics" type="{http://www.sifassociation.org/datamodel/na/4.x}DemographicsType" minOccurs="0"/>
 *         &lt;element name="AddressList" type="{http://www.sifassociation.org/datamodel/na/4.x}AddressListType" minOccurs="0"/>
 *         &lt;element name="AddressRefIdList" type="{http://www.sifassociation.org/datamodel/na/4.x}AddressRefIdListType" minOccurs="0"/>
 *         &lt;element name="PhoneNumberList" type="{http://www.sifassociation.org/datamodel/na/4.x}PhoneNumberListType" minOccurs="0"/>
 *         &lt;element name="EmailList" type="{http://www.sifassociation.org/datamodel/na/4.x}EmailListType" minOccurs="0"/>
 *         &lt;element name="ProjectedGraduationYear" type="{http://www.sifassociation.org/datamodel/na/4.x}ProjectedGraduationYearType" minOccurs="0"/>
 *         &lt;element name="OnTimeGraduationYear" type="{http://www.sifassociation.org/datamodel/na/4.x}OnTimeGraduationYearType" minOccurs="0"/>
 *         &lt;element name="GraduationDate" type="{http://www.sifassociation.org/datamodel/na/4.x}GraduationDateType" minOccurs="0"/>
 *         &lt;element name="MostRecent" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentMostRecentContainerType" minOccurs="0"/>
 *         &lt;element name="AcceptableUsePolicy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IDEA" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Migrant" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Title1" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GiftedTalented" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="EconomicDisadvantage" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ELL" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Homeless" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Section504" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="VocationalConcentrator" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Immigrant" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NeglectedDelinquent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FirstUSEnrollment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "StudentPersonalType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "alertMessages",
    "medicalAlertMessages",
    "localId",
    "stateProvinceId",
    "electronicIdList",
    "otherIdList",
    "name",
    "otherNames",
    "demographics",
    "addressList",
    "addressRefIdList",
    "phoneNumberList",
    "emailList",
    "projectedGraduationYear",
    "onTimeGraduationYear",
    "graduationDate",
    "mostRecent",
    "acceptableUsePolicy",
    "idea",
    "migrant",
    "title1",
    "giftedTalented",
    "economicDisadvantage",
    "ell",
    "homeless",
    "section504",
    "vocationalConcentrator",
    "immigrant",
    "neglectedDelinquent",
    "firstUSEnrollment",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentPersonalType {

    @XmlElement(name = "AlertMessages", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AlertMessagesType alertMessages;
    @XmlElement(name = "MedicalAlertMessages", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MedicalAlertMessagesType medicalAlertMessages;
    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElement(name = "StateProvinceId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stateProvinceId;
    @XmlElement(name = "ElectronicIdList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ElectronicIdListType electronicIdList;
    @XmlElement(name = "OtherIdList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OtherIdListType otherIdList;
    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected NameOfRecordType name;
    @XmlElement(name = "OtherNames", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OtherNamesType otherNames;
    @XmlElement(name = "Demographics", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DemographicsType demographics;
    @XmlElement(name = "AddressList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AddressListType addressList;
    @XmlElement(name = "AddressRefIdList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AddressRefIdListType addressRefIdList;
    @XmlElement(name = "PhoneNumberList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PhoneNumberListType phoneNumberList;
    @XmlElement(name = "EmailList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EmailListType emailList;
    @XmlElement(name = "ProjectedGraduationYear", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XMLGregorianCalendar projectedGraduationYear;
    @XmlElement(name = "OnTimeGraduationYear", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XMLGregorianCalendar onTimeGraduationYear;
    @XmlElement(name = "GraduationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String graduationDate;
    @XmlElement(name = "MostRecent", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentMostRecentContainerType mostRecent;
    @XmlElement(name = "AcceptableUsePolicy", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.AcceptableUsePolicy acceptableUsePolicy;
    @XmlElement(name = "IDEA", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.IDEA idea;
    @XmlElement(name = "Migrant", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.Migrant migrant;
    @XmlElement(name = "Title1", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.Title1 title1;
    @XmlElement(name = "GiftedTalented", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.GiftedTalented giftedTalented;
    @XmlElement(name = "EconomicDisadvantage", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.EconomicDisadvantage economicDisadvantage;
    @XmlElement(name = "ELL", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.ELL ell;
    @XmlElement(name = "Homeless", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.Homeless homeless;
    @XmlElement(name = "Section504", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.Section504 section504;
    @XmlElement(name = "VocationalConcentrator", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.VocationalConcentrator vocationalConcentrator;
    @XmlElement(name = "Immigrant", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.Immigrant immigrant;
    @XmlElement(name = "NeglectedDelinquent", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalType.NeglectedDelinquent neglectedDelinquent;
    @XmlElement(name = "FirstUSEnrollment", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstUSEnrollment;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the alertMessages property.
     * 
     * @return
     *     possible object is
     *     {@link AlertMessagesType }
     *     
     */
    public AlertMessagesType getAlertMessages() {
        return alertMessages;
    }

    /**
     * Sets the value of the alertMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertMessagesType }
     *     
     */
    public void setAlertMessages(AlertMessagesType value) {
        this.alertMessages = value;
    }

    /**
     * Gets the value of the medicalAlertMessages property.
     * 
     * @return
     *     possible object is
     *     {@link MedicalAlertMessagesType }
     *     
     */
    public MedicalAlertMessagesType getMedicalAlertMessages() {
        return medicalAlertMessages;
    }

    /**
     * Sets the value of the medicalAlertMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MedicalAlertMessagesType }
     *     
     */
    public void setMedicalAlertMessages(MedicalAlertMessagesType value) {
        this.medicalAlertMessages = value;
    }

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
     * Gets the value of the electronicIdList property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicIdListType }
     *     
     */
    public ElectronicIdListType getElectronicIdList() {
        return electronicIdList;
    }

    /**
     * Sets the value of the electronicIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicIdListType }
     *     
     */
    public void setElectronicIdList(ElectronicIdListType value) {
        this.electronicIdList = value;
    }

    /**
     * Gets the value of the otherIdList property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIdListType }
     *     
     */
    public OtherIdListType getOtherIdList() {
        return otherIdList;
    }

    /**
     * Sets the value of the otherIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIdListType }
     *     
     */
    public void setOtherIdList(OtherIdListType value) {
        this.otherIdList = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameOfRecordType }
     *     
     */
    public NameOfRecordType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameOfRecordType }
     *     
     */
    public void setName(NameOfRecordType value) {
        this.name = value;
    }

    /**
     * Gets the value of the otherNames property.
     * 
     * @return
     *     possible object is
     *     {@link OtherNamesType }
     *     
     */
    public OtherNamesType getOtherNames() {
        return otherNames;
    }

    /**
     * Sets the value of the otherNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNamesType }
     *     
     */
    public void setOtherNames(OtherNamesType value) {
        this.otherNames = value;
    }

    /**
     * Gets the value of the demographics property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsType }
     *     
     */
    public DemographicsType getDemographics() {
        return demographics;
    }

    /**
     * Sets the value of the demographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsType }
     *     
     */
    public void setDemographics(DemographicsType value) {
        this.demographics = value;
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
     * Gets the value of the emailList property.
     * 
     * @return
     *     possible object is
     *     {@link EmailListType }
     *     
     */
    public EmailListType getEmailList() {
        return emailList;
    }

    /**
     * Sets the value of the emailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailListType }
     *     
     */
    public void setEmailList(EmailListType value) {
        this.emailList = value;
    }

    /**
     * Gets the value of the projectedGraduationYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedGraduationYear() {
        return projectedGraduationYear;
    }

    /**
     * Sets the value of the projectedGraduationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedGraduationYear(XMLGregorianCalendar value) {
        this.projectedGraduationYear = value;
    }

    /**
     * Gets the value of the onTimeGraduationYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOnTimeGraduationYear() {
        return onTimeGraduationYear;
    }

    /**
     * Sets the value of the onTimeGraduationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOnTimeGraduationYear(XMLGregorianCalendar value) {
        this.onTimeGraduationYear = value;
    }

    /**
     * Gets the value of the graduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduationDate() {
        return graduationDate;
    }

    /**
     * Sets the value of the graduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduationDate(String value) {
        this.graduationDate = value;
    }

    /**
     * Gets the value of the mostRecent property.
     * 
     * @return
     *     possible object is
     *     {@link StudentMostRecentContainerType }
     *     
     */
    public StudentMostRecentContainerType getMostRecent() {
        return mostRecent;
    }

    /**
     * Sets the value of the mostRecent property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentMostRecentContainerType }
     *     
     */
    public void setMostRecent(StudentMostRecentContainerType value) {
        this.mostRecent = value;
    }

    /**
     * Gets the value of the acceptableUsePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.AcceptableUsePolicy }
     *     
     */
    public StudentPersonalType.AcceptableUsePolicy getAcceptableUsePolicy() {
        return acceptableUsePolicy;
    }

    /**
     * Sets the value of the acceptableUsePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.AcceptableUsePolicy }
     *     
     */
    public void setAcceptableUsePolicy(StudentPersonalType.AcceptableUsePolicy value) {
        this.acceptableUsePolicy = value;
    }

    /**
     * Gets the value of the idea property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.IDEA }
     *     
     */
    public StudentPersonalType.IDEA getIDEA() {
        return idea;
    }

    /**
     * Sets the value of the idea property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.IDEA }
     *     
     */
    public void setIDEA(StudentPersonalType.IDEA value) {
        this.idea = value;
    }

    /**
     * Gets the value of the migrant property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.Migrant }
     *     
     */
    public StudentPersonalType.Migrant getMigrant() {
        return migrant;
    }

    /**
     * Sets the value of the migrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.Migrant }
     *     
     */
    public void setMigrant(StudentPersonalType.Migrant value) {
        this.migrant = value;
    }

    /**
     * Gets the value of the title1 property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.Title1 }
     *     
     */
    public StudentPersonalType.Title1 getTitle1() {
        return title1;
    }

    /**
     * Sets the value of the title1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.Title1 }
     *     
     */
    public void setTitle1(StudentPersonalType.Title1 value) {
        this.title1 = value;
    }

    /**
     * Gets the value of the giftedTalented property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.GiftedTalented }
     *     
     */
    public StudentPersonalType.GiftedTalented getGiftedTalented() {
        return giftedTalented;
    }

    /**
     * Sets the value of the giftedTalented property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.GiftedTalented }
     *     
     */
    public void setGiftedTalented(StudentPersonalType.GiftedTalented value) {
        this.giftedTalented = value;
    }

    /**
     * Gets the value of the economicDisadvantage property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.EconomicDisadvantage }
     *     
     */
    public StudentPersonalType.EconomicDisadvantage getEconomicDisadvantage() {
        return economicDisadvantage;
    }

    /**
     * Sets the value of the economicDisadvantage property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.EconomicDisadvantage }
     *     
     */
    public void setEconomicDisadvantage(StudentPersonalType.EconomicDisadvantage value) {
        this.economicDisadvantage = value;
    }

    /**
     * Gets the value of the ell property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.ELL }
     *     
     */
    public StudentPersonalType.ELL getELL() {
        return ell;
    }

    /**
     * Sets the value of the ell property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.ELL }
     *     
     */
    public void setELL(StudentPersonalType.ELL value) {
        this.ell = value;
    }

    /**
     * Gets the value of the homeless property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.Homeless }
     *     
     */
    public StudentPersonalType.Homeless getHomeless() {
        return homeless;
    }

    /**
     * Sets the value of the homeless property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.Homeless }
     *     
     */
    public void setHomeless(StudentPersonalType.Homeless value) {
        this.homeless = value;
    }

    /**
     * Gets the value of the section504 property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.Section504 }
     *     
     */
    public StudentPersonalType.Section504 getSection504() {
        return section504;
    }

    /**
     * Sets the value of the section504 property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.Section504 }
     *     
     */
    public void setSection504(StudentPersonalType.Section504 value) {
        this.section504 = value;
    }

    /**
     * Gets the value of the vocationalConcentrator property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.VocationalConcentrator }
     *     
     */
    public StudentPersonalType.VocationalConcentrator getVocationalConcentrator() {
        return vocationalConcentrator;
    }

    /**
     * Sets the value of the vocationalConcentrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.VocationalConcentrator }
     *     
     */
    public void setVocationalConcentrator(StudentPersonalType.VocationalConcentrator value) {
        this.vocationalConcentrator = value;
    }

    /**
     * Gets the value of the immigrant property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.Immigrant }
     *     
     */
    public StudentPersonalType.Immigrant getImmigrant() {
        return immigrant;
    }

    /**
     * Sets the value of the immigrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.Immigrant }
     *     
     */
    public void setImmigrant(StudentPersonalType.Immigrant value) {
        this.immigrant = value;
    }

    /**
     * Gets the value of the neglectedDelinquent property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalType.NeglectedDelinquent }
     *     
     */
    public StudentPersonalType.NeglectedDelinquent getNeglectedDelinquent() {
        return neglectedDelinquent;
    }

    /**
     * Sets the value of the neglectedDelinquent property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalType.NeglectedDelinquent }
     *     
     */
    public void setNeglectedDelinquent(StudentPersonalType.NeglectedDelinquent value) {
        this.neglectedDelinquent = value;
    }

    /**
     * Gets the value of the firstUSEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstUSEnrollment() {
        return firstUSEnrollment;
    }

    /**
     * Sets the value of the firstUSEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstUSEnrollment(XMLGregorianCalendar value) {
        this.firstUSEnrollment = value;
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
    public static class AcceptableUsePolicy {

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
    public static class ELL {

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
    public static class EconomicDisadvantage {

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
    public static class GiftedTalented {

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
    public static class Homeless {

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
    public static class IDEA {

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
    public static class Immigrant {

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
    public static class Migrant {

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
    public static class NeglectedDelinquent {

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
    public static class Section504 {

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
    public static class Title1 {

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
    public static class VocationalConcentrator {

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
