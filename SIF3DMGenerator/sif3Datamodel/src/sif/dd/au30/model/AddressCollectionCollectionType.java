
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressCollectionCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressCollectionCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressCollection" type="{http://www.sifassociation.org/datamodel/au/3.4}AddressCollectionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressCollectionCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "addressCollection"
})
public class AddressCollectionCollectionType {

    @XmlElement(name = "AddressCollection", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<AddressCollectionType> addressCollection;

    /**
     * Gets the value of the addressCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressCollectionType }
     * 
     * 
     */
    public List<AddressCollectionType> getAddressCollection() {
        if (addressCollection == null) {
            addressCollection = new ArrayList<AddressCollectionType>();
        }
        return this.addressCollection;
    }

}
