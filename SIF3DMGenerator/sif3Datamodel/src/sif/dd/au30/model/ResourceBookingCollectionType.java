
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceBookingCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResourceBookingCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResourceBooking" type="{http://www.sifassociation.org/au/datamodel/1.3}ResourceBookingType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceBookingCollectionType", namespace = "http://www.sifassociation.org/au/datamodel/1.3", propOrder = {
    "resourceBooking"
})
public class ResourceBookingCollectionType {

    @XmlElement(name = "ResourceBooking", namespace = "http://www.sifassociation.org/au/datamodel/1.3")
    protected List<ResourceBookingType> resourceBooking;

    /**
     * Gets the value of the resourceBooking property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceBooking property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceBooking().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceBookingType }
     * 
     * 
     */
    public List<ResourceBookingType> getResourceBooking() {
        if (resourceBooking == null) {
            resourceBooking = new ArrayList<ResourceBookingType>();
        }
        return this.resourceBooking;
    }

}
