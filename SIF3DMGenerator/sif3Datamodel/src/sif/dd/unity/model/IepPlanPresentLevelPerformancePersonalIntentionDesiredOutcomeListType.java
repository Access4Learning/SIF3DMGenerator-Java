
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPresentLevelPerformancePersonalIntentionDesiredOutcomeListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformancePersonalIntentionDesiredOutcomeListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="desiredOutcome" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformancePersonalIntentionDesiredOutcomeListDesiredOutcomeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformancePersonalIntentionDesiredOutcomeListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "desiredOutcome"
})
public class IepPlanPresentLevelPerformancePersonalIntentionDesiredOutcomeListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPresentLevelPerformancePersonalIntentionDesiredOutcomeListDesiredOutcomeType desiredOutcome;

    /**
     * Gets the value of the desiredOutcome property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPresentLevelPerformancePersonalIntentionDesiredOutcomeListDesiredOutcomeType }
     *     
     */
    public IepPlanPresentLevelPerformancePersonalIntentionDesiredOutcomeListDesiredOutcomeType getDesiredOutcome() {
        return desiredOutcome;
    }

    /**
     * Sets the value of the desiredOutcome property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPresentLevelPerformancePersonalIntentionDesiredOutcomeListDesiredOutcomeType }
     *     
     */
    public void setDesiredOutcome(IepPlanPresentLevelPerformancePersonalIntentionDesiredOutcomeListDesiredOutcomeType value) {
        this.desiredOutcome = value;
    }

}
