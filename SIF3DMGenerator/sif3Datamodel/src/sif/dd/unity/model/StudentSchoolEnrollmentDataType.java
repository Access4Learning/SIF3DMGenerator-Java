
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StudentSchoolEnrollmentDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSchoolEnrollmentDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GradeLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelType"/>
 *         &lt;element name="Advisor" type="{http://www.sifassociation.org/datamodel/na/4.x}StaffPersonalDataSummaryType" minOccurs="0"/>
 *         &lt;element name="Counselor" type="{http://www.sifassociation.org/datamodel/na/4.x}StaffPersonalDataSummaryType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SchoolAttendedRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSchoolEnrollmentDataType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "gradeLevel",
    "advisor",
    "counselor",
    "sifExtendedElements"
})
public class StudentSchoolEnrollmentDataType {

    @XmlElement(name = "GradeLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected GradeLevelType gradeLevel;
    @XmlElement(name = "Advisor", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StaffPersonalDataSummaryType advisor;
    @XmlElement(name = "Counselor", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StaffPersonalDataSummaryType counselor;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "SchoolAttendedRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolAttendedRefId;

    /**
     * Gets the value of the gradeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link GradeLevelType }
     *     
     */
    public GradeLevelType getGradeLevel() {
        return gradeLevel;
    }

    /**
     * Sets the value of the gradeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link GradeLevelType }
     *     
     */
    public void setGradeLevel(GradeLevelType value) {
        this.gradeLevel = value;
    }

    /**
     * Gets the value of the advisor property.
     * 
     * @return
     *     possible object is
     *     {@link StaffPersonalDataSummaryType }
     *     
     */
    public StaffPersonalDataSummaryType getAdvisor() {
        return advisor;
    }

    /**
     * Sets the value of the advisor property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffPersonalDataSummaryType }
     *     
     */
    public void setAdvisor(StaffPersonalDataSummaryType value) {
        this.advisor = value;
    }

    /**
     * Gets the value of the counselor property.
     * 
     * @return
     *     possible object is
     *     {@link StaffPersonalDataSummaryType }
     *     
     */
    public StaffPersonalDataSummaryType getCounselor() {
        return counselor;
    }

    /**
     * Sets the value of the counselor property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffPersonalDataSummaryType }
     *     
     */
    public void setCounselor(StaffPersonalDataSummaryType value) {
        this.counselor = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
        this.sifExtendedElements = value;
    }

    /**
     * Gets the value of the schoolAttendedRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAttendedRefId() {
        return schoolAttendedRefId;
    }

    /**
     * Sets the value of the schoolAttendedRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAttendedRefId(String value) {
        this.schoolAttendedRefId = value;
    }

}
