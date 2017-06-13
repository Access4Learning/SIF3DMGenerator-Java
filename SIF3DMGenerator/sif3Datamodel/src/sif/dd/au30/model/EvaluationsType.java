
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Evaluations/review of the resource.
 * 
 * <p>Java class for EvaluationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EvaluationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Evaluation" type="{http://www.sifassociation.org/datamodel/au/3.4}EvaluationType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EvaluationsType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "evaluation"
})
public class EvaluationsType {

    @XmlElement(name = "Evaluation", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<EvaluationType> evaluation;

    /**
     * Gets the value of the evaluation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evaluation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvaluation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvaluationType }
     * 
     * 
     */
    public List<EvaluationType> getEvaluation() {
        if (evaluation == null) {
            evaluation = new ArrayList<EvaluationType>();
        }
        return this.evaluation;
    }

}
