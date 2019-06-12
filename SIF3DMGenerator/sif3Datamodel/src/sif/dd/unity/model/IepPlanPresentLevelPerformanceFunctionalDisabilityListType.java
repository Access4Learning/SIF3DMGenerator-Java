
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPresentLevelPerformanceFunctionalDisabilityListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformanceFunctionalDisabilityListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disability" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceFunctionalDisabilityListDisabilityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformanceFunctionalDisabilityListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "disability"
})
public class IepPlanPresentLevelPerformanceFunctionalDisabilityListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPresentLevelPerformanceFunctionalDisabilityListDisabilityType disability;

    /**
     * Gets the value of the disability property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPresentLevelPerformanceFunctionalDisabilityListDisabilityType }
     *     
     */
    public IepPlanPresentLevelPerformanceFunctionalDisabilityListDisabilityType getDisability() {
        return disability;
    }

    /**
     * Sets the value of the disability property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPresentLevelPerformanceFunctionalDisabilityListDisabilityType }
     *     
     */
    public void setDisability(IepPlanPresentLevelPerformanceFunctionalDisabilityListDisabilityType value) {
        this.disability = value;
    }

}
