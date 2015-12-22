
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xAttendanceSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xAttendanceSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="school" type="{http://www.sifassociation.org/datamodel/na/3.3}xSchoolType" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="daysInAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daysAbsent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="studentAttendanceRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "xAttendanceSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "school",
    "startDate",
    "endDate",
    "daysInAttendance",
    "daysAbsent",
    "studentAttendanceRate",
    "any"
})
public class XAttendanceSummaryType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XSchoolType school;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected Object startDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected Object endDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String daysInAttendance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String daysAbsent;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected BigDecimal studentAttendanceRate;
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
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setStartDate(Object value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setEndDate(Object value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the daysInAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysInAttendance() {
        return daysInAttendance;
    }

    /**
     * Sets the value of the daysInAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysInAttendance(String value) {
        this.daysInAttendance = value;
    }

    /**
     * Gets the value of the daysAbsent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaysAbsent() {
        return daysAbsent;
    }

    /**
     * Sets the value of the daysAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysAbsent(String value) {
        this.daysAbsent = value;
    }

    /**
     * Gets the value of the studentAttendanceRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStudentAttendanceRate() {
        return studentAttendanceRate;
    }

    /**
     * Sets the value of the studentAttendanceRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStudentAttendanceRate(BigDecimal value) {
        this.studentAttendanceRate = value;
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
