
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LifeCycleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Created" type="{http://www.sifassociation.org/datamodel/au/3.4}CreatedType" minOccurs="0"/>
 *         &lt;element name="ModificationHistory" type="{http://www.sifassociation.org/datamodel/au/3.4}ModifiedListType" minOccurs="0"/>
 *         &lt;element name="TimeElements" type="{http://www.sifassociation.org/datamodel/au/3.4}TimeElementListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeCycleType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "created",
    "modificationHistory",
    "timeElements"
})
public class LifeCycleType {

    @XmlElementRef(name = "Created", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<CreatedType> created;
    @XmlElementRef(name = "ModificationHistory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ModifiedListType> modificationHistory;
    @XmlElementRef(name = "TimeElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeElementListType> timeElements;

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CreatedType }{@code >}
     *     
     */
    public JAXBElement<CreatedType> getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CreatedType }{@code >}
     *     
     */
    public void setCreated(JAXBElement<CreatedType> value) {
        this.created = value;
    }

    /**
     * Gets the value of the modificationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ModifiedListType }{@code >}
     *     
     */
    public JAXBElement<ModifiedListType> getModificationHistory() {
        return modificationHistory;
    }

    /**
     * Sets the value of the modificationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ModifiedListType }{@code >}
     *     
     */
    public void setModificationHistory(JAXBElement<ModifiedListType> value) {
        this.modificationHistory = value;
    }

    /**
     * Gets the value of the timeElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeElementListType }{@code >}
     *     
     */
    public JAXBElement<TimeElementListType> getTimeElements() {
        return timeElements;
    }

    /**
     * Sets the value of the timeElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeElementListType }{@code >}
     *     
     */
    public void setTimeElements(JAXBElement<TimeElementListType> value) {
        this.timeElements = value;
    }

}
