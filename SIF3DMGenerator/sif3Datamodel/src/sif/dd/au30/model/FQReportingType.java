
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
 * 
 * 
 * <p>Java class for FQReportingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FQReportingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FQYear" type="{http://www.sifassociation.org/datamodel/au/3.4}SchoolYearType"/>
 *         &lt;element name="ReportingAuthority" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ReportingAuthoritySystem" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="ReportingAuthorityCommonwealthId" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="SystemSubmission" type="{http://www.sifassociation.org/datamodel/au/3.4}AUCodeSetsYesOrNoCategoryType" minOccurs="0"/>
 *         &lt;element name="SoftwareVendorInfo" type="{http://www.sifassociation.org/datamodel/au/3.4}SoftwareVendorInfoContainerType" minOccurs="0"/>
 *         &lt;element name="EntityLevel" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/au/3.4}IdRefType" minOccurs="0"/>
 *         &lt;element name="LocalId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType" minOccurs="0"/>
 *         &lt;element name="StateProvinceId" type="{http://www.sifassociation.org/datamodel/au/3.4}StateProvinceIdType" minOccurs="0"/>
 *         &lt;element name="CommonwealthId" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="ACARAId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="EntityName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="EntityContact" type="{http://www.sifassociation.org/datamodel/au/3.4}EntityContactInfoType"/>
 *         &lt;element name="FQContextualQuestionList" type="{http://www.sifassociation.org/datamodel/au/3.4}FQContextualQuestionListType" minOccurs="0"/>
 *         &lt;element name="FQReportComments" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="FQItemList" type="{http://www.sifassociation.org/datamodel/au/3.4}FQItemListType"/>
 *         &lt;element name="AGRuleList" type="{http://www.sifassociation.org/datamodel/au/3.4}AGRuleListType" minOccurs="0"/>
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
@XmlType(name = "FQReportingType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "fqYear",
    "reportingAuthority",
    "reportingAuthoritySystem",
    "reportingAuthorityCommonwealthId",
    "systemSubmission",
    "softwareVendorInfo",
    "entityLevel",
    "schoolInfoRefId",
    "localId",
    "stateProvinceId",
    "commonwealthId",
    "acaraId",
    "entityName",
    "entityContact",
    "fqContextualQuestionList",
    "fqReportComments",
    "fqItemList",
    "agRuleList",
    "sifMetadata",
    "sifExtendedElements"
})
public class FQReportingType {

    @XmlElement(name = "FQYear", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected XMLGregorianCalendar fqYear;
    @XmlElementRef(name = "ReportingAuthority", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportingAuthority;
    @XmlElementRef(name = "ReportingAuthoritySystem", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportingAuthoritySystem;
    @XmlElement(name = "ReportingAuthorityCommonwealthId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String reportingAuthorityCommonwealthId;
    @XmlElementRef(name = "SystemSubmission", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AUCodeSetsYesOrNoCategoryType> systemSubmission;
    @XmlElementRef(name = "SoftwareVendorInfo", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SoftwareVendorInfoContainerType> softwareVendorInfo;
    @XmlElement(name = "EntityLevel", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String entityLevel;
    @XmlElementRef(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> schoolInfoRefId;
    @XmlElementRef(name = "LocalId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localId;
    @XmlElementRef(name = "StateProvinceId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateProvinceId;
    @XmlElement(name = "CommonwealthId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String commonwealthId;
    @XmlElementRef(name = "ACARAId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> acaraId;
    @XmlElementRef(name = "EntityName", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> entityName;
    @XmlElement(name = "EntityContact", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected EntityContactInfoType entityContact;
    @XmlElementRef(name = "FQContextualQuestionList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<FQContextualQuestionListType> fqContextualQuestionList;
    @XmlElementRef(name = "FQReportComments", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fqReportComments;
    @XmlElement(name = "FQItemList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected FQItemListType fqItemList;
    @XmlElementRef(name = "AGRuleList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<AGRuleListType> agRuleList;
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
     *     {@link JAXBElement }{@code <}{@link SoftwareVendorInfoContainerType }{@code >}
     *     
     */
    public JAXBElement<SoftwareVendorInfoContainerType> getSoftwareVendorInfo() {
        return softwareVendorInfo;
    }

    /**
     * Sets the value of the softwareVendorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SoftwareVendorInfoContainerType }{@code >}
     *     
     */
    public void setSoftwareVendorInfo(JAXBElement<SoftwareVendorInfoContainerType> value) {
        this.softwareVendorInfo = value;
    }

    /**
     * Gets the value of the entityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityLevel() {
        return entityLevel;
    }

    /**
     * Sets the value of the entityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityLevel(String value) {
        this.entityLevel = value;
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
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalId(JAXBElement<String> value) {
        this.localId = value;
    }

    /**
     * Gets the value of the stateProvinceId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateProvinceId() {
        return stateProvinceId;
    }

    /**
     * Sets the value of the stateProvinceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateProvinceId(JAXBElement<String> value) {
        this.stateProvinceId = value;
    }

    /**
     * Gets the value of the commonwealthId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommonwealthId() {
        return commonwealthId;
    }

    /**
     * Sets the value of the commonwealthId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommonwealthId(String value) {
        this.commonwealthId = value;
    }

    /**
     * Gets the value of the acaraId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getACARAId() {
        return acaraId;
    }

    /**
     * Sets the value of the acaraId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setACARAId(JAXBElement<String> value) {
        this.acaraId = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEntityName(JAXBElement<String> value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityContact property.
     * 
     * @return
     *     possible object is
     *     {@link EntityContactInfoType }
     *     
     */
    public EntityContactInfoType getEntityContact() {
        return entityContact;
    }

    /**
     * Sets the value of the entityContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityContactInfoType }
     *     
     */
    public void setEntityContact(EntityContactInfoType value) {
        this.entityContact = value;
    }

    /**
     * Gets the value of the fqContextualQuestionList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FQContextualQuestionListType }{@code >}
     *     
     */
    public JAXBElement<FQContextualQuestionListType> getFQContextualQuestionList() {
        return fqContextualQuestionList;
    }

    /**
     * Sets the value of the fqContextualQuestionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FQContextualQuestionListType }{@code >}
     *     
     */
    public void setFQContextualQuestionList(JAXBElement<FQContextualQuestionListType> value) {
        this.fqContextualQuestionList = value;
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
     * Gets the value of the fqItemList property.
     * 
     * @return
     *     possible object is
     *     {@link FQItemListType }
     *     
     */
    public FQItemListType getFQItemList() {
        return fqItemList;
    }

    /**
     * Sets the value of the fqItemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FQItemListType }
     *     
     */
    public void setFQItemList(FQItemListType value) {
        this.fqItemList = value;
    }

    /**
     * Gets the value of the agRuleList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AGRuleListType }{@code >}
     *     
     */
    public JAXBElement<AGRuleListType> getAGRuleList() {
        return agRuleList;
    }

    /**
     * Sets the value of the agRuleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AGRuleListType }{@code >}
     *     
     */
    public void setAGRuleList(JAXBElement<AGRuleListType> value) {
        this.agRuleList = value;
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
