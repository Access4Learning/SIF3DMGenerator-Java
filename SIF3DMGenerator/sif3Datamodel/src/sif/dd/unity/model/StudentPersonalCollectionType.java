
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentPersonalCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentPersonalCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonal" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentPersonalType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentPersonalCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentPersonal"
})
public class StudentPersonalCollectionType {

    @XmlElement(name = "StudentPersonal", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<StudentPersonalType> studentPersonal;

    /**
     * Gets the value of the studentPersonal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentPersonal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentPersonal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentPersonalType }
     * 
     * 
     */
    public List<StudentPersonalType> getStudentPersonal() {
        if (studentPersonal == null) {
            studentPersonal = new ArrayList<StudentPersonalType>();
        }
        return this.studentPersonal;
    }

}
