
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for k12StaffCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k12StaffCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="k12Staff" type="{http://www.sifassociation.org/datamodel/na/3.2}k12StaffType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k12StaffCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "k12Staff"
})
public class K12StaffCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<K12StaffType> k12Staff;

    /**
     * Gets the value of the k12Staff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the k12Staff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getK12Staff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link K12StaffType }
     * 
     * 
     */
    public List<K12StaffType> getK12Staff() {
        if (k12Staff == null) {
            k12Staff = new ArrayList<K12StaffType>();
        }
        return this.k12Staff;
    }

}
