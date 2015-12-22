
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xAttendanceEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xAttendanceEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="school" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolType" minOccurs="0"/>
 *         &lt;element name="calendarEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dailyAttendanceStatus" type="{http://www.sifassociation.org/datamodel/na/3.3}xAttendanceStatusType" minOccurs="0"/>
 *         &lt;element name="attendanceEventType" type="{http://www.sifassociation.org/datamodel/na/3.3}xAttendanceEventTypeType" minOccurs="0"/>
 *         &lt;element name="absentAttendanceCategory" type="{http://www.sifassociation.org/datamodel/na/3.3}xAbsentAttendanceCategoryType" minOccurs="0"/>
 *         &lt;element name="presentAttendanceCategory" type="{http://www.sifassociation.org/datamodel/na/3.3}xPresentAttendanceCategoryType" minOccurs="0"/>
 *         &lt;element name="attendanceValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "xAttendanceEventType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "school",
    "calendarEventDate",
    "dailyAttendanceStatus",
    "attendanceEventType",
    "absentAttendanceCategory",
    "presentAttendanceCategory",
    "attendanceValue",
    "any"
})
public class XAttendanceEventType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType school;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String calendarEventDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XAttendanceStatusType dailyAttendanceStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XAttendanceEventTypeType attendanceEventType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String absentAttendanceCategory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String presentAttendanceCategory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal attendanceValue;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the school property.
     * 
     * @return
     *     possible object is
     *     {@link XSchoolType }
     *     
     */
    public XSchoolType getSchool() {
        return school;
    }

    /**
     * Sets the value of the school property.
     * 
     * @param value
     *     allowed object is
     *     {@link XSchoolType }
     *     
     */
    public void setSchool(XSchoolType value) {
        this.school = value;
    }

    /**
     * Gets the value of the calendarEventDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalendarEventDate() {
        return calendarEventDate;
    }

    /**
     * Sets the value of the calendarEventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalendarEventDate(String value) {
        this.calendarEventDate = value;
    }

    /**
     * Gets the value of the dailyAttendanceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link XAttendanceStatusType }
     *     
     */
    public XAttendanceStatusType getDailyAttendanceStatus() {
        return dailyAttendanceStatus;
    }

    /**
     * Sets the value of the dailyAttendanceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAttendanceStatusType }
     *     
     */
    public void setDailyAttendanceStatus(XAttendanceStatusType value) {
        this.dailyAttendanceStatus = value;
    }

    /**
     * Gets the value of the attendanceEventType property.
     * 
     * @return
     *     possible object is
     *     {@link XAttendanceEventTypeType }
     *     
     */
    public XAttendanceEventTypeType getAttendanceEventType() {
        return attendanceEventType;
    }

    /**
     * Sets the value of the attendanceEventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAttendanceEventTypeType }
     *     
     */
    public void setAttendanceEventType(XAttendanceEventTypeType value) {
        this.attendanceEventType = value;
    }

    /**
     * Gets the value of the absentAttendanceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsentAttendanceCategory() {
        return absentAttendanceCategory;
    }

    /**
     * Sets the value of the absentAttendanceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsentAttendanceCategory(String value) {
        this.absentAttendanceCategory = value;
    }

    /**
     * Gets the value of the presentAttendanceCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPresentAttendanceCategory() {
        return presentAttendanceCategory;
    }

    /**
     * Sets the value of the presentAttendanceCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPresentAttendanceCategory(String value) {
        this.presentAttendanceCategory = value;
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
