
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for staffPersonCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="staffPersonCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="staffPerson" type="{http://www.sifassociation.org/datamodel/na/3.3}staffPersonType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "staffPersonCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "staffPerson"
})
public class StaffPersonCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected List<StaffPersonType> staffPerson;

    /**
     * Gets the value of the staffPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the staffPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStaffPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StaffPersonType }
     * 
     * 
     */
    public List<StaffPersonType> getStaffPerson() {
        if (staffPerson == null) {
            staffPerson = new ArrayList<StaffPersonType>();
        }
        return this.staffPerson;
    }

}
