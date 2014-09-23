
package sif.dd.us32.model.ceds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for psSectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="psSectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseAcademicGradeScaleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCIPCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCreditBasisType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseCreditLevelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseDropDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseGPAApplicability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseHonorsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseInstructionMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseInstructionSiteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseInstructionSiteType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseLevelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseNarrativeExplanationGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseRepeatCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="courseSectionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ncesCollegeCourseMapCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="originalCourseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="overrideSchoolCourseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="course" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="courseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseSubjectAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseCreditUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="creditValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="agencyCourseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="enrollmentList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enrollment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="studentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="studentIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="courseOverrideSchool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="degreeApplicability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="academicGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numberOfCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="courseQualityPointsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="courseAddDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="studentMark" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="academicGradeStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="instructor" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="staffMemberIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffMemberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "psSectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "apCourseCode",
    "courseAcademicGradeScaleCode",
    "courseCIPCode",
    "courseCreditBasisType",
    "courseCreditLevelType",
    "courseDropDate",
    "courseGPAApplicability",
    "courseHonorsType",
    "courseInstructionMethod",
    "courseInstructionSiteName",
    "courseInstructionSiteType",
    "courseLevelType",
    "courseNarrativeExplanationGrade",
    "courseNumber",
    "courseRepeatCode",
    "courseSectionNumber",
    "ncesCollegeCourseMapCode",
    "originalCourseIdentifier",
    "overrideSchoolCourseNumber",
    "course",
    "enrollmentList",
    "instructor"
})
public class PsSectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String apCourseCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseAcademicGradeScaleCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCIPCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCreditBasisType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseCreditLevelType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseDropDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseGPAApplicability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseHonorsType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseInstructionMethod;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseInstructionSiteName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseInstructionSiteType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseLevelType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseNarrativeExplanationGrade;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseRepeatCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String courseSectionNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String ncesCollegeCourseMapCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String originalCourseIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String overrideSchoolCourseNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsSectionType.Course course;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsSectionType.EnrollmentList enrollmentList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsSectionType.Instructor instructor;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the apCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApCourseCode() {
        return apCourseCode;
    }

    /**
     * Sets the value of the apCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApCourseCode(String value) {
        this.apCourseCode = value;
    }

    /**
     * Gets the value of the courseAcademicGradeScaleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseAcademicGradeScaleCode() {
        return courseAcademicGradeScaleCode;
    }

    /**
     * Sets the value of the courseAcademicGradeScaleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseAcademicGradeScaleCode(String value) {
        this.courseAcademicGradeScaleCode = value;
    }

    /**
     * Gets the value of the courseCIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCIPCode() {
        return courseCIPCode;
    }

    /**
     * Sets the value of the courseCIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCIPCode(String value) {
        this.courseCIPCode = value;
    }

    /**
     * Gets the value of the courseCreditBasisType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCreditBasisType() {
        return courseCreditBasisType;
    }

    /**
     * Sets the value of the courseCreditBasisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCreditBasisType(String value) {
        this.courseCreditBasisType = value;
    }

    /**
     * Gets the value of the courseCreditLevelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCreditLevelType() {
        return courseCreditLevelType;
    }

    /**
     * Sets the value of the courseCreditLevelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCreditLevelType(String value) {
        this.courseCreditLevelType = value;
    }

    /**
     * Gets the value of the courseDropDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseDropDate() {
        return courseDropDate;
    }

    /**
     * Sets the value of the courseDropDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseDropDate(String value) {
        this.courseDropDate = value;
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
     * Gets the value of the courseHonorsType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseHonorsType() {
        return courseHonorsType;
    }

    /**
     * Sets the value of the courseHonorsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseHonorsType(String value) {
        this.courseHonorsType = value;
    }

    /**
     * Gets the value of the courseInstructionMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseInstructionMethod() {
        return courseInstructionMethod;
    }

    /**
     * Sets the value of the courseInstructionMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseInstructionMethod(String value) {
        this.courseInstructionMethod = value;
    }

    /**
     * Gets the value of the courseInstructionSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseInstructionSiteName() {
        return courseInstructionSiteName;
    }

    /**
     * Sets the value of the courseInstructionSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseInstructionSiteName(String value) {
        this.courseInstructionSiteName = value;
    }

    /**
     * Gets the value of the courseInstructionSiteType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseInstructionSiteType() {
        return courseInstructionSiteType;
    }

    /**
     * Sets the value of the courseInstructionSiteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseInstructionSiteType(String value) {
        this.courseInstructionSiteType = value;
    }

    /**
     * Gets the value of the courseLevelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseLevelType() {
        return courseLevelType;
    }

    /**
     * Sets the value of the courseLevelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseLevelType(String value) {
        this.courseLevelType = value;
    }

    /**
     * Gets the value of the courseNarrativeExplanationGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseNarrativeExplanationGrade() {
        return courseNarrativeExplanationGrade;
    }

    /**
     * Sets the value of the courseNarrativeExplanationGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseNarrativeExplanationGrade(String value) {
        this.courseNarrativeExplanationGrade = value;
    }

    /**
     * Gets the value of the courseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Sets the value of the courseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseNumber(String value) {
        this.courseNumber = value;
    }

    /**
     * Gets the value of the courseRepeatCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseRepeatCode() {
        return courseRepeatCode;
    }

    /**
     * Sets the value of the courseRepeatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseRepeatCode(String value) {
        this.courseRepeatCode = value;
    }

    /**
     * Gets the value of the courseSectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseSectionNumber() {
        return courseSectionNumber;
    }

    /**
     * Sets the value of the courseSectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseSectionNumber(String value) {
        this.courseSectionNumber = value;
    }

    /**
     * Gets the value of the ncesCollegeCourseMapCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNcesCollegeCourseMapCode() {
        return ncesCollegeCourseMapCode;
    }

    /**
     * Sets the value of the ncesCollegeCourseMapCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNcesCollegeCourseMapCode(String value) {
        this.ncesCollegeCourseMapCode = value;
    }

    /**
     * Gets the value of the originalCourseIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCourseIdentifier() {
        return originalCourseIdentifier;
    }

    /**
     * Sets the value of the originalCourseIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCourseIdentifier(String value) {
        this.originalCourseIdentifier = value;
    }

    /**
     * Gets the value of the overrideSchoolCourseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideSchoolCourseNumber() {
        return overrideSchoolCourseNumber;
    }

    /**
     * Sets the value of the overrideSchoolCourseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideSchoolCourseNumber(String value) {
        this.overrideSchoolCourseNumber = value;
    }

    /**
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link PsSectionType.Course }
     *     
     */
    public PsSectionType.Course getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsSectionType.Course }
     *     
     */
    public void setCourse(PsSectionType.Course value) {
        this.course = value;
    }

    /**
     * Gets the value of the enrollmentList property.
     * 
     * @return
     *     possible object is
     *     {@link PsSectionType.EnrollmentList }
     *     
     */
    public PsSectionType.EnrollmentList getEnrollmentList() {
        return enrollmentList;
    }

    /**
     * Sets the value of the enrollmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsSectionType.EnrollmentList }
     *     
     */
    public void setEnrollmentList(PsSectionType.EnrollmentList value) {
        this.enrollmentList = value;
    }

    /**
     * Gets the value of the instructor property.
     * 
     * @return
     *     possible object is
     *     {@link PsSectionType.Instructor }
     *     
     */
    public PsSectionType.Instructor getInstructor() {
        return instructor;
    }

    /**
     * Sets the value of the instructor property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsSectionType.Instructor }
     *     
     */
    public void setInstructor(PsSectionType.Instructor value) {
        this.instructor = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="courseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseSubjectAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseCreditUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="creditValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="beginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="agencyCourseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "courseId",
        "courseSubjectAbbreviation",
        "courseTitle",
        "courseCreditUnits",
        "creditValue",
        "beginDate",
        "endDate",
        "agencyCourseIdentifier"
    })
    public static class Course {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String courseId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String courseSubjectAbbreviation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String courseTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String courseCreditUnits;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String creditValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String beginDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String endDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String agencyCourseIdentifier;

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
         * Gets the value of the courseSubjectAbbreviation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCourseSubjectAbbreviation() {
            return courseSubjectAbbreviation;
        }

        /**
         * Sets the value of the courseSubjectAbbreviation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCourseSubjectAbbreviation(String value) {
            this.courseSubjectAbbreviation = value;
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
         * Gets the value of the creditValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditValue() {
            return creditValue;
        }

        /**
         * Sets the value of the creditValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditValue(String value) {
            this.creditValue = value;
        }

        /**
         * Gets the value of the beginDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBeginDate() {
            return beginDate;
        }

        /**
         * Sets the value of the beginDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBeginDate(String value) {
            this.beginDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDate(String value) {
            this.endDate = value;
        }

        /**
         * Gets the value of the agencyCourseIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgencyCourseIdentifier() {
            return agencyCourseIdentifier;
        }

        /**
         * Sets the value of the agencyCourseIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgencyCourseIdentifier(String value) {
            this.agencyCourseIdentifier = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="enrollment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="studentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="studentIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="courseOverrideSchool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="degreeApplicability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="academicGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numberOfCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="courseQualityPointsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="courseAddDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="studentMark" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="academicGradeStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enrollment"
    })
    public static class EnrollmentList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<PsSectionType.EnrollmentList.Enrollment> enrollment;

        /**
         * Gets the value of the enrollment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enrollment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnrollment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PsSectionType.EnrollmentList.Enrollment }
         * 
         * 
         */
        public List<PsSectionType.EnrollmentList.Enrollment> getEnrollment() {
            if (enrollment == null) {
                enrollment = new ArrayList<PsSectionType.EnrollmentList.Enrollment>();
            }
            return this.enrollment;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="studentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="studentIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="courseOverrideSchool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="degreeApplicability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="academicGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numberOfCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="courseQualityPointsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="courseAddDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="studentMark" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="academicGradeStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "studentIdentifier",
            "studentIdentificationSystem",
            "courseOverrideSchool",
            "degreeApplicability",
            "academicGrade",
            "numberOfCreditsEarned",
            "courseQualityPointsEarned",
            "courseAddDate",
            "socialSecurityNumber",
            "studentMark"
        })
        public static class Enrollment {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String studentIdentifier;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String studentIdentificationSystem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String courseOverrideSchool;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String degreeApplicability;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String academicGrade;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String numberOfCreditsEarned;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String courseQualityPointsEarned;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String courseAddDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String socialSecurityNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected PsSectionType.EnrollmentList.Enrollment.StudentMark studentMark;

            /**
             * Gets the value of the studentIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentIdentifier() {
                return studentIdentifier;
            }

            /**
             * Sets the value of the studentIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentIdentifier(String value) {
                this.studentIdentifier = value;
            }

            /**
             * Gets the value of the studentIdentificationSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentIdentificationSystem() {
                return studentIdentificationSystem;
            }

            /**
             * Sets the value of the studentIdentificationSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentIdentificationSystem(String value) {
                this.studentIdentificationSystem = value;
            }

            /**
             * Gets the value of the courseOverrideSchool property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCourseOverrideSchool() {
                return courseOverrideSchool;
            }

            /**
             * Sets the value of the courseOverrideSchool property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCourseOverrideSchool(String value) {
                this.courseOverrideSchool = value;
            }

            /**
             * Gets the value of the degreeApplicability property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDegreeApplicability() {
                return degreeApplicability;
            }

            /**
             * Sets the value of the degreeApplicability property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDegreeApplicability(String value) {
                this.degreeApplicability = value;
            }

            /**
             * Gets the value of the academicGrade property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAcademicGrade() {
                return academicGrade;
            }

            /**
             * Sets the value of the academicGrade property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAcademicGrade(String value) {
                this.academicGrade = value;
            }

            /**
             * Gets the value of the numberOfCreditsEarned property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumberOfCreditsEarned() {
                return numberOfCreditsEarned;
            }

            /**
             * Sets the value of the numberOfCreditsEarned property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumberOfCreditsEarned(String value) {
                this.numberOfCreditsEarned = value;
            }

            /**
             * Gets the value of the courseQualityPointsEarned property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCourseQualityPointsEarned() {
                return courseQualityPointsEarned;
            }

            /**
             * Sets the value of the courseQualityPointsEarned property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCourseQualityPointsEarned(String value) {
                this.courseQualityPointsEarned = value;
            }

            /**
             * Gets the value of the courseAddDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCourseAddDate() {
                return courseAddDate;
            }

            /**
             * Sets the value of the courseAddDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCourseAddDate(String value) {
                this.courseAddDate = value;
            }

            /**
             * Gets the value of the socialSecurityNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSocialSecurityNumber() {
                return socialSecurityNumber;
            }

            /**
             * Sets the value of the socialSecurityNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSocialSecurityNumber(String value) {
                this.socialSecurityNumber = value;
            }

            /**
             * Gets the value of the studentMark property.
             * 
             * @return
             *     possible object is
             *     {@link PsSectionType.EnrollmentList.Enrollment.StudentMark }
             *     
             */
            public PsSectionType.EnrollmentList.Enrollment.StudentMark getStudentMark() {
                return studentMark;
            }

            /**
             * Sets the value of the studentMark property.
             * 
             * @param value
             *     allowed object is
             *     {@link PsSectionType.EnrollmentList.Enrollment.StudentMark }
             *     
             */
            public void setStudentMark(PsSectionType.EnrollmentList.Enrollment.StudentMark value) {
                this.studentMark = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="academicGradeStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "academicGradeStatusCode"
            })
            public static class StudentMark {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String academicGradeStatusCode;

                /**
                 * Gets the value of the academicGradeStatusCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAcademicGradeStatusCode() {
                    return academicGradeStatusCode;
                }

                /**
                 * Sets the value of the academicGradeStatusCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAcademicGradeStatusCode(String value) {
                    this.academicGradeStatusCode = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="staffMemberIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffMemberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "staffMemberIdentificationSystem",
        "staffMemberIdentifier"
    })
    public static class Instructor {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffMemberIdentificationSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffMemberIdentifier;

        /**
         * Gets the value of the staffMemberIdentificationSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffMemberIdentificationSystem() {
            return staffMemberIdentificationSystem;
        }

        /**
         * Sets the value of the staffMemberIdentificationSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffMemberIdentificationSystem(String value) {
            this.staffMemberIdentificationSystem = value;
        }

        /**
         * Gets the value of the staffMemberIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffMemberIdentifier() {
            return staffMemberIdentifier;
        }

        /**
         * Sets the value of the staffMemberIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffMemberIdentifier(String value) {
            this.staffMemberIdentifier = value;
        }

    }

}
