
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AdditionalGraduationRequirementPerformanceHistoryListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalGraduationRequirementPerformanceHistoryListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Requirement" type="{http://www.sifassociation.org/datamodel/na/4.x}AdditionalGraduationRequirementPerformanceHistoryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalGraduationRequirementPerformanceHistoryListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "requirement"
})
public class AdditionalGraduationRequirementPerformanceHistoryListType {

    @XmlElement(name = "Requirement", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<AdditionalGraduationRequirementPerformanceHistoryType> requirement;

    /**
     * Gets the value of the requirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalGraduationRequirementPerformanceHistoryType }
     * 
     * 
     */
    public List<AdditionalGraduationRequirementPerformanceHistoryType> getRequirement() {
        if (requirement == null) {
            requirement = new ArrayList<AdditionalGraduationRequirementPerformanceHistoryType>();
        }
        return this.requirement;
    }

}
