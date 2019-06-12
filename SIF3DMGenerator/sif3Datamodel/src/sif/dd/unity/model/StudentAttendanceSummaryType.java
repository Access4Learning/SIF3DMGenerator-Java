
package sif.dd.unity.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentAttendanceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentAttendanceSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="StartDay" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="EndDay" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="Resident">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DaysAttended" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="ExcusedAbsences" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="UnexcusedAbsences" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="DaysTardy" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DaysInMembership" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="StudentSchoolEnrollmentRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="StudentPersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
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
@XmlType(name = "StudentAttendanceSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "startDate",
    "startDay",
    "endDate",
    "endDay",
    "resident",
    "fte",
    "daysAttended",
    "excusedAbsences",
    "unexcusedAbsences",
    "daysTardy",
    "daysInMembership",
    "studentSchoolEnrollmentRefId",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentAttendanceSummaryType {

    @XmlElement(name = "StartDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "StartDay", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    @XmlSchemaType(name = "unsignedInt")
    protected long startDay;
    @XmlElement(name = "EndDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "EndDay", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    @XmlSchemaType(name = "unsignedInt")
    protected long endDay;
    @XmlElement(name = "Resident", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StudentAttendanceSummaryType.Resident resident;
    @XmlElement(name = "FTE", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal fte;
    @XmlElement(name = "DaysAttended", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BigDecimal daysAttended;
    @XmlElement(name = "ExcusedAbsences", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BigDecimal excusedAbsences;
    @XmlElement(name = "UnexcusedAbsences", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BigDecimal unexcusedAbsences;
    @XmlElement(name = "DaysTardy", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal daysTardy;
    @XmlElement(name = "DaysInMembership", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BigDecimal daysInMembership;
    @XmlElement(name = "StudentSchoolEnrollmentRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentSchoolEnrollmentRefId;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "StudentPersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlAttribute(name = "SchoolInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlAttribute(name = "SchoolYear", required = true)
    protected XMLGregorianCalendar schoolYear;

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
     * Gets the value of the startDay property.
     * 
     */
    public long getStartDay() {
        return startDay;
    }

    /**
     * Sets the value of the startDay property.
     * 
     */
    public void setStartDay(long value) {
        this.startDay = value;
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
     * Gets the value of the endDay property.
     * 
     */
    public long getEndDay() {
        return endDay;
    }

    /**
     * Sets the value of the endDay property.
     * 
     */
    public void setEndDay(long value) {
        this.endDay = value;
    }

    /**
     * Gets the value of the resident property.
     * 
     * @return
     *     possible object is
     *     {@link StudentAttendanceSummaryType.Resident }
     *     
     */
    public StudentAttendanceSummaryType.Resident getResident() {
        return resident;
    }

    /**
     * Sets the value of the resident property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentAttendanceSummaryType.Resident }
     *     
     */
    public void setResident(StudentAttendanceSummaryType.Resident value) {
        this.resident = value;
    }

    /**
     * Gets the value of the fte property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFTE() {
        return fte;
    }

    /**
     * Sets the value of the fte property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFTE(BigDecimal value) {
        this.fte = value;
    }

    /**
     * Gets the value of the daysAttended property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysAttended() {
        return daysAttended;
    }

    /**
     * Sets the value of the daysAttended property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysAttended(BigDecimal value) {
        this.daysAttended = value;
    }

    /**
     * Gets the value of the excusedAbsences property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExcusedAbsences() {
        return excusedAbsences;
    }

    /**
     * Sets the value of the excusedAbsences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExcusedAbsences(BigDecimal value) {
        this.excusedAbsences = value;
    }

    /**
     * Gets the value of the unexcusedAbsences property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUnexcusedAbsences() {
        return unexcusedAbsences;
    }

    /**
     * Sets the value of the unexcusedAbsences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUnexcusedAbsences(BigDecimal value) {
        this.unexcusedAbsences = value;
    }

    /**
     * Gets the value of the daysTardy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysTardy() {
        return daysTardy;
    }

    /**
     * Sets the value of the daysTardy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysTardy(BigDecimal value) {
        this.daysTardy = value;
    }

    /**
     * Gets the value of the daysInMembership property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysInMembership() {
        return daysInMembership;
    }

    /**
     * Sets the value of the daysInMembership property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysInMembership(BigDecimal value) {
        this.daysInMembership = value;
    }

    /**
     * Gets the value of the studentSchoolEnrollmentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentSchoolEnrollmentRefId() {
        return studentSchoolEnrollmentRefId;
    }

    /**
     * Sets the value of the studentSchoolEnrollmentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentSchoolEnrollmentRefId(String value) {
        this.studentSchoolEnrollmentRefId = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Resident {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }

}
