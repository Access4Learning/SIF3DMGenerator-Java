
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for k12SchoolCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k12SchoolCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="k12School" type="{http://www.sifassociation.org/datamodel/na/3.2}k12SchoolType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k12SchoolCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "k12School"
})
public class K12SchoolCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<K12SchoolType> k12School;

    /**
     * Gets the value of the k12School property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the k12School property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getK12School().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link K12SchoolType }
     * 
     * 
     */
    public List<K12SchoolType> getK12School() {
        if (k12School == null) {
            k12School = new ArrayList<K12SchoolType>();
        }
        return this.k12School;
    }

}
