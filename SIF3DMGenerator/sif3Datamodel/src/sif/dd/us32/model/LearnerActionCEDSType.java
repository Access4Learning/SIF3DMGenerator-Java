
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for learnerActionCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learnerActionCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learnerActionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="learnerActionValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "learnerActionCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "learnerActionDate",
    "learnerActionTime",
    "learnerActionType",
    "learnerActionValue"
})
public class LearnerActionCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActionDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActionTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActionType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String learnerActionValue;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the learnerActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActionDate() {
        return learnerActionDate;
    }

    /**
     * Sets the value of the learnerActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActionDate(String value) {
        this.learnerActionDate = value;
    }

    /**
     * Gets the value of the learnerActionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActionTime() {
        return learnerActionTime;
    }

    /**
     * Sets the value of the learnerActionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActionTime(String value) {
        this.learnerActionTime = value;
    }

    /**
     * Gets the value of the learnerActionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActionType() {
        return learnerActionType;
    }

    /**
     * Sets the value of the learnerActionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActionType(String value) {
        this.learnerActionType = value;
    }

    /**
     * Gets the value of the learnerActionValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerActionValue() {
        return learnerActionValue;
    }

    /**
     * Sets the value of the learnerActionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerActionValue(String value) {
        this.learnerActionValue = value;
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
