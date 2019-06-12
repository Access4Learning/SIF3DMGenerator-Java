
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="ItemInfo" type="{http://www.sifassociation.org/datamodel/na/4.x}LibraryItemInfoType" minOccurs="0"/>
 *         &lt;element name="CheckoutInfo" type="{http://www.sifassociation.org/datamodel/na/4.x}CheckoutInfoType" minOccurs="0"/>
 *         &lt;element name="FineInfoList" type="{http://www.sifassociation.org/datamodel/na/4.x}FineInfoListType" minOccurs="0"/>
 *         &lt;element name="HoldInfoList" type="{http://www.sifassociation.org/datamodel/na/4.x}HoldInfoListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LibraryTransactionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "itemInfo",
    "checkoutInfo",
    "fineInfoList",
    "holdInfoList"
})
public class LibraryTransactionType {

    @XmlElement(name = "ItemInfo", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LibraryItemInfoType itemInfo;
    @XmlElement(name = "CheckoutInfo", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CheckoutInfoType checkoutInfo;
    @XmlElement(name = "FineInfoList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected FineInfoListType fineInfoList;
    @XmlElement(name = "HoldInfoList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected HoldInfoListType holdInfoList;

    /**
     * Gets the value of the itemInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LibraryItemInfoType }
     *     
     */
    public LibraryItemInfoType getItemInfo() {
        return itemInfo;
    }

    /**
     * Sets the value of the itemInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LibraryItemInfoType }
     *     
     */
    public void setItemInfo(LibraryItemInfoType value) {
        this.itemInfo = value;
    }

    /**
     * Gets the value of the checkoutInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CheckoutInfoType }
     *     
     */
    public CheckoutInfoType getCheckoutInfo() {
        return checkoutInfo;
    }

    /**
     * Sets the value of the checkoutInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckoutInfoType }
     *     
     */
    public void setCheckoutInfo(CheckoutInfoType value) {
        this.checkoutInfo = value;
    }

    /**
     * Gets the value of the fineInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link FineInfoListType }
     *     
     */
    public FineInfoListType getFineInfoList() {
        return fineInfoList;
    }

    /**
     * Sets the value of the fineInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FineInfoListType }
     *     
     */
    public void setFineInfoList(FineInfoListType value) {
        this.fineInfoList = value;
    }

    /**
     * Gets the value of the holdInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link HoldInfoListType }
     *     
     */
    public HoldInfoListType getHoldInfoList() {
        return holdInfoList;
    }

    /**
     * Sets the value of the holdInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link HoldInfoListType }
     *     
     */
    public void setHoldInfoList(HoldInfoListType value) {
        this.holdInfoList = value;
    }

}
