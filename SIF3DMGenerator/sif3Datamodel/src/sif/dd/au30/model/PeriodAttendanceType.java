
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PeriodAttendanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodAttendanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttendanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttendanceCode" type="{http://www.sifassociation.org/datamodel/au/3.4}AttendanceCodeType"/>
 *         &lt;element name="AttendanceStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsAttendanceStatusType"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SessionInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="ScheduledActivityRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="TimetablePeriod" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DayId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="TimeIn" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="TimeOut" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="TimeTableCellRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="TimeTableSubjectRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType" minOccurs="0"/>
 *         &lt;element name="TeacherList" type="{http://www.sifassociation.org/datamodel/au/3.4}ScheduledTeacherListType" minOccurs="0"/>
 *         &lt;element name="RoomList" type="{http://www.sifassociation.org/datamodel/au/3.4}RoomListType" minOccurs="0"/>
 *         &lt;element name="AttendanceNote" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodAttendanceType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "attendanceType",
    "attendanceCode",
    "attendanceStatus",
    "date",
    "sessionInfoRefId",
    "scheduledActivityRefId",
    "timetablePeriod",
    "dayId",
    "startTime",
    "endTime",
    "timeIn",
    "timeOut",
    "timeTableCellRefId",
    "timeTableSubjectRefId",
    "teacherList",
    "roomList",
    "attendanceNote"
})
public class PeriodAttendanceType {

    @XmlElementRef(name = "AttendanceType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attendanceType;
    @XmlElement(name = "AttendanceCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected AttendanceCodeType attendanceCode;
    @XmlElement(name = "AttendanceStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String attendanceStatus;
    @XmlElement(name = "Date", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "SessionInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sessionInfoRefId;
    @XmlElementRef(name = "ScheduledActivityRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> scheduledActivityRefId;
    @XmlElementRef(name = "TimetablePeriod", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timetablePeriod;
    @XmlElementRef(name = "DayId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dayId;
    @XmlElementRef(name = "StartTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startTime;
    @XmlElementRef(name = "EndTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endTime;
    @XmlElementRef(name = "TimeIn", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> timeIn;
    @XmlElementRef(name = "TimeOut", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> timeOut;
    @XmlElementRef(name = "TimeTableCellRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeTableCellRefId;
    @XmlElementRef(name = "TimeTableSubjectRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeTableSubjectRefId;
    @XmlElementRef(name = "TeacherList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ScheduledTeacherListType> teacherList;
    @XmlElementRef(name = "RoomList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<RoomListType> roomList;
    @XmlElementRef(name = "AttendanceNote", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attendanceNote;

    /**
     * Gets the value of the attendanceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttendanceType() {
        return attendanceType;
    }

    /**
     * Sets the value of the attendanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttendanceType(JAXBElement<String> value) {
        this.attendanceType = value;
    }

    /**
     * Gets the value of the attendanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceCodeType }
     *     
     */
    public AttendanceCodeType getAttendanceCode() {
        return attendanceCode;
    }

    /**
     * Sets the value of the attendanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceCodeType }
     *     
     */
    public void setAttendanceCode(AttendanceCodeType value) {
        this.attendanceCode = value;
    }

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
     * Gets the value of the sessionInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSessionInfoRefId() {
        return sessionInfoRefId;
    }

    /**
     * Sets the value of the sessionInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSessionInfoRefId(JAXBElement<String> value) {
        this.sessionInfoRefId = value;
    }

    /**
     * Gets the value of the scheduledActivityRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getScheduledActivityRefId() {
        return scheduledActivityRefId;
    }

    /**
     * Sets the value of the scheduledActivityRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setScheduledActivityRefId(JAXBElement<String> value) {
        this.scheduledActivityRefId = value;
    }

    /**
     * Gets the value of the timetablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimetablePeriod() {
        return timetablePeriod;
    }

    /**
     * Sets the value of the timetablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimetablePeriod(JAXBElement<String> value) {
        this.timetablePeriod = value;
    }

    /**
     * Gets the value of the dayId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDayId() {
        return dayId;
    }

    /**
     * Sets the value of the dayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDayId(JAXBElement<String> value) {
        this.dayId = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartTime(JAXBElement<XMLGregorianCalendar> value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndTime(JAXBElement<XMLGregorianCalendar> value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the timeIn property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTimeIn() {
        return timeIn;
    }

    /**
     * Sets the value of the timeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTimeIn(JAXBElement<XMLGregorianCalendar> value) {
        this.timeIn = value;
    }

    /**
     * Gets the value of the timeOut property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getTimeOut() {
        return timeOut;
    }

    /**
     * Sets the value of the timeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setTimeOut(JAXBElement<XMLGregorianCalendar> value) {
        this.timeOut = value;
    }

    /**
     * Gets the value of the timeTableCellRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeTableCellRefId() {
        return timeTableCellRefId;
    }

    /**
     * Sets the value of the timeTableCellRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeTableCellRefId(JAXBElement<String> value) {
        this.timeTableCellRefId = value;
    }

    /**
     * Gets the value of the timeTableSubjectRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeTableSubjectRefId() {
        return timeTableSubjectRefId;
    }

    /**
     * Sets the value of the timeTableSubjectRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeTableSubjectRefId(JAXBElement<String> value) {
        this.timeTableSubjectRefId = value;
    }

    /**
     * Gets the value of the teacherList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ScheduledTeacherListType }{@code >}
     *     
     */
    public JAXBElement<ScheduledTeacherListType> getTeacherList() {
        return teacherList;
    }

    /**
     * Sets the value of the teacherList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ScheduledTeacherListType }{@code >}
     *     
     */
    public void setTeacherList(JAXBElement<ScheduledTeacherListType> value) {
        this.teacherList = value;
    }

    /**
     * Gets the value of the roomList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RoomListType }{@code >}
     *     
     */
    public JAXBElement<RoomListType> getRoomList() {
        return roomList;
    }

    /**
     * Sets the value of the roomList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RoomListType }{@code >}
     *     
     */
    public void setRoomList(JAXBElement<RoomListType> value) {
        this.roomList = value;
    }

    /**
     * Gets the value of the attendanceNote property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttendanceNote() {
        return attendanceNote;
    }

    /**
     * Sets the value of the attendanceNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttendanceNote(JAXBElement<String> value) {
        this.attendanceNote = value;
    }

}
