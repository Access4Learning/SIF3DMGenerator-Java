
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepEligibilityBackgroundConsentToEvaluateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityBackgroundConsentToEvaluateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accepted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identity" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonAuthorizingPersonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityBackgroundConsentToEvaluateType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "accepted",
    "identity"
})
public class IepEligibilityBackgroundConsentToEvaluateType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String accepted;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepCommonAuthorizingPersonType identity;

    /**
     * Gets the value of the accepted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccepted() {
        return accepted;
    }

    /**
     * Sets the value of the accepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccepted(String value) {
        this.accepted = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link IepCommonAuthorizingPersonType }
     *     
     */
    public IepCommonAuthorizingPersonType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepCommonAuthorizingPersonType }
     *     
     */
    public void setIdentity(IepCommonAuthorizingPersonType value) {
        this.identity = value;
    }

}
