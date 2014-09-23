
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentSessionCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentSessionCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentSessionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionScheduledStartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionScheduledEndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionActualStartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionActualEndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionAdministratorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionProctorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionStaffRoleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lEAIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localEducationAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSessionAllottedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentSessionCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentSessionType",
    "assessmentSessionLocation",
    "assessmentSessionScheduledStartDateTime",
    "assessmentSessionScheduledEndDateTime",
    "assessmentSessionActualStartDateTime",
    "assessmentSessionActualEndDateTime",
    "assessmentSessionAdministratorIdentifier",
    "assessmentSessionProctorIdentifier",
    "assessmentSessionStaffRoleType",
    "leaIdentificationSystem",
    "localEducationAgencyIdentifier",
    "schoolIdentificationSystem",
    "schoolIdentifier",
    "assessmentSessionAllottedTime",
    "assessmentSessionSecurityIssue",
    "assessmentSessionSpecialCircumstanceType",
    "assessmentSessionSpecialEventDescription"
})
public class AssessmentSessionCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionLocation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionScheduledStartDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionScheduledEndDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionActualStartDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionActualEndDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionAdministratorIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionProctorIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionStaffRoleType;
    @XmlElement(name = "lEAIdentificationSystem", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String leaIdentificationSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String localEducationAgencyIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String schoolIdentificationSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String schoolIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSessionAllottedTime;
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
     * Gets the value of the assessmentSessionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionType() {
        return assessmentSessionType;
    }

    /**
     * Sets the value of the assessmentSessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionType(String value) {
        this.assessmentSessionType = value;
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
     * Gets the value of the assessmentSessionScheduledStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionScheduledStartDateTime() {
        return assessmentSessionScheduledStartDateTime;
    }

    /**
     * Sets the value of the assessmentSessionScheduledStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionScheduledStartDateTime(String value) {
        this.assessmentSessionScheduledStartDateTime = value;
    }

    /**
     * Gets the value of the assessmentSessionScheduledEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionScheduledEndDateTime() {
        return assessmentSessionScheduledEndDateTime;
    }

    /**
     * Sets the value of the assessmentSessionScheduledEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionScheduledEndDateTime(String value) {
        this.assessmentSessionScheduledEndDateTime = value;
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
     * Gets the value of the assessmentSessionAdministratorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionAdministratorIdentifier() {
        return assessmentSessionAdministratorIdentifier;
    }

    /**
     * Sets the value of the assessmentSessionAdministratorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionAdministratorIdentifier(String value) {
        this.assessmentSessionAdministratorIdentifier = value;
    }

    /**
     * Gets the value of the assessmentSessionProctorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionProctorIdentifier() {
        return assessmentSessionProctorIdentifier;
    }

    /**
     * Sets the value of the assessmentSessionProctorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionProctorIdentifier(String value) {
        this.assessmentSessionProctorIdentifier = value;
    }

    /**
     * Gets the value of the assessmentSessionStaffRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionStaffRoleType() {
        return assessmentSessionStaffRoleType;
    }

    /**
     * Sets the value of the assessmentSessionStaffRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionStaffRoleType(String value) {
        this.assessmentSessionStaffRoleType = value;
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
     * Gets the value of the assessmentSessionAllottedTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionAllottedTime() {
        return assessmentSessionAllottedTime;
    }

    /**
     * Sets the value of the assessmentSessionAllottedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionAllottedTime(String value) {
        this.assessmentSessionAllottedTime = value;
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
