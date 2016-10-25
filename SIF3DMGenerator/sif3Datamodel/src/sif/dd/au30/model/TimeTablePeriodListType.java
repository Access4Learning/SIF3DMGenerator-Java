
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeTablePeriodListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTablePeriodListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeTablePeriod" type="{http://www.sifassociation.org/datamodel/au/3.4}TimeTablePeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTablePeriodListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "timeTablePeriod"
})
public class TimeTablePeriodListType {

    @XmlElement(name = "TimeTablePeriod", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<TimeTablePeriodType> timeTablePeriod;

    /**
     * Gets the value of the timeTablePeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeTablePeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeTablePeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeTablePeriodType }
     * 
     * 
     */
    public List<TimeTablePeriodType> getTimeTablePeriod() {
        if (timeTablePeriod == null) {
            timeTablePeriod = new ArrayList<TimeTablePeriodType>();
        }
        return this.timeTablePeriod;
    }

}
