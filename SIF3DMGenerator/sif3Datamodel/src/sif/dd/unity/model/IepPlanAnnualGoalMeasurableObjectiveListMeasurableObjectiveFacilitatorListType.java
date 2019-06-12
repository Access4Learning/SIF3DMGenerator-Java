
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facilitator" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "facilitator"
})
public class IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorType facilitator;

    /**
     * Gets the value of the facilitator property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorType }
     *     
     */
    public IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorType getFacilitator() {
        return facilitator;
    }

    /**
     * Sets the value of the facilitator property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorType }
     *     
     */
    public void setFacilitator(IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorType value) {
        this.facilitator = value;
    }

}
