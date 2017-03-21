
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttendanceTimesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttendanceTimesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttendanceTime" type="{http://www.sifassociation.org/datamodel/au/3.4.1}AttendanceTimeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttendanceTimesType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "attendanceTime"
})
public class AttendanceTimesType {

    @XmlElement(name = "AttendanceTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected List<AttendanceTimeType> attendanceTime;

    /**
     * Gets the value of the attendanceTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attendanceTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttendanceTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttendanceTimeType }
     * 
     * 
     */
    public List<AttendanceTimeType> getAttendanceTime() {
        if (attendanceTime == null) {
            attendanceTime = new ArrayList<AttendanceTimeType>();
        }
        return this.attendanceTime;
    }

}
