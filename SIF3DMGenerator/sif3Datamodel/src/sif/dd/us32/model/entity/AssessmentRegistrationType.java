
package sif.dd.us32.model.entity;

import java.util.ArrayList;
import java.util.List;
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
 * This object represents the assignment of a specific assessment to be taken by a student. A student will have multiple registrations if a given assessment is attempted more than once. This object will also track testing status information after the student has tested.
 * 
 * <p>Java class for assessmentRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentRegistrationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="studentPersonalRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="assessmentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="assessmentAdministrationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="assessmentSessionRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="assessmentFormRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="creationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="startDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="assessmentPlatform" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="daysOfInstruction" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *         &lt;element name="retestIndicator" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="testAttemptIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="studentSpecialEventList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="studentSpecialEvent" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                           &lt;attribute name="eventType" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="testingStatusList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="testingStatus" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="testingStatusCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="testingStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="scorePublishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="studentGradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" minOccurs="0"/>
 *         &lt;element name="assessmentGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentStudentSnapshot" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *                   &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType" minOccurs="0"/>
 *                   &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/3.2}gAddressType" minOccurs="0"/>
 *                   &lt;element name="raceList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="hispanicLatino" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="gender" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType" minOccurs="0"/>
 *                   &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
 *                   &lt;element name="projectedGraduationYear" type="{http://www.sifassociation.org/datamodel/na/3.2}gPartialDateType" minOccurs="0"/>
 *                   &lt;element name="onTimeGraduationYear" type="{http://www.sifassociation.org/datamodel/na/3.2}gPartialDateType" minOccurs="0"/>
 *                   &lt;element name="graduationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="graduationAward" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="graduationOnTime" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="homeEnrollment" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="studentSchoolEnrollmentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *                             &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *                             &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
 *                             &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType" minOccurs="0"/>
 *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" minOccurs="0"/>
 *                             &lt;element name="homeroom" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="roomRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *                                       &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="fullYearEnrollment" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="idea" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="migrant" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="title1" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="giftedTalented" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="economicDisadvantage" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="ell" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="homeless" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="section504" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="vocationalConcentrator" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="immigrant" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="freeAndReducedStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                   &lt;element name="neglectedDelinquent" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="leaRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="staffPersonRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="sectionRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentRegistrationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "studentPersonalRefId",
    "assessmentRefId",
    "assessmentAdministrationRefId",
    "assessmentSessionRefId",
    "assessmentFormRefId",
    "creationDateTime",
    "startDateTime",
    "endDateTime",
    "assessmentPlatform",
    "daysOfInstruction",
    "retestIndicator",
    "testAttemptIdentifier",
    "studentSpecialEventList",
    "testingStatusList",
    "scorePublishDate",
    "studentGradeLevel",
    "assessmentGradeLevel",
    "assessmentStudentSnapshot",
    "leaRefId",
    "schoolRefId",
    "staffPersonRefId",
    "sectionRefId"
})
public class AssessmentRegistrationType
    extends GOtherSIFType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentAdministrationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentSessionRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentFormRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String assessmentPlatform;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "unsignedShort")
    protected Integer daysOfInstruction;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType retestIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String testAttemptIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentRegistrationType.StudentSpecialEventList studentSpecialEventList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentRegistrationType.TestingStatusList testingStatusList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scorePublishDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYearGroupType studentGradeLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentGradeLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentRegistrationType.AssessmentStudentSnapshot assessmentStudentSnapshot;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String staffPersonRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sectionRefId;

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the assessmentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentRefId() {
        return assessmentRefId;
    }

    /**
     * Sets the value of the assessmentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentRefId(String value) {
        this.assessmentRefId = value;
    }

    /**
     * Gets the value of the assessmentAdministrationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentAdministrationRefId() {
        return assessmentAdministrationRefId;
    }

    /**
     * Sets the value of the assessmentAdministrationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentAdministrationRefId(String value) {
        this.assessmentAdministrationRefId = value;
    }

    /**
     * Gets the value of the assessmentSessionRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentSessionRefId() {
        return assessmentSessionRefId;
    }

    /**
     * Sets the value of the assessmentSessionRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentSessionRefId(String value) {
        this.assessmentSessionRefId = value;
    }

    /**
     * Gets the value of the assessmentFormRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentFormRefId() {
        return assessmentFormRefId;
    }

    /**
     * Sets the value of the assessmentFormRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentFormRefId(String value) {
        this.assessmentFormRefId = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the startDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDateTime() {
        return startDateTime;
    }

    /**
     * Sets the value of the startDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDateTime(XMLGregorianCalendar value) {
        this.startDateTime = value;
    }

    /**
     * Gets the value of the endDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateTime() {
        return endDateTime;
    }

    /**
     * Sets the value of the endDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateTime(XMLGregorianCalendar value) {
        this.endDateTime = value;
    }

    /**
     * Gets the value of the assessmentPlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentPlatform() {
        return assessmentPlatform;
    }

    /**
     * Sets the value of the assessmentPlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentPlatform(String value) {
        this.assessmentPlatform = value;
    }

    /**
     * Gets the value of the daysOfInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysOfInstruction() {
        return daysOfInstruction;
    }

    /**
     * Sets the value of the daysOfInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysOfInstruction(Integer value) {
        this.daysOfInstruction = value;
    }

    /**
     * Gets the value of the retestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getRetestIndicator() {
        return retestIndicator;
    }

    /**
     * Sets the value of the retestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setRetestIndicator(GYesNoUnknownType value) {
        this.retestIndicator = value;
    }

    /**
     * Gets the value of the testAttemptIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestAttemptIdentifier() {
        return testAttemptIdentifier;
    }

    /**
     * Sets the value of the testAttemptIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestAttemptIdentifier(String value) {
        this.testAttemptIdentifier = value;
    }

    /**
     * Gets the value of the studentSpecialEventList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentRegistrationType.StudentSpecialEventList }
     *     
     */
    public AssessmentRegistrationType.StudentSpecialEventList getStudentSpecialEventList() {
        return studentSpecialEventList;
    }

    /**
     * Sets the value of the studentSpecialEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentRegistrationType.StudentSpecialEventList }
     *     
     */
    public void setStudentSpecialEventList(AssessmentRegistrationType.StudentSpecialEventList value) {
        this.studentSpecialEventList = value;
    }

    /**
     * Gets the value of the testingStatusList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentRegistrationType.TestingStatusList }
     *     
     */
    public AssessmentRegistrationType.TestingStatusList getTestingStatusList() {
        return testingStatusList;
    }

    /**
     * Sets the value of the testingStatusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentRegistrationType.TestingStatusList }
     *     
     */
    public void setTestingStatusList(AssessmentRegistrationType.TestingStatusList value) {
        this.testingStatusList = value;
    }

    /**
     * Gets the value of the scorePublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScorePublishDate() {
        return scorePublishDate;
    }

    /**
     * Sets the value of the scorePublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScorePublishDate(XMLGregorianCalendar value) {
        this.scorePublishDate = value;
    }

    /**
     * Gets the value of the studentGradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GYearGroupType }
     *     
     */
    public GYearGroupType getStudentGradeLevel() {
        return studentGradeLevel;
    }

    /**
     * Sets the value of the studentGradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYearGroupType }
     *     
     */
    public void setStudentGradeLevel(GYearGroupType value) {
        this.studentGradeLevel = value;
    }

    /**
     * Gets the value of the assessmentGradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentGradeLevel() {
        return assessmentGradeLevel;
    }

    /**
     * Sets the value of the assessmentGradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentGradeLevel(String value) {
        this.assessmentGradeLevel = value;
    }

    /**
     * Gets the value of the assessmentStudentSnapshot property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentRegistrationType.AssessmentStudentSnapshot }
     *     
     */
    public AssessmentRegistrationType.AssessmentStudentSnapshot getAssessmentStudentSnapshot() {
        return assessmentStudentSnapshot;
    }

    /**
     * Sets the value of the assessmentStudentSnapshot property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentRegistrationType.AssessmentStudentSnapshot }
     *     
     */
    public void setAssessmentStudentSnapshot(AssessmentRegistrationType.AssessmentStudentSnapshot value) {
        this.assessmentStudentSnapshot = value;
    }

    /**
     * Gets the value of the leaRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaRefId() {
        return leaRefId;
    }

    /**
     * Sets the value of the leaRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaRefId(String value) {
        this.leaRefId = value;
    }

    /**
     * Gets the value of the schoolRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolRefId() {
        return schoolRefId;
    }

    /**
     * Sets the value of the schoolRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolRefId(String value) {
        this.schoolRefId = value;
    }

    /**
     * Gets the value of the staffPersonRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStaffPersonRefId() {
        return staffPersonRefId;
    }

    /**
     * Sets the value of the staffPersonRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStaffPersonRefId(String value) {
        this.staffPersonRefId = value;
    }

    /**
     * Gets the value of the sectionRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionRefId() {
        return sectionRefId;
    }

    /**
     * Sets the value of the sectionRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionRefId(String value) {
        this.sectionRefId = value;
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
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
     *         &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType" minOccurs="0"/>
     *         &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/3.2}gAddressType" minOccurs="0"/>
     *         &lt;element name="raceList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="hispanicLatino" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="gender" type="{http://www.sifassociation.org/datamodel/na/3.2}gSexusType" minOccurs="0"/>
     *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0"/>
     *         &lt;element name="projectedGraduationYear" type="{http://www.sifassociation.org/datamodel/na/3.2}gPartialDateType" minOccurs="0"/>
     *         &lt;element name="onTimeGraduationYear" type="{http://www.sifassociation.org/datamodel/na/3.2}gPartialDateType" minOccurs="0"/>
     *         &lt;element name="graduationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="graduationAward" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="graduationOnTime" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="homeEnrollment" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="studentSchoolEnrollmentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
     *                   &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
     *                   &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
     *                   &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType" minOccurs="0"/>
     *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" minOccurs="0"/>
     *                   &lt;element name="homeroom" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="roomRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
     *                             &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="fullYearEnrollment" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="idea" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="migrant" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="title1" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="giftedTalented" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="economicDisadvantage" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="ell" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="homeless" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="section504" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="vocationalConcentrator" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="immigrant" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="freeAndReducedStatus" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *         &lt;element name="neglectedDelinquent" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
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
        "localId",
        "stateProvinceId",
        "address",
        "raceList",
        "hispanicLatino",
        "gender",
        "birthDate",
        "age",
        "projectedGraduationYear",
        "onTimeGraduationYear",
        "graduationDate",
        "graduationAward",
        "graduationOnTime",
        "homeEnrollment",
        "idea",
        "migrant",
        "title1",
        "giftedTalented",
        "economicDisadvantage",
        "ell",
        "homeless",
        "section504",
        "vocationalConcentrator",
        "immigrant",
        "freeAndReducedStatus",
        "neglectedDelinquent"
    })
    public static class AssessmentStudentSnapshot {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GLocalIdType localId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GExternalIdType stateProvinceId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GAddressType address;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected AssessmentRegistrationType.AssessmentStudentSnapshot.RaceList raceList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType hispanicLatino;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GSexusType gender;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlSchemaType(name = "unsignedShort")
        protected Integer age;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String projectedGraduationYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String onTimeGraduationYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar graduationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String graduationAward;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType graduationOnTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment homeEnrollment;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType idea;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType migrant;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType title1;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType giftedTalented;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType economicDisadvantage;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType ell;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType homeless;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType section504;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType vocationalConcentrator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType immigrant;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType freeAndReducedStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GYesNoUnknownType neglectedDelinquent;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the localId property.
         * 
         * @return
         *     possible object is
         *     {@link GLocalIdType }
         *     
         */
        public GLocalIdType getLocalId() {
            return localId;
        }

        /**
         * Sets the value of the localId property.
         * 
         * @param value
         *     allowed object is
         *     {@link GLocalIdType }
         *     
         */
        public void setLocalId(GLocalIdType value) {
            this.localId = value;
        }

        /**
         * Gets the value of the stateProvinceId property.
         * 
         * @return
         *     possible object is
         *     {@link GExternalIdType }
         *     
         */
        public GExternalIdType getStateProvinceId() {
            return stateProvinceId;
        }

        /**
         * Sets the value of the stateProvinceId property.
         * 
         * @param value
         *     allowed object is
         *     {@link GExternalIdType }
         *     
         */
        public void setStateProvinceId(GExternalIdType value) {
            this.stateProvinceId = value;
        }

        /**
         * Gets the value of the address property.
         * 
         * @return
         *     possible object is
         *     {@link GAddressType }
         *     
         */
        public GAddressType getAddress() {
            return address;
        }

        /**
         * Sets the value of the address property.
         * 
         * @param value
         *     allowed object is
         *     {@link GAddressType }
         *     
         */
        public void setAddress(GAddressType value) {
            this.address = value;
        }

        /**
         * Gets the value of the raceList property.
         * 
         * @return
         *     possible object is
         *     {@link AssessmentRegistrationType.AssessmentStudentSnapshot.RaceList }
         *     
         */
        public AssessmentRegistrationType.AssessmentStudentSnapshot.RaceList getRaceList() {
            return raceList;
        }

        /**
         * Sets the value of the raceList property.
         * 
         * @param value
         *     allowed object is
         *     {@link AssessmentRegistrationType.AssessmentStudentSnapshot.RaceList }
         *     
         */
        public void setRaceList(AssessmentRegistrationType.AssessmentStudentSnapshot.RaceList value) {
            this.raceList = value;
        }

        /**
         * Gets the value of the hispanicLatino property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getHispanicLatino() {
            return hispanicLatino;
        }

        /**
         * Sets the value of the hispanicLatino property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setHispanicLatino(GYesNoUnknownType value) {
            this.hispanicLatino = value;
        }

        /**
         * Gets the value of the gender property.
         * 
         * @return
         *     possible object is
         *     {@link GSexusType }
         *     
         */
        public GSexusType getGender() {
            return gender;
        }

        /**
         * Sets the value of the gender property.
         * 
         * @param value
         *     allowed object is
         *     {@link GSexusType }
         *     
         */
        public void setGender(GSexusType value) {
            this.gender = value;
        }

        /**
         * Gets the value of the birthDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * Sets the value of the birthDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
        }

        /**
         * Gets the value of the age property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAge() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAge(Integer value) {
            this.age = value;
        }

        /**
         * Gets the value of the projectedGraduationYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProjectedGraduationYear() {
            return projectedGraduationYear;
        }

        /**
         * Sets the value of the projectedGraduationYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProjectedGraduationYear(String value) {
            this.projectedGraduationYear = value;
        }

        /**
         * Gets the value of the onTimeGraduationYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOnTimeGraduationYear() {
            return onTimeGraduationYear;
        }

        /**
         * Sets the value of the onTimeGraduationYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOnTimeGraduationYear(String value) {
            this.onTimeGraduationYear = value;
        }

        /**
         * Gets the value of the graduationDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getGraduationDate() {
            return graduationDate;
        }

        /**
         * Sets the value of the graduationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setGraduationDate(XMLGregorianCalendar value) {
            this.graduationDate = value;
        }

        /**
         * Gets the value of the graduationAward property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGraduationAward() {
            return graduationAward;
        }

        /**
         * Sets the value of the graduationAward property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGraduationAward(String value) {
            this.graduationAward = value;
        }

        /**
         * Gets the value of the graduationOnTime property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getGraduationOnTime() {
            return graduationOnTime;
        }

        /**
         * Sets the value of the graduationOnTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setGraduationOnTime(GYesNoUnknownType value) {
            this.graduationOnTime = value;
        }

        /**
         * Gets the value of the homeEnrollment property.
         * 
         * @return
         *     possible object is
         *     {@link AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment }
         *     
         */
        public AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment getHomeEnrollment() {
            return homeEnrollment;
        }

        /**
         * Sets the value of the homeEnrollment property.
         * 
         * @param value
         *     allowed object is
         *     {@link AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment }
         *     
         */
        public void setHomeEnrollment(AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment value) {
            this.homeEnrollment = value;
        }

        /**
         * Gets the value of the idea property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getIdea() {
            return idea;
        }

        /**
         * Sets the value of the idea property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setIdea(GYesNoUnknownType value) {
            this.idea = value;
        }

        /**
         * Gets the value of the migrant property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getMigrant() {
            return migrant;
        }

        /**
         * Sets the value of the migrant property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setMigrant(GYesNoUnknownType value) {
            this.migrant = value;
        }

        /**
         * Gets the value of the title1 property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getTitle1() {
            return title1;
        }

        /**
         * Sets the value of the title1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setTitle1(GYesNoUnknownType value) {
            this.title1 = value;
        }

        /**
         * Gets the value of the giftedTalented property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getGiftedTalented() {
            return giftedTalented;
        }

        /**
         * Sets the value of the giftedTalented property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setGiftedTalented(GYesNoUnknownType value) {
            this.giftedTalented = value;
        }

        /**
         * Gets the value of the economicDisadvantage property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getEconomicDisadvantage() {
            return economicDisadvantage;
        }

        /**
         * Sets the value of the economicDisadvantage property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setEconomicDisadvantage(GYesNoUnknownType value) {
            this.economicDisadvantage = value;
        }

        /**
         * Gets the value of the ell property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getEll() {
            return ell;
        }

        /**
         * Sets the value of the ell property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setEll(GYesNoUnknownType value) {
            this.ell = value;
        }

        /**
         * Gets the value of the homeless property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getHomeless() {
            return homeless;
        }

        /**
         * Sets the value of the homeless property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setHomeless(GYesNoUnknownType value) {
            this.homeless = value;
        }

        /**
         * Gets the value of the section504 property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getSection504() {
            return section504;
        }

        /**
         * Sets the value of the section504 property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setSection504(GYesNoUnknownType value) {
            this.section504 = value;
        }

        /**
         * Gets the value of the vocationalConcentrator property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getVocationalConcentrator() {
            return vocationalConcentrator;
        }

        /**
         * Sets the value of the vocationalConcentrator property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setVocationalConcentrator(GYesNoUnknownType value) {
            this.vocationalConcentrator = value;
        }

        /**
         * Gets the value of the immigrant property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getImmigrant() {
            return immigrant;
        }

        /**
         * Sets the value of the immigrant property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setImmigrant(GYesNoUnknownType value) {
            this.immigrant = value;
        }

        /**
         * Gets the value of the freeAndReducedStatus property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getFreeAndReducedStatus() {
            return freeAndReducedStatus;
        }

        /**
         * Sets the value of the freeAndReducedStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setFreeAndReducedStatus(GYesNoUnknownType value) {
            this.freeAndReducedStatus = value;
        }

        /**
         * Gets the value of the neglectedDelinquent property.
         * 
         * @return
         *     possible object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public GYesNoUnknownType getNeglectedDelinquent() {
            return neglectedDelinquent;
        }

        /**
         * Sets the value of the neglectedDelinquent property.
         * 
         * @param value
         *     allowed object is
         *     {@link GYesNoUnknownType }
         *     
         */
        public void setNeglectedDelinquent(GYesNoUnknownType value) {
            this.neglectedDelinquent = value;
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
         *         &lt;element name="studentSchoolEnrollmentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
         *         &lt;element name="schoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
         *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType" minOccurs="0"/>
         *         &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType" minOccurs="0"/>
         *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="gradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" minOccurs="0"/>
         *         &lt;element name="homeroom" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="roomRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
         *                   &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="fullYearEnrollment" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
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
            "studentSchoolEnrollmentRefId",
            "schoolName",
            "schoolRefId",
            "localId",
            "stateProvinceId",
            "status",
            "gradeLevel",
            "homeroom",
            "fullYearEnrollment"
        })
        public static class HomeEnrollment {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String studentSchoolEnrollmentRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String schoolName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String schoolRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GLocalIdType localId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GExternalIdType stateProvinceId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String status;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GYearGroupType gradeLevel;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment.Homeroom homeroom;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GYesNoUnknownType fullYearEnrollment;

            /**
             * Gets the value of the studentSchoolEnrollmentRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentSchoolEnrollmentRefId() {
                return studentSchoolEnrollmentRefId;
            }

            /**
             * Sets the value of the studentSchoolEnrollmentRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentSchoolEnrollmentRefId(String value) {
                this.studentSchoolEnrollmentRefId = value;
            }

            /**
             * Gets the value of the schoolName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchoolName() {
                return schoolName;
            }

            /**
             * Sets the value of the schoolName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchoolName(String value) {
                this.schoolName = value;
            }

            /**
             * Gets the value of the schoolRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchoolRefId() {
                return schoolRefId;
            }

            /**
             * Sets the value of the schoolRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchoolRefId(String value) {
                this.schoolRefId = value;
            }

            /**
             * Gets the value of the localId property.
             * 
             * @return
             *     possible object is
             *     {@link GLocalIdType }
             *     
             */
            public GLocalIdType getLocalId() {
                return localId;
            }

            /**
             * Sets the value of the localId property.
             * 
             * @param value
             *     allowed object is
             *     {@link GLocalIdType }
             *     
             */
            public void setLocalId(GLocalIdType value) {
                this.localId = value;
            }

            /**
             * Gets the value of the stateProvinceId property.
             * 
             * @return
             *     possible object is
             *     {@link GExternalIdType }
             *     
             */
            public GExternalIdType getStateProvinceId() {
                return stateProvinceId;
            }

            /**
             * Sets the value of the stateProvinceId property.
             * 
             * @param value
             *     allowed object is
             *     {@link GExternalIdType }
             *     
             */
            public void setStateProvinceId(GExternalIdType value) {
                this.stateProvinceId = value;
            }

            /**
             * Gets the value of the status property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStatus() {
                return status;
            }

            /**
             * Sets the value of the status property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStatus(String value) {
                this.status = value;
            }

            /**
             * Gets the value of the gradeLevel property.
             * 
             * @return
             *     possible object is
             *     {@link GYearGroupType }
             *     
             */
            public GYearGroupType getGradeLevel() {
                return gradeLevel;
            }

            /**
             * Sets the value of the gradeLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYearGroupType }
             *     
             */
            public void setGradeLevel(GYearGroupType value) {
                this.gradeLevel = value;
            }

            /**
             * Gets the value of the homeroom property.
             * 
             * @return
             *     possible object is
             *     {@link AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment.Homeroom }
             *     
             */
            public AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment.Homeroom getHomeroom() {
                return homeroom;
            }

            /**
             * Sets the value of the homeroom property.
             * 
             * @param value
             *     allowed object is
             *     {@link AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment.Homeroom }
             *     
             */
            public void setHomeroom(AssessmentRegistrationType.AssessmentStudentSnapshot.HomeEnrollment.Homeroom value) {
                this.homeroom = value;
            }

            /**
             * Gets the value of the fullYearEnrollment property.
             * 
             * @return
             *     possible object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public GYesNoUnknownType getFullYearEnrollment() {
                return fullYearEnrollment;
            }

            /**
             * Sets the value of the fullYearEnrollment property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public void setFullYearEnrollment(GYesNoUnknownType value) {
                this.fullYearEnrollment = value;
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
             *         &lt;element name="roomRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
             *         &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                "roomRefId",
                "roomNumber"
            })
            public static class Homeroom {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String roomRefId;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String roomNumber;

                /**
                 * Gets the value of the roomRefId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomRefId() {
                    return roomRefId;
                }

                /**
                 * Sets the value of the roomRefId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomRefId(String value) {
                    this.roomRefId = value;
                }

                /**
                 * Gets the value of the roomNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomNumber() {
                    return roomNumber;
                }

                /**
                 * Sets the value of the roomNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomNumber(String value) {
                    this.roomNumber = value;
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
         *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
            "race"
        })
        public static class RaceList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected List<String> race;

            /**
             * Gets the value of the race property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the race property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRace().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getRace() {
                if (race == null) {
                    race = new ArrayList<String>();
                }
                return this.race;
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
     *         &lt;element name="studentSpecialEvent" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *                 &lt;attribute name="eventType" type="{http://www.w3.org/2001/XMLSchema}token" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "studentSpecialEvent"
    })
    public static class StudentSpecialEventList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentRegistrationType.StudentSpecialEventList.StudentSpecialEvent> studentSpecialEvent;

        /**
         * Gets the value of the studentSpecialEvent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the studentSpecialEvent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStudentSpecialEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentRegistrationType.StudentSpecialEventList.StudentSpecialEvent }
         * 
         * 
         */
        public List<AssessmentRegistrationType.StudentSpecialEventList.StudentSpecialEvent> getStudentSpecialEvent() {
            if (studentSpecialEvent == null) {
                studentSpecialEvent = new ArrayList<AssessmentRegistrationType.StudentSpecialEventList.StudentSpecialEvent>();
            }
            return this.studentSpecialEvent;
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
         *       &lt;attribute name="eventType" type="{http://www.w3.org/2001/XMLSchema}token" />
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
        public static class StudentSpecialEvent {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String value;
            @XmlAttribute(name = "eventType")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String eventType;

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
             * Gets the value of the eventType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEventType() {
                return eventType;
            }

            /**
             * Sets the value of the eventType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEventType(String value) {
                this.eventType = value;
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
     *         &lt;element name="testingStatus" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="testingStatusCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="testingStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "testingStatus"
    })
    public static class TestingStatusList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentRegistrationType.TestingStatusList.TestingStatus> testingStatus;

        /**
         * Gets the value of the testingStatus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the testingStatus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTestingStatus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentRegistrationType.TestingStatusList.TestingStatus }
         * 
         * 
         */
        public List<AssessmentRegistrationType.TestingStatusList.TestingStatus> getTestingStatus() {
            if (testingStatus == null) {
                testingStatus = new ArrayList<AssessmentRegistrationType.TestingStatusList.TestingStatus>();
            }
            return this.testingStatus;
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
         *         &lt;element name="testingStatusCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *         &lt;element name="testingStatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "testingStatusCode",
            "testingStatusDescription"
        })
        public static class TestingStatus {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String testingStatusCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String testingStatusDescription;

            /**
             * Gets the value of the testingStatusCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTestingStatusCode() {
                return testingStatusCode;
            }

            /**
             * Sets the value of the testingStatusCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTestingStatusCode(String value) {
                this.testingStatusCode = value;
            }

            /**
             * Gets the value of the testingStatusDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTestingStatusDescription() {
                return testingStatusDescription;
            }

            /**
             * Sets the value of the testingStatusDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTestingStatusDescription(String value) {
                this.testingStatusDescription = value;
            }

        }

    }

}
