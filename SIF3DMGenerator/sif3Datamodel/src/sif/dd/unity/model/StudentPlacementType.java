
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
 * <p>Java class for StudentPlacementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentPlacementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPlacementAsOfDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Service" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentPlacementServiceType"/>
 *         &lt;element name="ServiceCategory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ServiceFundingSources" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentPlacementServiceFundingSourceListType" minOccurs="0"/>
 *         &lt;element name="ServicingPublicAgency" minOccurs="0">
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
 *         &lt;element name="ServicingSchool" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="SchoolInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SchoolWhereServiceDelivered" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="SchoolInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ServiceProviderType" type="{http://www.sifassociation.org/datamodel/na/4.x}ServiceProviderTypeType" minOccurs="0"/>
 *         &lt;element name="AgencyType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ServiceProviderName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ServiceSetting" type="{http://www.sifassociation.org/datamodel/na/4.x}ServiceSettingType" minOccurs="0"/>
 *         &lt;element name="WhenServiceProvided" type="{http://www.sifassociation.org/datamodel/na/4.x}WhenServiceProvidedType" minOccurs="0"/>
 *         &lt;element name="LatestStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FrequencyTime" type="{http://www.sifassociation.org/datamodel/na/4.x}FrequencyTimeType" minOccurs="0"/>
 *         &lt;element name="DirectTime" type="{http://www.sifassociation.org/datamodel/na/4.x}SessionDurationType" minOccurs="0"/>
 *         &lt;element name="IndirectTime" type="{http://www.sifassociation.org/datamodel/na/4.x}SessionDurationType" minOccurs="0"/>
 *         &lt;element name="TotalServiceDuration" type="{http://www.sifassociation.org/datamodel/na/4.x}SessionDurationType" minOccurs="0"/>
 *         &lt;element name="IncludedInSpecialEducationFTE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SpecialNeedsTransportation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AssistiveTechnology" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EntryPerson" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="StudentParticipationRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="StudentPersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentPlacementType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentPlacementAsOfDate",
    "service",
    "serviceCategory",
    "serviceFundingSources",
    "servicingPublicAgency",
    "servicingSchool",
    "schoolWhereServiceDelivered",
    "serviceProviderType",
    "agencyType",
    "serviceProviderName",
    "serviceSetting",
    "whenServiceProvided",
    "latestStartDate",
    "startDate",
    "endDate",
    "frequencyTime",
    "directTime",
    "indirectTime",
    "totalServiceDuration",
    "includedInSpecialEducationFTE",
    "specialNeedsTransportation",
    "assistiveTechnology",
    "entryPerson",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentPlacementType {

    @XmlElement(name = "StudentPlacementAsOfDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar studentPlacementAsOfDate;
    @XmlElement(name = "Service", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StudentPlacementServiceType service;
    @XmlElement(name = "ServiceCategory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPlacementType.ServiceCategory serviceCategory;
    @XmlElement(name = "ServiceFundingSources", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPlacementServiceFundingSourceListType serviceFundingSources;
    @XmlElement(name = "ServicingPublicAgency", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPlacementType.ServicingPublicAgency servicingPublicAgency;
    @XmlElement(name = "ServicingSchool", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPlacementType.ServicingSchool servicingSchool;
    @XmlElement(name = "SchoolWhereServiceDelivered", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPlacementType.SchoolWhereServiceDelivered schoolWhereServiceDelivered;
    @XmlElement(name = "ServiceProviderType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ServiceProviderTypeType serviceProviderType;
    @XmlElement(name = "AgencyType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String agencyType;
    @XmlElement(name = "ServiceProviderName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String serviceProviderName;
    @XmlElement(name = "ServiceSetting", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ServiceSettingType serviceSetting;
    @XmlElement(name = "WhenServiceProvided", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected WhenServiceProvidedType whenServiceProvided;
    @XmlElement(name = "LatestStartDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar latestStartDate;
    @XmlElement(name = "StartDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "FrequencyTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected FrequencyTimeType frequencyTime;
    @XmlElement(name = "DirectTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SessionDurationType directTime;
    @XmlElement(name = "IndirectTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SessionDurationType indirectTime;
    @XmlElement(name = "TotalServiceDuration", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SessionDurationType totalServiceDuration;
    @XmlElement(name = "IncludedInSpecialEducationFTE", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean includedInSpecialEducationFTE;
    @XmlElement(name = "SpecialNeedsTransportation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean specialNeedsTransportation;
    @XmlElement(name = "AssistiveTechnology", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean assistiveTechnology;
    @XmlElement(name = "EntryPerson", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String entryPerson;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "StudentParticipationRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentParticipationRefId;
    @XmlAttribute(name = "StudentPersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;

    /**
     * Gets the value of the studentPlacementAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudentPlacementAsOfDate() {
        return studentPlacementAsOfDate;
    }

    /**
     * Sets the value of the studentPlacementAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudentPlacementAsOfDate(XMLGregorianCalendar value) {
        this.studentPlacementAsOfDate = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPlacementServiceType }
     *     
     */
    public StudentPlacementServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPlacementServiceType }
     *     
     */
    public void setService(StudentPlacementServiceType value) {
        this.service = value;
    }

    /**
     * Gets the value of the serviceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPlacementType.ServiceCategory }
     *     
     */
    public StudentPlacementType.ServiceCategory getServiceCategory() {
        return serviceCategory;
    }

    /**
     * Sets the value of the serviceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPlacementType.ServiceCategory }
     *     
     */
    public void setServiceCategory(StudentPlacementType.ServiceCategory value) {
        this.serviceCategory = value;
    }

    /**
     * Gets the value of the serviceFundingSources property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPlacementServiceFundingSourceListType }
     *     
     */
    public StudentPlacementServiceFundingSourceListType getServiceFundingSources() {
        return serviceFundingSources;
    }

    /**
     * Sets the value of the serviceFundingSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPlacementServiceFundingSourceListType }
     *     
     */
    public void setServiceFundingSources(StudentPlacementServiceFundingSourceListType value) {
        this.serviceFundingSources = value;
    }

    /**
     * Gets the value of the servicingPublicAgency property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPlacementType.ServicingPublicAgency }
     *     
     */
    public StudentPlacementType.ServicingPublicAgency getServicingPublicAgency() {
        return servicingPublicAgency;
    }

    /**
     * Sets the value of the servicingPublicAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPlacementType.ServicingPublicAgency }
     *     
     */
    public void setServicingPublicAgency(StudentPlacementType.ServicingPublicAgency value) {
        this.servicingPublicAgency = value;
    }

    /**
     * Gets the value of the servicingSchool property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPlacementType.ServicingSchool }
     *     
     */
    public StudentPlacementType.ServicingSchool getServicingSchool() {
        return servicingSchool;
    }

    /**
     * Sets the value of the servicingSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPlacementType.ServicingSchool }
     *     
     */
    public void setServicingSchool(StudentPlacementType.ServicingSchool value) {
        this.servicingSchool = value;
    }

    /**
     * Gets the value of the schoolWhereServiceDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPlacementType.SchoolWhereServiceDelivered }
     *     
     */
    public StudentPlacementType.SchoolWhereServiceDelivered getSchoolWhereServiceDelivered() {
        return schoolWhereServiceDelivered;
    }

    /**
     * Sets the value of the schoolWhereServiceDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPlacementType.SchoolWhereServiceDelivered }
     *     
     */
    public void setSchoolWhereServiceDelivered(StudentPlacementType.SchoolWhereServiceDelivered value) {
        this.schoolWhereServiceDelivered = value;
    }

    /**
     * Gets the value of the serviceProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceProviderTypeType }
     *     
     */
    public ServiceProviderTypeType getServiceProviderType() {
        return serviceProviderType;
    }

    /**
     * Sets the value of the serviceProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceProviderTypeType }
     *     
     */
    public void setServiceProviderType(ServiceProviderTypeType value) {
        this.serviceProviderType = value;
    }

    /**
     * Gets the value of the agencyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyType() {
        return agencyType;
    }

    /**
     * Sets the value of the agencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyType(String value) {
        this.agencyType = value;
    }

    /**
     * Gets the value of the serviceProviderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProviderName() {
        return serviceProviderName;
    }

    /**
     * Sets the value of the serviceProviderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProviderName(String value) {
        this.serviceProviderName = value;
    }

    /**
     * Gets the value of the serviceSetting property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceSettingType }
     *     
     */
    public ServiceSettingType getServiceSetting() {
        return serviceSetting;
    }

    /**
     * Sets the value of the serviceSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceSettingType }
     *     
     */
    public void setServiceSetting(ServiceSettingType value) {
        this.serviceSetting = value;
    }

    /**
     * Gets the value of the whenServiceProvided property.
     * 
     * @return
     *     possible object is
     *     {@link WhenServiceProvidedType }
     *     
     */
    public WhenServiceProvidedType getWhenServiceProvided() {
        return whenServiceProvided;
    }

    /**
     * Sets the value of the whenServiceProvided property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhenServiceProvidedType }
     *     
     */
    public void setWhenServiceProvided(WhenServiceProvidedType value) {
        this.whenServiceProvided = value;
    }

    /**
     * Gets the value of the latestStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestStartDate() {
        return latestStartDate;
    }

    /**
     * Sets the value of the latestStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestStartDate(XMLGregorianCalendar value) {
        this.latestStartDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the frequencyTime property.
     * 
     * @return
     *     possible object is
     *     {@link FrequencyTimeType }
     *     
     */
    public FrequencyTimeType getFrequencyTime() {
        return frequencyTime;
    }

    /**
     * Sets the value of the frequencyTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrequencyTimeType }
     *     
     */
    public void setFrequencyTime(FrequencyTimeType value) {
        this.frequencyTime = value;
    }

    /**
     * Gets the value of the directTime property.
     * 
     * @return
     *     possible object is
     *     {@link SessionDurationType }
     *     
     */
    public SessionDurationType getDirectTime() {
        return directTime;
    }

    /**
     * Sets the value of the directTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionDurationType }
     *     
     */
    public void setDirectTime(SessionDurationType value) {
        this.directTime = value;
    }

    /**
     * Gets the value of the indirectTime property.
     * 
     * @return
     *     possible object is
     *     {@link SessionDurationType }
     *     
     */
    public SessionDurationType getIndirectTime() {
        return indirectTime;
    }

    /**
     * Sets the value of the indirectTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionDurationType }
     *     
     */
    public void setIndirectTime(SessionDurationType value) {
        this.indirectTime = value;
    }

    /**
     * Gets the value of the totalServiceDuration property.
     * 
     * @return
     *     possible object is
     *     {@link SessionDurationType }
     *     
     */
    public SessionDurationType getTotalServiceDuration() {
        return totalServiceDuration;
    }

    /**
     * Sets the value of the totalServiceDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionDurationType }
     *     
     */
    public void setTotalServiceDuration(SessionDurationType value) {
        this.totalServiceDuration = value;
    }

    /**
     * Gets the value of the includedInSpecialEducationFTE property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludedInSpecialEducationFTE() {
        return includedInSpecialEducationFTE;
    }

    /**
     * Sets the value of the includedInSpecialEducationFTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludedInSpecialEducationFTE(Boolean value) {
        this.includedInSpecialEducationFTE = value;
    }

    /**
     * Gets the value of the specialNeedsTransportation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialNeedsTransportation() {
        return specialNeedsTransportation;
    }

    /**
     * Sets the value of the specialNeedsTransportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialNeedsTransportation(Boolean value) {
        this.specialNeedsTransportation = value;
    }

    /**
     * Gets the value of the assistiveTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAssistiveTechnology() {
        return assistiveTechnology;
    }

    /**
     * Sets the value of the assistiveTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAssistiveTechnology(Boolean value) {
        this.assistiveTechnology = value;
    }

    /**
     * Gets the value of the entryPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryPerson() {
        return entryPerson;
    }

    /**
     * Sets the value of the entryPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryPerson(String value) {
        this.entryPerson = value;
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
     * Gets the value of the studentParticipationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentParticipationRefId() {
        return studentParticipationRefId;
    }

    /**
     * Sets the value of the studentParticipationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentParticipationRefId(String value) {
        this.studentParticipationRefId = value;
    }

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
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
     *             &lt;enumeration value="SchoolInfo"/>
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
    public static class SchoolWhereServiceDelivered {

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
    public static class ServiceCategory {

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
    public static class ServicingPublicAgency {

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
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="SchoolInfo"/>
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
    public static class ServicingSchool {

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

}
