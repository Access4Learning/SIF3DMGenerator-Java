
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAnnualGoalServicesListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalServicesListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="service" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalServicesListServiceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalServicesListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "service"
})
public class IepPlanAnnualGoalServicesListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalServicesListServiceType service;

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalServicesListServiceType }
     *     
     */
    public IepPlanAnnualGoalServicesListServiceType getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalServicesListServiceType }
     *     
     */
    public void setService(IepPlanAnnualGoalServicesListServiceType value) {
        this.service = value;
    }

}
