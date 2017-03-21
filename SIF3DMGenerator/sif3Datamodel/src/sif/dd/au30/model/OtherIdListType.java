
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OtherIdListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherIdListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OtherId" type="{http://www.sifassociation.org/datamodel/au/3.4.1}OtherIdType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherIdListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", propOrder = {
    "otherId"
})
public class OtherIdListType {

    @XmlElement(name = "OtherId", namespace = "http://www.sifassociation.org/datamodel/au/3.4.1", required = true)
    protected List<OtherIdType> otherId;

    /**
     * Gets the value of the otherId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherIdType }
     * 
     * 
     */
    public List<OtherIdType> getOtherId() {
        if (otherId == null) {
            otherId = new ArrayList<OtherIdType>();
        }
        return this.otherId;
    }

}
