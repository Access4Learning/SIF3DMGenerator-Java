
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
 * <p>Java class for elOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elOrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="responsibleOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="identifier" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="organizationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="addressStreetNumberAndName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressApartmentRoomOrSuiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressCountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="institutionTelephoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="primaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="licensing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="facilityLicensingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stateLicensedFacilityCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlylearningProgramLicensingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="initialLicenseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="continuingLicenseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="licenseExempt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfEarlylearningFatalities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfEarlylearningInjuries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlylearningProgramLicenseSuspension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlylearningProgramLicenseRevocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="organizationCharacteristics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="operationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="serviceOptionVariation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hoursAvailablePerDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="daysAvailablePerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlyChildhoodSetting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfClassrooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="youngestAgeAuthorized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="oIdestAgeAuthorized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="specialCircumstancesPopulationServed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ersRuralUrbanContinuumCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="qrisRating" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="qrisParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qrisScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qrisAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qrisExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfQRISLevels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="facility" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="facilityProfitStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="monitoring" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numberOfELProgramMonitoringVisits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="monitoringVisitEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="monitoringVisitStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organizationMonitoringNotifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organizationTypeOfMonitoring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="purposeOfMonitoringVisit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="accreditation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="accreditationAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="accreditationAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="accreditationExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organizationSeekingAccreditationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="policies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="administrativePolicyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="personnelPolicyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programTransitionPlanningPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="culturalAndLinguisticDiversity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="programProvidesTranslatedMaterials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="languageTranslationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="healthPromotion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ongoingHealthScreeningPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlylearningProgramDevelopmentalScreeningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="immunizationionPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="referralPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="requiredImmunizationList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="requiredImmunization" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
 *         &lt;element name="inclusion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="specialNeedsPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="organizationInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="earlyChildhoodProgramTypeOffered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlylearningProgramYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fullTimeEmployeeBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="partTimeEmployeeBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="differentialShiftPayIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="elProgramAnnualOperatingWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="parentalFamilyInvolvement" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="programProvidesWrittenHandbook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programCollectsParentalFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programProvidesParentInvolvementOpportunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programProvidesParentEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="parentCommunicationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentSharedWithParents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="compensation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="programFollowsSalaryScale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="professionalDevelopment" minOccurs="0">
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
 *         &lt;element name="siteLevelCharacteristics" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="elProgramList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="elProgram" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="programType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="quality" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="qualityInitiativeMaximumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qualityInitiativeMinimumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qualityInitiativeParticipationEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qualityInitiativeParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qualityInitiativeParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qualityInitiativeScoreLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "elOrganizationType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "name",
    "identifier",
    "addressList",
    "phoneNumberList",
    "licensing",
    "organizationCharacteristics",
    "qrisRating",
    "facility",
    "monitoring",
    "accreditation",
    "policies",
    "culturalAndLinguisticDiversity",
    "healthPromotion",
    "inclusion",
    "organizationInformation",
    "parentalFamilyInvolvement",
    "compensation",
    "professionalDevelopment",
    "siteLevelCharacteristics",
    "elProgramList",
    "quality"
})
public class ElOrganizationType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.Name name;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.Identifier identifier;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.AddressList addressList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.PhoneNumberList phoneNumberList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.Licensing licensing;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.OrganizationCharacteristics organizationCharacteristics;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.QrisRating qrisRating;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.Facility facility;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.Monitoring monitoring;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.Accreditation accreditation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.Policies policies;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.CulturalAndLinguisticDiversity culturalAndLinguisticDiversity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.HealthPromotion healthPromotion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.Inclusion inclusion;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.OrganizationInformation organizationInformation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.ParentalFamilyInvolvement parentalFamilyInvolvement;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.Compensation compensation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.ProfessionalDevelopment professionalDevelopment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.SiteLevelCharacteristics siteLevelCharacteristics;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.ElProgramList elProgramList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElOrganizationType.Quality quality;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.Name }
     *     
     */
    public ElOrganizationType.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.Name }
     *     
     */
    public void setName(ElOrganizationType.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.Identifier }
     *     
     */
    public ElOrganizationType.Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.Identifier }
     *     
     */
    public void setIdentifier(ElOrganizationType.Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the addressList property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.AddressList }
     *     
     */
    public ElOrganizationType.AddressList getAddressList() {
        return addressList;
    }

    /**
     * Sets the value of the addressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.AddressList }
     *     
     */
    public void setAddressList(ElOrganizationType.AddressList value) {
        this.addressList = value;
    }

    /**
     * Gets the value of the phoneNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.PhoneNumberList }
     *     
     */
    public ElOrganizationType.PhoneNumberList getPhoneNumberList() {
        return phoneNumberList;
    }

    /**
     * Sets the value of the phoneNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.PhoneNumberList }
     *     
     */
    public void setPhoneNumberList(ElOrganizationType.PhoneNumberList value) {
        this.phoneNumberList = value;
    }

    /**
     * Gets the value of the licensing property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.Licensing }
     *     
     */
    public ElOrganizationType.Licensing getLicensing() {
        return licensing;
    }

    /**
     * Sets the value of the licensing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.Licensing }
     *     
     */
    public void setLicensing(ElOrganizationType.Licensing value) {
        this.licensing = value;
    }

    /**
     * Gets the value of the organizationCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.OrganizationCharacteristics }
     *     
     */
    public ElOrganizationType.OrganizationCharacteristics getOrganizationCharacteristics() {
        return organizationCharacteristics;
    }

    /**
     * Sets the value of the organizationCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.OrganizationCharacteristics }
     *     
     */
    public void setOrganizationCharacteristics(ElOrganizationType.OrganizationCharacteristics value) {
        this.organizationCharacteristics = value;
    }

    /**
     * Gets the value of the qrisRating property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.QrisRating }
     *     
     */
    public ElOrganizationType.QrisRating getQrisRating() {
        return qrisRating;
    }

    /**
     * Sets the value of the qrisRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.QrisRating }
     *     
     */
    public void setQrisRating(ElOrganizationType.QrisRating value) {
        this.qrisRating = value;
    }

    /**
     * Gets the value of the facility property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.Facility }
     *     
     */
    public ElOrganizationType.Facility getFacility() {
        return facility;
    }

    /**
     * Sets the value of the facility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.Facility }
     *     
     */
    public void setFacility(ElOrganizationType.Facility value) {
        this.facility = value;
    }

    /**
     * Gets the value of the monitoring property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.Monitoring }
     *     
     */
    public ElOrganizationType.Monitoring getMonitoring() {
        return monitoring;
    }

    /**
     * Sets the value of the monitoring property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.Monitoring }
     *     
     */
    public void setMonitoring(ElOrganizationType.Monitoring value) {
        this.monitoring = value;
    }

    /**
     * Gets the value of the accreditation property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.Accreditation }
     *     
     */
    public ElOrganizationType.Accreditation getAccreditation() {
        return accreditation;
    }

    /**
     * Sets the value of the accreditation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.Accreditation }
     *     
     */
    public void setAccreditation(ElOrganizationType.Accreditation value) {
        this.accreditation = value;
    }

    /**
     * Gets the value of the policies property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.Policies }
     *     
     */
    public ElOrganizationType.Policies getPolicies() {
        return policies;
    }

    /**
     * Sets the value of the policies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.Policies }
     *     
     */
    public void setPolicies(ElOrganizationType.Policies value) {
        this.policies = value;
    }

    /**
     * Gets the value of the culturalAndLinguisticDiversity property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.CulturalAndLinguisticDiversity }
     *     
     */
    public ElOrganizationType.CulturalAndLinguisticDiversity getCulturalAndLinguisticDiversity() {
        return culturalAndLinguisticDiversity;
    }

    /**
     * Sets the value of the culturalAndLinguisticDiversity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.CulturalAndLinguisticDiversity }
     *     
     */
    public void setCulturalAndLinguisticDiversity(ElOrganizationType.CulturalAndLinguisticDiversity value) {
        this.culturalAndLinguisticDiversity = value;
    }

    /**
     * Gets the value of the healthPromotion property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.HealthPromotion }
     *     
     */
    public ElOrganizationType.HealthPromotion getHealthPromotion() {
        return healthPromotion;
    }

    /**
     * Sets the value of the healthPromotion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.HealthPromotion }
     *     
     */
    public void setHealthPromotion(ElOrganizationType.HealthPromotion value) {
        this.healthPromotion = value;
    }

    /**
     * Gets the value of the inclusion property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.Inclusion }
     *     
     */
    public ElOrganizationType.Inclusion getInclusion() {
        return inclusion;
    }

    /**
     * Sets the value of the inclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.Inclusion }
     *     
     */
    public void setInclusion(ElOrganizationType.Inclusion value) {
        this.inclusion = value;
    }

    /**
     * Gets the value of the organizationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.OrganizationInformation }
     *     
     */
    public ElOrganizationType.OrganizationInformation getOrganizationInformation() {
        return organizationInformation;
    }

    /**
     * Sets the value of the organizationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.OrganizationInformation }
     *     
     */
    public void setOrganizationInformation(ElOrganizationType.OrganizationInformation value) {
        this.organizationInformation = value;
    }

    /**
     * Gets the value of the parentalFamilyInvolvement property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.ParentalFamilyInvolvement }
     *     
     */
    public ElOrganizationType.ParentalFamilyInvolvement getParentalFamilyInvolvement() {
        return parentalFamilyInvolvement;
    }

    /**
     * Sets the value of the parentalFamilyInvolvement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.ParentalFamilyInvolvement }
     *     
     */
    public void setParentalFamilyInvolvement(ElOrganizationType.ParentalFamilyInvolvement value) {
        this.parentalFamilyInvolvement = value;
    }

    /**
     * Gets the value of the compensation property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.Compensation }
     *     
     */
    public ElOrganizationType.Compensation getCompensation() {
        return compensation;
    }

    /**
     * Sets the value of the compensation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.Compensation }
     *     
     */
    public void setCompensation(ElOrganizationType.Compensation value) {
        this.compensation = value;
    }

    /**
     * Gets the value of the professionalDevelopment property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.ProfessionalDevelopment }
     *     
     */
    public ElOrganizationType.ProfessionalDevelopment getProfessionalDevelopment() {
        return professionalDevelopment;
    }

    /**
     * Sets the value of the professionalDevelopment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.ProfessionalDevelopment }
     *     
     */
    public void setProfessionalDevelopment(ElOrganizationType.ProfessionalDevelopment value) {
        this.professionalDevelopment = value;
    }

    /**
     * Gets the value of the siteLevelCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.SiteLevelCharacteristics }
     *     
     */
    public ElOrganizationType.SiteLevelCharacteristics getSiteLevelCharacteristics() {
        return siteLevelCharacteristics;
    }

    /**
     * Sets the value of the siteLevelCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.SiteLevelCharacteristics }
     *     
     */
    public void setSiteLevelCharacteristics(ElOrganizationType.SiteLevelCharacteristics value) {
        this.siteLevelCharacteristics = value;
    }

    /**
     * Gets the value of the elProgramList property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.ElProgramList }
     *     
     */
    public ElOrganizationType.ElProgramList getElProgramList() {
        return elProgramList;
    }

    /**
     * Sets the value of the elProgramList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.ElProgramList }
     *     
     */
    public void setElProgramList(ElOrganizationType.ElProgramList value) {
        this.elProgramList = value;
    }

    /**
     * Gets the value of the quality property.
     * 
     * @return
     *     possible object is
     *     {@link ElOrganizationType.Quality }
     *     
     */
    public ElOrganizationType.Quality getQuality() {
        return quality;
    }

    /**
     * Sets the value of the quality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElOrganizationType.Quality }
     *     
     */
    public void setQuality(ElOrganizationType.Quality value) {
        this.quality = value;
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
     *         &lt;element name="accreditationAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="accreditationAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="accreditationExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organizationSeekingAccreditationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "accreditationAgency",
        "accreditationAwardDate",
        "accreditationExpirationDate",
        "organizationSeekingAccreditationDate"
    })
    public static class Accreditation {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String accreditationAgency;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String accreditationAwardDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String accreditationExpirationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String organizationSeekingAccreditationDate;

        /**
         * Gets the value of the accreditationAgency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccreditationAgency() {
            return accreditationAgency;
        }

        /**
         * Sets the value of the accreditationAgency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccreditationAgency(String value) {
            this.accreditationAgency = value;
        }

        /**
         * Gets the value of the accreditationAwardDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccreditationAwardDate() {
            return accreditationAwardDate;
        }

        /**
         * Sets the value of the accreditationAwardDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccreditationAwardDate(String value) {
            this.accreditationAwardDate = value;
        }

        /**
         * Gets the value of the accreditationExpirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccreditationExpirationDate() {
            return accreditationExpirationDate;
        }

        /**
         * Sets the value of the accreditationExpirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccreditationExpirationDate(String value) {
            this.accreditationExpirationDate = value;
        }

        /**
         * Gets the value of the organizationSeekingAccreditationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationSeekingAccreditationDate() {
            return organizationSeekingAccreditationDate;
        }

        /**
         * Sets the value of the organizationSeekingAccreditationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationSeekingAccreditationDate(String value) {
            this.organizationSeekingAccreditationDate = value;
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
     *                   &lt;element name="addressStreetNumberAndName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressApartmentRoomOrSuiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressCountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected List<ElOrganizationType.AddressList.Address> address;

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
         * {@link ElOrganizationType.AddressList.Address }
         * 
         * 
         */
        public List<ElOrganizationType.AddressList.Address> getAddress() {
            if (address == null) {
                address = new ArrayList<ElOrganizationType.AddressList.Address>();
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
         *         &lt;element name="addressStreetNumberAndName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressApartmentRoomOrSuiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressCountyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "addressStreetNumberAndName",
            "addressApartmentRoomOrSuiteNumber",
            "addressCity",
            "stateAbbreviation",
            "addressPostalCode",
            "addressCountyName",
            "countyANSICode"
        })
        public static class Address {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String addressStreetNumberAndName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String addressApartmentRoomOrSuiteNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String addressCity;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String stateAbbreviation;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String addressPostalCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String addressCountyName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String countyANSICode;
            @XmlAttribute(name = "addressType")
            protected String addressType;

            /**
             * Gets the value of the addressStreetNumberAndName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressStreetNumberAndName() {
                return addressStreetNumberAndName;
            }

            /**
             * Sets the value of the addressStreetNumberAndName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressStreetNumberAndName(String value) {
                this.addressStreetNumberAndName = value;
            }

            /**
             * Gets the value of the addressApartmentRoomOrSuiteNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressApartmentRoomOrSuiteNumber() {
                return addressApartmentRoomOrSuiteNumber;
            }

            /**
             * Sets the value of the addressApartmentRoomOrSuiteNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressApartmentRoomOrSuiteNumber(String value) {
                this.addressApartmentRoomOrSuiteNumber = value;
            }

            /**
             * Gets the value of the addressCity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressCity() {
                return addressCity;
            }

            /**
             * Sets the value of the addressCity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressCity(String value) {
                this.addressCity = value;
            }

            /**
             * Gets the value of the stateAbbreviation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStateAbbreviation() {
                return stateAbbreviation;
            }

            /**
             * Sets the value of the stateAbbreviation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStateAbbreviation(String value) {
                this.stateAbbreviation = value;
            }

            /**
             * Gets the value of the addressPostalCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressPostalCode() {
                return addressPostalCode;
            }

            /**
             * Sets the value of the addressPostalCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressPostalCode(String value) {
                this.addressPostalCode = value;
            }

            /**
             * Gets the value of the addressCountyName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressCountyName() {
                return addressCountyName;
            }

            /**
             * Sets the value of the addressCountyName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressCountyName(String value) {
                this.addressCountyName = value;
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
     *         &lt;element name="programFollowsSalaryScale" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "programFollowsSalaryScale"
    })
    public static class Compensation {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programFollowsSalaryScale;

        /**
         * Gets the value of the programFollowsSalaryScale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramFollowsSalaryScale() {
            return programFollowsSalaryScale;
        }

        /**
         * Sets the value of the programFollowsSalaryScale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramFollowsSalaryScale(String value) {
            this.programFollowsSalaryScale = value;
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
     *         &lt;element name="programProvidesTranslatedMaterials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="languageTranslationPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "programProvidesTranslatedMaterials",
        "languageTranslationPolicy"
    })
    public static class CulturalAndLinguisticDiversity {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programProvidesTranslatedMaterials;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String languageTranslationPolicy;

        /**
         * Gets the value of the programProvidesTranslatedMaterials property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramProvidesTranslatedMaterials() {
            return programProvidesTranslatedMaterials;
        }

        /**
         * Sets the value of the programProvidesTranslatedMaterials property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramProvidesTranslatedMaterials(String value) {
            this.programProvidesTranslatedMaterials = value;
        }

        /**
         * Gets the value of the languageTranslationPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguageTranslationPolicy() {
            return languageTranslationPolicy;
        }

        /**
         * Sets the value of the languageTranslationPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguageTranslationPolicy(String value) {
            this.languageTranslationPolicy = value;
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
     *         &lt;element name="elProgram" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="programType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "elProgram"
    })
    public static class ElProgramList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<ElOrganizationType.ElProgramList.ElProgram> elProgram;

        /**
         * Gets the value of the elProgram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the elProgram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElProgram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ElOrganizationType.ElProgramList.ElProgram }
         * 
         * 
         */
        public List<ElOrganizationType.ElProgramList.ElProgram> getElProgram() {
            if (elProgram == null) {
                elProgram = new ArrayList<ElOrganizationType.ElProgramList.ElProgram>();
            }
            return this.elProgram;
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
         *         &lt;element name="programType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "programType"
        })
        public static class ElProgram {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String programType;

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
     *         &lt;element name="facilityProfitStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "facilityProfitStatus"
    })
    public static class Facility {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String facilityProfitStatus;

        /**
         * Gets the value of the facilityProfitStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacilityProfitStatus() {
            return facilityProfitStatus;
        }

        /**
         * Sets the value of the facilityProfitStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacilityProfitStatus(String value) {
            this.facilityProfitStatus = value;
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
     *         &lt;element name="ongoingHealthScreeningPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlylearningProgramDevelopmentalScreeningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="immunizationionPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="referralPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="requiredImmunizationList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="requiredImmunization" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "ongoingHealthScreeningPolicy",
        "earlylearningProgramDevelopmentalScreeningStatus",
        "immunizationionPolicy",
        "referralPolicy",
        "requiredImmunizationList"
    })
    public static class HealthPromotion {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ongoingHealthScreeningPolicy;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlylearningProgramDevelopmentalScreeningStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String immunizationionPolicy;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String referralPolicy;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElOrganizationType.HealthPromotion.RequiredImmunizationList requiredImmunizationList;

        /**
         * Gets the value of the ongoingHealthScreeningPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOngoingHealthScreeningPolicy() {
            return ongoingHealthScreeningPolicy;
        }

        /**
         * Sets the value of the ongoingHealthScreeningPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOngoingHealthScreeningPolicy(String value) {
            this.ongoingHealthScreeningPolicy = value;
        }

        /**
         * Gets the value of the earlylearningProgramDevelopmentalScreeningStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlylearningProgramDevelopmentalScreeningStatus() {
            return earlylearningProgramDevelopmentalScreeningStatus;
        }

        /**
         * Sets the value of the earlylearningProgramDevelopmentalScreeningStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlylearningProgramDevelopmentalScreeningStatus(String value) {
            this.earlylearningProgramDevelopmentalScreeningStatus = value;
        }

        /**
         * Gets the value of the immunizationionPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImmunizationionPolicy() {
            return immunizationionPolicy;
        }

        /**
         * Sets the value of the immunizationionPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImmunizationionPolicy(String value) {
            this.immunizationionPolicy = value;
        }

        /**
         * Gets the value of the referralPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferralPolicy() {
            return referralPolicy;
        }

        /**
         * Sets the value of the referralPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferralPolicy(String value) {
            this.referralPolicy = value;
        }

        /**
         * Gets the value of the requiredImmunizationList property.
         * 
         * @return
         *     possible object is
         *     {@link ElOrganizationType.HealthPromotion.RequiredImmunizationList }
         *     
         */
        public ElOrganizationType.HealthPromotion.RequiredImmunizationList getRequiredImmunizationList() {
            return requiredImmunizationList;
        }

        /**
         * Sets the value of the requiredImmunizationList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElOrganizationType.HealthPromotion.RequiredImmunizationList }
         *     
         */
        public void setRequiredImmunizationList(ElOrganizationType.HealthPromotion.RequiredImmunizationList value) {
            this.requiredImmunizationList = value;
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
         *         &lt;element name="requiredImmunization" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
            "requiredImmunization"
        })
        public static class RequiredImmunizationList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<String> requiredImmunization;

            /**
             * Gets the value of the requiredImmunization property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the requiredImmunization property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRequiredImmunization().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getRequiredImmunization() {
                if (requiredImmunization == null) {
                    requiredImmunization = new ArrayList<String>();
                }
                return this.requiredImmunization;
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
     *         &lt;element name="organizationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organizationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "organizationSystem",
        "organizationId",
        "organizationType"
    })
    public static class Identifier {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String organizationSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String organizationId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String organizationType;

        /**
         * Gets the value of the organizationSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationSystem() {
            return organizationSystem;
        }

        /**
         * Sets the value of the organizationSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationSystem(String value) {
            this.organizationSystem = value;
        }

        /**
         * Gets the value of the organizationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationId() {
            return organizationId;
        }

        /**
         * Sets the value of the organizationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationId(String value) {
            this.organizationId = value;
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
     *         &lt;element name="specialNeedsPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "specialNeedsPolicy"
    })
    public static class Inclusion {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String specialNeedsPolicy;

        /**
         * Gets the value of the specialNeedsPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialNeedsPolicy() {
            return specialNeedsPolicy;
        }

        /**
         * Sets the value of the specialNeedsPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialNeedsPolicy(String value) {
            this.specialNeedsPolicy = value;
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
     *         &lt;element name="facilityLicensingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stateLicensedFacilityCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlylearningProgramLicensingStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="initialLicenseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="continuingLicenseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="licenseExempt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfEarlylearningFatalities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfEarlylearningInjuries" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlylearningProgramLicenseSuspension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlylearningProgramLicenseRevocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "facilityLicensingStatus",
        "stateLicensedFacilityCapacity",
        "earlylearningProgramLicensingStatus",
        "initialLicenseDate",
        "continuingLicenseDate",
        "licenseExempt",
        "numberOfEarlylearningFatalities",
        "numberOfEarlylearningInjuries",
        "earlylearningProgramLicenseSuspension",
        "earlylearningProgramLicenseRevocation"
    })
    public static class Licensing {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String facilityLicensingStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String stateLicensedFacilityCapacity;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlylearningProgramLicensingStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String initialLicenseDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String continuingLicenseDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String licenseExempt;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfEarlylearningFatalities;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfEarlylearningInjuries;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlylearningProgramLicenseSuspension;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlylearningProgramLicenseRevocation;

        /**
         * Gets the value of the facilityLicensingStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacilityLicensingStatus() {
            return facilityLicensingStatus;
        }

        /**
         * Sets the value of the facilityLicensingStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacilityLicensingStatus(String value) {
            this.facilityLicensingStatus = value;
        }

        /**
         * Gets the value of the stateLicensedFacilityCapacity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateLicensedFacilityCapacity() {
            return stateLicensedFacilityCapacity;
        }

        /**
         * Sets the value of the stateLicensedFacilityCapacity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateLicensedFacilityCapacity(String value) {
            this.stateLicensedFacilityCapacity = value;
        }

        /**
         * Gets the value of the earlylearningProgramLicensingStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlylearningProgramLicensingStatus() {
            return earlylearningProgramLicensingStatus;
        }

        /**
         * Sets the value of the earlylearningProgramLicensingStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlylearningProgramLicensingStatus(String value) {
            this.earlylearningProgramLicensingStatus = value;
        }

        /**
         * Gets the value of the initialLicenseDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitialLicenseDate() {
            return initialLicenseDate;
        }

        /**
         * Sets the value of the initialLicenseDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitialLicenseDate(String value) {
            this.initialLicenseDate = value;
        }

        /**
         * Gets the value of the continuingLicenseDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContinuingLicenseDate() {
            return continuingLicenseDate;
        }

        /**
         * Sets the value of the continuingLicenseDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContinuingLicenseDate(String value) {
            this.continuingLicenseDate = value;
        }

        /**
         * Gets the value of the licenseExempt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLicenseExempt() {
            return licenseExempt;
        }

        /**
         * Sets the value of the licenseExempt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLicenseExempt(String value) {
            this.licenseExempt = value;
        }

        /**
         * Gets the value of the numberOfEarlylearningFatalities property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfEarlylearningFatalities() {
            return numberOfEarlylearningFatalities;
        }

        /**
         * Sets the value of the numberOfEarlylearningFatalities property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfEarlylearningFatalities(String value) {
            this.numberOfEarlylearningFatalities = value;
        }

        /**
         * Gets the value of the numberOfEarlylearningInjuries property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfEarlylearningInjuries() {
            return numberOfEarlylearningInjuries;
        }

        /**
         * Sets the value of the numberOfEarlylearningInjuries property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfEarlylearningInjuries(String value) {
            this.numberOfEarlylearningInjuries = value;
        }

        /**
         * Gets the value of the earlylearningProgramLicenseSuspension property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlylearningProgramLicenseSuspension() {
            return earlylearningProgramLicenseSuspension;
        }

        /**
         * Sets the value of the earlylearningProgramLicenseSuspension property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlylearningProgramLicenseSuspension(String value) {
            this.earlylearningProgramLicenseSuspension = value;
        }

        /**
         * Gets the value of the earlylearningProgramLicenseRevocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlylearningProgramLicenseRevocation() {
            return earlylearningProgramLicenseRevocation;
        }

        /**
         * Sets the value of the earlylearningProgramLicenseRevocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlylearningProgramLicenseRevocation(String value) {
            this.earlylearningProgramLicenseRevocation = value;
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
     *         &lt;element name="numberOfELProgramMonitoringVisits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="monitoringVisitEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="monitoringVisitStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organizationMonitoringNotifications" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organizationTypeOfMonitoring" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="purposeOfMonitoringVisit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "numberOfELProgramMonitoringVisits",
        "monitoringVisitEndDate",
        "monitoringVisitStartDate",
        "organizationMonitoringNotifications",
        "organizationTypeOfMonitoring",
        "purposeOfMonitoringVisit"
    })
    public static class Monitoring {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfELProgramMonitoringVisits;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String monitoringVisitEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String monitoringVisitStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String organizationMonitoringNotifications;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String organizationTypeOfMonitoring;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String purposeOfMonitoringVisit;

        /**
         * Gets the value of the numberOfELProgramMonitoringVisits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfELProgramMonitoringVisits() {
            return numberOfELProgramMonitoringVisits;
        }

        /**
         * Sets the value of the numberOfELProgramMonitoringVisits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfELProgramMonitoringVisits(String value) {
            this.numberOfELProgramMonitoringVisits = value;
        }

        /**
         * Gets the value of the monitoringVisitEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMonitoringVisitEndDate() {
            return monitoringVisitEndDate;
        }

        /**
         * Sets the value of the monitoringVisitEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMonitoringVisitEndDate(String value) {
            this.monitoringVisitEndDate = value;
        }

        /**
         * Gets the value of the monitoringVisitStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMonitoringVisitStartDate() {
            return monitoringVisitStartDate;
        }

        /**
         * Sets the value of the monitoringVisitStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMonitoringVisitStartDate(String value) {
            this.monitoringVisitStartDate = value;
        }

        /**
         * Gets the value of the organizationMonitoringNotifications property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationMonitoringNotifications() {
            return organizationMonitoringNotifications;
        }

        /**
         * Sets the value of the organizationMonitoringNotifications property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationMonitoringNotifications(String value) {
            this.organizationMonitoringNotifications = value;
        }

        /**
         * Gets the value of the organizationTypeOfMonitoring property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationTypeOfMonitoring() {
            return organizationTypeOfMonitoring;
        }

        /**
         * Sets the value of the organizationTypeOfMonitoring property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationTypeOfMonitoring(String value) {
            this.organizationTypeOfMonitoring = value;
        }

        /**
         * Gets the value of the purposeOfMonitoringVisit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPurposeOfMonitoringVisit() {
            return purposeOfMonitoringVisit;
        }

        /**
         * Sets the value of the purposeOfMonitoringVisit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPurposeOfMonitoringVisit(String value) {
            this.purposeOfMonitoringVisit = value;
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
     *         &lt;element name="responsibleOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "responsibleOrganizationName"
    })
    public static class Name {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String responsibleOrganizationName;

        /**
         * Gets the value of the responsibleOrganizationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponsibleOrganizationName() {
            return responsibleOrganizationName;
        }

        /**
         * Sets the value of the responsibleOrganizationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponsibleOrganizationName(String value) {
            this.responsibleOrganizationName = value;
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
     *         &lt;element name="operationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="serviceOptionVariation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hoursAvailablePerDay" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="daysAvailablePerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlyChildhoodSetting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfClassrooms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="youngestAgeAuthorized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="oIdestAgeAuthorized" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="specialCircumstancesPopulationServed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ersRuralUrbanContinuumCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "operationDate",
        "serviceOptionVariation",
        "hoursAvailablePerDay",
        "daysAvailablePerWeek",
        "earlyChildhoodSetting",
        "numberOfClassrooms",
        "youngestAgeAuthorized",
        "oIdestAgeAuthorized",
        "specialCircumstancesPopulationServed",
        "ersRuralUrbanContinuumCode"
    })
    public static class OrganizationCharacteristics {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String operationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String serviceOptionVariation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hoursAvailablePerDay;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String daysAvailablePerWeek;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyChildhoodSetting;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfClassrooms;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String youngestAgeAuthorized;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String oIdestAgeAuthorized;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String specialCircumstancesPopulationServed;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ersRuralUrbanContinuumCode;

        /**
         * Gets the value of the operationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationDate() {
            return operationDate;
        }

        /**
         * Sets the value of the operationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationDate(String value) {
            this.operationDate = value;
        }

        /**
         * Gets the value of the serviceOptionVariation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceOptionVariation() {
            return serviceOptionVariation;
        }

        /**
         * Sets the value of the serviceOptionVariation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceOptionVariation(String value) {
            this.serviceOptionVariation = value;
        }

        /**
         * Gets the value of the hoursAvailablePerDay property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoursAvailablePerDay() {
            return hoursAvailablePerDay;
        }

        /**
         * Sets the value of the hoursAvailablePerDay property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoursAvailablePerDay(String value) {
            this.hoursAvailablePerDay = value;
        }

        /**
         * Gets the value of the daysAvailablePerWeek property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDaysAvailablePerWeek() {
            return daysAvailablePerWeek;
        }

        /**
         * Sets the value of the daysAvailablePerWeek property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDaysAvailablePerWeek(String value) {
            this.daysAvailablePerWeek = value;
        }

        /**
         * Gets the value of the earlyChildhoodSetting property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyChildhoodSetting() {
            return earlyChildhoodSetting;
        }

        /**
         * Sets the value of the earlyChildhoodSetting property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyChildhoodSetting(String value) {
            this.earlyChildhoodSetting = value;
        }

        /**
         * Gets the value of the numberOfClassrooms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfClassrooms() {
            return numberOfClassrooms;
        }

        /**
         * Sets the value of the numberOfClassrooms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfClassrooms(String value) {
            this.numberOfClassrooms = value;
        }

        /**
         * Gets the value of the youngestAgeAuthorized property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getYoungestAgeAuthorized() {
            return youngestAgeAuthorized;
        }

        /**
         * Sets the value of the youngestAgeAuthorized property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setYoungestAgeAuthorized(String value) {
            this.youngestAgeAuthorized = value;
        }

        /**
         * Gets the value of the oIdestAgeAuthorized property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOIdestAgeAuthorized() {
            return oIdestAgeAuthorized;
        }

        /**
         * Sets the value of the oIdestAgeAuthorized property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOIdestAgeAuthorized(String value) {
            this.oIdestAgeAuthorized = value;
        }

        /**
         * Gets the value of the specialCircumstancesPopulationServed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialCircumstancesPopulationServed() {
            return specialCircumstancesPopulationServed;
        }

        /**
         * Sets the value of the specialCircumstancesPopulationServed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialCircumstancesPopulationServed(String value) {
            this.specialCircumstancesPopulationServed = value;
        }

        /**
         * Gets the value of the ersRuralUrbanContinuumCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getErsRuralUrbanContinuumCode() {
            return ersRuralUrbanContinuumCode;
        }

        /**
         * Sets the value of the ersRuralUrbanContinuumCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setErsRuralUrbanContinuumCode(String value) {
            this.ersRuralUrbanContinuumCode = value;
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
     *         &lt;element name="earlyChildhoodProgramTypeOffered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlylearningProgramYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fullTimeEmployeeBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="partTimeEmployeeBenefits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="differentialShiftPayIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="elProgramAnnualOperatingWeeks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "earlyChildhoodProgramTypeOffered",
        "earlylearningProgramYear",
        "sessionStartTime",
        "sessionEndTime",
        "fullTimeEmployeeBenefits",
        "partTimeEmployeeBenefits",
        "differentialShiftPayIndicator",
        "elProgramAnnualOperatingWeeks"
    })
    public static class OrganizationInformation {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyChildhoodProgramTypeOffered;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlylearningProgramYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sessionStartTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sessionEndTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String fullTimeEmployeeBenefits;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String partTimeEmployeeBenefits;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String differentialShiftPayIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String elProgramAnnualOperatingWeeks;

        /**
         * Gets the value of the earlyChildhoodProgramTypeOffered property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyChildhoodProgramTypeOffered() {
            return earlyChildhoodProgramTypeOffered;
        }

        /**
         * Sets the value of the earlyChildhoodProgramTypeOffered property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyChildhoodProgramTypeOffered(String value) {
            this.earlyChildhoodProgramTypeOffered = value;
        }

        /**
         * Gets the value of the earlylearningProgramYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlylearningProgramYear() {
            return earlylearningProgramYear;
        }

        /**
         * Sets the value of the earlylearningProgramYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlylearningProgramYear(String value) {
            this.earlylearningProgramYear = value;
        }

        /**
         * Gets the value of the sessionStartTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionStartTime() {
            return sessionStartTime;
        }

        /**
         * Sets the value of the sessionStartTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionStartTime(String value) {
            this.sessionStartTime = value;
        }

        /**
         * Gets the value of the sessionEndTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionEndTime() {
            return sessionEndTime;
        }

        /**
         * Sets the value of the sessionEndTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionEndTime(String value) {
            this.sessionEndTime = value;
        }

        /**
         * Gets the value of the fullTimeEmployeeBenefits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFullTimeEmployeeBenefits() {
            return fullTimeEmployeeBenefits;
        }

        /**
         * Sets the value of the fullTimeEmployeeBenefits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFullTimeEmployeeBenefits(String value) {
            this.fullTimeEmployeeBenefits = value;
        }

        /**
         * Gets the value of the partTimeEmployeeBenefits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartTimeEmployeeBenefits() {
            return partTimeEmployeeBenefits;
        }

        /**
         * Sets the value of the partTimeEmployeeBenefits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartTimeEmployeeBenefits(String value) {
            this.partTimeEmployeeBenefits = value;
        }

        /**
         * Gets the value of the differentialShiftPayIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDifferentialShiftPayIndicator() {
            return differentialShiftPayIndicator;
        }

        /**
         * Sets the value of the differentialShiftPayIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDifferentialShiftPayIndicator(String value) {
            this.differentialShiftPayIndicator = value;
        }

        /**
         * Gets the value of the elProgramAnnualOperatingWeeks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getElProgramAnnualOperatingWeeks() {
            return elProgramAnnualOperatingWeeks;
        }

        /**
         * Sets the value of the elProgramAnnualOperatingWeeks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setElProgramAnnualOperatingWeeks(String value) {
            this.elProgramAnnualOperatingWeeks = value;
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
     *         &lt;element name="programProvidesWrittenHandbook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programCollectsParentalFeedback" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programProvidesParentInvolvementOpportunity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programProvidesParentEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="parentCommunicationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentSharedWithParents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "programProvidesWrittenHandbook",
        "programCollectsParentalFeedback",
        "programProvidesParentInvolvementOpportunity",
        "programProvidesParentEducation",
        "parentCommunicationMethod",
        "assessmentSharedWithParents"
    })
    public static class ParentalFamilyInvolvement {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programProvidesWrittenHandbook;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programCollectsParentalFeedback;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programProvidesParentInvolvementOpportunity;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programProvidesParentEducation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String parentCommunicationMethod;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentSharedWithParents;

        /**
         * Gets the value of the programProvidesWrittenHandbook property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramProvidesWrittenHandbook() {
            return programProvidesWrittenHandbook;
        }

        /**
         * Sets the value of the programProvidesWrittenHandbook property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramProvidesWrittenHandbook(String value) {
            this.programProvidesWrittenHandbook = value;
        }

        /**
         * Gets the value of the programCollectsParentalFeedback property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramCollectsParentalFeedback() {
            return programCollectsParentalFeedback;
        }

        /**
         * Sets the value of the programCollectsParentalFeedback property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramCollectsParentalFeedback(String value) {
            this.programCollectsParentalFeedback = value;
        }

        /**
         * Gets the value of the programProvidesParentInvolvementOpportunity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramProvidesParentInvolvementOpportunity() {
            return programProvidesParentInvolvementOpportunity;
        }

        /**
         * Sets the value of the programProvidesParentInvolvementOpportunity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramProvidesParentInvolvementOpportunity(String value) {
            this.programProvidesParentInvolvementOpportunity = value;
        }

        /**
         * Gets the value of the programProvidesParentEducation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramProvidesParentEducation() {
            return programProvidesParentEducation;
        }

        /**
         * Sets the value of the programProvidesParentEducation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramProvidesParentEducation(String value) {
            this.programProvidesParentEducation = value;
        }

        /**
         * Gets the value of the parentCommunicationMethod property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentCommunicationMethod() {
            return parentCommunicationMethod;
        }

        /**
         * Sets the value of the parentCommunicationMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentCommunicationMethod(String value) {
            this.parentCommunicationMethod = value;
        }

        /**
         * Gets the value of the assessmentSharedWithParents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentSharedWithParents() {
            return assessmentSharedWithParents;
        }

        /**
         * Sets the value of the assessmentSharedWithParents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentSharedWithParents(String value) {
            this.assessmentSharedWithParents = value;
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
     *                   &lt;element name="institutionTelephoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="primaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "phoneNumber"
    })
    public static class PhoneNumberList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<ElOrganizationType.PhoneNumberList.PhoneNumber> phoneNumber;

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
         * {@link ElOrganizationType.PhoneNumberList.PhoneNumber }
         * 
         * 
         */
        public List<ElOrganizationType.PhoneNumberList.PhoneNumber> getPhoneNumber() {
            if (phoneNumber == null) {
                phoneNumber = new ArrayList<ElOrganizationType.PhoneNumberList.PhoneNumber>();
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
         *         &lt;element name="institutionTelephoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="primaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "institutionTelephoneNumberType",
            "primaryTelephoneNumberIndicator",
            "telephoneNumber"
        })
        public static class PhoneNumber {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String institutionTelephoneNumberType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String primaryTelephoneNumberIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String telephoneNumber;

            /**
             * Gets the value of the institutionTelephoneNumberType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInstitutionTelephoneNumberType() {
                return institutionTelephoneNumberType;
            }

            /**
             * Sets the value of the institutionTelephoneNumberType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInstitutionTelephoneNumberType(String value) {
                this.institutionTelephoneNumberType = value;
            }

            /**
             * Gets the value of the primaryTelephoneNumberIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrimaryTelephoneNumberIndicator() {
                return primaryTelephoneNumberIndicator;
            }

            /**
             * Sets the value of the primaryTelephoneNumberIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrimaryTelephoneNumberIndicator(String value) {
                this.primaryTelephoneNumberIndicator = value;
            }

            /**
             * Gets the value of the telephoneNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephoneNumber() {
                return telephoneNumber;
            }

            /**
             * Sets the value of the telephoneNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephoneNumber(String value) {
                this.telephoneNumber = value;
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
     *         &lt;element name="administrativePolicyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="personnelPolicyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programTransitionPlanningPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "administrativePolicyType",
        "personnelPolicyType",
        "programTransitionPlanningPolicy"
    })
    public static class Policies {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String administrativePolicyType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String personnelPolicyType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programTransitionPlanningPolicy;

        /**
         * Gets the value of the administrativePolicyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdministrativePolicyType() {
            return administrativePolicyType;
        }

        /**
         * Sets the value of the administrativePolicyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdministrativePolicyType(String value) {
            this.administrativePolicyType = value;
        }

        /**
         * Gets the value of the personnelPolicyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersonnelPolicyType() {
            return personnelPolicyType;
        }

        /**
         * Sets the value of the personnelPolicyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersonnelPolicyType(String value) {
            this.personnelPolicyType = value;
        }

        /**
         * Gets the value of the programTransitionPlanningPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramTransitionPlanningPolicy() {
            return programTransitionPlanningPolicy;
        }

        /**
         * Sets the value of the programTransitionPlanningPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramTransitionPlanningPolicy(String value) {
            this.programTransitionPlanningPolicy = value;
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
    public static class ProfessionalDevelopment {

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
     *         &lt;element name="qrisParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qrisScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qrisAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qrisExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfQRISLevels" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "qrisParticipation",
        "qrisScore",
        "qrisAwardDate",
        "qrisExpirationDate",
        "numberOfQRISLevels"
    })
    public static class QrisRating {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qrisParticipation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qrisScore;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qrisAwardDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qrisExpirationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfQRISLevels;

        /**
         * Gets the value of the qrisParticipation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQrisParticipation() {
            return qrisParticipation;
        }

        /**
         * Sets the value of the qrisParticipation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQrisParticipation(String value) {
            this.qrisParticipation = value;
        }

        /**
         * Gets the value of the qrisScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQrisScore() {
            return qrisScore;
        }

        /**
         * Sets the value of the qrisScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQrisScore(String value) {
            this.qrisScore = value;
        }

        /**
         * Gets the value of the qrisAwardDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQrisAwardDate() {
            return qrisAwardDate;
        }

        /**
         * Sets the value of the qrisAwardDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQrisAwardDate(String value) {
            this.qrisAwardDate = value;
        }

        /**
         * Gets the value of the qrisExpirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQrisExpirationDate() {
            return qrisExpirationDate;
        }

        /**
         * Sets the value of the qrisExpirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQrisExpirationDate(String value) {
            this.qrisExpirationDate = value;
        }

        /**
         * Gets the value of the numberOfQRISLevels property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfQRISLevels() {
            return numberOfQRISLevels;
        }

        /**
         * Sets the value of the numberOfQRISLevels property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfQRISLevels(String value) {
            this.numberOfQRISLevels = value;
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
     *         &lt;element name="qualityInitiativeMaximumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qualityInitiativeMinimumScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qualityInitiativeParticipationEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qualityInitiativeParticipationIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qualityInitiativeParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qualityInitiativeScoreLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "qualityInitiativeMaximumScore",
        "qualityInitiativeMinimumScore",
        "qualityInitiativeParticipationEndDate",
        "qualityInitiativeParticipationIndicator",
        "qualityInitiativeParticipationStartDate",
        "qualityInitiativeScoreLevel"
    })
    public static class Quality {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qualityInitiativeMaximumScore;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qualityInitiativeMinimumScore;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qualityInitiativeParticipationEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qualityInitiativeParticipationIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qualityInitiativeParticipationStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qualityInitiativeScoreLevel;

        /**
         * Gets the value of the qualityInitiativeMaximumScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityInitiativeMaximumScore() {
            return qualityInitiativeMaximumScore;
        }

        /**
         * Sets the value of the qualityInitiativeMaximumScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityInitiativeMaximumScore(String value) {
            this.qualityInitiativeMaximumScore = value;
        }

        /**
         * Gets the value of the qualityInitiativeMinimumScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityInitiativeMinimumScore() {
            return qualityInitiativeMinimumScore;
        }

        /**
         * Sets the value of the qualityInitiativeMinimumScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityInitiativeMinimumScore(String value) {
            this.qualityInitiativeMinimumScore = value;
        }

        /**
         * Gets the value of the qualityInitiativeParticipationEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityInitiativeParticipationEndDate() {
            return qualityInitiativeParticipationEndDate;
        }

        /**
         * Sets the value of the qualityInitiativeParticipationEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityInitiativeParticipationEndDate(String value) {
            this.qualityInitiativeParticipationEndDate = value;
        }

        /**
         * Gets the value of the qualityInitiativeParticipationIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityInitiativeParticipationIndicator() {
            return qualityInitiativeParticipationIndicator;
        }

        /**
         * Sets the value of the qualityInitiativeParticipationIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityInitiativeParticipationIndicator(String value) {
            this.qualityInitiativeParticipationIndicator = value;
        }

        /**
         * Gets the value of the qualityInitiativeParticipationStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityInitiativeParticipationStartDate() {
            return qualityInitiativeParticipationStartDate;
        }

        /**
         * Sets the value of the qualityInitiativeParticipationStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityInitiativeParticipationStartDate(String value) {
            this.qualityInitiativeParticipationStartDate = value;
        }

        /**
         * Gets the value of the qualityInitiativeScoreLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualityInitiativeScoreLevel() {
            return qualityInitiativeScoreLevel;
        }

        /**
         * Sets the value of the qualityInitiativeScoreLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualityInitiativeScoreLevel(String value) {
            this.qualityInitiativeScoreLevel = value;
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
     *         &lt;element name="siteName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "siteName"
    })
    public static class SiteLevelCharacteristics {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String siteName;

        /**
         * Gets the value of the siteName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSiteName() {
            return siteName;
        }

        /**
         * Sets the value of the siteName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSiteName(String value) {
            this.siteName = value;
        }

    }

}
