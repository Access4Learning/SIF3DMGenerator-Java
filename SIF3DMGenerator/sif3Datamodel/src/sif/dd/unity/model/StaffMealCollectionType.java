
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaffMealCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffMealCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StaffMeal" type="{http://www.sifassociation.org/datamodel/na/4.x}StaffMealType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffMealCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "staffMeal"
})
public class StaffMealCollectionType {

    @XmlElement(name = "StaffMeal", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<StaffMealType> staffMeal;

    /**
     * Gets the value of the staffMeal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffMeal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffMeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffMealType }
     * 
     * 
     */
    public List<StaffMealType> getStaffMeal() {
        if (staffMeal == null) {
            staffMeal = new ArrayList<StaffMealType>();
        }
        return this.staffMeal;
    }

}
