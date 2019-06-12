
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeElementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeElementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeElement" type="{http://www.sifassociation.org/datamodel/na/4.x}TimeElementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeElementsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "timeElement"
})
public class TimeElementsType {

    @XmlElement(name = "TimeElement", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<TimeElementType> timeElement;

    /**
     * Gets the value of the timeElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeElementType }
     * 
     * 
     */
    public List<TimeElementType> getTimeElement() {
        if (timeElement == null) {
            timeElement = new ArrayList<TimeElementType>();
        }
        return this.timeElement;
    }

}
