
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeachingGroupStudent" type="{http://www.sifassociation.org/datamodel/au/3.4}TeachingGroupStudentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "teachingGroupStudent"
})
public class StudentListType {

    @XmlElement(name = "TeachingGroupStudent", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<TeachingGroupStudentType> teachingGroupStudent;

    /**
     * Gets the value of the teachingGroupStudent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teachingGroupStudent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeachingGroupStudent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeachingGroupStudentType }
     * 
     * 
     */
    public List<TeachingGroupStudentType> getTeachingGroupStudent() {
        if (teachingGroupStudent == null) {
            teachingGroupStudent = new ArrayList<TeachingGroupStudentType>();
        }
        return this.teachingGroupStudent;
    }

}
