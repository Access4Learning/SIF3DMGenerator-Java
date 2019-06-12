
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for iepTransmitPermissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepTransmitPermissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authorizingOfficial" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonAuthorizingPersonType" minOccurs="0"/>
 *         &lt;element name="authorizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="justification" type="{http://www.sifassociation.org/datamodel/na/4.x}iepTransmitPermissionJustificationType" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.sifassociation.org/datamodel/na/4.x}iepTransmitPermissionDestinationType" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://www.sifassociation.org/datamodel/na/4.x}iepTransmitPermissionPurposeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepTransmitPermissionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "authorizingOfficial",
    "authorizationDate",
    "justification",
    "destination",
    "purpose"
})
public class IepTransmitPermissionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepCommonAuthorizingPersonType authorizingOfficial;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar authorizationDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepTransmitPermissionJustificationType justification;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepTransmitPermissionDestinationType destination;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepTransmitPermissionPurposeType purpose;

    /**
     * Gets the value of the authorizingOfficial property.
     * 
     * @return
     *     possible object is
     *     {@link IepCommonAuthorizingPersonType }
     *     
     */
    public IepCommonAuthorizingPersonType getAuthorizingOfficial() {
        return authorizingOfficial;
    }

    /**
     * Sets the value of the authorizingOfficial property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepCommonAuthorizingPersonType }
     *     
     */
    public void setAuthorizingOfficial(IepCommonAuthorizingPersonType value) {
        this.authorizingOfficial = value;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDate(XMLGregorianCalendar value) {
        this.authorizationDate = value;
    }

    /**
     * Gets the value of the justification property.
     * 
     * @return
     *     possible object is
     *     {@link IepTransmitPermissionJustificationType }
     *     
     */
    public IepTransmitPermissionJustificationType getJustification() {
        return justification;
    }

    /**
     * Sets the value of the justification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepTransmitPermissionJustificationType }
     *     
     */
    public void setJustification(IepTransmitPermissionJustificationType value) {
        this.justification = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link IepTransmitPermissionDestinationType }
     *     
     */
    public IepTransmitPermissionDestinationType getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepTransmitPermissionDestinationType }
     *     
     */
    public void setDestination(IepTransmitPermissionDestinationType value) {
        this.destination = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link IepTransmitPermissionPurposeType }
     *     
     */
    public IepTransmitPermissionPurposeType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepTransmitPermissionPurposeType }
     *     
     */
    public void setPurpose(IepTransmitPermissionPurposeType value) {
        this.purpose = value;
    }

}
