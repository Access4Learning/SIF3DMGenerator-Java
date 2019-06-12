
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssessmentPerformanceHistoryListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssessmentPerformanceHistoryListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Assessment" type="{http://www.sifassociation.org/datamodel/na/4.x}AssessmentPerformanceHistoryType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssessmentPerformanceHistoryListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "assessment"
})
public class AssessmentPerformanceHistoryListType {

    @XmlElement(name = "Assessment", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<AssessmentPerformanceHistoryType> assessment;

    /**
     * Gets the value of the assessment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentPerformanceHistoryType }
     * 
     * 
     */
    public List<AssessmentPerformanceHistoryType> getAssessment() {
        if (assessment == null) {
            assessment = new ArrayList<AssessmentPerformanceHistoryType>();
        }
        return this.assessment;
    }

}
