
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAnnualGoalServicesListServiceFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAnnualGoalServicesListServiceFrequencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cycle" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalServicesListServiceFrequencyCycleType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAnnualGoalServicesListServiceFrequencyDurationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAnnualGoalServicesListServiceFrequencyType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "cycle",
    "duration"
})
public class IepPlanAnnualGoalServicesListServiceFrequencyType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalServicesListServiceFrequencyCycleType> cycle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanAnnualGoalServicesListServiceFrequencyDurationType> duration;

    /**
     * Gets the value of the cycle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cycle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCycle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalServicesListServiceFrequencyCycleType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalServicesListServiceFrequencyCycleType> getCycle() {
        if (cycle == null) {
            cycle = new ArrayList<IepPlanAnnualGoalServicesListServiceFrequencyCycleType>();
        }
        return this.cycle;
    }

    /**
     * Gets the value of the duration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the duration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanAnnualGoalServicesListServiceFrequencyDurationType }
     * 
     * 
     */
    public List<IepPlanAnnualGoalServicesListServiceFrequencyDurationType> getDuration() {
        if (duration == null) {
            duration = new ArrayList<IepPlanAnnualGoalServicesListServiceFrequencyDurationType>();
        }
        return this.duration;
    }

}
