
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
 * <p>Java class for CreatedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreatedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="Creators" type="{http://www.sifassociation.org/datamodel/au/3.4}CreatorListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreatedType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "dateTime",
    "creators"
})
public class CreatedType {

    @XmlElement(name = "DateTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar dateTime;
    @XmlElementRef(name = "Creators", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<CreatorListType> creators;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateTime(Calendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the creators property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreatorListType }{@code >}
     *     
     */
    public JAXBElement<CreatorListType> getCreators() {
        return creators;
    }

    /**
     * Sets the value of the creators property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreatorListType }{@code >}
     *     
     */
    public void setCreators(JAXBElement<CreatorListType> value) {
        this.creators = value;
    }

}
