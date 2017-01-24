
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gTimetableDayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gTimetableDayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="timetablePeriodList" type="{http://www.sifassociation.org/datamodel/na/3.3}gTimetablePeriodList" minOccurs="0"/>
 *         &lt;element name="timetableDayIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="timetableDayName" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "gTimetableDayType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "timetablePeriodList",
    "timetableDayIdentifier",
    "timetableDayName",
    "any"
})
public class GTimetableDayType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GTimetablePeriodList timetablePeriodList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected String timetableDayIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected String timetableDayName;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the timetablePeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link GTimetablePeriodList }
     *     
     */
    public GTimetablePeriodList getTimetablePeriodList() {
        return timetablePeriodList;
    }

    /**
     * Sets the value of the timetablePeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTimetablePeriodList }
     *     
     */
    public void setTimetablePeriodList(GTimetablePeriodList value) {
        this.timetablePeriodList = value;
    }

    /**
     * Gets the value of the timetableDayIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimetableDayIdentifier() {
        return timetableDayIdentifier;
    }

    /**
     * Sets the value of the timetableDayIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetableDayIdentifier(String value) {
        this.timetableDayIdentifier = value;
    }

    /**
     * Gets the value of the timetableDayName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimetableDayName() {
        return timetableDayName;
    }

    /**
     * Sets the value of the timetableDayName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetableDayName(String value) {
        this.timetableDayName = value;
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