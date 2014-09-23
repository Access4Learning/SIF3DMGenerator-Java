
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentSubtestResultCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentSubtestResultCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentSubtestResultPretestOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestResultScoreValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestScoreMetricType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestResultDescriptiveFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestResultDateUpdated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestResultDateCreated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestResultPreliminaryIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diagnosticStatementSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestResultNumberOfResponses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestResultDescriptiveFeedbackSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestResultDiagnosticStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instructionalRecommendation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentSubtestResultCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentSubtestResultPretestOutcome",
    "assessmentSubtestResultScoreValue",
    "assessmentSubtestScoreMetricType",
    "assessmentSubtestResultDescriptiveFeedback",
    "assessmentSubtestResultDateUpdated",
    "assessmentSubtestResultDateCreated",
    "assessmentSubtestResultPreliminaryIndicator",
    "diagnosticStatementSource",
    "assessmentSubtestResultNumberOfResponses",
    "assessmentSubtestResultDescriptiveFeedbackSource",
    "assessmentSubtestResultDiagnosticStatement",
    "instructionalRecommendation"
})
public class AssessmentSubtestResultCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestResultPretestOutcome;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestResultScoreValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestScoreMetricType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestResultDescriptiveFeedback;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestResultDateUpdated;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestResultDateCreated;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestResultPreliminaryIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String diagnosticStatementSource;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestResultNumberOfResponses;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestResultDescriptiveFeedbackSource;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestResultDiagnosticStatement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String instructionalRecommendation;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the assessmentSubtestResultPretestOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestResultPretestOutcome() {
        return assessmentSubtestResultPretestOutcome;
    }

    /**
     * Sets the value of the assessmentSubtestResultPretestOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestResultPretestOutcome(String value) {
        this.assessmentSubtestResultPretestOutcome = value;
    }

    /**
     * Gets the value of the assessmentSubtestResultScoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestResultScoreValue() {
        return assessmentSubtestResultScoreValue;
    }

    /**
     * Sets the value of the assessmentSubtestResultScoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestResultScoreValue(String value) {
        this.assessmentSubtestResultScoreValue = value;
    }

    /**
     * Gets the value of the assessmentSubtestScoreMetricType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestScoreMetricType() {
        return assessmentSubtestScoreMetricType;
    }

    /**
     * Sets the value of the assessmentSubtestScoreMetricType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestScoreMetricType(String value) {
        this.assessmentSubtestScoreMetricType = value;
    }

    /**
     * Gets the value of the assessmentSubtestResultDescriptiveFeedback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestResultDescriptiveFeedback() {
        return assessmentSubtestResultDescriptiveFeedback;
    }

    /**
     * Sets the value of the assessmentSubtestResultDescriptiveFeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestResultDescriptiveFeedback(String value) {
        this.assessmentSubtestResultDescriptiveFeedback = value;
    }

    /**
     * Gets the value of the assessmentSubtestResultDateUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestResultDateUpdated() {
        return assessmentSubtestResultDateUpdated;
    }

    /**
     * Sets the value of the assessmentSubtestResultDateUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestResultDateUpdated(String value) {
        this.assessmentSubtestResultDateUpdated = value;
    }

    /**
     * Gets the value of the assessmentSubtestResultDateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestResultDateCreated() {
        return assessmentSubtestResultDateCreated;
    }

    /**
     * Sets the value of the assessmentSubtestResultDateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestResultDateCreated(String value) {
        this.assessmentSubtestResultDateCreated = value;
    }

    /**
     * Gets the value of the assessmentSubtestResultPreliminaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestResultPreliminaryIndicator() {
        return assessmentSubtestResultPreliminaryIndicator;
    }

    /**
     * Sets the value of the assessmentSubtestResultPreliminaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestResultPreliminaryIndicator(String value) {
        this.assessmentSubtestResultPreliminaryIndicator = value;
    }

    /**
     * Gets the value of the diagnosticStatementSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticStatementSource() {
        return diagnosticStatementSource;
    }

    /**
     * Sets the value of the diagnosticStatementSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticStatementSource(String value) {
        this.diagnosticStatementSource = value;
    }

    /**
     * Gets the value of the assessmentSubtestResultNumberOfResponses property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestResultNumberOfResponses() {
        return assessmentSubtestResultNumberOfResponses;
    }

    /**
     * Sets the value of the assessmentSubtestResultNumberOfResponses property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestResultNumberOfResponses(String value) {
        this.assessmentSubtestResultNumberOfResponses = value;
    }

    /**
     * Gets the value of the assessmentSubtestResultDescriptiveFeedbackSource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestResultDescriptiveFeedbackSource() {
        return assessmentSubtestResultDescriptiveFeedbackSource;
    }

    /**
     * Sets the value of the assessmentSubtestResultDescriptiveFeedbackSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestResultDescriptiveFeedbackSource(String value) {
        this.assessmentSubtestResultDescriptiveFeedbackSource = value;
    }

    /**
     * Gets the value of the assessmentSubtestResultDiagnosticStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestResultDiagnosticStatement() {
        return assessmentSubtestResultDiagnosticStatement;
    }

    /**
     * Sets the value of the assessmentSubtestResultDiagnosticStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestResultDiagnosticStatement(String value) {
        this.assessmentSubtestResultDiagnosticStatement = value;
    }

    /**
     * Gets the value of the instructionalRecommendation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructionalRecommendation() {
        return instructionalRecommendation;
    }

    /**
     * Sets the value of the instructionalRecommendation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructionalRecommendation(String value) {
        this.instructionalRecommendation = value;
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
