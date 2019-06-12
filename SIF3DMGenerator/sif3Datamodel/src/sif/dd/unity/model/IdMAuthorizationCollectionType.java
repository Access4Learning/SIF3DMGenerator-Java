
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdMAuthorizationCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdMAuthorizationCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdMAuthorization" type="{http://www.sifassociation.org/datamodel/na/4.x}IdMAuthorizationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdMAuthorizationCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "idMAuthorization"
})
public class IdMAuthorizationCollectionType {

    @XmlElement(name = "IdMAuthorization", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<IdMAuthorizationType> idMAuthorization;

    /**
     * Gets the value of the idMAuthorization property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the idMAuthorization property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdMAuthorization().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdMAuthorizationType }
     * 
     * 
     */
    public List<IdMAuthorizationType> getIdMAuthorization() {
        if (idMAuthorization == null) {
            idMAuthorization = new ArrayList<IdMAuthorizationType>();
        }
        return this.idMAuthorization;
    }

}
