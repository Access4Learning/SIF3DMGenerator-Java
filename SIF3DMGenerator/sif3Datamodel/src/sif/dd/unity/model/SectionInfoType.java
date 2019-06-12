
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
 * <p>Java class for SectionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SectionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ScheduleInfoList" type="{http://www.sifassociation.org/datamodel/na/4.x}ScheduleInfoListType"/>
 *         &lt;element name="MediumOfInstruction" type="{http://www.sifassociation.org/datamodel/na/4.x}MediumOfInstructionType" minOccurs="0"/>
 *         &lt;element name="LanguageOfInstruction" type="{http://www.sifassociation.org/datamodel/na/4.x}LanguageOfInstructionType" minOccurs="0"/>
 *         &lt;element name="LocationOfInstruction" type="{http://www.sifassociation.org/datamodel/na/4.x}LocationOfInstructionType" minOccurs="0"/>
 *         &lt;element name="SummerSchool" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SchoolCourseInfoOverride" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolCourseInfoOverrideType" minOccurs="0"/>
 *         &lt;element name="CourseSectionCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SectionCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="CountForAttendance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BellScheduleRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="SchoolCourseInfoRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="SchoolYear" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolYearType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SectionInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "localId",
    "description",
    "scheduleInfoList",
    "mediumOfInstruction",
    "languageOfInstruction",
    "locationOfInstruction",
    "summerSchool",
    "schoolCourseInfoOverride",
    "courseSectionCode",
    "sectionCode",
    "countForAttendance",
    "bellScheduleRefId",
    "sifMetadata",
    "sifExtendedElements"
})
public class SectionInfoType {

    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(name = "ScheduleInfoList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected ScheduleInfoListType scheduleInfoList;
    @XmlElement(name = "MediumOfInstruction", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MediumOfInstructionType mediumOfInstruction;
    @XmlElement(name = "LanguageOfInstruction", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LanguageOfInstructionType languageOfInstruction;
    @XmlElement(name = "LocationOfInstruction", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LocationOfInstructionType locationOfInstruction;
    @XmlElement(name = "SummerSchool", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SectionInfoType.SummerSchool summerSchool;
    @XmlElement(name = "SchoolCourseInfoOverride", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SchoolCourseInfoOverrideType schoolCourseInfoOverride;
    @XmlElement(name = "CourseSectionCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String courseSectionCode;
    @XmlElement(name = "SectionCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sectionCode;
    @XmlElement(name = "CountForAttendance", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SectionInfoType.CountForAttendance countForAttendance;
    @XmlElement(name = "BellScheduleRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bellScheduleRefId;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "SchoolCourseInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolCourseInfoRefId;
    @XmlAttribute(name = "SchoolYear", required = true)
    protected XMLGregorianCalendar schoolYear;

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
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
     * Gets the value of the scheduleInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ScheduleInfoListType }
     *     
     */
    public ScheduleInfoListType getScheduleInfoList() {
        return scheduleInfoList;
    }

    /**
     * Sets the value of the scheduleInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScheduleInfoListType }
     *     
     */
    public void setScheduleInfoList(ScheduleInfoListType value) {
        this.scheduleInfoList = value;
    }

    /**
     * Gets the value of the mediumOfInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link MediumOfInstructionType }
     *     
     */
    public MediumOfInstructionType getMediumOfInstruction() {
        return mediumOfInstruction;
    }

    /**
     * Sets the value of the mediumOfInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediumOfInstructionType }
     *     
     */
    public void setMediumOfInstruction(MediumOfInstructionType value) {
        this.mediumOfInstruction = value;
    }

    /**
     * Gets the value of the languageOfInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageOfInstructionType }
     *     
     */
    public LanguageOfInstructionType getLanguageOfInstruction() {
        return languageOfInstruction;
    }

    /**
     * Sets the value of the languageOfInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageOfInstructionType }
     *     
     */
    public void setLanguageOfInstruction(LanguageOfInstructionType value) {
        this.languageOfInstruction = value;
    }

    /**
     * Gets the value of the locationOfInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link LocationOfInstructionType }
     *     
     */
    public LocationOfInstructionType getLocationOfInstruction() {
        return locationOfInstruction;
    }

    /**
     * Sets the value of the locationOfInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationOfInstructionType }
     *     
     */
    public void setLocationOfInstruction(LocationOfInstructionType value) {
        this.locationOfInstruction = value;
    }

    /**
     * Gets the value of the summerSchool property.
     * 
     * @return
     *     possible object is
     *     {@link SectionInfoType.SummerSchool }
     *     
     */
    public SectionInfoType.SummerSchool getSummerSchool() {
        return summerSchool;
    }

    /**
     * Sets the value of the summerSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionInfoType.SummerSchool }
     *     
     */
    public void setSummerSchool(SectionInfoType.SummerSchool value) {
        this.summerSchool = value;
    }

    /**
     * Gets the value of the schoolCourseInfoOverride property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCourseInfoOverrideType }
     *     
     */
    public SchoolCourseInfoOverrideType getSchoolCourseInfoOverride() {
        return schoolCourseInfoOverride;
    }

    /**
     * Sets the value of the schoolCourseInfoOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCourseInfoOverrideType }
     *     
     */
    public void setSchoolCourseInfoOverride(SchoolCourseInfoOverrideType value) {
        this.schoolCourseInfoOverride = value;
    }

    /**
     * Gets the value of the courseSectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseSectionCode() {
        return courseSectionCode;
    }

    /**
     * Sets the value of the courseSectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseSectionCode(String value) {
        this.courseSectionCode = value;
    }

    /**
     * Gets the value of the sectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * Sets the value of the sectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionCode(String value) {
        this.sectionCode = value;
    }

    /**
     * Gets the value of the countForAttendance property.
     * 
     * @return
     *     possible object is
     *     {@link SectionInfoType.CountForAttendance }
     *     
     */
    public SectionInfoType.CountForAttendance getCountForAttendance() {
        return countForAttendance;
    }

    /**
     * Sets the value of the countForAttendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SectionInfoType.CountForAttendance }
     *     
     */
    public void setCountForAttendance(SectionInfoType.CountForAttendance value) {
        this.countForAttendance = value;
    }

    /**
     * Gets the value of the bellScheduleRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBellScheduleRefId() {
        return bellScheduleRefId;
    }

    /**
     * Sets the value of the bellScheduleRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBellScheduleRefId(String value) {
        this.bellScheduleRefId = value;
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
     * Gets the value of the schoolCourseInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolCourseInfoRefId() {
        return schoolCourseInfoRefId;
    }

    /**
     * Sets the value of the schoolCourseInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolCourseInfoRefId(String value) {
        this.schoolCourseInfoRefId = value;
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
    public static class CountForAttendance {

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
    public static class SummerSchool {

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
