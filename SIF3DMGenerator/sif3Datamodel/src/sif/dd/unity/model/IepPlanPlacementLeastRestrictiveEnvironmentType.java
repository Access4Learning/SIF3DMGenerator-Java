
package sif.dd.unity.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPlacementLeastRestrictiveEnvironmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPlacementLeastRestrictiveEnvironmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalMinutesPerWeek" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="inclusionMinutesPerWeek" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="nonInclusionMinutesPerWeek" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPlacementLeastRestrictiveEnvironmentType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "totalMinutesPerWeek",
    "inclusionMinutesPerWeek",
    "nonInclusionMinutesPerWeek"
})
public class IepPlanPlacementLeastRestrictiveEnvironmentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigInteger totalMinutesPerWeek;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigInteger inclusionMinutesPerWeek;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigInteger nonInclusionMinutesPerWeek;

    /**
     * Gets the value of the totalMinutesPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMinutesPerWeek() {
        return totalMinutesPerWeek;
    }

    /**
     * Sets the value of the totalMinutesPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMinutesPerWeek(BigInteger value) {
        this.totalMinutesPerWeek = value;
    }

    /**
     * Gets the value of the inclusionMinutesPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInclusionMinutesPerWeek() {
        return inclusionMinutesPerWeek;
    }

    /**
     * Sets the value of the inclusionMinutesPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInclusionMinutesPerWeek(BigInteger value) {
        this.inclusionMinutesPerWeek = value;
    }

    /**
     * Gets the value of the nonInclusionMinutesPerWeek property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonInclusionMinutesPerWeek() {
        return nonInclusionMinutesPerWeek;
    }

    /**
     * Sets the value of the nonInclusionMinutesPerWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonInclusionMinutesPerWeek(BigInteger value) {
        this.nonInclusionMinutesPerWeek = value;
    }

}
