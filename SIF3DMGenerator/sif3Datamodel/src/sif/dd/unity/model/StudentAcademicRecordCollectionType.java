
package sif.dd.unity.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StudentAcademicRecordCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentAcademicRecordCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentAcademicRecord" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentAcademicRecordType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentAcademicRecordCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentAcademicRecord"
})
public class StudentAcademicRecordCollectionType {

    @XmlElement(name = "StudentAcademicRecord", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    protected List<StudentAcademicRecordType> studentAcademicRecord;

    /**
     * Gets the value of the studentAcademicRecord property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the studentAcademicRecord property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStudentAcademicRecord().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StudentAcademicRecordType }
     * 
     * 
     */
    public List<StudentAcademicRecordType> getStudentAcademicRecord() {
        if (studentAcademicRecord == null) {
            studentAcademicRecord = new ArrayList<StudentAcademicRecordType>();
        }
        return this.studentAcademicRecord;
    }

}
