
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPresentLevelPerformanceAcademicDeficitListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPresentLevelPerformanceAcademicDeficitListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deficit" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPresentLevelPerformanceAcademicDeficitListDeficitType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPresentLevelPerformanceAcademicDeficitListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "deficit"
})
public class IepPlanPresentLevelPerformanceAcademicDeficitListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPresentLevelPerformanceAcademicDeficitListDeficitType deficit;

    /**
     * Gets the value of the deficit property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPresentLevelPerformanceAcademicDeficitListDeficitType }
     *     
     */
    public IepPlanPresentLevelPerformanceAcademicDeficitListDeficitType getDeficit() {
        return deficit;
    }

    /**
     * Sets the value of the deficit property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPresentLevelPerformanceAcademicDeficitListDeficitType }
     *     
     */
    public void setDeficit(IepPlanPresentLevelPerformanceAcademicDeficitListDeficitType value) {
        this.deficit = value;
    }

}
