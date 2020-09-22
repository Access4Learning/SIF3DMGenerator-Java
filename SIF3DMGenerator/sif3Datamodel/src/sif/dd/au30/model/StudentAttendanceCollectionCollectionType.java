
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentAttendanceCollectionCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentAttendanceCollectionCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentAttendanceCollection" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentAttendanceCollectionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentAttendanceCollectionCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentAttendanceCollection"
})
public class StudentAttendanceCollectionCollectionType {

    @XmlElement(name = "StudentAttendanceCollection", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<StudentAttendanceCollectionType> studentAttendanceCollection;

    /**
     * Gets the value of the studentAttendanceCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentAttendanceCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentAttendanceCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentAttendanceCollectionType }
     * 
     * 
     */
    public List<StudentAttendanceCollectionType> getStudentAttendanceCollection() {
        if (studentAttendanceCollection == null) {
            studentAttendanceCollection = new ArrayList<StudentAttendanceCollectionType>();
        }
        return this.studentAttendanceCollection;
    }

}
