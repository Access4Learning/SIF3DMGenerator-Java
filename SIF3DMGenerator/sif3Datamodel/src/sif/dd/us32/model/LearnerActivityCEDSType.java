
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for learnerActivityCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learnerActivityCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learnerActivityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityPrerequisite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityCreationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityMaximumTimeAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityMaximumTimeAllowedUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityDueDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityDueTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityMaximumAttemptsAllowed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityAddToGradeBookFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityReleaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityPossiblePoints" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityRubricURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActivityLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "learnerActivityCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "learnerActivityTitle",
    "learnerActivityDescription",
    "learnerActivityPrerequisite",
    "learnerActivityType",
    "learnerActivityCreationDate",
    "learnerActivityMaximumTimeAllowed",
    "learnerActivityMaximumTimeAllowedUnit",
    "learnerActivityDueDate",
    "learnerActivityDueTime",
    "learnerActivityMaximumAttemptsAllowed",
    "learnerActivityAddToGradeBookFlag",
    "learnerActivityReleaseDate",
    "learnerActivityWeight",
    "learnerActivityPossiblePoints",
    "learnerActivityRubricURL",
    "learnerActivityLanguage"
})
public class LearnerActivityCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityPrerequisite;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityCreationDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityMaximumTimeAllowed;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityMaximumTimeAllowedUnit;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityDueDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityDueTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityMaximumAttemptsAllowed;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityAddToGradeBookFlag;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityReleaseDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityWeight;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityPossiblePoints;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityRubricURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActivityLanguage;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the learnerActivityTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityTitle() {
        return learnerActivityTitle;
    }

    /**
     * Sets the value of the learnerActivityTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityTitle(String value) {
        this.learnerActivityTitle = value;
    }

    /**
     * Gets the value of the learnerActivityDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityDescription() {
        return learnerActivityDescription;
    }

    /**
     * Sets the value of the learnerActivityDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityDescription(String value) {
        this.learnerActivityDescription = value;
    }

    /**
     * Gets the value of the learnerActivityPrerequisite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityPrerequisite() {
        return learnerActivityPrerequisite;
    }

    /**
     * Sets the value of the learnerActivityPrerequisite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityPrerequisite(String value) {
        this.learnerActivityPrerequisite = value;
    }

    /**
     * Gets the value of the learnerActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityType() {
        return learnerActivityType;
    }

    /**
     * Sets the value of the learnerActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityType(String value) {
        this.learnerActivityType = value;
    }

    /**
     * Gets the value of the learnerActivityCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityCreationDate() {
        return learnerActivityCreationDate;
    }

    /**
     * Sets the value of the learnerActivityCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityCreationDate(String value) {
        this.learnerActivityCreationDate = value;
    }

    /**
     * Gets the value of the learnerActivityMaximumTimeAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityMaximumTimeAllowed() {
        return learnerActivityMaximumTimeAllowed;
    }

    /**
     * Sets the value of the learnerActivityMaximumTimeAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityMaximumTimeAllowed(String value) {
        this.learnerActivityMaximumTimeAllowed = value;
    }

    /**
     * Gets the value of the learnerActivityMaximumTimeAllowedUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityMaximumTimeAllowedUnit() {
        return learnerActivityMaximumTimeAllowedUnit;
    }

    /**
     * Sets the value of the learnerActivityMaximumTimeAllowedUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityMaximumTimeAllowedUnit(String value) {
        this.learnerActivityMaximumTimeAllowedUnit = value;
    }

    /**
     * Gets the value of the learnerActivityDueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityDueDate() {
        return learnerActivityDueDate;
    }

    /**
     * Sets the value of the learnerActivityDueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityDueDate(String value) {
        this.learnerActivityDueDate = value;
    }

    /**
     * Gets the value of the learnerActivityDueTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityDueTime() {
        return learnerActivityDueTime;
    }

    /**
     * Sets the value of the learnerActivityDueTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityDueTime(String value) {
        this.learnerActivityDueTime = value;
    }

    /**
     * Gets the value of the learnerActivityMaximumAttemptsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityMaximumAttemptsAllowed() {
        return learnerActivityMaximumAttemptsAllowed;
    }

    /**
     * Sets the value of the learnerActivityMaximumAttemptsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityMaximumAttemptsAllowed(String value) {
        this.learnerActivityMaximumAttemptsAllowed = value;
    }

    /**
     * Gets the value of the learnerActivityAddToGradeBookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityAddToGradeBookFlag() {
        return learnerActivityAddToGradeBookFlag;
    }

    /**
     * Sets the value of the learnerActivityAddToGradeBookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityAddToGradeBookFlag(String value) {
        this.learnerActivityAddToGradeBookFlag = value;
    }

    /**
     * Gets the value of the learnerActivityReleaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityReleaseDate() {
        return learnerActivityReleaseDate;
    }

    /**
     * Sets the value of the learnerActivityReleaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityReleaseDate(String value) {
        this.learnerActivityReleaseDate = value;
    }

    /**
     * Gets the value of the learnerActivityWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityWeight() {
        return learnerActivityWeight;
    }

    /**
     * Sets the value of the learnerActivityWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityWeight(String value) {
        this.learnerActivityWeight = value;
    }

    /**
     * Gets the value of the learnerActivityPossiblePoints property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityPossiblePoints() {
        return learnerActivityPossiblePoints;
    }

    /**
     * Sets the value of the learnerActivityPossiblePoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityPossiblePoints(String value) {
        this.learnerActivityPossiblePoints = value;
    }

    /**
     * Gets the value of the learnerActivityRubricURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityRubricURL() {
        return learnerActivityRubricURL;
    }

    /**
     * Sets the value of the learnerActivityRubricURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityRubricURL(String value) {
        this.learnerActivityRubricURL = value;
    }

    /**
     * Gets the value of the learnerActivityLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActivityLanguage() {
        return learnerActivityLanguage;
    }

    /**
     * Sets the value of the learnerActivityLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActivityLanguage(String value) {
        this.learnerActivityLanguage = value;
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
