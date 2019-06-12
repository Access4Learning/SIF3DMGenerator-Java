
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
 * <p>Java class for LessonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LessonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SourceObjects" type="{http://www.sifassociation.org/datamodel/na/4.x}SourceObjectListType" minOccurs="0"/>
 *         &lt;element name="CurriculumStructures" type="{http://www.sifassociation.org/datamodel/na/4.x}CurriculumStructuresRefIdListType" minOccurs="0"/>
 *         &lt;element name="SubjectArea" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreaType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="Duration" type="{http://www.sifassociation.org/datamodel/na/4.x}DurationType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Procedure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Strategies" type="{http://www.sifassociation.org/datamodel/na/4.x}LessonStrategyListType" minOccurs="0"/>
 *         &lt;element name="LearningObjectives" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningObjectiveListType" minOccurs="0"/>
 *         &lt;element name="SupportingActivities" type="{http://www.sifassociation.org/datamodel/na/4.x}ActivityRefIdListType" minOccurs="0"/>
 *         &lt;element name="LearningStandards" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningStandardItemRefIdListType" minOccurs="0"/>
 *         &lt;element name="LearningResources" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningResourceRefIdListType" minOccurs="0"/>
 *         &lt;element name="LessonSources" type="{http://www.sifassociation.org/datamodel/na/4.x}LessonSourceListType" minOccurs="0"/>
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
@XmlType(name = "LessonType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "sourceObjects",
    "curriculumStructures",
    "subjectArea",
    "title",
    "duration",
    "description",
    "procedure",
    "strategies",
    "learningObjectives",
    "supportingActivities",
    "learningStandards",
    "learningResources",
    "lessonSources",
    "sifMetadata",
    "sifExtendedElements"
})
public class LessonType {

    @XmlElement(name = "SourceObjects", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SourceObjectListType sourceObjects;
    @XmlElement(name = "CurriculumStructures", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CurriculumStructuresRefIdListType curriculumStructures;
    @XmlElement(name = "SubjectArea", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SubjectAreaType subjectArea;
    @XmlElement(name = "Title", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlElement(name = "Duration", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DurationType duration;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String description;
    @XmlElement(name = "Procedure", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String procedure;
    @XmlElement(name = "Strategies", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LessonStrategyListType strategies;
    @XmlElement(name = "LearningObjectives", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningObjectiveListType learningObjectives;
    @XmlElement(name = "SupportingActivities", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ActivityRefIdListType supportingActivities;
    @XmlElement(name = "LearningStandards", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningStandardItemRefIdListType learningStandards;
    @XmlElement(name = "LearningResources", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningResourceRefIdListType learningResources;
    @XmlElement(name = "LessonSources", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LessonSourceListType lessonSources;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the sourceObjects property.
     * 
     * @return
     *     possible object is
     *     {@link SourceObjectListType }
     *     
     */
    public SourceObjectListType getSourceObjects() {
        return sourceObjects;
    }

    /**
     * Sets the value of the sourceObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceObjectListType }
     *     
     */
    public void setSourceObjects(SourceObjectListType value) {
        this.sourceObjects = value;
    }

    /**
     * Gets the value of the curriculumStructures property.
     * 
     * @return
     *     possible object is
     *     {@link CurriculumStructuresRefIdListType }
     *     
     */
    public CurriculumStructuresRefIdListType getCurriculumStructures() {
        return curriculumStructures;
    }

    /**
     * Sets the value of the curriculumStructures property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurriculumStructuresRefIdListType }
     *     
     */
    public void setCurriculumStructures(CurriculumStructuresRefIdListType value) {
        this.curriculumStructures = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationType }
     *     
     */
    public DurationType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationType }
     *     
     */
    public void setDuration(DurationType value) {
        this.duration = value;
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
     * Gets the value of the procedure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcedure() {
        return procedure;
    }

    /**
     * Sets the value of the procedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcedure(String value) {
        this.procedure = value;
    }

    /**
     * Gets the value of the strategies property.
     * 
     * @return
     *     possible object is
     *     {@link LessonStrategyListType }
     *     
     */
    public LessonStrategyListType getStrategies() {
        return strategies;
    }

    /**
     * Sets the value of the strategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link LessonStrategyListType }
     *     
     */
    public void setStrategies(LessonStrategyListType value) {
        this.strategies = value;
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
     * Gets the value of the supportingActivities property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityRefIdListType }
     *     
     */
    public ActivityRefIdListType getSupportingActivities() {
        return supportingActivities;
    }

    /**
     * Sets the value of the supportingActivities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityRefIdListType }
     *     
     */
    public void setSupportingActivities(ActivityRefIdListType value) {
        this.supportingActivities = value;
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
     * Gets the value of the learningResources property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceRefIdListType }
     *     
     */
    public LearningResourceRefIdListType getLearningResources() {
        return learningResources;
    }

    /**
     * Sets the value of the learningResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceRefIdListType }
     *     
     */
    public void setLearningResources(LearningResourceRefIdListType value) {
        this.learningResources = value;
    }

    /**
     * Gets the value of the lessonSources property.
     * 
     * @return
     *     possible object is
     *     {@link LessonSourceListType }
     *     
     */
    public LessonSourceListType getLessonSources() {
        return lessonSources;
    }

    /**
     * Sets the value of the lessonSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link LessonSourceListType }
     *     
     */
    public void setLessonSources(LessonSourceListType value) {
        this.lessonSources = value;
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
