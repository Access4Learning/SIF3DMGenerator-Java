
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyUsageLocationInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyUsageLocationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolId" type="{http://www.sifassociation.org/datamodel/na/4.x}URIOrBinaryType"/>
 *         &lt;element name="Building" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnergyZone" type="{http://www.sifassociation.org/datamodel/na/4.x}EnergyZoneType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyUsageLocationInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "schoolId",
    "building",
    "energyZone"
})
public class EnergyUsageLocationInfoType {

    @XmlElement(name = "SchoolId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected String schoolId;
    @XmlElement(name = "Building", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String building;
    @XmlElement(name = "EnergyZone", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EnergyZoneType energyZone;

    /**
     * Gets the value of the schoolId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolId() {
        return schoolId;
    }

    /**
     * Sets the value of the schoolId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolId(String value) {
        this.schoolId = value;
    }

    /**
     * Gets the value of the building property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Sets the value of the building property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuilding(String value) {
        this.building = value;
    }

    /**
     * Gets the value of the energyZone property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyZoneType }
     *     
     */
    public EnergyZoneType getEnergyZone() {
        return energyZone;
    }

    /**
     * Sets the value of the energyZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyZoneType }
     *     
     */
    public void setEnergyZone(EnergyZoneType value) {
        this.energyZone = value;
    }

}
