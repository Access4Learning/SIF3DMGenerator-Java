
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentLEARelationshipCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentLEARelationshipCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentLEARelationship" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentLEARelationshipType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentLEARelationshipCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentLEARelationship"
})
public class StudentLEARelationshipCollectionType {

    @XmlElement(name = "StudentLEARelationship", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<StudentLEARelationshipType> studentLEARelationship;

    /**
     * Gets the value of the studentLEARelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentLEARelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentLEARelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentLEARelationshipType }
     * 
     * 
     */
    public List<StudentLEARelationshipType> getStudentLEARelationship() {
        if (studentLEARelationship == null) {
            studentLEARelationship = new ArrayList<StudentLEARelationshipType>();
        }
        return this.studentLEARelationship;
    }

}
