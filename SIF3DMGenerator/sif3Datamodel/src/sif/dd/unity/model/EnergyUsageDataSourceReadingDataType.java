
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EnergyUsageDataSourceReadingDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyUsageDataSourceReadingDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Measurement">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SensorId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Interval" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="EnergyUnits">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ReadingName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReadingList" type="{http://www.sifassociation.org/datamodel/na/4.x}EnergyUsageDataReadingListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyUsageDataSourceReadingDataType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "measurement",
    "sensorId",
    "interval",
    "energyUnits",
    "readingName",
    "readingList"
})
public class EnergyUsageDataSourceReadingDataType {

    @XmlElement(name = "Measurement", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected EnergyUsageDataSourceReadingDataType.Measurement measurement;
    @XmlElement(name = "SensorId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String sensorId;
    @XmlElement(name = "Interval", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlSchemaType(name = "unsignedInt")
    protected Long interval;
    @XmlElement(name = "EnergyUnits", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected EnergyUsageDataSourceReadingDataType.EnergyUnits energyUnits;
    @XmlElement(name = "ReadingName", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected String readingName;
    @XmlElement(name = "ReadingList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected EnergyUsageDataReadingListType readingList;

    /**
     * Gets the value of the measurement property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyUsageDataSourceReadingDataType.Measurement }
     *     
     */
    public EnergyUsageDataSourceReadingDataType.Measurement getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyUsageDataSourceReadingDataType.Measurement }
     *     
     */
    public void setMeasurement(EnergyUsageDataSourceReadingDataType.Measurement value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the sensorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorId() {
        return sensorId;
    }

    /**
     * Sets the value of the sensorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorId(String value) {
        this.sensorId = value;
    }

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setInterval(Long value) {
        this.interval = value;
    }

    /**
     * Gets the value of the energyUnits property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyUsageDataSourceReadingDataType.EnergyUnits }
     *     
     */
    public EnergyUsageDataSourceReadingDataType.EnergyUnits getEnergyUnits() {
        return energyUnits;
    }

    /**
     * Sets the value of the energyUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyUsageDataSourceReadingDataType.EnergyUnits }
     *     
     */
    public void setEnergyUnits(EnergyUsageDataSourceReadingDataType.EnergyUnits value) {
        this.energyUnits = value;
    }

    /**
     * Gets the value of the readingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingName() {
        return readingName;
    }

    /**
     * Sets the value of the readingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingName(String value) {
        this.readingName = value;
    }

    /**
     * Gets the value of the readingList property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyUsageDataReadingListType }
     *     
     */
    public EnergyUsageDataReadingListType getReadingList() {
        return readingList;
    }

    /**
     * Sets the value of the readingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyUsageDataReadingListType }
     *     
     */
    public void setReadingList(EnergyUsageDataReadingListType value) {
        this.readingList = value;
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
    public static class EnergyUnits {

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
    public static class Measurement {

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
