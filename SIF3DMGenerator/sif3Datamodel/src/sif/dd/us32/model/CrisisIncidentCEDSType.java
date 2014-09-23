
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for crisisIncidentCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="crisisIncidentCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crisisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crisisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crisisType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crisisStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "crisisIncidentCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "crisisCode",
    "crisisName",
    "crisisType",
    "crisisStartDate"
})
public class CrisisIncidentCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String crisisCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String crisisName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String crisisType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String crisisStartDate;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the crisisCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrisisCode() {
        return crisisCode;
    }

    /**
     * Sets the value of the crisisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrisisCode(String value) {
        this.crisisCode = value;
    }

    /**
     * Gets the value of the crisisName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrisisName() {
        return crisisName;
    }

    /**
     * Sets the value of the crisisName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrisisName(String value) {
        this.crisisName = value;
    }

    /**
     * Gets the value of the crisisType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrisisType() {
        return crisisType;
    }

    /**
     * Sets the value of the crisisType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrisisType(String value) {
        this.crisisType = value;
    }

    /**
     * Gets the value of the crisisStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrisisStartDate() {
        return crisisStartDate;
    }

    /**
     * Sets the value of the crisisStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrisisStartDate(String value) {
        this.crisisStartDate = value;
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
