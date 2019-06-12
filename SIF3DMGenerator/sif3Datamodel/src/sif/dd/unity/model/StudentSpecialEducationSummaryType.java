
package sif.dd.unity.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for StudentSpecialEducationSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentSpecialEducationSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentSpecialEducationFTE" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1"/>
 *               &lt;fractionDigits value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PrimaryDisabilityCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NeglectedOrDelinquentParticipationList" type="{http://www.sifassociation.org/datamodel/na/4.x}NeglectedOrDelinquentParticipationListType" minOccurs="0"/>
 *         &lt;element name="StudentParticipationList" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentSpecialEducationSummaryStudentParticipationListType" minOccurs="0"/>
 *         &lt;element name="StudentPlacementList" type="{http://www.sifassociation.org/datamodel/na/4.x}StudentSpecialEducationSummaryStudentPlacementListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="StudentPersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="SummaryDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="SchoolYear" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolYearType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentSpecialEducationSummaryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "studentSpecialEducationFTE",
    "primaryDisabilityCode",
    "neglectedOrDelinquentParticipationList",
    "studentParticipationList",
    "studentPlacementList",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentSpecialEducationSummaryType {

    @XmlElement(name = "StudentSpecialEducationFTE", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BigDecimal studentSpecialEducationFTE;
    @XmlElement(name = "PrimaryDisabilityCode", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentSpecialEducationSummaryType.PrimaryDisabilityCode primaryDisabilityCode;
    @XmlElement(name = "NeglectedOrDelinquentParticipationList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected NeglectedOrDelinquentParticipationListType neglectedOrDelinquentParticipationList;
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
    @XmlAttribute(name = "StudentPersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlAttribute(name = "SummaryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar summaryDate;
    @XmlAttribute(name = "SchoolYear", required = true)
    protected XMLGregorianCalendar schoolYear;

    /**
     * Gets the value of the studentSpecialEducationFTE property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStudentSpecialEducationFTE() {
        return studentSpecialEducationFTE;
    }

    /**
     * Sets the value of the studentSpecialEducationFTE property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStudentSpecialEducationFTE(BigDecimal value) {
        this.studentSpecialEducationFTE = value;
    }

    /**
     * Gets the value of the primaryDisabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link StudentSpecialEducationSummaryType.PrimaryDisabilityCode }
     *     
     */
    public StudentSpecialEducationSummaryType.PrimaryDisabilityCode getPrimaryDisabilityCode() {
        return primaryDisabilityCode;
    }

    /**
     * Sets the value of the primaryDisabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentSpecialEducationSummaryType.PrimaryDisabilityCode }
     *     
     */
    public void setPrimaryDisabilityCode(StudentSpecialEducationSummaryType.PrimaryDisabilityCode value) {
        this.primaryDisabilityCode = value;
    }

    /**
     * Gets the value of the neglectedOrDelinquentParticipationList property.
     * 
     * @return
     *     possible object is
     *     {@link NeglectedOrDelinquentParticipationListType }
     *     
     */
    public NeglectedOrDelinquentParticipationListType getNeglectedOrDelinquentParticipationList() {
        return neglectedOrDelinquentParticipationList;
    }

    /**
     * Sets the value of the neglectedOrDelinquentParticipationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NeglectedOrDelinquentParticipationListType }
     *     
     */
    public void setNeglectedOrDelinquentParticipationList(NeglectedOrDelinquentParticipationListType value) {
        this.neglectedOrDelinquentParticipationList = value;
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
     * Gets the value of the summaryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSummaryDate() {
        return summaryDate;
    }

    /**
     * Sets the value of the summaryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSummaryDate(XMLGregorianCalendar value) {
        this.summaryDate = value;
    }

    /**
     * Gets the value of the schoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSchoolYear() {
        return schoolYear;
    }

    /**
     * Sets the value of the schoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSchoolYear(XMLGregorianCalendar value) {
        this.schoolYear = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PrimaryDisabilityCode {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }

}
