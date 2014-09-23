
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for cteSectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cteSectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sectionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classroomIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classBeginningTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classEndingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classMeetingDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="classPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timetableDayIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectionTimeRequiredForCompletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructionLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectionSingleSexClassStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receivingLocationOfInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectionInstructionalDeliveryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="virtualIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scedSequenceOfCourse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseLevelCharacteristic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highSchoolCourseRequirement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availableCarnegieUnitCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseGPAApplicability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseAlignedWithStandards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedLearningStandards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sectionAssessmentReportingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cteSectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "sectionIdentifier",
    "classroomIdentifier",
    "sessionBeginDate",
    "sessionEndDate",
    "sessionDesignator",
    "sessionType",
    "classBeginningTime",
    "classEndingTime",
    "classMeetingDays",
    "classPeriod",
    "timetableDayIdentifier",
    "sectionTimeRequiredForCompletion",
    "instructionLanguage",
    "sectionSingleSexClassStatus",
    "receivingLocationOfInstruction",
    "sectionInstructionalDeliveryMode",
    "virtualIndicator",
    "courseIdentifier",
    "courseCodeSystem",
    "courseTitle",
    "scedSequenceOfCourse",
    "courseLevelCharacteristic",
    "creditTypeEarned",
    "highSchoolCourseRequirement",
    "availableCarnegieUnitCredit",
    "courseGPAApplicability",
    "courseAlignedWithStandards",
    "relatedLearningStandards",
    "sectionAssessmentReportingMethod"
})
public class CteSectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sectionIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String classroomIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sessionBeginDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sessionEndDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sessionDesignator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sessionType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String classBeginningTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String classEndingTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String classMeetingDays;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String classPeriod;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String timetableDayIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sectionTimeRequiredForCompletion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String instructionLanguage;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sectionSingleSexClassStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String receivingLocationOfInstruction;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sectionInstructionalDeliveryMode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String virtualIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCodeSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String scedSequenceOfCourse;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseLevelCharacteristic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String creditTypeEarned;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String highSchoolCourseRequirement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String availableCarnegieUnitCredit;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseGPAApplicability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseAlignedWithStandards;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String relatedLearningStandards;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sectionAssessmentReportingMethod;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the sectionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionIdentifier() {
        return sectionIdentifier;
    }

    /**
     * Sets the value of the sectionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionIdentifier(String value) {
        this.sectionIdentifier = value;
    }

    /**
     * Gets the value of the classroomIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassroomIdentifier() {
        return classroomIdentifier;
    }

    /**
     * Sets the value of the classroomIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassroomIdentifier(String value) {
        this.classroomIdentifier = value;
    }

    /**
     * Gets the value of the sessionBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionBeginDate() {
        return sessionBeginDate;
    }

    /**
     * Sets the value of the sessionBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionBeginDate(String value) {
        this.sessionBeginDate = value;
    }

    /**
     * Gets the value of the sessionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionEndDate() {
        return sessionEndDate;
    }

    /**
     * Sets the value of the sessionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionEndDate(String value) {
        this.sessionEndDate = value;
    }

    /**
     * Gets the value of the sessionDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionDesignator() {
        return sessionDesignator;
    }

    /**
     * Sets the value of the sessionDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionDesignator(String value) {
        this.sessionDesignator = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionType(String value) {
        this.sessionType = value;
    }

    /**
     * Gets the value of the classBeginningTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassBeginningTime() {
        return classBeginningTime;
    }

    /**
     * Sets the value of the classBeginningTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassBeginningTime(String value) {
        this.classBeginningTime = value;
    }

    /**
     * Gets the value of the classEndingTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassEndingTime() {
        return classEndingTime;
    }

    /**
     * Sets the value of the classEndingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassEndingTime(String value) {
        this.classEndingTime = value;
    }

    /**
     * Gets the value of the classMeetingDays property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassMeetingDays() {
        return classMeetingDays;
    }

    /**
     * Sets the value of the classMeetingDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassMeetingDays(String value) {
        this.classMeetingDays = value;
    }

    /**
     * Gets the value of the classPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassPeriod() {
        return classPeriod;
    }

    /**
     * Sets the value of the classPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassPeriod(String value) {
        this.classPeriod = value;
    }

    /**
     * Gets the value of the timetableDayIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimetableDayIdentifier() {
        return timetableDayIdentifier;
    }

    /**
     * Sets the value of the timetableDayIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetableDayIdentifier(String value) {
        this.timetableDayIdentifier = value;
    }

    /**
     * Gets the value of the sectionTimeRequiredForCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionTimeRequiredForCompletion() {
        return sectionTimeRequiredForCompletion;
    }

    /**
     * Sets the value of the sectionTimeRequiredForCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionTimeRequiredForCompletion(String value) {
        this.sectionTimeRequiredForCompletion = value;
    }

    /**
     * Gets the value of the instructionLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionLanguage() {
        return instructionLanguage;
    }

    /**
     * Sets the value of the instructionLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionLanguage(String value) {
        this.instructionLanguage = value;
    }

    /**
     * Gets the value of the sectionSingleSexClassStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionSingleSexClassStatus() {
        return sectionSingleSexClassStatus;
    }

    /**
     * Sets the value of the sectionSingleSexClassStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionSingleSexClassStatus(String value) {
        this.sectionSingleSexClassStatus = value;
    }

    /**
     * Gets the value of the receivingLocationOfInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivingLocationOfInstruction() {
        return receivingLocationOfInstruction;
    }

    /**
     * Sets the value of the receivingLocationOfInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivingLocationOfInstruction(String value) {
        this.receivingLocationOfInstruction = value;
    }

    /**
     * Gets the value of the sectionInstructionalDeliveryMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionInstructionalDeliveryMode() {
        return sectionInstructionalDeliveryMode;
    }

    /**
     * Sets the value of the sectionInstructionalDeliveryMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionInstructionalDeliveryMode(String value) {
        this.sectionInstructionalDeliveryMode = value;
    }

    /**
     * Gets the value of the virtualIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualIndicator() {
        return virtualIndicator;
    }

    /**
     * Sets the value of the virtualIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualIndicator(String value) {
        this.virtualIndicator = value;
    }

    /**
     * Gets the value of the courseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseIdentifier() {
        return courseIdentifier;
    }

    /**
     * Sets the value of the courseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseIdentifier(String value) {
        this.courseIdentifier = value;
    }

    /**
     * Gets the value of the courseCodeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCodeSystem() {
        return courseCodeSystem;
    }

    /**
     * Sets the value of the courseCodeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCodeSystem(String value) {
        this.courseCodeSystem = value;
    }

    /**
     * Gets the value of the courseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Sets the value of the courseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseTitle(String value) {
        this.courseTitle = value;
    }

    /**
     * Gets the value of the scedSequenceOfCourse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScedSequenceOfCourse() {
        return scedSequenceOfCourse;
    }

    /**
     * Sets the value of the scedSequenceOfCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScedSequenceOfCourse(String value) {
        this.scedSequenceOfCourse = value;
    }

    /**
     * Gets the value of the courseLevelCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseLevelCharacteristic() {
        return courseLevelCharacteristic;
    }

    /**
     * Sets the value of the courseLevelCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseLevelCharacteristic(String value) {
        this.courseLevelCharacteristic = value;
    }

    /**
     * Gets the value of the creditTypeEarned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditTypeEarned() {
        return creditTypeEarned;
    }

    /**
     * Sets the value of the creditTypeEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditTypeEarned(String value) {
        this.creditTypeEarned = value;
    }

    /**
     * Gets the value of the highSchoolCourseRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighSchoolCourseRequirement() {
        return highSchoolCourseRequirement;
    }

    /**
     * Sets the value of the highSchoolCourseRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighSchoolCourseRequirement(String value) {
        this.highSchoolCourseRequirement = value;
    }

    /**
     * Gets the value of the availableCarnegieUnitCredit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAvailableCarnegieUnitCredit() {
        return availableCarnegieUnitCredit;
    }

    /**
     * Sets the value of the availableCarnegieUnitCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailableCarnegieUnitCredit(String value) {
        this.availableCarnegieUnitCredit = value;
    }

    /**
     * Gets the value of the courseGPAApplicability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseGPAApplicability() {
        return courseGPAApplicability;
    }

    /**
     * Sets the value of the courseGPAApplicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseGPAApplicability(String value) {
        this.courseGPAApplicability = value;
    }

    /**
     * Gets the value of the courseAlignedWithStandards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseAlignedWithStandards() {
        return courseAlignedWithStandards;
    }

    /**
     * Sets the value of the courseAlignedWithStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseAlignedWithStandards(String value) {
        this.courseAlignedWithStandards = value;
    }

    /**
     * Gets the value of the relatedLearningStandards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedLearningStandards() {
        return relatedLearningStandards;
    }

    /**
     * Sets the value of the relatedLearningStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedLearningStandards(String value) {
        this.relatedLearningStandards = value;
    }

    /**
     * Gets the value of the sectionAssessmentReportingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionAssessmentReportingMethod() {
        return sectionAssessmentReportingMethod;
    }

    /**
     * Sets the value of the sectionAssessmentReportingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionAssessmentReportingMethod(String value) {
        this.sectionAssessmentReportingMethod = value;
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
