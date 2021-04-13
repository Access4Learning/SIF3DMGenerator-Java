
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchoolTravelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolTravelType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelMode" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsTravelModeType" minOccurs="0"/>
 *         &lt;element name="TravelDetails" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TravelAccompaniment" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsAccompanimentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolTravelType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "travelMode",
    "travelDetails",
    "travelAccompaniment"
})
public class SchoolTravelType {

    @XmlElementRef(name = "TravelMode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsTravelModeType> travelMode;
    @XmlElementRef(name = "TravelDetails", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> travelDetails;
    @XmlElementRef(name = "TravelAccompaniment", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsAccompanimentType> travelAccompaniment;

    /**
     * Gets the value of the travelMode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsTravelModeType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsTravelModeType> getTravelMode() {
        return travelMode;
    }

    /**
     * Sets the value of the travelMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsTravelModeType }{@code >}
     *     
     */
    public void setTravelMode(JAXBElement<AUCodeSetsTravelModeType> value) {
        this.travelMode = value;
    }

    /**
     * Gets the value of the travelDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTravelDetails() {
        return travelDetails;
    }

    /**
     * Sets the value of the travelDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTravelDetails(JAXBElement<String> value) {
        this.travelDetails = value;
    }

    /**
     * Gets the value of the travelAccompaniment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsAccompanimentType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsAccompanimentType> getTravelAccompaniment() {
        return travelAccompaniment;
    }

    /**
     * Sets the value of the travelAccompaniment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsAccompanimentType }{@code >}
     *     
     */
    public void setTravelAccompaniment(JAXBElement<AUCodeSetsAccompanimentType> value) {
        this.travelAccompaniment = value;
    }

}
