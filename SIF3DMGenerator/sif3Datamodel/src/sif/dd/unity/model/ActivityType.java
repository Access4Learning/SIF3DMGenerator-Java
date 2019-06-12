
package sif.dd.unity.model;

import java.math.BigDecimal;
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
 *         &lt;element name="TechnicalRequirements" type="{http://www.sifassociation.org/datamodel/na/4.x}TechnicalRequirementsType" minOccurs="0"/>
 *         &lt;element name="SoftwareRequirementList" type="{http://www.sifassociation.org/datamodel/na/4.x}SoftwareRequirementListType" minOccurs="0"/>
 *         &lt;element name="EssentialMaterials" type="{http://www.sifassociation.org/datamodel/na/4.x}EssentialMaterialListType" minOccurs="0"/>
 *         &lt;element name="LearningObjectives" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningObjectiveListType" minOccurs="0"/>
 *         &lt;element name="LearningStandards" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningStandardItemRefIdListType" minOccurs="0"/>
 *         &lt;element name="SubjectArea" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreaType" minOccurs="0"/>
 *         &lt;element name="Prerequisites" type="{http://www.sifassociation.org/datamodel/na/4.x}PrerequisiteListType" minOccurs="0"/>
 *         &lt;element name="Students" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentPersonalRefIdListType" minOccurs="0"/>
 *         &lt;element name="SourceObjects" type="{http://www.sifassociation.org/datamodel/na/4.x}SourceObjectListType" minOccurs="0"/>
 *         &lt;element name="Points" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ActivityTime" type="{http://www.sifassociation.org/datamodel/na/4.x}ActivityTimeType"/>
 *         &lt;element name="AssessmentRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="MaxAttemptsAllowed" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ActivityWeight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Evaluation" type="{http://www.sifassociation.org/datamodel/na/4.x}ActivityEvaluationType" minOccurs="0"/>
 *         &lt;element name="LearningResources" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningResourceRefIdListType" minOccurs="0"/>
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
@XmlType(name = "ActivityType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
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

    @XmlElement(name = "Title", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlElement(name = "Preamble", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String preamble;
    @XmlElement(name = "TechnicalRequirements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TechnicalRequirementsType technicalRequirements;
    @XmlElement(name = "SoftwareRequirementList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SoftwareRequirementListType softwareRequirementList;
    @XmlElement(name = "EssentialMaterials", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EssentialMaterialListType essentialMaterials;
    @XmlElement(name = "LearningObjectives", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningObjectiveListType learningObjectives;
    @XmlElement(name = "LearningStandards", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningStandardItemRefIdListType learningStandards;
    @XmlElement(name = "SubjectArea", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SubjectAreaType subjectArea;
    @XmlElement(name = "Prerequisites", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PrerequisiteListType prerequisites;
    @XmlElement(name = "Students", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentPersonalRefIdListType students;
    @XmlElement(name = "SourceObjects", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SourceObjectListType sourceObjects;
    @XmlElement(name = "Points", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long points;
    @XmlElement(name = "ActivityTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected ActivityTimeType activityTime;
    @XmlElement(name = "AssessmentRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentRefId;
    @XmlElement(name = "MaxAttemptsAllowed", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxAttemptsAllowed;
    @XmlElement(name = "ActivityWeight", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal activityWeight;
    @XmlElement(name = "Evaluation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ActivityEvaluationType evaluation;
    @XmlElement(name = "LearningResources", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningResourceRefIdListType learningResources;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the preamble property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreamble() {
        return preamble;
    }

    /**
     * Sets the value of the preamble property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreamble(String value) {
        this.preamble = value;
    }

    /**
     * Gets the value of the technicalRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalRequirementsType }
     *     
     */
    public TechnicalRequirementsType getTechnicalRequirements() {
        return technicalRequirements;
    }

    /**
     * Sets the value of the technicalRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalRequirementsType }
     *     
     */
    public void setTechnicalRequirements(TechnicalRequirementsType value) {
        this.technicalRequirements = value;
    }

    /**
     * Gets the value of the softwareRequirementList property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareRequirementListType }
     *     
     */
    public SoftwareRequirementListType getSoftwareRequirementList() {
        return softwareRequirementList;
    }

    /**
     * Sets the value of the softwareRequirementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareRequirementListType }
     *     
     */
    public void setSoftwareRequirementList(SoftwareRequirementListType value) {
        this.softwareRequirementList = value;
    }

    /**
     * Gets the value of the essentialMaterials property.
     * 
     * @return
     *     possible object is
     *     {@link EssentialMaterialListType }
     *     
     */
    public EssentialMaterialListType getEssentialMaterials() {
        return essentialMaterials;
    }

    /**
     * Sets the value of the essentialMaterials property.
     * 
     * @param value
     *     allowed object is
     *     {@link EssentialMaterialListType }
     *     
     */
    public void setEssentialMaterials(EssentialMaterialListType value) {
        this.essentialMaterials = value;
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
     * Gets the value of the prerequisites property.
     * 
     * @return
     *     possible object is
     *     {@link PrerequisiteListType }
     *     
     */
    public PrerequisiteListType getPrerequisites() {
        return prerequisites;
    }

    /**
     * Sets the value of the prerequisites property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrerequisiteListType }
     *     
     */
    public void setPrerequisites(PrerequisiteListType value) {
        this.prerequisites = value;
    }

    /**
     * Gets the value of the students property.
     * 
     * @return
     *     possible object is
     *     {@link StudentPersonalRefIdListType }
     *     
     */
    public StudentPersonalRefIdListType getStudents() {
        return students;
    }

    /**
     * Sets the value of the students property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentPersonalRefIdListType }
     *     
     */
    public void setStudents(StudentPersonalRefIdListType value) {
        this.students = value;
    }

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
     * Gets the value of the points property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPoints() {
        return points;
    }

    /**
     * Sets the value of the points property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPoints(Long value) {
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
     *     {@link String }
     *     
     */
    public String getAssessmentRefId() {
        return assessmentRefId;
    }

    /**
     * Sets the value of the assessmentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRefId(String value) {
        this.assessmentRefId = value;
    }

    /**
     * Gets the value of the maxAttemptsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaxAttemptsAllowed() {
        return maxAttemptsAllowed;
    }

    /**
     * Sets the value of the maxAttemptsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaxAttemptsAllowed(Long value) {
        this.maxAttemptsAllowed = value;
    }

    /**
     * Gets the value of the activityWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getActivityWeight() {
        return activityWeight;
    }

    /**
     * Sets the value of the activityWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setActivityWeight(BigDecimal value) {
        this.activityWeight = value;
    }

    /**
     * Gets the value of the evaluation property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityEvaluationType }
     *     
     */
    public ActivityEvaluationType getEvaluation() {
        return evaluation;
    }

    /**
     * Sets the value of the evaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityEvaluationType }
     *     
     */
    public void setEvaluation(ActivityEvaluationType value) {
        this.evaluation = value;
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
