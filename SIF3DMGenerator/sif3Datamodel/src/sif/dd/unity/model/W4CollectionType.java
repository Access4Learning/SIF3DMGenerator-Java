
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for W4CollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="W4CollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="W4" type="{http://www.sifassociation.org/datamodel/na/4.x}W4Type" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "W4CollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "w4"
})
public class W4CollectionType {

    @XmlElement(name = "W4", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<W4Type> w4;

    /**
     * Gets the value of the w4 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the w4 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getW4().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link W4Type }
     * 
     * 
     */
    public List<W4Type> getW4() {
        if (w4 == null) {
            w4 = new ArrayList<W4Type>();
        }
        return this.w4;
    }

}
