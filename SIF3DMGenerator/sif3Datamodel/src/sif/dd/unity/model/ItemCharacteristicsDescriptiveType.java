
package sif.dd.unity.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCharacteristicsDescriptiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemCharacteristicsDescriptiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PValue" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="SampleSize" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PointBiserial" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="-1.00"/>
 *               &lt;maxInclusive value="1.00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Biserial" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="-1.00"/>
 *               &lt;maxInclusive value="1.00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DiscriminationIndex" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1.00"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
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
@XmlType(name = "ItemCharacteristicsDescriptiveType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "pValue",
    "sampleSize",
    "pointBiserial",
    "biserial",
    "discriminationIndex"
})
public class ItemCharacteristicsDescriptiveType {

    @XmlElement(name = "PValue", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Float pValue;
    @XmlElement(name = "SampleSize", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigInteger sampleSize;
    @XmlElement(name = "PointBiserial", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal pointBiserial;
    @XmlElement(name = "Biserial", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal biserial;
    @XmlElement(name = "DiscriminationIndex", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal discriminationIndex;

    /**
     * Gets the value of the pValue property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPValue() {
        return pValue;
    }

    /**
     * Sets the value of the pValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPValue(Float value) {
        this.pValue = value;
    }

    /**
     * Gets the value of the sampleSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSampleSize() {
        return sampleSize;
    }

    /**
     * Sets the value of the sampleSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSampleSize(BigInteger value) {
        this.sampleSize = value;
    }

    /**
     * Gets the value of the pointBiserial property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointBiserial() {
        return pointBiserial;
    }

    /**
     * Sets the value of the pointBiserial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointBiserial(BigDecimal value) {
        this.pointBiserial = value;
    }

    /**
     * Gets the value of the biserial property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBiserial() {
        return biserial;
    }

    /**
     * Sets the value of the biserial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBiserial(BigDecimal value) {
        this.biserial = value;
    }

    /**
     * Gets the value of the discriminationIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscriminationIndex() {
        return discriminationIndex;
    }

    /**
     * Sets the value of the discriminationIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscriminationIndex(BigDecimal value) {
        this.discriminationIndex = value;
    }

}
