
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPlacementScheduleModificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPlacementScheduleModificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="schoolDay" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPlacementScheduleModificationSchoolDayType" minOccurs="0"/>
 *         &lt;element name="schoolYear" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPlacementScheduleModificationSchoolYearType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPlacementScheduleModificationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "schoolDay",
    "schoolYear"
})
public class IepPlanPlacementScheduleModificationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPlacementScheduleModificationSchoolDayType schoolDay;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPlacementScheduleModificationSchoolYearType schoolYear;

    /**
     * Gets the value of the schoolDay property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPlacementScheduleModificationSchoolDayType }
     *     
     */
    public IepPlanPlacementScheduleModificationSchoolDayType getSchoolDay() {
        return schoolDay;
    }

    /**
     * Sets the value of the schoolDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPlacementScheduleModificationSchoolDayType }
     *     
     */
    public void setSchoolDay(IepPlanPlacementScheduleModificationSchoolDayType value) {
        this.schoolDay = value;
    }

    /**
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPlacementScheduleModificationSchoolYearType }
     *     
     */
    public IepPlanPlacementScheduleModificationSchoolYearType getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPlacementScheduleModificationSchoolYearType }
     *     
     */
    public void setSchoolYear(IepPlanPlacementScheduleModificationSchoolYearType value) {
        this.schoolYear = value;
    }

}
