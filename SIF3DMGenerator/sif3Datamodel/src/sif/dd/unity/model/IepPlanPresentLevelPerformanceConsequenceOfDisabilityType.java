
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
 * <p>Java class for iepPlanPresentLevelPerformanceConsequenceOfDisabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformanceConsequenceOfDisabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curriculum" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="specialCategoryList" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformanceConsequenceOfDisabilityType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "curriculum",
    "specialCategoryList"
})
public class IepPlanPresentLevelPerformanceConsequenceOfDisabilityType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String curriculum;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListType> specialCategoryList;

    /**
     * Gets the value of the curriculum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurriculum() {
        return curriculum;
    }

    /**
     * Sets the value of the curriculum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurriculum(String value) {
        this.curriculum = value;
    }

    /**
     * Gets the value of the specialCategoryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialCategoryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialCategoryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListType }
     * 
     * 
     */
    public List<IepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListType> getSpecialCategoryList() {
        if (specialCategoryList == null) {
            specialCategoryList = new ArrayList<IepPlanPresentLevelPerformanceConsequenceOfDisabilitySpecialCategoryListType>();
        }
        return this.specialCategoryList;
    }

}
