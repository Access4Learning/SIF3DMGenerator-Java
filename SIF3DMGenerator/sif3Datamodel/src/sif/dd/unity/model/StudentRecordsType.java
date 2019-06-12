
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StudentRecordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentRecordsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentDemographicRecordRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType"/>
 *         &lt;element name="StudentAcademicRecordRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="StudentSpecialEducationRecordRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="OtherRecords" type="{http://www.sifassociation.org/datamodel/na/4.x}OtherStudentRecordListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentRecordsType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentDemographicRecordRefId",
    "studentAcademicRecordRefId",
    "studentSpecialEducationRecordRefId",
    "otherRecords"
})
public class StudentRecordsType {

    @XmlElement(name = "StudentDemographicRecordRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentDemographicRecordRefId;
    @XmlElement(name = "StudentAcademicRecordRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentAcademicRecordRefId;
    @XmlElement(name = "StudentSpecialEducationRecordRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentSpecialEducationRecordRefId;
    @XmlElement(name = "OtherRecords", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OtherStudentRecordListType otherRecords;

    /**
     * Gets the value of the studentDemographicRecordRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentDemographicRecordRefId() {
        return studentDemographicRecordRefId;
    }

    /**
     * Sets the value of the studentDemographicRecordRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentDemographicRecordRefId(String value) {
        this.studentDemographicRecordRefId = value;
    }

    /**
     * Gets the value of the studentAcademicRecordRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentAcademicRecordRefId() {
        return studentAcademicRecordRefId;
    }

    /**
     * Sets the value of the studentAcademicRecordRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentAcademicRecordRefId(String value) {
        this.studentAcademicRecordRefId = value;
    }

    /**
     * Gets the value of the studentSpecialEducationRecordRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentSpecialEducationRecordRefId() {
        return studentSpecialEducationRecordRefId;
    }

    /**
     * Sets the value of the studentSpecialEducationRecordRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentSpecialEducationRecordRefId(String value) {
        this.studentSpecialEducationRecordRefId = value;
    }

    /**
     * Gets the value of the otherRecords property.
     * 
     * @return
     *     possible object is
     *     {@link OtherStudentRecordListType }
     *     
     */
    public OtherStudentRecordListType getOtherRecords() {
        return otherRecords;
    }

    /**
     * Sets the value of the otherRecords property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherStudentRecordListType }
     *     
     */
    public void setOtherRecords(OtherStudentRecordListType value) {
        this.otherRecords = value;
    }

}
