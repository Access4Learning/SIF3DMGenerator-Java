
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A single event in a calendar. 
 * 
 * <p>Java class for schoolCalendarItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schoolCalendarItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gSchoolCalendarItemType">
 *       &lt;sequence>
 *         &lt;element name="schoolCalendarRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="event" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="eventDayName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="dateTypeCode" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *         &lt;element name="dateNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="studentAttendance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countsTowardAttendance" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="attendanceValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="teacherAttendance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countsTowardAttendance" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="attendanceValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="administratorAttendance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="countsTowardAttendance" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="attendanceValue" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="bellScheduleDayList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bellScheduleDay" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="bellScheduleRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *                             &lt;element name="timetableDayIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
@XmlType(name = "schoolCalendarItemType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "schoolCalendarRefId",
    "schoolRefId",
    "schoolYear",
    "event",
    "eventDayName",
    "date",
    "dateTypeCode",
    "dateNumber",
    "studentAttendance",
    "teacherAttendance",
    "administratorAttendance",
    "bellScheduleDayList"
})
public class SchoolCalendarItemType
    extends GSchoolCalendarItemType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolCalendarRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String event;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String eventDayName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GCodedElementType dateTypeCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected Integer dateNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected SchoolCalendarItemType.StudentAttendance studentAttendance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected SchoolCalendarItemType.TeacherAttendance teacherAttendance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected SchoolCalendarItemType.AdministratorAttendance administratorAttendance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected SchoolCalendarItemType.BellScheduleDayList bellScheduleDayList;

    /**
     * Gets the value of the schoolCalendarRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolCalendarRefId() {
        return schoolCalendarRefId;
    }

    /**
     * Sets the value of the schoolCalendarRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolCalendarRefId(String value) {
        this.schoolCalendarRefId = value;
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
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvent(String value) {
        this.event = value;
    }

    /**
     * Gets the value of the eventDayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventDayName() {
        return eventDayName;
    }

    /**
     * Sets the value of the eventDayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventDayName(String value) {
        this.eventDayName = value;
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
     * Gets the value of the dateTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link GCodedElementType }
     *     
     */
    public GCodedElementType getDateTypeCode() {
        return dateTypeCode;
    }

    /**
     * Sets the value of the dateTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCodedElementType }
     *     
     */
    public void setDateTypeCode(GCodedElementType value) {
        this.dateTypeCode = value;
    }

    /**
     * Gets the value of the dateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDateNumber() {
        return dateNumber;
    }

    /**
     * Sets the value of the dateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDateNumber(Integer value) {
        this.dateNumber = value;
    }

    /**
     * Gets the value of the studentAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCalendarItemType.StudentAttendance }
     *     
     */
    public SchoolCalendarItemType.StudentAttendance getStudentAttendance() {
        return studentAttendance;
    }

    /**
     * Sets the value of the studentAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCalendarItemType.StudentAttendance }
     *     
     */
    public void setStudentAttendance(SchoolCalendarItemType.StudentAttendance value) {
        this.studentAttendance = value;
    }

    /**
     * Gets the value of the teacherAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCalendarItemType.TeacherAttendance }
     *     
     */
    public SchoolCalendarItemType.TeacherAttendance getTeacherAttendance() {
        return teacherAttendance;
    }

    /**
     * Sets the value of the teacherAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCalendarItemType.TeacherAttendance }
     *     
     */
    public void setTeacherAttendance(SchoolCalendarItemType.TeacherAttendance value) {
        this.teacherAttendance = value;
    }

    /**
     * Gets the value of the administratorAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCalendarItemType.AdministratorAttendance }
     *     
     */
    public SchoolCalendarItemType.AdministratorAttendance getAdministratorAttendance() {
        return administratorAttendance;
    }

    /**
     * Sets the value of the administratorAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCalendarItemType.AdministratorAttendance }
     *     
     */
    public void setAdministratorAttendance(SchoolCalendarItemType.AdministratorAttendance value) {
        this.administratorAttendance = value;
    }

    /**
     * Gets the value of the bellScheduleDayList property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCalendarItemType.BellScheduleDayList }
     *     
     */
    public SchoolCalendarItemType.BellScheduleDayList getBellScheduleDayList() {
        return bellScheduleDayList;
    }

    /**
     * Sets the value of the bellScheduleDayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCalendarItemType.BellScheduleDayList }
     *     
     */
    public void setBellScheduleDayList(SchoolCalendarItemType.BellScheduleDayList value) {
        this.bellScheduleDayList = value;
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
     *         &lt;element name="countsTowardAttendance" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="attendanceValue" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
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
        "countsTowardAttendance",
        "attendanceValue"
    })
    public static class AdministratorAttendance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected GYesNoUnknownType countsTowardAttendance;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected GYesNoUnknownType attendanceValue;

        /**
         * Gets the value of the countsTowardAttendance property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getCountsTowardAttendance() {
            return countsTowardAttendance;
        }

        /**
         * Sets the value of the countsTowardAttendance property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setCountsTowardAttendance(GYesNoUnknownType value) {
            this.countsTowardAttendance = value;
        }

        /**
         * Gets the value of the attendanceValue property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getAttendanceValue() {
            return attendanceValue;
        }

        /**
         * Sets the value of the attendanceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setAttendanceValue(GYesNoUnknownType value) {
            this.attendanceValue = value;
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
     *         &lt;element name="bellScheduleDay" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="bellScheduleRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
     *                   &lt;element name="timetableDayIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
        "bellScheduleDay"
    })
    public static class BellScheduleDayList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<SchoolCalendarItemType.BellScheduleDayList.BellScheduleDay> bellScheduleDay;

        /**
         * Gets the value of the bellScheduleDay property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bellScheduleDay property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBellScheduleDay().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SchoolCalendarItemType.BellScheduleDayList.BellScheduleDay }
         * 
         * 
         */
        public List<SchoolCalendarItemType.BellScheduleDayList.BellScheduleDay> getBellScheduleDay() {
            if (bellScheduleDay == null) {
                bellScheduleDay = new ArrayList<SchoolCalendarItemType.BellScheduleDayList.BellScheduleDay>();
            }
            return this.bellScheduleDay;
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
         *         &lt;element name="bellScheduleRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
         *         &lt;element name="timetableDayIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
            "bellScheduleRefId",
            "timetableDayIdentifier"
        })
        public static class BellScheduleDay {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String bellScheduleRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String timetableDayIdentifier;

            /**
             * Gets the value of the bellScheduleRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBellScheduleRefId() {
                return bellScheduleRefId;
            }

            /**
             * Sets the value of the bellScheduleRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBellScheduleRefId(String value) {
                this.bellScheduleRefId = value;
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
     *         &lt;element name="countsTowardAttendance" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="attendanceValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "countsTowardAttendance",
        "attendanceValue"
    })
    public static class StudentAttendance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected GYesNoUnknownType countsTowardAttendance;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected BigDecimal attendanceValue;

        /**
         * Gets the value of the countsTowardAttendance property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getCountsTowardAttendance() {
            return countsTowardAttendance;
        }

        /**
         * Sets the value of the countsTowardAttendance property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setCountsTowardAttendance(GYesNoUnknownType value) {
            this.countsTowardAttendance = value;
        }

        /**
         * Gets the value of the attendanceValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAttendanceValue() {
            return attendanceValue;
        }

        /**
         * Sets the value of the attendanceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAttendanceValue(BigDecimal value) {
            this.attendanceValue = value;
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
     *         &lt;element name="countsTowardAttendance" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="attendanceValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "countsTowardAttendance",
        "attendanceValue"
    })
    public static class TeacherAttendance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected GYesNoUnknownType countsTowardAttendance;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected BigDecimal attendanceValue;

        /**
         * Gets the value of the countsTowardAttendance property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getCountsTowardAttendance() {
            return countsTowardAttendance;
        }

        /**
         * Sets the value of the countsTowardAttendance property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setCountsTowardAttendance(GYesNoUnknownType value) {
            this.countsTowardAttendance = value;
        }

        /**
         * Gets the value of the attendanceValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAttendanceValue() {
            return attendanceValue;
        }

        /**
         * Sets the value of the attendanceValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAttendanceValue(BigDecimal value) {
            this.attendanceValue = value;
        }

    }

}
