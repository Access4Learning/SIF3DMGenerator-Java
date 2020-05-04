
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ApplicableLawType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApplicableLawType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ApplicableCountry" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ApplicableLawName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ApplicableLawURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ApplicableLawType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "applicableCountry",
    "applicableLawName",
    "applicableLawURL"
})
public class ApplicableLawType {

    @XmlElement(name = "ApplicableCountry", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String applicableCountry;
    @XmlElement(name = "ApplicableLawName", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String applicableLawName;
    @XmlElementRef(name = "ApplicableLawURL", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> applicableLawURL;

    /**
     * Gets the value of the applicableCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableCountry() {
        return applicableCountry;
    }

    /**
     * Sets the value of the applicableCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableCountry(String value) {
        this.applicableCountry = value;
    }

    /**
     * Gets the value of the applicableLawName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableLawName() {
        return applicableLawName;
    }

    /**
     * Sets the value of the applicableLawName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableLawName(String value) {
        this.applicableLawName = value;
    }

    /**
     * Gets the value of the applicableLawURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getApplicableLawURL() {
        return applicableLawURL;
    }

    /**
     * Sets the value of the applicableLawURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setApplicableLawURL(JAXBElement<String> value) {
        this.applicableLawURL = value;
    }

}
