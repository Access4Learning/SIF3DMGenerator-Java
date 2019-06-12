
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ScheduleInfoOverrideType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleInfoOverrideType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeetingTimeList" type="{http://www.sifassociation.org/datamodel/na/4.x}MeetingTimeListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Override" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="OverrideCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="TermInfoRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduleInfoOverrideType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "meetingTimeList"
})
public class ScheduleInfoOverrideType {

    @XmlElement(name = "MeetingTimeList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected MeetingTimeListType meetingTimeList;
    @XmlAttribute(name = "Override", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String override;
    @XmlAttribute(name = "OverrideCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String overrideCodeset;
    @XmlAttribute(name = "TermInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String termInfoRefId;

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
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverride(String value) {
        this.override = value;
    }

    /**
     * Gets the value of the overrideCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideCodeset() {
        return overrideCodeset;
    }

    /**
     * Sets the value of the overrideCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideCodeset(String value) {
        this.overrideCodeset = value;
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
