
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A school's calendar information. The Calendar Item object lists individual calendar events. A school may have more than one calendar (e.g., one calendar for kindergarten students, one for special education students, one for seniors, or one for each calendar track), and each may have different days in session, start and end dates, minutes per day, instructional minutes, etc.
 * 
 * <p>Java class for schoolCalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schoolCalendarType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gSchoolCalendarType">
 *       &lt;sequence>
 *         &lt;element name="markingTermIndicator" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *         &lt;element name="sessionSchedulingTermIndicator" type="{http://www.sifassociation.org/datamodel/na/3.3}gYesNoUnknownType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schoolCalendarType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "markingTermIndicator",
    "sessionSchedulingTermIndicator"
})
public class SchoolCalendarType
    extends GSchoolCalendarType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType markingTermIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYesNoUnknownType sessionSchedulingTermIndicator;

    /**
     * Gets the value of the markingTermIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getMarkingTermIndicator() {
        return markingTermIndicator;
    }

    /**
     * Sets the value of the markingTermIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setMarkingTermIndicator(GYesNoUnknownType value) {
        this.markingTermIndicator = value;
    }

    /**
     * Gets the value of the sessionSchedulingTermIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public GYesNoUnknownType getSessionSchedulingTermIndicator() {
        return sessionSchedulingTermIndicator;
    }

    /**
     * Sets the value of the sessionSchedulingTermIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYesNoUnknownType }
     *     
     */
    public void setSessionSchedulingTermIndicator(GYesNoUnknownType value) {
        this.sessionSchedulingTermIndicator = value;
    }

}
