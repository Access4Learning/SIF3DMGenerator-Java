
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyAddressAssociationCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyAddressAssociationCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyAddressAssociation" type="{http://www.sifassociation.org/datamodel/na/3.3}partyAddressAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyAddressAssociationCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "partyAddressAssociation"
})
public class PartyAddressAssociationCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected List<PartyAddressAssociationType> partyAddressAssociation;

    /**
     * Gets the value of the partyAddressAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyAddressAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyAddressAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAddressAssociationType }
     * 
     * 
     */
    public List<PartyAddressAssociationType> getPartyAddressAssociation() {
        if (partyAddressAssociation == null) {
            partyAddressAssociation = new ArrayList<PartyAddressAssociationType>();
        }
        return this.partyAddressAssociation;
    }

}
