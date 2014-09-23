
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for peerRatingSystemCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="peerRatingSystemCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="peerRatingSystemMaximumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peerRatingSystemMinimumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peerRatingSystemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="peerRatingSystemOptimumValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "peerRatingSystemCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "peerRatingSystemMaximumValue",
    "peerRatingSystemMinimumValue",
    "peerRatingSystemName",
    "peerRatingSystemOptimumValue"
})
public class PeerRatingSystemCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String peerRatingSystemMaximumValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String peerRatingSystemMinimumValue;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String peerRatingSystemName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String peerRatingSystemOptimumValue;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the peerRatingSystemMaximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerRatingSystemMaximumValue() {
        return peerRatingSystemMaximumValue;
    }

    /**
     * Sets the value of the peerRatingSystemMaximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerRatingSystemMaximumValue(String value) {
        this.peerRatingSystemMaximumValue = value;
    }

    /**
     * Gets the value of the peerRatingSystemMinimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerRatingSystemMinimumValue() {
        return peerRatingSystemMinimumValue;
    }

    /**
     * Sets the value of the peerRatingSystemMinimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerRatingSystemMinimumValue(String value) {
        this.peerRatingSystemMinimumValue = value;
    }

    /**
     * Gets the value of the peerRatingSystemName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerRatingSystemName() {
        return peerRatingSystemName;
    }

    /**
     * Sets the value of the peerRatingSystemName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerRatingSystemName(String value) {
        this.peerRatingSystemName = value;
    }

    /**
     * Gets the value of the peerRatingSystemOptimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeerRatingSystemOptimumValue() {
        return peerRatingSystemOptimumValue;
    }

    /**
     * Sets the value of the peerRatingSystemOptimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeerRatingSystemOptimumValue(String value) {
        this.peerRatingSystemOptimumValue = value;
    }

    /**
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
