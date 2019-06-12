
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodservicePurchaseQuantityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodservicePurchaseQuantityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PurchaseQuantity" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodservicePurchaseQuantityType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodservicePurchaseQuantityListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "purchaseQuantity"
})
public class FoodservicePurchaseQuantityListType {

    @XmlElement(name = "PurchaseQuantity", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<FoodservicePurchaseQuantityType> purchaseQuantity;

    /**
     * Gets the value of the purchaseQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodservicePurchaseQuantityType }
     * 
     * 
     */
    public List<FoodservicePurchaseQuantityType> getPurchaseQuantity() {
        if (purchaseQuantity == null) {
            purchaseQuantity = new ArrayList<FoodservicePurchaseQuantityType>();
        }
        return this.purchaseQuantity;
    }

}
