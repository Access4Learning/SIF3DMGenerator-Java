
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodserviceItemSalesCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodserviceItemSalesCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoodserviceItemSales" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodserviceItemSalesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodserviceItemSalesCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "foodserviceItemSales"
})
public class FoodserviceItemSalesCollectionType {

    @XmlElement(name = "FoodserviceItemSales", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<FoodserviceItemSalesType> foodserviceItemSales;

    /**
     * Gets the value of the foodserviceItemSales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodserviceItemSales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodserviceItemSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodserviceItemSalesType }
     * 
     * 
     */
    public List<FoodserviceItemSalesType> getFoodserviceItemSales() {
        if (foodserviceItemSales == null) {
            foodserviceItemSales = new ArrayList<FoodserviceItemSalesType>();
        }
        return this.foodserviceItemSales;
    }

}
