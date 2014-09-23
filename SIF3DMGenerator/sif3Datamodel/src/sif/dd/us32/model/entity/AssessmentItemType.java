
package sif.dd.us32.model.entity;

import java.math.BigDecimal;
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
 * This object is designed to allow software systems to provide item detail information such as the stem of the item, the distractors, the stimuli, etc. This initial version of the object does not deal with presentation aspects of the item. Instead it focuses on the item content and characteristics needed to enable interoperability and the usage of item-level information in the improvement of learning and instruction.
 * 
 * <p>Java class for assessmentItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="assessmentFormRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="itemLabel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="responseType" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="itemVersion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="itemPublishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="assessmentIdentifierList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentIdentifier" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                           &lt;attribute name="assessmentIdType" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentSubjectList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentSubject" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentGradeLevelList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentGradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentLanguageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentLanguage" type="{http://www.sifassociation.org/datamodel/na/3.2}gLanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="learningStandardItemRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="learningStandardItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentItemAssetRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemAssetRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="stem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responseChoiceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="responseChoice" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="choiceLabel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="choiceContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="creditValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="responseFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="itemFeedbackCorrect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemFeedbackIncorrect" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemFeedbackHint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="itemScoreMaximum" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="itemScoreMinimum" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="itemRubricIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="itemRubricId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentItemBankList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemBank" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="assessmentItemBankId" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType"/>
 *                             &lt;element name="assessmentItemBankName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
 *         &lt;element name="assessmentItemPlatformList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItemPlatform" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentItemType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentFormRefId",
    "itemLabel",
    "responseType",
    "itemName",
    "itemVersion",
    "itemPublishDate",
    "assessmentIdentifierList",
    "assessmentSubjectList",
    "assessmentGradeLevelList",
    "assessmentLanguageList",
    "learningStandardItemRefIdList",
    "assessmentItemAssetRefIdList",
    "stem",
    "responseChoiceList",
    "itemFeedbackCorrect",
    "itemFeedbackIncorrect",
    "itemFeedbackHint",
    "itemScoreMaximum",
    "itemScoreMinimum",
    "itemRubricIdList",
    "assessmentItemBankList",
    "assessmentItemPlatformList"
})
public class AssessmentItemType
    extends GOtherSIFType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String assessmentFormRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemLabel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String responseType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String itemName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar itemPublishDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemType.AssessmentIdentifierList assessmentIdentifierList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemType.AssessmentSubjectList assessmentSubjectList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemType.AssessmentGradeLevelList assessmentGradeLevelList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemType.AssessmentLanguageList assessmentLanguageList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemType.LearningStandardItemRefIdList learningStandardItemRefIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemType.AssessmentItemAssetRefIdList assessmentItemAssetRefIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String stem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemType.ResponseChoiceList responseChoiceList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String itemFeedbackCorrect;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String itemFeedbackIncorrect;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String itemFeedbackHint;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemScoreMaximum;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemScoreMinimum;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemType.ItemRubricIdList itemRubricIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemType.AssessmentItemBankList assessmentItemBankList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentItemType.AssessmentItemPlatformList assessmentItemPlatformList;

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
     * Gets the value of the itemLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemLabel() {
        return itemLabel;
    }

    /**
     * Sets the value of the itemLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemLabel(String value) {
        this.itemLabel = value;
    }

    /**
     * Gets the value of the responseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseType() {
        return responseType;
    }

    /**
     * Sets the value of the responseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseType(String value) {
        this.responseType = value;
    }

    /**
     * Gets the value of the itemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Sets the value of the itemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemName(String value) {
        this.itemName = value;
    }

    /**
     * Gets the value of the itemVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemVersion() {
        return itemVersion;
    }

    /**
     * Sets the value of the itemVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemVersion(String value) {
        this.itemVersion = value;
    }

    /**
     * Gets the value of the itemPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getItemPublishDate() {
        return itemPublishDate;
    }

    /**
     * Sets the value of the itemPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setItemPublishDate(XMLGregorianCalendar value) {
        this.itemPublishDate = value;
    }

    /**
     * Gets the value of the assessmentIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemType.AssessmentIdentifierList }
     *     
     */
    public AssessmentItemType.AssessmentIdentifierList getAssessmentIdentifierList() {
        return assessmentIdentifierList;
    }

    /**
     * Sets the value of the assessmentIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemType.AssessmentIdentifierList }
     *     
     */
    public void setAssessmentIdentifierList(AssessmentItemType.AssessmentIdentifierList value) {
        this.assessmentIdentifierList = value;
    }

    /**
     * Gets the value of the assessmentSubjectList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemType.AssessmentSubjectList }
     *     
     */
    public AssessmentItemType.AssessmentSubjectList getAssessmentSubjectList() {
        return assessmentSubjectList;
    }

    /**
     * Sets the value of the assessmentSubjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemType.AssessmentSubjectList }
     *     
     */
    public void setAssessmentSubjectList(AssessmentItemType.AssessmentSubjectList value) {
        this.assessmentSubjectList = value;
    }

    /**
     * Gets the value of the assessmentGradeLevelList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemType.AssessmentGradeLevelList }
     *     
     */
    public AssessmentItemType.AssessmentGradeLevelList getAssessmentGradeLevelList() {
        return assessmentGradeLevelList;
    }

    /**
     * Sets the value of the assessmentGradeLevelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemType.AssessmentGradeLevelList }
     *     
     */
    public void setAssessmentGradeLevelList(AssessmentItemType.AssessmentGradeLevelList value) {
        this.assessmentGradeLevelList = value;
    }

    /**
     * Gets the value of the assessmentLanguageList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemType.AssessmentLanguageList }
     *     
     */
    public AssessmentItemType.AssessmentLanguageList getAssessmentLanguageList() {
        return assessmentLanguageList;
    }

    /**
     * Sets the value of the assessmentLanguageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemType.AssessmentLanguageList }
     *     
     */
    public void setAssessmentLanguageList(AssessmentItemType.AssessmentLanguageList value) {
        this.assessmentLanguageList = value;
    }

    /**
     * Gets the value of the learningStandardItemRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemType.LearningStandardItemRefIdList }
     *     
     */
    public AssessmentItemType.LearningStandardItemRefIdList getLearningStandardItemRefIdList() {
        return learningStandardItemRefIdList;
    }

    /**
     * Sets the value of the learningStandardItemRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemType.LearningStandardItemRefIdList }
     *     
     */
    public void setLearningStandardItemRefIdList(AssessmentItemType.LearningStandardItemRefIdList value) {
        this.learningStandardItemRefIdList = value;
    }

    /**
     * Gets the value of the assessmentItemAssetRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemType.AssessmentItemAssetRefIdList }
     *     
     */
    public AssessmentItemType.AssessmentItemAssetRefIdList getAssessmentItemAssetRefIdList() {
        return assessmentItemAssetRefIdList;
    }

    /**
     * Sets the value of the assessmentItemAssetRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemType.AssessmentItemAssetRefIdList }
     *     
     */
    public void setAssessmentItemAssetRefIdList(AssessmentItemType.AssessmentItemAssetRefIdList value) {
        this.assessmentItemAssetRefIdList = value;
    }

    /**
     * Gets the value of the stem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStem() {
        return stem;
    }

    /**
     * Sets the value of the stem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStem(String value) {
        this.stem = value;
    }

    /**
     * Gets the value of the responseChoiceList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemType.ResponseChoiceList }
     *     
     */
    public AssessmentItemType.ResponseChoiceList getResponseChoiceList() {
        return responseChoiceList;
    }

    /**
     * Sets the value of the responseChoiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemType.ResponseChoiceList }
     *     
     */
    public void setResponseChoiceList(AssessmentItemType.ResponseChoiceList value) {
        this.responseChoiceList = value;
    }

    /**
     * Gets the value of the itemFeedbackCorrect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemFeedbackCorrect() {
        return itemFeedbackCorrect;
    }

    /**
     * Sets the value of the itemFeedbackCorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemFeedbackCorrect(String value) {
        this.itemFeedbackCorrect = value;
    }

    /**
     * Gets the value of the itemFeedbackIncorrect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemFeedbackIncorrect() {
        return itemFeedbackIncorrect;
    }

    /**
     * Sets the value of the itemFeedbackIncorrect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemFeedbackIncorrect(String value) {
        this.itemFeedbackIncorrect = value;
    }

    /**
     * Gets the value of the itemFeedbackHint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemFeedbackHint() {
        return itemFeedbackHint;
    }

    /**
     * Sets the value of the itemFeedbackHint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemFeedbackHint(String value) {
        this.itemFeedbackHint = value;
    }

    /**
     * Gets the value of the itemScoreMaximum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemScoreMaximum() {
        return itemScoreMaximum;
    }

    /**
     * Sets the value of the itemScoreMaximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemScoreMaximum(String value) {
        this.itemScoreMaximum = value;
    }

    /**
     * Gets the value of the itemScoreMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemScoreMinimum() {
        return itemScoreMinimum;
    }

    /**
     * Sets the value of the itemScoreMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemScoreMinimum(String value) {
        this.itemScoreMinimum = value;
    }

    /**
     * Gets the value of the itemRubricIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemType.ItemRubricIdList }
     *     
     */
    public AssessmentItemType.ItemRubricIdList getItemRubricIdList() {
        return itemRubricIdList;
    }

    /**
     * Sets the value of the itemRubricIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemType.ItemRubricIdList }
     *     
     */
    public void setItemRubricIdList(AssessmentItemType.ItemRubricIdList value) {
        this.itemRubricIdList = value;
    }

    /**
     * Gets the value of the assessmentItemBankList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemType.AssessmentItemBankList }
     *     
     */
    public AssessmentItemType.AssessmentItemBankList getAssessmentItemBankList() {
        return assessmentItemBankList;
    }

    /**
     * Sets the value of the assessmentItemBankList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemType.AssessmentItemBankList }
     *     
     */
    public void setAssessmentItemBankList(AssessmentItemType.AssessmentItemBankList value) {
        this.assessmentItemBankList = value;
    }

    /**
     * Gets the value of the assessmentItemPlatformList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentItemType.AssessmentItemPlatformList }
     *     
     */
    public AssessmentItemType.AssessmentItemPlatformList getAssessmentItemPlatformList() {
        return assessmentItemPlatformList;
    }

    /**
     * Sets the value of the assessmentItemPlatformList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentItemType.AssessmentItemPlatformList }
     *     
     */
    public void setAssessmentItemPlatformList(AssessmentItemType.AssessmentItemPlatformList value) {
        this.assessmentItemPlatformList = value;
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
     *         &lt;element name="assessmentGradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentGradeLevel"
    })
    public static class AssessmentGradeLevelList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GYearGroupType> assessmentGradeLevel;

        /**
         * Gets the value of the assessmentGradeLevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentGradeLevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentGradeLevel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GYearGroupType }
         * 
         * 
         */
        public List<GYearGroupType> getAssessmentGradeLevel() {
            if (assessmentGradeLevel == null) {
                assessmentGradeLevel = new ArrayList<GYearGroupType>();
            }
            return this.assessmentGradeLevel;
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
     *         &lt;element name="assessmentIdentifier" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *                 &lt;attribute name="assessmentIdType" type="{http://www.w3.org/2001/XMLSchema}token" />
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
        "assessmentIdentifier"
    })
    public static class AssessmentIdentifierList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentItemType.AssessmentIdentifierList.AssessmentIdentifier> assessmentIdentifier;

        /**
         * Gets the value of the assessmentIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentItemType.AssessmentIdentifierList.AssessmentIdentifier }
         * 
         * 
         */
        public List<AssessmentItemType.AssessmentIdentifierList.AssessmentIdentifier> getAssessmentIdentifier() {
            if (assessmentIdentifier == null) {
                assessmentIdentifier = new ArrayList<AssessmentItemType.AssessmentIdentifierList.AssessmentIdentifier>();
            }
            return this.assessmentIdentifier;
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
         *       &lt;attribute name="assessmentIdType" type="{http://www.w3.org/2001/XMLSchema}token" />
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
        public static class AssessmentIdentifier {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String value;
            @XmlAttribute(name = "assessmentIdType")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String assessmentIdType;

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
             * Gets the value of the assessmentIdType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssessmentIdType() {
                return assessmentIdType;
            }

            /**
             * Sets the value of the assessmentIdType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssessmentIdType(String value) {
                this.assessmentIdType = value;
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
     *         &lt;element name="assessmentItemAssetRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentItemAssetRefId"
    })
    public static class AssessmentItemAssetRefIdList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> assessmentItemAssetRefId;

        /**
         * Gets the value of the assessmentItemAssetRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentItemAssetRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentItemAssetRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssessmentItemAssetRefId() {
            if (assessmentItemAssetRefId == null) {
                assessmentItemAssetRefId = new ArrayList<String>();
            }
            return this.assessmentItemAssetRefId;
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
     *         &lt;element name="assessmentItemBank" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="assessmentItemBankId" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType"/>
     *                   &lt;element name="assessmentItemBankName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
        "assessmentItemBank"
    })
    public static class AssessmentItemBankList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentItemType.AssessmentItemBankList.AssessmentItemBank> assessmentItemBank;

        /**
         * Gets the value of the assessmentItemBank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentItemBank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentItemBank().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentItemType.AssessmentItemBankList.AssessmentItemBank }
         * 
         * 
         */
        public List<AssessmentItemType.AssessmentItemBankList.AssessmentItemBank> getAssessmentItemBank() {
            if (assessmentItemBank == null) {
                assessmentItemBank = new ArrayList<AssessmentItemType.AssessmentItemBankList.AssessmentItemBank>();
            }
            return this.assessmentItemBank;
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
         *         &lt;element name="assessmentItemBankId" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType"/>
         *         &lt;element name="assessmentItemBankName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
            "assessmentItemBankId",
            "assessmentItemBankName"
        })
        public static class AssessmentItemBank {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected GExternalIdType assessmentItemBankId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String assessmentItemBankName;

            /**
             * Gets the value of the assessmentItemBankId property.
             * 
             * @return
             *     possible object is
             *     {@link GExternalIdType }
             *     
             */
            public GExternalIdType getAssessmentItemBankId() {
                return assessmentItemBankId;
            }

            /**
             * Sets the value of the assessmentItemBankId property.
             * 
             * @param value
             *     allowed object is
             *     {@link GExternalIdType }
             *     
             */
            public void setAssessmentItemBankId(GExternalIdType value) {
                this.assessmentItemBankId = value;
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
     *         &lt;element name="assessmentItemPlatform" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentItemPlatform"
    })
    public static class AssessmentItemPlatformList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> assessmentItemPlatform;

        /**
         * Gets the value of the assessmentItemPlatform property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentItemPlatform property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentItemPlatform().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssessmentItemPlatform() {
            if (assessmentItemPlatform == null) {
                assessmentItemPlatform = new ArrayList<String>();
            }
            return this.assessmentItemPlatform;
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
     *         &lt;element name="assessmentLanguage" type="{http://www.sifassociation.org/datamodel/na/3.2}gLanguageType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentLanguage"
    })
    public static class AssessmentLanguageList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GLanguageType> assessmentLanguage;

        /**
         * Gets the value of the assessmentLanguage property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentLanguage property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GLanguageType }
         * 
         * 
         */
        public List<GLanguageType> getAssessmentLanguage() {
            if (assessmentLanguage == null) {
                assessmentLanguage = new ArrayList<GLanguageType>();
            }
            return this.assessmentLanguage;
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
     *         &lt;element name="assessmentSubject" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentSubject"
    })
    public static class AssessmentSubjectList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GSubjectAreaType> assessmentSubject;

        /**
         * Gets the value of the assessmentSubject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentSubject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GSubjectAreaType }
         * 
         * 
         */
        public List<GSubjectAreaType> getAssessmentSubject() {
            if (assessmentSubject == null) {
                assessmentSubject = new ArrayList<GSubjectAreaType>();
            }
            return this.assessmentSubject;
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
     *         &lt;element name="itemRubricId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "itemRubricId"
    })
    public static class ItemRubricIdList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> itemRubricId;

        /**
         * Gets the value of the itemRubricId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemRubricId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemRubricId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItemRubricId() {
            if (itemRubricId == null) {
                itemRubricId = new ArrayList<String>();
            }
            return this.itemRubricId;
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
     *         &lt;element name="learningStandardItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "learningStandardItemRefId"
    })
    public static class LearningStandardItemRefIdList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> learningStandardItemRefId;

        /**
         * Gets the value of the learningStandardItemRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the learningStandardItemRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLearningStandardItemRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLearningStandardItemRefId() {
            if (learningStandardItemRefId == null) {
                learningStandardItemRefId = new ArrayList<String>();
            }
            return this.learningStandardItemRefId;
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
     *         &lt;element name="responseChoice" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="choiceLabel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="choiceContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="creditValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="responseFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "responseChoice"
    })
    public static class ResponseChoiceList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentItemType.ResponseChoiceList.ResponseChoice> responseChoice;

        /**
         * Gets the value of the responseChoice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the responseChoice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getResponseChoice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentItemType.ResponseChoiceList.ResponseChoice }
         * 
         * 
         */
        public List<AssessmentItemType.ResponseChoiceList.ResponseChoice> getResponseChoice() {
            if (responseChoice == null) {
                responseChoice = new ArrayList<AssessmentItemType.ResponseChoiceList.ResponseChoice>();
            }
            return this.responseChoice;
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
         *         &lt;element name="choiceLabel" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="choiceContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="creditValue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="responseFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "choiceLabel",
            "choiceContent",
            "creditValue",
            "responseFeedback"
        })
        public static class ResponseChoice {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String choiceLabel;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            protected String choiceContent;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal creditValue;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String responseFeedback;

            /**
             * Gets the value of the choiceLabel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChoiceLabel() {
                return choiceLabel;
            }

            /**
             * Sets the value of the choiceLabel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChoiceLabel(String value) {
                this.choiceLabel = value;
            }

            /**
             * Gets the value of the choiceContent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChoiceContent() {
                return choiceContent;
            }

            /**
             * Sets the value of the choiceContent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChoiceContent(String value) {
                this.choiceContent = value;
            }

            /**
             * Gets the value of the creditValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getCreditValue() {
                return creditValue;
            }

            /**
             * Sets the value of the creditValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setCreditValue(BigDecimal value) {
                this.creditValue = value;
            }

            /**
             * Gets the value of the responseFeedback property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponseFeedback() {
                return responseFeedback;
            }

            /**
             * Sets the value of the responseFeedback property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponseFeedback(String value) {
                this.responseFeedback = value;
            }

        }

    }

}
