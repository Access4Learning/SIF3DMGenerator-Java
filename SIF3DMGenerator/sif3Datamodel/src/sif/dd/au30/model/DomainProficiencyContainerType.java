
package sif.dd.au30.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DomainProficiencyContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainProficiencyContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Level1Lower" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Level1Upper" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Level2Lower" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Level2Upper" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Level3Lower" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Level3Upper" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Level4Lower" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="Level4Upper" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainProficiencyContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "level1Lower",
    "level1Upper",
    "level2Lower",
    "level2Upper",
    "level3Lower",
    "level3Upper",
    "level4Lower",
    "level4Upper"
})
public class DomainProficiencyContainerType {

    @XmlElement(name = "Level1Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal level1Lower;
    @XmlElement(name = "Level1Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal level1Upper;
    @XmlElement(name = "Level2Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal level2Lower;
    @XmlElement(name = "Level2Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal level2Upper;
    @XmlElement(name = "Level3Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal level3Lower;
    @XmlElement(name = "Level3Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal level3Upper;
    @XmlElement(name = "Level4Lower", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal level4Lower;
    @XmlElement(name = "Level4Upper", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected BigDecimal level4Upper;

    /**
     * Gets the value of the level1Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevel1Lower() {
        return level1Lower;
    }

    /**
     * Sets the value of the level1Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevel1Lower(BigDecimal value) {
        this.level1Lower = value;
    }

    /**
     * Gets the value of the level1Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevel1Upper() {
        return level1Upper;
    }

    /**
     * Sets the value of the level1Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevel1Upper(BigDecimal value) {
        this.level1Upper = value;
    }

    /**
     * Gets the value of the level2Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevel2Lower() {
        return level2Lower;
    }

    /**
     * Sets the value of the level2Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevel2Lower(BigDecimal value) {
        this.level2Lower = value;
    }

    /**
     * Gets the value of the level2Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevel2Upper() {
        return level2Upper;
    }

    /**
     * Sets the value of the level2Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevel2Upper(BigDecimal value) {
        this.level2Upper = value;
    }

    /**
     * Gets the value of the level3Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevel3Lower() {
        return level3Lower;
    }

    /**
     * Sets the value of the level3Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevel3Lower(BigDecimal value) {
        this.level3Lower = value;
    }

    /**
     * Gets the value of the level3Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevel3Upper() {
        return level3Upper;
    }

    /**
     * Sets the value of the level3Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevel3Upper(BigDecimal value) {
        this.level3Upper = value;
    }

    /**
     * Gets the value of the level4Lower property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevel4Lower() {
        return level4Lower;
    }

    /**
     * Sets the value of the level4Lower property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevel4Lower(BigDecimal value) {
        this.level4Lower = value;
    }

    /**
     * Gets the value of the level4Upper property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLevel4Upper() {
        return level4Upper;
    }

    /**
     * Sets the value of the level4Upper property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLevel4Upper(BigDecimal value) {
        this.level4Upper = value;
    }

}
