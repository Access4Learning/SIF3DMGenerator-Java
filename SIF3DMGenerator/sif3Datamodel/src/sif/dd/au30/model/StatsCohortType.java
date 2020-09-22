
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StatsCohortType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatsCohortType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatsCohortId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StatsIndigenousStudentType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="T"/>
 *               &lt;enumeration value="I"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CohortGender" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="M"/>
 *               &lt;enumeration value="F"/>
 *               &lt;enumeration value="X"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DaysInReferencePeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PossibleSchoolDays" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AttendanceDays" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AttendanceLess90Percent" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="AttendanceGTE90Percent" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PossibleSchoolDaysGT90PercentAttendance" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatsCohortType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "statsCohortId",
    "statsIndigenousStudentType",
    "cohortGender",
    "daysInReferencePeriod",
    "possibleSchoolDays",
    "attendanceDays",
    "attendanceLess90Percent",
    "attendanceGTE90Percent",
    "possibleSchoolDaysGT90PercentAttendance"
})
public class StatsCohortType {

    @XmlElement(name = "StatsCohortId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String statsCohortId;
    @XmlElement(name = "StatsIndigenousStudentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String statsIndigenousStudentType;
    @XmlElement(name = "CohortGender", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String cohortGender;
    @XmlElement(name = "DaysInReferencePeriod", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigInteger daysInReferencePeriod;
    @XmlElement(name = "PossibleSchoolDays", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigInteger possibleSchoolDays;
    @XmlElement(name = "AttendanceDays", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal attendanceDays;
    @XmlElement(name = "AttendanceLess90Percent", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigInteger attendanceLess90Percent;
    @XmlElement(name = "AttendanceGTE90Percent", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigInteger attendanceGTE90Percent;
    @XmlElement(name = "PossibleSchoolDaysGT90PercentAttendance", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigInteger possibleSchoolDaysGT90PercentAttendance;

    /**
     * Gets the value of the statsCohortId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatsCohortId() {
        return statsCohortId;
    }

    /**
     * Sets the value of the statsCohortId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatsCohortId(String value) {
        this.statsCohortId = value;
    }

    /**
     * Gets the value of the statsIndigenousStudentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatsIndigenousStudentType() {
        return statsIndigenousStudentType;
    }

    /**
     * Sets the value of the statsIndigenousStudentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatsIndigenousStudentType(String value) {
        this.statsIndigenousStudentType = value;
    }

    /**
     * Gets the value of the cohortGender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCohortGender() {
        return cohortGender;
    }

    /**
     * Sets the value of the cohortGender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCohortGender(String value) {
        this.cohortGender = value;
    }

    /**
     * Gets the value of the daysInReferencePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDaysInReferencePeriod() {
        return daysInReferencePeriod;
    }

    /**
     * Sets the value of the daysInReferencePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDaysInReferencePeriod(BigInteger value) {
        this.daysInReferencePeriod = value;
    }

    /**
     * Gets the value of the possibleSchoolDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPossibleSchoolDays() {
        return possibleSchoolDays;
    }

    /**
     * Sets the value of the possibleSchoolDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPossibleSchoolDays(BigInteger value) {
        this.possibleSchoolDays = value;
    }

    /**
     * Gets the value of the attendanceDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAttendanceDays() {
        return attendanceDays;
    }

    /**
     * Sets the value of the attendanceDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAttendanceDays(BigDecimal value) {
        this.attendanceDays = value;
    }

    /**
     * Gets the value of the attendanceLess90Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAttendanceLess90Percent() {
        return attendanceLess90Percent;
    }

    /**
     * Sets the value of the attendanceLess90Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAttendanceLess90Percent(BigInteger value) {
        this.attendanceLess90Percent = value;
    }

    /**
     * Gets the value of the attendanceGTE90Percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAttendanceGTE90Percent() {
        return attendanceGTE90Percent;
    }

    /**
     * Sets the value of the attendanceGTE90Percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAttendanceGTE90Percent(BigInteger value) {
        this.attendanceGTE90Percent = value;
    }

    /**
     * Gets the value of the possibleSchoolDaysGT90PercentAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPossibleSchoolDaysGT90PercentAttendance() {
        return possibleSchoolDaysGT90PercentAttendance;
    }

    /**
     * Sets the value of the possibleSchoolDaysGT90PercentAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPossibleSchoolDaysGT90PercentAttendance(BigInteger value) {
        this.possibleSchoolDaysGT90PercentAttendance = value;
    }

}
