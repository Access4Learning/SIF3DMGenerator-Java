
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An assessment measures a student's progress and learning on specific academic standards.
 * 
 * <p>Java class for assessmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="assessmentIdentifierList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentIdentifier" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="assessmentIdType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assessmentDescriptorList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentDescriptor" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="assessmentProvider" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
 *         &lt;element name="objective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "name",
    "assessmentIdentifierList",
    "assessmentDescriptorList",
    "shortName",
    "assessmentProvider",
    "assessmentItemBankList",
    "assessmentSubjectList",
    "assessmentGradeLevelList",
    "objective",
    "purpose",
    "assessmentLanguageList",
    "learningStandardItemRefIdList"
})
public class AssessmentType
    extends GOtherSIFType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentType.AssessmentIdentifierList assessmentIdentifierList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentType.AssessmentDescriptorList assessmentDescriptorList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String shortName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String assessmentProvider;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentType.AssessmentItemBankList assessmentItemBankList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentType.AssessmentSubjectList assessmentSubjectList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentType.AssessmentGradeLevelList assessmentGradeLevelList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String objective;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String purpose;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentType.AssessmentLanguageList assessmentLanguageList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentType.LearningStandardItemRefIdList learningStandardItemRefIdList;

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
     * Gets the value of the assessmentIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentType.AssessmentIdentifierList }
     *     
     */
    public AssessmentType.AssessmentIdentifierList getAssessmentIdentifierList() {
        return assessmentIdentifierList;
    }

    /**
     * Sets the value of the assessmentIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentType.AssessmentIdentifierList }
     *     
     */
    public void setAssessmentIdentifierList(AssessmentType.AssessmentIdentifierList value) {
        this.assessmentIdentifierList = value;
    }

    /**
     * Gets the value of the assessmentDescriptorList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentType.AssessmentDescriptorList }
     *     
     */
    public AssessmentType.AssessmentDescriptorList getAssessmentDescriptorList() {
        return assessmentDescriptorList;
    }

    /**
     * Sets the value of the assessmentDescriptorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentType.AssessmentDescriptorList }
     *     
     */
    public void setAssessmentDescriptorList(AssessmentType.AssessmentDescriptorList value) {
        this.assessmentDescriptorList = value;
    }

    /**
     * Gets the value of the shortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Sets the value of the shortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortName(String value) {
        this.shortName = value;
    }

    /**
     * Gets the value of the assessmentProvider property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssessmentProvider() {
        return assessmentProvider;
    }

    /**
     * Sets the value of the assessmentProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssessmentProvider(String value) {
        this.assessmentProvider = value;
    }

    /**
     * Gets the value of the assessmentItemBankList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentType.AssessmentItemBankList }
     *     
     */
    public AssessmentType.AssessmentItemBankList getAssessmentItemBankList() {
        return assessmentItemBankList;
    }

    /**
     * Sets the value of the assessmentItemBankList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentType.AssessmentItemBankList }
     *     
     */
    public void setAssessmentItemBankList(AssessmentType.AssessmentItemBankList value) {
        this.assessmentItemBankList = value;
    }

    /**
     * Gets the value of the assessmentSubjectList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentType.AssessmentSubjectList }
     *     
     */
    public AssessmentType.AssessmentSubjectList getAssessmentSubjectList() {
        return assessmentSubjectList;
    }

    /**
     * Sets the value of the assessmentSubjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentType.AssessmentSubjectList }
     *     
     */
    public void setAssessmentSubjectList(AssessmentType.AssessmentSubjectList value) {
        this.assessmentSubjectList = value;
    }

    /**
     * Gets the value of the assessmentGradeLevelList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentType.AssessmentGradeLevelList }
     *     
     */
    public AssessmentType.AssessmentGradeLevelList getAssessmentGradeLevelList() {
        return assessmentGradeLevelList;
    }

    /**
     * Sets the value of the assessmentGradeLevelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentType.AssessmentGradeLevelList }
     *     
     */
    public void setAssessmentGradeLevelList(AssessmentType.AssessmentGradeLevelList value) {
        this.assessmentGradeLevelList = value;
    }

    /**
     * Gets the value of the objective property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjective() {
        return objective;
    }

    /**
     * Sets the value of the objective property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjective(String value) {
        this.objective = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the assessmentLanguageList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentType.AssessmentLanguageList }
     *     
     */
    public AssessmentType.AssessmentLanguageList getAssessmentLanguageList() {
        return assessmentLanguageList;
    }

    /**
     * Sets the value of the assessmentLanguageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentType.AssessmentLanguageList }
     *     
     */
    public void setAssessmentLanguageList(AssessmentType.AssessmentLanguageList value) {
        this.assessmentLanguageList = value;
    }

    /**
     * Gets the value of the learningStandardItemRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentType.LearningStandardItemRefIdList }
     *     
     */
    public AssessmentType.LearningStandardItemRefIdList getLearningStandardItemRefIdList() {
        return learningStandardItemRefIdList;
    }

    /**
     * Sets the value of the learningStandardItemRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentType.LearningStandardItemRefIdList }
     *     
     */
    public void setLearningStandardItemRefIdList(AssessmentType.LearningStandardItemRefIdList value) {
        this.learningStandardItemRefIdList = value;
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
     *         &lt;element name="assessmentDescriptor" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
        "assessmentDescriptor"
    })
    public static class AssessmentDescriptorList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> assessmentDescriptor;

        /**
         * Gets the value of the assessmentDescriptor property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assessmentDescriptor property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssessmentDescriptor().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssessmentDescriptor() {
            if (assessmentDescriptor == null) {
                assessmentDescriptor = new ArrayList<String>();
            }
            return this.assessmentDescriptor;
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
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="assessmentIdType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "assessmentIdentifier"
    })
    public static class AssessmentIdentifierList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentType.AssessmentIdentifierList.AssessmentIdentifier> assessmentIdentifier;

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
         * {@link AssessmentType.AssessmentIdentifierList.AssessmentIdentifier }
         * 
         * 
         */
        public List<AssessmentType.AssessmentIdentifierList.AssessmentIdentifier> getAssessmentIdentifier() {
            if (assessmentIdentifier == null) {
                assessmentIdentifier = new ArrayList<AssessmentType.AssessmentIdentifierList.AssessmentIdentifier>();
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
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="assessmentIdType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AssessmentIdentifier {

            @XmlAttribute(name = "assessmentIdType")
            protected String assessmentIdType;

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
        protected List<AssessmentType.AssessmentItemBankList.AssessmentItemBank> assessmentItemBank;

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
         * {@link AssessmentType.AssessmentItemBankList.AssessmentItemBank }
         * 
         * 
         */
        public List<AssessmentType.AssessmentItemBankList.AssessmentItemBank> getAssessmentItemBank() {
            if (assessmentItemBank == null) {
                assessmentItemBank = new ArrayList<AssessmentType.AssessmentItemBankList.AssessmentItemBank>();
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

}
