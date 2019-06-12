
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LocationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SiteCategory" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType"/>
 *         &lt;element name="IdentificationInfoList" type="{http://www.sifassociation.org/datamodel/na/4.x}IdentificationInfoListType" minOccurs="0"/>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/datamodel/na/4.x}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="NCESId" type="{http://www.sifassociation.org/datamodel/na/4.x}NCESIdType" minOccurs="0"/>
 *         &lt;element name="LEAInfoRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="OtherLEAs" type="{http://www.sifassociation.org/datamodel/na/4.x}OtherLEAListType" minOccurs="0"/>
 *         &lt;element name="ParentLocationInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="LocationInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="AddressList" type="{http://www.sifassociation.org/datamodel/na/4.x}AddressListType" minOccurs="0"/>
 *         &lt;element name="PhoneNumberList" type="{http://www.sifassociation.org/datamodel/na/4.x}PhoneNumberListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="LocationType" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="LocationTypeCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "siteCategory",
    "name",
    "description",
    "localId",
    "identificationInfoList",
    "stateProvinceId",
    "ncesId",
    "leaInfoRefId",
    "otherLEAs",
    "parentLocationInfo",
    "schoolInfoRefId",
    "addressList",
    "phoneNumberList",
    "sifMetadata",
    "sifExtendedElements"
})
public class LocationInfoType {

    @XmlElement(name = "SiteCategory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String siteCategory;
    @XmlElement(name = "Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String name;
    @XmlElement(name = "Description", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String description;
    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElement(name = "IdentificationInfoList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IdentificationInfoListType identificationInfoList;
    @XmlElement(name = "StateProvinceId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stateProvinceId;
    @XmlElement(name = "NCESId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String ncesId;
    @XmlElement(name = "LEAInfoRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaInfoRefId;
    @XmlElement(name = "OtherLEAs", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OtherLEAListType otherLEAs;
    @XmlElement(name = "ParentLocationInfo", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LocationInfoType.ParentLocationInfo parentLocationInfo;
    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(name = "AddressList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AddressListType addressList;
    @XmlElement(name = "PhoneNumberList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected PhoneNumberListType phoneNumberList;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "LocationType", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String locationType;
    @XmlAttribute(name = "LocationTypeCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String locationTypeCodeset;

    /**
     * Gets the value of the siteCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteCategory() {
        return siteCategory;
    }

    /**
     * Sets the value of the siteCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteCategory(String value) {
        this.siteCategory = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the identificationInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationInfoListType }
     *     
     */
    public IdentificationInfoListType getIdentificationInfoList() {
        return identificationInfoList;
    }

    /**
     * Sets the value of the identificationInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationInfoListType }
     *     
     */
    public void setIdentificationInfoList(IdentificationInfoListType value) {
        this.identificationInfoList = value;
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
     * Gets the value of the ncesId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCESId() {
        return ncesId;
    }

    /**
     * Sets the value of the ncesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCESId(String value) {
        this.ncesId = value;
    }

    /**
     * Gets the value of the leaInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEAInfoRefId() {
        return leaInfoRefId;
    }

    /**
     * Sets the value of the leaInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLEAInfoRefId(String value) {
        this.leaInfoRefId = value;
    }

    /**
     * Gets the value of the otherLEAs property.
     * 
     * @return
     *     possible object is
     *     {@link OtherLEAListType }
     *     
     */
    public OtherLEAListType getOtherLEAs() {
        return otherLEAs;
    }

    /**
     * Sets the value of the otherLEAs property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherLEAListType }
     *     
     */
    public void setOtherLEAs(OtherLEAListType value) {
        this.otherLEAs = value;
    }

    /**
     * Gets the value of the parentLocationInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInfoType.ParentLocationInfo }
     *     
     */
    public LocationInfoType.ParentLocationInfo getParentLocationInfo() {
        return parentLocationInfo;
    }

    /**
     * Sets the value of the parentLocationInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInfoType.ParentLocationInfo }
     *     
     */
    public void setParentLocationInfo(LocationInfoType.ParentLocationInfo value) {
        this.parentLocationInfo = value;
    }

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolInfoRefId(String value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link AddressListType }
     *     
     */
    public AddressListType getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressListType }
     *     
     */
    public void setAddressList(AddressListType value) {
        this.addressList = value;
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

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SIFMetadataType }
     *     
     */
    public SIFMetadataType getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFMetadataType }
     *     
     */
    public void setSIFMetadata(SIFMetadataType value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
        this.sifExtendedElements = value;
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
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the locationTypeCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationTypeCodeset() {
        return locationTypeCodeset;
    }

    /**
     * Sets the value of the locationTypeCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationTypeCodeset(String value) {
        this.locationTypeCodeset = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="LocationInfo"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class ParentLocationInfo {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

        /**
         * Gets the value of the value property.
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
         * Gets the value of the sifRefObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIFRefObject() {
            return sifRefObject;
        }

        /**
         * Sets the value of the sifRefObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIFRefObject(String value) {
            this.sifRefObject = value;
        }

    }

}
