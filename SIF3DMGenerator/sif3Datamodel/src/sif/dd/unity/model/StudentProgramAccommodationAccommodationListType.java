
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentProgramAccommodationAccommodationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentProgramAccommodationAccommodationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accommodation" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentProgramAccommodationAccommodationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentProgramAccommodationAccommodationListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "accommodation"
})
public class StudentProgramAccommodationAccommodationListType {

    @XmlElement(name = "Accommodation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<StudentProgramAccommodationAccommodationType> accommodation;

    /**
     * Gets the value of the accommodation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accommodation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccommodation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentProgramAccommodationAccommodationType }
     * 
     * 
     */
    public List<StudentProgramAccommodationAccommodationType> getAccommodation() {
        if (accommodation == null) {
            accommodation = new ArrayList<StudentProgramAccommodationAccommodationType>();
        }
        return this.accommodation;
    }

}
