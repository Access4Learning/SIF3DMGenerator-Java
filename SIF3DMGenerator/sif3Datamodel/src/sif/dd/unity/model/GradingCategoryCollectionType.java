
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GradingCategoryCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GradingCategoryCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GradingCategory" type="{http://www.sifassociation.org/datamodel/na/4.x}GradingCategoryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GradingCategoryCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "gradingCategory"
})
public class GradingCategoryCollectionType {

    @XmlElement(name = "GradingCategory", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<GradingCategoryType> gradingCategory;

    /**
     * Gets the value of the gradingCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gradingCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGradingCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GradingCategoryType }
     * 
     * 
     */
    public List<GradingCategoryType> getGradingCategory() {
        if (gradingCategory == null) {
            gradingCategory = new ArrayList<GradingCategoryType>();
        }
        return this.gradingCategory;
    }

}
