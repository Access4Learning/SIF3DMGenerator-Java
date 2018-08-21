
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NAPTestletItemResponseListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPTestletItemResponseListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItemResponse" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPTestletResponseItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPTestletItemResponseListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "itemResponse"
})
public class NAPTestletItemResponseListType {

    @XmlElement(name = "ItemResponse", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<NAPTestletResponseItemType> itemResponse;

    /**
     * Gets the value of the itemResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NAPTestletResponseItemType }
     * 
     * 
     */
    public List<NAPTestletResponseItemType> getItemResponse() {
        if (itemResponse == null) {
            itemResponse = new ArrayList<NAPTestletResponseItemType>();
        }
        return this.itemResponse;
    }

}
