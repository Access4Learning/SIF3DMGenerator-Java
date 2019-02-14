
package sif.dd.au30.model;

import java.math.BigDecimal;
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
 * <p>Java class for StaffAssignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffAssignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolYear" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolYearType" minOccurs="0"/>
 *         &lt;element name="StaffPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="PrimaryAssignment" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="JobStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="JobEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="JobFTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JobFunction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmploymentStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsStaffStatusType" minOccurs="0"/>
 *         &lt;element name="StaffSubjectList" type="{http://www.sifassociation.org/datamodel/au/3.4}StaffSubjectListType" minOccurs="0"/>
 *         &lt;element name="StaffActivity" type="{http://www.sifassociation.org/datamodel/au/3.4}StaffActivityExtensionType" minOccurs="0"/>
 *         &lt;element name="YearLevels" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelsType" minOccurs="0"/>
 *         &lt;element name="CasualReliefTeacher" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="Homegroup" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="House" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="CalendarSummaryList" type="{http://www.sifassociation.org/datamodel/au/3.4}CalendarSummaryListType" minOccurs="0"/>
 *         &lt;element name="PreviousSchoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
@XmlType(name = "StaffAssignmentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "schoolInfoRefId",
    "schoolYear",
    "staffPersonalRefId",
    "description",
    "primaryAssignment",
    "jobStartDate",
    "jobEndDate",
    "jobFTE",
    "jobFunction",
    "employmentStatus",
    "staffSubjectList",
    "staffActivity",
    "yearLevels",
    "casualReliefTeacher",
    "homegroup",
    "house",
    "calendarSummaryList",
    "previousSchoolName",
    "sifMetadata",
    "sifExtendedElements"
})
public class StaffAssignmentType {

    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElementRef(name = "SchoolYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> schoolYear;
    @XmlElement(name = "StaffPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String staffPersonalRefId;
    @XmlElementRef(name = "Description", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "PrimaryAssignment", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsYesOrNoCategoryType primaryAssignment;
    @XmlElementRef(name = "JobStartDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> jobStartDate;
    @XmlElementRef(name = "JobEndDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> jobEndDate;
    @XmlElementRef(name = "JobFTE", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> jobFTE;
    @XmlElementRef(name = "JobFunction", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobFunction;
    @XmlElementRef(name = "EmploymentStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsStaffStatusType> employmentStatus;
    @XmlElementRef(name = "StaffSubjectList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StaffSubjectListType> staffSubjectList;
    @XmlElementRef(name = "StaffActivity", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StaffActivityExtensionType> staffActivity;
    @XmlElementRef(name = "YearLevels", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<YearLevelsType> yearLevels;
    @XmlElementRef(name = "CasualReliefTeacher", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> casualReliefTeacher;
    @XmlElementRef(name = "Homegroup", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homegroup;
    @XmlElementRef(name = "House", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> house;
    @XmlElementRef(name = "CalendarSummaryList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<CalendarSummaryListType> calendarSummaryList;
    @XmlElementRef(name = "PreviousSchoolName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousSchoolName;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setSchoolYear(JAXBElement<XMLGregorianCalendar> value) {
        this.schoolYear = value;
    }

    /**
     * Gets the value of the staffPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffPersonalRefId() {
        return staffPersonalRefId;
    }

    /**
     * Sets the value of the staffPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffPersonalRefId(String value) {
        this.staffPersonalRefId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the primaryAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsYesOrNoCategoryType }
     *     
     */
    public AUCodeSetsYesOrNoCategoryType getPrimaryAssignment() {
        return primaryAssignment;
    }

    /**
     * Sets the value of the primaryAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsYesOrNoCategoryType }
     *     
     */
    public void setPrimaryAssignment(AUCodeSetsYesOrNoCategoryType value) {
        this.primaryAssignment = value;
    }

    /**
     * Gets the value of the jobStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getJobStartDate() {
        return jobStartDate;
    }

    /**
     * Sets the value of the jobStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setJobStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.jobStartDate = value;
    }

    /**
     * Gets the value of the jobEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getJobEndDate() {
        return jobEndDate;
    }

    /**
     * Sets the value of the jobEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setJobEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.jobEndDate = value;
    }

    /**
     * Gets the value of the jobFTE property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getJobFTE() {
        return jobFTE;
    }

    /**
     * Sets the value of the jobFTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setJobFTE(JAXBElement<BigDecimal> value) {
        this.jobFTE = value;
    }

    /**
     * Gets the value of the jobFunction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobFunction() {
        return jobFunction;
    }

    /**
     * Sets the value of the jobFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobFunction(JAXBElement<String> value) {
        this.jobFunction = value;
    }

    /**
     * Gets the value of the employmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsStaffStatusType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsStaffStatusType> getEmploymentStatus() {
        return employmentStatus;
    }

    /**
     * Sets the value of the employmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsStaffStatusType }{@code >}
     *     
     */
    public void setEmploymentStatus(JAXBElement<AUCodeSetsStaffStatusType> value) {
        this.employmentStatus = value;
    }

    /**
     * Gets the value of the staffSubjectList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StaffSubjectListType }{@code >}
     *     
     */
    public JAXBElement<StaffSubjectListType> getStaffSubjectList() {
        return staffSubjectList;
    }

    /**
     * Sets the value of the staffSubjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StaffSubjectListType }{@code >}
     *     
     */
    public void setStaffSubjectList(JAXBElement<StaffSubjectListType> value) {
        this.staffSubjectList = value;
    }

    /**
     * Gets the value of the staffActivity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StaffActivityExtensionType }{@code >}
     *     
     */
    public JAXBElement<StaffActivityExtensionType> getStaffActivity() {
        return staffActivity;
    }

    /**
     * Sets the value of the staffActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StaffActivityExtensionType }{@code >}
     *     
     */
    public void setStaffActivity(JAXBElement<StaffActivityExtensionType> value) {
        this.staffActivity = value;
    }

    /**
     * Gets the value of the yearLevels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}
     *     
     */
    public JAXBElement<YearLevelsType> getYearLevels() {
        return yearLevels;
    }

    /**
     * Sets the value of the yearLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}
     *     
     */
    public void setYearLevels(JAXBElement<YearLevelsType> value) {
        this.yearLevels = value;
    }

    /**
     * Gets the value of the casualReliefTeacher property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getCasualReliefTeacher() {
        return casualReliefTeacher;
    }

    /**
     * Sets the value of the casualReliefTeacher property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setCasualReliefTeacher(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.casualReliefTeacher = value;
    }

    /**
     * Gets the value of the homegroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomegroup() {
        return homegroup;
    }

    /**
     * Sets the value of the homegroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomegroup(JAXBElement<String> value) {
        this.homegroup = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouse(JAXBElement<String> value) {
        this.house = value;
    }

    /**
     * Gets the value of the calendarSummaryList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CalendarSummaryListType }{@code >}
     *     
     */
    public JAXBElement<CalendarSummaryListType> getCalendarSummaryList() {
        return calendarSummaryList;
    }

    /**
     * Sets the value of the calendarSummaryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CalendarSummaryListType }{@code >}
     *     
     */
    public void setCalendarSummaryList(JAXBElement<CalendarSummaryListType> value) {
        this.calendarSummaryList = value;
    }

    /**
     * Gets the value of the previousSchoolName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousSchoolName() {
        return previousSchoolName;
    }

    /**
     * Sets the value of the previousSchoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousSchoolName(JAXBElement<String> value) {
        this.previousSchoolName = value;
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
