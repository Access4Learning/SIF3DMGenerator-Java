
package sif.dd.unity.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xAcademicSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xAcademicSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cumulativeWeightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="termWeightedGpa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="classRank" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xAcademicSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "cumulativeWeightedGpa",
    "termWeightedGpa",
    "classRank"
})
public class XAcademicSummaryType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal cumulativeWeightedGpa;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal termWeightedGpa;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigInteger classRank;

    /**
     * Gets the value of the cumulativeWeightedGpa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCumulativeWeightedGpa() {
        return cumulativeWeightedGpa;
    }

    /**
     * Sets the value of the cumulativeWeightedGpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCumulativeWeightedGpa(BigDecimal value) {
        this.cumulativeWeightedGpa = value;
    }

    /**
     * Gets the value of the termWeightedGpa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTermWeightedGpa() {
        return termWeightedGpa;
    }

    /**
     * Sets the value of the termWeightedGpa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTermWeightedGpa(BigDecimal value) {
        this.termWeightedGpa = value;
    }

    /**
     * Gets the value of the classRank property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClassRank() {
        return classRank;
    }

    /**
     * Sets the value of the classRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClassRank(BigInteger value) {
        this.classRank = value;
    }

}
