
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Author" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{http://www.sifassociation.org/datamodel/au/3.4}ContactsType" minOccurs="0"/>
 *         &lt;element name="Location" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="ReferenceType" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YearLevels" type="{http://www.sifassociation.org/datamodel/au/3.4}YearLevelsType" minOccurs="0"/>
 *         &lt;element name="SubjectAreas" type="{http://www.sifassociation.org/datamodel/au/3.4}ACStrandAreaListType" minOccurs="0"/>
 *         &lt;element name="MediaTypes" type="{http://www.sifassociation.org/datamodel/au/3.4}MediaTypesType" minOccurs="0"/>
 *         &lt;element name="UseAgreement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AgreementDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Approvals" type="{http://www.sifassociation.org/datamodel/au/3.4}ApprovalsType" minOccurs="0"/>
 *         &lt;element name="Evaluations" type="{http://www.sifassociation.org/datamodel/au/3.4}EvaluationsType" minOccurs="0"/>
 *         &lt;element name="Components" type="{http://www.sifassociation.org/datamodel/au/3.4}ComponentsType" minOccurs="0"/>
 *         &lt;element name="LearningStandards" type="{http://www.sifassociation.org/datamodel/au/3.4}LearningStandardsType" minOccurs="0"/>
 *         &lt;element name="LearningResourcePackageRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LearningResourceType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "name",
    "author",
    "contacts",
    "location",
    "status",
    "description",
    "yearLevels",
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

    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElementRef(name = "Author", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> author;
    @XmlElementRef(name = "Contacts", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactsType> contacts;
    @XmlElementRef(name = "Location", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningResourceType.Location> location;
    @XmlElementRef(name = "Status", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "Description", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "YearLevels", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<YearLevelsType> yearLevels;
    @XmlElementRef(name = "SubjectAreas", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ACStrandAreaListType> subjectAreas;
    @XmlElementRef(name = "MediaTypes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MediaTypesType> mediaTypes;
    @XmlElementRef(name = "UseAgreement", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> useAgreement;
    @XmlElementRef(name = "AgreementDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> agreementDate;
    @XmlElementRef(name = "Approvals", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ApprovalsType> approvals;
    @XmlElementRef(name = "Evaluations", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<EvaluationsType> evaluations;
    @XmlElement(name = "Components", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected ComponentsType components;
    @XmlElementRef(name = "LearningStandards", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LearningStandardsType> learningStandards;
    @XmlElementRef(name = "LearningResourcePackageRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> learningResourcePackageRefId;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAuthor(JAXBElement<String> value) {
        this.author = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactsType }{@code >}
     *     
     */
    public JAXBElement<ContactsType> getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactsType }{@code >}
     *     
     */
    public void setContacts(JAXBElement<ContactsType> value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LearningResourceType.Location }{@code >}
     *     
     */
    public JAXBElement<LearningResourceType.Location> getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningResourceType.Location }{@code >}
     *     
     */
    public void setLocation(JAXBElement<LearningResourceType.Location> value) {
        this.location = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

    /**
     * Gets the value of the yearLevels property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}
     *     
     */
    public JAXBElement<YearLevelsType> getYearLevels() {
        return yearLevels;
    }

    /**
     * Sets the value of the yearLevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link YearLevelsType }{@code >}
     *     
     */
    public void setYearLevels(JAXBElement<YearLevelsType> value) {
        this.yearLevels = value;
    }

    /**
     * Gets the value of the subjectAreas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ACStrandAreaListType }{@code >}
     *     
     */
    public JAXBElement<ACStrandAreaListType> getSubjectAreas() {
        return subjectAreas;
    }

    /**
     * Sets the value of the subjectAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ACStrandAreaListType }{@code >}
     *     
     */
    public void setSubjectAreas(JAXBElement<ACStrandAreaListType> value) {
        this.subjectAreas = value;
    }

    /**
     * Gets the value of the mediaTypes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MediaTypesType }{@code >}
     *     
     */
    public JAXBElement<MediaTypesType> getMediaTypes() {
        return mediaTypes;
    }

    /**
     * Sets the value of the mediaTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MediaTypesType }{@code >}
     *     
     */
    public void setMediaTypes(JAXBElement<MediaTypesType> value) {
        this.mediaTypes = value;
    }

    /**
     * Gets the value of the useAgreement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUseAgreement() {
        return useAgreement;
    }

    /**
     * Sets the value of the useAgreement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUseAgreement(JAXBElement<String> value) {
        this.useAgreement = value;
    }

    /**
     * Gets the value of the agreementDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAgreementDate() {
        return agreementDate;
    }

    /**
     * Sets the value of the agreementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAgreementDate(JAXBElement<XMLGregorianCalendar> value) {
        this.agreementDate = value;
    }

    /**
     * Gets the value of the approvals property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ApprovalsType }{@code >}
     *     
     */
    public JAXBElement<ApprovalsType> getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ApprovalsType }{@code >}
     *     
     */
    public void setApprovals(JAXBElement<ApprovalsType> value) {
        this.approvals = value;
    }

    /**
     * Gets the value of the evaluations property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EvaluationsType }{@code >}
     *     
     */
    public JAXBElement<EvaluationsType> getEvaluations() {
        return evaluations;
    }

    /**
     * Sets the value of the evaluations property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EvaluationsType }{@code >}
     *     
     */
    public void setEvaluations(JAXBElement<EvaluationsType> value) {
        this.evaluations = value;
    }

    /**
     * Gets the value of the components property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentsType }
     *     
     */
    public ComponentsType getComponents() {
        return components;
    }

    /**
     * Sets the value of the components property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentsType }
     *     
     */
    public void setComponents(ComponentsType value) {
        this.components = value;
    }

    /**
     * Gets the value of the learningStandards property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}
     *     
     */
    public JAXBElement<LearningStandardsType> getLearningStandards() {
        return learningStandards;
    }

    /**
     * Sets the value of the learningStandards property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LearningStandardsType }{@code >}
     *     
     */
    public void setLearningStandards(JAXBElement<LearningStandardsType> value) {
        this.learningStandards = value;
    }

    /**
     * Gets the value of the learningResourcePackageRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLearningResourcePackageRefId() {
        return learningResourcePackageRefId;
    }

    /**
     * Sets the value of the learningResourcePackageRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLearningResourcePackageRefId(JAXBElement<String> value) {
        this.learningResourcePackageRefId = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="ReferenceType" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
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
    public static class Location {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "ReferenceType", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String referenceType;

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

}
