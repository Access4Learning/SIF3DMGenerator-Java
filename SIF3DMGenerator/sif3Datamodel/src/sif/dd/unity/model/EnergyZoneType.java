
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnergyZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyZoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://www.sifassociation.org/datamodel/na/4.x}EnergyZoneTypeType"/>
 *         &lt;element name="EnergyZoneName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TagList" type="{http://www.sifassociation.org/datamodel/na/4.x}EnergyZoneTagListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyZoneType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "type",
    "energyZoneName",
    "tagList"
})
public class EnergyZoneType {

    @XmlElement(name = "Type", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected EnergyZoneTypeType type;
    @XmlElement(name = "EnergyZoneName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected String energyZoneName;
    @XmlElement(name = "TagList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EnergyZoneTagListType tagList;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyZoneTypeType }
     *     
     */
    public EnergyZoneTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyZoneTypeType }
     *     
     */
    public void setType(EnergyZoneTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the energyZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnergyZoneName() {
        return energyZoneName;
    }

    /**
     * Sets the value of the energyZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnergyZoneName(String value) {
        this.energyZoneName = value;
    }

    /**
     * Gets the value of the tagList property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyZoneTagListType }
     *     
     */
    public EnergyZoneTagListType getTagList() {
        return tagList;
    }

    /**
     * Sets the value of the tagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyZoneTagListType }
     *     
     */
    public void setTagList(EnergyZoneTagListType value) {
        this.tagList = value;
    }

}
