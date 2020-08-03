
package sif.dd.au30.model;

import java.util.Calendar;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CheckoutInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckoutInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CheckedOutOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ReturnBy" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="RenewalCount" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckoutInfoType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "checkedOutOn",
    "returnBy",
    "renewalCount"
})
public class CheckoutInfoType {

    @XmlElement(name = "CheckedOutOn", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar checkedOutOn;
    @XmlElement(name = "ReturnBy", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar returnBy;
    @XmlElementRef(name = "RenewalCount", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> renewalCount;

    /**
     * Gets the value of the checkedOutOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getCheckedOutOn() {
        return checkedOutOn;
    }

    /**
     * Sets the value of the checkedOutOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckedOutOn(Calendar value) {
        this.checkedOutOn = value;
    }

    /**
     * Gets the value of the returnBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getReturnBy() {
        return returnBy;
    }

    /**
     * Sets the value of the returnBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnBy(Calendar value) {
        this.returnBy = value;
    }

    /**
     * Gets the value of the renewalCount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRenewalCount() {
        return renewalCount;
    }

    /**
     * Sets the value of the renewalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRenewalCount(JAXBElement<Long> value) {
        this.renewalCount = value;
    }

}
