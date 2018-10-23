
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of SubTypes associated with a Category.
 * 
 * <p>Java class for WellbeingEventSubCategoryListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WellbeingEventSubCategoryListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WellbeingEventSubCategory" maxOccurs="unbounded">
 *           &lt;simpleType>
 *             &lt;union>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsEventSubCategoryType">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *               &lt;simpleType>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                 &lt;/restriction>
 *               &lt;/simpleType>
 *             &lt;/union>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WellbeingEventSubCategoryListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "wellbeingEventSubCategory"
})
public class WellbeingEventSubCategoryListType {

    @XmlElement(name = "WellbeingEventSubCategory", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected List<String> wellbeingEventSubCategory;

    /**
     * Gets the value of the wellbeingEventSubCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wellbeingEventSubCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWellbeingEventSubCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getWellbeingEventSubCategory() {
        if (wellbeingEventSubCategory == null) {
            wellbeingEventSubCategory = new ArrayList<String>();
        }
        return this.wellbeingEventSubCategory;
    }

}
