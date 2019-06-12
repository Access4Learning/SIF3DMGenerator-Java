
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
 * <p>Java class for CalendarDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalendarDateType" type="{http://www.sifassociation.org/datamodel/na/4.x}CalendarDateInfoType"/>
 *         &lt;element name="CalendarDateNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="StudentAttendance" type="{http://www.sifassociation.org/datamodel/na/4.x}AttendanceInfoType" minOccurs="0"/>
 *         &lt;element name="TeacherAttendance" type="{http://www.sifassociation.org/datamodel/na/4.x}AttendanceInfoType" minOccurs="0"/>
 *         &lt;element name="AdministratorAttendance" type="{http://www.sifassociation.org/datamodel/na/4.x}AttendanceInfoType" minOccurs="0"/>
 *         &lt;element name="BellScheduleDayList" type="{http://www.sifassociation.org/datamodel/na/4.x}BellScheduleDayListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="CalendarSummaryRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="SchoolInfoRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="SchoolYear" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolYearType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarDateType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "calendarDateType",
    "calendarDateNumber",
    "studentAttendance",
    "teacherAttendance",
    "administratorAttendance",
    "bellScheduleDayList",
    "sifMetadata",
    "sifExtendedElements"
})
public class CalendarDate {

    @XmlElement(name = "CalendarDateType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected CalendarDateInfoType calendarDateType;
    @XmlElement(name = "CalendarDateNumber", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long calendarDateNumber;
    @XmlElement(name = "StudentAttendance", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AttendanceInfoType studentAttendance;
    @XmlElement(name = "TeacherAttendance", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AttendanceInfoType teacherAttendance;
    @XmlElement(name = "AdministratorAttendance", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AttendanceInfoType administratorAttendance;
    @XmlElement(name = "BellScheduleDayList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BellScheduleDayListType bellScheduleDayList;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "Date", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "CalendarSummaryRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String calendarSummaryRefId;
    @XmlAttribute(name = "SchoolInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlAttribute(name = "SchoolYear", required = true)
    protected XMLGregorianCalendar schoolYear;

    /**
     * Gets the value of the calendarDateType property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDateInfoType }
     *     
     */
    public CalendarDateInfoType getCalendarDateType() {
        return calendarDateType;
    }

    /**
     * Sets the value of the calendarDateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDateInfoType }
     *     
     */
    public void setCalendarDateType(CalendarDateInfoType value) {
        this.calendarDateType = value;
    }

    /**
     * Gets the value of the calendarDateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCalendarDateNumber() {
        return calendarDateNumber;
    }

    /**
     * Sets the value of the calendarDateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCalendarDateNumber(Long value) {
        this.calendarDateNumber = value;
    }

    /**
     * Gets the value of the studentAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceInfoType }
     *     
     */
    public AttendanceInfoType getStudentAttendance() {
        return studentAttendance;
    }

    /**
     * Sets the value of the studentAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceInfoType }
     *     
     */
    public void setStudentAttendance(AttendanceInfoType value) {
        this.studentAttendance = value;
    }

    /**
     * Gets the value of the teacherAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceInfoType }
     *     
     */
    public AttendanceInfoType getTeacherAttendance() {
        return teacherAttendance;
    }

    /**
     * Sets the value of the teacherAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceInfoType }
     *     
     */
    public void setTeacherAttendance(AttendanceInfoType value) {
        this.teacherAttendance = value;
    }

    /**
     * Gets the value of the administratorAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceInfoType }
     *     
     */
    public AttendanceInfoType getAdministratorAttendance() {
        return administratorAttendance;
    }

    /**
     * Sets the value of the administratorAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceInfoType }
     *     
     */
    public void setAdministratorAttendance(AttendanceInfoType value) {
        this.administratorAttendance = value;
    }

    /**
     * Gets the value of the bellScheduleDayList property.
     * 
     * @return
     *     possible object is
     *     {@link BellScheduleDayListType }
     *     
     */
    public BellScheduleDayListType getBellScheduleDayList() {
        return bellScheduleDayList;
    }

    /**
     * Sets the value of the bellScheduleDayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BellScheduleDayListType }
     *     
     */
    public void setBellScheduleDayList(BellScheduleDayListType value) {
        this.bellScheduleDayList = value;
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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the calendarSummaryRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarSummaryRefId() {
        return calendarSummaryRefId;
    }

    /**
     * Sets the value of the calendarSummaryRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarSummaryRefId(String value) {
        this.calendarSummaryRefId = value;
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

}
