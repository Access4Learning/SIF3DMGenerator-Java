
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentSubjectChoiceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSubjectChoiceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentSubjectChoice" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentSubjectChoiceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSubjectChoiceListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentSubjectChoice"
})
public class StudentSubjectChoiceListType {

    @XmlElement(name = "StudentSubjectChoice", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<StudentSubjectChoiceType> studentSubjectChoice;

    /**
     * Gets the value of the studentSubjectChoice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentSubjectChoice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentSubjectChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentSubjectChoiceType }
     * 
     * 
     */
    public List<StudentSubjectChoiceType> getStudentSubjectChoice() {
        if (studentSubjectChoice == null) {
            studentSubjectChoice = new ArrayList<StudentSubjectChoiceType>();
        }
        return this.studentSubjectChoice;
    }

}
