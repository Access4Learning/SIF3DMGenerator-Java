
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PersonInvolvementListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonInvolvementListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonInvolvement" type="{http://www.sifassociation.org/datamodel/au/3.4}PersonInvolvementType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInvolvementListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "personInvolvement"
})
public class PersonInvolvementListType {

    @XmlElement(name = "PersonInvolvement", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<PersonInvolvementType> personInvolvement;

    /**
     * Gets the value of the personInvolvement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personInvolvement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonInvolvement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonInvolvementType }
     * 
     * 
     */
    public List<PersonInvolvementType> getPersonInvolvement() {
        if (personInvolvement == null) {
            personInvolvement = new ArrayList<PersonInvolvementType>();
        }
        return this.personInvolvement;
    }

}
