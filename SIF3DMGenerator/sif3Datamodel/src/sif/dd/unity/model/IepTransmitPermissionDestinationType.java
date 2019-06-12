
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepTransmitPermissionDestinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepTransmitPermissionDestinationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lea" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonLeaRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="serviceProvider" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonServiceProviderType" minOccurs="0"/>
 *         &lt;element name="other" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonExternalPartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepTransmitPermissionDestinationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "lea",
    "serviceProvider",
    "other"
})
public class IepTransmitPermissionDestinationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lea;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepCommonServiceProviderType serviceProvider;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepCommonExternalPartyType other;

    /**
     * Gets the value of the lea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLea() {
        return lea;
    }

    /**
     * Sets the value of the lea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLea(String value) {
        this.lea = value;
    }

    /**
     * Gets the value of the serviceProvider property.
     * 
     * @return
     *     possible object is
     *     {@link IepCommonServiceProviderType }
     *     
     */
    public IepCommonServiceProviderType getServiceProvider() {
        return serviceProvider;
    }

    /**
     * Sets the value of the serviceProvider property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepCommonServiceProviderType }
     *     
     */
    public void setServiceProvider(IepCommonServiceProviderType value) {
        this.serviceProvider = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link IepCommonExternalPartyType }
     *     
     */
    public IepCommonExternalPartyType getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepCommonExternalPartyType }
     *     
     */
    public void setOther(IepCommonExternalPartyType value) {
        this.other = value;
    }

}
