
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeCreditCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeCreditCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmployeeCredit" type="{http://www.sifassociation.org/datamodel/na/4.x}EmployeeCreditType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeCreditCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "employeeCredit"
})
public class EmployeeCreditCollectionType {

    @XmlElement(name = "EmployeeCredit", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<EmployeeCreditType> employeeCredit;

    /**
     * Gets the value of the employeeCredit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeCredit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeCreditType }
     * 
     * 
     */
    public List<EmployeeCreditType> getEmployeeCredit() {
        if (employeeCredit == null) {
            employeeCredit = new ArrayList<EmployeeCreditType>();
        }
        return this.employeeCredit;
    }

}
