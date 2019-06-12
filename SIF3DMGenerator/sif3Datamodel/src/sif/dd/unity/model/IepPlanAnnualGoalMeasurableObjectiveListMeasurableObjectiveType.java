
package sif.dd.unity.model;

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
 * <p>Java class for iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identifier" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="facilitatorList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="measurement" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parentAcceptance" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalListParentAcceptanceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "identifier",
    "facilitatorList",
    "measurement",
    "parentAcceptance"
})
public class IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String identifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListType> facilitatorList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementType> measurement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAnnualGoalListParentAcceptanceType parentAcceptance;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the facilitatorList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilitatorList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilitatorList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListType> getFacilitatorList() {
        if (facilitatorList == null) {
            facilitatorList = new ArrayList<IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveFacilitatorListType>();
        }
        return this.facilitatorList;
    }

    /**
     * Gets the value of the measurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementType> getMeasurement() {
        if (measurement == null) {
            measurement = new ArrayList<IepPlanAnnualGoalMeasurableObjectiveListMeasurableObjectiveMeasurementType>();
        }
        return this.measurement;
    }

    /**
     * Gets the value of the parentAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAnnualGoalListParentAcceptanceType }
     *     
     */
    public IepPlanAnnualGoalListParentAcceptanceType getParentAcceptance() {
        return parentAcceptance;
    }

    /**
     * Sets the value of the parentAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAnnualGoalListParentAcceptanceType }
     *     
     */
    public void setParentAcceptance(IepPlanAnnualGoalListParentAcceptanceType value) {
        this.parentAcceptance = value;
    }

}
