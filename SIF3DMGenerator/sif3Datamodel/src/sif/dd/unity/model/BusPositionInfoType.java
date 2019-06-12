
package sif.dd.unity.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusPositionInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusPositionInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *         &lt;element name="GridLocation" type="{http://www.sifassociation.org/datamodel/na/4.x}GridLocationType"/>
 *         &lt;element name="TelematicsId" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="TelemetryList" type="{http://www.sifassociation.org/datamodel/na/4.x}TelemetryListType" minOccurs="0"/>
 *         &lt;element name="BusDriver" type="{http://www.sifassociation.org/datamodel/na/4.x}BusStaffType" minOccurs="0"/>
 *         &lt;element name="BusStaffList" type="{http://www.sifassociation.org/datamodel/na/4.x}BusStaffListType" minOccurs="0"/>
 *         &lt;element name="RouteStatus" type="{http://www.sifassociation.org/datamodel/na/4.x}BusRouteStatusType" minOccurs="0"/>
 *         &lt;element name="OtherStatus" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *         &lt;element name="Odometer" type="{http://www.sifassociation.org/datamodel/na/4.x}DistanceType" minOccurs="0"/>
 *         &lt;element name="Speedometer" type="{http://www.sifassociation.org/datamodel/na/4.x}DistanceType" minOccurs="0"/>
 *         &lt;element name="Students" type="{http://www.sifassociation.org/datamodel/na/4.x}BusPositionStudentListType" minOccurs="0"/>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusPositionInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "date",
    "time",
    "gridLocation",
    "telematicsId",
    "telemetryList",
    "busDriver",
    "busStaffList",
    "routeStatus",
    "otherStatus",
    "odometer",
    "speedometer",
    "students",
    "sifMetadata",
    "sifExtendedElements"
})
public class BusPositionInfoType {

    @XmlElement(name = "Date", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Time", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "GridLocation", namespace = "http://www.sifassociation.org/datamodel/na/4.x", required = true)
    protected GridLocationType gridLocation;
    @XmlElement(name = "TelematicsId", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String telematicsId;
    @XmlElement(name = "TelemetryList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TelemetryListType telemetryList;
    @XmlElement(name = "BusDriver", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BusStaffType busDriver;
    @XmlElement(name = "BusStaffList", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BusStaffListType busStaffList;
    @XmlElement(name = "RouteStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BusRouteStatusType routeStatus;
    @XmlElement(name = "OtherStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String otherStatus;
    @XmlElement(name = "Odometer", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DistanceType odometer;
    @XmlElement(name = "Speedometer", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DistanceType speedometer;
    @XmlElement(name = "Students", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected BusPositionStudentListType students;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the gridLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GridLocationType }
     *     
     */
    public GridLocationType getGridLocation() {
        return gridLocation;
    }

    /**
     * Sets the value of the gridLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridLocationType }
     *     
     */
    public void setGridLocation(GridLocationType value) {
        this.gridLocation = value;
    }

    /**
     * Gets the value of the telematicsId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelematicsId() {
        return telematicsId;
    }

    /**
     * Sets the value of the telematicsId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelematicsId(String value) {
        this.telematicsId = value;
    }

    /**
     * Gets the value of the telemetryList property.
     * 
     * @return
     *     possible object is
     *     {@link TelemetryListType }
     *     
     */
    public TelemetryListType getTelemetryList() {
        return telemetryList;
    }

    /**
     * Sets the value of the telemetryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TelemetryListType }
     *     
     */
    public void setTelemetryList(TelemetryListType value) {
        this.telemetryList = value;
    }

    /**
     * Gets the value of the busDriver property.
     * 
     * @return
     *     possible object is
     *     {@link BusStaffType }
     *     
     */
    public BusStaffType getBusDriver() {
        return busDriver;
    }

    /**
     * Sets the value of the busDriver property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusStaffType }
     *     
     */
    public void setBusDriver(BusStaffType value) {
        this.busDriver = value;
    }

    /**
     * Gets the value of the busStaffList property.
     * 
     * @return
     *     possible object is
     *     {@link BusStaffListType }
     *     
     */
    public BusStaffListType getBusStaffList() {
        return busStaffList;
    }

    /**
     * Sets the value of the busStaffList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusStaffListType }
     *     
     */
    public void setBusStaffList(BusStaffListType value) {
        this.busStaffList = value;
    }

    /**
     * Gets the value of the routeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link BusRouteStatusType }
     *     
     */
    public BusRouteStatusType getRouteStatus() {
        return routeStatus;
    }

    /**
     * Sets the value of the routeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusRouteStatusType }
     *     
     */
    public void setRouteStatus(BusRouteStatusType value) {
        this.routeStatus = value;
    }

    /**
     * Gets the value of the otherStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherStatus() {
        return otherStatus;
    }

    /**
     * Sets the value of the otherStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherStatus(String value) {
        this.otherStatus = value;
    }

    /**
     * Gets the value of the odometer property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getOdometer() {
        return odometer;
    }

    /**
     * Sets the value of the odometer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setOdometer(DistanceType value) {
        this.odometer = value;
    }

    /**
     * Gets the value of the speedometer property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getSpeedometer() {
        return speedometer;
    }

    /**
     * Sets the value of the speedometer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setSpeedometer(DistanceType value) {
        this.speedometer = value;
    }

    /**
     * Gets the value of the students property.
     * 
     * @return
     *     possible object is
     *     {@link BusPositionStudentListType }
     *     
     */
    public BusPositionStudentListType getStudents() {
        return students;
    }

    /**
     * Sets the value of the students property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusPositionStudentListType }
     *     
     */
    public void setStudents(BusPositionStudentListType value) {
        this.students = value;
    }

    /**
     * Gets the value of the sifMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SIFMetadataType }
     *     
     */
    public SIFMetadataType getSIFMetadata() {
        return sifMetadata;
    }

    /**
     * Sets the value of the sifMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFMetadataType }
     *     
     */
    public void setSIFMetadata(SIFMetadataType value) {
        this.sifMetadata = value;
    }

    /**
     * Gets the value of the sifExtendedElements property.
     * 
     * @return
     *     possible object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public SIFExtendedElementsType getSIFExtendedElements() {
        return sifExtendedElements;
    }

    /**
     * Sets the value of the sifExtendedElements property.
     * 
     * @param value
     *     allowed object is
     *     {@link SIFExtendedElementsType }
     *     
     */
    public void setSIFExtendedElements(SIFExtendedElementsType value) {
        this.sifExtendedElements = value;
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

}
