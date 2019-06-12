
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdMAuthenticationCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdMAuthenticationCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdMAuthentication" type="{http://www.sifassociation.org/datamodel/na/4.x}IdMAuthenticationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdMAuthenticationCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "idMAuthentication"
})
public class IdMAuthenticationCollectionType {

    @XmlElement(name = "IdMAuthentication", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IdMAuthenticationType> idMAuthentication;

    /**
     * Gets the value of the idMAuthentication property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idMAuthentication property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdMAuthentication().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdMAuthenticationType }
     * 
     * 
     */
    public List<IdMAuthenticationType> getIdMAuthentication() {
        if (idMAuthentication == null) {
            idMAuthentication = new ArrayList<IdMAuthenticationType>();
        }
        return this.idMAuthentication;
    }

}
