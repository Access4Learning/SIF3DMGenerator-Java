
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xLanguageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xLanguageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="type" type="{http://www.sifassociation.org/datamodel/na/3.3}xLanguageTypeType" minOccurs="0"/>
 *         &lt;element name="code" type="{http://www.sifassociation.org/datamodel/na/3.3}xLanguageCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xLanguageType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "type",
    "code"
})
public class XLanguageType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XLanguageTypeType type;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XLanguageCodeType code;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link XLanguageTypeType }
     *     
     */
    public XLanguageTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLanguageTypeType }
     *     
     */
    public void setType(XLanguageTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link XLanguageCodeType }
     *     
     */
    public XLanguageCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link XLanguageCodeType }
     *     
     */
    public void setCode(XLanguageCodeType value) {
        this.code = value;
    }

}
