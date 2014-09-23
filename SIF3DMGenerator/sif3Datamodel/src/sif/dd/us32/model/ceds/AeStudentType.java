
package sif.dd.us32.model.ceds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for aeStudentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aeStudentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="otherNameList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="identification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="idVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="contact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addressList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="street" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="phoneNumberList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="phoneNumber" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="emailList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="email" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="demographic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="americanIndianOrAlaskaNative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="asian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="blackOrAfricanAmerican" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nativeHawaiianOrOtherPacificIslander" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="white" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hispanicOrLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="status" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="displacedHomemakerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="disabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dislocatedWorkerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lowIncomeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="publicAssistanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ruralResidencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="singleParentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="employment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="employedWhileEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentNAICSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employedAfterExit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="aeProgramList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aeProgram" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="aeInstructionalProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="aeSpecialProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="aeFunctioningLevelAtIntake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="aeFunctioningLevelAtPosttest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="goalsForAttendingAdultEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="aePostsecondaryTransitionAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="aePostsecondaryTransitionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="proxyContactHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="careerCluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="careerPathwaysProgramParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="correctionalEducationFacilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="correctionalEducationReentryServicesParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="entryGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exitGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="instructionalActivityHoursCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="academicRecord" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="highestLevelOfEducationCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="highSchoolDiplomaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="diplomaOrCredentialAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="academicAwardLevelConferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalOrTechnicalCredentialConferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aeStudentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "identity",
    "contact",
    "demographic",
    "status",
    "employment",
    "aeProgramList",
    "academicRecord"
})
public class AeStudentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AeStudentType.Identity identity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AeStudentType.Contact contact;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AeStudentType.Demographic demographic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AeStudentType.Status status;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AeStudentType.Employment employment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AeStudentType.AeProgramList aeProgramList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AeStudentType.AcademicRecord academicRecord;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link AeStudentType.Identity }
     *     
     */
    public AeStudentType.Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AeStudentType.Identity }
     *     
     */
    public void setIdentity(AeStudentType.Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link AeStudentType.Contact }
     *     
     */
    public AeStudentType.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link AeStudentType.Contact }
     *     
     */
    public void setContact(AeStudentType.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the demographic property.
     * 
     * @return
     *     possible object is
     *     {@link AeStudentType.Demographic }
     *     
     */
    public AeStudentType.Demographic getDemographic() {
        return demographic;
    }

    /**
     * Sets the value of the demographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AeStudentType.Demographic }
     *     
     */
    public void setDemographic(AeStudentType.Demographic value) {
        this.demographic = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AeStudentType.Status }
     *     
     */
    public AeStudentType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AeStudentType.Status }
     *     
     */
    public void setStatus(AeStudentType.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link AeStudentType.Employment }
     *     
     */
    public AeStudentType.Employment getEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AeStudentType.Employment }
     *     
     */
    public void setEmployment(AeStudentType.Employment value) {
        this.employment = value;
    }

    /**
     * Gets the value of the aeProgramList property.
     * 
     * @return
     *     possible object is
     *     {@link AeStudentType.AeProgramList }
     *     
     */
    public AeStudentType.AeProgramList getAeProgramList() {
        return aeProgramList;
    }

    /**
     * Sets the value of the aeProgramList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AeStudentType.AeProgramList }
     *     
     */
    public void setAeProgramList(AeStudentType.AeProgramList value) {
        this.aeProgramList = value;
    }

    /**
     * Gets the value of the academicRecord property.
     * 
     * @return
     *     possible object is
     *     {@link AeStudentType.AcademicRecord }
     *     
     */
    public AeStudentType.AcademicRecord getAcademicRecord() {
        return academicRecord;
    }

    /**
     * Sets the value of the academicRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link AeStudentType.AcademicRecord }
     *     
     */
    public void setAcademicRecord(AeStudentType.AcademicRecord value) {
        this.academicRecord = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="highestLevelOfEducationCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="highSchoolDiplomaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="diplomaOrCredentialAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="academicAwardLevelConferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalOrTechnicalCredentialConferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "highestLevelOfEducationCompleted",
        "highSchoolDiplomaType",
        "diplomaOrCredentialAwardDate",
        "academicAwardLevelConferred",
        "professionalOrTechnicalCredentialConferred"
    })
    public static class AcademicRecord {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String highestLevelOfEducationCompleted;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String highSchoolDiplomaType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String diplomaOrCredentialAwardDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String academicAwardLevelConferred;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalOrTechnicalCredentialConferred;

        /**
         * Gets the value of the highestLevelOfEducationCompleted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHighestLevelOfEducationCompleted() {
            return highestLevelOfEducationCompleted;
        }

        /**
         * Sets the value of the highestLevelOfEducationCompleted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHighestLevelOfEducationCompleted(String value) {
            this.highestLevelOfEducationCompleted = value;
        }

        /**
         * Gets the value of the highSchoolDiplomaType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHighSchoolDiplomaType() {
            return highSchoolDiplomaType;
        }

        /**
         * Sets the value of the highSchoolDiplomaType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHighSchoolDiplomaType(String value) {
            this.highSchoolDiplomaType = value;
        }

        /**
         * Gets the value of the diplomaOrCredentialAwardDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiplomaOrCredentialAwardDate() {
            return diplomaOrCredentialAwardDate;
        }

        /**
         * Sets the value of the diplomaOrCredentialAwardDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiplomaOrCredentialAwardDate(String value) {
            this.diplomaOrCredentialAwardDate = value;
        }

        /**
         * Gets the value of the academicAwardLevelConferred property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcademicAwardLevelConferred() {
            return academicAwardLevelConferred;
        }

        /**
         * Sets the value of the academicAwardLevelConferred property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcademicAwardLevelConferred(String value) {
            this.academicAwardLevelConferred = value;
        }

        /**
         * Gets the value of the professionalOrTechnicalCredentialConferred property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalOrTechnicalCredentialConferred() {
            return professionalOrTechnicalCredentialConferred;
        }

        /**
         * Sets the value of the professionalOrTechnicalCredentialConferred property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalOrTechnicalCredentialConferred(String value) {
            this.professionalOrTechnicalCredentialConferred = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="aeProgram" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="aeInstructionalProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="aeSpecialProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="aeFunctioningLevelAtIntake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="aeFunctioningLevelAtPosttest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="goalsForAttendingAdultEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="aePostsecondaryTransitionAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="aePostsecondaryTransitionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="proxyContactHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="careerCluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="careerPathwaysProgramParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="correctionalEducationFacilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="correctionalEducationReentryServicesParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="entryGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exitGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="instructionalActivityHoursCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "aeProgram"
    })
    public static class AeProgramList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AeStudentType.AeProgramList.AeProgram> aeProgram;

        /**
         * Gets the value of the aeProgram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the aeProgram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAeProgram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AeStudentType.AeProgramList.AeProgram }
         * 
         * 
         */
        public List<AeStudentType.AeProgramList.AeProgram> getAeProgram() {
            if (aeProgram == null) {
                aeProgram = new ArrayList<AeStudentType.AeProgramList.AeProgram>();
            }
            return this.aeProgram;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="aeInstructionalProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="aeSpecialProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="aeFunctioningLevelAtIntake" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="aeFunctioningLevelAtPosttest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="goalsForAttendingAdultEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="aePostsecondaryTransitionAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="aePostsecondaryTransitionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="proxyContactHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="careerCluster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="careerPathwaysProgramParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="correctionalEducationFacilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="correctionalEducationReentryServicesParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="entryGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exitGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="instructionalActivityHoursCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "aeInstructionalProgramType",
            "enrollmentDate",
            "exitDate",
            "aeSpecialProgramType",
            "aeFunctioningLevelAtIntake",
            "aeFunctioningLevelAtPosttest",
            "goalsForAttendingAdultEducation",
            "aePostsecondaryTransitionAction",
            "aePostsecondaryTransitionDate",
            "proxyContactHours",
            "careerCluster",
            "careerPathwaysProgramParticipationIndicator",
            "correctionalEducationFacilityType",
            "correctionalEducationReentryServicesParticipationIndicator",
            "entryGradeLevel",
            "exitGradeLevel",
            "instructionalActivityHoursCompleted"
        })
        public static class AeProgram {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String aeInstructionalProgramType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String enrollmentDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String exitDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String aeSpecialProgramType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String aeFunctioningLevelAtIntake;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String aeFunctioningLevelAtPosttest;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String goalsForAttendingAdultEducation;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String aePostsecondaryTransitionAction;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String aePostsecondaryTransitionDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String proxyContactHours;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String careerCluster;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String careerPathwaysProgramParticipationIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String correctionalEducationFacilityType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String correctionalEducationReentryServicesParticipationIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String entryGradeLevel;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String exitGradeLevel;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String instructionalActivityHoursCompleted;

            /**
             * Gets the value of the aeInstructionalProgramType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAeInstructionalProgramType() {
                return aeInstructionalProgramType;
            }

            /**
             * Sets the value of the aeInstructionalProgramType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAeInstructionalProgramType(String value) {
                this.aeInstructionalProgramType = value;
            }

            /**
             * Gets the value of the enrollmentDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnrollmentDate() {
                return enrollmentDate;
            }

            /**
             * Sets the value of the enrollmentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnrollmentDate(String value) {
                this.enrollmentDate = value;
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
             * Gets the value of the aeSpecialProgramType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAeSpecialProgramType() {
                return aeSpecialProgramType;
            }

            /**
             * Sets the value of the aeSpecialProgramType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAeSpecialProgramType(String value) {
                this.aeSpecialProgramType = value;
            }

            /**
             * Gets the value of the aeFunctioningLevelAtIntake property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAeFunctioningLevelAtIntake() {
                return aeFunctioningLevelAtIntake;
            }

            /**
             * Sets the value of the aeFunctioningLevelAtIntake property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAeFunctioningLevelAtIntake(String value) {
                this.aeFunctioningLevelAtIntake = value;
            }

            /**
             * Gets the value of the aeFunctioningLevelAtPosttest property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAeFunctioningLevelAtPosttest() {
                return aeFunctioningLevelAtPosttest;
            }

            /**
             * Sets the value of the aeFunctioningLevelAtPosttest property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAeFunctioningLevelAtPosttest(String value) {
                this.aeFunctioningLevelAtPosttest = value;
            }

            /**
             * Gets the value of the goalsForAttendingAdultEducation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGoalsForAttendingAdultEducation() {
                return goalsForAttendingAdultEducation;
            }

            /**
             * Sets the value of the goalsForAttendingAdultEducation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGoalsForAttendingAdultEducation(String value) {
                this.goalsForAttendingAdultEducation = value;
            }

            /**
             * Gets the value of the aePostsecondaryTransitionAction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAePostsecondaryTransitionAction() {
                return aePostsecondaryTransitionAction;
            }

            /**
             * Sets the value of the aePostsecondaryTransitionAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAePostsecondaryTransitionAction(String value) {
                this.aePostsecondaryTransitionAction = value;
            }

            /**
             * Gets the value of the aePostsecondaryTransitionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAePostsecondaryTransitionDate() {
                return aePostsecondaryTransitionDate;
            }

            /**
             * Sets the value of the aePostsecondaryTransitionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAePostsecondaryTransitionDate(String value) {
                this.aePostsecondaryTransitionDate = value;
            }

            /**
             * Gets the value of the proxyContactHours property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProxyContactHours() {
                return proxyContactHours;
            }

            /**
             * Sets the value of the proxyContactHours property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProxyContactHours(String value) {
                this.proxyContactHours = value;
            }

            /**
             * Gets the value of the careerCluster property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCareerCluster() {
                return careerCluster;
            }

            /**
             * Sets the value of the careerCluster property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCareerCluster(String value) {
                this.careerCluster = value;
            }

            /**
             * Gets the value of the careerPathwaysProgramParticipationIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCareerPathwaysProgramParticipationIndicator() {
                return careerPathwaysProgramParticipationIndicator;
            }

            /**
             * Sets the value of the careerPathwaysProgramParticipationIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCareerPathwaysProgramParticipationIndicator(String value) {
                this.careerPathwaysProgramParticipationIndicator = value;
            }

            /**
             * Gets the value of the correctionalEducationFacilityType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorrectionalEducationFacilityType() {
                return correctionalEducationFacilityType;
            }

            /**
             * Sets the value of the correctionalEducationFacilityType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorrectionalEducationFacilityType(String value) {
                this.correctionalEducationFacilityType = value;
            }

            /**
             * Gets the value of the correctionalEducationReentryServicesParticipationIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorrectionalEducationReentryServicesParticipationIndicator() {
                return correctionalEducationReentryServicesParticipationIndicator;
            }

            /**
             * Sets the value of the correctionalEducationReentryServicesParticipationIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorrectionalEducationReentryServicesParticipationIndicator(String value) {
                this.correctionalEducationReentryServicesParticipationIndicator = value;
            }

            /**
             * Gets the value of the entryGradeLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntryGradeLevel() {
                return entryGradeLevel;
            }

            /**
             * Sets the value of the entryGradeLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntryGradeLevel(String value) {
                this.entryGradeLevel = value;
            }

            /**
             * Gets the value of the exitGradeLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExitGradeLevel() {
                return exitGradeLevel;
            }

            /**
             * Sets the value of the exitGradeLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExitGradeLevel(String value) {
                this.exitGradeLevel = value;
            }

            /**
             * Gets the value of the instructionalActivityHoursCompleted property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInstructionalActivityHoursCompleted() {
                return instructionalActivityHoursCompleted;
            }

            /**
             * Sets the value of the instructionalActivityHoursCompleted property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInstructionalActivityHoursCompleted(String value) {
                this.instructionalActivityHoursCompleted = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="addressList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="street" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="phoneNumberList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="phoneNumber" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="emailList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="email" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "addressList",
        "phoneNumberList",
        "emailList"
    })
    public static class Contact {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected AeStudentType.Contact.AddressList addressList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected AeStudentType.Contact.PhoneNumberList phoneNumberList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected AeStudentType.Contact.EmailList emailList;

        /**
         * Gets the value of the addressList property.
         * 
         * @return
         *     possible object is
         *     {@link AeStudentType.Contact.AddressList }
         *     
         */
        public AeStudentType.Contact.AddressList getAddressList() {
            return addressList;
        }

        /**
         * Sets the value of the addressList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AeStudentType.Contact.AddressList }
         *     
         */
        public void setAddressList(AeStudentType.Contact.AddressList value) {
            this.addressList = value;
        }

        /**
         * Gets the value of the phoneNumberList property.
         * 
         * @return
         *     possible object is
         *     {@link AeStudentType.Contact.PhoneNumberList }
         *     
         */
        public AeStudentType.Contact.PhoneNumberList getPhoneNumberList() {
            return phoneNumberList;
        }

        /**
         * Sets the value of the phoneNumberList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AeStudentType.Contact.PhoneNumberList }
         *     
         */
        public void setPhoneNumberList(AeStudentType.Contact.PhoneNumberList value) {
            this.phoneNumberList = value;
        }

        /**
         * Gets the value of the emailList property.
         * 
         * @return
         *     possible object is
         *     {@link AeStudentType.Contact.EmailList }
         *     
         */
        public AeStudentType.Contact.EmailList getEmailList() {
            return emailList;
        }

        /**
         * Sets the value of the emailList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AeStudentType.Contact.EmailList }
         *     
         */
        public void setEmailList(AeStudentType.Contact.EmailList value) {
            this.emailList = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="street" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "address"
        })
        public static class AddressList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<AeStudentType.Contact.AddressList.Address> address;

            /**
             * Gets the value of the address property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the address property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddress().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AeStudentType.Contact.AddressList.Address }
             * 
             * 
             */
            public List<AeStudentType.Contact.AddressList.Address> getAddress() {
                if (address == null) {
                    address = new ArrayList<AeStudentType.Contact.AddressList.Address>();
                }
                return this.address;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="street" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "street",
                "city",
                "stateProvince",
                "postalCode",
                "county",
                "country"
            })
            public static class Address {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected AeStudentType.Contact.AddressList.Address.Street street;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String city;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String stateProvince;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String postalCode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String county;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String country;
                @XmlAttribute(name = "addressType")
                protected String addressType;

                /**
                 * Gets the value of the street property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AeStudentType.Contact.AddressList.Address.Street }
                 *     
                 */
                public AeStudentType.Contact.AddressList.Address.Street getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AeStudentType.Contact.AddressList.Address.Street }
                 *     
                 */
                public void setStreet(AeStudentType.Contact.AddressList.Address.Street value) {
                    this.street = value;
                }

                /**
                 * Gets the value of the city property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCity() {
                    return city;
                }

                /**
                 * Sets the value of the city property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCity(String value) {
                    this.city = value;
                }

                /**
                 * Gets the value of the stateProvince property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateProvince() {
                    return stateProvince;
                }

                /**
                 * Sets the value of the stateProvince property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateProvince(String value) {
                    this.stateProvince = value;
                }

                /**
                 * Gets the value of the postalCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPostalCode() {
                    return postalCode;
                }

                /**
                 * Sets the value of the postalCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPostalCode(String value) {
                    this.postalCode = value;
                }

                /**
                 * Gets the value of the county property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCounty() {
                    return county;
                }

                /**
                 * Sets the value of the county property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCounty(String value) {
                    this.county = value;
                }

                /**
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
                }

                /**
                 * Gets the value of the addressType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAddressType() {
                    return addressType;
                }

                /**
                 * Sets the value of the addressType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAddressType(String value) {
                    this.addressType = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "line1",
                    "apartmentNumber"
                })
                public static class Street {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String line1;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String apartmentNumber;

                    /**
                     * Gets the value of the line1 property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLine1() {
                        return line1;
                    }

                    /**
                     * Sets the value of the line1 property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLine1(String value) {
                        this.line1 = value;
                    }

                    /**
                     * Gets the value of the apartmentNumber property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getApartmentNumber() {
                        return apartmentNumber;
                    }

                    /**
                     * Sets the value of the apartmentNumber property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setApartmentNumber(String value) {
                        this.apartmentNumber = value;
                    }

                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="email" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "email"
        })
        public static class EmailList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<AeStudentType.Contact.EmailList.Email> email;

            /**
             * Gets the value of the email property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the email property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEmail().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AeStudentType.Contact.EmailList.Email }
             * 
             * 
             */
            public List<AeStudentType.Contact.EmailList.Email> getEmail() {
                if (email == null) {
                    email = new ArrayList<AeStudentType.Contact.EmailList.Email>();
                }
                return this.email;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Email {

                @XmlAttribute(name = "emailType")
                protected String emailType;

                /**
                 * Gets the value of the emailType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmailType() {
                    return emailType;
                }

                /**
                 * Sets the value of the emailType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmailType(String value) {
                    this.emailType = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="phoneNumber" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "phoneNumber"
        })
        public static class PhoneNumberList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<AeStudentType.Contact.PhoneNumberList.PhoneNumber> phoneNumber;

            /**
             * Gets the value of the phoneNumber property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPhoneNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AeStudentType.Contact.PhoneNumberList.PhoneNumber }
             * 
             * 
             */
            public List<AeStudentType.Contact.PhoneNumberList.PhoneNumber> getPhoneNumber() {
                if (phoneNumber == null) {
                    phoneNumber = new ArrayList<AeStudentType.Contact.PhoneNumberList.PhoneNumber>();
                }
                return this.phoneNumber;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "phoneNumberIndicator",
                "number"
            })
            public static class PhoneNumber {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String phoneNumberIndicator;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String number;
                @XmlAttribute(name = "phoneNumberType")
                protected String phoneNumberType;

                /**
                 * Gets the value of the phoneNumberIndicator property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPhoneNumberIndicator() {
                    return phoneNumberIndicator;
                }

                /**
                 * Sets the value of the phoneNumberIndicator property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPhoneNumberIndicator(String value) {
                    this.phoneNumberIndicator = value;
                }

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumber(String value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the phoneNumberType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPhoneNumberType() {
                    return phoneNumberType;
                }

                /**
                 * Sets the value of the phoneNumberType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPhoneNumberType(String value) {
                    this.phoneNumberType = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="americanIndianOrAlaskaNative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="asian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="blackOrAfricanAmerican" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nativeHawaiianOrOtherPacificIslander" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="white" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hispanicOrLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "birthdate",
        "sex",
        "americanIndianOrAlaskaNative",
        "asian",
        "blackOrAfricanAmerican",
        "nativeHawaiianOrOtherPacificIslander",
        "white",
        "hispanicOrLatinoEthnicity"
    })
    public static class Demographic {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String birthdate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sex;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String americanIndianOrAlaskaNative;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String asian;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String blackOrAfricanAmerican;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String nativeHawaiianOrOtherPacificIslander;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String white;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hispanicOrLatinoEthnicity;

        /**
         * Gets the value of the birthdate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBirthdate() {
            return birthdate;
        }

        /**
         * Sets the value of the birthdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBirthdate(String value) {
            this.birthdate = value;
        }

        /**
         * Gets the value of the sex property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSex() {
            return sex;
        }

        /**
         * Sets the value of the sex property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSex(String value) {
            this.sex = value;
        }

        /**
         * Gets the value of the americanIndianOrAlaskaNative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmericanIndianOrAlaskaNative() {
            return americanIndianOrAlaskaNative;
        }

        /**
         * Sets the value of the americanIndianOrAlaskaNative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmericanIndianOrAlaskaNative(String value) {
            this.americanIndianOrAlaskaNative = value;
        }

        /**
         * Gets the value of the asian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAsian() {
            return asian;
        }

        /**
         * Sets the value of the asian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAsian(String value) {
            this.asian = value;
        }

        /**
         * Gets the value of the blackOrAfricanAmerican property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlackOrAfricanAmerican() {
            return blackOrAfricanAmerican;
        }

        /**
         * Sets the value of the blackOrAfricanAmerican property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlackOrAfricanAmerican(String value) {
            this.blackOrAfricanAmerican = value;
        }

        /**
         * Gets the value of the nativeHawaiianOrOtherPacificIslander property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNativeHawaiianOrOtherPacificIslander() {
            return nativeHawaiianOrOtherPacificIslander;
        }

        /**
         * Sets the value of the nativeHawaiianOrOtherPacificIslander property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNativeHawaiianOrOtherPacificIslander(String value) {
            this.nativeHawaiianOrOtherPacificIslander = value;
        }

        /**
         * Gets the value of the white property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWhite() {
            return white;
        }

        /**
         * Sets the value of the white property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWhite(String value) {
            this.white = value;
        }

        /**
         * Gets the value of the hispanicOrLatinoEthnicity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHispanicOrLatinoEthnicity() {
            return hispanicOrLatinoEthnicity;
        }

        /**
         * Sets the value of the hispanicOrLatinoEthnicity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHispanicOrLatinoEthnicity(String value) {
            this.hispanicOrLatinoEthnicity = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="employedWhileEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentNAICSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employedAfterExit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "employedWhileEnrolled",
        "employmentNAICSCode",
        "employedAfterExit",
        "employmentEndDate",
        "employmentStartDate"
    })
    public static class Employment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employedWhileEnrolled;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentNAICSCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employedAfterExit;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentStartDate;

        /**
         * Gets the value of the employedWhileEnrolled property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployedWhileEnrolled() {
            return employedWhileEnrolled;
        }

        /**
         * Sets the value of the employedWhileEnrolled property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployedWhileEnrolled(String value) {
            this.employedWhileEnrolled = value;
        }

        /**
         * Gets the value of the employmentNAICSCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentNAICSCode() {
            return employmentNAICSCode;
        }

        /**
         * Sets the value of the employmentNAICSCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentNAICSCode(String value) {
            this.employmentNAICSCode = value;
        }

        /**
         * Gets the value of the employedAfterExit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployedAfterExit() {
            return employedAfterExit;
        }

        /**
         * Sets the value of the employedAfterExit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployedAfterExit(String value) {
            this.employedAfterExit = value;
        }

        /**
         * Gets the value of the employmentEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentEndDate() {
            return employmentEndDate;
        }

        /**
         * Sets the value of the employmentEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentEndDate(String value) {
            this.employmentEndDate = value;
        }

        /**
         * Gets the value of the employmentStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentStartDate() {
            return employmentStartDate;
        }

        /**
         * Sets the value of the employmentStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentStartDate(String value) {
            this.employmentStartDate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="otherNameList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="identification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="idVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "otherNameList",
        "identification"
    })
    public static class Identity {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected AeStudentType.Identity.Name name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected AeStudentType.Identity.OtherNameList otherNameList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected AeStudentType.Identity.Identification identification;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link AeStudentType.Identity.Name }
         *     
         */
        public AeStudentType.Identity.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link AeStudentType.Identity.Name }
         *     
         */
        public void setName(AeStudentType.Identity.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the otherNameList property.
         * 
         * @return
         *     possible object is
         *     {@link AeStudentType.Identity.OtherNameList }
         *     
         */
        public AeStudentType.Identity.OtherNameList getOtherNameList() {
            return otherNameList;
        }

        /**
         * Sets the value of the otherNameList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AeStudentType.Identity.OtherNameList }
         *     
         */
        public void setOtherNameList(AeStudentType.Identity.OtherNameList value) {
            this.otherNameList = value;
        }

        /**
         * Gets the value of the identification property.
         * 
         * @return
         *     possible object is
         *     {@link AeStudentType.Identity.Identification }
         *     
         */
        public AeStudentType.Identity.Identification getIdentification() {
            return identification;
        }

        /**
         * Sets the value of the identification property.
         * 
         * @param value
         *     allowed object is
         *     {@link AeStudentType.Identity.Identification }
         *     
         */
        public void setIdentification(AeStudentType.Identity.Identification value) {
            this.identification = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="idVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "studentId",
            "studentIdSystem",
            "socialSecurityNumber",
            "idVerification"
        })
        public static class Identification {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String studentId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String studentIdSystem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String socialSecurityNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String idVerification;

            /**
             * Gets the value of the studentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentId() {
                return studentId;
            }

            /**
             * Sets the value of the studentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentId(String value) {
                this.studentId = value;
            }

            /**
             * Gets the value of the studentIdSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentIdSystem() {
                return studentIdSystem;
            }

            /**
             * Sets the value of the studentIdSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentIdSystem(String value) {
                this.studentIdSystem = value;
            }

            /**
             * Gets the value of the socialSecurityNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSocialSecurityNumber() {
                return socialSecurityNumber;
            }

            /**
             * Sets the value of the socialSecurityNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSocialSecurityNumber(String value) {
                this.socialSecurityNumber = value;
            }

            /**
             * Gets the value of the idVerification property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdVerification() {
                return idVerification;
            }

            /**
             * Sets the value of the idVerification property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdVerification(String value) {
                this.idVerification = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "firstName",
            "middleName",
            "lastName",
            "suffix",
            "prefix"
        })
        public static class Name {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String firstName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String middleName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String lastName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String suffix;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String prefix;

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the middleName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMiddleName() {
                return middleName;
            }

            /**
             * Sets the value of the middleName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMiddleName(String value) {
                this.middleName = value;
            }

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the suffix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuffix() {
                return suffix;
            }

            /**
             * Sets the value of the suffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuffix(String value) {
                this.suffix = value;
            }

            /**
             * Gets the value of the prefix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrefix() {
                return prefix;
            }

            /**
             * Sets the value of the prefix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrefix(String value) {
                this.prefix = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "otherName"
        })
        public static class OtherNameList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<AeStudentType.Identity.OtherNameList.OtherName> otherName;

            /**
             * Gets the value of the otherName property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otherName property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtherName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AeStudentType.Identity.OtherNameList.OtherName }
             * 
             * 
             */
            public List<AeStudentType.Identity.OtherNameList.OtherName> getOtherName() {
                if (otherName == null) {
                    otherName = new ArrayList<AeStudentType.Identity.OtherNameList.OtherName>();
                }
                return this.otherName;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "otherFirstName",
                "otherLastName",
                "otherMiddleName",
                "otherName"
            })
            public static class OtherName {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherFirstName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherLastName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherMiddleName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherName;
                @XmlAttribute(name = "otherNameType")
                protected String otherNameType;

                /**
                 * Gets the value of the otherFirstName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherFirstName() {
                    return otherFirstName;
                }

                /**
                 * Sets the value of the otherFirstName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherFirstName(String value) {
                    this.otherFirstName = value;
                }

                /**
                 * Gets the value of the otherLastName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherLastName() {
                    return otherLastName;
                }

                /**
                 * Sets the value of the otherLastName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherLastName(String value) {
                    this.otherLastName = value;
                }

                /**
                 * Gets the value of the otherMiddleName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherMiddleName() {
                    return otherMiddleName;
                }

                /**
                 * Sets the value of the otherMiddleName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherMiddleName(String value) {
                    this.otherMiddleName = value;
                }

                /**
                 * Gets the value of the otherName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherName() {
                    return otherName;
                }

                /**
                 * Sets the value of the otherName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherName(String value) {
                    this.otherName = value;
                }

                /**
                 * Gets the value of the otherNameType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherNameType() {
                    return otherNameType;
                }

                /**
                 * Sets the value of the otherNameType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherNameType(String value) {
                    this.otherNameType = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="displacedHomemakerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="disabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dislocatedWorkerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lowIncomeStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="publicAssistanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ruralResidencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="singleParentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "displacedHomemakerIndicator",
        "disabilityStatus",
        "dislocatedWorkerStatus",
        "ideaIndicator",
        "lowIncomeStatus",
        "publicAssistanceStatus",
        "ruralResidencyStatus",
        "singleParentStatus"
    })
    public static class Status {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String displacedHomemakerIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String disabilityStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String dislocatedWorkerStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String lowIncomeStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String publicAssistanceStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ruralResidencyStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String singleParentStatus;

        /**
         * Gets the value of the displacedHomemakerIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplacedHomemakerIndicator() {
            return displacedHomemakerIndicator;
        }

        /**
         * Sets the value of the displacedHomemakerIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplacedHomemakerIndicator(String value) {
            this.displacedHomemakerIndicator = value;
        }

        /**
         * Gets the value of the disabilityStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisabilityStatus() {
            return disabilityStatus;
        }

        /**
         * Sets the value of the disabilityStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisabilityStatus(String value) {
            this.disabilityStatus = value;
        }

        /**
         * Gets the value of the dislocatedWorkerStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDislocatedWorkerStatus() {
            return dislocatedWorkerStatus;
        }

        /**
         * Sets the value of the dislocatedWorkerStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDislocatedWorkerStatus(String value) {
            this.dislocatedWorkerStatus = value;
        }

        /**
         * Gets the value of the ideaIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaIndicator() {
            return ideaIndicator;
        }

        /**
         * Sets the value of the ideaIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaIndicator(String value) {
            this.ideaIndicator = value;
        }

        /**
         * Gets the value of the lowIncomeStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLowIncomeStatus() {
            return lowIncomeStatus;
        }

        /**
         * Sets the value of the lowIncomeStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLowIncomeStatus(String value) {
            this.lowIncomeStatus = value;
        }

        /**
         * Gets the value of the publicAssistanceStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPublicAssistanceStatus() {
            return publicAssistanceStatus;
        }

        /**
         * Sets the value of the publicAssistanceStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPublicAssistanceStatus(String value) {
            this.publicAssistanceStatus = value;
        }

        /**
         * Gets the value of the ruralResidencyStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuralResidencyStatus() {
            return ruralResidencyStatus;
        }

        /**
         * Sets the value of the ruralResidencyStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuralResidencyStatus(String value) {
            this.ruralResidencyStatus = value;
        }

        /**
         * Gets the value of the singleParentStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleParentStatus() {
            return singleParentStatus;
        }

        /**
         * Sets the value of the singleParentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleParentStatus(String value) {
            this.singleParentStatus = value;
        }

    }

}
