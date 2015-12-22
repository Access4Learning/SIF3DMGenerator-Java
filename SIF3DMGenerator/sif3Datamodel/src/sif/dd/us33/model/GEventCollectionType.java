
package sif.dd.us33.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A calendar.
 * 
 * <p>Java class for gEventCollectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="gEventCollectionType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.3}gPlanType">
 *       &lt;sequence>
 *         &lt;element name="organizationRefId" type="{http://www.sifassociation.org/datamodel/na/3.3}gGenericRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gEventCollectionType", namespace = "http://www.sifassociation.org/datamodel/na/3.3", propOrder = {
    "organizationRefId",
    "startDate",
    "endDate",
    "duration"
})
@XmlSeeAlso({
    GBellScheduleType.class,
    GSchoolCalendarType.class
})
public class GEventCollectionType
    extends GPlanType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected GGenericRefIdPointerType organizationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.3")
    protected Duration duration;

    /**
     * Gets the value of the organizationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getOrganizationRefId() {
        return organizationRefId;
    }

    /**
     * Sets the value of the organizationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setOrganizationRefId(GGenericRefIdPointerType value) {
        this.organizationRefId = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

}
