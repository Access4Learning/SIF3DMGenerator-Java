
package sif.dd.us32.model.ceds;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for k12SchoolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k12SchoolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="shortNameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="addressList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="street" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="buildingSiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="countyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="gridLocation" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="longtitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="phoneNumberList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="phoneNumber" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="directory" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="gradesOfferedList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="gradesOffered" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="schoolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="emphasisProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="charterSchool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="charterSchoolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fundingControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="operationalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="operationalStatusEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="alternativeSchoolFocus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="apCourseSelfSelection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="internetAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="improvementStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sharedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="virtualIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="charterSchoolApprovalAgencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="charterSchoolApprovalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="institutionCharacteristics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="abilityGrouping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteNontraditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programGiftedEligibilityCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="increasedLearningTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="statePovertyDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="studentSupportServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleIProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleISchoolStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleIIILanguageInstructionProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="disciplineMethodForFirearmsIncidents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="disciplineMethodOfChildrenWithDisabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaDisciplineMethodForFirearmsIncidents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accountability" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="aypStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="aypAppealChangedDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="aypAppealProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="appealedAYPDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="alternateAYPApproachIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="amaoProficiencyLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="amaoProgressLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="correctiveAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="elementaryMiddleAdditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gunFreeSchoolsActReporting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hsGraduationRateIndicatorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="participationMath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="participationReadingAndLanguageArts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proficiencyTargetMath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="persistentlyDangerous" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proficiencyTargetReadingAndLanguageArts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="persistentlyLowestAchieving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reconstitutedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="restructuringAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="improvementExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="improvementFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="finance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="financialAccountCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountFundClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountingPeriodActualValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAccountingPeriodBudgetedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialBalanceSheetAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialExpenditureFunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialExpenditureObjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="federalFunds" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="consolidatedMEPFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="improvementGrantIntervention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sessionList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="session" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sessionMarkingTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sessionSchedulingTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sessionAttendanceTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="firstInstructionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastInstructionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="daysInSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="schoolYearMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="instructionalMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="minutesPerDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sessionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="technicalAssistance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="technicalAssistanceApprovedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="technicalAssistanceDeliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="technicalAssistanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
@XmlType(name = "k12SchoolType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "identification",
    "addressList",
    "phoneNumberList",
    "directory",
    "institutionCharacteristics",
    "accountability",
    "finance",
    "federalFunds",
    "sessionList",
    "technicalAssistance"
})
public class K12SchoolType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SchoolType.Identification identification;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SchoolType.AddressList addressList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SchoolType.PhoneNumberList phoneNumberList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SchoolType.Directory directory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SchoolType.InstitutionCharacteristics institutionCharacteristics;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SchoolType.Accountability accountability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SchoolType.Finance finance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SchoolType.FederalFunds federalFunds;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SchoolType.SessionList sessionList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12SchoolType.TechnicalAssistance technicalAssistance;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link K12SchoolType.Identification }
     *     
     */
    public K12SchoolType.Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.Identification }
     *     
     */
    public void setIdentification(K12SchoolType.Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link K12SchoolType.AddressList }
     *     
     */
    public K12SchoolType.AddressList getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.AddressList }
     *     
     */
    public void setAddressList(K12SchoolType.AddressList value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the phoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link K12SchoolType.PhoneNumberList }
     *     
     */
    public K12SchoolType.PhoneNumberList getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Sets the value of the phoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.PhoneNumberList }
     *     
     */
    public void setPhoneNumberList(K12SchoolType.PhoneNumberList value) {
        this.phoneNumberList = value;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link K12SchoolType.Directory }
     *     
     */
    public K12SchoolType.Directory getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.Directory }
     *     
     */
    public void setDirectory(K12SchoolType.Directory value) {
        this.directory = value;
    }

    /**
     * Gets the value of the institutionCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link K12SchoolType.InstitutionCharacteristics }
     *     
     */
    public K12SchoolType.InstitutionCharacteristics getInstitutionCharacteristics() {
        return institutionCharacteristics;
    }

    /**
     * Sets the value of the institutionCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.InstitutionCharacteristics }
     *     
     */
    public void setInstitutionCharacteristics(K12SchoolType.InstitutionCharacteristics value) {
        this.institutionCharacteristics = value;
    }

    /**
     * Gets the value of the accountability property.
     * 
     * @return
     *     possible object is
     *     {@link K12SchoolType.Accountability }
     *     
     */
    public K12SchoolType.Accountability getAccountability() {
        return accountability;
    }

    /**
     * Sets the value of the accountability property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.Accountability }
     *     
     */
    public void setAccountability(K12SchoolType.Accountability value) {
        this.accountability = value;
    }

    /**
     * Gets the value of the finance property.
     * 
     * @return
     *     possible object is
     *     {@link K12SchoolType.Finance }
     *     
     */
    public K12SchoolType.Finance getFinance() {
        return finance;
    }

    /**
     * Sets the value of the finance property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.Finance }
     *     
     */
    public void setFinance(K12SchoolType.Finance value) {
        this.finance = value;
    }

    /**
     * Gets the value of the federalFunds property.
     * 
     * @return
     *     possible object is
     *     {@link K12SchoolType.FederalFunds }
     *     
     */
    public K12SchoolType.FederalFunds getFederalFunds() {
        return federalFunds;
    }

    /**
     * Sets the value of the federalFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.FederalFunds }
     *     
     */
    public void setFederalFunds(K12SchoolType.FederalFunds value) {
        this.federalFunds = value;
    }

    /**
     * Gets the value of the sessionList property.
     * 
     * @return
     *     possible object is
     *     {@link K12SchoolType.SessionList }
     *     
     */
    public K12SchoolType.SessionList getSessionList() {
        return sessionList;
    }

    /**
     * Sets the value of the sessionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.SessionList }
     *     
     */
    public void setSessionList(K12SchoolType.SessionList value) {
        this.sessionList = value;
    }

    /**
     * Gets the value of the technicalAssistance property.
     * 
     * @return
     *     possible object is
     *     {@link K12SchoolType.TechnicalAssistance }
     *     
     */
    public K12SchoolType.TechnicalAssistance getTechnicalAssistance() {
        return technicalAssistance;
    }

    /**
     * Sets the value of the technicalAssistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12SchoolType.TechnicalAssistance }
     *     
     */
    public void setTechnicalAssistance(K12SchoolType.TechnicalAssistance value) {
        this.technicalAssistance = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="aypStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="aypAppealChangedDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="aypAppealProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="appealedAYPDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="alternateAYPApproachIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="amaoProficiencyLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="amaoProgressLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="correctiveAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="elementaryMiddleAdditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gunFreeSchoolsActReporting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hsGraduationRateIndicatorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="participationMath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="participationReadingAndLanguageArts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proficiencyTargetMath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="persistentlyDangerous" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proficiencyTargetReadingAndLanguageArts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="persistentlyLowestAchieving" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reconstitutedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="restructuringAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="improvementExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="improvementFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "aypStatus",
        "aypAppealChangedDesignation",
        "aypAppealProcessDate",
        "appealedAYPDesignation",
        "alternateAYPApproachIndicator",
        "amaoProficiencyLEPStudents",
        "amaoProgressLEPStudents",
        "correctiveAction",
        "elementaryMiddleAdditional",
        "gunFreeSchoolsActReporting",
        "hsGraduationRateIndicatorStatus",
        "participationMath",
        "participationReadingAndLanguageArts",
        "proficiencyTargetMath",
        "persistentlyDangerous",
        "proficiencyTargetReadingAndLanguageArts",
        "persistentlyLowestAchieving",
        "reconstitutedStatus",
        "restructuringAction",
        "improvementExitDate",
        "improvementFunds"
    })
    public static class Accountability {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String aypStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String aypAppealChangedDesignation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String aypAppealProcessDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String appealedAYPDesignation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String alternateAYPApproachIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String amaoProficiencyLEPStudents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String amaoProgressLEPStudents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String correctiveAction;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String elementaryMiddleAdditional;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String gunFreeSchoolsActReporting;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hsGraduationRateIndicatorStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String participationMath;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String participationReadingAndLanguageArts;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String proficiencyTargetMath;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String persistentlyDangerous;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String proficiencyTargetReadingAndLanguageArts;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String persistentlyLowestAchieving;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String reconstitutedStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String restructuringAction;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String improvementExitDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String improvementFunds;

        /**
         * Gets the value of the aypStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAypStatus() {
            return aypStatus;
        }

        /**
         * Sets the value of the aypStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAypStatus(String value) {
            this.aypStatus = value;
        }

        /**
         * Gets the value of the aypAppealChangedDesignation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAypAppealChangedDesignation() {
            return aypAppealChangedDesignation;
        }

        /**
         * Sets the value of the aypAppealChangedDesignation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAypAppealChangedDesignation(String value) {
            this.aypAppealChangedDesignation = value;
        }

        /**
         * Gets the value of the aypAppealProcessDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAypAppealProcessDate() {
            return aypAppealProcessDate;
        }

        /**
         * Sets the value of the aypAppealProcessDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAypAppealProcessDate(String value) {
            this.aypAppealProcessDate = value;
        }

        /**
         * Gets the value of the appealedAYPDesignation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAppealedAYPDesignation() {
            return appealedAYPDesignation;
        }

        /**
         * Sets the value of the appealedAYPDesignation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAppealedAYPDesignation(String value) {
            this.appealedAYPDesignation = value;
        }

        /**
         * Gets the value of the alternateAYPApproachIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternateAYPApproachIndicator() {
            return alternateAYPApproachIndicator;
        }

        /**
         * Sets the value of the alternateAYPApproachIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternateAYPApproachIndicator(String value) {
            this.alternateAYPApproachIndicator = value;
        }

        /**
         * Gets the value of the amaoProficiencyLEPStudents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmaoProficiencyLEPStudents() {
            return amaoProficiencyLEPStudents;
        }

        /**
         * Sets the value of the amaoProficiencyLEPStudents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmaoProficiencyLEPStudents(String value) {
            this.amaoProficiencyLEPStudents = value;
        }

        /**
         * Gets the value of the amaoProgressLEPStudents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmaoProgressLEPStudents() {
            return amaoProgressLEPStudents;
        }

        /**
         * Sets the value of the amaoProgressLEPStudents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmaoProgressLEPStudents(String value) {
            this.amaoProgressLEPStudents = value;
        }

        /**
         * Gets the value of the correctiveAction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorrectiveAction() {
            return correctiveAction;
        }

        /**
         * Sets the value of the correctiveAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorrectiveAction(String value) {
            this.correctiveAction = value;
        }

        /**
         * Gets the value of the elementaryMiddleAdditional property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElementaryMiddleAdditional() {
            return elementaryMiddleAdditional;
        }

        /**
         * Sets the value of the elementaryMiddleAdditional property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElementaryMiddleAdditional(String value) {
            this.elementaryMiddleAdditional = value;
        }

        /**
         * Gets the value of the gunFreeSchoolsActReporting property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGunFreeSchoolsActReporting() {
            return gunFreeSchoolsActReporting;
        }

        /**
         * Sets the value of the gunFreeSchoolsActReporting property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGunFreeSchoolsActReporting(String value) {
            this.gunFreeSchoolsActReporting = value;
        }

        /**
         * Gets the value of the hsGraduationRateIndicatorStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHsGraduationRateIndicatorStatus() {
            return hsGraduationRateIndicatorStatus;
        }

        /**
         * Sets the value of the hsGraduationRateIndicatorStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHsGraduationRateIndicatorStatus(String value) {
            this.hsGraduationRateIndicatorStatus = value;
        }

        /**
         * Gets the value of the participationMath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParticipationMath() {
            return participationMath;
        }

        /**
         * Sets the value of the participationMath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParticipationMath(String value) {
            this.participationMath = value;
        }

        /**
         * Gets the value of the participationReadingAndLanguageArts property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParticipationReadingAndLanguageArts() {
            return participationReadingAndLanguageArts;
        }

        /**
         * Sets the value of the participationReadingAndLanguageArts property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParticipationReadingAndLanguageArts(String value) {
            this.participationReadingAndLanguageArts = value;
        }

        /**
         * Gets the value of the proficiencyTargetMath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProficiencyTargetMath() {
            return proficiencyTargetMath;
        }

        /**
         * Sets the value of the proficiencyTargetMath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProficiencyTargetMath(String value) {
            this.proficiencyTargetMath = value;
        }

        /**
         * Gets the value of the persistentlyDangerous property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersistentlyDangerous() {
            return persistentlyDangerous;
        }

        /**
         * Sets the value of the persistentlyDangerous property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersistentlyDangerous(String value) {
            this.persistentlyDangerous = value;
        }

        /**
         * Gets the value of the proficiencyTargetReadingAndLanguageArts property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProficiencyTargetReadingAndLanguageArts() {
            return proficiencyTargetReadingAndLanguageArts;
        }

        /**
         * Sets the value of the proficiencyTargetReadingAndLanguageArts property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProficiencyTargetReadingAndLanguageArts(String value) {
            this.proficiencyTargetReadingAndLanguageArts = value;
        }

        /**
         * Gets the value of the persistentlyLowestAchieving property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersistentlyLowestAchieving() {
            return persistentlyLowestAchieving;
        }

        /**
         * Sets the value of the persistentlyLowestAchieving property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersistentlyLowestAchieving(String value) {
            this.persistentlyLowestAchieving = value;
        }

        /**
         * Gets the value of the reconstitutedStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReconstitutedStatus() {
            return reconstitutedStatus;
        }

        /**
         * Sets the value of the reconstitutedStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReconstitutedStatus(String value) {
            this.reconstitutedStatus = value;
        }

        /**
         * Gets the value of the restructuringAction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRestructuringAction() {
            return restructuringAction;
        }

        /**
         * Sets the value of the restructuringAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRestructuringAction(String value) {
            this.restructuringAction = value;
        }

        /**
         * Gets the value of the improvementExitDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImprovementExitDate() {
            return improvementExitDate;
        }

        /**
         * Sets the value of the improvementExitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImprovementExitDate(String value) {
            this.improvementExitDate = value;
        }

        /**
         * Gets the value of the improvementFunds property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImprovementFunds() {
            return improvementFunds;
        }

        /**
         * Sets the value of the improvementFunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImprovementFunds(String value) {
            this.improvementFunds = value;
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
     *         &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="street" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="buildingSiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="countyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="gridLocation" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="longtitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "address"
    })
    public static class AddressList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<K12SchoolType.AddressList.Address> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link K12SchoolType.AddressList.Address }
         * 
         * 
         */
        public List<K12SchoolType.AddressList.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<K12SchoolType.AddressList.Address>();
            }
            return this.address;
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
         *         &lt;element name="street" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="buildingSiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="countyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="gridLocation" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="longtitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "street",
            "city",
            "stateProvince",
            "postalCode",
            "county",
            "buildingSiteNumber",
            "countyANSICode",
            "gridLocation"
        })
        public static class Address {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected K12SchoolType.AddressList.Address.Street street;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String city;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String stateProvince;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String postalCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String county;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String buildingSiteNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String countyANSICode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected K12SchoolType.AddressList.Address.GridLocation gridLocation;
            @XmlAttribute(name = "addressType")
            protected String addressType;

            /**
             * Gets the value of the street property.
             * 
             * @return
             *     possible object is
             *     {@link K12SchoolType.AddressList.Address.Street }
             *     
             */
            public K12SchoolType.AddressList.Address.Street getStreet() {
                return street;
            }

            /**
             * Sets the value of the street property.
             * 
             * @param value
             *     allowed object is
             *     {@link K12SchoolType.AddressList.Address.Street }
             *     
             */
            public void setStreet(K12SchoolType.AddressList.Address.Street value) {
                this.street = value;
            }

            /**
             * Gets the value of the city property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCity() {
                return city;
            }

            /**
             * Sets the value of the city property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * Gets the value of the stateProvince property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateProvince() {
                return stateProvince;
            }

            /**
             * Sets the value of the stateProvince property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateProvince(String value) {
                this.stateProvince = value;
            }

            /**
             * Gets the value of the postalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPostalCode() {
                return postalCode;
            }

            /**
             * Sets the value of the postalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPostalCode(String value) {
                this.postalCode = value;
            }

            /**
             * Gets the value of the county property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCounty() {
                return county;
            }

            /**
             * Sets the value of the county property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCounty(String value) {
                this.county = value;
            }

            /**
             * Gets the value of the buildingSiteNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBuildingSiteNumber() {
                return buildingSiteNumber;
            }

            /**
             * Sets the value of the buildingSiteNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBuildingSiteNumber(String value) {
                this.buildingSiteNumber = value;
            }

            /**
             * Gets the value of the countyANSICode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountyANSICode() {
                return countyANSICode;
            }

            /**
             * Sets the value of the countyANSICode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountyANSICode(String value) {
                this.countyANSICode = value;
            }

            /**
             * Gets the value of the gridLocation property.
             * 
             * @return
             *     possible object is
             *     {@link K12SchoolType.AddressList.Address.GridLocation }
             *     
             */
            public K12SchoolType.AddressList.Address.GridLocation getGridLocation() {
                return gridLocation;
            }

            /**
             * Sets the value of the gridLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link K12SchoolType.AddressList.Address.GridLocation }
             *     
             */
            public void setGridLocation(K12SchoolType.AddressList.Address.GridLocation value) {
                this.gridLocation = value;
            }

            /**
             * Gets the value of the addressType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressType() {
                return addressType;
            }

            /**
             * Sets the value of the addressType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressType(String value) {
                this.addressType = value;
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
             *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="longtitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "latitude",
                "longtitude"
            })
            public static class GridLocation {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String latitude;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String longtitude;

                /**
                 * Gets the value of the latitude property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLatitude() {
                    return latitude;
                }

                /**
                 * Sets the value of the latitude property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLatitude(String value) {
                    this.latitude = value;
                }

                /**
                 * Gets the value of the longtitude property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLongtitude() {
                    return longtitude;
                }

                /**
                 * Sets the value of the longtitude property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLongtitude(String value) {
                    this.longtitude = value;
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
             *         &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "line1",
                "apartmentNumber"
            })
            public static class Street {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String line1;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String apartmentNumber;

                /**
                 * Gets the value of the line1 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLine1() {
                    return line1;
                }

                /**
                 * Sets the value of the line1 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLine1(String value) {
                    this.line1 = value;
                }

                /**
                 * Gets the value of the apartmentNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getApartmentNumber() {
                    return apartmentNumber;
                }

                /**
                 * Sets the value of the apartmentNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setApartmentNumber(String value) {
                    this.apartmentNumber = value;
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
     *         &lt;element name="gradesOfferedList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="gradesOffered" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="schoolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="emphasisProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="charterSchool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="charterSchoolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fundingControl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="operationalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="operationalStatusEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="alternativeSchoolFocus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="apCourseSelfSelection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="internetAccess" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="improvementStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sharedTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="virtualIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="charterSchoolApprovalAgencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="charterSchoolApprovalYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "gradesOfferedList",
        "schoolType",
        "emphasisProgram",
        "charterSchool",
        "schoolLevel",
        "charterSchoolType",
        "fundingControl",
        "operationalStatus",
        "operationalStatusEffectiveDate",
        "programType",
        "alternativeSchoolFocus",
        "apCourseSelfSelection",
        "internetAccess",
        "improvementStatus",
        "sharedTime",
        "virtualIndicator",
        "url",
        "charterSchoolApprovalAgencyType",
        "charterSchoolApprovalYear"
    })
    public static class Directory {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12SchoolType.Directory.GradesOfferedList gradesOfferedList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String emphasisProgram;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String charterSchool;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolLevel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String charterSchoolType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String fundingControl;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String operationalStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String operationalStatusEffectiveDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String alternativeSchoolFocus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String apCourseSelfSelection;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String internetAccess;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String improvementStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sharedTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String virtualIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String url;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String charterSchoolApprovalAgencyType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String charterSchoolApprovalYear;

        /**
         * Gets the value of the gradesOfferedList property.
         * 
         * @return
         *     possible object is
         *     {@link K12SchoolType.Directory.GradesOfferedList }
         *     
         */
        public K12SchoolType.Directory.GradesOfferedList getGradesOfferedList() {
            return gradesOfferedList;
        }

        /**
         * Sets the value of the gradesOfferedList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12SchoolType.Directory.GradesOfferedList }
         *     
         */
        public void setGradesOfferedList(K12SchoolType.Directory.GradesOfferedList value) {
            this.gradesOfferedList = value;
        }

        /**
         * Gets the value of the schoolType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolType() {
            return schoolType;
        }

        /**
         * Sets the value of the schoolType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolType(String value) {
            this.schoolType = value;
        }

        /**
         * Gets the value of the emphasisProgram property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmphasisProgram() {
            return emphasisProgram;
        }

        /**
         * Sets the value of the emphasisProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmphasisProgram(String value) {
            this.emphasisProgram = value;
        }

        /**
         * Gets the value of the charterSchool property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterSchool() {
            return charterSchool;
        }

        /**
         * Sets the value of the charterSchool property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharterSchool(String value) {
            this.charterSchool = value;
        }

        /**
         * Gets the value of the schoolLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolLevel() {
            return schoolLevel;
        }

        /**
         * Sets the value of the schoolLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolLevel(String value) {
            this.schoolLevel = value;
        }

        /**
         * Gets the value of the charterSchoolType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterSchoolType() {
            return charterSchoolType;
        }

        /**
         * Sets the value of the charterSchoolType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharterSchoolType(String value) {
            this.charterSchoolType = value;
        }

        /**
         * Gets the value of the fundingControl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFundingControl() {
            return fundingControl;
        }

        /**
         * Sets the value of the fundingControl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFundingControl(String value) {
            this.fundingControl = value;
        }

        /**
         * Gets the value of the operationalStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationalStatus() {
            return operationalStatus;
        }

        /**
         * Sets the value of the operationalStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationalStatus(String value) {
            this.operationalStatus = value;
        }

        /**
         * Gets the value of the operationalStatusEffectiveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationalStatusEffectiveDate() {
            return operationalStatusEffectiveDate;
        }

        /**
         * Sets the value of the operationalStatusEffectiveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationalStatusEffectiveDate(String value) {
            this.operationalStatusEffectiveDate = value;
        }

        /**
         * Gets the value of the programType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramType() {
            return programType;
        }

        /**
         * Sets the value of the programType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramType(String value) {
            this.programType = value;
        }

        /**
         * Gets the value of the alternativeSchoolFocus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternativeSchoolFocus() {
            return alternativeSchoolFocus;
        }

        /**
         * Sets the value of the alternativeSchoolFocus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternativeSchoolFocus(String value) {
            this.alternativeSchoolFocus = value;
        }

        /**
         * Gets the value of the apCourseSelfSelection property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApCourseSelfSelection() {
            return apCourseSelfSelection;
        }

        /**
         * Sets the value of the apCourseSelfSelection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApCourseSelfSelection(String value) {
            this.apCourseSelfSelection = value;
        }

        /**
         * Gets the value of the internetAccess property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInternetAccess() {
            return internetAccess;
        }

        /**
         * Sets the value of the internetAccess property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInternetAccess(String value) {
            this.internetAccess = value;
        }

        /**
         * Gets the value of the improvementStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImprovementStatus() {
            return improvementStatus;
        }

        /**
         * Sets the value of the improvementStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImprovementStatus(String value) {
            this.improvementStatus = value;
        }

        /**
         * Gets the value of the sharedTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSharedTime() {
            return sharedTime;
        }

        /**
         * Sets the value of the sharedTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSharedTime(String value) {
            this.sharedTime = value;
        }

        /**
         * Gets the value of the virtualIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVirtualIndicator() {
            return virtualIndicator;
        }

        /**
         * Sets the value of the virtualIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVirtualIndicator(String value) {
            this.virtualIndicator = value;
        }

        /**
         * Gets the value of the url property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrl() {
            return url;
        }

        /**
         * Sets the value of the url property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrl(String value) {
            this.url = value;
        }

        /**
         * Gets the value of the charterSchoolApprovalAgencyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterSchoolApprovalAgencyType() {
            return charterSchoolApprovalAgencyType;
        }

        /**
         * Sets the value of the charterSchoolApprovalAgencyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharterSchoolApprovalAgencyType(String value) {
            this.charterSchoolApprovalAgencyType = value;
        }

        /**
         * Gets the value of the charterSchoolApprovalYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharterSchoolApprovalYear() {
            return charterSchoolApprovalYear;
        }

        /**
         * Sets the value of the charterSchoolApprovalYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharterSchoolApprovalYear(String value) {
            this.charterSchoolApprovalYear = value;
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
         *         &lt;element name="gradesOffered" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "gradesOffered"
        })
        public static class GradesOfferedList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<String> gradesOffered;

            /**
             * Gets the value of the gradesOffered property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the gradesOffered property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getGradesOffered().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getGradesOffered() {
                if (gradesOffered == null) {
                    gradesOffered = new ArrayList<String>();
                }
                return this.gradesOffered;
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
     *         &lt;element name="consolidatedMEPFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="improvementGrantIntervention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "consolidatedMEPFunds",
        "improvementGrantIntervention"
    })
    public static class FederalFunds {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String consolidatedMEPFunds;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String improvementGrantIntervention;

        /**
         * Gets the value of the consolidatedMEPFunds property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConsolidatedMEPFunds() {
            return consolidatedMEPFunds;
        }

        /**
         * Sets the value of the consolidatedMEPFunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConsolidatedMEPFunds(String value) {
            this.consolidatedMEPFunds = value;
        }

        /**
         * Gets the value of the improvementGrantIntervention property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImprovementGrantIntervention() {
            return improvementGrantIntervention;
        }

        /**
         * Sets the value of the improvementGrantIntervention property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImprovementGrantIntervention(String value) {
            this.improvementGrantIntervention = value;
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
     *         &lt;element name="financialAccountCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountFundClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountingPeriodActualValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAccountingPeriodBudgetedValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialBalanceSheetAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialExpenditureFunctionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialExpenditureObjectCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "financialAccountCategory",
        "financialAccountDescription",
        "financialAccountFundClassification",
        "financialAccountName",
        "financialAccountProgramCode",
        "financialAccountingPeriodActualValue",
        "financialAccountingPeriodBudgetedValue",
        "financialBalanceSheetAccountCode",
        "financialExpenditureFunctionCode",
        "financialExpenditureObjectCode"
    })
    public static class Finance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountCategory;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountFundClassification;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountProgramCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountingPeriodActualValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAccountingPeriodBudgetedValue;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialBalanceSheetAccountCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialExpenditureFunctionCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialExpenditureObjectCode;

        /**
         * Gets the value of the financialAccountCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountCategory() {
            return financialAccountCategory;
        }

        /**
         * Sets the value of the financialAccountCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountCategory(String value) {
            this.financialAccountCategory = value;
        }

        /**
         * Gets the value of the financialAccountDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountDescription() {
            return financialAccountDescription;
        }

        /**
         * Sets the value of the financialAccountDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountDescription(String value) {
            this.financialAccountDescription = value;
        }

        /**
         * Gets the value of the financialAccountFundClassification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountFundClassification() {
            return financialAccountFundClassification;
        }

        /**
         * Sets the value of the financialAccountFundClassification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountFundClassification(String value) {
            this.financialAccountFundClassification = value;
        }

        /**
         * Gets the value of the financialAccountName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountName() {
            return financialAccountName;
        }

        /**
         * Sets the value of the financialAccountName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountName(String value) {
            this.financialAccountName = value;
        }

        /**
         * Gets the value of the financialAccountProgramCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountProgramCode() {
            return financialAccountProgramCode;
        }

        /**
         * Sets the value of the financialAccountProgramCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountProgramCode(String value) {
            this.financialAccountProgramCode = value;
        }

        /**
         * Gets the value of the financialAccountingPeriodActualValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountingPeriodActualValue() {
            return financialAccountingPeriodActualValue;
        }

        /**
         * Sets the value of the financialAccountingPeriodActualValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountingPeriodActualValue(String value) {
            this.financialAccountingPeriodActualValue = value;
        }

        /**
         * Gets the value of the financialAccountingPeriodBudgetedValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAccountingPeriodBudgetedValue() {
            return financialAccountingPeriodBudgetedValue;
        }

        /**
         * Sets the value of the financialAccountingPeriodBudgetedValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAccountingPeriodBudgetedValue(String value) {
            this.financialAccountingPeriodBudgetedValue = value;
        }

        /**
         * Gets the value of the financialBalanceSheetAccountCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialBalanceSheetAccountCode() {
            return financialBalanceSheetAccountCode;
        }

        /**
         * Sets the value of the financialBalanceSheetAccountCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialBalanceSheetAccountCode(String value) {
            this.financialBalanceSheetAccountCode = value;
        }

        /**
         * Gets the value of the financialExpenditureFunctionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialExpenditureFunctionCode() {
            return financialExpenditureFunctionCode;
        }

        /**
         * Sets the value of the financialExpenditureFunctionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialExpenditureFunctionCode(String value) {
            this.financialExpenditureFunctionCode = value;
        }

        /**
         * Gets the value of the financialExpenditureObjectCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialExpenditureObjectCode() {
            return financialExpenditureObjectCode;
        }

        /**
         * Sets the value of the financialExpenditureObjectCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialExpenditureObjectCode(String value) {
            this.financialExpenditureObjectCode = value;
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
     *         &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="shortNameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "schoolIdSystem",
        "name",
        "organizationType",
        "shortNameOfInstitution"
    })
    public static class Identification {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String organizationType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String shortNameOfInstitution;

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
         * Gets the value of the schoolIdSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolIdSystem() {
            return schoolIdSystem;
        }

        /**
         * Sets the value of the schoolIdSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolIdSystem(String value) {
            this.schoolIdSystem = value;
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
         * Gets the value of the organizationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationType() {
            return organizationType;
        }

        /**
         * Sets the value of the organizationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationType(String value) {
            this.organizationType = value;
        }

        /**
         * Gets the value of the shortNameOfInstitution property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShortNameOfInstitution() {
            return shortNameOfInstitution;
        }

        /**
         * Sets the value of the shortNameOfInstitution property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShortNameOfInstitution(String value) {
            this.shortNameOfInstitution = value;
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
     *         &lt;element name="abilityGrouping" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteNontraditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programGiftedEligibilityCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="increasedLearningTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="statePovertyDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="studentSupportServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleIProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleISchoolStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleIIILanguageInstructionProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="disciplineMethodForFirearmsIncidents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="disciplineMethodOfChildrenWithDisabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaDisciplineMethodForFirearmsIncidents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "abilityGrouping",
        "cteNontraditional",
        "programGiftedEligibilityCriteria",
        "increasedLearningTime",
        "statePovertyDesignation",
        "studentSupportServiceType",
        "titleIProgramType",
        "titleISchoolStatus",
        "titleIIILanguageInstructionProgramType",
        "disciplineMethodForFirearmsIncidents",
        "disciplineMethodOfChildrenWithDisabilities",
        "ideaDisciplineMethodForFirearmsIncidents"
    })
    public static class InstitutionCharacteristics {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String abilityGrouping;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteNontraditional;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programGiftedEligibilityCriteria;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String increasedLearningTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String statePovertyDesignation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String studentSupportServiceType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleIProgramType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleISchoolStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleIIILanguageInstructionProgramType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String disciplineMethodForFirearmsIncidents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String disciplineMethodOfChildrenWithDisabilities;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaDisciplineMethodForFirearmsIncidents;

        /**
         * Gets the value of the abilityGrouping property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbilityGrouping() {
            return abilityGrouping;
        }

        /**
         * Sets the value of the abilityGrouping property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbilityGrouping(String value) {
            this.abilityGrouping = value;
        }

        /**
         * Gets the value of the cteNontraditional property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCteNontraditional() {
            return cteNontraditional;
        }

        /**
         * Sets the value of the cteNontraditional property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCteNontraditional(String value) {
            this.cteNontraditional = value;
        }

        /**
         * Gets the value of the programGiftedEligibilityCriteria property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramGiftedEligibilityCriteria() {
            return programGiftedEligibilityCriteria;
        }

        /**
         * Sets the value of the programGiftedEligibilityCriteria property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramGiftedEligibilityCriteria(String value) {
            this.programGiftedEligibilityCriteria = value;
        }

        /**
         * Gets the value of the increasedLearningTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIncreasedLearningTime() {
            return increasedLearningTime;
        }

        /**
         * Sets the value of the increasedLearningTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIncreasedLearningTime(String value) {
            this.increasedLearningTime = value;
        }

        /**
         * Gets the value of the statePovertyDesignation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatePovertyDesignation() {
            return statePovertyDesignation;
        }

        /**
         * Sets the value of the statePovertyDesignation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatePovertyDesignation(String value) {
            this.statePovertyDesignation = value;
        }

        /**
         * Gets the value of the studentSupportServiceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStudentSupportServiceType() {
            return studentSupportServiceType;
        }

        /**
         * Sets the value of the studentSupportServiceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStudentSupportServiceType(String value) {
            this.studentSupportServiceType = value;
        }

        /**
         * Gets the value of the titleIProgramType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleIProgramType() {
            return titleIProgramType;
        }

        /**
         * Sets the value of the titleIProgramType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleIProgramType(String value) {
            this.titleIProgramType = value;
        }

        /**
         * Gets the value of the titleISchoolStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleISchoolStatus() {
            return titleISchoolStatus;
        }

        /**
         * Sets the value of the titleISchoolStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleISchoolStatus(String value) {
            this.titleISchoolStatus = value;
        }

        /**
         * Gets the value of the titleIIILanguageInstructionProgramType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleIIILanguageInstructionProgramType() {
            return titleIIILanguageInstructionProgramType;
        }

        /**
         * Sets the value of the titleIIILanguageInstructionProgramType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleIIILanguageInstructionProgramType(String value) {
            this.titleIIILanguageInstructionProgramType = value;
        }

        /**
         * Gets the value of the disciplineMethodForFirearmsIncidents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisciplineMethodForFirearmsIncidents() {
            return disciplineMethodForFirearmsIncidents;
        }

        /**
         * Sets the value of the disciplineMethodForFirearmsIncidents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisciplineMethodForFirearmsIncidents(String value) {
            this.disciplineMethodForFirearmsIncidents = value;
        }

        /**
         * Gets the value of the disciplineMethodOfChildrenWithDisabilities property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisciplineMethodOfChildrenWithDisabilities() {
            return disciplineMethodOfChildrenWithDisabilities;
        }

        /**
         * Sets the value of the disciplineMethodOfChildrenWithDisabilities property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisciplineMethodOfChildrenWithDisabilities(String value) {
            this.disciplineMethodOfChildrenWithDisabilities = value;
        }

        /**
         * Gets the value of the ideaDisciplineMethodForFirearmsIncidents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaDisciplineMethodForFirearmsIncidents() {
            return ideaDisciplineMethodForFirearmsIncidents;
        }

        /**
         * Sets the value of the ideaDisciplineMethodForFirearmsIncidents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaDisciplineMethodForFirearmsIncidents(String value) {
            this.ideaDisciplineMethodForFirearmsIncidents = value;
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
     *         &lt;element name="phoneNumber" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "phoneNumber"
    })
    public static class PhoneNumberList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<K12SchoolType.PhoneNumberList.PhoneNumber> phoneNumber;

        /**
         * Gets the value of the phoneNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phoneNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhoneNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link K12SchoolType.PhoneNumberList.PhoneNumber }
         * 
         * 
         */
        public List<K12SchoolType.PhoneNumberList.PhoneNumber> getPhoneNumber() {
            if (phoneNumber == null) {
                phoneNumber = new ArrayList<K12SchoolType.PhoneNumberList.PhoneNumber>();
            }
            return this.phoneNumber;
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
         *         &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "phoneNumberIndicator",
            "number"
        })
        public static class PhoneNumber {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String phoneNumberIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String number;
            @XmlAttribute(name = "phoneNumberType")
            protected String phoneNumberType;

            /**
             * Gets the value of the phoneNumberIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneNumberIndicator() {
                return phoneNumberIndicator;
            }

            /**
             * Sets the value of the phoneNumberIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneNumberIndicator(String value) {
                this.phoneNumberIndicator = value;
            }

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumber(String value) {
                this.number = value;
            }

            /**
             * Gets the value of the phoneNumberType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPhoneNumberType() {
                return phoneNumberType;
            }

            /**
             * Sets the value of the phoneNumberType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPhoneNumberType(String value) {
                this.phoneNumberType = value;
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
     *         &lt;element name="session" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sessionMarkingTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sessionSchedulingTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sessionAttendanceTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="firstInstructionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastInstructionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="daysInSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="schoolYearMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="instructionalMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="minutesPerDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sessionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "session"
    })
    public static class SessionList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<K12SchoolType.SessionList.Session> session;

        /**
         * Gets the value of the session property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the session property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSession().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link K12SchoolType.SessionList.Session }
         * 
         * 
         */
        public List<K12SchoolType.SessionList.Session> getSession() {
            if (session == null) {
                session = new ArrayList<K12SchoolType.SessionList.Session>();
            }
            return this.session;
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
         *         &lt;element name="sessionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sessionMarkingTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sessionSchedulingTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sessionAttendanceTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="schoolYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="firstInstructionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastInstructionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="daysInSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="schoolYearMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="instructionalMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="minutesPerDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sessionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "sessionDescription",
            "sessionMarkingTerm",
            "sessionSchedulingTerm",
            "sessionAttendanceTerm",
            "schoolYear",
            "firstInstructionDate",
            "lastInstructionDate",
            "daysInSession",
            "schoolYearMinutes",
            "instructionalMinutes",
            "minutesPerDay",
            "sessionCode"
        })
        public static class Session {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String sessionDescription;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String sessionMarkingTerm;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String sessionSchedulingTerm;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String sessionAttendanceTerm;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String schoolYear;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String firstInstructionDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String lastInstructionDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String daysInSession;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String schoolYearMinutes;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String instructionalMinutes;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String minutesPerDay;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String sessionCode;

            /**
             * Gets the value of the sessionDescription property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSessionDescription() {
                return sessionDescription;
            }

            /**
             * Sets the value of the sessionDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSessionDescription(String value) {
                this.sessionDescription = value;
            }

            /**
             * Gets the value of the sessionMarkingTerm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSessionMarkingTerm() {
                return sessionMarkingTerm;
            }

            /**
             * Sets the value of the sessionMarkingTerm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSessionMarkingTerm(String value) {
                this.sessionMarkingTerm = value;
            }

            /**
             * Gets the value of the sessionSchedulingTerm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSessionSchedulingTerm() {
                return sessionSchedulingTerm;
            }

            /**
             * Sets the value of the sessionSchedulingTerm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSessionSchedulingTerm(String value) {
                this.sessionSchedulingTerm = value;
            }

            /**
             * Gets the value of the sessionAttendanceTerm property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSessionAttendanceTerm() {
                return sessionAttendanceTerm;
            }

            /**
             * Sets the value of the sessionAttendanceTerm property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSessionAttendanceTerm(String value) {
                this.sessionAttendanceTerm = value;
            }

            /**
             * Gets the value of the schoolYear property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchoolYear() {
                return schoolYear;
            }

            /**
             * Sets the value of the schoolYear property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchoolYear(String value) {
                this.schoolYear = value;
            }

            /**
             * Gets the value of the firstInstructionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstInstructionDate() {
                return firstInstructionDate;
            }

            /**
             * Sets the value of the firstInstructionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstInstructionDate(String value) {
                this.firstInstructionDate = value;
            }

            /**
             * Gets the value of the lastInstructionDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastInstructionDate() {
                return lastInstructionDate;
            }

            /**
             * Sets the value of the lastInstructionDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastInstructionDate(String value) {
                this.lastInstructionDate = value;
            }

            /**
             * Gets the value of the daysInSession property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDaysInSession() {
                return daysInSession;
            }

            /**
             * Sets the value of the daysInSession property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDaysInSession(String value) {
                this.daysInSession = value;
            }

            /**
             * Gets the value of the schoolYearMinutes property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSchoolYearMinutes() {
                return schoolYearMinutes;
            }

            /**
             * Sets the value of the schoolYearMinutes property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSchoolYearMinutes(String value) {
                this.schoolYearMinutes = value;
            }

            /**
             * Gets the value of the instructionalMinutes property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInstructionalMinutes() {
                return instructionalMinutes;
            }

            /**
             * Sets the value of the instructionalMinutes property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInstructionalMinutes(String value) {
                this.instructionalMinutes = value;
            }

            /**
             * Gets the value of the minutesPerDay property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinutesPerDay() {
                return minutesPerDay;
            }

            /**
             * Sets the value of the minutesPerDay property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinutesPerDay(String value) {
                this.minutesPerDay = value;
            }

            /**
             * Gets the value of the sessionCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSessionCode() {
                return sessionCode;
            }

            /**
             * Sets the value of the sessionCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSessionCode(String value) {
                this.sessionCode = value;
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
     *         &lt;element name="technicalAssistanceApprovedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="technicalAssistanceDeliveryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="technicalAssistanceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "technicalAssistanceApprovedIndicator",
        "technicalAssistanceDeliveryType",
        "technicalAssistanceType"
    })
    public static class TechnicalAssistance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String technicalAssistanceApprovedIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String technicalAssistanceDeliveryType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String technicalAssistanceType;

        /**
         * Gets the value of the technicalAssistanceApprovedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicalAssistanceApprovedIndicator() {
            return technicalAssistanceApprovedIndicator;
        }

        /**
         * Sets the value of the technicalAssistanceApprovedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnicalAssistanceApprovedIndicator(String value) {
            this.technicalAssistanceApprovedIndicator = value;
        }

        /**
         * Gets the value of the technicalAssistanceDeliveryType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicalAssistanceDeliveryType() {
            return technicalAssistanceDeliveryType;
        }

        /**
         * Sets the value of the technicalAssistanceDeliveryType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnicalAssistanceDeliveryType(String value) {
            this.technicalAssistanceDeliveryType = value;
        }

        /**
         * Gets the value of the technicalAssistanceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnicalAssistanceType() {
            return technicalAssistanceType;
        }

        /**
         * Sets the value of the technicalAssistanceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnicalAssistanceType(String value) {
            this.technicalAssistanceType = value;
        }

    }

}
