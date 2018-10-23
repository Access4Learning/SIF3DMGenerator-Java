
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 
 * <p>Java class for NAPTestletResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestletResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPTestletRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="NAPTestletLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType"/>
 *         &lt;element name="TestletSubScore" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ItemResponseList" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPTestletItemResponseListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestletResponseType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "napTestletRefId",
    "napTestletLocalId",
    "testletSubScore",
    "itemResponseList"
})
public class NAPTestletResponseType {

    @XmlElementRef(name = "NAPTestletRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> napTestletRefId;
    @XmlElement(name = "NAPTestletLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String napTestletLocalId;
    @XmlElementRef(name = "TestletSubScore", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> testletSubScore;
    @XmlElement(name = "ItemResponseList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected NAPTestletItemResponseListType itemResponseList;

    /**
     * Gets the value of the napTestletRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAPTestletRefId() {
        return napTestletRefId;
    }

    /**
     * Sets the value of the napTestletRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAPTestletRefId(JAXBElement<String> value) {
        this.napTestletRefId = value;
    }

    /**
     * Gets the value of the napTestletLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAPTestletLocalId() {
        return napTestletLocalId;
    }

    /**
     * Sets the value of the napTestletLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAPTestletLocalId(String value) {
        this.napTestletLocalId = value;
    }

    /**
     * Gets the value of the testletSubScore property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTestletSubScore() {
        return testletSubScore;
    }

    /**
     * Sets the value of the testletSubScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTestletSubScore(JAXBElement<BigDecimal> value) {
        this.testletSubScore = value;
    }

    /**
     * Gets the value of the itemResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link NAPTestletItemResponseListType }
     *     
     */
    public NAPTestletItemResponseListType getItemResponseList() {
        return itemResponseList;
    }

    /**
     * Sets the value of the itemResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAPTestletItemResponseListType }
     *     
     */
    public void setItemResponseList(NAPTestletItemResponseListType value) {
        this.itemResponseList = value;
    }

}
