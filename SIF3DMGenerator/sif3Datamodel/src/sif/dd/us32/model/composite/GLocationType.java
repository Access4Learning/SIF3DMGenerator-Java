
package sif.dd.us32.model.composite;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A single point in space or place.
 * 
 * <p>Java class for gLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gLocationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gPlaceType">
 *       &lt;sequence>
 *         &lt;element name="gridLocation" type="{http://www.sifassociation.org/datamodel/na/3.2}gGridLocationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gLocationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "gridLocation"
})
@XmlSeeAlso({
    GAddressType.class
})
public class GLocationType
    extends GPlaceType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GGridLocationType gridLocation;

    /**
     * Gets the value of the gridLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GGridLocationType }
     *     
     */
    public GGridLocationType getGridLocation() {
        return gridLocation;
    }

    /**
     * Sets the value of the gridLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGridLocationType }
     *     
     */
    public void setGridLocation(GGridLocationType value) {
        this.gridLocation = value;
    }

}
