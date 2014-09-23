
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for rubricCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rubricCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentRubricIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRubricTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentRubricURLReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricCriterionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricCriterionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricCriterionLevelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricCriterionLevelFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricCriterionLevelPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricCriterionLevelQualityLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricCriterionLevelScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricCriterionPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricCriterionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricCriterionWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rubricDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "rubricCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentRubricIdentifier",
    "assessmentRubricTitle",
    "assessmentRubricURLReference",
    "rubricCriterionCategory",
    "rubricCriterionDescription",
    "rubricCriterionLevelDescription",
    "rubricCriterionLevelFeedback",
    "rubricCriterionLevelPosition",
    "rubricCriterionLevelQualityLabel",
    "rubricCriterionLevelScore",
    "rubricCriterionPosition",
    "rubricCriterionTitle",
    "rubricCriterionWeight",
    "rubricDescription"
})
public class RubricCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRubricIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRubricTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentRubricURLReference;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricCriterionCategory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricCriterionDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricCriterionLevelDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricCriterionLevelFeedback;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricCriterionLevelPosition;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricCriterionLevelQualityLabel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricCriterionLevelScore;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricCriterionPosition;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricCriterionTitle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricCriterionWeight;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String rubricDescription;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the assessmentRubricIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRubricIdentifier() {
        return assessmentRubricIdentifier;
    }

    /**
     * Sets the value of the assessmentRubricIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRubricIdentifier(String value) {
        this.assessmentRubricIdentifier = value;
    }

    /**
     * Gets the value of the assessmentRubricTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRubricTitle() {
        return assessmentRubricTitle;
    }

    /**
     * Sets the value of the assessmentRubricTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRubricTitle(String value) {
        this.assessmentRubricTitle = value;
    }

    /**
     * Gets the value of the assessmentRubricURLReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRubricURLReference() {
        return assessmentRubricURLReference;
    }

    /**
     * Sets the value of the assessmentRubricURLReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRubricURLReference(String value) {
        this.assessmentRubricURLReference = value;
    }

    /**
     * Gets the value of the rubricCriterionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricCriterionCategory() {
        return rubricCriterionCategory;
    }

    /**
     * Sets the value of the rubricCriterionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricCriterionCategory(String value) {
        this.rubricCriterionCategory = value;
    }

    /**
     * Gets the value of the rubricCriterionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricCriterionDescription() {
        return rubricCriterionDescription;
    }

    /**
     * Sets the value of the rubricCriterionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricCriterionDescription(String value) {
        this.rubricCriterionDescription = value;
    }

    /**
     * Gets the value of the rubricCriterionLevelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricCriterionLevelDescription() {
        return rubricCriterionLevelDescription;
    }

    /**
     * Sets the value of the rubricCriterionLevelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricCriterionLevelDescription(String value) {
        this.rubricCriterionLevelDescription = value;
    }

    /**
     * Gets the value of the rubricCriterionLevelFeedback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricCriterionLevelFeedback() {
        return rubricCriterionLevelFeedback;
    }

    /**
     * Sets the value of the rubricCriterionLevelFeedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricCriterionLevelFeedback(String value) {
        this.rubricCriterionLevelFeedback = value;
    }

    /**
     * Gets the value of the rubricCriterionLevelPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricCriterionLevelPosition() {
        return rubricCriterionLevelPosition;
    }

    /**
     * Sets the value of the rubricCriterionLevelPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricCriterionLevelPosition(String value) {
        this.rubricCriterionLevelPosition = value;
    }

    /**
     * Gets the value of the rubricCriterionLevelQualityLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricCriterionLevelQualityLabel() {
        return rubricCriterionLevelQualityLabel;
    }

    /**
     * Sets the value of the rubricCriterionLevelQualityLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricCriterionLevelQualityLabel(String value) {
        this.rubricCriterionLevelQualityLabel = value;
    }

    /**
     * Gets the value of the rubricCriterionLevelScore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricCriterionLevelScore() {
        return rubricCriterionLevelScore;
    }

    /**
     * Sets the value of the rubricCriterionLevelScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricCriterionLevelScore(String value) {
        this.rubricCriterionLevelScore = value;
    }

    /**
     * Gets the value of the rubricCriterionPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricCriterionPosition() {
        return rubricCriterionPosition;
    }

    /**
     * Sets the value of the rubricCriterionPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricCriterionPosition(String value) {
        this.rubricCriterionPosition = value;
    }

    /**
     * Gets the value of the rubricCriterionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricCriterionTitle() {
        return rubricCriterionTitle;
    }

    /**
     * Sets the value of the rubricCriterionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricCriterionTitle(String value) {
        this.rubricCriterionTitle = value;
    }

    /**
     * Gets the value of the rubricCriterionWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricCriterionWeight() {
        return rubricCriterionWeight;
    }

    /**
     * Sets the value of the rubricCriterionWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricCriterionWeight(String value) {
        this.rubricCriterionWeight = value;
    }

    /**
     * Gets the value of the rubricDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubricDescription() {
        return rubricDescription;
    }

    /**
     * Sets the value of the rubricDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubricDescription(String value) {
        this.rubricDescription = value;
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
