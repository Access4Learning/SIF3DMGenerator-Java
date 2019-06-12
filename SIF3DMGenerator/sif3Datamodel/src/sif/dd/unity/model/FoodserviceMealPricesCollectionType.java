
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodserviceMealPricesCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodserviceMealPricesCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoodserviceMealPrices" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodserviceMealPricesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodserviceMealPricesCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "foodserviceMealPrices"
})
public class FoodserviceMealPricesCollectionType {

    @XmlElement(name = "FoodserviceMealPrices", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<FoodserviceMealPricesType> foodserviceMealPrices;

    /**
     * Gets the value of the foodserviceMealPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodserviceMealPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodserviceMealPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodserviceMealPricesType }
     * 
     * 
     */
    public List<FoodserviceMealPricesType> getFoodserviceMealPrices() {
        if (foodserviceMealPrices == null) {
            foodserviceMealPrices = new ArrayList<FoodserviceMealPricesType>();
        }
        return this.foodserviceMealPrices;
    }

}
