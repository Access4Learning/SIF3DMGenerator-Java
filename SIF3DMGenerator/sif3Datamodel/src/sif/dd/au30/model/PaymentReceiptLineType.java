
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentReceiptLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentReceiptLineType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="LocalPaymentReceiptLineId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="TransactionAmount" type="{http://www.sifassociation.org/datamodel/au/3.4}DebitOrCreditAmountType" minOccurs="0"/>
 *         &lt;element name="FinancialAccountRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="TransactionDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.sifassociation.org/datamodel/au/3.4}MonetaryAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReceiptLineType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "invoiceRefId",
    "localId",
    "localPaymentReceiptLineId",
    "transactionAmount",
    "financialAccountRefId",
    "accountCode",
    "transactionDescription",
    "taxRate",
    "taxAmount"
})
public class PaymentReceiptLineType {

    @XmlElementRef(name = "InvoiceRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> invoiceRefId;
    @XmlElementRef(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localId;
    @XmlElementRef(name = "LocalPaymentReceiptLineId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localPaymentReceiptLineId;
    @XmlElement(name = "TransactionAmount", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected DebitOrCreditAmountType transactionAmount;
    @XmlElementRef(name = "FinancialAccountRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> financialAccountRefId;
    @XmlElementRef(name = "AccountCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountCode;
    @XmlElementRef(name = "TransactionDescription", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> transactionDescription;
    @XmlElementRef(name = "TaxRate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> taxRate;
    @XmlElementRef(name = "TaxAmount", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryAmountType> taxAmount;

    /**
     * Gets the value of the invoiceRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvoiceRefId() {
        return invoiceRefId;
    }

    /**
     * Sets the value of the invoiceRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvoiceRefId(JAXBElement<String> value) {
        this.invoiceRefId = value;
    }

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalId(JAXBElement<String> value) {
        this.localId = value;
    }

    /**
     * Gets the value of the localPaymentReceiptLineId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalPaymentReceiptLineId() {
        return localPaymentReceiptLineId;
    }

    /**
     * Sets the value of the localPaymentReceiptLineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalPaymentReceiptLineId(JAXBElement<String> value) {
        this.localPaymentReceiptLineId = value;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link DebitOrCreditAmountType }
     *     
     */
    public DebitOrCreditAmountType getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitOrCreditAmountType }
     *     
     */
    public void setTransactionAmount(DebitOrCreditAmountType value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the financialAccountRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFinancialAccountRefId() {
        return financialAccountRefId;
    }

    /**
     * Sets the value of the financialAccountRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFinancialAccountRefId(JAXBElement<String> value) {
        this.financialAccountRefId = value;
    }

    /**
     * Gets the value of the accountCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountCode() {
        return accountCode;
    }

    /**
     * Sets the value of the accountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountCode(JAXBElement<String> value) {
        this.accountCode = value;
    }

    /**
     * Gets the value of the transactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Sets the value of the transactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTransactionDescription(JAXBElement<String> value) {
        this.transactionDescription = value;
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
     * Gets the value of the taxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public JAXBElement<MonetaryAmountType> getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public void setTaxAmount(JAXBElement<MonetaryAmountType> value) {
        this.taxAmount = value;
    }

}
