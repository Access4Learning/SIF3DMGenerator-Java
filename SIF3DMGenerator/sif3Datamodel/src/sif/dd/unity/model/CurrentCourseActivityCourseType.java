
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CurrentCourseActivityCourseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrentCourseActivityCourseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolAttendedRefId" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" minOccurs="0"/>
 *         &lt;element name="SchoolCourseInfoData" type="{http://www.sifassociation.org/datamodel/na/4.x}SchoolCourseInfoSummaryType"/>
 *         &lt;element name="StartDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{http://www.sifassociation.org/datamodel/na/4.x}PartialDateType" minOccurs="0"/>
 *         &lt;element name="MarkingPeriod" type="{http://www.sifassociation.org/datamodel/na/4.x}MarkingPeriodSummaryType"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrentCourseActivityCourseType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "schoolAttendedRefId",
    "schoolCourseInfoData",
    "startDate",
    "endDate",
    "markingPeriod",
    "sifExtendedElements"
})
public class CurrentCourseActivityCourseType {

    @XmlElement(name = "SchoolAttendedRefId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolAttendedRefId;
    @XmlElement(name = "SchoolCourseInfoData", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected SchoolCourseInfoSummaryType schoolCourseInfoData;
    @XmlElement(name = "StartDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String startDate;
    @XmlElement(name = "EndDate", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String endDate;
    @XmlElement(name = "MarkingPeriod", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected MarkingPeriodSummaryType markingPeriod;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;

    /**
     * Gets the value of the schoolAttendedRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAttendedRefId() {
        return schoolAttendedRefId;
    }

    /**
     * Sets the value of the schoolAttendedRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAttendedRefId(String value) {
        this.schoolAttendedRefId = value;
    }

    /**
     * Gets the value of the schoolCourseInfoData property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolCourseInfoSummaryType }
     *     
     */
    public SchoolCourseInfoSummaryType getSchoolCourseInfoData() {
        return schoolCourseInfoData;
    }

    /**
     * Sets the value of the schoolCourseInfoData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolCourseInfoSummaryType }
     *     
     */
    public void setSchoolCourseInfoData(SchoolCourseInfoSummaryType value) {
        this.schoolCourseInfoData = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the markingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link MarkingPeriodSummaryType }
     *     
     */
    public MarkingPeriodSummaryType getMarkingPeriod() {
        return markingPeriod;
    }

    /**
     * Sets the value of the markingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarkingPeriodSummaryType }
     *     
     */
    public void setMarkingPeriod(MarkingPeriodSummaryType value) {
        this.markingPeriod = value;
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

}
