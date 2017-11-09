
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for StudentSubjectChoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSubjectChoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreferenceNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="SubjectLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType"/>
 *         &lt;element name="StudyDescription" type="{http://www.sifassociation.org/datamodel/au/3.4}SubjectAreaType" minOccurs="0"/>
 *         &lt;element name="OtherSchoolLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSubjectChoiceType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "preferenceNumber",
    "subjectLocalId",
    "studyDescription",
    "otherSchoolLocalId"
})
public class StudentSubjectChoiceType {

    @XmlElementRef(name = "PreferenceNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> preferenceNumber;
    @XmlElement(name = "SubjectLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String subjectLocalId;
    @XmlElementRef(name = "StudyDescription", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SubjectAreaType> studyDescription;
    @XmlElementRef(name = "OtherSchoolLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> otherSchoolLocalId;

    /**
     * Gets the value of the preferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPreferenceNumber() {
        return preferenceNumber;
    }

    /**
     * Sets the value of the preferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPreferenceNumber(JAXBElement<Long> value) {
        this.preferenceNumber = value;
    }

    /**
     * Gets the value of the subjectLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubjectLocalId() {
        return subjectLocalId;
    }

    /**
     * Sets the value of the subjectLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubjectLocalId(String value) {
        this.subjectLocalId = value;
    }

    /**
     * Gets the value of the studyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SubjectAreaType }{@code >}
     *     
     */
    public JAXBElement<SubjectAreaType> getStudyDescription() {
        return studyDescription;
    }

    /**
     * Sets the value of the studyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SubjectAreaType }{@code >}
     *     
     */
    public void setStudyDescription(JAXBElement<SubjectAreaType> value) {
        this.studyDescription = value;
    }

    /**
     * Gets the value of the otherSchoolLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherSchoolLocalId() {
        return otherSchoolLocalId;
    }

    /**
     * Sets the value of the otherSchoolLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherSchoolLocalId(JAXBElement<String> value) {
        this.otherSchoolLocalId = value;
    }

}
