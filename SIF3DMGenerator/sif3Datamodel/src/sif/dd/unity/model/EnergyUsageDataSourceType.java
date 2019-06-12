
package sif.dd.unity.model;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EnergyUsageDataSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnergyUsageDataSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="System" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="StartTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ReadingDataList" type="{http://www.sifassociation.org/datamodel/na/4.x}EnergyUsageDataSourceReadingDataListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnergyUsageDataSourceType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "system",
    "startTime",
    "readingDataList"
})
public class EnergyUsageDataSourceType {

    @XmlElement(name = "System", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected String system;
    @XmlElement(name = "StartTime", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar startTime;
    @XmlElement(name = "ReadingDataList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected EnergyUsageDataSourceReadingDataListType readingDataList;

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
     *     {@link String }
     *     
     */
    public Calendar getStartTime() {
        return startTime;
    }

    /**
     * Sets the value of the startTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartTime(Calendar value) {
        this.startTime = value;
    }

    /**
     * Gets the value of the readingDataList property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyUsageDataSourceReadingDataListType }
     *     
     */
    public EnergyUsageDataSourceReadingDataListType getReadingDataList() {
        return readingDataList;
    }

    /**
     * Sets the value of the readingDataList property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyUsageDataSourceReadingDataListType }
     *     
     */
    public void setReadingDataList(EnergyUsageDataSourceReadingDataListType value) {
        this.readingDataList = value;
    }

}
