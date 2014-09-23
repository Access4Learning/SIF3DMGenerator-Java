
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assessmentScoreTableCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assessmentScoreTableCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assessmentScoreTable" type="{http://www.sifassociation.org/datamodel/na/3.2}assessmentScoreTableType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assessmentScoreTableCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "assessmentScoreTable"
})
public class AssessmentScoreTableCollectionType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected List<AssessmentScoreTableType> assessmentScoreTable;

    /**
     * Gets the value of the assessmentScoreTable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assessmentScoreTable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssessmentScoreTable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssessmentScoreTableType }
     * 
     * 
     */
    public List<AssessmentScoreTableType> getAssessmentScoreTable() {
        if (assessmentScoreTable == null) {
            assessmentScoreTable = new ArrayList<AssessmentScoreTableType>();
        }
        return this.assessmentScoreTable;
    }

}
