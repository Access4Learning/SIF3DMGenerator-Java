
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellbeingResponseCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingResponseCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WellbeingResponse" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingResponseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WellbeingResponseCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "wellbeingResponse"
})
public class WellbeingResponseCollectionType {

    @XmlElement(name = "WellbeingResponse", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<WellbeingResponseType> wellbeingResponse;

    /**
     * Gets the value of the wellbeingResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellbeingResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWellbeingResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WellbeingResponseType }
     * 
     * 
     */
    public List<WellbeingResponseType> getWellbeingResponse() {
        if (wellbeingResponse == null) {
            wellbeingResponse = new ArrayList<WellbeingResponseType>();
        }
        return this.wellbeingResponse;
    }

}
