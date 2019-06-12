
package sif.dd.unity.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MarkingPeriodSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarkingPeriodSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TermInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}MarkingPeriodTermInfoDataType" minOccurs="0"/>
 *         &lt;element name="GradeLevelWhenTaken" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelType" minOccurs="0"/>
 *         &lt;element name="MarkData" type="{http://www.sifassociation.org/datamodel/na/4.x}MarkingPeriodMarkDataType" minOccurs="0"/>
 *         &lt;element name="CourseCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "MarkingPeriodSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "termInfoData",
    "gradeLevelWhenTaken",
    "markData",
    "courseCreditsAttempted",
    "sifExtendedElements"
})
public class MarkingPeriodSummaryType {

    @XmlElement(name = "TermInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MarkingPeriodTermInfoDataType termInfoData;
    @XmlElement(name = "GradeLevelWhenTaken", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelType gradeLevelWhenTaken;
    @XmlElement(name = "MarkData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MarkingPeriodMarkDataType markData;
    @XmlElement(name = "CourseCreditsAttempted", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal courseCreditsAttempted;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;

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

}
