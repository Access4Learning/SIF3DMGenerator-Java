
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for learningResourceCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningResourceCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessAPIType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessHazardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="accessModeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adaptationURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adaptedFromURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assistiveTechnologiesCompatibleIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="basedOnURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bookFormatType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="competencyAlignmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="conceptKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="controlFlexibilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copyrightHolderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="copyrightYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateCreated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="digitalMediaSubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="digitalMediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationalUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intendedEndUserRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interactivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mediaFeatureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="physicalMediaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="publisherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subjectCodeSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textComplexitySystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="textComplexityValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="timeRequired" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningResourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typicalAgeRangeMaximum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typicalAgeRangeMinimum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningResourceURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="useRightsURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemAssociationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemAssociationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peerRating" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="peerRatingSampleSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="peerRatingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="peerRatingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "learningResourceCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "accessAPIType",
    "accessHazardType",
    "accessModeType",
    "adaptationURL",
    "adaptedFromURL",
    "assistiveTechnologiesCompatibleIndicator",
    "basedOnURL",
    "bookFormatType",
    "competencyAlignmentType",
    "conceptKeyword",
    "controlFlexibilityType",
    "copyrightHolderName",
    "copyrightYear",
    "creator",
    "dateCreated",
    "description",
    "digitalMediaSubType",
    "digitalMediaType",
    "educationLevel",
    "educationalUse",
    "intendedEndUserRole",
    "interactivityType",
    "language",
    "mediaFeatureType",
    "physicalMediaType",
    "publisherName",
    "subjectCode",
    "subjectCodeSystem",
    "subjectName",
    "textComplexitySystem",
    "textComplexityValue",
    "timeRequired",
    "title",
    "learningResourceType",
    "typicalAgeRangeMaximum",
    "typicalAgeRangeMinimum",
    "learningResourceURL",
    "useRightsURL",
    "version",
    "learningStandardItemAssociationIdentifier",
    "learningStandardItemAssociationType",
    "peerRating"
})
public class LearningResourceCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String accessAPIType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String accessHazardType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String accessModeType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String adaptationURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String adaptedFromURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assistiveTechnologiesCompatibleIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String basedOnURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String bookFormatType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String competencyAlignmentType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String conceptKeyword;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String controlFlexibilityType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String copyrightHolderName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String copyrightYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String creator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String dateCreated;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String digitalMediaSubType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String digitalMediaType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String educationLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String educationalUse;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String intendedEndUserRole;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String interactivityType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String language;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String mediaFeatureType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String physicalMediaType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String publisherName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String subjectCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String subjectCodeSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String subjectName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String textComplexitySystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String textComplexityValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String timeRequired;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String title;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningResourceType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String typicalAgeRangeMaximum;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String typicalAgeRangeMinimum;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningResourceURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String useRightsURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String version;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemAssociationIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemAssociationType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LearningResourceCEDSType.PeerRating peerRating;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the accessAPIType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessAPIType() {
        return accessAPIType;
    }

    /**
     * Sets the value of the accessAPIType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessAPIType(String value) {
        this.accessAPIType = value;
    }

    /**
     * Gets the value of the accessHazardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessHazardType() {
        return accessHazardType;
    }

    /**
     * Sets the value of the accessHazardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessHazardType(String value) {
        this.accessHazardType = value;
    }

    /**
     * Gets the value of the accessModeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessModeType() {
        return accessModeType;
    }

    /**
     * Sets the value of the accessModeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessModeType(String value) {
        this.accessModeType = value;
    }

    /**
     * Gets the value of the adaptationURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdaptationURL() {
        return adaptationURL;
    }

    /**
     * Sets the value of the adaptationURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdaptationURL(String value) {
        this.adaptationURL = value;
    }

    /**
     * Gets the value of the adaptedFromURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdaptedFromURL() {
        return adaptedFromURL;
    }

    /**
     * Sets the value of the adaptedFromURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdaptedFromURL(String value) {
        this.adaptedFromURL = value;
    }

    /**
     * Gets the value of the assistiveTechnologiesCompatibleIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssistiveTechnologiesCompatibleIndicator() {
        return assistiveTechnologiesCompatibleIndicator;
    }

    /**
     * Sets the value of the assistiveTechnologiesCompatibleIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssistiveTechnologiesCompatibleIndicator(String value) {
        this.assistiveTechnologiesCompatibleIndicator = value;
    }

    /**
     * Gets the value of the basedOnURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasedOnURL() {
        return basedOnURL;
    }

    /**
     * Sets the value of the basedOnURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasedOnURL(String value) {
        this.basedOnURL = value;
    }

    /**
     * Gets the value of the bookFormatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookFormatType() {
        return bookFormatType;
    }

    /**
     * Sets the value of the bookFormatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookFormatType(String value) {
        this.bookFormatType = value;
    }

    /**
     * Gets the value of the competencyAlignmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompetencyAlignmentType() {
        return competencyAlignmentType;
    }

    /**
     * Sets the value of the competencyAlignmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompetencyAlignmentType(String value) {
        this.competencyAlignmentType = value;
    }

    /**
     * Gets the value of the conceptKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConceptKeyword() {
        return conceptKeyword;
    }

    /**
     * Sets the value of the conceptKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConceptKeyword(String value) {
        this.conceptKeyword = value;
    }

    /**
     * Gets the value of the controlFlexibilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlFlexibilityType() {
        return controlFlexibilityType;
    }

    /**
     * Sets the value of the controlFlexibilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlFlexibilityType(String value) {
        this.controlFlexibilityType = value;
    }

    /**
     * Gets the value of the copyrightHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightHolderName() {
        return copyrightHolderName;
    }

    /**
     * Sets the value of the copyrightHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightHolderName(String value) {
        this.copyrightHolderName = value;
    }

    /**
     * Gets the value of the copyrightYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightYear() {
        return copyrightYear;
    }

    /**
     * Sets the value of the copyrightYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightYear(String value) {
        this.copyrightYear = value;
    }

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the dateCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCreated() {
        return dateCreated;
    }

    /**
     * Sets the value of the dateCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCreated(String value) {
        this.dateCreated = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the digitalMediaSubType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalMediaSubType() {
        return digitalMediaSubType;
    }

    /**
     * Sets the value of the digitalMediaSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalMediaSubType(String value) {
        this.digitalMediaSubType = value;
    }

    /**
     * Gets the value of the digitalMediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDigitalMediaType() {
        return digitalMediaType;
    }

    /**
     * Sets the value of the digitalMediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDigitalMediaType(String value) {
        this.digitalMediaType = value;
    }

    /**
     * Gets the value of the educationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * Sets the value of the educationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationLevel(String value) {
        this.educationLevel = value;
    }

    /**
     * Gets the value of the educationalUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalUse() {
        return educationalUse;
    }

    /**
     * Sets the value of the educationalUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalUse(String value) {
        this.educationalUse = value;
    }

    /**
     * Gets the value of the intendedEndUserRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntendedEndUserRole() {
        return intendedEndUserRole;
    }

    /**
     * Sets the value of the intendedEndUserRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntendedEndUserRole(String value) {
        this.intendedEndUserRole = value;
    }

    /**
     * Gets the value of the interactivityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteractivityType() {
        return interactivityType;
    }

    /**
     * Sets the value of the interactivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteractivityType(String value) {
        this.interactivityType = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the mediaFeatureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaFeatureType() {
        return mediaFeatureType;
    }

    /**
     * Sets the value of the mediaFeatureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaFeatureType(String value) {
        this.mediaFeatureType = value;
    }

    /**
     * Gets the value of the physicalMediaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalMediaType() {
        return physicalMediaType;
    }

    /**
     * Sets the value of the physicalMediaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalMediaType(String value) {
        this.physicalMediaType = value;
    }

    /**
     * Gets the value of the publisherName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublisherName() {
        return publisherName;
    }

    /**
     * Sets the value of the publisherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublisherName(String value) {
        this.publisherName = value;
    }

    /**
     * Gets the value of the subjectCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectCode() {
        return subjectCode;
    }

    /**
     * Sets the value of the subjectCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectCode(String value) {
        this.subjectCode = value;
    }

    /**
     * Gets the value of the subjectCodeSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectCodeSystem() {
        return subjectCodeSystem;
    }

    /**
     * Sets the value of the subjectCodeSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectCodeSystem(String value) {
        this.subjectCodeSystem = value;
    }

    /**
     * Gets the value of the subjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectName() {
        return subjectName;
    }

    /**
     * Sets the value of the subjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectName(String value) {
        this.subjectName = value;
    }

    /**
     * Gets the value of the textComplexitySystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextComplexitySystem() {
        return textComplexitySystem;
    }

    /**
     * Sets the value of the textComplexitySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextComplexitySystem(String value) {
        this.textComplexitySystem = value;
    }

    /**
     * Gets the value of the textComplexityValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextComplexityValue() {
        return textComplexityValue;
    }

    /**
     * Sets the value of the textComplexityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextComplexityValue(String value) {
        this.textComplexityValue = value;
    }

    /**
     * Gets the value of the timeRequired property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeRequired() {
        return timeRequired;
    }

    /**
     * Sets the value of the timeRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeRequired(String value) {
        this.timeRequired = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the learningResourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningResourceType() {
        return learningResourceType;
    }

    /**
     * Sets the value of the learningResourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningResourceType(String value) {
        this.learningResourceType = value;
    }

    /**
     * Gets the value of the typicalAgeRangeMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypicalAgeRangeMaximum() {
        return typicalAgeRangeMaximum;
    }

    /**
     * Sets the value of the typicalAgeRangeMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypicalAgeRangeMaximum(String value) {
        this.typicalAgeRangeMaximum = value;
    }

    /**
     * Gets the value of the typicalAgeRangeMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypicalAgeRangeMinimum() {
        return typicalAgeRangeMinimum;
    }

    /**
     * Sets the value of the typicalAgeRangeMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypicalAgeRangeMinimum(String value) {
        this.typicalAgeRangeMinimum = value;
    }

    /**
     * Gets the value of the learningResourceURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningResourceURL() {
        return learningResourceURL;
    }

    /**
     * Sets the value of the learningResourceURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningResourceURL(String value) {
        this.learningResourceURL = value;
    }

    /**
     * Gets the value of the useRightsURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseRightsURL() {
        return useRightsURL;
    }

    /**
     * Sets the value of the useRightsURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseRightsURL(String value) {
        this.useRightsURL = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the learningStandardItemAssociationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemAssociationIdentifier() {
        return learningStandardItemAssociationIdentifier;
    }

    /**
     * Sets the value of the learningStandardItemAssociationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemAssociationIdentifier(String value) {
        this.learningStandardItemAssociationIdentifier = value;
    }

    /**
     * Gets the value of the learningStandardItemAssociationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemAssociationType() {
        return learningStandardItemAssociationType;
    }

    /**
     * Sets the value of the learningStandardItemAssociationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemAssociationType(String value) {
        this.learningStandardItemAssociationType = value;
    }

    /**
     * Gets the value of the peerRating property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceCEDSType.PeerRating }
     *     
     */
    public LearningResourceCEDSType.PeerRating getPeerRating() {
        return peerRating;
    }

    /**
     * Sets the value of the peerRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceCEDSType.PeerRating }
     *     
     */
    public void setPeerRating(LearningResourceCEDSType.PeerRating value) {
        this.peerRating = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="peerRatingSampleSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="peerRatingValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="peerRatingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "peerRatingSampleSize",
        "peerRatingValue",
        "peerRatingDate"
    })
    public static class PeerRating {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String peerRatingSampleSize;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String peerRatingValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String peerRatingDate;

        /**
         * Gets the value of the peerRatingSampleSize property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeerRatingSampleSize() {
            return peerRatingSampleSize;
        }

        /**
         * Sets the value of the peerRatingSampleSize property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeerRatingSampleSize(String value) {
            this.peerRatingSampleSize = value;
        }

        /**
         * Gets the value of the peerRatingValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeerRatingValue() {
            return peerRatingValue;
        }

        /**
         * Sets the value of the peerRatingValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeerRatingValue(String value) {
            this.peerRatingValue = value;
        }

        /**
         * Gets the value of the peerRatingDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeerRatingDate() {
            return peerRatingDate;
        }

        /**
         * Sets the value of the peerRatingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeerRatingDate(String value) {
            this.peerRatingDate = value;
        }

    }

}
