
package sif.dd.us32.model.ceds;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for elAssessmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elAssessmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="design" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentAcademicSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentEarlylearningDevelopmentalDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentObjective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentTypeAdministeredToChildrenWithDisabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentContentStandardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSecureIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemCharacteristicType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemCharacteristicValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseChoicePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemAllottedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemStem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemRubricName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemRubricURLReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemRubricIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemMinimumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemMaximumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemDifficulty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemDistractorAnalysis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseAidSetUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestScaleOptimalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestScoreMetricType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestRules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPerformanceLevelIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPerformanceLevelLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPerformanceLevelScoreMetric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPerformanceLevelLowerCutScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPerformanceLevelUpperCutScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentRegistrationReasonNotCompleting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gradeLevelWhenassessed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentAccommodationCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormAccommodationList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardDocumentIdentifierURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardDocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardDocumentVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardDocumentCreator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardDocumentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardDocumentPublicationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardDocumentJurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardDocumentValidStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardDocumentValidEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardDocumentSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemPrerequisiteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemPreviousVersionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionAdministratorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionProctorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormPlatformsSupported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentAdministrationStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentAdministrationFinishTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionScheduledStartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionScheduledEndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionActualStartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionActualEndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classSectionassessmentReportingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionSpecialCircumstanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentRegistrationParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemCurrentVersionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemValidEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="learningStandardItemValidStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="administration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentAdministrationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentAdministrationStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentAdministrationFinishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentAdministrationFinishTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentFormPlatformsSupported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentParticipantSessionPlatformType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentParticipantSessionPlatformUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionSpecialCircumstanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionAdministratorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionProctorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSessionLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentAccommodationCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseAidSetUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="consentToShareData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="result" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestResultPretestOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proficiencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseDescriptiveFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestResultDescriptiveFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPerformanceLevelLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPerformanceLevelScoreMetric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPerformanceLevelLowerCutScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPerformanceLevelUpperCutScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentPerformanceLevelIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseScoreValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSubtestResultScoreValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlyLearningOutcomeMeasurementLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlyLearningOutcomeTimePoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "elAssessmentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "design",
    "administration",
    "result"
})
public class ElAssessmentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElAssessmentType.Design design;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElAssessmentType.Administration administration;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElAssessmentType.Result result;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the design property.
     * 
     * @return
     *     possible object is
     *     {@link ElAssessmentType.Design }
     *     
     */
    public ElAssessmentType.Design getDesign() {
        return design;
    }

    /**
     * Sets the value of the design property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElAssessmentType.Design }
     *     
     */
    public void setDesign(ElAssessmentType.Design value) {
        this.design = value;
    }

    /**
     * Gets the value of the administration property.
     * 
     * @return
     *     possible object is
     *     {@link ElAssessmentType.Administration }
     *     
     */
    public ElAssessmentType.Administration getAdministration() {
        return administration;
    }

    /**
     * Sets the value of the administration property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElAssessmentType.Administration }
     *     
     */
    public void setAdministration(ElAssessmentType.Administration value) {
        this.administration = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ElAssessmentType.Result }
     *     
     */
    public ElAssessmentType.Result getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElAssessmentType.Result }
     *     
     */
    public void setResult(ElAssessmentType.Result value) {
        this.result = value;
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
     *         &lt;element name="assessmentAdministrationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentAdministrationStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentAdministrationFinishDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentAdministrationFinishTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormPlatformsSupported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentParticipantSessionPlatformType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentParticipantSessionPlatformUserAgent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionSpecialCircumstanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionAdministratorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionProctorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentAccommodationCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseAidSetUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="consentToShareData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentAdministrationStartDate",
        "assessmentAdministrationStartTime",
        "assessmentAdministrationFinishDate",
        "assessmentAdministrationFinishTime",
        "assessmentLanguage",
        "assessmentFormPlatformsSupported",
        "assessmentParticipantSessionPlatformType",
        "assessmentParticipantSessionPlatformUserAgent",
        "assessmentSessionSpecialCircumstanceType",
        "assessmentSessionAdministratorIdentifier",
        "assessmentSessionProctorIdentifier",
        "assessmentSessionLocation",
        "assessmentAccommodationCategory",
        "assessmentItemResponseStartDate",
        "assessmentItemResponseStartTime",
        "assessmentItemResponseDuration",
        "assessmentItemResponseAidSetUsed",
        "consentToShareData"
    })
    public static class Administration {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAdministrationStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAdministrationStartTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAdministrationFinishDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAdministrationFinishTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentLanguage;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormPlatformsSupported;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentParticipantSessionPlatformType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentParticipantSessionPlatformUserAgent;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionSpecialCircumstanceType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionAdministratorIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionProctorIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionLocation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAccommodationCategory;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseStartTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseDuration;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseAidSetUsed;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String consentToShareData;

        /**
         * Gets the value of the assessmentAdministrationStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAdministrationStartDate() {
            return assessmentAdministrationStartDate;
        }

        /**
         * Sets the value of the assessmentAdministrationStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAdministrationStartDate(String value) {
            this.assessmentAdministrationStartDate = value;
        }

        /**
         * Gets the value of the assessmentAdministrationStartTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAdministrationStartTime() {
            return assessmentAdministrationStartTime;
        }

        /**
         * Sets the value of the assessmentAdministrationStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAdministrationStartTime(String value) {
            this.assessmentAdministrationStartTime = value;
        }

        /**
         * Gets the value of the assessmentAdministrationFinishDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAdministrationFinishDate() {
            return assessmentAdministrationFinishDate;
        }

        /**
         * Sets the value of the assessmentAdministrationFinishDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAdministrationFinishDate(String value) {
            this.assessmentAdministrationFinishDate = value;
        }

        /**
         * Gets the value of the assessmentAdministrationFinishTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAdministrationFinishTime() {
            return assessmentAdministrationFinishTime;
        }

        /**
         * Sets the value of the assessmentAdministrationFinishTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAdministrationFinishTime(String value) {
            this.assessmentAdministrationFinishTime = value;
        }

        /**
         * Gets the value of the assessmentLanguage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentLanguage() {
            return assessmentLanguage;
        }

        /**
         * Sets the value of the assessmentLanguage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentLanguage(String value) {
            this.assessmentLanguage = value;
        }

        /**
         * Gets the value of the assessmentFormPlatformsSupported property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormPlatformsSupported() {
            return assessmentFormPlatformsSupported;
        }

        /**
         * Sets the value of the assessmentFormPlatformsSupported property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormPlatformsSupported(String value) {
            this.assessmentFormPlatformsSupported = value;
        }

        /**
         * Gets the value of the assessmentParticipantSessionPlatformType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentParticipantSessionPlatformType() {
            return assessmentParticipantSessionPlatformType;
        }

        /**
         * Sets the value of the assessmentParticipantSessionPlatformType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentParticipantSessionPlatformType(String value) {
            this.assessmentParticipantSessionPlatformType = value;
        }

        /**
         * Gets the value of the assessmentParticipantSessionPlatformUserAgent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentParticipantSessionPlatformUserAgent() {
            return assessmentParticipantSessionPlatformUserAgent;
        }

        /**
         * Sets the value of the assessmentParticipantSessionPlatformUserAgent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentParticipantSessionPlatformUserAgent(String value) {
            this.assessmentParticipantSessionPlatformUserAgent = value;
        }

        /**
         * Gets the value of the assessmentSessionSpecialCircumstanceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionSpecialCircumstanceType() {
            return assessmentSessionSpecialCircumstanceType;
        }

        /**
         * Sets the value of the assessmentSessionSpecialCircumstanceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionSpecialCircumstanceType(String value) {
            this.assessmentSessionSpecialCircumstanceType = value;
        }

        /**
         * Gets the value of the assessmentSessionAdministratorIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionAdministratorIdentifier() {
            return assessmentSessionAdministratorIdentifier;
        }

        /**
         * Sets the value of the assessmentSessionAdministratorIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionAdministratorIdentifier(String value) {
            this.assessmentSessionAdministratorIdentifier = value;
        }

        /**
         * Gets the value of the assessmentSessionProctorIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionProctorIdentifier() {
            return assessmentSessionProctorIdentifier;
        }

        /**
         * Sets the value of the assessmentSessionProctorIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionProctorIdentifier(String value) {
            this.assessmentSessionProctorIdentifier = value;
        }

        /**
         * Gets the value of the assessmentSessionLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionLocation() {
            return assessmentSessionLocation;
        }

        /**
         * Sets the value of the assessmentSessionLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionLocation(String value) {
            this.assessmentSessionLocation = value;
        }

        /**
         * Gets the value of the assessmentAccommodationCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAccommodationCategory() {
            return assessmentAccommodationCategory;
        }

        /**
         * Sets the value of the assessmentAccommodationCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAccommodationCategory(String value) {
            this.assessmentAccommodationCategory = value;
        }

        /**
         * Gets the value of the assessmentItemResponseStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseStartDate() {
            return assessmentItemResponseStartDate;
        }

        /**
         * Sets the value of the assessmentItemResponseStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseStartDate(String value) {
            this.assessmentItemResponseStartDate = value;
        }

        /**
         * Gets the value of the assessmentItemResponseStartTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseStartTime() {
            return assessmentItemResponseStartTime;
        }

        /**
         * Sets the value of the assessmentItemResponseStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseStartTime(String value) {
            this.assessmentItemResponseStartTime = value;
        }

        /**
         * Gets the value of the assessmentItemResponseDuration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseDuration() {
            return assessmentItemResponseDuration;
        }

        /**
         * Sets the value of the assessmentItemResponseDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseDuration(String value) {
            this.assessmentItemResponseDuration = value;
        }

        /**
         * Gets the value of the assessmentItemResponseAidSetUsed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseAidSetUsed() {
            return assessmentItemResponseAidSetUsed;
        }

        /**
         * Sets the value of the assessmentItemResponseAidSetUsed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseAidSetUsed(String value) {
            this.assessmentItemResponseAidSetUsed = value;
        }

        /**
         * Gets the value of the consentToShareData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsentToShareData() {
            return consentToShareData;
        }

        /**
         * Sets the value of the consentToShareData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsentToShareData(String value) {
            this.consentToShareData = value;
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
     *         &lt;element name="assessmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentAcademicSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentEarlylearningDevelopmentalDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentObjective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentTypeAdministeredToChildrenWithDisabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentContentStandardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSecureIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemCharacteristicType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemCharacteristicValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseChoicePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemAllottedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemStem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemRubricName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemRubricURLReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemRubricIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemMinimumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemMaximumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemDifficulty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemDistractorAnalysis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseAidSetUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestScaleOptimalValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestScoreMetricType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestRules" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPerformanceLevelIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPerformanceLevelLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPerformanceLevelScoreMetric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPerformanceLevelLowerCutScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPerformanceLevelUpperCutScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentRegistrationReasonNotCompleting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gradeLevelWhenassessed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentAccommodationCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormAccommodationList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardDocumentIdentifierURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardDocumentTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardDocumentVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardDocumentCreator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardDocumentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardDocumentPublicationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardDocumentJurisdiction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardDocumentValidStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardDocumentValidEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardDocumentSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemPrerequisiteIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemPreviousVersionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionAdministratorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionProctorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentFormPlatformsSupported" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentAdministrationStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentAdministrationFinishTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionScheduledStartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionScheduledEndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionActualStartDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionActualEndDateTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classSectionassessmentReportingMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSessionSpecialCircumstanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentRegistrationParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemCurrentVersionIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemValidEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="learningStandardItemValidStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentIdentifier",
        "assessmentIdSystem",
        "assessmentTitle",
        "assessmentType",
        "assessmentAcademicSubject",
        "assessmentEarlylearningDevelopmentalDomain",
        "assessmentPurpose",
        "assessmentLevel",
        "assessmentObjective",
        "assessmentTypeAdministeredToChildrenWithDisabilities",
        "assessmentContentStandardType",
        "assessmentFormName",
        "assessmentFormNumber",
        "assessmentSecureIndicator",
        "assessmentItemIdentifier",
        "assessmentItemType",
        "assessmentItemCharacteristicType",
        "assessmentItemCharacteristicValue",
        "assessmentItemResponseChoicePattern",
        "assessmentItemAllottedTime",
        "assessmentItemStem",
        "assessmentItemRubricName",
        "assessmentItemRubricURLReference",
        "assessmentItemRubricIdentifier",
        "assessmentItemMinimumScore",
        "assessmentItemMaximumScore",
        "assessmentItemDifficulty",
        "assessmentItemDistractorAnalysis",
        "assessmentItemResponseAidSetUsed",
        "assessmentSubtestScaleOptimalValue",
        "assessmentSubtestIdentifier",
        "assessmentSubtestTitle",
        "assessmentSubtestAbbreviation",
        "assessmentSubtestVersion",
        "assessmentSubtestScoreMetricType",
        "assessmentSubtestRules",
        "assessmentSubtestDescription",
        "assessmentPerformanceLevelIdentifier",
        "assessmentPerformanceLevelLabel",
        "assessmentPerformanceLevelScoreMetric",
        "assessmentPerformanceLevelLowerCutScore",
        "assessmentPerformanceLevelUpperCutScore",
        "assessmentRegistrationReasonNotCompleting",
        "gradeLevelWhenassessed",
        "assessmentAccommodationCategory",
        "assessmentFormAccommodationList",
        "learningStandardDocumentIdentifierURI",
        "learningStandardDocumentTitle",
        "learningStandardDocumentVersion",
        "learningStandardDocumentCreator",
        "learningStandardDocumentDescription",
        "learningStandardDocumentPublicationStatus",
        "learningStandardDocumentJurisdiction",
        "learningStandardDocumentValidStartDate",
        "learningStandardDocumentValidEndDate",
        "learningStandardDocumentSubject",
        "learningStandardItemIdentifier",
        "learningStandardItemCode",
        "learningStandardItemPrerequisiteIdentifier",
        "learningStandardItemStatement",
        "learningStandardItemType",
        "learningStandardItemPreviousVersionIdentifier",
        "assessmentSessionAdministratorIdentifier",
        "assessmentSessionProctorIdentifier",
        "assessmentLanguage",
        "assessmentSessionLocation",
        "assessmentFormPlatformsSupported",
        "assessmentAdministrationStartTime",
        "assessmentAdministrationFinishTime",
        "assessmentSessionScheduledStartDateTime",
        "assessmentSessionScheduledEndDateTime",
        "assessmentSessionActualStartDateTime",
        "assessmentSessionActualEndDateTime",
        "classSectionassessmentReportingMethod",
        "assessmentSessionSpecialCircumstanceType",
        "assessmentRegistrationParticipationIndicator",
        "learningStandardItemCurrentVersionIndicator",
        "learningStandardItemValidEndDate",
        "learningStandardItemValidStartDate"
    })
    public static class Design {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAcademicSubject;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentEarlylearningDevelopmentalDomain;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPurpose;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentLevel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentObjective;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentTypeAdministeredToChildrenWithDisabilities;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentContentStandardType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormNumber;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSecureIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemCharacteristicType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemCharacteristicValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseChoicePattern;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemAllottedTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemStem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemRubricName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemRubricURLReference;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemRubricIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemMinimumScore;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemMaximumScore;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemDifficulty;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemDistractorAnalysis;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseAidSetUsed;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestScaleOptimalValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestAbbreviation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestVersion;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestScoreMetricType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestRules;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPerformanceLevelIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPerformanceLevelLabel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPerformanceLevelScoreMetric;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPerformanceLevelLowerCutScore;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPerformanceLevelUpperCutScore;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentRegistrationReasonNotCompleting;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String gradeLevelWhenassessed;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAccommodationCategory;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormAccommodationList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardDocumentIdentifierURI;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardDocumentTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardDocumentVersion;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardDocumentCreator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardDocumentDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardDocumentPublicationStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardDocumentJurisdiction;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardDocumentValidStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardDocumentValidEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardDocumentSubject;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemPrerequisiteIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemStatement;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemPreviousVersionIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionAdministratorIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionProctorIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentLanguage;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionLocation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentFormPlatformsSupported;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAdministrationStartTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAdministrationFinishTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionScheduledStartDateTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionScheduledEndDateTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionActualStartDateTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionActualEndDateTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classSectionassessmentReportingMethod;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSessionSpecialCircumstanceType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentRegistrationParticipationIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemCurrentVersionIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemValidEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String learningStandardItemValidStartDate;

        /**
         * Gets the value of the assessmentIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentIdentifier() {
            return assessmentIdentifier;
        }

        /**
         * Sets the value of the assessmentIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentIdentifier(String value) {
            this.assessmentIdentifier = value;
        }

        /**
         * Gets the value of the assessmentIdSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentIdSystem() {
            return assessmentIdSystem;
        }

        /**
         * Sets the value of the assessmentIdSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentIdSystem(String value) {
            this.assessmentIdSystem = value;
        }

        /**
         * Gets the value of the assessmentTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentTitle() {
            return assessmentTitle;
        }

        /**
         * Sets the value of the assessmentTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentTitle(String value) {
            this.assessmentTitle = value;
        }

        /**
         * Gets the value of the assessmentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentType() {
            return assessmentType;
        }

        /**
         * Sets the value of the assessmentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentType(String value) {
            this.assessmentType = value;
        }

        /**
         * Gets the value of the assessmentAcademicSubject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAcademicSubject() {
            return assessmentAcademicSubject;
        }

        /**
         * Sets the value of the assessmentAcademicSubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAcademicSubject(String value) {
            this.assessmentAcademicSubject = value;
        }

        /**
         * Gets the value of the assessmentEarlylearningDevelopmentalDomain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentEarlylearningDevelopmentalDomain() {
            return assessmentEarlylearningDevelopmentalDomain;
        }

        /**
         * Sets the value of the assessmentEarlylearningDevelopmentalDomain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentEarlylearningDevelopmentalDomain(String value) {
            this.assessmentEarlylearningDevelopmentalDomain = value;
        }

        /**
         * Gets the value of the assessmentPurpose property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPurpose() {
            return assessmentPurpose;
        }

        /**
         * Sets the value of the assessmentPurpose property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPurpose(String value) {
            this.assessmentPurpose = value;
        }

        /**
         * Gets the value of the assessmentLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentLevel() {
            return assessmentLevel;
        }

        /**
         * Sets the value of the assessmentLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentLevel(String value) {
            this.assessmentLevel = value;
        }

        /**
         * Gets the value of the assessmentObjective property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentObjective() {
            return assessmentObjective;
        }

        /**
         * Sets the value of the assessmentObjective property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentObjective(String value) {
            this.assessmentObjective = value;
        }

        /**
         * Gets the value of the assessmentTypeAdministeredToChildrenWithDisabilities property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentTypeAdministeredToChildrenWithDisabilities() {
            return assessmentTypeAdministeredToChildrenWithDisabilities;
        }

        /**
         * Sets the value of the assessmentTypeAdministeredToChildrenWithDisabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentTypeAdministeredToChildrenWithDisabilities(String value) {
            this.assessmentTypeAdministeredToChildrenWithDisabilities = value;
        }

        /**
         * Gets the value of the assessmentContentStandardType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentContentStandardType() {
            return assessmentContentStandardType;
        }

        /**
         * Sets the value of the assessmentContentStandardType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentContentStandardType(String value) {
            this.assessmentContentStandardType = value;
        }

        /**
         * Gets the value of the assessmentFormName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormName() {
            return assessmentFormName;
        }

        /**
         * Sets the value of the assessmentFormName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormName(String value) {
            this.assessmentFormName = value;
        }

        /**
         * Gets the value of the assessmentFormNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormNumber() {
            return assessmentFormNumber;
        }

        /**
         * Sets the value of the assessmentFormNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormNumber(String value) {
            this.assessmentFormNumber = value;
        }

        /**
         * Gets the value of the assessmentSecureIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSecureIndicator() {
            return assessmentSecureIndicator;
        }

        /**
         * Sets the value of the assessmentSecureIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSecureIndicator(String value) {
            this.assessmentSecureIndicator = value;
        }

        /**
         * Gets the value of the assessmentItemIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemIdentifier() {
            return assessmentItemIdentifier;
        }

        /**
         * Sets the value of the assessmentItemIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemIdentifier(String value) {
            this.assessmentItemIdentifier = value;
        }

        /**
         * Gets the value of the assessmentItemType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemType() {
            return assessmentItemType;
        }

        /**
         * Sets the value of the assessmentItemType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemType(String value) {
            this.assessmentItemType = value;
        }

        /**
         * Gets the value of the assessmentItemCharacteristicType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemCharacteristicType() {
            return assessmentItemCharacteristicType;
        }

        /**
         * Sets the value of the assessmentItemCharacteristicType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemCharacteristicType(String value) {
            this.assessmentItemCharacteristicType = value;
        }

        /**
         * Gets the value of the assessmentItemCharacteristicValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemCharacteristicValue() {
            return assessmentItemCharacteristicValue;
        }

        /**
         * Sets the value of the assessmentItemCharacteristicValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemCharacteristicValue(String value) {
            this.assessmentItemCharacteristicValue = value;
        }

        /**
         * Gets the value of the assessmentItemResponseChoicePattern property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseChoicePattern() {
            return assessmentItemResponseChoicePattern;
        }

        /**
         * Sets the value of the assessmentItemResponseChoicePattern property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseChoicePattern(String value) {
            this.assessmentItemResponseChoicePattern = value;
        }

        /**
         * Gets the value of the assessmentItemAllottedTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemAllottedTime() {
            return assessmentItemAllottedTime;
        }

        /**
         * Sets the value of the assessmentItemAllottedTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemAllottedTime(String value) {
            this.assessmentItemAllottedTime = value;
        }

        /**
         * Gets the value of the assessmentItemStem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemStem() {
            return assessmentItemStem;
        }

        /**
         * Sets the value of the assessmentItemStem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemStem(String value) {
            this.assessmentItemStem = value;
        }

        /**
         * Gets the value of the assessmentItemRubricName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemRubricName() {
            return assessmentItemRubricName;
        }

        /**
         * Sets the value of the assessmentItemRubricName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemRubricName(String value) {
            this.assessmentItemRubricName = value;
        }

        /**
         * Gets the value of the assessmentItemRubricURLReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemRubricURLReference() {
            return assessmentItemRubricURLReference;
        }

        /**
         * Sets the value of the assessmentItemRubricURLReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemRubricURLReference(String value) {
            this.assessmentItemRubricURLReference = value;
        }

        /**
         * Gets the value of the assessmentItemRubricIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemRubricIdentifier() {
            return assessmentItemRubricIdentifier;
        }

        /**
         * Sets the value of the assessmentItemRubricIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemRubricIdentifier(String value) {
            this.assessmentItemRubricIdentifier = value;
        }

        /**
         * Gets the value of the assessmentItemMinimumScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemMinimumScore() {
            return assessmentItemMinimumScore;
        }

        /**
         * Sets the value of the assessmentItemMinimumScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemMinimumScore(String value) {
            this.assessmentItemMinimumScore = value;
        }

        /**
         * Gets the value of the assessmentItemMaximumScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemMaximumScore() {
            return assessmentItemMaximumScore;
        }

        /**
         * Sets the value of the assessmentItemMaximumScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemMaximumScore(String value) {
            this.assessmentItemMaximumScore = value;
        }

        /**
         * Gets the value of the assessmentItemDifficulty property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemDifficulty() {
            return assessmentItemDifficulty;
        }

        /**
         * Sets the value of the assessmentItemDifficulty property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemDifficulty(String value) {
            this.assessmentItemDifficulty = value;
        }

        /**
         * Gets the value of the assessmentItemDistractorAnalysis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemDistractorAnalysis() {
            return assessmentItemDistractorAnalysis;
        }

        /**
         * Sets the value of the assessmentItemDistractorAnalysis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemDistractorAnalysis(String value) {
            this.assessmentItemDistractorAnalysis = value;
        }

        /**
         * Gets the value of the assessmentItemResponseAidSetUsed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseAidSetUsed() {
            return assessmentItemResponseAidSetUsed;
        }

        /**
         * Sets the value of the assessmentItemResponseAidSetUsed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseAidSetUsed(String value) {
            this.assessmentItemResponseAidSetUsed = value;
        }

        /**
         * Gets the value of the assessmentSubtestScaleOptimalValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestScaleOptimalValue() {
            return assessmentSubtestScaleOptimalValue;
        }

        /**
         * Sets the value of the assessmentSubtestScaleOptimalValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestScaleOptimalValue(String value) {
            this.assessmentSubtestScaleOptimalValue = value;
        }

        /**
         * Gets the value of the assessmentSubtestIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestIdentifier() {
            return assessmentSubtestIdentifier;
        }

        /**
         * Sets the value of the assessmentSubtestIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestIdentifier(String value) {
            this.assessmentSubtestIdentifier = value;
        }

        /**
         * Gets the value of the assessmentSubtestTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestTitle() {
            return assessmentSubtestTitle;
        }

        /**
         * Sets the value of the assessmentSubtestTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestTitle(String value) {
            this.assessmentSubtestTitle = value;
        }

        /**
         * Gets the value of the assessmentSubtestAbbreviation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestAbbreviation() {
            return assessmentSubtestAbbreviation;
        }

        /**
         * Sets the value of the assessmentSubtestAbbreviation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestAbbreviation(String value) {
            this.assessmentSubtestAbbreviation = value;
        }

        /**
         * Gets the value of the assessmentSubtestVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestVersion() {
            return assessmentSubtestVersion;
        }

        /**
         * Sets the value of the assessmentSubtestVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestVersion(String value) {
            this.assessmentSubtestVersion = value;
        }

        /**
         * Gets the value of the assessmentSubtestScoreMetricType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestScoreMetricType() {
            return assessmentSubtestScoreMetricType;
        }

        /**
         * Sets the value of the assessmentSubtestScoreMetricType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestScoreMetricType(String value) {
            this.assessmentSubtestScoreMetricType = value;
        }

        /**
         * Gets the value of the assessmentSubtestRules property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestRules() {
            return assessmentSubtestRules;
        }

        /**
         * Sets the value of the assessmentSubtestRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestRules(String value) {
            this.assessmentSubtestRules = value;
        }

        /**
         * Gets the value of the assessmentSubtestDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestDescription() {
            return assessmentSubtestDescription;
        }

        /**
         * Sets the value of the assessmentSubtestDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestDescription(String value) {
            this.assessmentSubtestDescription = value;
        }

        /**
         * Gets the value of the assessmentPerformanceLevelIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPerformanceLevelIdentifier() {
            return assessmentPerformanceLevelIdentifier;
        }

        /**
         * Sets the value of the assessmentPerformanceLevelIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPerformanceLevelIdentifier(String value) {
            this.assessmentPerformanceLevelIdentifier = value;
        }

        /**
         * Gets the value of the assessmentPerformanceLevelLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPerformanceLevelLabel() {
            return assessmentPerformanceLevelLabel;
        }

        /**
         * Sets the value of the assessmentPerformanceLevelLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPerformanceLevelLabel(String value) {
            this.assessmentPerformanceLevelLabel = value;
        }

        /**
         * Gets the value of the assessmentPerformanceLevelScoreMetric property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPerformanceLevelScoreMetric() {
            return assessmentPerformanceLevelScoreMetric;
        }

        /**
         * Sets the value of the assessmentPerformanceLevelScoreMetric property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPerformanceLevelScoreMetric(String value) {
            this.assessmentPerformanceLevelScoreMetric = value;
        }

        /**
         * Gets the value of the assessmentPerformanceLevelLowerCutScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPerformanceLevelLowerCutScore() {
            return assessmentPerformanceLevelLowerCutScore;
        }

        /**
         * Sets the value of the assessmentPerformanceLevelLowerCutScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPerformanceLevelLowerCutScore(String value) {
            this.assessmentPerformanceLevelLowerCutScore = value;
        }

        /**
         * Gets the value of the assessmentPerformanceLevelUpperCutScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPerformanceLevelUpperCutScore() {
            return assessmentPerformanceLevelUpperCutScore;
        }

        /**
         * Sets the value of the assessmentPerformanceLevelUpperCutScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPerformanceLevelUpperCutScore(String value) {
            this.assessmentPerformanceLevelUpperCutScore = value;
        }

        /**
         * Gets the value of the assessmentRegistrationReasonNotCompleting property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentRegistrationReasonNotCompleting() {
            return assessmentRegistrationReasonNotCompleting;
        }

        /**
         * Sets the value of the assessmentRegistrationReasonNotCompleting property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentRegistrationReasonNotCompleting(String value) {
            this.assessmentRegistrationReasonNotCompleting = value;
        }

        /**
         * Gets the value of the gradeLevelWhenassessed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGradeLevelWhenassessed() {
            return gradeLevelWhenassessed;
        }

        /**
         * Sets the value of the gradeLevelWhenassessed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGradeLevelWhenassessed(String value) {
            this.gradeLevelWhenassessed = value;
        }

        /**
         * Gets the value of the assessmentAccommodationCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAccommodationCategory() {
            return assessmentAccommodationCategory;
        }

        /**
         * Sets the value of the assessmentAccommodationCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAccommodationCategory(String value) {
            this.assessmentAccommodationCategory = value;
        }

        /**
         * Gets the value of the assessmentFormAccommodationList property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormAccommodationList() {
            return assessmentFormAccommodationList;
        }

        /**
         * Sets the value of the assessmentFormAccommodationList property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormAccommodationList(String value) {
            this.assessmentFormAccommodationList = value;
        }

        /**
         * Gets the value of the learningStandardDocumentIdentifierURI property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardDocumentIdentifierURI() {
            return learningStandardDocumentIdentifierURI;
        }

        /**
         * Sets the value of the learningStandardDocumentIdentifierURI property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardDocumentIdentifierURI(String value) {
            this.learningStandardDocumentIdentifierURI = value;
        }

        /**
         * Gets the value of the learningStandardDocumentTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardDocumentTitle() {
            return learningStandardDocumentTitle;
        }

        /**
         * Sets the value of the learningStandardDocumentTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardDocumentTitle(String value) {
            this.learningStandardDocumentTitle = value;
        }

        /**
         * Gets the value of the learningStandardDocumentVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardDocumentVersion() {
            return learningStandardDocumentVersion;
        }

        /**
         * Sets the value of the learningStandardDocumentVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardDocumentVersion(String value) {
            this.learningStandardDocumentVersion = value;
        }

        /**
         * Gets the value of the learningStandardDocumentCreator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardDocumentCreator() {
            return learningStandardDocumentCreator;
        }

        /**
         * Sets the value of the learningStandardDocumentCreator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardDocumentCreator(String value) {
            this.learningStandardDocumentCreator = value;
        }

        /**
         * Gets the value of the learningStandardDocumentDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardDocumentDescription() {
            return learningStandardDocumentDescription;
        }

        /**
         * Sets the value of the learningStandardDocumentDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardDocumentDescription(String value) {
            this.learningStandardDocumentDescription = value;
        }

        /**
         * Gets the value of the learningStandardDocumentPublicationStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardDocumentPublicationStatus() {
            return learningStandardDocumentPublicationStatus;
        }

        /**
         * Sets the value of the learningStandardDocumentPublicationStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardDocumentPublicationStatus(String value) {
            this.learningStandardDocumentPublicationStatus = value;
        }

        /**
         * Gets the value of the learningStandardDocumentJurisdiction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardDocumentJurisdiction() {
            return learningStandardDocumentJurisdiction;
        }

        /**
         * Sets the value of the learningStandardDocumentJurisdiction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardDocumentJurisdiction(String value) {
            this.learningStandardDocumentJurisdiction = value;
        }

        /**
         * Gets the value of the learningStandardDocumentValidStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardDocumentValidStartDate() {
            return learningStandardDocumentValidStartDate;
        }

        /**
         * Sets the value of the learningStandardDocumentValidStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardDocumentValidStartDate(String value) {
            this.learningStandardDocumentValidStartDate = value;
        }

        /**
         * Gets the value of the learningStandardDocumentValidEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardDocumentValidEndDate() {
            return learningStandardDocumentValidEndDate;
        }

        /**
         * Sets the value of the learningStandardDocumentValidEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardDocumentValidEndDate(String value) {
            this.learningStandardDocumentValidEndDate = value;
        }

        /**
         * Gets the value of the learningStandardDocumentSubject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardDocumentSubject() {
            return learningStandardDocumentSubject;
        }

        /**
         * Sets the value of the learningStandardDocumentSubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardDocumentSubject(String value) {
            this.learningStandardDocumentSubject = value;
        }

        /**
         * Gets the value of the learningStandardItemIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemIdentifier() {
            return learningStandardItemIdentifier;
        }

        /**
         * Sets the value of the learningStandardItemIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemIdentifier(String value) {
            this.learningStandardItemIdentifier = value;
        }

        /**
         * Gets the value of the learningStandardItemCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemCode() {
            return learningStandardItemCode;
        }

        /**
         * Sets the value of the learningStandardItemCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemCode(String value) {
            this.learningStandardItemCode = value;
        }

        /**
         * Gets the value of the learningStandardItemPrerequisiteIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemPrerequisiteIdentifier() {
            return learningStandardItemPrerequisiteIdentifier;
        }

        /**
         * Sets the value of the learningStandardItemPrerequisiteIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemPrerequisiteIdentifier(String value) {
            this.learningStandardItemPrerequisiteIdentifier = value;
        }

        /**
         * Gets the value of the learningStandardItemStatement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemStatement() {
            return learningStandardItemStatement;
        }

        /**
         * Sets the value of the learningStandardItemStatement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemStatement(String value) {
            this.learningStandardItemStatement = value;
        }

        /**
         * Gets the value of the learningStandardItemType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemType() {
            return learningStandardItemType;
        }

        /**
         * Sets the value of the learningStandardItemType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemType(String value) {
            this.learningStandardItemType = value;
        }

        /**
         * Gets the value of the learningStandardItemPreviousVersionIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemPreviousVersionIdentifier() {
            return learningStandardItemPreviousVersionIdentifier;
        }

        /**
         * Sets the value of the learningStandardItemPreviousVersionIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemPreviousVersionIdentifier(String value) {
            this.learningStandardItemPreviousVersionIdentifier = value;
        }

        /**
         * Gets the value of the assessmentSessionAdministratorIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionAdministratorIdentifier() {
            return assessmentSessionAdministratorIdentifier;
        }

        /**
         * Sets the value of the assessmentSessionAdministratorIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionAdministratorIdentifier(String value) {
            this.assessmentSessionAdministratorIdentifier = value;
        }

        /**
         * Gets the value of the assessmentSessionProctorIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionProctorIdentifier() {
            return assessmentSessionProctorIdentifier;
        }

        /**
         * Sets the value of the assessmentSessionProctorIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionProctorIdentifier(String value) {
            this.assessmentSessionProctorIdentifier = value;
        }

        /**
         * Gets the value of the assessmentLanguage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentLanguage() {
            return assessmentLanguage;
        }

        /**
         * Sets the value of the assessmentLanguage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentLanguage(String value) {
            this.assessmentLanguage = value;
        }

        /**
         * Gets the value of the assessmentSessionLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionLocation() {
            return assessmentSessionLocation;
        }

        /**
         * Sets the value of the assessmentSessionLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionLocation(String value) {
            this.assessmentSessionLocation = value;
        }

        /**
         * Gets the value of the assessmentFormPlatformsSupported property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentFormPlatformsSupported() {
            return assessmentFormPlatformsSupported;
        }

        /**
         * Sets the value of the assessmentFormPlatformsSupported property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentFormPlatformsSupported(String value) {
            this.assessmentFormPlatformsSupported = value;
        }

        /**
         * Gets the value of the assessmentAdministrationStartTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAdministrationStartTime() {
            return assessmentAdministrationStartTime;
        }

        /**
         * Sets the value of the assessmentAdministrationStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAdministrationStartTime(String value) {
            this.assessmentAdministrationStartTime = value;
        }

        /**
         * Gets the value of the assessmentAdministrationFinishTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAdministrationFinishTime() {
            return assessmentAdministrationFinishTime;
        }

        /**
         * Sets the value of the assessmentAdministrationFinishTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAdministrationFinishTime(String value) {
            this.assessmentAdministrationFinishTime = value;
        }

        /**
         * Gets the value of the assessmentSessionScheduledStartDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionScheduledStartDateTime() {
            return assessmentSessionScheduledStartDateTime;
        }

        /**
         * Sets the value of the assessmentSessionScheduledStartDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionScheduledStartDateTime(String value) {
            this.assessmentSessionScheduledStartDateTime = value;
        }

        /**
         * Gets the value of the assessmentSessionScheduledEndDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionScheduledEndDateTime() {
            return assessmentSessionScheduledEndDateTime;
        }

        /**
         * Sets the value of the assessmentSessionScheduledEndDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionScheduledEndDateTime(String value) {
            this.assessmentSessionScheduledEndDateTime = value;
        }

        /**
         * Gets the value of the assessmentSessionActualStartDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionActualStartDateTime() {
            return assessmentSessionActualStartDateTime;
        }

        /**
         * Sets the value of the assessmentSessionActualStartDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionActualStartDateTime(String value) {
            this.assessmentSessionActualStartDateTime = value;
        }

        /**
         * Gets the value of the assessmentSessionActualEndDateTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionActualEndDateTime() {
            return assessmentSessionActualEndDateTime;
        }

        /**
         * Sets the value of the assessmentSessionActualEndDateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionActualEndDateTime(String value) {
            this.assessmentSessionActualEndDateTime = value;
        }

        /**
         * Gets the value of the classSectionassessmentReportingMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassSectionassessmentReportingMethod() {
            return classSectionassessmentReportingMethod;
        }

        /**
         * Sets the value of the classSectionassessmentReportingMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassSectionassessmentReportingMethod(String value) {
            this.classSectionassessmentReportingMethod = value;
        }

        /**
         * Gets the value of the assessmentSessionSpecialCircumstanceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSessionSpecialCircumstanceType() {
            return assessmentSessionSpecialCircumstanceType;
        }

        /**
         * Sets the value of the assessmentSessionSpecialCircumstanceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSessionSpecialCircumstanceType(String value) {
            this.assessmentSessionSpecialCircumstanceType = value;
        }

        /**
         * Gets the value of the assessmentRegistrationParticipationIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentRegistrationParticipationIndicator() {
            return assessmentRegistrationParticipationIndicator;
        }

        /**
         * Sets the value of the assessmentRegistrationParticipationIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentRegistrationParticipationIndicator(String value) {
            this.assessmentRegistrationParticipationIndicator = value;
        }

        /**
         * Gets the value of the learningStandardItemCurrentVersionIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemCurrentVersionIndicator() {
            return learningStandardItemCurrentVersionIndicator;
        }

        /**
         * Sets the value of the learningStandardItemCurrentVersionIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemCurrentVersionIndicator(String value) {
            this.learningStandardItemCurrentVersionIndicator = value;
        }

        /**
         * Gets the value of the learningStandardItemValidEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemValidEndDate() {
            return learningStandardItemValidEndDate;
        }

        /**
         * Sets the value of the learningStandardItemValidEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemValidEndDate(String value) {
            this.learningStandardItemValidEndDate = value;
        }

        /**
         * Gets the value of the learningStandardItemValidStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLearningStandardItemValidStartDate() {
            return learningStandardItemValidStartDate;
        }

        /**
         * Sets the value of the learningStandardItemValidStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLearningStandardItemValidStartDate(String value) {
            this.learningStandardItemValidStartDate = value;
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
     *         &lt;element name="assessmentItemResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestResultPretestOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proficiencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseDescriptiveFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestResultDescriptiveFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPerformanceLevelLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPerformanceLevelScoreMetric" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPerformanceLevelLowerCutScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPerformanceLevelUpperCutScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentPerformanceLevelIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseScoreValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSubtestResultScoreValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlyLearningOutcomeMeasurementLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlyLearningOutcomeTimePoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentItemResponseStatus",
        "assessmentSubtestResultPretestOutcome",
        "proficiencyStatus",
        "assessmentItemResponseDescriptiveFeedback",
        "assessmentSubtestResultDescriptiveFeedback",
        "assessmentPerformanceLevelLabel",
        "assessmentPerformanceLevelScoreMetric",
        "assessmentPerformanceLevelLowerCutScore",
        "assessmentPerformanceLevelUpperCutScore",
        "assessmentPerformanceLevelIdentifier",
        "assessmentItemResponseScoreValue",
        "assessmentSubtestResultScoreValue",
        "assessmentItemResponseValue",
        "earlyLearningOutcomeMeasurementLevel",
        "earlyLearningOutcomeTimePoint"
    })
    public static class Result {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestResultPretestOutcome;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String proficiencyStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseDescriptiveFeedback;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestResultDescriptiveFeedback;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPerformanceLevelLabel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPerformanceLevelScoreMetric;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPerformanceLevelLowerCutScore;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPerformanceLevelUpperCutScore;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentPerformanceLevelIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseScoreValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSubtestResultScoreValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyLearningOutcomeMeasurementLevel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyLearningOutcomeTimePoint;

        /**
         * Gets the value of the assessmentItemResponseStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseStatus() {
            return assessmentItemResponseStatus;
        }

        /**
         * Sets the value of the assessmentItemResponseStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseStatus(String value) {
            this.assessmentItemResponseStatus = value;
        }

        /**
         * Gets the value of the assessmentSubtestResultPretestOutcome property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestResultPretestOutcome() {
            return assessmentSubtestResultPretestOutcome;
        }

        /**
         * Sets the value of the assessmentSubtestResultPretestOutcome property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestResultPretestOutcome(String value) {
            this.assessmentSubtestResultPretestOutcome = value;
        }

        /**
         * Gets the value of the proficiencyStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProficiencyStatus() {
            return proficiencyStatus;
        }

        /**
         * Sets the value of the proficiencyStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProficiencyStatus(String value) {
            this.proficiencyStatus = value;
        }

        /**
         * Gets the value of the assessmentItemResponseDescriptiveFeedback property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseDescriptiveFeedback() {
            return assessmentItemResponseDescriptiveFeedback;
        }

        /**
         * Sets the value of the assessmentItemResponseDescriptiveFeedback property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseDescriptiveFeedback(String value) {
            this.assessmentItemResponseDescriptiveFeedback = value;
        }

        /**
         * Gets the value of the assessmentSubtestResultDescriptiveFeedback property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestResultDescriptiveFeedback() {
            return assessmentSubtestResultDescriptiveFeedback;
        }

        /**
         * Sets the value of the assessmentSubtestResultDescriptiveFeedback property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestResultDescriptiveFeedback(String value) {
            this.assessmentSubtestResultDescriptiveFeedback = value;
        }

        /**
         * Gets the value of the assessmentPerformanceLevelLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPerformanceLevelLabel() {
            return assessmentPerformanceLevelLabel;
        }

        /**
         * Sets the value of the assessmentPerformanceLevelLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPerformanceLevelLabel(String value) {
            this.assessmentPerformanceLevelLabel = value;
        }

        /**
         * Gets the value of the assessmentPerformanceLevelScoreMetric property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPerformanceLevelScoreMetric() {
            return assessmentPerformanceLevelScoreMetric;
        }

        /**
         * Sets the value of the assessmentPerformanceLevelScoreMetric property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPerformanceLevelScoreMetric(String value) {
            this.assessmentPerformanceLevelScoreMetric = value;
        }

        /**
         * Gets the value of the assessmentPerformanceLevelLowerCutScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPerformanceLevelLowerCutScore() {
            return assessmentPerformanceLevelLowerCutScore;
        }

        /**
         * Sets the value of the assessmentPerformanceLevelLowerCutScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPerformanceLevelLowerCutScore(String value) {
            this.assessmentPerformanceLevelLowerCutScore = value;
        }

        /**
         * Gets the value of the assessmentPerformanceLevelUpperCutScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPerformanceLevelUpperCutScore() {
            return assessmentPerformanceLevelUpperCutScore;
        }

        /**
         * Sets the value of the assessmentPerformanceLevelUpperCutScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPerformanceLevelUpperCutScore(String value) {
            this.assessmentPerformanceLevelUpperCutScore = value;
        }

        /**
         * Gets the value of the assessmentPerformanceLevelIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentPerformanceLevelIdentifier() {
            return assessmentPerformanceLevelIdentifier;
        }

        /**
         * Sets the value of the assessmentPerformanceLevelIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentPerformanceLevelIdentifier(String value) {
            this.assessmentPerformanceLevelIdentifier = value;
        }

        /**
         * Gets the value of the assessmentItemResponseScoreValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseScoreValue() {
            return assessmentItemResponseScoreValue;
        }

        /**
         * Sets the value of the assessmentItemResponseScoreValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseScoreValue(String value) {
            this.assessmentItemResponseScoreValue = value;
        }

        /**
         * Gets the value of the assessmentSubtestResultScoreValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSubtestResultScoreValue() {
            return assessmentSubtestResultScoreValue;
        }

        /**
         * Sets the value of the assessmentSubtestResultScoreValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSubtestResultScoreValue(String value) {
            this.assessmentSubtestResultScoreValue = value;
        }

        /**
         * Gets the value of the assessmentItemResponseValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseValue() {
            return assessmentItemResponseValue;
        }

        /**
         * Sets the value of the assessmentItemResponseValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseValue(String value) {
            this.assessmentItemResponseValue = value;
        }

        /**
         * Gets the value of the earlyLearningOutcomeMeasurementLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyLearningOutcomeMeasurementLevel() {
            return earlyLearningOutcomeMeasurementLevel;
        }

        /**
         * Sets the value of the earlyLearningOutcomeMeasurementLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyLearningOutcomeMeasurementLevel(String value) {
            this.earlyLearningOutcomeMeasurementLevel = value;
        }

        /**
         * Gets the value of the earlyLearningOutcomeTimePoint property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyLearningOutcomeTimePoint() {
            return earlyLearningOutcomeTimePoint;
        }

        /**
         * Sets the value of the earlyLearningOutcomeTimePoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyLearningOutcomeTimePoint(String value) {
            this.earlyLearningOutcomeTimePoint = value;
        }

    }

}
