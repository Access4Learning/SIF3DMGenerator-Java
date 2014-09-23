
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentRegistrationCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentRegistrationCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentRegistrationParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gradeLevelWhenAssessed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAccommodationCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localEducationAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lEAIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationReasonNotCompleting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationAssignorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationDaysOfInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationRetestIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationCreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationTestingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationScorePublishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationGradeLevelToBeAssessed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAccommodationOtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRegistrationTestAttemptIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reasonNotTested" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentRegistrationCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentRegistrationParticipationIndicator",
    "gradeLevelWhenAssessed",
    "assessmentAccommodationCategory",
    "localEducationAgencyIdentifier",
    "schoolIdentifier",
    "leaIdentificationSystem",
    "schoolIdentificationSystem",
    "assessmentRegistrationReasonNotCompleting",
    "assessmentRegistrationAssignorIdentifier",
    "assessmentRegistrationDaysOfInstruction",
    "assessmentRegistrationRetestIndicator",
    "assessmentRegistrationCreationDate",
    "assessmentRegistrationTestingIndicator",
    "assessmentRegistrationScorePublishDate",
    "assessmentRegistrationGradeLevelToBeAssessed",
    "assessmentAccommodationOtherDescription",
    "assessmentRegistrationTestAttemptIdentifier",
    "reasonNotTested"
})
public class AssessmentRegistrationCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRegistrationParticipationIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String gradeLevelWhenAssessed;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAccommodationCategory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String localEducationAgencyIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String schoolIdentifier;
    @XmlElement(name = "lEAIdentificationSystem", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String leaIdentificationSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String schoolIdentificationSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRegistrationReasonNotCompleting;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRegistrationAssignorIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRegistrationDaysOfInstruction;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRegistrationRetestIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRegistrationCreationDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRegistrationTestingIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRegistrationScorePublishDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRegistrationGradeLevelToBeAssessed;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAccommodationOtherDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRegistrationTestAttemptIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String reasonNotTested;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the assessmentRegistrationParticipationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationParticipationIndicator() {
        return assessmentRegistrationParticipationIndicator;
    }

    /**
     * Sets the value of the assessmentRegistrationParticipationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationParticipationIndicator(String value) {
        this.assessmentRegistrationParticipationIndicator = value;
    }

    /**
     * Gets the value of the gradeLevelWhenAssessed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGradeLevelWhenAssessed() {
        return gradeLevelWhenAssessed;
    }

    /**
     * Sets the value of the gradeLevelWhenAssessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGradeLevelWhenAssessed(String value) {
        this.gradeLevelWhenAssessed = value;
    }

    /**
     * Gets the value of the assessmentAccommodationCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAccommodationCategory() {
        return assessmentAccommodationCategory;
    }

    /**
     * Sets the value of the assessmentAccommodationCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAccommodationCategory(String value) {
        this.assessmentAccommodationCategory = value;
    }

    /**
     * Gets the value of the localEducationAgencyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalEducationAgencyIdentifier() {
        return localEducationAgencyIdentifier;
    }

    /**
     * Sets the value of the localEducationAgencyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalEducationAgencyIdentifier(String value) {
        this.localEducationAgencyIdentifier = value;
    }

    /**
     * Gets the value of the schoolIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolIdentifier() {
        return schoolIdentifier;
    }

    /**
     * Sets the value of the schoolIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolIdentifier(String value) {
        this.schoolIdentifier = value;
    }

    /**
     * Gets the value of the leaIdentificationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEAIdentificationSystem() {
        return leaIdentificationSystem;
    }

    /**
     * Sets the value of the leaIdentificationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEAIdentificationSystem(String value) {
        this.leaIdentificationSystem = value;
    }

    /**
     * Gets the value of the schoolIdentificationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolIdentificationSystem() {
        return schoolIdentificationSystem;
    }

    /**
     * Sets the value of the schoolIdentificationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolIdentificationSystem(String value) {
        this.schoolIdentificationSystem = value;
    }

    /**
     * Gets the value of the assessmentRegistrationReasonNotCompleting property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationReasonNotCompleting() {
        return assessmentRegistrationReasonNotCompleting;
    }

    /**
     * Sets the value of the assessmentRegistrationReasonNotCompleting property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationReasonNotCompleting(String value) {
        this.assessmentRegistrationReasonNotCompleting = value;
    }

    /**
     * Gets the value of the assessmentRegistrationAssignorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationAssignorIdentifier() {
        return assessmentRegistrationAssignorIdentifier;
    }

    /**
     * Sets the value of the assessmentRegistrationAssignorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationAssignorIdentifier(String value) {
        this.assessmentRegistrationAssignorIdentifier = value;
    }

    /**
     * Gets the value of the assessmentRegistrationDaysOfInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationDaysOfInstruction() {
        return assessmentRegistrationDaysOfInstruction;
    }

    /**
     * Sets the value of the assessmentRegistrationDaysOfInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationDaysOfInstruction(String value) {
        this.assessmentRegistrationDaysOfInstruction = value;
    }

    /**
     * Gets the value of the assessmentRegistrationRetestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationRetestIndicator() {
        return assessmentRegistrationRetestIndicator;
    }

    /**
     * Sets the value of the assessmentRegistrationRetestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationRetestIndicator(String value) {
        this.assessmentRegistrationRetestIndicator = value;
    }

    /**
     * Gets the value of the assessmentRegistrationCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationCreationDate() {
        return assessmentRegistrationCreationDate;
    }

    /**
     * Sets the value of the assessmentRegistrationCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationCreationDate(String value) {
        this.assessmentRegistrationCreationDate = value;
    }

    /**
     * Gets the value of the assessmentRegistrationTestingIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationTestingIndicator() {
        return assessmentRegistrationTestingIndicator;
    }

    /**
     * Sets the value of the assessmentRegistrationTestingIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationTestingIndicator(String value) {
        this.assessmentRegistrationTestingIndicator = value;
    }

    /**
     * Gets the value of the assessmentRegistrationScorePublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationScorePublishDate() {
        return assessmentRegistrationScorePublishDate;
    }

    /**
     * Sets the value of the assessmentRegistrationScorePublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationScorePublishDate(String value) {
        this.assessmentRegistrationScorePublishDate = value;
    }

    /**
     * Gets the value of the assessmentRegistrationGradeLevelToBeAssessed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationGradeLevelToBeAssessed() {
        return assessmentRegistrationGradeLevelToBeAssessed;
    }

    /**
     * Sets the value of the assessmentRegistrationGradeLevelToBeAssessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationGradeLevelToBeAssessed(String value) {
        this.assessmentRegistrationGradeLevelToBeAssessed = value;
    }

    /**
     * Gets the value of the assessmentAccommodationOtherDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAccommodationOtherDescription() {
        return assessmentAccommodationOtherDescription;
    }

    /**
     * Sets the value of the assessmentAccommodationOtherDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAccommodationOtherDescription(String value) {
        this.assessmentAccommodationOtherDescription = value;
    }

    /**
     * Gets the value of the assessmentRegistrationTestAttemptIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRegistrationTestAttemptIdentifier() {
        return assessmentRegistrationTestAttemptIdentifier;
    }

    /**
     * Sets the value of the assessmentRegistrationTestAttemptIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRegistrationTestAttemptIdentifier(String value) {
        this.assessmentRegistrationTestAttemptIdentifier = value;
    }

    /**
     * Gets the value of the reasonNotTested property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonNotTested() {
        return reasonNotTested;
    }

    /**
     * Sets the value of the reasonNotTested property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonNotTested(String value) {
        this.reasonNotTested = value;
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
