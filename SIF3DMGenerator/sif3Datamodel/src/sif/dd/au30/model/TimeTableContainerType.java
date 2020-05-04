
package sif.dd.au30.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TimeTableContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableContainerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimeTableSchedule" type="{http://www.sifassociation.org/datamodel/au/3.4}TimeTableScheduleType" minOccurs="0"/>
 *         &lt;element name="TimeTableScheduleCellList" type="{http://www.sifassociation.org/datamodel/au/3.4}TimeTableScheduleCellListType" minOccurs="0"/>
 *         &lt;element name="TeachingGroupScheduleList" type="{http://www.sifassociation.org/datamodel/au/3.4}TeachingGroupScheduleType" minOccurs="0"/>
 *         &lt;element name="LocalCodeList" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalCodeListType" minOccurs="0"/>
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
@XmlType(name = "TimeTableContainerType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "timeTableSchedule",
    "timeTableScheduleCellList",
    "teachingGroupScheduleList",
    "localCodeList",
    "sifMetadata",
    "sifExtendedElements"
})
public class TimeTableContainerType {

    @XmlElementRef(name = "TimeTableSchedule", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeTableScheduleType> timeTableSchedule;
    @XmlElementRef(name = "TimeTableScheduleCellList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<TimeTableScheduleCellListType> timeTableScheduleCellList;
    @XmlElementRef(name = "TeachingGroupScheduleList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<TeachingGroupScheduleType> teachingGroupScheduleList;
    @XmlElementRef(name = "LocalCodeList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<LocalCodeListType> localCodeList;
    @XmlElementRef(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFMetadataType> sifMetadata;
    @XmlElementRef(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/au/3.4", type = JAXBElement.class, required = false)
    protected JAXBElement<SIFExtendedElementsType> sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the timeTableSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeTableScheduleType }{@code >}
     *     
     */
    public JAXBElement<TimeTableScheduleType> getTimeTableSchedule() {
        return timeTableSchedule;
    }

    /**
     * Sets the value of the timeTableSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeTableScheduleType }{@code >}
     *     
     */
    public void setTimeTableSchedule(JAXBElement<TimeTableScheduleType> value) {
        this.timeTableSchedule = value;
    }

    /**
     * Gets the value of the timeTableScheduleCellList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TimeTableScheduleCellListType }{@code >}
     *     
     */
    public JAXBElement<TimeTableScheduleCellListType> getTimeTableScheduleCellList() {
        return timeTableScheduleCellList;
    }

    /**
     * Sets the value of the timeTableScheduleCellList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TimeTableScheduleCellListType }{@code >}
     *     
     */
    public void setTimeTableScheduleCellList(JAXBElement<TimeTableScheduleCellListType> value) {
        this.timeTableScheduleCellList = value;
    }

    /**
     * Gets the value of the teachingGroupScheduleList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TeachingGroupScheduleType }{@code >}
     *     
     */
    public JAXBElement<TeachingGroupScheduleType> getTeachingGroupScheduleList() {
        return teachingGroupScheduleList;
    }

    /**
     * Sets the value of the teachingGroupScheduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TeachingGroupScheduleType }{@code >}
     *     
     */
    public void setTeachingGroupScheduleList(JAXBElement<TeachingGroupScheduleType> value) {
        this.teachingGroupScheduleList = value;
    }

    /**
     * Gets the value of the localCodeList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public JAXBElement<LocalCodeListType> getLocalCodeList() {
        return localCodeList;
    }

    /**
     * Sets the value of the localCodeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalCodeListType }{@code >}
     *     
     */
    public void setLocalCodeList(JAXBElement<LocalCodeListType> value) {
        this.localCodeList = value;
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
