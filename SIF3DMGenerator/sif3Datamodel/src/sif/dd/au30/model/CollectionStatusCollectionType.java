
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CollectionStatusCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionStatusCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CollectionStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}CollectionStatusType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionStatusCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "collectionStatus"
})
public class CollectionStatusCollectionType {

    @XmlElement(name = "CollectionStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<CollectionStatusType> collectionStatus;

    /**
     * Gets the value of the collectionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionStatusType }
     * 
     * 
     */
    public List<CollectionStatusType> getCollectionStatus() {
        if (collectionStatus == null) {
            collectionStatus = new ArrayList<CollectionStatusType>();
        }
        return this.collectionStatus;
    }

}
