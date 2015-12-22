
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for xTelephoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xTelephoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="phoneNumberType" type="{http://www.sifassociation.org/datamodel/na/3.3}xTelephoneTypeType" minOccurs="0"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="primaryIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xTelephoneType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "phoneNumberType",
    "number",
    "primaryIndicator"
})
public class XTelephoneType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XTelephoneTypeType phoneNumberType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String number;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected Boolean primaryIndicator;

    /**
     * Gets the value of the phoneNumberType property.
     * 
     * @return
     *     possible object is
     *     {@link XTelephoneTypeType }
     *     
     */
    public XTelephoneTypeType getPhoneNumberType() {
        return phoneNumberType;
    }

    /**
     * Sets the value of the phoneNumberType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XTelephoneTypeType }
     *     
     */
    public void setPhoneNumberType(XTelephoneTypeType value) {
        this.phoneNumberType = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the primaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryIndicator() {
        return primaryIndicator;
    }

    /**
     * Sets the value of the primaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryIndicator(Boolean value) {
        this.primaryIndicator = value;
    }

}
