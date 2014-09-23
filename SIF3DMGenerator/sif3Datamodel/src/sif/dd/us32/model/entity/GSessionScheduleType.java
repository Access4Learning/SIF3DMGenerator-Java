
package sif.dd.us32.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for gSessionScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gSessionScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="termRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="meetingTimeList" type="{http://www.sifassociation.org/datamodel/na/3.2}gMeetingTimeList" minOccurs="0"/>
 *         &lt;element name="roomList" type="{http://www.sifassociation.org/datamodel/na/3.2}gRoomList" minOccurs="0"/>
 *         &lt;element name="sectionTeacherList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sectionTeacher" type="{http://www.sifassociation.org/datamodel/na/3.2}gSectionTeacherType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gSessionScheduleType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "termRefId",
    "meetingTimeList",
    "roomList",
    "sectionTeacherList",
    "any"
})
public class GSessionScheduleType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String termRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GMeetingTimeList meetingTimeList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GRoomList roomList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GSessionScheduleType.SectionTeacherList sectionTeacherList;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the termRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermRefId() {
        return termRefId;
    }

    /**
     * Sets the value of the termRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermRefId(String value) {
        this.termRefId = value;
    }

    /**
     * Gets the value of the meetingTimeList property.
     * 
     * @return
     *     possible object is
     *     {@link GMeetingTimeList }
     *     
     */
    public GMeetingTimeList getMeetingTimeList() {
        return meetingTimeList;
    }

    /**
     * Sets the value of the meetingTimeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMeetingTimeList }
     *     
     */
    public void setMeetingTimeList(GMeetingTimeList value) {
        this.meetingTimeList = value;
    }

    /**
     * Gets the value of the roomList property.
     * 
     * @return
     *     possible object is
     *     {@link GRoomList }
     *     
     */
    public GRoomList getRoomList() {
        return roomList;
    }

    /**
     * Sets the value of the roomList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GRoomList }
     *     
     */
    public void setRoomList(GRoomList value) {
        this.roomList = value;
    }

    /**
     * Gets the value of the sectionTeacherList property.
     * 
     * @return
     *     possible object is
     *     {@link GSessionScheduleType.SectionTeacherList }
     *     
     */
    public GSessionScheduleType.SectionTeacherList getSectionTeacherList() {
        return sectionTeacherList;
    }

    /**
     * Sets the value of the sectionTeacherList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSessionScheduleType.SectionTeacherList }
     *     
     */
    public void setSectionTeacherList(GSessionScheduleType.SectionTeacherList value) {
        this.sectionTeacherList = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="sectionTeacher" type="{http://www.sifassociation.org/datamodel/na/3.2}gSectionTeacherType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sectionTeacher"
    })
    public static class SectionTeacherList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GSectionTeacherType> sectionTeacher;

        /**
         * Gets the value of the sectionTeacher property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the sectionTeacher property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSectionTeacher().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GSectionTeacherType }
         * 
         * 
         */
        public List<GSectionTeacherType> getSectionTeacher() {
            if (sectionTeacher == null) {
                sectionTeacher = new ArrayList<GSectionTeacherType>();
            }
            return this.sectionTeacher;
        }

    }

}
