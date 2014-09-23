
package sif.dd.us32.model.composite;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gLifeCycleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gLifeCycleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="created" type="{http://www.sifassociation.org/datamodel/na/3.2}gCreatedType" minOccurs="0"/>
 *         &lt;element name="modificationHistory" type="{http://www.sifassociation.org/datamodel/na/3.2}gModificationHistoryType" minOccurs="0"/>
 *         &lt;element name="timeElementList" type="{http://www.sifassociation.org/datamodel/na/3.2}gTimeElementList" minOccurs="0"/>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gLifeCycleType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "created",
    "modificationHistory",
    "timeElementList",
    "any"
})
public class GLifeCycleType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GCreatedType created;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GModificationHistoryType modificationHistory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GTimeElementList timeElementList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link GCreatedType }
     *     
     */
    public GCreatedType getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link GCreatedType }
     *     
     */
    public void setCreated(GCreatedType value) {
        this.created = value;
    }

    /**
     * Gets the value of the modificationHistory property.
     * 
     * @return
     *     possible object is
     *     {@link GModificationHistoryType }
     *     
     */
    public GModificationHistoryType getModificationHistory() {
        return modificationHistory;
    }

    /**
     * Sets the value of the modificationHistory property.
     * 
     * @param value
     *     allowed object is
     *     {@link GModificationHistoryType }
     *     
     */
    public void setModificationHistory(GModificationHistoryType value) {
        this.modificationHistory = value;
    }

    /**
     * Gets the value of the timeElementList property.
     * 
     * @return
     *     possible object is
     *     {@link GTimeElementList }
     *     
     */
    public GTimeElementList getTimeElementList() {
        return timeElementList;
    }

    /**
     * Sets the value of the timeElementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTimeElementList }
     *     
     */
    public void setTimeElementList(GTimeElementList value) {
        this.timeElementList = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
