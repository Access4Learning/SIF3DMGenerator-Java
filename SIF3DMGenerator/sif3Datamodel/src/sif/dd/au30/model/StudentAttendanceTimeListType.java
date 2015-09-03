
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
 * This object provides more detail about the attendance spans for a single student during the
 * 				day: it provides more detailed information than the single TimeIn and TimeOut elements in
 * 				StudentDailyAttendance.
 * 
 * <p>Java class for StudentAttendanceTimeListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentAttendanceTimeListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/au/datamodel/1.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element ref="{http://www.sifassociation.org/au/datamodel/1.4}SchoolYear" minOccurs="0"/>
 *         &lt;element name="AttendanceTimes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AttendanceTime" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.sifassociation.org/au/datamodel/1.4}AttendanceCode" minOccurs="0"/>
 *                             &lt;element name="AttendanceStatus" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsAttendanceStatusType" minOccurs="0"/>
 *                             &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                             &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *                             &lt;element name="DurationValue" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *                                   &lt;minInclusive value="0"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="AttendanceNote" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/au/datamodel/1.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/au/datamodel/1.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/au/datamodel/1.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentAttendanceTimeListType", namespace = "http://www.sifassociation.org/au/datamodel/1.4", propOrder = {
    "studentPersonalRefId",
    "schoolInfoRefId",
    "date",
    "schoolYear",
    "attendanceTimes",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentAttendanceTimeListType {

    @XmlElement(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(name = "Date", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "SchoolYear", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(name = "AttendanceTimes", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    protected StudentAttendanceTimeListType.AttendanceTimes attendanceTimes;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
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
     * Gets the value of the attendanceTimes property.
     * 
     * @return
     *     possible object is
     *     {@link StudentAttendanceTimeListType.AttendanceTimes }
     *     
     */
    public StudentAttendanceTimeListType.AttendanceTimes getAttendanceTimes() {
        return attendanceTimes;
    }

    /**
     * Sets the value of the attendanceTimes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentAttendanceTimeListType.AttendanceTimes }
     *     
     */
    public void setAttendanceTimes(StudentAttendanceTimeListType.AttendanceTimes value) {
        this.attendanceTimes = value;
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
     *         &lt;element name="AttendanceTime" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.sifassociation.org/au/datamodel/1.4}AttendanceCode" minOccurs="0"/>
     *                   &lt;element name="AttendanceStatus" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsAttendanceStatusType" minOccurs="0"/>
     *                   &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *                   &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
     *                   &lt;element name="DurationValue" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
     *                         &lt;minInclusive value="0"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="AttendanceNote" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
        "attendanceTime"
    })
    public static class AttendanceTimes {

        @XmlElement(name = "AttendanceTime", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
        protected List<StudentAttendanceTimeListType.AttendanceTimes.AttendanceTime> attendanceTime;

        /**
         * Gets the value of the attendanceTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attendanceTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttendanceTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StudentAttendanceTimeListType.AttendanceTimes.AttendanceTime }
         * 
         * 
         */
        public List<StudentAttendanceTimeListType.AttendanceTimes.AttendanceTime> getAttendanceTime() {
            if (attendanceTime == null) {
                attendanceTime = new ArrayList<StudentAttendanceTimeListType.AttendanceTimes.AttendanceTime>();
            }
            return this.attendanceTime;
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
         *         &lt;element ref="{http://www.sifassociation.org/au/datamodel/1.4}AttendanceCode" minOccurs="0"/>
         *         &lt;element name="AttendanceStatus" type="{http://www.sifassociation.org/au/datamodel/1.4}AUCodeSetsAttendanceStatusType" minOccurs="0"/>
         *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
         *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
         *         &lt;element name="DurationValue" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
         *               &lt;minInclusive value="0"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
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
        @XmlType(name = "", propOrder = {
            "attendanceCode",
            "attendanceStatus",
            "startTime",
            "endTime",
            "durationValue",
            "attendanceNote"
        })
        public static class AttendanceTime {

            @XmlElement(name = "AttendanceCode", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
            protected AttendanceCodeType attendanceCode;
            @XmlElement(name = "AttendanceStatus", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String attendanceStatus;
            @XmlElement(name = "StartTime", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar startTime;
            @XmlElement(name = "EndTime", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
            @XmlSchemaType(name = "time")
            protected XMLGregorianCalendar endTime;
            @XmlElementRef(name = "DurationValue", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> durationValue;
            @XmlElementRef(name = "AttendanceNote", namespace = "http://www.sifassociation.org/au/datamodel/1.4", type = JAXBElement.class, required = false)
            protected JAXBElement<String> attendanceNote;

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
             * Gets the value of the startTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getStartTime() {
                return startTime;
            }

            /**
             * Sets the value of the startTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setStartTime(XMLGregorianCalendar value) {
                this.startTime = value;
            }

            /**
             * Gets the value of the endTime property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getEndTime() {
                return endTime;
            }

            /**
             * Sets the value of the endTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setEndTime(XMLGregorianCalendar value) {
                this.endTime = value;
            }

            /**
             * Gets the value of the durationValue property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public JAXBElement<BigDecimal> getDurationValue() {
                return durationValue;
            }

            /**
             * Sets the value of the durationValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
             *     
             */
            public void setDurationValue(JAXBElement<BigDecimal> value) {
                this.durationValue = value;
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

    }

}
