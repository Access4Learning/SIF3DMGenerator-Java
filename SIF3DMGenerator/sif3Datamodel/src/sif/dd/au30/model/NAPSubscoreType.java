
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for NAPSubscoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPSubscoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscoreType" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="SubscoreValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPSubscoreType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "subscoreType",
    "subscoreValue"
})
public class NAPSubscoreType {

    @XmlElement(name = "SubscoreType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String subscoreType;
    @XmlElement(name = "SubscoreValue", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected BigDecimal subscoreValue;

    /**
     * Gets the value of the subscoreType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscoreType() {
        return subscoreType;
    }

    /**
     * Sets the value of the subscoreType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscoreType(String value) {
        this.subscoreType = value;
    }

    /**
     * Gets the value of the subscoreValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSubscoreValue() {
        return subscoreValue;
    }

    /**
     * Sets the value of the subscoreValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSubscoreValue(BigDecimal value) {
        this.subscoreValue = value;
    }

}
