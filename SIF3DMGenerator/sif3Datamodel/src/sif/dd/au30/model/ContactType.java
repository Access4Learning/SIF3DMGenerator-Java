
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.sifassociation.org/datamodel/au/3.4.1}NameType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AddressType" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://www.sifassociation.org/datamodel/au/3.4.1}PhoneNumberType" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.sifassociation.org/datamodel/au/3.4.1}EmailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "name",
    "address",
    "phoneNumber",
    "email"
})
public class ContactType {

    @XmlElementRef(name = "Name", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<NameType> name;
    @XmlElementRef(name = "Address", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<AddressType> address;
    @XmlElementRef(name = "PhoneNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<PhoneNumberType> phoneNumber;
    @XmlElementRef(name = "Email", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<EmailType> email;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NameType }{@code >}
     *     
     */
    public JAXBElement<NameType> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NameType }{@code >}
     *     
     */
    public void setName(JAXBElement<NameType> value) {
        this.name = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public JAXBElement<AddressType> getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddressType }{@code >}
     *     
     */
    public void setAddress(JAXBElement<AddressType> value) {
        this.address = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumberType }{@code >}
     *     
     */
    public JAXBElement<PhoneNumberType> getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PhoneNumberType }{@code >}
     *     
     */
    public void setPhoneNumber(JAXBElement<PhoneNumberType> value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmailType }{@code >}
     *     
     */
    public JAXBElement<EmailType> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmailType }{@code >}
     *     
     */
    public void setEmail(JAXBElement<EmailType> value) {
        this.email = value;
    }

}
