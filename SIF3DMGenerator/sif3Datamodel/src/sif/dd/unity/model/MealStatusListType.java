
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MealStatusListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MealStatusListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MealStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}MealStatusType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MealStatusListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "mealStatus"
})
public class MealStatusListType {

    @XmlElement(name = "MealStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<MealStatusType> mealStatus;

    /**
     * Gets the value of the mealStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mealStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMealStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MealStatusType }
     * 
     * 
     */
    public List<MealStatusType> getMealStatus() {
        if (mealStatus == null) {
            mealStatus = new ArrayList<MealStatusType>();
        }
        return this.mealStatus;
    }

}
