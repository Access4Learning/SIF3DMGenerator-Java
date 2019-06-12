
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPresentLevelPerformanceFunctionalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformanceFunctionalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="disabilityList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceFunctionalDisabilityListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceFunctionalSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformanceFunctionalType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "disabilityList",
    "summary"
})
public class IepPlanPresentLevelPerformanceFunctionalType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformanceFunctionalDisabilityListType> disabilityList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformanceFunctionalSummaryType> summary;

    /**
     * Gets the value of the disabilityList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disabilityList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisabilityList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformanceFunctionalDisabilityListType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformanceFunctionalDisabilityListType> getDisabilityList() {
        if (disabilityList == null) {
            disabilityList = new ArrayList<IepPlanPresentLevelPerformanceFunctionalDisabilityListType>();
        }
        return this.disabilityList;
    }

    /**
     * Gets the value of the summary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformanceFunctionalSummaryType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformanceFunctionalSummaryType> getSummary() {
        if (summary == null) {
            summary = new ArrayList<IepPlanPresentLevelPerformanceFunctionalSummaryType>();
        }
        return this.summary;
    }

}
