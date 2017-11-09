
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WellbeingEventCategoryListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingEventCategoryListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WellbeingEventCategory" type="{http://www.sifassociation.org/datamodel/au/3.4}WellbeingEventCategoryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WellbeingEventCategoryListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "wellbeingEventCategory"
})
public class WellbeingEventCategoryListType {

    @XmlElement(name = "WellbeingEventCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<WellbeingEventCategoryType> wellbeingEventCategory;

    /**
     * Gets the value of the wellbeingEventCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellbeingEventCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWellbeingEventCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WellbeingEventCategoryType }
     * 
     * 
     */
    public List<WellbeingEventCategoryType> getWellbeingEventCategory() {
        if (wellbeingEventCategory == null) {
            wellbeingEventCategory = new ArrayList<WellbeingEventCategoryType>();
        }
        return this.wellbeingEventCategory;
    }

}
