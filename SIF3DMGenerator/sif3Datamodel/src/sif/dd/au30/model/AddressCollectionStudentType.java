
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AddressCollectionStudentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressCollectionStudentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="EducationLevel" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsEducationLevelType" minOccurs="0"/>
 *         &lt;element name="BoardingStatus" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsBoardingType" minOccurs="0"/>
 *         &lt;element name="ReportingParent2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="N"/>
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="U"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StudentAddress" type="{http://www.sifassociation.org/datamodel/au/3.4}AddressType" minOccurs="0"/>
 *         &lt;element name="Parent1" type="{http://www.sifassociation.org/datamodel/au/3.4}AGParentType" minOccurs="0"/>
 *         &lt;element name="Parent2" type="{http://www.sifassociation.org/datamodel/au/3.4}AGParentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressCollectionStudentType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "localId",
    "educationLevel",
    "boardingStatus",
    "reportingParent2",
    "studentAddress",
    "parent1",
    "parent2"
})
public class AddressCollectionStudentType {

    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElement(name = "EducationLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsEducationLevelType educationLevel;
    @XmlElementRef(name = "BoardingStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsBoardingType> boardingStatus;
    @XmlElement(name = "ReportingParent2", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String reportingParent2;
    @XmlElement(name = "StudentAddress", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AddressType studentAddress;
    @XmlElement(name = "Parent1", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AGParentType parent1;
    @XmlElementRef(name = "Parent2", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AGParentType> parent2;

    /**
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalId(String value) {
        this.localId = value;
    }

    /**
     * Gets the value of the educationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsEducationLevelType }
     *     
     */
    public AUCodeSetsEducationLevelType getEducationLevel() {
        return educationLevel;
    }

    /**
     * Sets the value of the educationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsEducationLevelType }
     *     
     */
    public void setEducationLevel(AUCodeSetsEducationLevelType value) {
        this.educationLevel = value;
    }

    /**
     * Gets the value of the boardingStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsBoardingType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsBoardingType> getBoardingStatus() {
        return boardingStatus;
    }

    /**
     * Sets the value of the boardingStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsBoardingType }{@code >}
     *     
     */
    public void setBoardingStatus(JAXBElement<AUCodeSetsBoardingType> value) {
        this.boardingStatus = value;
    }

    /**
     * Gets the value of the reportingParent2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingParent2() {
        return reportingParent2;
    }

    /**
     * Sets the value of the reportingParent2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingParent2(String value) {
        this.reportingParent2 = value;
    }

    /**
     * Gets the value of the studentAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getStudentAddress() {
        return studentAddress;
    }

    /**
     * Sets the value of the studentAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setStudentAddress(AddressType value) {
        this.studentAddress = value;
    }

    /**
     * Gets the value of the parent1 property.
     * 
     * @return
     *     possible object is
     *     {@link AGParentType }
     *     
     */
    public AGParentType getParent1() {
        return parent1;
    }

    /**
     * Sets the value of the parent1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link AGParentType }
     *     
     */
    public void setParent1(AGParentType value) {
        this.parent1 = value;
    }

    /**
     * Gets the value of the parent2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AGParentType }{@code >}
     *     
     */
    public JAXBElement<AGParentType> getParent2() {
        return parent2;
    }

    /**
     * Sets the value of the parent2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AGParentType }{@code >}
     *     
     */
    public void setParent2(JAXBElement<AGParentType> value) {
        this.parent2 = value;
    }

}
