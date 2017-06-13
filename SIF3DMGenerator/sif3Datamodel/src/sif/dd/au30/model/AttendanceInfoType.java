
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Information describing how the day relates to attendance.
 * 
 * <p>Java class for AttendanceInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttendanceInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountsTowardAttendance">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="Yes"/>
 *               &lt;enumeration value="No"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AttendanceValue">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "AttendanceInfoType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "countsTowardAttendance",
    "attendanceValue"
})
public class AttendanceInfoType {

    @XmlElement(name = "CountsTowardAttendance", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String countsTowardAttendance;
    @XmlElement(name = "AttendanceValue", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal attendanceValue;

    /**
     * Gets the value of the countsTowardAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountsTowardAttendance() {
        return countsTowardAttendance;
    }

    /**
     * Sets the value of the countsTowardAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountsTowardAttendance(String value) {
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
