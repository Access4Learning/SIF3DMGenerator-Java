
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for VisaSubClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VisaSubClassType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.sifassociation.org/datamodel/au/3.4}VisaSubClassCodeType"/>
 *         &lt;element name="VisaExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ATEExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ATEStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="VisaStatisticalCode" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisaSubClassType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "code",
    "visaExpiryDate",
    "ateExpiryDate",
    "ateStartDate",
    "visaStatisticalCode"
})
public class VisaSubClassType {

    @XmlElement(name = "Code", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected String code;
    @XmlElementRef(name = "VisaExpiryDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> visaExpiryDate;
    @XmlElementRef(name = "ATEExpiryDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> ateExpiryDate;
    @XmlElementRef(name = "ATEStartDate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> ateStartDate;
    @XmlElementRef(name = "VisaStatisticalCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> visaStatisticalCode;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the visaExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getVisaExpiryDate() {
        return visaExpiryDate;
    }

    /**
     * Sets the value of the visaExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setVisaExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.visaExpiryDate = value;
    }

    /**
     * Gets the value of the ateExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getATEExpiryDate() {
        return ateExpiryDate;
    }

    /**
     * Sets the value of the ateExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setATEExpiryDate(JAXBElement<XMLGregorianCalendar> value) {
        this.ateExpiryDate = value;
    }

    /**
     * Gets the value of the ateStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getATEStartDate() {
        return ateStartDate;
    }

    /**
     * Sets the value of the ateStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setATEStartDate(JAXBElement<XMLGregorianCalendar> value) {
        this.ateStartDate = value;
    }

    /**
     * Gets the value of the visaStatisticalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVisaStatisticalCode() {
        return visaStatisticalCode;
    }

    /**
     * Sets the value of the visaStatisticalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVisaStatisticalCode(JAXBElement<String> value) {
        this.visaStatisticalCode = value;
    }

}
