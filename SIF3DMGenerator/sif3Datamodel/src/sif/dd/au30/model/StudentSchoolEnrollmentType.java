
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentSchoolEnrollmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSchoolEnrollmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="MembershipType" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSchoolEnrollmentTypeType" minOccurs="0"/>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="TimeFrame" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsEnrollmentTimeFrameType" minOccurs="0"/>
 *         &lt;element name="SchoolYear" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolYearType" minOccurs="0"/>
 *         &lt;element name="IntendedEntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EntryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EntryType" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentEntryContainerType" minOccurs="0"/>
 *         &lt;element name="YearLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType" minOccurs="0"/>
 *         &lt;element name="Homeroom" type="{http://www.sifassociation.org/datamodel/au/3.4}HomeroomType" minOccurs="0"/>
 *         &lt;element name="Advisor" type="{http://www.sifassociation.org/datamodel/au/3.4}StaffRefIdType" minOccurs="0"/>
 *         &lt;element name="Counselor" type="{http://www.sifassociation.org/datamodel/au/3.4}StaffRefIdType" minOccurs="0"/>
 *         &lt;element name="Homegroup" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ACARASchoolId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="ClassCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TestLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelType" minOccurs="0"/>
 *         &lt;element name="ReportingSchool" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="House" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="IndividualLearningPlan" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="Calendar" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4>IdRefTypeOrEmpty">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="CalendarSummary"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExitStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentExitStatusContainerType" minOccurs="0"/>
 *         &lt;element name="ExitType" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentExitContainerType" minOccurs="0"/>
 *         &lt;element name="FTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FTPTStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsFTPTStatusCodeType" minOccurs="0"/>
 *         &lt;element name="FFPOS" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsFFPOSStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CatchmentStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}CatchmentStatusContainerType" minOccurs="0"/>
 *         &lt;element name="RecordClosureReason" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="SchoolExit"/>
 *               &lt;enumeration value="TimeDependentDataChange"/>
 *               &lt;enumeration value="EndOfYear"/>
 *               &lt;enumeration value="CampusExit"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PromotionInfo" type="{http://www.sifassociation.org/datamodel/au/3.4}PromotionInfoType" minOccurs="0"/>
 *         &lt;element name="PreviousSchool" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="PreviousSchoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DestinationSchool" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="DestinationSchoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="StudentSubjectChoiceList" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentSubjectChoiceListType" minOccurs="0"/>
 *         &lt;element name="StartedAtSchoolDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StudentGroupList" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentGroupListType" minOccurs="0"/>
 *         &lt;element name="PublishingPermissionList" type="{http://www.sifassociation.org/datamodel/au/3.4}PublishingPermissionListType" minOccurs="0"/>
 *         &lt;element name="DisabilityLevelOfAdjustment" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="QDTP"/>
 *               &lt;enumeration value="Supplementary"/>
 *               &lt;enumeration value="Substantial"/>
 *               &lt;enumeration value="Extensive"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisabilityCategory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="Physical"/>
 *               &lt;enumeration value="Cognitive"/>
 *               &lt;enumeration value="Social-Emotional"/>
 *               &lt;enumeration value="Sensory"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CensusAge" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="DistanceEducationStudent" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="BoardingStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsBoardingType" minOccurs="0"/>
 *         &lt;element name="InternationalStudent" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="TravelDetails" type="{http://www.sifassociation.org/datamodel/au/3.4}TravelDetailsContainerType" minOccurs="0"/>
 *         &lt;element name="LocalCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalCodeListType" minOccurs="0"/>
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
@XmlType(name = "StudentSchoolEnrollmentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentPersonalRefId",
    "schoolInfoRefId",
    "membershipType",
    "localId",
    "timeFrame",
    "schoolYear",
    "intendedEntryDate",
    "entryDate",
    "entryType",
    "yearLevel",
    "homeroom",
    "advisor",
    "counselor",
    "homegroup",
    "acaraSchoolId",
    "classCode",
    "testLevel",
    "reportingSchool",
    "house",
    "individualLearningPlan",
    "calendar",
    "exitDate",
    "exitStatus",
    "exitType",
    "fte",
    "ftptStatus",
    "ffpos",
    "catchmentStatus",
    "recordClosureReason",
    "promotionInfo",
    "previousSchool",
    "previousSchoolName",
    "destinationSchool",
    "destinationSchoolName",
    "studentSubjectChoiceList",
    "startedAtSchoolDate",
    "studentGroupList",
    "publishingPermissionList",
    "disabilityLevelOfAdjustment",
    "disabilityCategory",
    "censusAge",
    "distanceEducationStudent",
    "boardingStatus",
    "internationalStudent",
    "travelDetails",
    "localCodeList",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentSchoolEnrollmentType {

    @XmlElement(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(name = "MembershipType", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String membershipType;
    @XmlElementRef(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localId;
    @XmlElement(name = "TimeFrame", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsEnrollmentTimeFrameType timeFrame;
    @XmlElement(name = "SchoolYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected XMLGregorianCalendar schoolYear;
    @XmlElementRef(name = "IntendedEntryDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> intendedEntryDate;
    @XmlElement(name = "EntryDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar entryDate;
    @XmlElementRef(name = "EntryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentEntryContainerType> entryType;
    @XmlElementRef(name = "YearLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<YearLevelType> yearLevel;
    @XmlElementRef(name = "Homeroom", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<HomeroomType> homeroom;
    @XmlElementRef(name = "Advisor", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StaffRefIdType> advisor;
    @XmlElementRef(name = "Counselor", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StaffRefIdType> counselor;
    @XmlElementRef(name = "Homegroup", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homegroup;
    @XmlElementRef(name = "ACARASchoolId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acaraSchoolId;
    @XmlElementRef(name = "ClassCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classCode;
    @XmlElementRef(name = "TestLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<YearLevelType> testLevel;
    @XmlElementRef(name = "ReportingSchool", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> reportingSchool;
    @XmlElementRef(name = "House", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> house;
    @XmlElementRef(name = "IndividualLearningPlan", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> individualLearningPlan;
    @XmlElementRef(name = "Calendar", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentSchoolEnrollmentType.Calendar> calendar;
    @XmlElementRef(name = "ExitDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> exitDate;
    @XmlElementRef(name = "ExitStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentExitStatusContainerType> exitStatus;
    @XmlElementRef(name = "ExitType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentExitContainerType> exitType;
    @XmlElementRef(name = "FTE", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> fte;
    @XmlElementRef(name = "FTPTStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ftptStatus;
    @XmlElementRef(name = "FFPOS", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ffpos;
    @XmlElementRef(name = "CatchmentStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<CatchmentStatusContainerType> catchmentStatus;
    @XmlElementRef(name = "RecordClosureReason", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recordClosureReason;
    @XmlElementRef(name = "PromotionInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<PromotionInfoType> promotionInfo;
    @XmlElementRef(name = "PreviousSchool", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousSchool;
    @XmlElementRef(name = "PreviousSchoolName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> previousSchoolName;
    @XmlElementRef(name = "DestinationSchool", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationSchool;
    @XmlElementRef(name = "DestinationSchoolName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> destinationSchoolName;
    @XmlElementRef(name = "StudentSubjectChoiceList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentSubjectChoiceListType> studentSubjectChoiceList;
    @XmlElementRef(name = "StartedAtSchoolDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startedAtSchoolDate;
    @XmlElementRef(name = "StudentGroupList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentGroupListType> studentGroupList;
    @XmlElementRef(name = "PublishingPermissionList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<PublishingPermissionListType> publishingPermissionList;
    @XmlElementRef(name = "DisabilityLevelOfAdjustment", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disabilityLevelOfAdjustment;
    @XmlElementRef(name = "DisabilityCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disabilityCategory;
    @XmlElementRef(name = "CensusAge", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> censusAge;
    @XmlElementRef(name = "DistanceEducationStudent", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> distanceEducationStudent;
    @XmlElementRef(name = "BoardingStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsBoardingType> boardingStatus;
    @XmlElementRef(name = "InternationalStudent", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> internationalStudent;
    @XmlElementRef(name = "TravelDetails", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<TravelDetailsContainerType> travelDetails;
    @XmlElementRef(name = "LocalCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalCodeListType> localCodeList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the membershipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipType() {
        return membershipType;
    }

    /**
     * Sets the value of the membershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipType(String value) {
        this.membershipType = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalId(JAXBElement<String> value) {
        this.localId = value;
    }

    /**
     * Gets the value of the timeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsEnrollmentTimeFrameType }
     *     
     */
    public AUCodeSetsEnrollmentTimeFrameType getTimeFrame() {
        return timeFrame;
    }

    /**
     * Sets the value of the timeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsEnrollmentTimeFrameType }
     *     
     */
    public void setTimeFrame(AUCodeSetsEnrollmentTimeFrameType value) {
        this.timeFrame = value;
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
     * Gets the value of the intendedEntryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIntendedEntryDate() {
        return intendedEntryDate;
    }

    /**
     * Sets the value of the intendedEntryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIntendedEntryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.intendedEntryDate = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryDate(XMLGregorianCalendar value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the entryType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentEntryContainerType }{@code >}
     *     
     */
    public JAXBElement<StudentEntryContainerType> getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentEntryContainerType }{@code >}
     *     
     */
    public void setEntryType(JAXBElement<StudentEntryContainerType> value) {
        this.entryType = value;
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
     * Gets the value of the homeroom property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HomeroomType }{@code >}
     *     
     */
    public JAXBElement<HomeroomType> getHomeroom() {
        return homeroom;
    }

    /**
     * Sets the value of the homeroom property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HomeroomType }{@code >}
     *     
     */
    public void setHomeroom(JAXBElement<HomeroomType> value) {
        this.homeroom = value;
    }

    /**
     * Gets the value of the advisor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StaffRefIdType }{@code >}
     *     
     */
    public JAXBElement<StaffRefIdType> getAdvisor() {
        return advisor;
    }

    /**
     * Sets the value of the advisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StaffRefIdType }{@code >}
     *     
     */
    public void setAdvisor(JAXBElement<StaffRefIdType> value) {
        this.advisor = value;
    }

    /**
     * Gets the value of the counselor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StaffRefIdType }{@code >}
     *     
     */
    public JAXBElement<StaffRefIdType> getCounselor() {
        return counselor;
    }

    /**
     * Sets the value of the counselor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StaffRefIdType }{@code >}
     *     
     */
    public void setCounselor(JAXBElement<StaffRefIdType> value) {
        this.counselor = value;
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
     * Gets the value of the acaraSchoolId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACARASchoolId() {
        return acaraSchoolId;
    }

    /**
     * Sets the value of the acaraSchoolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACARASchoolId(JAXBElement<String> value) {
        this.acaraSchoolId = value;
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
     * Gets the value of the reportingSchool property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getReportingSchool() {
        return reportingSchool;
    }

    /**
     * Sets the value of the reportingSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setReportingSchool(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.reportingSchool = value;
    }

    /**
     * Gets the value of the house property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouse() {
        return house;
    }

    /**
     * Sets the value of the house property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouse(JAXBElement<String> value) {
        this.house = value;
    }

    /**
     * Gets the value of the individualLearningPlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getIndividualLearningPlan() {
        return individualLearningPlan;
    }

    /**
     * Sets the value of the individualLearningPlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setIndividualLearningPlan(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.individualLearningPlan = value;
    }

    /**
     * Gets the value of the calendar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentSchoolEnrollmentType.Calendar }{@code >}
     *     
     */
    public JAXBElement<StudentSchoolEnrollmentType.Calendar> getCalendar() {
        return calendar;
    }

    /**
     * Sets the value of the calendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentSchoolEnrollmentType.Calendar }{@code >}
     *     
     */
    public void setCalendar(JAXBElement<StudentSchoolEnrollmentType.Calendar> value) {
        this.calendar = value;
    }

    /**
     * Gets the value of the exitDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getExitDate() {
        return exitDate;
    }

    /**
     * Sets the value of the exitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setExitDate(JAXBElement<XMLGregorianCalendar> value) {
        this.exitDate = value;
    }

    /**
     * Gets the value of the exitStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentExitStatusContainerType }{@code >}
     *     
     */
    public JAXBElement<StudentExitStatusContainerType> getExitStatus() {
        return exitStatus;
    }

    /**
     * Sets the value of the exitStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentExitStatusContainerType }{@code >}
     *     
     */
    public void setExitStatus(JAXBElement<StudentExitStatusContainerType> value) {
        this.exitStatus = value;
    }

    /**
     * Gets the value of the exitType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentExitContainerType }{@code >}
     *     
     */
    public JAXBElement<StudentExitContainerType> getExitType() {
        return exitType;
    }

    /**
     * Sets the value of the exitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentExitContainerType }{@code >}
     *     
     */
    public void setExitType(JAXBElement<StudentExitContainerType> value) {
        this.exitType = value;
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
     * Gets the value of the ftptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFTPTStatus() {
        return ftptStatus;
    }

    /**
     * Sets the value of the ftptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFTPTStatus(JAXBElement<String> value) {
        this.ftptStatus = value;
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
     * Gets the value of the catchmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CatchmentStatusContainerType }{@code >}
     *     
     */
    public JAXBElement<CatchmentStatusContainerType> getCatchmentStatus() {
        return catchmentStatus;
    }

    /**
     * Sets the value of the catchmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CatchmentStatusContainerType }{@code >}
     *     
     */
    public void setCatchmentStatus(JAXBElement<CatchmentStatusContainerType> value) {
        this.catchmentStatus = value;
    }

    /**
     * Gets the value of the recordClosureReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecordClosureReason() {
        return recordClosureReason;
    }

    /**
     * Sets the value of the recordClosureReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecordClosureReason(JAXBElement<String> value) {
        this.recordClosureReason = value;
    }

    /**
     * Gets the value of the promotionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PromotionInfoType }{@code >}
     *     
     */
    public JAXBElement<PromotionInfoType> getPromotionInfo() {
        return promotionInfo;
    }

    /**
     * Sets the value of the promotionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PromotionInfoType }{@code >}
     *     
     */
    public void setPromotionInfo(JAXBElement<PromotionInfoType> value) {
        this.promotionInfo = value;
    }

    /**
     * Gets the value of the previousSchool property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousSchool() {
        return previousSchool;
    }

    /**
     * Sets the value of the previousSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousSchool(JAXBElement<String> value) {
        this.previousSchool = value;
    }

    /**
     * Gets the value of the previousSchoolName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreviousSchoolName() {
        return previousSchoolName;
    }

    /**
     * Sets the value of the previousSchoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreviousSchoolName(JAXBElement<String> value) {
        this.previousSchoolName = value;
    }

    /**
     * Gets the value of the destinationSchool property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationSchool() {
        return destinationSchool;
    }

    /**
     * Sets the value of the destinationSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationSchool(JAXBElement<String> value) {
        this.destinationSchool = value;
    }

    /**
     * Gets the value of the destinationSchoolName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDestinationSchoolName() {
        return destinationSchoolName;
    }

    /**
     * Sets the value of the destinationSchoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDestinationSchoolName(JAXBElement<String> value) {
        this.destinationSchoolName = value;
    }

    /**
     * Gets the value of the studentSubjectChoiceList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentSubjectChoiceListType }{@code >}
     *     
     */
    public JAXBElement<StudentSubjectChoiceListType> getStudentSubjectChoiceList() {
        return studentSubjectChoiceList;
    }

    /**
     * Sets the value of the studentSubjectChoiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentSubjectChoiceListType }{@code >}
     *     
     */
    public void setStudentSubjectChoiceList(JAXBElement<StudentSubjectChoiceListType> value) {
        this.studentSubjectChoiceList = value;
    }

    /**
     * Gets the value of the startedAtSchoolDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartedAtSchoolDate() {
        return startedAtSchoolDate;
    }

    /**
     * Sets the value of the startedAtSchoolDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartedAtSchoolDate(JAXBElement<XMLGregorianCalendar> value) {
        this.startedAtSchoolDate = value;
    }

    /**
     * Gets the value of the studentGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentGroupListType }{@code >}
     *     
     */
    public JAXBElement<StudentGroupListType> getStudentGroupList() {
        return studentGroupList;
    }

    /**
     * Sets the value of the studentGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentGroupListType }{@code >}
     *     
     */
    public void setStudentGroupList(JAXBElement<StudentGroupListType> value) {
        this.studentGroupList = value;
    }

    /**
     * Gets the value of the publishingPermissionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PublishingPermissionListType }{@code >}
     *     
     */
    public JAXBElement<PublishingPermissionListType> getPublishingPermissionList() {
        return publishingPermissionList;
    }

    /**
     * Sets the value of the publishingPermissionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PublishingPermissionListType }{@code >}
     *     
     */
    public void setPublishingPermissionList(JAXBElement<PublishingPermissionListType> value) {
        this.publishingPermissionList = value;
    }

    /**
     * Gets the value of the disabilityLevelOfAdjustment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisabilityLevelOfAdjustment() {
        return disabilityLevelOfAdjustment;
    }

    /**
     * Sets the value of the disabilityLevelOfAdjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisabilityLevelOfAdjustment(JAXBElement<String> value) {
        this.disabilityLevelOfAdjustment = value;
    }

    /**
     * Gets the value of the disabilityCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisabilityCategory() {
        return disabilityCategory;
    }

    /**
     * Sets the value of the disabilityCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisabilityCategory(JAXBElement<String> value) {
        this.disabilityCategory = value;
    }

    /**
     * Gets the value of the censusAge property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCensusAge() {
        return censusAge;
    }

    /**
     * Sets the value of the censusAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCensusAge(JAXBElement<Long> value) {
        this.censusAge = value;
    }

    /**
     * Gets the value of the distanceEducationStudent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getDistanceEducationStudent() {
        return distanceEducationStudent;
    }

    /**
     * Sets the value of the distanceEducationStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setDistanceEducationStudent(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.distanceEducationStudent = value;
    }

    /**
     * Gets the value of the boardingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsBoardingType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsBoardingType> getBoardingStatus() {
        return boardingStatus;
    }

    /**
     * Sets the value of the boardingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsBoardingType }{@code >}
     *     
     */
    public void setBoardingStatus(JAXBElement<AUCodeSetsBoardingType> value) {
        this.boardingStatus = value;
    }

    /**
     * Gets the value of the internationalStudent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getInternationalStudent() {
        return internationalStudent;
    }

    /**
     * Sets the value of the internationalStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setInternationalStudent(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.internationalStudent = value;
    }

    /**
     * Gets the value of the travelDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TravelDetailsContainerType }{@code >}
     *     
     */
    public JAXBElement<TravelDetailsContainerType> getTravelDetails() {
        return travelDetails;
    }

    /**
     * Sets the value of the travelDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TravelDetailsContainerType }{@code >}
     *     
     */
    public void setTravelDetails(JAXBElement<TravelDetailsContainerType> value) {
        this.travelDetails = value;
    }

    /**
     * Gets the value of the localCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public JAXBElement<LocalCodeListType> getLocalCodeList() {
        return localCodeList;
    }

    /**
     * Sets the value of the localCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public void setLocalCodeList(JAXBElement<LocalCodeListType> value) {
        this.localCodeList = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/au/3.4>IdRefTypeOrEmpty">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="CalendarSummary"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class Calendar {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

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
         * Gets the value of the sifRefObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIFRefObject() {
            return sifRefObject;
        }

        /**
         * Sets the value of the sifRefObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIFRefObject(String value) {
            this.sifRefObject = value;
        }

    }

}
