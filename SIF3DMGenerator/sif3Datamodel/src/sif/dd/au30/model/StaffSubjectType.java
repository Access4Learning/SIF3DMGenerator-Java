
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StaffSubjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StaffSubjectType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PreferenceNumber" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="SubjectLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="TimeTableSubjectRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StaffSubjectType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "preferenceNumber",
    "subjectLocalId",
    "timeTableSubjectRefId"
})
public class StaffSubjectType {

    @XmlElement(name = "PreferenceNumber", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "unsignedInt")
    protected long preferenceNumber;
    @XmlElementRef(name = "SubjectLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subjectLocalId;
    @XmlElementRef(name = "TimeTableSubjectRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timeTableSubjectRefId;

    /**
     * Gets the value of the preferenceNumber property.
     * 
     */
    public long getPreferenceNumber() {
        return preferenceNumber;
    }

    /**
     * Sets the value of the preferenceNumber property.
     * 
     */
    public void setPreferenceNumber(long value) {
        this.preferenceNumber = value;
    }

    /**
     * Gets the value of the subjectLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubjectLocalId() {
        return subjectLocalId;
    }

    /**
     * Sets the value of the subjectLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubjectLocalId(JAXBElement<String> value) {
        this.subjectLocalId = value;
    }

    /**
     * Gets the value of the timeTableSubjectRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimeTableSubjectRefId() {
        return timeTableSubjectRefId;
    }

    /**
     * Sets the value of the timeTableSubjectRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimeTableSubjectRefId(JAXBElement<String> value) {
        this.timeTableSubjectRefId = value;
    }

}
