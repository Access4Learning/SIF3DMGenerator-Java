
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepEligibilityIdeaDisabilitySpecificLearningDisabilityDecisionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepEligibilityIdeaDisabilitySpecificLearningDisabilityDecisionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="severeDiscrepancyFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="InsufficientResponseToInterventionFound" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="eligibleForSpecificLearningDisabilityFinding" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepEligibilityIdeaDisabilitySpecificLearningDisabilityDecisionsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "severeDiscrepancyFound",
    "insufficientResponseToInterventionFound",
    "eligibleForSpecificLearningDisabilityFinding"
})
public class IepEligibilityIdeaDisabilitySpecificLearningDisabilityDecisionsType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean severeDiscrepancyFound;
    @XmlElement(name = "InsufficientResponseToInterventionFound", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean insufficientResponseToInterventionFound;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected Boolean eligibleForSpecificLearningDisabilityFinding;

    /**
     * Gets the value of the severeDiscrepancyFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSevereDiscrepancyFound() {
        return severeDiscrepancyFound;
    }

    /**
     * Sets the value of the severeDiscrepancyFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSevereDiscrepancyFound(Boolean value) {
        this.severeDiscrepancyFound = value;
    }

    /**
     * Gets the value of the insufficientResponseToInterventionFound property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInsufficientResponseToInterventionFound() {
        return insufficientResponseToInterventionFound;
    }

    /**
     * Sets the value of the insufficientResponseToInterventionFound property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInsufficientResponseToInterventionFound(Boolean value) {
        this.insufficientResponseToInterventionFound = value;
    }

    /**
     * Gets the value of the eligibleForSpecificLearningDisabilityFinding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEligibleForSpecificLearningDisabilityFinding() {
        return eligibleForSpecificLearningDisabilityFinding;
    }

    /**
     * Sets the value of the eligibleForSpecificLearningDisabilityFinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEligibleForSpecificLearningDisabilityFinding(Boolean value) {
        this.eligibleForSpecificLearningDisabilityFinding = value;
    }

}
