
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AGContextualQuestionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AGContextualQuestionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AGContextualQuestion" type="{http://www.sifassociation.org/datamodel/au/3.4}AGContextualQuestionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AGContextualQuestionListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "agContextualQuestion"
})
public class AGContextualQuestionListType {

    @XmlElement(name = "AGContextualQuestion", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<AGContextualQuestionType> agContextualQuestion;

    /**
     * Gets the value of the agContextualQuestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agContextualQuestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAGContextualQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AGContextualQuestionType }
     * 
     * 
     */
    public List<AGContextualQuestionType> getAGContextualQuestion() {
        if (agContextualQuestion == null) {
            agContextualQuestion = new ArrayList<AGContextualQuestionType>();
        }
        return this.agContextualQuestion;
    }

}
