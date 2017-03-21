
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YearRangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YearRangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Start" type="{http://www.sifassociation.org/datamodel/au/3.4.1}YearLevelType"/>
 *         &lt;element name="End" type="{http://www.sifassociation.org/datamodel/au/3.4.1}YearLevelType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearRangeType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "start",
    "end"
})
public class YearRangeType {

    @XmlElement(name = "Start", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected YearLevelType start;
    @XmlElement(name = "End", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected YearLevelType end;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link YearLevelType }
     *     
     */
    public YearLevelType getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearLevelType }
     *     
     */
    public void setStart(YearLevelType value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link YearLevelType }
     *     
     */
    public YearLevelType getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link YearLevelType }
     *     
     */
    public void setEnd(YearLevelType value) {
        this.end = value;
    }

}
