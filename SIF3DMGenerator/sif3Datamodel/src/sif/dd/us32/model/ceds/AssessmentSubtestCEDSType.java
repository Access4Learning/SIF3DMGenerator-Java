
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentSubtestCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentSubtestCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentSubtestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestIdentifierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestPublishedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestMinimumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestMaximumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestScaleOptimalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAcademicSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestScoreMetricType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentContentStandardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestRules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentFormSubtestTier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentFormSubtestContainerOnly" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentSubtestCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentSubtestIdentifier",
    "assessmentSubtestIdentifierType",
    "assessmentSubtestTitle",
    "assessmentSubtestAbbreviation",
    "assessmentSubtestDescription",
    "assessmentSubtestVersion",
    "assessmentSubtestPublishedDate",
    "assessmentSubtestMinimumValue",
    "assessmentSubtestMaximumValue",
    "assessmentSubtestScaleOptimalValue",
    "assessmentAcademicSubject",
    "assessmentPurpose",
    "assessmentSubtestScoreMetricType",
    "assessmentContentStandardType",
    "assessmentSubtestRules",
    "assessmentFormSubtestTier",
    "assessmentFormSubtestContainerOnly"
})
public class AssessmentSubtestCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestIdentifierType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestAbbreviation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestPublishedDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestMinimumValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestMaximumValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestScaleOptimalValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAcademicSubject;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPurpose;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestScoreMetricType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentContentStandardType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestRules;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentFormSubtestTier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentFormSubtestContainerOnly;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the assessmentSubtestIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestIdentifier() {
        return assessmentSubtestIdentifier;
    }

    /**
     * Sets the value of the assessmentSubtestIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestIdentifier(String value) {
        this.assessmentSubtestIdentifier = value;
    }

    /**
     * Gets the value of the assessmentSubtestIdentifierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestIdentifierType() {
        return assessmentSubtestIdentifierType;
    }

    /**
     * Sets the value of the assessmentSubtestIdentifierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestIdentifierType(String value) {
        this.assessmentSubtestIdentifierType = value;
    }

    /**
     * Gets the value of the assessmentSubtestTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestTitle() {
        return assessmentSubtestTitle;
    }

    /**
     * Sets the value of the assessmentSubtestTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestTitle(String value) {
        this.assessmentSubtestTitle = value;
    }

    /**
     * Gets the value of the assessmentSubtestAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestAbbreviation() {
        return assessmentSubtestAbbreviation;
    }

    /**
     * Sets the value of the assessmentSubtestAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestAbbreviation(String value) {
        this.assessmentSubtestAbbreviation = value;
    }

    /**
     * Gets the value of the assessmentSubtestDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestDescription() {
        return assessmentSubtestDescription;
    }

    /**
     * Sets the value of the assessmentSubtestDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestDescription(String value) {
        this.assessmentSubtestDescription = value;
    }

    /**
     * Gets the value of the assessmentSubtestVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestVersion() {
        return assessmentSubtestVersion;
    }

    /**
     * Sets the value of the assessmentSubtestVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestVersion(String value) {
        this.assessmentSubtestVersion = value;
    }

    /**
     * Gets the value of the assessmentSubtestPublishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestPublishedDate() {
        return assessmentSubtestPublishedDate;
    }

    /**
     * Sets the value of the assessmentSubtestPublishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestPublishedDate(String value) {
        this.assessmentSubtestPublishedDate = value;
    }

    /**
     * Gets the value of the assessmentSubtestMinimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestMinimumValue() {
        return assessmentSubtestMinimumValue;
    }

    /**
     * Sets the value of the assessmentSubtestMinimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestMinimumValue(String value) {
        this.assessmentSubtestMinimumValue = value;
    }

    /**
     * Gets the value of the assessmentSubtestMaximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestMaximumValue() {
        return assessmentSubtestMaximumValue;
    }

    /**
     * Sets the value of the assessmentSubtestMaximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestMaximumValue(String value) {
        this.assessmentSubtestMaximumValue = value;
    }

    /**
     * Gets the value of the assessmentSubtestScaleOptimalValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestScaleOptimalValue() {
        return assessmentSubtestScaleOptimalValue;
    }

    /**
     * Sets the value of the assessmentSubtestScaleOptimalValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestScaleOptimalValue(String value) {
        this.assessmentSubtestScaleOptimalValue = value;
    }

    /**
     * Gets the value of the assessmentAcademicSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAcademicSubject() {
        return assessmentAcademicSubject;
    }

    /**
     * Sets the value of the assessmentAcademicSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAcademicSubject(String value) {
        this.assessmentAcademicSubject = value;
    }

    /**
     * Gets the value of the assessmentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentPurpose() {
        return assessmentPurpose;
    }

    /**
     * Sets the value of the assessmentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentPurpose(String value) {
        this.assessmentPurpose = value;
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
     * Gets the value of the assessmentContentStandardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentContentStandardType() {
        return assessmentContentStandardType;
    }

    /**
     * Sets the value of the assessmentContentStandardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentContentStandardType(String value) {
        this.assessmentContentStandardType = value;
    }

    /**
     * Gets the value of the assessmentSubtestRules property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSubtestRules() {
        return assessmentSubtestRules;
    }

    /**
     * Sets the value of the assessmentSubtestRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSubtestRules(String value) {
        this.assessmentSubtestRules = value;
    }

    /**
     * Gets the value of the assessmentFormSubtestTier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormSubtestTier() {
        return assessmentFormSubtestTier;
    }

    /**
     * Sets the value of the assessmentFormSubtestTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormSubtestTier(String value) {
        this.assessmentFormSubtestTier = value;
    }

    /**
     * Gets the value of the assessmentFormSubtestContainerOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormSubtestContainerOnly() {
        return assessmentFormSubtestContainerOnly;
    }

    /**
     * Sets the value of the assessmentFormSubtestContainerOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormSubtestContainerOnly(String value) {
        this.assessmentFormSubtestContainerOnly = value;
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
