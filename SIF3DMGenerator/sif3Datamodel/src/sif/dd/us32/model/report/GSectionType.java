
package sif.dd.us32.model.report;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A setting in which organized instruction of course content is provided to one or more students (including cross-age groupings) for a given period of time. Known as Teaching Group in SIF UK.
 * 
 * <p>Java class for gSectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gSectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gEducationGroupingType">
 *       &lt;sequence>
 *         &lt;element name="longName" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="courseRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="timeTableSubjectRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="sessionScheduleList" type="{http://www.sifassociation.org/datamodel/na/3.2}gSessionScheduleList"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gSectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "longName",
    "courseRefId",
    "timeTableSubjectRefId",
    "sessionScheduleList"
})
public class GSectionType
    extends GEducationGroupingType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String longName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String courseRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String timeTableSubjectRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GSessionScheduleList sessionScheduleList;

    /**
     * Gets the value of the longName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongName() {
        return longName;
    }

    /**
     * Sets the value of the longName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongName(String value) {
        this.longName = value;
    }

    /**
     * Gets the value of the courseRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseRefId() {
        return courseRefId;
    }

    /**
     * Sets the value of the courseRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseRefId(String value) {
        this.courseRefId = value;
    }

    /**
     * Gets the value of the timeTableSubjectRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeTableSubjectRefId() {
        return timeTableSubjectRefId;
    }

    /**
     * Sets the value of the timeTableSubjectRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeTableSubjectRefId(String value) {
        this.timeTableSubjectRefId = value;
    }

    /**
     * Gets the value of the sessionScheduleList property.
     * 
     * @return
     *     possible object is
     *     {@link GSessionScheduleList }
     *     
     */
    public GSessionScheduleList getSessionScheduleList() {
        return sessionScheduleList;
    }

    /**
     * Sets the value of the sessionScheduleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GSessionScheduleList }
     *     
     */
    public void setSessionScheduleList(GSessionScheduleList value) {
        this.sessionScheduleList = value;
    }

}
