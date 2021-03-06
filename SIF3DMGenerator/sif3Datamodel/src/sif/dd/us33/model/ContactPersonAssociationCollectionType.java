
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactPersonAssociationCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactPersonAssociationCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contactPersonAssociation" type="{http://www.sifassociation.org/datamodel/na/3.3}contactPersonAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactPersonAssociationCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "contactPersonAssociation"
})
public class ContactPersonAssociationCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected List<ContactPersonAssociationType> contactPersonAssociation;

    /**
     * Gets the value of the contactPersonAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactPersonAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactPersonAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonAssociationType }
     * 
     * 
     */
    public List<ContactPersonAssociationType> getContactPersonAssociation() {
        if (contactPersonAssociation == null) {
            contactPersonAssociation = new ArrayList<ContactPersonAssociationType>();
        }
        return this.contactPersonAssociation;
    }

}
