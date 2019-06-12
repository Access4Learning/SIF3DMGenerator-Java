
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentSpecialEducationSummaryStudentParticipationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSpecialEducationSummaryStudentParticipationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentParticipationData" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentSpecialEducationSummaryStudentParticipationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSpecialEducationSummaryStudentParticipationListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentParticipationData"
})
public class StudentSpecialEducationSummaryStudentParticipationListType {

    @XmlElement(name = "StudentParticipationData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected List<StudentSpecialEducationSummaryStudentParticipationType> studentParticipationData;

    /**
     * Gets the value of the studentParticipationData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentParticipationData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentParticipationData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentSpecialEducationSummaryStudentParticipationType }
     * 
     * 
     */
    public List<StudentSpecialEducationSummaryStudentParticipationType> getStudentParticipationData() {
        if (studentParticipationData == null) {
            studentParticipationData = new ArrayList<StudentSpecialEducationSummaryStudentParticipationType>();
        }
        return this.studentParticipationData;
    }

}
