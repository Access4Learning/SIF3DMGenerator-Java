
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="criterion" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementCriterionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "criterion"
})
public class IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementCriterionType criterion;

    /**
     * Gets the value of the criterion property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementCriterionType }
     *     
     */
    public IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementCriterionType getCriterion() {
        return criterion;
    }

    /**
     * Sets the value of the criterion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementCriterionType }
     *     
     */
    public void setCriterion(IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementCriterionType value) {
        this.criterion = value;
    }

}
