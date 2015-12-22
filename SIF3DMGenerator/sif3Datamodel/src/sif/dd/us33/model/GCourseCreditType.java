
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gCourseCreditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gCourseCreditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creditValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="creditValueType" type="{http://www.sifassociation.org/datamodel/na/3.3}gLaxCodedElementType" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gCourseCreditType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "creditValue",
    "creditValueType",
    "any"
})
public class GCourseCreditType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected BigDecimal creditValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GLaxCodedElementType creditValueType;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the creditValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditValue() {
        return creditValue;
    }

    /**
     * Sets the value of the creditValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditValue(BigDecimal value) {
        this.creditValue = value;
    }

    /**
     * Gets the value of the creditValueType property.
     * 
     * @return
     *     possible object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public GLaxCodedElementType getCreditValueType() {
        return creditValueType;
    }

    /**
     * Sets the value of the creditValueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLaxCodedElementType }
     *     
     */
    public void setCreditValueType(GLaxCodedElementType value) {
        this.creditValueType = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
