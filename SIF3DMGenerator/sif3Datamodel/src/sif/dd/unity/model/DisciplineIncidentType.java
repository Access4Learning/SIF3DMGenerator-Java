
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DisciplineIncidentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisciplineIncidentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyReporting">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="SchoolInfo"/>
 *                       &lt;enumeration value="LEAInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IncidentNumber" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="IncidentDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="IncidentTime" type="{http://www.sifassociation.org/datamodel/na/4.x}IncidentTimeType"/>
 *         &lt;element name="IncidentLocation" type="{http://www.sifassociation.org/datamodel/na/4.x}IncidentLocationType"/>
 *         &lt;element name="IncidentLocationRefId" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="SchoolInfo"/>
 *                       &lt;enumeration value="LocationInfo"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IncidentCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncidentReporter" type="{http://www.sifassociation.org/datamodel/na/4.x}IncidentReporterType"/>
 *         &lt;element name="RelatedToList" type="{http://www.sifassociation.org/datamodel/na/4.x}RelatedToListType" minOccurs="0"/>
 *         &lt;element name="WeaponTypeList" type="{http://www.sifassociation.org/datamodel/na/4.x}WeaponTypeListType" minOccurs="0"/>
 *         &lt;element name="IncidentCategory" type="{http://www.sifassociation.org/datamodel/na/4.x}IncidentCategoryContainerType"/>
 *         &lt;element name="OffenderList" type="{http://www.sifassociation.org/datamodel/na/4.x}OffenderListType"/>
 *         &lt;element name="VictimList" type="{http://www.sifassociation.org/datamodel/na/4.x}VictimListType" minOccurs="0"/>
 *         &lt;element name="IncidentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncidentActionList" type="{http://www.sifassociation.org/datamodel/na/4.x}IncidentActionListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="SchoolYear" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolYearType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisciplineIncidentType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "agencyReporting",
    "incidentNumber",
    "incidentDate",
    "incidentTime",
    "incidentLocation",
    "incidentLocationRefId",
    "incidentCost",
    "incidentReporter",
    "relatedToList",
    "weaponTypeList",
    "incidentCategory",
    "offenderList",
    "victimList",
    "incidentDescription",
    "incidentActionList",
    "sifMetadata",
    "sifExtendedElements"
})
public class DisciplineIncidentType {

    @XmlElement(name = "AgencyReporting", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected DisciplineIncidentType.AgencyReporting agencyReporting;
    @XmlElement(name = "IncidentNumber", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String incidentNumber;
    @XmlElement(name = "IncidentDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar incidentDate;
    @XmlElement(name = "IncidentTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected IncidentTimeType incidentTime;
    @XmlElement(name = "IncidentLocation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected IncidentLocationType incidentLocation;
    @XmlElement(name = "IncidentLocationRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DisciplineIncidentType.IncidentLocationRefId incidentLocationRefId;
    @XmlElement(name = "IncidentCost", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String incidentCost;
    @XmlElement(name = "IncidentReporter", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected IncidentReporterType incidentReporter;
    @XmlElement(name = "RelatedToList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected RelatedToListType relatedToList;
    @XmlElement(name = "WeaponTypeList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected WeaponTypeListType weaponTypeList;
    @XmlElement(name = "IncidentCategory", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected IncidentCategoryContainerType incidentCategory;
    @XmlElement(name = "OffenderList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected OffenderListType offenderList;
    @XmlElement(name = "VictimList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected VictimListType victimList;
    @XmlElement(name = "IncidentDescription", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String incidentDescription;
    @XmlElement(name = "IncidentActionList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected IncidentActionListType incidentActionList;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "SchoolYear", required = true)
    protected XMLGregorianCalendar schoolYear;

    /**
     * Gets the value of the agencyReporting property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineIncidentType.AgencyReporting }
     *     
     */
    public DisciplineIncidentType.AgencyReporting getAgencyReporting() {
        return agencyReporting;
    }

    /**
     * Sets the value of the agencyReporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineIncidentType.AgencyReporting }
     *     
     */
    public void setAgencyReporting(DisciplineIncidentType.AgencyReporting value) {
        this.agencyReporting = value;
    }

    /**
     * Gets the value of the incidentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentNumber() {
        return incidentNumber;
    }

    /**
     * Sets the value of the incidentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentNumber(String value) {
        this.incidentNumber = value;
    }

    /**
     * Gets the value of the incidentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncidentDate() {
        return incidentDate;
    }

    /**
     * Sets the value of the incidentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncidentDate(XMLGregorianCalendar value) {
        this.incidentDate = value;
    }

    /**
     * Gets the value of the incidentTime property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentTimeType }
     *     
     */
    public IncidentTimeType getIncidentTime() {
        return incidentTime;
    }

    /**
     * Sets the value of the incidentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentTimeType }
     *     
     */
    public void setIncidentTime(IncidentTimeType value) {
        this.incidentTime = value;
    }

    /**
     * Gets the value of the incidentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentLocationType }
     *     
     */
    public IncidentLocationType getIncidentLocation() {
        return incidentLocation;
    }

    /**
     * Sets the value of the incidentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentLocationType }
     *     
     */
    public void setIncidentLocation(IncidentLocationType value) {
        this.incidentLocation = value;
    }

    /**
     * Gets the value of the incidentLocationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineIncidentType.IncidentLocationRefId }
     *     
     */
    public DisciplineIncidentType.IncidentLocationRefId getIncidentLocationRefId() {
        return incidentLocationRefId;
    }

    /**
     * Sets the value of the incidentLocationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineIncidentType.IncidentLocationRefId }
     *     
     */
    public void setIncidentLocationRefId(DisciplineIncidentType.IncidentLocationRefId value) {
        this.incidentLocationRefId = value;
    }

    /**
     * Gets the value of the incidentCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentCost() {
        return incidentCost;
    }

    /**
     * Sets the value of the incidentCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCost(String value) {
        this.incidentCost = value;
    }

    /**
     * Gets the value of the incidentReporter property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentReporterType }
     *     
     */
    public IncidentReporterType getIncidentReporter() {
        return incidentReporter;
    }

    /**
     * Sets the value of the incidentReporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentReporterType }
     *     
     */
    public void setIncidentReporter(IncidentReporterType value) {
        this.incidentReporter = value;
    }

    /**
     * Gets the value of the relatedToList property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedToListType }
     *     
     */
    public RelatedToListType getRelatedToList() {
        return relatedToList;
    }

    /**
     * Sets the value of the relatedToList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedToListType }
     *     
     */
    public void setRelatedToList(RelatedToListType value) {
        this.relatedToList = value;
    }

    /**
     * Gets the value of the weaponTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link WeaponTypeListType }
     *     
     */
    public WeaponTypeListType getWeaponTypeList() {
        return weaponTypeList;
    }

    /**
     * Sets the value of the weaponTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeaponTypeListType }
     *     
     */
    public void setWeaponTypeList(WeaponTypeListType value) {
        this.weaponTypeList = value;
    }

    /**
     * Gets the value of the incidentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentCategoryContainerType }
     *     
     */
    public IncidentCategoryContainerType getIncidentCategory() {
        return incidentCategory;
    }

    /**
     * Sets the value of the incidentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentCategoryContainerType }
     *     
     */
    public void setIncidentCategory(IncidentCategoryContainerType value) {
        this.incidentCategory = value;
    }

    /**
     * Gets the value of the offenderList property.
     * 
     * @return
     *     possible object is
     *     {@link OffenderListType }
     *     
     */
    public OffenderListType getOffenderList() {
        return offenderList;
    }

    /**
     * Sets the value of the offenderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OffenderListType }
     *     
     */
    public void setOffenderList(OffenderListType value) {
        this.offenderList = value;
    }

    /**
     * Gets the value of the victimList property.
     * 
     * @return
     *     possible object is
     *     {@link VictimListType }
     *     
     */
    public VictimListType getVictimList() {
        return victimList;
    }

    /**
     * Sets the value of the victimList property.
     * 
     * @param value
     *     allowed object is
     *     {@link VictimListType }
     *     
     */
    public void setVictimList(VictimListType value) {
        this.victimList = value;
    }

    /**
     * Gets the value of the incidentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentDescription() {
        return incidentDescription;
    }

    /**
     * Sets the value of the incidentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentDescription(String value) {
        this.incidentDescription = value;
    }

    /**
     * Gets the value of the incidentActionList property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentActionListType }
     *     
     */
    public IncidentActionListType getIncidentActionList() {
        return incidentActionList;
    }

    /**
     * Sets the value of the incidentActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentActionListType }
     *     
     */
    public void setIncidentActionList(IncidentActionListType value) {
        this.incidentActionList = value;
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
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="SchoolInfo"/>
     *             &lt;enumeration value="LEAInfo"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class AgencyReporting {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="SchoolInfo"/>
     *             &lt;enumeration value="LocationInfo"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class IncidentLocationRefId {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

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

    }

}
