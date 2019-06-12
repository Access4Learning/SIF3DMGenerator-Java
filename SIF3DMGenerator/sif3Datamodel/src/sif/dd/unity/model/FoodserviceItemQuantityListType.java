
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodserviceItemQuantityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodserviceItemQuantityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemQuantity" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodserviceItemQuantityType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodserviceItemQuantityListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "itemQuantity"
})
public class FoodserviceItemQuantityListType {

    @XmlElement(name = "ItemQuantity", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<FoodserviceItemQuantityType> itemQuantity;

    /**
     * Gets the value of the itemQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodserviceItemQuantityType }
     * 
     * 
     */
    public List<FoodserviceItemQuantityType> getItemQuantity() {
        if (itemQuantity == null) {
            itemQuantity = new ArrayList<FoodserviceItemQuantityType>();
        }
        return this.itemQuantity;
    }

}
