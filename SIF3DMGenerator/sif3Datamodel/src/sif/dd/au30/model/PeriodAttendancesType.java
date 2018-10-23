
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Breakdown of grouped period attendance.
 * 
 * <p>Java class for PeriodAttendancesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PeriodAttendancesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PeriodAttendance" type="{http://www.sifassociation.org/datamodel/au/3.4}PeriodAttendanceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PeriodAttendancesType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "periodAttendance"
})
public class PeriodAttendancesType {

    @XmlElement(name = "PeriodAttendance", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<PeriodAttendanceType> periodAttendance;

    /**
     * Gets the value of the periodAttendance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the periodAttendance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeriodAttendance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PeriodAttendanceType }
     * 
     * 
     */
    public List<PeriodAttendanceType> getPeriodAttendance() {
        if (periodAttendance == null) {
            periodAttendance = new ArrayList<PeriodAttendanceType>();
        }
        return this.periodAttendance;
    }

}
