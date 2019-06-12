
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepEligibilityIdeaDisabilityDecisionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityIdeaDisabilityDecisionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specificDisabilityIdentified" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="adverseEffectIdentified" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="eligible" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEligibleType" minOccurs="0"/>
 *         &lt;element name="identity" type="{http://www.sifassociation.org/datamodel/na/4.x}iepCommonAuthorizingPersonType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityIdeaDisabilityDecisionsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "specificDisabilityIdentified",
    "adverseEffectIdentified",
    "eligible",
    "identity"
})
public class IepEligibilityIdeaDisabilityDecisionsType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean specificDisabilityIdentified;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String adverseEffectIdentified;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEligibleType eligible;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepCommonAuthorizingPersonType identity;

    /**
     * Gets the value of the specificDisabilityIdentified property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecificDisabilityIdentified() {
        return specificDisabilityIdentified;
    }

    /**
     * Sets the value of the specificDisabilityIdentified property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecificDisabilityIdentified(Boolean value) {
        this.specificDisabilityIdentified = value;
    }

    /**
     * Gets the value of the adverseEffectIdentified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdverseEffectIdentified() {
        return adverseEffectIdentified;
    }

    /**
     * Sets the value of the adverseEffectIdentified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdverseEffectIdentified(String value) {
        this.adverseEffectIdentified = value;
    }

    /**
     * Gets the value of the eligible property.
     * 
     * @return
     *     possible object is
     *     {@link IepEligibleType }
     *     
     */
    public IepEligibleType getEligible() {
        return eligible;
    }

    /**
     * Sets the value of the eligible property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEligibleType }
     *     
     */
    public void setEligible(IepEligibleType value) {
        this.eligible = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link IepCommonAuthorizingPersonType }
     *     
     */
    public IepCommonAuthorizingPersonType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepCommonAuthorizingPersonType }
     *     
     */
    public void setIdentity(IepCommonAuthorizingPersonType value) {
        this.identity = value;
    }

}
