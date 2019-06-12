
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


/**
 * <p>Java class for CourseHistoryMarkingPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourseHistoryMarkingPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolAttendedRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="TermInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}MarkingPeriodTermInfoDataType" minOccurs="0"/>
 *         &lt;element name="GradeLevelWhenTaken" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelType" minOccurs="0"/>
 *         &lt;element name="MarkData" type="{http://www.sifassociation.org/datamodel/na/4.x}MarkingPeriodMarkDataType" minOccurs="0"/>
 *         &lt;element name="CourseCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CourseCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditType" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExcessiveAbsenceIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DaysAbsent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DaysPresent" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseHistoryMarkingPeriodType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "schoolAttendedRefId",
    "termInfoData",
    "gradeLevelWhenTaken",
    "markData",
    "courseCreditsAttempted",
    "courseCreditsEarned",
    "creditType",
    "excessiveAbsenceIndicator",
    "daysAbsent",
    "daysPresent",
    "sifExtendedElements"
})
public class CourseHistoryMarkingPeriodType {

    @XmlElement(name = "SchoolAttendedRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolAttendedRefId;
    @XmlElement(name = "TermInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MarkingPeriodTermInfoDataType termInfoData;
    @XmlElement(name = "GradeLevelWhenTaken", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelType gradeLevelWhenTaken;
    @XmlElement(name = "MarkData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MarkingPeriodMarkDataType markData;
    @XmlElement(name = "CourseCreditsAttempted", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal courseCreditsAttempted;
    @XmlElement(name = "CourseCreditsEarned", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal courseCreditsEarned;
    @XmlElement(name = "CreditType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CourseHistoryMarkingPeriodType.CreditType creditType;
    @XmlElement(name = "ExcessiveAbsenceIndicator", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean excessiveAbsenceIndicator;
    @XmlElement(name = "DaysAbsent", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal daysAbsent;
    @XmlElement(name = "DaysPresent", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal daysPresent;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;

    /**
     * Gets the value of the schoolAttendedRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAttendedRefId() {
        return schoolAttendedRefId;
    }

    /**
     * Sets the value of the schoolAttendedRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAttendedRefId(String value) {
        this.schoolAttendedRefId = value;
    }

    /**
     * Gets the value of the termInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link MarkingPeriodTermInfoDataType }
     *     
     */
    public MarkingPeriodTermInfoDataType getTermInfoData() {
        return termInfoData;
    }

    /**
     * Sets the value of the termInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingPeriodTermInfoDataType }
     *     
     */
    public void setTermInfoData(MarkingPeriodTermInfoDataType value) {
        this.termInfoData = value;
    }

    /**
     * Gets the value of the gradeLevelWhenTaken property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelType }
     *     
     */
    public GradeLevelType getGradeLevelWhenTaken() {
        return gradeLevelWhenTaken;
    }

    /**
     * Sets the value of the gradeLevelWhenTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelType }
     *     
     */
    public void setGradeLevelWhenTaken(GradeLevelType value) {
        this.gradeLevelWhenTaken = value;
    }

    /**
     * Gets the value of the markData property.
     * 
     * @return
     *     possible object is
     *     {@link MarkingPeriodMarkDataType }
     *     
     */
    public MarkingPeriodMarkDataType getMarkData() {
        return markData;
    }

    /**
     * Sets the value of the markData property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingPeriodMarkDataType }
     *     
     */
    public void setMarkData(MarkingPeriodMarkDataType value) {
        this.markData = value;
    }

    /**
     * Gets the value of the courseCreditsAttempted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCourseCreditsAttempted() {
        return courseCreditsAttempted;
    }

    /**
     * Sets the value of the courseCreditsAttempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCourseCreditsAttempted(BigDecimal value) {
        this.courseCreditsAttempted = value;
    }

    /**
     * Gets the value of the courseCreditsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCourseCreditsEarned() {
        return courseCreditsEarned;
    }

    /**
     * Sets the value of the courseCreditsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCourseCreditsEarned(BigDecimal value) {
        this.courseCreditsEarned = value;
    }

    /**
     * Gets the value of the creditType property.
     * 
     * @return
     *     possible object is
     *     {@link CourseHistoryMarkingPeriodType.CreditType }
     *     
     */
    public CourseHistoryMarkingPeriodType.CreditType getCreditType() {
        return creditType;
    }

    /**
     * Sets the value of the creditType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseHistoryMarkingPeriodType.CreditType }
     *     
     */
    public void setCreditType(CourseHistoryMarkingPeriodType.CreditType value) {
        this.creditType = value;
    }

    /**
     * Gets the value of the excessiveAbsenceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExcessiveAbsenceIndicator() {
        return excessiveAbsenceIndicator;
    }

    /**
     * Sets the value of the excessiveAbsenceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExcessiveAbsenceIndicator(Boolean value) {
        this.excessiveAbsenceIndicator = value;
    }

    /**
     * Gets the value of the daysAbsent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysAbsent() {
        return daysAbsent;
    }

    /**
     * Sets the value of the daysAbsent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysAbsent(BigDecimal value) {
        this.daysAbsent = value;
    }

    /**
     * Gets the value of the daysPresent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysPresent() {
        return daysPresent;
    }

    /**
     * Sets the value of the daysPresent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysPresent(BigDecimal value) {
        this.daysPresent = value;
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
    public static class CreditType {

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
