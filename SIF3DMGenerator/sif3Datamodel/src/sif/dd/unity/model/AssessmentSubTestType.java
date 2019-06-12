
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
 * <p>Java class for AssessmentSubTestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentSubTestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="ScoreRange" type="{http://www.sifassociation.org/datamodel/na/4.x}ScoreRangeType" minOccurs="0"/>
 *         &lt;element name="PerformanceLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}PerformanceLevelListType" minOccurs="0"/>
 *         &lt;element name="SubjectArea" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="GradeLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelsType" minOccurs="0"/>
 *         &lt;element name="AssessmentSubTestRefIds" type="{http://www.sifassociation.org/datamodel/na/4.x}AssessmentSubTestRefIdListType" minOccurs="0"/>
 *         &lt;element name="SubTestTier" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="LearningStandardItemRefIds" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningStandardItemRefIdListType" minOccurs="0"/>
 *         &lt;element name="Abbreviation" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NumberOfItems" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ContainerOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AssessmentSubTestType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "name",
    "scoreRange",
    "performanceLevels",
    "subjectArea",
    "gradeLevels",
    "assessmentSubTestRefIds",
    "subTestTier",
    "learningStandardItemRefIds",
    "abbreviation",
    "description",
    "numberOfItems",
    "containerOnly",
    "sifMetadata",
    "sifExtendedElements"
})
public class AssessmentSubTestType {

    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(name = "ScoreRange", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ScoreRangeType scoreRange;
    @XmlElement(name = "PerformanceLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PerformanceLevelListType performanceLevels;
    @XmlElement(name = "SubjectArea", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String subjectArea;
    @XmlElement(name = "GradeLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelsType gradeLevels;
    @XmlElement(name = "AssessmentSubTestRefIds", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AssessmentSubTestRefIdListType assessmentSubTestRefIds;
    @XmlElement(name = "SubTestTier", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long subTestTier;
    @XmlElement(name = "LearningStandardItemRefIds", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningStandardItemRefIdListType learningStandardItemRefIds;
    @XmlElement(name = "Abbreviation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String abbreviation;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String description;
    @XmlElement(name = "NumberOfItems", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long numberOfItems;
    @XmlElement(name = "ContainerOnly", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean containerOnly;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the scoreRange property.
     * 
     * @return
     *     possible object is
     *     {@link ScoreRangeType }
     *     
     */
    public ScoreRangeType getScoreRange() {
        return scoreRange;
    }

    /**
     * Sets the value of the scoreRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScoreRangeType }
     *     
     */
    public void setScoreRange(ScoreRangeType value) {
        this.scoreRange = value;
    }

    /**
     * Gets the value of the performanceLevels property.
     * 
     * @return
     *     possible object is
     *     {@link PerformanceLevelListType }
     *     
     */
    public PerformanceLevelListType getPerformanceLevels() {
        return performanceLevels;
    }

    /**
     * Sets the value of the performanceLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link PerformanceLevelListType }
     *     
     */
    public void setPerformanceLevels(PerformanceLevelListType value) {
        this.performanceLevels = value;
    }

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectArea(String value) {
        this.subjectArea = value;
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
     * Gets the value of the assessmentSubTestRefIds property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSubTestRefIdListType }
     *     
     */
    public AssessmentSubTestRefIdListType getAssessmentSubTestRefIds() {
        return assessmentSubTestRefIds;
    }

    /**
     * Sets the value of the assessmentSubTestRefIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSubTestRefIdListType }
     *     
     */
    public void setAssessmentSubTestRefIds(AssessmentSubTestRefIdListType value) {
        this.assessmentSubTestRefIds = value;
    }

    /**
     * Gets the value of the subTestTier property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSubTestTier() {
        return subTestTier;
    }

    /**
     * Sets the value of the subTestTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSubTestTier(Long value) {
        this.subTestTier = value;
    }

    /**
     * Gets the value of the learningStandardItemRefIds property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public LearningStandardItemRefIdListType getLearningStandardItemRefIds() {
        return learningStandardItemRefIds;
    }

    /**
     * Sets the value of the learningStandardItemRefIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public void setLearningStandardItemRefIds(LearningStandardItemRefIdListType value) {
        this.learningStandardItemRefIds = value;
    }

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
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
     * Gets the value of the numberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumberOfItems(Long value) {
        this.numberOfItems = value;
    }

    /**
     * Gets the value of the containerOnly property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContainerOnly() {
        return containerOnly;
    }

    /**
     * Sets the value of the containerOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainerOnly(Boolean value) {
        this.containerOnly = value;
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
