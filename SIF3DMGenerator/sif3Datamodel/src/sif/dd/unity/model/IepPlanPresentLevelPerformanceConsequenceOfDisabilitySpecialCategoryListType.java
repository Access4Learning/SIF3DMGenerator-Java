
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="specialCategory" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListSpecialCategoryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "specialCategory"
})
public class IepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListSpecialCategoryType specialCategory;

    /**
     * Gets the value of the specialCategory property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListSpecialCategoryType }
     *     
     */
    public IepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListSpecialCategoryType getSpecialCategory() {
        return specialCategory;
    }

    /**
     * Sets the value of the specialCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListSpecialCategoryType }
     *     
     */
    public void setSpecialCategory(IepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListSpecialCategoryType value) {
        this.specialCategory = value;
    }

}
