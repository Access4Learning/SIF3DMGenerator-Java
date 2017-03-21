
package sif.dd.au30.model;

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
 * <p>Java class for TeachingGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeachingGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolYear" type="{http://www.sifassociation.org/datamodel/au/3.4.1}SchoolYearType"/>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType"/>
 *         &lt;element name="ShortName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="LongName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="GroupType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Set" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Block" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="CurriculumLevel" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}RefIdType" minOccurs="0"/>
 *         &lt;element name="SchoolLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType" minOccurs="0"/>
 *         &lt;element name="SchoolCourseInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}RefIdType" minOccurs="0"/>
 *         &lt;element name="SchoolCourseLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType" minOccurs="0"/>
 *         &lt;element name="TimeTableSubjectRefId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}RefIdType" minOccurs="0"/>
 *         &lt;element name="TimeTableSubjectLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType" minOccurs="0"/>
 *         &lt;element name="Semester" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="StudentList" type="{http://www.sifassociation.org/datamodel/au/3.4.1}StudentListType" minOccurs="0"/>
 *         &lt;element name="TeacherList" type="{http://www.sifassociation.org/datamodel/au/3.4.1}TeacherListType" minOccurs="0"/>
 *         &lt;element name="MinClassSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MaxClassSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TeachingGroupPeriodList" type="{http://www.sifassociation.org/datamodel/au/3.4.1}TeachingGroupPeriodListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4.1}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4.1}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4.1}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeachingGroupType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "schoolYear",
    "localId",
    "shortName",
    "longName",
    "groupType",
    "set",
    "block",
    "curriculumLevel",
    "schoolInfoRefId",
    "schoolLocalId",
    "schoolCourseInfoRefId",
    "schoolCourseLocalId",
    "timeTableSubjectRefId",
    "timeTableSubjectLocalId",
    "semester",
    "studentList",
    "teacherList",
    "minClassSize",
    "maxClassSize",
    "teachingGroupPeriodList",
    "sifMetadata",
    "sifExtendedElements"
})
public class TeachingGroupType {

    @XmlElement(name = "SchoolYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElement(name = "ShortName", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shortName;
    @XmlElementRef(name = "LongName", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longName;
    @XmlElementRef(name = "GroupType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> groupType;
    @XmlElementRef(name = "Set", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> set;
    @XmlElementRef(name = "Block", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> block;
    @XmlElementRef(name = "CurriculumLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curriculumLevel;
    @XmlElementRef(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolInfoRefId;
    @XmlElementRef(name = "SchoolLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolLocalId;
    @XmlElementRef(name = "SchoolCourseInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolCourseInfoRefId;
    @XmlElementRef(name = "SchoolCourseLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolCourseLocalId;
    @XmlElementRef(name = "TimeTableSubjectRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeTableSubjectRefId;
    @XmlElementRef(name = "TimeTableSubjectLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeTableSubjectLocalId;
    @XmlElementRef(name = "Semester", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> semester;
    @XmlElementRef(name = "StudentList", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentListType> studentList;
    @XmlElementRef(name = "TeacherList", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TeacherListType> teacherList;
    @XmlElementRef(name = "MinClassSize", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> minClassSize;
    @XmlElementRef(name = "MaxClassSize", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> maxClassSize;
    @XmlElementRef(name = "TeachingGroupPeriodList", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<TeachingGroupPeriodListType> teachingGroupPeriodList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
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
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongName(JAXBElement<String> value) {
        this.longName = value;
    }

    /**
     * Gets the value of the groupType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGroupType() {
        return groupType;
    }

    /**
     * Sets the value of the groupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGroupType(JAXBElement<String> value) {
        this.groupType = value;
    }

    /**
     * Gets the value of the set property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSet() {
        return set;
    }

    /**
     * Sets the value of the set property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSet(JAXBElement<String> value) {
        this.set = value;
    }

    /**
     * Gets the value of the block property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBlock() {
        return block;
    }

    /**
     * Sets the value of the block property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBlock(JAXBElement<String> value) {
        this.block = value;
    }

    /**
     * Gets the value of the curriculumLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurriculumLevel() {
        return curriculumLevel;
    }

    /**
     * Sets the value of the curriculumLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurriculumLevel(JAXBElement<String> value) {
        this.curriculumLevel = value;
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
     * Gets the value of the schoolCourseInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolCourseInfoRefId() {
        return schoolCourseInfoRefId;
    }

    /**
     * Sets the value of the schoolCourseInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolCourseInfoRefId(JAXBElement<String> value) {
        this.schoolCourseInfoRefId = value;
    }

    /**
     * Gets the value of the schoolCourseLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolCourseLocalId() {
        return schoolCourseLocalId;
    }

    /**
     * Sets the value of the schoolCourseLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolCourseLocalId(JAXBElement<String> value) {
        this.schoolCourseLocalId = value;
    }

    /**
     * Gets the value of the timeTableSubjectRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeTableSubjectRefId() {
        return timeTableSubjectRefId;
    }

    /**
     * Sets the value of the timeTableSubjectRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeTableSubjectRefId(JAXBElement<String> value) {
        this.timeTableSubjectRefId = value;
    }

    /**
     * Gets the value of the timeTableSubjectLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeTableSubjectLocalId() {
        return timeTableSubjectLocalId;
    }

    /**
     * Sets the value of the timeTableSubjectLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeTableSubjectLocalId(JAXBElement<String> value) {
        this.timeTableSubjectLocalId = value;
    }

    /**
     * Gets the value of the semester property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSemester() {
        return semester;
    }

    /**
     * Sets the value of the semester property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSemester(JAXBElement<Long> value) {
        this.semester = value;
    }

    /**
     * Gets the value of the studentList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentListType }{@code >}
     *     
     */
    public JAXBElement<StudentListType> getStudentList() {
        return studentList;
    }

    /**
     * Sets the value of the studentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentListType }{@code >}
     *     
     */
    public void setStudentList(JAXBElement<StudentListType> value) {
        this.studentList = value;
    }

    /**
     * Gets the value of the teacherList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeacherListType }{@code >}
     *     
     */
    public JAXBElement<TeacherListType> getTeacherList() {
        return teacherList;
    }

    /**
     * Sets the value of the teacherList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeacherListType }{@code >}
     *     
     */
    public void setTeacherList(JAXBElement<TeacherListType> value) {
        this.teacherList = value;
    }

    /**
     * Gets the value of the minClassSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getMinClassSize() {
        return minClassSize;
    }

    /**
     * Sets the value of the minClassSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setMinClassSize(JAXBElement<BigInteger> value) {
        this.minClassSize = value;
    }

    /**
     * Gets the value of the maxClassSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getMaxClassSize() {
        return maxClassSize;
    }

    /**
     * Sets the value of the maxClassSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setMaxClassSize(JAXBElement<BigInteger> value) {
        this.maxClassSize = value;
    }

    /**
     * Gets the value of the teachingGroupPeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeachingGroupPeriodListType }{@code >}
     *     
     */
    public JAXBElement<TeachingGroupPeriodListType> getTeachingGroupPeriodList() {
        return teachingGroupPeriodList;
    }

    /**
     * Sets the value of the teachingGroupPeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeachingGroupPeriodListType }{@code >}
     *     
     */
    public void setTeachingGroupPeriodList(JAXBElement<TeachingGroupPeriodListType> value) {
        this.teachingGroupPeriodList = value;
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
