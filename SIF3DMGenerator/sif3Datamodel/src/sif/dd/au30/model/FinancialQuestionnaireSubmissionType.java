
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FinancialQuestionnaireSubmissionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialQuestionnaireSubmissionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FQYear" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolYearType" minOccurs="0"/>
 *         &lt;element name="ReportingAuthority" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ReportingAuthoritySystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ReportingAuthorityCommonwealthId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="SystemSubmission" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="SoftwareVendorInfo" type="{http://www.sifassociation.org/datamodel/au/3.4}SoftwareVendorInfoContainerType" minOccurs="0"/>
 *         &lt;element name="SubmissionContact" type="{http://www.sifassociation.org/datamodel/au/3.4}EntityContactInfoType" minOccurs="0"/>
 *         &lt;element name="FQReportComments" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="FQReportingList" type="{http://www.sifassociation.org/datamodel/au/3.4}FQReportingListType" minOccurs="0"/>
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
@XmlType(name = "FinancialQuestionnaireSubmissionType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "fqYear",
    "reportingAuthority",
    "reportingAuthoritySystem",
    "reportingAuthorityCommonwealthId",
    "systemSubmission",
    "softwareVendorInfo",
    "submissionContact",
    "fqReportComments",
    "fqReportingList",
    "sifMetadata",
    "sifExtendedElements"
})
public class FinancialQuestionnaireSubmissionType {

    @XmlElement(name = "FQYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected XMLGregorianCalendar fqYear;
    @XmlElementRef(name = "ReportingAuthority", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportingAuthority;
    @XmlElementRef(name = "ReportingAuthoritySystem", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportingAuthoritySystem;
    @XmlElement(name = "ReportingAuthorityCommonwealthId", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String reportingAuthorityCommonwealthId;
    @XmlElementRef(name = "SystemSubmission", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> systemSubmission;
    @XmlElement(name = "SoftwareVendorInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected SoftwareVendorInfoContainerType softwareVendorInfo;
    @XmlElement(name = "SubmissionContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4")
    protected EntityContactInfoType submissionContact;
    @XmlElementRef(name = "FQReportComments", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fqReportComments;
    @XmlElementRef(name = "FQReportingList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<FQReportingListType> fqReportingList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the fqYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFQYear() {
        return fqYear;
    }

    /**
     * Sets the value of the fqYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFQYear(XMLGregorianCalendar value) {
        this.fqYear = value;
    }

    /**
     * Gets the value of the reportingAuthority property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportingAuthority() {
        return reportingAuthority;
    }

    /**
     * Sets the value of the reportingAuthority property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportingAuthority(JAXBElement<String> value) {
        this.reportingAuthority = value;
    }

    /**
     * Gets the value of the reportingAuthoritySystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportingAuthoritySystem() {
        return reportingAuthoritySystem;
    }

    /**
     * Sets the value of the reportingAuthoritySystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportingAuthoritySystem(JAXBElement<String> value) {
        this.reportingAuthoritySystem = value;
    }

    /**
     * Gets the value of the reportingAuthorityCommonwealthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportingAuthorityCommonwealthId() {
        return reportingAuthorityCommonwealthId;
    }

    /**
     * Sets the value of the reportingAuthorityCommonwealthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportingAuthorityCommonwealthId(String value) {
        this.reportingAuthorityCommonwealthId = value;
    }

    /**
     * Gets the value of the systemSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public JAXBElement<AUCodeSetsYesOrNoCategoryType> getSystemSubmission() {
        return systemSubmission;
    }

    /**
     * Sets the value of the systemSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AUCodeSetsYesOrNoCategoryType }{@code >}
     *     
     */
    public void setSystemSubmission(JAXBElement<AUCodeSetsYesOrNoCategoryType> value) {
        this.systemSubmission = value;
    }

    /**
     * Gets the value of the softwareVendorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link SoftwareVendorInfoContainerType }
     *     
     */
    public SoftwareVendorInfoContainerType getSoftwareVendorInfo() {
        return softwareVendorInfo;
    }

    /**
     * Sets the value of the softwareVendorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SoftwareVendorInfoContainerType }
     *     
     */
    public void setSoftwareVendorInfo(SoftwareVendorInfoContainerType value) {
        this.softwareVendorInfo = value;
    }

    /**
     * Gets the value of the submissionContact property.
     * 
     * @return
     *     possible object is
     *     {@link EntityContactInfoType }
     *     
     */
    public EntityContactInfoType getSubmissionContact() {
        return submissionContact;
    }

    /**
     * Sets the value of the submissionContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityContactInfoType }
     *     
     */
    public void setSubmissionContact(EntityContactInfoType value) {
        this.submissionContact = value;
    }

    /**
     * Gets the value of the fqReportComments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFQReportComments() {
        return fqReportComments;
    }

    /**
     * Sets the value of the fqReportComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFQReportComments(JAXBElement<String> value) {
        this.fqReportComments = value;
    }

    /**
     * Gets the value of the fqReportingList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FQReportingListType }{@code >}
     *     
     */
    public JAXBElement<FQReportingListType> getFQReportingList() {
        return fqReportingList;
    }

    /**
     * Sets the value of the fqReportingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FQReportingListType }{@code >}
     *     
     */
    public void setFQReportingList(JAXBElement<FQReportingListType> value) {
        this.fqReportingList = value;
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
