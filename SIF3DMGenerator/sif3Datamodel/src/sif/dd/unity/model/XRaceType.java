
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xRaceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xRaceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="race" type="{http://www.sifassociation.org/datamodel/na/4.x}xRaceTypeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xRaceType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "race"
})
public class XRaceType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected XRaceTypeType race;

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link XRaceTypeType }
     *     
     */
    public XRaceTypeType getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link XRaceTypeType }
     *     
     */
    public void setRace(XRaceTypeType value) {
        this.race = value;
    }

}
