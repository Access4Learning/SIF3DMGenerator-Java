
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for gSchoolCalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gSchoolCalendarType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gEventCollectionType">
 *       &lt;sequence>
 *         &lt;element name="schoolRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gRefIdPointerType"/>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="localId" type="{http://www.sifassociation.org/datamodel/na/3.3}gLocalIdType"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daysInSession" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="firstInstructionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="lastInstructionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="graduationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="instructionalMinutes" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="minutesPerDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="yearGroupList" type="{http://www.sifassociation.org/datamodel/na/3.3}gYearGroupList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gSchoolCalendarType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "schoolRefId",
    "schoolYear",
    "localId",
    "description",
    "daysInSession",
    "firstInstructionDate",
    "lastInstructionDate",
    "graduationDate",
    "instructionalMinutes",
    "minutesPerDay",
    "yearGroupList"
})
@XmlSeeAlso({
    SchoolCalendarType.class
})
public class GSchoolCalendarType
    extends GEventCollectionType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected GLocalIdType localId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected String description;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected int daysInSession;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar firstInstructionDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastInstructionDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar graduationDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected Integer instructionalMinutes;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected Integer minutesPerDay;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GYearGroupList yearGroupList;

    /**
     * Gets the value of the schoolRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolRefId() {
        return schoolRefId;
    }

    /**
     * Sets the value of the schoolRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolRefId(String value) {
        this.schoolRefId = value;
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
     * Gets the value of the localId property.
     * 
     * @return
     *     possible object is
     *     {@link GLocalIdType }
     *     
     */
    public GLocalIdType getLocalId() {
        return localId;
    }

    /**
     * Sets the value of the localId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLocalIdType }
     *     
     */
    public void setLocalId(GLocalIdType value) {
        this.localId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the daysInSession property.
     * 
     */
    public int getDaysInSession() {
        return daysInSession;
    }

    /**
     * Sets the value of the daysInSession property.
     * 
     */
    public void setDaysInSession(int value) {
        this.daysInSession = value;
    }

    /**
     * Gets the value of the firstInstructionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFirstInstructionDate() {
        return firstInstructionDate;
    }

    /**
     * Sets the value of the firstInstructionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFirstInstructionDate(XMLGregorianCalendar value) {
        this.firstInstructionDate = value;
    }

    /**
     * Gets the value of the lastInstructionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastInstructionDate() {
        return lastInstructionDate;
    }

    /**
     * Sets the value of the lastInstructionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastInstructionDate(XMLGregorianCalendar value) {
        this.lastInstructionDate = value;
    }

    /**
     * Gets the value of the graduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGraduationDate() {
        return graduationDate;
    }

    /**
     * Sets the value of the graduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGraduationDate(XMLGregorianCalendar value) {
        this.graduationDate = value;
    }

    /**
     * Gets the value of the instructionalMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstructionalMinutes() {
        return instructionalMinutes;
    }

    /**
     * Sets the value of the instructionalMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstructionalMinutes(Integer value) {
        this.instructionalMinutes = value;
    }

    /**
     * Gets the value of the minutesPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinutesPerDay() {
        return minutesPerDay;
    }

    /**
     * Sets the value of the minutesPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinutesPerDay(Integer value) {
        this.minutesPerDay = value;
    }

    /**
     * Gets the value of the yearGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link GYearGroupList }
     *     
     */
    public GYearGroupList getYearGroupList() {
        return yearGroupList;
    }

    /**
     * Sets the value of the yearGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GYearGroupList }
     *     
     */
    public void setYearGroupList(GYearGroupList value) {
        this.yearGroupList = value;
    }

}
