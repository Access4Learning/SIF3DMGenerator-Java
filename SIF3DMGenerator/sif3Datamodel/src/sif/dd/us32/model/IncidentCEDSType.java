
package sif.dd.us32.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for incidentCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="incidentCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="incidentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reporterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentReporterid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentBehavior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentInjuryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="relatedToZeroTolerancePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentTimeDescriptionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iDEAInterimRemovalReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="iDEAInterimRemoval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disciplineReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firearmType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="educationalServicesAfterRemoval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="secondaryIncidentBehavior" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weaponType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disciplinaryActionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disciplinaryActionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disciplinaryActionTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="durationOfDisciplinaryAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disciplineActionLengthDifferenceReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fullYearExpulsion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortenedExpulsion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentMultipleOffenseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentPerpetratorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentPerpetratorInjuryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentPerpetratorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentPersonRoleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentRegulationViolatedDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentRelatedToDisabilityManifestation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentReportedToLawEnforcementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentVictimIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentVictimType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentWitnessIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="incidentWitnessType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "incidentCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "incidentIdentifier",
    "incidentDate",
    "incidentTime",
    "incidentLocation",
    "reporterType",
    "incidentReporterid",
    "incidentDescription",
    "incidentBehavior",
    "incidentInjuryType",
    "relatedToZeroTolerancePolicy",
    "incidentTimeDescriptionCode",
    "ideaInterimRemovalReason",
    "ideaInterimRemoval",
    "disciplineReason",
    "firearmType",
    "educationalServicesAfterRemoval",
    "incidentCost",
    "secondaryIncidentBehavior",
    "weaponType",
    "disciplinaryActionStartDate",
    "disciplinaryActionEndDate",
    "disciplinaryActionTaken",
    "durationOfDisciplinaryAction",
    "disciplineActionLengthDifferenceReason",
    "fullYearExpulsion",
    "shortenedExpulsion",
    "incidentMultipleOffenseType",
    "incidentPerpetratorIdentifier",
    "incidentPerpetratorInjuryType",
    "incidentPerpetratorType",
    "incidentPersonRoleType",
    "incidentRegulationViolatedDescription",
    "incidentRelatedToDisabilityManifestation",
    "incidentReportedToLawEnforcementIndicator",
    "incidentVictimIdentifier",
    "incidentVictimType",
    "incidentWitnessIdentifier",
    "incidentWitnessType"
})
public class IncidentCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentTime;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentLocation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String reporterType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentReporterid;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentBehavior;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentInjuryType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String relatedToZeroTolerancePolicy;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentTimeDescriptionCode;
    @XmlElement(name = "iDEAInterimRemovalReason", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String ideaInterimRemovalReason;
    @XmlElement(name = "iDEAInterimRemoval", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String ideaInterimRemoval;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String disciplineReason;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String firearmType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String educationalServicesAfterRemoval;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentCost;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String secondaryIncidentBehavior;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String weaponType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String disciplinaryActionStartDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String disciplinaryActionEndDate;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String disciplinaryActionTaken;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String durationOfDisciplinaryAction;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String disciplineActionLengthDifferenceReason;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String fullYearExpulsion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String shortenedExpulsion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentMultipleOffenseType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentPerpetratorIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentPerpetratorInjuryType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentPerpetratorType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentPersonRoleType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentRegulationViolatedDescription;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentRelatedToDisabilityManifestation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentReportedToLawEnforcementIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentVictimIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentVictimType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentWitnessIdentifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String incidentWitnessType;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the incidentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentIdentifier() {
        return incidentIdentifier;
    }

    /**
     * Sets the value of the incidentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentIdentifier(String value) {
        this.incidentIdentifier = value;
    }

    /**
     * Gets the value of the incidentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentDate() {
        return incidentDate;
    }

    /**
     * Sets the value of the incidentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentDate(String value) {
        this.incidentDate = value;
    }

    /**
     * Gets the value of the incidentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentTime() {
        return incidentTime;
    }

    /**
     * Sets the value of the incidentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentTime(String value) {
        this.incidentTime = value;
    }

    /**
     * Gets the value of the incidentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentLocation() {
        return incidentLocation;
    }

    /**
     * Sets the value of the incidentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentLocation(String value) {
        this.incidentLocation = value;
    }

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
     * Gets the value of the incidentReporterid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentReporterid() {
        return incidentReporterid;
    }

    /**
     * Sets the value of the incidentReporterid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentReporterid(String value) {
        this.incidentReporterid = value;
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
     * Gets the value of the incidentBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentBehavior() {
        return incidentBehavior;
    }

    /**
     * Sets the value of the incidentBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentBehavior(String value) {
        this.incidentBehavior = value;
    }

    /**
     * Gets the value of the incidentInjuryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentInjuryType() {
        return incidentInjuryType;
    }

    /**
     * Sets the value of the incidentInjuryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentInjuryType(String value) {
        this.incidentInjuryType = value;
    }

    /**
     * Gets the value of the relatedToZeroTolerancePolicy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelatedToZeroTolerancePolicy() {
        return relatedToZeroTolerancePolicy;
    }

    /**
     * Sets the value of the relatedToZeroTolerancePolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelatedToZeroTolerancePolicy(String value) {
        this.relatedToZeroTolerancePolicy = value;
    }

    /**
     * Gets the value of the incidentTimeDescriptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentTimeDescriptionCode() {
        return incidentTimeDescriptionCode;
    }

    /**
     * Sets the value of the incidentTimeDescriptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentTimeDescriptionCode(String value) {
        this.incidentTimeDescriptionCode = value;
    }

    /**
     * Gets the value of the ideaInterimRemovalReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDEAInterimRemovalReason() {
        return ideaInterimRemovalReason;
    }

    /**
     * Sets the value of the ideaInterimRemovalReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDEAInterimRemovalReason(String value) {
        this.ideaInterimRemovalReason = value;
    }

    /**
     * Gets the value of the ideaInterimRemoval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDEAInterimRemoval() {
        return ideaInterimRemoval;
    }

    /**
     * Sets the value of the ideaInterimRemoval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDEAInterimRemoval(String value) {
        this.ideaInterimRemoval = value;
    }

    /**
     * Gets the value of the disciplineReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplineReason() {
        return disciplineReason;
    }

    /**
     * Sets the value of the disciplineReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplineReason(String value) {
        this.disciplineReason = value;
    }

    /**
     * Gets the value of the firearmType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirearmType() {
        return firearmType;
    }

    /**
     * Sets the value of the firearmType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirearmType(String value) {
        this.firearmType = value;
    }

    /**
     * Gets the value of the educationalServicesAfterRemoval property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationalServicesAfterRemoval() {
        return educationalServicesAfterRemoval;
    }

    /**
     * Sets the value of the educationalServicesAfterRemoval property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationalServicesAfterRemoval(String value) {
        this.educationalServicesAfterRemoval = value;
    }

    /**
     * Gets the value of the incidentCost property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentCost() {
        return incidentCost;
    }

    /**
     * Sets the value of the incidentCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCost(String value) {
        this.incidentCost = value;
    }

    /**
     * Gets the value of the secondaryIncidentBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryIncidentBehavior() {
        return secondaryIncidentBehavior;
    }

    /**
     * Sets the value of the secondaryIncidentBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryIncidentBehavior(String value) {
        this.secondaryIncidentBehavior = value;
    }

    /**
     * Gets the value of the weaponType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaponType() {
        return weaponType;
    }

    /**
     * Sets the value of the weaponType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaponType(String value) {
        this.weaponType = value;
    }

    /**
     * Gets the value of the disciplinaryActionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplinaryActionStartDate() {
        return disciplinaryActionStartDate;
    }

    /**
     * Sets the value of the disciplinaryActionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplinaryActionStartDate(String value) {
        this.disciplinaryActionStartDate = value;
    }

    /**
     * Gets the value of the disciplinaryActionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplinaryActionEndDate() {
        return disciplinaryActionEndDate;
    }

    /**
     * Sets the value of the disciplinaryActionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplinaryActionEndDate(String value) {
        this.disciplinaryActionEndDate = value;
    }

    /**
     * Gets the value of the disciplinaryActionTaken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplinaryActionTaken() {
        return disciplinaryActionTaken;
    }

    /**
     * Sets the value of the disciplinaryActionTaken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplinaryActionTaken(String value) {
        this.disciplinaryActionTaken = value;
    }

    /**
     * Gets the value of the durationOfDisciplinaryAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDurationOfDisciplinaryAction() {
        return durationOfDisciplinaryAction;
    }

    /**
     * Sets the value of the durationOfDisciplinaryAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDurationOfDisciplinaryAction(String value) {
        this.durationOfDisciplinaryAction = value;
    }

    /**
     * Gets the value of the disciplineActionLengthDifferenceReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisciplineActionLengthDifferenceReason() {
        return disciplineActionLengthDifferenceReason;
    }

    /**
     * Sets the value of the disciplineActionLengthDifferenceReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisciplineActionLengthDifferenceReason(String value) {
        this.disciplineActionLengthDifferenceReason = value;
    }

    /**
     * Gets the value of the fullYearExpulsion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullYearExpulsion() {
        return fullYearExpulsion;
    }

    /**
     * Sets the value of the fullYearExpulsion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullYearExpulsion(String value) {
        this.fullYearExpulsion = value;
    }

    /**
     * Gets the value of the shortenedExpulsion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortenedExpulsion() {
        return shortenedExpulsion;
    }

    /**
     * Sets the value of the shortenedExpulsion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortenedExpulsion(String value) {
        this.shortenedExpulsion = value;
    }

    /**
     * Gets the value of the incidentMultipleOffenseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentMultipleOffenseType() {
        return incidentMultipleOffenseType;
    }

    /**
     * Sets the value of the incidentMultipleOffenseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentMultipleOffenseType(String value) {
        this.incidentMultipleOffenseType = value;
    }

    /**
     * Gets the value of the incidentPerpetratorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentPerpetratorIdentifier() {
        return incidentPerpetratorIdentifier;
    }

    /**
     * Sets the value of the incidentPerpetratorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentPerpetratorIdentifier(String value) {
        this.incidentPerpetratorIdentifier = value;
    }

    /**
     * Gets the value of the incidentPerpetratorInjuryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentPerpetratorInjuryType() {
        return incidentPerpetratorInjuryType;
    }

    /**
     * Sets the value of the incidentPerpetratorInjuryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentPerpetratorInjuryType(String value) {
        this.incidentPerpetratorInjuryType = value;
    }

    /**
     * Gets the value of the incidentPerpetratorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentPerpetratorType() {
        return incidentPerpetratorType;
    }

    /**
     * Sets the value of the incidentPerpetratorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentPerpetratorType(String value) {
        this.incidentPerpetratorType = value;
    }

    /**
     * Gets the value of the incidentPersonRoleType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentPersonRoleType() {
        return incidentPersonRoleType;
    }

    /**
     * Sets the value of the incidentPersonRoleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentPersonRoleType(String value) {
        this.incidentPersonRoleType = value;
    }

    /**
     * Gets the value of the incidentRegulationViolatedDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentRegulationViolatedDescription() {
        return incidentRegulationViolatedDescription;
    }

    /**
     * Sets the value of the incidentRegulationViolatedDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentRegulationViolatedDescription(String value) {
        this.incidentRegulationViolatedDescription = value;
    }

    /**
     * Gets the value of the incidentRelatedToDisabilityManifestation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentRelatedToDisabilityManifestation() {
        return incidentRelatedToDisabilityManifestation;
    }

    /**
     * Sets the value of the incidentRelatedToDisabilityManifestation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentRelatedToDisabilityManifestation(String value) {
        this.incidentRelatedToDisabilityManifestation = value;
    }

    /**
     * Gets the value of the incidentReportedToLawEnforcementIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentReportedToLawEnforcementIndicator() {
        return incidentReportedToLawEnforcementIndicator;
    }

    /**
     * Sets the value of the incidentReportedToLawEnforcementIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentReportedToLawEnforcementIndicator(String value) {
        this.incidentReportedToLawEnforcementIndicator = value;
    }

    /**
     * Gets the value of the incidentVictimIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentVictimIdentifier() {
        return incidentVictimIdentifier;
    }

    /**
     * Sets the value of the incidentVictimIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentVictimIdentifier(String value) {
        this.incidentVictimIdentifier = value;
    }

    /**
     * Gets the value of the incidentVictimType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentVictimType() {
        return incidentVictimType;
    }

    /**
     * Sets the value of the incidentVictimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentVictimType(String value) {
        this.incidentVictimType = value;
    }

    /**
     * Gets the value of the incidentWitnessIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentWitnessIdentifier() {
        return incidentWitnessIdentifier;
    }

    /**
     * Sets the value of the incidentWitnessIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentWitnessIdentifier(String value) {
        this.incidentWitnessIdentifier = value;
    }

    /**
     * Gets the value of the incidentWitnessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentWitnessType() {
        return incidentWitnessType;
    }

    /**
     * Sets the value of the incidentWitnessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentWitnessType(String value) {
        this.incidentWitnessType = value;
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
