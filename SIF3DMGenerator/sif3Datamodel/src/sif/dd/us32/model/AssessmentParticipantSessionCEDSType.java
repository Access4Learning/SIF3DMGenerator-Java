
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentParticipantSessionCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentParticipantSessionCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentAccommodationCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAccommodationOtherDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAccommodationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentParticipantSessionDeliveryDeviceDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentParticipantSessionLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentParticipantSessionPlatformType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentParticipantSessionPlatformUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentParticipantSessionSecurityIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentParticipantSessionTimeAssessed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionActualEndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionActualStartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionSecurityIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionSpecialCircumstanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionSpecialEventDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentParticipantSessionCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentAccommodationCategory",
    "assessmentAccommodationOtherDescription",
    "assessmentAccommodationType",
    "assessmentParticipantSessionDeliveryDeviceDetails",
    "assessmentParticipantSessionLanguage",
    "assessmentParticipantSessionPlatformType",
    "assessmentParticipantSessionPlatformUserAgent",
    "assessmentParticipantSessionSecurityIssue",
    "assessmentParticipantSessionTimeAssessed",
    "assessmentSessionActualEndDateTime",
    "assessmentSessionActualStartDateTime",
    "assessmentSessionLocation",
    "assessmentSessionSecurityIssue",
    "assessmentSessionSpecialCircumstanceType",
    "assessmentSessionSpecialEventDescription"
})
public class AssessmentParticipantSessionCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAccommodationCategory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAccommodationOtherDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAccommodationType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentParticipantSessionDeliveryDeviceDetails;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentParticipantSessionLanguage;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentParticipantSessionPlatformType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentParticipantSessionPlatformUserAgent;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentParticipantSessionSecurityIssue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentParticipantSessionTimeAssessed;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionActualEndDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionActualStartDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionLocation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionSecurityIssue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionSpecialCircumstanceType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionSpecialEventDescription;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the assessmentAccommodationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAccommodationType() {
        return assessmentAccommodationType;
    }

    /**
     * Sets the value of the assessmentAccommodationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAccommodationType(String value) {
        this.assessmentAccommodationType = value;
    }

    /**
     * Gets the value of the assessmentParticipantSessionDeliveryDeviceDetails property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentParticipantSessionDeliveryDeviceDetails() {
        return assessmentParticipantSessionDeliveryDeviceDetails;
    }

    /**
     * Sets the value of the assessmentParticipantSessionDeliveryDeviceDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentParticipantSessionDeliveryDeviceDetails(String value) {
        this.assessmentParticipantSessionDeliveryDeviceDetails = value;
    }

    /**
     * Gets the value of the assessmentParticipantSessionLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentParticipantSessionLanguage() {
        return assessmentParticipantSessionLanguage;
    }

    /**
     * Sets the value of the assessmentParticipantSessionLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentParticipantSessionLanguage(String value) {
        this.assessmentParticipantSessionLanguage = value;
    }

    /**
     * Gets the value of the assessmentParticipantSessionPlatformType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentParticipantSessionPlatformType() {
        return assessmentParticipantSessionPlatformType;
    }

    /**
     * Sets the value of the assessmentParticipantSessionPlatformType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentParticipantSessionPlatformType(String value) {
        this.assessmentParticipantSessionPlatformType = value;
    }

    /**
     * Gets the value of the assessmentParticipantSessionPlatformUserAgent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentParticipantSessionPlatformUserAgent() {
        return assessmentParticipantSessionPlatformUserAgent;
    }

    /**
     * Sets the value of the assessmentParticipantSessionPlatformUserAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentParticipantSessionPlatformUserAgent(String value) {
        this.assessmentParticipantSessionPlatformUserAgent = value;
    }

    /**
     * Gets the value of the assessmentParticipantSessionSecurityIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentParticipantSessionSecurityIssue() {
        return assessmentParticipantSessionSecurityIssue;
    }

    /**
     * Sets the value of the assessmentParticipantSessionSecurityIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentParticipantSessionSecurityIssue(String value) {
        this.assessmentParticipantSessionSecurityIssue = value;
    }

    /**
     * Gets the value of the assessmentParticipantSessionTimeAssessed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentParticipantSessionTimeAssessed() {
        return assessmentParticipantSessionTimeAssessed;
    }

    /**
     * Sets the value of the assessmentParticipantSessionTimeAssessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentParticipantSessionTimeAssessed(String value) {
        this.assessmentParticipantSessionTimeAssessed = value;
    }

    /**
     * Gets the value of the assessmentSessionActualEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionActualEndDateTime() {
        return assessmentSessionActualEndDateTime;
    }

    /**
     * Sets the value of the assessmentSessionActualEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionActualEndDateTime(String value) {
        this.assessmentSessionActualEndDateTime = value;
    }

    /**
     * Gets the value of the assessmentSessionActualStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionActualStartDateTime() {
        return assessmentSessionActualStartDateTime;
    }

    /**
     * Sets the value of the assessmentSessionActualStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionActualStartDateTime(String value) {
        this.assessmentSessionActualStartDateTime = value;
    }

    /**
     * Gets the value of the assessmentSessionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionLocation() {
        return assessmentSessionLocation;
    }

    /**
     * Sets the value of the assessmentSessionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionLocation(String value) {
        this.assessmentSessionLocation = value;
    }

    /**
     * Gets the value of the assessmentSessionSecurityIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionSecurityIssue() {
        return assessmentSessionSecurityIssue;
    }

    /**
     * Sets the value of the assessmentSessionSecurityIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionSecurityIssue(String value) {
        this.assessmentSessionSecurityIssue = value;
    }

    /**
     * Gets the value of the assessmentSessionSpecialCircumstanceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionSpecialCircumstanceType() {
        return assessmentSessionSpecialCircumstanceType;
    }

    /**
     * Sets the value of the assessmentSessionSpecialCircumstanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionSpecialCircumstanceType(String value) {
        this.assessmentSessionSpecialCircumstanceType = value;
    }

    /**
     * Gets the value of the assessmentSessionSpecialEventDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionSpecialEventDescription() {
        return assessmentSessionSpecialEventDescription;
    }

    /**
     * Sets the value of the assessmentSessionSpecialEventDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionSpecialEventDescription(String value) {
        this.assessmentSessionSpecialEventDescription = value;
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
