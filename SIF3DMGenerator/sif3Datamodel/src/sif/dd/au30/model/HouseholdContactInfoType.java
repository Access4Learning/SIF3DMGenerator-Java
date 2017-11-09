
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HouseholdContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreferenceNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="HouseholdContactId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="HouseholdSalutation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="AddressList" type="{http://www.sifassociation.org/datamodel/au/3.4}AddressListType" minOccurs="0"/>
 *         &lt;element name="EmailList" type="{http://www.sifassociation.org/datamodel/au/3.4}EmailListType" minOccurs="0"/>
 *         &lt;element name="PhoneNumberList" type="{http://www.sifassociation.org/datamodel/au/3.4}PhoneNumberListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdContactInfoType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "preferenceNumber",
    "householdContactId",
    "householdSalutation",
    "addressList",
    "emailList",
    "phoneNumberList"
})
public class HouseholdContactInfoType {

    @XmlElement(name = "PreferenceNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "unsignedInt")
    protected long preferenceNumber;
    @XmlElementRef(name = "HouseholdContactId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> householdContactId;
    @XmlElementRef(name = "HouseholdSalutation", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> householdSalutation;
    @XmlElementRef(name = "AddressList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressListType> addressList;
    @XmlElementRef(name = "EmailList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailListType> emailList;
    @XmlElementRef(name = "PhoneNumberList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneNumberListType> phoneNumberList;

    /**
     * Gets the value of the preferenceNumber property.
     * 
     */
    public long getPreferenceNumber() {
        return preferenceNumber;
    }

    /**
     * Sets the value of the preferenceNumber property.
     * 
     */
    public void setPreferenceNumber(long value) {
        this.preferenceNumber = value;
    }

    /**
     * Gets the value of the householdContactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseholdContactId() {
        return householdContactId;
    }

    /**
     * Sets the value of the householdContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseholdContactId(JAXBElement<String> value) {
        this.householdContactId = value;
    }

    /**
     * Gets the value of the householdSalutation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHouseholdSalutation() {
        return householdSalutation;
    }

    /**
     * Sets the value of the householdSalutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHouseholdSalutation(JAXBElement<String> value) {
        this.householdSalutation = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressListType }{@code >}
     *     
     */
    public JAXBElement<AddressListType> getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressListType }{@code >}
     *     
     */
    public void setAddressList(JAXBElement<AddressListType> value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the emailList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmailListType }{@code >}
     *     
     */
    public JAXBElement<EmailListType> getEmailList() {
        return emailList;
    }

    /**
     * Sets the value of the emailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmailListType }{@code >}
     *     
     */
    public void setEmailList(JAXBElement<EmailListType> value) {
        this.emailList = value;
    }

    /**
     * Gets the value of the phoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumberListType }{@code >}
     *     
     */
    public JAXBElement<PhoneNumberListType> getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Sets the value of the phoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumberListType }{@code >}
     *     
     */
    public void setPhoneNumberList(JAXBElement<PhoneNumberListType> value) {
        this.phoneNumberList = value;
    }

}
