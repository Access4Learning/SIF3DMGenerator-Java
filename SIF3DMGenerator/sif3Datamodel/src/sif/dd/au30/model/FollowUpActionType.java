
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FollowUpActionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FollowUpActionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WellbeingResponseRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="FollowUpDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FollowUpActionCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FollowUpActionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "wellbeingResponseRefId",
    "followUpDetails",
    "followUpActionCategory"
})
public class FollowUpActionType {

    @XmlElementRef(name = "WellbeingResponseRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> wellbeingResponseRefId;
    @XmlElementRef(name = "FollowUpDetails", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> followUpDetails;
    @XmlElementRef(name = "FollowUpActionCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> followUpActionCategory;

    /**
     * Gets the value of the wellbeingResponseRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWellbeingResponseRefId() {
        return wellbeingResponseRefId;
    }

    /**
     * Sets the value of the wellbeingResponseRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWellbeingResponseRefId(JAXBElement<String> value) {
        this.wellbeingResponseRefId = value;
    }

    /**
     * Gets the value of the followUpDetails property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFollowUpDetails() {
        return followUpDetails;
    }

    /**
     * Sets the value of the followUpDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFollowUpDetails(JAXBElement<String> value) {
        this.followUpDetails = value;
    }

    /**
     * Gets the value of the followUpActionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFollowUpActionCategory() {
        return followUpActionCategory;
    }

    /**
     * Sets the value of the followUpActionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFollowUpActionCategory(JAXBElement<String> value) {
        this.followUpActionCategory = value;
    }

}
