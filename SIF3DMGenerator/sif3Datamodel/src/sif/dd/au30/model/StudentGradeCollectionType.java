
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentGradeCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentGradeCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentGrade" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentGradeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentGradeCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentGrade"
})
public class StudentGradeCollectionType {

    @XmlElement(name = "StudentGrade", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<StudentGradeType> studentGrade;

    /**
     * Gets the value of the studentGrade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentGrade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentGrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentGradeType }
     * 
     * 
     */
    public List<StudentGradeType> getStudentGrade() {
        if (studentGrade == null) {
            studentGrade = new ArrayList<StudentGradeType>();
        }
        return this.studentGrade;
    }

}
