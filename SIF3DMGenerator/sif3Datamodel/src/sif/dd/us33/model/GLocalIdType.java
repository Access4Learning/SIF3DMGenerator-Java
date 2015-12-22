
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The locally assigned identifier associated with an entity. This is in contrast to the external identifier.
 * 
 * <p>Java class for gLocalIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gLocalIdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idType" type="{http://www.sifassociation.org/datamodel/na/3.3}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;element name="idValue" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gLocalIdType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "idType",
    "idValue"
})
@XmlSeeAlso({
    GElectronicIdType.class,
    GExternalIdType.class,
    GOtherIdType.class
})
public class GLocalIdType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GLaxCodedElementType idType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected Object idValue;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getIdType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setIdType(GLaxCodedElementType value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idValue property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getIdValue() {
        return idValue;
    }

    /**
     * Sets the value of the idValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setIdValue(Object value) {
        this.idValue = value;
    }

}
