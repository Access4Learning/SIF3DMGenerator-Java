
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for xContactCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xContactCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xContact" type="{http://www.sifassociation.org/datamodel/na/3.3}xContactType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xContactCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "xContact"
})
public class XContactCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected List<XContactType> xContact;

    /**
     * Gets the value of the xContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XContactType }
     * 
     * 
     */
    public List<XContactType> getXContact() {
        if (xContact == null) {
            xContact = new ArrayList<XContactType>();
        }
        return this.xContact;
    }

}
