
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelatedLearningStandardItemRefIdListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelatedLearningStandardItemRefIdListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LearningStandardItemRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}RelatedLearningStandardItemRefIdType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedLearningStandardItemRefIdListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "learningStandardItemRefId"
})
public class RelatedLearningStandardItemRefIdListType {

    @XmlElement(name = "LearningStandardItemRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<RelatedLearningStandardItemRefIdType> learningStandardItemRefId;

    /**
     * Gets the value of the learningStandardItemRefId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningStandardItemRefId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningStandardItemRefId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedLearningStandardItemRefIdType }
     * 
     * 
     */
    public List<RelatedLearningStandardItemRefIdType> getLearningStandardItemRefId() {
        if (learningStandardItemRefId == null) {
            learningStandardItemRefId = new ArrayList<RelatedLearningStandardItemRefIdType>();
        }
        return this.learningStandardItemRefId;
    }

}
