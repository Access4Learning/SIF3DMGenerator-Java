
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for iepTransmitPermissionPurposeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="iepTransmitPermissionPurposeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="standardPurpose" type="{http://www.sifassociation.org/datamodel/na/4.x}iepStandardPurposeType" minOccurs="0"/>
 *         &lt;element name="otherPurpose" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "iepTransmitPermissionPurposeType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "standardPurpose",
    "otherPurpose"
})
public class IepTransmitPermissionPurposeType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IepStandardPurposeType standardPurpose;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String otherPurpose;

    /**
     * Gets the value of the standardPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link IepStandardPurposeType }
     *     
     */
    public IepStandardPurposeType getStandardPurpose() {
        return standardPurpose;
    }

    /**
     * Sets the value of the standardPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link IepStandardPurposeType }
     *     
     */
    public void setStandardPurpose(IepStandardPurposeType value) {
        this.standardPurpose = value;
    }

    /**
     * Gets the value of the otherPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherPurpose() {
        return otherPurpose;
    }

    /**
     * Sets the value of the otherPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherPurpose(String value) {
        this.otherPurpose = value;
    }

}
