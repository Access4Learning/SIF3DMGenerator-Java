
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchasingItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchasingItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchasingItem" type="{http://www.sifassociation.org/datamodel/au/3.4.1}PurchasingItemType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchasingItemsType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "purchasingItem"
})
public class PurchasingItemsType {

    @XmlElement(name = "PurchasingItem", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected List<PurchasingItemType> purchasingItem;

    /**
     * Gets the value of the purchasingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchasingItemType }
     * 
     * 
     */
    public List<PurchasingItemType> getPurchasingItem() {
        if (purchasingItem == null) {
            purchasingItem = new ArrayList<PurchasingItemType>();
        }
        return this.purchasingItem;
    }

}
