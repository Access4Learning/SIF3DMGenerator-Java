
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for tiepHistoryListItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tiepHistoryListItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lea" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonLeaRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="iepDates" type="{http://www.sifassociation.org/datamodel/na/4.x}tiepHistoryItemIepDatesType" minOccurs="0"/>
 *         &lt;element name="contactInfoRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonContactRefIdPointerType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tiepHistoryListItemType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "lea",
    "iepDates",
    "contactInfoRefId"
})
@XmlSeeAlso({
    TiepHistoryListType.class
})
public class TiepHistoryListItemType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lea;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TiepHistoryItemIepDatesType iepDates;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String contactInfoRefId;

    /**
     * Gets the value of the lea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLea() {
        return lea;
    }

    /**
     * Sets the value of the lea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLea(String value) {
        this.lea = value;
    }

    /**
     * Gets the value of the iepDates property.
     * 
     * @return
     *     possible object is
     *     {@link TiepHistoryItemIepDatesType }
     *     
     */
    public TiepHistoryItemIepDatesType getIepDates() {
        return iepDates;
    }

    /**
     * Sets the value of the iepDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link TiepHistoryItemIepDatesType }
     *     
     */
    public void setIepDates(TiepHistoryItemIepDatesType value) {
        this.iepDates = value;
    }

    /**
     * Gets the value of the contactInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoRefId() {
        return contactInfoRefId;
    }

    /**
     * Sets the value of the contactInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfoRefId(String value) {
        this.contactInfoRefId = value;
    }

}
