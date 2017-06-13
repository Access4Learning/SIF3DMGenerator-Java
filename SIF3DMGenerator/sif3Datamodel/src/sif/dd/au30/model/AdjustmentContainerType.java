
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdjustmentContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdjustmentContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PNPCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}PNPCodeListType"/>
 *         &lt;element name="BookletType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdjustmentContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "pnpCodeList",
    "bookletType"
})
public class AdjustmentContainerType {

    @XmlElement(name = "PNPCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected PNPCodeListType pnpCodeList;
    @XmlElementRef(name = "BookletType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookletType;

    /**
     * Gets the value of the pnpCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link PNPCodeListType }
     *     
     */
    public PNPCodeListType getPNPCodeList() {
        return pnpCodeList;
    }

    /**
     * Sets the value of the pnpCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PNPCodeListType }
     *     
     */
    public void setPNPCodeList(PNPCodeListType value) {
        this.pnpCodeList = value;
    }

    /**
     * Gets the value of the bookletType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookletType() {
        return bookletType;
    }

    /**
     * Sets the value of the bookletType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookletType(JAXBElement<String> value) {
        this.bookletType = value;
    }

}
