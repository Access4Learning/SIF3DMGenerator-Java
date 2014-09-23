
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for psAssessmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="psAssessmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAcademicSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentContentStandardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestScoreMetricType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestResultScoreValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "psAssessmentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentIdentifier",
    "assessmentTitle",
    "assessmentType",
    "assessmentAcademicSubject",
    "assessmentPurpose",
    "assessmentFormName",
    "assessmentContentStandardType",
    "assessmentSubtestIdentifier",
    "assessmentSubtestTitle",
    "assessmentSubtestAbbreviation",
    "assessmentSubtestDescription",
    "assessmentSubtestVersion",
    "assessmentSubtestScoreMetricType",
    "assessmentSubtestResultScoreValue"
})
public class PsAssessmentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAcademicSubject;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPurpose;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentFormName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentContentStandardType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestAbbreviation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestScoreMetricType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestResultScoreValue;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the assessmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentIdentifier() {
        return assessmentIdentifier;
    }

    /**
     * Sets the value of the assessmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentIdentifier(String value) {
        this.assessmentIdentifier = value;
    }

    /**
     * Gets the value of the assessmentTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentTitle() {
        return assessmentTitle;
    }

    /**
     * Sets the value of the assessmentTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentTitle(String value) {
        this.assessmentTitle = value;
    }

    /**
     * Gets the value of the assessmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentType() {
        return assessmentType;
    }

    /**
     * Sets the value of the assessmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentType(String value) {
        this.assessmentType = value;
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
     * Gets the value of the assessmentFormName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormName() {
        return assessmentFormName;
    }

    /**
     * Sets the value of the assessmentFormName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormName(String value) {
        this.assessmentFormName = value;
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
