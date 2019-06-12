
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentAcademicRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentAcademicRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="StudentSchoolEnrollmentData" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentSchoolEnrollmentDataType"/>
 *         &lt;element name="DistrictEntryDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="SchoolAttendanceHistory" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolAttendanceHistoryListType"/>
 *         &lt;element name="EnrollmentHistory" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentSchoolEnrollmentSummaryListType" minOccurs="0"/>
 *         &lt;element name="CurrentCourseActivity" type="{http://www.sifassociation.org/datamodel/na/4.x}CurrentCourseActivityType" minOccurs="0"/>
 *         &lt;element name="CourseHistory" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseHistoryTermListType" minOccurs="0"/>
 *         &lt;element name="AcademicPerformanceHistory" type="{http://www.sifassociation.org/datamodel/na/4.x}AcademicPerformanceHistoryType" minOccurs="0"/>
 *         &lt;element name="AcademicPerformanceSummary" type="{http://www.sifassociation.org/datamodel/na/4.x}AcademicPerformanceSummaryType"/>
 *         &lt;element name="AssessmentPerformanceHistory" type="{http://www.sifassociation.org/datamodel/na/4.x}AssessmentPerformanceHistoryListType" minOccurs="0"/>
 *         &lt;element name="AdditionalGraduationRequirementPerformanceHistory" type="{http://www.sifassociation.org/datamodel/na/4.x}AdditionalGraduationRequirementPerformanceHistoryListType" minOccurs="0"/>
 *         &lt;element name="ActivityAwardHistory" type="{http://www.sifassociation.org/datamodel/na/4.x}ActivityAwardHistoryListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="SIF_RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="SIF_RefObject" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="SIF_RefObjectCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentAcademicRecordType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "reportingDate",
    "studentSchoolEnrollmentData",
    "districtEntryDate",
    "schoolAttendanceHistory",
    "enrollmentHistory",
    "currentCourseActivity",
    "courseHistory",
    "academicPerformanceHistory",
    "academicPerformanceSummary",
    "assessmentPerformanceHistory",
    "additionalGraduationRequirementPerformanceHistory",
    "activityAwardHistory",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentAcademicRecordType {

    @XmlElement(name = "ReportingDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportingDate;
    @XmlElement(name = "StudentSchoolEnrollmentData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StudentSchoolEnrollmentDataType studentSchoolEnrollmentData;
    @XmlElement(name = "DistrictEntryDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String districtEntryDate;
    @XmlElement(name = "SchoolAttendanceHistory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected SchoolAttendanceHistoryListType schoolAttendanceHistory;
    @XmlElement(name = "EnrollmentHistory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSchoolEnrollmentSummaryListType enrollmentHistory;
    @XmlElement(name = "CurrentCourseActivity", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CurrentCourseActivityType currentCourseActivity;
    @XmlElement(name = "CourseHistory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CourseHistoryTermListType courseHistory;
    @XmlElement(name = "AcademicPerformanceHistory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AcademicPerformanceHistoryType academicPerformanceHistory;
    @XmlElement(name = "AcademicPerformanceSummary", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected AcademicPerformanceSummaryType academicPerformanceSummary;
    @XmlElement(name = "AssessmentPerformanceHistory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AssessmentPerformanceHistoryListType assessmentPerformanceHistory;
    @XmlElement(name = "AdditionalGraduationRequirementPerformanceHistory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AdditionalGraduationRequirementPerformanceHistoryListType additionalGraduationRequirementPerformanceHistory;
    @XmlElement(name = "ActivityAwardHistory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ActivityAwardHistoryListType activityAwardHistory;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "SIF_RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sifRefId;
    @XmlAttribute(name = "SIF_RefObject", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sifRefObject;
    @XmlAttribute(name = "SIF_RefObjectCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sifRefObjectCodeset;

    /**
     * Gets the value of the reportingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportingDate() {
        return reportingDate;
    }

    /**
     * Sets the value of the reportingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportingDate(XMLGregorianCalendar value) {
        this.reportingDate = value;
    }

    /**
     * Gets the value of the studentSchoolEnrollmentData property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSchoolEnrollmentDataType }
     *     
     */
    public StudentSchoolEnrollmentDataType getStudentSchoolEnrollmentData() {
        return studentSchoolEnrollmentData;
    }

    /**
     * Sets the value of the studentSchoolEnrollmentData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSchoolEnrollmentDataType }
     *     
     */
    public void setStudentSchoolEnrollmentData(StudentSchoolEnrollmentDataType value) {
        this.studentSchoolEnrollmentData = value;
    }

    /**
     * Gets the value of the districtEntryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictEntryDate() {
        return districtEntryDate;
    }

    /**
     * Sets the value of the districtEntryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictEntryDate(String value) {
        this.districtEntryDate = value;
    }

    /**
     * Gets the value of the schoolAttendanceHistory property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolAttendanceHistoryListType }
     *     
     */
    public SchoolAttendanceHistoryListType getSchoolAttendanceHistory() {
        return schoolAttendanceHistory;
    }

    /**
     * Sets the value of the schoolAttendanceHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolAttendanceHistoryListType }
     *     
     */
    public void setSchoolAttendanceHistory(SchoolAttendanceHistoryListType value) {
        this.schoolAttendanceHistory = value;
    }

    /**
     * Gets the value of the enrollmentHistory property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSchoolEnrollmentSummaryListType }
     *     
     */
    public StudentSchoolEnrollmentSummaryListType getEnrollmentHistory() {
        return enrollmentHistory;
    }

    /**
     * Sets the value of the enrollmentHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSchoolEnrollmentSummaryListType }
     *     
     */
    public void setEnrollmentHistory(StudentSchoolEnrollmentSummaryListType value) {
        this.enrollmentHistory = value;
    }

    /**
     * Gets the value of the currentCourseActivity property.
     * 
     * @return
     *     possible object is
     *     {@link CurrentCourseActivityType }
     *     
     */
    public CurrentCourseActivityType getCurrentCourseActivity() {
        return currentCourseActivity;
    }

    /**
     * Sets the value of the currentCourseActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrentCourseActivityType }
     *     
     */
    public void setCurrentCourseActivity(CurrentCourseActivityType value) {
        this.currentCourseActivity = value;
    }

    /**
     * Gets the value of the courseHistory property.
     * 
     * @return
     *     possible object is
     *     {@link CourseHistoryTermListType }
     *     
     */
    public CourseHistoryTermListType getCourseHistory() {
        return courseHistory;
    }

    /**
     * Sets the value of the courseHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseHistoryTermListType }
     *     
     */
    public void setCourseHistory(CourseHistoryTermListType value) {
        this.courseHistory = value;
    }

    /**
     * Gets the value of the academicPerformanceHistory property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicPerformanceHistoryType }
     *     
     */
    public AcademicPerformanceHistoryType getAcademicPerformanceHistory() {
        return academicPerformanceHistory;
    }

    /**
     * Sets the value of the academicPerformanceHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicPerformanceHistoryType }
     *     
     */
    public void setAcademicPerformanceHistory(AcademicPerformanceHistoryType value) {
        this.academicPerformanceHistory = value;
    }

    /**
     * Gets the value of the academicPerformanceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicPerformanceSummaryType }
     *     
     */
    public AcademicPerformanceSummaryType getAcademicPerformanceSummary() {
        return academicPerformanceSummary;
    }

    /**
     * Sets the value of the academicPerformanceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicPerformanceSummaryType }
     *     
     */
    public void setAcademicPerformanceSummary(AcademicPerformanceSummaryType value) {
        this.academicPerformanceSummary = value;
    }

    /**
     * Gets the value of the assessmentPerformanceHistory property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentPerformanceHistoryListType }
     *     
     */
    public AssessmentPerformanceHistoryListType getAssessmentPerformanceHistory() {
        return assessmentPerformanceHistory;
    }

    /**
     * Sets the value of the assessmentPerformanceHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentPerformanceHistoryListType }
     *     
     */
    public void setAssessmentPerformanceHistory(AssessmentPerformanceHistoryListType value) {
        this.assessmentPerformanceHistory = value;
    }

    /**
     * Gets the value of the additionalGraduationRequirementPerformanceHistory property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalGraduationRequirementPerformanceHistoryListType }
     *     
     */
    public AdditionalGraduationRequirementPerformanceHistoryListType getAdditionalGraduationRequirementPerformanceHistory() {
        return additionalGraduationRequirementPerformanceHistory;
    }

    /**
     * Sets the value of the additionalGraduationRequirementPerformanceHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalGraduationRequirementPerformanceHistoryListType }
     *     
     */
    public void setAdditionalGraduationRequirementPerformanceHistory(AdditionalGraduationRequirementPerformanceHistoryListType value) {
        this.additionalGraduationRequirementPerformanceHistory = value;
    }

    /**
     * Gets the value of the activityAwardHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityAwardHistoryListType }
     *     
     */
    public ActivityAwardHistoryListType getActivityAwardHistory() {
        return activityAwardHistory;
    }

    /**
     * Sets the value of the activityAwardHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityAwardHistoryListType }
     *     
     */
    public void setActivityAwardHistory(ActivityAwardHistoryListType value) {
        this.activityAwardHistory = value;
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
     * Gets the value of the sifRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFRefId() {
        return sifRefId;
    }

    /**
     * Sets the value of the sifRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFRefId(String value) {
        this.sifRefId = value;
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

    /**
     * Gets the value of the sifRefObjectCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFRefObjectCodeset() {
        return sifRefObjectCodeset;
    }

    /**
     * Sets the value of the sifRefObjectCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFRefObjectCodeset(String value) {
        this.sifRefObjectCodeset = value;
    }

}
