
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellbeingEventLocationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingEventLocationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventLocation" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingEventLocationType" minOccurs="0"/>
 *         &lt;element name="Class" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FurtherLocationNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WellbeingEventLocationDetailsType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "eventLocation",
    "clazz",
    "furtherLocationNotes"
})
public class WellbeingEventLocationDetailsType {

    @XmlElement(name = "EventLocation", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsWellbeingEventLocationType eventLocation;
    @XmlElementRef(name = "Class", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clazz;
    @XmlElementRef(name = "FurtherLocationNotes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> furtherLocationNotes;

    /**
     * Gets the value of the eventLocation property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsWellbeingEventLocationType }
     *     
     */
    public AUCodeSetsWellbeingEventLocationType getEventLocation() {
        return eventLocation;
    }

    /**
     * Sets the value of the eventLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsWellbeingEventLocationType }
     *     
     */
    public void setEventLocation(AUCodeSetsWellbeingEventLocationType value) {
        this.eventLocation = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClazz(JAXBElement<String> value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the furtherLocationNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFurtherLocationNotes() {
        return furtherLocationNotes;
    }

    /**
     * Sets the value of the furtherLocationNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFurtherLocationNotes(JAXBElement<String> value) {
        this.furtherLocationNotes = value;
    }

}
