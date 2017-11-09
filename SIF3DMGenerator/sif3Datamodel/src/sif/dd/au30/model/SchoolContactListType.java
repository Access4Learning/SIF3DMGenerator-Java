
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchoolContactListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolContactListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolContact" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolContactType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolContactListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "schoolContact"
})
public class SchoolContactListType {

    @XmlElement(name = "SchoolContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<SchoolContactType> schoolContact;

    /**
     * Gets the value of the schoolContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchoolContactType }
     * 
     * 
     */
    public List<SchoolContactType> getSchoolContact() {
        if (schoolContact == null) {
            schoolContact = new ArrayList<SchoolContactType>();
        }
        return this.schoolContact;
    }

}
