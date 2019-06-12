
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentSchoolEnrollmentSummaryListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSchoolEnrollmentSummaryListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentSchoolEnrollmentData" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentSchoolEnrollmentSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSchoolEnrollmentSummaryListType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentSchoolEnrollmentData"
})
public class StudentSchoolEnrollmentSummaryListType {

    @XmlElement(name = "StudentSchoolEnrollmentData", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<StudentSchoolEnrollmentSummaryType> studentSchoolEnrollmentData;

    /**
     * Gets the value of the studentSchoolEnrollmentData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentSchoolEnrollmentData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentSchoolEnrollmentData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentSchoolEnrollmentSummaryType }
     * 
     * 
     */
    public List<StudentSchoolEnrollmentSummaryType> getStudentSchoolEnrollmentData() {
        if (studentSchoolEnrollmentData == null) {
            studentSchoolEnrollmentData = new ArrayList<StudentSchoolEnrollmentSummaryType>();
        }
        return this.studentSchoolEnrollmentData;
    }

}
