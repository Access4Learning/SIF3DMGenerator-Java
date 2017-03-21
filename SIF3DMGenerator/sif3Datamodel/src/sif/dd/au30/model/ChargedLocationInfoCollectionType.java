
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChargedLocationInfoCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChargedLocationInfoCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ChargedLocationInfo" type="{http://www.sifassociation.org/datamodel/au/3.4.1}ChargedLocationInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargedLocationInfoCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "chargedLocationInfo"
})
public class ChargedLocationInfoCollectionType {

    @XmlElement(name = "ChargedLocationInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1")
    protected List<ChargedLocationInfoType> chargedLocationInfo;

    /**
     * Gets the value of the chargedLocationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chargedLocationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChargedLocationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargedLocationInfoType }
     * 
     * 
     */
    public List<ChargedLocationInfoType> getChargedLocationInfo() {
        if (chargedLocationInfo == null) {
            chargedLocationInfo = new ArrayList<ChargedLocationInfoType>();
        }
        return this.chargedLocationInfo;
    }

}
