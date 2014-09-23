
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for learningStandardItemCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningStandardItemCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learningStandardItem" type="{http://www.sifassociation.org/datamodel/na/3.2}learningStandardItemType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningStandardItemCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "learningStandardItem"
})
public class LearningStandardItemCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<LearningStandardItemType> learningStandardItem;

    /**
     * Gets the value of the learningStandardItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningStandardItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningStandardItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearningStandardItemType }
     * 
     * 
     */
    public List<LearningStandardItemType> getLearningStandardItem() {
        if (learningStandardItem == null) {
            learningStandardItem = new ArrayList<LearningStandardItemType>();
        }
        return this.learningStandardItem;
    }

}
