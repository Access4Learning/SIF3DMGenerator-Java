
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A List of teachers associated with the group - may or may not include the teacher timetabled in the schedule.
 * 
 * <p>Java class for TeacherListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TeacherListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeachingGroupTeacher" type="{http://www.sifassociation.org/datamodel/au/3.4}TeachingGroupTeacherType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TeacherListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "teachingGroupTeacher"
})
public class TeacherListType {

    @XmlElement(name = "TeachingGroupTeacher", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<TeachingGroupTeacherType> teachingGroupTeacher;

    /**
     * Gets the value of the teachingGroupTeacher property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teachingGroupTeacher property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeachingGroupTeacher().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeachingGroupTeacherType }
     * 
     * 
     */
    public List<TeachingGroupTeacherType> getTeachingGroupTeacher() {
        if (teachingGroupTeacher == null) {
            teachingGroupTeacher = new ArrayList<TeachingGroupTeacherType>();
        }
        return this.teachingGroupTeacher;
    }

}
