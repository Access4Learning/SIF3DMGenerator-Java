
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for k12SectionCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k12SectionCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="k12Section" type="{http://www.sifassociation.org/datamodel/na/3.2}k12SectionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "k12SectionCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "k12Section"
})
public class K12SectionCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<K12SectionType> k12Section;

    /**
     * Gets the value of the k12Section property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the k12Section property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getK12Section().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link K12SectionType }
     * 
     * 
     */
    public List<K12SectionType> getK12Section() {
        if (k12Section == null) {
            k12Section = new ArrayList<K12SectionType>();
        }
        return this.k12Section;
    }

}
