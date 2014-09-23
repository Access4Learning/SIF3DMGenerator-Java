
package sif.dd.us32.model.composite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An individual within an educational setting.
 * 
 * <p>Java class for gPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gPersonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gPartyType">
 *       &lt;sequence>
 *         &lt;element name="addressRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addressRefId" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/3.2>gRefIdPointerType">
 *                           &lt;attribute name="addressRole" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="name" type="{http://www.sifassociation.org/datamodel/na/3.2}gNameOfRecordType"/>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.2}gLocalIdType"/>
 *         &lt;element name="externalId" type="{http://www.sifassociation.org/datamodel/na/3.2}gExternalIdType" minOccurs="0"/>
 *         &lt;element name="electronicIdList" type="{http://www.sifassociation.org/datamodel/na/3.2}gElectronicIdList" minOccurs="0"/>
 *         &lt;element name="otherNameList" type="{http://www.sifassociation.org/datamodel/na/3.2}gOtherNameListType" minOccurs="0"/>
 *         &lt;element name="demographics" type="{http://www.sifassociation.org/datamodel/na/3.2}gDemographicsType" minOccurs="0"/>
 *         &lt;element name="phoneNumberList" type="{http://www.sifassociation.org/datamodel/na/3.2}gPhoneNumberList" minOccurs="0"/>
 *         &lt;element name="emailList" type="{http://www.sifassociation.org/datamodel/na/3.2}gEmailList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gPersonType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "addressRefIdList",
    "name",
    "localId",
    "externalId",
    "electronicIdList",
    "otherNameList",
    "demographics",
    "phoneNumberList",
    "emailList"
})
@XmlSeeAlso({
    GServiceProviderType.class,
    GClientType.class
})
public class GPersonType
    extends GPartyType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GPersonType.AddressRefIdList addressRefIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GNameOfRecordType name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GLocalIdType localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GExternalIdType externalId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GElectronicIdList electronicIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GOtherNameListType otherNameList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GDemographicsType demographics;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GPhoneNumberList phoneNumberList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GEmailList emailList;

    /**
     * Gets the value of the addressRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link GPersonType.AddressRefIdList }
     *     
     */
    public GPersonType.AddressRefIdList getAddressRefIdList() {
        return addressRefIdList;
    }

    /**
     * Sets the value of the addressRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GPersonType.AddressRefIdList }
     *     
     */
    public void setAddressRefIdList(GPersonType.AddressRefIdList value) {
        this.addressRefIdList = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link GNameOfRecordType }
     *     
     */
    public GNameOfRecordType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link GNameOfRecordType }
     *     
     */
    public void setName(GNameOfRecordType value) {
        this.name = value;
    }

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
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link GExternalIdType }
     *     
     */
    public GExternalIdType getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GExternalIdType }
     *     
     */
    public void setExternalId(GExternalIdType value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the electronicIdList property.
     * 
     * @return
     *     possible object is
     *     {@link GElectronicIdList }
     *     
     */
    public GElectronicIdList getElectronicIdList() {
        return electronicIdList;
    }

    /**
     * Sets the value of the electronicIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GElectronicIdList }
     *     
     */
    public void setElectronicIdList(GElectronicIdList value) {
        this.electronicIdList = value;
    }

    /**
     * Gets the value of the otherNameList property.
     * 
     * @return
     *     possible object is
     *     {@link GOtherNameListType }
     *     
     */
    public GOtherNameListType getOtherNameList() {
        return otherNameList;
    }

    /**
     * Sets the value of the otherNameList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GOtherNameListType }
     *     
     */
    public void setOtherNameList(GOtherNameListType value) {
        this.otherNameList = value;
    }

    /**
     * Gets the value of the demographics property.
     * 
     * @return
     *     possible object is
     *     {@link GDemographicsType }
     *     
     */
    public GDemographicsType getDemographics() {
        return demographics;
    }

    /**
     * Sets the value of the demographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link GDemographicsType }
     *     
     */
    public void setDemographics(GDemographicsType value) {
        this.demographics = value;
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
     * Gets the value of the emailList property.
     * 
     * @return
     *     possible object is
     *     {@link GEmailList }
     *     
     */
    public GEmailList getEmailList() {
        return emailList;
    }

    /**
     * Sets the value of the emailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GEmailList }
     *     
     */
    public void setEmailList(GEmailList value) {
        this.emailList = value;
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
     *         &lt;element name="addressRefId" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/3.2>gRefIdPointerType">
     *                 &lt;attribute name="addressRole" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
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
        "addressRefId"
    })
    public static class AddressRefIdList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GPersonType.AddressRefIdList.AddressRefId> addressRefId;

        /**
         * Gets the value of the addressRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the addressRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddressRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GPersonType.AddressRefIdList.AddressRefId }
         * 
         * 
         */
        public List<GPersonType.AddressRefIdList.AddressRefId> getAddressRefId() {
            if (addressRefId == null) {
                addressRefId = new ArrayList<GPersonType.AddressRefIdList.AddressRefId>();
            }
            return this.addressRefId;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/3.2>gRefIdPointerType">
         *       &lt;attribute name="addressRole" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AddressRefId {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String value;
            @XmlAttribute(name = "addressRole")
            @XmlSchemaType(name = "anySimpleType")
            protected String addressRole;

            /**
             * A refId that refers to an instance of a SIF object. The RefId points to the object instance. 
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the addressRole property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressRole() {
                return addressRole;
            }

            /**
             * Sets the value of the addressRole property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressRole(String value) {
                this.addressRole = value;
            }

        }

    }

}
