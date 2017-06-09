
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAPTestletCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestletCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NAPTestlet" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPTestletType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestletCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "napTestlet"
})
public class NAPTestletCollectionType {

    @XmlElement(name = "NAPTestlet", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<NAPTestletType> napTestlet;

    /**
     * Gets the value of the napTestlet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the napTestlet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNAPTestlet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAPTestletType }
     * 
     * 
     */
    public List<NAPTestletType> getNAPTestlet() {
        if (napTestlet == null) {
            napTestlet = new ArrayList<NAPTestletType>();
        }
        return this.napTestlet;
    }

}
