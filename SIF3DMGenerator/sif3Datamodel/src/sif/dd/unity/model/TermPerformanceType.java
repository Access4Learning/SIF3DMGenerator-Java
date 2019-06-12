
package sif.dd.unity.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TermPerformanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TermPerformanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TermInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}AcademicPerfomanceHistoryTermInfoDataType" minOccurs="0"/>
 *         &lt;element name="GradeLevelWhenTaken" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelType" minOccurs="0"/>
 *         &lt;element name="CreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GPACreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GPACreditsEarned" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GPAGradePoints" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GPA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WeightedGPA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
@XmlType(name = "TermPerformanceType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "termInfoData",
    "gradeLevelWhenTaken",
    "creditsAttempted",
    "creditsEarned",
    "gpaCreditsAttempted",
    "gpaCreditsEarned",
    "gpaGradePoints",
    "gpa",
    "weightedGPA",
    "daysAbsent",
    "daysPresent",
    "sifExtendedElements"
})
public class TermPerformanceType {

    @XmlElement(name = "TermInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AcademicPerfomanceHistoryTermInfoDataType termInfoData;
    @XmlElement(name = "GradeLevelWhenTaken", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelType gradeLevelWhenTaken;
    @XmlElement(name = "CreditsAttempted", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal creditsAttempted;
    @XmlElement(name = "CreditsEarned", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal creditsEarned;
    @XmlElement(name = "GPACreditsAttempted", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal gpaCreditsAttempted;
    @XmlElement(name = "GPACreditsEarned", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal gpaCreditsEarned;
    @XmlElement(name = "GPAGradePoints", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal gpaGradePoints;
    @XmlElement(name = "GPA", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal gpa;
    @XmlElement(name = "WeightedGPA", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal weightedGPA;
    @XmlElement(name = "DaysAbsent", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal daysAbsent;
    @XmlElement(name = "DaysPresent", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal daysPresent;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;

    /**
     * Gets the value of the termInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicPerfomanceHistoryTermInfoDataType }
     *     
     */
    public AcademicPerfomanceHistoryTermInfoDataType getTermInfoData() {
        return termInfoData;
    }

    /**
     * Sets the value of the termInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicPerfomanceHistoryTermInfoDataType }
     *     
     */
    public void setTermInfoData(AcademicPerfomanceHistoryTermInfoDataType value) {
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
     * Gets the value of the creditsAttempted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditsAttempted() {
        return creditsAttempted;
    }

    /**
     * Sets the value of the creditsAttempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditsAttempted(BigDecimal value) {
        this.creditsAttempted = value;
    }

    /**
     * Gets the value of the creditsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditsEarned() {
        return creditsEarned;
    }

    /**
     * Sets the value of the creditsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditsEarned(BigDecimal value) {
        this.creditsEarned = value;
    }

    /**
     * Gets the value of the gpaCreditsAttempted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGPACreditsAttempted() {
        return gpaCreditsAttempted;
    }

    /**
     * Sets the value of the gpaCreditsAttempted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGPACreditsAttempted(BigDecimal value) {
        this.gpaCreditsAttempted = value;
    }

    /**
     * Gets the value of the gpaCreditsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGPACreditsEarned() {
        return gpaCreditsEarned;
    }

    /**
     * Sets the value of the gpaCreditsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGPACreditsEarned(BigDecimal value) {
        this.gpaCreditsEarned = value;
    }

    /**
     * Gets the value of the gpaGradePoints property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGPAGradePoints() {
        return gpaGradePoints;
    }

    /**
     * Sets the value of the gpaGradePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGPAGradePoints(BigDecimal value) {
        this.gpaGradePoints = value;
    }

    /**
     * Gets the value of the gpa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGPA() {
        return gpa;
    }

    /**
     * Sets the value of the gpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGPA(BigDecimal value) {
        this.gpa = value;
    }

    /**
     * Gets the value of the weightedGPA property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getWeightedGPA() {
        return weightedGPA;
    }

    /**
     * Sets the value of the weightedGPA property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setWeightedGPA(BigDecimal value) {
        this.weightedGPA = value;
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

}
