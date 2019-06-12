
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FeeForUseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeForUseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UseType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MeteringType" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="MeteringURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PerUseCharge" type="{http://www.sifassociation.org/datamodel/na/4.x}MonetaryAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeForUseType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "useType",
    "meteringType",
    "meteringURL",
    "perUseCharge"
})
public class FeeForUseType {

    @XmlElement(name = "UseType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected String useType;
    @XmlElement(name = "MeteringType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String meteringType;
    @XmlElement(name = "MeteringURL", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "anyURI")
    protected String meteringURL;
    @XmlElement(name = "PerUseCharge", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MonetaryAmountType perUseCharge;

    /**
     * Gets the value of the useType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseType() {
        return useType;
    }

    /**
     * Sets the value of the useType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseType(String value) {
        this.useType = value;
    }

    /**
     * Gets the value of the meteringType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringType() {
        return meteringType;
    }

    /**
     * Sets the value of the meteringType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteringType(String value) {
        this.meteringType = value;
    }

    /**
     * Gets the value of the meteringURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeteringURL() {
        return meteringURL;
    }

    /**
     * Sets the value of the meteringURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeteringURL(String value) {
        this.meteringURL = value;
    }

    /**
     * Gets the value of the perUseCharge property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getPerUseCharge() {
        return perUseCharge;
    }

    /**
     * Sets the value of the perUseCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setPerUseCharge(MonetaryAmountType value) {
        this.perUseCharge = value;
    }

}
