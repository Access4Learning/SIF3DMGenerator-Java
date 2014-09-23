
package sif.dd.us32.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for calendarCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="calendarCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="period" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="calendarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="calendarDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionMarkingTermIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionSchedulingTermIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="crisis" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="crisisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="crisisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="crisisType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="crisisStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="eventList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="event" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="calendarEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="calendarEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="calendarEventDayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="alternateDayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="refId" use="required" type="{http://www.sifassociation.org/datamodel/na/3.2}gRefIdType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calendarCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "period",
    "crisis",
    "eventList"
})
public class CalendarCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected CalendarCEDSType.Period period;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected CalendarCEDSType.Crisis crisis;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected CalendarCEDSType.EventList eventList;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarCEDSType.Period }
     *     
     */
    public CalendarCEDSType.Period getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarCEDSType.Period }
     *     
     */
    public void setPeriod(CalendarCEDSType.Period value) {
        this.period = value;
    }

    /**
     * Gets the value of the crisis property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarCEDSType.Crisis }
     *     
     */
    public CalendarCEDSType.Crisis getCrisis() {
        return crisis;
    }

    /**
     * Sets the value of the crisis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarCEDSType.Crisis }
     *     
     */
    public void setCrisis(CalendarCEDSType.Crisis value) {
        this.crisis = value;
    }

    /**
     * Gets the value of the eventList property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarCEDSType.EventList }
     *     
     */
    public CalendarCEDSType.EventList getEventList() {
        return eventList;
    }

    /**
     * Sets the value of the eventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarCEDSType.EventList }
     *     
     */
    public void setEventList(CalendarCEDSType.EventList value) {
        this.eventList = value;
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
     *         &lt;element name="crisisCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="crisisName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="crisisType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="crisisStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "crisisCode",
        "crisisName",
        "crisisType",
        "crisisStartDate"
    })
    public static class Crisis {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String crisisCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String crisisName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String crisisType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String crisisStartDate;

        /**
         * Gets the value of the crisisCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrisisCode() {
            return crisisCode;
        }

        /**
         * Sets the value of the crisisCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrisisCode(String value) {
            this.crisisCode = value;
        }

        /**
         * Gets the value of the crisisName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrisisName() {
            return crisisName;
        }

        /**
         * Sets the value of the crisisName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrisisName(String value) {
            this.crisisName = value;
        }

        /**
         * Gets the value of the crisisType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrisisType() {
            return crisisType;
        }

        /**
         * Sets the value of the crisisType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrisisType(String value) {
            this.crisisType = value;
        }

        /**
         * Gets the value of the crisisStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCrisisStartDate() {
            return crisisStartDate;
        }

        /**
         * Sets the value of the crisisStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCrisisStartDate(String value) {
            this.crisisStartDate = value;
        }

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
     *         &lt;element name="event" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="calendarEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="calendarEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="calendarEventDayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="alternateDayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "event"
    })
    public static class EventList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<CalendarCEDSType.EventList.Event> event;

        /**
         * Gets the value of the event property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the event property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CalendarCEDSType.EventList.Event }
         * 
         * 
         */
        public List<CalendarCEDSType.EventList.Event> getEvent() {
            if (event == null) {
                event = new ArrayList<CalendarCEDSType.EventList.Event>();
            }
            return this.event;
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
         *         &lt;element name="calendarEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="calendarEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="calendarEventDayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="alternateDayName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "calendarEventType",
            "calendarEventDate",
            "calendarEventDayName",
            "alternateDayName"
        })
        public static class Event {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String calendarEventType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String calendarEventDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String calendarEventDayName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String alternateDayName;

            /**
             * Gets the value of the calendarEventType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCalendarEventType() {
                return calendarEventType;
            }

            /**
             * Sets the value of the calendarEventType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCalendarEventType(String value) {
                this.calendarEventType = value;
            }

            /**
             * Gets the value of the calendarEventDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCalendarEventDate() {
                return calendarEventDate;
            }

            /**
             * Sets the value of the calendarEventDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCalendarEventDate(String value) {
                this.calendarEventDate = value;
            }

            /**
             * Gets the value of the calendarEventDayName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCalendarEventDayName() {
                return calendarEventDayName;
            }

            /**
             * Sets the value of the calendarEventDayName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCalendarEventDayName(String value) {
                this.calendarEventDayName = value;
            }

            /**
             * Gets the value of the alternateDayName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAlternateDayName() {
                return alternateDayName;
            }

            /**
             * Sets the value of the alternateDayName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAlternateDayName(String value) {
                this.alternateDayName = value;
            }

        }

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
     *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="calendarCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="calendarDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionMarkingTermIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionSchedulingTermIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "schoolYear",
        "calendarCode",
        "calendarDescription",
        "sessionCode",
        "sessionDescription",
        "sessionMarkingTermIndicator",
        "sessionSchedulingTermIndicator"
    })
    public static class Period {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String calendarCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String calendarDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sessionCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sessionDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sessionMarkingTermIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sessionSchedulingTermIndicator;

        /**
         * Gets the value of the schoolYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolYear() {
            return schoolYear;
        }

        /**
         * Sets the value of the schoolYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolYear(String value) {
            this.schoolYear = value;
        }

        /**
         * Gets the value of the calendarCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCalendarCode() {
            return calendarCode;
        }

        /**
         * Sets the value of the calendarCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCalendarCode(String value) {
            this.calendarCode = value;
        }

        /**
         * Gets the value of the calendarDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCalendarDescription() {
            return calendarDescription;
        }

        /**
         * Sets the value of the calendarDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCalendarDescription(String value) {
            this.calendarDescription = value;
        }

        /**
         * Gets the value of the sessionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionCode() {
            return sessionCode;
        }

        /**
         * Sets the value of the sessionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionCode(String value) {
            this.sessionCode = value;
        }

        /**
         * Gets the value of the sessionDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionDescription() {
            return sessionDescription;
        }

        /**
         * Sets the value of the sessionDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionDescription(String value) {
            this.sessionDescription = value;
        }

        /**
         * Gets the value of the sessionMarkingTermIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionMarkingTermIndicator() {
            return sessionMarkingTermIndicator;
        }

        /**
         * Sets the value of the sessionMarkingTermIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionMarkingTermIndicator(String value) {
            this.sessionMarkingTermIndicator = value;
        }

        /**
         * Gets the value of the sessionSchedulingTermIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionSchedulingTermIndicator() {
            return sessionSchedulingTermIndicator;
        }

        /**
         * Sets the value of the sessionSchedulingTermIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionSchedulingTermIndicator(String value) {
            this.sessionSchedulingTermIndicator = value;
        }

    }

}
