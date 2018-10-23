
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
 * An outcome of a Student Wellbeing Event - or more often referred to in discussions as an 'Incident' usually will have a WellbeingResponse, action or an outcome.  Many events may have WellbeingResponses that need to be reported to other systems or agencies.  This may be a Suspension, an Expulsion/Exclusion, or an experience which requires reward or recognition. WA has specific language around categories of suspension—e.g. they are legally constrained not to refer to expulsion of students.
 * 
 * <p>Java class for WellbeingResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="WellbeingResponseStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="WellbeingResponseEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WellbeingResponseCategory" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingResponseCategoryType" minOccurs="0"/>
 *         &lt;element name="WellbeingResponseNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonInvolvementList" type="{http://www.sifassociation.org/datamodel/au/3.4}PersonInvolvementListType" minOccurs="0"/>
 *         &lt;element name="Suspension" type="{http://www.sifassociation.org/datamodel/au/3.4}SuspensionContainerType" minOccurs="0"/>
 *         &lt;element name="Detention" type="{http://www.sifassociation.org/datamodel/au/3.4}DetentionContainerType" minOccurs="0"/>
 *         &lt;element name="PlanRequired" type="{http://www.sifassociation.org/datamodel/au/3.4}PlanRequiredContainerType" minOccurs="0"/>
 *         &lt;element name="Award" type="{http://www.sifassociation.org/datamodel/au/3.4}AwardContainerType" minOccurs="0"/>
 *         &lt;element name="OtherResponse" type="{http://www.sifassociation.org/datamodel/au/3.4}OtherWellbeingResponseContainerType" minOccurs="0"/>
 *         &lt;element name="DocumentList" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingDocumentListType" minOccurs="0"/>
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
@XmlType(name = "WellbeingResponseType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentPersonalRefId",
    "schoolInfoRefId",
    "date",
    "wellbeingResponseStartDate",
    "wellbeingResponseEndDate",
    "wellbeingResponseCategory",
    "wellbeingResponseNotes",
    "personInvolvementList",
    "suspension",
    "detention",
    "planRequired",
    "award",
    "otherResponse",
    "documentList",
    "sifMetadata",
    "sifExtendedElements"
})
public class WellbeingResponseType {

    @XmlElement(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(name = "Date", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "WellbeingResponseStartDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar wellbeingResponseStartDate;
    @XmlElementRef(name = "WellbeingResponseEndDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> wellbeingResponseEndDate;
    @XmlElementRef(name = "WellbeingResponseCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsWellbeingResponseCategoryType> wellbeingResponseCategory;
    @XmlElementRef(name = "WellbeingResponseNotes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wellbeingResponseNotes;
    @XmlElementRef(name = "PersonInvolvementList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<PersonInvolvementListType> personInvolvementList;
    @XmlElementRef(name = "Suspension", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SuspensionContainerType> suspension;
    @XmlElementRef(name = "Detention", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<DetentionContainerType> detention;
    @XmlElementRef(name = "PlanRequired", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<PlanRequiredContainerType> planRequired;
    @XmlElementRef(name = "Award", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AwardContainerType> award;
    @XmlElementRef(name = "OtherResponse", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<OtherWellbeingResponseContainerType> otherResponse;
    @XmlElementRef(name = "DocumentList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<WellbeingDocumentListType> documentList;
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
     * Gets the value of the wellbeingResponseStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getWellbeingResponseStartDate() {
        return wellbeingResponseStartDate;
    }

    /**
     * Sets the value of the wellbeingResponseStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setWellbeingResponseStartDate(XMLGregorianCalendar value) {
        this.wellbeingResponseStartDate = value;
    }

    /**
     * Gets the value of the wellbeingResponseEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getWellbeingResponseEndDate() {
        return wellbeingResponseEndDate;
    }

    /**
     * Sets the value of the wellbeingResponseEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setWellbeingResponseEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.wellbeingResponseEndDate = value;
    }

    /**
     * Gets the value of the wellbeingResponseCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingResponseCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsWellbeingResponseCategoryType> getWellbeingResponseCategory() {
        return wellbeingResponseCategory;
    }

    /**
     * Sets the value of the wellbeingResponseCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingResponseCategoryType }{@code >}
     *     
     */
    public void setWellbeingResponseCategory(JAXBElement<AUCodeSetsWellbeingResponseCategoryType> value) {
        this.wellbeingResponseCategory = value;
    }

    /**
     * Gets the value of the wellbeingResponseNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWellbeingResponseNotes() {
        return wellbeingResponseNotes;
    }

    /**
     * Sets the value of the wellbeingResponseNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWellbeingResponseNotes(JAXBElement<String> value) {
        this.wellbeingResponseNotes = value;
    }

    /**
     * Gets the value of the personInvolvementList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PersonInvolvementListType }{@code >}
     *     
     */
    public JAXBElement<PersonInvolvementListType> getPersonInvolvementList() {
        return personInvolvementList;
    }

    /**
     * Sets the value of the personInvolvementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PersonInvolvementListType }{@code >}
     *     
     */
    public void setPersonInvolvementList(JAXBElement<PersonInvolvementListType> value) {
        this.personInvolvementList = value;
    }

    /**
     * Gets the value of the suspension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SuspensionContainerType }{@code >}
     *     
     */
    public JAXBElement<SuspensionContainerType> getSuspension() {
        return suspension;
    }

    /**
     * Sets the value of the suspension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SuspensionContainerType }{@code >}
     *     
     */
    public void setSuspension(JAXBElement<SuspensionContainerType> value) {
        this.suspension = value;
    }

    /**
     * Gets the value of the detention property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DetentionContainerType }{@code >}
     *     
     */
    public JAXBElement<DetentionContainerType> getDetention() {
        return detention;
    }

    /**
     * Sets the value of the detention property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DetentionContainerType }{@code >}
     *     
     */
    public void setDetention(JAXBElement<DetentionContainerType> value) {
        this.detention = value;
    }

    /**
     * Gets the value of the planRequired property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PlanRequiredContainerType }{@code >}
     *     
     */
    public JAXBElement<PlanRequiredContainerType> getPlanRequired() {
        return planRequired;
    }

    /**
     * Sets the value of the planRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PlanRequiredContainerType }{@code >}
     *     
     */
    public void setPlanRequired(JAXBElement<PlanRequiredContainerType> value) {
        this.planRequired = value;
    }

    /**
     * Gets the value of the award property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AwardContainerType }{@code >}
     *     
     */
    public JAXBElement<AwardContainerType> getAward() {
        return award;
    }

    /**
     * Sets the value of the award property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AwardContainerType }{@code >}
     *     
     */
    public void setAward(JAXBElement<AwardContainerType> value) {
        this.award = value;
    }

    /**
     * Gets the value of the otherResponse property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OtherWellbeingResponseContainerType }{@code >}
     *     
     */
    public JAXBElement<OtherWellbeingResponseContainerType> getOtherResponse() {
        return otherResponse;
    }

    /**
     * Sets the value of the otherResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OtherWellbeingResponseContainerType }{@code >}
     *     
     */
    public void setOtherResponse(JAXBElement<OtherWellbeingResponseContainerType> value) {
        this.otherResponse = value;
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
