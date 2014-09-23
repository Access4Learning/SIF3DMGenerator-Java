
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for parentGuardianCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parentGuardianCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custodialParentOrGuardianIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="personRelationshipToLearnerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="otherNameList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="street" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phoneNumberList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNumber" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="emailList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="email" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="educationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emergencyContactIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parentGuardianCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "custodialParentOrGuardianIndicator",
    "personRelationshipToLearnerType",
    "name",
    "otherNameList",
    "addressList",
    "phoneNumberList",
    "emailList",
    "educationLevel",
    "emergencyContactIndicator"
})
public class ParentGuardianCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String custodialParentOrGuardianIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String personRelationshipToLearnerType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ParentGuardianCEDSType.Name name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ParentGuardianCEDSType.OtherNameList otherNameList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ParentGuardianCEDSType.AddressList addressList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ParentGuardianCEDSType.PhoneNumberList phoneNumberList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ParentGuardianCEDSType.EmailList emailList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String educationLevel;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String emergencyContactIndicator;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the custodialParentOrGuardianIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustodialParentOrGuardianIndicator() {
        return custodialParentOrGuardianIndicator;
    }

    /**
     * Sets the value of the custodialParentOrGuardianIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustodialParentOrGuardianIndicator(String value) {
        this.custodialParentOrGuardianIndicator = value;
    }

    /**
     * Gets the value of the personRelationshipToLearnerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRelationshipToLearnerType() {
        return personRelationshipToLearnerType;
    }

    /**
     * Sets the value of the personRelationshipToLearnerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRelationshipToLearnerType(String value) {
        this.personRelationshipToLearnerType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ParentGuardianCEDSType.Name }
     *     
     */
    public ParentGuardianCEDSType.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentGuardianCEDSType.Name }
     *     
     */
    public void setName(ParentGuardianCEDSType.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the otherNameList property.
     * 
     * @return
     *     possible object is
     *     {@link ParentGuardianCEDSType.OtherNameList }
     *     
     */
    public ParentGuardianCEDSType.OtherNameList getOtherNameList() {
        return otherNameList;
    }

    /**
     * Sets the value of the otherNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentGuardianCEDSType.OtherNameList }
     *     
     */
    public void setOtherNameList(ParentGuardianCEDSType.OtherNameList value) {
        this.otherNameList = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link ParentGuardianCEDSType.AddressList }
     *     
     */
    public ParentGuardianCEDSType.AddressList getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentGuardianCEDSType.AddressList }
     *     
     */
    public void setAddressList(ParentGuardianCEDSType.AddressList value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the phoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ParentGuardianCEDSType.PhoneNumberList }
     *     
     */
    public ParentGuardianCEDSType.PhoneNumberList getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Sets the value of the phoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentGuardianCEDSType.PhoneNumberList }
     *     
     */
    public void setPhoneNumberList(ParentGuardianCEDSType.PhoneNumberList value) {
        this.phoneNumberList = value;
    }

    /**
     * Gets the value of the emailList property.
     * 
     * @return
     *     possible object is
     *     {@link ParentGuardianCEDSType.EmailList }
     *     
     */
    public ParentGuardianCEDSType.EmailList getEmailList() {
        return emailList;
    }

    /**
     * Sets the value of the emailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParentGuardianCEDSType.EmailList }
     *     
     */
    public void setEmailList(ParentGuardianCEDSType.EmailList value) {
        this.emailList = value;
    }

    /**
     * Gets the value of the educationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * Sets the value of the educationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationLevel(String value) {
        this.educationLevel = value;
    }

    /**
     * Gets the value of the emergencyContactIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmergencyContactIndicator() {
        return emergencyContactIndicator;
    }

    /**
     * Sets the value of the emergencyContactIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmergencyContactIndicator(String value) {
        this.emergencyContactIndicator = value;
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
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="street" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "address"
    })
    public static class AddressList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<ParentGuardianCEDSType.AddressList.Address> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParentGuardianCEDSType.AddressList.Address }
         * 
         * 
         */
        public List<ParentGuardianCEDSType.AddressList.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<ParentGuardianCEDSType.AddressList.Address>();
            }
            return this.address;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="street" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "street",
            "city",
            "stateProvince",
            "postalCode",
            "county",
            "country"
        })
        public static class Address {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected ParentGuardianCEDSType.AddressList.Address.Street street;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String city;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String stateProvince;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String postalCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String county;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String country;
            @XmlAttribute(name = "addressType")
            protected String addressType;

            /**
             * Gets the value of the street property.
             * 
             * @return
             *     possible object is
             *     {@link ParentGuardianCEDSType.AddressList.Address.Street }
             *     
             */
            public ParentGuardianCEDSType.AddressList.Address.Street getStreet() {
                return street;
            }

            /**
             * Sets the value of the street property.
             * 
             * @param value
             *     allowed object is
             *     {@link ParentGuardianCEDSType.AddressList.Address.Street }
             *     
             */
            public void setStreet(ParentGuardianCEDSType.AddressList.Address.Street value) {
                this.street = value;
            }

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Gets the value of the stateProvince property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateProvince() {
                return stateProvince;
            }

            /**
             * Sets the value of the stateProvince property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateProvince(String value) {
                this.stateProvince = value;
            }

            /**
             * Gets the value of the postalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Sets the value of the postalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

            /**
             * Gets the value of the county property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCounty() {
                return county;
            }

            /**
             * Sets the value of the county property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCounty(String value) {
                this.county = value;
            }

            /**
             * Gets the value of the country property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountry() {
                return country;
            }

            /**
             * Sets the value of the country property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountry(String value) {
                this.country = value;
            }

            /**
             * Gets the value of the addressType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressType() {
                return addressType;
            }

            /**
             * Sets the value of the addressType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressType(String value) {
                this.addressType = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "line1",
                "apartmentNumber"
            })
            public static class Street {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String line1;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String apartmentNumber;

                /**
                 * Gets the value of the line1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLine1() {
                    return line1;
                }

                /**
                 * Sets the value of the line1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLine1(String value) {
                    this.line1 = value;
                }

                /**
                 * Gets the value of the apartmentNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getApartmentNumber() {
                    return apartmentNumber;
                }

                /**
                 * Sets the value of the apartmentNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setApartmentNumber(String value) {
                    this.apartmentNumber = value;
                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="email" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "email"
    })
    public static class EmailList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<ParentGuardianCEDSType.EmailList.Email> email;

        /**
         * Gets the value of the email property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the email property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParentGuardianCEDSType.EmailList.Email }
         * 
         * 
         */
        public List<ParentGuardianCEDSType.EmailList.Email> getEmail() {
            if (email == null) {
                email = new ArrayList<ParentGuardianCEDSType.EmailList.Email>();
            }
            return this.email;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Email {

            @XmlAttribute(name = "emailType")
            protected String emailType;

            /**
             * Gets the value of the emailType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmailType() {
                return emailType;
            }

            /**
             * Sets the value of the emailType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmailType(String value) {
                this.emailType = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "firstName",
        "middleName",
        "lastName",
        "suffix",
        "prefix"
    })
    public static class Name {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String firstName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String middleName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String lastName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String suffix;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String prefix;

        /**
         * Gets the value of the firstName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstName() {
            return firstName;
        }

        /**
         * Sets the value of the firstName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstName(String value) {
            this.firstName = value;
        }

        /**
         * Gets the value of the middleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMiddleName() {
            return middleName;
        }

        /**
         * Sets the value of the middleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMiddleName(String value) {
            this.middleName = value;
        }

        /**
         * Gets the value of the lastName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastName() {
            return lastName;
        }

        /**
         * Sets the value of the lastName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastName(String value) {
            this.lastName = value;
        }

        /**
         * Gets the value of the suffix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuffix() {
            return suffix;
        }

        /**
         * Sets the value of the suffix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuffix(String value) {
            this.suffix = value;
        }

        /**
         * Gets the value of the prefix property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrefix() {
            return prefix;
        }

        /**
         * Sets the value of the prefix property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrefix(String value) {
            this.prefix = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "otherName"
    })
    public static class OtherNameList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<ParentGuardianCEDSType.OtherNameList.OtherName> otherName;

        /**
         * Gets the value of the otherName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParentGuardianCEDSType.OtherNameList.OtherName }
         * 
         * 
         */
        public List<ParentGuardianCEDSType.OtherNameList.OtherName> getOtherName() {
            if (otherName == null) {
                otherName = new ArrayList<ParentGuardianCEDSType.OtherNameList.OtherName>();
            }
            return this.otherName;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OtherName {

            @XmlAttribute(name = "otherNameType")
            protected String otherNameType;

            /**
             * Gets the value of the otherNameType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherNameType() {
                return otherNameType;
            }

            /**
             * Sets the value of the otherNameType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherNameType(String value) {
                this.otherNameType = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="phoneNumber" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phoneNumber"
    })
    public static class PhoneNumberList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<ParentGuardianCEDSType.PhoneNumberList.PhoneNumber> phoneNumber;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ParentGuardianCEDSType.PhoneNumberList.PhoneNumber }
         * 
         * 
         */
        public List<ParentGuardianCEDSType.PhoneNumberList.PhoneNumber> getPhoneNumber() {
            if (phoneNumber == null) {
                phoneNumber = new ArrayList<ParentGuardianCEDSType.PhoneNumberList.PhoneNumber>();
            }
            return this.phoneNumber;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "phoneNumberIndicator",
            "number"
        })
        public static class PhoneNumber {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String phoneNumberIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String number;
            @XmlAttribute(name = "phoneNumberType")
            protected String phoneNumberType;

            /**
             * Gets the value of the phoneNumberIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneNumberIndicator() {
                return phoneNumberIndicator;
            }

            /**
             * Sets the value of the phoneNumberIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneNumberIndicator(String value) {
                this.phoneNumberIndicator = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the phoneNumberType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneNumberType() {
                return phoneNumberType;
            }

            /**
             * Sets the value of the phoneNumberType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneNumberType(String value) {
                this.phoneNumberType = value;
            }

        }

    }

}
