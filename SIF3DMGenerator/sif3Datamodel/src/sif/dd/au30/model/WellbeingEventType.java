
package sif.dd.au30.model;

import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for WellbeingEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="EventId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="WellbeingEventNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WellbeingEventCategoryClass" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingEventCategoryClassType" minOccurs="0"/>
 *         &lt;element name="WellbeingEventCategoryList" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingEventCategoryListType" minOccurs="0"/>
 *         &lt;element name="ReportingStaffRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="WellbeingEventLocationDetails" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingEventLocationDetailsType" minOccurs="0"/>
 *         &lt;element name="WellbeingEventCreationTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="WellbeingEventDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WellbeingEventTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="WellbeingEventDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WellbeingEventTimePeriod" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingEventTimePeriodType" minOccurs="0"/>
 *         &lt;element name="ConfidentialFlag" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="PersonInvolvementList" type="{http://www.sifassociation.org/datamodel/au/3.4}PersonInvolvementListType" minOccurs="0"/>
 *         &lt;element name="FollowUpActionList" type="{http://www.sifassociation.org/datamodel/au/3.4}FollowUpActionListType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingStatusType" minOccurs="0"/>
 *         &lt;element name="DocumentList" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingDocumentListType" minOccurs="0"/>
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
@XmlType(name = "WellbeingEventType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentPersonalRefId",
    "schoolInfoRefId",
    "eventId",
    "wellbeingEventNotes",
    "wellbeingEventCategoryClass",
    "wellbeingEventCategoryList",
    "reportingStaffRefId",
    "wellbeingEventLocationDetails",
    "wellbeingEventCreationTimeStamp",
    "wellbeingEventDate",
    "wellbeingEventTime",
    "wellbeingEventDescription",
    "wellbeingEventTimePeriod",
    "confidentialFlag",
    "personInvolvementList",
    "followUpActionList",
    "status",
    "documentList",
    "sifMetadata",
    "sifExtendedElements"
})
public class WellbeingEventType {

    @XmlElement(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElementRef(name = "EventId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> eventId;
    @XmlElementRef(name = "WellbeingEventNotes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wellbeingEventNotes;
    @XmlElement(name = "WellbeingEventCategoryClass", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsWellbeingEventCategoryClassType wellbeingEventCategoryClass;
    @XmlElementRef(name = "WellbeingEventCategoryList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<WellbeingEventCategoryListType> wellbeingEventCategoryList;
    @XmlElementRef(name = "ReportingStaffRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportingStaffRefId;
    @XmlElementRef(name = "WellbeingEventLocationDetails", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<WellbeingEventLocationDetailsType> wellbeingEventLocationDetails;
    @XmlElementRef(name = "WellbeingEventCreationTimeStamp", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Calendar> wellbeingEventCreationTimeStamp;
    @XmlElement(name = "WellbeingEventDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar wellbeingEventDate;
    @XmlElementRef(name = "WellbeingEventTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> wellbeingEventTime;
    @XmlElementRef(name = "WellbeingEventDescription", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wellbeingEventDescription;
    @XmlElement(name = "WellbeingEventTimePeriod", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsWellbeingEventTimePeriodType wellbeingEventTimePeriod;
    @XmlElementRef(name = "ConfidentialFlag", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> confidentialFlag;
    @XmlElementRef(name = "PersonInvolvementList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonInvolvementListType> personInvolvementList;
    @XmlElementRef(name = "FollowUpActionList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<FollowUpActionListType> followUpActionList;
    @XmlElementRef(name = "Status", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsWellbeingStatusType> status;
    @XmlElementRef(name = "DocumentList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<WellbeingDocumentListType> documentList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolInfoRefId(String value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEventId(JAXBElement<String> value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the wellbeingEventNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWellbeingEventNotes() {
        return wellbeingEventNotes;
    }

    /**
     * Sets the value of the wellbeingEventNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWellbeingEventNotes(JAXBElement<String> value) {
        this.wellbeingEventNotes = value;
    }

    /**
     * Gets the value of the wellbeingEventCategoryClass property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsWellbeingEventCategoryClassType }
     *     
     */
    public AUCodeSetsWellbeingEventCategoryClassType getWellbeingEventCategoryClass() {
        return wellbeingEventCategoryClass;
    }

    /**
     * Sets the value of the wellbeingEventCategoryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsWellbeingEventCategoryClassType }
     *     
     */
    public void setWellbeingEventCategoryClass(AUCodeSetsWellbeingEventCategoryClassType value) {
        this.wellbeingEventCategoryClass = value;
    }

    /**
     * Gets the value of the wellbeingEventCategoryList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WellbeingEventCategoryListType }{@code >}
     *     
     */
    public JAXBElement<WellbeingEventCategoryListType> getWellbeingEventCategoryList() {
        return wellbeingEventCategoryList;
    }

    /**
     * Sets the value of the wellbeingEventCategoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WellbeingEventCategoryListType }{@code >}
     *     
     */
    public void setWellbeingEventCategoryList(JAXBElement<WellbeingEventCategoryListType> value) {
        this.wellbeingEventCategoryList = value;
    }

    /**
     * Gets the value of the reportingStaffRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportingStaffRefId() {
        return reportingStaffRefId;
    }

    /**
     * Sets the value of the reportingStaffRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportingStaffRefId(JAXBElement<String> value) {
        this.reportingStaffRefId = value;
    }

    /**
     * Gets the value of the wellbeingEventLocationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WellbeingEventLocationDetailsType }{@code >}
     *     
     */
    public JAXBElement<WellbeingEventLocationDetailsType> getWellbeingEventLocationDetails() {
        return wellbeingEventLocationDetails;
    }

    /**
     * Sets the value of the wellbeingEventLocationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WellbeingEventLocationDetailsType }{@code >}
     *     
     */
    public void setWellbeingEventLocationDetails(JAXBElement<WellbeingEventLocationDetailsType> value) {
        this.wellbeingEventLocationDetails = value;
    }

    /**
     * Gets the value of the wellbeingEventCreationTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Calendar }{@code >}
     *     
     */
    public JAXBElement<Calendar> getWellbeingEventCreationTimeStamp() {
        return wellbeingEventCreationTimeStamp;
    }

    /**
     * Sets the value of the wellbeingEventCreationTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Calendar }{@code >}
     *     
     */
    public void setWellbeingEventCreationTimeStamp(JAXBElement<Calendar> value) {
        this.wellbeingEventCreationTimeStamp = value;
    }

    /**
     * Gets the value of the wellbeingEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWellbeingEventDate() {
        return wellbeingEventDate;
    }

    /**
     * Sets the value of the wellbeingEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWellbeingEventDate(XMLGregorianCalendar value) {
        this.wellbeingEventDate = value;
    }

    /**
     * Gets the value of the wellbeingEventTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getWellbeingEventTime() {
        return wellbeingEventTime;
    }

    /**
     * Sets the value of the wellbeingEventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setWellbeingEventTime(JAXBElement<XMLGregorianCalendar> value) {
        this.wellbeingEventTime = value;
    }

    /**
     * Gets the value of the wellbeingEventDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWellbeingEventDescription() {
        return wellbeingEventDescription;
    }

    /**
     * Sets the value of the wellbeingEventDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWellbeingEventDescription(JAXBElement<String> value) {
        this.wellbeingEventDescription = value;
    }

    /**
     * Gets the value of the wellbeingEventTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsWellbeingEventTimePeriodType }
     *     
     */
    public AUCodeSetsWellbeingEventTimePeriodType getWellbeingEventTimePeriod() {
        return wellbeingEventTimePeriod;
    }

    /**
     * Sets the value of the wellbeingEventTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsWellbeingEventTimePeriodType }
     *     
     */
    public void setWellbeingEventTimePeriod(AUCodeSetsWellbeingEventTimePeriodType value) {
        this.wellbeingEventTimePeriod = value;
    }

    /**
     * Gets the value of the confidentialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getConfidentialFlag() {
        return confidentialFlag;
    }

    /**
     * Sets the value of the confidentialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setConfidentialFlag(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.confidentialFlag = value;
    }

    /**
     * Gets the value of the personInvolvementList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonInvolvementListType }{@code >}
     *     
     */
    public JAXBElement<PersonInvolvementListType> getPersonInvolvementList() {
        return personInvolvementList;
    }

    /**
     * Sets the value of the personInvolvementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonInvolvementListType }{@code >}
     *     
     */
    public void setPersonInvolvementList(JAXBElement<PersonInvolvementListType> value) {
        this.personInvolvementList = value;
    }

    /**
     * Gets the value of the followUpActionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FollowUpActionListType }{@code >}
     *     
     */
    public JAXBElement<FollowUpActionListType> getFollowUpActionList() {
        return followUpActionList;
    }

    /**
     * Sets the value of the followUpActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FollowUpActionListType }{@code >}
     *     
     */
    public void setFollowUpActionList(JAXBElement<FollowUpActionListType> value) {
        this.followUpActionList = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsWellbeingStatusType> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<AUCodeSetsWellbeingStatusType> value) {
        this.status = value;
    }

    /**
     * Gets the value of the documentList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WellbeingDocumentListType }{@code >}
     *     
     */
    public JAXBElement<WellbeingDocumentListType> getDocumentList() {
        return documentList;
    }

    /**
     * Sets the value of the documentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WellbeingDocumentListType }{@code >}
     *     
     */
    public void setDocumentList(JAXBElement<WellbeingDocumentListType> value) {
        this.documentList = value;
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
