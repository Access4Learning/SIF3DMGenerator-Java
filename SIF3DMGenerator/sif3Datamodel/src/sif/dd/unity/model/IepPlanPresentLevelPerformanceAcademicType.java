
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPresentLevelPerformanceAcademicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformanceAcademicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deficitList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceAcademicDeficitListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="summary" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceAcademicSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformanceAcademicType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "deficitList",
    "summary"
})
public class IepPlanPresentLevelPerformanceAcademicType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformanceAcademicDeficitListType> deficitList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformanceAcademicSummaryType> summary;

    /**
     * Gets the value of the deficitList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deficitList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeficitList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformanceAcademicDeficitListType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformanceAcademicDeficitListType> getDeficitList() {
        if (deficitList == null) {
            deficitList = new ArrayList<IepPlanPresentLevelPerformanceAcademicDeficitListType>();
        }
        return this.deficitList;
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
     * {@link IepPlanPresentLevelPerformanceAcademicSummaryType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformanceAcademicSummaryType> getSummary() {
        if (summary == null) {
            summary = new ArrayList<IepPlanPresentLevelPerformanceAcademicSummaryType>();
        }
        return this.summary;
    }

}
