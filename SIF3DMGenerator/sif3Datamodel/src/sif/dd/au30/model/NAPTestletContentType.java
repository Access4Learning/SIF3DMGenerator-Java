
package sif.dd.au30.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Contents of a Teslet in the context of NAP.
 * 
 * <p>Java class for NAPTestletContentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestletContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPTestletLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType"/>
 *         &lt;element name="TestletName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="Node" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="LocationInStage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="TestletMaximumScore" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestletContentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "napTestletLocalId",
    "testletName",
    "node",
    "locationInStage",
    "testletMaximumScore"
})
public class NAPTestletContentType {

    @XmlElement(name = "NAPTestletLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String napTestletLocalId;
    @XmlElement(name = "TestletName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String testletName;
    @XmlElementRef(name = "Node", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> node;
    @XmlElementRef(name = "LocationInStage", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> locationInStage;
    @XmlElement(name = "TestletMaximumScore", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal testletMaximumScore;

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
     * Gets the value of the testletName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestletName() {
        return testletName;
    }

    /**
     * Sets the value of the testletName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestletName(String value) {
        this.testletName = value;
    }

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNode(JAXBElement<String> value) {
        this.node = value;
    }

    /**
     * Gets the value of the locationInStage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getLocationInStage() {
        return locationInStage;
    }

    /**
     * Sets the value of the locationInStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setLocationInStage(JAXBElement<BigInteger> value) {
        this.locationInStage = value;
    }

    /**
     * Gets the value of the testletMaximumScore property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTestletMaximumScore() {
        return testletMaximumScore;
    }

    /**
     * Sets the value of the testletMaximumScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTestletMaximumScore(BigDecimal value) {
        this.testletMaximumScore = value;
    }

}
