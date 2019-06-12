
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepPlanPlacementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPlacementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="environmentForSchoolAge" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEnvironmentForSchoolAgeType" minOccurs="0"/>
 *         &lt;element name="environmentForEarlyChildhood" type="{http://www.sifassociation.org/datamodel/na/4.x}iepEnvironmentForEarlyChildhoodType" minOccurs="0"/>
 *         &lt;element name="placementRationale" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="scheduleModification" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPlacementScheduleModificationType" minOccurs="0"/>
 *         &lt;element name="transportation" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPlacementTransportationType" minOccurs="0"/>
 *         &lt;element name="leastRestrictiveEnvironment" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPlacementLeastRestrictiveEnvironmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPlacementType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "environmentForSchoolAge",
    "environmentForEarlyChildhood",
    "placementRationale",
    "scheduleModification",
    "transportation",
    "leastRestrictiveEnvironment"
})
public class IepPlanPlacementType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEnvironmentForSchoolAgeType environmentForSchoolAge;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepEnvironmentForEarlyChildhoodType environmentForEarlyChildhood;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String placementRationale;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPlacementScheduleModificationType scheduleModification;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPlacementTransportationType transportation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPlacementLeastRestrictiveEnvironmentType leastRestrictiveEnvironment;

    /**
     * Gets the value of the environmentForSchoolAge property.
     * 
     * @return
     *     possible object is
     *     {@link IepEnvironmentForSchoolAgeType }
     *     
     */
    public IepEnvironmentForSchoolAgeType getEnvironmentForSchoolAge() {
        return environmentForSchoolAge;
    }

    /**
     * Sets the value of the environmentForSchoolAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEnvironmentForSchoolAgeType }
     *     
     */
    public void setEnvironmentForSchoolAge(IepEnvironmentForSchoolAgeType value) {
        this.environmentForSchoolAge = value;
    }

    /**
     * Gets the value of the environmentForEarlyChildhood property.
     * 
     * @return
     *     possible object is
     *     {@link IepEnvironmentForEarlyChildhoodType }
     *     
     */
    public IepEnvironmentForEarlyChildhoodType getEnvironmentForEarlyChildhood() {
        return environmentForEarlyChildhood;
    }

    /**
     * Sets the value of the environmentForEarlyChildhood property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepEnvironmentForEarlyChildhoodType }
     *     
     */
    public void setEnvironmentForEarlyChildhood(IepEnvironmentForEarlyChildhoodType value) {
        this.environmentForEarlyChildhood = value;
    }

    /**
     * Gets the value of the placementRationale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacementRationale() {
        return placementRationale;
    }

    /**
     * Sets the value of the placementRationale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacementRationale(String value) {
        this.placementRationale = value;
    }

    /**
     * Gets the value of the scheduleModification property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPlacementScheduleModificationType }
     *     
     */
    public IepPlanPlacementScheduleModificationType getScheduleModification() {
        return scheduleModification;
    }

    /**
     * Sets the value of the scheduleModification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPlacementScheduleModificationType }
     *     
     */
    public void setScheduleModification(IepPlanPlacementScheduleModificationType value) {
        this.scheduleModification = value;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPlacementTransportationType }
     *     
     */
    public IepPlanPlacementTransportationType getTransportation() {
        return transportation;
    }

    /**
     * Sets the value of the transportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPlacementTransportationType }
     *     
     */
    public void setTransportation(IepPlanPlacementTransportationType value) {
        this.transportation = value;
    }

    /**
     * Gets the value of the leastRestrictiveEnvironment property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPlacementLeastRestrictiveEnvironmentType }
     *     
     */
    public IepPlanPlacementLeastRestrictiveEnvironmentType getLeastRestrictiveEnvironment() {
        return leastRestrictiveEnvironment;
    }

    /**
     * Sets the value of the leastRestrictiveEnvironment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPlacementLeastRestrictiveEnvironmentType }
     *     
     */
    public void setLeastRestrictiveEnvironment(IepPlanPlacementLeastRestrictiveEnvironmentType value) {
        this.leastRestrictiveEnvironment = value;
    }

}
