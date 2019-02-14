
package sif.dd.au30.model;

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
 * <p>Java class for StudentScoreJudgementAgainstStandardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentScoreJudgementAgainstStandardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolYear" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolYearType" minOccurs="0"/>
 *         &lt;element name="TermInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="LocalTermCode" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="StudentStateProvinceId" type="{http://www.sifassociation.org/datamodel/au/3.4}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="StudentLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="YearLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType" minOccurs="0"/>
 *         &lt;element name="TeachingGroupRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="ClassLocalId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="StaffPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="StaffLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="LearningStandardList" type="{http://www.sifassociation.org/datamodel/au/3.4}LearningStandardListType" minOccurs="0"/>
 *         &lt;element name="CurriculumCode" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="CurriculumNodeCode" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="Score" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SpecialCircumstanceLocalCode" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="ManagedPathwayLocalCode" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="SchoolCommonwealthId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
@XmlType(name = "StudentScoreJudgementAgainstStandardType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "schoolYear",
    "termInfoRefId",
    "localTermCode",
    "studentPersonalRefId",
    "studentStateProvinceId",
    "studentLocalId",
    "yearLevel",
    "teachingGroupRefId",
    "classLocalId",
    "staffPersonalRefId",
    "staffLocalId",
    "learningStandardList",
    "curriculumCode",
    "curriculumNodeCode",
    "score",
    "specialCircumstanceLocalCode",
    "managedPathwayLocalCode",
    "schoolInfoRefId",
    "schoolLocalId",
    "schoolCommonwealthId",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentScoreJudgementAgainstStandardType {

    @XmlElement(name = "SchoolYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected XMLGregorianCalendar schoolYear;
    @XmlElementRef(name = "TermInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> termInfoRefId;
    @XmlElementRef(name = "LocalTermCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localTermCode;
    @XmlElementRef(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentPersonalRefId;
    @XmlElementRef(name = "StudentStateProvinceId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentStateProvinceId;
    @XmlElementRef(name = "StudentLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentLocalId;
    @XmlElement(name = "YearLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected YearLevelType yearLevel;
    @XmlElementRef(name = "TeachingGroupRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> teachingGroupRefId;
    @XmlElementRef(name = "ClassLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classLocalId;
    @XmlElementRef(name = "StaffPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> staffPersonalRefId;
    @XmlElementRef(name = "StaffLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> staffLocalId;
    @XmlElementRef(name = "LearningStandardList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningStandardListType> learningStandardList;
    @XmlElementRef(name = "CurriculumCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curriculumCode;
    @XmlElementRef(name = "CurriculumNodeCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curriculumNodeCode;
    @XmlElement(name = "Score", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String score;
    @XmlElementRef(name = "SpecialCircumstanceLocalCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> specialCircumstanceLocalCode;
    @XmlElementRef(name = "ManagedPathwayLocalCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> managedPathwayLocalCode;
    @XmlElementRef(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolInfoRefId;
    @XmlElementRef(name = "SchoolLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolLocalId;
    @XmlElementRef(name = "SchoolCommonwealthId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolCommonwealthId;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchoolYear(XMLGregorianCalendar value) {
        this.schoolYear = value;
    }

    /**
     * Gets the value of the termInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTermInfoRefId() {
        return termInfoRefId;
    }

    /**
     * Sets the value of the termInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTermInfoRefId(JAXBElement<String> value) {
        this.termInfoRefId = value;
    }

    /**
     * Gets the value of the localTermCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalTermCode() {
        return localTermCode;
    }

    /**
     * Sets the value of the localTermCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalTermCode(JAXBElement<String> value) {
        this.localTermCode = value;
    }

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStudentPersonalRefId(JAXBElement<String> value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the studentStateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStudentStateProvinceId() {
        return studentStateProvinceId;
    }

    /**
     * Sets the value of the studentStateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStudentStateProvinceId(JAXBElement<String> value) {
        this.studentStateProvinceId = value;
    }

    /**
     * Gets the value of the studentLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStudentLocalId() {
        return studentLocalId;
    }

    /**
     * Sets the value of the studentLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStudentLocalId(JAXBElement<String> value) {
        this.studentLocalId = value;
    }

    /**
     * Gets the value of the yearLevel property.
     * 
     * @return
     *     possible object is
     *     {@link YearLevelType }
     *     
     */
    public YearLevelType getYearLevel() {
        return yearLevel;
    }

    /**
     * Sets the value of the yearLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearLevelType }
     *     
     */
    public void setYearLevel(YearLevelType value) {
        this.yearLevel = value;
    }

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
     * Gets the value of the classLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassLocalId() {
        return classLocalId;
    }

    /**
     * Sets the value of the classLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassLocalId(JAXBElement<String> value) {
        this.classLocalId = value;
    }

    /**
     * Gets the value of the staffPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaffPersonalRefId() {
        return staffPersonalRefId;
    }

    /**
     * Sets the value of the staffPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaffPersonalRefId(JAXBElement<String> value) {
        this.staffPersonalRefId = value;
    }

    /**
     * Gets the value of the staffLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStaffLocalId() {
        return staffLocalId;
    }

    /**
     * Sets the value of the staffLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStaffLocalId(JAXBElement<String> value) {
        this.staffLocalId = value;
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
     * Gets the value of the curriculumCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurriculumCode() {
        return curriculumCode;
    }

    /**
     * Sets the value of the curriculumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurriculumCode(JAXBElement<String> value) {
        this.curriculumCode = value;
    }

    /**
     * Gets the value of the curriculumNodeCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurriculumNodeCode() {
        return curriculumNodeCode;
    }

    /**
     * Sets the value of the curriculumNodeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurriculumNodeCode(JAXBElement<String> value) {
        this.curriculumNodeCode = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

    /**
     * Gets the value of the specialCircumstanceLocalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpecialCircumstanceLocalCode() {
        return specialCircumstanceLocalCode;
    }

    /**
     * Sets the value of the specialCircumstanceLocalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpecialCircumstanceLocalCode(JAXBElement<String> value) {
        this.specialCircumstanceLocalCode = value;
    }

    /**
     * Gets the value of the managedPathwayLocalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getManagedPathwayLocalCode() {
        return managedPathwayLocalCode;
    }

    /**
     * Sets the value of the managedPathwayLocalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setManagedPathwayLocalCode(JAXBElement<String> value) {
        this.managedPathwayLocalCode = value;
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
     * Gets the value of the schoolLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolLocalId() {
        return schoolLocalId;
    }

    /**
     * Sets the value of the schoolLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolLocalId(JAXBElement<String> value) {
        this.schoolLocalId = value;
    }

    /**
     * Gets the value of the schoolCommonwealthId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolCommonwealthId() {
        return schoolCommonwealthId;
    }

    /**
     * Sets the value of the schoolCommonwealthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolCommonwealthId(JAXBElement<String> value) {
        this.schoolCommonwealthId = value;
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
