
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAPSubscoreListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPSubscoreListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Subscore" type="{http://www.sifassociation.org/datamodel/au/3.4.1}NAPSubscoreType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPSubscoreListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "subscore"
})
public class NAPSubscoreListType {

    @XmlElement(name = "Subscore", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected List<NAPSubscoreType> subscore;

    /**
     * Gets the value of the subscore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAPSubscoreType }
     * 
     * 
     */
    public List<NAPSubscoreType> getSubscore() {
        if (subscore == null) {
            subscore = new ArrayList<NAPSubscoreType>();
        }
        return this.subscore;
    }

}
