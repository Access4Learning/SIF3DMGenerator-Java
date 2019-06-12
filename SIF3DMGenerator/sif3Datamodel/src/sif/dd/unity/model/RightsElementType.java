
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RightsElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RightsElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="FeesForUse" type="{http://www.sifassociation.org/datamodel/na/4.x}FeesForUseType" minOccurs="0"/>
 *         &lt;element name="CopyrightStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TermsOfUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RightsElementType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "cost",
    "feesForUse",
    "copyrightStatement",
    "termsOfUse"
})
public class RightsElementType {

    @XmlElement(name = "Cost", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean cost;
    @XmlElement(name = "FeesForUse", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected FeesForUseType feesForUse;
    @XmlElement(name = "CopyrightStatement", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String copyrightStatement;
    @XmlElement(name = "TermsOfUse", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String termsOfUse;

    /**
     * Gets the value of the cost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCost() {
        return cost;
    }

    /**
     * Sets the value of the cost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCost(Boolean value) {
        this.cost = value;
    }

    /**
     * Gets the value of the feesForUse property.
     * 
     * @return
     *     possible object is
     *     {@link FeesForUseType }
     *     
     */
    public FeesForUseType getFeesForUse() {
        return feesForUse;
    }

    /**
     * Sets the value of the feesForUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeesForUseType }
     *     
     */
    public void setFeesForUse(FeesForUseType value) {
        this.feesForUse = value;
    }

    /**
     * Gets the value of the copyrightStatement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightStatement() {
        return copyrightStatement;
    }

    /**
     * Sets the value of the copyrightStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightStatement(String value) {
        this.copyrightStatement = value;
    }

    /**
     * Gets the value of the termsOfUse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermsOfUse() {
        return termsOfUse;
    }

    /**
     * Sets the value of the termsOfUse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermsOfUse(String value) {
        this.termsOfUse = value;
    }

}
