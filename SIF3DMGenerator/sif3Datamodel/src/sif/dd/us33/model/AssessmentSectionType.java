
package sif.dd.us33.model;

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
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object represents a section within an assessment form. Section are used to establish breaks in tests, define item sequencing rules, as well as identifying other assets that may be necessary to successfully present a test to a student. Sections provide the presentation information for the items within the section.
 * 
 * <p>Java class for assessmentSectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentSectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="sectionVersion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="sectionPublishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="sectionIdentifierList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sectionIdentifier" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sectionName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="academicSubject" type="{http://www.sifassociation.org/datamodel/na/3.3}gSubjectAreaType" minOccurs="0"/>
 *         &lt;element name="sectionItemSequenceType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="itemSelectionAlgorithmName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="itemSelectionAlgorithm" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="sectionTimeLimit" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="sectionSealed" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="sectionReentry" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="sectionAssetList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sectionAsset" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sectionItemList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sectionItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="assessmentItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
 *                             &lt;element name="itemSequence" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="sectionItemAssetList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="sectionItemAsset" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
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
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentSectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "sectionVersion",
    "sectionPublishDate",
    "sectionIdentifierList",
    "sectionName",
    "academicSubject",
    "sectionItemSequenceType",
    "itemSelectionAlgorithmName",
    "itemSelectionAlgorithm",
    "sectionTimeLimit",
    "sectionSealed",
    "sectionReentry",
    "sectionAssetList",
    "sectionItemList"
})
public class AssessmentSectionType
    extends GOtherSIFType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sectionVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sectionPublishDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected AssessmentSectionType.SectionIdentifierList sectionIdentifierList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sectionName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GSubjectAreaType academicSubject;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sectionItemSequenceType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemSelectionAlgorithmName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemSelectionAlgorithm;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected Duration sectionTimeLimit;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType sectionSealed;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType sectionReentry;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected AssessmentSectionType.SectionAssetList sectionAssetList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected AssessmentSectionType.SectionItemList sectionItemList;

    /**
     * Gets the value of the sectionVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionVersion() {
        return sectionVersion;
    }

    /**
     * Sets the value of the sectionVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionVersion(String value) {
        this.sectionVersion = value;
    }

    /**
     * Gets the value of the sectionPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSectionPublishDate() {
        return sectionPublishDate;
    }

    /**
     * Sets the value of the sectionPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSectionPublishDate(XMLGregorianCalendar value) {
        this.sectionPublishDate = value;
    }

    /**
     * Gets the value of the sectionIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSectionType.SectionIdentifierList }
     *     
     */
    public AssessmentSectionType.SectionIdentifierList getSectionIdentifierList() {
        return sectionIdentifierList;
    }

    /**
     * Sets the value of the sectionIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSectionType.SectionIdentifierList }
     *     
     */
    public void setSectionIdentifierList(AssessmentSectionType.SectionIdentifierList value) {
        this.sectionIdentifierList = value;
    }

    /**
     * Gets the value of the sectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Sets the value of the sectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionName(String value) {
        this.sectionName = value;
    }

    /**
     * Gets the value of the academicSubject property.
     * 
     * @return
     *     possible object is
     *     {@link GSubjectAreaType }
     *     
     */
    public GSubjectAreaType getAcademicSubject() {
        return academicSubject;
    }

    /**
     * Sets the value of the academicSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSubjectAreaType }
     *     
     */
    public void setAcademicSubject(GSubjectAreaType value) {
        this.academicSubject = value;
    }

    /**
     * Gets the value of the sectionItemSequenceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionItemSequenceType() {
        return sectionItemSequenceType;
    }

    /**
     * Sets the value of the sectionItemSequenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionItemSequenceType(String value) {
        this.sectionItemSequenceType = value;
    }

    /**
     * Gets the value of the itemSelectionAlgorithmName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSelectionAlgorithmName() {
        return itemSelectionAlgorithmName;
    }

    /**
     * Sets the value of the itemSelectionAlgorithmName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSelectionAlgorithmName(String value) {
        this.itemSelectionAlgorithmName = value;
    }

    /**
     * Gets the value of the itemSelectionAlgorithm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemSelectionAlgorithm() {
        return itemSelectionAlgorithm;
    }

    /**
     * Sets the value of the itemSelectionAlgorithm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemSelectionAlgorithm(String value) {
        this.itemSelectionAlgorithm = value;
    }

    /**
     * Gets the value of the sectionTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getSectionTimeLimit() {
        return sectionTimeLimit;
    }

    /**
     * Sets the value of the sectionTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setSectionTimeLimit(Duration value) {
        this.sectionTimeLimit = value;
    }

    /**
     * Gets the value of the sectionSealed property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getSectionSealed() {
        return sectionSealed;
    }

    /**
     * Sets the value of the sectionSealed property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setSectionSealed(GYesNoUnknownType value) {
        this.sectionSealed = value;
    }

    /**
     * Gets the value of the sectionReentry property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getSectionReentry() {
        return sectionReentry;
    }

    /**
     * Sets the value of the sectionReentry property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setSectionReentry(GYesNoUnknownType value) {
        this.sectionReentry = value;
    }

    /**
     * Gets the value of the sectionAssetList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSectionType.SectionAssetList }
     *     
     */
    public AssessmentSectionType.SectionAssetList getSectionAssetList() {
        return sectionAssetList;
    }

    /**
     * Sets the value of the sectionAssetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSectionType.SectionAssetList }
     *     
     */
    public void setSectionAssetList(AssessmentSectionType.SectionAssetList value) {
        this.sectionAssetList = value;
    }

    /**
     * Gets the value of the sectionItemList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentSectionType.SectionItemList }
     *     
     */
    public AssessmentSectionType.SectionItemList getSectionItemList() {
        return sectionItemList;
    }

    /**
     * Sets the value of the sectionItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentSectionType.SectionItemList }
     *     
     */
    public void setSectionItemList(AssessmentSectionType.SectionItemList value) {
        this.sectionItemList = value;
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
     *         &lt;element name="sectionAsset" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "sectionAsset"
    })
    public static class SectionAssetList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> sectionAsset;

        /**
         * Gets the value of the sectionAsset property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sectionAsset property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSectionAsset().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSectionAsset() {
            if (sectionAsset == null) {
                sectionAsset = new ArrayList<String>();
            }
            return this.sectionAsset;
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
     *         &lt;element name="sectionIdentifier" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "sectionIdentifier"
    })
    public static class SectionIdentifierList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> sectionIdentifier;

        /**
         * Gets the value of the sectionIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sectionIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSectionIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSectionIdentifier() {
            if (sectionIdentifier == null) {
                sectionIdentifier = new ArrayList<String>();
            }
            return this.sectionIdentifier;
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
     *         &lt;element name="sectionItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="assessmentItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
     *                   &lt;element name="itemSequence" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="sectionItemAssetList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="sectionItemAsset" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sectionItem"
    })
    public static class SectionItemList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<AssessmentSectionType.SectionItemList.SectionItem> sectionItem;

        /**
         * Gets the value of the sectionItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sectionItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSectionItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentSectionType.SectionItemList.SectionItem }
         * 
         * 
         */
        public List<AssessmentSectionType.SectionItemList.SectionItem> getSectionItem() {
            if (sectionItem == null) {
                sectionItem = new ArrayList<AssessmentSectionType.SectionItemList.SectionItem>();
            }
            return this.sectionItem;
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
         *         &lt;element name="assessmentItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
         *         &lt;element name="itemSequence" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="sectionItemAssetList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="sectionItemAsset" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
            "assessmentItemRefId",
            "itemSequence",
            "sectionItemAssetList"
        })
        public static class SectionItem {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String assessmentItemRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String itemSequence;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected AssessmentSectionType.SectionItemList.SectionItem.SectionItemAssetList sectionItemAssetList;

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
             * Gets the value of the itemSequence property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItemSequence() {
                return itemSequence;
            }

            /**
             * Sets the value of the itemSequence property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItemSequence(String value) {
                this.itemSequence = value;
            }

            /**
             * Gets the value of the sectionItemAssetList property.
             * 
             * @return
             *     possible object is
             *     {@link AssessmentSectionType.SectionItemList.SectionItem.SectionItemAssetList }
             *     
             */
            public AssessmentSectionType.SectionItemList.SectionItem.SectionItemAssetList getSectionItemAssetList() {
                return sectionItemAssetList;
            }

            /**
             * Sets the value of the sectionItemAssetList property.
             * 
             * @param value
             *     allowed object is
             *     {@link AssessmentSectionType.SectionItemList.SectionItem.SectionItemAssetList }
             *     
             */
            public void setSectionItemAssetList(AssessmentSectionType.SectionItemList.SectionItem.SectionItemAssetList value) {
                this.sectionItemAssetList = value;
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
             *         &lt;element name="sectionItemAsset" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
                "sectionItemAsset"
            })
            public static class SectionItemAssetList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected List<String> sectionItemAsset;

                /**
                 * Gets the value of the sectionItemAsset property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the sectionItemAsset property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSectionItemAsset().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getSectionItemAsset() {
                    if (sectionItemAsset == null) {
                        sectionItemAsset = new ArrayList<String>();
                    }
                    return this.sectionItemAsset;
                }

            }

        }

    }

}
