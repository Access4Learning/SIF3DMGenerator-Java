
package sif.dd.us33.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for learningStandardDocumentCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="learningStandardDocumentCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learningStandardDocument" type="{http://www.sifassociation.org/datamodel/na/3.3}learningStandardDocumentType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "learningStandardDocumentCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "learningStandardDocument"
})
public class LearningStandardDocumentCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected List<LearningStandardDocumentType> learningStandardDocument;

    /**
     * Gets the value of the learningStandardDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the learningStandardDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLearningStandardDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LearningStandardDocumentType }
     * 
     * 
     */
    public List<LearningStandardDocumentType> getLearningStandardDocument() {
        if (learningStandardDocument == null) {
            learningStandardDocument = new ArrayList<LearningStandardDocumentType>();
        }
        return this.learningStandardDocument;
    }

}
