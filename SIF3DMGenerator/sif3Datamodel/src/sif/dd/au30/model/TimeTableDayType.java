
package sif.dd.au30.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This element identifies a 'day' in a TimeTable.
 * 
 * <p>Java class for TimeTableDayType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeTableDayType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayId" type="{http://www.sifassociation.org/datamodel/au/3.4}LocalIdType"/>
 *         &lt;element name="DayTitle" type="{http://www.w3.org/2001/XMLSchema}normalizedString"/>
 *         &lt;element name="TimeTablePeriodList" type="{http://www.sifassociation.org/datamodel/au/3.4}TimeTablePeriodListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeTableDayType", namespace = "http://www.sifassociation.org/datamodel/au/3.4", propOrder = {
    "dayId",
    "dayTitle",
    "timeTablePeriodList"
})
public class TimeTableDayType {

    @XmlElement(name = "DayId", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String dayId;
    @XmlElement(name = "DayTitle", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String dayTitle;
    @XmlElement(name = "TimeTablePeriodList", namespace = "http://www.sifassociation.org/datamodel/au/3.4", required = true)
    protected TimeTablePeriodListType timeTablePeriodList;

    /**
     * Gets the value of the dayId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayId() {
        return dayId;
    }

    /**
     * Sets the value of the dayId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayId(String value) {
        this.dayId = value;
    }

    /**
     * Gets the value of the dayTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayTitle() {
        return dayTitle;
    }

    /**
     * Sets the value of the dayTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayTitle(String value) {
        this.dayTitle = value;
    }

    /**
     * Gets the value of the timeTablePeriodList property.
     * 
     * @return
     *     possible object is
     *     {@link TimeTablePeriodListType }
     *     
     */
    public TimeTablePeriodListType getTimeTablePeriodList() {
        return timeTablePeriodList;
    }

    /**
     * Sets the value of the timeTablePeriodList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeTablePeriodListType }
     *     
     */
    public void setTimeTablePeriodList(TimeTablePeriodListType value) {
        this.timeTablePeriodList = value;
    }

}
