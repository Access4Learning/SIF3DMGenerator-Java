
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainBandsContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainBandsContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Band1Lower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band1Upper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band2Lower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band2Upper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band3Lower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band3Upper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band4Lower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band4Upper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band5Lower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band5Upper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band6Lower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band6Upper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band7Lower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band7Upper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band8Lower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band8Upper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band9Lower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band9Upper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band10Lower" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Band10Upper" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainBandsContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "band1Lower",
    "band1Upper",
    "band2Lower",
    "band2Upper",
    "band3Lower",
    "band3Upper",
    "band4Lower",
    "band4Upper",
    "band5Lower",
    "band5Upper",
    "band6Lower",
    "band6Upper",
    "band7Lower",
    "band7Upper",
    "band8Lower",
    "band8Upper",
    "band9Lower",
    "band9Upper",
    "band10Lower",
    "band10Upper"
})
public class DomainBandsContainerType {

    @XmlElement(name = "Band1Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band1Lower;
    @XmlElement(name = "Band1Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band1Upper;
    @XmlElement(name = "Band2Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band2Lower;
    @XmlElement(name = "Band2Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band2Upper;
    @XmlElement(name = "Band3Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band3Lower;
    @XmlElement(name = "Band3Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band3Upper;
    @XmlElement(name = "Band4Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band4Lower;
    @XmlElement(name = "Band4Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band4Upper;
    @XmlElement(name = "Band5Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band5Lower;
    @XmlElement(name = "Band5Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band5Upper;
    @XmlElement(name = "Band6Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band6Lower;
    @XmlElement(name = "Band6Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band6Upper;
    @XmlElement(name = "Band7Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band7Lower;
    @XmlElement(name = "Band7Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band7Upper;
    @XmlElement(name = "Band8Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band8Lower;
    @XmlElement(name = "Band8Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band8Upper;
    @XmlElement(name = "Band9Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band9Lower;
    @XmlElement(name = "Band9Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band9Upper;
    @XmlElement(name = "Band10Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band10Lower;
    @XmlElement(name = "Band10Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected BigDecimal band10Upper;

    /**
     * Gets the value of the band1Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand1Lower() {
        return band1Lower;
    }

    /**
     * Sets the value of the band1Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand1Lower(BigDecimal value) {
        this.band1Lower = value;
    }

    /**
     * Gets the value of the band1Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand1Upper() {
        return band1Upper;
    }

    /**
     * Sets the value of the band1Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand1Upper(BigDecimal value) {
        this.band1Upper = value;
    }

    /**
     * Gets the value of the band2Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand2Lower() {
        return band2Lower;
    }

    /**
     * Sets the value of the band2Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand2Lower(BigDecimal value) {
        this.band2Lower = value;
    }

    /**
     * Gets the value of the band2Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand2Upper() {
        return band2Upper;
    }

    /**
     * Sets the value of the band2Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand2Upper(BigDecimal value) {
        this.band2Upper = value;
    }

    /**
     * Gets the value of the band3Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand3Lower() {
        return band3Lower;
    }

    /**
     * Sets the value of the band3Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand3Lower(BigDecimal value) {
        this.band3Lower = value;
    }

    /**
     * Gets the value of the band3Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand3Upper() {
        return band3Upper;
    }

    /**
     * Sets the value of the band3Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand3Upper(BigDecimal value) {
        this.band3Upper = value;
    }

    /**
     * Gets the value of the band4Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand4Lower() {
        return band4Lower;
    }

    /**
     * Sets the value of the band4Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand4Lower(BigDecimal value) {
        this.band4Lower = value;
    }

    /**
     * Gets the value of the band4Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand4Upper() {
        return band4Upper;
    }

    /**
     * Sets the value of the band4Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand4Upper(BigDecimal value) {
        this.band4Upper = value;
    }

    /**
     * Gets the value of the band5Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand5Lower() {
        return band5Lower;
    }

    /**
     * Sets the value of the band5Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand5Lower(BigDecimal value) {
        this.band5Lower = value;
    }

    /**
     * Gets the value of the band5Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand5Upper() {
        return band5Upper;
    }

    /**
     * Sets the value of the band5Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand5Upper(BigDecimal value) {
        this.band5Upper = value;
    }

    /**
     * Gets the value of the band6Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand6Lower() {
        return band6Lower;
    }

    /**
     * Sets the value of the band6Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand6Lower(BigDecimal value) {
        this.band6Lower = value;
    }

    /**
     * Gets the value of the band6Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand6Upper() {
        return band6Upper;
    }

    /**
     * Sets the value of the band6Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand6Upper(BigDecimal value) {
        this.band6Upper = value;
    }

    /**
     * Gets the value of the band7Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand7Lower() {
        return band7Lower;
    }

    /**
     * Sets the value of the band7Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand7Lower(BigDecimal value) {
        this.band7Lower = value;
    }

    /**
     * Gets the value of the band7Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand7Upper() {
        return band7Upper;
    }

    /**
     * Sets the value of the band7Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand7Upper(BigDecimal value) {
        this.band7Upper = value;
    }

    /**
     * Gets the value of the band8Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand8Lower() {
        return band8Lower;
    }

    /**
     * Sets the value of the band8Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand8Lower(BigDecimal value) {
        this.band8Lower = value;
    }

    /**
     * Gets the value of the band8Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand8Upper() {
        return band8Upper;
    }

    /**
     * Sets the value of the band8Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand8Upper(BigDecimal value) {
        this.band8Upper = value;
    }

    /**
     * Gets the value of the band9Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand9Lower() {
        return band9Lower;
    }

    /**
     * Sets the value of the band9Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand9Lower(BigDecimal value) {
        this.band9Lower = value;
    }

    /**
     * Gets the value of the band9Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand9Upper() {
        return band9Upper;
    }

    /**
     * Sets the value of the band9Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand9Upper(BigDecimal value) {
        this.band9Upper = value;
    }

    /**
     * Gets the value of the band10Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand10Lower() {
        return band10Lower;
    }

    /**
     * Sets the value of the band10Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand10Lower(BigDecimal value) {
        this.band10Lower = value;
    }

    /**
     * Gets the value of the band10Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBand10Upper() {
        return band10Upper;
    }

    /**
     * Sets the value of the band10Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBand10Upper(BigDecimal value) {
        this.band10Upper = value;
    }

}
