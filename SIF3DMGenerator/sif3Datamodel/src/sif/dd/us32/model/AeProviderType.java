
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for aeProviderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aeProviderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeProviderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aeServiceProviderIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aeServiceProviderIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="levelOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortNameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "aeProviderType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "aeProviderType",
    "aeServiceProviderIdentificationSystem",
    "aeServiceProviderIdentifier",
    "levelOfInstitution",
    "nameOfInstitution",
    "shortNameOfInstitution"
})
public class AeProviderType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String aeProviderType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String aeServiceProviderIdentificationSystem;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String aeServiceProviderIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String levelOfInstitution;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String nameOfInstitution;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String shortNameOfInstitution;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the aeProviderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeProviderType() {
        return aeProviderType;
    }

    /**
     * Sets the value of the aeProviderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeProviderType(String value) {
        this.aeProviderType = value;
    }

    /**
     * Gets the value of the aeServiceProviderIdentificationSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeServiceProviderIdentificationSystem() {
        return aeServiceProviderIdentificationSystem;
    }

    /**
     * Sets the value of the aeServiceProviderIdentificationSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeServiceProviderIdentificationSystem(String value) {
        this.aeServiceProviderIdentificationSystem = value;
    }

    /**
     * Gets the value of the aeServiceProviderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAeServiceProviderIdentifier() {
        return aeServiceProviderIdentifier;
    }

    /**
     * Sets the value of the aeServiceProviderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAeServiceProviderIdentifier(String value) {
        this.aeServiceProviderIdentifier = value;
    }

    /**
     * Gets the value of the levelOfInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevelOfInstitution() {
        return levelOfInstitution;
    }

    /**
     * Sets the value of the levelOfInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevelOfInstitution(String value) {
        this.levelOfInstitution = value;
    }

    /**
     * Gets the value of the nameOfInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameOfInstitution() {
        return nameOfInstitution;
    }

    /**
     * Sets the value of the nameOfInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameOfInstitution(String value) {
        this.nameOfInstitution = value;
    }

    /**
     * Gets the value of the shortNameOfInstitution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortNameOfInstitution() {
        return shortNameOfInstitution;
    }

    /**
     * Sets the value of the shortNameOfInstitution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortNameOfInstitution(String value) {
        this.shortNameOfInstitution = value;
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
