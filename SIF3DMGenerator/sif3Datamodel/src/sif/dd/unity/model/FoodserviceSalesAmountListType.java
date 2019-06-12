
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodserviceSalesAmountListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodserviceSalesAmountListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesAmount" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodserviceSalesAmountType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodserviceSalesAmountListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "salesAmount"
})
public class FoodserviceSalesAmountListType {

    @XmlElement(name = "SalesAmount", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<FoodserviceSalesAmountType> salesAmount;

    /**
     * Gets the value of the salesAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodserviceSalesAmountType }
     * 
     * 
     */
    public List<FoodserviceSalesAmountType> getSalesAmount() {
        if (salesAmount == null) {
            salesAmount = new ArrayList<FoodserviceSalesAmountType>();
        }
        return this.salesAmount;
    }

}
