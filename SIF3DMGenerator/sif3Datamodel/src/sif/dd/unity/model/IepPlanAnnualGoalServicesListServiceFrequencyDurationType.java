
package sif.dd.unity.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAnnualGoalServicesListServiceFrequencyDurationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalServicesListServiceFrequencyDurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="directMinutes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="indirectMinutes" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalServicesListServiceFrequencyDurationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "directMinutes",
    "indirectMinutes"
})
public class IepPlanAnnualGoalServicesListServiceFrequencyDurationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigInteger directMinutes;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigInteger indirectMinutes;

    /**
     * Gets the value of the directMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDirectMinutes() {
        return directMinutes;
    }

    /**
     * Sets the value of the directMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDirectMinutes(BigInteger value) {
        this.directMinutes = value;
    }

    /**
     * Gets the value of the indirectMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIndirectMinutes() {
        return indirectMinutes;
    }

    /**
     * Sets the value of the indirectMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIndirectMinutes(BigInteger value) {
        this.indirectMinutes = value;
    }

}
