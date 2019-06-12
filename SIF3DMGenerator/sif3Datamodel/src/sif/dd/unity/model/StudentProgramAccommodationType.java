
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StudentProgramAccommodationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentProgramAccommodationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentParticipationRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="StudentProgramType" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentProgramTypeType"/>
 *         &lt;element name="Accommodations" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentProgramAccommodationAccommodationListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentProgramAccommodationType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentParticipationRefId",
    "studentProgramType",
    "accommodations"
})
public class StudentProgramAccommodationType {

    @XmlElement(name = "StudentParticipationRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentParticipationRefId;
    @XmlElement(name = "StudentProgramType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StudentProgramTypeType studentProgramType;
    @XmlElement(name = "Accommodations", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StudentProgramAccommodationAccommodationListType accommodations;

    /**
     * Gets the value of the studentParticipationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentParticipationRefId() {
        return studentParticipationRefId;
    }

    /**
     * Sets the value of the studentParticipationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentParticipationRefId(String value) {
        this.studentParticipationRefId = value;
    }

    /**
     * Gets the value of the studentProgramType property.
     * 
     * @return
     *     possible object is
     *     {@link StudentProgramTypeType }
     *     
     */
    public StudentProgramTypeType getStudentProgramType() {
        return studentProgramType;
    }

    /**
     * Sets the value of the studentProgramType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentProgramTypeType }
     *     
     */
    public void setStudentProgramType(StudentProgramTypeType value) {
        this.studentProgramType = value;
    }

    /**
     * Gets the value of the accommodations property.
     * 
     * @return
     *     possible object is
     *     {@link StudentProgramAccommodationAccommodationListType }
     *     
     */
    public StudentProgramAccommodationAccommodationListType getAccommodations() {
        return accommodations;
    }

    /**
     * Sets the value of the accommodations property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentProgramAccommodationAccommodationListType }
     *     
     */
    public void setAccommodations(StudentProgramAccommodationAccommodationListType value) {
        this.accommodations = value;
    }

}
