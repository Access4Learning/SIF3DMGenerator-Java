
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
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
 *         &lt;element name="Resources" type="{http://www.sifassociation.org/datamodel/au/3.4}LResourcesType" minOccurs="0"/>
 *         &lt;element name="StandardSettingBody" type="{http://www.sifassociation.org/datamodel/au/3.4}StandardsSettingBodyType" minOccurs="0"/>
 *         &lt;element name="StandardHierarchyLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}StandardHierarchyLevelType" minOccurs="0"/>
 *         &lt;element name="PredecessorItems" type="{http://www.sifassociation.org/datamodel/au/3.4}LearningStandardsType" minOccurs="0"/>
 *         &lt;element name="StatementCodes" type="{http://www.sifassociation.org/datamodel/au/3.4}StatementCodesType" minOccurs="0"/>
 *         &lt;element name="Statements" type="{http://www.sifassociation.org/datamodel/au/3.4}StatementsType" minOccurs="0"/>
 *         &lt;element name="YearLevels" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelsType" minOccurs="0"/>
 *         &lt;element name="ACStrandSubjectArea" type="{http://www.sifassociation.org/datamodel/au/3.4}ACStrandSubjectAreaType" minOccurs="0"/>
 *         &lt;element name="StandardIdentifier" type="{http://www.sifassociation.org/datamodel/au/3.4}StandardIdentifierType" minOccurs="0"/>
 *         &lt;element name="LearningStandardDocumentRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="RelatedLearningStandardItems" type="{http://www.sifassociation.org/datamodel/au/3.4}RelatedLearningStandardItemRefIdListType" minOccurs="0"/>
 *         &lt;element name="Level4" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Level5" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="LocalCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalCodeListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LearningStandardItemType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "resources",
    "standardSettingBody",
    "standardHierarchyLevel",
    "predecessorItems",
    "statementCodes",
    "statements",
    "yearLevels",
    "acStrandSubjectArea",
    "standardIdentifier",
    "learningStandardDocumentRefId",
    "relatedLearningStandardItems",
    "level4",
    "level5",
    "localCodeList",
    "sifMetadata",
    "sifExtendedElements"
})
public class LearningStandardItemType {

    @XmlElementRef(name = "Resources", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LResourcesType> resources;
    @XmlElementRef(name = "StandardSettingBody", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardsSettingBodyType> standardSettingBody;
    @XmlElement(name = "StandardHierarchyLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected StandardHierarchyLevelType standardHierarchyLevel;
    @XmlElementRef(name = "PredecessorItems", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningStandardsType> predecessorItems;
    @XmlElementRef(name = "StatementCodes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StatementCodesType> statementCodes;
    @XmlElementRef(name = "Statements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StatementsType> statements;
    @XmlElement(name = "YearLevels", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected YearLevelsType yearLevels;
    @XmlElementRef(name = "ACStrandSubjectArea", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ACStrandSubjectAreaType> acStrandSubjectArea;
    @XmlElementRef(name = "StandardIdentifier", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StandardIdentifierType> standardIdentifier;
    @XmlElement(name = "LearningStandardDocumentRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String learningStandardDocumentRefId;
    @XmlElementRef(name = "RelatedLearningStandardItems", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<RelatedLearningStandardItemRefIdListType> relatedLearningStandardItems;
    @XmlElementRef(name = "Level4", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level4;
    @XmlElementRef(name = "Level5", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level5;
    @XmlElementRef(name = "LocalCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalCodeListType> localCodeList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the resources property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LResourcesType }{@code >}
     *     
     */
    public JAXBElement<LResourcesType> getResources() {
        return resources;
    }

    /**
     * Sets the value of the resources property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LResourcesType }{@code >}
     *     
     */
    public void setResources(JAXBElement<LResourcesType> value) {
        this.resources = value;
    }

    /**
     * Gets the value of the standardSettingBody property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardsSettingBodyType }{@code >}
     *     
     */
    public JAXBElement<StandardsSettingBodyType> getStandardSettingBody() {
        return standardSettingBody;
    }

    /**
     * Sets the value of the standardSettingBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardsSettingBodyType }{@code >}
     *     
     */
    public void setStandardSettingBody(JAXBElement<StandardsSettingBodyType> value) {
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
     *     {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}
     *     
     */
    public JAXBElement<LearningStandardsType> getPredecessorItems() {
        return predecessorItems;
    }

    /**
     * Sets the value of the predecessorItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}
     *     
     */
    public void setPredecessorItems(JAXBElement<LearningStandardsType> value) {
        this.predecessorItems = value;
    }

    /**
     * Gets the value of the statementCodes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatementCodesType }{@code >}
     *     
     */
    public JAXBElement<StatementCodesType> getStatementCodes() {
        return statementCodes;
    }

    /**
     * Sets the value of the statementCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatementCodesType }{@code >}
     *     
     */
    public void setStatementCodes(JAXBElement<StatementCodesType> value) {
        this.statementCodes = value;
    }

    /**
     * Gets the value of the statements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatementsType }{@code >}
     *     
     */
    public JAXBElement<StatementsType> getStatements() {
        return statements;
    }

    /**
     * Sets the value of the statements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatementsType }{@code >}
     *     
     */
    public void setStatements(JAXBElement<StatementsType> value) {
        this.statements = value;
    }

    /**
     * Gets the value of the yearLevels property.
     * 
     * @return
     *     possible object is
     *     {@link YearLevelsType }
     *     
     */
    public YearLevelsType getYearLevels() {
        return yearLevels;
    }

    /**
     * Sets the value of the yearLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearLevelsType }
     *     
     */
    public void setYearLevels(YearLevelsType value) {
        this.yearLevels = value;
    }

    /**
     * Gets the value of the acStrandSubjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACStrandSubjectAreaType }{@code >}
     *     
     */
    public JAXBElement<ACStrandSubjectAreaType> getACStrandSubjectArea() {
        return acStrandSubjectArea;
    }

    /**
     * Sets the value of the acStrandSubjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACStrandSubjectAreaType }{@code >}
     *     
     */
    public void setACStrandSubjectArea(JAXBElement<ACStrandSubjectAreaType> value) {
        this.acStrandSubjectArea = value;
    }

    /**
     * Gets the value of the standardIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StandardIdentifierType }{@code >}
     *     
     */
    public JAXBElement<StandardIdentifierType> getStandardIdentifier() {
        return standardIdentifier;
    }

    /**
     * Sets the value of the standardIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StandardIdentifierType }{@code >}
     *     
     */
    public void setStandardIdentifier(JAXBElement<StandardIdentifierType> value) {
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
     *     {@link JAXBElement }{@code <}{@link RelatedLearningStandardItemRefIdListType }{@code >}
     *     
     */
    public JAXBElement<RelatedLearningStandardItemRefIdListType> getRelatedLearningStandardItems() {
        return relatedLearningStandardItems;
    }

    /**
     * Sets the value of the relatedLearningStandardItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RelatedLearningStandardItemRefIdListType }{@code >}
     *     
     */
    public void setRelatedLearningStandardItems(JAXBElement<RelatedLearningStandardItemRefIdListType> value) {
        this.relatedLearningStandardItems = value;
    }

    /**
     * Gets the value of the level4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevel4() {
        return level4;
    }

    /**
     * Sets the value of the level4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevel4(JAXBElement<String> value) {
        this.level4 = value;
    }

    /**
     * Gets the value of the level5 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevel5() {
        return level5;
    }

    /**
     * Sets the value of the level5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevel5(JAXBElement<String> value) {
        this.level5 = value;
    }

    /**
     * Gets the value of the localCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public JAXBElement<LocalCodeListType> getLocalCodeList() {
        return localCodeList;
    }

    /**
     * Sets the value of the localCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public void setLocalCodeList(JAXBElement<LocalCodeListType> value) {
        this.localCodeList = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
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
