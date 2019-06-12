
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeCredentialAssignmentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeCredentialAssignmentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assignment" type="{http://www.sifassociation.org/datamodel/na/4.x}EmployeeCredentialAssignmentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeCredentialAssignmentListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "assignment"
})
public class EmployeeCredentialAssignmentListType {

    @XmlElement(name = "Assignment", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<EmployeeCredentialAssignmentType> assignment;

    /**
     * Gets the value of the assignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCredentialAssignmentType }
     * 
     * 
     */
    public List<EmployeeCredentialAssignmentType> getAssignment() {
        if (assignment == null) {
            assignment = new ArrayList<EmployeeCredentialAssignmentType>();
        }
        return this.assignment;
    }

}
