
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * References to LearningStandardItems.
 * 
 * <p>Java class for LearningStandardListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LearningStandardListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LearningStandard" type="{http://www.sifassociation.org/datamodel/au/3.4}LearningStandardType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LearningStandardListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "learningStandard"
})
public class LearningStandardListType {

    @XmlElement(name = "LearningStandard", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<LearningStandardType> learningStandard;

    /**
     * Gets the value of the learningStandard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningStandard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningStandard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearningStandardType }
     * 
     * 
     */
    public List<LearningStandardType> getLearningStandard() {
        if (learningStandard == null) {
            learningStandard = new ArrayList<LearningStandardType>();
        }
        return this.learningStandard;
    }

}
