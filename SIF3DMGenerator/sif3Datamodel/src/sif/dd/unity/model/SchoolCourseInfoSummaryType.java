
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SchoolCourseInfoSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolCourseInfoSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseCode" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseCodeType" minOccurs="0"/>
 *         &lt;element name="StateCourseCode" type="{http://www.sifassociation.org/datamodel/na/4.x}StateCourseCodeType" minOccurs="0"/>
 *         &lt;element name="DistrictCourseCode" type="{http://www.sifassociation.org/datamodel/na/4.x}DistrictCourseCodeType" minOccurs="0"/>
 *         &lt;element name="NationalCourseCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SubjectAreaList" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreaListType" minOccurs="0"/>
 *         &lt;element name="CourseTitle" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseTitleType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstructionalLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}InstructionalLevelType" minOccurs="0"/>
 *         &lt;element name="CoreAcademicCourse" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GraduationRequirement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolCourseInfoSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "courseCode",
    "stateCourseCode",
    "districtCourseCode",
    "nationalCourseCode",
    "subjectAreaList",
    "courseTitle",
    "description",
    "instructionalLevel",
    "coreAcademicCourse",
    "graduationRequirement",
    "department",
    "sifExtendedElements"
})
public class SchoolCourseInfoSummaryType {

    @XmlElement(name = "CourseCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String courseCode;
    @XmlElement(name = "StateCourseCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stateCourseCode;
    @XmlElement(name = "DistrictCourseCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String districtCourseCode;
    @XmlElement(name = "NationalCourseCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nationalCourseCode;
    @XmlElement(name = "SubjectAreaList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SubjectAreaListType subjectAreaList;
    @XmlElement(name = "CourseTitle", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String courseTitle;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String description;
    @XmlElement(name = "InstructionalLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected InstructionalLevelType instructionalLevel;
    @XmlElement(name = "CoreAcademicCourse", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean coreAcademicCourse;
    @XmlElement(name = "GraduationRequirement", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolCourseInfoSummaryType.GraduationRequirement graduationRequirement;
    @XmlElement(name = "Department", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String department;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;

    /**
     * Gets the value of the courseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * Sets the value of the courseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCode(String value) {
        this.courseCode = value;
    }

    /**
     * Gets the value of the stateCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateCourseCode() {
        return stateCourseCode;
    }

    /**
     * Sets the value of the stateCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateCourseCode(String value) {
        this.stateCourseCode = value;
    }

    /**
     * Gets the value of the districtCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictCourseCode() {
        return districtCourseCode;
    }

    /**
     * Sets the value of the districtCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictCourseCode(String value) {
        this.districtCourseCode = value;
    }

    /**
     * Gets the value of the nationalCourseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalCourseCode() {
        return nationalCourseCode;
    }

    /**
     * Sets the value of the nationalCourseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalCourseCode(String value) {
        this.nationalCourseCode = value;
    }

    /**
     * Gets the value of the subjectAreaList property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAreaListType }
     *     
     */
    public SubjectAreaListType getSubjectAreaList() {
        return subjectAreaList;
    }

    /**
     * Sets the value of the subjectAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAreaListType }
     *     
     */
    public void setSubjectAreaList(SubjectAreaListType value) {
        this.subjectAreaList = value;
    }

    /**
     * Gets the value of the courseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Sets the value of the courseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseTitle(String value) {
        this.courseTitle = value;
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
     * Gets the value of the instructionalLevel property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionalLevelType }
     *     
     */
    public InstructionalLevelType getInstructionalLevel() {
        return instructionalLevel;
    }

    /**
     * Sets the value of the instructionalLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionalLevelType }
     *     
     */
    public void setInstructionalLevel(InstructionalLevelType value) {
        this.instructionalLevel = value;
    }

    /**
     * Gets the value of the coreAcademicCourse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCoreAcademicCourse() {
        return coreAcademicCourse;
    }

    /**
     * Sets the value of the coreAcademicCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCoreAcademicCourse(Boolean value) {
        this.coreAcademicCourse = value;
    }

    /**
     * Gets the value of the graduationRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCourseInfoSummaryType.GraduationRequirement }
     *     
     */
    public SchoolCourseInfoSummaryType.GraduationRequirement getGraduationRequirement() {
        return graduationRequirement;
    }

    /**
     * Sets the value of the graduationRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCourseInfoSummaryType.GraduationRequirement }
     *     
     */
    public void setGraduationRequirement(SchoolCourseInfoSummaryType.GraduationRequirement value) {
        this.graduationRequirement = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
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
    public static class GraduationRequirement {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

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
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }

}
