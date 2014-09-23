
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
 * <p>Java class for psInstitutionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="psInstitutionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="institutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="opeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="federalSchoolCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="levelOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tenureSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="predominantCalendarSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="carnegieBasicClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="controlOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="shortNameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="virtualIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="gridlocation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="countyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="ipeds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ipedsIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tuitionPublished" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tuitionUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="boardCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="roomCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="booksAndSuppliesCosts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="requiredStudentFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="comprehensiveFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="otherStudentExpenses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="priceOfAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="institutionallyControlledHousingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "psInstitutionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "directory",
    "addressList",
    "ipeds"
})
public class PsInstitutionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsInstitutionType.Directory directory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsInstitutionType.AddressList addressList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsInstitutionType.Ipeds ipeds;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link PsInstitutionType.Directory }
     *     
     */
    public PsInstitutionType.Directory getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsInstitutionType.Directory }
     *     
     */
    public void setDirectory(PsInstitutionType.Directory value) {
        this.directory = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link PsInstitutionType.AddressList }
     *     
     */
    public PsInstitutionType.AddressList getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsInstitutionType.AddressList }
     *     
     */
    public void setAddressList(PsInstitutionType.AddressList value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the ipeds property.
     * 
     * @return
     *     possible object is
     *     {@link PsInstitutionType.Ipeds }
     *     
     */
    public PsInstitutionType.Ipeds getIpeds() {
        return ipeds;
    }

    /**
     * Sets the value of the ipeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsInstitutionType.Ipeds }
     *     
     */
    public void setIpeds(PsInstitutionType.Ipeds value) {
        this.ipeds = value;
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
     *                   &lt;element name="gridlocation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="countyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected List<PsInstitutionType.AddressList.Address> address;

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
         * {@link PsInstitutionType.AddressList.Address }
         * 
         * 
         */
        public List<PsInstitutionType.AddressList.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<PsInstitutionType.AddressList.Address>();
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
         *         &lt;element name="gridlocation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="countyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "gridlocation",
            "countyANSICode"
        })
        public static class Address {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected PsInstitutionType.AddressList.Address.Street street;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String city;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String stateProvince;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String postalCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String county;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected PsInstitutionType.AddressList.Address.Gridlocation gridlocation;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String countyANSICode;
            @XmlAttribute(name = "addressType")
            protected String addressType;

            /**
             * Gets the value of the street property.
             * 
             * @return
             *     possible object is
             *     {@link PsInstitutionType.AddressList.Address.Street }
             *     
             */
            public PsInstitutionType.AddressList.Address.Street getStreet() {
                return street;
            }

            /**
             * Sets the value of the street property.
             * 
             * @param value
             *     allowed object is
             *     {@link PsInstitutionType.AddressList.Address.Street }
             *     
             */
            public void setStreet(PsInstitutionType.AddressList.Address.Street value) {
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
             * Gets the value of the gridlocation property.
             * 
             * @return
             *     possible object is
             *     {@link PsInstitutionType.AddressList.Address.Gridlocation }
             *     
             */
            public PsInstitutionType.AddressList.Address.Gridlocation getGridlocation() {
                return gridlocation;
            }

            /**
             * Sets the value of the gridlocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link PsInstitutionType.AddressList.Address.Gridlocation }
             *     
             */
            public void setGridlocation(PsInstitutionType.AddressList.Address.Gridlocation value) {
                this.gridlocation = value;
            }

            /**
             * Gets the value of the countyANSICode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountyANSICode() {
                return countyANSICode;
            }

            /**
             * Sets the value of the countyANSICode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountyANSICode(String value) {
                this.countyANSICode = value;
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
             *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "latitude",
                "longitude"
            })
            public static class Gridlocation {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String latitude;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String longitude;

                /**
                 * Gets the value of the latitude property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLatitude() {
                    return latitude;
                }

                /**
                 * Sets the value of the latitude property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLatitude(String value) {
                    this.latitude = value;
                }

                /**
                 * Gets the value of the longitude property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLongitude() {
                    return longitude;
                }

                /**
                 * Sets the value of the longitude property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLongitude(String value) {
                    this.longitude = value;
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
     *         &lt;element name="institutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="opeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="federalSchoolCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="levelOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tenureSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="predominantCalendarSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="carnegieBasicClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="controlOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="shortNameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="virtualIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "institutionName",
        "opeID",
        "federalSchoolCode",
        "levelOfInstitution",
        "tenureSystem",
        "predominantCalendarSystem",
        "sessionDesignator",
        "carnegieBasicClassification",
        "controlOfInstitution",
        "shortNameOfInstitution",
        "virtualIndicator"
    })
    public static class Directory {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String institutionName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String opeID;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String federalSchoolCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String levelOfInstitution;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String tenureSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String predominantCalendarSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sessionDesignator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String carnegieBasicClassification;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String controlOfInstitution;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String shortNameOfInstitution;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String virtualIndicator;

        /**
         * Gets the value of the institutionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstitutionName() {
            return institutionName;
        }

        /**
         * Sets the value of the institutionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstitutionName(String value) {
            this.institutionName = value;
        }

        /**
         * Gets the value of the opeID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOpeID() {
            return opeID;
        }

        /**
         * Sets the value of the opeID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOpeID(String value) {
            this.opeID = value;
        }

        /**
         * Gets the value of the federalSchoolCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFederalSchoolCode() {
            return federalSchoolCode;
        }

        /**
         * Sets the value of the federalSchoolCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFederalSchoolCode(String value) {
            this.federalSchoolCode = value;
        }

        /**
         * Gets the value of the levelOfInstitution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLevelOfInstitution() {
            return levelOfInstitution;
        }

        /**
         * Sets the value of the levelOfInstitution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLevelOfInstitution(String value) {
            this.levelOfInstitution = value;
        }

        /**
         * Gets the value of the tenureSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTenureSystem() {
            return tenureSystem;
        }

        /**
         * Sets the value of the tenureSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTenureSystem(String value) {
            this.tenureSystem = value;
        }

        /**
         * Gets the value of the predominantCalendarSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPredominantCalendarSystem() {
            return predominantCalendarSystem;
        }

        /**
         * Sets the value of the predominantCalendarSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPredominantCalendarSystem(String value) {
            this.predominantCalendarSystem = value;
        }

        /**
         * Gets the value of the sessionDesignator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionDesignator() {
            return sessionDesignator;
        }

        /**
         * Sets the value of the sessionDesignator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionDesignator(String value) {
            this.sessionDesignator = value;
        }

        /**
         * Gets the value of the carnegieBasicClassification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarnegieBasicClassification() {
            return carnegieBasicClassification;
        }

        /**
         * Sets the value of the carnegieBasicClassification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarnegieBasicClassification(String value) {
            this.carnegieBasicClassification = value;
        }

        /**
         * Gets the value of the controlOfInstitution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getControlOfInstitution() {
            return controlOfInstitution;
        }

        /**
         * Sets the value of the controlOfInstitution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setControlOfInstitution(String value) {
            this.controlOfInstitution = value;
        }

        /**
         * Gets the value of the shortNameOfInstitution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortNameOfInstitution() {
            return shortNameOfInstitution;
        }

        /**
         * Sets the value of the shortNameOfInstitution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortNameOfInstitution(String value) {
            this.shortNameOfInstitution = value;
        }

        /**
         * Gets the value of the virtualIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVirtualIndicator() {
            return virtualIndicator;
        }

        /**
         * Sets the value of the virtualIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVirtualIndicator(String value) {
            this.virtualIndicator = value;
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
     *         &lt;element name="ipedsIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tuitionPublished" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tuitionUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="boardCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="roomCharges" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="booksAndSuppliesCosts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="requiredStudentFees" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="comprehensiveFee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="otherStudentExpenses" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="priceOfAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="institutionallyControlledHousingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ipedsIdentifier",
        "tuitionPublished",
        "tuitionUnit",
        "boardCharges",
        "roomCharges",
        "booksAndSuppliesCosts",
        "requiredStudentFees",
        "comprehensiveFee",
        "otherStudentExpenses",
        "priceOfAttendance",
        "institutionallyControlledHousingStatus"
    })
    public static class Ipeds {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ipedsIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String tuitionPublished;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String tuitionUnit;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String boardCharges;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String roomCharges;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String booksAndSuppliesCosts;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String requiredStudentFees;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String comprehensiveFee;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String otherStudentExpenses;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String priceOfAttendance;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String institutionallyControlledHousingStatus;

        /**
         * Gets the value of the ipedsIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIpedsIdentifier() {
            return ipedsIdentifier;
        }

        /**
         * Sets the value of the ipedsIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIpedsIdentifier(String value) {
            this.ipedsIdentifier = value;
        }

        /**
         * Gets the value of the tuitionPublished property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTuitionPublished() {
            return tuitionPublished;
        }

        /**
         * Sets the value of the tuitionPublished property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTuitionPublished(String value) {
            this.tuitionPublished = value;
        }

        /**
         * Gets the value of the tuitionUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTuitionUnit() {
            return tuitionUnit;
        }

        /**
         * Sets the value of the tuitionUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTuitionUnit(String value) {
            this.tuitionUnit = value;
        }

        /**
         * Gets the value of the boardCharges property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBoardCharges() {
            return boardCharges;
        }

        /**
         * Sets the value of the boardCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBoardCharges(String value) {
            this.boardCharges = value;
        }

        /**
         * Gets the value of the roomCharges property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomCharges() {
            return roomCharges;
        }

        /**
         * Sets the value of the roomCharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomCharges(String value) {
            this.roomCharges = value;
        }

        /**
         * Gets the value of the booksAndSuppliesCosts property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBooksAndSuppliesCosts() {
            return booksAndSuppliesCosts;
        }

        /**
         * Sets the value of the booksAndSuppliesCosts property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBooksAndSuppliesCosts(String value) {
            this.booksAndSuppliesCosts = value;
        }

        /**
         * Gets the value of the requiredStudentFees property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequiredStudentFees() {
            return requiredStudentFees;
        }

        /**
         * Sets the value of the requiredStudentFees property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequiredStudentFees(String value) {
            this.requiredStudentFees = value;
        }

        /**
         * Gets the value of the comprehensiveFee property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getComprehensiveFee() {
            return comprehensiveFee;
        }

        /**
         * Sets the value of the comprehensiveFee property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setComprehensiveFee(String value) {
            this.comprehensiveFee = value;
        }

        /**
         * Gets the value of the otherStudentExpenses property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherStudentExpenses() {
            return otherStudentExpenses;
        }

        /**
         * Sets the value of the otherStudentExpenses property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherStudentExpenses(String value) {
            this.otherStudentExpenses = value;
        }

        /**
         * Gets the value of the priceOfAttendance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceOfAttendance() {
            return priceOfAttendance;
        }

        /**
         * Sets the value of the priceOfAttendance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceOfAttendance(String value) {
            this.priceOfAttendance = value;
        }

        /**
         * Gets the value of the institutionallyControlledHousingStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstitutionallyControlledHousingStatus() {
            return institutionallyControlledHousingStatus;
        }

        /**
         * Sets the value of the institutionallyControlledHousingStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstitutionallyControlledHousingStatus(String value) {
            this.institutionallyControlledHousingStatus = value;
        }

    }

}
