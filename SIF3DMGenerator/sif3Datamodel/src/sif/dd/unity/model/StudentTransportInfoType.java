
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
 * <p>Java class for StudentTransportInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentTransportInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Eligibility" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HomeToSchoolDistance" type="{http://www.sifassociation.org/datamodel/na/4.x}DistanceType" minOccurs="0"/>
 *         &lt;element name="WalkToStopDistance" type="{http://www.sifassociation.org/datamodel/na/4.x}DistanceType" minOccurs="0"/>
 *         &lt;element name="StopToSchoolDistance" type="{http://www.sifassociation.org/datamodel/na/4.x}DistanceType" minOccurs="0"/>
 *         &lt;element name="OriginPoint" type="{http://www.sifassociation.org/datamodel/na/4.x}OriginPointType" minOccurs="0"/>
 *         &lt;element name="HomeBusRouteDetail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="BusRouteDetail"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransferPoints" type="{http://www.sifassociation.org/datamodel/na/4.x}TransferPointListType" minOccurs="0"/>
 *         &lt;element name="SchoolBusRouteDetail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
 *                 &lt;attribute name="SIF_RefObject" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *                       &lt;enumeration value="BusRouteDetail"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DestinationPoint" type="{http://www.sifassociation.org/datamodel/na/4.x}DestinationPointType" minOccurs="0"/>
 *         &lt;element name="StateAidQualification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransportationStatus" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PublicExpense" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>token">
 *                 &lt;attribute name="Codeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SIF_Metadata" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_MetadataType" minOccurs="0"/>
 *         &lt;element name="SIF_ExtendedElements" type="{http://www.sifassociation.org/datamodel/na/4.x}SIF_ExtendedElementsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}RefIdType" />
 *       &lt;attribute name="StudentPersonalRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="TypeCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="DayOfWeek" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;pattern value="(Mo)?(Tu)?(We)?(Th)?(Fr)?(Sa)?(Su)?"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DayOfWeekCodeset" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="SchoolInfoRefId" use="required" type="{http://www.sifassociation.org/datamodel/na/4.x}IdRefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentTransportInfoType", namespace = "http://www.sifassociation.org/datamodel/na/4.x", propOrder = {
    "eligibility",
    "homeToSchoolDistance",
    "walkToStopDistance",
    "stopToSchoolDistance",
    "originPoint",
    "homeBusRouteDetail",
    "transferPoints",
    "schoolBusRouteDetail",
    "destinationPoint",
    "stateAidQualification",
    "transportationStatus",
    "publicExpense",
    "sifMetadata",
    "sifExtendedElements"
})
public class StudentTransportInfoType {

    @XmlElement(name = "Eligibility", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentTransportInfoType.Eligibility eligibility;
    @XmlElement(name = "HomeToSchoolDistance", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DistanceType homeToSchoolDistance;
    @XmlElement(name = "WalkToStopDistance", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DistanceType walkToStopDistance;
    @XmlElement(name = "StopToSchoolDistance", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DistanceType stopToSchoolDistance;
    @XmlElement(name = "OriginPoint", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected OriginPointType originPoint;
    @XmlElement(name = "HomeBusRouteDetail", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentTransportInfoType.HomeBusRouteDetail homeBusRouteDetail;
    @XmlElement(name = "TransferPoints", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected TransferPointListType transferPoints;
    @XmlElement(name = "SchoolBusRouteDetail", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentTransportInfoType.SchoolBusRouteDetail schoolBusRouteDetail;
    @XmlElement(name = "DestinationPoint", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected DestinationPointType destinationPoint;
    @XmlElement(name = "StateAidQualification", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentTransportInfoType.StateAidQualification stateAidQualification;
    @XmlElement(name = "TransportationStatus", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentTransportInfoType.TransportationStatus transportationStatus;
    @XmlElement(name = "PublicExpense", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected StudentTransportInfoType.PublicExpense publicExpense;
    @XmlElement(name = "SIF_Metadata", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFMetadataType sifMetadata;
    @XmlElement(name = "SIF_ExtendedElements", namespace = "http://www.sifassociation.org/datamodel/na/4.x", nillable = true)
    protected SIFExtendedElementsType sifExtendedElements;
    @XmlAttribute(name = "RefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;
    @XmlAttribute(name = "StudentPersonalRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String studentPersonalRefId;
    @XmlAttribute(name = "Type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String type;
    @XmlAttribute(name = "TypeCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCodeset;
    @XmlAttribute(name = "DayOfWeek", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dayOfWeek;
    @XmlAttribute(name = "DayOfWeekCodeset")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dayOfWeekCodeset;
    @XmlAttribute(name = "SchoolInfoRefId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schoolInfoRefId;

    /**
     * Gets the value of the eligibility property.
     * 
     * @return
     *     possible object is
     *     {@link StudentTransportInfoType.Eligibility }
     *     
     */
    public StudentTransportInfoType.Eligibility getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentTransportInfoType.Eligibility }
     *     
     */
    public void setEligibility(StudentTransportInfoType.Eligibility value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the homeToSchoolDistance property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getHomeToSchoolDistance() {
        return homeToSchoolDistance;
    }

    /**
     * Sets the value of the homeToSchoolDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setHomeToSchoolDistance(DistanceType value) {
        this.homeToSchoolDistance = value;
    }

    /**
     * Gets the value of the walkToStopDistance property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getWalkToStopDistance() {
        return walkToStopDistance;
    }

    /**
     * Sets the value of the walkToStopDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setWalkToStopDistance(DistanceType value) {
        this.walkToStopDistance = value;
    }

    /**
     * Gets the value of the stopToSchoolDistance property.
     * 
     * @return
     *     possible object is
     *     {@link DistanceType }
     *     
     */
    public DistanceType getStopToSchoolDistance() {
        return stopToSchoolDistance;
    }

    /**
     * Sets the value of the stopToSchoolDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistanceType }
     *     
     */
    public void setStopToSchoolDistance(DistanceType value) {
        this.stopToSchoolDistance = value;
    }

    /**
     * Gets the value of the originPoint property.
     * 
     * @return
     *     possible object is
     *     {@link OriginPointType }
     *     
     */
    public OriginPointType getOriginPoint() {
        return originPoint;
    }

    /**
     * Sets the value of the originPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginPointType }
     *     
     */
    public void setOriginPoint(OriginPointType value) {
        this.originPoint = value;
    }

    /**
     * Gets the value of the homeBusRouteDetail property.
     * 
     * @return
     *     possible object is
     *     {@link StudentTransportInfoType.HomeBusRouteDetail }
     *     
     */
    public StudentTransportInfoType.HomeBusRouteDetail getHomeBusRouteDetail() {
        return homeBusRouteDetail;
    }

    /**
     * Sets the value of the homeBusRouteDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentTransportInfoType.HomeBusRouteDetail }
     *     
     */
    public void setHomeBusRouteDetail(StudentTransportInfoType.HomeBusRouteDetail value) {
        this.homeBusRouteDetail = value;
    }

    /**
     * Gets the value of the transferPoints property.
     * 
     * @return
     *     possible object is
     *     {@link TransferPointListType }
     *     
     */
    public TransferPointListType getTransferPoints() {
        return transferPoints;
    }

    /**
     * Sets the value of the transferPoints property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferPointListType }
     *     
     */
    public void setTransferPoints(TransferPointListType value) {
        this.transferPoints = value;
    }

    /**
     * Gets the value of the schoolBusRouteDetail property.
     * 
     * @return
     *     possible object is
     *     {@link StudentTransportInfoType.SchoolBusRouteDetail }
     *     
     */
    public StudentTransportInfoType.SchoolBusRouteDetail getSchoolBusRouteDetail() {
        return schoolBusRouteDetail;
    }

    /**
     * Sets the value of the schoolBusRouteDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentTransportInfoType.SchoolBusRouteDetail }
     *     
     */
    public void setSchoolBusRouteDetail(StudentTransportInfoType.SchoolBusRouteDetail value) {
        this.schoolBusRouteDetail = value;
    }

    /**
     * Gets the value of the destinationPoint property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationPointType }
     *     
     */
    public DestinationPointType getDestinationPoint() {
        return destinationPoint;
    }

    /**
     * Sets the value of the destinationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationPointType }
     *     
     */
    public void setDestinationPoint(DestinationPointType value) {
        this.destinationPoint = value;
    }

    /**
     * Gets the value of the stateAidQualification property.
     * 
     * @return
     *     possible object is
     *     {@link StudentTransportInfoType.StateAidQualification }
     *     
     */
    public StudentTransportInfoType.StateAidQualification getStateAidQualification() {
        return stateAidQualification;
    }

    /**
     * Sets the value of the stateAidQualification property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentTransportInfoType.StateAidQualification }
     *     
     */
    public void setStateAidQualification(StudentTransportInfoType.StateAidQualification value) {
        this.stateAidQualification = value;
    }

    /**
     * Gets the value of the transportationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link StudentTransportInfoType.TransportationStatus }
     *     
     */
    public StudentTransportInfoType.TransportationStatus getTransportationStatus() {
        return transportationStatus;
    }

    /**
     * Sets the value of the transportationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentTransportInfoType.TransportationStatus }
     *     
     */
    public void setTransportationStatus(StudentTransportInfoType.TransportationStatus value) {
        this.transportationStatus = value;
    }

    /**
     * Gets the value of the publicExpense property.
     * 
     * @return
     *     possible object is
     *     {@link StudentTransportInfoType.PublicExpense }
     *     
     */
    public StudentTransportInfoType.PublicExpense getPublicExpense() {
        return publicExpense;
    }

    /**
     * Sets the value of the publicExpense property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentTransportInfoType.PublicExpense }
     *     
     */
    public void setPublicExpense(StudentTransportInfoType.PublicExpense value) {
        this.publicExpense = value;
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

    /**
     * Gets the value of the studentPersonalRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStudentPersonalRefId() {
        return studentPersonalRefId;
    }

    /**
     * Sets the value of the studentPersonalRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStudentPersonalRefId(String value) {
        this.studentPersonalRefId = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the typeCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCodeset() {
        return typeCodeset;
    }

    /**
     * Sets the value of the typeCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCodeset(String value) {
        this.typeCodeset = value;
    }

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    /**
     * Sets the value of the dayOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfWeek(String value) {
        this.dayOfWeek = value;
    }

    /**
     * Gets the value of the dayOfWeekCodeset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfWeekCodeset() {
        return dayOfWeekCodeset;
    }

    /**
     * Sets the value of the dayOfWeekCodeset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfWeekCodeset(String value) {
        this.dayOfWeekCodeset = value;
    }

    /**
     * Gets the value of the schoolInfoRefId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolInfoRefId() {
        return schoolInfoRefId;
    }

    /**
     * Sets the value of the schoolInfoRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolInfoRefId(String value) {
        this.schoolInfoRefId = value;
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
    public static class Eligibility {

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
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="BusRouteDetail"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class HomeBusRouteDetail {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

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
         * Gets the value of the sifRefObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIFRefObject() {
            return sifRefObject;
        }

        /**
         * Sets the value of the sifRefObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIFRefObject(String value) {
            this.sifRefObject = value;
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
    public static class PublicExpense {

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
     *     &lt;extension base="&lt;http://www.sifassociation.org/datamodel/na/4.x>IdRefType">
     *       &lt;attribute name="SIF_RefObject" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
     *             &lt;enumeration value="BusRouteDetail"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class SchoolBusRouteDetail {

        @XmlValue
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String value;
        @XmlAttribute(name = "SIF_RefObject", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String sifRefObject;

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
         * Gets the value of the sifRefObject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSIFRefObject() {
            return sifRefObject;
        }

        /**
         * Sets the value of the sifRefObject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSIFRefObject(String value) {
            this.sifRefObject = value;
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
    public static class StateAidQualification {

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
    public static class TransportationStatus {

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
