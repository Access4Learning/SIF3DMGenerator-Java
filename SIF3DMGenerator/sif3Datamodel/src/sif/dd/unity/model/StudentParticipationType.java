
package sif.dd.unity.model;

import java.math.BigDecimal;
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
 * <p>Java class for StudentParticipationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentParticipationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentParticipationAsOfDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ProgramType" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramTypeType"/>
 *         &lt;element name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ProgramFundingSources" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramFundingSourceListType" minOccurs="0"/>
 *         &lt;element name="ManagingPublicAgency" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="LEAInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ManagingSchool" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="SchoolInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PartCTransitionMeetingNotHeldReasons" type="{http://www.sifassociation.org/datamodel/na/4.x}PartCTransitionMeetingNotHeldReasonListType" minOccurs="0"/>
 *         &lt;element name="PartCTransitionMeetingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PartCTransitionMeetingOutcomes" type="{http://www.sifassociation.org/datamodel/na/4.x}PartCTransitionMeetingOutcomeListType" minOccurs="0"/>
 *         &lt;element name="ReferralDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ReferralSource" type="{http://www.sifassociation.org/datamodel/na/4.x}ReferralSourceType" minOccurs="0"/>
 *         &lt;element name="ProgramStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramStatusType" minOccurs="0"/>
 *         &lt;element name="GiftedEligibilityCriteria" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="EvaluationParentalConsentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EvaluationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EvaluationExtensionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExtensionComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReevaluationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ExceptionalityCategories" type="{http://www.sifassociation.org/datamodel/na/4.x}ExceptionalityCategoryListType" minOccurs="0"/>
 *         &lt;element name="ProgramEligibilityDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramPlanType" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramPlanTypeType" minOccurs="0"/>
 *         &lt;element name="ProgramPlanDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramPlanEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="NOREPDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PlacementParentalConsentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramPlacementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="LeastRestrictiveEnvironment" type="{http://www.sifassociation.org/datamodel/na/4.x}LeastRestrictiveEnvironmentType" minOccurs="0"/>
 *         &lt;element name="ExtendedSchoolYear" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ExtendedDay" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProgramAvailability" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramAvailabilityType" minOccurs="0"/>
 *         &lt;element name="PrivateNotPlacedByPublic" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProgramReviewDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FBADate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="BIPDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProgramExitReason" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramExitReasonType" minOccurs="0"/>
 *         &lt;element name="ProjectedExitDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ProjectedExitReason" type="{http://www.sifassociation.org/datamodel/na/4.x}SourcedCodesetType" minOccurs="0"/>
 *         &lt;element name="PlannedAssessmentParticipation" type="{http://www.sifassociation.org/datamodel/na/4.x}SourcedCodesetType" minOccurs="0"/>
 *         &lt;element name="TransitionPlanning" type="{http://www.sifassociation.org/datamodel/na/4.x}SourcedCodesetType" minOccurs="0"/>
 *         &lt;element name="StudentSpecialEducationFTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EntryPerson" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ParticipationContact" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="AdditionalProgramAvailabilityList" type="{http://www.sifassociation.org/datamodel/na/4.x}ProgramAvailabilityListType" minOccurs="0"/>
 *         &lt;element name="CaseManager" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="StudentPersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentParticipationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentParticipationAsOfDate",
    "programType",
    "programName",
    "programFundingSources",
    "managingPublicAgency",
    "managingSchool",
    "partCTransitionMeetingNotHeldReasons",
    "partCTransitionMeetingDate",
    "partCTransitionMeetingOutcomes",
    "referralDate",
    "referralSource",
    "programStatus",
    "giftedEligibilityCriteria",
    "evaluationParentalConsentDate",
    "evaluationDate",
    "evaluationExtensionDate",
    "extensionComments",
    "reevaluationDate",
    "exceptionalityCategories",
    "programEligibilityDate",
    "programPlanType",
    "programPlanDate",
    "programPlanEffectiveDate",
    "norepDate",
    "placementParentalConsentDate",
    "programPlacementDate",
    "leastRestrictiveEnvironment",
    "extendedSchoolYear",
    "extendedDay",
    "programAvailability",
    "privateNotPlacedByPublic",
    "programReviewDate",
    "fbaDate",
    "bipDate",
    "programExitDate",
    "programExitReason",
    "projectedExitDate",
    "projectedExitReason",
    "plannedAssessmentParticipation",
    "transitionPlanning",
    "studentSpecialEducationFTE",
    "entryPerson",
    "participationContact",
    "additionalProgramAvailabilityList",
    "caseManager",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentParticipationType {

    @XmlElement(name = "StudentParticipationAsOfDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar studentParticipationAsOfDate;
    @XmlElement(name = "ProgramType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected ProgramTypeType programType;
    @XmlElement(name = "ProgramName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String programName;
    @XmlElement(name = "ProgramFundingSources", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ProgramFundingSourceListType programFundingSources;
    @XmlElement(name = "ManagingPublicAgency", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentParticipationType.ManagingPublicAgency managingPublicAgency;
    @XmlElement(name = "ManagingSchool", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentParticipationType.ManagingSchool managingSchool;
    @XmlElement(name = "PartCTransitionMeetingNotHeldReasons", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PartCTransitionMeetingNotHeldReasonListType partCTransitionMeetingNotHeldReasons;
    @XmlElement(name = "PartCTransitionMeetingDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar partCTransitionMeetingDate;
    @XmlElement(name = "PartCTransitionMeetingOutcomes", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PartCTransitionMeetingOutcomeListType partCTransitionMeetingOutcomes;
    @XmlElement(name = "ReferralDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar referralDate;
    @XmlElement(name = "ReferralSource", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ReferralSourceType referralSource;
    @XmlElement(name = "ProgramStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ProgramStatusType programStatus;
    @XmlElement(name = "GiftedEligibilityCriteria", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String giftedEligibilityCriteria;
    @XmlElement(name = "EvaluationParentalConsentDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evaluationParentalConsentDate;
    @XmlElement(name = "EvaluationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evaluationDate;
    @XmlElement(name = "EvaluationExtensionDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evaluationExtensionDate;
    @XmlElement(name = "ExtensionComments", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String extensionComments;
    @XmlElement(name = "ReevaluationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reevaluationDate;
    @XmlElement(name = "ExceptionalityCategories", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ExceptionalityCategoryListType exceptionalityCategories;
    @XmlElement(name = "ProgramEligibilityDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar programEligibilityDate;
    @XmlElement(name = "ProgramPlanType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ProgramPlanTypeType programPlanType;
    @XmlElement(name = "ProgramPlanDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar programPlanDate;
    @XmlElement(name = "ProgramPlanEffectiveDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar programPlanEffectiveDate;
    @XmlElement(name = "NOREPDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar norepDate;
    @XmlElement(name = "PlacementParentalConsentDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar placementParentalConsentDate;
    @XmlElement(name = "ProgramPlacementDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar programPlacementDate;
    @XmlElement(name = "LeastRestrictiveEnvironment", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LeastRestrictiveEnvironmentType leastRestrictiveEnvironment;
    @XmlElement(name = "ExtendedSchoolYear", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean extendedSchoolYear;
    @XmlElement(name = "ExtendedDay", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean extendedDay;
    @XmlElement(name = "ProgramAvailability", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ProgramAvailabilityType programAvailability;
    @XmlElement(name = "PrivateNotPlacedByPublic", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean privateNotPlacedByPublic;
    @XmlElement(name = "ProgramReviewDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar programReviewDate;
    @XmlElement(name = "FBADate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar fbaDate;
    @XmlElement(name = "BIPDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bipDate;
    @XmlElement(name = "ProgramExitDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar programExitDate;
    @XmlElement(name = "ProgramExitReason", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ProgramExitReasonType programExitReason;
    @XmlElement(name = "ProjectedExitDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar projectedExitDate;
    @XmlElement(name = "ProjectedExitReason", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SourcedCodesetType projectedExitReason;
    @XmlElement(name = "PlannedAssessmentParticipation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SourcedCodesetType plannedAssessmentParticipation;
    @XmlElement(name = "TransitionPlanning", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SourcedCodesetType transitionPlanning;
    @XmlElement(name = "StudentSpecialEducationFTE", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal studentSpecialEducationFTE;
    @XmlElement(name = "EntryPerson", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String entryPerson;
    @XmlElement(name = "ParticipationContact", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String participationContact;
    @XmlElement(name = "AdditionalProgramAvailabilityList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ProgramAvailabilityListType additionalProgramAvailabilityList;
    @XmlElement(name = "CaseManager", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String caseManager;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "StudentPersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;

    /**
     * Gets the value of the studentParticipationAsOfDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStudentParticipationAsOfDate() {
        return studentParticipationAsOfDate;
    }

    /**
     * Sets the value of the studentParticipationAsOfDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStudentParticipationAsOfDate(XMLGregorianCalendar value) {
        this.studentParticipationAsOfDate = value;
    }

    /**
     * Gets the value of the programType property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramTypeType }
     *     
     */
    public ProgramTypeType getProgramType() {
        return programType;
    }

    /**
     * Sets the value of the programType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramTypeType }
     *     
     */
    public void setProgramType(ProgramTypeType value) {
        this.programType = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the programFundingSources property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramFundingSourceListType }
     *     
     */
    public ProgramFundingSourceListType getProgramFundingSources() {
        return programFundingSources;
    }

    /**
     * Sets the value of the programFundingSources property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramFundingSourceListType }
     *     
     */
    public void setProgramFundingSources(ProgramFundingSourceListType value) {
        this.programFundingSources = value;
    }

    /**
     * Gets the value of the managingPublicAgency property.
     * 
     * @return
     *     possible object is
     *     {@link StudentParticipationType.ManagingPublicAgency }
     *     
     */
    public StudentParticipationType.ManagingPublicAgency getManagingPublicAgency() {
        return managingPublicAgency;
    }

    /**
     * Sets the value of the managingPublicAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentParticipationType.ManagingPublicAgency }
     *     
     */
    public void setManagingPublicAgency(StudentParticipationType.ManagingPublicAgency value) {
        this.managingPublicAgency = value;
    }

    /**
     * Gets the value of the managingSchool property.
     * 
     * @return
     *     possible object is
     *     {@link StudentParticipationType.ManagingSchool }
     *     
     */
    public StudentParticipationType.ManagingSchool getManagingSchool() {
        return managingSchool;
    }

    /**
     * Sets the value of the managingSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentParticipationType.ManagingSchool }
     *     
     */
    public void setManagingSchool(StudentParticipationType.ManagingSchool value) {
        this.managingSchool = value;
    }

    /**
     * Gets the value of the partCTransitionMeetingNotHeldReasons property.
     * 
     * @return
     *     possible object is
     *     {@link PartCTransitionMeetingNotHeldReasonListType }
     *     
     */
    public PartCTransitionMeetingNotHeldReasonListType getPartCTransitionMeetingNotHeldReasons() {
        return partCTransitionMeetingNotHeldReasons;
    }

    /**
     * Sets the value of the partCTransitionMeetingNotHeldReasons property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartCTransitionMeetingNotHeldReasonListType }
     *     
     */
    public void setPartCTransitionMeetingNotHeldReasons(PartCTransitionMeetingNotHeldReasonListType value) {
        this.partCTransitionMeetingNotHeldReasons = value;
    }

    /**
     * Gets the value of the partCTransitionMeetingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPartCTransitionMeetingDate() {
        return partCTransitionMeetingDate;
    }

    /**
     * Sets the value of the partCTransitionMeetingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPartCTransitionMeetingDate(XMLGregorianCalendar value) {
        this.partCTransitionMeetingDate = value;
    }

    /**
     * Gets the value of the partCTransitionMeetingOutcomes property.
     * 
     * @return
     *     possible object is
     *     {@link PartCTransitionMeetingOutcomeListType }
     *     
     */
    public PartCTransitionMeetingOutcomeListType getPartCTransitionMeetingOutcomes() {
        return partCTransitionMeetingOutcomes;
    }

    /**
     * Sets the value of the partCTransitionMeetingOutcomes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartCTransitionMeetingOutcomeListType }
     *     
     */
    public void setPartCTransitionMeetingOutcomes(PartCTransitionMeetingOutcomeListType value) {
        this.partCTransitionMeetingOutcomes = value;
    }

    /**
     * Gets the value of the referralDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReferralDate() {
        return referralDate;
    }

    /**
     * Sets the value of the referralDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReferralDate(XMLGregorianCalendar value) {
        this.referralDate = value;
    }

    /**
     * Gets the value of the referralSource property.
     * 
     * @return
     *     possible object is
     *     {@link ReferralSourceType }
     *     
     */
    public ReferralSourceType getReferralSource() {
        return referralSource;
    }

    /**
     * Sets the value of the referralSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferralSourceType }
     *     
     */
    public void setReferralSource(ReferralSourceType value) {
        this.referralSource = value;
    }

    /**
     * Gets the value of the programStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramStatusType }
     *     
     */
    public ProgramStatusType getProgramStatus() {
        return programStatus;
    }

    /**
     * Sets the value of the programStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramStatusType }
     *     
     */
    public void setProgramStatus(ProgramStatusType value) {
        this.programStatus = value;
    }

    /**
     * Gets the value of the giftedEligibilityCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGiftedEligibilityCriteria() {
        return giftedEligibilityCriteria;
    }

    /**
     * Sets the value of the giftedEligibilityCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGiftedEligibilityCriteria(String value) {
        this.giftedEligibilityCriteria = value;
    }

    /**
     * Gets the value of the evaluationParentalConsentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluationParentalConsentDate() {
        return evaluationParentalConsentDate;
    }

    /**
     * Sets the value of the evaluationParentalConsentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluationParentalConsentDate(XMLGregorianCalendar value) {
        this.evaluationParentalConsentDate = value;
    }

    /**
     * Gets the value of the evaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluationDate() {
        return evaluationDate;
    }

    /**
     * Sets the value of the evaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluationDate(XMLGregorianCalendar value) {
        this.evaluationDate = value;
    }

    /**
     * Gets the value of the evaluationExtensionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEvaluationExtensionDate() {
        return evaluationExtensionDate;
    }

    /**
     * Sets the value of the evaluationExtensionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEvaluationExtensionDate(XMLGregorianCalendar value) {
        this.evaluationExtensionDate = value;
    }

    /**
     * Gets the value of the extensionComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionComments() {
        return extensionComments;
    }

    /**
     * Sets the value of the extensionComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionComments(String value) {
        this.extensionComments = value;
    }

    /**
     * Gets the value of the reevaluationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReevaluationDate() {
        return reevaluationDate;
    }

    /**
     * Sets the value of the reevaluationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReevaluationDate(XMLGregorianCalendar value) {
        this.reevaluationDate = value;
    }

    /**
     * Gets the value of the exceptionalityCategories property.
     * 
     * @return
     *     possible object is
     *     {@link ExceptionalityCategoryListType }
     *     
     */
    public ExceptionalityCategoryListType getExceptionalityCategories() {
        return exceptionalityCategories;
    }

    /**
     * Sets the value of the exceptionalityCategories property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExceptionalityCategoryListType }
     *     
     */
    public void setExceptionalityCategories(ExceptionalityCategoryListType value) {
        this.exceptionalityCategories = value;
    }

    /**
     * Gets the value of the programEligibilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProgramEligibilityDate() {
        return programEligibilityDate;
    }

    /**
     * Sets the value of the programEligibilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProgramEligibilityDate(XMLGregorianCalendar value) {
        this.programEligibilityDate = value;
    }

    /**
     * Gets the value of the programPlanType property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramPlanTypeType }
     *     
     */
    public ProgramPlanTypeType getProgramPlanType() {
        return programPlanType;
    }

    /**
     * Sets the value of the programPlanType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramPlanTypeType }
     *     
     */
    public void setProgramPlanType(ProgramPlanTypeType value) {
        this.programPlanType = value;
    }

    /**
     * Gets the value of the programPlanDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProgramPlanDate() {
        return programPlanDate;
    }

    /**
     * Sets the value of the programPlanDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProgramPlanDate(XMLGregorianCalendar value) {
        this.programPlanDate = value;
    }

    /**
     * Gets the value of the programPlanEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProgramPlanEffectiveDate() {
        return programPlanEffectiveDate;
    }

    /**
     * Sets the value of the programPlanEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProgramPlanEffectiveDate(XMLGregorianCalendar value) {
        this.programPlanEffectiveDate = value;
    }

    /**
     * Gets the value of the norepDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getNOREPDate() {
        return norepDate;
    }

    /**
     * Sets the value of the norepDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNOREPDate(XMLGregorianCalendar value) {
        this.norepDate = value;
    }

    /**
     * Gets the value of the placementParentalConsentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPlacementParentalConsentDate() {
        return placementParentalConsentDate;
    }

    /**
     * Sets the value of the placementParentalConsentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPlacementParentalConsentDate(XMLGregorianCalendar value) {
        this.placementParentalConsentDate = value;
    }

    /**
     * Gets the value of the programPlacementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProgramPlacementDate() {
        return programPlacementDate;
    }

    /**
     * Sets the value of the programPlacementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProgramPlacementDate(XMLGregorianCalendar value) {
        this.programPlacementDate = value;
    }

    /**
     * Gets the value of the leastRestrictiveEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link LeastRestrictiveEnvironmentType }
     *     
     */
    public LeastRestrictiveEnvironmentType getLeastRestrictiveEnvironment() {
        return leastRestrictiveEnvironment;
    }

    /**
     * Sets the value of the leastRestrictiveEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeastRestrictiveEnvironmentType }
     *     
     */
    public void setLeastRestrictiveEnvironment(LeastRestrictiveEnvironmentType value) {
        this.leastRestrictiveEnvironment = value;
    }

    /**
     * Gets the value of the extendedSchoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendedSchoolYear() {
        return extendedSchoolYear;
    }

    /**
     * Sets the value of the extendedSchoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendedSchoolYear(Boolean value) {
        this.extendedSchoolYear = value;
    }

    /**
     * Gets the value of the extendedDay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExtendedDay() {
        return extendedDay;
    }

    /**
     * Sets the value of the extendedDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExtendedDay(Boolean value) {
        this.extendedDay = value;
    }

    /**
     * Gets the value of the programAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramAvailabilityType }
     *     
     */
    public ProgramAvailabilityType getProgramAvailability() {
        return programAvailability;
    }

    /**
     * Sets the value of the programAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramAvailabilityType }
     *     
     */
    public void setProgramAvailability(ProgramAvailabilityType value) {
        this.programAvailability = value;
    }

    /**
     * Gets the value of the privateNotPlacedByPublic property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivateNotPlacedByPublic() {
        return privateNotPlacedByPublic;
    }

    /**
     * Sets the value of the privateNotPlacedByPublic property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivateNotPlacedByPublic(Boolean value) {
        this.privateNotPlacedByPublic = value;
    }

    /**
     * Gets the value of the programReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProgramReviewDate() {
        return programReviewDate;
    }

    /**
     * Sets the value of the programReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProgramReviewDate(XMLGregorianCalendar value) {
        this.programReviewDate = value;
    }

    /**
     * Gets the value of the fbaDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFBADate() {
        return fbaDate;
    }

    /**
     * Sets the value of the fbaDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFBADate(XMLGregorianCalendar value) {
        this.fbaDate = value;
    }

    /**
     * Gets the value of the bipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBIPDate() {
        return bipDate;
    }

    /**
     * Sets the value of the bipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBIPDate(XMLGregorianCalendar value) {
        this.bipDate = value;
    }

    /**
     * Gets the value of the programExitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProgramExitDate() {
        return programExitDate;
    }

    /**
     * Sets the value of the programExitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProgramExitDate(XMLGregorianCalendar value) {
        this.programExitDate = value;
    }

    /**
     * Gets the value of the programExitReason property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramExitReasonType }
     *     
     */
    public ProgramExitReasonType getProgramExitReason() {
        return programExitReason;
    }

    /**
     * Sets the value of the programExitReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramExitReasonType }
     *     
     */
    public void setProgramExitReason(ProgramExitReasonType value) {
        this.programExitReason = value;
    }

    /**
     * Gets the value of the projectedExitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProjectedExitDate() {
        return projectedExitDate;
    }

    /**
     * Sets the value of the projectedExitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProjectedExitDate(XMLGregorianCalendar value) {
        this.projectedExitDate = value;
    }

    /**
     * Gets the value of the projectedExitReason property.
     * 
     * @return
     *     possible object is
     *     {@link SourcedCodesetType }
     *     
     */
    public SourcedCodesetType getProjectedExitReason() {
        return projectedExitReason;
    }

    /**
     * Sets the value of the projectedExitReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourcedCodesetType }
     *     
     */
    public void setProjectedExitReason(SourcedCodesetType value) {
        this.projectedExitReason = value;
    }

    /**
     * Gets the value of the plannedAssessmentParticipation property.
     * 
     * @return
     *     possible object is
     *     {@link SourcedCodesetType }
     *     
     */
    public SourcedCodesetType getPlannedAssessmentParticipation() {
        return plannedAssessmentParticipation;
    }

    /**
     * Sets the value of the plannedAssessmentParticipation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourcedCodesetType }
     *     
     */
    public void setPlannedAssessmentParticipation(SourcedCodesetType value) {
        this.plannedAssessmentParticipation = value;
    }

    /**
     * Gets the value of the transitionPlanning property.
     * 
     * @return
     *     possible object is
     *     {@link SourcedCodesetType }
     *     
     */
    public SourcedCodesetType getTransitionPlanning() {
        return transitionPlanning;
    }

    /**
     * Sets the value of the transitionPlanning property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourcedCodesetType }
     *     
     */
    public void setTransitionPlanning(SourcedCodesetType value) {
        this.transitionPlanning = value;
    }

    /**
     * Gets the value of the studentSpecialEducationFTE property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStudentSpecialEducationFTE() {
        return studentSpecialEducationFTE;
    }

    /**
     * Sets the value of the studentSpecialEducationFTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStudentSpecialEducationFTE(BigDecimal value) {
        this.studentSpecialEducationFTE = value;
    }

    /**
     * Gets the value of the entryPerson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryPerson() {
        return entryPerson;
    }

    /**
     * Sets the value of the entryPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryPerson(String value) {
        this.entryPerson = value;
    }

    /**
     * Gets the value of the participationContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipationContact() {
        return participationContact;
    }

    /**
     * Sets the value of the participationContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipationContact(String value) {
        this.participationContact = value;
    }

    /**
     * Gets the value of the additionalProgramAvailabilityList property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramAvailabilityListType }
     *     
     */
    public ProgramAvailabilityListType getAdditionalProgramAvailabilityList() {
        return additionalProgramAvailabilityList;
    }

    /**
     * Sets the value of the additionalProgramAvailabilityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramAvailabilityListType }
     *     
     */
    public void setAdditionalProgramAvailabilityList(ProgramAvailabilityListType value) {
        this.additionalProgramAvailabilityList = value;
    }

    /**
     * Gets the value of the caseManager property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseManager() {
        return caseManager;
    }

    /**
     * Sets the value of the caseManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseManager(String value) {
        this.caseManager = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="LEAInfo"/>
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
    public static class ManagingPublicAgency {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="SchoolInfo"/>
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
    public static class ManagingSchool {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
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
