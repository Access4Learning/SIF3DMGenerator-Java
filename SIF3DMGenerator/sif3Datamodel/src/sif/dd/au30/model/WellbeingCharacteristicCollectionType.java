
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellbeingCharacteristicCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingCharacteristicCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WellbeingCharacteristic" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingCharacteristicType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WellbeingCharacteristicCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "wellbeingCharacteristic"
})
public class WellbeingCharacteristicCollectionType {

    @XmlElement(name = "WellbeingCharacteristic", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<WellbeingCharacteristicType> wellbeingCharacteristic;

    /**
     * Gets the value of the wellbeingCharacteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellbeingCharacteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWellbeingCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WellbeingCharacteristicType }
     * 
     * 
     */
    public List<WellbeingCharacteristicType> getWellbeingCharacteristic() {
        if (wellbeingCharacteristic == null) {
            wellbeingCharacteristic = new ArrayList<WellbeingCharacteristicType>();
        }
        return this.wellbeingCharacteristic;
    }

}
