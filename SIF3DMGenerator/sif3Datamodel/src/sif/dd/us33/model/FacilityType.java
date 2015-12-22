
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
 * A location which includes all buildings, structures, and other stationary items that are located on a single site or on contiguous or adjacent sites and that are used for education system purposes.
 * 
 * <p>Java class for facilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="facilityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gLocationType">
 *       &lt;sequence>
 *         &lt;element name="facilityId" type="{http://www.sifassociation.org/datamodel/na/3.3}gLocalIdType" minOccurs="0"/>
 *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="organizationId" type="{http://www.sifassociation.org/datamodel/na/3.3}gLocalIdType" minOccurs="0"/>
 *         &lt;element name="organizationIdSystem" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="addressRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addressRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="buildingName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="buildingUseType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="spaceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spaceUseType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "facilityType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "facilityId",
    "organizationName",
    "organizationId",
    "organizationIdSystem",
    "addressRefIdList",
    "buildingName",
    "buildingUseType",
    "spaceDescription",
    "spaceUseType"
})
public class FacilityType
    extends GLocationType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GLocalIdType facilityId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String organizationName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GLocalIdType organizationId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String organizationIdSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected FacilityType.AddressRefIdList addressRefIdList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String buildingName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String buildingUseType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String spaceDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String spaceUseType;

    /**
     * Gets the value of the facilityId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getFacilityId() {
        return facilityId;
    }

    /**
     * Sets the value of the facilityId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setFacilityId(GLocalIdType value) {
        this.facilityId = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setOrganizationId(GLocalIdType value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the organizationIdSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationIdSystem() {
        return organizationIdSystem;
    }

    /**
     * Sets the value of the organizationIdSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationIdSystem(String value) {
        this.organizationIdSystem = value;
    }

    /**
     * Gets the value of the addressRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityType.AddressRefIdList }
     *     
     */
    public FacilityType.AddressRefIdList getAddressRefIdList() {
        return addressRefIdList;
    }

    /**
     * Sets the value of the addressRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityType.AddressRefIdList }
     *     
     */
    public void setAddressRefIdList(FacilityType.AddressRefIdList value) {
        this.addressRefIdList = value;
    }

    /**
     * Gets the value of the buildingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingName() {
        return buildingName;
    }

    /**
     * Sets the value of the buildingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingName(String value) {
        this.buildingName = value;
    }

    /**
     * Gets the value of the buildingUseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingUseType() {
        return buildingUseType;
    }

    /**
     * Sets the value of the buildingUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingUseType(String value) {
        this.buildingUseType = value;
    }

    /**
     * Gets the value of the spaceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaceDescription() {
        return spaceDescription;
    }

    /**
     * Sets the value of the spaceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaceDescription(String value) {
        this.spaceDescription = value;
    }

    /**
     * Gets the value of the spaceUseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpaceUseType() {
        return spaceUseType;
    }

    /**
     * Sets the value of the spaceUseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpaceUseType(String value) {
        this.spaceUseType = value;
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
     *         &lt;element name="addressRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" maxOccurs="unbounded" minOccurs="0"/>
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

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> addressRefId;

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
         * {@link String }
         * 
         * 
         */
        public List<String> getAddressRefId() {
            if (addressRefId == null) {
                addressRefId = new ArrayList<String>();
            }
            return this.addressRefId;
        }

    }

}
