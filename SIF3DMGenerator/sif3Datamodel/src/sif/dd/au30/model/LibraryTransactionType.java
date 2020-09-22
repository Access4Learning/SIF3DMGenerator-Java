
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LibraryTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LibraryTransactionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemInfo" type="{http://www.sifassociation.org/datamodel/au/3.4}LibraryItemInfoType" minOccurs="0"/>
 *         &lt;element name="CheckoutInfo" type="{http://www.sifassociation.org/datamodel/au/3.4}CheckoutInfoType" minOccurs="0"/>
 *         &lt;element name="FineInfoList" type="{http://www.sifassociation.org/datamodel/au/3.4}FineInfoListType" minOccurs="0"/>
 *         &lt;element name="HoldInfoList" type="{http://www.sifassociation.org/datamodel/au/3.4}HoldInfoListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibraryTransactionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "itemInfo",
    "checkoutInfo",
    "fineInfoList",
    "holdInfoList"
})
public class LibraryTransactionType {

    @XmlElementRef(name = "ItemInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LibraryItemInfoType> itemInfo;
    @XmlElementRef(name = "CheckoutInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<CheckoutInfoType> checkoutInfo;
    @XmlElementRef(name = "FineInfoList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<FineInfoListType> fineInfoList;
    @XmlElementRef(name = "HoldInfoList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<HoldInfoListType> holdInfoList;

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LibraryItemInfoType }{@code >}
     *     
     */
    public JAXBElement<LibraryItemInfoType> getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LibraryItemInfoType }{@code >}
     *     
     */
    public void setItemInfo(JAXBElement<LibraryItemInfoType> value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the checkoutInfo property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CheckoutInfoType }{@code >}
     *     
     */
    public JAXBElement<CheckoutInfoType> getCheckoutInfo() {
        return checkoutInfo;
    }

    /**
     * Sets the value of the checkoutInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CheckoutInfoType }{@code >}
     *     
     */
    public void setCheckoutInfo(JAXBElement<CheckoutInfoType> value) {
        this.checkoutInfo = value;
    }

    /**
     * Gets the value of the fineInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FineInfoListType }{@code >}
     *     
     */
    public JAXBElement<FineInfoListType> getFineInfoList() {
        return fineInfoList;
    }

    /**
     * Sets the value of the fineInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FineInfoListType }{@code >}
     *     
     */
    public void setFineInfoList(JAXBElement<FineInfoListType> value) {
        this.fineInfoList = value;
    }

    /**
     * Gets the value of the holdInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HoldInfoListType }{@code >}
     *     
     */
    public JAXBElement<HoldInfoListType> getHoldInfoList() {
        return holdInfoList;
    }

    /**
     * Sets the value of the holdInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HoldInfoListType }{@code >}
     *     
     */
    public void setHoldInfoList(JAXBElement<HoldInfoListType> value) {
        this.holdInfoList = value;
    }

}
