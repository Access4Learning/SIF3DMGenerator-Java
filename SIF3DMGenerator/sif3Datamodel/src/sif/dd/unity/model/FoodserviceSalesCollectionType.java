
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodserviceSalesCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodserviceSalesCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoodserviceSales" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodserviceSalesType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodserviceSalesCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "foodserviceSales"
})
public class FoodserviceSalesCollectionType {

    @XmlElement(name = "FoodserviceSales", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<FoodserviceSalesType> foodserviceSales;

    /**
     * Gets the value of the foodserviceSales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodserviceSales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodserviceSales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodserviceSalesType }
     * 
     * 
     */
    public List<FoodserviceSalesType> getFoodserviceSales() {
        if (foodserviceSales == null) {
            foodserviceSales = new ArrayList<FoodserviceSalesType>();
        }
        return this.foodserviceSales;
    }

}
