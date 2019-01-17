
package sif.dd.au30.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentScoreJudgementAgainstStandardCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentScoreJudgementAgainstStandardCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentScoreJudgementAgainstStandard" type="{http://www.sifassociation.org/datamodel/au/3.4}StudentScoreJudgementAgainstStandardType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentScoreJudgementAgainstStandardCollectionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentScoreJudgementAgainstStandard"
})
public class StudentScoreJudgementAgainstStandardCollectionType {

    @XmlElement(name = "StudentScoreJudgementAgainstStandard", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected List<StudentScoreJudgementAgainstStandardType> studentScoreJudgementAgainstStandard;

    /**
     * Gets the value of the studentScoreJudgementAgainstStandard property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentScoreJudgementAgainstStandard property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentScoreJudgementAgainstStandard().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentScoreJudgementAgainstStandardType }
     * 
     * 
     */
    public List<StudentScoreJudgementAgainstStandardType> getStudentScoreJudgementAgainstStandard() {
        if (studentScoreJudgementAgainstStandard == null) {
            studentScoreJudgementAgainstStandard = new ArrayList<StudentScoreJudgementAgainstStandardType>();
        }
        return this.studentScoreJudgementAgainstStandard;
    }

}
