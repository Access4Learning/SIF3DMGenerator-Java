
package sif.dd.us32.model.ceds;

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


/**
 * This object contains information related to curriculum standards statements "standards" or "benchmarks" or the like within the document. Each LearningStandardItem reflects an individual standard statement and may occur at several levels within a hierarchially structured document.
 * 
 * <p>Java class for gLearningStandardItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gLearningStandardItemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gLearningGoalType">
 *       &lt;sequence>
 *         &lt;element name="refURI" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="shortName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="itemVersion" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="organizationList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="standardHierarchyLevelNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="standardHierarchyLevelDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="predecessorItemList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="predecessorItem" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="statementCodeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="statementCode" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="statementList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="statement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="yearGroupList" type="{http://www.sifassociation.org/datamodel/na/3.2}gYearGroupList" minOccurs="0"/>
 *         &lt;element name="subjectAreaList">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subjectArea" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="alternativeIdCodeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="alternativeIdCode" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="learningStandardDocumentRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType"/>
 *         &lt;element name="relatedLearningStandardItemList" type="{http://www.sifassociation.org/datamodel/na/3.2}gRelatedLearningStandardItemList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gLearningStandardItemType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "refURI",
    "shortName",
    "itemVersion",
    "description",
    "organizationList",
    "standardHierarchyLevelNumber",
    "standardHierarchyLevelDescription",
    "predecessorItemList",
    "statementCodeList",
    "statementList",
    "yearGroupList",
    "subjectAreaList",
    "alternativeIdCodeList",
    "learningStandardDocumentRefId",
    "relatedLearningStandardItemList"
})
public class GLearningStandardItemType
    extends GLearningGoalType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "anyURI")
    protected String refURI;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shortName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String itemVersion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLearningStandardItemType.OrganizationList organizationList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected int standardHierarchyLevelNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String standardHierarchyLevelDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLearningStandardItemType.PredecessorItemList predecessorItemList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLearningStandardItemType.StatementCodeList statementCodeList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GLearningStandardItemType.StatementList statementList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GYearGroupList yearGroupList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GLearningStandardItemType.SubjectAreaList subjectAreaList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GLearningStandardItemType.AlternativeIdCodeList alternativeIdCodeList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String learningStandardDocumentRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GRelatedLearningStandardItemList relatedLearningStandardItemList;

    /**
     * Gets the value of the refURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefURI() {
        return refURI;
    }

    /**
     * Sets the value of the refURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefURI(String value) {
        this.refURI = value;
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
     * Gets the value of the organizationList property.
     * 
     * @return
     *     possible object is
     *     {@link GLearningStandardItemType.OrganizationList }
     *     
     */
    public GLearningStandardItemType.OrganizationList getOrganizationList() {
        return organizationList;
    }

    /**
     * Sets the value of the organizationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLearningStandardItemType.OrganizationList }
     *     
     */
    public void setOrganizationList(GLearningStandardItemType.OrganizationList value) {
        this.organizationList = value;
    }

    /**
     * Gets the value of the standardHierarchyLevelNumber property.
     * 
     */
    public int getStandardHierarchyLevelNumber() {
        return standardHierarchyLevelNumber;
    }

    /**
     * Sets the value of the standardHierarchyLevelNumber property.
     * 
     */
    public void setStandardHierarchyLevelNumber(int value) {
        this.standardHierarchyLevelNumber = value;
    }

    /**
     * Gets the value of the standardHierarchyLevelDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardHierarchyLevelDescription() {
        return standardHierarchyLevelDescription;
    }

    /**
     * Sets the value of the standardHierarchyLevelDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardHierarchyLevelDescription(String value) {
        this.standardHierarchyLevelDescription = value;
    }

    /**
     * Gets the value of the predecessorItemList property.
     * 
     * @return
     *     possible object is
     *     {@link GLearningStandardItemType.PredecessorItemList }
     *     
     */
    public GLearningStandardItemType.PredecessorItemList getPredecessorItemList() {
        return predecessorItemList;
    }

    /**
     * Sets the value of the predecessorItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLearningStandardItemType.PredecessorItemList }
     *     
     */
    public void setPredecessorItemList(GLearningStandardItemType.PredecessorItemList value) {
        this.predecessorItemList = value;
    }

    /**
     * Gets the value of the statementCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link GLearningStandardItemType.StatementCodeList }
     *     
     */
    public GLearningStandardItemType.StatementCodeList getStatementCodeList() {
        return statementCodeList;
    }

    /**
     * Sets the value of the statementCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLearningStandardItemType.StatementCodeList }
     *     
     */
    public void setStatementCodeList(GLearningStandardItemType.StatementCodeList value) {
        this.statementCodeList = value;
    }

    /**
     * Gets the value of the statementList property.
     * 
     * @return
     *     possible object is
     *     {@link GLearningStandardItemType.StatementList }
     *     
     */
    public GLearningStandardItemType.StatementList getStatementList() {
        return statementList;
    }

    /**
     * Sets the value of the statementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLearningStandardItemType.StatementList }
     *     
     */
    public void setStatementList(GLearningStandardItemType.StatementList value) {
        this.statementList = value;
    }

    /**
     * Gets the value of the yearGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link GYearGroupList }
     *     
     */
    public GYearGroupList getYearGroupList() {
        return yearGroupList;
    }

    /**
     * Sets the value of the yearGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYearGroupList }
     *     
     */
    public void setYearGroupList(GYearGroupList value) {
        this.yearGroupList = value;
    }

    /**
     * Gets the value of the subjectAreaList property.
     * 
     * @return
     *     possible object is
     *     {@link GLearningStandardItemType.SubjectAreaList }
     *     
     */
    public GLearningStandardItemType.SubjectAreaList getSubjectAreaList() {
        return subjectAreaList;
    }

    /**
     * Sets the value of the subjectAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLearningStandardItemType.SubjectAreaList }
     *     
     */
    public void setSubjectAreaList(GLearningStandardItemType.SubjectAreaList value) {
        this.subjectAreaList = value;
    }

    /**
     * Gets the value of the alternativeIdCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link GLearningStandardItemType.AlternativeIdCodeList }
     *     
     */
    public GLearningStandardItemType.AlternativeIdCodeList getAlternativeIdCodeList() {
        return alternativeIdCodeList;
    }

    /**
     * Sets the value of the alternativeIdCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLearningStandardItemType.AlternativeIdCodeList }
     *     
     */
    public void setAlternativeIdCodeList(GLearningStandardItemType.AlternativeIdCodeList value) {
        this.alternativeIdCodeList = value;
    }

    /**
     * Gets the value of the learningStandardDocumentRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningStandardDocumentRefId() {
        return learningStandardDocumentRefId;
    }

    /**
     * Sets the value of the learningStandardDocumentRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningStandardDocumentRefId(String value) {
        this.learningStandardDocumentRefId = value;
    }

    /**
     * Gets the value of the relatedLearningStandardItemList property.
     * 
     * @return
     *     possible object is
     *     {@link GRelatedLearningStandardItemList }
     *     
     */
    public GRelatedLearningStandardItemList getRelatedLearningStandardItemList() {
        return relatedLearningStandardItemList;
    }

    /**
     * Sets the value of the relatedLearningStandardItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRelatedLearningStandardItemList }
     *     
     */
    public void setRelatedLearningStandardItemList(GRelatedLearningStandardItemList value) {
        this.relatedLearningStandardItemList = value;
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
     *         &lt;element name="alternativeIdCode" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
        "alternativeIdCode"
    })
    public static class AlternativeIdCodeList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> alternativeIdCode;

        /**
         * Gets the value of the alternativeIdCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternativeIdCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternativeIdCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAlternativeIdCode() {
            if (alternativeIdCode == null) {
                alternativeIdCode = new ArrayList<String>();
            }
            return this.alternativeIdCode;
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
     *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
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
        "organization"
    })
    public static class OrganizationList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected List<String> organization;

        /**
         * Gets the value of the organization property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the organization property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrganization().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOrganization() {
            if (organization == null) {
                organization = new ArrayList<String>();
            }
            return this.organization;
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
     *         &lt;element name="predecessorItem" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "predecessorItem"
    })
    public static class PredecessorItemList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> predecessorItem;

        /**
         * Gets the value of the predecessorItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the predecessorItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPredecessorItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPredecessorItem() {
            if (predecessorItem == null) {
                predecessorItem = new ArrayList<String>();
            }
            return this.predecessorItem;
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
     *         &lt;element name="statementCode" type="{http://www.sifassociation.org/datamodel/na/3.2}gLaxCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
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
        "statementCode"
    })
    public static class StatementCodeList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GLaxCodedElementType> statementCode;

        /**
         * Gets the value of the statementCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statementCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatementCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GLaxCodedElementType }
         * 
         * 
         */
        public List<GLaxCodedElementType> getStatementCode() {
            if (statementCode == null) {
                statementCode = new ArrayList<GLaxCodedElementType>();
            }
            return this.statementCode;
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
     *         &lt;element name="statement" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "statement"
    })
    public static class StatementList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<String> statement;

        /**
         * Gets the value of the statement property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the statement property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStatement().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStatement() {
            if (statement == null) {
                statement = new ArrayList<String>();
            }
            return this.statement;
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
     *         &lt;element name="subjectArea" type="{http://www.sifassociation.org/datamodel/na/3.2}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
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
        "subjectArea"
    })
    public static class SubjectAreaList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GSubjectAreaType> subjectArea;

        /**
         * Gets the value of the subjectArea property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the subjectArea property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubjectArea().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GSubjectAreaType }
         * 
         * 
         */
        public List<GSubjectAreaType> getSubjectArea() {
            if (subjectArea == null) {
                subjectArea = new ArrayList<GSubjectAreaType>();
            }
            return this.subjectArea;
        }

    }

}
