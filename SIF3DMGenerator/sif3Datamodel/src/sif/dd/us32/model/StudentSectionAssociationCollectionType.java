
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for studentSectionAssociationCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="studentSectionAssociationCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="studentSectionAssociation" type="{http://www.sifassociation.org/datamodel/na/3.2}studentSectionAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "studentSectionAssociationCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "studentSectionAssociation"
})
public class StudentSectionAssociationCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<StudentSectionAssociationType> studentSectionAssociation;

    /**
     * Gets the value of the studentSectionAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentSectionAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentSectionAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentSectionAssociationType }
     * 
     * 
     */
    public List<StudentSectionAssociationType> getStudentSectionAssociation() {
        if (studentSectionAssociation == null) {
            studentSectionAssociation = new ArrayList<StudentSectionAssociationType>();
        }
        return this.studentSectionAssociation;
    }

}
