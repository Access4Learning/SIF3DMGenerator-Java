
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for staffPersonAssignmentCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staffPersonAssignmentCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staffPersonAssignment" type="{http://www.sifassociation.org/datamodel/na/3.3}staffPersonAssignmentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staffPersonAssignmentCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "staffPersonAssignment"
})
public class StaffPersonAssignmentCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected List<StaffPersonAssignmentType> staffPersonAssignment;

    /**
     * Gets the value of the staffPersonAssignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffPersonAssignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffPersonAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffPersonAssignmentType }
     * 
     * 
     */
    public List<StaffPersonAssignmentType> getStaffPersonAssignment() {
        if (staffPersonAssignment == null) {
            staffPersonAssignment = new ArrayList<StaffPersonAssignmentType>();
        }
        return this.staffPersonAssignment;
    }

}
