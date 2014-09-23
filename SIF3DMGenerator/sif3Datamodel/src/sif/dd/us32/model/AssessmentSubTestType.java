
package sif.dd.us32.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A psychological construct measured by the assessment. Operationally, a subtest is a class of scores on an assessment. Some assessments may have only one subtest or type of score but most assessments measure more than one psychological construct. The subtest can be based upon items in a section or items that are empirically related. Subtests can also be composites of other subtests that are combined using a particular algorithm. Examples of subtests of an assessment are math total, reading composite, total test, and English composition.
 * 
 * <p>Java class for assessmentSubTestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentSubTestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="subTestVersion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="subTestPublishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="subTestIdentifierList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subTestIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subTestName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="scoreScaleList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="scoreScale" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="scoreMetric" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                             &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="scoreTableRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
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
 *         &lt;element name="subTestSubjectAreaList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subTestSubjectArea" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="subTestGradeLevelList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subTestGradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentSubTestRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentSubTestRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="containerOnly" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="subTestTier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
 *         &lt;element name="abbreviation" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="numberOfItems" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="assessmentItemList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="assessmentItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *                             &lt;element name="itemWeightCorrect" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="itemWeightIncorrect" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="itemWeightNotAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentSubTestType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "subTestVersion",
    "subTestPublishDate",
    "subTestIdentifierList",
    "subTestName",
    "scoreScaleList",
    "subTestSubjectAreaList",
    "subTestGradeLevelList",
    "assessmentSubTestRefIdList",
    "containerOnly",
    "subTestTier",
    "learningStandardItemRefIdList",
    "abbreviation",
    "description",
    "numberOfItems",
    "assessmentItemList"
})
public class AssessmentSubTestType
    extends GOtherSIFType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String subTestVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar subTestPublishDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentSubTestType.SubTestIdentifierList subTestIdentifierList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subTestName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentSubTestType.ScoreScaleList scoreScaleList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentSubTestType.SubTestSubjectAreaList subTestSubjectAreaList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentSubTestType.SubTestGradeLevelList subTestGradeLevelList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentSubTestType.AssessmentSubTestRefIdList assessmentSubTestRefIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYesNoUnknownType containerOnly;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Integer subTestTier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentSubTestType.LearningStandardItemRefIdList learningStandardItemRefIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String abbreviation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Integer numberOfItems;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentSubTestType.AssessmentItemList assessmentItemList;

    /**
     * Gets the value of the subTestVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTestVersion() {
        return subTestVersion;
    }

    /**
     * Sets the value of the subTestVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTestVersion(String value) {
        this.subTestVersion = value;
    }

    /**
     * Gets the value of the subTestPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubTestPublishDate() {
        return subTestPublishDate;
    }

    /**
     * Sets the value of the subTestPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubTestPublishDate(XMLGregorianCalendar value) {
        this.subTestPublishDate = value;
    }

    /**
     * Gets the value of the subTestIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSubTestType.SubTestIdentifierList }
     *     
     */
    public AssessmentSubTestType.SubTestIdentifierList getSubTestIdentifierList() {
        return subTestIdentifierList;
    }

    /**
     * Sets the value of the subTestIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSubTestType.SubTestIdentifierList }
     *     
     */
    public void setSubTestIdentifierList(AssessmentSubTestType.SubTestIdentifierList value) {
        this.subTestIdentifierList = value;
    }

    /**
     * Gets the value of the subTestName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTestName() {
        return subTestName;
    }

    /**
     * Sets the value of the subTestName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubTestName(String value) {
        this.subTestName = value;
    }

    /**
     * Gets the value of the scoreScaleList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSubTestType.ScoreScaleList }
     *     
     */
    public AssessmentSubTestType.ScoreScaleList getScoreScaleList() {
        return scoreScaleList;
    }

    /**
     * Sets the value of the scoreScaleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSubTestType.ScoreScaleList }
     *     
     */
    public void setScoreScaleList(AssessmentSubTestType.ScoreScaleList value) {
        this.scoreScaleList = value;
    }

    /**
     * Gets the value of the subTestSubjectAreaList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSubTestType.SubTestSubjectAreaList }
     *     
     */
    public AssessmentSubTestType.SubTestSubjectAreaList getSubTestSubjectAreaList() {
        return subTestSubjectAreaList;
    }

    /**
     * Sets the value of the subTestSubjectAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSubTestType.SubTestSubjectAreaList }
     *     
     */
    public void setSubTestSubjectAreaList(AssessmentSubTestType.SubTestSubjectAreaList value) {
        this.subTestSubjectAreaList = value;
    }

    /**
     * Gets the value of the subTestGradeLevelList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSubTestType.SubTestGradeLevelList }
     *     
     */
    public AssessmentSubTestType.SubTestGradeLevelList getSubTestGradeLevelList() {
        return subTestGradeLevelList;
    }

    /**
     * Sets the value of the subTestGradeLevelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSubTestType.SubTestGradeLevelList }
     *     
     */
    public void setSubTestGradeLevelList(AssessmentSubTestType.SubTestGradeLevelList value) {
        this.subTestGradeLevelList = value;
    }

    /**
     * Gets the value of the assessmentSubTestRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSubTestType.AssessmentSubTestRefIdList }
     *     
     */
    public AssessmentSubTestType.AssessmentSubTestRefIdList getAssessmentSubTestRefIdList() {
        return assessmentSubTestRefIdList;
    }

    /**
     * Sets the value of the assessmentSubTestRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSubTestType.AssessmentSubTestRefIdList }
     *     
     */
    public void setAssessmentSubTestRefIdList(AssessmentSubTestType.AssessmentSubTestRefIdList value) {
        this.assessmentSubTestRefIdList = value;
    }

    /**
     * Gets the value of the containerOnly property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getContainerOnly() {
        return containerOnly;
    }

    /**
     * Sets the value of the containerOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setContainerOnly(GYesNoUnknownType value) {
        this.containerOnly = value;
    }

    /**
     * Gets the value of the subTestTier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubTestTier() {
        return subTestTier;
    }

    /**
     * Sets the value of the subTestTier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubTestTier(Integer value) {
        this.subTestTier = value;
    }

    /**
     * Gets the value of the learningStandardItemRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSubTestType.LearningStandardItemRefIdList }
     *     
     */
    public AssessmentSubTestType.LearningStandardItemRefIdList getLearningStandardItemRefIdList() {
        return learningStandardItemRefIdList;
    }

    /**
     * Sets the value of the learningStandardItemRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSubTestType.LearningStandardItemRefIdList }
     *     
     */
    public void setLearningStandardItemRefIdList(AssessmentSubTestType.LearningStandardItemRefIdList value) {
        this.learningStandardItemRefIdList = value;
    }

    /**
     * Gets the value of the abbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Sets the value of the abbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbbreviation(String value) {
        this.abbreviation = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the numberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    /**
     * Sets the value of the numberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberOfItems(Integer value) {
        this.numberOfItems = value;
    }

    /**
     * Gets the value of the assessmentItemList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSubTestType.AssessmentItemList }
     *     
     */
    public AssessmentSubTestType.AssessmentItemList getAssessmentItemList() {
        return assessmentItemList;
    }

    /**
     * Sets the value of the assessmentItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSubTestType.AssessmentItemList }
     *     
     */
    public void setAssessmentItemList(AssessmentSubTestType.AssessmentItemList value) {
        this.assessmentItemList = value;
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
     *         &lt;element name="assessmentItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="assessmentItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
     *                   &lt;element name="itemWeightCorrect" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="itemWeightIncorrect" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="itemWeightNotAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
        "assessmentItem"
    })
    public static class AssessmentItemList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentSubTestType.AssessmentItemList.AssessmentItem> assessmentItem;

        /**
         * Gets the value of the assessmentItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentSubTestType.AssessmentItemList.AssessmentItem }
         * 
         * 
         */
        public List<AssessmentSubTestType.AssessmentItemList.AssessmentItem> getAssessmentItem() {
            if (assessmentItem == null) {
                assessmentItem = new ArrayList<AssessmentSubTestType.AssessmentItemList.AssessmentItem>();
            }
            return this.assessmentItem;
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
         *         &lt;element name="assessmentItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
         *         &lt;element name="itemWeightCorrect" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="itemWeightIncorrect" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="itemWeightNotAttempted" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
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
            "assessmentItemRefId",
            "itemWeightCorrect",
            "itemWeightIncorrect",
            "itemWeightNotAttempted"
        })
        public static class AssessmentItem {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String assessmentItemRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal itemWeightCorrect;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal itemWeightIncorrect;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal itemWeightNotAttempted;

            /**
             * Gets the value of the assessmentItemRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssessmentItemRefId() {
                return assessmentItemRefId;
            }

            /**
             * Sets the value of the assessmentItemRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssessmentItemRefId(String value) {
                this.assessmentItemRefId = value;
            }

            /**
             * Gets the value of the itemWeightCorrect property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getItemWeightCorrect() {
                return itemWeightCorrect;
            }

            /**
             * Sets the value of the itemWeightCorrect property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setItemWeightCorrect(BigDecimal value) {
                this.itemWeightCorrect = value;
            }

            /**
             * Gets the value of the itemWeightIncorrect property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getItemWeightIncorrect() {
                return itemWeightIncorrect;
            }

            /**
             * Sets the value of the itemWeightIncorrect property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setItemWeightIncorrect(BigDecimal value) {
                this.itemWeightIncorrect = value;
            }

            /**
             * Gets the value of the itemWeightNotAttempted property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getItemWeightNotAttempted() {
                return itemWeightNotAttempted;
            }

            /**
             * Sets the value of the itemWeightNotAttempted property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setItemWeightNotAttempted(BigDecimal value) {
                this.itemWeightNotAttempted = value;
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
     *         &lt;element name="assessmentSubTestRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentSubTestRefId"
    })
    public static class AssessmentSubTestRefIdList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> assessmentSubTestRefId;

        /**
         * Gets the value of the assessmentSubTestRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentSubTestRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentSubTestRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssessmentSubTestRefId() {
            if (assessmentSubTestRefId == null) {
                assessmentSubTestRefId = new ArrayList<String>();
            }
            return this.assessmentSubTestRefId;
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
     *         &lt;element name="scoreScale" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="scoreMetric" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *                   &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="scoreTableRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
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
        "scoreScale"
    })
    public static class ScoreScaleList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentSubTestType.ScoreScaleList.ScoreScale> scoreScale;

        /**
         * Gets the value of the scoreScale property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the scoreScale property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getScoreScale().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentSubTestType.ScoreScaleList.ScoreScale }
         * 
         * 
         */
        public List<AssessmentSubTestType.ScoreScaleList.ScoreScale> getScoreScale() {
            if (scoreScale == null) {
                scoreScale = new ArrayList<AssessmentSubTestType.ScoreScaleList.ScoreScale>();
            }
            return this.scoreScale;
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
         *         &lt;element name="scoreMetric" type="{http://www.w3.org/2001/XMLSchema}token"/>
         *         &lt;element name="minimum" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="maximum" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="scoreTableRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
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
            "scoreMetric",
            "minimum",
            "maximum",
            "scoreTableRefId"
        })
        public static class ScoreScale {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String scoreMetric;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String minimum;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String maximum;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String scoreTableRefId;

            /**
             * Gets the value of the scoreMetric property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScoreMetric() {
                return scoreMetric;
            }

            /**
             * Sets the value of the scoreMetric property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScoreMetric(String value) {
                this.scoreMetric = value;
            }

            /**
             * Gets the value of the minimum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinimum() {
                return minimum;
            }

            /**
             * Sets the value of the minimum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinimum(String value) {
                this.minimum = value;
            }

            /**
             * Gets the value of the maximum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMaximum() {
                return maximum;
            }

            /**
             * Sets the value of the maximum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMaximum(String value) {
                this.maximum = value;
            }

            /**
             * Gets the value of the scoreTableRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScoreTableRefId() {
                return scoreTableRefId;
            }

            /**
             * Sets the value of the scoreTableRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScoreTableRefId(String value) {
                this.scoreTableRefId = value;
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
     *         &lt;element name="subTestGradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" maxOccurs="unbounded" minOccurs="0"/>
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
        "subTestGradeLevel"
    })
    public static class SubTestGradeLevelList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GYearGroupType> subTestGradeLevel;

        /**
         * Gets the value of the subTestGradeLevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subTestGradeLevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubTestGradeLevel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GYearGroupType }
         * 
         * 
         */
        public List<GYearGroupType> getSubTestGradeLevel() {
            if (subTestGradeLevel == null) {
                subTestGradeLevel = new ArrayList<GYearGroupType>();
            }
            return this.subTestGradeLevel;
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
     *         &lt;element name="subTestIdentifier" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
        "subTestIdentifier"
    })
    public static class SubTestIdentifierList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> subTestIdentifier;

        /**
         * Gets the value of the subTestIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subTestIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubTestIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSubTestIdentifier() {
            if (subTestIdentifier == null) {
                subTestIdentifier = new ArrayList<String>();
            }
            return this.subTestIdentifier;
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
     *         &lt;element name="subTestSubjectArea" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
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
        "subTestSubjectArea"
    })
    public static class SubTestSubjectAreaList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GSubjectAreaType> subTestSubjectArea;

        /**
         * Gets the value of the subTestSubjectArea property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subTestSubjectArea property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubTestSubjectArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GSubjectAreaType }
         * 
         * 
         */
        public List<GSubjectAreaType> getSubTestSubjectArea() {
            if (subTestSubjectArea == null) {
                subTestSubjectArea = new ArrayList<GSubjectAreaType>();
            }
            return this.subTestSubjectArea;
        }

    }

}
