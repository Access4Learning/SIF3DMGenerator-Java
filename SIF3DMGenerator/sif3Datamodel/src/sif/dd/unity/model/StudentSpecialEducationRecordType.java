
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentSpecialEducationRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSpecialEducationRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReportingDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="LEAInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}LEAInfoSummaryCleanType"/>
 *         &lt;element name="SchoolInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolInfoMiniSummaryType"/>
 *         &lt;element name="StudentParticipationData" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentParticipationDataType"/>
 *         &lt;element name="StudentParticipationList" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentSpecialEducationSummaryStudentParticipationListType" minOccurs="0"/>
 *         &lt;element name="StudentPlacementList" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentSpecialEducationSummaryStudentPlacementListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="SIF_RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="SIF_RefObject" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="SIF_RefObjectCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSpecialEducationRecordType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "reportingDate",
    "leaInfoData",
    "schoolInfoData",
    "studentParticipationData",
    "studentParticipationList",
    "studentPlacementList",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentSpecialEducationRecordType {

    @XmlElement(name = "ReportingDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reportingDate;
    @XmlElement(name = "LEAInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected LEAInfoSummaryCleanType leaInfoData;
    @XmlElement(name = "SchoolInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected SchoolInfoMiniSummaryType schoolInfoData;
    @XmlElement(name = "StudentParticipationData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected StudentParticipationDataType studentParticipationData;
    @XmlElement(name = "StudentParticipationList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSpecialEducationSummaryStudentParticipationListType studentParticipationList;
    @XmlElement(name = "StudentPlacementList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSpecialEducationSummaryStudentPlacementListType studentPlacementList;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "SIF_RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String sifRefId;
    @XmlAttribute(name = "SIF_RefObject", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sifRefObject;
    @XmlAttribute(name = "SIF_RefObjectCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sifRefObjectCodeset;

    /**
     * Gets the value of the reportingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportingDate() {
        return reportingDate;
    }

    /**
     * Sets the value of the reportingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportingDate(XMLGregorianCalendar value) {
        this.reportingDate = value;
    }

    /**
     * Gets the value of the leaInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link LEAInfoSummaryCleanType }
     *     
     */
    public LEAInfoSummaryCleanType getLEAInfoData() {
        return leaInfoData;
    }

    /**
     * Sets the value of the leaInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEAInfoSummaryCleanType }
     *     
     */
    public void setLEAInfoData(LEAInfoSummaryCleanType value) {
        this.leaInfoData = value;
    }

    /**
     * Gets the value of the schoolInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolInfoMiniSummaryType }
     *     
     */
    public SchoolInfoMiniSummaryType getSchoolInfoData() {
        return schoolInfoData;
    }

    /**
     * Sets the value of the schoolInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolInfoMiniSummaryType }
     *     
     */
    public void setSchoolInfoData(SchoolInfoMiniSummaryType value) {
        this.schoolInfoData = value;
    }

    /**
     * Gets the value of the studentParticipationData property.
     * 
     * @return
     *     possible object is
     *     {@link StudentParticipationDataType }
     *     
     */
    public StudentParticipationDataType getStudentParticipationData() {
        return studentParticipationData;
    }

    /**
     * Sets the value of the studentParticipationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentParticipationDataType }
     *     
     */
    public void setStudentParticipationData(StudentParticipationDataType value) {
        this.studentParticipationData = value;
    }

    /**
     * Gets the value of the studentParticipationList property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEducationSummaryStudentParticipationListType }
     *     
     */
    public StudentSpecialEducationSummaryStudentParticipationListType getStudentParticipationList() {
        return studentParticipationList;
    }

    /**
     * Sets the value of the studentParticipationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEducationSummaryStudentParticipationListType }
     *     
     */
    public void setStudentParticipationList(StudentSpecialEducationSummaryStudentParticipationListType value) {
        this.studentParticipationList = value;
    }

    /**
     * Gets the value of the studentPlacementList property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEducationSummaryStudentPlacementListType }
     *     
     */
    public StudentSpecialEducationSummaryStudentPlacementListType getStudentPlacementList() {
        return studentPlacementList;
    }

    /**
     * Sets the value of the studentPlacementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEducationSummaryStudentPlacementListType }
     *     
     */
    public void setStudentPlacementList(StudentSpecialEducationSummaryStudentPlacementListType value) {
        this.studentPlacementList = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SIFMetadataType }
     *     
     */
    public SIFMetadataType getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFMetadataType }
     *     
     */
    public void setSIFMetadata(SIFMetadataType value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
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
     * Gets the value of the sifRefObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFRefObject() {
        return sifRefObject;
    }

    /**
     * Sets the value of the sifRefObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFRefObject(String value) {
        this.sifRefObject = value;
    }

    /**
     * Gets the value of the sifRefObjectCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIFRefObjectCodeset() {
        return sifRefObjectCodeset;
    }

    /**
     * Sets the value of the sifRefObjectCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIFRefObjectCodeset(String value) {
        this.sifRefObjectCodeset = value;
    }

}
