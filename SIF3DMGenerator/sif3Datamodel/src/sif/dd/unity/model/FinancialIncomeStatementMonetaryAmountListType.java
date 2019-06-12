
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialIncomeStatementMonetaryAmountListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialIncomeStatementMonetaryAmountListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Amount" type="{http://www.sifassociation.org/datamodel/na/4.x}FinancialIncomeStatementMonetaryAmountType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialIncomeStatementMonetaryAmountListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "amount"
})
public class FinancialIncomeStatementMonetaryAmountListType {

    @XmlElement(name = "Amount", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<FinancialIncomeStatementMonetaryAmountType> amount;

    /**
     * Gets the value of the amount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialIncomeStatementMonetaryAmountType }
     * 
     * 
     */
    public List<FinancialIncomeStatementMonetaryAmountType> getAmount() {
        if (amount == null) {
            amount = new ArrayList<FinancialIncomeStatementMonetaryAmountType>();
        }
        return this.amount;
    }

}
