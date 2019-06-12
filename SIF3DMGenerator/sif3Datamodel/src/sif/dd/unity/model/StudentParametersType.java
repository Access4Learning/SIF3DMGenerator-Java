
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/datamodel/na/4.x}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/na/4.x}LocalIdType" minOccurs="0"/>
 *         &lt;element name="SIF_RefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="GradeLevel" type="{http://www.sifassociation.org/datamodel/na/4.x}GradeLevelType" minOccurs="0"/>
 *         &lt;element name="SSN" type="{http://www.sifassociation.org/datamodel/na/4.x}SSNType" minOccurs="0"/>
 *         &lt;element name="Names" type="{http://www.sifassociation.org/datamodel/na/4.x}NamesType" minOccurs="0"/>
 *         &lt;element name="Addresses" type="{http://www.sifassociation.org/datamodel/na/4.x}AddressListType" minOccurs="0"/>
 *         &lt;element name="Demographics" type="{http://www.sifassociation.org/datamodel/na/4.x}DemographicsType" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{http://www.sifassociation.org/datamodel/na/4.x}ContactRelationshipsType" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="GraduationDate" type="{http://www.sifassociation.org/datamodel/na/4.x}GraduationDateType" minOccurs="0"/>
 *         &lt;element name="SchoolAttendedName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SchoolAttendedLocation" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="OtherIdList" type="{http://www.sifassociation.org/datamodel/na/4.x}OtherIdListType" minOccurs="0"/>
 *         &lt;element name="TimeElement" type="{http://www.sifassociation.org/datamodel/na/4.x}TimeElementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentParametersType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "stateProvinceId",
    "localId",
    "sifRefId",
    "gradeLevel",
    "ssn",
    "names",
    "addresses",
    "demographics",
    "contacts",
    "effectiveDate",
    "startDate",
    "endDate",
    "graduationDate",
    "schoolAttendedName",
    "schoolAttendedLocation",
    "otherIdList",
    "timeElement"
})
public class StudentParametersType {

    @XmlElement(name = "StateProvinceId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String stateProvinceId;
    @XmlElement(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String localId;
    @XmlElement(name = "SIF_RefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sifRefId;
    @XmlElement(name = "GradeLevel", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected GradeLevelType gradeLevel;
    @XmlElement(name = "SSN", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ssn;
    @XmlElement(name = "Names", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected NamesType names;
    @XmlElement(name = "Addresses", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected AddressListType addresses;
    @XmlElement(name = "Demographics", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DemographicsType demographics;
    @XmlElement(name = "Contacts", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected ContactRelationshipsType contacts;
    @XmlElement(name = "EffectiveDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "StartDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(name = "EndDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "GraduationDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String graduationDate;
    @XmlElement(name = "SchoolAttendedName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schoolAttendedName;
    @XmlElement(name = "SchoolAttendedLocation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String schoolAttendedLocation;
    @XmlElement(name = "OtherIdList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OtherIdListType otherIdList;
    @XmlElement(name = "TimeElement", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TimeElementType timeElement;

    /**
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceId(String value) {
        this.stateProvinceId = value;
    }

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
     * Gets the value of the sifRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFRefId() {
        return sifRefId;
    }

    /**
     * Sets the value of the sifRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFRefId(String value) {
        this.sifRefId = value;
    }

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
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the names property.
     * 
     * @return
     *     possible object is
     *     {@link NamesType }
     *     
     */
    public NamesType getNames() {
        return names;
    }

    /**
     * Sets the value of the names property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamesType }
     *     
     */
    public void setNames(NamesType value) {
        this.names = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link AddressListType }
     *     
     */
    public AddressListType getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressListType }
     *     
     */
    public void setAddresses(AddressListType value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the demographics property.
     * 
     * @return
     *     possible object is
     *     {@link DemographicsType }
     *     
     */
    public DemographicsType getDemographics() {
        return demographics;
    }

    /**
     * Sets the value of the demographics property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemographicsType }
     *     
     */
    public void setDemographics(DemographicsType value) {
        this.demographics = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ContactRelationshipsType }
     *     
     */
    public ContactRelationshipsType getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactRelationshipsType }
     *     
     */
    public void setContacts(ContactRelationshipsType value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the graduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraduationDate() {
        return graduationDate;
    }

    /**
     * Sets the value of the graduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraduationDate(String value) {
        this.graduationDate = value;
    }

    /**
     * Gets the value of the schoolAttendedName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAttendedName() {
        return schoolAttendedName;
    }

    /**
     * Sets the value of the schoolAttendedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAttendedName(String value) {
        this.schoolAttendedName = value;
    }

    /**
     * Gets the value of the schoolAttendedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAttendedLocation() {
        return schoolAttendedLocation;
    }

    /**
     * Sets the value of the schoolAttendedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAttendedLocation(String value) {
        this.schoolAttendedLocation = value;
    }

    /**
     * Gets the value of the otherIdList property.
     * 
     * @return
     *     possible object is
     *     {@link OtherIdListType }
     *     
     */
    public OtherIdListType getOtherIdList() {
        return otherIdList;
    }

    /**
     * Sets the value of the otherIdList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherIdListType }
     *     
     */
    public void setOtherIdList(OtherIdListType value) {
        this.otherIdList = value;
    }

    /**
     * Gets the value of the timeElement property.
     * 
     * @return
     *     possible object is
     *     {@link TimeElementType }
     *     
     */
    public TimeElementType getTimeElement() {
        return timeElement;
    }

    /**
     * Sets the value of the timeElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeElementType }
     *     
     */
    public void setTimeElement(TimeElementType value) {
        this.timeElement = value;
    }

}
