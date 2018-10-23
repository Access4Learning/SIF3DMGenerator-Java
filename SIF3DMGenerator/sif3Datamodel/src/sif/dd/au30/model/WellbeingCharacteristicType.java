
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Core Wellbeing Characteristic that is integral to the Student.  This may be a Medical condition, special needs or a characteristic such as a known disability or any other characteristic or condition that is student specific and impacts their learning. Some characteristics are already captured in the Demographics container of StudentPersonal however this object allows for more complex and targeted information.
 * 
 * <p>Java class for WellbeingCharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingCharacteristicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="WellbeingCharacteristicClassification" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingCharacteristicClassificationType" minOccurs="0"/>
 *         &lt;element name="WellbeingCharacteristicStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WellbeingCharacteristicEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WellbeingCharacteristicReviewDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="WellbeingCharacteristicNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WellbeingCharacteristicCategory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingCharacteristicCategoryType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WellbeingCharacteristicSubCategory" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingCharacteristicSubCategoryType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LocalCharacteristicCode" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="CharacteristicSeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DailyManagement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyManagement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmergencyResponsePlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Trigger" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfidentialFlag" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="Alert" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="MedicationList" type="{http://www.sifassociation.org/datamodel/au/3.4}MedicationListType" minOccurs="0"/>
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
@XmlType(name = "WellbeingCharacteristicType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentPersonalRefId",
    "schoolInfoRefId",
    "wellbeingCharacteristicClassification",
    "wellbeingCharacteristicStartDate",
    "wellbeingCharacteristicEndDate",
    "wellbeingCharacteristicReviewDate",
    "wellbeingCharacteristicNotes",
    "wellbeingCharacteristicCategory",
    "wellbeingCharacteristicSubCategory",
    "localCharacteristicCode",
    "characteristicSeverity",
    "dailyManagement",
    "emergencyManagement",
    "emergencyResponsePlan",
    "trigger",
    "confidentialFlag",
    "alert",
    "medicationList",
    "documentList",
    "sifMetadata",
    "sifExtendedElements"
})
public class WellbeingCharacteristicType {

    @XmlElement(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElementRef(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolInfoRefId;
    @XmlElementRef(name = "WellbeingCharacteristicClassification", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsWellbeingCharacteristicClassificationType> wellbeingCharacteristicClassification;
    @XmlElementRef(name = "WellbeingCharacteristicStartDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> wellbeingCharacteristicStartDate;
    @XmlElementRef(name = "WellbeingCharacteristicEndDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> wellbeingCharacteristicEndDate;
    @XmlElementRef(name = "WellbeingCharacteristicReviewDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> wellbeingCharacteristicReviewDate;
    @XmlElementRef(name = "WellbeingCharacteristicNotes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wellbeingCharacteristicNotes;
    @XmlElementRef(name = "WellbeingCharacteristicCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wellbeingCharacteristicCategory;
    @XmlElementRef(name = "WellbeingCharacteristicSubCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wellbeingCharacteristicSubCategory;
    @XmlElementRef(name = "LocalCharacteristicCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localCharacteristicCode;
    @XmlElementRef(name = "CharacteristicSeverity", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> characteristicSeverity;
    @XmlElementRef(name = "DailyManagement", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dailyManagement;
    @XmlElementRef(name = "EmergencyManagement", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emergencyManagement;
    @XmlElementRef(name = "EmergencyResponsePlan", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emergencyResponsePlan;
    @XmlElementRef(name = "Trigger", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> trigger;
    @XmlElementRef(name = "ConfidentialFlag", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> confidentialFlag;
    @XmlElementRef(name = "Alert", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> alert;
    @XmlElementRef(name = "MedicationList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MedicationListType> medicationList;
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolInfoRefId(JAXBElement<String> value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the wellbeingCharacteristicClassification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingCharacteristicClassificationType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsWellbeingCharacteristicClassificationType> getWellbeingCharacteristicClassification() {
        return wellbeingCharacteristicClassification;
    }

    /**
     * Sets the value of the wellbeingCharacteristicClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingCharacteristicClassificationType }{@code >}
     *     
     */
    public void setWellbeingCharacteristicClassification(JAXBElement<AUCodeSetsWellbeingCharacteristicClassificationType> value) {
        this.wellbeingCharacteristicClassification = value;
    }

    /**
     * Gets the value of the wellbeingCharacteristicStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getWellbeingCharacteristicStartDate() {
        return wellbeingCharacteristicStartDate;
    }

    /**
     * Sets the value of the wellbeingCharacteristicStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setWellbeingCharacteristicStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.wellbeingCharacteristicStartDate = value;
    }

    /**
     * Gets the value of the wellbeingCharacteristicEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getWellbeingCharacteristicEndDate() {
        return wellbeingCharacteristicEndDate;
    }

    /**
     * Sets the value of the wellbeingCharacteristicEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setWellbeingCharacteristicEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.wellbeingCharacteristicEndDate = value;
    }

    /**
     * Gets the value of the wellbeingCharacteristicReviewDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getWellbeingCharacteristicReviewDate() {
        return wellbeingCharacteristicReviewDate;
    }

    /**
     * Sets the value of the wellbeingCharacteristicReviewDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setWellbeingCharacteristicReviewDate(JAXBElement<XMLGregorianCalendar> value) {
        this.wellbeingCharacteristicReviewDate = value;
    }

    /**
     * Gets the value of the wellbeingCharacteristicNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWellbeingCharacteristicNotes() {
        return wellbeingCharacteristicNotes;
    }

    /**
     * Sets the value of the wellbeingCharacteristicNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWellbeingCharacteristicNotes(JAXBElement<String> value) {
        this.wellbeingCharacteristicNotes = value;
    }

    /**
     * Gets the value of the wellbeingCharacteristicCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWellbeingCharacteristicCategory() {
        return wellbeingCharacteristicCategory;
    }

    /**
     * Sets the value of the wellbeingCharacteristicCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWellbeingCharacteristicCategory(JAXBElement<String> value) {
        this.wellbeingCharacteristicCategory = value;
    }

    /**
     * Gets the value of the wellbeingCharacteristicSubCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWellbeingCharacteristicSubCategory() {
        return wellbeingCharacteristicSubCategory;
    }

    /**
     * Sets the value of the wellbeingCharacteristicSubCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWellbeingCharacteristicSubCategory(JAXBElement<String> value) {
        this.wellbeingCharacteristicSubCategory = value;
    }

    /**
     * Gets the value of the localCharacteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalCharacteristicCode() {
        return localCharacteristicCode;
    }

    /**
     * Sets the value of the localCharacteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalCharacteristicCode(JAXBElement<String> value) {
        this.localCharacteristicCode = value;
    }

    /**
     * Gets the value of the characteristicSeverity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCharacteristicSeverity() {
        return characteristicSeverity;
    }

    /**
     * Sets the value of the characteristicSeverity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCharacteristicSeverity(JAXBElement<String> value) {
        this.characteristicSeverity = value;
    }

    /**
     * Gets the value of the dailyManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDailyManagement() {
        return dailyManagement;
    }

    /**
     * Sets the value of the dailyManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDailyManagement(JAXBElement<String> value) {
        this.dailyManagement = value;
    }

    /**
     * Gets the value of the emergencyManagement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmergencyManagement() {
        return emergencyManagement;
    }

    /**
     * Sets the value of the emergencyManagement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmergencyManagement(JAXBElement<String> value) {
        this.emergencyManagement = value;
    }

    /**
     * Gets the value of the emergencyResponsePlan property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmergencyResponsePlan() {
        return emergencyResponsePlan;
    }

    /**
     * Sets the value of the emergencyResponsePlan property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmergencyResponsePlan(JAXBElement<String> value) {
        this.emergencyResponsePlan = value;
    }

    /**
     * Gets the value of the trigger property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTrigger() {
        return trigger;
    }

    /**
     * Sets the value of the trigger property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTrigger(JAXBElement<String> value) {
        this.trigger = value;
    }

    /**
     * Gets the value of the confidentialFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getConfidentialFlag() {
        return confidentialFlag;
    }

    /**
     * Sets the value of the confidentialFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setConfidentialFlag(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.confidentialFlag = value;
    }

    /**
     * Gets the value of the alert property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getAlert() {
        return alert;
    }

    /**
     * Sets the value of the alert property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setAlert(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.alert = value;
    }

    /**
     * Gets the value of the medicationList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MedicationListType }{@code >}
     *     
     */
    public JAXBElement<MedicationListType> getMedicationList() {
        return medicationList;
    }

    /**
     * Sets the value of the medicationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MedicationListType }{@code >}
     *     
     */
    public void setMedicationList(JAXBElement<MedicationListType> value) {
        this.medicationList = value;
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
