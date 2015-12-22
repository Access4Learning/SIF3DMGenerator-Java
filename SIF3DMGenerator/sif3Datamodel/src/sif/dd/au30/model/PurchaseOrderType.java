
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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *         This object provides information down to the line item level for purchase orders.
 * 
 * <p>Java class for PurchaseOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="VendorInfoRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="ChargedLocationInfoRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="EmployeePersonalRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
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
 *                             &lt;element name="TotalCost" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
 *                             &lt;element name="QuantityDelivered" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="CancelledOrder" type="{http://www.sifassociation.org/au/datamodel/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *                             &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="ExpenseAccounts" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="ExpenseAccount" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                                 &lt;element name="Amount" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
 *                                                 &lt;element name="FinancialAccountRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
 *                                                 &lt;element name="AccountingPeriod" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
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
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TaxAmount" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="TotalAmount" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
 *         &lt;element name="UpdateDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FullyDelivered" type="{http://www.sifassociation.org/au/datamodel/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="OriginalPurchaseOrderRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
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
@XmlType(name = "PurchaseOrderType", namespace = "http://www.sifassociation.org/au/datamodel/3.4", propOrder = {
    "formNumber",
    "vendorInfoRefId",
    "chargedLocationInfoRefId",
    "employeePersonalRefId",
    "purchasingItems",
    "creationDate",
    "taxRate",
    "taxAmount",
    "totalAmount",
    "updateDate",
    "fullyDelivered",
    "originalPurchaseOrderRefId",
    "sifMetadata",
    "sifExtendedElements"
})
public class PurchaseOrderType {

    @XmlElement(name = "FormNumber", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String formNumber;
    @XmlElement(name = "VendorInfoRefId", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String vendorInfoRefId;
    @XmlElementRef(name = "ChargedLocationInfoRefId", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chargedLocationInfoRefId;
    @XmlElementRef(name = "EmployeePersonalRefId", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeePersonalRefId;
    @XmlElement(name = "PurchasingItems", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
    protected PurchaseOrderType.PurchasingItems purchasingItems;
    @XmlElementRef(name = "CreationDate", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> creationDate;
    @XmlElementRef(name = "TaxRate", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> taxRate;
    @XmlElementRef(name = "TaxAmount", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryAmountType> taxAmount;
    @XmlElementRef(name = "TotalAmount", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<MonetaryAmountType> totalAmount;
    @XmlElementRef(name = "UpdateDate", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> updateDate;
    @XmlElementRef(name = "FullyDelivered", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> fullyDelivered;
    @XmlElementRef(name = "OriginalPurchaseOrderRefId", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> originalPurchaseOrderRefId;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the formNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormNumber() {
        return formNumber;
    }

    /**
     * Sets the value of the formNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormNumber(String value) {
        this.formNumber = value;
    }

    /**
     * Gets the value of the vendorInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVendorInfoRefId() {
        return vendorInfoRefId;
    }

    /**
     * Sets the value of the vendorInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVendorInfoRefId(String value) {
        this.vendorInfoRefId = value;
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
     * Gets the value of the employeePersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeePersonalRefId() {
        return employeePersonalRefId;
    }

    /**
     * Sets the value of the employeePersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeePersonalRefId(JAXBElement<String> value) {
        this.employeePersonalRefId = value;
    }

    /**
     * Gets the value of the purchasingItems property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderType.PurchasingItems }
     *     
     */
    public PurchaseOrderType.PurchasingItems getPurchasingItems() {
        return purchasingItems;
    }

    /**
     * Sets the value of the purchasingItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderType.PurchasingItems }
     *     
     */
    public void setPurchasingItems(PurchaseOrderType.PurchasingItems value) {
        this.purchasingItems = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.creationDate = value;
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

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public JAXBElement<MonetaryAmountType> getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     *     
     */
    public void setTotalAmount(JAXBElement<MonetaryAmountType> value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the fullyDelivered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getFullyDelivered() {
        return fullyDelivered;
    }

    /**
     * Sets the value of the fullyDelivered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setFullyDelivered(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.fullyDelivered = value;
    }

    /**
     * Gets the value of the originalPurchaseOrderRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOriginalPurchaseOrderRefId() {
        return originalPurchaseOrderRefId;
    }

    /**
     * Sets the value of the originalPurchaseOrderRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOriginalPurchaseOrderRefId(JAXBElement<String> value) {
        this.originalPurchaseOrderRefId = value;
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
     *                   &lt;element name="TotalCost" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
     *                   &lt;element name="QuantityDelivered" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="CancelledOrder" type="{http://www.sifassociation.org/au/datamodel/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
     *                   &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="ExpenseAccounts" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="ExpenseAccount" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                       &lt;element name="Amount" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
     *                                       &lt;element name="FinancialAccountRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
     *                                       &lt;element name="AccountingPeriod" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
        protected List<PurchaseOrderType.PurchasingItems.PurchasingItem> purchasingItem;

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
         * {@link PurchaseOrderType.PurchasingItems.PurchasingItem }
         * 
         * 
         */
        public List<PurchaseOrderType.PurchasingItems.PurchasingItem> getPurchasingItem() {
            if (purchasingItem == null) {
                purchasingItem = new ArrayList<PurchaseOrderType.PurchasingItems.PurchasingItem>();
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
         *         &lt;element name="TotalCost" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
         *         &lt;element name="QuantityDelivered" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="CancelledOrder" type="{http://www.sifassociation.org/au/datamodel/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
         *         &lt;element name="TaxRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="ExpenseAccounts" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ExpenseAccount" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                             &lt;element name="Amount" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
         *                             &lt;element name="FinancialAccountRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
         *                             &lt;element name="AccountingPeriod" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
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
            "unitCost",
            "totalCost",
            "quantityDelivered",
            "cancelledOrder",
            "taxRate",
            "expenseAccounts"
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
            @XmlElementRef(name = "TotalCost", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
            protected JAXBElement<MonetaryAmountType> totalCost;
            @XmlElementRef(name = "QuantityDelivered", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
            protected JAXBElement<String> quantityDelivered;
            @XmlElementRef(name = "CancelledOrder", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
            protected JAXBElement<AUCodeSetsYesOrNoCategoryType> cancelledOrder;
            @XmlElementRef(name = "TaxRate", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
            protected JAXBElement<BigDecimal> taxRate;
            @XmlElementRef(name = "ExpenseAccounts", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
            protected JAXBElement<PurchaseOrderType.PurchasingItems.PurchasingItem.ExpenseAccounts> expenseAccounts;

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
             *     {@link JAXBElement }{@code <}{@link PurchaseOrderType.PurchasingItems.PurchasingItem.ExpenseAccounts }{@code >}
             *     
             */
            public JAXBElement<PurchaseOrderType.PurchasingItems.PurchasingItem.ExpenseAccounts> getExpenseAccounts() {
                return expenseAccounts;
            }

            /**
             * Sets the value of the expenseAccounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link PurchaseOrderType.PurchasingItems.PurchasingItem.ExpenseAccounts }{@code >}
             *     
             */
            public void setExpenseAccounts(JAXBElement<PurchaseOrderType.PurchasingItems.PurchasingItem.ExpenseAccounts> value) {
                this.expenseAccounts = value;
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
             *         &lt;element name="ExpenseAccount" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *                   &lt;element name="Amount" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
             *                   &lt;element name="FinancialAccountRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
             *                   &lt;element name="AccountingPeriod" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
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
                "expenseAccount"
            })
            public static class ExpenseAccounts {

                @XmlElementRef(name = "ExpenseAccount", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
                protected JAXBElement<PurchaseOrderType.PurchasingItems.PurchasingItem.ExpenseAccounts.ExpenseAccount> expenseAccount;

                /**
                 * Gets the value of the expenseAccount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link PurchaseOrderType.PurchasingItems.PurchasingItem.ExpenseAccounts.ExpenseAccount }{@code >}
                 *     
                 */
                public JAXBElement<PurchaseOrderType.PurchasingItems.PurchasingItem.ExpenseAccounts.ExpenseAccount> getExpenseAccount() {
                    return expenseAccount;
                }

                /**
                 * Sets the value of the expenseAccount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link PurchaseOrderType.PurchasingItems.PurchasingItem.ExpenseAccounts.ExpenseAccount }{@code >}
                 *     
                 */
                public void setExpenseAccount(JAXBElement<PurchaseOrderType.PurchasingItems.PurchasingItem.ExpenseAccounts.ExpenseAccount> value) {
                    this.expenseAccount = value;
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
                 *         &lt;element name="AccountCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
                 *         &lt;element name="Amount" type="{http://www.sifassociation.org/au/datamodel/3.4}MonetaryAmountType" minOccurs="0"/>
                 *         &lt;element name="FinancialAccountRefId" type="{http://www.sifassociation.org/au/datamodel/3.4}IdRefType" minOccurs="0"/>
                 *         &lt;element name="AccountingPeriod" type="{http://www.sifassociation.org/au/datamodel/3.4}LocalIdType" minOccurs="0"/>
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
                    "accountCode",
                    "amount",
                    "financialAccountRefId",
                    "accountingPeriod"
                })
                public static class ExpenseAccount {

                    @XmlElement(name = "AccountCode", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String accountCode;
                    @XmlElement(name = "Amount", namespace = "http://www.sifassociation.org/au/datamodel/3.4")
                    protected MonetaryAmountType amount;
                    @XmlElementRef(name = "FinancialAccountRefId", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> financialAccountRefId;
                    @XmlElementRef(name = "AccountingPeriod", namespace = "http://www.sifassociation.org/au/datamodel/3.4", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> accountingPeriod;

                    /**
                     * Gets the value of the accountCode property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAccountCode() {
                        return accountCode;
                    }

                    /**
                     * Sets the value of the accountCode property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAccountCode(String value) {
                        this.accountCode = value;
                    }

                    /**
                     * Gets the value of the amount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link MonetaryAmountType }
                     *     
                     */
                    public MonetaryAmountType getAmount() {
                        return amount;
                    }

                    /**
                     * Sets the value of the amount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MonetaryAmountType }
                     *     
                     */
                    public void setAmount(MonetaryAmountType value) {
                        this.amount = value;
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

                }

            }

        }

    }

}
