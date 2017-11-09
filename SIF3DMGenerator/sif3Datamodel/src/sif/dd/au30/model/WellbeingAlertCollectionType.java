
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellbeingAlertCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingAlertCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WellbeingAlert" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingAlertType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WellbeingAlertCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "wellbeingAlert"
})
public class WellbeingAlertCollectionType {

    @XmlElement(name = "WellbeingAlert", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<WellbeingAlertType> wellbeingAlert;

    /**
     * Gets the value of the wellbeingAlert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellbeingAlert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWellbeingAlert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WellbeingAlertType }
     * 
     * 
     */
    public List<WellbeingAlertType> getWellbeingAlert() {
        if (wellbeingAlert == null) {
            wellbeingAlert = new ArrayList<WellbeingAlertType>();
        }
        return this.wellbeingAlert;
    }

}
