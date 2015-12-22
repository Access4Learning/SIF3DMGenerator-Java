
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * xLea is a composite object that provides core information about a Local Educuation Agency (e.g. district, division, intermediate agency). The refId of a xLea object coincides with the refId of a corresponding lea object.
 * 
 * <p>Java class for xLeaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xLeaType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gSIF_CompositeType">
 *       &lt;sequence>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.3}xOrganizationIdType" minOccurs="0"/>
 *         &lt;element name="leaRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="stateProvinceId" type="{http://www.sifassociation.org/datamodel/na/3.3}xOrganizationIdType" minOccurs="0"/>
 *         &lt;element name="ncesId" type="{http://www.sifassociation.org/datamodel/na/3.3}xOrganizationIdType" minOccurs="0"/>
 *         &lt;element name="leaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address" type="{http://www.sifassociation.org/datamodel/na/3.3}xOrganizationAddressType" minOccurs="0"/>
 *         &lt;element name="phoneNumber" type="{http://www.sifassociation.org/datamodel/na/3.3}xTelephoneType" minOccurs="0"/>
 *         &lt;element name="otherPhoneNumbers" type="{http://www.sifassociation.org/datamodel/na/3.3}xTelephoneListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xLeaType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "localId",
    "leaRefId",
    "stateProvinceId",
    "ncesId",
    "leaName",
    "address",
    "phoneNumber",
    "otherPhoneNumbers"
})
public class XLeaType
    extends GSIFCompositeType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String leaRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String stateProvinceId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ncesId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String leaName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XOrganizationAddressType address;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XTelephoneType phoneNumber;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XTelephoneListType otherPhoneNumbers;

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
     * Gets the value of the leaRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaRefId() {
        return leaRefId;
    }

    /**
     * Sets the value of the leaRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaRefId(String value) {
        this.leaRefId = value;
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
    public String getNcesId() {
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
    public void setNcesId(String value) {
        this.ncesId = value;
    }

    /**
     * Gets the value of the leaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaName() {
        return leaName;
    }

    /**
     * Sets the value of the leaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaName(String value) {
        this.leaName = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link XOrganizationAddressType }
     *     
     */
    public XOrganizationAddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link XOrganizationAddressType }
     *     
     */
    public void setAddress(XOrganizationAddressType value) {
        this.address = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link XTelephoneType }
     *     
     */
    public XTelephoneType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTelephoneType }
     *     
     */
    public void setPhoneNumber(XTelephoneType value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the otherPhoneNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link XTelephoneListType }
     *     
     */
    public XTelephoneListType getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    /**
     * Sets the value of the otherPhoneNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTelephoneListType }
     *     
     */
    public void setOtherPhoneNumbers(XTelephoneListType value) {
        this.otherPhoneNumbers = value;
    }

}
