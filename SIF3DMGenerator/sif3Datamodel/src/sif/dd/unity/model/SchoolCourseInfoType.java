
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SchoolCourseInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolCourseInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseCode" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseCodeType"/>
 *         &lt;element name="StateCourseCode" type="{http://www.sifassociation.org/datamodel/na/4.x}StateCourseCodeType" minOccurs="0"/>
 *         &lt;element name="DistrictCourseCode" type="{http://www.sifassociation.org/datamodel/na/4.x}DistrictCourseCodeType" minOccurs="0"/>
 *         &lt;element name="SubjectAreaList" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreaListType" minOccurs="0"/>
 *         &lt;element name="CourseTitle" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseTitleType"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="InstructionalLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}InstructionalLevelType" minOccurs="0"/>
 *         &lt;element name="CourseCredits" type="{http://www.sifassociation.org/datamodel/na/4.x}CourseCreditsType" minOccurs="0"/>
 *         &lt;element name="CoreAcademicCourse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
 *         &lt;element name="SCEDCode" type="{http://www.sifassociation.org/datamodel/na/4.x}SCEDCodeType" minOccurs="0"/>
 *         &lt;element name="DualCredit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CTEConcentrator" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="SchoolInfoRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="SchoolYear" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolYearType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolCourseInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "courseCode",
    "stateCourseCode",
    "districtCourseCode",
    "subjectAreaList",
    "courseTitle",
    "description",
    "instructionalLevel",
    "courseCredits",
    "coreAcademicCourse",
    "graduationRequirement",
    "department",
    "scedCode",
    "dualCredit",
    "cteConcentrator",
    "sifMetadata",
    "sifExtendedElements"
})
public class SchoolCourseInfoType {

    @XmlElement(name = "CourseCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String courseCode;
    @XmlElement(name = "StateCourseCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stateCourseCode;
    @XmlElement(name = "DistrictCourseCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String districtCourseCode;
    @XmlElement(name = "SubjectAreaList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SubjectAreaListType subjectAreaList;
    @XmlElement(name = "CourseTitle", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String courseTitle;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(name = "InstructionalLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected InstructionalLevelType instructionalLevel;
    @XmlElement(name = "CourseCredits", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CourseCreditsType courseCredits;
    @XmlElement(name = "CoreAcademicCourse", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolCourseInfoType.CoreAcademicCourse coreAcademicCourse;
    @XmlElement(name = "GraduationRequirement", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolCourseInfoType.GraduationRequirement graduationRequirement;
    @XmlElement(name = "Department", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String department;
    @XmlElement(name = "SCEDCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SCEDCodeType scedCode;
    @XmlElement(name = "DualCredit", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolCourseInfoType.DualCredit dualCredit;
    @XmlElement(name = "CTEConcentrator", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolCourseInfoType.CTEConcentrator cteConcentrator;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "SchoolInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlAttribute(name = "SchoolYear", required = true)
    protected XMLGregorianCalendar schoolYear;

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
     * Gets the value of the courseCredits property.
     * 
     * @return
     *     possible object is
     *     {@link CourseCreditsType }
     *     
     */
    public CourseCreditsType getCourseCredits() {
        return courseCredits;
    }

    /**
     * Sets the value of the courseCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseCreditsType }
     *     
     */
    public void setCourseCredits(CourseCreditsType value) {
        this.courseCredits = value;
    }

    /**
     * Gets the value of the coreAcademicCourse property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCourseInfoType.CoreAcademicCourse }
     *     
     */
    public SchoolCourseInfoType.CoreAcademicCourse getCoreAcademicCourse() {
        return coreAcademicCourse;
    }

    /**
     * Sets the value of the coreAcademicCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCourseInfoType.CoreAcademicCourse }
     *     
     */
    public void setCoreAcademicCourse(SchoolCourseInfoType.CoreAcademicCourse value) {
        this.coreAcademicCourse = value;
    }

    /**
     * Gets the value of the graduationRequirement property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCourseInfoType.GraduationRequirement }
     *     
     */
    public SchoolCourseInfoType.GraduationRequirement getGraduationRequirement() {
        return graduationRequirement;
    }

    /**
     * Sets the value of the graduationRequirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCourseInfoType.GraduationRequirement }
     *     
     */
    public void setGraduationRequirement(SchoolCourseInfoType.GraduationRequirement value) {
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
     * Gets the value of the scedCode property.
     * 
     * @return
     *     possible object is
     *     {@link SCEDCodeType }
     *     
     */
    public SCEDCodeType getSCEDCode() {
        return scedCode;
    }

    /**
     * Sets the value of the scedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCEDCodeType }
     *     
     */
    public void setSCEDCode(SCEDCodeType value) {
        this.scedCode = value;
    }

    /**
     * Gets the value of the dualCredit property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCourseInfoType.DualCredit }
     *     
     */
    public SchoolCourseInfoType.DualCredit getDualCredit() {
        return dualCredit;
    }

    /**
     * Sets the value of the dualCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCourseInfoType.DualCredit }
     *     
     */
    public void setDualCredit(SchoolCourseInfoType.DualCredit value) {
        this.dualCredit = value;
    }

    /**
     * Gets the value of the cteConcentrator property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCourseInfoType.CTEConcentrator }
     *     
     */
    public SchoolCourseInfoType.CTEConcentrator getCTEConcentrator() {
        return cteConcentrator;
    }

    /**
     * Sets the value of the cteConcentrator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCourseInfoType.CTEConcentrator }
     *     
     */
    public void setCTEConcentrator(SchoolCourseInfoType.CTEConcentrator value) {
        this.cteConcentrator = value;
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

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolInfoRefId(String value) {
        this.schoolInfoRefId = value;
    }

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
    public static class CTEConcentrator {

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
    public static class CoreAcademicCourse {

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
    public static class DualCredit {

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
