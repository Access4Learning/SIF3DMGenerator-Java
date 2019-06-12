
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iepPlanPlacementTransportationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepPlanPlacementTransportationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outsideSchool" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPlacementTransportationOutsideSchoolType" minOccurs="0"/>
 *         &lt;element name="insideSchool" type="{http://www.sifassociation.org/datamodel/na/4.x}iepPlanPlacementTransportationInsideSchoolType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepPlanPlacementTransportationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "outsideSchool",
    "insideSchool"
})
public class IepPlanPlacementTransportationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPlacementTransportationOutsideSchoolType outsideSchool;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepPlanPlacementTransportationInsideSchoolType insideSchool;

    /**
     * Gets the value of the outsideSchool property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPlacementTransportationOutsideSchoolType }
     *     
     */
    public IepPlanPlacementTransportationOutsideSchoolType getOutsideSchool() {
        return outsideSchool;
    }

    /**
     * Sets the value of the outsideSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPlacementTransportationOutsideSchoolType }
     *     
     */
    public void setOutsideSchool(IepPlanPlacementTransportationOutsideSchoolType value) {
        this.outsideSchool = value;
    }

    /**
     * Gets the value of the insideSchool property.
     * 
     * @return
     *     possible object is
     *     {@link IepPlanPlacementTransportationInsideSchoolType }
     *     
     */
    public IepPlanPlacementTransportationInsideSchoolType getInsideSchool() {
        return insideSchool;
    }

    /**
     * Sets the value of the insideSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepPlanPlacementTransportationInsideSchoolType }
     *     
     */
    public void setInsideSchool(IepPlanPlacementTransportationInsideSchoolType value) {
        this.insideSchool = value;
    }

}
