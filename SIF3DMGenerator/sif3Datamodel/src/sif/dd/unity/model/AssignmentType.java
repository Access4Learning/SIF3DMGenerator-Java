
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
 * <p>Java class for AssignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Students" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentPersonalRefIdListType"/>
 *         &lt;element name="StaffPersonalRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="TechnicalRequirements" type="{http://www.sifassociation.org/datamodel/na/4.x}TechnicalRequirementsType" minOccurs="0"/>
 *         &lt;element name="SoftwareRequirementList" type="{http://www.sifassociation.org/datamodel/na/4.x}SoftwareRequirementListType" minOccurs="0"/>
 *         &lt;element name="EssentialMaterials" type="{http://www.sifassociation.org/datamodel/na/4.x}EssentialMaterialListType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Preamble" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LearningObjectives" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningObjectiveListType" minOccurs="0"/>
 *         &lt;element name="LearningStandards" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningStandardItemRefIdListType" minOccurs="0"/>
 *         &lt;element name="Prerequisites" type="{http://www.sifassociation.org/datamodel/na/4.x}PrerequisiteListType" minOccurs="0"/>
 *         &lt;element name="SourceObjects" type="{http://www.sifassociation.org/datamodel/na/4.x}SourceObjectListType" minOccurs="0"/>
 *         &lt;element name="AssignmentTime" type="{http://www.sifassociation.org/datamodel/na/4.x}AssignmentTimeType"/>
 *         &lt;element name="MaxAttemptsAllowed" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="AddToGradeBookFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
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
@XmlType(name = "AssignmentType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "students",
    "staffPersonalRefId",
    "technicalRequirements",
    "softwareRequirementList",
    "essentialMaterials",
    "title",
    "preamble",
    "learningObjectives",
    "learningStandards",
    "prerequisites",
    "sourceObjects",
    "assignmentTime",
    "maxAttemptsAllowed",
    "addToGradeBookFlag",
    "sifMetadata",
    "sifExtendedElements"
})
public class AssignmentType {

    @XmlElement(name = "Students", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StudentPersonalRefIdListType students;
    @XmlElement(name = "StaffPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String staffPersonalRefId;
    @XmlElement(name = "TechnicalRequirements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TechnicalRequirementsType technicalRequirements;
    @XmlElement(name = "SoftwareRequirementList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SoftwareRequirementListType softwareRequirementList;
    @XmlElement(name = "EssentialMaterials", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EssentialMaterialListType essentialMaterials;
    @XmlElement(name = "Title", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String title;
    @XmlElement(name = "Preamble", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String preamble;
    @XmlElement(name = "LearningObjectives", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningObjectiveListType learningObjectives;
    @XmlElement(name = "LearningStandards", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningStandardItemRefIdListType learningStandards;
    @XmlElement(name = "Prerequisites", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PrerequisiteListType prerequisites;
    @XmlElement(name = "SourceObjects", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SourceObjectListType sourceObjects;
    @XmlElement(name = "AssignmentTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected AssignmentTimeType assignmentTime;
    @XmlElement(name = "MaxAttemptsAllowed", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long maxAttemptsAllowed;
    @XmlElement(name = "AddToGradeBookFlag", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean addToGradeBookFlag;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the staffPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffPersonalRefId() {
        return staffPersonalRefId;
    }

    /**
     * Sets the value of the staffPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffPersonalRefId(String value) {
        this.staffPersonalRefId = value;
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
     * Gets the value of the assignmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link AssignmentTimeType }
     *     
     */
    public AssignmentTimeType getAssignmentTime() {
        return assignmentTime;
    }

    /**
     * Sets the value of the assignmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignmentTimeType }
     *     
     */
    public void setAssignmentTime(AssignmentTimeType value) {
        this.assignmentTime = value;
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
     * Gets the value of the addToGradeBookFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddToGradeBookFlag() {
        return addToGradeBookFlag;
    }

    /**
     * Sets the value of the addToGradeBookFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddToGradeBookFlag(Boolean value) {
        this.addToGradeBookFlag = value;
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
