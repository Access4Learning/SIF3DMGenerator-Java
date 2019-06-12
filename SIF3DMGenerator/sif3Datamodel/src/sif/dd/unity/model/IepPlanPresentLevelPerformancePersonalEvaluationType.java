
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPresentLevelPerformancePersonalEvaluationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformancePersonalEvaluationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="needsList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformancePersonalEvaluationNeedsListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="performance" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformancePersonalEvaluationPerformanceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="personalGoalsList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformancePersonalEvaluationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "needsList",
    "performance",
    "personalGoalsList"
})
public class IepPlanPresentLevelPerformancePersonalEvaluationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformancePersonalEvaluationNeedsListType> needsList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformancePersonalEvaluationPerformanceType> performance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListType> personalGoalsList;

    /**
     * Gets the value of the needsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the needsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeedsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformancePersonalEvaluationNeedsListType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformancePersonalEvaluationNeedsListType> getNeedsList() {
        if (needsList == null) {
            needsList = new ArrayList<IepPlanPresentLevelPerformancePersonalEvaluationNeedsListType>();
        }
        return this.needsList;
    }

    /**
     * Gets the value of the performance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the performance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPerformance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformancePersonalEvaluationPerformanceType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformancePersonalEvaluationPerformanceType> getPerformance() {
        if (performance == null) {
            performance = new ArrayList<IepPlanPresentLevelPerformancePersonalEvaluationPerformanceType>();
        }
        return this.performance;
    }

    /**
     * Gets the value of the personalGoalsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personalGoalsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonalGoalsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListType> getPersonalGoalsList() {
        if (personalGoalsList == null) {
            personalGoalsList = new ArrayList<IepPlanPresentLevelPerformancePersonalEvaluationPersonalGoalsListType>();
        }
        return this.personalGoalsList;
    }

}
