
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BellScheduleDayListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BellScheduleDayListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BellScheduleDay" type="{http://www.sifassociation.org/datamodel/na/4.x}BellScheduleDayType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BellScheduleDayListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "bellScheduleDay"
})
public class BellScheduleDayListType {

    @XmlElement(name = "BellScheduleDay", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<BellScheduleDayType> bellScheduleDay;

    /**
     * Gets the value of the bellScheduleDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bellScheduleDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBellScheduleDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BellScheduleDayType }
     * 
     * 
     */
    public List<BellScheduleDayType> getBellScheduleDay() {
        if (bellScheduleDay == null) {
            bellScheduleDay = new ArrayList<BellScheduleDayType>();
        }
        return this.bellScheduleDay;
    }

}
