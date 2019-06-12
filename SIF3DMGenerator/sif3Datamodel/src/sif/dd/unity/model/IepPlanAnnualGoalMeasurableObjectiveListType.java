
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAnnualGoalMeasurableObjectiveListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalMeasurableObjectiveListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="measurableObjective" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalMeasurableObjectiveListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "measurableObjective"
})
public class IepPlanAnnualGoalMeasurableObjectiveListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveType measurableObjective;

    /**
     * Gets the value of the measurableObjective property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveType }
     *     
     */
    public IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveType getMeasurableObjective() {
        return measurableObjective;
    }

    /**
     * Sets the value of the measurableObjective property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveType }
     *     
     */
    public void setMeasurableObjective(IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveType value) {
        this.measurableObjective = value;
    }

}
