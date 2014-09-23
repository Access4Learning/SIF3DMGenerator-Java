
package sif.dd.us32.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides the bell schedule information for a school and school year, including timetable days, periods and bell schedules.
 * 
 * <p>Java class for gBellScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gBellScheduleType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gEventCollectionType">
 *       &lt;sequence>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/>
 *         &lt;element name="bellScheduleName" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="timetableDayList" type="{http://www.sifassociation.org/datamodel/na/3.2}gTimetableDayList"/>
 *         &lt;element name="timetablePeriodList" type="{http://www.sifassociation.org/datamodel/na/3.2}gTimetablePeriodList"/>
 *         &lt;element name="bellPeriodList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="bellPeriod" type="{http://www.sifassociation.org/datamodel/na/3.2}gBellPeriodType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="daysPerCycle" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="periodsPerDay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gBellScheduleType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "schoolYear",
    "bellScheduleName",
    "timetableDayList",
    "timetablePeriodList",
    "bellPeriodList",
    "daysPerCycle",
    "periodsPerDay"
})
public class GBellScheduleType
    extends GEventCollectionType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bellScheduleName;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GTimetableDayList timetableDayList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2", required = true)
    protected GTimetablePeriodList timetablePeriodList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GBellScheduleType.BellPeriodList bellPeriodList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Integer daysPerCycle;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected Integer periodsPerDay;

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
     *     {@link GTimetableDayList }
     *     
     */
    public GTimetableDayList getTimetableDayList() {
        return timetableDayList;
    }

    /**
     * Sets the value of the timetableDayList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTimetableDayList }
     *     
     */
    public void setTimetableDayList(GTimetableDayList value) {
        this.timetableDayList = value;
    }

    /**
     * Gets the value of the timetablePeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link GTimetablePeriodList }
     *     
     */
    public GTimetablePeriodList getTimetablePeriodList() {
        return timetablePeriodList;
    }

    /**
     * Sets the value of the timetablePeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GTimetablePeriodList }
     *     
     */
    public void setTimetablePeriodList(GTimetablePeriodList value) {
        this.timetablePeriodList = value;
    }

    /**
     * Gets the value of the bellPeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link GBellScheduleType.BellPeriodList }
     *     
     */
    public GBellScheduleType.BellPeriodList getBellPeriodList() {
        return bellPeriodList;
    }

    /**
     * Sets the value of the bellPeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GBellScheduleType.BellPeriodList }
     *     
     */
    public void setBellPeriodList(GBellScheduleType.BellPeriodList value) {
        this.bellPeriodList = value;
    }

    /**
     * Gets the value of the daysPerCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDaysPerCycle() {
        return daysPerCycle;
    }

    /**
     * Sets the value of the daysPerCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDaysPerCycle(Integer value) {
        this.daysPerCycle = value;
    }

    /**
     * Gets the value of the periodsPerDay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodsPerDay() {
        return periodsPerDay;
    }

    /**
     * Sets the value of the periodsPerDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodsPerDay(Integer value) {
        this.periodsPerDay = value;
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
     *         &lt;element name="bellPeriod" type="{http://www.sifassociation.org/datamodel/na/3.2}gBellPeriodType" maxOccurs="unbounded" minOccurs="0"/>
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
        "bellPeriod"
    })
    public static class BellPeriodList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GBellPeriodType> bellPeriod;

        /**
         * Gets the value of the bellPeriod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bellPeriod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBellPeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GBellPeriodType }
         * 
         * 
         */
        public List<GBellPeriodType> getBellPeriod() {
            if (bellPeriod == null) {
                bellPeriod = new ArrayList<GBellPeriodType>();
            }
            return this.bellPeriod;
        }

    }

}
