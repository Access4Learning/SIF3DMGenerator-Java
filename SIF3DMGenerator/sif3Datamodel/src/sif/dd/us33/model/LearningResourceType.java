
package sif.dd.us33.model;

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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object contains information related to learning resources that may be used in educational settings. These include textbooks, Internet content, educational software, videos and DVDs, supplemental print material, etc. 
 * 
 * <p>Java class for learningResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningResourceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gSIF_EntityType">
 *       &lt;sequence>
 *         &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="contactList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contact" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/3.3}gAddressType" minOccurs="0"/>
 *                             &lt;element name="phoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.3}gPhoneNumberType" minOccurs="0"/>
 *                             &lt;element name="email" type="{http://www.sifassociation.org/datamodel/na/3.3}gEmailType" minOccurs="0"/>
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
 *         &lt;element name="location" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="locationReference" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="referenceType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="yearGroupList" type="{http://www.sifassociation.org/datamodel/na/3.3}gYearGroupList"/>
 *         &lt;element name="subjectAreaList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="subjectArea" type="{http://www.sifassociation.org/datamodel/na/3.3}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="mediaTypeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="mediaType" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="useAgreement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="agreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="approvalList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="approval" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="approvalDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *         &lt;element name="evaluationList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="evaluation" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="evaluatorName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="evaluationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="componentList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="component" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="strategyList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="strategy" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="associatedObjectList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="associatedObject" type="{http://www.sifassociation.org/datamodel/na/3.3}gGenericRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="learningStandardItemRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="learningStandardItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="learningResourcePackageRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningResourceType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "resourceName",
    "author",
    "contactList",
    "location",
    "status",
    "description",
    "yearGroupList",
    "subjectAreaList",
    "mediaTypeList",
    "useAgreement",
    "agreementDate",
    "approvalList",
    "evaluationList",
    "componentList",
    "learningStandardItemRefIdList",
    "learningResourcePackageRefId"
})
public class LearningResourceType
    extends GSIFEntityType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String resourceName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String author;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected LearningResourceType.ContactList contactList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected LearningResourceType.Location location;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String status;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected GYearGroupList yearGroupList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected LearningResourceType.SubjectAreaList subjectAreaList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected LearningResourceType.MediaTypeList mediaTypeList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String useAgreement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar agreementDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected LearningResourceType.ApprovalList approvalList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected LearningResourceType.EvaluationList evaluationList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected LearningResourceType.ComponentList componentList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected LearningResourceType.LearningStandardItemRefIdList learningStandardItemRefIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String learningResourcePackageRefId;

    /**
     * Gets the value of the resourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * Sets the value of the resourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the contactList property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceType.ContactList }
     *     
     */
    public LearningResourceType.ContactList getContactList() {
        return contactList;
    }

    /**
     * Sets the value of the contactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceType.ContactList }
     *     
     */
    public void setContactList(LearningResourceType.ContactList value) {
        this.contactList = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceType.Location }
     *     
     */
    public LearningResourceType.Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceType.Location }
     *     
     */
    public void setLocation(LearningResourceType.Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
     *     {@link LearningResourceType.SubjectAreaList }
     *     
     */
    public LearningResourceType.SubjectAreaList getSubjectAreaList() {
        return subjectAreaList;
    }

    /**
     * Sets the value of the subjectAreaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceType.SubjectAreaList }
     *     
     */
    public void setSubjectAreaList(LearningResourceType.SubjectAreaList value) {
        this.subjectAreaList = value;
    }

    /**
     * Gets the value of the mediaTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceType.MediaTypeList }
     *     
     */
    public LearningResourceType.MediaTypeList getMediaTypeList() {
        return mediaTypeList;
    }

    /**
     * Sets the value of the mediaTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceType.MediaTypeList }
     *     
     */
    public void setMediaTypeList(LearningResourceType.MediaTypeList value) {
        this.mediaTypeList = value;
    }

    /**
     * Gets the value of the useAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseAgreement() {
        return useAgreement;
    }

    /**
     * Sets the value of the useAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseAgreement(String value) {
        this.useAgreement = value;
    }

    /**
     * Gets the value of the agreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAgreementDate(XMLGregorianCalendar value) {
        this.agreementDate = value;
    }

    /**
     * Gets the value of the approvalList property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceType.ApprovalList }
     *     
     */
    public LearningResourceType.ApprovalList getApprovalList() {
        return approvalList;
    }

    /**
     * Sets the value of the approvalList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceType.ApprovalList }
     *     
     */
    public void setApprovalList(LearningResourceType.ApprovalList value) {
        this.approvalList = value;
    }

    /**
     * Gets the value of the evaluationList property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceType.EvaluationList }
     *     
     */
    public LearningResourceType.EvaluationList getEvaluationList() {
        return evaluationList;
    }

    /**
     * Sets the value of the evaluationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceType.EvaluationList }
     *     
     */
    public void setEvaluationList(LearningResourceType.EvaluationList value) {
        this.evaluationList = value;
    }

    /**
     * Gets the value of the componentList property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceType.ComponentList }
     *     
     */
    public LearningResourceType.ComponentList getComponentList() {
        return componentList;
    }

    /**
     * Sets the value of the componentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceType.ComponentList }
     *     
     */
    public void setComponentList(LearningResourceType.ComponentList value) {
        this.componentList = value;
    }

    /**
     * Gets the value of the learningStandardItemRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceType.LearningStandardItemRefIdList }
     *     
     */
    public LearningResourceType.LearningStandardItemRefIdList getLearningStandardItemRefIdList() {
        return learningStandardItemRefIdList;
    }

    /**
     * Sets the value of the learningStandardItemRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceType.LearningStandardItemRefIdList }
     *     
     */
    public void setLearningStandardItemRefIdList(LearningResourceType.LearningStandardItemRefIdList value) {
        this.learningStandardItemRefIdList = value;
    }

    /**
     * Gets the value of the learningResourcePackageRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearningResourcePackageRefId() {
        return learningResourcePackageRefId;
    }

    /**
     * Sets the value of the learningResourcePackageRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearningResourcePackageRefId(String value) {
        this.learningResourcePackageRefId = value;
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
     *         &lt;element name="approval" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="approvalDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
        "approval"
    })
    public static class ApprovalList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<LearningResourceType.ApprovalList.Approval> approval;

        /**
         * Gets the value of the approval property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the approval property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getApproval().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LearningResourceType.ApprovalList.Approval }
         * 
         * 
         */
        public List<LearningResourceType.ApprovalList.Approval> getApproval() {
            if (approval == null) {
                approval = new ArrayList<LearningResourceType.ApprovalList.Approval>();
            }
            return this.approval;
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
         *         &lt;element name="organization" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="approvalDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "organization",
            "approvalDate"
        })
        public static class Approval {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String organization;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar approvalDate;

            /**
             * Gets the value of the organization property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrganization() {
                return organization;
            }

            /**
             * Sets the value of the organization property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrganization(String value) {
                this.organization = value;
            }

            /**
             * Gets the value of the approvalDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getApprovalDate() {
                return approvalDate;
            }

            /**
             * Sets the value of the approvalDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setApprovalDate(XMLGregorianCalendar value) {
                this.approvalDate = value;
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
     *         &lt;element name="component" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="strategyList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="strategy" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="associatedObjectList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="associatedObject" type="{http://www.sifassociation.org/datamodel/na/3.3}gGenericRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
        "component"
    })
    public static class ComponentList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<LearningResourceType.ComponentList.Component> component;

        /**
         * Gets the value of the component property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the component property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComponent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LearningResourceType.ComponentList.Component }
         * 
         * 
         */
        public List<LearningResourceType.ComponentList.Component> getComponent() {
            if (component == null) {
                component = new ArrayList<LearningResourceType.ComponentList.Component>();
            }
            return this.component;
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
         *         &lt;element name="resourceName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="reference" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="strategyList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="strategy" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="associatedObjectList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="associatedObject" type="{http://www.sifassociation.org/datamodel/na/3.3}gGenericRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
            "resourceName",
            "reference",
            "description",
            "strategyList",
            "associatedObjectList"
        })
        public static class Component {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String resourceName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String reference;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected String description;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected LearningResourceType.ComponentList.Component.StrategyList strategyList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected LearningResourceType.ComponentList.Component.AssociatedObjectList associatedObjectList;

            /**
             * Gets the value of the resourceName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResourceName() {
                return resourceName;
            }

            /**
             * Sets the value of the resourceName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResourceName(String value) {
                this.resourceName = value;
            }

            /**
             * Gets the value of the reference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * Sets the value of the reference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
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
             * Gets the value of the strategyList property.
             * 
             * @return
             *     possible object is
             *     {@link LearningResourceType.ComponentList.Component.StrategyList }
             *     
             */
            public LearningResourceType.ComponentList.Component.StrategyList getStrategyList() {
                return strategyList;
            }

            /**
             * Sets the value of the strategyList property.
             * 
             * @param value
             *     allowed object is
             *     {@link LearningResourceType.ComponentList.Component.StrategyList }
             *     
             */
            public void setStrategyList(LearningResourceType.ComponentList.Component.StrategyList value) {
                this.strategyList = value;
            }

            /**
             * Gets the value of the associatedObjectList property.
             * 
             * @return
             *     possible object is
             *     {@link LearningResourceType.ComponentList.Component.AssociatedObjectList }
             *     
             */
            public LearningResourceType.ComponentList.Component.AssociatedObjectList getAssociatedObjectList() {
                return associatedObjectList;
            }

            /**
             * Sets the value of the associatedObjectList property.
             * 
             * @param value
             *     allowed object is
             *     {@link LearningResourceType.ComponentList.Component.AssociatedObjectList }
             *     
             */
            public void setAssociatedObjectList(LearningResourceType.ComponentList.Component.AssociatedObjectList value) {
                this.associatedObjectList = value;
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
             *         &lt;element name="associatedObject" type="{http://www.sifassociation.org/datamodel/na/3.3}gGenericRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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
                "associatedObject"
            })
            public static class AssociatedObjectList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                protected List<GGenericRefIdPointerType> associatedObject;

                /**
                 * Gets the value of the associatedObject property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the associatedObject property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAssociatedObject().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GGenericRefIdPointerType }
                 * 
                 * 
                 */
                public List<GGenericRefIdPointerType> getAssociatedObject() {
                    if (associatedObject == null) {
                        associatedObject = new ArrayList<GGenericRefIdPointerType>();
                    }
                    return this.associatedObject;
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
             *         &lt;element name="strategy" type="{http://www.w3.org/2001/XMLSchema}normalizedString" maxOccurs="unbounded" minOccurs="0"/>
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
                "strategy"
            })
            public static class StrategyList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                @XmlSchemaType(name = "normalizedString")
                protected List<String> strategy;

                /**
                 * Gets the value of the strategy property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the strategy property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getStrategy().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getStrategy() {
                    if (strategy == null) {
                        strategy = new ArrayList<String>();
                    }
                    return this.strategy;
                }

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
     *         &lt;element name="contact" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/3.3}gAddressType" minOccurs="0"/>
     *                   &lt;element name="phoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.3}gPhoneNumberType" minOccurs="0"/>
     *                   &lt;element name="email" type="{http://www.sifassociation.org/datamodel/na/3.3}gEmailType" minOccurs="0"/>
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
        "contact"
    })
    public static class ContactList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<LearningResourceType.ContactList.Contact> contact;

        /**
         * Gets the value of the contact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LearningResourceType.ContactList.Contact }
         * 
         * 
         */
        public List<LearningResourceType.ContactList.Contact> getContact() {
            if (contact == null) {
                contact = new ArrayList<LearningResourceType.ContactList.Contact>();
            }
            return this.contact;
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
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/3.3}gAddressType" minOccurs="0"/>
         *         &lt;element name="phoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.3}gPhoneNumberType" minOccurs="0"/>
         *         &lt;element name="email" type="{http://www.sifassociation.org/datamodel/na/3.3}gEmailType" minOccurs="0"/>
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
            "name",
            "address",
            "phoneNumber",
            "email"
        })
        public static class Contact {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String name;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GAddressType address;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GPhoneNumberType phoneNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected GEmailType email;

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
             * Gets the value of the address property.
             * 
             * @return
             *     possible object is
             *     {@link GAddressType }
             *     
             */
            public GAddressType getAddress() {
                return address;
            }

            /**
             * Sets the value of the address property.
             * 
             * @param value
             *     allowed object is
             *     {@link GAddressType }
             *     
             */
            public void setAddress(GAddressType value) {
                this.address = value;
            }

            /**
             * Gets the value of the phoneNumber property.
             * 
             * @return
             *     possible object is
             *     {@link GPhoneNumberType }
             *     
             */
            public GPhoneNumberType getPhoneNumber() {
                return phoneNumber;
            }

            /**
             * Sets the value of the phoneNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link GPhoneNumberType }
             *     
             */
            public void setPhoneNumber(GPhoneNumberType value) {
                this.phoneNumber = value;
            }

            /**
             * Gets the value of the email property.
             * 
             * @return
             *     possible object is
             *     {@link GEmailType }
             *     
             */
            public GEmailType getEmail() {
                return email;
            }

            /**
             * Sets the value of the email property.
             * 
             * @param value
             *     allowed object is
             *     {@link GEmailType }
             *     
             */
            public void setEmail(GEmailType value) {
                this.email = value;
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
     *         &lt;element name="evaluation" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="evaluatorName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="evaluationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" />
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
        "evaluation"
    })
    public static class EvaluationList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<LearningResourceType.EvaluationList.Evaluation> evaluation;

        /**
         * Gets the value of the evaluation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the evaluation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvaluation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LearningResourceType.EvaluationList.Evaluation }
         * 
         * 
         */
        public List<LearningResourceType.EvaluationList.Evaluation> getEvaluation() {
            if (evaluation == null) {
                evaluation = new ArrayList<LearningResourceType.EvaluationList.Evaluation>();
            }
            return this.evaluation;
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
         *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="evaluatorName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="evaluationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description",
            "date",
            "evaluatorName"
        })
        public static class Evaluation {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected String description;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar date;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String evaluatorName;
            @XmlAttribute(name = "evaluationRefId")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String evaluationRefId;

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
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDate(XMLGregorianCalendar value) {
                this.date = value;
            }

            /**
             * Gets the value of the evaluatorName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEvaluatorName() {
                return evaluatorName;
            }

            /**
             * Sets the value of the evaluatorName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEvaluatorName(String value) {
                this.evaluatorName = value;
            }

            /**
             * Gets the value of the evaluationRefId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEvaluationRefId() {
                return evaluationRefId;
            }

            /**
             * Sets the value of the evaluationRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEvaluationRefId(String value) {
                this.evaluationRefId = value;
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
     *         &lt;element name="learningStandardItemRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
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
     *         &lt;element name="locationReference" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="referenceType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
        "locationReference",
        "referenceType"
    })
    public static class Location {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String locationReference;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String referenceType;

        /**
         * Gets the value of the locationReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocationReference() {
            return locationReference;
        }

        /**
         * Sets the value of the locationReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocationReference(String value) {
            this.locationReference = value;
        }

        /**
         * Gets the value of the referenceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceType() {
            return referenceType;
        }

        /**
         * Sets the value of the referenceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceType(String value) {
            this.referenceType = value;
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
     *         &lt;element name="mediaType" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
        "mediaType"
    })
    public static class MediaTypeList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> mediaType;

        /**
         * Gets the value of the mediaType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the mediaType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMediaType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMediaType() {
            if (mediaType == null) {
                mediaType = new ArrayList<String>();
            }
            return this.mediaType;
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
     *         &lt;element name="subjectArea" type="{http://www.sifassociation.org/datamodel/na/3.3}gSubjectAreaType" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
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
