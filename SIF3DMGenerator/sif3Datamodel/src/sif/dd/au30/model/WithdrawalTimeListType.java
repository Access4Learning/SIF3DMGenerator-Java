
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WithdrawalTimeListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WithdrawalTimeListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Withdrawal" type="{http://www.sifassociation.org/datamodel/au/3.4}WithdrawalType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WithdrawalTimeListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "withdrawal"
})
public class WithdrawalTimeListType {

    @XmlElement(name = "Withdrawal", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<WithdrawalType> withdrawal;

    /**
     * Gets the value of the withdrawal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the withdrawal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWithdrawal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WithdrawalType }
     * 
     * 
     */
    public List<WithdrawalType> getWithdrawal() {
        if (withdrawal == null) {
            withdrawal = new ArrayList<WithdrawalType>();
        }
        return this.withdrawal;
    }

}
