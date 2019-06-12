
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LifeCycleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Created" type="{http://www.sifassociation.org/datamodel/na/4.x}CreatedType" minOccurs="0"/>
 *         &lt;element name="ModificationHistory" type="{http://www.sifassociation.org/datamodel/na/4.x}ModificationHistoryType" minOccurs="0"/>
 *         &lt;element name="TimeElements" type="{http://www.sifassociation.org/datamodel/na/4.x}TimeElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LifeCycleType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "created",
    "modificationHistory",
    "timeElements"
})
public class LifeCycleType {

    @XmlElement(name = "Created", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected CreatedType created;
    @XmlElement(name = "ModificationHistory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ModificationHistoryType modificationHistory;
    @XmlElement(name = "TimeElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TimeElementsType timeElements;

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link CreatedType }
     *     
     */
    public CreatedType getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreatedType }
     *     
     */
    public void setCreated(CreatedType value) {
        this.created = value;
    }

    /**
     * Gets the value of the modificationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link ModificationHistoryType }
     *     
     */
    public ModificationHistoryType getModificationHistory() {
        return modificationHistory;
    }

    /**
     * Sets the value of the modificationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModificationHistoryType }
     *     
     */
    public void setModificationHistory(ModificationHistoryType value) {
        this.modificationHistory = value;
    }

    /**
     * Gets the value of the timeElements property.
     * 
     * @return
     *     possible object is
     *     {@link TimeElementsType }
     *     
     */
    public TimeElementsType getTimeElements() {
        return timeElements;
    }

    /**
     * Sets the value of the timeElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeElementsType }
     *     
     */
    public void setTimeElements(TimeElementsType value) {
        this.timeElements = value;
    }

}
