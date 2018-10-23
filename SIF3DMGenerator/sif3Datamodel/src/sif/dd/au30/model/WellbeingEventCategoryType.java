
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * Category of event.
 * 
 * <p>Java class for WellbeingEventCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingEventCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EventCategory">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsEventCategoryType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WellbeingEventSubCategoryList" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingEventSubCategoryListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WellbeingEventCategoryType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "eventCategory",
    "wellbeingEventSubCategoryList"
})
public class WellbeingEventCategoryType {

    @XmlElement(name = "EventCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected String eventCategory;
    @XmlElementRef(name = "WellbeingEventSubCategoryList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<WellbeingEventSubCategoryListType> wellbeingEventSubCategoryList;

    /**
     * Gets the value of the eventCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventCategory() {
        return eventCategory;
    }

    /**
     * Sets the value of the eventCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventCategory(String value) {
        this.eventCategory = value;
    }

    /**
     * Gets the value of the wellbeingEventSubCategoryList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WellbeingEventSubCategoryListType }{@code >}
     *     
     */
    public JAXBElement<WellbeingEventSubCategoryListType> getWellbeingEventSubCategoryList() {
        return wellbeingEventSubCategoryList;
    }

    /**
     * Sets the value of the wellbeingEventSubCategoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WellbeingEventSubCategoryListType }{@code >}
     *     
     */
    public void setWellbeingEventSubCategoryList(JAXBElement<WellbeingEventSubCategoryListType> value) {
        this.wellbeingEventSubCategoryList = value;
    }

}
