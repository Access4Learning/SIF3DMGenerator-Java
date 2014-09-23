
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentPerformanceLevelCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentPerformanceLevelCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentPerformanceLevelIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentPerformanceLevelLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentPerformanceLevelLowerCutScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentPerformanceLevelScoreMetric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentPerformanceLevelUpperCutScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentPerformanceLevelDescriptiveFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentPerformanceLevelCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentPerformanceLevelIdentifier",
    "assessmentPerformanceLevelLabel",
    "assessmentPerformanceLevelLowerCutScore",
    "assessmentPerformanceLevelScoreMetric",
    "assessmentPerformanceLevelUpperCutScore",
    "assessmentPerformanceLevelDescriptiveFeedback"
})
public class AssessmentPerformanceLevelCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPerformanceLevelIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPerformanceLevelLabel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPerformanceLevelLowerCutScore;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPerformanceLevelScoreMetric;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPerformanceLevelUpperCutScore;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPerformanceLevelDescriptiveFeedback;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the assessmentPerformanceLevelIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentPerformanceLevelIdentifier() {
        return assessmentPerformanceLevelIdentifier;
    }

    /**
     * Sets the value of the assessmentPerformanceLevelIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentPerformanceLevelIdentifier(String value) {
        this.assessmentPerformanceLevelIdentifier = value;
    }

    /**
     * Gets the value of the assessmentPerformanceLevelLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentPerformanceLevelLabel() {
        return assessmentPerformanceLevelLabel;
    }

    /**
     * Sets the value of the assessmentPerformanceLevelLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentPerformanceLevelLabel(String value) {
        this.assessmentPerformanceLevelLabel = value;
    }

    /**
     * Gets the value of the assessmentPerformanceLevelLowerCutScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentPerformanceLevelLowerCutScore() {
        return assessmentPerformanceLevelLowerCutScore;
    }

    /**
     * Sets the value of the assessmentPerformanceLevelLowerCutScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentPerformanceLevelLowerCutScore(String value) {
        this.assessmentPerformanceLevelLowerCutScore = value;
    }

    /**
     * Gets the value of the assessmentPerformanceLevelScoreMetric property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentPerformanceLevelScoreMetric() {
        return assessmentPerformanceLevelScoreMetric;
    }

    /**
     * Sets the value of the assessmentPerformanceLevelScoreMetric property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentPerformanceLevelScoreMetric(String value) {
        this.assessmentPerformanceLevelScoreMetric = value;
    }

    /**
     * Gets the value of the assessmentPerformanceLevelUpperCutScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentPerformanceLevelUpperCutScore() {
        return assessmentPerformanceLevelUpperCutScore;
    }

    /**
     * Sets the value of the assessmentPerformanceLevelUpperCutScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentPerformanceLevelUpperCutScore(String value) {
        this.assessmentPerformanceLevelUpperCutScore = value;
    }

    /**
     * Gets the value of the assessmentPerformanceLevelDescriptiveFeedback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentPerformanceLevelDescriptiveFeedback() {
        return assessmentPerformanceLevelDescriptiveFeedback;
    }

    /**
     * Sets the value of the assessmentPerformanceLevelDescriptiveFeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentPerformanceLevelDescriptiveFeedback(String value) {
        this.assessmentPerformanceLevelDescriptiveFeedback = value;
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

}
