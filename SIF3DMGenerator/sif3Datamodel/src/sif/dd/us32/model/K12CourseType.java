
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for k12CourseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k12CourseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schoolInfoRefId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scedSequenceOfCourse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCreditUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCreditValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalCreditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availableCarnegieUnitCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseGPAApplicability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseLevelCharacteristic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highSchoolCourseRequirement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructionLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coreAcademicCourse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curriculumFrameworkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseAlignedWithStandards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="abilityGroupingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="advancedPlacementCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blendedLearningModelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="careerCluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseApplicableEducationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCertificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseFundingProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseInteractionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="familyAndConsumerSciencesCourseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="k12EndOfCourseRequirement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ncaaEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scedCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scedCourseLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scedCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scedGradeSpan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="work-basedLearningOpportunityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "k12CourseType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "schoolInfoRefId",
    "schoolYear",
    "courseTitle",
    "courseIdentifier",
    "courseCodeSystem",
    "courseDescription",
    "scedSequenceOfCourse",
    "courseCreditUnits",
    "courseCreditValue",
    "additionalCreditType",
    "availableCarnegieUnitCredit",
    "courseGPAApplicability",
    "courseLevelCharacteristic",
    "highSchoolCourseRequirement",
    "instructionLanguage",
    "coreAcademicCourse",
    "curriculumFrameworkType",
    "courseAlignedWithStandards",
    "abilityGroupingStatus",
    "advancedPlacementCourseCode",
    "blendedLearningModelType",
    "careerCluster",
    "courseApplicableEducationLevel",
    "courseCertificationDescription",
    "courseFundingProgram",
    "courseInteractionMode",
    "familyAndConsumerSciencesCourseIndicator",
    "k12EndOfCourseRequirement",
    "ncaaEligibility",
    "scedCourseCode",
    "scedCourseLevel",
    "scedCourseSubjectArea",
    "scedGradeSpan",
    "workBasedLearningOpportunityType"
})
public class K12CourseType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String schoolInfoRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCodeSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String scedSequenceOfCourse;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCreditUnits;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCreditValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String additionalCreditType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String availableCarnegieUnitCredit;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseGPAApplicability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseLevelCharacteristic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String highSchoolCourseRequirement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String instructionLanguage;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String coreAcademicCourse;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String curriculumFrameworkType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseAlignedWithStandards;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String abilityGroupingStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String advancedPlacementCourseCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String blendedLearningModelType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String careerCluster;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseApplicableEducationLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCertificationDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseFundingProgram;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseInteractionMode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String familyAndConsumerSciencesCourseIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String k12EndOfCourseRequirement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String ncaaEligibility;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String scedCourseCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String scedCourseLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String scedCourseSubjectArea;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String scedGradeSpan;
    @XmlElement(name = "work-basedLearningOpportunityType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String workBasedLearningOpportunityType;
    @XmlAttribute(name = "refId", required = true)
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
     *     {@link String }
     *     
     */
    public String getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolYear(String value) {
        this.schoolYear = value;
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
     * Gets the value of the courseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseDescription() {
        return courseDescription;
    }

    /**
     * Sets the value of the courseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseDescription(String value) {
        this.courseDescription = value;
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
     * Gets the value of the courseCreditUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCreditUnits() {
        return courseCreditUnits;
    }

    /**
     * Sets the value of the courseCreditUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCreditUnits(String value) {
        this.courseCreditUnits = value;
    }

    /**
     * Gets the value of the courseCreditValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCreditValue() {
        return courseCreditValue;
    }

    /**
     * Sets the value of the courseCreditValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCreditValue(String value) {
        this.courseCreditValue = value;
    }

    /**
     * Gets the value of the additionalCreditType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCreditType() {
        return additionalCreditType;
    }

    /**
     * Sets the value of the additionalCreditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCreditType(String value) {
        this.additionalCreditType = value;
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
     * Gets the value of the coreAcademicCourse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoreAcademicCourse() {
        return coreAcademicCourse;
    }

    /**
     * Sets the value of the coreAcademicCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoreAcademicCourse(String value) {
        this.coreAcademicCourse = value;
    }

    /**
     * Gets the value of the curriculumFrameworkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurriculumFrameworkType() {
        return curriculumFrameworkType;
    }

    /**
     * Sets the value of the curriculumFrameworkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurriculumFrameworkType(String value) {
        this.curriculumFrameworkType = value;
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
     * Gets the value of the abilityGroupingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbilityGroupingStatus() {
        return abilityGroupingStatus;
    }

    /**
     * Sets the value of the abilityGroupingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbilityGroupingStatus(String value) {
        this.abilityGroupingStatus = value;
    }

    /**
     * Gets the value of the advancedPlacementCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvancedPlacementCourseCode() {
        return advancedPlacementCourseCode;
    }

    /**
     * Sets the value of the advancedPlacementCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvancedPlacementCourseCode(String value) {
        this.advancedPlacementCourseCode = value;
    }

    /**
     * Gets the value of the blendedLearningModelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlendedLearningModelType() {
        return blendedLearningModelType;
    }

    /**
     * Sets the value of the blendedLearningModelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlendedLearningModelType(String value) {
        this.blendedLearningModelType = value;
    }

    /**
     * Gets the value of the careerCluster property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCareerCluster() {
        return careerCluster;
    }

    /**
     * Sets the value of the careerCluster property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCareerCluster(String value) {
        this.careerCluster = value;
    }

    /**
     * Gets the value of the courseApplicableEducationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseApplicableEducationLevel() {
        return courseApplicableEducationLevel;
    }

    /**
     * Sets the value of the courseApplicableEducationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseApplicableEducationLevel(String value) {
        this.courseApplicableEducationLevel = value;
    }

    /**
     * Gets the value of the courseCertificationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCertificationDescription() {
        return courseCertificationDescription;
    }

    /**
     * Sets the value of the courseCertificationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCertificationDescription(String value) {
        this.courseCertificationDescription = value;
    }

    /**
     * Gets the value of the courseFundingProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseFundingProgram() {
        return courseFundingProgram;
    }

    /**
     * Sets the value of the courseFundingProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseFundingProgram(String value) {
        this.courseFundingProgram = value;
    }

    /**
     * Gets the value of the courseInteractionMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseInteractionMode() {
        return courseInteractionMode;
    }

    /**
     * Sets the value of the courseInteractionMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseInteractionMode(String value) {
        this.courseInteractionMode = value;
    }

    /**
     * Gets the value of the familyAndConsumerSciencesCourseIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyAndConsumerSciencesCourseIndicator() {
        return familyAndConsumerSciencesCourseIndicator;
    }

    /**
     * Sets the value of the familyAndConsumerSciencesCourseIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyAndConsumerSciencesCourseIndicator(String value) {
        this.familyAndConsumerSciencesCourseIndicator = value;
    }

    /**
     * Gets the value of the k12EndOfCourseRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getK12EndOfCourseRequirement() {
        return k12EndOfCourseRequirement;
    }

    /**
     * Sets the value of the k12EndOfCourseRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setK12EndOfCourseRequirement(String value) {
        this.k12EndOfCourseRequirement = value;
    }

    /**
     * Gets the value of the ncaaEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcaaEligibility() {
        return ncaaEligibility;
    }

    /**
     * Sets the value of the ncaaEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcaaEligibility(String value) {
        this.ncaaEligibility = value;
    }

    /**
     * Gets the value of the scedCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScedCourseCode() {
        return scedCourseCode;
    }

    /**
     * Sets the value of the scedCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScedCourseCode(String value) {
        this.scedCourseCode = value;
    }

    /**
     * Gets the value of the scedCourseLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScedCourseLevel() {
        return scedCourseLevel;
    }

    /**
     * Sets the value of the scedCourseLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScedCourseLevel(String value) {
        this.scedCourseLevel = value;
    }

    /**
     * Gets the value of the scedCourseSubjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScedCourseSubjectArea() {
        return scedCourseSubjectArea;
    }

    /**
     * Sets the value of the scedCourseSubjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScedCourseSubjectArea(String value) {
        this.scedCourseSubjectArea = value;
    }

    /**
     * Gets the value of the scedGradeSpan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScedGradeSpan() {
        return scedGradeSpan;
    }

    /**
     * Sets the value of the scedGradeSpan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScedGradeSpan(String value) {
        this.scedGradeSpan = value;
    }

    /**
     * Gets the value of the workBasedLearningOpportunityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkBasedLearningOpportunityType() {
        return workBasedLearningOpportunityType;
    }

    /**
     * Sets the value of the workBasedLearningOpportunityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkBasedLearningOpportunityType(String value) {
        this.workBasedLearningOpportunityType = value;
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
