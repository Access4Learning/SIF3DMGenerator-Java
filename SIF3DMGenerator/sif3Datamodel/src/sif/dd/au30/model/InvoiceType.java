
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         This object contains an amount to be invoiced to an outside entity (typically a creditor or debtor). his object can include school fees. The object is also used for payments to an outside entity (using debit amounts), where those payments are not for goods and services (PurchaseOrder object): e.g. credit notes, reimbursements, rebates.     
 * 
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoicedEntity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/au/datamodel/3.4>IdRefTypeOrEmpty">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="Debtor"/>
 *                       &lt;enumeration value="PurchaseOrder"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FormNumber" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="BillingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TransactionDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="BilledAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/au/datamodel/3.4>MonetaryAmountType">
 *                 &lt;attribute name="Type" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="Debit"/>
 *                       &lt;enumeration value="Credit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ledger" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="Creditor"/>
 *               &lt;enumeration value="Family"/>
 *               &lt;enumeration value="Sundry"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ChargedLocationInfoRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="NetAmount" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ApprovedBy" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ItemDetail" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FinancialAccountRefIdList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FinancialAccountRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccountingPeriod" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="RelatedPurchaseOrderRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="PurchasingItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PurchasingItem" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="UnitCost" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Voluntary" type="{http://www.sifassociation.org/au/datamodel/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/au/datamodel/3.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/au/datamodel/3.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/au/datamodel/3.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceType", namespace = "http://www.sifassociation.org/au/datamodel/3.4", propOrder = {
    "invoicedEntity",
    "formNumber",
    "billingDate",
    "transactionDescription",
    "billedAmount",
    "ledger",
    "chargedLocationInfoRefId",
    "netAmount",
    "taxRate",
    "taxType",
    "taxAmount",
    "createdBy",
    "approvedBy",
    "itemDetail",
    "dueDate",
    "financialAccountRefIdList",
    "accountingPeriod",
    "relatedPurchaseOrderRefId",
    "purchasingItems",
    "voluntary",
    "sifMetadata",
    "sifExtendedElements"
})
public class InvoiceType {

    @XmlElement(name = "InvoicedEntity", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    protected InvoiceType.InvoicedEntity invoicedEntity;
    @XmlElementRef(name = "FormNumber", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formNumber;
    @XmlElement(name = "BillingDate", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar billingDate;
    @XmlElement(name = "TransactionDescription", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String transactionDescription;
    @XmlElement(name = "BilledAmount", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    protected InvoiceType.BilledAmount billedAmount;
    @XmlElement(name = "Ledger", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ledger;
    @XmlElementRef(name = "ChargedLocationInfoRefId", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chargedLocationInfoRefId;
    @XmlElementRef(name = "NetAmount", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryAmountType> netAmount;
    @XmlElementRef(name = "TaxRate", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> taxRate;
    @XmlElementRef(name = "TaxType", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> taxType;
    @XmlElementRef(name = "TaxAmount", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryAmountType> taxAmount;
    @XmlElementRef(name = "CreatedBy", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElementRef(name = "ApprovedBy", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> approvedBy;
    @XmlElementRef(name = "ItemDetail", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> itemDetail;
    @XmlElementRef(name = "DueDate", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dueDate;
    @XmlElementRef(name = "FinancialAccountRefIdList", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<InvoiceType.FinancialAccountRefIdList> financialAccountRefIdList;
    @XmlElementRef(name = "AccountingPeriod", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountingPeriod;
    @XmlElementRef(name = "RelatedPurchaseOrderRefId", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relatedPurchaseOrderRefId;
    @XmlElementRef(name = "PurchasingItems", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<InvoiceType.PurchasingItems> purchasingItems;
    @XmlElementRef(name = "Voluntary", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> voluntary;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the invoicedEntity property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceType.InvoicedEntity }
     *     
     */
    public InvoiceType.InvoicedEntity getInvoicedEntity() {
        return invoicedEntity;
    }

    /**
     * Sets the value of the invoicedEntity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceType.InvoicedEntity }
     *     
     */
    public void setInvoicedEntity(InvoiceType.InvoicedEntity value) {
        this.invoicedEntity = value;
    }

    /**
     * Gets the value of the formNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormNumber() {
        return formNumber;
    }

    /**
     * Sets the value of the formNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormNumber(JAXBElement<String> value) {
        this.formNumber = value;
    }

    /**
     * Gets the value of the billingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBillingDate() {
        return billingDate;
    }

    /**
     * Sets the value of the billingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBillingDate(XMLGregorianCalendar value) {
        this.billingDate = value;
    }

    /**
     * Gets the value of the transactionDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionDescription() {
        return transactionDescription;
    }

    /**
     * Sets the value of the transactionDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionDescription(String value) {
        this.transactionDescription = value;
    }

    /**
     * Gets the value of the billedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceType.BilledAmount }
     *     
     */
    public InvoiceType.BilledAmount getBilledAmount() {
        return billedAmount;
    }

    /**
     * Sets the value of the billedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceType.BilledAmount }
     *     
     */
    public void setBilledAmount(InvoiceType.BilledAmount value) {
        this.billedAmount = value;
    }

    /**
     * Gets the value of the ledger property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLedger() {
        return ledger;
    }

    /**
     * Sets the value of the ledger property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLedger(String value) {
        this.ledger = value;
    }

    /**
     * Gets the value of the chargedLocationInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChargedLocationInfoRefId() {
        return chargedLocationInfoRefId;
    }

    /**
     * Sets the value of the chargedLocationInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChargedLocationInfoRefId(JAXBElement<String> value) {
        this.chargedLocationInfoRefId = value;
    }

    /**
     * Gets the value of the netAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public JAXBElement<MonetaryAmountType> getNetAmount() {
        return netAmount;
    }

    /**
     * Sets the value of the netAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public void setNetAmount(JAXBElement<MonetaryAmountType> value) {
        this.netAmount = value;
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
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTaxType(JAXBElement<String> value) {
        this.taxType = value;
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

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<String> value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the approvedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApprovedBy() {
        return approvedBy;
    }

    /**
     * Sets the value of the approvedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApprovedBy(JAXBElement<String> value) {
        this.approvedBy = value;
    }

    /**
     * Gets the value of the itemDetail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getItemDetail() {
        return itemDetail;
    }

    /**
     * Sets the value of the itemDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setItemDetail(JAXBElement<String> value) {
        this.itemDetail = value;
    }

    /**
     * Gets the value of the dueDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDueDate() {
        return dueDate;
    }

    /**
     * Sets the value of the dueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDueDate(JAXBElement<XMLGregorianCalendar> value) {
        this.dueDate = value;
    }

    /**
     * Gets the value of the financialAccountRefIdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvoiceType.FinancialAccountRefIdList }{@code >}
     *     
     */
    public JAXBElement<InvoiceType.FinancialAccountRefIdList> getFinancialAccountRefIdList() {
        return financialAccountRefIdList;
    }

    /**
     * Sets the value of the financialAccountRefIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvoiceType.FinancialAccountRefIdList }{@code >}
     *     
     */
    public void setFinancialAccountRefIdList(JAXBElement<InvoiceType.FinancialAccountRefIdList> value) {
        this.financialAccountRefIdList = value;
    }

    /**
     * Gets the value of the accountingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountingPeriod() {
        return accountingPeriod;
    }

    /**
     * Sets the value of the accountingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountingPeriod(JAXBElement<String> value) {
        this.accountingPeriod = value;
    }

    /**
     * Gets the value of the relatedPurchaseOrderRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRelatedPurchaseOrderRefId() {
        return relatedPurchaseOrderRefId;
    }

    /**
     * Sets the value of the relatedPurchaseOrderRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRelatedPurchaseOrderRefId(JAXBElement<String> value) {
        this.relatedPurchaseOrderRefId = value;
    }

    /**
     * Gets the value of the purchasingItems property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link InvoiceType.PurchasingItems }{@code >}
     *     
     */
    public JAXBElement<InvoiceType.PurchasingItems> getPurchasingItems() {
        return purchasingItems;
    }

    /**
     * Sets the value of the purchasingItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link InvoiceType.PurchasingItems }{@code >}
     *     
     */
    public void setPurchasingItems(JAXBElement<InvoiceType.PurchasingItems> value) {
        this.purchasingItems = value;
    }

    /**
     * Gets the value of the voluntary property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getVoluntary() {
        return voluntary;
    }

    /**
     * Sets the value of the voluntary property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setVoluntary(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.voluntary = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
        this.sifExtendedElements = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }


    /**
     * Gross amount to be billed, including any tax. Can be credit (e.g. for family credit notes, reimbursements, rebates).
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/au/datamodel/3.4>MonetaryAmountType">
     *       &lt;attribute name="Type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="Debit"/>
     *             &lt;enumeration value="Credit"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BilledAmount
        extends MonetaryAmountType
    {

        @XmlAttribute(name = "Type", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FinancialAccountRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "financialAccountRefId"
    })
    public static class FinancialAccountRefIdList {

        @XmlElement(name = "FinancialAccountRefId", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected List<String> financialAccountRefId;

        /**
         * Gets the value of the financialAccountRefId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the financialAccountRefId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFinancialAccountRefId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFinancialAccountRefId() {
            if (financialAccountRefId == null) {
                financialAccountRefId = new ArrayList<String>();
            }
            return this.financialAccountRefId;
        }

    }


    /**
     * Id of the entity being billed for this billing activity.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/au/datamodel/3.4>IdRefTypeOrEmpty">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="Debtor"/>
     *             &lt;enumeration value="PurchaseOrder"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class InvoicedEntity {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the sifRefObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIFRefObject() {
            return sifRefObject;
        }

        /**
         * Sets the value of the sifRefObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIFRefObject(String value) {
            this.sifRefObject = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PurchasingItem" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="UnitCost" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "purchasingItem"
    })
    public static class PurchasingItems {

        @XmlElement(name = "PurchasingItem", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
        protected List<InvoiceType.PurchasingItems.PurchasingItem> purchasingItem;

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
         * {@link InvoiceType.PurchasingItems.PurchasingItem }
         * 
         * 
         */
        public List<InvoiceType.PurchasingItems.PurchasingItem> getPurchasingItem() {
            if (purchasingItem == null) {
                purchasingItem = new ArrayList<InvoiceType.PurchasingItems.PurchasingItem>();
            }
            return this.purchasingItem;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ItemNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="ItemDescription" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="UnitCost" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "itemNumber",
            "itemDescription",
            "quantity",
            "unitCost"
        })
        public static class PurchasingItem {

            @XmlElementRef(name = "ItemNumber", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
            protected JAXBElement<String> itemNumber;
            @XmlElement(name = "ItemDescription", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String itemDescription;
            @XmlElementRef(name = "Quantity", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
            protected JAXBElement<String> quantity;
            @XmlElementRef(name = "UnitCost", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
            protected JAXBElement<MonetaryAmountType> unitCost;

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

        }

    }

}
