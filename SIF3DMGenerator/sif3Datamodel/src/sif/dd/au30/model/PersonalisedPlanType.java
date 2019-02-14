
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PersonalisedPlanType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalisedPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="PersonalisedPlanCategory" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsPersonalisedPlanType" minOccurs="0"/>
 *         &lt;element name="PersonalisedPlanStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PersonalisedPlanEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PersonalisedPlanReviewDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="PersonalisedPlanNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DocumentList" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingDocumentListType" minOccurs="0"/>
 *         &lt;element name="AssociatedAttachment" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
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
@XmlType(name = "PersonalisedPlanType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentPersonalRefId",
    "schoolInfoRefId",
    "personalisedPlanCategory",
    "personalisedPlanStartDate",
    "personalisedPlanEndDate",
    "personalisedPlanReviewDate",
    "personalisedPlanNotes",
    "documentList",
    "associatedAttachment",
    "sifMetadata",
    "sifExtendedElements"
})
public class PersonalisedPlanType {

    @XmlElement(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(name = "PersonalisedPlanCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsPersonalisedPlanType personalisedPlanCategory;
    @XmlElement(name = "PersonalisedPlanStartDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar personalisedPlanStartDate;
    @XmlElementRef(name = "PersonalisedPlanEndDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> personalisedPlanEndDate;
    @XmlElementRef(name = "PersonalisedPlanReviewDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> personalisedPlanReviewDate;
    @XmlElementRef(name = "PersonalisedPlanNotes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personalisedPlanNotes;
    @XmlElementRef(name = "DocumentList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<WellbeingDocumentListType> documentList;
    @XmlElementRef(name = "AssociatedAttachment", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> associatedAttachment;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolInfoRefId(String value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the personalisedPlanCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsPersonalisedPlanType }
     *     
     */
    public AUCodeSetsPersonalisedPlanType getPersonalisedPlanCategory() {
        return personalisedPlanCategory;
    }

    /**
     * Sets the value of the personalisedPlanCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsPersonalisedPlanType }
     *     
     */
    public void setPersonalisedPlanCategory(AUCodeSetsPersonalisedPlanType value) {
        this.personalisedPlanCategory = value;
    }

    /**
     * Gets the value of the personalisedPlanStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPersonalisedPlanStartDate() {
        return personalisedPlanStartDate;
    }

    /**
     * Sets the value of the personalisedPlanStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPersonalisedPlanStartDate(XMLGregorianCalendar value) {
        this.personalisedPlanStartDate = value;
    }

    /**
     * Gets the value of the personalisedPlanEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPersonalisedPlanEndDate() {
        return personalisedPlanEndDate;
    }

    /**
     * Sets the value of the personalisedPlanEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPersonalisedPlanEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.personalisedPlanEndDate = value;
    }

    /**
     * Gets the value of the personalisedPlanReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPersonalisedPlanReviewDate() {
        return personalisedPlanReviewDate;
    }

    /**
     * Sets the value of the personalisedPlanReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPersonalisedPlanReviewDate(JAXBElement<XMLGregorianCalendar> value) {
        this.personalisedPlanReviewDate = value;
    }

    /**
     * Gets the value of the personalisedPlanNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonalisedPlanNotes() {
        return personalisedPlanNotes;
    }

    /**
     * Sets the value of the personalisedPlanNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonalisedPlanNotes(JAXBElement<String> value) {
        this.personalisedPlanNotes = value;
    }

    /**
     * Gets the value of the documentList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WellbeingDocumentListType }{@code >}
     *     
     */
    public JAXBElement<WellbeingDocumentListType> getDocumentList() {
        return documentList;
    }

    /**
     * Sets the value of the documentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WellbeingDocumentListType }{@code >}
     *     
     */
    public void setDocumentList(JAXBElement<WellbeingDocumentListType> value) {
        this.documentList = value;
    }

    /**
     * Gets the value of the associatedAttachment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAssociatedAttachment() {
        return associatedAttachment;
    }

    /**
     * Sets the value of the associatedAttachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAssociatedAttachment(JAXBElement<String> value) {
        this.associatedAttachment = value;
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

}
