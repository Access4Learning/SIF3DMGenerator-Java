
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ExtendedParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtendedParameterType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SIF_Name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="SIF_Value" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtendedParameterType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "sifName",
    "sifValue"
})
public class ExtendedParameterType {

    @XmlElement(name = "SIF_Name", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sifName;
    @XmlElement(name = "SIF_Value", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String sifValue;

    /**
     * Gets the value of the sifName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFName() {
        return sifName;
    }

    /**
     * Sets the value of the sifName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFName(String value) {
        this.sifName = value;
    }

    /**
     * Gets the value of the sifValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFValue() {
        return sifValue;
    }

    /**
     * Sets the value of the sifValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFValue(String value) {
        this.sifValue = value;
    }

}
