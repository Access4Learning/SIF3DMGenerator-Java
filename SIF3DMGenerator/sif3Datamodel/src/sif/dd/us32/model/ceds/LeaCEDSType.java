
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
 * <p>Java class for leaCEDSType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="leaCEDSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="leaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="leaIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="countyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="charterSchool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="leaOperationalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="operationalStatusEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="leaSupervisoryUnionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="facilitiesId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="leaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="alternateAYPApproachIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="amaoAYPProgressLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="amaoProficiencyLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="amaoProgressLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="appealedAYPDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="aypAppealChangedDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="aypAppealProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="accountabilityReportTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="elementaryMiddleAdditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gunFreeSchoolsActReporting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hsGraduationRateIndicatorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="leaImprovement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="participationMath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="participationReadingAndLanguageArts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proficiencyTargetMath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proficiencyTargetReadingAndLanguageArts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="choiceImplementation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleIIIProfessionalDevelopment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="aypStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="federalProgramsFundingAllocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fundsTransferAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="innovativeProgramsFundsReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="innovativeDollarsSpent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="innovativeDollarsSpentStrategic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="leaTransferabilityOfFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="leaFundsTransferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="choiceFundsSpent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="improvementReservedFundsPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="improvementAllocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sesFundsSpent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sesPerPupilExpenditure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sesPublicSchoolChoiceTwentyPercentObligation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="useOfTheRLISProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="programFederalReporting" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="barrierToEducatingHomeless" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="desegregationPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="harassmentOrBullyingPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="integratedTechnologyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reapAlternativeFundingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="administrationFunding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="standardsFunding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="terminatedTitleIIIProgramsDueToFailure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="interscholasticSportsMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="interscholasticSportsFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="interscholasticTeamsMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="interscholasticTeamsFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="interscholasticSportParticipantsMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="interscholasticSportParticipantsFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="safeDrugFree" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="safeAndDrugFreeBaseline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="safeAndDrugFreeBaselineYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="safeAndDrugFreeCollectionFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="safeAndDrugFreeIndicatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="safeAndDrugFreeInstrument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="safeAndDrugFreePerformance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="safeAndDrugFreeTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="safeAndDrugFreeYearMostRecentCollection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="programsServices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="prekindergartenEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prekindergartenEligibleAgesForNonIDEAStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prekindergartenDailyLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="kindergartenDailyLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programGiftedEligibilityCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="migrantEducationProgramSessionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="migrantEducationProgramProjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfImmigrantProgramSubgrants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programInMultiplePurposeFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleIInstructionalServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleIProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleISupportServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleIIILanguageInstructionProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="financialRevenueAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "leaCEDSType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "identification",
    "addressList",
    "phoneNumberList",
    "directory",
    "accountability",
    "federalFunds",
    "programFederalReporting",
    "safeDrugFree",
    "programsServices",
    "finance",
    "technicalAssistance"
})
public class LeaCEDSType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.Identification identification;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.AddressList addressList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.PhoneNumberList phoneNumberList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.Directory directory;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.Accountability accountability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.FederalFunds federalFunds;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.ProgramFederalReporting programFederalReporting;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.SafeDrugFree safeDrugFree;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.ProgramsServices programsServices;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.Finance finance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected LeaCEDSType.TechnicalAssistance technicalAssistance;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.Identification }
     *     
     */
    public LeaCEDSType.Identification getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.Identification }
     *     
     */
    public void setIdentification(LeaCEDSType.Identification value) {
        this.identification = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.AddressList }
     *     
     */
    public LeaCEDSType.AddressList getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.AddressList }
     *     
     */
    public void setAddressList(LeaCEDSType.AddressList value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the phoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.PhoneNumberList }
     *     
     */
    public LeaCEDSType.PhoneNumberList getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Sets the value of the phoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.PhoneNumberList }
     *     
     */
    public void setPhoneNumberList(LeaCEDSType.PhoneNumberList value) {
        this.phoneNumberList = value;
    }

    /**
     * Gets the value of the directory property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.Directory }
     *     
     */
    public LeaCEDSType.Directory getDirectory() {
        return directory;
    }

    /**
     * Sets the value of the directory property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.Directory }
     *     
     */
    public void setDirectory(LeaCEDSType.Directory value) {
        this.directory = value;
    }

    /**
     * Gets the value of the accountability property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.Accountability }
     *     
     */
    public LeaCEDSType.Accountability getAccountability() {
        return accountability;
    }

    /**
     * Sets the value of the accountability property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.Accountability }
     *     
     */
    public void setAccountability(LeaCEDSType.Accountability value) {
        this.accountability = value;
    }

    /**
     * Gets the value of the federalFunds property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.FederalFunds }
     *     
     */
    public LeaCEDSType.FederalFunds getFederalFunds() {
        return federalFunds;
    }

    /**
     * Sets the value of the federalFunds property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.FederalFunds }
     *     
     */
    public void setFederalFunds(LeaCEDSType.FederalFunds value) {
        this.federalFunds = value;
    }

    /**
     * Gets the value of the programFederalReporting property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.ProgramFederalReporting }
     *     
     */
    public LeaCEDSType.ProgramFederalReporting getProgramFederalReporting() {
        return programFederalReporting;
    }

    /**
     * Sets the value of the programFederalReporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.ProgramFederalReporting }
     *     
     */
    public void setProgramFederalReporting(LeaCEDSType.ProgramFederalReporting value) {
        this.programFederalReporting = value;
    }

    /**
     * Gets the value of the safeDrugFree property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.SafeDrugFree }
     *     
     */
    public LeaCEDSType.SafeDrugFree getSafeDrugFree() {
        return safeDrugFree;
    }

    /**
     * Sets the value of the safeDrugFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.SafeDrugFree }
     *     
     */
    public void setSafeDrugFree(LeaCEDSType.SafeDrugFree value) {
        this.safeDrugFree = value;
    }

    /**
     * Gets the value of the programsServices property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.ProgramsServices }
     *     
     */
    public LeaCEDSType.ProgramsServices getProgramsServices() {
        return programsServices;
    }

    /**
     * Sets the value of the programsServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.ProgramsServices }
     *     
     */
    public void setProgramsServices(LeaCEDSType.ProgramsServices value) {
        this.programsServices = value;
    }

    /**
     * Gets the value of the finance property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.Finance }
     *     
     */
    public LeaCEDSType.Finance getFinance() {
        return finance;
    }

    /**
     * Sets the value of the finance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.Finance }
     *     
     */
    public void setFinance(LeaCEDSType.Finance value) {
        this.finance = value;
    }

    /**
     * Gets the value of the technicalAssistance property.
     * 
     * @return
     *     possible object is
     *     {@link LeaCEDSType.TechnicalAssistance }
     *     
     */
    public LeaCEDSType.TechnicalAssistance getTechnicalAssistance() {
        return technicalAssistance;
    }

    /**
     * Sets the value of the technicalAssistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeaCEDSType.TechnicalAssistance }
     *     
     */
    public void setTechnicalAssistance(LeaCEDSType.TechnicalAssistance value) {
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
     *         &lt;element name="alternateAYPApproachIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="amaoAYPProgressLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="amaoProficiencyLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="amaoProgressLEPStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="appealedAYPDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="aypAppealChangedDesignation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="aypAppealProcessDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="accountabilityReportTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="elementaryMiddleAdditional" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gunFreeSchoolsActReporting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hsGraduationRateIndicatorStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="leaImprovement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="participationMath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="participationReadingAndLanguageArts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proficiencyTargetMath" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proficiencyTargetReadingAndLanguageArts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="choiceImplementation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleIIIProfessionalDevelopment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="aypStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "alternateAYPApproachIndicator",
        "amaoAYPProgressLEPStudents",
        "amaoProficiencyLEPStudents",
        "amaoProgressLEPStudents",
        "appealedAYPDesignation",
        "aypAppealChangedDesignation",
        "aypAppealProcessDate",
        "accountabilityReportTitle",
        "elementaryMiddleAdditional",
        "gunFreeSchoolsActReporting",
        "hsGraduationRateIndicatorStatus",
        "leaImprovement",
        "participationMath",
        "participationReadingAndLanguageArts",
        "proficiencyTargetMath",
        "proficiencyTargetReadingAndLanguageArts",
        "choiceImplementation",
        "titleIIIProfessionalDevelopment",
        "aypStatus"
    })
    public static class Accountability {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String alternateAYPApproachIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String amaoAYPProgressLEPStudents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String amaoProficiencyLEPStudents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String amaoProgressLEPStudents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String appealedAYPDesignation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String aypAppealChangedDesignation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String aypAppealProcessDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String accountabilityReportTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String elementaryMiddleAdditional;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String gunFreeSchoolsActReporting;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hsGraduationRateIndicatorStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaImprovement;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String participationMath;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String participationReadingAndLanguageArts;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String proficiencyTargetMath;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String proficiencyTargetReadingAndLanguageArts;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String choiceImplementation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleIIIProfessionalDevelopment;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String aypStatus;

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
         * Gets the value of the amaoAYPProgressLEPStudents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmaoAYPProgressLEPStudents() {
            return amaoAYPProgressLEPStudents;
        }

        /**
         * Sets the value of the amaoAYPProgressLEPStudents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmaoAYPProgressLEPStudents(String value) {
            this.amaoAYPProgressLEPStudents = value;
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
         * Gets the value of the accountabilityReportTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountabilityReportTitle() {
            return accountabilityReportTitle;
        }

        /**
         * Sets the value of the accountabilityReportTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountabilityReportTitle(String value) {
            this.accountabilityReportTitle = value;
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
         * Gets the value of the leaImprovement property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeaImprovement() {
            return leaImprovement;
        }

        /**
         * Sets the value of the leaImprovement property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeaImprovement(String value) {
            this.leaImprovement = value;
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
         * Gets the value of the choiceImplementation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChoiceImplementation() {
            return choiceImplementation;
        }

        /**
         * Sets the value of the choiceImplementation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChoiceImplementation(String value) {
            this.choiceImplementation = value;
        }

        /**
         * Gets the value of the titleIIIProfessionalDevelopment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleIIIProfessionalDevelopment() {
            return titleIIIProfessionalDevelopment;
        }

        /**
         * Sets the value of the titleIIIProfessionalDevelopment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleIIIProfessionalDevelopment(String value) {
            this.titleIIIProfessionalDevelopment = value;
        }

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
     *                   &lt;element name="countyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected List<LeaCEDSType.AddressList.Address> address;

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
         * {@link LeaCEDSType.AddressList.Address }
         * 
         * 
         */
        public List<LeaCEDSType.AddressList.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<LeaCEDSType.AddressList.Address>();
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
         *         &lt;element name="countyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "countyANSICode"
        })
        public static class Address {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected LeaCEDSType.AddressList.Address.Street street;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String city;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String stateProvince;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String postalCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String county;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String countyANSICode;
            @XmlAttribute(name = "addressType")
            protected String addressType;

            /**
             * Gets the value of the street property.
             * 
             * @return
             *     possible object is
             *     {@link LeaCEDSType.AddressList.Address.Street }
             *     
             */
            public LeaCEDSType.AddressList.Address.Street getStreet() {
                return street;
            }

            /**
             * Sets the value of the street property.
             * 
             * @param value
             *     allowed object is
             *     {@link LeaCEDSType.AddressList.Address.Street }
             *     
             */
            public void setStreet(LeaCEDSType.AddressList.Address.Street value) {
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
     *         &lt;element name="charterSchool" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="leaOperationalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="operationalStatusEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="leaSupervisoryUnionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="facilitiesId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="leaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "charterSchool",
        "leaOperationalStatus",
        "operationalStatusEffectiveDate",
        "leaSupervisoryUnionId",
        "url",
        "facilitiesId",
        "leaType"
    })
    public static class Directory {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String charterSchool;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaOperationalStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String operationalStatusEffectiveDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaSupervisoryUnionId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String url;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String facilitiesId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaType;

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
         * Gets the value of the leaOperationalStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeaOperationalStatus() {
            return leaOperationalStatus;
        }

        /**
         * Sets the value of the leaOperationalStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeaOperationalStatus(String value) {
            this.leaOperationalStatus = value;
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
         * Gets the value of the leaSupervisoryUnionId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeaSupervisoryUnionId() {
            return leaSupervisoryUnionId;
        }

        /**
         * Sets the value of the leaSupervisoryUnionId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeaSupervisoryUnionId(String value) {
            this.leaSupervisoryUnionId = value;
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
         * Gets the value of the facilitiesId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacilitiesId() {
            return facilitiesId;
        }

        /**
         * Sets the value of the facilitiesId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacilitiesId(String value) {
            this.facilitiesId = value;
        }

        /**
         * Gets the value of the leaType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeaType() {
            return leaType;
        }

        /**
         * Sets the value of the leaType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeaType(String value) {
            this.leaType = value;
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
     *         &lt;element name="federalProgramsFundingAllocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fundsTransferAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="innovativeProgramsFundsReceived" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="innovativeDollarsSpent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="innovativeDollarsSpentStrategic" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="leaTransferabilityOfFunds" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="leaFundsTransferType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="choiceFundsSpent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="improvementReservedFundsPercentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="improvementAllocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sesFundsSpent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sesPerPupilExpenditure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sesPublicSchoolChoiceTwentyPercentObligation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="useOfTheRLISProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "federalProgramsFundingAllocation",
        "fundsTransferAmount",
        "innovativeProgramsFundsReceived",
        "innovativeDollarsSpent",
        "innovativeDollarsSpentStrategic",
        "leaTransferabilityOfFunds",
        "leaFundsTransferType",
        "choiceFundsSpent",
        "improvementReservedFundsPercentage",
        "improvementAllocation",
        "sesFundsSpent",
        "sesPerPupilExpenditure",
        "sesPublicSchoolChoiceTwentyPercentObligation",
        "useOfTheRLISProgram"
    })
    public static class FederalFunds {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String federalProgramsFundingAllocation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String fundsTransferAmount;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String innovativeProgramsFundsReceived;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String innovativeDollarsSpent;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String innovativeDollarsSpentStrategic;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaTransferabilityOfFunds;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaFundsTransferType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String choiceFundsSpent;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String improvementReservedFundsPercentage;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String improvementAllocation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sesFundsSpent;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sesPerPupilExpenditure;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sesPublicSchoolChoiceTwentyPercentObligation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String useOfTheRLISProgram;

        /**
         * Gets the value of the federalProgramsFundingAllocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFederalProgramsFundingAllocation() {
            return federalProgramsFundingAllocation;
        }

        /**
         * Sets the value of the federalProgramsFundingAllocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFederalProgramsFundingAllocation(String value) {
            this.federalProgramsFundingAllocation = value;
        }

        /**
         * Gets the value of the fundsTransferAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFundsTransferAmount() {
            return fundsTransferAmount;
        }

        /**
         * Sets the value of the fundsTransferAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFundsTransferAmount(String value) {
            this.fundsTransferAmount = value;
        }

        /**
         * Gets the value of the innovativeProgramsFundsReceived property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInnovativeProgramsFundsReceived() {
            return innovativeProgramsFundsReceived;
        }

        /**
         * Sets the value of the innovativeProgramsFundsReceived property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInnovativeProgramsFundsReceived(String value) {
            this.innovativeProgramsFundsReceived = value;
        }

        /**
         * Gets the value of the innovativeDollarsSpent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInnovativeDollarsSpent() {
            return innovativeDollarsSpent;
        }

        /**
         * Sets the value of the innovativeDollarsSpent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInnovativeDollarsSpent(String value) {
            this.innovativeDollarsSpent = value;
        }

        /**
         * Gets the value of the innovativeDollarsSpentStrategic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInnovativeDollarsSpentStrategic() {
            return innovativeDollarsSpentStrategic;
        }

        /**
         * Sets the value of the innovativeDollarsSpentStrategic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInnovativeDollarsSpentStrategic(String value) {
            this.innovativeDollarsSpentStrategic = value;
        }

        /**
         * Gets the value of the leaTransferabilityOfFunds property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeaTransferabilityOfFunds() {
            return leaTransferabilityOfFunds;
        }

        /**
         * Sets the value of the leaTransferabilityOfFunds property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeaTransferabilityOfFunds(String value) {
            this.leaTransferabilityOfFunds = value;
        }

        /**
         * Gets the value of the leaFundsTransferType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeaFundsTransferType() {
            return leaFundsTransferType;
        }

        /**
         * Sets the value of the leaFundsTransferType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeaFundsTransferType(String value) {
            this.leaFundsTransferType = value;
        }

        /**
         * Gets the value of the choiceFundsSpent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChoiceFundsSpent() {
            return choiceFundsSpent;
        }

        /**
         * Sets the value of the choiceFundsSpent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChoiceFundsSpent(String value) {
            this.choiceFundsSpent = value;
        }

        /**
         * Gets the value of the improvementReservedFundsPercentage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImprovementReservedFundsPercentage() {
            return improvementReservedFundsPercentage;
        }

        /**
         * Sets the value of the improvementReservedFundsPercentage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImprovementReservedFundsPercentage(String value) {
            this.improvementReservedFundsPercentage = value;
        }

        /**
         * Gets the value of the improvementAllocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImprovementAllocation() {
            return improvementAllocation;
        }

        /**
         * Sets the value of the improvementAllocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImprovementAllocation(String value) {
            this.improvementAllocation = value;
        }

        /**
         * Gets the value of the sesFundsSpent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSesFundsSpent() {
            return sesFundsSpent;
        }

        /**
         * Sets the value of the sesFundsSpent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSesFundsSpent(String value) {
            this.sesFundsSpent = value;
        }

        /**
         * Gets the value of the sesPerPupilExpenditure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSesPerPupilExpenditure() {
            return sesPerPupilExpenditure;
        }

        /**
         * Sets the value of the sesPerPupilExpenditure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSesPerPupilExpenditure(String value) {
            this.sesPerPupilExpenditure = value;
        }

        /**
         * Gets the value of the sesPublicSchoolChoiceTwentyPercentObligation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSesPublicSchoolChoiceTwentyPercentObligation() {
            return sesPublicSchoolChoiceTwentyPercentObligation;
        }

        /**
         * Sets the value of the sesPublicSchoolChoiceTwentyPercentObligation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSesPublicSchoolChoiceTwentyPercentObligation(String value) {
            this.sesPublicSchoolChoiceTwentyPercentObligation = value;
        }

        /**
         * Gets the value of the useOfTheRLISProgram property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUseOfTheRLISProgram() {
            return useOfTheRLISProgram;
        }

        /**
         * Sets the value of the useOfTheRLISProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUseOfTheRLISProgram(String value) {
            this.useOfTheRLISProgram = value;
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
     *         &lt;element name="financialRevenueAccountCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "financialExpenditureObjectCode",
        "financialRevenueAccountCode"
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
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialRevenueAccountCode;

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

        /**
         * Gets the value of the financialRevenueAccountCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialRevenueAccountCode() {
            return financialRevenueAccountCode;
        }

        /**
         * Sets the value of the financialRevenueAccountCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialRevenueAccountCode(String value) {
            this.financialRevenueAccountCode = value;
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
     *         &lt;element name="leaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="leaIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "leaId",
        "leaIdSystem",
        "name",
        "organizationType"
    })
    public static class Identification {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String leaIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String organizationType;

        /**
         * Gets the value of the leaId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeaId() {
            return leaId;
        }

        /**
         * Sets the value of the leaId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeaId(String value) {
            this.leaId = value;
        }

        /**
         * Gets the value of the leaIdSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLeaIdSystem() {
            return leaIdSystem;
        }

        /**
         * Sets the value of the leaIdSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLeaIdSystem(String value) {
            this.leaIdSystem = value;
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
        protected List<LeaCEDSType.PhoneNumberList.PhoneNumber> phoneNumber;

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
         * {@link LeaCEDSType.PhoneNumberList.PhoneNumber }
         * 
         * 
         */
        public List<LeaCEDSType.PhoneNumberList.PhoneNumber> getPhoneNumber() {
            if (phoneNumber == null) {
                phoneNumber = new ArrayList<LeaCEDSType.PhoneNumberList.PhoneNumber>();
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
     *         &lt;element name="barrierToEducatingHomeless" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="desegregationPlan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="harassmentOrBullyingPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="integratedTechnologyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reapAlternativeFundingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="administrationFunding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="standardsFunding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="terminatedTitleIIIProgramsDueToFailure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="interscholasticSportsMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="interscholasticSportsFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="interscholasticTeamsMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="interscholasticTeamsFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="interscholasticSportParticipantsMale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="interscholasticSportParticipantsFemale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "barrierToEducatingHomeless",
        "desegregationPlan",
        "harassmentOrBullyingPolicy",
        "integratedTechnologyStatus",
        "reapAlternativeFundingStatus",
        "administrationFunding",
        "standardsFunding",
        "terminatedTitleIIIProgramsDueToFailure",
        "interscholasticSportsMale",
        "interscholasticSportsFemale",
        "interscholasticTeamsMale",
        "interscholasticTeamsFemale",
        "interscholasticSportParticipantsMale",
        "interscholasticSportParticipantsFemale"
    })
    public static class ProgramFederalReporting {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String barrierToEducatingHomeless;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String desegregationPlan;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String harassmentOrBullyingPolicy;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String integratedTechnologyStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String reapAlternativeFundingStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String administrationFunding;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String standardsFunding;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String terminatedTitleIIIProgramsDueToFailure;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String interscholasticSportsMale;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String interscholasticSportsFemale;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String interscholasticTeamsMale;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String interscholasticTeamsFemale;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String interscholasticSportParticipantsMale;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String interscholasticSportParticipantsFemale;

        /**
         * Gets the value of the barrierToEducatingHomeless property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBarrierToEducatingHomeless() {
            return barrierToEducatingHomeless;
        }

        /**
         * Sets the value of the barrierToEducatingHomeless property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBarrierToEducatingHomeless(String value) {
            this.barrierToEducatingHomeless = value;
        }

        /**
         * Gets the value of the desegregationPlan property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesegregationPlan() {
            return desegregationPlan;
        }

        /**
         * Sets the value of the desegregationPlan property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesegregationPlan(String value) {
            this.desegregationPlan = value;
        }

        /**
         * Gets the value of the harassmentOrBullyingPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHarassmentOrBullyingPolicy() {
            return harassmentOrBullyingPolicy;
        }

        /**
         * Sets the value of the harassmentOrBullyingPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHarassmentOrBullyingPolicy(String value) {
            this.harassmentOrBullyingPolicy = value;
        }

        /**
         * Gets the value of the integratedTechnologyStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIntegratedTechnologyStatus() {
            return integratedTechnologyStatus;
        }

        /**
         * Sets the value of the integratedTechnologyStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIntegratedTechnologyStatus(String value) {
            this.integratedTechnologyStatus = value;
        }

        /**
         * Gets the value of the reapAlternativeFundingStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReapAlternativeFundingStatus() {
            return reapAlternativeFundingStatus;
        }

        /**
         * Sets the value of the reapAlternativeFundingStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReapAlternativeFundingStatus(String value) {
            this.reapAlternativeFundingStatus = value;
        }

        /**
         * Gets the value of the administrationFunding property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdministrationFunding() {
            return administrationFunding;
        }

        /**
         * Sets the value of the administrationFunding property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdministrationFunding(String value) {
            this.administrationFunding = value;
        }

        /**
         * Gets the value of the standardsFunding property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStandardsFunding() {
            return standardsFunding;
        }

        /**
         * Sets the value of the standardsFunding property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStandardsFunding(String value) {
            this.standardsFunding = value;
        }

        /**
         * Gets the value of the terminatedTitleIIIProgramsDueToFailure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerminatedTitleIIIProgramsDueToFailure() {
            return terminatedTitleIIIProgramsDueToFailure;
        }

        /**
         * Sets the value of the terminatedTitleIIIProgramsDueToFailure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerminatedTitleIIIProgramsDueToFailure(String value) {
            this.terminatedTitleIIIProgramsDueToFailure = value;
        }

        /**
         * Gets the value of the interscholasticSportsMale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInterscholasticSportsMale() {
            return interscholasticSportsMale;
        }

        /**
         * Sets the value of the interscholasticSportsMale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInterscholasticSportsMale(String value) {
            this.interscholasticSportsMale = value;
        }

        /**
         * Gets the value of the interscholasticSportsFemale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInterscholasticSportsFemale() {
            return interscholasticSportsFemale;
        }

        /**
         * Sets the value of the interscholasticSportsFemale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInterscholasticSportsFemale(String value) {
            this.interscholasticSportsFemale = value;
        }

        /**
         * Gets the value of the interscholasticTeamsMale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInterscholasticTeamsMale() {
            return interscholasticTeamsMale;
        }

        /**
         * Sets the value of the interscholasticTeamsMale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInterscholasticTeamsMale(String value) {
            this.interscholasticTeamsMale = value;
        }

        /**
         * Gets the value of the interscholasticTeamsFemale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInterscholasticTeamsFemale() {
            return interscholasticTeamsFemale;
        }

        /**
         * Sets the value of the interscholasticTeamsFemale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInterscholasticTeamsFemale(String value) {
            this.interscholasticTeamsFemale = value;
        }

        /**
         * Gets the value of the interscholasticSportParticipantsMale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInterscholasticSportParticipantsMale() {
            return interscholasticSportParticipantsMale;
        }

        /**
         * Sets the value of the interscholasticSportParticipantsMale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInterscholasticSportParticipantsMale(String value) {
            this.interscholasticSportParticipantsMale = value;
        }

        /**
         * Gets the value of the interscholasticSportParticipantsFemale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInterscholasticSportParticipantsFemale() {
            return interscholasticSportParticipantsFemale;
        }

        /**
         * Sets the value of the interscholasticSportParticipantsFemale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInterscholasticSportParticipantsFemale(String value) {
            this.interscholasticSportParticipantsFemale = value;
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
     *         &lt;element name="prekindergartenEligibility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prekindergartenEligibleAgesForNonIDEAStudents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prekindergartenDailyLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="kindergartenDailyLength" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programGiftedEligibilityCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="migrantEducationProgramSessionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="migrantEducationProgramProjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfImmigrantProgramSubgrants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programInMultiplePurposeFacility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleIInstructionalServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleIProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleISupportServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleIIILanguageInstructionProgramType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "prekindergartenEligibility",
        "prekindergartenEligibleAgesForNonIDEAStudents",
        "prekindergartenDailyLength",
        "kindergartenDailyLength",
        "programGiftedEligibilityCriteria",
        "migrantEducationProgramSessionType",
        "migrantEducationProgramProjectType",
        "numberOfImmigrantProgramSubgrants",
        "programInMultiplePurposeFacility",
        "titleIInstructionalServices",
        "titleIProgramType",
        "titleISupportServices",
        "titleIIILanguageInstructionProgramType"
    })
    public static class ProgramsServices {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String prekindergartenEligibility;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String prekindergartenEligibleAgesForNonIDEAStudents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String prekindergartenDailyLength;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String kindergartenDailyLength;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programGiftedEligibilityCriteria;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String migrantEducationProgramSessionType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String migrantEducationProgramProjectType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfImmigrantProgramSubgrants;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programInMultiplePurposeFacility;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleIInstructionalServices;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleIProgramType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleISupportServices;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleIIILanguageInstructionProgramType;

        /**
         * Gets the value of the prekindergartenEligibility property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrekindergartenEligibility() {
            return prekindergartenEligibility;
        }

        /**
         * Sets the value of the prekindergartenEligibility property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrekindergartenEligibility(String value) {
            this.prekindergartenEligibility = value;
        }

        /**
         * Gets the value of the prekindergartenEligibleAgesForNonIDEAStudents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrekindergartenEligibleAgesForNonIDEAStudents() {
            return prekindergartenEligibleAgesForNonIDEAStudents;
        }

        /**
         * Sets the value of the prekindergartenEligibleAgesForNonIDEAStudents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrekindergartenEligibleAgesForNonIDEAStudents(String value) {
            this.prekindergartenEligibleAgesForNonIDEAStudents = value;
        }

        /**
         * Gets the value of the prekindergartenDailyLength property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrekindergartenDailyLength() {
            return prekindergartenDailyLength;
        }

        /**
         * Sets the value of the prekindergartenDailyLength property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrekindergartenDailyLength(String value) {
            this.prekindergartenDailyLength = value;
        }

        /**
         * Gets the value of the kindergartenDailyLength property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getKindergartenDailyLength() {
            return kindergartenDailyLength;
        }

        /**
         * Sets the value of the kindergartenDailyLength property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setKindergartenDailyLength(String value) {
            this.kindergartenDailyLength = value;
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
         * Gets the value of the migrantEducationProgramSessionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMigrantEducationProgramSessionType() {
            return migrantEducationProgramSessionType;
        }

        /**
         * Sets the value of the migrantEducationProgramSessionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMigrantEducationProgramSessionType(String value) {
            this.migrantEducationProgramSessionType = value;
        }

        /**
         * Gets the value of the migrantEducationProgramProjectType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMigrantEducationProgramProjectType() {
            return migrantEducationProgramProjectType;
        }

        /**
         * Sets the value of the migrantEducationProgramProjectType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMigrantEducationProgramProjectType(String value) {
            this.migrantEducationProgramProjectType = value;
        }

        /**
         * Gets the value of the numberOfImmigrantProgramSubgrants property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfImmigrantProgramSubgrants() {
            return numberOfImmigrantProgramSubgrants;
        }

        /**
         * Sets the value of the numberOfImmigrantProgramSubgrants property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfImmigrantProgramSubgrants(String value) {
            this.numberOfImmigrantProgramSubgrants = value;
        }

        /**
         * Gets the value of the programInMultiplePurposeFacility property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramInMultiplePurposeFacility() {
            return programInMultiplePurposeFacility;
        }

        /**
         * Sets the value of the programInMultiplePurposeFacility property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramInMultiplePurposeFacility(String value) {
            this.programInMultiplePurposeFacility = value;
        }

        /**
         * Gets the value of the titleIInstructionalServices property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleIInstructionalServices() {
            return titleIInstructionalServices;
        }

        /**
         * Sets the value of the titleIInstructionalServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleIInstructionalServices(String value) {
            this.titleIInstructionalServices = value;
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
         * Gets the value of the titleISupportServices property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleISupportServices() {
            return titleISupportServices;
        }

        /**
         * Sets the value of the titleISupportServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleISupportServices(String value) {
            this.titleISupportServices = value;
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
     *         &lt;element name="safeAndDrugFreeBaseline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="safeAndDrugFreeBaselineYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="safeAndDrugFreeCollectionFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="safeAndDrugFreeIndicatorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="safeAndDrugFreeInstrument" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="safeAndDrugFreePerformance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="safeAndDrugFreeTarget" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="safeAndDrugFreeYearMostRecentCollection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "safeAndDrugFreeBaseline",
        "safeAndDrugFreeBaselineYear",
        "safeAndDrugFreeCollectionFrequency",
        "safeAndDrugFreeIndicatorName",
        "safeAndDrugFreeInstrument",
        "safeAndDrugFreePerformance",
        "safeAndDrugFreeTarget",
        "safeAndDrugFreeYearMostRecentCollection"
    })
    public static class SafeDrugFree {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String safeAndDrugFreeBaseline;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String safeAndDrugFreeBaselineYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String safeAndDrugFreeCollectionFrequency;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String safeAndDrugFreeIndicatorName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String safeAndDrugFreeInstrument;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String safeAndDrugFreePerformance;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String safeAndDrugFreeTarget;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String safeAndDrugFreeYearMostRecentCollection;

        /**
         * Gets the value of the safeAndDrugFreeBaseline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSafeAndDrugFreeBaseline() {
            return safeAndDrugFreeBaseline;
        }

        /**
         * Sets the value of the safeAndDrugFreeBaseline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSafeAndDrugFreeBaseline(String value) {
            this.safeAndDrugFreeBaseline = value;
        }

        /**
         * Gets the value of the safeAndDrugFreeBaselineYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSafeAndDrugFreeBaselineYear() {
            return safeAndDrugFreeBaselineYear;
        }

        /**
         * Sets the value of the safeAndDrugFreeBaselineYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSafeAndDrugFreeBaselineYear(String value) {
            this.safeAndDrugFreeBaselineYear = value;
        }

        /**
         * Gets the value of the safeAndDrugFreeCollectionFrequency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSafeAndDrugFreeCollectionFrequency() {
            return safeAndDrugFreeCollectionFrequency;
        }

        /**
         * Sets the value of the safeAndDrugFreeCollectionFrequency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSafeAndDrugFreeCollectionFrequency(String value) {
            this.safeAndDrugFreeCollectionFrequency = value;
        }

        /**
         * Gets the value of the safeAndDrugFreeIndicatorName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSafeAndDrugFreeIndicatorName() {
            return safeAndDrugFreeIndicatorName;
        }

        /**
         * Sets the value of the safeAndDrugFreeIndicatorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSafeAndDrugFreeIndicatorName(String value) {
            this.safeAndDrugFreeIndicatorName = value;
        }

        /**
         * Gets the value of the safeAndDrugFreeInstrument property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSafeAndDrugFreeInstrument() {
            return safeAndDrugFreeInstrument;
        }

        /**
         * Sets the value of the safeAndDrugFreeInstrument property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSafeAndDrugFreeInstrument(String value) {
            this.safeAndDrugFreeInstrument = value;
        }

        /**
         * Gets the value of the safeAndDrugFreePerformance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSafeAndDrugFreePerformance() {
            return safeAndDrugFreePerformance;
        }

        /**
         * Sets the value of the safeAndDrugFreePerformance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSafeAndDrugFreePerformance(String value) {
            this.safeAndDrugFreePerformance = value;
        }

        /**
         * Gets the value of the safeAndDrugFreeTarget property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSafeAndDrugFreeTarget() {
            return safeAndDrugFreeTarget;
        }

        /**
         * Sets the value of the safeAndDrugFreeTarget property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSafeAndDrugFreeTarget(String value) {
            this.safeAndDrugFreeTarget = value;
        }

        /**
         * Gets the value of the safeAndDrugFreeYearMostRecentCollection property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSafeAndDrugFreeYearMostRecentCollection() {
            return safeAndDrugFreeYearMostRecentCollection;
        }

        /**
         * Sets the value of the safeAndDrugFreeYearMostRecentCollection property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSafeAndDrugFreeYearMostRecentCollection(String value) {
            this.safeAndDrugFreeYearMostRecentCollection = value;
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
