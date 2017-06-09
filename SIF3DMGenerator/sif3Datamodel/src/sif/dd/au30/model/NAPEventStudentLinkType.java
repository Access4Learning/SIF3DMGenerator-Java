
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for NAPEventStudentLinkType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPEventStudentLinkType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="PlatformStudentIdentifier" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolACARAId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="NAPTestRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="NAPTestLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="SchoolSector" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSchoolSectorCodeType" minOccurs="0"/>
 *         &lt;element name="System" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSchoolSystemType" minOccurs="0"/>
 *         &lt;element name="SchoolGeolocation" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsSchoolLocationType" minOccurs="0"/>
 *         &lt;element name="ReportingSchoolName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="NAPJurisdiction" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsNAPJurisdictionType" minOccurs="0"/>
 *         &lt;element name="ParticipationCode" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsNAPParticipationCodeType" minOccurs="0"/>
 *         &lt;element name="ParticipationText" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Device" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="LapsedTimeTest" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *         &lt;element name="ExemptionReason" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="PersonalDetailsChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PSIOtherIdMatch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PossibleDuplicate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DOBRange" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TestDisruptionList" type="{http://www.sifassociation.org/datamodel/au/3.4}TestDisruptionListType" minOccurs="0"/>
 *         &lt;element name="Adjustment" type="{http://www.sifassociation.org/datamodel/au/3.4}AdjustmentContainerType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/au/3.4}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/au/3.4}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NAPEventStudentLinkType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "studentPersonalRefId",
    "platformStudentIdentifier",
    "schoolInfoRefId",
    "schoolACARAId",
    "napTestRefId",
    "napTestLocalId",
    "schoolSector",
    "system",
    "schoolGeolocation",
    "reportingSchoolName",
    "napJurisdiction",
    "participationCode",
    "participationText",
    "device",
    "date",
    "startTime",
    "lapsedTimeTest",
    "exemptionReason",
    "personalDetailsChanged",
    "psiOtherIdMatch",
    "possibleDuplicate",
    "dobRange",
    "testDisruptionList",
    "adjustment",
    "sifMetadata",
    "sifExtendedElements"
})
public class NAPEventStudentLinkType {

    @XmlElementRef(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentPersonalRefId;
    @XmlElement(name = "PlatformStudentIdentifier", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String platformStudentIdentifier;
    @XmlElementRef(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolInfoRefId;
    @XmlElement(name = "SchoolACARAId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String schoolACARAId;
    @XmlElementRef(name = "NAPTestRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> napTestRefId;
    @XmlElement(name = "NAPTestLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String napTestLocalId;
    @XmlElement(name = "SchoolSector", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsSchoolSectorCodeType schoolSector;
    @XmlElementRef(name = "System", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> system;
    @XmlElementRef(name = "SchoolGeolocation", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolGeolocation;
    @XmlElementRef(name = "ReportingSchoolName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportingSchoolName;
    @XmlElementRef(name = "NAPJurisdiction", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> napJurisdiction;
    @XmlElement(name = "ParticipationCode", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected AUCodeSetsNAPParticipationCodeType participationCode;
    @XmlElement(name = "ParticipationText", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String participationText;
    @XmlElementRef(name = "Device", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> device;
    @XmlElement(name = "Date", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "StartTime", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "LapsedTimeTest", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected Duration lapsedTimeTest;
    @XmlElementRef(name = "ExemptionReason", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exemptionReason;
    @XmlElementRef(name = "PersonalDetailsChanged", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> personalDetailsChanged;
    @XmlElementRef(name = "PSIOtherIdMatch", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> psiOtherIdMatch;
    @XmlElementRef(name = "PossibleDuplicate", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> possibleDuplicate;
    @XmlElementRef(name = "DOBRange", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> dobRange;
    @XmlElementRef(name = "TestDisruptionList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<TestDisruptionListType> testDisruptionList;
    @XmlElementRef(name = "Adjustment", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AdjustmentContainerType> adjustment;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStudentPersonalRefId(JAXBElement<String> value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the platformStudentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformStudentIdentifier() {
        return platformStudentIdentifier;
    }

    /**
     * Sets the value of the platformStudentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformStudentIdentifier(String value) {
        this.platformStudentIdentifier = value;
    }

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolInfoRefId(JAXBElement<String> value) {
        this.schoolInfoRefId = value;
    }

    /**
     * Gets the value of the schoolACARAId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolACARAId() {
        return schoolACARAId;
    }

    /**
     * Sets the value of the schoolACARAId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolACARAId(String value) {
        this.schoolACARAId = value;
    }

    /**
     * Gets the value of the napTestRefId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAPTestRefId() {
        return napTestRefId;
    }

    /**
     * Sets the value of the napTestRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAPTestRefId(JAXBElement<String> value) {
        this.napTestRefId = value;
    }

    /**
     * Gets the value of the napTestLocalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAPTestLocalId() {
        return napTestLocalId;
    }

    /**
     * Sets the value of the napTestLocalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNAPTestLocalId(String value) {
        this.napTestLocalId = value;
    }

    /**
     * Gets the value of the schoolSector property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsSchoolSectorCodeType }
     *     
     */
    public AUCodeSetsSchoolSectorCodeType getSchoolSector() {
        return schoolSector;
    }

    /**
     * Sets the value of the schoolSector property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsSchoolSectorCodeType }
     *     
     */
    public void setSchoolSector(AUCodeSetsSchoolSectorCodeType value) {
        this.schoolSector = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSystem(JAXBElement<String> value) {
        this.system = value;
    }

    /**
     * Gets the value of the schoolGeolocation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSchoolGeolocation() {
        return schoolGeolocation;
    }

    /**
     * Sets the value of the schoolGeolocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSchoolGeolocation(JAXBElement<String> value) {
        this.schoolGeolocation = value;
    }

    /**
     * Gets the value of the reportingSchoolName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportingSchoolName() {
        return reportingSchoolName;
    }

    /**
     * Sets the value of the reportingSchoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportingSchoolName(JAXBElement<String> value) {
        this.reportingSchoolName = value;
    }

    /**
     * Gets the value of the napJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAPJurisdiction() {
        return napJurisdiction;
    }

    /**
     * Sets the value of the napJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAPJurisdiction(JAXBElement<String> value) {
        this.napJurisdiction = value;
    }

    /**
     * Gets the value of the participationCode property.
     * 
     * @return
     *     possible object is
     *     {@link AUCodeSetsNAPParticipationCodeType }
     *     
     */
    public AUCodeSetsNAPParticipationCodeType getParticipationCode() {
        return participationCode;
    }

    /**
     * Sets the value of the participationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AUCodeSetsNAPParticipationCodeType }
     *     
     */
    public void setParticipationCode(AUCodeSetsNAPParticipationCodeType value) {
        this.participationCode = value;
    }

    /**
     * Gets the value of the participationText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipationText() {
        return participationText;
    }

    /**
     * Sets the value of the participationText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipationText(String value) {
        this.participationText = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDevice(JAXBElement<String> value) {
        this.device = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the lapsedTimeTest property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getLapsedTimeTest() {
        return lapsedTimeTest;
    }

    /**
     * Sets the value of the lapsedTimeTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setLapsedTimeTest(Duration value) {
        this.lapsedTimeTest = value;
    }

    /**
     * Gets the value of the exemptionReason property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExemptionReason() {
        return exemptionReason;
    }

    /**
     * Sets the value of the exemptionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExemptionReason(JAXBElement<String> value) {
        this.exemptionReason = value;
    }

    /**
     * Gets the value of the personalDetailsChanged property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPersonalDetailsChanged() {
        return personalDetailsChanged;
    }

    /**
     * Sets the value of the personalDetailsChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPersonalDetailsChanged(JAXBElement<Boolean> value) {
        this.personalDetailsChanged = value;
    }

    /**
     * Gets the value of the psiOtherIdMatch property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPSIOtherIdMatch() {
        return psiOtherIdMatch;
    }

    /**
     * Sets the value of the psiOtherIdMatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPSIOtherIdMatch(JAXBElement<Boolean> value) {
        this.psiOtherIdMatch = value;
    }

    /**
     * Gets the value of the possibleDuplicate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPossibleDuplicate() {
        return possibleDuplicate;
    }

    /**
     * Sets the value of the possibleDuplicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPossibleDuplicate(JAXBElement<Boolean> value) {
        this.possibleDuplicate = value;
    }

    /**
     * Gets the value of the dobRange property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDOBRange() {
        return dobRange;
    }

    /**
     * Sets the value of the dobRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDOBRange(JAXBElement<Boolean> value) {
        this.dobRange = value;
    }

    /**
     * Gets the value of the testDisruptionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TestDisruptionListType }{@code >}
     *     
     */
    public JAXBElement<TestDisruptionListType> getTestDisruptionList() {
        return testDisruptionList;
    }

    /**
     * Sets the value of the testDisruptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TestDisruptionListType }{@code >}
     *     
     */
    public void setTestDisruptionList(JAXBElement<TestDisruptionListType> value) {
        this.testDisruptionList = value;
    }

    /**
     * Gets the value of the adjustment property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdjustmentContainerType }{@code >}
     *     
     */
    public JAXBElement<AdjustmentContainerType> getAdjustment() {
        return adjustment;
    }

    /**
     * Sets the value of the adjustment property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdjustmentContainerType }{@code >}
     *     
     */
    public void setAdjustment(JAXBElement<AdjustmentContainerType> value) {
        this.adjustment = value;
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
     * Gets the value of the refId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefId() {
        return refId;
    }

    /**
     * Sets the value of the refId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefId(String value) {
        this.refId = value;
    }

}
