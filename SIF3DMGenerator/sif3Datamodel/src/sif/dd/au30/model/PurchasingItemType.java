
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="PurchasingItem" type="{http://www.w3.org/2001/XMLSchema}anyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="UnitCost" type="{http://www.sifassociation.org/datamodel/au/3.4}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="TotalCost" type="{http://www.sifassociation.org/datamodel/au/3.4}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="QuantityDelivered" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="CancelledOrder" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExpenseAccounts" type="{http://www.sifassociation.org/datamodel/au/3.4}ExpenseAccountsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PurchasingItemType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "purchasingItem",
    "itemNumber",
    "itemDescription",
    "quantity",
    "unitCost",
    "totalCost",
    "quantityDelivered",
    "cancelledOrder",
    "taxRate",
    "expenseAccounts"
})
public class PurchasingItemType {

    @XmlElement(name = "PurchasingItem", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<Object> purchasingItem;
    @XmlElementRef(name = "ItemNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemNumber;
    @XmlElement(name = "ItemDescription", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String itemDescription;
    @XmlElementRef(name = "Quantity", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantity;
    @XmlElementRef(name = "UnitCost", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryAmountType> unitCost;
    @XmlElementRef(name = "TotalCost", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryAmountType> totalCost;
    @XmlElementRef(name = "QuantityDelivered", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> quantityDelivered;
    @XmlElementRef(name = "CancelledOrder", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> cancelledOrder;
    @XmlElementRef(name = "TaxRate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> taxRate;
    @XmlElementRef(name = "ExpenseAccounts", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ExpenseAccountsType> expenseAccounts;

    /**
     * Gets the value of the purchasingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPurchasingItem() {
        if (purchasingItem == null) {
            purchasingItem = new ArrayList<Object>();
        }
        return this.purchasingItem;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemNumber(JAXBElement<String> value) {
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
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantity(JAXBElement<String> value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public JAXBElement<MonetaryAmountType> getUnitCost() {
        return unitCost;
    }

    /**
     * Sets the value of the unitCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public void setUnitCost(JAXBElement<MonetaryAmountType> value) {
        this.unitCost = value;
    }

    /**
     * Gets the value of the totalCost property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public JAXBElement<MonetaryAmountType> getTotalCost() {
        return totalCost;
    }

    /**
     * Sets the value of the totalCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public void setTotalCost(JAXBElement<MonetaryAmountType> value) {
        this.totalCost = value;
    }

    /**
     * Gets the value of the quantityDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getQuantityDelivered() {
        return quantityDelivered;
    }

    /**
     * Sets the value of the quantityDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setQuantityDelivered(JAXBElement<String> value) {
        this.quantityDelivered = value;
    }

    /**
     * Gets the value of the cancelledOrder property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getCancelledOrder() {
        return cancelledOrder;
    }

    /**
     * Sets the value of the cancelledOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setCancelledOrder(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.cancelledOrder = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTaxRate(JAXBElement<BigDecimal> value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the expenseAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExpenseAccountsType }{@code >}
     *     
     */
    public JAXBElement<ExpenseAccountsType> getExpenseAccounts() {
        return expenseAccounts;
    }

    /**
     * Sets the value of the expenseAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExpenseAccountsType }{@code >}
     *     
     */
    public void setExpenseAccounts(JAXBElement<ExpenseAccountsType> value) {
        this.expenseAccounts = value;
    }

}
