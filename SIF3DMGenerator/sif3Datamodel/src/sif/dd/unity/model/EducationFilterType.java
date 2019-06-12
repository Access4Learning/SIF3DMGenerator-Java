
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EducationFilterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EducationFilterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MediaTypes" type="{http://www.sifassociation.org/datamodel/na/4.x}MediaTypesType" minOccurs="0"/>
 *         &lt;element name="GradeLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelsType" minOccurs="0"/>
 *         &lt;element name="SubjectAreas" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreasType" minOccurs="0"/>
 *         &lt;element name="InterestLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}InterestLevelsType" minOccurs="0"/>
 *         &lt;element name="LearningStandardItems" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningStandardItemsType" minOccurs="0"/>
 *         &lt;element name="BloomsTaxonomyLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}BloomsTaxonomyLevelsType" minOccurs="0"/>
 *         &lt;element name="MultipleIntelligences" type="{http://www.sifassociation.org/datamodel/na/4.x}MultipleIntelligencesType" minOccurs="0"/>
 *         &lt;element name="InstructionalStrategies" type="{http://www.sifassociation.org/datamodel/na/4.x}InstructionalStrategiesType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Summary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LearningObjectives" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningObjectivesType" minOccurs="0"/>
 *         &lt;element name="ResourceTypes" type="{http://www.sifassociation.org/datamodel/na/4.x}ResourceTypesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EducationFilterType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "mediaTypes",
    "gradeLevels",
    "subjectAreas",
    "interestLevels",
    "learningStandardItems",
    "bloomsTaxonomyLevels",
    "multipleIntelligences",
    "instructionalStrategies",
    "title",
    "summary",
    "learningObjectives",
    "resourceTypes"
})
public class EducationFilterType {

    @XmlElement(name = "MediaTypes", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MediaTypesType mediaTypes;
    @XmlElement(name = "GradeLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelsType gradeLevels;
    @XmlElement(name = "SubjectAreas", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SubjectAreasType subjectAreas;
    @XmlElement(name = "InterestLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected InterestLevelsType interestLevels;
    @XmlElement(name = "LearningStandardItems", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningStandardItemsType learningStandardItems;
    @XmlElement(name = "BloomsTaxonomyLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BloomsTaxonomyLevelsType bloomsTaxonomyLevels;
    @XmlElement(name = "MultipleIntelligences", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MultipleIntelligencesType multipleIntelligences;
    @XmlElement(name = "InstructionalStrategies", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected InstructionalStrategiesType instructionalStrategies;
    @XmlElement(name = "Title", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlElement(name = "Summary", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String summary;
    @XmlElement(name = "LearningObjectives", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningObjectivesType learningObjectives;
    @XmlElement(name = "ResourceTypes", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ResourceTypesType resourceTypes;

    /**
     * Gets the value of the mediaTypes property.
     * 
     * @return
     *     possible object is
     *     {@link MediaTypesType }
     *     
     */
    public MediaTypesType getMediaTypes() {
        return mediaTypes;
    }

    /**
     * Sets the value of the mediaTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTypesType }
     *     
     */
    public void setMediaTypes(MediaTypesType value) {
        this.mediaTypes = value;
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
     * Gets the value of the subjectAreas property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAreasType }
     *     
     */
    public SubjectAreasType getSubjectAreas() {
        return subjectAreas;
    }

    /**
     * Sets the value of the subjectAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAreasType }
     *     
     */
    public void setSubjectAreas(SubjectAreasType value) {
        this.subjectAreas = value;
    }

    /**
     * Gets the value of the interestLevels property.
     * 
     * @return
     *     possible object is
     *     {@link InterestLevelsType }
     *     
     */
    public InterestLevelsType getInterestLevels() {
        return interestLevels;
    }

    /**
     * Sets the value of the interestLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link InterestLevelsType }
     *     
     */
    public void setInterestLevels(InterestLevelsType value) {
        this.interestLevels = value;
    }

    /**
     * Gets the value of the learningStandardItems property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardItemsType }
     *     
     */
    public LearningStandardItemsType getLearningStandardItems() {
        return learningStandardItems;
    }

    /**
     * Sets the value of the learningStandardItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardItemsType }
     *     
     */
    public void setLearningStandardItems(LearningStandardItemsType value) {
        this.learningStandardItems = value;
    }

    /**
     * Gets the value of the bloomsTaxonomyLevels property.
     * 
     * @return
     *     possible object is
     *     {@link BloomsTaxonomyLevelsType }
     *     
     */
    public BloomsTaxonomyLevelsType getBloomsTaxonomyLevels() {
        return bloomsTaxonomyLevels;
    }

    /**
     * Sets the value of the bloomsTaxonomyLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BloomsTaxonomyLevelsType }
     *     
     */
    public void setBloomsTaxonomyLevels(BloomsTaxonomyLevelsType value) {
        this.bloomsTaxonomyLevels = value;
    }

    /**
     * Gets the value of the multipleIntelligences property.
     * 
     * @return
     *     possible object is
     *     {@link MultipleIntelligencesType }
     *     
     */
    public MultipleIntelligencesType getMultipleIntelligences() {
        return multipleIntelligences;
    }

    /**
     * Sets the value of the multipleIntelligences property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultipleIntelligencesType }
     *     
     */
    public void setMultipleIntelligences(MultipleIntelligencesType value) {
        this.multipleIntelligences = value;
    }

    /**
     * Gets the value of the instructionalStrategies property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionalStrategiesType }
     *     
     */
    public InstructionalStrategiesType getInstructionalStrategies() {
        return instructionalStrategies;
    }

    /**
     * Sets the value of the instructionalStrategies property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionalStrategiesType }
     *     
     */
    public void setInstructionalStrategies(InstructionalStrategiesType value) {
        this.instructionalStrategies = value;
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
     * Gets the value of the summary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSummary(String value) {
        this.summary = value;
    }

    /**
     * Gets the value of the learningObjectives property.
     * 
     * @return
     *     possible object is
     *     {@link LearningObjectivesType }
     *     
     */
    public LearningObjectivesType getLearningObjectives() {
        return learningObjectives;
    }

    /**
     * Sets the value of the learningObjectives property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningObjectivesType }
     *     
     */
    public void setLearningObjectives(LearningObjectivesType value) {
        this.learningObjectives = value;
    }

    /**
     * Gets the value of the resourceTypes property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceTypesType }
     *     
     */
    public ResourceTypesType getResourceTypes() {
        return resourceTypes;
    }

    /**
     * Sets the value of the resourceTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceTypesType }
     *     
     */
    public void setResourceTypes(ResourceTypesType value) {
        this.resourceTypes = value;
    }

}
