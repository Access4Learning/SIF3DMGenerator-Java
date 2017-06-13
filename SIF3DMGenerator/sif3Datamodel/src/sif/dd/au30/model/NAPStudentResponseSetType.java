
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


/**
 * Capture of student’s responses to a NAP test.
 * 
 * <p>Java class for NAPStudentResponseSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NAPStudentResponseSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportExclusionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CalibrationSampleFlag" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="EquatingSampleFlag" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="PathTakenForDomain" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="ParallelTest" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="StudentPersonalRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="PlatformStudentIdentifier" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType"/>
 *         &lt;element name="NAPTestRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="NAPTestLocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType"/>
 *         &lt;element name="DomainScore" type="{http://www.sifassociation.org/datamodel/au/3.4}DomainScoreType"/>
 *         &lt;element name="TestletList" type="{http://www.sifassociation.org/datamodel/au/3.4}NAPStudentResponseTestletListType"/>
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
@XmlType(name = "NAPStudentResponseSetType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "reportExclusionFlag",
    "calibrationSampleFlag",
    "equatingSampleFlag",
    "pathTakenForDomain",
    "parallelTest",
    "studentPersonalRefId",
    "platformStudentIdentifier",
    "napTestRefId",
    "napTestLocalId",
    "domainScore",
    "testletList",
    "sifMetadata",
    "sifExtendedElements"
})
public class NAPStudentResponseSetType {

    @XmlElement(name = "ReportExclusionFlag", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected boolean reportExclusionFlag;
    @XmlElementRef(name = "CalibrationSampleFlag", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> calibrationSampleFlag;
    @XmlElementRef(name = "EquatingSampleFlag", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> equatingSampleFlag;
    @XmlElement(name = "PathTakenForDomain", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pathTakenForDomain;
    @XmlElement(name = "ParallelTest", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String parallelTest;
    @XmlElementRef(name = "StudentPersonalRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> studentPersonalRefId;
    @XmlElement(name = "PlatformStudentIdentifier", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String platformStudentIdentifier;
    @XmlElementRef(name = "NAPTestRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> napTestRefId;
    @XmlElement(name = "NAPTestLocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String napTestLocalId;
    @XmlElement(name = "DomainScore", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected DomainScoreType domainScore;
    @XmlElement(name = "TestletList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected NAPStudentResponseTestletListType testletList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the reportExclusionFlag property.
     * 
     */
    public boolean isReportExclusionFlag() {
        return reportExclusionFlag;
    }

    /**
     * Sets the value of the reportExclusionFlag property.
     * 
     */
    public void setReportExclusionFlag(boolean value) {
        this.reportExclusionFlag = value;
    }

    /**
     * Gets the value of the calibrationSampleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCalibrationSampleFlag() {
        return calibrationSampleFlag;
    }

    /**
     * Sets the value of the calibrationSampleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCalibrationSampleFlag(JAXBElement<String> value) {
        this.calibrationSampleFlag = value;
    }

    /**
     * Gets the value of the equatingSampleFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEquatingSampleFlag() {
        return equatingSampleFlag;
    }

    /**
     * Sets the value of the equatingSampleFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEquatingSampleFlag(JAXBElement<String> value) {
        this.equatingSampleFlag = value;
    }

    /**
     * Gets the value of the pathTakenForDomain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPathTakenForDomain() {
        return pathTakenForDomain;
    }

    /**
     * Sets the value of the pathTakenForDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPathTakenForDomain(String value) {
        this.pathTakenForDomain = value;
    }

    /**
     * Gets the value of the parallelTest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParallelTest() {
        return parallelTest;
    }

    /**
     * Sets the value of the parallelTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParallelTest(String value) {
        this.parallelTest = value;
    }

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
     * Gets the value of the domainScore property.
     * 
     * @return
     *     possible object is
     *     {@link DomainScoreType }
     *     
     */
    public DomainScoreType getDomainScore() {
        return domainScore;
    }

    /**
     * Sets the value of the domainScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link DomainScoreType }
     *     
     */
    public void setDomainScore(DomainScoreType value) {
        this.domainScore = value;
    }

    /**
     * Gets the value of the testletList property.
     * 
     * @return
     *     possible object is
     *     {@link NAPStudentResponseTestletListType }
     *     
     */
    public NAPStudentResponseTestletListType getTestletList() {
        return testletList;
    }

    /**
     * Sets the value of the testletList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NAPStudentResponseTestletListType }
     *     
     */
    public void setTestletList(NAPStudentResponseTestletListType value) {
        this.testletList = value;
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
