
package sif.dd.au30.model;

import java.math.BigDecimal;
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
 * <p>Java class for ActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Preamble" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TechnicalRequirements" type="{http://www.sifassociation.org/datamodel/au/3.4}TechnicalRequirementsType" minOccurs="0"/>
 *         &lt;element name="SoftwareRequirementList" type="{http://www.sifassociation.org/datamodel/au/3.4}SoftwareRequirementListType" minOccurs="0"/>
 *         &lt;element name="EssentialMaterials" type="{http://www.sifassociation.org/datamodel/au/3.4}EssentialMaterialsType" minOccurs="0"/>
 *         &lt;element name="LearningObjectives" type="{http://www.sifassociation.org/datamodel/au/3.4}LearningObjectivesType" minOccurs="0"/>
 *         &lt;element name="LearningStandards" type="{http://www.sifassociation.org/datamodel/au/3.4}LearningStandardsType" minOccurs="0"/>
 *         &lt;element name="SubjectArea" type="{http://www.sifassociation.org/datamodel/au/3.4}SubjectAreaType" minOccurs="0"/>
 *         &lt;element name="Prerequisites" type="{http://www.sifassociation.org/datamodel/au/3.4}PrerequisitesType" minOccurs="0"/>
 *         &lt;element name="Students" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentsType" minOccurs="0"/>
 *         &lt;element name="SourceObjects" type="{http://www.sifassociation.org/datamodel/au/3.4}SourceObjectsType" minOccurs="0"/>
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ActivityTime" type="{http://www.sifassociation.org/datamodel/au/3.4}ActivityTimeType" minOccurs="0"/>
 *         &lt;element name="AssessmentRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="MaxAttemptsAllowed" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ActivityWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Evaluation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="EvaluationType" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="Inline"/>
 *                       &lt;enumeration value="RefId"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="LearningResources" type="{http://www.sifassociation.org/datamodel/au/3.4}LearningResourcesType" minOccurs="0"/>
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
@XmlType(name = "ActivityType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "title",
    "preamble",
    "technicalRequirements",
    "softwareRequirementList",
    "essentialMaterials",
    "learningObjectives",
    "learningStandards",
    "subjectArea",
    "prerequisites",
    "students",
    "sourceObjects",
    "points",
    "activityTime",
    "assessmentRefId",
    "maxAttemptsAllowed",
    "activityWeight",
    "evaluation",
    "learningResources",
    "sifMetadata",
    "sifExtendedElements"
})
public class ActivityType {

    @XmlElementRef(name = "Title", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> title;
    @XmlElementRef(name = "Preamble", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preamble;
    @XmlElementRef(name = "TechnicalRequirements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<TechnicalRequirementsType> technicalRequirements;
    @XmlElementRef(name = "SoftwareRequirementList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SoftwareRequirementListType> softwareRequirementList;
    @XmlElementRef(name = "EssentialMaterials", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<EssentialMaterialsType> essentialMaterials;
    @XmlElementRef(name = "LearningObjectives", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningObjectivesType> learningObjectives;
    @XmlElementRef(name = "LearningStandards", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningStandardsType> learningStandards;
    @XmlElementRef(name = "SubjectArea", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectAreaType> subjectArea;
    @XmlElementRef(name = "Prerequisites", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<PrerequisitesType> prerequisites;
    @XmlElementRef(name = "Students", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentsType> students;
    @XmlElementRef(name = "SourceObjects", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SourceObjectsType> sourceObjects;
    @XmlElementRef(name = "Points", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> points;
    @XmlElement(name = "ActivityTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected ActivityTimeType activityTime;
    @XmlElementRef(name = "AssessmentRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assessmentRefId;
    @XmlElementRef(name = "MaxAttemptsAllowed", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> maxAttemptsAllowed;
    @XmlElementRef(name = "ActivityWeight", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> activityWeight;
    @XmlElementRef(name = "Evaluation", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ActivityType.Evaluation> evaluation;
    @XmlElementRef(name = "LearningResources", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningResourcesType> learningResources;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitle(JAXBElement<String> value) {
        this.title = value;
    }

    /**
     * Gets the value of the preamble property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreamble() {
        return preamble;
    }

    /**
     * Sets the value of the preamble property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreamble(JAXBElement<String> value) {
        this.preamble = value;
    }

    /**
     * Gets the value of the technicalRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TechnicalRequirementsType }{@code >}
     *     
     */
    public JAXBElement<TechnicalRequirementsType> getTechnicalRequirements() {
        return technicalRequirements;
    }

    /**
     * Sets the value of the technicalRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TechnicalRequirementsType }{@code >}
     *     
     */
    public void setTechnicalRequirements(JAXBElement<TechnicalRequirementsType> value) {
        this.technicalRequirements = value;
    }

    /**
     * Gets the value of the softwareRequirementList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SoftwareRequirementListType }{@code >}
     *     
     */
    public JAXBElement<SoftwareRequirementListType> getSoftwareRequirementList() {
        return softwareRequirementList;
    }

    /**
     * Sets the value of the softwareRequirementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SoftwareRequirementListType }{@code >}
     *     
     */
    public void setSoftwareRequirementList(JAXBElement<SoftwareRequirementListType> value) {
        this.softwareRequirementList = value;
    }

    /**
     * Gets the value of the essentialMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EssentialMaterialsType }{@code >}
     *     
     */
    public JAXBElement<EssentialMaterialsType> getEssentialMaterials() {
        return essentialMaterials;
    }

    /**
     * Sets the value of the essentialMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EssentialMaterialsType }{@code >}
     *     
     */
    public void setEssentialMaterials(JAXBElement<EssentialMaterialsType> value) {
        this.essentialMaterials = value;
    }

    /**
     * Gets the value of the learningObjectives property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LearningObjectivesType }{@code >}
     *     
     */
    public JAXBElement<LearningObjectivesType> getLearningObjectives() {
        return learningObjectives;
    }

    /**
     * Sets the value of the learningObjectives property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningObjectivesType }{@code >}
     *     
     */
    public void setLearningObjectives(JAXBElement<LearningObjectivesType> value) {
        this.learningObjectives = value;
    }

    /**
     * Gets the value of the learningStandards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}
     *     
     */
    public JAXBElement<LearningStandardsType> getLearningStandards() {
        return learningStandards;
    }

    /**
     * Sets the value of the learningStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}
     *     
     */
    public void setLearningStandards(JAXBElement<LearningStandardsType> value) {
        this.learningStandards = value;
    }

    /**
     * Gets the value of the subjectArea property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectAreaType }{@code >}
     *     
     */
    public JAXBElement<SubjectAreaType> getSubjectArea() {
        return subjectArea;
    }

    /**
     * Sets the value of the subjectArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectAreaType }{@code >}
     *     
     */
    public void setSubjectArea(JAXBElement<SubjectAreaType> value) {
        this.subjectArea = value;
    }

    /**
     * Gets the value of the prerequisites property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrerequisitesType }{@code >}
     *     
     */
    public JAXBElement<PrerequisitesType> getPrerequisites() {
        return prerequisites;
    }

    /**
     * Sets the value of the prerequisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrerequisitesType }{@code >}
     *     
     */
    public void setPrerequisites(JAXBElement<PrerequisitesType> value) {
        this.prerequisites = value;
    }

    /**
     * Gets the value of the students property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentsType }{@code >}
     *     
     */
    public JAXBElement<StudentsType> getStudents() {
        return students;
    }

    /**
     * Sets the value of the students property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentsType }{@code >}
     *     
     */
    public void setStudents(JAXBElement<StudentsType> value) {
        this.students = value;
    }

    /**
     * Gets the value of the sourceObjects property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SourceObjectsType }{@code >}
     *     
     */
    public JAXBElement<SourceObjectsType> getSourceObjects() {
        return sourceObjects;
    }

    /**
     * Sets the value of the sourceObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SourceObjectsType }{@code >}
     *     
     */
    public void setSourceObjects(JAXBElement<SourceObjectsType> value) {
        this.sourceObjects = value;
    }

    /**
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPoints(JAXBElement<Long> value) {
        this.points = value;
    }

    /**
     * Gets the value of the activityTime property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityTimeType }
     *     
     */
    public ActivityTimeType getActivityTime() {
        return activityTime;
    }

    /**
     * Sets the value of the activityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityTimeType }
     *     
     */
    public void setActivityTime(ActivityTimeType value) {
        this.activityTime = value;
    }

    /**
     * Gets the value of the assessmentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssessmentRefId() {
        return assessmentRefId;
    }

    /**
     * Sets the value of the assessmentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssessmentRefId(JAXBElement<String> value) {
        this.assessmentRefId = value;
    }

    /**
     * Gets the value of the maxAttemptsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMaxAttemptsAllowed() {
        return maxAttemptsAllowed;
    }

    /**
     * Sets the value of the maxAttemptsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMaxAttemptsAllowed(JAXBElement<Long> value) {
        this.maxAttemptsAllowed = value;
    }

    /**
     * Gets the value of the activityWeight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getActivityWeight() {
        return activityWeight;
    }

    /**
     * Sets the value of the activityWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setActivityWeight(JAXBElement<BigDecimal> value) {
        this.activityWeight = value;
    }

    /**
     * Gets the value of the evaluation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActivityType.Evaluation }{@code >}
     *     
     */
    public JAXBElement<ActivityType.Evaluation> getEvaluation() {
        return evaluation;
    }

    /**
     * Sets the value of the evaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActivityType.Evaluation }{@code >}
     *     
     */
    public void setEvaluation(JAXBElement<ActivityType.Evaluation> value) {
        this.evaluation = value;
    }

    /**
     * Gets the value of the learningResources property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LearningResourcesType }{@code >}
     *     
     */
    public JAXBElement<LearningResourcesType> getLearningResources() {
        return learningResources;
    }

    /**
     * Sets the value of the learningResources property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningResourcesType }{@code >}
     *     
     */
    public void setLearningResources(JAXBElement<LearningResourcesType> value) {
        this.learningResources = value;
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
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="EvaluationType" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="Inline"/>
     *             &lt;enumeration value="RefId"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class Evaluation {

        @XmlElementRef(name = "Description", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
        protected JAXBElement<String> description;
        @XmlAttribute(name = "EvaluationType", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String evaluationType;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setDescription(JAXBElement<String> value) {
            this.description = value;
        }

        /**
         * Gets the value of the evaluationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEvaluationType() {
            return evaluationType;
        }

        /**
         * Sets the value of the evaluationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEvaluationType(String value) {
            this.evaluationType = value;
        }

    }

}
