
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This object is designed to facilitate the transfer of State Education Agency (SEA) directory information to the Department of Education (USED) through the Education Data Exchange Network (EDEN).
 * 
 * <p>Java class for seaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="seaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gEducationOrganizationType">
 *       &lt;sequence>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.3}gLocalIdType"/>
 *         &lt;element name="ncesId" type="{http://www.sifassociation.org/datamodel/na/3.3}gExternalIdType" minOccurs="0"/>
 *         &lt;element name="seaName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="seaURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="ccssoContact" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="seaContactList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="seaContact" type="{http://www.sifassociation.org/datamodel/na/3.3}gContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phoneNumberList" type="{http://www.sifassociation.org/datamodel/na/3.3}gPhoneNumberList" minOccurs="0"/>
 *         &lt;element name="addressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.sifassociation.org/datamodel/na/3.3}address" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="edenInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="stateCode" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
 *                   &lt;element name="agencyIdNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "seaType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "localId",
    "ncesId",
    "seaName",
    "seaURL",
    "ccssoContact",
    "seaContactList",
    "phoneNumberList",
    "addressList",
    "edenInfo"
})
public class SeaType
    extends GEducationOrganizationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected GLocalIdType localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GExternalIdType ncesId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String seaName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "anyURI")
    protected String seaURL;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ccssoContact;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected SeaType.SeaContactList seaContactList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GPhoneNumberList phoneNumberList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected SeaType.AddressList addressList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected SeaType.EdenInfo edenInfo;

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setLocalId(GLocalIdType value) {
        this.localId = value;
    }

    /**
     * Gets the value of the ncesId property.
     * 
     * @return
     *     possible object is
     *     {@link GExternalIdType }
     *     
     */
    public GExternalIdType getNcesId() {
        return ncesId;
    }

    /**
     * Sets the value of the ncesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GExternalIdType }
     *     
     */
    public void setNcesId(GExternalIdType value) {
        this.ncesId = value;
    }

    /**
     * Gets the value of the seaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeaName() {
        return seaName;
    }

    /**
     * Sets the value of the seaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeaName(String value) {
        this.seaName = value;
    }

    /**
     * Gets the value of the seaURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeaURL() {
        return seaURL;
    }

    /**
     * Sets the value of the seaURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeaURL(String value) {
        this.seaURL = value;
    }

    /**
     * Gets the value of the ccssoContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcssoContact() {
        return ccssoContact;
    }

    /**
     * Sets the value of the ccssoContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCcssoContact(String value) {
        this.ccssoContact = value;
    }

    /**
     * Gets the value of the seaContactList property.
     * 
     * @return
     *     possible object is
     *     {@link SeaType.SeaContactList }
     *     
     */
    public SeaType.SeaContactList getSeaContactList() {
        return seaContactList;
    }

    /**
     * Sets the value of the seaContactList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaType.SeaContactList }
     *     
     */
    public void setSeaContactList(SeaType.SeaContactList value) {
        this.seaContactList = value;
    }

    /**
     * Gets the value of the phoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link GPhoneNumberList }
     *     
     */
    public GPhoneNumberList getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Sets the value of the phoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPhoneNumberList }
     *     
     */
    public void setPhoneNumberList(GPhoneNumberList value) {
        this.phoneNumberList = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link SeaType.AddressList }
     *     
     */
    public SeaType.AddressList getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaType.AddressList }
     *     
     */
    public void setAddressList(SeaType.AddressList value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the edenInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SeaType.EdenInfo }
     *     
     */
    public SeaType.EdenInfo getEdenInfo() {
        return edenInfo;
    }

    /**
     * Sets the value of the edenInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeaType.EdenInfo }
     *     
     */
    public void setEdenInfo(SeaType.EdenInfo value) {
        this.edenInfo = value;
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
     *         &lt;element ref="{http://www.sifassociation.org/datamodel/na/3.3}address" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<GAddressType> address;

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
         * {@link GAddressType }
         * 
         * 
         */
        public List<GAddressType> getAddress() {
            if (address == null) {
                address = new ArrayList<GAddressType>();
            }
            return this.address;
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
     *         &lt;element name="stateCode" type="{http://www.sifassociation.org/datamodel/na/3.3}gCodedElementType" minOccurs="0"/>
     *         &lt;element name="agencyIdNumber" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
        "stateCode",
        "agencyIdNumber"
    })
    public static class EdenInfo {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected GCodedElementType stateCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String agencyIdNumber;

        /**
         * Gets the value of the stateCode property.
         * 
         * @return
         *     possible object is
         *     {@link GCodedElementType }
         *     
         */
        public GCodedElementType getStateCode() {
            return stateCode;
        }

        /**
         * Sets the value of the stateCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link GCodedElementType }
         *     
         */
        public void setStateCode(GCodedElementType value) {
            this.stateCode = value;
        }

        /**
         * Gets the value of the agencyIdNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgencyIdNumber() {
            return agencyIdNumber;
        }

        /**
         * Sets the value of the agencyIdNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgencyIdNumber(String value) {
            this.agencyIdNumber = value;
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
     *         &lt;element name="seaContact" type="{http://www.sifassociation.org/datamodel/na/3.3}gContactPersonType" maxOccurs="unbounded" minOccurs="0"/>
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
        "seaContact"
    })
    public static class SeaContactList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        protected List<GContactPersonType> seaContact;

        /**
         * Gets the value of the seaContact property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seaContact property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeaContact().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GContactPersonType }
         * 
         * 
         */
        public List<GContactPersonType> getSeaContact() {
            if (seaContact == null) {
                seaContact = new ArrayList<GContactPersonType>();
            }
            return this.seaContact;
        }

    }

}
