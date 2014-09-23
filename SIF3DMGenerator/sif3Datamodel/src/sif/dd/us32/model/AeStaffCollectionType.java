
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aeStaffCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aeStaffCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aeStaff" type="{http://www.sifassociation.org/datamodel/na/3.2}aeStaffType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aeStaffCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "aeStaff"
})
public class AeStaffCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<AeStaffType> aeStaff;

    /**
     * Gets the value of the aeStaff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aeStaff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAeStaff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AeStaffType }
     * 
     * 
     */
    public List<AeStaffType> getAeStaff() {
        if (aeStaff == null) {
            aeStaff = new ArrayList<AeStaffType>();
        }
        return this.aeStaff;
    }

}
