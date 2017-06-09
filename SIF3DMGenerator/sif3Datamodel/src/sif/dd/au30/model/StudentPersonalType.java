
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentPersonalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentPersonalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlertMessages" type="{http://www.sifassociation.org/datamodel/au/3.4}AlertMessagesType" minOccurs="0"/>
 *         &lt;element name="MedicalAlertMessages" type="{http://www.sifassociation.org/datamodel/au/3.4}MedicalAlertMessagesType" minOccurs="0"/>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/datamodel/au/3.4}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="ElectronicIdList" type="{http://www.sifassociation.org/datamodel/au/3.4}ElectronicIdListType" minOccurs="0"/>
 *         &lt;element name="OtherIdList" type="{http://www.sifassociation.org/datamodel/au/3.4}OtherIdListType" minOccurs="0"/>
 *         &lt;element name="PersonInfo" type="{http://www.sifassociation.org/datamodel/au/3.4}PersonInfoType" minOccurs="0"/>
 *         &lt;element name="ProjectedGraduationYear" type="{http://www.sifassociation.org/datamodel/au/3.4}ProjectedGraduationYearType" minOccurs="0"/>
 *         &lt;element name="OnTimeGraduationYear" type="{http://www.sifassociation.org/datamodel/au/3.4}OnTimeGraduationYearType" minOccurs="0"/>
 *         &lt;element name="GraduationDate" type="{http://www.sifassociation.org/datamodel/au/3.4}GraduationDateType" minOccurs="0"/>
 *         &lt;element name="MostRecent" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentMostRecentContainerType" minOccurs="0"/>
 *         &lt;element name="AcceptableUsePolicy" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="GiftedTalented" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="EconomicDisadvantage" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="ESL" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="ESLDateAssessed" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="YoungCarersRole" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="Disability" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="IntegrationAide" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="EducationSupport" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="HomeSchooledStudent" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="Sensitive" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="OfflineDelivery" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="PrePrimaryEducation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="FirstAUSchoolEnrollment" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "StudentPersonalType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "alertMessages",
    "medicalAlertMessages",
    "localId",
    "stateProvinceId",
    "electronicIdList",
    "otherIdList",
    "personInfo",
    "projectedGraduationYear",
    "onTimeGraduationYear",
    "graduationDate",
    "mostRecent",
    "acceptableUsePolicy",
    "giftedTalented",
    "economicDisadvantage",
    "esl",
    "eslDateAssessed",
    "youngCarersRole",
    "disability",
    "integrationAide",
    "educationSupport",
    "homeSchooledStudent",
    "sensitive",
    "offlineDelivery",
    "prePrimaryEducation",
    "firstAUSchoolEnrollment",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentPersonalType {

    @XmlElementRef(name = "AlertMessages", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AlertMessagesType> alertMessages;
    @XmlElementRef(name = "MedicalAlertMessages", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MedicalAlertMessagesType> medicalAlertMessages;
    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElementRef(name = "StateProvinceId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateProvinceId;
    @XmlElementRef(name = "ElectronicIdList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ElectronicIdListType> electronicIdList;
    @XmlElementRef(name = "OtherIdList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<OtherIdListType> otherIdList;
    @XmlElement(name = "PersonInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected PersonInfoType personInfo;
    @XmlElementRef(name = "ProjectedGraduationYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> projectedGraduationYear;
    @XmlElementRef(name = "OnTimeGraduationYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> onTimeGraduationYear;
    @XmlElementRef(name = "GraduationDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> graduationDate;
    @XmlElementRef(name = "MostRecent", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<StudentMostRecentContainerType> mostRecent;
    @XmlElementRef(name = "AcceptableUsePolicy", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> acceptableUsePolicy;
    @XmlElementRef(name = "GiftedTalented", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> giftedTalented;
    @XmlElementRef(name = "EconomicDisadvantage", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> economicDisadvantage;
    @XmlElementRef(name = "ESL", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> esl;
    @XmlElementRef(name = "ESLDateAssessed", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> eslDateAssessed;
    @XmlElementRef(name = "YoungCarersRole", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> youngCarersRole;
    @XmlElementRef(name = "Disability", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> disability;
    @XmlElementRef(name = "IntegrationAide", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> integrationAide;
    @XmlElementRef(name = "EducationSupport", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> educationSupport;
    @XmlElementRef(name = "HomeSchooledStudent", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> homeSchooledStudent;
    @XmlElementRef(name = "Sensitive", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> sensitive;
    @XmlElementRef(name = "OfflineDelivery", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> offlineDelivery;
    @XmlElementRef(name = "PrePrimaryEducation", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prePrimaryEducation;
    @XmlElementRef(name = "FirstAUSchoolEnrollment", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> firstAUSchoolEnrollment;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the alertMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AlertMessagesType }{@code >}
     *     
     */
    public JAXBElement<AlertMessagesType> getAlertMessages() {
        return alertMessages;
    }

    /**
     * Sets the value of the alertMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AlertMessagesType }{@code >}
     *     
     */
    public void setAlertMessages(JAXBElement<AlertMessagesType> value) {
        this.alertMessages = value;
    }

    /**
     * Gets the value of the medicalAlertMessages property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MedicalAlertMessagesType }{@code >}
     *     
     */
    public JAXBElement<MedicalAlertMessagesType> getMedicalAlertMessages() {
        return medicalAlertMessages;
    }

    /**
     * Sets the value of the medicalAlertMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MedicalAlertMessagesType }{@code >}
     *     
     */
    public void setMedicalAlertMessages(JAXBElement<MedicalAlertMessagesType> value) {
        this.medicalAlertMessages = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateProvinceId(JAXBElement<String> value) {
        this.stateProvinceId = value;
    }

    /**
     * Gets the value of the electronicIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ElectronicIdListType }{@code >}
     *     
     */
    public JAXBElement<ElectronicIdListType> getElectronicIdList() {
        return electronicIdList;
    }

    /**
     * Sets the value of the electronicIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ElectronicIdListType }{@code >}
     *     
     */
    public void setElectronicIdList(JAXBElement<ElectronicIdListType> value) {
        this.electronicIdList = value;
    }

    /**
     * Gets the value of the otherIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OtherIdListType }{@code >}
     *     
     */
    public JAXBElement<OtherIdListType> getOtherIdList() {
        return otherIdList;
    }

    /**
     * Sets the value of the otherIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OtherIdListType }{@code >}
     *     
     */
    public void setOtherIdList(JAXBElement<OtherIdListType> value) {
        this.otherIdList = value;
    }

    /**
     * Gets the value of the personInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInfoType }
     *     
     */
    public PersonInfoType getPersonInfo() {
        return personInfo;
    }

    /**
     * Sets the value of the personInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInfoType }
     *     
     */
    public void setPersonInfo(PersonInfoType value) {
        this.personInfo = value;
    }

    /**
     * Gets the value of the projectedGraduationYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProjectedGraduationYear() {
        return projectedGraduationYear;
    }

    /**
     * Sets the value of the projectedGraduationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProjectedGraduationYear(JAXBElement<XMLGregorianCalendar> value) {
        this.projectedGraduationYear = value;
    }

    /**
     * Gets the value of the onTimeGraduationYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOnTimeGraduationYear() {
        return onTimeGraduationYear;
    }

    /**
     * Sets the value of the onTimeGraduationYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOnTimeGraduationYear(JAXBElement<XMLGregorianCalendar> value) {
        this.onTimeGraduationYear = value;
    }

    /**
     * Gets the value of the graduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGraduationDate() {
        return graduationDate;
    }

    /**
     * Sets the value of the graduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGraduationDate(JAXBElement<String> value) {
        this.graduationDate = value;
    }

    /**
     * Gets the value of the mostRecent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StudentMostRecentContainerType }{@code >}
     *     
     */
    public JAXBElement<StudentMostRecentContainerType> getMostRecent() {
        return mostRecent;
    }

    /**
     * Sets the value of the mostRecent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StudentMostRecentContainerType }{@code >}
     *     
     */
    public void setMostRecent(JAXBElement<StudentMostRecentContainerType> value) {
        this.mostRecent = value;
    }

    /**
     * Gets the value of the acceptableUsePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getAcceptableUsePolicy() {
        return acceptableUsePolicy;
    }

    /**
     * Sets the value of the acceptableUsePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setAcceptableUsePolicy(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.acceptableUsePolicy = value;
    }

    /**
     * Gets the value of the giftedTalented property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getGiftedTalented() {
        return giftedTalented;
    }

    /**
     * Sets the value of the giftedTalented property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setGiftedTalented(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.giftedTalented = value;
    }

    /**
     * Gets the value of the economicDisadvantage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getEconomicDisadvantage() {
        return economicDisadvantage;
    }

    /**
     * Sets the value of the economicDisadvantage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setEconomicDisadvantage(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.economicDisadvantage = value;
    }

    /**
     * Gets the value of the esl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getESL() {
        return esl;
    }

    /**
     * Sets the value of the esl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setESL(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.esl = value;
    }

    /**
     * Gets the value of the eslDateAssessed property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getESLDateAssessed() {
        return eslDateAssessed;
    }

    /**
     * Sets the value of the eslDateAssessed property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setESLDateAssessed(JAXBElement<XMLGregorianCalendar> value) {
        this.eslDateAssessed = value;
    }

    /**
     * Gets the value of the youngCarersRole property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getYoungCarersRole() {
        return youngCarersRole;
    }

    /**
     * Sets the value of the youngCarersRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setYoungCarersRole(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.youngCarersRole = value;
    }

    /**
     * Gets the value of the disability property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getDisability() {
        return disability;
    }

    /**
     * Sets the value of the disability property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setDisability(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.disability = value;
    }

    /**
     * Gets the value of the integrationAide property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getIntegrationAide() {
        return integrationAide;
    }

    /**
     * Sets the value of the integrationAide property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setIntegrationAide(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.integrationAide = value;
    }

    /**
     * Gets the value of the educationSupport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getEducationSupport() {
        return educationSupport;
    }

    /**
     * Sets the value of the educationSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setEducationSupport(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.educationSupport = value;
    }

    /**
     * Gets the value of the homeSchooledStudent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getHomeSchooledStudent() {
        return homeSchooledStudent;
    }

    /**
     * Sets the value of the homeSchooledStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setHomeSchooledStudent(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.homeSchooledStudent = value;
    }

    /**
     * Gets the value of the sensitive property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getSensitive() {
        return sensitive;
    }

    /**
     * Sets the value of the sensitive property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setSensitive(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.sensitive = value;
    }

    /**
     * Gets the value of the offlineDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getOfflineDelivery() {
        return offlineDelivery;
    }

    /**
     * Sets the value of the offlineDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setOfflineDelivery(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.offlineDelivery = value;
    }

    /**
     * Gets the value of the prePrimaryEducation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrePrimaryEducation() {
        return prePrimaryEducation;
    }

    /**
     * Sets the value of the prePrimaryEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrePrimaryEducation(JAXBElement<String> value) {
        this.prePrimaryEducation = value;
    }

    /**
     * Gets the value of the firstAUSchoolEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirstAUSchoolEnrollment() {
        return firstAUSchoolEnrollment;
    }

    /**
     * Sets the value of the firstAUSchoolEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirstAUSchoolEnrollment(JAXBElement<XMLGregorianCalendar> value) {
        this.firstAUSchoolEnrollment = value;
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
