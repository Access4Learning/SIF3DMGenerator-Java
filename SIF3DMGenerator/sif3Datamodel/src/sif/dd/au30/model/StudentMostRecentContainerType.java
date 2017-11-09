
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentMostRecentContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentMostRecentContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="HomeroomLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="YearLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType" minOccurs="0"/>
 *         &lt;element name="FTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Parent1Language" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsAustralianStandardClassificationOfLanguagesASCLType" minOccurs="0"/>
 *         &lt;element name="Parent2Language" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsAustralianStandardClassificationOfLanguagesASCLType" minOccurs="0"/>
 *         &lt;element name="Parent1EmploymentType" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsEmploymentTypeType" minOccurs="0"/>
 *         &lt;element name="Parent2EmploymentType" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsEmploymentTypeType" minOccurs="0"/>
 *         &lt;element name="Parent1SchoolEducationLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSchoolEducationLevelTypeType" minOccurs="0"/>
 *         &lt;element name="Parent2SchoolEducationLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSchoolEducationLevelTypeType" minOccurs="0"/>
 *         &lt;element name="Parent1NonSchoolEducation" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsNonSchoolEducationType" minOccurs="0"/>
 *         &lt;element name="Parent2NonSchoolEducation" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsNonSchoolEducationType" minOccurs="0"/>
 *         &lt;element name="LocalCampusId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="SchoolACARAId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="TestLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType" minOccurs="0"/>
 *         &lt;element name="Homegroup" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="MembershipType" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSchoolEnrollmentTypeType" minOccurs="0"/>
 *         &lt;element name="FFPOS" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsFFPOSStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ReportingSchoolId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="OtherEnrollmentSchoolACARAId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentMostRecentContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "schoolLocalId",
    "homeroomLocalId",
    "yearLevel",
    "fte",
    "parent1Language",
    "parent2Language",
    "parent1EmploymentType",
    "parent2EmploymentType",
    "parent1SchoolEducationLevel",
    "parent2SchoolEducationLevel",
    "parent1NonSchoolEducation",
    "parent2NonSchoolEducation",
    "localCampusId",
    "schoolACARAId",
    "testLevel",
    "homegroup",
    "classCode",
    "membershipType",
    "ffpos",
    "reportingSchoolId",
    "otherEnrollmentSchoolACARAId"
})
public class StudentMostRecentContainerType {

    @XmlElementRef(name = "SchoolLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolLocalId;
    @XmlElementRef(name = "HomeroomLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homeroomLocalId;
    @XmlElementRef(name = "YearLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<YearLevelType> yearLevel;
    @XmlElementRef(name = "FTE", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> fte;
    @XmlElementRef(name = "Parent1Language", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent1Language;
    @XmlElementRef(name = "Parent2Language", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent2Language;
    @XmlElementRef(name = "Parent1EmploymentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent1EmploymentType;
    @XmlElementRef(name = "Parent2EmploymentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent2EmploymentType;
    @XmlElementRef(name = "Parent1SchoolEducationLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent1SchoolEducationLevel;
    @XmlElementRef(name = "Parent2SchoolEducationLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent2SchoolEducationLevel;
    @XmlElementRef(name = "Parent1NonSchoolEducation", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent1NonSchoolEducation;
    @XmlElementRef(name = "Parent2NonSchoolEducation", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parent2NonSchoolEducation;
    @XmlElementRef(name = "LocalCampusId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localCampusId;
    @XmlElementRef(name = "SchoolACARAId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolACARAId;
    @XmlElementRef(name = "TestLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<YearLevelType> testLevel;
    @XmlElementRef(name = "Homegroup", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homegroup;
    @XmlElementRef(name = "ClassCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classCode;
    @XmlElementRef(name = "MembershipType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> membershipType;
    @XmlElementRef(name = "FFPOS", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffpos;
    @XmlElementRef(name = "ReportingSchoolId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportingSchoolId;
    @XmlElementRef(name = "OtherEnrollmentSchoolACARAId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherEnrollmentSchoolACARAId;

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
     * Gets the value of the homeroomLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomeroomLocalId() {
        return homeroomLocalId;
    }

    /**
     * Sets the value of the homeroomLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomeroomLocalId(JAXBElement<String> value) {
        this.homeroomLocalId = value;
    }

    /**
     * Gets the value of the yearLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}
     *     
     */
    public JAXBElement<YearLevelType> getYearLevel() {
        return yearLevel;
    }

    /**
     * Sets the value of the yearLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}
     *     
     */
    public void setYearLevel(JAXBElement<YearLevelType> value) {
        this.yearLevel = value;
    }

    /**
     * Gets the value of the fte property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFTE() {
        return fte;
    }

    /**
     * Sets the value of the fte property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFTE(JAXBElement<BigDecimal> value) {
        this.fte = value;
    }

    /**
     * Gets the value of the parent1Language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParent1Language() {
        return parent1Language;
    }

    /**
     * Sets the value of the parent1Language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParent1Language(JAXBElement<String> value) {
        this.parent1Language = value;
    }

    /**
     * Gets the value of the parent2Language property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParent2Language() {
        return parent2Language;
    }

    /**
     * Sets the value of the parent2Language property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParent2Language(JAXBElement<String> value) {
        this.parent2Language = value;
    }

    /**
     * Gets the value of the parent1EmploymentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParent1EmploymentType() {
        return parent1EmploymentType;
    }

    /**
     * Sets the value of the parent1EmploymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParent1EmploymentType(JAXBElement<String> value) {
        this.parent1EmploymentType = value;
    }

    /**
     * Gets the value of the parent2EmploymentType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParent2EmploymentType() {
        return parent2EmploymentType;
    }

    /**
     * Sets the value of the parent2EmploymentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParent2EmploymentType(JAXBElement<String> value) {
        this.parent2EmploymentType = value;
    }

    /**
     * Gets the value of the parent1SchoolEducationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParent1SchoolEducationLevel() {
        return parent1SchoolEducationLevel;
    }

    /**
     * Sets the value of the parent1SchoolEducationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParent1SchoolEducationLevel(JAXBElement<String> value) {
        this.parent1SchoolEducationLevel = value;
    }

    /**
     * Gets the value of the parent2SchoolEducationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParent2SchoolEducationLevel() {
        return parent2SchoolEducationLevel;
    }

    /**
     * Sets the value of the parent2SchoolEducationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParent2SchoolEducationLevel(JAXBElement<String> value) {
        this.parent2SchoolEducationLevel = value;
    }

    /**
     * Gets the value of the parent1NonSchoolEducation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParent1NonSchoolEducation() {
        return parent1NonSchoolEducation;
    }

    /**
     * Sets the value of the parent1NonSchoolEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParent1NonSchoolEducation(JAXBElement<String> value) {
        this.parent1NonSchoolEducation = value;
    }

    /**
     * Gets the value of the parent2NonSchoolEducation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParent2NonSchoolEducation() {
        return parent2NonSchoolEducation;
    }

    /**
     * Sets the value of the parent2NonSchoolEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParent2NonSchoolEducation(JAXBElement<String> value) {
        this.parent2NonSchoolEducation = value;
    }

    /**
     * Gets the value of the localCampusId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalCampusId() {
        return localCampusId;
    }

    /**
     * Sets the value of the localCampusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalCampusId(JAXBElement<String> value) {
        this.localCampusId = value;
    }

    /**
     * Gets the value of the schoolACARAId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolACARAId() {
        return schoolACARAId;
    }

    /**
     * Sets the value of the schoolACARAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolACARAId(JAXBElement<String> value) {
        this.schoolACARAId = value;
    }

    /**
     * Gets the value of the testLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}
     *     
     */
    public JAXBElement<YearLevelType> getTestLevel() {
        return testLevel;
    }

    /**
     * Sets the value of the testLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YearLevelType }{@code >}
     *     
     */
    public void setTestLevel(JAXBElement<YearLevelType> value) {
        this.testLevel = value;
    }

    /**
     * Gets the value of the homegroup property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomegroup() {
        return homegroup;
    }

    /**
     * Sets the value of the homegroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomegroup(JAXBElement<String> value) {
        this.homegroup = value;
    }

    /**
     * Gets the value of the classCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassCode() {
        return classCode;
    }

    /**
     * Sets the value of the classCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassCode(JAXBElement<String> value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the membershipType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMembershipType() {
        return membershipType;
    }

    /**
     * Sets the value of the membershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMembershipType(JAXBElement<String> value) {
        this.membershipType = value;
    }

    /**
     * Gets the value of the ffpos property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFFPOS() {
        return ffpos;
    }

    /**
     * Sets the value of the ffpos property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFFPOS(JAXBElement<String> value) {
        this.ffpos = value;
    }

    /**
     * Gets the value of the reportingSchoolId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportingSchoolId() {
        return reportingSchoolId;
    }

    /**
     * Sets the value of the reportingSchoolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportingSchoolId(JAXBElement<String> value) {
        this.reportingSchoolId = value;
    }

    /**
     * Gets the value of the otherEnrollmentSchoolACARAId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherEnrollmentSchoolACARAId() {
        return otherEnrollmentSchoolACARAId;
    }

    /**
     * Sets the value of the otherEnrollmentSchoolACARAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherEnrollmentSchoolACARAId(JAXBElement<String> value) {
        this.otherEnrollmentSchoolACARAId = value;
    }

}
