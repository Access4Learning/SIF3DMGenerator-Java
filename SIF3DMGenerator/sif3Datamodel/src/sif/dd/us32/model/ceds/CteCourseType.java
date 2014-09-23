
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for cteCourseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cteCourseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sequenceOfCourse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCreditUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCreditValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalCreditTypeAwarded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="availableCarnegieUnitCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseGPAApplicability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseLevelCharacteristic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="highSchoolCourseRequirement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructionLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coreAcademicCourse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="curriculumFrameworkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alignedWithStateStandards" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scedCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scedCourseLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scedCourseSubjectArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "cteCourseType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "courseTitle",
    "courseId",
    "courseCodeSystem",
    "courseDescription",
    "sequenceOfCourse",
    "courseCreditUnits",
    "creditTypeEarned",
    "courseCreditValue",
    "additionalCreditTypeAwarded",
    "availableCarnegieUnitCredit",
    "courseGPAApplicability",
    "courseLevelCharacteristic",
    "highSchoolCourseRequirement",
    "instructionLanguage",
    "coreAcademicCourse",
    "curriculumFrameworkType",
    "alignedWithStateStandards",
    "scedCourseCode",
    "scedCourseLevel",
    "scedCourseSubjectArea"
})
public class CteCourseType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCodeSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String sequenceOfCourse;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCreditUnits;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String creditTypeEarned;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCreditValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String additionalCreditTypeAwarded;
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
    protected String alignedWithStateStandards;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String scedCourseCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String scedCourseLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String scedCourseSubjectArea;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the courseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * Sets the value of the courseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseId(String value) {
        this.courseId = value;
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
     * Gets the value of the sequenceOfCourse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceOfCourse() {
        return sequenceOfCourse;
    }

    /**
     * Sets the value of the sequenceOfCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceOfCourse(String value) {
        this.sequenceOfCourse = value;
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
     * Gets the value of the additionalCreditTypeAwarded property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalCreditTypeAwarded() {
        return additionalCreditTypeAwarded;
    }

    /**
     * Sets the value of the additionalCreditTypeAwarded property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalCreditTypeAwarded(String value) {
        this.additionalCreditTypeAwarded = value;
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
     * Gets the value of the alignedWithStateStandards property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlignedWithStateStandards() {
        return alignedWithStateStandards;
    }

    /**
     * Sets the value of the alignedWithStateStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlignedWithStateStandards(String value) {
        this.alignedWithStateStandards = value;
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
