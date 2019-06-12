
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodserviceMilkSalesCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodserviceMilkSalesCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoodserviceMilkSales" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodserviceMilkSalesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodserviceMilkSalesCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "foodserviceMilkSales"
})
public class FoodserviceMilkSalesCollectionType {

    @XmlElement(name = "FoodserviceMilkSales", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<FoodserviceMilkSalesType> foodserviceMilkSales;

    /**
     * Gets the value of the foodserviceMilkSales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodserviceMilkSales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodserviceMilkSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodserviceMilkSalesType }
     * 
     * 
     */
    public List<FoodserviceMilkSalesType> getFoodserviceMilkSales() {
        if (foodserviceMilkSales == null) {
            foodserviceMilkSales = new ArrayList<FoodserviceMilkSalesType>();
        }
        return this.foodserviceMilkSales;
    }

}
