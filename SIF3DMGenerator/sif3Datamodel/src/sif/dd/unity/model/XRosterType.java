
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
 * <p>Java class for xRosterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xRosterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="courseRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="sectionRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="subject" type="{http://www.sifassociation.org/datamodel/na/4.x}xSubjectType" minOccurs="0"/>
 *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdPointerType"/>
 *         &lt;element name="schoolSectionId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="schoolYear" type="{http://www.sifassociation.org/datamodel/na/4.x}xSchoolYearType" minOccurs="0"/>
 *         &lt;element name="meetingTimes" type="{http://www.sifassociation.org/datamodel/na/4.x}xMeetingTimeListType" minOccurs="0"/>
 *         &lt;element name="students" type="{http://www.sifassociation.org/datamodel/na/4.x}xStudentReferenceListType" minOccurs="0"/>
 *         &lt;element name="primaryStaff" type="{http://www.sifassociation.org/datamodel/na/4.x}xStaffReferenceType" minOccurs="0"/>
 *         &lt;element name="otherStaffs" type="{http://www.sifassociation.org/datamodel/na/4.x}xStaffReferenceListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xRosterType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "courseRefId",
    "courseTitle",
    "sectionRefId",
    "subject",
    "schoolRefId",
    "schoolSectionId",
    "schoolYear",
    "meetingTimes",
    "students",
    "primaryStaff",
    "otherStaffs"
})
public class XRosterType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String courseRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String courseTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sectionRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String subject;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schoolSectionId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XMeetingTimeListType meetingTimes;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XStudentReferenceListType students;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XStaffReferenceType primaryStaff;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XStaffReferenceListType otherStaffs;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

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
     * Gets the value of the schoolSectionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolSectionId() {
        return schoolSectionId;
    }

    /**
     * Sets the value of the schoolSectionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolSectionId(String value) {
        this.schoolSectionId = value;
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
     * Gets the value of the meetingTimes property.
     * 
     * @return
     *     possible object is
     *     {@link XMeetingTimeListType }
     *     
     */
    public XMeetingTimeListType getMeetingTimes() {
        return meetingTimes;
    }

    /**
     * Sets the value of the meetingTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMeetingTimeListType }
     *     
     */
    public void setMeetingTimes(XMeetingTimeListType value) {
        this.meetingTimes = value;
    }

    /**
     * Gets the value of the students property.
     * 
     * @return
     *     possible object is
     *     {@link XStudentReferenceListType }
     *     
     */
    public XStudentReferenceListType getStudents() {
        return students;
    }

    /**
     * Sets the value of the students property.
     * 
     * @param value
     *     allowed object is
     *     {@link XStudentReferenceListType }
     *     
     */
    public void setStudents(XStudentReferenceListType value) {
        this.students = value;
    }

    /**
     * Gets the value of the primaryStaff property.
     * 
     * @return
     *     possible object is
     *     {@link XStaffReferenceType }
     *     
     */
    public XStaffReferenceType getPrimaryStaff() {
        return primaryStaff;
    }

    /**
     * Sets the value of the primaryStaff property.
     * 
     * @param value
     *     allowed object is
     *     {@link XStaffReferenceType }
     *     
     */
    public void setPrimaryStaff(XStaffReferenceType value) {
        this.primaryStaff = value;
    }

    /**
     * Gets the value of the otherStaffs property.
     * 
     * @return
     *     possible object is
     *     {@link XStaffReferenceListType }
     *     
     */
    public XStaffReferenceListType getOtherStaffs() {
        return otherStaffs;
    }

    /**
     * Sets the value of the otherStaffs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XStaffReferenceListType }
     *     
     */
    public void setOtherStaffs(XStaffReferenceListType value) {
        this.otherStaffs = value;
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
