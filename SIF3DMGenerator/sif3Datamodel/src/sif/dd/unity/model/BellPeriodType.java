
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BellPeriodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BellPeriodType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TimetableDayIdentifier" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="TimetablePeriodIdentifier" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="EndTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="RegularSchoolPeriod">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InstructionalMinutes" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="UseInAttendanceCalculations">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "BellPeriodType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "timetableDayIdentifier",
    "timetablePeriodIdentifier",
    "startTime",
    "endTime",
    "regularSchoolPeriod",
    "instructionalMinutes",
    "useInAttendanceCalculations"
})
public class BellPeriodType {

    @XmlElement(name = "TimetableDayIdentifier", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timetableDayIdentifier;
    @XmlElement(name = "TimetablePeriodIdentifier", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String timetablePeriodIdentifier;
    @XmlElement(name = "StartTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar startTime;
    @XmlElement(name = "EndTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar endTime;
    @XmlElement(name = "RegularSchoolPeriod", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BellPeriodType.RegularSchoolPeriod regularSchoolPeriod;
    @XmlElement(name = "InstructionalMinutes", namespace = "http://www.sifassociation.org/datamodel/na/4.x")
    @XmlSchemaType(name = "unsignedInt")
    protected long instructionalMinutes;
    @XmlElement(name = "UseInAttendanceCalculations", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected BellPeriodType.UseInAttendanceCalculations useInAttendanceCalculations;

    /**
     * Gets the value of the timetableDayIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimetableDayIdentifier() {
        return timetableDayIdentifier;
    }

    /**
     * Sets the value of the timetableDayIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetableDayIdentifier(String value) {
        this.timetableDayIdentifier = value;
    }

    /**
     * Gets the value of the timetablePeriodIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimetablePeriodIdentifier() {
        return timetablePeriodIdentifier;
    }

    /**
     * Sets the value of the timetablePeriodIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimetablePeriodIdentifier(String value) {
        this.timetablePeriodIdentifier = value;
    }

    /**
     * Gets the value of the startTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartTime(XMLGregorianCalendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the endTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndTime() {
        return endTime;
    }

    /**
     * Sets the value of the endTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndTime(XMLGregorianCalendar value) {
        this.endTime = value;
    }

    /**
     * Gets the value of the regularSchoolPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BellPeriodType.RegularSchoolPeriod }
     *     
     */
    public BellPeriodType.RegularSchoolPeriod getRegularSchoolPeriod() {
        return regularSchoolPeriod;
    }

    /**
     * Sets the value of the regularSchoolPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BellPeriodType.RegularSchoolPeriod }
     *     
     */
    public void setRegularSchoolPeriod(BellPeriodType.RegularSchoolPeriod value) {
        this.regularSchoolPeriod = value;
    }

    /**
     * Gets the value of the instructionalMinutes property.
     * 
     */
    public long getInstructionalMinutes() {
        return instructionalMinutes;
    }

    /**
     * Sets the value of the instructionalMinutes property.
     * 
     */
    public void setInstructionalMinutes(long value) {
        this.instructionalMinutes = value;
    }

    /**
     * Gets the value of the useInAttendanceCalculations property.
     * 
     * @return
     *     possible object is
     *     {@link BellPeriodType.UseInAttendanceCalculations }
     *     
     */
    public BellPeriodType.UseInAttendanceCalculations getUseInAttendanceCalculations() {
        return useInAttendanceCalculations;
    }

    /**
     * Sets the value of the useInAttendanceCalculations property.
     * 
     * @param value
     *     allowed object is
     *     {@link BellPeriodType.UseInAttendanceCalculations }
     *     
     */
    public void setUseInAttendanceCalculations(BellPeriodType.UseInAttendanceCalculations value) {
        this.useInAttendanceCalculations = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RegularSchoolPeriod {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
     *       &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class UseInAttendanceCalculations {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String value;
        @XmlAttribute(name = "Codeset")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String codeset;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the codeset property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeset() {
            return codeset;
        }

        /**
         * Sets the value of the codeset property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeset(String value) {
            this.codeset = value;
        }

    }

}
