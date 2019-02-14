
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FQContextualQuestionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQContextualQuestionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FQContextualQuestion" type="{http://www.sifassociation.org/datamodel/au/3.4}FQContextualQuestionType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FQContextualQuestionListType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "fqContextualQuestion"
})
public class FQContextualQuestionListType {

    @XmlElement(name = "FQContextualQuestion", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<FQContextualQuestionType> fqContextualQuestion;

    /**
     * Gets the value of the fqContextualQuestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fqContextualQuestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFQContextualQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FQContextualQuestionType }
     * 
     * 
     */
    public List<FQContextualQuestionType> getFQContextualQuestion() {
        if (fqContextualQuestion == null) {
            fqContextualQuestion = new ArrayList<FQContextualQuestionType>();
        }
        return this.fqContextualQuestion;
    }

}
