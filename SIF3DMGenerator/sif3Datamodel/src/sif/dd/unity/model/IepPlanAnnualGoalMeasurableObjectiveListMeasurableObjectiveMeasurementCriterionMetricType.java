
package sif.dd.unity.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementCriterionMetricType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementCriterionMetricType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accuracyPercentEvaluation" type="{http://www.sifassociation.org/datamodel/na/4.x}accuracyPercentEvaluationSimpleType" minOccurs="0"/>
 *         &lt;element name="trialCountEvaluation" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalMeasurableObjectiveMeasurementCriterionMetricTrialCountEvaluationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherEvaluation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementCriterionMetricType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "accuracyPercentEvaluation",
    "trialCountEvaluation",
    "otherEvaluation"
})
public class IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementCriterionMetricType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal accuracyPercentEvaluation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalMeasurableObjectiveMeasurementCriterionMetricTrialCountEvaluationType> trialCountEvaluation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String otherEvaluation;

    /**
     * Gets the value of the accuracyPercentEvaluation property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAccuracyPercentEvaluation() {
        return accuracyPercentEvaluation;
    }

    /**
     * Sets the value of the accuracyPercentEvaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAccuracyPercentEvaluation(BigDecimal value) {
        this.accuracyPercentEvaluation = value;
    }

    /**
     * Gets the value of the trialCountEvaluation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trialCountEvaluation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrialCountEvaluation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalMeasurableObjectiveMeasurementCriterionMetricTrialCountEvaluationType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalMeasurableObjectiveMeasurementCriterionMetricTrialCountEvaluationType> getTrialCountEvaluation() {
        if (trialCountEvaluation == null) {
            trialCountEvaluation = new ArrayList<IepPlanAnnualGoalMeasurableObjectiveMeasurementCriterionMetricTrialCountEvaluationType>();
        }
        return this.trialCountEvaluation;
    }

    /**
     * Gets the value of the otherEvaluation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherEvaluation() {
        return otherEvaluation;
    }

    /**
     * Sets the value of the otherEvaluation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherEvaluation(String value) {
        this.otherEvaluation = value;
    }

}
