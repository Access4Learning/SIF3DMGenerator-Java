
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentAdministrationCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentAdministrationCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAdministrationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAdministrationOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAdministrationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAdministrationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAdministrationStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAdministrationFinishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAdministrationFinishTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentSecureIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lEAIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="localEducationAgencyIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="schoolIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAdministrationAssessmentFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentAdministrationCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentIdentifier",
    "assessmentIdentificationSystem",
    "assessmentAdministrationName",
    "assessmentAdministrationOrganizationName",
    "assessmentAdministrationCode",
    "assessmentAdministrationStartDate",
    "assessmentAdministrationStartTime",
    "assessmentAdministrationFinishDate",
    "assessmentAdministrationFinishTime",
    "assessmentSecureIndicator",
    "leaIdentificationSystem",
    "localEducationAgencyIdentifier",
    "schoolIdentificationSystem",
    "schoolIdentifier",
    "assessmentAdministrationAssessmentFamily"
})
public class AssessmentAdministrationCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentIdentificationSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAdministrationName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAdministrationOrganizationName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAdministrationCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAdministrationStartDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAdministrationStartTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAdministrationFinishDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAdministrationFinishTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentSecureIndicator;
    @XmlElement(name = "lEAIdentificationSystem", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String leaIdentificationSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String localEducationAgencyIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String schoolIdentificationSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String schoolIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAdministrationAssessmentFamily;
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
     * Gets the value of the assessmentAdministrationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationName() {
        return assessmentAdministrationName;
    }

    /**
     * Sets the value of the assessmentAdministrationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationName(String value) {
        this.assessmentAdministrationName = value;
    }

    /**
     * Gets the value of the assessmentAdministrationOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationOrganizationName() {
        return assessmentAdministrationOrganizationName;
    }

    /**
     * Sets the value of the assessmentAdministrationOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationOrganizationName(String value) {
        this.assessmentAdministrationOrganizationName = value;
    }

    /**
     * Gets the value of the assessmentAdministrationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationCode() {
        return assessmentAdministrationCode;
    }

    /**
     * Sets the value of the assessmentAdministrationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationCode(String value) {
        this.assessmentAdministrationCode = value;
    }

    /**
     * Gets the value of the assessmentAdministrationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationStartDate() {
        return assessmentAdministrationStartDate;
    }

    /**
     * Sets the value of the assessmentAdministrationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationStartDate(String value) {
        this.assessmentAdministrationStartDate = value;
    }

    /**
     * Gets the value of the assessmentAdministrationStartTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationStartTime() {
        return assessmentAdministrationStartTime;
    }

    /**
     * Sets the value of the assessmentAdministrationStartTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationStartTime(String value) {
        this.assessmentAdministrationStartTime = value;
    }

    /**
     * Gets the value of the assessmentAdministrationFinishDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationFinishDate() {
        return assessmentAdministrationFinishDate;
    }

    /**
     * Sets the value of the assessmentAdministrationFinishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationFinishDate(String value) {
        this.assessmentAdministrationFinishDate = value;
    }

    /**
     * Gets the value of the assessmentAdministrationFinishTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationFinishTime() {
        return assessmentAdministrationFinishTime;
    }

    /**
     * Sets the value of the assessmentAdministrationFinishTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationFinishTime(String value) {
        this.assessmentAdministrationFinishTime = value;
    }

    /**
     * Gets the value of the assessmentSecureIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSecureIndicator() {
        return assessmentSecureIndicator;
    }

    /**
     * Sets the value of the assessmentSecureIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSecureIndicator(String value) {
        this.assessmentSecureIndicator = value;
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
     * Gets the value of the assessmentAdministrationAssessmentFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationAssessmentFamily() {
        return assessmentAdministrationAssessmentFamily;
    }

    /**
     * Sets the value of the assessmentAdministrationAssessmentFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationAssessmentFamily(String value) {
        this.assessmentAdministrationAssessmentFamily = value;
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
