
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Subject(s) Staff member is eligible to teach.
 * 
 * <p>Java class for StaffSubjectListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffSubjectListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StaffSubject" type="{http://www.sifassociation.org/datamodel/au/3.4}StaffSubjectType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffSubjectListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "staffSubject"
})
public class StaffSubjectListType {

    @XmlElement(name = "StaffSubject", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<StaffSubjectType> staffSubject;

    /**
     * Gets the value of the staffSubject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffSubject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffSubject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffSubjectType }
     * 
     * 
     */
    public List<StaffSubjectType> getStaffSubject() {
        if (staffSubject == null) {
            staffSubject = new ArrayList<StaffSubjectType>();
        }
        return this.staffSubject;
    }

}
