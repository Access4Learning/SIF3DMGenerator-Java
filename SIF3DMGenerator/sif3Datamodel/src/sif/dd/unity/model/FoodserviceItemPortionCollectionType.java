
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodserviceItemPortionCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodserviceItemPortionCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FoodserviceItemPortion" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodserviceItemPortionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodserviceItemPortionCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "foodserviceItemPortion"
})
public class FoodserviceItemPortionCollectionType {

    @XmlElement(name = "FoodserviceItemPortion", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<FoodserviceItemPortionType> foodserviceItemPortion;

    /**
     * Gets the value of the foodserviceItemPortion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foodserviceItemPortion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFoodserviceItemPortion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodserviceItemPortionType }
     * 
     * 
     */
    public List<FoodserviceItemPortionType> getFoodserviceItemPortion() {
        if (foodserviceItemPortion == null) {
            foodserviceItemPortion = new ArrayList<FoodserviceItemPortionType>();
        }
        return this.foodserviceItemPortion;
    }

}
