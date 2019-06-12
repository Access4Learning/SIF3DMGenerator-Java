
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ScheduleInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TeacherList" type="{http://www.sifassociation.org/datamodel/na/4.x}StaffListType" minOccurs="0"/>
 *         &lt;element name="SectionRoomList" type="{http://www.sifassociation.org/datamodel/na/4.x}RoomListType" minOccurs="0"/>
 *         &lt;element name="MeetingTimeList" type="{http://www.sifassociation.org/datamodel/na/4.x}MeetingTimeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TermInfoRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "teacherList",
    "sectionRoomList",
    "meetingTimeList"
})
public class ScheduleInfoType {

    @XmlElement(name = "TeacherList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StaffListType teacherList;
    @XmlElement(name = "SectionRoomList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected RoomListType sectionRoomList;
    @XmlElement(name = "MeetingTimeList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MeetingTimeListType meetingTimeList;
    @XmlAttribute(name = "TermInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String termInfoRefId;

    /**
     * Gets the value of the teacherList property.
     * 
     * @return
     *     possible object is
     *     {@link StaffListType }
     *     
     */
    public StaffListType getTeacherList() {
        return teacherList;
    }

    /**
     * Sets the value of the teacherList property.
     * 
     * @param value
     *     allowed object is
     *     {@link StaffListType }
     *     
     */
    public void setTeacherList(StaffListType value) {
        this.teacherList = value;
    }

    /**
     * Gets the value of the sectionRoomList property.
     * 
     * @return
     *     possible object is
     *     {@link RoomListType }
     *     
     */
    public RoomListType getSectionRoomList() {
        return sectionRoomList;
    }

    /**
     * Sets the value of the sectionRoomList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoomListType }
     *     
     */
    public void setSectionRoomList(RoomListType value) {
        this.sectionRoomList = value;
    }

    /**
     * Gets the value of the meetingTimeList property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingTimeListType }
     *     
     */
    public MeetingTimeListType getMeetingTimeList() {
        return meetingTimeList;
    }

    /**
     * Sets the value of the meetingTimeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingTimeListType }
     *     
     */
    public void setMeetingTimeList(MeetingTimeListType value) {
        this.meetingTimeList = value;
    }

    /**
     * Gets the value of the termInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermInfoRefId() {
        return termInfoRefId;
    }

    /**
     * Sets the value of the termInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermInfoRefId(String value) {
        this.termInfoRefId = value;
    }

}
