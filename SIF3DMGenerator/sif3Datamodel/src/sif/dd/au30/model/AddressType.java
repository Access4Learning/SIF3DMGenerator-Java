
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EffectiveFromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EffectiveToDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Street" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AddressStreetType"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="StateProvince" type="{http://www.sifassociation.org/datamodel/au/3.4.1}StateProvinceType" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.sifassociation.org/datamodel/au/3.4.1}CountryType" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="GridLocation" type="{http://www.sifassociation.org/datamodel/au/3.4.1}GridLocationType" minOccurs="0"/>
 *         &lt;element name="MapReference" type="{http://www.sifassociation.org/datamodel/au/3.4.1}MapReferenceType" minOccurs="0"/>
 *         &lt;element name="RadioContact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Community" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}LocalIdType" minOccurs="0"/>
 *         &lt;element name="AddressGlobalUID" type="{http://www.sifassociation.org/datamodel/au/3.4.1}GUIDType" minOccurs="0"/>
 *         &lt;element name="StatisticalAreas" type="{http://www.sifassociation.org/datamodel/au/3.4.1}StatisticalAreasType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsAddressTypeType" />
 *       &lt;attribute name="Role" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AUCodeSetsAddressRoleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "effectiveFromDate",
    "effectiveToDate",
    "street",
    "city",
    "stateProvince",
    "country",
    "postalCode",
    "gridLocation",
    "mapReference",
    "radioContact",
    "community",
    "localId",
    "addressGlobalUID",
    "statisticalAreas"
})
public class AddressType {

    @XmlElementRef(name = "EffectiveFromDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> effectiveFromDate;
    @XmlElementRef(name = "EffectiveToDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> effectiveToDate;
    @XmlElement(name = "Street", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected AddressStreetType street;
    @XmlElement(name = "City", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String city;
    @XmlElementRef(name = "StateProvince", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateProvince;
    @XmlElementRef(name = "Country", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElement(name = "PostalCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String postalCode;
    @XmlElementRef(name = "GridLocation", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<GridLocationType> gridLocation;
    @XmlElementRef(name = "MapReference", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<MapReferenceType> mapReference;
    @XmlElementRef(name = "RadioContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> radioContact;
    @XmlElementRef(name = "Community", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> community;
    @XmlElementRef(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localId;
    @XmlElementRef(name = "AddressGlobalUID", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addressGlobalUID;
    @XmlElementRef(name = "StatisticalAreas", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", type = JAXBElement.class, required = false)
    protected JAXBElement<StatisticalAreasType> statisticalAreas;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "Role", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String role;

    /**
     * Gets the value of the effectiveFromDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEffectiveFromDate() {
        return effectiveFromDate;
    }

    /**
     * Sets the value of the effectiveFromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEffectiveFromDate(JAXBElement<XMLGregorianCalendar> value) {
        this.effectiveFromDate = value;
    }

    /**
     * Gets the value of the effectiveToDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEffectiveToDate() {
        return effectiveToDate;
    }

    /**
     * Sets the value of the effectiveToDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEffectiveToDate(JAXBElement<XMLGregorianCalendar> value) {
        this.effectiveToDate = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link AddressStreetType }
     *     
     */
    public AddressStreetType getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressStreetType }
     *     
     */
    public void setStreet(AddressStreetType value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateProvince() {
        return stateProvince;
    }

    /**
     * Sets the value of the stateProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateProvince(JAXBElement<String> value) {
        this.stateProvince = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
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
     * Gets the value of the gridLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GridLocationType }{@code >}
     *     
     */
    public JAXBElement<GridLocationType> getGridLocation() {
        return gridLocation;
    }

    /**
     * Sets the value of the gridLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GridLocationType }{@code >}
     *     
     */
    public void setGridLocation(JAXBElement<GridLocationType> value) {
        this.gridLocation = value;
    }

    /**
     * Gets the value of the mapReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MapReferenceType }{@code >}
     *     
     */
    public JAXBElement<MapReferenceType> getMapReference() {
        return mapReference;
    }

    /**
     * Sets the value of the mapReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MapReferenceType }{@code >}
     *     
     */
    public void setMapReference(JAXBElement<MapReferenceType> value) {
        this.mapReference = value;
    }

    /**
     * Gets the value of the radioContact property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRadioContact() {
        return radioContact;
    }

    /**
     * Sets the value of the radioContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRadioContact(JAXBElement<String> value) {
        this.radioContact = value;
    }

    /**
     * Gets the value of the community property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCommunity(JAXBElement<String> value) {
        this.community = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalId(JAXBElement<String> value) {
        this.localId = value;
    }

    /**
     * Gets the value of the addressGlobalUID property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddressGlobalUID() {
        return addressGlobalUID;
    }

    /**
     * Sets the value of the addressGlobalUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddressGlobalUID(JAXBElement<String> value) {
        this.addressGlobalUID = value;
    }

    /**
     * Gets the value of the statisticalAreas property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StatisticalAreasType }{@code >}
     *     
     */
    public JAXBElement<StatisticalAreasType> getStatisticalAreas() {
        return statisticalAreas;
    }

    /**
     * Sets the value of the statisticalAreas property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StatisticalAreasType }{@code >}
     *     
     */
    public void setStatisticalAreas(JAXBElement<StatisticalAreasType> value) {
        this.statisticalAreas = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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

}
