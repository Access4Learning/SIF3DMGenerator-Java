
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentSchoolEnrollmentSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSchoolEnrollmentSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolYear" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolYearType" minOccurs="0"/>
 *         &lt;element name="EntryDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="ExitDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="EntryType" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentEntryTypeType" minOccurs="0"/>
 *         &lt;element name="GradeLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelType" minOccurs="0"/>
 *         &lt;element name="ExitStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentExitStatusType" minOccurs="0"/>
 *         &lt;element name="ExitType" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentExitTypeType" minOccurs="0"/>
 *         &lt;element name="StudentLEARelationship" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentLEARelationship2Type" minOccurs="0"/>
 *         &lt;element name="StudentSchoolRelationship" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentSchoolRelationshipType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SchoolAttendedRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSchoolEnrollmentSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "schoolYear",
    "entryDate",
    "exitDate",
    "entryType",
    "gradeLevel",
    "exitStatus",
    "exitType",
    "studentLEARelationship",
    "studentSchoolRelationship",
    "sifExtendedElements"
})
public class StudentSchoolEnrollmentSummaryType {

    @XmlElement(name = "SchoolYear", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(name = "EntryDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String entryDate;
    @XmlElement(name = "ExitDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String exitDate;
    @XmlElement(name = "EntryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentEntryTypeType entryType;
    @XmlElement(name = "GradeLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelType gradeLevel;
    @XmlElement(name = "ExitStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentExitStatusType exitStatus;
    @XmlElement(name = "ExitType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentExitTypeType exitType;
    @XmlElement(name = "StudentLEARelationship", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentLEARelationship2Type studentLEARelationship;
    @XmlElement(name = "StudentSchoolRelationship", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSchoolRelationshipType studentSchoolRelationship;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "SchoolAttendedRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolAttendedRefId;

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
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryDate(String value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the exitDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExitDate() {
        return exitDate;
    }

    /**
     * Sets the value of the exitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExitDate(String value) {
        this.exitDate = value;
    }

    /**
     * Gets the value of the entryType property.
     * 
     * @return
     *     possible object is
     *     {@link StudentEntryTypeType }
     *     
     */
    public StudentEntryTypeType getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentEntryTypeType }
     *     
     */
    public void setEntryType(StudentEntryTypeType value) {
        this.entryType = value;
    }

    /**
     * Gets the value of the gradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelType }
     *     
     */
    public GradeLevelType getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets the value of the gradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelType }
     *     
     */
    public void setGradeLevel(GradeLevelType value) {
        this.gradeLevel = value;
    }

    /**
     * Gets the value of the exitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StudentExitStatusType }
     *     
     */
    public StudentExitStatusType getExitStatus() {
        return exitStatus;
    }

    /**
     * Sets the value of the exitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentExitStatusType }
     *     
     */
    public void setExitStatus(StudentExitStatusType value) {
        this.exitStatus = value;
    }

    /**
     * Gets the value of the exitType property.
     * 
     * @return
     *     possible object is
     *     {@link StudentExitTypeType }
     *     
     */
    public StudentExitTypeType getExitType() {
        return exitType;
    }

    /**
     * Sets the value of the exitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentExitTypeType }
     *     
     */
    public void setExitType(StudentExitTypeType value) {
        this.exitType = value;
    }

    /**
     * Gets the value of the studentLEARelationship property.
     * 
     * @return
     *     possible object is
     *     {@link StudentLEARelationship2Type }
     *     
     */
    public StudentLEARelationship2Type getStudentLEARelationship() {
        return studentLEARelationship;
    }

    /**
     * Sets the value of the studentLEARelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentLEARelationship2Type }
     *     
     */
    public void setStudentLEARelationship(StudentLEARelationship2Type value) {
        this.studentLEARelationship = value;
    }

    /**
     * Gets the value of the studentSchoolRelationship property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSchoolRelationshipType }
     *     
     */
    public StudentSchoolRelationshipType getStudentSchoolRelationship() {
        return studentSchoolRelationship;
    }

    /**
     * Sets the value of the studentSchoolRelationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSchoolRelationshipType }
     *     
     */
    public void setStudentSchoolRelationship(StudentSchoolRelationshipType value) {
        this.studentSchoolRelationship = value;
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
     * Gets the value of the schoolAttendedRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAttendedRefId() {
        return schoolAttendedRefId;
    }

    /**
     * Sets the value of the schoolAttendedRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAttendedRefId(String value) {
        this.schoolAttendedRefId = value;
    }

}
