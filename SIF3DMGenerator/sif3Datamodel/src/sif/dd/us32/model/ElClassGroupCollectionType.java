
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for elClassGroupCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elClassGroupCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="elClassGroup" type="{http://www.sifassociation.org/datamodel/na/3.2}elClassGroupType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elClassGroupCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "elClassGroup"
})
public class ElClassGroupCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<ElClassGroupType> elClassGroup;

    /**
     * Gets the value of the elClassGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elClassGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElClassGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElClassGroupType }
     * 
     * 
     */
    public List<ElClassGroupType> getElClassGroup() {
        if (elClassGroup == null) {
            elClassGroup = new ArrayList<ElClassGroupType>();
        }
        return this.elClassGroup;
    }

}
