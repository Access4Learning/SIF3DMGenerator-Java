
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SubstituteItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstituteItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubstituteItemRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SubstituteItemLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="PNPCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}PNPCodeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubstituteItemType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "substituteItemRefId",
    "substituteItemLocalId",
    "pnpCodeList"
})
public class SubstituteItemType {

    @XmlElement(name = "SubstituteItemRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String substituteItemRefId;
    @XmlElementRef(name = "SubstituteItemLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> substituteItemLocalId;
    @XmlElement(name = "PNPCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected PNPCodeListType pnpCodeList;

    /**
     * Gets the value of the substituteItemRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstituteItemRefId() {
        return substituteItemRefId;
    }

    /**
     * Sets the value of the substituteItemRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstituteItemRefId(String value) {
        this.substituteItemRefId = value;
    }

    /**
     * Gets the value of the substituteItemLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubstituteItemLocalId() {
        return substituteItemLocalId;
    }

    /**
     * Sets the value of the substituteItemLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubstituteItemLocalId(JAXBElement<String> value) {
        this.substituteItemLocalId = value;
    }

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

}
