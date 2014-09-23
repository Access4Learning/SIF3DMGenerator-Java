
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for learningStandardItemCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningStandardItemCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learningStandardItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemEducationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemPrerequisiteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemPreviousVersionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemBloomsTaxonomyDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemConceptKeyword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemConceptTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemCurrentVersionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemMultipleIntelligence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemNodeAccessibilityProfile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemParentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemParentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemParentURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemTestabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemTextComplexityMaximumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemTextComplexityMinimumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemTextComplexitySystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemTypicalAgeRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learningStandardItemVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemAssociation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="learningStandardItemAssociationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemAssociationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemAssociationConnectionCitation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemAssociationDestinationNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemAssociationDestinationNodeURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemAssociationOriginNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemAssociationOriginNodeURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemAssociationWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "learningStandardItemCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "learningStandardItemCode",
    "learningStandardItemEducationLevel",
    "learningStandardItemIdentifier",
    "learningStandardItemPrerequisiteIdentifier",
    "learningStandardItemStatement",
    "learningStandardItemType",
    "learningStandardItemPreviousVersionIdentifier",
    "learningStandardItemBloomsTaxonomyDomain",
    "learningStandardItemConceptKeyword",
    "learningStandardItemConceptTerm",
    "learningStandardItemCurrentVersionIndicator",
    "learningStandardItemLanguage",
    "learningStandardItemLicense",
    "learningStandardItemMultipleIntelligence",
    "learningStandardItemNodeAccessibilityProfile",
    "learningStandardItemNodeName",
    "learningStandardItemNotes",
    "learningStandardItemParentCode",
    "learningStandardItemParentIdentifier",
    "learningStandardItemParentURL",
    "learningStandardItemTestabilityType",
    "learningStandardItemTextComplexityMaximumValue",
    "learningStandardItemTextComplexityMinimumValue",
    "learningStandardItemTextComplexitySystem",
    "learningStandardItemTypicalAgeRange",
    "learningStandardItemUrl",
    "learningStandardItemVersion",
    "itemAssociation"
})
public class LearningStandardItemCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemEducationLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemPrerequisiteIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemStatement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemPreviousVersionIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemBloomsTaxonomyDomain;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemConceptKeyword;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemConceptTerm;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemCurrentVersionIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemLanguage;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemLicense;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemMultipleIntelligence;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemNodeAccessibilityProfile;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemNodeName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemNotes;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemParentCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemParentIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemParentURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemTestabilityType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemTextComplexityMaximumValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemTextComplexityMinimumValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemTextComplexitySystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemTypicalAgeRange;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemUrl;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learningStandardItemVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LearningStandardItemCEDSType.ItemAssociation itemAssociation;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the learningStandardItemCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemCode() {
        return learningStandardItemCode;
    }

    /**
     * Sets the value of the learningStandardItemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemCode(String value) {
        this.learningStandardItemCode = value;
    }

    /**
     * Gets the value of the learningStandardItemEducationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemEducationLevel() {
        return learningStandardItemEducationLevel;
    }

    /**
     * Sets the value of the learningStandardItemEducationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemEducationLevel(String value) {
        this.learningStandardItemEducationLevel = value;
    }

    /**
     * Gets the value of the learningStandardItemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemIdentifier() {
        return learningStandardItemIdentifier;
    }

    /**
     * Sets the value of the learningStandardItemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemIdentifier(String value) {
        this.learningStandardItemIdentifier = value;
    }

    /**
     * Gets the value of the learningStandardItemPrerequisiteIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemPrerequisiteIdentifier() {
        return learningStandardItemPrerequisiteIdentifier;
    }

    /**
     * Sets the value of the learningStandardItemPrerequisiteIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemPrerequisiteIdentifier(String value) {
        this.learningStandardItemPrerequisiteIdentifier = value;
    }

    /**
     * Gets the value of the learningStandardItemStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemStatement() {
        return learningStandardItemStatement;
    }

    /**
     * Sets the value of the learningStandardItemStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemStatement(String value) {
        this.learningStandardItemStatement = value;
    }

    /**
     * Gets the value of the learningStandardItemType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemType() {
        return learningStandardItemType;
    }

    /**
     * Sets the value of the learningStandardItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemType(String value) {
        this.learningStandardItemType = value;
    }

    /**
     * Gets the value of the learningStandardItemPreviousVersionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemPreviousVersionIdentifier() {
        return learningStandardItemPreviousVersionIdentifier;
    }

    /**
     * Sets the value of the learningStandardItemPreviousVersionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemPreviousVersionIdentifier(String value) {
        this.learningStandardItemPreviousVersionIdentifier = value;
    }

    /**
     * Gets the value of the learningStandardItemBloomsTaxonomyDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemBloomsTaxonomyDomain() {
        return learningStandardItemBloomsTaxonomyDomain;
    }

    /**
     * Sets the value of the learningStandardItemBloomsTaxonomyDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemBloomsTaxonomyDomain(String value) {
        this.learningStandardItemBloomsTaxonomyDomain = value;
    }

    /**
     * Gets the value of the learningStandardItemConceptKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemConceptKeyword() {
        return learningStandardItemConceptKeyword;
    }

    /**
     * Sets the value of the learningStandardItemConceptKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemConceptKeyword(String value) {
        this.learningStandardItemConceptKeyword = value;
    }

    /**
     * Gets the value of the learningStandardItemConceptTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemConceptTerm() {
        return learningStandardItemConceptTerm;
    }

    /**
     * Sets the value of the learningStandardItemConceptTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemConceptTerm(String value) {
        this.learningStandardItemConceptTerm = value;
    }

    /**
     * Gets the value of the learningStandardItemCurrentVersionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemCurrentVersionIndicator() {
        return learningStandardItemCurrentVersionIndicator;
    }

    /**
     * Sets the value of the learningStandardItemCurrentVersionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemCurrentVersionIndicator(String value) {
        this.learningStandardItemCurrentVersionIndicator = value;
    }

    /**
     * Gets the value of the learningStandardItemLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemLanguage() {
        return learningStandardItemLanguage;
    }

    /**
     * Sets the value of the learningStandardItemLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemLanguage(String value) {
        this.learningStandardItemLanguage = value;
    }

    /**
     * Gets the value of the learningStandardItemLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemLicense() {
        return learningStandardItemLicense;
    }

    /**
     * Sets the value of the learningStandardItemLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemLicense(String value) {
        this.learningStandardItemLicense = value;
    }

    /**
     * Gets the value of the learningStandardItemMultipleIntelligence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemMultipleIntelligence() {
        return learningStandardItemMultipleIntelligence;
    }

    /**
     * Sets the value of the learningStandardItemMultipleIntelligence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemMultipleIntelligence(String value) {
        this.learningStandardItemMultipleIntelligence = value;
    }

    /**
     * Gets the value of the learningStandardItemNodeAccessibilityProfile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemNodeAccessibilityProfile() {
        return learningStandardItemNodeAccessibilityProfile;
    }

    /**
     * Sets the value of the learningStandardItemNodeAccessibilityProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemNodeAccessibilityProfile(String value) {
        this.learningStandardItemNodeAccessibilityProfile = value;
    }

    /**
     * Gets the value of the learningStandardItemNodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemNodeName() {
        return learningStandardItemNodeName;
    }

    /**
     * Sets the value of the learningStandardItemNodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemNodeName(String value) {
        this.learningStandardItemNodeName = value;
    }

    /**
     * Gets the value of the learningStandardItemNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemNotes() {
        return learningStandardItemNotes;
    }

    /**
     * Sets the value of the learningStandardItemNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemNotes(String value) {
        this.learningStandardItemNotes = value;
    }

    /**
     * Gets the value of the learningStandardItemParentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemParentCode() {
        return learningStandardItemParentCode;
    }

    /**
     * Sets the value of the learningStandardItemParentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemParentCode(String value) {
        this.learningStandardItemParentCode = value;
    }

    /**
     * Gets the value of the learningStandardItemParentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemParentIdentifier() {
        return learningStandardItemParentIdentifier;
    }

    /**
     * Sets the value of the learningStandardItemParentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemParentIdentifier(String value) {
        this.learningStandardItemParentIdentifier = value;
    }

    /**
     * Gets the value of the learningStandardItemParentURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemParentURL() {
        return learningStandardItemParentURL;
    }

    /**
     * Sets the value of the learningStandardItemParentURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemParentURL(String value) {
        this.learningStandardItemParentURL = value;
    }

    /**
     * Gets the value of the learningStandardItemTestabilityType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemTestabilityType() {
        return learningStandardItemTestabilityType;
    }

    /**
     * Sets the value of the learningStandardItemTestabilityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemTestabilityType(String value) {
        this.learningStandardItemTestabilityType = value;
    }

    /**
     * Gets the value of the learningStandardItemTextComplexityMaximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemTextComplexityMaximumValue() {
        return learningStandardItemTextComplexityMaximumValue;
    }

    /**
     * Sets the value of the learningStandardItemTextComplexityMaximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemTextComplexityMaximumValue(String value) {
        this.learningStandardItemTextComplexityMaximumValue = value;
    }

    /**
     * Gets the value of the learningStandardItemTextComplexityMinimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemTextComplexityMinimumValue() {
        return learningStandardItemTextComplexityMinimumValue;
    }

    /**
     * Sets the value of the learningStandardItemTextComplexityMinimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemTextComplexityMinimumValue(String value) {
        this.learningStandardItemTextComplexityMinimumValue = value;
    }

    /**
     * Gets the value of the learningStandardItemTextComplexitySystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemTextComplexitySystem() {
        return learningStandardItemTextComplexitySystem;
    }

    /**
     * Sets the value of the learningStandardItemTextComplexitySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemTextComplexitySystem(String value) {
        this.learningStandardItemTextComplexitySystem = value;
    }

    /**
     * Gets the value of the learningStandardItemTypicalAgeRange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemTypicalAgeRange() {
        return learningStandardItemTypicalAgeRange;
    }

    /**
     * Sets the value of the learningStandardItemTypicalAgeRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemTypicalAgeRange(String value) {
        this.learningStandardItemTypicalAgeRange = value;
    }

    /**
     * Gets the value of the learningStandardItemUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemUrl() {
        return learningStandardItemUrl;
    }

    /**
     * Sets the value of the learningStandardItemUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemUrl(String value) {
        this.learningStandardItemUrl = value;
    }

    /**
     * Gets the value of the learningStandardItemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardItemVersion() {
        return learningStandardItemVersion;
    }

    /**
     * Sets the value of the learningStandardItemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardItemVersion(String value) {
        this.learningStandardItemVersion = value;
    }

    /**
     * Gets the value of the itemAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardItemCEDSType.ItemAssociation }
     *     
     */
    public LearningStandardItemCEDSType.ItemAssociation getItemAssociation() {
        return itemAssociation;
    }

    /**
     * Sets the value of the itemAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardItemCEDSType.ItemAssociation }
     *     
     */
    public void setItemAssociation(LearningStandardItemCEDSType.ItemAssociation value) {
        this.itemAssociation = value;
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
     *         &lt;element name="learningStandardItemAssociationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemAssociationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemAssociationConnectionCitation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemAssociationDestinationNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemAssociationDestinationNodeURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemAssociationOriginNodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemAssociationOriginNodeURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemAssociationWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "learningStandardItemAssociationIdentifier",
        "learningStandardItemAssociationType",
        "learningStandardItemAssociationConnectionCitation",
        "learningStandardItemAssociationDestinationNodeName",
        "learningStandardItemAssociationDestinationNodeURI",
        "learningStandardItemAssociationOriginNodeName",
        "learningStandardItemAssociationOriginNodeURI",
        "learningStandardItemAssociationWeight"
    })
    public static class ItemAssociation {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemAssociationIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemAssociationType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemAssociationConnectionCitation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemAssociationDestinationNodeName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemAssociationDestinationNodeURI;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemAssociationOriginNodeName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemAssociationOriginNodeURI;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemAssociationWeight;

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
         * Gets the value of the learningStandardItemAssociationConnectionCitation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemAssociationConnectionCitation() {
            return learningStandardItemAssociationConnectionCitation;
        }

        /**
         * Sets the value of the learningStandardItemAssociationConnectionCitation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemAssociationConnectionCitation(String value) {
            this.learningStandardItemAssociationConnectionCitation = value;
        }

        /**
         * Gets the value of the learningStandardItemAssociationDestinationNodeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemAssociationDestinationNodeName() {
            return learningStandardItemAssociationDestinationNodeName;
        }

        /**
         * Sets the value of the learningStandardItemAssociationDestinationNodeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemAssociationDestinationNodeName(String value) {
            this.learningStandardItemAssociationDestinationNodeName = value;
        }

        /**
         * Gets the value of the learningStandardItemAssociationDestinationNodeURI property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemAssociationDestinationNodeURI() {
            return learningStandardItemAssociationDestinationNodeURI;
        }

        /**
         * Sets the value of the learningStandardItemAssociationDestinationNodeURI property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemAssociationDestinationNodeURI(String value) {
            this.learningStandardItemAssociationDestinationNodeURI = value;
        }

        /**
         * Gets the value of the learningStandardItemAssociationOriginNodeName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemAssociationOriginNodeName() {
            return learningStandardItemAssociationOriginNodeName;
        }

        /**
         * Sets the value of the learningStandardItemAssociationOriginNodeName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemAssociationOriginNodeName(String value) {
            this.learningStandardItemAssociationOriginNodeName = value;
        }

        /**
         * Gets the value of the learningStandardItemAssociationOriginNodeURI property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemAssociationOriginNodeURI() {
            return learningStandardItemAssociationOriginNodeURI;
        }

        /**
         * Sets the value of the learningStandardItemAssociationOriginNodeURI property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemAssociationOriginNodeURI(String value) {
            this.learningStandardItemAssociationOriginNodeURI = value;
        }

        /**
         * Gets the value of the learningStandardItemAssociationWeight property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemAssociationWeight() {
            return learningStandardItemAssociationWeight;
        }

        /**
         * Sets the value of the learningStandardItemAssociationWeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemAssociationWeight(String value) {
            this.learningStandardItemAssociationWeight = value;
        }

    }

}
