
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PurchasingItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchasingItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="UnitCost" type="{http://www.sifassociation.org/datamodel/na/4.x}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="ExpenseAccounts" type="{http://www.sifassociation.org/datamodel/na/4.x}ExpenseAccountListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchasingItemType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "itemNumber",
    "itemDescription",
    "quantity",
    "unitCost",
    "expenseAccounts"
})
public class PurchasingItemType {

    @XmlElement(name = "ItemNumber", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String itemNumber;
    @XmlElement(name = "ItemDescription", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected String itemDescription;
    @XmlElement(name = "Quantity", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String quantity;
    @XmlElement(name = "UnitCost", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MonetaryAmountType unitCost;
    @XmlElement(name = "ExpenseAccounts", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ExpenseAccountListType expenseAccounts;

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemNumber(String value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the itemDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItemDescription() {
        return itemDescription;
    }

    /**
     * Sets the value of the itemDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItemDescription(String value) {
        this.itemDescription = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuantity(String value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setUnitCost(MonetaryAmountType value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the expenseAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseAccountListType }
     *     
     */
    public ExpenseAccountListType getExpenseAccounts() {
        return expenseAccounts;
    }

    /**
     * Sets the value of the expenseAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseAccountListType }
     *     
     */
    public void setExpenseAccounts(ExpenseAccountListType value) {
        this.expenseAccounts = value;
    }

}
