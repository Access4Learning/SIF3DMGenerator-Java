
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personalGoal" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListPersonalGoalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "personalGoal"
})
public class IepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListPersonalGoalType personalGoal;

    /**
     * Gets the value of the personalGoal property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListPersonalGoalType }
     *     
     */
    public IepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListPersonalGoalType getPersonalGoal() {
        return personalGoal;
    }

    /**
     * Sets the value of the personalGoal property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListPersonalGoalType }
     *     
     */
    public void setPersonalGoal(IepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListPersonalGoalType value) {
        this.personalGoal = value;
    }

}
