
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonPrivacyObligationDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonPrivacyObligationDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParentRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="ParentObjectTypeName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="StudentPersonal"/>
 *               &lt;enumeration value="StaffPersonal"/>
 *               &lt;enumeration value="StudentContactPersonal"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SchoolYear" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolYearType" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="SettingLocationList" type="{http://www.sifassociation.org/datamodel/au/3.4}SettingLocationListType" minOccurs="0"/>
 *         &lt;element name="ContactForRequestsRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="ContactForRequestsObjectTypeName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="StudentPersonal"/>
 *               &lt;enumeration value="StaffPersonal"/>
 *               &lt;enumeration value="StudentContactPersonal"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ConsentToSharingOfData" type="{http://www.sifassociation.org/datamodel/au/3.4}ConsentToSharingOfDataContainerType" minOccurs="0"/>
 *         &lt;element name="PermissionToParticipateList" type="{http://www.sifassociation.org/datamodel/au/3.4}PermissionToParticipateListType" minOccurs="0"/>
 *         &lt;element name="ApplicableLawList" type="{http://www.sifassociation.org/datamodel/au/3.4}ApplicableLawListType" minOccurs="0"/>
 *         &lt;element name="LocalCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalCodeListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonPrivacyObligationDocumentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "parentRefId",
    "parentObjectTypeName",
    "schoolYear",
    "startDate",
    "endDate",
    "settingLocationList",
    "contactForRequestsRefId",
    "contactForRequestsObjectTypeName",
    "consentToSharingOfData",
    "permissionToParticipateList",
    "applicableLawList",
    "localCodeList",
    "sifMetadata",
    "sifExtendedElements"
})
public class PersonPrivacyObligationDocumentType {

    @XmlElement(name = "ParentRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String parentRefId;
    @XmlElement(name = "ParentObjectTypeName", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String parentObjectTypeName;
    @XmlElement(name = "SchoolYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected XMLGregorianCalendar schoolYear;
    @XmlElementRef(name = "StartDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDate;
    @XmlElementRef(name = "EndDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDate;
    @XmlElementRef(name = "SettingLocationList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SettingLocationListType> settingLocationList;
    @XmlElement(name = "ContactForRequestsRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactForRequestsRefId;
    @XmlElement(name = "ContactForRequestsObjectTypeName", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactForRequestsObjectTypeName;
    @XmlElement(name = "ConsentToSharingOfData", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected ConsentToSharingOfDataContainerType consentToSharingOfData;
    @XmlElement(name = "PermissionToParticipateList", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected PermissionToParticipateListType permissionToParticipateList;
    @XmlElementRef(name = "ApplicableLawList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ApplicableLawListType> applicableLawList;
    @XmlElementRef(name = "LocalCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalCodeListType> localCodeList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the parentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentRefId() {
        return parentRefId;
    }

    /**
     * Sets the value of the parentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentRefId(String value) {
        this.parentRefId = value;
    }

    /**
     * Gets the value of the parentObjectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentObjectTypeName() {
        return parentObjectTypeName;
    }

    /**
     * Sets the value of the parentObjectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentObjectTypeName(String value) {
        this.parentObjectTypeName = value;
    }

    /**
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchoolYear(XMLGregorianCalendar value) {
        this.schoolYear = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the settingLocationList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SettingLocationListType }{@code >}
     *     
     */
    public JAXBElement<SettingLocationListType> getSettingLocationList() {
        return settingLocationList;
    }

    /**
     * Sets the value of the settingLocationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SettingLocationListType }{@code >}
     *     
     */
    public void setSettingLocationList(JAXBElement<SettingLocationListType> value) {
        this.settingLocationList = value;
    }

    /**
     * Gets the value of the contactForRequestsRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactForRequestsRefId() {
        return contactForRequestsRefId;
    }

    /**
     * Sets the value of the contactForRequestsRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactForRequestsRefId(String value) {
        this.contactForRequestsRefId = value;
    }

    /**
     * Gets the value of the contactForRequestsObjectTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactForRequestsObjectTypeName() {
        return contactForRequestsObjectTypeName;
    }

    /**
     * Sets the value of the contactForRequestsObjectTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactForRequestsObjectTypeName(String value) {
        this.contactForRequestsObjectTypeName = value;
    }

    /**
     * Gets the value of the consentToSharingOfData property.
     * 
     * @return
     *     possible object is
     *     {@link ConsentToSharingOfDataContainerType }
     *     
     */
    public ConsentToSharingOfDataContainerType getConsentToSharingOfData() {
        return consentToSharingOfData;
    }

    /**
     * Sets the value of the consentToSharingOfData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsentToSharingOfDataContainerType }
     *     
     */
    public void setConsentToSharingOfData(ConsentToSharingOfDataContainerType value) {
        this.consentToSharingOfData = value;
    }

    /**
     * Gets the value of the permissionToParticipateList property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionToParticipateListType }
     *     
     */
    public PermissionToParticipateListType getPermissionToParticipateList() {
        return permissionToParticipateList;
    }

    /**
     * Sets the value of the permissionToParticipateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionToParticipateListType }
     *     
     */
    public void setPermissionToParticipateList(PermissionToParticipateListType value) {
        this.permissionToParticipateList = value;
    }

    /**
     * Gets the value of the applicableLawList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApplicableLawListType }{@code >}
     *     
     */
    public JAXBElement<ApplicableLawListType> getApplicableLawList() {
        return applicableLawList;
    }

    /**
     * Sets the value of the applicableLawList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApplicableLawListType }{@code >}
     *     
     */
    public void setApplicableLawList(JAXBElement<ApplicableLawListType> value) {
        this.applicableLawList = value;
    }

    /**
     * Gets the value of the localCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public JAXBElement<LocalCodeListType> getLocalCodeList() {
        return localCodeList;
    }

    /**
     * Sets the value of the localCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public void setLocalCodeList(JAXBElement<LocalCodeListType> value) {
        this.localCodeList = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
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
