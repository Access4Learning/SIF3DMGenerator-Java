
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchoolAttendanceHistoryListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolAttendanceHistoryListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolAttended" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolAttendanceHistoryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolAttendanceHistoryListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "schoolAttended"
})
public class SchoolAttendanceHistoryListType {

    @XmlElement(name = "SchoolAttended", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<SchoolAttendanceHistoryType> schoolAttended;

    /**
     * Gets the value of the schoolAttended property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolAttended property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolAttended().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchoolAttendanceHistoryType }
     * 
     * 
     */
    public List<SchoolAttendanceHistoryType> getSchoolAttended() {
        if (schoolAttended == null) {
            schoolAttended = new ArrayList<SchoolAttendanceHistoryType>();
        }
        return this.schoolAttended;
    }

}
