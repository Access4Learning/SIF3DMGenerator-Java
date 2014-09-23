
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
 * This object represents a content asset that is used to compose an assessment item, referenced by the item but not part of the item content itself, or is content that is included as part of a section within an assessment form. Assets can be static content such as art work or dynamic assets such as tools (calculators as an example). 
 * 
 * <p>Java class for assessmentAssetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentAssetType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gOtherSIFType">
 *       &lt;sequence>
 *         &lt;element name="assetType" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="assetVersion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="assetPublishDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="assetIdentifierList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assetIdentifier" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                           &lt;attribute name="assetIdType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assetName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="assetOwner" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="assetSubjectList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assetSubject" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assetGradeLevelList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assetGradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assetLanguage" type="{http://www.sifassociation.org/datamodel/na/3.2}gLanguageType" minOccurs="0"/>
 *         &lt;element name="assetLearningStandardRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assetLearningStandardRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assetContent" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentAssetType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assetType",
    "assetVersion",
    "assetPublishDate",
    "assetIdentifierList",
    "assetName",
    "assetOwner",
    "assetSubjectList",
    "assetGradeLevelList",
    "assetLanguage",
    "assetLearningStandardRefIdList",
    "assetContent"
})
public class AssessmentAssetType
    extends GOtherSIFType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String assetType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String assetVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar assetPublishDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentAssetType.AssetIdentifierList assetIdentifierList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String assetName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String assetOwner;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentAssetType.AssetSubjectList assetSubjectList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentAssetType.AssetGradeLevelList assetGradeLevelList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLanguageType assetLanguage;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected AssessmentAssetType.AssetLearningStandardRefIdList assetLearningStandardRefIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected String assetContent;

    /**
     * Gets the value of the assetType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetType() {
        return assetType;
    }

    /**
     * Sets the value of the assetType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetType(String value) {
        this.assetType = value;
    }

    /**
     * Gets the value of the assetVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetVersion() {
        return assetVersion;
    }

    /**
     * Sets the value of the assetVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetVersion(String value) {
        this.assetVersion = value;
    }

    /**
     * Gets the value of the assetPublishDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAssetPublishDate() {
        return assetPublishDate;
    }

    /**
     * Sets the value of the assetPublishDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAssetPublishDate(XMLGregorianCalendar value) {
        this.assetPublishDate = value;
    }

    /**
     * Gets the value of the assetIdentifierList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentAssetType.AssetIdentifierList }
     *     
     */
    public AssessmentAssetType.AssetIdentifierList getAssetIdentifierList() {
        return assetIdentifierList;
    }

    /**
     * Sets the value of the assetIdentifierList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentAssetType.AssetIdentifierList }
     *     
     */
    public void setAssetIdentifierList(AssessmentAssetType.AssetIdentifierList value) {
        this.assetIdentifierList = value;
    }

    /**
     * Gets the value of the assetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * Sets the value of the assetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetName(String value) {
        this.assetName = value;
    }

    /**
     * Gets the value of the assetOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetOwner() {
        return assetOwner;
    }

    /**
     * Sets the value of the assetOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetOwner(String value) {
        this.assetOwner = value;
    }

    /**
     * Gets the value of the assetSubjectList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentAssetType.AssetSubjectList }
     *     
     */
    public AssessmentAssetType.AssetSubjectList getAssetSubjectList() {
        return assetSubjectList;
    }

    /**
     * Sets the value of the assetSubjectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentAssetType.AssetSubjectList }
     *     
     */
    public void setAssetSubjectList(AssessmentAssetType.AssetSubjectList value) {
        this.assetSubjectList = value;
    }

    /**
     * Gets the value of the assetGradeLevelList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentAssetType.AssetGradeLevelList }
     *     
     */
    public AssessmentAssetType.AssetGradeLevelList getAssetGradeLevelList() {
        return assetGradeLevelList;
    }

    /**
     * Sets the value of the assetGradeLevelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentAssetType.AssetGradeLevelList }
     *     
     */
    public void setAssetGradeLevelList(AssessmentAssetType.AssetGradeLevelList value) {
        this.assetGradeLevelList = value;
    }

    /**
     * Gets the value of the assetLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link GLanguageType }
     *     
     */
    public GLanguageType getAssetLanguage() {
        return assetLanguage;
    }

    /**
     * Sets the value of the assetLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLanguageType }
     *     
     */
    public void setAssetLanguage(GLanguageType value) {
        this.assetLanguage = value;
    }

    /**
     * Gets the value of the assetLearningStandardRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link AssessmentAssetType.AssetLearningStandardRefIdList }
     *     
     */
    public AssessmentAssetType.AssetLearningStandardRefIdList getAssetLearningStandardRefIdList() {
        return assetLearningStandardRefIdList;
    }

    /**
     * Sets the value of the assetLearningStandardRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssessmentAssetType.AssetLearningStandardRefIdList }
     *     
     */
    public void setAssetLearningStandardRefIdList(AssessmentAssetType.AssetLearningStandardRefIdList value) {
        this.assetLearningStandardRefIdList = value;
    }

    /**
     * Gets the value of the assetContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetContent() {
        return assetContent;
    }

    /**
     * Sets the value of the assetContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetContent(String value) {
        this.assetContent = value;
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
     *         &lt;element name="assetGradeLevel" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assetGradeLevel"
    })
    public static class AssetGradeLevelList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GYearGroupType> assetGradeLevel;

        /**
         * Gets the value of the assetGradeLevel property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetGradeLevel property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssetGradeLevel().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GYearGroupType }
         * 
         * 
         */
        public List<GYearGroupType> getAssetGradeLevel() {
            if (assetGradeLevel == null) {
                assetGradeLevel = new ArrayList<GYearGroupType>();
            }
            return this.assetGradeLevel;
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
     *         &lt;element name="assetIdentifier" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *                 &lt;attribute name="assetIdType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "assetIdentifier"
    })
    public static class AssetIdentifierList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<AssessmentAssetType.AssetIdentifierList.AssetIdentifier> assetIdentifier;

        /**
         * Gets the value of the assetIdentifier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetIdentifier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssetIdentifier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssessmentAssetType.AssetIdentifierList.AssetIdentifier }
         * 
         * 
         */
        public List<AssessmentAssetType.AssetIdentifierList.AssetIdentifier> getAssetIdentifier() {
            if (assetIdentifier == null) {
                assetIdentifier = new ArrayList<AssessmentAssetType.AssetIdentifierList.AssetIdentifier>();
            }
            return this.assetIdentifier;
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
         *       &lt;attribute name="assetIdType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class AssetIdentifier {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String value;
            @XmlAttribute(name = "assetIdType")
            protected String assetIdType;

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
             * Gets the value of the assetIdType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAssetIdType() {
                return assetIdType;
            }

            /**
             * Sets the value of the assetIdType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAssetIdType(String value) {
                this.assetIdType = value;
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
     *         &lt;element name="assetLearningStandardRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assetLearningStandardRefId"
    })
    public static class AssetLearningStandardRefIdList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> assetLearningStandardRefId;

        /**
         * Gets the value of the assetLearningStandardRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetLearningStandardRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssetLearningStandardRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssetLearningStandardRefId() {
            if (assetLearningStandardRefId == null) {
                assetLearningStandardRefId = new ArrayList<String>();
            }
            return this.assetLearningStandardRefId;
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
     *         &lt;element name="assetSubject" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
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
        "assetSubject"
    })
    public static class AssetSubjectList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GSubjectAreaType> assetSubject;

        /**
         * Gets the value of the assetSubject property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assetSubject property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssetSubject().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GSubjectAreaType }
         * 
         * 
         */
        public List<GSubjectAreaType> getAssetSubject() {
            if (assetSubject == null) {
                assetSubject = new ArrayList<GSubjectAreaType>();
            }
            return this.assetSubject;
        }

    }

}
