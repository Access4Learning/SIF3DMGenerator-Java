
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.sifassociation.org/datamodel/na/4.x}NameType"/>
 *         &lt;element name="PositionTitle" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.sifassociation.org/datamodel/na/4.x}OldAddressType" minOccurs="0"/>
 *         &lt;element name="AddressRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="EmailList" type="{http://www.sifassociation.org/datamodel/na/4.x}EmailListType" minOccurs="0"/>
 *         &lt;element name="PhoneNumberList" type="{http://www.sifassociation.org/datamodel/na/4.x}PhoneNumberListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "name",
    "positionTitle",
    "role",
    "address",
    "addressRefId",
    "emailList",
    "phoneNumberList"
})
public class ContactInfoType {

    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected NameType name;
    @XmlElement(name = "PositionTitle", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String positionTitle;
    @XmlElement(name = "Role", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String role;
    @XmlElement(name = "Address", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OldAddressType address;
    @XmlElement(name = "AddressRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String addressRefId;
    @XmlElement(name = "EmailList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EmailListType emailList;
    @XmlElement(name = "PhoneNumberList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PhoneNumberListType phoneNumberList;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setName(NameType value) {
        this.name = value;
    }

    /**
     * Gets the value of the positionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionTitle() {
        return positionTitle;
    }

    /**
     * Sets the value of the positionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionTitle(String value) {
        this.positionTitle = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link OldAddressType }
     *     
     */
    public OldAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldAddressType }
     *     
     */
    public void setAddress(OldAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the addressRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRefId() {
        return addressRefId;
    }

    /**
     * Sets the value of the addressRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRefId(String value) {
        this.addressRefId = value;
    }

    /**
     * Gets the value of the emailList property.
     * 
     * @return
     *     possible object is
     *     {@link EmailListType }
     *     
     */
    public EmailListType getEmailList() {
        return emailList;
    }

    /**
     * Sets the value of the emailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmailListType }
     *     
     */
    public void setEmailList(EmailListType value) {
        this.emailList = value;
    }

    /**
     * Gets the value of the phoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberListType }
     *     
     */
    public PhoneNumberListType getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Sets the value of the phoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberListType }
     *     
     */
    public void setPhoneNumberList(PhoneNumberListType value) {
        this.phoneNumberList = value;
    }

}
