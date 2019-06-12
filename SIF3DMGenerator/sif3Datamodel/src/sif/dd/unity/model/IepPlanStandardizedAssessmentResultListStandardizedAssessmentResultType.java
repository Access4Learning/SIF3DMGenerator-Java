
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanStandardizedAssessmentResultListStandardizedAssessmentResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanStandardizedAssessmentResultListStandardizedAssessmentResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardsReference" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanStandardizedAssessmentResultListStandardizedAssessmentResultStandardsReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="accommodationList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanStandardizedAssessmentResultListStandardizedAssessmentResultType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "standardsReference",
    "accommodationList"
})
public class IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultStandardsReferenceType> standardsReference;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListType> accommodationList;

    /**
     * Gets the value of the standardsReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardsReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardsReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultStandardsReferenceType }
     * 
     * 
     */
    public List<IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultStandardsReferenceType> getStandardsReference() {
        if (standardsReference == null) {
            standardsReference = new ArrayList<IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultStandardsReferenceType>();
        }
        return this.standardsReference;
    }

    /**
     * Gets the value of the accommodationList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodationList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodationList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListType }
     * 
     * 
     */
    public List<IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListType> getAccommodationList() {
        if (accommodationList == null) {
            accommodationList = new ArrayList<IepPlanStandardizedAssessmentResultListStandardizedAssessmentResultAccommodationListType>();
        }
        return this.accommodationList;
    }

}
