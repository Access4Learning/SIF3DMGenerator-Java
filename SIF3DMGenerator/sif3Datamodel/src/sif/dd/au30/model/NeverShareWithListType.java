
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NeverShareWithListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NeverShareWithListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NeverShareWith" type="{http://www.sifassociation.org/datamodel/au/3.4}NeverShareWithType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NeverShareWithListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "neverShareWith"
})
public class NeverShareWithListType {

    @XmlElement(name = "NeverShareWith", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<NeverShareWithType> neverShareWith;

    /**
     * Gets the value of the neverShareWith property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neverShareWith property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNeverShareWith().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NeverShareWithType }
     * 
     * 
     */
    public List<NeverShareWithType> getNeverShareWith() {
        if (neverShareWith == null) {
            neverShareWith = new ArrayList<NeverShareWithType>();
        }
        return this.neverShareWith;
    }

}
