
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DetentionContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetentionContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DetentionCategory" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsDetentionCategoryType" minOccurs="0"/>
 *         &lt;element name="DetentionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="DetentionLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DetentionNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsWellbeingStatusType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetentionContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "detentionCategory",
    "detentionDate",
    "detentionLocation",
    "detentionNotes",
    "status"
})
public class DetentionContainerType {

    @XmlElement(name = "DetentionCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsDetentionCategoryType detentionCategory;
    @XmlElementRef(name = "DetentionDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> detentionDate;
    @XmlElementRef(name = "DetentionLocation", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detentionLocation;
    @XmlElementRef(name = "DetentionNotes", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detentionNotes;
    @XmlElementRef(name = "Status", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsWellbeingStatusType> status;

    /**
     * Gets the value of the detentionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsDetentionCategoryType }
     *     
     */
    public AUCodeSetsDetentionCategoryType getDetentionCategory() {
        return detentionCategory;
    }

    /**
     * Sets the value of the detentionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsDetentionCategoryType }
     *     
     */
    public void setDetentionCategory(AUCodeSetsDetentionCategoryType value) {
        this.detentionCategory = value;
    }

    /**
     * Gets the value of the detentionDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDetentionDate() {
        return detentionDate;
    }

    /**
     * Sets the value of the detentionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDetentionDate(JAXBElement<XMLGregorianCalendar> value) {
        this.detentionDate = value;
    }

    /**
     * Gets the value of the detentionLocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetentionLocation() {
        return detentionLocation;
    }

    /**
     * Sets the value of the detentionLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetentionLocation(JAXBElement<String> value) {
        this.detentionLocation = value;
    }

    /**
     * Gets the value of the detentionNotes property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetentionNotes() {
        return detentionNotes;
    }

    /**
     * Sets the value of the detentionNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetentionNotes(JAXBElement<String> value) {
        this.detentionNotes = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsWellbeingStatusType> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsWellbeingStatusType }{@code >}
     *     
     */
    public void setStatus(JAXBElement<AUCodeSetsWellbeingStatusType> value) {
        this.status = value;
    }

}
