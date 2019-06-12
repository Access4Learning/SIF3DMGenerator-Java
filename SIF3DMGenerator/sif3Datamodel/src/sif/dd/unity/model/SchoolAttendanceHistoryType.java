
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


/**
 * <p>Java class for SchoolAttendanceHistoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolAttendanceHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LEAInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}LEAInfoSummaryType" minOccurs="0"/>
 *         &lt;element name="SchoolInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolInfoSummaryType"/>
 *         &lt;element name="AccreditingBody" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="MarkingSystems" type="{http://www.sifassociation.org/datamodel/na/4.x}MarkingSystemsType" minOccurs="0"/>
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
@XmlType(name = "SchoolAttendanceHistoryType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "leaInfoData",
    "schoolInfoData",
    "accreditingBody",
    "markingSystems"
})
public class SchoolAttendanceHistoryType {

    @XmlElement(name = "LEAInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected LEAInfoSummaryType leaInfoData;
    @XmlElement(name = "SchoolInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected SchoolInfoSummaryType schoolInfoData;
    @XmlElement(name = "AccreditingBody", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String accreditingBody;
    @XmlElement(name = "MarkingSystems", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MarkingSystemsType markingSystems;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the leaInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link LEAInfoSummaryType }
     *     
     */
    public LEAInfoSummaryType getLEAInfoData() {
        return leaInfoData;
    }

    /**
     * Sets the value of the leaInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link LEAInfoSummaryType }
     *     
     */
    public void setLEAInfoData(LEAInfoSummaryType value) {
        this.leaInfoData = value;
    }

    /**
     * Gets the value of the schoolInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolInfoSummaryType }
     *     
     */
    public SchoolInfoSummaryType getSchoolInfoData() {
        return schoolInfoData;
    }

    /**
     * Sets the value of the schoolInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolInfoSummaryType }
     *     
     */
    public void setSchoolInfoData(SchoolInfoSummaryType value) {
        this.schoolInfoData = value;
    }

    /**
     * Gets the value of the accreditingBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccreditingBody() {
        return accreditingBody;
    }

    /**
     * Sets the value of the accreditingBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccreditingBody(String value) {
        this.accreditingBody = value;
    }

    /**
     * Gets the value of the markingSystems property.
     * 
     * @return
     *     possible object is
     *     {@link MarkingSystemsType }
     *     
     */
    public MarkingSystemsType getMarkingSystems() {
        return markingSystems;
    }

    /**
     * Sets the value of the markingSystems property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingSystemsType }
     *     
     */
    public void setMarkingSystems(MarkingSystemsType value) {
        this.markingSystems = value;
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
