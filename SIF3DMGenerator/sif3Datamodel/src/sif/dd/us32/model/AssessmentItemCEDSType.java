
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assessmentItemCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentItemCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentItemIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentAcademicSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemBodyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemStimulus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemDifficulty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemDistractorAnalysis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemStem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemAllottedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemMinimumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemMaximumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemTextComplexityValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemTextComplexitySystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemResponseSecurityIssue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemBankIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemBankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naepAspectsOfReading" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="naepMathematicalComplexityLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemReleaseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="assessmentItemLinkingItemIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemPossibleResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemPossibleResponseSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemPossibleResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemPossibleResponseOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemPossibleResponseCorrectIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemPossibleResponseFeedbackMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itemResponse" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemResponseStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseAidSetUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseScoreValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseChoicePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseDescriptiveFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseScaffoldingItemFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseHintCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseHintIncludedAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseFirstAttemptDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proficiencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itemResponseTheory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemResponseTheoryParameterA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryParameterB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryParameterDifficultyCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryParameterC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryParameterD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryParameterD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryParameterD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryParameterD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryParameterD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryParameterD6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryPointBiserialCorrelationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryDIFValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryKappaValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResponseTheoryKappaAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itemBodyCustomInteraction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemBodyCustomInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="itemCharacteristic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemCharacteristicValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemCharacteristicType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentRubric" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentRubricIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentRubricTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentRubricURLReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricCriterionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricCriterionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricCriterionLevelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricCriterionLevelFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricCriterionLevelPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricCriterionLevelQualityLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricCriterionLevelScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricCriterionPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricCriterionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricCriterionWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="rubricDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="apip" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemAdaptiveIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemAPIPItemBodyXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemAPIPModalFeedbackXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemAPIPOutcomeDeclarationXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemAPIPResponseDeclarationXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemAPIPResponseProcessingTemplateURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemAPIPResponseProcessingXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemAPIPTemplateDeclarationXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemAPIPTemplateProcessingXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemResultXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="apipInteraction" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemBodyAssociateInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyChoiceInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyDrawingInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyEndAttemptInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyExtendedTextInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyGapMatchInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyGraphicGapMatchInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyGraphicOrderInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyHotSpotInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyHottextInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyInlineChoiceInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyMatchInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyMediaInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyOrderInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyPositionObjectInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodySelectPointInteraction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodySelectPointInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodySliderInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyTextEntryInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemBodyUploadInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentItemInteractionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "assessmentItemCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentItemIdentifier",
    "assessmentItemType",
    "assessmentAcademicSubject",
    "assessmentItemBodyText",
    "assessmentItemStimulus",
    "assessmentItemDifficulty",
    "assessmentItemDistractorAnalysis",
    "assessmentItemStem",
    "assessmentItemAllottedTime",
    "assessmentItemMinimumScore",
    "assessmentItemMaximumScore",
    "assessmentItemTextComplexityValue",
    "assessmentItemTextComplexitySystem",
    "assessmentItemResponseSecurityIssue",
    "assessmentItemBankIdentifier",
    "assessmentItemBankName",
    "naepAspectsOfReading",
    "naepMathematicalComplexityLevel",
    "assessmentItemReleaseStatus",
    "assessmentItemLinkingItemIndicator",
    "itemPossibleResponse",
    "itemResponse",
    "itemResponseTheory",
    "itemBodyCustomInteraction",
    "itemCharacteristic",
    "assessmentRubric",
    "apip",
    "apipInteraction"
})
public class AssessmentItemCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentAcademicSubject;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemBodyText;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemStimulus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemDifficulty;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemDistractorAnalysis;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemStem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemAllottedTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemMinimumScore;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemMaximumScore;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemTextComplexityValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemTextComplexitySystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemResponseSecurityIssue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemBankIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemBankName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String naepAspectsOfReading;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String naepMathematicalComplexityLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemReleaseStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String assessmentItemLinkingItemIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemCEDSType.ItemPossibleResponse itemPossibleResponse;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemCEDSType.ItemResponse itemResponse;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemCEDSType.ItemResponseTheory itemResponseTheory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemCEDSType.ItemBodyCustomInteraction itemBodyCustomInteraction;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemCEDSType.ItemCharacteristic itemCharacteristic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemCEDSType.AssessmentRubric assessmentRubric;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemCEDSType.Apip apip;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemCEDSType.ApipInteraction apipInteraction;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the assessmentItemBodyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentItemBodyText() {
        return assessmentItemBodyText;
    }

    /**
     * Sets the value of the assessmentItemBodyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentItemBodyText(String value) {
        this.assessmentItemBodyText = value;
    }

    /**
     * Gets the value of the assessmentItemStimulus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentItemStimulus() {
        return assessmentItemStimulus;
    }

    /**
     * Sets the value of the assessmentItemStimulus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentItemStimulus(String value) {
        this.assessmentItemStimulus = value;
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
     * Gets the value of the assessmentItemTextComplexityValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentItemTextComplexityValue() {
        return assessmentItemTextComplexityValue;
    }

    /**
     * Sets the value of the assessmentItemTextComplexityValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentItemTextComplexityValue(String value) {
        this.assessmentItemTextComplexityValue = value;
    }

    /**
     * Gets the value of the assessmentItemTextComplexitySystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentItemTextComplexitySystem() {
        return assessmentItemTextComplexitySystem;
    }

    /**
     * Sets the value of the assessmentItemTextComplexitySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentItemTextComplexitySystem(String value) {
        this.assessmentItemTextComplexitySystem = value;
    }

    /**
     * Gets the value of the assessmentItemResponseSecurityIssue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentItemResponseSecurityIssue() {
        return assessmentItemResponseSecurityIssue;
    }

    /**
     * Sets the value of the assessmentItemResponseSecurityIssue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentItemResponseSecurityIssue(String value) {
        this.assessmentItemResponseSecurityIssue = value;
    }

    /**
     * Gets the value of the assessmentItemBankIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentItemBankIdentifier() {
        return assessmentItemBankIdentifier;
    }

    /**
     * Sets the value of the assessmentItemBankIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentItemBankIdentifier(String value) {
        this.assessmentItemBankIdentifier = value;
    }

    /**
     * Gets the value of the assessmentItemBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentItemBankName() {
        return assessmentItemBankName;
    }

    /**
     * Sets the value of the assessmentItemBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentItemBankName(String value) {
        this.assessmentItemBankName = value;
    }

    /**
     * Gets the value of the naepAspectsOfReading property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaepAspectsOfReading() {
        return naepAspectsOfReading;
    }

    /**
     * Sets the value of the naepAspectsOfReading property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaepAspectsOfReading(String value) {
        this.naepAspectsOfReading = value;
    }

    /**
     * Gets the value of the naepMathematicalComplexityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaepMathematicalComplexityLevel() {
        return naepMathematicalComplexityLevel;
    }

    /**
     * Sets the value of the naepMathematicalComplexityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaepMathematicalComplexityLevel(String value) {
        this.naepMathematicalComplexityLevel = value;
    }

    /**
     * Gets the value of the assessmentItemReleaseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentItemReleaseStatus() {
        return assessmentItemReleaseStatus;
    }

    /**
     * Sets the value of the assessmentItemReleaseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentItemReleaseStatus(String value) {
        this.assessmentItemReleaseStatus = value;
    }

    /**
     * Gets the value of the assessmentItemLinkingItemIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentItemLinkingItemIndicator() {
        return assessmentItemLinkingItemIndicator;
    }

    /**
     * Sets the value of the assessmentItemLinkingItemIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentItemLinkingItemIndicator(String value) {
        this.assessmentItemLinkingItemIndicator = value;
    }

    /**
     * Gets the value of the itemPossibleResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemCEDSType.ItemPossibleResponse }
     *     
     */
    public AssessmentItemCEDSType.ItemPossibleResponse getItemPossibleResponse() {
        return itemPossibleResponse;
    }

    /**
     * Sets the value of the itemPossibleResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemCEDSType.ItemPossibleResponse }
     *     
     */
    public void setItemPossibleResponse(AssessmentItemCEDSType.ItemPossibleResponse value) {
        this.itemPossibleResponse = value;
    }

    /**
     * Gets the value of the itemResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemCEDSType.ItemResponse }
     *     
     */
    public AssessmentItemCEDSType.ItemResponse getItemResponse() {
        return itemResponse;
    }

    /**
     * Sets the value of the itemResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemCEDSType.ItemResponse }
     *     
     */
    public void setItemResponse(AssessmentItemCEDSType.ItemResponse value) {
        this.itemResponse = value;
    }

    /**
     * Gets the value of the itemResponseTheory property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemCEDSType.ItemResponseTheory }
     *     
     */
    public AssessmentItemCEDSType.ItemResponseTheory getItemResponseTheory() {
        return itemResponseTheory;
    }

    /**
     * Sets the value of the itemResponseTheory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemCEDSType.ItemResponseTheory }
     *     
     */
    public void setItemResponseTheory(AssessmentItemCEDSType.ItemResponseTheory value) {
        this.itemResponseTheory = value;
    }

    /**
     * Gets the value of the itemBodyCustomInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemCEDSType.ItemBodyCustomInteraction }
     *     
     */
    public AssessmentItemCEDSType.ItemBodyCustomInteraction getItemBodyCustomInteraction() {
        return itemBodyCustomInteraction;
    }

    /**
     * Sets the value of the itemBodyCustomInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemCEDSType.ItemBodyCustomInteraction }
     *     
     */
    public void setItemBodyCustomInteraction(AssessmentItemCEDSType.ItemBodyCustomInteraction value) {
        this.itemBodyCustomInteraction = value;
    }

    /**
     * Gets the value of the itemCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemCEDSType.ItemCharacteristic }
     *     
     */
    public AssessmentItemCEDSType.ItemCharacteristic getItemCharacteristic() {
        return itemCharacteristic;
    }

    /**
     * Sets the value of the itemCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemCEDSType.ItemCharacteristic }
     *     
     */
    public void setItemCharacteristic(AssessmentItemCEDSType.ItemCharacteristic value) {
        this.itemCharacteristic = value;
    }

    /**
     * Gets the value of the assessmentRubric property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemCEDSType.AssessmentRubric }
     *     
     */
    public AssessmentItemCEDSType.AssessmentRubric getAssessmentRubric() {
        return assessmentRubric;
    }

    /**
     * Sets the value of the assessmentRubric property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemCEDSType.AssessmentRubric }
     *     
     */
    public void setAssessmentRubric(AssessmentItemCEDSType.AssessmentRubric value) {
        this.assessmentRubric = value;
    }

    /**
     * Gets the value of the apip property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemCEDSType.Apip }
     *     
     */
    public AssessmentItemCEDSType.Apip getApip() {
        return apip;
    }

    /**
     * Sets the value of the apip property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemCEDSType.Apip }
     *     
     */
    public void setApip(AssessmentItemCEDSType.Apip value) {
        this.apip = value;
    }

    /**
     * Gets the value of the apipInteraction property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemCEDSType.ApipInteraction }
     *     
     */
    public AssessmentItemCEDSType.ApipInteraction getApipInteraction() {
        return apipInteraction;
    }

    /**
     * Sets the value of the apipInteraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemCEDSType.ApipInteraction }
     *     
     */
    public void setApipInteraction(AssessmentItemCEDSType.ApipInteraction value) {
        this.apipInteraction = value;
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
     *         &lt;element name="assessmentItemAdaptiveIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemAPIPItemBodyXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemAPIPModalFeedbackXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemAPIPOutcomeDeclarationXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemAPIPResponseDeclarationXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemAPIPResponseProcessingTemplateURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemAPIPResponseProcessingXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemAPIPTemplateDeclarationXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemAPIPTemplateProcessingXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResultXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentItemAdaptiveIndicator",
        "assessmentItemAPIPItemBodyXML",
        "assessmentItemAPIPModalFeedbackXML",
        "assessmentItemAPIPOutcomeDeclarationXML",
        "assessmentItemAPIPResponseDeclarationXML",
        "assessmentItemAPIPResponseProcessingTemplateURL",
        "assessmentItemAPIPResponseProcessingXML",
        "assessmentItemAPIPTemplateDeclarationXML",
        "assessmentItemAPIPTemplateProcessingXML",
        "assessmentItemResultXML"
    })
    public static class Apip {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemAdaptiveIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemAPIPItemBodyXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemAPIPModalFeedbackXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemAPIPOutcomeDeclarationXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemAPIPResponseDeclarationXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemAPIPResponseProcessingTemplateURL;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemAPIPResponseProcessingXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemAPIPTemplateDeclarationXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemAPIPTemplateProcessingXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResultXML;

        /**
         * Gets the value of the assessmentItemAdaptiveIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemAdaptiveIndicator() {
            return assessmentItemAdaptiveIndicator;
        }

        /**
         * Sets the value of the assessmentItemAdaptiveIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemAdaptiveIndicator(String value) {
            this.assessmentItemAdaptiveIndicator = value;
        }

        /**
         * Gets the value of the assessmentItemAPIPItemBodyXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemAPIPItemBodyXML() {
            return assessmentItemAPIPItemBodyXML;
        }

        /**
         * Sets the value of the assessmentItemAPIPItemBodyXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemAPIPItemBodyXML(String value) {
            this.assessmentItemAPIPItemBodyXML = value;
        }

        /**
         * Gets the value of the assessmentItemAPIPModalFeedbackXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemAPIPModalFeedbackXML() {
            return assessmentItemAPIPModalFeedbackXML;
        }

        /**
         * Sets the value of the assessmentItemAPIPModalFeedbackXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemAPIPModalFeedbackXML(String value) {
            this.assessmentItemAPIPModalFeedbackXML = value;
        }

        /**
         * Gets the value of the assessmentItemAPIPOutcomeDeclarationXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemAPIPOutcomeDeclarationXML() {
            return assessmentItemAPIPOutcomeDeclarationXML;
        }

        /**
         * Sets the value of the assessmentItemAPIPOutcomeDeclarationXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemAPIPOutcomeDeclarationXML(String value) {
            this.assessmentItemAPIPOutcomeDeclarationXML = value;
        }

        /**
         * Gets the value of the assessmentItemAPIPResponseDeclarationXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemAPIPResponseDeclarationXML() {
            return assessmentItemAPIPResponseDeclarationXML;
        }

        /**
         * Sets the value of the assessmentItemAPIPResponseDeclarationXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemAPIPResponseDeclarationXML(String value) {
            this.assessmentItemAPIPResponseDeclarationXML = value;
        }

        /**
         * Gets the value of the assessmentItemAPIPResponseProcessingTemplateURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemAPIPResponseProcessingTemplateURL() {
            return assessmentItemAPIPResponseProcessingTemplateURL;
        }

        /**
         * Sets the value of the assessmentItemAPIPResponseProcessingTemplateURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemAPIPResponseProcessingTemplateURL(String value) {
            this.assessmentItemAPIPResponseProcessingTemplateURL = value;
        }

        /**
         * Gets the value of the assessmentItemAPIPResponseProcessingXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemAPIPResponseProcessingXML() {
            return assessmentItemAPIPResponseProcessingXML;
        }

        /**
         * Sets the value of the assessmentItemAPIPResponseProcessingXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemAPIPResponseProcessingXML(String value) {
            this.assessmentItemAPIPResponseProcessingXML = value;
        }

        /**
         * Gets the value of the assessmentItemAPIPTemplateDeclarationXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemAPIPTemplateDeclarationXML() {
            return assessmentItemAPIPTemplateDeclarationXML;
        }

        /**
         * Sets the value of the assessmentItemAPIPTemplateDeclarationXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemAPIPTemplateDeclarationXML(String value) {
            this.assessmentItemAPIPTemplateDeclarationXML = value;
        }

        /**
         * Gets the value of the assessmentItemAPIPTemplateProcessingXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemAPIPTemplateProcessingXML() {
            return assessmentItemAPIPTemplateProcessingXML;
        }

        /**
         * Sets the value of the assessmentItemAPIPTemplateProcessingXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemAPIPTemplateProcessingXML(String value) {
            this.assessmentItemAPIPTemplateProcessingXML = value;
        }

        /**
         * Gets the value of the assessmentItemResultXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResultXML() {
            return assessmentItemResultXML;
        }

        /**
         * Sets the value of the assessmentItemResultXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResultXML(String value) {
            this.assessmentItemResultXML = value;
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
     *         &lt;element name="assessmentItemBodyAssociateInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyChoiceInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyDrawingInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyEndAttemptInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyExtendedTextInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyGapMatchInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyGraphicGapMatchInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyGraphicOrderInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyHotSpotInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyHottextInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyInlineChoiceInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyMatchInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyMediaInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyOrderInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyPositionObjectInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodySelectPointInteraction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodySelectPointInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodySliderInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyTextEntryInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemBodyUploadInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemInteractionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentItemBodyAssociateInteractionXML",
        "assessmentItemBodyChoiceInteractionXML",
        "assessmentItemBodyDrawingInteractionXML",
        "assessmentItemBodyEndAttemptInteractionXML",
        "assessmentItemBodyExtendedTextInteractionXML",
        "assessmentItemBodyGapMatchInteractionXML",
        "assessmentItemBodyGraphicGapMatchInteractionXML",
        "assessmentItemBodyGraphicOrderInteractionXML",
        "assessmentItemBodyHotSpotInteractionXML",
        "assessmentItemBodyHottextInteractionXML",
        "assessmentItemBodyInlineChoiceInteractionXML",
        "assessmentItemBodyMatchInteractionXML",
        "assessmentItemBodyMediaInteractionXML",
        "assessmentItemBodyOrderInteractionXML",
        "assessmentItemBodyPositionObjectInteractionXML",
        "assessmentItemBodySelectPointInteraction",
        "assessmentItemBodySelectPointInteractionXML",
        "assessmentItemBodySliderInteractionXML",
        "assessmentItemBodyTextEntryInteractionXML",
        "assessmentItemBodyUploadInteractionXML",
        "assessmentItemInteractionType"
    })
    public static class ApipInteraction {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyAssociateInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyChoiceInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyDrawingInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyEndAttemptInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyExtendedTextInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyGapMatchInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyGraphicGapMatchInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyGraphicOrderInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyHotSpotInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyHottextInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyInlineChoiceInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyMatchInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyMediaInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyOrderInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyPositionObjectInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodySelectPointInteraction;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodySelectPointInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodySliderInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyTextEntryInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyUploadInteractionXML;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemInteractionType;

        /**
         * Gets the value of the assessmentItemBodyAssociateInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyAssociateInteractionXML() {
            return assessmentItemBodyAssociateInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyAssociateInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyAssociateInteractionXML(String value) {
            this.assessmentItemBodyAssociateInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyChoiceInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyChoiceInteractionXML() {
            return assessmentItemBodyChoiceInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyChoiceInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyChoiceInteractionXML(String value) {
            this.assessmentItemBodyChoiceInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyDrawingInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyDrawingInteractionXML() {
            return assessmentItemBodyDrawingInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyDrawingInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyDrawingInteractionXML(String value) {
            this.assessmentItemBodyDrawingInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyEndAttemptInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyEndAttemptInteractionXML() {
            return assessmentItemBodyEndAttemptInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyEndAttemptInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyEndAttemptInteractionXML(String value) {
            this.assessmentItemBodyEndAttemptInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyExtendedTextInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyExtendedTextInteractionXML() {
            return assessmentItemBodyExtendedTextInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyExtendedTextInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyExtendedTextInteractionXML(String value) {
            this.assessmentItemBodyExtendedTextInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyGapMatchInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyGapMatchInteractionXML() {
            return assessmentItemBodyGapMatchInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyGapMatchInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyGapMatchInteractionXML(String value) {
            this.assessmentItemBodyGapMatchInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyGraphicGapMatchInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyGraphicGapMatchInteractionXML() {
            return assessmentItemBodyGraphicGapMatchInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyGraphicGapMatchInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyGraphicGapMatchInteractionXML(String value) {
            this.assessmentItemBodyGraphicGapMatchInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyGraphicOrderInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyGraphicOrderInteractionXML() {
            return assessmentItemBodyGraphicOrderInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyGraphicOrderInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyGraphicOrderInteractionXML(String value) {
            this.assessmentItemBodyGraphicOrderInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyHotSpotInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyHotSpotInteractionXML() {
            return assessmentItemBodyHotSpotInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyHotSpotInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyHotSpotInteractionXML(String value) {
            this.assessmentItemBodyHotSpotInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyHottextInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyHottextInteractionXML() {
            return assessmentItemBodyHottextInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyHottextInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyHottextInteractionXML(String value) {
            this.assessmentItemBodyHottextInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyInlineChoiceInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyInlineChoiceInteractionXML() {
            return assessmentItemBodyInlineChoiceInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyInlineChoiceInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyInlineChoiceInteractionXML(String value) {
            this.assessmentItemBodyInlineChoiceInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyMatchInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyMatchInteractionXML() {
            return assessmentItemBodyMatchInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyMatchInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyMatchInteractionXML(String value) {
            this.assessmentItemBodyMatchInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyMediaInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyMediaInteractionXML() {
            return assessmentItemBodyMediaInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyMediaInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyMediaInteractionXML(String value) {
            this.assessmentItemBodyMediaInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyOrderInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyOrderInteractionXML() {
            return assessmentItemBodyOrderInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyOrderInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyOrderInteractionXML(String value) {
            this.assessmentItemBodyOrderInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyPositionObjectInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyPositionObjectInteractionXML() {
            return assessmentItemBodyPositionObjectInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyPositionObjectInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyPositionObjectInteractionXML(String value) {
            this.assessmentItemBodyPositionObjectInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodySelectPointInteraction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodySelectPointInteraction() {
            return assessmentItemBodySelectPointInteraction;
        }

        /**
         * Sets the value of the assessmentItemBodySelectPointInteraction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodySelectPointInteraction(String value) {
            this.assessmentItemBodySelectPointInteraction = value;
        }

        /**
         * Gets the value of the assessmentItemBodySelectPointInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodySelectPointInteractionXML() {
            return assessmentItemBodySelectPointInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodySelectPointInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodySelectPointInteractionXML(String value) {
            this.assessmentItemBodySelectPointInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodySliderInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodySliderInteractionXML() {
            return assessmentItemBodySliderInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodySliderInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodySliderInteractionXML(String value) {
            this.assessmentItemBodySliderInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyTextEntryInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyTextEntryInteractionXML() {
            return assessmentItemBodyTextEntryInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyTextEntryInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyTextEntryInteractionXML(String value) {
            this.assessmentItemBodyTextEntryInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemBodyUploadInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyUploadInteractionXML() {
            return assessmentItemBodyUploadInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyUploadInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyUploadInteractionXML(String value) {
            this.assessmentItemBodyUploadInteractionXML = value;
        }

        /**
         * Gets the value of the assessmentItemInteractionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemInteractionType() {
            return assessmentItemInteractionType;
        }

        /**
         * Sets the value of the assessmentItemInteractionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemInteractionType(String value) {
            this.assessmentItemInteractionType = value;
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
     *         &lt;element name="assessmentRubricIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentRubricTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentRubricURLReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricCriterionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricCriterionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricCriterionLevelDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricCriterionLevelFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricCriterionLevelPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricCriterionLevelQualityLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricCriterionLevelScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricCriterionPosition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricCriterionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricCriterionWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="rubricDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentRubricIdentifier",
        "assessmentRubricTitle",
        "assessmentRubricURLReference",
        "rubricCriterionCategory",
        "rubricCriterionDescription",
        "rubricCriterionLevelDescription",
        "rubricCriterionLevelFeedback",
        "rubricCriterionLevelPosition",
        "rubricCriterionLevelQualityLabel",
        "rubricCriterionLevelScore",
        "rubricCriterionPosition",
        "rubricCriterionTitle",
        "rubricCriterionWeight",
        "rubricDescription"
    })
    public static class AssessmentRubric {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentRubricIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentRubricTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentRubricURLReference;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricCriterionCategory;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricCriterionDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricCriterionLevelDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricCriterionLevelFeedback;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricCriterionLevelPosition;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricCriterionLevelQualityLabel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricCriterionLevelScore;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricCriterionPosition;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricCriterionTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricCriterionWeight;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String rubricDescription;

        /**
         * Gets the value of the assessmentRubricIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentRubricIdentifier() {
            return assessmentRubricIdentifier;
        }

        /**
         * Sets the value of the assessmentRubricIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentRubricIdentifier(String value) {
            this.assessmentRubricIdentifier = value;
        }

        /**
         * Gets the value of the assessmentRubricTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentRubricTitle() {
            return assessmentRubricTitle;
        }

        /**
         * Sets the value of the assessmentRubricTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentRubricTitle(String value) {
            this.assessmentRubricTitle = value;
        }

        /**
         * Gets the value of the assessmentRubricURLReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentRubricURLReference() {
            return assessmentRubricURLReference;
        }

        /**
         * Sets the value of the assessmentRubricURLReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentRubricURLReference(String value) {
            this.assessmentRubricURLReference = value;
        }

        /**
         * Gets the value of the rubricCriterionCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricCriterionCategory() {
            return rubricCriterionCategory;
        }

        /**
         * Sets the value of the rubricCriterionCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricCriterionCategory(String value) {
            this.rubricCriterionCategory = value;
        }

        /**
         * Gets the value of the rubricCriterionDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricCriterionDescription() {
            return rubricCriterionDescription;
        }

        /**
         * Sets the value of the rubricCriterionDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricCriterionDescription(String value) {
            this.rubricCriterionDescription = value;
        }

        /**
         * Gets the value of the rubricCriterionLevelDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricCriterionLevelDescription() {
            return rubricCriterionLevelDescription;
        }

        /**
         * Sets the value of the rubricCriterionLevelDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricCriterionLevelDescription(String value) {
            this.rubricCriterionLevelDescription = value;
        }

        /**
         * Gets the value of the rubricCriterionLevelFeedback property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricCriterionLevelFeedback() {
            return rubricCriterionLevelFeedback;
        }

        /**
         * Sets the value of the rubricCriterionLevelFeedback property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricCriterionLevelFeedback(String value) {
            this.rubricCriterionLevelFeedback = value;
        }

        /**
         * Gets the value of the rubricCriterionLevelPosition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricCriterionLevelPosition() {
            return rubricCriterionLevelPosition;
        }

        /**
         * Sets the value of the rubricCriterionLevelPosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricCriterionLevelPosition(String value) {
            this.rubricCriterionLevelPosition = value;
        }

        /**
         * Gets the value of the rubricCriterionLevelQualityLabel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricCriterionLevelQualityLabel() {
            return rubricCriterionLevelQualityLabel;
        }

        /**
         * Sets the value of the rubricCriterionLevelQualityLabel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricCriterionLevelQualityLabel(String value) {
            this.rubricCriterionLevelQualityLabel = value;
        }

        /**
         * Gets the value of the rubricCriterionLevelScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricCriterionLevelScore() {
            return rubricCriterionLevelScore;
        }

        /**
         * Sets the value of the rubricCriterionLevelScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricCriterionLevelScore(String value) {
            this.rubricCriterionLevelScore = value;
        }

        /**
         * Gets the value of the rubricCriterionPosition property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricCriterionPosition() {
            return rubricCriterionPosition;
        }

        /**
         * Sets the value of the rubricCriterionPosition property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricCriterionPosition(String value) {
            this.rubricCriterionPosition = value;
        }

        /**
         * Gets the value of the rubricCriterionTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricCriterionTitle() {
            return rubricCriterionTitle;
        }

        /**
         * Sets the value of the rubricCriterionTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricCriterionTitle(String value) {
            this.rubricCriterionTitle = value;
        }

        /**
         * Gets the value of the rubricCriterionWeight property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricCriterionWeight() {
            return rubricCriterionWeight;
        }

        /**
         * Sets the value of the rubricCriterionWeight property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricCriterionWeight(String value) {
            this.rubricCriterionWeight = value;
        }

        /**
         * Gets the value of the rubricDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRubricDescription() {
            return rubricDescription;
        }

        /**
         * Sets the value of the rubricDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRubricDescription(String value) {
            this.rubricDescription = value;
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
     *         &lt;element name="assessmentItemBodyCustomInteractionXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentItemBodyCustomInteractionXML"
    })
    public static class ItemBodyCustomInteraction {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemBodyCustomInteractionXML;

        /**
         * Gets the value of the assessmentItemBodyCustomInteractionXML property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemBodyCustomInteractionXML() {
            return assessmentItemBodyCustomInteractionXML;
        }

        /**
         * Sets the value of the assessmentItemBodyCustomInteractionXML property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemBodyCustomInteractionXML(String value) {
            this.assessmentItemBodyCustomInteractionXML = value;
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
     *         &lt;element name="assessmentItemCharacteristicValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemCharacteristicType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentItemCharacteristicValue",
        "assessmentItemCharacteristicType"
    })
    public static class ItemCharacteristic {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemCharacteristicValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemCharacteristicType;

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
     *         &lt;element name="assessmentItemPossibleResponseSequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemPossibleResponse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemPossibleResponseOption" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemPossibleResponseCorrectIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemPossibleResponseFeedbackMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentItemPossibleResponseSequenceNumber",
        "assessmentItemPossibleResponse",
        "assessmentItemPossibleResponseOption",
        "assessmentItemPossibleResponseCorrectIndicator",
        "assessmentItemPossibleResponseFeedbackMessage"
    })
    public static class ItemPossibleResponse {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemPossibleResponseSequenceNumber;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemPossibleResponse;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemPossibleResponseOption;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemPossibleResponseCorrectIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemPossibleResponseFeedbackMessage;

        /**
         * Gets the value of the assessmentItemPossibleResponseSequenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemPossibleResponseSequenceNumber() {
            return assessmentItemPossibleResponseSequenceNumber;
        }

        /**
         * Sets the value of the assessmentItemPossibleResponseSequenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemPossibleResponseSequenceNumber(String value) {
            this.assessmentItemPossibleResponseSequenceNumber = value;
        }

        /**
         * Gets the value of the assessmentItemPossibleResponse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemPossibleResponse() {
            return assessmentItemPossibleResponse;
        }

        /**
         * Sets the value of the assessmentItemPossibleResponse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemPossibleResponse(String value) {
            this.assessmentItemPossibleResponse = value;
        }

        /**
         * Gets the value of the assessmentItemPossibleResponseOption property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemPossibleResponseOption() {
            return assessmentItemPossibleResponseOption;
        }

        /**
         * Sets the value of the assessmentItemPossibleResponseOption property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemPossibleResponseOption(String value) {
            this.assessmentItemPossibleResponseOption = value;
        }

        /**
         * Gets the value of the assessmentItemPossibleResponseCorrectIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemPossibleResponseCorrectIndicator() {
            return assessmentItemPossibleResponseCorrectIndicator;
        }

        /**
         * Sets the value of the assessmentItemPossibleResponseCorrectIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemPossibleResponseCorrectIndicator(String value) {
            this.assessmentItemPossibleResponseCorrectIndicator = value;
        }

        /**
         * Gets the value of the assessmentItemPossibleResponseFeedbackMessage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemPossibleResponseFeedbackMessage() {
            return assessmentItemPossibleResponseFeedbackMessage;
        }

        /**
         * Sets the value of the assessmentItemPossibleResponseFeedbackMessage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemPossibleResponseFeedbackMessage(String value) {
            this.assessmentItemPossibleResponseFeedbackMessage = value;
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
     *         &lt;element name="assessmentItemResponseStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseAidSetUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseScoreValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseChoicePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseDescriptiveFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseScaffoldingItemFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseHintCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseHintIncludedAnswer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseFirstAttemptDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proficiencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentItemResponseStartDate",
        "assessmentItemResponseStartTime",
        "assessmentItemResponseDuration",
        "assessmentItemResponseStatus",
        "assessmentItemResponseAidSetUsed",
        "assessmentItemResponseScoreValue",
        "assessmentItemResponseChoicePattern",
        "assessmentItemResponseDescriptiveFeedback",
        "assessmentItemResponseScaffoldingItemFlag",
        "assessmentItemResponseHintCount",
        "assessmentItemResponseHintIncludedAnswer",
        "assessmentItemResponseFirstAttemptDuration",
        "proficiencyStatus",
        "assessmentItemResponseValue"
    })
    public static class ItemResponse {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseStartTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseDuration;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseAidSetUsed;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseScoreValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseChoicePattern;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseDescriptiveFeedback;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseScaffoldingItemFlag;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseHintCount;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseHintIncludedAnswer;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseFirstAttemptDuration;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String proficiencyStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseValue;

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
         * Gets the value of the assessmentItemResponseScaffoldingItemFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseScaffoldingItemFlag() {
            return assessmentItemResponseScaffoldingItemFlag;
        }

        /**
         * Sets the value of the assessmentItemResponseScaffoldingItemFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseScaffoldingItemFlag(String value) {
            this.assessmentItemResponseScaffoldingItemFlag = value;
        }

        /**
         * Gets the value of the assessmentItemResponseHintCount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseHintCount() {
            return assessmentItemResponseHintCount;
        }

        /**
         * Sets the value of the assessmentItemResponseHintCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseHintCount(String value) {
            this.assessmentItemResponseHintCount = value;
        }

        /**
         * Gets the value of the assessmentItemResponseHintIncludedAnswer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseHintIncludedAnswer() {
            return assessmentItemResponseHintIncludedAnswer;
        }

        /**
         * Sets the value of the assessmentItemResponseHintIncludedAnswer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseHintIncludedAnswer(String value) {
            this.assessmentItemResponseHintIncludedAnswer = value;
        }

        /**
         * Gets the value of the assessmentItemResponseFirstAttemptDuration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseFirstAttemptDuration() {
            return assessmentItemResponseFirstAttemptDuration;
        }

        /**
         * Sets the value of the assessmentItemResponseFirstAttemptDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseFirstAttemptDuration(String value) {
            this.assessmentItemResponseFirstAttemptDuration = value;
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
     *         &lt;element name="assessmentItemResponseTheoryParameterA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryParameterB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryParameterDifficultyCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryParameterC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryParameterD1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryParameterD2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryParameterD3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryParameterD4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryParameterD5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryParameterD6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryPointBiserialCorrelationValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryDIFValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryKappaValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentItemResponseTheoryKappaAlgorithm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentItemResponseTheoryParameterA",
        "assessmentItemResponseTheoryParameterB",
        "assessmentItemResponseTheoryParameterDifficultyCategory",
        "assessmentItemResponseTheoryParameterC",
        "assessmentItemResponseTheoryParameterD1",
        "assessmentItemResponseTheoryParameterD2",
        "assessmentItemResponseTheoryParameterD3",
        "assessmentItemResponseTheoryParameterD4",
        "assessmentItemResponseTheoryParameterD5",
        "assessmentItemResponseTheoryParameterD6",
        "assessmentItemResponseTheoryPointBiserialCorrelationValue",
        "assessmentItemResponseTheoryDIFValue",
        "assessmentItemResponseTheoryKappaValue",
        "assessmentItemResponseTheoryKappaAlgorithm"
    })
    public static class ItemResponseTheory {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryParameterA;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryParameterB;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryParameterDifficultyCategory;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryParameterC;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryParameterD1;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryParameterD2;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryParameterD3;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryParameterD4;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryParameterD5;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryParameterD6;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryPointBiserialCorrelationValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryDIFValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryKappaValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentItemResponseTheoryKappaAlgorithm;

        /**
         * Gets the value of the assessmentItemResponseTheoryParameterA property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryParameterA() {
            return assessmentItemResponseTheoryParameterA;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryParameterA property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryParameterA(String value) {
            this.assessmentItemResponseTheoryParameterA = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryParameterB property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryParameterB() {
            return assessmentItemResponseTheoryParameterB;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryParameterB property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryParameterB(String value) {
            this.assessmentItemResponseTheoryParameterB = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryParameterDifficultyCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryParameterDifficultyCategory() {
            return assessmentItemResponseTheoryParameterDifficultyCategory;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryParameterDifficultyCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryParameterDifficultyCategory(String value) {
            this.assessmentItemResponseTheoryParameterDifficultyCategory = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryParameterC property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryParameterC() {
            return assessmentItemResponseTheoryParameterC;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryParameterC property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryParameterC(String value) {
            this.assessmentItemResponseTheoryParameterC = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryParameterD1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryParameterD1() {
            return assessmentItemResponseTheoryParameterD1;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryParameterD1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryParameterD1(String value) {
            this.assessmentItemResponseTheoryParameterD1 = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryParameterD2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryParameterD2() {
            return assessmentItemResponseTheoryParameterD2;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryParameterD2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryParameterD2(String value) {
            this.assessmentItemResponseTheoryParameterD2 = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryParameterD3 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryParameterD3() {
            return assessmentItemResponseTheoryParameterD3;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryParameterD3 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryParameterD3(String value) {
            this.assessmentItemResponseTheoryParameterD3 = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryParameterD4 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryParameterD4() {
            return assessmentItemResponseTheoryParameterD4;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryParameterD4 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryParameterD4(String value) {
            this.assessmentItemResponseTheoryParameterD4 = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryParameterD5 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryParameterD5() {
            return assessmentItemResponseTheoryParameterD5;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryParameterD5 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryParameterD5(String value) {
            this.assessmentItemResponseTheoryParameterD5 = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryParameterD6 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryParameterD6() {
            return assessmentItemResponseTheoryParameterD6;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryParameterD6 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryParameterD6(String value) {
            this.assessmentItemResponseTheoryParameterD6 = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryPointBiserialCorrelationValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryPointBiserialCorrelationValue() {
            return assessmentItemResponseTheoryPointBiserialCorrelationValue;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryPointBiserialCorrelationValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryPointBiserialCorrelationValue(String value) {
            this.assessmentItemResponseTheoryPointBiserialCorrelationValue = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryDIFValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryDIFValue() {
            return assessmentItemResponseTheoryDIFValue;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryDIFValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryDIFValue(String value) {
            this.assessmentItemResponseTheoryDIFValue = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryKappaValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryKappaValue() {
            return assessmentItemResponseTheoryKappaValue;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryKappaValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryKappaValue(String value) {
            this.assessmentItemResponseTheoryKappaValue = value;
        }

        /**
         * Gets the value of the assessmentItemResponseTheoryKappaAlgorithm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentItemResponseTheoryKappaAlgorithm() {
            return assessmentItemResponseTheoryKappaAlgorithm;
        }

        /**
         * Sets the value of the assessmentItemResponseTheoryKappaAlgorithm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentItemResponseTheoryKappaAlgorithm(String value) {
            this.assessmentItemResponseTheoryKappaAlgorithm = value;
        }

    }

}
