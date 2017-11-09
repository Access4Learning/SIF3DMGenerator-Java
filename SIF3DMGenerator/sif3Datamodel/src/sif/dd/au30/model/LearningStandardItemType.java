
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="StandardSettingBody" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Country" type="{http://www.sifassociation.org/datamodel/au/3.4}CountryType"/>
 *                   &lt;element name="StateProvince" type="{http://www.sifassociation.org/datamodel/au/3.4}StateProvinceType" minOccurs="0"/>
 *                   &lt;element name="SettingBodyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StandardHierarchyLevel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PredecessorItems" type="{http://www.sifassociation.org/datamodel/au/3.4}LearningStandardsType" minOccurs="0"/>
 *         &lt;element name="StatementCodes" type="{http://www.sifassociation.org/datamodel/au/3.4}StatementCodesType" minOccurs="0"/>
 *         &lt;element name="Statements" type="{http://www.sifassociation.org/datamodel/au/3.4}StatementsType" minOccurs="0"/>
 *         &lt;element name="YearLevels" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelsType"/>
 *         &lt;element name="ACStrandSubjectArea" type="{http://www.sifassociation.org/datamodel/au/3.4}ACStrandSubjectAreaType" minOccurs="0"/>
 *         &lt;element name="StandardIdentifier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="YearCreated" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *                   &lt;element name="ACStrandSubjectArea" type="{http://www.sifassociation.org/datamodel/au/3.4}ACStrandSubjectAreaType"/>
 *                   &lt;element name="StandardNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                   &lt;element name="YearLevels" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelsType"/>
 *                   &lt;element name="Benchmark" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="YearLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType" minOccurs="0"/>
 *                   &lt;element name="IndicatorNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="AlternateIdentificationCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AlternateIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LearningStandardDocumentRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType"/>
 *         &lt;element name="RelatedLearningStandardItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LearningStandardItemRefId" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4>IdRefType">
 *                           &lt;attribute name="RelationshipType" use="required">
 *                             &lt;simpleType>
 *                               &lt;union>
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsLearningStandardItemRelationshipTypesType">
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/union>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Level4" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Level5" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
    "sifMetadata",
    "sifExtendedElements"
})
public class LearningStandardItemType {

    @XmlElementRef(name = "Resources", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LResourcesType> resources;
    @XmlElementRef(name = "StandardSettingBody", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningStandardItemType.StandardSettingBody> standardSettingBody;
    @XmlElement(name = "StandardHierarchyLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected LearningStandardItemType.StandardHierarchyLevel standardHierarchyLevel;
    @XmlElementRef(name = "PredecessorItems", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningStandardsType> predecessorItems;
    @XmlElementRef(name = "StatementCodes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StatementCodesType> statementCodes;
    @XmlElementRef(name = "Statements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StatementsType> statements;
    @XmlElement(name = "YearLevels", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected YearLevelsType yearLevels;
    @XmlElementRef(name = "ACStrandSubjectArea", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ACStrandSubjectAreaType> acStrandSubjectArea;
    @XmlElementRef(name = "StandardIdentifier", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningStandardItemType.StandardIdentifier> standardIdentifier;
    @XmlElement(name = "LearningStandardDocumentRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String learningStandardDocumentRefId;
    @XmlElementRef(name = "RelatedLearningStandardItems", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningStandardItemType.RelatedLearningStandardItems> relatedLearningStandardItems;
    @XmlElementRef(name = "Level4", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level4;
    @XmlElementRef(name = "Level5", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> level5;
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
     *     {@link JAXBElement }{@code <}{@link LearningStandardItemType.StandardSettingBody }{@code >}
     *     
     */
    public JAXBElement<LearningStandardItemType.StandardSettingBody> getStandardSettingBody() {
        return standardSettingBody;
    }

    /**
     * Sets the value of the standardSettingBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardItemType.StandardSettingBody }{@code >}
     *     
     */
    public void setStandardSettingBody(JAXBElement<LearningStandardItemType.StandardSettingBody> value) {
        this.standardSettingBody = value;
    }

    /**
     * Gets the value of the standardHierarchyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardItemType.StandardHierarchyLevel }
     *     
     */
    public LearningStandardItemType.StandardHierarchyLevel getStandardHierarchyLevel() {
        return standardHierarchyLevel;
    }

    /**
     * Sets the value of the standardHierarchyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardItemType.StandardHierarchyLevel }
     *     
     */
    public void setStandardHierarchyLevel(LearningStandardItemType.StandardHierarchyLevel value) {
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
     *     {@link JAXBElement }{@code <}{@link LearningStandardItemType.StandardIdentifier }{@code >}
     *     
     */
    public JAXBElement<LearningStandardItemType.StandardIdentifier> getStandardIdentifier() {
        return standardIdentifier;
    }

    /**
     * Sets the value of the standardIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardItemType.StandardIdentifier }{@code >}
     *     
     */
    public void setStandardIdentifier(JAXBElement<LearningStandardItemType.StandardIdentifier> value) {
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
     *     {@link JAXBElement }{@code <}{@link LearningStandardItemType.RelatedLearningStandardItems }{@code >}
     *     
     */
    public JAXBElement<LearningStandardItemType.RelatedLearningStandardItems> getRelatedLearningStandardItems() {
        return relatedLearningStandardItems;
    }

    /**
     * Sets the value of the relatedLearningStandardItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardItemType.RelatedLearningStandardItems }{@code >}
     *     
     */
    public void setRelatedLearningStandardItems(JAXBElement<LearningStandardItemType.RelatedLearningStandardItems> value) {
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
     *         &lt;element name="LearningStandardItemRefId" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4>IdRefType">
     *                 &lt;attribute name="RelationshipType" use="required">
     *                   &lt;simpleType>
     *                     &lt;union>
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsLearningStandardItemRelationshipTypesType">
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/union>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "learningStandardItemRefId"
    })
    public static class RelatedLearningStandardItems {

        @XmlElement(name = "LearningStandardItemRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
        protected List<LearningStandardItemType.RelatedLearningStandardItems.LearningStandardItemRefId> learningStandardItemRefId;

        /**
         * Gets the value of the learningStandardItemRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the learningStandardItemRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLearningStandardItemRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LearningStandardItemType.RelatedLearningStandardItems.LearningStandardItemRefId }
         * 
         * 
         */
        public List<LearningStandardItemType.RelatedLearningStandardItems.LearningStandardItemRefId> getLearningStandardItemRefId() {
            if (learningStandardItemRefId == null) {
                learningStandardItemRefId = new ArrayList<LearningStandardItemType.RelatedLearningStandardItems.LearningStandardItemRefId>();
            }
            return this.learningStandardItemRefId;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4>IdRefType">
         *       &lt;attribute name="RelationshipType" use="required">
         *         &lt;simpleType>
         *           &lt;union>
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsLearningStandardItemRelationshipTypesType">
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/union>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class LearningStandardItemRefId {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String value;
            @XmlAttribute(name = "RelationshipType", required = true)
            protected String relationshipType;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the relationshipType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRelationshipType() {
                return relationshipType;
            }

            /**
             * Sets the value of the relationshipType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRelationshipType(String value) {
                this.relationshipType = value;
            }

        }

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
     *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "number",
        "description"
    })
    public static class StandardHierarchyLevel {

        @XmlElement(name = "Number", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
        @XmlSchemaType(name = "unsignedInt")
        protected long number;
        @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
        protected String description;

        /**
         * Gets the value of the number property.
         * 
         */
        public long getNumber() {
            return number;
        }

        /**
         * Sets the value of the number property.
         * 
         */
        public void setNumber(long value) {
            this.number = value;
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
     *         &lt;element name="YearCreated" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
     *         &lt;element name="ACStrandSubjectArea" type="{http://www.sifassociation.org/datamodel/au/3.4}ACStrandSubjectAreaType"/>
     *         &lt;element name="StandardNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *         &lt;element name="YearLevels" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelsType"/>
     *         &lt;element name="Benchmark" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="YearLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType" minOccurs="0"/>
     *         &lt;element name="IndicatorNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="AlternateIdentificationCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AlternateIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Organization" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
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
        "yearCreated",
        "acStrandSubjectArea",
        "standardNumber",
        "yearLevels",
        "benchmark",
        "yearLevel",
        "indicatorNumber",
        "alternateIdentificationCodes",
        "organization"
    })
    public static class StandardIdentifier {

        @XmlElement(name = "YearCreated", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
        @XmlSchemaType(name = "gYear")
        protected XMLGregorianCalendar yearCreated;
        @XmlElement(name = "ACStrandSubjectArea", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
        protected ACStrandSubjectAreaType acStrandSubjectArea;
        @XmlElement(name = "StandardNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String standardNumber;
        @XmlElement(name = "YearLevels", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
        protected YearLevelsType yearLevels;
        @XmlElementRef(name = "Benchmark", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> benchmark;
        @XmlElementRef(name = "YearLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<YearLevelType> yearLevel;
        @XmlElementRef(name = "IndicatorNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> indicatorNumber;
        @XmlElementRef(name = "AlternateIdentificationCodes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<LearningStandardItemType.StandardIdentifier.AlternateIdentificationCodes> alternateIdentificationCodes;
        @XmlElement(name = "Organization", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String organization;

        /**
         * Gets the value of the yearCreated property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getYearCreated() {
            return yearCreated;
        }

        /**
         * Sets the value of the yearCreated property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setYearCreated(XMLGregorianCalendar value) {
            this.yearCreated = value;
        }

        /**
         * Gets the value of the acStrandSubjectArea property.
         * 
         * @return
         *     possible object is
         *     {@link ACStrandSubjectAreaType }
         *     
         */
        public ACStrandSubjectAreaType getACStrandSubjectArea() {
            return acStrandSubjectArea;
        }

        /**
         * Sets the value of the acStrandSubjectArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link ACStrandSubjectAreaType }
         *     
         */
        public void setACStrandSubjectArea(ACStrandSubjectAreaType value) {
            this.acStrandSubjectArea = value;
        }

        /**
         * Gets the value of the standardNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStandardNumber() {
            return standardNumber;
        }

        /**
         * Sets the value of the standardNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStandardNumber(String value) {
            this.standardNumber = value;
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
         * Gets the value of the benchmark property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBenchmark() {
            return benchmark;
        }

        /**
         * Sets the value of the benchmark property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBenchmark(JAXBElement<String> value) {
            this.benchmark = value;
        }

        /**
         * Gets the value of the yearLevel property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}
         *     
         */
        public JAXBElement<YearLevelType> getYearLevel() {
            return yearLevel;
        }

        /**
         * Sets the value of the yearLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}
         *     
         */
        public void setYearLevel(JAXBElement<YearLevelType> value) {
            this.yearLevel = value;
        }

        /**
         * Gets the value of the indicatorNumber property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getIndicatorNumber() {
            return indicatorNumber;
        }

        /**
         * Sets the value of the indicatorNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setIndicatorNumber(JAXBElement<String> value) {
            this.indicatorNumber = value;
        }

        /**
         * Gets the value of the alternateIdentificationCodes property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link LearningStandardItemType.StandardIdentifier.AlternateIdentificationCodes }{@code >}
         *     
         */
        public JAXBElement<LearningStandardItemType.StandardIdentifier.AlternateIdentificationCodes> getAlternateIdentificationCodes() {
            return alternateIdentificationCodes;
        }

        /**
         * Sets the value of the alternateIdentificationCodes property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link LearningStandardItemType.StandardIdentifier.AlternateIdentificationCodes }{@code >}
         *     
         */
        public void setAlternateIdentificationCodes(JAXBElement<LearningStandardItemType.StandardIdentifier.AlternateIdentificationCodes> value) {
            this.alternateIdentificationCodes = value;
        }

        /**
         * Gets the value of the organization property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganization() {
            return organization;
        }

        /**
         * Sets the value of the organization property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganization(String value) {
            this.organization = value;
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
         *         &lt;element name="AlternateIdentificationCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded"/>
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
            "alternateIdentificationCode"
        })
        public static class AlternateIdentificationCodes {

            @XmlElement(name = "AlternateIdentificationCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected List<String> alternateIdentificationCode;

            /**
             * Gets the value of the alternateIdentificationCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the alternateIdentificationCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAlternateIdentificationCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getAlternateIdentificationCode() {
                if (alternateIdentificationCode == null) {
                    alternateIdentificationCode = new ArrayList<String>();
                }
                return this.alternateIdentificationCode;
            }

        }

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
     *         &lt;element name="Country" type="{http://www.sifassociation.org/datamodel/au/3.4}CountryType"/>
     *         &lt;element name="StateProvince" type="{http://www.sifassociation.org/datamodel/au/3.4}StateProvinceType" minOccurs="0"/>
     *         &lt;element name="SettingBodyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
        "country",
        "stateProvince",
        "settingBodyName"
    })
    public static class StandardSettingBody {

        @XmlElement(name = "Country", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String country;
        @XmlElementRef(name = "StateProvince", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> stateProvince;
        @XmlElementRef(name = "SettingBodyName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> settingBodyName;

        /**
         * Gets the value of the country property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountry() {
            return country;
        }

        /**
         * Sets the value of the country property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountry(String value) {
            this.country = value;
        }

        /**
         * Gets the value of the stateProvince property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getStateProvince() {
            return stateProvince;
        }

        /**
         * Sets the value of the stateProvince property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setStateProvince(JAXBElement<String> value) {
            this.stateProvince = value;
        }

        /**
         * Gets the value of the settingBodyName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getSettingBodyName() {
            return settingBodyName;
        }

        /**
         * Sets the value of the settingBodyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setSettingBodyName(JAXBElement<String> value) {
            this.settingBodyName = value;
        }

    }

}
