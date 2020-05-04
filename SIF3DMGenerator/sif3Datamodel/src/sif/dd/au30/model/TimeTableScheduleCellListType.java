
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeTableScheduleCellListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableScheduleCellListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeTableScheduleCell" type="{http://www.sifassociation.org/datamodel/au/3.4}TimeTableScheduleCellType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableScheduleCellListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "timeTableScheduleCell"
})
public class TimeTableScheduleCellListType {

    @XmlElement(name = "TimeTableScheduleCell", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<TimeTableScheduleCellType> timeTableScheduleCell;

    /**
     * Gets the value of the timeTableScheduleCell property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeTableScheduleCell property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeTableScheduleCell().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TimeTableScheduleCellType }
     * 
     * 
     */
    public List<TimeTableScheduleCellType> getTimeTableScheduleCell() {
        if (timeTableScheduleCell == null) {
            timeTableScheduleCell = new ArrayList<TimeTableScheduleCellType>();
        }
        return this.timeTableScheduleCell;
    }

}
