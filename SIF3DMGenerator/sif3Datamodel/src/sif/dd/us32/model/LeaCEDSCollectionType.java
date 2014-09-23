
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for leaCEDSCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="leaCEDSCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="leaCEDS" type="{http://www.sifassociation.org/datamodel/na/3.2}leaCEDSType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "leaCEDSCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "leaCEDS"
})
public class LeaCEDSCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<LeaCEDSType> leaCEDS;

    /**
     * Gets the value of the leaCEDS property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leaCEDS property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeaCEDS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LeaCEDSType }
     * 
     * 
     */
    public List<LeaCEDSType> getLeaCEDS() {
        if (leaCEDS == null) {
            leaCEDS = new ArrayList<LeaCEDSType>();
        }
        return this.leaCEDS;
    }

}
