
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="CalendarSummaryRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolYear" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolYearType" minOccurs="0"/>
 *         &lt;element name="CalendarDateType" type="{http://www.sifassociation.org/datamodel/au/3.4}CalendarDateInfoType" minOccurs="0"/>
 *         &lt;element name="CalendarDateNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="StudentAttendance" type="{http://www.sifassociation.org/datamodel/au/3.4}AttendanceInfoType" minOccurs="0"/>
 *         &lt;element name="TeacherAttendance" type="{http://www.sifassociation.org/datamodel/au/3.4}AttendanceInfoType" minOccurs="0"/>
 *         &lt;element name="AdministratorAttendance" type="{http://www.sifassociation.org/datamodel/au/3.4}AttendanceInfoType" minOccurs="0"/>
 *         &lt;element name="LocalCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalCodeListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CalendarDateRefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarDateType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "date",
    "calendarSummaryRefId",
    "schoolInfoRefId",
    "schoolYear",
    "calendarDateType",
    "calendarDateNumber",
    "studentAttendance",
    "teacherAttendance",
    "administratorAttendance",
    "localCodeList",
    "sifMetadata",
    "sifExtendedElements"
})
public class CalendarDate {

    @XmlElement(name = "Date", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "CalendarSummaryRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calendarSummaryRefId;
    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(name = "SchoolYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(name = "CalendarDateType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected CalendarDateInfoType calendarDateType;
    @XmlElementRef(name = "CalendarDateNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> calendarDateNumber;
    @XmlElementRef(name = "StudentAttendance", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AttendanceInfoType> studentAttendance;
    @XmlElementRef(name = "TeacherAttendance", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AttendanceInfoType> teacherAttendance;
    @XmlElementRef(name = "AdministratorAttendance", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AttendanceInfoType> administratorAttendance;
    @XmlElementRef(name = "LocalCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalCodeListType> localCodeList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "CalendarDateRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String calendarDateRefId;

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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalendarSummaryRefId() {
        return calendarSummaryRefId;
    }

    /**
     * Sets the value of the calendarSummaryRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalendarSummaryRefId(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCalendarDateNumber() {
        return calendarDateNumber;
    }

    /**
     * Sets the value of the calendarDateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCalendarDateNumber(JAXBElement<Long> value) {
        this.calendarDateNumber = value;
    }

    /**
     * Gets the value of the studentAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AttendanceInfoType }{@code >}
     *     
     */
    public JAXBElement<AttendanceInfoType> getStudentAttendance() {
        return studentAttendance;
    }

    /**
     * Sets the value of the studentAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AttendanceInfoType }{@code >}
     *     
     */
    public void setStudentAttendance(JAXBElement<AttendanceInfoType> value) {
        this.studentAttendance = value;
    }

    /**
     * Gets the value of the teacherAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AttendanceInfoType }{@code >}
     *     
     */
    public JAXBElement<AttendanceInfoType> getTeacherAttendance() {
        return teacherAttendance;
    }

    /**
     * Sets the value of the teacherAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AttendanceInfoType }{@code >}
     *     
     */
    public void setTeacherAttendance(JAXBElement<AttendanceInfoType> value) {
        this.teacherAttendance = value;
    }

    /**
     * Gets the value of the administratorAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AttendanceInfoType }{@code >}
     *     
     */
    public JAXBElement<AttendanceInfoType> getAdministratorAttendance() {
        return administratorAttendance;
    }

    /**
     * Sets the value of the administratorAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AttendanceInfoType }{@code >}
     *     
     */
    public void setAdministratorAttendance(JAXBElement<AttendanceInfoType> value) {
        this.administratorAttendance = value;
    }

    /**
     * Gets the value of the localCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public JAXBElement<LocalCodeListType> getLocalCodeList() {
        return localCodeList;
    }

    /**
     * Sets the value of the localCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public void setLocalCodeList(JAXBElement<LocalCodeListType> value) {
        this.localCodeList = value;
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
     * Gets the value of the calendarDateRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarDateRefId() {
        return calendarDateRefId;
    }

    /**
     * Sets the value of the calendarDateRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarDateRefId(String value) {
        this.calendarDateRefId = value;
    }

}
