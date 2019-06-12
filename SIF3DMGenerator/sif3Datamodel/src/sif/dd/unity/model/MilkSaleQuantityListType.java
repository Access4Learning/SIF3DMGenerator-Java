
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MilkSaleQuantityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MilkSaleQuantityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SaleQuantity" type="{http://www.sifassociation.org/datamodel/na/4.x}MilkSaleQuantityType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MilkSaleQuantityListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "saleQuantity"
})
public class MilkSaleQuantityListType {

    @XmlElement(name = "SaleQuantity", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<MilkSaleQuantityType> saleQuantity;

    /**
     * Gets the value of the saleQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MilkSaleQuantityType }
     * 
     * 
     */
    public List<MilkSaleQuantityType> getSaleQuantity() {
        if (saleQuantity == null) {
            saleQuantity = new ArrayList<MilkSaleQuantityType>();
        }
        return this.saleQuantity;
    }

}
