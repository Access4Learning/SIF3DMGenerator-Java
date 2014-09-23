
package sif.dd.us32.model;

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
 * Called Course Section in CEDS.
 * 
 * <p>Java class for k12SectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k12SectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="abilityGroupingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="directory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sectionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classroomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classBeginningTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classEndingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classMeetingDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="timetableDayId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classSectionTimeRequiredForCompletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="instructionLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classSectionSingleSexClassStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="receivingLocationOfInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classSectionInstructionalDeliveryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="virtualIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="alignedWithState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="advancedPlacementCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="blendedLearningModelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="careerCluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseApplicableEducationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseCertificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseFundingProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseInteractionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="familyAndConsumerSciencesCourseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ncaaEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="course" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="courseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sequenceOfCourse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="instructionalLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="graduationRequirement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="carnegieUnitCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gpaApplicability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="relatedLearningStandardList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="relatedLearningStandard" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="classSectionAssessmentReportingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="enrollment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classSectionExitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classSectionExitWithdrawalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classSectionEntryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="exitStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gradeLevelWhenCourseTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classSectionEnrollmentStatusStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classSectionEnrollmentStatusEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classSectionEnrollmentStatusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfDaysInAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfDaysAbsent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="responsibleDistrictType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="responsibleSchoolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="studentMark" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="markingPeriodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="studentCourseSectionMarkFinalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="gradeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="midTermMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="gradeValueQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="staff" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="staffMemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="StaffMemberIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assignmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assignmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teacherOfRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teachingAssignmentRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teachingAssignmentContributionPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attendance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="attendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "k12SectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "abilityGroupingStatus",
    "directory",
    "course",
    "enrollment",
    "staff",
    "attendance"
})
public class K12SectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String abilityGroupingStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SectionType.Directory directory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SectionType.Course course;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SectionType.Enrollment enrollment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SectionType.Staff staff;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SectionType.Attendance attendance;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link K12SectionType.Directory }
     *     
     */
    public K12SectionType.Directory getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SectionType.Directory }
     *     
     */
    public void setDirectory(K12SectionType.Directory value) {
        this.directory = value;
    }

    /**
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link K12SectionType.Course }
     *     
     */
    public K12SectionType.Course getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SectionType.Course }
     *     
     */
    public void setCourse(K12SectionType.Course value) {
        this.course = value;
    }

    /**
     * Gets the value of the enrollment property.
     * 
     * @return
     *     possible object is
     *     {@link K12SectionType.Enrollment }
     *     
     */
    public K12SectionType.Enrollment getEnrollment() {
        return enrollment;
    }

    /**
     * Sets the value of the enrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SectionType.Enrollment }
     *     
     */
    public void setEnrollment(K12SectionType.Enrollment value) {
        this.enrollment = value;
    }

    /**
     * Gets the value of the staff property.
     * 
     * @return
     *     possible object is
     *     {@link K12SectionType.Staff }
     *     
     */
    public K12SectionType.Staff getStaff() {
        return staff;
    }

    /**
     * Sets the value of the staff property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SectionType.Staff }
     *     
     */
    public void setStaff(K12SectionType.Staff value) {
        this.staff = value;
    }

    /**
     * Gets the value of the attendance property.
     * 
     * @return
     *     possible object is
     *     {@link K12SectionType.Attendance }
     *     
     */
    public K12SectionType.Attendance getAttendance() {
        return attendance;
    }

    /**
     * Sets the value of the attendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SectionType.Attendance }
     *     
     */
    public void setAttendance(K12SectionType.Attendance value) {
        this.attendance = value;
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
     *         &lt;element name="attendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "attendanceStatus"
    })
    public static class Attendance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String attendanceStatus;

        /**
         * Gets the value of the attendanceStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttendanceStatus() {
            return attendanceStatus;
        }

        /**
         * Sets the value of the attendanceStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttendanceStatus(String value) {
            this.attendanceStatus = value;
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
     *         &lt;element name="courseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sequenceOfCourse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="instructionalLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="graduationRequirement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="carnegieUnitCredit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gpaApplicability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="relatedLearningStandardList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="relatedLearningStandard" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="classSectionAssessmentReportingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "courseIdentifier",
        "courseCodeSystem",
        "courseTitle",
        "sequenceOfCourse",
        "instructionalLevel",
        "creditTypeEarned",
        "graduationRequirement",
        "carnegieUnitCredit",
        "gpaApplicability",
        "relatedLearningStandardList",
        "classSectionAssessmentReportingMethod"
    })
    public static class Course {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String courseIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String courseCodeSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String courseTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sequenceOfCourse;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String instructionalLevel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String creditTypeEarned;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String graduationRequirement;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String carnegieUnitCredit;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String gpaApplicability;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12SectionType.Course.RelatedLearningStandardList relatedLearningStandardList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionAssessmentReportingMethod;

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
         * Gets the value of the instructionalLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstructionalLevel() {
            return instructionalLevel;
        }

        /**
         * Sets the value of the instructionalLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstructionalLevel(String value) {
            this.instructionalLevel = value;
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
         * Gets the value of the graduationRequirement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGraduationRequirement() {
            return graduationRequirement;
        }

        /**
         * Sets the value of the graduationRequirement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGraduationRequirement(String value) {
            this.graduationRequirement = value;
        }

        /**
         * Gets the value of the carnegieUnitCredit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarnegieUnitCredit() {
            return carnegieUnitCredit;
        }

        /**
         * Sets the value of the carnegieUnitCredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarnegieUnitCredit(String value) {
            this.carnegieUnitCredit = value;
        }

        /**
         * Gets the value of the gpaApplicability property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGpaApplicability() {
            return gpaApplicability;
        }

        /**
         * Sets the value of the gpaApplicability property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGpaApplicability(String value) {
            this.gpaApplicability = value;
        }

        /**
         * Gets the value of the relatedLearningStandardList property.
         * 
         * @return
         *     possible object is
         *     {@link K12SectionType.Course.RelatedLearningStandardList }
         *     
         */
        public K12SectionType.Course.RelatedLearningStandardList getRelatedLearningStandardList() {
            return relatedLearningStandardList;
        }

        /**
         * Sets the value of the relatedLearningStandardList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12SectionType.Course.RelatedLearningStandardList }
         *     
         */
        public void setRelatedLearningStandardList(K12SectionType.Course.RelatedLearningStandardList value) {
            this.relatedLearningStandardList = value;
        }

        /**
         * Gets the value of the classSectionAssessmentReportingMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionAssessmentReportingMethod() {
            return classSectionAssessmentReportingMethod;
        }

        /**
         * Sets the value of the classSectionAssessmentReportingMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionAssessmentReportingMethod(String value) {
            this.classSectionAssessmentReportingMethod = value;
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
         *         &lt;element name="relatedLearningStandard" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "relatedLearningStandard"
        })
        public static class RelatedLearningStandardList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<String> relatedLearningStandard;

            /**
             * Gets the value of the relatedLearningStandard property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the relatedLearningStandard property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRelatedLearningStandard().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getRelatedLearningStandard() {
                if (relatedLearningStandard == null) {
                    relatedLearningStandard = new ArrayList<String>();
                }
                return this.relatedLearningStandard;
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
     *         &lt;element name="sectionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classroomId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classBeginningTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classEndingTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classMeetingDays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="timetableDayId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classSectionTimeRequiredForCompletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="instructionLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classSectionSingleSexClassStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="receivingLocationOfInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classSectionInstructionalDeliveryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="virtualIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="alignedWithState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="advancedPlacementCourseCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="blendedLearningModelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="careerCluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseApplicableEducationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseCertificationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseFundingProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseInteractionMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="familyAndConsumerSciencesCourseIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ncaaEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "sectionId",
        "classroomId",
        "sessionBeginDate",
        "sessionEndDate",
        "sessionDesignator",
        "sessionType",
        "classBeginningTime",
        "classEndingTime",
        "classMeetingDays",
        "classPeriod",
        "timetableDayId",
        "classSectionTimeRequiredForCompletion",
        "instructionLanguage",
        "classSectionSingleSexClassStatus",
        "receivingLocationOfInstruction",
        "classSectionInstructionalDeliveryMode",
        "virtualIndicator",
        "alignedWithState",
        "advancedPlacementCourseCode",
        "blendedLearningModelType",
        "careerCluster",
        "courseApplicableEducationLevel",
        "courseCertificationDescription",
        "courseFundingProgram",
        "courseIdentifier",
        "courseInteractionMode",
        "familyAndConsumerSciencesCourseIndicator",
        "ncaaEligibility"
    })
    public static class Directory {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sectionId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classroomId;
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
        protected String timetableDayId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionTimeRequiredForCompletion;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String instructionLanguage;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionSingleSexClassStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String receivingLocationOfInstruction;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionInstructionalDeliveryMode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String virtualIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String alignedWithState;
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
        protected String courseIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String courseInteractionMode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String familyAndConsumerSciencesCourseIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ncaaEligibility;

        /**
         * Gets the value of the sectionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSectionId() {
            return sectionId;
        }

        /**
         * Sets the value of the sectionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSectionId(String value) {
            this.sectionId = value;
        }

        /**
         * Gets the value of the classroomId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassroomId() {
            return classroomId;
        }

        /**
         * Sets the value of the classroomId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassroomId(String value) {
            this.classroomId = value;
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
         * Gets the value of the timetableDayId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTimetableDayId() {
            return timetableDayId;
        }

        /**
         * Sets the value of the timetableDayId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTimetableDayId(String value) {
            this.timetableDayId = value;
        }

        /**
         * Gets the value of the classSectionTimeRequiredForCompletion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionTimeRequiredForCompletion() {
            return classSectionTimeRequiredForCompletion;
        }

        /**
         * Sets the value of the classSectionTimeRequiredForCompletion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionTimeRequiredForCompletion(String value) {
            this.classSectionTimeRequiredForCompletion = value;
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
         * Gets the value of the classSectionSingleSexClassStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionSingleSexClassStatus() {
            return classSectionSingleSexClassStatus;
        }

        /**
         * Sets the value of the classSectionSingleSexClassStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionSingleSexClassStatus(String value) {
            this.classSectionSingleSexClassStatus = value;
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
         * Gets the value of the classSectionInstructionalDeliveryMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionInstructionalDeliveryMode() {
            return classSectionInstructionalDeliveryMode;
        }

        /**
         * Sets the value of the classSectionInstructionalDeliveryMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionInstructionalDeliveryMode(String value) {
            this.classSectionInstructionalDeliveryMode = value;
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
         * Gets the value of the alignedWithState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlignedWithState() {
            return alignedWithState;
        }

        /**
         * Sets the value of the alignedWithState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlignedWithState(String value) {
            this.alignedWithState = value;
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
     *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classSectionExitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classSectionExitWithdrawalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classSectionEntryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="exitStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gradeLevelWhenCourseTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classSectionEnrollmentStatusStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classSectionEnrollmentStatusEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classSectionEnrollmentStatusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfDaysInAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfDaysAbsent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="responsibleDistrictType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="responsibleSchoolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="studentMark" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="markingPeriodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="studentCourseSectionMarkFinalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="gradeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="midTermMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="gradeValueQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "studentId",
        "studentIdSystem",
        "enrollmentEntryDate",
        "classSectionExitType",
        "classSectionExitWithdrawalDate",
        "classSectionEntryType",
        "exitStatus",
        "gradeLevelWhenCourseTaken",
        "classSectionEnrollmentStatusStartDate",
        "classSectionEnrollmentStatusEndDate",
        "classSectionEnrollmentStatusType",
        "numberOfDaysInAttendance",
        "numberOfDaysAbsent",
        "numberOfCreditsAttempted",
        "numberOfCreditsEarned",
        "responsibleDistrictType",
        "responsibleSchoolType",
        "studentMark"
    })
    public static class Enrollment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String studentId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String studentIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String enrollmentEntryDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionExitType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionExitWithdrawalDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionEntryType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String exitStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String gradeLevelWhenCourseTaken;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionEnrollmentStatusStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionEnrollmentStatusEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionEnrollmentStatusType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfDaysInAttendance;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfDaysAbsent;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfCreditsAttempted;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfCreditsEarned;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String responsibleDistrictType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String responsibleSchoolType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12SectionType.Enrollment.StudentMark studentMark;

        /**
         * Gets the value of the studentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStudentId() {
            return studentId;
        }

        /**
         * Sets the value of the studentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStudentId(String value) {
            this.studentId = value;
        }

        /**
         * Gets the value of the studentIdSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStudentIdSystem() {
            return studentIdSystem;
        }

        /**
         * Sets the value of the studentIdSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStudentIdSystem(String value) {
            this.studentIdSystem = value;
        }

        /**
         * Gets the value of the enrollmentEntryDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnrollmentEntryDate() {
            return enrollmentEntryDate;
        }

        /**
         * Sets the value of the enrollmentEntryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnrollmentEntryDate(String value) {
            this.enrollmentEntryDate = value;
        }

        /**
         * Gets the value of the classSectionExitType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionExitType() {
            return classSectionExitType;
        }

        /**
         * Sets the value of the classSectionExitType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionExitType(String value) {
            this.classSectionExitType = value;
        }

        /**
         * Gets the value of the classSectionExitWithdrawalDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionExitWithdrawalDate() {
            return classSectionExitWithdrawalDate;
        }

        /**
         * Sets the value of the classSectionExitWithdrawalDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionExitWithdrawalDate(String value) {
            this.classSectionExitWithdrawalDate = value;
        }

        /**
         * Gets the value of the classSectionEntryType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionEntryType() {
            return classSectionEntryType;
        }

        /**
         * Sets the value of the classSectionEntryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionEntryType(String value) {
            this.classSectionEntryType = value;
        }

        /**
         * Gets the value of the exitStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExitStatus() {
            return exitStatus;
        }

        /**
         * Sets the value of the exitStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExitStatus(String value) {
            this.exitStatus = value;
        }

        /**
         * Gets the value of the gradeLevelWhenCourseTaken property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGradeLevelWhenCourseTaken() {
            return gradeLevelWhenCourseTaken;
        }

        /**
         * Sets the value of the gradeLevelWhenCourseTaken property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGradeLevelWhenCourseTaken(String value) {
            this.gradeLevelWhenCourseTaken = value;
        }

        /**
         * Gets the value of the classSectionEnrollmentStatusStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionEnrollmentStatusStartDate() {
            return classSectionEnrollmentStatusStartDate;
        }

        /**
         * Sets the value of the classSectionEnrollmentStatusStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionEnrollmentStatusStartDate(String value) {
            this.classSectionEnrollmentStatusStartDate = value;
        }

        /**
         * Gets the value of the classSectionEnrollmentStatusEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionEnrollmentStatusEndDate() {
            return classSectionEnrollmentStatusEndDate;
        }

        /**
         * Sets the value of the classSectionEnrollmentStatusEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionEnrollmentStatusEndDate(String value) {
            this.classSectionEnrollmentStatusEndDate = value;
        }

        /**
         * Gets the value of the classSectionEnrollmentStatusType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionEnrollmentStatusType() {
            return classSectionEnrollmentStatusType;
        }

        /**
         * Sets the value of the classSectionEnrollmentStatusType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionEnrollmentStatusType(String value) {
            this.classSectionEnrollmentStatusType = value;
        }

        /**
         * Gets the value of the numberOfDaysInAttendance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfDaysInAttendance() {
            return numberOfDaysInAttendance;
        }

        /**
         * Sets the value of the numberOfDaysInAttendance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfDaysInAttendance(String value) {
            this.numberOfDaysInAttendance = value;
        }

        /**
         * Gets the value of the numberOfDaysAbsent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfDaysAbsent() {
            return numberOfDaysAbsent;
        }

        /**
         * Sets the value of the numberOfDaysAbsent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfDaysAbsent(String value) {
            this.numberOfDaysAbsent = value;
        }

        /**
         * Gets the value of the numberOfCreditsAttempted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfCreditsAttempted() {
            return numberOfCreditsAttempted;
        }

        /**
         * Sets the value of the numberOfCreditsAttempted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfCreditsAttempted(String value) {
            this.numberOfCreditsAttempted = value;
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
         * Gets the value of the responsibleDistrictType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponsibleDistrictType() {
            return responsibleDistrictType;
        }

        /**
         * Sets the value of the responsibleDistrictType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponsibleDistrictType(String value) {
            this.responsibleDistrictType = value;
        }

        /**
         * Gets the value of the responsibleSchoolType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponsibleSchoolType() {
            return responsibleSchoolType;
        }

        /**
         * Sets the value of the responsibleSchoolType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponsibleSchoolType(String value) {
            this.responsibleSchoolType = value;
        }

        /**
         * Gets the value of the studentMark property.
         * 
         * @return
         *     possible object is
         *     {@link K12SectionType.Enrollment.StudentMark }
         *     
         */
        public K12SectionType.Enrollment.StudentMark getStudentMark() {
            return studentMark;
        }

        /**
         * Sets the value of the studentMark property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12SectionType.Enrollment.StudentMark }
         *     
         */
        public void setStudentMark(K12SectionType.Enrollment.StudentMark value) {
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
         *         &lt;element name="markingPeriodName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="studentCourseSectionMarkFinalIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="gradeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="midTermMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="gradeValueQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "markingPeriodName",
            "studentCourseSectionMarkFinalIndicator",
            "gradeEarned",
            "midTermMark",
            "gradeValueQualifier"
        })
        public static class StudentMark {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String markingPeriodName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String studentCourseSectionMarkFinalIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String gradeEarned;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String midTermMark;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String gradeValueQualifier;

            /**
             * Gets the value of the markingPeriodName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarkingPeriodName() {
                return markingPeriodName;
            }

            /**
             * Sets the value of the markingPeriodName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarkingPeriodName(String value) {
                this.markingPeriodName = value;
            }

            /**
             * Gets the value of the studentCourseSectionMarkFinalIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentCourseSectionMarkFinalIndicator() {
                return studentCourseSectionMarkFinalIndicator;
            }

            /**
             * Sets the value of the studentCourseSectionMarkFinalIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentCourseSectionMarkFinalIndicator(String value) {
                this.studentCourseSectionMarkFinalIndicator = value;
            }

            /**
             * Gets the value of the gradeEarned property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGradeEarned() {
                return gradeEarned;
            }

            /**
             * Sets the value of the gradeEarned property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGradeEarned(String value) {
                this.gradeEarned = value;
            }

            /**
             * Gets the value of the midTermMark property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMidTermMark() {
                return midTermMark;
            }

            /**
             * Sets the value of the midTermMark property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMidTermMark(String value) {
                this.midTermMark = value;
            }

            /**
             * Gets the value of the gradeValueQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGradeValueQualifier() {
                return gradeValueQualifier;
            }

            /**
             * Sets the value of the gradeValueQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGradeValueQualifier(String value) {
                this.gradeValueQualifier = value;
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
     *         &lt;element name="staffMemberId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="StaffMemberIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assignmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assignmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teacherOfRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teachingAssignmentRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teachingAssignmentContributionPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "staffMemberId",
        "staffMemberIdSystem",
        "assignmentStartDate",
        "assignmentEndDate",
        "teacherOfRecord",
        "teachingAssignmentRole",
        "teachingAssignmentContributionPercentage"
    })
    public static class Staff {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffMemberId;
        @XmlElement(name = "StaffMemberIdSystem", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffMemberIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assignmentStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assignmentEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teacherOfRecord;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teachingAssignmentRole;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teachingAssignmentContributionPercentage;

        /**
         * Gets the value of the staffMemberId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffMemberId() {
            return staffMemberId;
        }

        /**
         * Sets the value of the staffMemberId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffMemberId(String value) {
            this.staffMemberId = value;
        }

        /**
         * Gets the value of the staffMemberIdSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffMemberIdSystem() {
            return staffMemberIdSystem;
        }

        /**
         * Sets the value of the staffMemberIdSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffMemberIdSystem(String value) {
            this.staffMemberIdSystem = value;
        }

        /**
         * Gets the value of the assignmentStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssignmentStartDate() {
            return assignmentStartDate;
        }

        /**
         * Sets the value of the assignmentStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssignmentStartDate(String value) {
            this.assignmentStartDate = value;
        }

        /**
         * Gets the value of the assignmentEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssignmentEndDate() {
            return assignmentEndDate;
        }

        /**
         * Sets the value of the assignmentEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssignmentEndDate(String value) {
            this.assignmentEndDate = value;
        }

        /**
         * Gets the value of the teacherOfRecord property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeacherOfRecord() {
            return teacherOfRecord;
        }

        /**
         * Sets the value of the teacherOfRecord property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeacherOfRecord(String value) {
            this.teacherOfRecord = value;
        }

        /**
         * Gets the value of the teachingAssignmentRole property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeachingAssignmentRole() {
            return teachingAssignmentRole;
        }

        /**
         * Sets the value of the teachingAssignmentRole property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeachingAssignmentRole(String value) {
            this.teachingAssignmentRole = value;
        }

        /**
         * Gets the value of the teachingAssignmentContributionPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeachingAssignmentContributionPercentage() {
            return teachingAssignmentContributionPercentage;
        }

        /**
         * Sets the value of the teachingAssignmentContributionPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeachingAssignmentContributionPercentage(String value) {
            this.teachingAssignmentContributionPercentage = value;
        }

    }

}
