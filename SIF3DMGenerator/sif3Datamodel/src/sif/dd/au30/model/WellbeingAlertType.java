
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
 * <p>Java class for WellbeingAlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingAlertType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WellbeingAlertStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WellbeingAlertEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WellbeingAlertCategory" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingAlertCategoryType" minOccurs="0"/>
 *         &lt;element name="WellbeingAlertDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnrolmentRestricted" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="AlertAudience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertSeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AlertKeyContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalCodeListType" minOccurs="0"/>
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
@XmlType(name = "WellbeingAlertType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "localId",
    "studentPersonalRefId",
    "schoolInfoRefId",
    "date",
    "wellbeingAlertStartDate",
    "wellbeingAlertEndDate",
    "wellbeingAlertCategory",
    "wellbeingAlertDescription",
    "enrolmentRestricted",
    "alertAudience",
    "alertSeverity",
    "alertKeyContact",
    "localCodeList",
    "sifMetadata",
    "sifExtendedElements"
})
public class WellbeingAlertType {

    @XmlElementRef(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localId;
    @XmlElement(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(name = "Date", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "WellbeingAlertStartDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> wellbeingAlertStartDate;
    @XmlElementRef(name = "WellbeingAlertEndDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> wellbeingAlertEndDate;
    @XmlElementRef(name = "WellbeingAlertCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsWellbeingAlertCategoryType> wellbeingAlertCategory;
    @XmlElementRef(name = "WellbeingAlertDescription", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wellbeingAlertDescription;
    @XmlElementRef(name = "EnrolmentRestricted", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> enrolmentRestricted;
    @XmlElementRef(name = "AlertAudience", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alertAudience;
    @XmlElementRef(name = "AlertSeverity", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alertSeverity;
    @XmlElementRef(name = "AlertKeyContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alertKeyContact;
    @XmlElementRef(name = "LocalCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalCodeListType> localCodeList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalId(JAXBElement<String> value) {
        this.localId = value;
    }

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
     * Gets the value of the wellbeingAlertStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getWellbeingAlertStartDate() {
        return wellbeingAlertStartDate;
    }

    /**
     * Sets the value of the wellbeingAlertStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setWellbeingAlertStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.wellbeingAlertStartDate = value;
    }

    /**
     * Gets the value of the wellbeingAlertEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getWellbeingAlertEndDate() {
        return wellbeingAlertEndDate;
    }

    /**
     * Sets the value of the wellbeingAlertEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setWellbeingAlertEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.wellbeingAlertEndDate = value;
    }

    /**
     * Gets the value of the wellbeingAlertCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingAlertCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsWellbeingAlertCategoryType> getWellbeingAlertCategory() {
        return wellbeingAlertCategory;
    }

    /**
     * Sets the value of the wellbeingAlertCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingAlertCategoryType }{@code >}
     *     
     */
    public void setWellbeingAlertCategory(JAXBElement<AUCodeSetsWellbeingAlertCategoryType> value) {
        this.wellbeingAlertCategory = value;
    }

    /**
     * Gets the value of the wellbeingAlertDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWellbeingAlertDescription() {
        return wellbeingAlertDescription;
    }

    /**
     * Sets the value of the wellbeingAlertDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWellbeingAlertDescription(JAXBElement<String> value) {
        this.wellbeingAlertDescription = value;
    }

    /**
     * Gets the value of the enrolmentRestricted property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getEnrolmentRestricted() {
        return enrolmentRestricted;
    }

    /**
     * Sets the value of the enrolmentRestricted property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setEnrolmentRestricted(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.enrolmentRestricted = value;
    }

    /**
     * Gets the value of the alertAudience property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlertAudience() {
        return alertAudience;
    }

    /**
     * Sets the value of the alertAudience property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlertAudience(JAXBElement<String> value) {
        this.alertAudience = value;
    }

    /**
     * Gets the value of the alertSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlertSeverity() {
        return alertSeverity;
    }

    /**
     * Sets the value of the alertSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlertSeverity(JAXBElement<String> value) {
        this.alertSeverity = value;
    }

    /**
     * Gets the value of the alertKeyContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlertKeyContact() {
        return alertKeyContact;
    }

    /**
     * Sets the value of the alertKeyContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlertKeyContact(JAXBElement<String> value) {
        this.alertKeyContact = value;
    }

    /**
     * Gets the value of the localCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public JAXBElement<LocalCodeListType> getLocalCodeList() {
        return localCodeList;
    }

    /**
     * Sets the value of the localCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public void setLocalCodeList(JAXBElement<LocalCodeListType> value) {
        this.localCodeList = value;
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
