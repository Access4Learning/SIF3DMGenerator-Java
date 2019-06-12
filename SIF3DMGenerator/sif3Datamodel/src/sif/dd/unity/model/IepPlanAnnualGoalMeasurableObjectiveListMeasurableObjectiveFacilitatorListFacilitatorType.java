
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identity" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorIdentityType" minOccurs="0"/>
 *         &lt;element name="contribution" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "identity",
    "contribution"
})
public class IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorIdentityType identity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String contribution;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorIdentityType }
     *     
     */
    public IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorIdentityType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorIdentityType }
     *     
     */
    public void setIdentity(IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListFacilitatorIdentityType value) {
        this.identity = value;
    }

    /**
     * Gets the value of the contribution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContribution() {
        return contribution;
    }

    /**
     * Sets the value of the contribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContribution(String value) {
        this.contribution = value;
    }

}
