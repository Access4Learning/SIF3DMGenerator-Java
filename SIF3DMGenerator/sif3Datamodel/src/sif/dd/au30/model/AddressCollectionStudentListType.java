
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AddressCollectionStudentListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressCollectionStudentListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressCollectionStudent" type="{http://www.sifassociation.org/datamodel/au/3.4}AddressCollectionStudentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressCollectionStudentListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "addressCollectionStudent"
})
public class AddressCollectionStudentListType {

    @XmlElement(name = "AddressCollectionStudent", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<AddressCollectionStudentType> addressCollectionStudent;

    /**
     * Gets the value of the addressCollectionStudent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addressCollectionStudent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddressCollectionStudent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddressCollectionStudentType }
     * 
     * 
     */
    public List<AddressCollectionStudentType> getAddressCollectionStudent() {
        if (addressCollectionStudent == null) {
            addressCollectionStudent = new ArrayList<AddressCollectionStudentType>();
        }
        return this.addressCollectionStudent;
    }

}
