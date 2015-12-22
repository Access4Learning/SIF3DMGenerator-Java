
package sif.dd.us33.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This object contains energy usage information for an energy location.
 * 
 * <p>Java class for energyUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="energyUsageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gSIF_ReportType">
 *       &lt;sequence>
 *         &lt;element name="usageLocation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="building" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="energyZone" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="type">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="facility" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                             &lt;enumeration value="Classroom"/>
 *                                             &lt;enumeration value="Office"/>
 *                                             &lt;enumeration value="Hall"/>
 *                                             &lt;enumeration value="Auditorium"/>
 *                                             &lt;enumeration value="Gymnasium"/>
 *                                             &lt;enumeration value="Locker Room"/>
 *                                             &lt;enumeration value="Swimming Pool"/>
 *                                             &lt;enumeration value="Cafeteria"/>
 *                                             &lt;enumeration value="Kitchen"/>
 *                                             &lt;enumeration value="Library"/>
 *                                             &lt;enumeration value="Study Hall"/>
 *                                             &lt;enumeration value="Laboratory"/>
 *                                             &lt;enumeration value="Shop"/>
 *                                             &lt;enumeration value="Storage"/>
 *                                             &lt;enumeration value="Home Economics"/>
 *                                             &lt;enumeration value="Wing"/>
 *                                             &lt;enumeration value="Floor"/>
 *                                             &lt;enumeration value="Building"/>
 *                                             &lt;enumeration value="Campus"/>
 *                                             &lt;enumeration value="Other"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="energyZoneName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                             &lt;element name="tagList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *                                                 &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dataSource" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *                   &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="readingDataList">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="readingData" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="measurement">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                             &lt;enumeration value="Gas"/>
 *                                             &lt;enumeration value="Electrical"/>
 *                                             &lt;enumeration value="Thermometer"/>
 *                                             &lt;enumeration value="Thermostat"/>
 *                                             &lt;enumeration value="Cost"/>
 *                                             &lt;enumeration value="Other"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="sensorId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                                       &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *                                       &lt;element name="energyUnits">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                                             &lt;enumeration value="DegreeCentigrade"/>
 *                                             &lt;enumeration value="Kilowatt-Hour"/>
 *                                             &lt;enumeration value="$/Kilowatt-Hour"/>
 *                                             &lt;enumeration value="ThousandCubicFeet"/>
 *                                             &lt;enumeration value="$/ThousandCubicFeet"/>
 *                                             &lt;enumeration value="Other"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="readingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="readingList" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="reading" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;simpleContent>
 *                                                       &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                                                         &lt;attribute name="intervalIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *                                                       &lt;/extension>
 *                                                     &lt;/simpleContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "energyUsageType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "usageLocation",
    "dataSource"
})
public class EnergyUsageType
    extends GSIFReportType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
    protected EnergyUsageType.UsageLocation usageLocation;
    @XmlElementRef(name = "dataSource", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
    protected JAXBElement<EnergyUsageType.DataSource> dataSource;

    /**
     * Gets the value of the usageLocation property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyUsageType.UsageLocation }
     *     
     */
    public EnergyUsageType.UsageLocation getUsageLocation() {
        return usageLocation;
    }

    /**
     * Sets the value of the usageLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyUsageType.UsageLocation }
     *     
     */
    public void setUsageLocation(EnergyUsageType.UsageLocation value) {
        this.usageLocation = value;
    }

    /**
     * Gets the value of the dataSource property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnergyUsageType.DataSource }{@code >}
     *     
     */
    public JAXBElement<EnergyUsageType.DataSource> getDataSource() {
        return dataSource;
    }

    /**
     * Sets the value of the dataSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnergyUsageType.DataSource }{@code >}
     *     
     */
    public void setDataSource(JAXBElement<EnergyUsageType.DataSource> value) {
        this.dataSource = value;
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
     *         &lt;element name="system" type="{http://www.w3.org/2001/XMLSchema}token"/>
     *         &lt;element name="startTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="readingDataList">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="readingData" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="measurement">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                   &lt;enumeration value="Gas"/>
     *                                   &lt;enumeration value="Electrical"/>
     *                                   &lt;enumeration value="Thermometer"/>
     *                                   &lt;enumeration value="Thermostat"/>
     *                                   &lt;enumeration value="Cost"/>
     *                                   &lt;enumeration value="Other"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="sensorId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                             &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
     *                             &lt;element name="energyUnits">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                   &lt;enumeration value="DegreeCentigrade"/>
     *                                   &lt;enumeration value="Kilowatt-Hour"/>
     *                                   &lt;enumeration value="$/Kilowatt-Hour"/>
     *                                   &lt;enumeration value="ThousandCubicFeet"/>
     *                                   &lt;enumeration value="$/ThousandCubicFeet"/>
     *                                   &lt;enumeration value="Other"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="readingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="readingList" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="reading" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;simpleContent>
     *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *                                               &lt;attribute name="intervalIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
     *                                             &lt;/extension>
     *                                           &lt;/simpleContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "system",
        "startTime",
        "readingDataList",
        "any"
    })
    public static class DataSource {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String system;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        protected EnergyUsageType.DataSource.ReadingDataList readingDataList;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the system property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSystem() {
            return system;
        }

        /**
         * Sets the value of the system property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSystem(String value) {
            this.system = value;
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
         * Gets the value of the readingDataList property.
         * 
         * @return
         *     possible object is
         *     {@link EnergyUsageType.DataSource.ReadingDataList }
         *     
         */
        public EnergyUsageType.DataSource.ReadingDataList getReadingDataList() {
            return readingDataList;
        }

        /**
         * Sets the value of the readingDataList property.
         * 
         * @param value
         *     allowed object is
         *     {@link EnergyUsageType.DataSource.ReadingDataList }
         *     
         */
        public void setReadingDataList(EnergyUsageType.DataSource.ReadingDataList value) {
            this.readingDataList = value;
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
         *         &lt;element name="readingData" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="measurement">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                         &lt;enumeration value="Gas"/>
         *                         &lt;enumeration value="Electrical"/>
         *                         &lt;enumeration value="Thermometer"/>
         *                         &lt;enumeration value="Thermostat"/>
         *                         &lt;enumeration value="Cost"/>
         *                         &lt;enumeration value="Other"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="sensorId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *                   &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
         *                   &lt;element name="energyUnits">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                         &lt;enumeration value="DegreeCentigrade"/>
         *                         &lt;enumeration value="Kilowatt-Hour"/>
         *                         &lt;enumeration value="$/Kilowatt-Hour"/>
         *                         &lt;enumeration value="ThousandCubicFeet"/>
         *                         &lt;enumeration value="$/ThousandCubicFeet"/>
         *                         &lt;enumeration value="Other"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="readingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="readingList" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="reading" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;simpleContent>
         *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
         *                                     &lt;attribute name="intervalIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
         *                                   &lt;/extension>
         *                                 &lt;/simpleContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
            "readingData"
        })
        public static class ReadingDataList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
            protected List<EnergyUsageType.DataSource.ReadingDataList.ReadingData> readingData;

            /**
             * Gets the value of the readingData property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the readingData property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getReadingData().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EnergyUsageType.DataSource.ReadingDataList.ReadingData }
             * 
             * 
             */
            public List<EnergyUsageType.DataSource.ReadingDataList.ReadingData> getReadingData() {
                if (readingData == null) {
                    readingData = new ArrayList<EnergyUsageType.DataSource.ReadingDataList.ReadingData>();
                }
                return this.readingData;
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
             *         &lt;element name="measurement">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *               &lt;enumeration value="Gas"/>
             *               &lt;enumeration value="Electrical"/>
             *               &lt;enumeration value="Thermometer"/>
             *               &lt;enumeration value="Thermostat"/>
             *               &lt;enumeration value="Cost"/>
             *               &lt;enumeration value="Other"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="sensorId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
             *         &lt;element name="interval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
             *         &lt;element name="energyUnits">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *               &lt;enumeration value="DegreeCentigrade"/>
             *               &lt;enumeration value="Kilowatt-Hour"/>
             *               &lt;enumeration value="$/Kilowatt-Hour"/>
             *               &lt;enumeration value="ThousandCubicFeet"/>
             *               &lt;enumeration value="$/ThousandCubicFeet"/>
             *               &lt;enumeration value="Other"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="readingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="readingList" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="reading" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;simpleContent>
             *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
             *                           &lt;attribute name="intervalIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
             *                         &lt;/extension>
             *                       &lt;/simpleContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
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
            @XmlType(name = "", propOrder = {
                "measurement",
                "sensorId",
                "interval",
                "energyUnits",
                "readingName",
                "readingList",
                "any"
            })
            public static class ReadingData {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String measurement;
                @XmlElementRef(name = "sensorId", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> sensorId;
                @XmlElementRef(name = "interval", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                protected JAXBElement<Long> interval;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String energyUnits;
                @XmlElementRef(name = "readingName", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> readingName;
                @XmlElementRef(name = "readingList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                protected JAXBElement<EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList> readingList;
                @XmlAnyElement(lax = true)
                protected List<Object> any;

                /**
                 * Gets the value of the measurement property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMeasurement() {
                    return measurement;
                }

                /**
                 * Sets the value of the measurement property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMeasurement(String value) {
                    this.measurement = value;
                }

                /**
                 * Gets the value of the sensorId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getSensorId() {
                    return sensorId;
                }

                /**
                 * Sets the value of the sensorId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setSensorId(JAXBElement<String> value) {
                    this.sensorId = value;
                }

                /**
                 * Gets the value of the interval property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link Long }{@code >}
                 *     
                 */
                public JAXBElement<Long> getInterval() {
                    return interval;
                }

                /**
                 * Sets the value of the interval property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link Long }{@code >}
                 *     
                 */
                public void setInterval(JAXBElement<Long> value) {
                    this.interval = value;
                }

                /**
                 * Gets the value of the energyUnits property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEnergyUnits() {
                    return energyUnits;
                }

                /**
                 * Sets the value of the energyUnits property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEnergyUnits(String value) {
                    this.energyUnits = value;
                }

                /**
                 * Gets the value of the readingName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getReadingName() {
                    return readingName;
                }

                /**
                 * Sets the value of the readingName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setReadingName(JAXBElement<String> value) {
                    this.readingName = value;
                }

                /**
                 * Gets the value of the readingList property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList }{@code >}
                 *     
                 */
                public JAXBElement<EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList> getReadingList() {
                    return readingList;
                }

                /**
                 * Sets the value of the readingList property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList }{@code >}
                 *     
                 */
                public void setReadingList(JAXBElement<EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList> value) {
                    this.readingList = value;
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
                 *         &lt;element name="reading" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;simpleContent>
                 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                 *                 &lt;attribute name="intervalIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
                @XmlType(name = "", propOrder = {
                    "reading"
                })
                public static class ReadingList {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                    protected List<EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList.Reading> reading;

                    /**
                     * Gets the value of the reading property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the reading property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getReading().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList.Reading }
                     * 
                     * 
                     */
                    public List<EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList.Reading> getReading() {
                        if (reading == null) {
                            reading = new ArrayList<EnergyUsageType.DataSource.ReadingDataList.ReadingData.ReadingList.Reading>();
                        }
                        return this.reading;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;simpleContent>
                     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
                     *       &lt;attribute name="intervalIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
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
                    public static class Reading {

                        @XmlValue
                        protected BigDecimal value;
                        @XmlAttribute(name = "intervalIndex", required = true)
                        @XmlSchemaType(name = "unsignedInt")
                        protected long intervalIndex;

                        /**
                         * Gets the value of the value property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public BigDecimal getValue() {
                            return value;
                        }

                        /**
                         * Sets the value of the value property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigDecimal }
                         *     
                         */
                        public void setValue(BigDecimal value) {
                            this.value = value;
                        }

                        /**
                         * Gets the value of the intervalIndex property.
                         * 
                         */
                        public long getIntervalIndex() {
                            return intervalIndex;
                        }

                        /**
                         * Sets the value of the intervalIndex property.
                         * 
                         */
                        public void setIntervalIndex(long value) {
                            this.intervalIndex = value;
                        }

                    }

                }

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
     *         &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="building" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="energyZone" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="type">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="facility" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *                                   &lt;enumeration value="Classroom"/>
     *                                   &lt;enumeration value="Office"/>
     *                                   &lt;enumeration value="Hall"/>
     *                                   &lt;enumeration value="Auditorium"/>
     *                                   &lt;enumeration value="Gymnasium"/>
     *                                   &lt;enumeration value="Locker Room"/>
     *                                   &lt;enumeration value="Swimming Pool"/>
     *                                   &lt;enumeration value="Cafeteria"/>
     *                                   &lt;enumeration value="Kitchen"/>
     *                                   &lt;enumeration value="Library"/>
     *                                   &lt;enumeration value="Study Hall"/>
     *                                   &lt;enumeration value="Laboratory"/>
     *                                   &lt;enumeration value="Shop"/>
     *                                   &lt;enumeration value="Storage"/>
     *                                   &lt;enumeration value="Home Economics"/>
     *                                   &lt;enumeration value="Wing"/>
     *                                   &lt;enumeration value="Floor"/>
     *                                   &lt;enumeration value="Building"/>
     *                                   &lt;enumeration value="Campus"/>
     *                                   &lt;enumeration value="Other"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="energyZoneName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                   &lt;element name="tagList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
     *                                       &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
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
    @XmlType(name = "", propOrder = {
        "schoolId",
        "building",
        "energyZone",
        "any"
    })
    public static class UsageLocation {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
        @XmlSchemaType(name = "anyURI")
        protected String schoolId;
        @XmlElementRef(name = "building", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
        protected JAXBElement<String> building;
        @XmlElementRef(name = "energyZone", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
        protected JAXBElement<EnergyUsageType.UsageLocation.EnergyZone> energyZone;
        @XmlAnyElement(lax = true)
        protected List<Object> any;

        /**
         * Gets the value of the schoolId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolId() {
            return schoolId;
        }

        /**
         * Sets the value of the schoolId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolId(String value) {
            this.schoolId = value;
        }

        /**
         * Gets the value of the building property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getBuilding() {
            return building;
        }

        /**
         * Sets the value of the building property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setBuilding(JAXBElement<String> value) {
            this.building = value;
        }

        /**
         * Gets the value of the energyZone property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link EnergyUsageType.UsageLocation.EnergyZone }{@code >}
         *     
         */
        public JAXBElement<EnergyUsageType.UsageLocation.EnergyZone> getEnergyZone() {
            return energyZone;
        }

        /**
         * Sets the value of the energyZone property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link EnergyUsageType.UsageLocation.EnergyZone }{@code >}
         *     
         */
        public void setEnergyZone(JAXBElement<EnergyUsageType.UsageLocation.EnergyZone> value) {
            this.energyZone = value;
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
         *         &lt;element name="type">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="facility" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
         *                         &lt;enumeration value="Classroom"/>
         *                         &lt;enumeration value="Office"/>
         *                         &lt;enumeration value="Hall"/>
         *                         &lt;enumeration value="Auditorium"/>
         *                         &lt;enumeration value="Gymnasium"/>
         *                         &lt;enumeration value="Locker Room"/>
         *                         &lt;enumeration value="Swimming Pool"/>
         *                         &lt;enumeration value="Cafeteria"/>
         *                         &lt;enumeration value="Kitchen"/>
         *                         &lt;enumeration value="Library"/>
         *                         &lt;enumeration value="Study Hall"/>
         *                         &lt;enumeration value="Laboratory"/>
         *                         &lt;enumeration value="Shop"/>
         *                         &lt;enumeration value="Storage"/>
         *                         &lt;enumeration value="Home Economics"/>
         *                         &lt;enumeration value="Wing"/>
         *                         &lt;enumeration value="Floor"/>
         *                         &lt;enumeration value="Building"/>
         *                         &lt;enumeration value="Campus"/>
         *                         &lt;enumeration value="Other"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;any namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="energyZoneName" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *         &lt;element name="tagList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
         *                             &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "type",
            "energyZoneName",
            "tagList",
            "any"
        })
        public static class EnergyZone {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            protected EnergyUsageType.UsageLocation.EnergyZone.Type type;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String energyZoneName;
            @XmlElementRef(name = "tagList", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
            protected JAXBElement<EnergyUsageType.UsageLocation.EnergyZone.TagList> tagList;
            @XmlAnyElement(lax = true)
            protected List<Object> any;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link EnergyUsageType.UsageLocation.EnergyZone.Type }
             *     
             */
            public EnergyUsageType.UsageLocation.EnergyZone.Type getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link EnergyUsageType.UsageLocation.EnergyZone.Type }
             *     
             */
            public void setType(EnergyUsageType.UsageLocation.EnergyZone.Type value) {
                this.type = value;
            }

            /**
             * Gets the value of the energyZoneName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnergyZoneName() {
                return energyZoneName;
            }

            /**
             * Sets the value of the energyZoneName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnergyZoneName(String value) {
                this.energyZoneName = value;
            }

            /**
             * Gets the value of the tagList property.
             * 
             * @return
             *     possible object is
             *     {@link JAXBElement }{@code <}{@link EnergyUsageType.UsageLocation.EnergyZone.TagList }{@code >}
             *     
             */
            public JAXBElement<EnergyUsageType.UsageLocation.EnergyZone.TagList> getTagList() {
                return tagList;
            }

            /**
             * Sets the value of the tagList property.
             * 
             * @param value
             *     allowed object is
             *     {@link JAXBElement }{@code <}{@link EnergyUsageType.UsageLocation.EnergyZone.TagList }{@code >}
             *     
             */
            public void setTagList(JAXBElement<EnergyUsageType.UsageLocation.EnergyZone.TagList> value) {
                this.tagList = value;
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
             *         &lt;element name="tag" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
             *                   &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                "tag"
            })
            public static class TagList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
                protected List<EnergyUsageType.UsageLocation.EnergyZone.TagList.Tag> tag;

                /**
                 * Gets the value of the tag property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the tag property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTag().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link EnergyUsageType.UsageLocation.EnergyZone.TagList.Tag }
                 * 
                 * 
                 */
                public List<EnergyUsageType.UsageLocation.EnergyZone.TagList.Tag> getTag() {
                    if (tag == null) {
                        tag = new ArrayList<EnergyUsageType.UsageLocation.EnergyZone.TagList.Tag>();
                    }
                    return this.tag;
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
                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
                 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
                    "name",
                    "value"
                })
                public static class Tag {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3", required = true)
                    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
                    @XmlSchemaType(name = "normalizedString")
                    protected String name;
                    @XmlElementRef(name = "value", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                    protected JAXBElement<String> value;

                    /**
                     * Gets the value of the name property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Sets the value of the name property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public JAXBElement<String> getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link JAXBElement }{@code <}{@link String }{@code >}
                     *     
                     */
                    public void setValue(JAXBElement<String> value) {
                        this.value = value;
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
             *         &lt;element name="facility" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
             *               &lt;enumeration value="Classroom"/>
             *               &lt;enumeration value="Office"/>
             *               &lt;enumeration value="Hall"/>
             *               &lt;enumeration value="Auditorium"/>
             *               &lt;enumeration value="Gymnasium"/>
             *               &lt;enumeration value="Locker Room"/>
             *               &lt;enumeration value="Swimming Pool"/>
             *               &lt;enumeration value="Cafeteria"/>
             *               &lt;enumeration value="Kitchen"/>
             *               &lt;enumeration value="Library"/>
             *               &lt;enumeration value="Study Hall"/>
             *               &lt;enumeration value="Laboratory"/>
             *               &lt;enumeration value="Shop"/>
             *               &lt;enumeration value="Storage"/>
             *               &lt;enumeration value="Home Economics"/>
             *               &lt;enumeration value="Wing"/>
             *               &lt;enumeration value="Floor"/>
             *               &lt;enumeration value="Building"/>
             *               &lt;enumeration value="Campus"/>
             *               &lt;enumeration value="Other"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            @XmlType(name = "", propOrder = {
                "facility",
                "description",
                "any"
            })
            public static class Type {

                @XmlElementRef(name = "facility", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> facility;
                @XmlElementRef(name = "description", namespace = "http://www.sifassociation.org/datamodel/na/3.3", type = JAXBElement.class, required = false)
                protected JAXBElement<String> description;
                @XmlAnyElement(lax = true)
                protected List<Object> any;

                /**
                 * Gets the value of the facility property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getFacility() {
                    return facility;
                }

                /**
                 * Sets the value of the facility property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setFacility(JAXBElement<String> value) {
                    this.facility = value;
                }

                /**
                 * Gets the value of the description property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public JAXBElement<String> getDescription() {
                    return description;
                }

                /**
                 * Sets the value of the description property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link JAXBElement }{@code <}{@link String }{@code >}
                 *     
                 */
                public void setDescription(JAXBElement<String> value) {
                    this.description = value;
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

            }

        }

    }

}
