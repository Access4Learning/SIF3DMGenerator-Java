
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
 * <p>Java class for elChildType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elChildType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="otherNameList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="identifier" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="elChildId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="elChildIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="idVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="contact" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="addressList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="street" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="line1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="apartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="stateProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="county" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="phoneNumberList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="phoneNumber" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="phoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="phoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="emailList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="email" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="emailType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *         &lt;element name="demographic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="asian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="blackOrAfricanAmerican" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nativeHawaiianOrOtherPacificIslander" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="white" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hispanicOrLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="americanIndianOrAlaskaNative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="homelessnessStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fosterCareEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fosterCareStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="migrantStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="otherRaceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="referral" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="referralDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="referralOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="referralReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="referralSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="referralType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="referredTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="healthInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="allergyReactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="allergySeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="allergyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="healthScreeningEquipmentUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="healthScreeningFollowUpRecommendation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="immunizationList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="immunization" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="visonScreeningList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="visionScreening" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="hearingScreeningList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="hearingScreening" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="dentalScreeningList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dentalScreening" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="insurance" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="insuranceCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dentalInsuranceCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="birth" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="birthWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="gestation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="developmentalAssessment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="developmentalScreeningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="developmentalEvaluationFinding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="primaryDisabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentEarlylearningDevelopmentalDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="assessmentLevelForWhichDesigned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="disabilityConditionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="disabilityDeterminationSourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="eligibility" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="programEligibilityCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programEligibilityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programEligibilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programEligibilityStatusDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaPartB619PotentialEligibilityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="idea" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideaIEPStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaPartB619PotentialEligibilityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaPartCToBSharingNotificationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaPartCToPartBDateOfTransitionConference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaPartCToPartBDateOfTransitionConferenceDecline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaPartCToPartBDateOfTransitionPlanStepsOrServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaPartCToPartBParentNotificationOptOutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaPartCToPartBParentNotificationOptOutIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reasonForDeclinedServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="reasonForDelayOfTransitionConference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="specialEducationExitReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="languageList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="language" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="elEducationalExperienceList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="elEducationalExperience" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ideaEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="enrollmentServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="priorELExperienceList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="priorELExperience" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="serviceExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numberOfDaysInAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="programStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="programExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="foodServiceList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="foodService" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="specialEducationServiceList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="specialEducationService" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="setting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="specialEducationFTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="finance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="earlyLearningFederalFundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlyLearningOtherFederalFundingSources" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="federalProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="services" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="frequencyOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="individualizedProgramPlannedServiceDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="individualizedProgramPlannedServiceFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="individualizedProgramPlannedServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="individualizedProgramPlannedServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="indiviualizedProgramsList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="individualizedProgram" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nonInclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="inclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="transitionPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="programType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="planDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="planMeetingLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="planMeetingParticipantList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="planMeetingParticipant" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="planSigneeList" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="planSignee" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="planSignatureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="planReevaluationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="methodOfServiceDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="childOutcomeSummary" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cosProgressAIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cosProgressBIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cosProgressCIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cosRatingA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cosRatingB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cosRatingC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "elChildType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "identity",
    "contact",
    "demographic",
    "referral",
    "healthInformation",
    "developmentalAssessment",
    "eligibility",
    "idea",
    "languageList",
    "elEducationalExperienceList",
    "finance",
    "services",
    "indiviualizedProgramsList",
    "childOutcomeSummary"
})
public class ElChildType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.Identity identity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.Contact contact;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.Demographic demographic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.Referral referral;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.HealthInformation healthInformation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.DevelopmentalAssessment developmentalAssessment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.Eligibility eligibility;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.Idea idea;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.LanguageList languageList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.ElEducationalExperienceList elEducationalExperienceList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.Finance finance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.Services services;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.IndiviualizedProgramsList indiviualizedProgramsList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElChildType.ChildOutcomeSummary childOutcomeSummary;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.Identity }
     *     
     */
    public ElChildType.Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.Identity }
     *     
     */
    public void setIdentity(ElChildType.Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.Contact }
     *     
     */
    public ElChildType.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.Contact }
     *     
     */
    public void setContact(ElChildType.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the demographic property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.Demographic }
     *     
     */
    public ElChildType.Demographic getDemographic() {
        return demographic;
    }

    /**
     * Sets the value of the demographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.Demographic }
     *     
     */
    public void setDemographic(ElChildType.Demographic value) {
        this.demographic = value;
    }

    /**
     * Gets the value of the referral property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.Referral }
     *     
     */
    public ElChildType.Referral getReferral() {
        return referral;
    }

    /**
     * Sets the value of the referral property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.Referral }
     *     
     */
    public void setReferral(ElChildType.Referral value) {
        this.referral = value;
    }

    /**
     * Gets the value of the healthInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.HealthInformation }
     *     
     */
    public ElChildType.HealthInformation getHealthInformation() {
        return healthInformation;
    }

    /**
     * Sets the value of the healthInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.HealthInformation }
     *     
     */
    public void setHealthInformation(ElChildType.HealthInformation value) {
        this.healthInformation = value;
    }

    /**
     * Gets the value of the developmentalAssessment property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.DevelopmentalAssessment }
     *     
     */
    public ElChildType.DevelopmentalAssessment getDevelopmentalAssessment() {
        return developmentalAssessment;
    }

    /**
     * Sets the value of the developmentalAssessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.DevelopmentalAssessment }
     *     
     */
    public void setDevelopmentalAssessment(ElChildType.DevelopmentalAssessment value) {
        this.developmentalAssessment = value;
    }

    /**
     * Gets the value of the eligibility property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.Eligibility }
     *     
     */
    public ElChildType.Eligibility getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.Eligibility }
     *     
     */
    public void setEligibility(ElChildType.Eligibility value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the idea property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.Idea }
     *     
     */
    public ElChildType.Idea getIdea() {
        return idea;
    }

    /**
     * Sets the value of the idea property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.Idea }
     *     
     */
    public void setIdea(ElChildType.Idea value) {
        this.idea = value;
    }

    /**
     * Gets the value of the languageList property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.LanguageList }
     *     
     */
    public ElChildType.LanguageList getLanguageList() {
        return languageList;
    }

    /**
     * Sets the value of the languageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.LanguageList }
     *     
     */
    public void setLanguageList(ElChildType.LanguageList value) {
        this.languageList = value;
    }

    /**
     * Gets the value of the elEducationalExperienceList property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.ElEducationalExperienceList }
     *     
     */
    public ElChildType.ElEducationalExperienceList getElEducationalExperienceList() {
        return elEducationalExperienceList;
    }

    /**
     * Sets the value of the elEducationalExperienceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.ElEducationalExperienceList }
     *     
     */
    public void setElEducationalExperienceList(ElChildType.ElEducationalExperienceList value) {
        this.elEducationalExperienceList = value;
    }

    /**
     * Gets the value of the finance property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.Finance }
     *     
     */
    public ElChildType.Finance getFinance() {
        return finance;
    }

    /**
     * Sets the value of the finance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.Finance }
     *     
     */
    public void setFinance(ElChildType.Finance value) {
        this.finance = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.Services }
     *     
     */
    public ElChildType.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.Services }
     *     
     */
    public void setServices(ElChildType.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the indiviualizedProgramsList property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.IndiviualizedProgramsList }
     *     
     */
    public ElChildType.IndiviualizedProgramsList getIndiviualizedProgramsList() {
        return indiviualizedProgramsList;
    }

    /**
     * Sets the value of the indiviualizedProgramsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.IndiviualizedProgramsList }
     *     
     */
    public void setIndiviualizedProgramsList(ElChildType.IndiviualizedProgramsList value) {
        this.indiviualizedProgramsList = value;
    }

    /**
     * Gets the value of the childOutcomeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ElChildType.ChildOutcomeSummary }
     *     
     */
    public ElChildType.ChildOutcomeSummary getChildOutcomeSummary() {
        return childOutcomeSummary;
    }

    /**
     * Sets the value of the childOutcomeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElChildType.ChildOutcomeSummary }
     *     
     */
    public void setChildOutcomeSummary(ElChildType.ChildOutcomeSummary value) {
        this.childOutcomeSummary = value;
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
     *         &lt;element name="cosProgressAIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cosProgressBIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cosProgressCIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cosRatingA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cosRatingB" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cosRatingC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "cosProgressAIndicator",
        "cosProgressBIndicator",
        "cosProgressCIndicator",
        "cosRatingA",
        "cosRatingB",
        "cosRatingC"
    })
    public static class ChildOutcomeSummary {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cosProgressAIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cosProgressBIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cosProgressCIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cosRatingA;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cosRatingB;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cosRatingC;

        /**
         * Gets the value of the cosProgressAIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCosProgressAIndicator() {
            return cosProgressAIndicator;
        }

        /**
         * Sets the value of the cosProgressAIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCosProgressAIndicator(String value) {
            this.cosProgressAIndicator = value;
        }

        /**
         * Gets the value of the cosProgressBIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCosProgressBIndicator() {
            return cosProgressBIndicator;
        }

        /**
         * Sets the value of the cosProgressBIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCosProgressBIndicator(String value) {
            this.cosProgressBIndicator = value;
        }

        /**
         * Gets the value of the cosProgressCIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCosProgressCIndicator() {
            return cosProgressCIndicator;
        }

        /**
         * Sets the value of the cosProgressCIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCosProgressCIndicator(String value) {
            this.cosProgressCIndicator = value;
        }

        /**
         * Gets the value of the cosRatingA property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCosRatingA() {
            return cosRatingA;
        }

        /**
         * Sets the value of the cosRatingA property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCosRatingA(String value) {
            this.cosRatingA = value;
        }

        /**
         * Gets the value of the cosRatingB property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCosRatingB() {
            return cosRatingB;
        }

        /**
         * Sets the value of the cosRatingB property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCosRatingB(String value) {
            this.cosRatingB = value;
        }

        /**
         * Gets the value of the cosRatingC property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCosRatingC() {
            return cosRatingC;
        }

        /**
         * Sets the value of the cosRatingC property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCosRatingC(String value) {
            this.cosRatingC = value;
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
     *                             &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="emailList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="email" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="emailType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "addressList",
        "phoneNumberList",
        "emailList"
    })
    public static class Contact {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.Contact.AddressList addressList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.Contact.PhoneNumberList phoneNumberList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.Contact.EmailList emailList;

        /**
         * Gets the value of the addressList property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.Contact.AddressList }
         *     
         */
        public ElChildType.Contact.AddressList getAddressList() {
            return addressList;
        }

        /**
         * Sets the value of the addressList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.Contact.AddressList }
         *     
         */
        public void setAddressList(ElChildType.Contact.AddressList value) {
            this.addressList = value;
        }

        /**
         * Gets the value of the phoneNumberList property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.Contact.PhoneNumberList }
         *     
         */
        public ElChildType.Contact.PhoneNumberList getPhoneNumberList() {
            return phoneNumberList;
        }

        /**
         * Sets the value of the phoneNumberList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.Contact.PhoneNumberList }
         *     
         */
        public void setPhoneNumberList(ElChildType.Contact.PhoneNumberList value) {
            this.phoneNumberList = value;
        }

        /**
         * Gets the value of the emailList property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.Contact.EmailList }
         *     
         */
        public ElChildType.Contact.EmailList getEmailList() {
            return emailList;
        }

        /**
         * Sets the value of the emailList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.Contact.EmailList }
         *     
         */
        public void setEmailList(ElChildType.Contact.EmailList value) {
            this.emailList = value;
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
         *                   &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            protected List<ElChildType.Contact.AddressList.Address> address;

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
             * {@link ElChildType.Contact.AddressList.Address }
             * 
             * 
             */
            public List<ElChildType.Contact.AddressList.Address> getAddress() {
                if (address == null) {
                    address = new ArrayList<ElChildType.Contact.AddressList.Address>();
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
             *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "country"
            })
            public static class Address {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected ElChildType.Contact.AddressList.Address.Street street;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String city;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String stateProvince;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String postalCode;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String county;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String country;
                @XmlAttribute(name = "addressType")
                protected String addressType;

                /**
                 * Gets the value of the street property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ElChildType.Contact.AddressList.Address.Street }
                 *     
                 */
                public ElChildType.Contact.AddressList.Address.Street getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ElChildType.Contact.AddressList.Address.Street }
                 *     
                 */
                public void setStreet(ElChildType.Contact.AddressList.Address.Street value) {
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
                 * Gets the value of the country property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountry() {
                    return country;
                }

                /**
                 * Sets the value of the country property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountry(String value) {
                    this.country = value;
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
         *         &lt;element name="email" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="emailType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "email"
        })
        public static class EmailList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<ElChildType.Contact.EmailList.Email> email;

            /**
             * Gets the value of the email property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the email property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEmail().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ElChildType.Contact.EmailList.Email }
             * 
             * 
             */
            public List<ElChildType.Contact.EmailList.Email> getEmail() {
                if (email == null) {
                    email = new ArrayList<ElChildType.Contact.EmailList.Email>();
                }
                return this.email;
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
             *       &lt;attribute name="emailType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Email {

                @XmlAttribute(name = "emailType", required = true)
                protected String emailType;

                /**
                 * Gets the value of the emailType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmailType() {
                    return emailType;
                }

                /**
                 * Sets the value of the emailType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmailType(String value) {
                    this.emailType = value;
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
            protected List<ElChildType.Contact.PhoneNumberList.PhoneNumber> phoneNumber;

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
             * {@link ElChildType.Contact.PhoneNumberList.PhoneNumber }
             * 
             * 
             */
            public List<ElChildType.Contact.PhoneNumberList.PhoneNumber> getPhoneNumber() {
                if (phoneNumber == null) {
                    phoneNumber = new ArrayList<ElChildType.Contact.PhoneNumberList.PhoneNumber>();
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
     *         &lt;element name="Birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="asian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="blackOrAfricanAmerican" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nativeHawaiianOrOtherPacificIslander" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="white" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hispanicOrLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="americanIndianOrAlaskaNative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="homelessnessStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fosterCareEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fosterCareStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="migrantStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="otherRaceIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "birthdate",
        "sex",
        "asian",
        "blackOrAfricanAmerican",
        "nativeHawaiianOrOtherPacificIslander",
        "white",
        "hispanicOrLatinoEthnicity",
        "americanIndianOrAlaskaNative",
        "homelessnessStatus",
        "fosterCareEndDate",
        "fosterCareStartDate",
        "migrantStatus",
        "otherRaceIndicator"
    })
    public static class Demographic {

        @XmlElement(name = "Birthdate", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String birthdate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sex;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String asian;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String blackOrAfricanAmerican;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String nativeHawaiianOrOtherPacificIslander;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String white;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hispanicOrLatinoEthnicity;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String americanIndianOrAlaskaNative;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String homelessnessStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String fosterCareEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String fosterCareStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String migrantStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String otherRaceIndicator;

        /**
         * Gets the value of the birthdate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBirthdate() {
            return birthdate;
        }

        /**
         * Sets the value of the birthdate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBirthdate(String value) {
            this.birthdate = value;
        }

        /**
         * Gets the value of the sex property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSex() {
            return sex;
        }

        /**
         * Sets the value of the sex property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSex(String value) {
            this.sex = value;
        }

        /**
         * Gets the value of the asian property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAsian() {
            return asian;
        }

        /**
         * Sets the value of the asian property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAsian(String value) {
            this.asian = value;
        }

        /**
         * Gets the value of the blackOrAfricanAmerican property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlackOrAfricanAmerican() {
            return blackOrAfricanAmerican;
        }

        /**
         * Sets the value of the blackOrAfricanAmerican property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlackOrAfricanAmerican(String value) {
            this.blackOrAfricanAmerican = value;
        }

        /**
         * Gets the value of the nativeHawaiianOrOtherPacificIslander property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNativeHawaiianOrOtherPacificIslander() {
            return nativeHawaiianOrOtherPacificIslander;
        }

        /**
         * Sets the value of the nativeHawaiianOrOtherPacificIslander property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNativeHawaiianOrOtherPacificIslander(String value) {
            this.nativeHawaiianOrOtherPacificIslander = value;
        }

        /**
         * Gets the value of the white property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWhite() {
            return white;
        }

        /**
         * Sets the value of the white property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWhite(String value) {
            this.white = value;
        }

        /**
         * Gets the value of the hispanicOrLatinoEthnicity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHispanicOrLatinoEthnicity() {
            return hispanicOrLatinoEthnicity;
        }

        /**
         * Sets the value of the hispanicOrLatinoEthnicity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHispanicOrLatinoEthnicity(String value) {
            this.hispanicOrLatinoEthnicity = value;
        }

        /**
         * Gets the value of the americanIndianOrAlaskaNative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAmericanIndianOrAlaskaNative() {
            return americanIndianOrAlaskaNative;
        }

        /**
         * Sets the value of the americanIndianOrAlaskaNative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmericanIndianOrAlaskaNative(String value) {
            this.americanIndianOrAlaskaNative = value;
        }

        /**
         * Gets the value of the homelessnessStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHomelessnessStatus() {
            return homelessnessStatus;
        }

        /**
         * Sets the value of the homelessnessStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHomelessnessStatus(String value) {
            this.homelessnessStatus = value;
        }

        /**
         * Gets the value of the fosterCareEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFosterCareEndDate() {
            return fosterCareEndDate;
        }

        /**
         * Sets the value of the fosterCareEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFosterCareEndDate(String value) {
            this.fosterCareEndDate = value;
        }

        /**
         * Gets the value of the fosterCareStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFosterCareStartDate() {
            return fosterCareStartDate;
        }

        /**
         * Sets the value of the fosterCareStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFosterCareStartDate(String value) {
            this.fosterCareStartDate = value;
        }

        /**
         * Gets the value of the migrantStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMigrantStatus() {
            return migrantStatus;
        }

        /**
         * Sets the value of the migrantStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMigrantStatus(String value) {
            this.migrantStatus = value;
        }

        /**
         * Gets the value of the otherRaceIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherRaceIndicator() {
            return otherRaceIndicator;
        }

        /**
         * Sets the value of the otherRaceIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherRaceIndicator(String value) {
            this.otherRaceIndicator = value;
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
     *         &lt;element name="developmentalScreeningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="developmentalEvaluationFinding" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="primaryDisabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentEarlylearningDevelopmentalDomain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="assessmentLevelForWhichDesigned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="disabilityConditionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="disabilityDeterminationSourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "developmentalScreeningStatus",
        "developmentalEvaluationFinding",
        "primaryDisabilityType",
        "assessmentEarlylearningDevelopmentalDomain",
        "assessmentLevelForWhichDesigned",
        "disabilityConditionType",
        "disabilityDeterminationSourceType"
    })
    public static class DevelopmentalAssessment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String developmentalScreeningStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String developmentalEvaluationFinding;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String primaryDisabilityType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentEarlylearningDevelopmentalDomain;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentLevelForWhichDesigned;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String disabilityConditionType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String disabilityDeterminationSourceType;

        /**
         * Gets the value of the developmentalScreeningStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDevelopmentalScreeningStatus() {
            return developmentalScreeningStatus;
        }

        /**
         * Sets the value of the developmentalScreeningStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDevelopmentalScreeningStatus(String value) {
            this.developmentalScreeningStatus = value;
        }

        /**
         * Gets the value of the developmentalEvaluationFinding property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDevelopmentalEvaluationFinding() {
            return developmentalEvaluationFinding;
        }

        /**
         * Sets the value of the developmentalEvaluationFinding property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDevelopmentalEvaluationFinding(String value) {
            this.developmentalEvaluationFinding = value;
        }

        /**
         * Gets the value of the primaryDisabilityType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryDisabilityType() {
            return primaryDisabilityType;
        }

        /**
         * Sets the value of the primaryDisabilityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryDisabilityType(String value) {
            this.primaryDisabilityType = value;
        }

        /**
         * Gets the value of the assessmentEarlylearningDevelopmentalDomain property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentEarlylearningDevelopmentalDomain() {
            return assessmentEarlylearningDevelopmentalDomain;
        }

        /**
         * Sets the value of the assessmentEarlylearningDevelopmentalDomain property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentEarlylearningDevelopmentalDomain(String value) {
            this.assessmentEarlylearningDevelopmentalDomain = value;
        }

        /**
         * Gets the value of the assessmentLevelForWhichDesigned property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentLevelForWhichDesigned() {
            return assessmentLevelForWhichDesigned;
        }

        /**
         * Sets the value of the assessmentLevelForWhichDesigned property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentLevelForWhichDesigned(String value) {
            this.assessmentLevelForWhichDesigned = value;
        }

        /**
         * Gets the value of the disabilityConditionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisabilityConditionType() {
            return disabilityConditionType;
        }

        /**
         * Sets the value of the disabilityConditionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisabilityConditionType(String value) {
            this.disabilityConditionType = value;
        }

        /**
         * Gets the value of the disabilityDeterminationSourceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisabilityDeterminationSourceType() {
            return disabilityDeterminationSourceType;
        }

        /**
         * Sets the value of the disabilityDeterminationSourceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisabilityDeterminationSourceType(String value) {
            this.disabilityDeterminationSourceType = value;
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
     *         &lt;element name="elEducationalExperience" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ideaEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="enrollmentServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="priorELExperienceList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="priorELExperience" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="serviceExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numberOfDaysInAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="programStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="programExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="foodServiceList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="foodService" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="specialEducationServiceList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="specialEducationService" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="setting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="specialEducationFTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "elEducationalExperience"
    })
    public static class ElEducationalExperienceList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<ElChildType.ElEducationalExperienceList.ElEducationalExperience> elEducationalExperience;

        /**
         * Gets the value of the elEducationalExperience property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the elEducationalExperience property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getElEducationalExperience().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience }
         * 
         * 
         */
        public List<ElChildType.ElEducationalExperienceList.ElEducationalExperience> getElEducationalExperience() {
            if (elEducationalExperience == null) {
                elEducationalExperience = new ArrayList<ElChildType.ElEducationalExperienceList.ElEducationalExperience>();
            }
            return this.elEducationalExperience;
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
         *         &lt;element name="applicationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ideaEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="enrollmentServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="priorELExperienceList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="priorELExperience" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="enrollmentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="entryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="serviceExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numberOfDaysInAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="programStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="programExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="foodServiceList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="foodService" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="specialEducationServiceList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="specialEducationService" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="setting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="specialEducationFTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "applicationDate",
            "ideaEnvironment",
            "enrollmentServiceType",
            "priorELExperienceList",
            "enrollmentDate",
            "entryDate",
            "exitDate",
            "serviceEntryDate",
            "serviceExitDate",
            "numberOfDaysInAttendance",
            "programStartDate",
            "programExitDate",
            "foodServiceList",
            "specialEducationServiceList"
        })
        public static class ElEducationalExperience {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String applicationDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String ideaEnvironment;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String enrollmentServiceType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected ElChildType.ElEducationalExperienceList.ElEducationalExperience.PriorELExperienceList priorELExperienceList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String enrollmentDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String entryDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String exitDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String serviceEntryDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String serviceExitDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String numberOfDaysInAttendance;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String programStartDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String programExitDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected ElChildType.ElEducationalExperienceList.ElEducationalExperience.FoodServiceList foodServiceList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList specialEducationServiceList;

            /**
             * Gets the value of the applicationDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplicationDate() {
                return applicationDate;
            }

            /**
             * Sets the value of the applicationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplicationDate(String value) {
                this.applicationDate = value;
            }

            /**
             * Gets the value of the ideaEnvironment property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdeaEnvironment() {
                return ideaEnvironment;
            }

            /**
             * Sets the value of the ideaEnvironment property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdeaEnvironment(String value) {
                this.ideaEnvironment = value;
            }

            /**
             * Gets the value of the enrollmentServiceType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnrollmentServiceType() {
                return enrollmentServiceType;
            }

            /**
             * Sets the value of the enrollmentServiceType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnrollmentServiceType(String value) {
                this.enrollmentServiceType = value;
            }

            /**
             * Gets the value of the priorELExperienceList property.
             * 
             * @return
             *     possible object is
             *     {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.PriorELExperienceList }
             *     
             */
            public ElChildType.ElEducationalExperienceList.ElEducationalExperience.PriorELExperienceList getPriorELExperienceList() {
                return priorELExperienceList;
            }

            /**
             * Sets the value of the priorELExperienceList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.PriorELExperienceList }
             *     
             */
            public void setPriorELExperienceList(ElChildType.ElEducationalExperienceList.ElEducationalExperience.PriorELExperienceList value) {
                this.priorELExperienceList = value;
            }

            /**
             * Gets the value of the enrollmentDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnrollmentDate() {
                return enrollmentDate;
            }

            /**
             * Sets the value of the enrollmentDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnrollmentDate(String value) {
                this.enrollmentDate = value;
            }

            /**
             * Gets the value of the entryDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntryDate() {
                return entryDate;
            }

            /**
             * Sets the value of the entryDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntryDate(String value) {
                this.entryDate = value;
            }

            /**
             * Gets the value of the exitDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExitDate() {
                return exitDate;
            }

            /**
             * Sets the value of the exitDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExitDate(String value) {
                this.exitDate = value;
            }

            /**
             * Gets the value of the serviceEntryDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceEntryDate() {
                return serviceEntryDate;
            }

            /**
             * Sets the value of the serviceEntryDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceEntryDate(String value) {
                this.serviceEntryDate = value;
            }

            /**
             * Gets the value of the serviceExitDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceExitDate() {
                return serviceExitDate;
            }

            /**
             * Sets the value of the serviceExitDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceExitDate(String value) {
                this.serviceExitDate = value;
            }

            /**
             * Gets the value of the numberOfDaysInAttendance property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumberOfDaysInAttendance() {
                return numberOfDaysInAttendance;
            }

            /**
             * Sets the value of the numberOfDaysInAttendance property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumberOfDaysInAttendance(String value) {
                this.numberOfDaysInAttendance = value;
            }

            /**
             * Gets the value of the programStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramStartDate() {
                return programStartDate;
            }

            /**
             * Sets the value of the programStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramStartDate(String value) {
                this.programStartDate = value;
            }

            /**
             * Gets the value of the programExitDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramExitDate() {
                return programExitDate;
            }

            /**
             * Sets the value of the programExitDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramExitDate(String value) {
                this.programExitDate = value;
            }

            /**
             * Gets the value of the foodServiceList property.
             * 
             * @return
             *     possible object is
             *     {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.FoodServiceList }
             *     
             */
            public ElChildType.ElEducationalExperienceList.ElEducationalExperience.FoodServiceList getFoodServiceList() {
                return foodServiceList;
            }

            /**
             * Sets the value of the foodServiceList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.FoodServiceList }
             *     
             */
            public void setFoodServiceList(ElChildType.ElEducationalExperienceList.ElEducationalExperience.FoodServiceList value) {
                this.foodServiceList = value;
            }

            /**
             * Gets the value of the specialEducationServiceList property.
             * 
             * @return
             *     possible object is
             *     {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList }
             *     
             */
            public ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList getSpecialEducationServiceList() {
                return specialEducationServiceList;
            }

            /**
             * Sets the value of the specialEducationServiceList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList }
             *     
             */
            public void setSpecialEducationServiceList(ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList value) {
                this.specialEducationServiceList = value;
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
             *         &lt;element name="foodService" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "foodService"
            })
            public static class FoodServiceList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected List<String> foodService;

                /**
                 * Gets the value of the foodService property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the foodService property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFoodService().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getFoodService() {
                    if (foodService == null) {
                        foodService = new ArrayList<String>();
                    }
                    return this.foodService;
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
             *         &lt;element name="priorELExperience" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "priorELExperience"
            })
            public static class PriorELExperienceList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected List<String> priorELExperience;

                /**
                 * Gets the value of the priorELExperience property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the priorELExperience property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPriorELExperience().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getPriorELExperience() {
                    if (priorELExperience == null) {
                        priorELExperience = new ArrayList<String>();
                    }
                    return this.priorELExperience;
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
             *         &lt;element name="specialEducationService" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="setting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="specialEducationFTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "specialEducationService"
            })
            public static class SpecialEducationServiceList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected List<ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList.SpecialEducationService> specialEducationService;

                /**
                 * Gets the value of the specialEducationService property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the specialEducationService property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSpecialEducationService().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList.SpecialEducationService }
                 * 
                 * 
                 */
                public List<ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList.SpecialEducationService> getSpecialEducationService() {
                    if (specialEducationService == null) {
                        specialEducationService = new ArrayList<ElChildType.ElEducationalExperienceList.ElEducationalExperience.SpecialEducationServiceList.SpecialEducationService>();
                    }
                    return this.specialEducationService;
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
                 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="setting" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="specialEducationFTE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                    "serviceType",
                    "setting",
                    "specialEducationFTE"
                })
                public static class SpecialEducationService {

                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String serviceType;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String setting;
                    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                    protected String specialEducationFTE;

                    /**
                     * Gets the value of the serviceType property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getServiceType() {
                        return serviceType;
                    }

                    /**
                     * Sets the value of the serviceType property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setServiceType(String value) {
                        this.serviceType = value;
                    }

                    /**
                     * Gets the value of the setting property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSetting() {
                        return setting;
                    }

                    /**
                     * Sets the value of the setting property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSetting(String value) {
                        this.setting = value;
                    }

                    /**
                     * Gets the value of the specialEducationFTE property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSpecialEducationFTE() {
                        return specialEducationFTE;
                    }

                    /**
                     * Sets the value of the specialEducationFTE property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSpecialEducationFTE(String value) {
                        this.specialEducationFTE = value;
                    }

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
     *         &lt;element name="programEligibilityCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programEligibilityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programEligibilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programEligibilityStatusDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaPartB619PotentialEligibilityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "programEligibilityCategory",
        "programEligibilityExpirationDate",
        "programEligibilityStatus",
        "programEligibilityStatusDate",
        "ideaPartB619PotentialEligibilityIndicator"
    })
    public static class Eligibility {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programEligibilityCategory;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programEligibilityExpirationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programEligibilityStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programEligibilityStatusDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaPartB619PotentialEligibilityIndicator;

        /**
         * Gets the value of the programEligibilityCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramEligibilityCategory() {
            return programEligibilityCategory;
        }

        /**
         * Sets the value of the programEligibilityCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramEligibilityCategory(String value) {
            this.programEligibilityCategory = value;
        }

        /**
         * Gets the value of the programEligibilityExpirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramEligibilityExpirationDate() {
            return programEligibilityExpirationDate;
        }

        /**
         * Sets the value of the programEligibilityExpirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramEligibilityExpirationDate(String value) {
            this.programEligibilityExpirationDate = value;
        }

        /**
         * Gets the value of the programEligibilityStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramEligibilityStatus() {
            return programEligibilityStatus;
        }

        /**
         * Sets the value of the programEligibilityStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramEligibilityStatus(String value) {
            this.programEligibilityStatus = value;
        }

        /**
         * Gets the value of the programEligibilityStatusDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramEligibilityStatusDate() {
            return programEligibilityStatusDate;
        }

        /**
         * Sets the value of the programEligibilityStatusDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramEligibilityStatusDate(String value) {
            this.programEligibilityStatusDate = value;
        }

        /**
         * Gets the value of the ideaPartB619PotentialEligibilityIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaPartB619PotentialEligibilityIndicator() {
            return ideaPartB619PotentialEligibilityIndicator;
        }

        /**
         * Sets the value of the ideaPartB619PotentialEligibilityIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaPartB619PotentialEligibilityIndicator(String value) {
            this.ideaPartB619PotentialEligibilityIndicator = value;
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
     *         &lt;element name="earlyLearningFederalFundingType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlyLearningOtherFederalFundingSources" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="federalProgramCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "earlyLearningFederalFundingType",
        "earlyLearningOtherFederalFundingSources",
        "federalProgramCode"
    })
    public static class Finance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyLearningFederalFundingType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyLearningOtherFederalFundingSources;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String federalProgramCode;

        /**
         * Gets the value of the earlyLearningFederalFundingType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyLearningFederalFundingType() {
            return earlyLearningFederalFundingType;
        }

        /**
         * Sets the value of the earlyLearningFederalFundingType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyLearningFederalFundingType(String value) {
            this.earlyLearningFederalFundingType = value;
        }

        /**
         * Gets the value of the earlyLearningOtherFederalFundingSources property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyLearningOtherFederalFundingSources() {
            return earlyLearningOtherFederalFundingSources;
        }

        /**
         * Sets the value of the earlyLearningOtherFederalFundingSources property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyLearningOtherFederalFundingSources(String value) {
            this.earlyLearningOtherFederalFundingSources = value;
        }

        /**
         * Gets the value of the federalProgramCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFederalProgramCode() {
            return federalProgramCode;
        }

        /**
         * Sets the value of the federalProgramCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFederalProgramCode(String value) {
            this.federalProgramCode = value;
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
     *         &lt;element name="allergyReactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="allergySeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="allergyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="healthScreeningEquipmentUsed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="healthScreeningFollowUpRecommendation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="immunizationList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="immunization" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="visonScreeningList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="visionScreening" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="hearingScreeningList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="hearingScreening" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="dentalScreeningList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dentalScreening" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
     *         &lt;element name="insurance" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="insuranceCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dentalInsuranceCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="birth" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="birthWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="gestation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "allergyReactionDescription",
        "allergySeverity",
        "allergyType",
        "healthScreeningEquipmentUsed",
        "healthScreeningFollowUpRecommendation",
        "immunizationList",
        "visonScreeningList",
        "hearingScreeningList",
        "dentalScreeningList",
        "insurance",
        "birth"
    })
    public static class HealthInformation {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String allergyReactionDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String allergySeverity;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String allergyType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String healthScreeningEquipmentUsed;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String healthScreeningFollowUpRecommendation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.HealthInformation.ImmunizationList immunizationList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.HealthInformation.VisonScreeningList visonScreeningList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.HealthInformation.HearingScreeningList hearingScreeningList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.HealthInformation.DentalScreeningList dentalScreeningList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.HealthInformation.Insurance insurance;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.HealthInformation.Birth birth;

        /**
         * Gets the value of the allergyReactionDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllergyReactionDescription() {
            return allergyReactionDescription;
        }

        /**
         * Sets the value of the allergyReactionDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllergyReactionDescription(String value) {
            this.allergyReactionDescription = value;
        }

        /**
         * Gets the value of the allergySeverity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllergySeverity() {
            return allergySeverity;
        }

        /**
         * Sets the value of the allergySeverity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllergySeverity(String value) {
            this.allergySeverity = value;
        }

        /**
         * Gets the value of the allergyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAllergyType() {
            return allergyType;
        }

        /**
         * Sets the value of the allergyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAllergyType(String value) {
            this.allergyType = value;
        }

        /**
         * Gets the value of the healthScreeningEquipmentUsed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHealthScreeningEquipmentUsed() {
            return healthScreeningEquipmentUsed;
        }

        /**
         * Sets the value of the healthScreeningEquipmentUsed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHealthScreeningEquipmentUsed(String value) {
            this.healthScreeningEquipmentUsed = value;
        }

        /**
         * Gets the value of the healthScreeningFollowUpRecommendation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHealthScreeningFollowUpRecommendation() {
            return healthScreeningFollowUpRecommendation;
        }

        /**
         * Sets the value of the healthScreeningFollowUpRecommendation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHealthScreeningFollowUpRecommendation(String value) {
            this.healthScreeningFollowUpRecommendation = value;
        }

        /**
         * Gets the value of the immunizationList property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.HealthInformation.ImmunizationList }
         *     
         */
        public ElChildType.HealthInformation.ImmunizationList getImmunizationList() {
            return immunizationList;
        }

        /**
         * Sets the value of the immunizationList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.HealthInformation.ImmunizationList }
         *     
         */
        public void setImmunizationList(ElChildType.HealthInformation.ImmunizationList value) {
            this.immunizationList = value;
        }

        /**
         * Gets the value of the visonScreeningList property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.HealthInformation.VisonScreeningList }
         *     
         */
        public ElChildType.HealthInformation.VisonScreeningList getVisonScreeningList() {
            return visonScreeningList;
        }

        /**
         * Sets the value of the visonScreeningList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.HealthInformation.VisonScreeningList }
         *     
         */
        public void setVisonScreeningList(ElChildType.HealthInformation.VisonScreeningList value) {
            this.visonScreeningList = value;
        }

        /**
         * Gets the value of the hearingScreeningList property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.HealthInformation.HearingScreeningList }
         *     
         */
        public ElChildType.HealthInformation.HearingScreeningList getHearingScreeningList() {
            return hearingScreeningList;
        }

        /**
         * Sets the value of the hearingScreeningList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.HealthInformation.HearingScreeningList }
         *     
         */
        public void setHearingScreeningList(ElChildType.HealthInformation.HearingScreeningList value) {
            this.hearingScreeningList = value;
        }

        /**
         * Gets the value of the dentalScreeningList property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.HealthInformation.DentalScreeningList }
         *     
         */
        public ElChildType.HealthInformation.DentalScreeningList getDentalScreeningList() {
            return dentalScreeningList;
        }

        /**
         * Sets the value of the dentalScreeningList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.HealthInformation.DentalScreeningList }
         *     
         */
        public void setDentalScreeningList(ElChildType.HealthInformation.DentalScreeningList value) {
            this.dentalScreeningList = value;
        }

        /**
         * Gets the value of the insurance property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.HealthInformation.Insurance }
         *     
         */
        public ElChildType.HealthInformation.Insurance getInsurance() {
            return insurance;
        }

        /**
         * Sets the value of the insurance property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.HealthInformation.Insurance }
         *     
         */
        public void setInsurance(ElChildType.HealthInformation.Insurance value) {
            this.insurance = value;
        }

        /**
         * Gets the value of the birth property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.HealthInformation.Birth }
         *     
         */
        public ElChildType.HealthInformation.Birth getBirth() {
            return birth;
        }

        /**
         * Sets the value of the birth property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.HealthInformation.Birth }
         *     
         */
        public void setBirth(ElChildType.HealthInformation.Birth value) {
            this.birth = value;
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
         *         &lt;element name="birthWeight" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="gestation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "birthWeight",
            "gestation"
        })
        public static class Birth {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String birthWeight;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String gestation;

            /**
             * Gets the value of the birthWeight property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBirthWeight() {
                return birthWeight;
            }

            /**
             * Sets the value of the birthWeight property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBirthWeight(String value) {
                this.birthWeight = value;
            }

            /**
             * Gets the value of the gestation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGestation() {
                return gestation;
            }

            /**
             * Sets the value of the gestation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGestation(String value) {
                this.gestation = value;
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
         *         &lt;element name="dentalScreening" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dentalScreening"
        })
        public static class DentalScreeningList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<ElChildType.HealthInformation.DentalScreeningList.DentalScreening> dentalScreening;

            /**
             * Gets the value of the dentalScreening property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dentalScreening property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDentalScreening().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ElChildType.HealthInformation.DentalScreeningList.DentalScreening }
             * 
             * 
             */
            public List<ElChildType.HealthInformation.DentalScreeningList.DentalScreening> getDentalScreening() {
                if (dentalScreening == null) {
                    dentalScreening = new ArrayList<ElChildType.HealthInformation.DentalScreeningList.DentalScreening>();
                }
                return this.dentalScreening;
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
             *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "date",
                "status"
            })
            public static class DentalScreening {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String date;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String status;

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
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
         *         &lt;element name="hearingScreening" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "hearingScreening"
        })
        public static class HearingScreeningList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<ElChildType.HealthInformation.HearingScreeningList.HearingScreening> hearingScreening;

            /**
             * Gets the value of the hearingScreening property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hearingScreening property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHearingScreening().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ElChildType.HealthInformation.HearingScreeningList.HearingScreening }
             * 
             * 
             */
            public List<ElChildType.HealthInformation.HearingScreeningList.HearingScreening> getHearingScreening() {
                if (hearingScreening == null) {
                    hearingScreening = new ArrayList<ElChildType.HealthInformation.HearingScreeningList.HearingScreening>();
                }
                return this.hearingScreening;
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
             *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "date",
                "status"
            })
            public static class HearingScreening {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String date;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String status;

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
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
         *         &lt;element name="immunization" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "immunization"
        })
        public static class ImmunizationList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<ElChildType.HealthInformation.ImmunizationList.Immunization> immunization;

            /**
             * Gets the value of the immunization property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the immunization property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImmunization().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ElChildType.HealthInformation.ImmunizationList.Immunization }
             * 
             * 
             */
            public List<ElChildType.HealthInformation.ImmunizationList.Immunization> getImmunization() {
                if (immunization == null) {
                    immunization = new ArrayList<ElChildType.HealthInformation.ImmunizationList.Immunization>();
                }
                return this.immunization;
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
             *         &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "immunizationDate",
                "immunizationType"
            })
            public static class Immunization {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String immunizationDate;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String immunizationType;

                /**
                 * Gets the value of the immunizationDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImmunizationDate() {
                    return immunizationDate;
                }

                /**
                 * Sets the value of the immunizationDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImmunizationDate(String value) {
                    this.immunizationDate = value;
                }

                /**
                 * Gets the value of the immunizationType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getImmunizationType() {
                    return immunizationType;
                }

                /**
                 * Sets the value of the immunizationType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setImmunizationType(String value) {
                    this.immunizationType = value;
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
         *         &lt;element name="insuranceCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="dentalInsuranceCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "insuranceCoverage",
            "dentalInsuranceCoverage"
        })
        public static class Insurance {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String insuranceCoverage;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String dentalInsuranceCoverage;

            /**
             * Gets the value of the insuranceCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInsuranceCoverage() {
                return insuranceCoverage;
            }

            /**
             * Sets the value of the insuranceCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInsuranceCoverage(String value) {
                this.insuranceCoverage = value;
            }

            /**
             * Gets the value of the dentalInsuranceCoverage property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDentalInsuranceCoverage() {
                return dentalInsuranceCoverage;
            }

            /**
             * Sets the value of the dentalInsuranceCoverage property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDentalInsuranceCoverage(String value) {
                this.dentalInsuranceCoverage = value;
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
         *         &lt;element name="visionScreening" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "visionScreening"
        })
        public static class VisonScreeningList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<ElChildType.HealthInformation.VisonScreeningList.VisionScreening> visionScreening;

            /**
             * Gets the value of the visionScreening property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the visionScreening property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVisionScreening().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ElChildType.HealthInformation.VisonScreeningList.VisionScreening }
             * 
             * 
             */
            public List<ElChildType.HealthInformation.VisonScreeningList.VisionScreening> getVisionScreening() {
                if (visionScreening == null) {
                    visionScreening = new ArrayList<ElChildType.HealthInformation.VisonScreeningList.VisionScreening>();
                }
                return this.visionScreening;
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
             *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "date",
                "status"
            })
            public static class VisionScreening {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String date;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String status;

                /**
                 * Gets the value of the date property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDate() {
                    return date;
                }

                /**
                 * Sets the value of the date property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDate(String value) {
                    this.date = value;
                }

                /**
                 * Gets the value of the status property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStatus() {
                    return status;
                }

                /**
                 * Sets the value of the status property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStatus(String value) {
                    this.status = value;
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
     *         &lt;element name="ideaIEPStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaPartB619PotentialEligibilityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaPartCToBSharingNotificationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaPartCToPartBDateOfTransitionConference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaPartCToPartBDateOfTransitionConferenceDecline" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaPartCToPartBDateOfTransitionPlanStepsOrServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaPartCToPartBParentNotificationOptOutDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaPartCToPartBParentNotificationOptOutIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reasonForDeclinedServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="reasonForDelayOfTransitionConference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="specialEducationExitReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ideaIEPStatus",
        "ideaPartB619PotentialEligibilityIndicator",
        "ideaPartCToBSharingNotificationDate",
        "ideaPartCToPartBDateOfTransitionConference",
        "ideaPartCToPartBDateOfTransitionConferenceDecline",
        "ideaPartCToPartBDateOfTransitionPlanStepsOrServices",
        "ideaPartCToPartBParentNotificationOptOutDate",
        "ideaPartCToPartBParentNotificationOptOutIndicator",
        "reasonForDeclinedServices",
        "reasonForDelayOfTransitionConference",
        "specialEducationExitReason"
    })
    public static class Idea {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaIEPStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaPartB619PotentialEligibilityIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaPartCToBSharingNotificationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaPartCToPartBDateOfTransitionConference;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaPartCToPartBDateOfTransitionConferenceDecline;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaPartCToPartBDateOfTransitionPlanStepsOrServices;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaPartCToPartBParentNotificationOptOutDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaPartCToPartBParentNotificationOptOutIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String reasonForDeclinedServices;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String reasonForDelayOfTransitionConference;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String specialEducationExitReason;

        /**
         * Gets the value of the ideaIEPStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaIEPStatus() {
            return ideaIEPStatus;
        }

        /**
         * Sets the value of the ideaIEPStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaIEPStatus(String value) {
            this.ideaIEPStatus = value;
        }

        /**
         * Gets the value of the ideaPartB619PotentialEligibilityIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaPartB619PotentialEligibilityIndicator() {
            return ideaPartB619PotentialEligibilityIndicator;
        }

        /**
         * Sets the value of the ideaPartB619PotentialEligibilityIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaPartB619PotentialEligibilityIndicator(String value) {
            this.ideaPartB619PotentialEligibilityIndicator = value;
        }

        /**
         * Gets the value of the ideaPartCToBSharingNotificationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaPartCToBSharingNotificationDate() {
            return ideaPartCToBSharingNotificationDate;
        }

        /**
         * Sets the value of the ideaPartCToBSharingNotificationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaPartCToBSharingNotificationDate(String value) {
            this.ideaPartCToBSharingNotificationDate = value;
        }

        /**
         * Gets the value of the ideaPartCToPartBDateOfTransitionConference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaPartCToPartBDateOfTransitionConference() {
            return ideaPartCToPartBDateOfTransitionConference;
        }

        /**
         * Sets the value of the ideaPartCToPartBDateOfTransitionConference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaPartCToPartBDateOfTransitionConference(String value) {
            this.ideaPartCToPartBDateOfTransitionConference = value;
        }

        /**
         * Gets the value of the ideaPartCToPartBDateOfTransitionConferenceDecline property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaPartCToPartBDateOfTransitionConferenceDecline() {
            return ideaPartCToPartBDateOfTransitionConferenceDecline;
        }

        /**
         * Sets the value of the ideaPartCToPartBDateOfTransitionConferenceDecline property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaPartCToPartBDateOfTransitionConferenceDecline(String value) {
            this.ideaPartCToPartBDateOfTransitionConferenceDecline = value;
        }

        /**
         * Gets the value of the ideaPartCToPartBDateOfTransitionPlanStepsOrServices property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaPartCToPartBDateOfTransitionPlanStepsOrServices() {
            return ideaPartCToPartBDateOfTransitionPlanStepsOrServices;
        }

        /**
         * Sets the value of the ideaPartCToPartBDateOfTransitionPlanStepsOrServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaPartCToPartBDateOfTransitionPlanStepsOrServices(String value) {
            this.ideaPartCToPartBDateOfTransitionPlanStepsOrServices = value;
        }

        /**
         * Gets the value of the ideaPartCToPartBParentNotificationOptOutDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaPartCToPartBParentNotificationOptOutDate() {
            return ideaPartCToPartBParentNotificationOptOutDate;
        }

        /**
         * Sets the value of the ideaPartCToPartBParentNotificationOptOutDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaPartCToPartBParentNotificationOptOutDate(String value) {
            this.ideaPartCToPartBParentNotificationOptOutDate = value;
        }

        /**
         * Gets the value of the ideaPartCToPartBParentNotificationOptOutIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdeaPartCToPartBParentNotificationOptOutIndicator() {
            return ideaPartCToPartBParentNotificationOptOutIndicator;
        }

        /**
         * Sets the value of the ideaPartCToPartBParentNotificationOptOutIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdeaPartCToPartBParentNotificationOptOutIndicator(String value) {
            this.ideaPartCToPartBParentNotificationOptOutIndicator = value;
        }

        /**
         * Gets the value of the reasonForDeclinedServices property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonForDeclinedServices() {
            return reasonForDeclinedServices;
        }

        /**
         * Sets the value of the reasonForDeclinedServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonForDeclinedServices(String value) {
            this.reasonForDeclinedServices = value;
        }

        /**
         * Gets the value of the reasonForDelayOfTransitionConference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReasonForDelayOfTransitionConference() {
            return reasonForDelayOfTransitionConference;
        }

        /**
         * Sets the value of the reasonForDelayOfTransitionConference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReasonForDelayOfTransitionConference(String value) {
            this.reasonForDelayOfTransitionConference = value;
        }

        /**
         * Gets the value of the specialEducationExitReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSpecialEducationExitReason() {
            return specialEducationExitReason;
        }

        /**
         * Sets the value of the specialEducationExitReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSpecialEducationExitReason(String value) {
            this.specialEducationExitReason = value;
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
     *         &lt;element name="name" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="otherNameList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
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
     *                   &lt;element name="elChildId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="elChildIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="idVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "name",
        "otherNameList",
        "identifier"
    })
    public static class Identity {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.Identity.Name name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.Identity.OtherNameList otherNameList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.Identity.Identifier identifier;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.Identity.Name }
         *     
         */
        public ElChildType.Identity.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.Identity.Name }
         *     
         */
        public void setName(ElChildType.Identity.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the otherNameList property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.Identity.OtherNameList }
         *     
         */
        public ElChildType.Identity.OtherNameList getOtherNameList() {
            return otherNameList;
        }

        /**
         * Sets the value of the otherNameList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.Identity.OtherNameList }
         *     
         */
        public void setOtherNameList(ElChildType.Identity.OtherNameList value) {
            this.otherNameList = value;
        }

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.Identity.Identifier }
         *     
         */
        public ElChildType.Identity.Identifier getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.Identity.Identifier }
         *     
         */
        public void setIdentifier(ElChildType.Identity.Identifier value) {
            this.identifier = value;
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
         *         &lt;element name="elChildId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="elChildIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="idVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "elChildId",
            "elChildIdSystem",
            "socialSecurityNumber",
            "idVerification"
        })
        public static class Identifier {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String elChildId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String elChildIdSystem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String socialSecurityNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String idVerification;

            /**
             * Gets the value of the elChildId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getElChildId() {
                return elChildId;
            }

            /**
             * Sets the value of the elChildId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setElChildId(String value) {
                this.elChildId = value;
            }

            /**
             * Gets the value of the elChildIdSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getElChildIdSystem() {
                return elChildIdSystem;
            }

            /**
             * Sets the value of the elChildIdSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setElChildIdSystem(String value) {
                this.elChildIdSystem = value;
            }

            /**
             * Gets the value of the socialSecurityNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSocialSecurityNumber() {
                return socialSecurityNumber;
            }

            /**
             * Sets the value of the socialSecurityNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSocialSecurityNumber(String value) {
                this.socialSecurityNumber = value;
            }

            /**
             * Gets the value of the idVerification property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdVerification() {
                return idVerification;
            }

            /**
             * Sets the value of the idVerification property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIdVerification(String value) {
                this.idVerification = value;
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
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "firstName",
            "middleName",
            "lastName",
            "suffix",
            "prefix"
        })
        public static class Name {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String firstName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String middleName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String lastName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String suffix;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String prefix;

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the middleName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMiddleName() {
                return middleName;
            }

            /**
             * Sets the value of the middleName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMiddleName(String value) {
                this.middleName = value;
            }

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the suffix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSuffix() {
                return suffix;
            }

            /**
             * Sets the value of the suffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSuffix(String value) {
                this.suffix = value;
            }

            /**
             * Gets the value of the prefix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPrefix() {
                return prefix;
            }

            /**
             * Sets the value of the prefix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPrefix(String value) {
                this.prefix = value;
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
         *         &lt;element name="otherName" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "otherName"
        })
        public static class OtherNameList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<ElChildType.Identity.OtherNameList.OtherName> otherName;

            /**
             * Gets the value of the otherName property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the otherName property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOtherName().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ElChildType.Identity.OtherNameList.OtherName }
             * 
             * 
             */
            public List<ElChildType.Identity.OtherNameList.OtherName> getOtherName() {
                if (otherName == null) {
                    otherName = new ArrayList<ElChildType.Identity.OtherNameList.OtherName>();
                }
                return this.otherName;
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
             *         &lt;element name="otherFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="otherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="otherNameType" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "otherFirstName",
                "otherLastName",
                "otherMiddleName",
                "otherName"
            })
            public static class OtherName {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherFirstName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherLastName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherMiddleName;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String otherName;
                @XmlAttribute(name = "otherNameType")
                protected String otherNameType;

                /**
                 * Gets the value of the otherFirstName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherFirstName() {
                    return otherFirstName;
                }

                /**
                 * Sets the value of the otherFirstName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherFirstName(String value) {
                    this.otherFirstName = value;
                }

                /**
                 * Gets the value of the otherLastName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherLastName() {
                    return otherLastName;
                }

                /**
                 * Sets the value of the otherLastName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherLastName(String value) {
                    this.otherLastName = value;
                }

                /**
                 * Gets the value of the otherMiddleName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherMiddleName() {
                    return otherMiddleName;
                }

                /**
                 * Sets the value of the otherMiddleName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherMiddleName(String value) {
                    this.otherMiddleName = value;
                }

                /**
                 * Gets the value of the otherName property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherName() {
                    return otherName;
                }

                /**
                 * Sets the value of the otherName property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherName(String value) {
                    this.otherName = value;
                }

                /**
                 * Gets the value of the otherNameType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOtherNameType() {
                    return otherNameType;
                }

                /**
                 * Sets the value of the otherNameType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOtherNameType(String value) {
                    this.otherNameType = value;
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
     *         &lt;element name="individualizedProgram" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nonInclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="inclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="transitionPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="programType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="planDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="planMeetingLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="planMeetingParticipantList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="planMeetingParticipant" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="planSigneeList" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="planSignee" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="planSignatureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="planReevaluationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="methodOfServiceDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "individualizedProgram"
    })
    public static class IndiviualizedProgramsList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElChildType.IndiviualizedProgramsList.IndividualizedProgram individualizedProgram;

        /**
         * Gets the value of the individualizedProgram property.
         * 
         * @return
         *     possible object is
         *     {@link ElChildType.IndiviualizedProgramsList.IndividualizedProgram }
         *     
         */
        public ElChildType.IndiviualizedProgramsList.IndividualizedProgram getIndividualizedProgram() {
            return individualizedProgram;
        }

        /**
         * Sets the value of the individualizedProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElChildType.IndiviualizedProgramsList.IndividualizedProgram }
         *     
         */
        public void setIndividualizedProgram(ElChildType.IndiviualizedProgramsList.IndividualizedProgram value) {
            this.individualizedProgram = value;
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
         *         &lt;element name="DateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nonInclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="inclusionMinutes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="transitionPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="programType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="planDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="planMeetingLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="planMeetingParticipantList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="planMeetingParticipant" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="planSigneeList" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="planSignee" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="planSignatureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="planReevaluationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="methodOfServiceDelivery" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dateType",
            "date",
            "nonInclusionMinutes",
            "inclusionMinutes",
            "transitionPlanType",
            "programType",
            "planDate",
            "planMeetingLocation",
            "planMeetingParticipantList",
            "planSigneeList",
            "planSignatureDate",
            "planReevaluationDate",
            "methodOfServiceDelivery"
        })
        public static class IndividualizedProgram {

            @XmlElement(name = "DateType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String dateType;
            @XmlElement(name = "Date", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String date;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String nonInclusionMinutes;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String inclusionMinutes;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String transitionPlanType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String programType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String planDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String planMeetingLocation;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanMeetingParticipantList planMeetingParticipantList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanSigneeList planSigneeList;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String planSignatureDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String planReevaluationDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String methodOfServiceDelivery;

            /**
             * Gets the value of the dateType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateType() {
                return dateType;
            }

            /**
             * Sets the value of the dateType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateType(String value) {
                this.dateType = value;
            }

            /**
             * Gets the value of the date property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDate() {
                return date;
            }

            /**
             * Sets the value of the date property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDate(String value) {
                this.date = value;
            }

            /**
             * Gets the value of the nonInclusionMinutes property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonInclusionMinutes() {
                return nonInclusionMinutes;
            }

            /**
             * Sets the value of the nonInclusionMinutes property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNonInclusionMinutes(String value) {
                this.nonInclusionMinutes = value;
            }

            /**
             * Gets the value of the inclusionMinutes property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInclusionMinutes() {
                return inclusionMinutes;
            }

            /**
             * Sets the value of the inclusionMinutes property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInclusionMinutes(String value) {
                this.inclusionMinutes = value;
            }

            /**
             * Gets the value of the transitionPlanType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransitionPlanType() {
                return transitionPlanType;
            }

            /**
             * Sets the value of the transitionPlanType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransitionPlanType(String value) {
                this.transitionPlanType = value;
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
             * Gets the value of the planDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlanDate() {
                return planDate;
            }

            /**
             * Sets the value of the planDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlanDate(String value) {
                this.planDate = value;
            }

            /**
             * Gets the value of the planMeetingLocation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlanMeetingLocation() {
                return planMeetingLocation;
            }

            /**
             * Sets the value of the planMeetingLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlanMeetingLocation(String value) {
                this.planMeetingLocation = value;
            }

            /**
             * Gets the value of the planMeetingParticipantList property.
             * 
             * @return
             *     possible object is
             *     {@link ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanMeetingParticipantList }
             *     
             */
            public ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanMeetingParticipantList getPlanMeetingParticipantList() {
                return planMeetingParticipantList;
            }

            /**
             * Sets the value of the planMeetingParticipantList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanMeetingParticipantList }
             *     
             */
            public void setPlanMeetingParticipantList(ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanMeetingParticipantList value) {
                this.planMeetingParticipantList = value;
            }

            /**
             * Gets the value of the planSigneeList property.
             * 
             * @return
             *     possible object is
             *     {@link ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanSigneeList }
             *     
             */
            public ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanSigneeList getPlanSigneeList() {
                return planSigneeList;
            }

            /**
             * Sets the value of the planSigneeList property.
             * 
             * @param value
             *     allowed object is
             *     {@link ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanSigneeList }
             *     
             */
            public void setPlanSigneeList(ElChildType.IndiviualizedProgramsList.IndividualizedProgram.PlanSigneeList value) {
                this.planSigneeList = value;
            }

            /**
             * Gets the value of the planSignatureDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlanSignatureDate() {
                return planSignatureDate;
            }

            /**
             * Sets the value of the planSignatureDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlanSignatureDate(String value) {
                this.planSignatureDate = value;
            }

            /**
             * Gets the value of the planReevaluationDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPlanReevaluationDate() {
                return planReevaluationDate;
            }

            /**
             * Sets the value of the planReevaluationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPlanReevaluationDate(String value) {
                this.planReevaluationDate = value;
            }

            /**
             * Gets the value of the methodOfServiceDelivery property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMethodOfServiceDelivery() {
                return methodOfServiceDelivery;
            }

            /**
             * Sets the value of the methodOfServiceDelivery property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMethodOfServiceDelivery(String value) {
                this.methodOfServiceDelivery = value;
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
             *         &lt;element name="planMeetingParticipant" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "planMeetingParticipant"
            })
            public static class PlanMeetingParticipantList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected List<String> planMeetingParticipant;

                /**
                 * Gets the value of the planMeetingParticipant property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the planMeetingParticipant property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPlanMeetingParticipant().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getPlanMeetingParticipant() {
                    if (planMeetingParticipant == null) {
                        planMeetingParticipant = new ArrayList<String>();
                    }
                    return this.planMeetingParticipant;
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
             *         &lt;element name="planSignee" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
                "planSignee"
            })
            public static class PlanSigneeList {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected List<String> planSignee;

                /**
                 * Gets the value of the planSignee property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the planSignee property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPlanSignee().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getPlanSignee() {
                    if (planSignee == null) {
                        planSignee = new ArrayList<String>();
                    }
                    return this.planSignee;
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
     *         &lt;element name="language" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "language"
    })
    public static class LanguageList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<ElChildType.LanguageList.Language> language;

        /**
         * Gets the value of the language property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the language property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguage().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ElChildType.LanguageList.Language }
         * 
         * 
         */
        public List<ElChildType.LanguageList.Language> getLanguage() {
            if (language == null) {
                language = new ArrayList<ElChildType.LanguageList.Language>();
            }
            return this.language;
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
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "type",
            "code"
        })
        public static class Language {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String type;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String code;

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
             * Gets the value of the code property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * Sets the value of the code property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
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
     *         &lt;element name="referralDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="referralOutcome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="referralReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="referralSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="referralType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="referredTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "referralDate",
        "referralOutcome",
        "referralReason",
        "referralSource",
        "referralType",
        "referredTo"
    })
    public static class Referral {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String referralDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String referralOutcome;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String referralReason;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String referralSource;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String referralType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String referredTo;

        /**
         * Gets the value of the referralDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferralDate() {
            return referralDate;
        }

        /**
         * Sets the value of the referralDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferralDate(String value) {
            this.referralDate = value;
        }

        /**
         * Gets the value of the referralOutcome property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferralOutcome() {
            return referralOutcome;
        }

        /**
         * Sets the value of the referralOutcome property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferralOutcome(String value) {
            this.referralOutcome = value;
        }

        /**
         * Gets the value of the referralReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferralReason() {
            return referralReason;
        }

        /**
         * Sets the value of the referralReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferralReason(String value) {
            this.referralReason = value;
        }

        /**
         * Gets the value of the referralSource property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferralSource() {
            return referralSource;
        }

        /**
         * Sets the value of the referralSource property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferralSource(String value) {
            this.referralSource = value;
        }

        /**
         * Gets the value of the referralType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferralType() {
            return referralType;
        }

        /**
         * Sets the value of the referralType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferralType(String value) {
            this.referralType = value;
        }

        /**
         * Gets the value of the referredTo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferredTo() {
            return referredTo;
        }

        /**
         * Sets the value of the referredTo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferredTo(String value) {
            this.referredTo = value;
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
     *         &lt;element name="frequencyOfService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="individualizedProgramPlannedServiceDuration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="individualizedProgramPlannedServiceFrequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="individualizedProgramPlannedServiceStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="individualizedProgramPlannedServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "frequencyOfService",
        "individualizedProgramPlannedServiceDuration",
        "individualizedProgramPlannedServiceFrequency",
        "individualizedProgramPlannedServiceStartDate",
        "individualizedProgramPlannedServiceType"
    })
    public static class Services {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String frequencyOfService;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String individualizedProgramPlannedServiceDuration;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String individualizedProgramPlannedServiceFrequency;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String individualizedProgramPlannedServiceStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String individualizedProgramPlannedServiceType;

        /**
         * Gets the value of the frequencyOfService property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFrequencyOfService() {
            return frequencyOfService;
        }

        /**
         * Sets the value of the frequencyOfService property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFrequencyOfService(String value) {
            this.frequencyOfService = value;
        }

        /**
         * Gets the value of the individualizedProgramPlannedServiceDuration property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndividualizedProgramPlannedServiceDuration() {
            return individualizedProgramPlannedServiceDuration;
        }

        /**
         * Sets the value of the individualizedProgramPlannedServiceDuration property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndividualizedProgramPlannedServiceDuration(String value) {
            this.individualizedProgramPlannedServiceDuration = value;
        }

        /**
         * Gets the value of the individualizedProgramPlannedServiceFrequency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndividualizedProgramPlannedServiceFrequency() {
            return individualizedProgramPlannedServiceFrequency;
        }

        /**
         * Sets the value of the individualizedProgramPlannedServiceFrequency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndividualizedProgramPlannedServiceFrequency(String value) {
            this.individualizedProgramPlannedServiceFrequency = value;
        }

        /**
         * Gets the value of the individualizedProgramPlannedServiceStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndividualizedProgramPlannedServiceStartDate() {
            return individualizedProgramPlannedServiceStartDate;
        }

        /**
         * Sets the value of the individualizedProgramPlannedServiceStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndividualizedProgramPlannedServiceStartDate(String value) {
            this.individualizedProgramPlannedServiceStartDate = value;
        }

        /**
         * Gets the value of the individualizedProgramPlannedServiceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndividualizedProgramPlannedServiceType() {
            return individualizedProgramPlannedServiceType;
        }

        /**
         * Sets the value of the individualizedProgramPlannedServiceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndividualizedProgramPlannedServiceType(String value) {
            this.individualizedProgramPlannedServiceType = value;
        }

    }

}
