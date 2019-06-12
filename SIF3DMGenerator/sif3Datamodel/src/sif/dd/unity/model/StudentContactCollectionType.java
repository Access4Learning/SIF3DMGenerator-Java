
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentContactCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentContactCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentContact" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentContactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentContactCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentContact"
})
public class StudentContactCollectionType {

    @XmlElement(name = "StudentContact", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<StudentContactType> studentContact;

    /**
     * Gets the value of the studentContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentContactType }
     * 
     * 
     */
    public List<StudentContactType> getStudentContact() {
        if (studentContact == null) {
            studentContact = new ArrayList<StudentContactType>();
        }
        return this.studentContact;
    }

}
