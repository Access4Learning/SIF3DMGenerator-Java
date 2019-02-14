
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GradingAssignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GradingAssignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeachingGroupRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="StudentPersonalRefIdList" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentsType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="GradingCategory" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="PointsPossible" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Weight" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MaxAttemptsAllowed" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DetailedDescriptionURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="DetailedDescriptionBinary" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="AssessmentType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="LevelAssessed" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="AssignmentPurpose" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SubAssignmentList" type="{http://www.sifassociation.org/datamodel/au/3.4}AssignmentListType" minOccurs="0"/>
 *         &lt;element name="RubricScoringGuide" type="{http://www.sifassociation.org/datamodel/au/3.4}GenericRubricType" minOccurs="0"/>
 *         &lt;element name="PrerequisiteList" type="{http://www.sifassociation.org/datamodel/au/3.4}PrerequisitesType" minOccurs="0"/>
 *         &lt;element name="LearningStandardList" type="{http://www.sifassociation.org/datamodel/au/3.4}LearningStandardListType" minOccurs="0"/>
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
@XmlType(name = "GradingAssignmentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "teachingGroupRefId",
    "studentPersonalRefIdList",
    "schoolInfoRefId",
    "gradingCategory",
    "description",
    "pointsPossible",
    "createDate",
    "dueDate",
    "weight",
    "maxAttemptsAllowed",
    "detailedDescriptionURL",
    "detailedDescriptionBinary",
    "assessmentType",
    "levelAssessed",
    "assignmentPurpose",
    "subAssignmentList",
    "rubricScoringGuide",
    "prerequisiteList",
    "learningStandardList",
    "sifMetadata",
    "sifExtendedElements"
})
public class GradingAssignmentType {

    @XmlElementRef(name = "TeachingGroupRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teachingGroupRefId;
    @XmlElementRef(name = "StudentPersonalRefIdList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentsType> studentPersonalRefIdList;
    @XmlElementRef(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolInfoRefId;
    @XmlElementRef(name = "GradingCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gradingCategory;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(name = "PointsPossible", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "unsignedInt")
    protected Long pointsPossible;
    @XmlElementRef(name = "CreateDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> createDate;
    @XmlElementRef(name = "DueDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dueDate;
    @XmlElementRef(name = "Weight", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> weight;
    @XmlElementRef(name = "MaxAttemptsAllowed", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> maxAttemptsAllowed;
    @XmlElementRef(name = "DetailedDescriptionURL", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detailedDescriptionURL;
    @XmlElementRef(name = "DetailedDescriptionBinary", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> detailedDescriptionBinary;
    @XmlElementRef(name = "AssessmentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assessmentType;
    @XmlElementRef(name = "LevelAssessed", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> levelAssessed;
    @XmlElementRef(name = "AssignmentPurpose", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> assignmentPurpose;
    @XmlElementRef(name = "SubAssignmentList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AssignmentListType> subAssignmentList;
    @XmlElementRef(name = "RubricScoringGuide", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<GenericRubricType> rubricScoringGuide;
    @XmlElementRef(name = "PrerequisiteList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<PrerequisitesType> prerequisiteList;
    @XmlElementRef(name = "LearningStandardList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningStandardListType> learningStandardList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the teachingGroupRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTeachingGroupRefId() {
        return teachingGroupRefId;
    }

    /**
     * Sets the value of the teachingGroupRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTeachingGroupRefId(JAXBElement<String> value) {
        this.teachingGroupRefId = value;
    }

    /**
     * Gets the value of the studentPersonalRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentsType }{@code >}
     *     
     */
    public JAXBElement<StudentsType> getStudentPersonalRefIdList() {
        return studentPersonalRefIdList;
    }

    /**
     * Sets the value of the studentPersonalRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentsType }{@code >}
     *     
     */
    public void setStudentPersonalRefIdList(JAXBElement<StudentsType> value) {
        this.studentPersonalRefIdList = value;
    }

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolInfoRefId(JAXBElement<String> value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the gradingCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGradingCategory() {
        return gradingCategory;
    }

    /**
     * Sets the value of the gradingCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGradingCategory(JAXBElement<String> value) {
        this.gradingCategory = value;
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
     * Gets the value of the pointsPossible property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPointsPossible() {
        return pointsPossible;
    }

    /**
     * Sets the value of the pointsPossible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPointsPossible(Long value) {
        this.pointsPossible = value;
    }

    /**
     * Gets the value of the createDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreateDate() {
        return createDate;
    }

    /**
     * Sets the value of the createDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.createDate = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWeight(JAXBElement<BigDecimal> value) {
        this.weight = value;
    }

    /**
     * Gets the value of the maxAttemptsAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getMaxAttemptsAllowed() {
        return maxAttemptsAllowed;
    }

    /**
     * Sets the value of the maxAttemptsAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setMaxAttemptsAllowed(JAXBElement<BigInteger> value) {
        this.maxAttemptsAllowed = value;
    }

    /**
     * Gets the value of the detailedDescriptionURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetailedDescriptionURL() {
        return detailedDescriptionURL;
    }

    /**
     * Sets the value of the detailedDescriptionURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetailedDescriptionURL(JAXBElement<String> value) {
        this.detailedDescriptionURL = value;
    }

    /**
     * Gets the value of the detailedDescriptionBinary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getDetailedDescriptionBinary() {
        return detailedDescriptionBinary;
    }

    /**
     * Sets the value of the detailedDescriptionBinary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setDetailedDescriptionBinary(JAXBElement<byte[]> value) {
        this.detailedDescriptionBinary = value;
    }

    /**
     * Gets the value of the assessmentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssessmentType() {
        return assessmentType;
    }

    /**
     * Sets the value of the assessmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssessmentType(JAXBElement<String> value) {
        this.assessmentType = value;
    }

    /**
     * Gets the value of the levelAssessed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLevelAssessed() {
        return levelAssessed;
    }

    /**
     * Sets the value of the levelAssessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLevelAssessed(JAXBElement<String> value) {
        this.levelAssessed = value;
    }

    /**
     * Gets the value of the assignmentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssignmentPurpose() {
        return assignmentPurpose;
    }

    /**
     * Sets the value of the assignmentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssignmentPurpose(JAXBElement<String> value) {
        this.assignmentPurpose = value;
    }

    /**
     * Gets the value of the subAssignmentList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AssignmentListType }{@code >}
     *     
     */
    public JAXBElement<AssignmentListType> getSubAssignmentList() {
        return subAssignmentList;
    }

    /**
     * Sets the value of the subAssignmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AssignmentListType }{@code >}
     *     
     */
    public void setSubAssignmentList(JAXBElement<AssignmentListType> value) {
        this.subAssignmentList = value;
    }

    /**
     * Gets the value of the rubricScoringGuide property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenericRubricType }{@code >}
     *     
     */
    public JAXBElement<GenericRubricType> getRubricScoringGuide() {
        return rubricScoringGuide;
    }

    /**
     * Sets the value of the rubricScoringGuide property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenericRubricType }{@code >}
     *     
     */
    public void setRubricScoringGuide(JAXBElement<GenericRubricType> value) {
        this.rubricScoringGuide = value;
    }

    /**
     * Gets the value of the prerequisiteList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PrerequisitesType }{@code >}
     *     
     */
    public JAXBElement<PrerequisitesType> getPrerequisiteList() {
        return prerequisiteList;
    }

    /**
     * Sets the value of the prerequisiteList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PrerequisitesType }{@code >}
     *     
     */
    public void setPrerequisiteList(JAXBElement<PrerequisitesType> value) {
        this.prerequisiteList = value;
    }

    /**
     * Gets the value of the learningStandardList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardListType }{@code >}
     *     
     */
    public JAXBElement<LearningStandardListType> getLearningStandardList() {
        return learningStandardList;
    }

    /**
     * Sets the value of the learningStandardList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardListType }{@code >}
     *     
     */
    public void setLearningStandardList(JAXBElement<LearningStandardListType> value) {
        this.learningStandardList = value;
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
