
package sif.dd.us32.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An incident that requires disciplinary action and reporting.
 * 
 * <p>Java class for disciplineIncidentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disciplineIncidentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gEventType">
 *       &lt;sequence>
 *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}gYear" minOccurs="0"/>
 *         &lt;element name="reportingAgency" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="agencyRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
 *                   &lt;element name="agencyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="incidentId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="incidentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="incidentTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="incidentTimeType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="incidentLocationId" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="locationType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="incidentLocationRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
 *         &lt;element name="incidentCost" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;fractionDigits value="2"/>
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="incidentReporter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="reporterType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                   &lt;element name="reporterName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                   &lt;element name="reporterRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="incidentCategoryList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="incidentCategory" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType">
 *                           &lt;sequence>
 *                             &lt;element name="categoryCodeComment" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="secondaryBehaviorList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="secondaryBehaviorCode" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="weaponTypeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="weaponType" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="offenderList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="offender" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="offenderType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="offenderRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
 *                             &lt;element name="offenderInjury" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="manifestationDetermination" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="meetingHeld" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                                       &lt;element name="meetingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                       &lt;element name="dueToDisability" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                                       &lt;element name="meetingOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="actionList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="action" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="code" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" minOccurs="0"/>
 *                                                 &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                                                 &lt;element name="actionDuration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                                                 &lt;element name="zeroTolerance" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                                                 &lt;element name="fullYearExpulsion" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                                                 &lt;element name="shortenedExpulsion" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                                                 &lt;element name="policeNotification" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                                                 &lt;element name="arrest" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                                                 &lt;element name="alternativeEducation" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
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
 *                             &lt;element name="weaponTypeList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="weaponType" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="secondaryBehaviorCodeList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="secondaryBehaviorCode" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="victimList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="victim" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="victimType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
 *                             &lt;element name="victimRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
 *                             &lt;element name="injury" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
 *         &lt;element name="incidentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentActionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="incidentAction" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *                             &lt;element name="zeroTolerance" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                             &lt;element name="policeNotification" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
 *                             &lt;element name="arrest" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
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
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "disciplineIncidentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "schoolYear",
    "reportingAgency",
    "incidentId",
    "incidentDate",
    "incidentTime",
    "incidentTimeType",
    "incidentLocationId",
    "locationType",
    "incidentLocationRefId",
    "incidentCost",
    "incidentReporter",
    "incidentCategoryList",
    "secondaryBehaviorList",
    "weaponTypeList",
    "offenderList",
    "victimList",
    "incidentDescription",
    "incidentActionList"
})
public class DisciplineIncidentType
    extends GEventType
{

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar schoolYear;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected DisciplineIncidentType.ReportingAgency reportingAgency;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String incidentId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar incidentDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar incidentTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String incidentTimeType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String incidentLocationId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String locationType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected GGenericRefIdPointerType incidentLocationRefId;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected BigDecimal incidentCost;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected DisciplineIncidentType.IncidentReporter incidentReporter;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected DisciplineIncidentType.IncidentCategoryList incidentCategoryList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected DisciplineIncidentType.SecondaryBehaviorList secondaryBehaviorList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected DisciplineIncidentType.WeaponTypeList weaponTypeList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected DisciplineIncidentType.OffenderList offenderList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected DisciplineIncidentType.VictimList victimList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected DisciplineIncidentType.IncidentActionList incidentActionList;

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
     * Gets the value of the reportingAgency property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineIncidentType.ReportingAgency }
     *     
     */
    public DisciplineIncidentType.ReportingAgency getReportingAgency() {
        return reportingAgency;
    }

    /**
     * Sets the value of the reportingAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineIncidentType.ReportingAgency }
     *     
     */
    public void setReportingAgency(DisciplineIncidentType.ReportingAgency value) {
        this.reportingAgency = value;
    }

    /**
     * Gets the value of the incidentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentId() {
        return incidentId;
    }

    /**
     * Sets the value of the incidentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentId(String value) {
        this.incidentId = value;
    }

    /**
     * Gets the value of the incidentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncidentDate() {
        return incidentDate;
    }

    /**
     * Sets the value of the incidentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncidentDate(XMLGregorianCalendar value) {
        this.incidentDate = value;
    }

    /**
     * Gets the value of the incidentTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIncidentTime() {
        return incidentTime;
    }

    /**
     * Sets the value of the incidentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIncidentTime(XMLGregorianCalendar value) {
        this.incidentTime = value;
    }

    /**
     * Gets the value of the incidentTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentTimeType() {
        return incidentTimeType;
    }

    /**
     * Sets the value of the incidentTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentTimeType(String value) {
        this.incidentTimeType = value;
    }

    /**
     * Gets the value of the incidentLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentLocationId() {
        return incidentLocationId;
    }

    /**
     * Sets the value of the incidentLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentLocationId(String value) {
        this.incidentLocationId = value;
    }

    /**
     * Gets the value of the locationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the incidentLocationRefId property.
     * 
     * @return
     *     possible object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public GGenericRefIdPointerType getIncidentLocationRefId() {
        return incidentLocationRefId;
    }

    /**
     * Sets the value of the incidentLocationRefId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GGenericRefIdPointerType }
     *     
     */
    public void setIncidentLocationRefId(GGenericRefIdPointerType value) {
        this.incidentLocationRefId = value;
    }

    /**
     * Gets the value of the incidentCost property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIncidentCost() {
        return incidentCost;
    }

    /**
     * Sets the value of the incidentCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIncidentCost(BigDecimal value) {
        this.incidentCost = value;
    }

    /**
     * Gets the value of the incidentReporter property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineIncidentType.IncidentReporter }
     *     
     */
    public DisciplineIncidentType.IncidentReporter getIncidentReporter() {
        return incidentReporter;
    }

    /**
     * Sets the value of the incidentReporter property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineIncidentType.IncidentReporter }
     *     
     */
    public void setIncidentReporter(DisciplineIncidentType.IncidentReporter value) {
        this.incidentReporter = value;
    }

    /**
     * Gets the value of the incidentCategoryList property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineIncidentType.IncidentCategoryList }
     *     
     */
    public DisciplineIncidentType.IncidentCategoryList getIncidentCategoryList() {
        return incidentCategoryList;
    }

    /**
     * Sets the value of the incidentCategoryList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineIncidentType.IncidentCategoryList }
     *     
     */
    public void setIncidentCategoryList(DisciplineIncidentType.IncidentCategoryList value) {
        this.incidentCategoryList = value;
    }

    /**
     * Gets the value of the secondaryBehaviorList property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineIncidentType.SecondaryBehaviorList }
     *     
     */
    public DisciplineIncidentType.SecondaryBehaviorList getSecondaryBehaviorList() {
        return secondaryBehaviorList;
    }

    /**
     * Sets the value of the secondaryBehaviorList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineIncidentType.SecondaryBehaviorList }
     *     
     */
    public void setSecondaryBehaviorList(DisciplineIncidentType.SecondaryBehaviorList value) {
        this.secondaryBehaviorList = value;
    }

    /**
     * Gets the value of the weaponTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineIncidentType.WeaponTypeList }
     *     
     */
    public DisciplineIncidentType.WeaponTypeList getWeaponTypeList() {
        return weaponTypeList;
    }

    /**
     * Sets the value of the weaponTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineIncidentType.WeaponTypeList }
     *     
     */
    public void setWeaponTypeList(DisciplineIncidentType.WeaponTypeList value) {
        this.weaponTypeList = value;
    }

    /**
     * Gets the value of the offenderList property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineIncidentType.OffenderList }
     *     
     */
    public DisciplineIncidentType.OffenderList getOffenderList() {
        return offenderList;
    }

    /**
     * Sets the value of the offenderList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineIncidentType.OffenderList }
     *     
     */
    public void setOffenderList(DisciplineIncidentType.OffenderList value) {
        this.offenderList = value;
    }

    /**
     * Gets the value of the victimList property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineIncidentType.VictimList }
     *     
     */
    public DisciplineIncidentType.VictimList getVictimList() {
        return victimList;
    }

    /**
     * Sets the value of the victimList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineIncidentType.VictimList }
     *     
     */
    public void setVictimList(DisciplineIncidentType.VictimList value) {
        this.victimList = value;
    }

    /**
     * Gets the value of the incidentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentDescription() {
        return incidentDescription;
    }

    /**
     * Sets the value of the incidentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentDescription(String value) {
        this.incidentDescription = value;
    }

    /**
     * Gets the value of the incidentActionList property.
     * 
     * @return
     *     possible object is
     *     {@link DisciplineIncidentType.IncidentActionList }
     *     
     */
    public DisciplineIncidentType.IncidentActionList getIncidentActionList() {
        return incidentActionList;
    }

    /**
     * Sets the value of the incidentActionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisciplineIncidentType.IncidentActionList }
     *     
     */
    public void setIncidentActionList(DisciplineIncidentType.IncidentActionList value) {
        this.incidentActionList = value;
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
     *         &lt;element name="incidentAction" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                   &lt;element name="zeroTolerance" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *                   &lt;element name="policeNotification" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *                   &lt;element name="arrest" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
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
        "incidentAction"
    })
    public static class IncidentActionList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<DisciplineIncidentType.IncidentActionList.IncidentAction> incidentAction;

        /**
         * Gets the value of the incidentAction property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the incidentAction property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncidentAction().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DisciplineIncidentType.IncidentActionList.IncidentAction }
         * 
         * 
         */
        public List<DisciplineIncidentType.IncidentActionList.IncidentAction> getIncidentAction() {
            if (incidentAction == null) {
                incidentAction = new ArrayList<DisciplineIncidentType.IncidentActionList.IncidentAction>();
            }
            return this.incidentAction;
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
         *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *         &lt;element name="zeroTolerance" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
         *         &lt;element name="policeNotification" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
         *         &lt;element name="arrest" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
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
            "startDate",
            "endDate",
            "duration",
            "zeroTolerance",
            "policeNotification",
            "arrest"
        })
        public static class IncidentAction {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar startDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar endDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected BigDecimal duration;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GYesNoUnknownType zeroTolerance;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GYesNoUnknownType policeNotification;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GYesNoUnknownType arrest;

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
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getDuration() {
                return duration;
            }

            /**
             * Sets the value of the duration property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setDuration(BigDecimal value) {
                this.duration = value;
            }

            /**
             * Gets the value of the zeroTolerance property.
             * 
             * @return
             *     possible object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public GYesNoUnknownType getZeroTolerance() {
                return zeroTolerance;
            }

            /**
             * Sets the value of the zeroTolerance property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public void setZeroTolerance(GYesNoUnknownType value) {
                this.zeroTolerance = value;
            }

            /**
             * Gets the value of the policeNotification property.
             * 
             * @return
             *     possible object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public GYesNoUnknownType getPoliceNotification() {
                return policeNotification;
            }

            /**
             * Sets the value of the policeNotification property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public void setPoliceNotification(GYesNoUnknownType value) {
                this.policeNotification = value;
            }

            /**
             * Gets the value of the arrest property.
             * 
             * @return
             *     possible object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public GYesNoUnknownType getArrest() {
                return arrest;
            }

            /**
             * Sets the value of the arrest property.
             * 
             * @param value
             *     allowed object is
             *     {@link GYesNoUnknownType }
             *     
             */
            public void setArrest(GYesNoUnknownType value) {
                this.arrest = value;
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
     *         &lt;element name="incidentCategory" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType">
     *                 &lt;sequence>
     *                   &lt;element name="categoryCodeComment" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "incidentCategory"
    })
    public static class IncidentCategoryList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<DisciplineIncidentType.IncidentCategoryList.IncidentCategory> incidentCategory;

        /**
         * Gets the value of the incidentCategory property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the incidentCategory property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIncidentCategory().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DisciplineIncidentType.IncidentCategoryList.IncidentCategory }
         * 
         * 
         */
        public List<DisciplineIncidentType.IncidentCategoryList.IncidentCategory> getIncidentCategory() {
            if (incidentCategory == null) {
                incidentCategory = new ArrayList<DisciplineIncidentType.IncidentCategoryList.IncidentCategory>();
            }
            return this.incidentCategory;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType">
         *       &lt;sequence>
         *         &lt;element name="categoryCodeComment" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "categoryCodeComment"
        })
        public static class IncidentCategory
            extends GCodedElementType
        {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String categoryCodeComment;

            /**
             * Gets the value of the categoryCodeComment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCategoryCodeComment() {
                return categoryCodeComment;
            }

            /**
             * Sets the value of the categoryCodeComment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCategoryCodeComment(String value) {
                this.categoryCodeComment = value;
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
     *         &lt;element name="reporterType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *         &lt;element name="reporterName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *         &lt;element name="reporterRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
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
        "reporterType",
        "reporterName",
        "reporterRefId"
    })
    public static class IncidentReporter {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String reporterType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String reporterName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GGenericRefIdPointerType reporterRefId;

        /**
         * Gets the value of the reporterType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReporterType() {
            return reporterType;
        }

        /**
         * Sets the value of the reporterType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReporterType(String value) {
            this.reporterType = value;
        }

        /**
         * Gets the value of the reporterName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReporterName() {
            return reporterName;
        }

        /**
         * Sets the value of the reporterName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReporterName(String value) {
            this.reporterName = value;
        }

        /**
         * Gets the value of the reporterRefId property.
         * 
         * @return
         *     possible object is
         *     {@link GGenericRefIdPointerType }
         *     
         */
        public GGenericRefIdPointerType getReporterRefId() {
            return reporterRefId;
        }

        /**
         * Sets the value of the reporterRefId property.
         * 
         * @param value
         *     allowed object is
         *     {@link GGenericRefIdPointerType }
         *     
         */
        public void setReporterRefId(GGenericRefIdPointerType value) {
            this.reporterRefId = value;
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
     *         &lt;element name="offender" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="offenderType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="offenderRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
     *                   &lt;element name="offenderInjury" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="manifestationDetermination" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="meetingHeld" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *                             &lt;element name="meetingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                             &lt;element name="dueToDisability" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *                             &lt;element name="meetingOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="actionList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="action" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="code" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" minOccurs="0"/>
     *                                       &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                                       &lt;element name="actionDuration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
     *                                       &lt;element name="zeroTolerance" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *                                       &lt;element name="fullYearExpulsion" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *                                       &lt;element name="shortenedExpulsion" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *                                       &lt;element name="policeNotification" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *                                       &lt;element name="arrest" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
     *                                       &lt;element name="alternativeEducation" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
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
     *                   &lt;element name="weaponTypeList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="weaponType" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="secondaryBehaviorCodeList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="secondaryBehaviorCode" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offender"
    })
    public static class OffenderList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<DisciplineIncidentType.OffenderList.Offender> offender;

        /**
         * Gets the value of the offender property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offender property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOffender().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DisciplineIncidentType.OffenderList.Offender }
         * 
         * 
         */
        public List<DisciplineIncidentType.OffenderList.Offender> getOffender() {
            if (offender == null) {
                offender = new ArrayList<DisciplineIncidentType.OffenderList.Offender>();
            }
            return this.offender;
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
         *         &lt;element name="offenderType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="offenderRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
         *         &lt;element name="offenderInjury" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="manifestationDetermination" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="meetingHeld" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
         *                   &lt;element name="meetingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                   &lt;element name="dueToDisability" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
         *                   &lt;element name="meetingOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="actionList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="action" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="code" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" minOccurs="0"/>
         *                             &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *                             &lt;element name="actionDuration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
         *                             &lt;element name="zeroTolerance" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
         *                             &lt;element name="fullYearExpulsion" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
         *                             &lt;element name="shortenedExpulsion" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
         *                             &lt;element name="policeNotification" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
         *                             &lt;element name="arrest" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
         *                             &lt;element name="alternativeEducation" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
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
         *         &lt;element name="weaponTypeList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="weaponType" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="secondaryBehaviorCodeList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="secondaryBehaviorCode" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
            "offenderType",
            "name",
            "offenderRefId",
            "offenderInjury",
            "manifestationDetermination",
            "actionList",
            "weaponTypeList",
            "secondaryBehaviorCodeList"
        })
        public static class Offender {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String offenderType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String name;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GGenericRefIdPointerType offenderRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String offenderInjury;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected DisciplineIncidentType.OffenderList.Offender.ManifestationDetermination manifestationDetermination;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected DisciplineIncidentType.OffenderList.Offender.ActionList actionList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected DisciplineIncidentType.OffenderList.Offender.WeaponTypeList weaponTypeList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected DisciplineIncidentType.OffenderList.Offender.SecondaryBehaviorCodeList secondaryBehaviorCodeList;

            /**
             * Gets the value of the offenderType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffenderType() {
                return offenderType;
            }

            /**
             * Sets the value of the offenderType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffenderType(String value) {
                this.offenderType = value;
            }

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
             * Gets the value of the offenderRefId property.
             * 
             * @return
             *     possible object is
             *     {@link GGenericRefIdPointerType }
             *     
             */
            public GGenericRefIdPointerType getOffenderRefId() {
                return offenderRefId;
            }

            /**
             * Sets the value of the offenderRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link GGenericRefIdPointerType }
             *     
             */
            public void setOffenderRefId(GGenericRefIdPointerType value) {
                this.offenderRefId = value;
            }

            /**
             * Gets the value of the offenderInjury property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOffenderInjury() {
                return offenderInjury;
            }

            /**
             * Sets the value of the offenderInjury property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOffenderInjury(String value) {
                this.offenderInjury = value;
            }

            /**
             * Gets the value of the manifestationDetermination property.
             * 
             * @return
             *     possible object is
             *     {@link DisciplineIncidentType.OffenderList.Offender.ManifestationDetermination }
             *     
             */
            public DisciplineIncidentType.OffenderList.Offender.ManifestationDetermination getManifestationDetermination() {
                return manifestationDetermination;
            }

            /**
             * Sets the value of the manifestationDetermination property.
             * 
             * @param value
             *     allowed object is
             *     {@link DisciplineIncidentType.OffenderList.Offender.ManifestationDetermination }
             *     
             */
            public void setManifestationDetermination(DisciplineIncidentType.OffenderList.Offender.ManifestationDetermination value) {
                this.manifestationDetermination = value;
            }

            /**
             * Gets the value of the actionList property.
             * 
             * @return
             *     possible object is
             *     {@link DisciplineIncidentType.OffenderList.Offender.ActionList }
             *     
             */
            public DisciplineIncidentType.OffenderList.Offender.ActionList getActionList() {
                return actionList;
            }

            /**
             * Sets the value of the actionList property.
             * 
             * @param value
             *     allowed object is
             *     {@link DisciplineIncidentType.OffenderList.Offender.ActionList }
             *     
             */
            public void setActionList(DisciplineIncidentType.OffenderList.Offender.ActionList value) {
                this.actionList = value;
            }

            /**
             * Gets the value of the weaponTypeList property.
             * 
             * @return
             *     possible object is
             *     {@link DisciplineIncidentType.OffenderList.Offender.WeaponTypeList }
             *     
             */
            public DisciplineIncidentType.OffenderList.Offender.WeaponTypeList getWeaponTypeList() {
                return weaponTypeList;
            }

            /**
             * Sets the value of the weaponTypeList property.
             * 
             * @param value
             *     allowed object is
             *     {@link DisciplineIncidentType.OffenderList.Offender.WeaponTypeList }
             *     
             */
            public void setWeaponTypeList(DisciplineIncidentType.OffenderList.Offender.WeaponTypeList value) {
                this.weaponTypeList = value;
            }

            /**
             * Gets the value of the secondaryBehaviorCodeList property.
             * 
             * @return
             *     possible object is
             *     {@link DisciplineIncidentType.OffenderList.Offender.SecondaryBehaviorCodeList }
             *     
             */
            public DisciplineIncidentType.OffenderList.Offender.SecondaryBehaviorCodeList getSecondaryBehaviorCodeList() {
                return secondaryBehaviorCodeList;
            }

            /**
             * Sets the value of the secondaryBehaviorCodeList property.
             * 
             * @param value
             *     allowed object is
             *     {@link DisciplineIncidentType.OffenderList.Offender.SecondaryBehaviorCodeList }
             *     
             */
            public void setSecondaryBehaviorCodeList(DisciplineIncidentType.OffenderList.Offender.SecondaryBehaviorCodeList value) {
                this.secondaryBehaviorCodeList = value;
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
             *         &lt;element name="action" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="code" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" minOccurs="0"/>
             *                   &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *                   &lt;element name="actionDuration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
             *                   &lt;element name="zeroTolerance" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
             *                   &lt;element name="fullYearExpulsion" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
             *                   &lt;element name="shortenedExpulsion" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
             *                   &lt;element name="policeNotification" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
             *                   &lt;element name="arrest" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
             *                   &lt;element name="alternativeEducation" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
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
                "action"
            })
            public static class ActionList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected List<DisciplineIncidentType.OffenderList.Offender.ActionList.Action> action;

                /**
                 * Gets the value of the action property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the action property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAction().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link DisciplineIncidentType.OffenderList.Offender.ActionList.Action }
                 * 
                 * 
                 */
                public List<DisciplineIncidentType.OffenderList.Offender.ActionList.Action> getAction() {
                    if (action == null) {
                        action = new ArrayList<DisciplineIncidentType.OffenderList.Offender.ActionList.Action>();
                    }
                    return this.action;
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
                 *         &lt;element name="code" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" minOccurs="0"/>
                 *         &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
                 *         &lt;element name="actionDuration" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
                 *         &lt;element name="zeroTolerance" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
                 *         &lt;element name="fullYearExpulsion" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
                 *         &lt;element name="shortenedExpulsion" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
                 *         &lt;element name="policeNotification" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
                 *         &lt;element name="arrest" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
                 *         &lt;element name="alternativeEducation" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
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
                    "code",
                    "actionStartDate",
                    "actionEndDate",
                    "actionDuration",
                    "zeroTolerance",
                    "fullYearExpulsion",
                    "shortenedExpulsion",
                    "policeNotification",
                    "arrest",
                    "alternativeEducation"
                })
                public static class Action {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected GCodedElementType code;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar actionStartDate;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar actionEndDate;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected BigDecimal actionDuration;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected GYesNoUnknownType zeroTolerance;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected GYesNoUnknownType fullYearExpulsion;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected GYesNoUnknownType shortenedExpulsion;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected GYesNoUnknownType policeNotification;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected GYesNoUnknownType arrest;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected GYesNoUnknownType alternativeEducation;

                    /**
                     * Gets the value of the code property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GCodedElementType }
                     *     
                     */
                    public GCodedElementType getCode() {
                        return code;
                    }

                    /**
                     * Sets the value of the code property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GCodedElementType }
                     *     
                     */
                    public void setCode(GCodedElementType value) {
                        this.code = value;
                    }

                    /**
                     * Gets the value of the actionStartDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getActionStartDate() {
                        return actionStartDate;
                    }

                    /**
                     * Sets the value of the actionStartDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setActionStartDate(XMLGregorianCalendar value) {
                        this.actionStartDate = value;
                    }

                    /**
                     * Gets the value of the actionEndDate property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getActionEndDate() {
                        return actionEndDate;
                    }

                    /**
                     * Sets the value of the actionEndDate property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setActionEndDate(XMLGregorianCalendar value) {
                        this.actionEndDate = value;
                    }

                    /**
                     * Gets the value of the actionDuration property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getActionDuration() {
                        return actionDuration;
                    }

                    /**
                     * Sets the value of the actionDuration property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setActionDuration(BigDecimal value) {
                        this.actionDuration = value;
                    }

                    /**
                     * Gets the value of the zeroTolerance property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public GYesNoUnknownType getZeroTolerance() {
                        return zeroTolerance;
                    }

                    /**
                     * Sets the value of the zeroTolerance property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public void setZeroTolerance(GYesNoUnknownType value) {
                        this.zeroTolerance = value;
                    }

                    /**
                     * Gets the value of the fullYearExpulsion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public GYesNoUnknownType getFullYearExpulsion() {
                        return fullYearExpulsion;
                    }

                    /**
                     * Sets the value of the fullYearExpulsion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public void setFullYearExpulsion(GYesNoUnknownType value) {
                        this.fullYearExpulsion = value;
                    }

                    /**
                     * Gets the value of the shortenedExpulsion property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public GYesNoUnknownType getShortenedExpulsion() {
                        return shortenedExpulsion;
                    }

                    /**
                     * Sets the value of the shortenedExpulsion property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public void setShortenedExpulsion(GYesNoUnknownType value) {
                        this.shortenedExpulsion = value;
                    }

                    /**
                     * Gets the value of the policeNotification property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public GYesNoUnknownType getPoliceNotification() {
                        return policeNotification;
                    }

                    /**
                     * Sets the value of the policeNotification property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public void setPoliceNotification(GYesNoUnknownType value) {
                        this.policeNotification = value;
                    }

                    /**
                     * Gets the value of the arrest property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public GYesNoUnknownType getArrest() {
                        return arrest;
                    }

                    /**
                     * Sets the value of the arrest property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public void setArrest(GYesNoUnknownType value) {
                        this.arrest = value;
                    }

                    /**
                     * Gets the value of the alternativeEducation property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public GYesNoUnknownType getAlternativeEducation() {
                        return alternativeEducation;
                    }

                    /**
                     * Sets the value of the alternativeEducation property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link GYesNoUnknownType }
                     *     
                     */
                    public void setAlternativeEducation(GYesNoUnknownType value) {
                        this.alternativeEducation = value;
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
             *         &lt;element name="meetingHeld" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
             *         &lt;element name="meetingDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
             *         &lt;element name="dueToDisability" type="{http://www.sifassociation.org/datamodel/na/3.2}gYesNoUnknownType" minOccurs="0"/>
             *         &lt;element name="meetingOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "meetingHeld",
                "meetingDate",
                "dueToDisability",
                "meetingOutcome"
            })
            public static class ManifestationDetermination {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected GYesNoUnknownType meetingHeld;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar meetingDate;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected GYesNoUnknownType dueToDisability;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String meetingOutcome;

                /**
                 * Gets the value of the meetingHeld property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GYesNoUnknownType }
                 *     
                 */
                public GYesNoUnknownType getMeetingHeld() {
                    return meetingHeld;
                }

                /**
                 * Sets the value of the meetingHeld property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GYesNoUnknownType }
                 *     
                 */
                public void setMeetingHeld(GYesNoUnknownType value) {
                    this.meetingHeld = value;
                }

                /**
                 * Gets the value of the meetingDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getMeetingDate() {
                    return meetingDate;
                }

                /**
                 * Sets the value of the meetingDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setMeetingDate(XMLGregorianCalendar value) {
                    this.meetingDate = value;
                }

                /**
                 * Gets the value of the dueToDisability property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GYesNoUnknownType }
                 *     
                 */
                public GYesNoUnknownType getDueToDisability() {
                    return dueToDisability;
                }

                /**
                 * Sets the value of the dueToDisability property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GYesNoUnknownType }
                 *     
                 */
                public void setDueToDisability(GYesNoUnknownType value) {
                    this.dueToDisability = value;
                }

                /**
                 * Gets the value of the meetingOutcome property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMeetingOutcome() {
                    return meetingOutcome;
                }

                /**
                 * Sets the value of the meetingOutcome property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMeetingOutcome(String value) {
                    this.meetingOutcome = value;
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
             *         &lt;element name="secondaryBehaviorCode" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
                "secondaryBehaviorCode"
            })
            public static class SecondaryBehaviorCodeList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected List<String> secondaryBehaviorCode;

                /**
                 * Gets the value of the secondaryBehaviorCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the secondaryBehaviorCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSecondaryBehaviorCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getSecondaryBehaviorCode() {
                    if (secondaryBehaviorCode == null) {
                        secondaryBehaviorCode = new ArrayList<String>();
                    }
                    return this.secondaryBehaviorCode;
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
             *         &lt;element name="weaponType" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
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
                "weaponType"
            })
            public static class WeaponTypeList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected List<GCodedElementType> weaponType;

                /**
                 * Gets the value of the weaponType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the weaponType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getWeaponType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GCodedElementType }
                 * 
                 * 
                 */
                public List<GCodedElementType> getWeaponType() {
                    if (weaponType == null) {
                        weaponType = new ArrayList<GCodedElementType>();
                    }
                    return this.weaponType;
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
     *         &lt;element name="agencyRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
     *         &lt;element name="agencyName" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
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
        "agencyRefId",
        "agencyName"
    })
    public static class ReportingAgency {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected GGenericRefIdPointerType agencyRefId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String agencyName;

        /**
         * Gets the value of the agencyRefId property.
         * 
         * @return
         *     possible object is
         *     {@link GGenericRefIdPointerType }
         *     
         */
        public GGenericRefIdPointerType getAgencyRefId() {
            return agencyRefId;
        }

        /**
         * Sets the value of the agencyRefId property.
         * 
         * @param value
         *     allowed object is
         *     {@link GGenericRefIdPointerType }
         *     
         */
        public void setAgencyRefId(GGenericRefIdPointerType value) {
            this.agencyRefId = value;
        }

        /**
         * Gets the value of the agencyName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgencyName() {
            return agencyName;
        }

        /**
         * Sets the value of the agencyName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgencyName(String value) {
            this.agencyName = value;
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
     *         &lt;element name="secondaryBehaviorCode" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/>
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
        "secondaryBehaviorCode"
    })
    public static class SecondaryBehaviorList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> secondaryBehaviorCode;

        /**
         * Gets the value of the secondaryBehaviorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the secondaryBehaviorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSecondaryBehaviorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSecondaryBehaviorCode() {
            if (secondaryBehaviorCode == null) {
                secondaryBehaviorCode = new ArrayList<String>();
            }
            return this.secondaryBehaviorCode;
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
     *         &lt;element name="victim" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="victimType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
     *                   &lt;element name="victimRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
     *                   &lt;element name="injury" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
        "victim"
    })
    public static class VictimList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<DisciplineIncidentType.VictimList.Victim> victim;

        /**
         * Gets the value of the victim property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the victim property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVictim().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DisciplineIncidentType.VictimList.Victim }
         * 
         * 
         */
        public List<DisciplineIncidentType.VictimList.Victim> getVictim() {
            if (victim == null) {
                victim = new ArrayList<DisciplineIncidentType.VictimList.Victim>();
            }
            return this.victim;
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
         *         &lt;element name="victimType" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}normalizedString" minOccurs="0"/>
         *         &lt;element name="victimRefId" type="{http://www.sifassociation.org/datamodel/na/3.2}gGenericRefIdPointerType" minOccurs="0"/>
         *         &lt;element name="injury" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
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
            "victimType",
            "name",
            "victimRefId",
            "injury"
        })
        public static class Victim {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String victimType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
            @XmlSchemaType(name = "normalizedString")
            protected String name;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected GGenericRefIdPointerType victimRefId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String injury;

            /**
             * Gets the value of the victimType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVictimType() {
                return victimType;
            }

            /**
             * Sets the value of the victimType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVictimType(String value) {
                this.victimType = value;
            }

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
             * Gets the value of the victimRefId property.
             * 
             * @return
             *     possible object is
             *     {@link GGenericRefIdPointerType }
             *     
             */
            public GGenericRefIdPointerType getVictimRefId() {
                return victimRefId;
            }

            /**
             * Sets the value of the victimRefId property.
             * 
             * @param value
             *     allowed object is
             *     {@link GGenericRefIdPointerType }
             *     
             */
            public void setVictimRefId(GGenericRefIdPointerType value) {
                this.victimRefId = value;
            }

            /**
             * Gets the value of the injury property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInjury() {
                return injury;
            }

            /**
             * Sets the value of the injury property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInjury(String value) {
                this.injury = value;
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
     *         &lt;element name="weaponType" type="{http://www.sifassociation.org/datamodel/na/3.2}gCodedElementType" maxOccurs="unbounded" minOccurs="0"/>
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
        "weaponType"
    })
    public static class WeaponTypeList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<GCodedElementType> weaponType;

        /**
         * Gets the value of the weaponType property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the weaponType property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getWeaponType().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GCodedElementType }
         * 
         * 
         */
        public List<GCodedElementType> getWeaponType() {
            if (weaponType == null) {
                weaponType = new ArrayList<GCodedElementType>();
            }
            return this.weaponType;
        }

    }

}
