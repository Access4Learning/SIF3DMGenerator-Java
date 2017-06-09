
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpenseAccountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpenseAccountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExpenseAccountType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="ExpenseAccount" type="{http://www.sifassociation.org/datamodel/au/3.4}ExpenseAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseAccountsType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "expenseAccountType",
    "expenseAccount"
})
public class ExpenseAccountsType {

    @XmlElementRef(name = "ExpenseAccountType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Object> expenseAccountType;
    @XmlElement(name = "ExpenseAccount", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<ExpenseAccountType> expenseAccount;

    /**
     * Gets the value of the expenseAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<Object> getExpenseAccountType() {
        return expenseAccountType;
    }

    /**
     * Sets the value of the expenseAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setExpenseAccountType(JAXBElement<Object> value) {
        this.expenseAccountType = value;
    }

    /**
     * Gets the value of the expenseAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenseAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenseAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExpenseAccountType }
     * 
     * 
     */
    public List<ExpenseAccountType> getExpenseAccount() {
        if (expenseAccount == null) {
            expenseAccount = new ArrayList<ExpenseAccountType>();
        }
        return this.expenseAccount;
    }

}
