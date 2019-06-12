
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BellScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BellScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolInfoRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType"/>
 *         &lt;element name="SchoolYear" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolYearType"/>
 *         &lt;element name="BellScheduleName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="TimetableDayList" type="{http://www.sifassociation.org/datamodel/na/4.x}TimetableDayListType"/>
 *         &lt;element name="TimetablePeriodList" type="{http://www.sifassociation.org/datamodel/na/4.x}TimetablePeriodListType"/>
 *         &lt;element name="BellPeriodList" type="{http://www.sifassociation.org/datamodel/na/4.x}BellPeriodListType"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BellScheduleType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "schoolInfoRefId",
    "schoolYear",
    "bellScheduleName",
    "timetableDayList",
    "timetablePeriodList",
    "bellPeriodList",
    "sifMetadata",
    "sifExtendedElements"
})
public class BellScheduleType {

    @XmlElement(name = "SchoolInfoRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;
    @XmlElement(name = "SchoolYear", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(name = "BellScheduleName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String bellScheduleName;
    @XmlElement(name = "TimetableDayList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected TimetableDayListType timetableDayList;
    @XmlElement(name = "TimetablePeriodList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected TimetablePeriodListType timetablePeriodList;
    @XmlElement(name = "BellPeriodList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BellPeriodListType bellPeriodList;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolInfoRefId(String value) {
        this.schoolInfoRefId = value;
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
     * Gets the value of the bellScheduleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBellScheduleName() {
        return bellScheduleName;
    }

    /**
     * Sets the value of the bellScheduleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBellScheduleName(String value) {
        this.bellScheduleName = value;
    }

    /**
     * Gets the value of the timetableDayList property.
     * 
     * @return
     *     possible object is
     *     {@link TimetableDayListType }
     *     
     */
    public TimetableDayListType getTimetableDayList() {
        return timetableDayList;
    }

    /**
     * Sets the value of the timetableDayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimetableDayListType }
     *     
     */
    public void setTimetableDayList(TimetableDayListType value) {
        this.timetableDayList = value;
    }

    /**
     * Gets the value of the timetablePeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link TimetablePeriodListType }
     *     
     */
    public TimetablePeriodListType getTimetablePeriodList() {
        return timetablePeriodList;
    }

    /**
     * Sets the value of the timetablePeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimetablePeriodListType }
     *     
     */
    public void setTimetablePeriodList(TimetablePeriodListType value) {
        this.timetablePeriodList = value;
    }

    /**
     * Gets the value of the bellPeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link BellPeriodListType }
     *     
     */
    public BellPeriodListType getBellPeriodList() {
        return bellPeriodList;
    }

    /**
     * Sets the value of the bellPeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BellPeriodListType }
     *     
     */
    public void setBellPeriodList(BellPeriodListType value) {
        this.bellPeriodList = value;
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

}
