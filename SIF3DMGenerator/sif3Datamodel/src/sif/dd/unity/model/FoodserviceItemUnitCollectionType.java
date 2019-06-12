
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodserviceItemUnitCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodserviceItemUnitCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoodserviceItemUnit" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodserviceItemUnitType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodserviceItemUnitCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "foodserviceItemUnit"
})
public class FoodserviceItemUnitCollectionType {

    @XmlElement(name = "FoodserviceItemUnit", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<FoodserviceItemUnitType> foodserviceItemUnit;

    /**
     * Gets the value of the foodserviceItemUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodserviceItemUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodserviceItemUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodserviceItemUnitType }
     * 
     * 
     */
    public List<FoodserviceItemUnitType> getFoodserviceItemUnit() {
        if (foodserviceItemUnit == null) {
            foodserviceItemUnit = new ArrayList<FoodserviceItemUnitType>();
        }
        return this.foodserviceItemUnit;
    }

}
