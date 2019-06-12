
package sif.dd.unity.model;

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
 * <p>Java class for LearningResourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LearningResourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningResourceContactListType" minOccurs="0"/>
 *         &lt;element name="Location" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningResourceLocationType" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GradeLevels" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelsType" minOccurs="0"/>
 *         &lt;element name="SubjectAreas" type="{http://www.sifassociation.org/datamodel/na/4.x}SubjectAreaListType" minOccurs="0"/>
 *         &lt;element name="MediaTypes" type="{http://www.sifassociation.org/datamodel/na/4.x}MediaTypeListType" minOccurs="0"/>
 *         &lt;element name="UseAgreement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Approvals" type="{http://www.sifassociation.org/datamodel/na/4.x}ApprovalListType" minOccurs="0"/>
 *         &lt;element name="Evaluations" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningResourceEvaluationListType" minOccurs="0"/>
 *         &lt;element name="Components" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningResourceComponentListType"/>
 *         &lt;element name="LearningStandards" type="{http://www.sifassociation.org/datamodel/na/4.x}LearningStandardItemRefIdListType" minOccurs="0"/>
 *         &lt;element name="LearningResourcePackageRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LearningResourceType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "name",
    "author",
    "contacts",
    "location",
    "status",
    "description",
    "gradeLevels",
    "subjectAreas",
    "mediaTypes",
    "useAgreement",
    "agreementDate",
    "approvals",
    "evaluations",
    "components",
    "learningStandards",
    "learningResourcePackageRefId",
    "sifMetadata",
    "sifExtendedElements"
})
public class LearningResourceType {

    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(name = "Author", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String author;
    @XmlElement(name = "Contacts", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningResourceContactListType contacts;
    @XmlElement(name = "Location", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningResourceLocationType location;
    @XmlElement(name = "Status", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String status;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String description;
    @XmlElement(name = "GradeLevels", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelsType gradeLevels;
    @XmlElement(name = "SubjectAreas", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SubjectAreaListType subjectAreas;
    @XmlElement(name = "MediaTypes", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MediaTypeListType mediaTypes;
    @XmlElement(name = "UseAgreement", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String useAgreement;
    @XmlElement(name = "AgreementDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar agreementDate;
    @XmlElement(name = "Approvals", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ApprovalListType approvals;
    @XmlElement(name = "Evaluations", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningResourceEvaluationListType evaluations;
    @XmlElement(name = "Components", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected LearningResourceComponentListType components;
    @XmlElement(name = "LearningStandards", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LearningStandardItemRefIdListType learningStandards;
    @XmlElement(name = "LearningResourcePackageRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String learningResourcePackageRefId;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

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
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceContactListType }
     *     
     */
    public LearningResourceContactListType getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceContactListType }
     *     
     */
    public void setContacts(LearningResourceContactListType value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceLocationType }
     *     
     */
    public LearningResourceLocationType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceLocationType }
     *     
     */
    public void setLocation(LearningResourceLocationType value) {
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
     * Gets the value of the gradeLevels property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelsType }
     *     
     */
    public GradeLevelsType getGradeLevels() {
        return gradeLevels;
    }

    /**
     * Sets the value of the gradeLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelsType }
     *     
     */
    public void setGradeLevels(GradeLevelsType value) {
        this.gradeLevels = value;
    }

    /**
     * Gets the value of the subjectAreas property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectAreaListType }
     *     
     */
    public SubjectAreaListType getSubjectAreas() {
        return subjectAreas;
    }

    /**
     * Sets the value of the subjectAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectAreaListType }
     *     
     */
    public void setSubjectAreas(SubjectAreaListType value) {
        this.subjectAreas = value;
    }

    /**
     * Gets the value of the mediaTypes property.
     * 
     * @return
     *     possible object is
     *     {@link MediaTypeListType }
     *     
     */
    public MediaTypeListType getMediaTypes() {
        return mediaTypes;
    }

    /**
     * Sets the value of the mediaTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaTypeListType }
     *     
     */
    public void setMediaTypes(MediaTypeListType value) {
        this.mediaTypes = value;
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
     * Gets the value of the approvals property.
     * 
     * @return
     *     possible object is
     *     {@link ApprovalListType }
     *     
     */
    public ApprovalListType getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApprovalListType }
     *     
     */
    public void setApprovals(ApprovalListType value) {
        this.approvals = value;
    }

    /**
     * Gets the value of the evaluations property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceEvaluationListType }
     *     
     */
    public LearningResourceEvaluationListType getEvaluations() {
        return evaluations;
    }

    /**
     * Sets the value of the evaluations property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceEvaluationListType }
     *     
     */
    public void setEvaluations(LearningResourceEvaluationListType value) {
        this.evaluations = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link LearningResourceComponentListType }
     *     
     */
    public LearningResourceComponentListType getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningResourceComponentListType }
     *     
     */
    public void setComponents(LearningResourceComponentListType value) {
        this.components = value;
    }

    /**
     * Gets the value of the learningStandards property.
     * 
     * @return
     *     possible object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public LearningStandardItemRefIdListType getLearningStandards() {
        return learningStandards;
    }

    /**
     * Sets the value of the learningStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link LearningStandardItemRefIdListType }
     *     
     */
    public void setLearningStandards(LearningStandardItemRefIdListType value) {
        this.learningStandards = value;
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

}
