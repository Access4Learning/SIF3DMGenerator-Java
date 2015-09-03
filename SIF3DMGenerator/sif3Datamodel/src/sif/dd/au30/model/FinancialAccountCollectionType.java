
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FinancialAccountCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialAccountCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialAccount" type="{http://www.sifassociation.org/au/datamodel/1.4}FinancialAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAccountCollectionType", namespace = "http://www.sifassociation.org/au/datamodel/1.4", propOrder = {
    "financialAccount"
})
public class FinancialAccountCollectionType {

    @XmlElement(name = "FinancialAccount", namespace = "http://www.sifassociation.org/au/datamodel/1.4")
    protected List<FinancialAccountType> financialAccount;

    /**
     * Gets the value of the financialAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financialAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancialAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialAccountType }
     * 
     * 
     */
    public List<FinancialAccountType> getFinancialAccount() {
        if (financialAccount == null) {
            financialAccount = new ArrayList<FinancialAccountType>();
        }
        return this.financialAccount;
    }

}
