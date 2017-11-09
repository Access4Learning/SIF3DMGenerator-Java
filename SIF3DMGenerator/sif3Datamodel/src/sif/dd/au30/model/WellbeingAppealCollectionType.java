
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellbeingAppealCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingAppealCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WellbeingAppeal" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingAppealType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WellbeingAppealCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "wellbeingAppeal"
})
public class WellbeingAppealCollectionType {

    @XmlElement(name = "WellbeingAppeal", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<WellbeingAppealType> wellbeingAppeal;

    /**
     * Gets the value of the wellbeingAppeal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellbeingAppeal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWellbeingAppeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WellbeingAppealType }
     * 
     * 
     */
    public List<WellbeingAppealType> getWellbeingAppeal() {
        if (wellbeingAppeal == null) {
            wellbeingAppeal = new ArrayList<WellbeingAppealType>();
        }
        return this.wellbeingAppeal;
    }

}
