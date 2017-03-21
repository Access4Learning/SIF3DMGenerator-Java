
package sif.dd.au30.model;

import java.math.BigDecimal;
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
 * <p>Java class for AttendanceTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttendanceTimeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttendanceCode" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AttendanceCodeType"/>
 *         &lt;element name="AttendanceStatus" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsAttendanceStatusType"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
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
@XmlType(name = "AttendanceTimeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "attendanceCode",
    "attendanceStatus",
    "startTime",
    "endTime",
    "durationValue",
    "attendanceNote"
})
public class AttendanceTimeType {

    @XmlElement(name = "AttendanceCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected AttendanceCodeType attendanceCode;
    @XmlElement(name = "AttendanceStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String attendanceStatus;
    @XmlElement(name = "StartTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElementRef(name = "DurationValue", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> durationValue;
    @XmlElementRef(name = "AttendanceNote", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
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
