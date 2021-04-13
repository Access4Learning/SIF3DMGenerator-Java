
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelDetailsContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravelDetailsContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ToSchool" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolTravelType" minOccurs="0"/>
 *         &lt;element name="FromSchool" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolTravelType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelDetailsContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "toSchool",
    "fromSchool"
})
public class TravelDetailsContainerType {

    @XmlElementRef(name = "ToSchool", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SchoolTravelType> toSchool;
    @XmlElementRef(name = "FromSchool", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SchoolTravelType> fromSchool;

    /**
     * Gets the value of the toSchool property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SchoolTravelType }{@code >}
     *     
     */
    public JAXBElement<SchoolTravelType> getToSchool() {
        return toSchool;
    }

    /**
     * Sets the value of the toSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SchoolTravelType }{@code >}
     *     
     */
    public void setToSchool(JAXBElement<SchoolTravelType> value) {
        this.toSchool = value;
    }

    /**
     * Gets the value of the fromSchool property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SchoolTravelType }{@code >}
     *     
     */
    public JAXBElement<SchoolTravelType> getFromSchool() {
        return fromSchool;
    }

    /**
     * Sets the value of the fromSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SchoolTravelType }{@code >}
     *     
     */
    public void setFromSchool(JAXBElement<SchoolTravelType> value) {
        this.fromSchool = value;
    }

}
