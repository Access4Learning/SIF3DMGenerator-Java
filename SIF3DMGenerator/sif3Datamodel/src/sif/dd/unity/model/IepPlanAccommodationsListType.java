
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanAccommodationsListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanAccommodationsListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accommodation" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanAccommodationsListAccommodationType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanAccommodationsListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "accommodation"
})
public class IepPlanAccommodationsListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanAccommodationsListAccommodationType accommodation;

    /**
     * Gets the value of the accommodation property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanAccommodationsListAccommodationType }
     *     
     */
    public IepPlanAccommodationsListAccommodationType getAccommodation() {
        return accommodation;
    }

    /**
     * Sets the value of the accommodation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanAccommodationsListAccommodationType }
     *     
     */
    public void setAccommodation(IepPlanAccommodationsListAccommodationType value) {
        this.accommodation = value;
    }

}
