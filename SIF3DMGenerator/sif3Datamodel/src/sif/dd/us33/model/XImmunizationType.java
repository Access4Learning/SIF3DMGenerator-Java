
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for xImmunizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xImmunizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="immunizationType" type="{http://www.sifassociation.org/datamodel/na/3.3}xImmunizationTypeType" minOccurs="0"/>
 *         &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
@XmlType(name = "xImmunizationType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "immunizationType",
    "immunizationDate",
    "any"
})
public class XImmunizationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected XImmunizationTypeType immunizationType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar immunizationDate;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the immunizationType property.
     * 
     * @return
     *     possible object is
     *     {@link XImmunizationTypeType }
     *     
     */
    public XImmunizationTypeType getImmunizationType() {
        return immunizationType;
    }

    /**
     * Sets the value of the immunizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link XImmunizationTypeType }
     *     
     */
    public void setImmunizationType(XImmunizationTypeType value) {
        this.immunizationType = value;
    }

    /**
     * Gets the value of the immunizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImmunizationDate() {
        return immunizationDate;
    }

    /**
     * Sets the value of the immunizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImmunizationDate(XMLGregorianCalendar value) {
        this.immunizationDate = value;
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
