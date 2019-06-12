
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentItemChoiceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentItemChoiceListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Choice" type="{http://www.sifassociation.org/datamodel/na/4.x}AssessmentItemChoiceType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentItemChoiceListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "choice"
})
public class AssessmentItemChoiceListType {

    @XmlElement(name = "Choice", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<AssessmentItemChoiceType> choice;

    /**
     * Gets the value of the choice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the choice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChoice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentItemChoiceType }
     * 
     * 
     */
    public List<AssessmentItemChoiceType> getChoice() {
        if (choice == null) {
            choice = new ArrayList<AssessmentItemChoiceType>();
        }
        return this.choice;
    }

}
