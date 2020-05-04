
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for JournalAdjustmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JournalAdjustmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DebitFinancialAccountRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="CreditFinancialAccountRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="DebitAccountCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="CreditAccountCode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="GSTCodeOriginal" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="GSTCodeReplacement" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="LineAdjustmentAmount" type="{http://www.sifassociation.org/datamodel/au/3.4}MonetaryAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JournalAdjustmentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "debitFinancialAccountRefId",
    "creditFinancialAccountRefId",
    "debitAccountCode",
    "creditAccountCode",
    "gstCodeOriginal",
    "gstCodeReplacement",
    "lineAdjustmentAmount"
})
public class JournalAdjustmentType {

    @XmlElementRef(name = "DebitFinancialAccountRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debitFinancialAccountRefId;
    @XmlElementRef(name = "CreditFinancialAccountRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditFinancialAccountRefId;
    @XmlElementRef(name = "DebitAccountCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> debitAccountCode;
    @XmlElementRef(name = "CreditAccountCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> creditAccountCode;
    @XmlElementRef(name = "GSTCodeOriginal", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gstCodeOriginal;
    @XmlElementRef(name = "GSTCodeReplacement", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gstCodeReplacement;
    @XmlElement(name = "LineAdjustmentAmount", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected MonetaryAmountType lineAdjustmentAmount;

    /**
     * Gets the value of the debitFinancialAccountRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebitFinancialAccountRefId() {
        return debitFinancialAccountRefId;
    }

    /**
     * Sets the value of the debitFinancialAccountRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebitFinancialAccountRefId(JAXBElement<String> value) {
        this.debitFinancialAccountRefId = value;
    }

    /**
     * Gets the value of the creditFinancialAccountRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditFinancialAccountRefId() {
        return creditFinancialAccountRefId;
    }

    /**
     * Sets the value of the creditFinancialAccountRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditFinancialAccountRefId(JAXBElement<String> value) {
        this.creditFinancialAccountRefId = value;
    }

    /**
     * Gets the value of the debitAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDebitAccountCode() {
        return debitAccountCode;
    }

    /**
     * Sets the value of the debitAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDebitAccountCode(JAXBElement<String> value) {
        this.debitAccountCode = value;
    }

    /**
     * Gets the value of the creditAccountCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreditAccountCode() {
        return creditAccountCode;
    }

    /**
     * Sets the value of the creditAccountCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreditAccountCode(JAXBElement<String> value) {
        this.creditAccountCode = value;
    }

    /**
     * Gets the value of the gstCodeOriginal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSTCodeOriginal() {
        return gstCodeOriginal;
    }

    /**
     * Sets the value of the gstCodeOriginal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSTCodeOriginal(JAXBElement<String> value) {
        this.gstCodeOriginal = value;
    }

    /**
     * Gets the value of the gstCodeReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSTCodeReplacement() {
        return gstCodeReplacement;
    }

    /**
     * Sets the value of the gstCodeReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSTCodeReplacement(JAXBElement<String> value) {
        this.gstCodeReplacement = value;
    }

    /**
     * Gets the value of the lineAdjustmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getLineAdjustmentAmount() {
        return lineAdjustmentAmount;
    }

    /**
     * Sets the value of the lineAdjustmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setLineAdjustmentAmount(MonetaryAmountType value) {
        this.lineAdjustmentAmount = value;
    }

}
