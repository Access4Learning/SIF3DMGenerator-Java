
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for schoolCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schoolCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="school" type="{http://www.sifassociation.org/datamodel/na/3.3}schoolType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schoolCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "school"
})
public class SchoolCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected List<SchoolType> school;

    /**
     * Gets the value of the school property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the school property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchoolType }
     * 
     * 
     */
    public List<SchoolType> getSchool() {
        if (school == null) {
            school = new ArrayList<SchoolType>();
        }
        return this.school;
    }

}
