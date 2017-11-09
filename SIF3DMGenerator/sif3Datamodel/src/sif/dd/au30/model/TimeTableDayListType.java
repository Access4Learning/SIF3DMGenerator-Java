
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeTableDayListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableDayListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeTableDay" type="{http://www.sifassociation.org/datamodel/au/3.4}TimeTableDayType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableDayListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "timeTableDay"
})
public class TimeTableDayListType {

    @XmlElement(name = "TimeTableDay", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<TimeTableDayType> timeTableDay;

    /**
     * Gets the value of the timeTableDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeTableDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeTableDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeTableDayType }
     * 
     * 
     */
    public List<TimeTableDayType> getTimeTableDay() {
        if (timeTableDay == null) {
            timeTableDay = new ArrayList<TimeTableDayType>();
        }
        return this.timeTableDay;
    }

}
