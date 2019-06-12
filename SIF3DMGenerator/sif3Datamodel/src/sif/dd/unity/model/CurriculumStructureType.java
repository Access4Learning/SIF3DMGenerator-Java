
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CurriculumStructureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurriculumStructureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Titles" type="{http://www.sifassociation.org/datamodel/na/4.x}TitleListType"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubjectArea" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreaType" minOccurs="0"/>
 *         &lt;element name="CurriculumHierarchyLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}CurriculumStructureCurriculumHierarchyLevelType"/>
 *         &lt;element name="PredecessorObjects" type="{http://www.sifassociation.org/datamodel/na/4.x}CurriculumStructureRefIdListType" minOccurs="0"/>
 *         &lt;element name="LearningObjectives" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningObjectiveListType" minOccurs="0"/>
 *         &lt;element name="ComponentObjects" type="{http://www.sifassociation.org/datamodel/na/4.x}ComponentObjectListType" minOccurs="0"/>
 *         &lt;element name="LearningStandards" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningStandardItemRefIdListType" minOccurs="0"/>
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
@XmlType(name = "CurriculumStructureType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "titles",
    "description",
    "subjectArea",
    "curriculumHierarchyLevel",
    "predecessorObjects",
    "learningObjectives",
    "componentObjects",
    "learningStandards",
    "sifMetadata",
    "sifExtendedElements"
})
public class CurriculumStructureType {

    @XmlElement(name = "Titles", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected TitleListType titles;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String description;
    @XmlElement(name = "SubjectArea", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SubjectAreaType subjectArea;
    @XmlElement(name = "CurriculumHierarchyLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected CurriculumStructureCurriculumHierarchyLevelType curriculumHierarchyLevel;
    @XmlElement(name = "PredecessorObjects", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CurriculumStructureRefIdListType predecessorObjects;
    @XmlElement(name = "LearningObjectives", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningObjectiveListType learningObjectives;
    @XmlElement(name = "ComponentObjects", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ComponentObjectListType componentObjects;
    @XmlElement(name = "LearningStandards", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningStandardItemRefIdListType learningStandards;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the titles property.
     * 
     * @return
     *     possible object is
     *     {@link TitleListType }
     *     
     */
    public TitleListType getTitles() {
        return titles;
    }

    /**
     * Sets the value of the titles property.
     * 
     * @param value
     *     allowed object is
     *     {@link TitleListType }
     *     
     */
    public void setTitles(TitleListType value) {
        this.titles = value;
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
     * Gets the value of the curriculumHierarchyLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CurriculumStructureCurriculumHierarchyLevelType }
     *     
     */
    public CurriculumStructureCurriculumHierarchyLevelType getCurriculumHierarchyLevel() {
        return curriculumHierarchyLevel;
    }

    /**
     * Sets the value of the curriculumHierarchyLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurriculumStructureCurriculumHierarchyLevelType }
     *     
     */
    public void setCurriculumHierarchyLevel(CurriculumStructureCurriculumHierarchyLevelType value) {
        this.curriculumHierarchyLevel = value;
    }

    /**
     * Gets the value of the predecessorObjects property.
     * 
     * @return
     *     possible object is
     *     {@link CurriculumStructureRefIdListType }
     *     
     */
    public CurriculumStructureRefIdListType getPredecessorObjects() {
        return predecessorObjects;
    }

    /**
     * Sets the value of the predecessorObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurriculumStructureRefIdListType }
     *     
     */
    public void setPredecessorObjects(CurriculumStructureRefIdListType value) {
        this.predecessorObjects = value;
    }

    /**
     * Gets the value of the learningObjectives property.
     * 
     * @return
     *     possible object is
     *     {@link LearningObjectiveListType }
     *     
     */
    public LearningObjectiveListType getLearningObjectives() {
        return learningObjectives;
    }

    /**
     * Sets the value of the learningObjectives property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningObjectiveListType }
     *     
     */
    public void setLearningObjectives(LearningObjectiveListType value) {
        this.learningObjectives = value;
    }

    /**
     * Gets the value of the componentObjects property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentObjectListType }
     *     
     */
    public ComponentObjectListType getComponentObjects() {
        return componentObjects;
    }

    /**
     * Sets the value of the componentObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentObjectListType }
     *     
     */
    public void setComponentObjects(ComponentObjectListType value) {
        this.componentObjects = value;
    }

    /**
     * Gets the value of the learningStandards property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public LearningStandardItemRefIdListType getLearningStandards() {
        return learningStandards;
    }

    /**
     * Sets the value of the learningStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public void setLearningStandards(LearningStandardItemRefIdListType value) {
        this.learningStandards = value;
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
