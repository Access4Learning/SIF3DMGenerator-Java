
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentGUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAcademicSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentLevelForWhichDesigned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentObjective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentTypeAdministeredToChildrenWithDisabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentEarlyLearningDevelopmentalDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSubtestScoreMetricType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="languageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentIdentificationSystem",
    "assessmentIdentifier",
    "assessmentGUID",
    "assessmentTitle",
    "assessmentType",
    "assessmentShortName",
    "assessmentAcademicSubject",
    "assessmentLevelForWhichDesigned",
    "assessmentObjective",
    "assessmentPurpose",
    "assessmentTypeAdministeredToChildrenWithDisabilities",
    "assessmentEarlyLearningDevelopmentalDomain",
    "assessmentProvider",
    "assessmentSubtestScoreMetricType",
    "languageCode"
})
public class AssessmentCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentIdentificationSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentGUID;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentShortName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAcademicSubject;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentLevelForWhichDesigned;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentObjective;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentPurpose;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentTypeAdministeredToChildrenWithDisabilities;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentEarlyLearningDevelopmentalDomain;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentProvider;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSubtestScoreMetricType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String languageCode;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the assessmentIdentificationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentIdentificationSystem() {
        return assessmentIdentificationSystem;
    }

    /**
     * Sets the value of the assessmentIdentificationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentIdentificationSystem(String value) {
        this.assessmentIdentificationSystem = value;
    }

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
     * Gets the value of the assessmentGUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentGUID() {
        return assessmentGUID;
    }

    /**
     * Sets the value of the assessmentGUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentGUID(String value) {
        this.assessmentGUID = value;
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
     * Gets the value of the assessmentShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentShortName() {
        return assessmentShortName;
    }

    /**
     * Sets the value of the assessmentShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentShortName(String value) {
        this.assessmentShortName = value;
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
     * Gets the value of the assessmentLevelForWhichDesigned property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentLevelForWhichDesigned() {
        return assessmentLevelForWhichDesigned;
    }

    /**
     * Sets the value of the assessmentLevelForWhichDesigned property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentLevelForWhichDesigned(String value) {
        this.assessmentLevelForWhichDesigned = value;
    }

    /**
     * Gets the value of the assessmentObjective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentObjective() {
        return assessmentObjective;
    }

    /**
     * Sets the value of the assessmentObjective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentObjective(String value) {
        this.assessmentObjective = value;
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
     * Gets the value of the assessmentTypeAdministeredToChildrenWithDisabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentTypeAdministeredToChildrenWithDisabilities() {
        return assessmentTypeAdministeredToChildrenWithDisabilities;
    }

    /**
     * Sets the value of the assessmentTypeAdministeredToChildrenWithDisabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentTypeAdministeredToChildrenWithDisabilities(String value) {
        this.assessmentTypeAdministeredToChildrenWithDisabilities = value;
    }

    /**
     * Gets the value of the assessmentEarlyLearningDevelopmentalDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentEarlyLearningDevelopmentalDomain() {
        return assessmentEarlyLearningDevelopmentalDomain;
    }

    /**
     * Sets the value of the assessmentEarlyLearningDevelopmentalDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentEarlyLearningDevelopmentalDomain(String value) {
        this.assessmentEarlyLearningDevelopmentalDomain = value;
    }

    /**
     * Gets the value of the assessmentProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentProvider() {
        return assessmentProvider;
    }

    /**
     * Sets the value of the assessmentProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentProvider(String value) {
        this.assessmentProvider = value;
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
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
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
