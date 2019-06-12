
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xDayListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xDayListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bellScheduleDay" type="{http://www.sifassociation.org/datamodel/na/4.x}xDayOfWeekType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xDayListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "bellScheduleDay"
})
public class XDayListType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected XDayOfWeekType bellScheduleDay;

    /**
     * Gets the value of the bellScheduleDay property.
     * 
     * @return
     *     possible object is
     *     {@link XDayOfWeekType }
     *     
     */
    public XDayOfWeekType getBellScheduleDay() {
        return bellScheduleDay;
    }

    /**
     * Sets the value of the bellScheduleDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDayOfWeekType }
     *     
     */
    public void setBellScheduleDay(XDayOfWeekType value) {
        this.bellScheduleDay = value;
    }

}
