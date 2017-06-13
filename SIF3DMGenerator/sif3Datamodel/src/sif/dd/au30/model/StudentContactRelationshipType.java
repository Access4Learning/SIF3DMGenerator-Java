
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 *       This object defines a relationship between a contact person and a student.
 *     
 * 
 * <p>Java class for StudentContactRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentContactRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType"/>
 *         &lt;element name="StudentContactPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType"/>
 *         &lt;element name="Relationship" type="{http://www.sifassociation.org/datamodel/au/3.4}RelationshipType"/>
 *         &lt;element name="ParentRelationshipStatus" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;enumeration value="Parent1"/>
 *               &lt;enumeration value="Parent2"/>
 *               &lt;enumeration value="NotForReporting"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="HouseholdList" type="{http://www.sifassociation.org/datamodel/au/3.4}HouseholdListType" minOccurs="0"/>
 *         &lt;element name="ContactFlags" type="{http://www.sifassociation.org/datamodel/au/3.4}ContactFlagsType" minOccurs="0"/>
 *         &lt;element name="MainlySpeaksEnglishAtHome" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="ContactSequence" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="ContactSequenceSource" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSourceCodeTypeType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="StudentContactRelationshipRefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentContactRelationshipType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentPersonalRefId",
    "studentContactPersonalRefId",
    "relationship",
    "parentRelationshipStatus",
    "householdList",
    "contactFlags",
    "mainlySpeaksEnglishAtHome",
    "contactSequence",
    "contactSequenceSource",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentContactRelationshipType {

    @XmlElement(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlElement(name = "StudentContactPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentContactPersonalRefId;
    @XmlElement(name = "Relationship", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected RelationshipType relationship;
    @XmlElementRef(name = "ParentRelationshipStatus", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentRelationshipStatus;
    @XmlElementRef(name = "HouseholdList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<HouseholdListType> householdList;
    @XmlElementRef(name = "ContactFlags", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<ContactFlagsType> contactFlags;
    @XmlElementRef(name = "MainlySpeaksEnglishAtHome", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> mainlySpeaksEnglishAtHome;
    @XmlElementRef(name = "ContactSequence", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> contactSequence;
    @XmlElementRef(name = "ContactSequenceSource", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsSourceCodeTypeType> contactSequenceSource;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "StudentContactRelationshipRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentContactRelationshipRefId;

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the studentContactPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentContactPersonalRefId() {
        return studentContactPersonalRefId;
    }

    /**
     * Sets the value of the studentContactPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentContactPersonalRefId(String value) {
        this.studentContactPersonalRefId = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType }
     *     
     */
    public RelationshipType getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType }
     *     
     */
    public void setRelationship(RelationshipType value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the parentRelationshipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentRelationshipStatus() {
        return parentRelationshipStatus;
    }

    /**
     * Sets the value of the parentRelationshipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentRelationshipStatus(JAXBElement<String> value) {
        this.parentRelationshipStatus = value;
    }

    /**
     * Gets the value of the householdList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link HouseholdListType }{@code >}
     *     
     */
    public JAXBElement<HouseholdListType> getHouseholdList() {
        return householdList;
    }

    /**
     * Sets the value of the householdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link HouseholdListType }{@code >}
     *     
     */
    public void setHouseholdList(JAXBElement<HouseholdListType> value) {
        this.householdList = value;
    }

    /**
     * Gets the value of the contactFlags property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ContactFlagsType }{@code >}
     *     
     */
    public JAXBElement<ContactFlagsType> getContactFlags() {
        return contactFlags;
    }

    /**
     * Sets the value of the contactFlags property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ContactFlagsType }{@code >}
     *     
     */
    public void setContactFlags(JAXBElement<ContactFlagsType> value) {
        this.contactFlags = value;
    }

    /**
     * Gets the value of the mainlySpeaksEnglishAtHome property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getMainlySpeaksEnglishAtHome() {
        return mainlySpeaksEnglishAtHome;
    }

    /**
     * Sets the value of the mainlySpeaksEnglishAtHome property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setMainlySpeaksEnglishAtHome(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.mainlySpeaksEnglishAtHome = value;
    }

    /**
     * Gets the value of the contactSequence property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getContactSequence() {
        return contactSequence;
    }

    /**
     * Sets the value of the contactSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setContactSequence(JAXBElement<Long> value) {
        this.contactSequence = value;
    }

    /**
     * Gets the value of the contactSequenceSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsSourceCodeTypeType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsSourceCodeTypeType> getContactSequenceSource() {
        return contactSequenceSource;
    }

    /**
     * Sets the value of the contactSequenceSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsSourceCodeTypeType }{@code >}
     *     
     */
    public void setContactSequenceSource(JAXBElement<AUCodeSetsSourceCodeTypeType> value) {
        this.contactSequenceSource = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public JAXBElement<SIFMetadataType> getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFMetadataType }{@code >}
     *     
     */
    public void setSIFMetadata(JAXBElement<SIFMetadataType> value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public JAXBElement<SIFExtendedElementsType> getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SIFExtendedElementsType }{@code >}
     *     
     */
    public void setSIFExtendedElements(JAXBElement<SIFExtendedElementsType> value) {
        this.sifExtendedElements = value;
    }

    /**
     * Gets the value of the studentContactRelationshipRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentContactRelationshipRefId() {
        return studentContactRelationshipRefId;
    }

    /**
     * Sets the value of the studentContactRelationshipRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentContactRelationshipRefId(String value) {
        this.studentContactRelationshipRefId = value;
    }

}
