
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for partyOrganizationAssociationCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="partyOrganizationAssociationCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="partyOrganizationAssociation" type="{http://www.sifassociation.org/datamodel/na/3.2}partyOrganizationAssociationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "partyOrganizationAssociationCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "partyOrganizationAssociation"
})
public class PartyOrganizationAssociationCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<PartyOrganizationAssociationType> partyOrganizationAssociation;

    /**
     * Gets the value of the partyOrganizationAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyOrganizationAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyOrganizationAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyOrganizationAssociationType }
     * 
     * 
     */
    public List<PartyOrganizationAssociationType> getPartyOrganizationAssociation() {
        if (partyOrganizationAssociation == null) {
            partyOrganizationAssociation = new ArrayList<PartyOrganizationAssociationType>();
        }
        return this.partyOrganizationAssociation;
    }

}
