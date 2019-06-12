
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LearningStandardItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LearningStandardItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RefURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="ItemVersion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="StandardSettingBody" type="{http://www.sifassociation.org/datamodel/na/4.x}StandardsSettingBodyType" minOccurs="0"/>
 *         &lt;element name="StandardHierarchyLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}StandardHierarchyLevelType"/>
 *         &lt;element name="PredecessorItems" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningStandardItemRefIdListType" minOccurs="0"/>
 *         &lt;element name="StatementCodes" type="{http://www.sifassociation.org/datamodel/na/4.x}StatementCodeListType" minOccurs="0"/>
 *         &lt;element name="Statements" type="{http://www.sifassociation.org/datamodel/na/4.x}StatementListType" minOccurs="0"/>
 *         &lt;element name="GradeLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelsType"/>
 *         &lt;element name="SubjectArea" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreaType" minOccurs="0"/>
 *         &lt;element name="StandardIdentifier" type="{http://www.sifassociation.org/datamodel/na/4.x}StandardIdentifierType" minOccurs="0"/>
 *         &lt;element name="LearningStandardDocumentRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType"/>
 *         &lt;element name="RelatedLearningStandardItems" type="{http://www.sifassociation.org/datamodel/na/4.x}RelatedLearningStandardItemRefIdListType" minOccurs="0"/>
 *         &lt;element name="Level4" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Level5" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LearningStandardItemType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "refURI",
    "shortName",
    "itemVersion",
    "description",
    "standardSettingBody",
    "standardHierarchyLevel",
    "predecessorItems",
    "statementCodes",
    "statements",
    "gradeLevels",
    "subjectArea",
    "standardIdentifier",
    "learningStandardDocumentRefId",
    "relatedLearningStandardItems",
    "level4",
    "level5",
    "sifMetadata",
    "sifExtendedElements"
})
public class LearningStandardItemType {

    @XmlElement(name = "RefURI", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String refURI;
    @XmlElement(name = "ShortName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shortName;
    @XmlElement(name = "ItemVersion", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemVersion;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(name = "StandardSettingBody", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StandardsSettingBodyType standardSettingBody;
    @XmlElement(name = "StandardHierarchyLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StandardHierarchyLevelType standardHierarchyLevel;
    @XmlElement(name = "PredecessorItems", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningStandardItemRefIdListType predecessorItems;
    @XmlElement(name = "StatementCodes", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StatementCodeListType statementCodes;
    @XmlElement(name = "Statements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StatementListType statements;
    @XmlElement(name = "GradeLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected GradeLevelsType gradeLevels;
    @XmlElement(name = "SubjectArea", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SubjectAreaType subjectArea;
    @XmlElement(name = "StandardIdentifier", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StandardIdentifierType standardIdentifier;
    @XmlElement(name = "LearningStandardDocumentRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String learningStandardDocumentRefId;
    @XmlElement(name = "RelatedLearningStandardItems", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected RelatedLearningStandardItemRefIdListType relatedLearningStandardItems;
    @XmlElement(name = "Level4", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String level4;
    @XmlElement(name = "Level5", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String level5;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the refURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefURI() {
        return refURI;
    }

    /**
     * Sets the value of the refURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefURI(String value) {
        this.refURI = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the itemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemVersion() {
        return itemVersion;
    }

    /**
     * Sets the value of the itemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemVersion(String value) {
        this.itemVersion = value;
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
     * Gets the value of the standardSettingBody property.
     * 
     * @return
     *     possible object is
     *     {@link StandardsSettingBodyType }
     *     
     */
    public StandardsSettingBodyType getStandardSettingBody() {
        return standardSettingBody;
    }

    /**
     * Sets the value of the standardSettingBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardsSettingBodyType }
     *     
     */
    public void setStandardSettingBody(StandardsSettingBodyType value) {
        this.standardSettingBody = value;
    }

    /**
     * Gets the value of the standardHierarchyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link StandardHierarchyLevelType }
     *     
     */
    public StandardHierarchyLevelType getStandardHierarchyLevel() {
        return standardHierarchyLevel;
    }

    /**
     * Sets the value of the standardHierarchyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardHierarchyLevelType }
     *     
     */
    public void setStandardHierarchyLevel(StandardHierarchyLevelType value) {
        this.standardHierarchyLevel = value;
    }

    /**
     * Gets the value of the predecessorItems property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public LearningStandardItemRefIdListType getPredecessorItems() {
        return predecessorItems;
    }

    /**
     * Sets the value of the predecessorItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public void setPredecessorItems(LearningStandardItemRefIdListType value) {
        this.predecessorItems = value;
    }

    /**
     * Gets the value of the statementCodes property.
     * 
     * @return
     *     possible object is
     *     {@link StatementCodeListType }
     *     
     */
    public StatementCodeListType getStatementCodes() {
        return statementCodes;
    }

    /**
     * Sets the value of the statementCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementCodeListType }
     *     
     */
    public void setStatementCodes(StatementCodeListType value) {
        this.statementCodes = value;
    }

    /**
     * Gets the value of the statements property.
     * 
     * @return
     *     possible object is
     *     {@link StatementListType }
     *     
     */
    public StatementListType getStatements() {
        return statements;
    }

    /**
     * Sets the value of the statements property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementListType }
     *     
     */
    public void setStatements(StatementListType value) {
        this.statements = value;
    }

    /**
     * Gets the value of the gradeLevels property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelsType }
     *     
     */
    public GradeLevelsType getGradeLevels() {
        return gradeLevels;
    }

    /**
     * Sets the value of the gradeLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelsType }
     *     
     */
    public void setGradeLevels(GradeLevelsType value) {
        this.gradeLevels = value;
    }

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAreaType }
     *     
     */
    public SubjectAreaType getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAreaType }
     *     
     */
    public void setSubjectArea(SubjectAreaType value) {
        this.subjectArea = value;
    }

    /**
     * Gets the value of the standardIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link StandardIdentifierType }
     *     
     */
    public StandardIdentifierType getStandardIdentifier() {
        return standardIdentifier;
    }

    /**
     * Sets the value of the standardIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardIdentifierType }
     *     
     */
    public void setStandardIdentifier(StandardIdentifierType value) {
        this.standardIdentifier = value;
    }

    /**
     * Gets the value of the learningStandardDocumentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentRefId() {
        return learningStandardDocumentRefId;
    }

    /**
     * Sets the value of the learningStandardDocumentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentRefId(String value) {
        this.learningStandardDocumentRefId = value;
    }

    /**
     * Gets the value of the relatedLearningStandardItems property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedLearningStandardItemRefIdListType }
     *     
     */
    public RelatedLearningStandardItemRefIdListType getRelatedLearningStandardItems() {
        return relatedLearningStandardItems;
    }

    /**
     * Sets the value of the relatedLearningStandardItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedLearningStandardItemRefIdListType }
     *     
     */
    public void setRelatedLearningStandardItems(RelatedLearningStandardItemRefIdListType value) {
        this.relatedLearningStandardItems = value;
    }

    /**
     * Gets the value of the level4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel4() {
        return level4;
    }

    /**
     * Sets the value of the level4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel4(String value) {
        this.level4 = value;
    }

    /**
     * Gets the value of the level5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel5() {
        return level5;
    }

    /**
     * Sets the value of the level5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel5(String value) {
        this.level5 = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SIFMetadataType }
     *     
     */
    public SIFMetadataType getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFMetadataType }
     *     
     */
    public void setSIFMetadata(SIFMetadataType value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
        this.sifExtendedElements = value;
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
