
package sif.dd.us32.model.report;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An easy-to-use object containing the essential information for a client application that needs information about section rosters and students. Also includes basic information about the section, school, and teachers.
 * 
 * <p>Java class for sectionRosterReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sectionRosterReportType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gSIF_ReportType">
 *       &lt;sequence>
 *         &lt;element name="sectionRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="termDescriptor" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="meetingTimeDescriptor" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="staffAssignmentList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="staffAssignment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="staffPersonRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *                             &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="staffSectionAssociationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *                             &lt;element name="name">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                       &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                       &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="teacherOfRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                             &lt;element name="percentResponsible" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minInclusive value="0"/>
 *                                   &lt;maxInclusive value="100"/>
 *                                   &lt;fractionDigits value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="roleList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="school" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *                   &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element name="courseRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *                   &lt;element name="courseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="studentList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="student" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="studentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *                             &lt;element name="name">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                                       &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                       &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="stateId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="sex" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType" minOccurs="0"/>
 *                             &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="gradeLevel" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sectionRosterReportType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "sectionRefId",
    "localId",
    "name",
    "schoolYear",
    "termDescriptor",
    "meetingTimeDescriptor",
    "staffAssignmentList",
    "school",
    "course",
    "studentList"
})
public class SectionRosterReportType
    extends GSIFReportType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sectionRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String termDescriptor;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Object meetingTimeDescriptor;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SectionRosterReportType.StaffAssignmentList staffAssignmentList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SectionRosterReportType.School school;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected SectionRosterReportType.Course course;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected SectionRosterReportType.StudentList studentList;

    /**
     * Gets the value of the sectionRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionRefId() {
        return sectionRefId;
    }

    /**
     * Sets the value of the sectionRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionRefId(String value) {
        this.sectionRefId = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     * Gets the value of the termDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermDescriptor() {
        return termDescriptor;
    }

    /**
     * Sets the value of the termDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermDescriptor(String value) {
        this.termDescriptor = value;
    }

    /**
     * Gets the value of the meetingTimeDescriptor property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getMeetingTimeDescriptor() {
        return meetingTimeDescriptor;
    }

    /**
     * Sets the value of the meetingTimeDescriptor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setMeetingTimeDescriptor(Object value) {
        this.meetingTimeDescriptor = value;
    }

    /**
     * Gets the value of the staffAssignmentList property.
     * 
     * @return
     *     possible object is
     *     {@link SectionRosterReportType.StaffAssignmentList }
     *     
     */
    public SectionRosterReportType.StaffAssignmentList getStaffAssignmentList() {
        return staffAssignmentList;
    }

    /**
     * Sets the value of the staffAssignmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionRosterReportType.StaffAssignmentList }
     *     
     */
    public void setStaffAssignmentList(SectionRosterReportType.StaffAssignmentList value) {
        this.staffAssignmentList = value;
    }

    /**
     * Gets the value of the school property.
     * 
     * @return
     *     possible object is
     *     {@link SectionRosterReportType.School }
     *     
     */
    public SectionRosterReportType.School getSchool() {
        return school;
    }

    /**
     * Sets the value of the school property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionRosterReportType.School }
     *     
     */
    public void setSchool(SectionRosterReportType.School value) {
        this.school = value;
    }

    /**
     * Gets the value of the course property.
     * 
     * @return
     *     possible object is
     *     {@link SectionRosterReportType.Course }
     *     
     */
    public SectionRosterReportType.Course getCourse() {
        return course;
    }

    /**
     * Sets the value of the course property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionRosterReportType.Course }
     *     
     */
    public void setCourse(SectionRosterReportType.Course value) {
        this.course = value;
    }

    /**
     * Gets the value of the studentList property.
     * 
     * @return
     *     possible object is
     *     {@link SectionRosterReportType.StudentList }
     *     
     */
    public SectionRosterReportType.StudentList getStudentList() {
        return studentList;
    }

    /**
     * Sets the value of the studentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionRosterReportType.StudentList }
     *     
     */
    public void setStudentList(SectionRosterReportType.StudentList value) {
        this.studentList = value;
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
     *         &lt;element name="courseRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
     *         &lt;element name="courseCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "courseRefId",
        "courseCode",
        "courseTitle",
        "any"
    })
    public static class Course {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String courseRefId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String courseCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String courseTitle;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the courseRefId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCourseRefId() {
            return courseRefId;
        }

        /**
         * Sets the value of the courseRefId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCourseRefId(String value) {
            this.courseRefId = value;
        }

        /**
         * Gets the value of the courseCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCourseCode() {
            return courseCode;
        }

        /**
         * Sets the value of the courseCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCourseCode(String value) {
            this.courseCode = value;
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
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
     *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
     *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "schoolRefId",
        "schoolName",
        "any"
    })
    public static class School {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String schoolRefId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String schoolName;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the schoolRefId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolRefId() {
            return schoolRefId;
        }

        /**
         * Sets the value of the schoolRefId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolRefId(String value) {
            this.schoolRefId = value;
        }

        /**
         * Gets the value of the schoolName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolName() {
            return schoolName;
        }

        /**
         * Sets the value of the schoolName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolName(String value) {
            this.schoolName = value;
        }

        /**
         * Gets the value of the any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getAny() {
            if (any == null) {
                any = new ArrayList<Object>();
            }
            return this.any;
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
     *         &lt;element name="staffAssignment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="staffPersonRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
     *                   &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="staffSectionAssociationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
     *                   &lt;element name="name">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                             &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                             &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="teacherOfRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
     *                   &lt;element name="percentResponsible" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;minInclusive value="0"/>
     *                         &lt;maxInclusive value="100"/>
     *                         &lt;fractionDigits value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="roleList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "staffAssignment"
    })
    public static class StaffAssignmentList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<SectionRosterReportType.StaffAssignmentList.StaffAssignment> staffAssignment;

        /**
         * Gets the value of the staffAssignment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the staffAssignment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStaffAssignment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SectionRosterReportType.StaffAssignmentList.StaffAssignment }
         * 
         * 
         */
        public List<SectionRosterReportType.StaffAssignmentList.StaffAssignment> getStaffAssignment() {
            if (staffAssignment == null) {
                staffAssignment = new ArrayList<SectionRosterReportType.StaffAssignmentList.StaffAssignment>();
            }
            return this.staffAssignment;
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
         *         &lt;element name="staffPersonRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
         *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *         &lt;element name="staffSectionAssociationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
         *         &lt;element name="name">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                   &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                   &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="teacherOfRecord" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
         *         &lt;element name="percentResponsible" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;minInclusive value="0"/>
         *               &lt;maxInclusive value="100"/>
         *               &lt;fractionDigits value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="roleList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "staffPersonRefId",
            "localId",
            "staffSectionAssociationRefId",
            "name",
            "teacherOfRecord",
            "percentResponsible",
            "roleList",
            "startDate",
            "endDate",
            "any"
        })
        public static class StaffAssignment {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String staffPersonRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String localId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String staffSectionAssociationRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected SectionRosterReportType.StaffAssignmentList.StaffAssignment.Name name;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected boolean teacherOfRecord;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal percentResponsible;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected SectionRosterReportType.StaffAssignmentList.StaffAssignment.RoleList roleList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar startDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar endDate;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the staffPersonRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStaffPersonRefId() {
                return staffPersonRefId;
            }

            /**
             * Sets the value of the staffPersonRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStaffPersonRefId(String value) {
                this.staffPersonRefId = value;
            }

            /**
             * Gets the value of the localId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocalId() {
                return localId;
            }

            /**
             * Sets the value of the localId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocalId(String value) {
                this.localId = value;
            }

            /**
             * Gets the value of the staffSectionAssociationRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStaffSectionAssociationRefId() {
                return staffSectionAssociationRefId;
            }

            /**
             * Sets the value of the staffSectionAssociationRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStaffSectionAssociationRefId(String value) {
                this.staffSectionAssociationRefId = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link SectionRosterReportType.StaffAssignmentList.StaffAssignment.Name }
             *     
             */
            public SectionRosterReportType.StaffAssignmentList.StaffAssignment.Name getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link SectionRosterReportType.StaffAssignmentList.StaffAssignment.Name }
             *     
             */
            public void setName(SectionRosterReportType.StaffAssignmentList.StaffAssignment.Name value) {
                this.name = value;
            }

            /**
             * Gets the value of the teacherOfRecord property.
             * 
             */
            public boolean isTeacherOfRecord() {
                return teacherOfRecord;
            }

            /**
             * Sets the value of the teacherOfRecord property.
             * 
             */
            public void setTeacherOfRecord(boolean value) {
                this.teacherOfRecord = value;
            }

            /**
             * Gets the value of the percentResponsible property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getPercentResponsible() {
                return percentResponsible;
            }

            /**
             * Sets the value of the percentResponsible property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setPercentResponsible(BigDecimal value) {
                this.percentResponsible = value;
            }

            /**
             * Gets the value of the roleList property.
             * 
             * @return
             *     possible object is
             *     {@link SectionRosterReportType.StaffAssignmentList.StaffAssignment.RoleList }
             *     
             */
            public SectionRosterReportType.StaffAssignmentList.StaffAssignment.RoleList getRoleList() {
                return roleList;
            }

            /**
             * Sets the value of the roleList property.
             * 
             * @param value
             *     allowed object is
             *     {@link SectionRosterReportType.StaffAssignmentList.StaffAssignment.RoleList }
             *     
             */
            public void setRoleList(SectionRosterReportType.StaffAssignmentList.StaffAssignment.RoleList value) {
                this.roleList = value;
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
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
             *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                "prefix",
                "givenName",
                "middleName",
                "familyName",
                "suffix"
            })
            public static class Name {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String prefix;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String givenName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String middleName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String familyName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String suffix;

                /**
                 * Gets the value of the prefix property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPrefix() {
                    return prefix;
                }

                /**
                 * Sets the value of the prefix property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPrefix(String value) {
                    this.prefix = value;
                }

                /**
                 * Gets the value of the givenName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGivenName() {
                    return givenName;
                }

                /**
                 * Sets the value of the givenName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGivenName(String value) {
                    this.givenName = value;
                }

                /**
                 * Gets the value of the middleName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMiddleName() {
                    return middleName;
                }

                /**
                 * Sets the value of the middleName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMiddleName(String value) {
                    this.middleName = value;
                }

                /**
                 * Gets the value of the familyName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFamilyName() {
                    return familyName;
                }

                /**
                 * Sets the value of the familyName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFamilyName(String value) {
                    this.familyName = value;
                }

                /**
                 * Gets the value of the suffix property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSuffix() {
                    return suffix;
                }

                /**
                 * Sets the value of the suffix property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSuffix(String value) {
                    this.suffix = value;
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
             *         &lt;element name="role" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
                "role"
            })
            public static class RoleList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected List<String> role;

                /**
                 * Gets the value of the role property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the role property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRole().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getRole() {
                    if (role == null) {
                        role = new ArrayList<String>();
                    }
                    return this.role;
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
     *         &lt;element name="student" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="studentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
     *                   &lt;element name="name">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                             &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                             &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="stateId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="sex" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType" minOccurs="0"/>
     *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="gradeLevel" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
        "student"
    })
    public static class StudentList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<SectionRosterReportType.StudentList.Student> student;

        /**
         * Gets the value of the student property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the student property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStudent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SectionRosterReportType.StudentList.Student }
         * 
         * 
         */
        public List<SectionRosterReportType.StudentList.Student> getStudent() {
            if (student == null) {
                student = new ArrayList<SectionRosterReportType.StudentList.Student>();
            }
            return this.student;
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
         *         &lt;element name="studentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
         *         &lt;element name="name">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *                   &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                   &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="localId" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *         &lt;element name="stateId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="sex" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType" minOccurs="0"/>
         *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="gradeLevel" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "studentRefId",
            "name",
            "localId",
            "stateId",
            "sex",
            "birthDate",
            "gradeLevel",
            "startDate",
            "endDate",
            "any"
        })
        public static class Student {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true, nillable = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String studentRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected SectionRosterReportType.StudentList.Student.Name name;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String localId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String stateId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GSexusType sex;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar birthDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String gradeLevel;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar startDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar endDate;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the studentRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentRefId() {
                return studentRefId;
            }

            /**
             * Sets the value of the studentRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentRefId(String value) {
                this.studentRefId = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link SectionRosterReportType.StudentList.Student.Name }
             *     
             */
            public SectionRosterReportType.StudentList.Student.Name getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link SectionRosterReportType.StudentList.Student.Name }
             *     
             */
            public void setName(SectionRosterReportType.StudentList.Student.Name value) {
                this.name = value;
            }

            /**
             * Gets the value of the localId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocalId() {
                return localId;
            }

            /**
             * Sets the value of the localId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocalId(String value) {
                this.localId = value;
            }

            /**
             * Gets the value of the stateId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateId() {
                return stateId;
            }

            /**
             * Sets the value of the stateId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateId(String value) {
                this.stateId = value;
            }

            /**
             * Gets the value of the sex property.
             * 
             * @return
             *     possible object is
             *     {@link GSexusType }
             *     
             */
            public GSexusType getSex() {
                return sex;
            }

            /**
             * Sets the value of the sex property.
             * 
             * @param value
             *     allowed object is
             *     {@link GSexusType }
             *     
             */
            public void setSex(GSexusType value) {
                this.sex = value;
            }

            /**
             * Gets the value of the birthDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getBirthDate() {
                return birthDate;
            }

            /**
             * Sets the value of the birthDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setBirthDate(XMLGregorianCalendar value) {
                this.birthDate = value;
            }

            /**
             * Gets the value of the gradeLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGradeLevel() {
                return gradeLevel;
            }

            /**
             * Sets the value of the gradeLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGradeLevel(String value) {
                this.gradeLevel = value;
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
             * Gets the value of the any property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the any property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAny().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Object }
             * 
             * 
             */
            public List<Object> getAny() {
                if (any == null) {
                    any = new ArrayList<Object>();
                }
                return this.any;
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
             *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
             *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                "givenName",
                "middleName",
                "familyName",
                "suffix"
            })
            public static class Name {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String givenName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String middleName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected String familyName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String suffix;

                /**
                 * Gets the value of the givenName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGivenName() {
                    return givenName;
                }

                /**
                 * Sets the value of the givenName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGivenName(String value) {
                    this.givenName = value;
                }

                /**
                 * Gets the value of the middleName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMiddleName() {
                    return middleName;
                }

                /**
                 * Sets the value of the middleName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMiddleName(String value) {
                    this.middleName = value;
                }

                /**
                 * Gets the value of the familyName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFamilyName() {
                    return familyName;
                }

                /**
                 * Sets the value of the familyName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFamilyName(String value) {
                    this.familyName = value;
                }

                /**
                 * Gets the value of the suffix property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSuffix() {
                    return suffix;
                }

                /**
                 * Sets the value of the suffix property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSuffix(String value) {
                    this.suffix = value;
                }

            }

        }

    }

}
