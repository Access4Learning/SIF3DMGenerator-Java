
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xStudentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xStudentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.sifassociation.org/datamodel/na/4.x}xPersonNameType" minOccurs="0"/>
 *         &lt;element name="otherNames" type="{http://www.sifassociation.org/datamodel/na/4.x}xOtherPersonNameListType" minOccurs="0"/>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/4.x}xPersonIdType" minOccurs="0"/>
 *         &lt;element name="loginId" type="{http://www.sifassociation.org/datamodel/na/4.x}xLoginIdType" minOccurs="0"/>
 *         &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/4.x}xPersonIdType" minOccurs="0"/>
 *         &lt;element name="otherIds" type="{http://www.sifassociation.org/datamodel/na/4.x}xOtherPersonIdListType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/4.x}xPersonAddressType" minOccurs="0"/>
 *         &lt;element name="otherAddresses" type="{http://www.sifassociation.org/datamodel/na/4.x}xOtherPersonAddressListType" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.sifassociation.org/datamodel/na/4.x}xTelephoneType" minOccurs="0"/>
 *         &lt;element name="otherPhoneNumbers" type="{http://www.sifassociation.org/datamodel/na/4.x}xTelephoneListType" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.sifassociation.org/datamodel/na/4.x}xEmailType" minOccurs="0"/>
 *         &lt;element name="otherEmails" type="{http://www.sifassociation.org/datamodel/na/4.x}xEmailListType" minOccurs="0"/>
 *         &lt;element name="demographics" type="{http://www.sifassociation.org/datamodel/na/4.x}xDemographicsType" minOccurs="0"/>
 *         &lt;element name="enrollment" type="{http://www.sifassociation.org/datamodel/na/4.x}xEnrollmentType" minOccurs="0"/>
 *         &lt;element name="otherEnrollments" type="{http://www.sifassociation.org/datamodel/na/4.x}xEnrollmentListType" minOccurs="0"/>
 *         &lt;element name="academicSummary" type="{http://www.sifassociation.org/datamodel/na/4.x}xAcademicSummaryType" minOccurs="0"/>
 *         &lt;element name="studentContacts" type="{http://www.sifassociation.org/datamodel/na/4.x}xStudentContactListType" minOccurs="0"/>
 *         &lt;element name="languages" type="{http://www.sifassociation.org/datamodel/na/4.x}xLanguageListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xStudentType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "name",
    "otherNames",
    "localId",
    "loginId",
    "stateProvinceId",
    "otherIds",
    "address",
    "otherAddresses",
    "phoneNumber",
    "otherPhoneNumbers",
    "email",
    "otherEmails",
    "demographics",
    "enrollment",
    "otherEnrollments",
    "academicSummary",
    "studentContacts",
    "languages"
})
public class XStudentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XPersonNameType name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XOtherPersonNameListType otherNames;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String loginId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stateProvinceId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XOtherPersonIdListType otherIds;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XPersonAddressType address;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XOtherPersonAddressListType otherAddresses;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XTelephoneType phoneNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XTelephoneListType otherPhoneNumbers;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XEmailType email;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XEmailListType otherEmails;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XDemographicsType demographics;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XEnrollmentType enrollment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XEnrollmentListType otherEnrollments;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XAcademicSummaryType academicSummary;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XStudentContactListType studentContacts;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XLanguageListType languages;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link XPersonNameType }
     *     
     */
    public XPersonNameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPersonNameType }
     *     
     */
    public void setName(XPersonNameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the otherNames property.
     * 
     * @return
     *     possible object is
     *     {@link XOtherPersonNameListType }
     *     
     */
    public XOtherPersonNameListType getOtherNames() {
        return otherNames;
    }

    /**
     * Sets the value of the otherNames property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOtherPersonNameListType }
     *     
     */
    public void setOtherNames(XOtherPersonNameListType value) {
        this.otherNames = value;
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
     * Gets the value of the loginId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoginId() {
        return loginId;
    }

    /**
     * Sets the value of the loginId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoginId(String value) {
        this.loginId = value;
    }

    /**
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceId(String value) {
        this.stateProvinceId = value;
    }

    /**
     * Gets the value of the otherIds property.
     * 
     * @return
     *     possible object is
     *     {@link XOtherPersonIdListType }
     *     
     */
    public XOtherPersonIdListType getOtherIds() {
        return otherIds;
    }

    /**
     * Sets the value of the otherIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOtherPersonIdListType }
     *     
     */
    public void setOtherIds(XOtherPersonIdListType value) {
        this.otherIds = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link XPersonAddressType }
     *     
     */
    public XPersonAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link XPersonAddressType }
     *     
     */
    public void setAddress(XPersonAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the otherAddresses property.
     * 
     * @return
     *     possible object is
     *     {@link XOtherPersonAddressListType }
     *     
     */
    public XOtherPersonAddressListType getOtherAddresses() {
        return otherAddresses;
    }

    /**
     * Sets the value of the otherAddresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOtherPersonAddressListType }
     *     
     */
    public void setOtherAddresses(XOtherPersonAddressListType value) {
        this.otherAddresses = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XTelephoneType }
     *     
     */
    public XTelephoneType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTelephoneType }
     *     
     */
    public void setPhoneNumber(XTelephoneType value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the otherPhoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link XTelephoneListType }
     *     
     */
    public XTelephoneListType getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    /**
     * Sets the value of the otherPhoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTelephoneListType }
     *     
     */
    public void setOtherPhoneNumbers(XTelephoneListType value) {
        this.otherPhoneNumbers = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link XEmailType }
     *     
     */
    public XEmailType getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEmailType }
     *     
     */
    public void setEmail(XEmailType value) {
        this.email = value;
    }

    /**
     * Gets the value of the otherEmails property.
     * 
     * @return
     *     possible object is
     *     {@link XEmailListType }
     *     
     */
    public XEmailListType getOtherEmails() {
        return otherEmails;
    }

    /**
     * Sets the value of the otherEmails property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEmailListType }
     *     
     */
    public void setOtherEmails(XEmailListType value) {
        this.otherEmails = value;
    }

    /**
     * Gets the value of the demographics property.
     * 
     * @return
     *     possible object is
     *     {@link XDemographicsType }
     *     
     */
    public XDemographicsType getDemographics() {
        return demographics;
    }

    /**
     * Sets the value of the demographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDemographicsType }
     *     
     */
    public void setDemographics(XDemographicsType value) {
        this.demographics = value;
    }

    /**
     * Gets the value of the enrollment property.
     * 
     * @return
     *     possible object is
     *     {@link XEnrollmentType }
     *     
     */
    public XEnrollmentType getEnrollment() {
        return enrollment;
    }

    /**
     * Sets the value of the enrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEnrollmentType }
     *     
     */
    public void setEnrollment(XEnrollmentType value) {
        this.enrollment = value;
    }

    /**
     * Gets the value of the otherEnrollments property.
     * 
     * @return
     *     possible object is
     *     {@link XEnrollmentListType }
     *     
     */
    public XEnrollmentListType getOtherEnrollments() {
        return otherEnrollments;
    }

    /**
     * Sets the value of the otherEnrollments property.
     * 
     * @param value
     *     allowed object is
     *     {@link XEnrollmentListType }
     *     
     */
    public void setOtherEnrollments(XEnrollmentListType value) {
        this.otherEnrollments = value;
    }

    /**
     * Gets the value of the academicSummary property.
     * 
     * @return
     *     possible object is
     *     {@link XAcademicSummaryType }
     *     
     */
    public XAcademicSummaryType getAcademicSummary() {
        return academicSummary;
    }

    /**
     * Sets the value of the academicSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link XAcademicSummaryType }
     *     
     */
    public void setAcademicSummary(XAcademicSummaryType value) {
        this.academicSummary = value;
    }

    /**
     * Gets the value of the studentContacts property.
     * 
     * @return
     *     possible object is
     *     {@link XStudentContactListType }
     *     
     */
    public XStudentContactListType getStudentContacts() {
        return studentContacts;
    }

    /**
     * Sets the value of the studentContacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link XStudentContactListType }
     *     
     */
    public void setStudentContacts(XStudentContactListType value) {
        this.studentContacts = value;
    }

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link XLanguageListType }
     *     
     */
    public XLanguageListType getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLanguageListType }
     *     
     */
    public void setLanguages(XLanguageListType value) {
        this.languages = value;
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
