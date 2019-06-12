
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FoodservicePayMethodListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FoodservicePayMethodListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransactionPayMethod" type="{http://www.sifassociation.org/datamodel/na/4.x}FoodservicePayMethodType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FoodservicePayMethodListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "transactionPayMethod"
})
public class FoodservicePayMethodListType {

    @XmlElement(name = "TransactionPayMethod", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<FoodservicePayMethodType> transactionPayMethod;

    /**
     * Gets the value of the transactionPayMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionPayMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionPayMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FoodservicePayMethodType }
     * 
     * 
     */
    public List<FoodservicePayMethodType> getTransactionPayMethod() {
        if (transactionPayMethod == null) {
            transactionPayMethod = new ArrayList<FoodservicePayMethodType>();
        }
        return this.transactionPayMethod;
    }

}
