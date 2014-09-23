
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
 * <p>Java class for elStaffType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="elStaffType">
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
 *                             &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="staffIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                                     &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                   &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="americanIndianOrAlaskaNative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="asian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="blackOrAfricanAmerican" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nativeHawaiianOrOtherPacificIslander" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="white" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hispanicOrLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="education" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="institutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="levelOfSpecializationInEarlylearning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="degreeOrCertificateTitleOrSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="degreeOrCertificateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="degreeOrCertificateConferringDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="totalApprovedEarlyChildhoodCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="approvedEarlyChildhoodCreditsEarnedByNonECEDegreeHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="totalCollegeCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolAgeEducationPostsecondaryCreditHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="businessRelatedPostsecondaryCreditHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffEducationEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffEducationWithdrawalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="highestLevelOfEducationCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credentialAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="higherEducationInstitutionAccredidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlyChildhoodDegreeOrCertificateHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="shortNameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="employment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="educationStaffClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hoursWorkedPerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hourlyWage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="WageCollectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="wageVerificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="unionMembershipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="unionMembershipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="itinerantProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="weeksEmployedPerYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="credential" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="professionalCertificateOrLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="license" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="earlyChildhoodCredential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nameOfProfessionalCredentialLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stateIssuingProfessionalCredentialOrLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credentialIssuanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credentialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="childDevelopmentAssociateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="requiredTrainingClockHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalAssociationMembershipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalAssociationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentScholarshipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentFinancialSupportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffProfessionalDevelopmentActivityStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="staffProfessionalDevelopmentActivityCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseCreditUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cPRCertificationExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="firstAidCertificationExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlyLearningCoreKnowledgeArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stateApprovedTrainerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stateApprovedTechnicalAssistanceProviderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="careerEducationPlanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="careerEducationPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="earlyLearningProfessionalDevelopmentTopicArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentAudienceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentPublishActivityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="instructor" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="staffMemberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="staffMemberIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressApartmentRoomOrSuiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressStreetNumberAndName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressTypeForStaff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="generationCodeOrSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="lastOrSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="personalTitleOrPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="positionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="primaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="telephoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="professionalDevelopmentEvent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="professionalDevelopmentActivityEducationLevelsAddressed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="professionalDevelopmentActivity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="professionalDevelopmentActivityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityApprovedFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityCreditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityCredits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityObjective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityTargetAudience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalDevelopmentActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="session" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="professionalDevelopmentSessionCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionEvaluationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionEvaluationScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentSessionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentFundingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentInstructionalDeliveryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="professionalDevelopmentInstructorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="sponsoringAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="sessionLocation" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="professionalDevelopmentSessionLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressStreetNumberAndName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressApartmentRoomOrSuiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="stateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="addressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "elStaffType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "identity",
    "contact",
    "demographic",
    "education",
    "employment",
    "credential",
    "languageList",
    "license",
    "professionalDevelopment",
    "professionalDevelopmentEvent",
    "professionalDevelopmentActivity"
})
public class ElStaffType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.Identity identity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.Contact contact;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.Demographic demographic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.Education education;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.Employment employment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.Credential credential;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.LanguageList languageList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.License license;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.ProfessionalDevelopment professionalDevelopment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.ProfessionalDevelopmentEvent professionalDevelopmentEvent;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected ElStaffType.ProfessionalDevelopmentActivity professionalDevelopmentActivity;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.Identity }
     *     
     */
    public ElStaffType.Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.Identity }
     *     
     */
    public void setIdentity(ElStaffType.Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.Contact }
     *     
     */
    public ElStaffType.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.Contact }
     *     
     */
    public void setContact(ElStaffType.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the demographic property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.Demographic }
     *     
     */
    public ElStaffType.Demographic getDemographic() {
        return demographic;
    }

    /**
     * Sets the value of the demographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.Demographic }
     *     
     */
    public void setDemographic(ElStaffType.Demographic value) {
        this.demographic = value;
    }

    /**
     * Gets the value of the education property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.Education }
     *     
     */
    public ElStaffType.Education getEducation() {
        return education;
    }

    /**
     * Sets the value of the education property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.Education }
     *     
     */
    public void setEducation(ElStaffType.Education value) {
        this.education = value;
    }

    /**
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.Employment }
     *     
     */
    public ElStaffType.Employment getEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.Employment }
     *     
     */
    public void setEmployment(ElStaffType.Employment value) {
        this.employment = value;
    }

    /**
     * Gets the value of the credential property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.Credential }
     *     
     */
    public ElStaffType.Credential getCredential() {
        return credential;
    }

    /**
     * Sets the value of the credential property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.Credential }
     *     
     */
    public void setCredential(ElStaffType.Credential value) {
        this.credential = value;
    }

    /**
     * Gets the value of the languageList property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.LanguageList }
     *     
     */
    public ElStaffType.LanguageList getLanguageList() {
        return languageList;
    }

    /**
     * Sets the value of the languageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.LanguageList }
     *     
     */
    public void setLanguageList(ElStaffType.LanguageList value) {
        this.languageList = value;
    }

    /**
     * Gets the value of the license property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.License }
     *     
     */
    public ElStaffType.License getLicense() {
        return license;
    }

    /**
     * Sets the value of the license property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.License }
     *     
     */
    public void setLicense(ElStaffType.License value) {
        this.license = value;
    }

    /**
     * Gets the value of the professionalDevelopment property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.ProfessionalDevelopment }
     *     
     */
    public ElStaffType.ProfessionalDevelopment getProfessionalDevelopment() {
        return professionalDevelopment;
    }

    /**
     * Sets the value of the professionalDevelopment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.ProfessionalDevelopment }
     *     
     */
    public void setProfessionalDevelopment(ElStaffType.ProfessionalDevelopment value) {
        this.professionalDevelopment = value;
    }

    /**
     * Gets the value of the professionalDevelopmentEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.ProfessionalDevelopmentEvent }
     *     
     */
    public ElStaffType.ProfessionalDevelopmentEvent getProfessionalDevelopmentEvent() {
        return professionalDevelopmentEvent;
    }

    /**
     * Sets the value of the professionalDevelopmentEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.ProfessionalDevelopmentEvent }
     *     
     */
    public void setProfessionalDevelopmentEvent(ElStaffType.ProfessionalDevelopmentEvent value) {
        this.professionalDevelopmentEvent = value;
    }

    /**
     * Gets the value of the professionalDevelopmentActivity property.
     * 
     * @return
     *     possible object is
     *     {@link ElStaffType.ProfessionalDevelopmentActivity }
     *     
     */
    public ElStaffType.ProfessionalDevelopmentActivity getProfessionalDevelopmentActivity() {
        return professionalDevelopmentActivity;
    }

    /**
     * Sets the value of the professionalDevelopmentActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElStaffType.ProfessionalDevelopmentActivity }
     *     
     */
    public void setProfessionalDevelopmentActivity(ElStaffType.ProfessionalDevelopmentActivity value) {
        this.professionalDevelopmentActivity = value;
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
     *                           &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        protected ElStaffType.Contact.AddressList addressList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElStaffType.Contact.PhoneNumberList phoneNumberList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElStaffType.Contact.EmailList emailList;

        /**
         * Gets the value of the addressList property.
         * 
         * @return
         *     possible object is
         *     {@link ElStaffType.Contact.AddressList }
         *     
         */
        public ElStaffType.Contact.AddressList getAddressList() {
            return addressList;
        }

        /**
         * Sets the value of the addressList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElStaffType.Contact.AddressList }
         *     
         */
        public void setAddressList(ElStaffType.Contact.AddressList value) {
            this.addressList = value;
        }

        /**
         * Gets the value of the phoneNumberList property.
         * 
         * @return
         *     possible object is
         *     {@link ElStaffType.Contact.PhoneNumberList }
         *     
         */
        public ElStaffType.Contact.PhoneNumberList getPhoneNumberList() {
            return phoneNumberList;
        }

        /**
         * Sets the value of the phoneNumberList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElStaffType.Contact.PhoneNumberList }
         *     
         */
        public void setPhoneNumberList(ElStaffType.Contact.PhoneNumberList value) {
            this.phoneNumberList = value;
        }

        /**
         * Gets the value of the emailList property.
         * 
         * @return
         *     possible object is
         *     {@link ElStaffType.Contact.EmailList }
         *     
         */
        public ElStaffType.Contact.EmailList getEmailList() {
            return emailList;
        }

        /**
         * Sets the value of the emailList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElStaffType.Contact.EmailList }
         *     
         */
        public void setEmailList(ElStaffType.Contact.EmailList value) {
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
            protected List<ElStaffType.Contact.AddressList.Address> address;

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
             * {@link ElStaffType.Contact.AddressList.Address }
             * 
             * 
             */
            public List<ElStaffType.Contact.AddressList.Address> getAddress() {
                if (address == null) {
                    address = new ArrayList<ElStaffType.Contact.AddressList.Address>();
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
                protected ElStaffType.Contact.AddressList.Address.Street street;
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
                 *     {@link ElStaffType.Contact.AddressList.Address.Street }
                 *     
                 */
                public ElStaffType.Contact.AddressList.Address.Street getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ElStaffType.Contact.AddressList.Address.Street }
                 *     
                 */
                public void setStreet(ElStaffType.Contact.AddressList.Address.Street value) {
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
         *                 &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            protected List<ElStaffType.Contact.EmailList.Email> email;

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
             * {@link ElStaffType.Contact.EmailList.Email }
             * 
             * 
             */
            public List<ElStaffType.Contact.EmailList.Email> getEmail() {
                if (email == null) {
                    email = new ArrayList<ElStaffType.Contact.EmailList.Email>();
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
             *       &lt;attribute name="emailType" type="{http://www.w3.org/2001/XMLSchema}string" />
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

                @XmlAttribute(name = "emailType")
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
            protected List<ElStaffType.Contact.PhoneNumberList.PhoneNumber> phoneNumber;

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
             * {@link ElStaffType.Contact.PhoneNumberList.PhoneNumber }
             * 
             * 
             */
            public List<ElStaffType.Contact.PhoneNumberList.PhoneNumber> getPhoneNumber() {
                if (phoneNumber == null) {
                    phoneNumber = new ArrayList<ElStaffType.Contact.PhoneNumberList.PhoneNumber>();
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
     *         &lt;element name="professionalCertificateOrLicenseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "professionalCertificateOrLicenseNumber"
    })
    public static class Credential {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalCertificateOrLicenseNumber;

        /**
         * Gets the value of the professionalCertificateOrLicenseNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalCertificateOrLicenseNumber() {
            return professionalCertificateOrLicenseNumber;
        }

        /**
         * Sets the value of the professionalCertificateOrLicenseNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalCertificateOrLicenseNumber(String value) {
            this.professionalCertificateOrLicenseNumber = value;
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
     *         &lt;element name="birthdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="americanIndianOrAlaskaNative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="asian" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="blackOrAfricanAmerican" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nativeHawaiianOrOtherPacificIslander" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="white" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hispanicOrLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "americanIndianOrAlaskaNative",
        "asian",
        "blackOrAfricanAmerican",
        "nativeHawaiianOrOtherPacificIslander",
        "white",
        "hispanicOrLatinoEthnicity"
    })
    public static class Demographic {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String birthdate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sex;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String americanIndianOrAlaskaNative;
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
     *         &lt;element name="institutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="levelOfSpecializationInEarlylearning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="degreeOrCertificateTitleOrSubject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="degreeOrCertificateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="degreeOrCertificateConferringDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="totalApprovedEarlyChildhoodCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="approvedEarlyChildhoodCreditsEarnedByNonECEDegreeHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="totalCollegeCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolAgeEducationPostsecondaryCreditHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="businessRelatedPostsecondaryCreditHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffEducationEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffEducationWithdrawalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="highestLevelOfEducationCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credentialAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="higherEducationInstitutionAccredidationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlyChildhoodDegreeOrCertificateHolder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "institutionName",
        "levelOfSpecializationInEarlylearning",
        "degreeOrCertificateTitleOrSubject",
        "degreeOrCertificateType",
        "degreeOrCertificateConferringDate",
        "totalApprovedEarlyChildhoodCreditsEarned",
        "approvedEarlyChildhoodCreditsEarnedByNonECEDegreeHolder",
        "totalCollegeCreditsEarned",
        "schoolAgeEducationPostsecondaryCreditHours",
        "businessRelatedPostsecondaryCreditHours",
        "staffEducationEntryDate",
        "staffEducationWithdrawalDate",
        "highestLevelOfEducationCompleted",
        "credentialAwardDate",
        "higherEducationInstitutionAccredidationStatus",
        "earlyChildhoodDegreeOrCertificateHolder",
        "shortNameOfInstitution"
    })
    public static class Education {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String institutionName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String levelOfSpecializationInEarlylearning;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String degreeOrCertificateTitleOrSubject;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String degreeOrCertificateType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String degreeOrCertificateConferringDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String totalApprovedEarlyChildhoodCreditsEarned;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String approvedEarlyChildhoodCreditsEarnedByNonECEDegreeHolder;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String totalCollegeCreditsEarned;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolAgeEducationPostsecondaryCreditHours;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String businessRelatedPostsecondaryCreditHours;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffEducationEntryDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffEducationWithdrawalDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String highestLevelOfEducationCompleted;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String credentialAwardDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String higherEducationInstitutionAccredidationStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyChildhoodDegreeOrCertificateHolder;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String shortNameOfInstitution;

        /**
         * Gets the value of the institutionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstitutionName() {
            return institutionName;
        }

        /**
         * Sets the value of the institutionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstitutionName(String value) {
            this.institutionName = value;
        }

        /**
         * Gets the value of the levelOfSpecializationInEarlylearning property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLevelOfSpecializationInEarlylearning() {
            return levelOfSpecializationInEarlylearning;
        }

        /**
         * Sets the value of the levelOfSpecializationInEarlylearning property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLevelOfSpecializationInEarlylearning(String value) {
            this.levelOfSpecializationInEarlylearning = value;
        }

        /**
         * Gets the value of the degreeOrCertificateTitleOrSubject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDegreeOrCertificateTitleOrSubject() {
            return degreeOrCertificateTitleOrSubject;
        }

        /**
         * Sets the value of the degreeOrCertificateTitleOrSubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDegreeOrCertificateTitleOrSubject(String value) {
            this.degreeOrCertificateTitleOrSubject = value;
        }

        /**
         * Gets the value of the degreeOrCertificateType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDegreeOrCertificateType() {
            return degreeOrCertificateType;
        }

        /**
         * Sets the value of the degreeOrCertificateType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDegreeOrCertificateType(String value) {
            this.degreeOrCertificateType = value;
        }

        /**
         * Gets the value of the degreeOrCertificateConferringDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDegreeOrCertificateConferringDate() {
            return degreeOrCertificateConferringDate;
        }

        /**
         * Sets the value of the degreeOrCertificateConferringDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDegreeOrCertificateConferringDate(String value) {
            this.degreeOrCertificateConferringDate = value;
        }

        /**
         * Gets the value of the totalApprovedEarlyChildhoodCreditsEarned property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalApprovedEarlyChildhoodCreditsEarned() {
            return totalApprovedEarlyChildhoodCreditsEarned;
        }

        /**
         * Sets the value of the totalApprovedEarlyChildhoodCreditsEarned property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalApprovedEarlyChildhoodCreditsEarned(String value) {
            this.totalApprovedEarlyChildhoodCreditsEarned = value;
        }

        /**
         * Gets the value of the approvedEarlyChildhoodCreditsEarnedByNonECEDegreeHolder property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApprovedEarlyChildhoodCreditsEarnedByNonECEDegreeHolder() {
            return approvedEarlyChildhoodCreditsEarnedByNonECEDegreeHolder;
        }

        /**
         * Sets the value of the approvedEarlyChildhoodCreditsEarnedByNonECEDegreeHolder property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApprovedEarlyChildhoodCreditsEarnedByNonECEDegreeHolder(String value) {
            this.approvedEarlyChildhoodCreditsEarnedByNonECEDegreeHolder = value;
        }

        /**
         * Gets the value of the totalCollegeCreditsEarned property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalCollegeCreditsEarned() {
            return totalCollegeCreditsEarned;
        }

        /**
         * Sets the value of the totalCollegeCreditsEarned property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalCollegeCreditsEarned(String value) {
            this.totalCollegeCreditsEarned = value;
        }

        /**
         * Gets the value of the schoolAgeEducationPostsecondaryCreditHours property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolAgeEducationPostsecondaryCreditHours() {
            return schoolAgeEducationPostsecondaryCreditHours;
        }

        /**
         * Sets the value of the schoolAgeEducationPostsecondaryCreditHours property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolAgeEducationPostsecondaryCreditHours(String value) {
            this.schoolAgeEducationPostsecondaryCreditHours = value;
        }

        /**
         * Gets the value of the businessRelatedPostsecondaryCreditHours property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBusinessRelatedPostsecondaryCreditHours() {
            return businessRelatedPostsecondaryCreditHours;
        }

        /**
         * Sets the value of the businessRelatedPostsecondaryCreditHours property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBusinessRelatedPostsecondaryCreditHours(String value) {
            this.businessRelatedPostsecondaryCreditHours = value;
        }

        /**
         * Gets the value of the staffEducationEntryDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffEducationEntryDate() {
            return staffEducationEntryDate;
        }

        /**
         * Sets the value of the staffEducationEntryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffEducationEntryDate(String value) {
            this.staffEducationEntryDate = value;
        }

        /**
         * Gets the value of the staffEducationWithdrawalDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffEducationWithdrawalDate() {
            return staffEducationWithdrawalDate;
        }

        /**
         * Sets the value of the staffEducationWithdrawalDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffEducationWithdrawalDate(String value) {
            this.staffEducationWithdrawalDate = value;
        }

        /**
         * Gets the value of the highestLevelOfEducationCompleted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHighestLevelOfEducationCompleted() {
            return highestLevelOfEducationCompleted;
        }

        /**
         * Sets the value of the highestLevelOfEducationCompleted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHighestLevelOfEducationCompleted(String value) {
            this.highestLevelOfEducationCompleted = value;
        }

        /**
         * Gets the value of the credentialAwardDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCredentialAwardDate() {
            return credentialAwardDate;
        }

        /**
         * Sets the value of the credentialAwardDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCredentialAwardDate(String value) {
            this.credentialAwardDate = value;
        }

        /**
         * Gets the value of the higherEducationInstitutionAccredidationStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHigherEducationInstitutionAccredidationStatus() {
            return higherEducationInstitutionAccredidationStatus;
        }

        /**
         * Sets the value of the higherEducationInstitutionAccredidationStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHigherEducationInstitutionAccredidationStatus(String value) {
            this.higherEducationInstitutionAccredidationStatus = value;
        }

        /**
         * Gets the value of the earlyChildhoodDegreeOrCertificateHolder property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyChildhoodDegreeOrCertificateHolder() {
            return earlyChildhoodDegreeOrCertificateHolder;
        }

        /**
         * Sets the value of the earlyChildhoodDegreeOrCertificateHolder property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyChildhoodDegreeOrCertificateHolder(String value) {
            this.earlyChildhoodDegreeOrCertificateHolder = value;
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
     *         &lt;element name="educationStaffClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hireDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hoursWorkedPerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hourlyWage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="WageCollectionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="wageVerificationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="organizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="unionMembershipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="unionMembershipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="itinerantProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="weeksEmployedPerYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "educationStaffClassification",
        "hireDate",
        "employmentStartDate",
        "employmentEndDate",
        "employmentStatus",
        "hoursWorkedPerWeek",
        "hourlyWage",
        "wageCollectionCode",
        "wageVerificationCode",
        "organizationName",
        "unionMembershipStatus",
        "unionMembershipName",
        "itinerantProvider",
        "weeksEmployedPerYear"
    })
    public static class Employment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String educationStaffClassification;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hireDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hoursWorkedPerWeek;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hourlyWage;
        @XmlElement(name = "WageCollectionCode", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String wageCollectionCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String wageVerificationCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String organizationName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String unionMembershipStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String unionMembershipName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String itinerantProvider;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String weeksEmployedPerYear;

        /**
         * Gets the value of the educationStaffClassification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEducationStaffClassification() {
            return educationStaffClassification;
        }

        /**
         * Sets the value of the educationStaffClassification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEducationStaffClassification(String value) {
            this.educationStaffClassification = value;
        }

        /**
         * Gets the value of the hireDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHireDate() {
            return hireDate;
        }

        /**
         * Sets the value of the hireDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHireDate(String value) {
            this.hireDate = value;
        }

        /**
         * Gets the value of the employmentStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentStartDate() {
            return employmentStartDate;
        }

        /**
         * Sets the value of the employmentStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentStartDate(String value) {
            this.employmentStartDate = value;
        }

        /**
         * Gets the value of the employmentEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentEndDate() {
            return employmentEndDate;
        }

        /**
         * Sets the value of the employmentEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentEndDate(String value) {
            this.employmentEndDate = value;
        }

        /**
         * Gets the value of the employmentStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentStatus() {
            return employmentStatus;
        }

        /**
         * Sets the value of the employmentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentStatus(String value) {
            this.employmentStatus = value;
        }

        /**
         * Gets the value of the hoursWorkedPerWeek property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHoursWorkedPerWeek() {
            return hoursWorkedPerWeek;
        }

        /**
         * Sets the value of the hoursWorkedPerWeek property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHoursWorkedPerWeek(String value) {
            this.hoursWorkedPerWeek = value;
        }

        /**
         * Gets the value of the hourlyWage property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHourlyWage() {
            return hourlyWage;
        }

        /**
         * Sets the value of the hourlyWage property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHourlyWage(String value) {
            this.hourlyWage = value;
        }

        /**
         * Gets the value of the wageCollectionCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWageCollectionCode() {
            return wageCollectionCode;
        }

        /**
         * Sets the value of the wageCollectionCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWageCollectionCode(String value) {
            this.wageCollectionCode = value;
        }

        /**
         * Gets the value of the wageVerificationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWageVerificationCode() {
            return wageVerificationCode;
        }

        /**
         * Sets the value of the wageVerificationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWageVerificationCode(String value) {
            this.wageVerificationCode = value;
        }

        /**
         * Gets the value of the organizationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrganizationName() {
            return organizationName;
        }

        /**
         * Sets the value of the organizationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrganizationName(String value) {
            this.organizationName = value;
        }

        /**
         * Gets the value of the unionMembershipStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnionMembershipStatus() {
            return unionMembershipStatus;
        }

        /**
         * Sets the value of the unionMembershipStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnionMembershipStatus(String value) {
            this.unionMembershipStatus = value;
        }

        /**
         * Gets the value of the unionMembershipName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnionMembershipName() {
            return unionMembershipName;
        }

        /**
         * Sets the value of the unionMembershipName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnionMembershipName(String value) {
            this.unionMembershipName = value;
        }

        /**
         * Gets the value of the itinerantProvider property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItinerantProvider() {
            return itinerantProvider;
        }

        /**
         * Sets the value of the itinerantProvider property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItinerantProvider(String value) {
            this.itinerantProvider = value;
        }

        /**
         * Gets the value of the weeksEmployedPerYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWeeksEmployedPerYear() {
            return weeksEmployedPerYear;
        }

        /**
         * Sets the value of the weeksEmployedPerYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWeeksEmployedPerYear(String value) {
            this.weeksEmployedPerYear = value;
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
     *                   &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="staffIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected ElStaffType.Identity.Name name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElStaffType.Identity.OtherNameList otherNameList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElStaffType.Identity.Identifier identifier;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link ElStaffType.Identity.Name }
         *     
         */
        public ElStaffType.Identity.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElStaffType.Identity.Name }
         *     
         */
        public void setName(ElStaffType.Identity.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the otherNameList property.
         * 
         * @return
         *     possible object is
         *     {@link ElStaffType.Identity.OtherNameList }
         *     
         */
        public ElStaffType.Identity.OtherNameList getOtherNameList() {
            return otherNameList;
        }

        /**
         * Sets the value of the otherNameList property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElStaffType.Identity.OtherNameList }
         *     
         */
        public void setOtherNameList(ElStaffType.Identity.OtherNameList value) {
            this.otherNameList = value;
        }

        /**
         * Gets the value of the identifier property.
         * 
         * @return
         *     possible object is
         *     {@link ElStaffType.Identity.Identifier }
         *     
         */
        public ElStaffType.Identity.Identifier getIdentifier() {
            return identifier;
        }

        /**
         * Sets the value of the identifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElStaffType.Identity.Identifier }
         *     
         */
        public void setIdentifier(ElStaffType.Identity.Identifier value) {
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
         *         &lt;element name="staffId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="staffIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "staffId",
            "staffIdSystem"
        })
        public static class Identifier {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String staffId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String staffIdSystem;

            /**
             * Gets the value of the staffId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStaffId() {
                return staffId;
            }

            /**
             * Sets the value of the staffId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStaffId(String value) {
                this.staffId = value;
            }

            /**
             * Gets the value of the staffIdSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStaffIdSystem() {
                return staffIdSystem;
            }

            /**
             * Sets the value of the staffIdSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStaffIdSystem(String value) {
                this.staffIdSystem = value;
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
            protected List<ElStaffType.Identity.OtherNameList.OtherName> otherName;

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
             * {@link ElStaffType.Identity.OtherNameList.OtherName }
             * 
             * 
             */
            public List<ElStaffType.Identity.OtherNameList.OtherName> getOtherName() {
                if (otherName == null) {
                    otherName = new ArrayList<ElStaffType.Identity.OtherNameList.OtherName>();
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
        protected List<ElStaffType.LanguageList.Language> language;

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
         * {@link ElStaffType.LanguageList.Language }
         * 
         * 
         */
        public List<ElStaffType.LanguageList.Language> getLanguage() {
            if (language == null) {
                language = new ArrayList<ElStaffType.LanguageList.Language>();
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
     *         &lt;element name="earlyChildhoodCredential" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nameOfProfessionalCredentialLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stateIssuingProfessionalCredentialOrLicense" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credentialIssuanceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credentialExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="childDevelopmentAssociateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "earlyChildhoodCredential",
        "nameOfProfessionalCredentialLicense",
        "stateIssuingProfessionalCredentialOrLicense",
        "credentialIssuanceDate",
        "credentialExpirationDate",
        "childDevelopmentAssociateType"
    })
    public static class License {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyChildhoodCredential;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String nameOfProfessionalCredentialLicense;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String stateIssuingProfessionalCredentialOrLicense;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String credentialIssuanceDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String credentialExpirationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String childDevelopmentAssociateType;

        /**
         * Gets the value of the earlyChildhoodCredential property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyChildhoodCredential() {
            return earlyChildhoodCredential;
        }

        /**
         * Sets the value of the earlyChildhoodCredential property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyChildhoodCredential(String value) {
            this.earlyChildhoodCredential = value;
        }

        /**
         * Gets the value of the nameOfProfessionalCredentialLicense property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameOfProfessionalCredentialLicense() {
            return nameOfProfessionalCredentialLicense;
        }

        /**
         * Sets the value of the nameOfProfessionalCredentialLicense property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameOfProfessionalCredentialLicense(String value) {
            this.nameOfProfessionalCredentialLicense = value;
        }

        /**
         * Gets the value of the stateIssuingProfessionalCredentialOrLicense property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateIssuingProfessionalCredentialOrLicense() {
            return stateIssuingProfessionalCredentialOrLicense;
        }

        /**
         * Sets the value of the stateIssuingProfessionalCredentialOrLicense property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateIssuingProfessionalCredentialOrLicense(String value) {
            this.stateIssuingProfessionalCredentialOrLicense = value;
        }

        /**
         * Gets the value of the credentialIssuanceDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCredentialIssuanceDate() {
            return credentialIssuanceDate;
        }

        /**
         * Sets the value of the credentialIssuanceDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCredentialIssuanceDate(String value) {
            this.credentialIssuanceDate = value;
        }

        /**
         * Gets the value of the credentialExpirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCredentialExpirationDate() {
            return credentialExpirationDate;
        }

        /**
         * Sets the value of the credentialExpirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCredentialExpirationDate(String value) {
            this.credentialExpirationDate = value;
        }

        /**
         * Gets the value of the childDevelopmentAssociateType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChildDevelopmentAssociateType() {
            return childDevelopmentAssociateType;
        }

        /**
         * Sets the value of the childDevelopmentAssociateType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChildDevelopmentAssociateType(String value) {
            this.childDevelopmentAssociateType = value;
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
     *         &lt;element name="requiredTrainingClockHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalAssociationMembershipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalAssociationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentScholarshipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentFinancialSupportType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffProfessionalDevelopmentActivityStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="staffProfessionalDevelopmentActivityCompletionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseCreditUnits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cPRCertificationExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="firstAidCertificationExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlyLearningCoreKnowledgeArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stateApprovedTrainerStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stateApprovedTechnicalAssistanceProviderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="careerEducationPlanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="careerEducationPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="earlyLearningProfessionalDevelopmentTopicArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentAudienceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentPublishActivityIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="instructor" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="staffMemberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="staffMemberIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressApartmentRoomOrSuiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressStreetNumberAndName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressTypeForStaff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="generationCodeOrSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="lastOrSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="personalTitleOrPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="positionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="primaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="telephoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "requiredTrainingClockHours",
        "professionalAssociationMembershipStatus",
        "professionalAssociationName",
        "professionalDevelopmentScholarshipStatus",
        "professionalDevelopmentFinancialSupportType",
        "staffProfessionalDevelopmentActivityStartDate",
        "staffProfessionalDevelopmentActivityCompletionDate",
        "numberOfCreditsEarned",
        "courseCreditUnits",
        "cprCertificationExpirationDate",
        "firstAidCertificationExpirationDate",
        "earlyLearningCoreKnowledgeArea",
        "stateApprovedTrainerStatus",
        "stateApprovedTechnicalAssistanceProviderStatus",
        "careerEducationPlanDate",
        "careerEducationPlanType",
        "earlyLearningProfessionalDevelopmentTopicArea",
        "professionalDevelopmentAudienceType",
        "professionalDevelopmentPublishActivityIndicator",
        "instructor"
    })
    public static class ProfessionalDevelopment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String requiredTrainingClockHours;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalAssociationMembershipStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalAssociationName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentScholarshipStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentFinancialSupportType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffProfessionalDevelopmentActivityStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String staffProfessionalDevelopmentActivityCompletionDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfCreditsEarned;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String courseCreditUnits;
        @XmlElement(name = "cPRCertificationExpirationDate", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cprCertificationExpirationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String firstAidCertificationExpirationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyLearningCoreKnowledgeArea;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String stateApprovedTrainerStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String stateApprovedTechnicalAssistanceProviderStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String careerEducationPlanDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String careerEducationPlanType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String earlyLearningProfessionalDevelopmentTopicArea;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentAudienceType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentPublishActivityIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElStaffType.ProfessionalDevelopment.Instructor instructor;

        /**
         * Gets the value of the requiredTrainingClockHours property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequiredTrainingClockHours() {
            return requiredTrainingClockHours;
        }

        /**
         * Sets the value of the requiredTrainingClockHours property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequiredTrainingClockHours(String value) {
            this.requiredTrainingClockHours = value;
        }

        /**
         * Gets the value of the professionalAssociationMembershipStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalAssociationMembershipStatus() {
            return professionalAssociationMembershipStatus;
        }

        /**
         * Sets the value of the professionalAssociationMembershipStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalAssociationMembershipStatus(String value) {
            this.professionalAssociationMembershipStatus = value;
        }

        /**
         * Gets the value of the professionalAssociationName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalAssociationName() {
            return professionalAssociationName;
        }

        /**
         * Sets the value of the professionalAssociationName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalAssociationName(String value) {
            this.professionalAssociationName = value;
        }

        /**
         * Gets the value of the professionalDevelopmentScholarshipStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentScholarshipStatus() {
            return professionalDevelopmentScholarshipStatus;
        }

        /**
         * Sets the value of the professionalDevelopmentScholarshipStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentScholarshipStatus(String value) {
            this.professionalDevelopmentScholarshipStatus = value;
        }

        /**
         * Gets the value of the professionalDevelopmentFinancialSupportType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentFinancialSupportType() {
            return professionalDevelopmentFinancialSupportType;
        }

        /**
         * Sets the value of the professionalDevelopmentFinancialSupportType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentFinancialSupportType(String value) {
            this.professionalDevelopmentFinancialSupportType = value;
        }

        /**
         * Gets the value of the staffProfessionalDevelopmentActivityStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffProfessionalDevelopmentActivityStartDate() {
            return staffProfessionalDevelopmentActivityStartDate;
        }

        /**
         * Sets the value of the staffProfessionalDevelopmentActivityStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffProfessionalDevelopmentActivityStartDate(String value) {
            this.staffProfessionalDevelopmentActivityStartDate = value;
        }

        /**
         * Gets the value of the staffProfessionalDevelopmentActivityCompletionDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStaffProfessionalDevelopmentActivityCompletionDate() {
            return staffProfessionalDevelopmentActivityCompletionDate;
        }

        /**
         * Sets the value of the staffProfessionalDevelopmentActivityCompletionDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStaffProfessionalDevelopmentActivityCompletionDate(String value) {
            this.staffProfessionalDevelopmentActivityCompletionDate = value;
        }

        /**
         * Gets the value of the numberOfCreditsEarned property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfCreditsEarned() {
            return numberOfCreditsEarned;
        }

        /**
         * Sets the value of the numberOfCreditsEarned property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfCreditsEarned(String value) {
            this.numberOfCreditsEarned = value;
        }

        /**
         * Gets the value of the courseCreditUnits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCourseCreditUnits() {
            return courseCreditUnits;
        }

        /**
         * Sets the value of the courseCreditUnits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCourseCreditUnits(String value) {
            this.courseCreditUnits = value;
        }

        /**
         * Gets the value of the cprCertificationExpirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPRCertificationExpirationDate() {
            return cprCertificationExpirationDate;
        }

        /**
         * Sets the value of the cprCertificationExpirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPRCertificationExpirationDate(String value) {
            this.cprCertificationExpirationDate = value;
        }

        /**
         * Gets the value of the firstAidCertificationExpirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstAidCertificationExpirationDate() {
            return firstAidCertificationExpirationDate;
        }

        /**
         * Sets the value of the firstAidCertificationExpirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstAidCertificationExpirationDate(String value) {
            this.firstAidCertificationExpirationDate = value;
        }

        /**
         * Gets the value of the earlyLearningCoreKnowledgeArea property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyLearningCoreKnowledgeArea() {
            return earlyLearningCoreKnowledgeArea;
        }

        /**
         * Sets the value of the earlyLearningCoreKnowledgeArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyLearningCoreKnowledgeArea(String value) {
            this.earlyLearningCoreKnowledgeArea = value;
        }

        /**
         * Gets the value of the stateApprovedTrainerStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateApprovedTrainerStatus() {
            return stateApprovedTrainerStatus;
        }

        /**
         * Sets the value of the stateApprovedTrainerStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateApprovedTrainerStatus(String value) {
            this.stateApprovedTrainerStatus = value;
        }

        /**
         * Gets the value of the stateApprovedTechnicalAssistanceProviderStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateApprovedTechnicalAssistanceProviderStatus() {
            return stateApprovedTechnicalAssistanceProviderStatus;
        }

        /**
         * Sets the value of the stateApprovedTechnicalAssistanceProviderStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateApprovedTechnicalAssistanceProviderStatus(String value) {
            this.stateApprovedTechnicalAssistanceProviderStatus = value;
        }

        /**
         * Gets the value of the careerEducationPlanDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCareerEducationPlanDate() {
            return careerEducationPlanDate;
        }

        /**
         * Sets the value of the careerEducationPlanDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCareerEducationPlanDate(String value) {
            this.careerEducationPlanDate = value;
        }

        /**
         * Gets the value of the careerEducationPlanType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCareerEducationPlanType() {
            return careerEducationPlanType;
        }

        /**
         * Sets the value of the careerEducationPlanType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCareerEducationPlanType(String value) {
            this.careerEducationPlanType = value;
        }

        /**
         * Gets the value of the earlyLearningProfessionalDevelopmentTopicArea property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEarlyLearningProfessionalDevelopmentTopicArea() {
            return earlyLearningProfessionalDevelopmentTopicArea;
        }

        /**
         * Sets the value of the earlyLearningProfessionalDevelopmentTopicArea property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEarlyLearningProfessionalDevelopmentTopicArea(String value) {
            this.earlyLearningProfessionalDevelopmentTopicArea = value;
        }

        /**
         * Gets the value of the professionalDevelopmentAudienceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentAudienceType() {
            return professionalDevelopmentAudienceType;
        }

        /**
         * Sets the value of the professionalDevelopmentAudienceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentAudienceType(String value) {
            this.professionalDevelopmentAudienceType = value;
        }

        /**
         * Gets the value of the professionalDevelopmentPublishActivityIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentPublishActivityIndicator() {
            return professionalDevelopmentPublishActivityIndicator;
        }

        /**
         * Sets the value of the professionalDevelopmentPublishActivityIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentPublishActivityIndicator(String value) {
            this.professionalDevelopmentPublishActivityIndicator = value;
        }

        /**
         * Gets the value of the instructor property.
         * 
         * @return
         *     possible object is
         *     {@link ElStaffType.ProfessionalDevelopment.Instructor }
         *     
         */
        public ElStaffType.ProfessionalDevelopment.Instructor getInstructor() {
            return instructor;
        }

        /**
         * Sets the value of the instructor property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElStaffType.ProfessionalDevelopment.Instructor }
         *     
         */
        public void setInstructor(ElStaffType.ProfessionalDevelopment.Instructor value) {
            this.instructor = value;
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
         *         &lt;element name="staffMemberIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="staffMemberIdentificationSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressApartmentRoomOrSuiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressStreetNumberAndName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressTypeForStaff" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="generationCodeOrSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="lastOrSurname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="personalTitleOrPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="positionTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="primaryTelephoneNumberIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="telephoneNumberType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "staffMemberIdentifier",
            "staffMemberIdentificationSystem",
            "addressApartmentRoomOrSuiteNumber",
            "addressCity",
            "addressPostalCode",
            "addressStreetNumberAndName",
            "addressTypeForStaff",
            "firstName",
            "generationCodeOrSuffix",
            "lastOrSurname",
            "middleName",
            "personalTitleOrPrefix",
            "positionTitle",
            "primaryTelephoneNumberIndicator",
            "stateAbbreviation",
            "telephoneNumber",
            "telephoneNumberType"
        })
        public static class Instructor {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String staffMemberIdentifier;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String staffMemberIdentificationSystem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String addressApartmentRoomOrSuiteNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String addressCity;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String addressPostalCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String addressStreetNumberAndName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String addressTypeForStaff;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String firstName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String generationCodeOrSuffix;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String lastOrSurname;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String middleName;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String personalTitleOrPrefix;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String positionTitle;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String primaryTelephoneNumberIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String stateAbbreviation;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String telephoneNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String telephoneNumberType;

            /**
             * Gets the value of the staffMemberIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStaffMemberIdentifier() {
                return staffMemberIdentifier;
            }

            /**
             * Sets the value of the staffMemberIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStaffMemberIdentifier(String value) {
                this.staffMemberIdentifier = value;
            }

            /**
             * Gets the value of the staffMemberIdentificationSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStaffMemberIdentificationSystem() {
                return staffMemberIdentificationSystem;
            }

            /**
             * Sets the value of the staffMemberIdentificationSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStaffMemberIdentificationSystem(String value) {
                this.staffMemberIdentificationSystem = value;
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
             * Gets the value of the addressTypeForStaff property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddressTypeForStaff() {
                return addressTypeForStaff;
            }

            /**
             * Sets the value of the addressTypeForStaff property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddressTypeForStaff(String value) {
                this.addressTypeForStaff = value;
            }

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
             * Gets the value of the generationCodeOrSuffix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGenerationCodeOrSuffix() {
                return generationCodeOrSuffix;
            }

            /**
             * Sets the value of the generationCodeOrSuffix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGenerationCodeOrSuffix(String value) {
                this.generationCodeOrSuffix = value;
            }

            /**
             * Gets the value of the lastOrSurname property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastOrSurname() {
                return lastOrSurname;
            }

            /**
             * Sets the value of the lastOrSurname property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastOrSurname(String value) {
                this.lastOrSurname = value;
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
             * Gets the value of the personalTitleOrPrefix property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPersonalTitleOrPrefix() {
                return personalTitleOrPrefix;
            }

            /**
             * Sets the value of the personalTitleOrPrefix property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPersonalTitleOrPrefix(String value) {
                this.personalTitleOrPrefix = value;
            }

            /**
             * Gets the value of the positionTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPositionTitle() {
                return positionTitle;
            }

            /**
             * Sets the value of the positionTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPositionTitle(String value) {
                this.positionTitle = value;
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

            /**
             * Gets the value of the telephoneNumberType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTelephoneNumberType() {
                return telephoneNumberType;
            }

            /**
             * Sets the value of the telephoneNumberType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTelephoneNumberType(String value) {
                this.telephoneNumberType = value;
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
     *         &lt;element name="professionalDevelopmentActivityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityApprovalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityApprovedFor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityCost" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityCreditType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityCredits" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityObjective" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityTargetAudience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalDevelopmentActivityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="session" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="professionalDevelopmentSessionCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionEvaluationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionEvaluationScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentSessionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentFundingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentInstructionalDeliveryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="professionalDevelopmentInstructorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="sponsoringAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="sessionLocation" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="professionalDevelopmentSessionLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressStreetNumberAndName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressApartmentRoomOrSuiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="stateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="addressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "professionalDevelopmentActivityIdentifier",
        "professionalDevelopmentActivityExpirationDate",
        "professionalDevelopmentActivityApprovalCode",
        "professionalDevelopmentActivityApprovedFor",
        "professionalDevelopmentActivityCode",
        "professionalDevelopmentActivityCost",
        "professionalDevelopmentActivityCreditType",
        "professionalDevelopmentActivityCredits",
        "professionalDevelopmentActivityDescription",
        "professionalDevelopmentActivityLevel",
        "professionalDevelopmentActivityObjective",
        "professionalDevelopmentActivityTargetAudience",
        "professionalDevelopmentActivityTitle",
        "professionalDevelopmentActivityType",
        "session",
        "sessionLocation"
    })
    public static class ProfessionalDevelopmentActivity {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityExpirationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityApprovalCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityApprovedFor;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityCost;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityCreditType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityCredits;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityLevel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityObjective;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityTargetAudience;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElStaffType.ProfessionalDevelopmentActivity.Session session;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected ElStaffType.ProfessionalDevelopmentActivity.SessionLocation sessionLocation;

        /**
         * Gets the value of the professionalDevelopmentActivityIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityIdentifier() {
            return professionalDevelopmentActivityIdentifier;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityIdentifier(String value) {
            this.professionalDevelopmentActivityIdentifier = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityExpirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityExpirationDate() {
            return professionalDevelopmentActivityExpirationDate;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityExpirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityExpirationDate(String value) {
            this.professionalDevelopmentActivityExpirationDate = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityApprovalCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityApprovalCode() {
            return professionalDevelopmentActivityApprovalCode;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityApprovalCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityApprovalCode(String value) {
            this.professionalDevelopmentActivityApprovalCode = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityApprovedFor property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityApprovedFor() {
            return professionalDevelopmentActivityApprovedFor;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityApprovedFor property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityApprovedFor(String value) {
            this.professionalDevelopmentActivityApprovedFor = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityCode() {
            return professionalDevelopmentActivityCode;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityCode(String value) {
            this.professionalDevelopmentActivityCode = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityCost property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityCost() {
            return professionalDevelopmentActivityCost;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityCost property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityCost(String value) {
            this.professionalDevelopmentActivityCost = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityCreditType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityCreditType() {
            return professionalDevelopmentActivityCreditType;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityCreditType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityCreditType(String value) {
            this.professionalDevelopmentActivityCreditType = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityCredits property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityCredits() {
            return professionalDevelopmentActivityCredits;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityCredits property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityCredits(String value) {
            this.professionalDevelopmentActivityCredits = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityDescription() {
            return professionalDevelopmentActivityDescription;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityDescription(String value) {
            this.professionalDevelopmentActivityDescription = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityLevel() {
            return professionalDevelopmentActivityLevel;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityLevel(String value) {
            this.professionalDevelopmentActivityLevel = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityObjective property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityObjective() {
            return professionalDevelopmentActivityObjective;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityObjective property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityObjective(String value) {
            this.professionalDevelopmentActivityObjective = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityTargetAudience property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityTargetAudience() {
            return professionalDevelopmentActivityTargetAudience;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityTargetAudience property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityTargetAudience(String value) {
            this.professionalDevelopmentActivityTargetAudience = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityTitle() {
            return professionalDevelopmentActivityTitle;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityTitle(String value) {
            this.professionalDevelopmentActivityTitle = value;
        }

        /**
         * Gets the value of the professionalDevelopmentActivityType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityType() {
            return professionalDevelopmentActivityType;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityType(String value) {
            this.professionalDevelopmentActivityType = value;
        }

        /**
         * Gets the value of the session property.
         * 
         * @return
         *     possible object is
         *     {@link ElStaffType.ProfessionalDevelopmentActivity.Session }
         *     
         */
        public ElStaffType.ProfessionalDevelopmentActivity.Session getSession() {
            return session;
        }

        /**
         * Sets the value of the session property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElStaffType.ProfessionalDevelopmentActivity.Session }
         *     
         */
        public void setSession(ElStaffType.ProfessionalDevelopmentActivity.Session value) {
            this.session = value;
        }

        /**
         * Gets the value of the sessionLocation property.
         * 
         * @return
         *     possible object is
         *     {@link ElStaffType.ProfessionalDevelopmentActivity.SessionLocation }
         *     
         */
        public ElStaffType.ProfessionalDevelopmentActivity.SessionLocation getSessionLocation() {
            return sessionLocation;
        }

        /**
         * Sets the value of the sessionLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link ElStaffType.ProfessionalDevelopmentActivity.SessionLocation }
         *     
         */
        public void setSessionLocation(ElStaffType.ProfessionalDevelopmentActivity.SessionLocation value) {
            this.sessionLocation = value;
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
         *         &lt;element name="professionalDevelopmentSessionCapacity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionEndTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionEvaluationMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionEvaluationScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionStartTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentSessionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentDeliveryMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentFundingSource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentInstructionalDeliveryMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="professionalDevelopmentInstructorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="sponsoringAgencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "professionalDevelopmentSessionCapacity",
            "professionalDevelopmentSessionEndDate",
            "professionalDevelopmentSessionEndTime",
            "professionalDevelopmentSessionEvaluationMethod",
            "professionalDevelopmentSessionEvaluationScore",
            "professionalDevelopmentSessionIdentifier",
            "professionalDevelopmentSessionStartDate",
            "professionalDevelopmentSessionStartTime",
            "professionalDevelopmentSessionStatus",
            "professionalDevelopmentDeliveryMethod",
            "professionalDevelopmentFundingSource",
            "professionalDevelopmentInstructionalDeliveryMode",
            "professionalDevelopmentInstructorIdentifier",
            "sponsoringAgencyName"
        })
        public static class Session {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionCapacity;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionEndDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionEndTime;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionEvaluationMethod;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionEvaluationScore;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionIdentifier;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionStartDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionStartTime;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentDeliveryMethod;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentFundingSource;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentInstructionalDeliveryMode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentInstructorIdentifier;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String sponsoringAgencyName;

            /**
             * Gets the value of the professionalDevelopmentSessionCapacity property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentSessionCapacity() {
                return professionalDevelopmentSessionCapacity;
            }

            /**
             * Sets the value of the professionalDevelopmentSessionCapacity property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentSessionCapacity(String value) {
                this.professionalDevelopmentSessionCapacity = value;
            }

            /**
             * Gets the value of the professionalDevelopmentSessionEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentSessionEndDate() {
                return professionalDevelopmentSessionEndDate;
            }

            /**
             * Sets the value of the professionalDevelopmentSessionEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentSessionEndDate(String value) {
                this.professionalDevelopmentSessionEndDate = value;
            }

            /**
             * Gets the value of the professionalDevelopmentSessionEndTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentSessionEndTime() {
                return professionalDevelopmentSessionEndTime;
            }

            /**
             * Sets the value of the professionalDevelopmentSessionEndTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentSessionEndTime(String value) {
                this.professionalDevelopmentSessionEndTime = value;
            }

            /**
             * Gets the value of the professionalDevelopmentSessionEvaluationMethod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentSessionEvaluationMethod() {
                return professionalDevelopmentSessionEvaluationMethod;
            }

            /**
             * Sets the value of the professionalDevelopmentSessionEvaluationMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentSessionEvaluationMethod(String value) {
                this.professionalDevelopmentSessionEvaluationMethod = value;
            }

            /**
             * Gets the value of the professionalDevelopmentSessionEvaluationScore property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentSessionEvaluationScore() {
                return professionalDevelopmentSessionEvaluationScore;
            }

            /**
             * Sets the value of the professionalDevelopmentSessionEvaluationScore property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentSessionEvaluationScore(String value) {
                this.professionalDevelopmentSessionEvaluationScore = value;
            }

            /**
             * Gets the value of the professionalDevelopmentSessionIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentSessionIdentifier() {
                return professionalDevelopmentSessionIdentifier;
            }

            /**
             * Sets the value of the professionalDevelopmentSessionIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentSessionIdentifier(String value) {
                this.professionalDevelopmentSessionIdentifier = value;
            }

            /**
             * Gets the value of the professionalDevelopmentSessionStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentSessionStartDate() {
                return professionalDevelopmentSessionStartDate;
            }

            /**
             * Sets the value of the professionalDevelopmentSessionStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentSessionStartDate(String value) {
                this.professionalDevelopmentSessionStartDate = value;
            }

            /**
             * Gets the value of the professionalDevelopmentSessionStartTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentSessionStartTime() {
                return professionalDevelopmentSessionStartTime;
            }

            /**
             * Sets the value of the professionalDevelopmentSessionStartTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentSessionStartTime(String value) {
                this.professionalDevelopmentSessionStartTime = value;
            }

            /**
             * Gets the value of the professionalDevelopmentSessionStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentSessionStatus() {
                return professionalDevelopmentSessionStatus;
            }

            /**
             * Sets the value of the professionalDevelopmentSessionStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentSessionStatus(String value) {
                this.professionalDevelopmentSessionStatus = value;
            }

            /**
             * Gets the value of the professionalDevelopmentDeliveryMethod property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentDeliveryMethod() {
                return professionalDevelopmentDeliveryMethod;
            }

            /**
             * Sets the value of the professionalDevelopmentDeliveryMethod property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentDeliveryMethod(String value) {
                this.professionalDevelopmentDeliveryMethod = value;
            }

            /**
             * Gets the value of the professionalDevelopmentFundingSource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentFundingSource() {
                return professionalDevelopmentFundingSource;
            }

            /**
             * Sets the value of the professionalDevelopmentFundingSource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentFundingSource(String value) {
                this.professionalDevelopmentFundingSource = value;
            }

            /**
             * Gets the value of the professionalDevelopmentInstructionalDeliveryMode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentInstructionalDeliveryMode() {
                return professionalDevelopmentInstructionalDeliveryMode;
            }

            /**
             * Sets the value of the professionalDevelopmentInstructionalDeliveryMode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentInstructionalDeliveryMode(String value) {
                this.professionalDevelopmentInstructionalDeliveryMode = value;
            }

            /**
             * Gets the value of the professionalDevelopmentInstructorIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentInstructorIdentifier() {
                return professionalDevelopmentInstructorIdentifier;
            }

            /**
             * Sets the value of the professionalDevelopmentInstructorIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentInstructorIdentifier(String value) {
                this.professionalDevelopmentInstructorIdentifier = value;
            }

            /**
             * Gets the value of the sponsoringAgencyName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSponsoringAgencyName() {
                return sponsoringAgencyName;
            }

            /**
             * Sets the value of the sponsoringAgencyName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSponsoringAgencyName(String value) {
                this.sponsoringAgencyName = value;
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
         *         &lt;element name="professionalDevelopmentSessionLocationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressStreetNumberAndName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressApartmentRoomOrSuiteNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="stateAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="addressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "professionalDevelopmentSessionLocationName",
            "addressStreetNumberAndName",
            "addressApartmentRoomOrSuiteNumber",
            "addressCity",
            "stateAbbreviation",
            "addressPostalCode",
            "telephoneNumber"
        })
        public static class SessionLocation {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String professionalDevelopmentSessionLocationName;
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
            protected String telephoneNumber;

            /**
             * Gets the value of the professionalDevelopmentSessionLocationName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProfessionalDevelopmentSessionLocationName() {
                return professionalDevelopmentSessionLocationName;
            }

            /**
             * Sets the value of the professionalDevelopmentSessionLocationName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProfessionalDevelopmentSessionLocationName(String value) {
                this.professionalDevelopmentSessionLocationName = value;
            }

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
     *         &lt;element name="professionalDevelopmentActivityEducationLevelsAddressed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "professionalDevelopmentActivityEducationLevelsAddressed"
    })
    public static class ProfessionalDevelopmentEvent {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalDevelopmentActivityEducationLevelsAddressed;

        /**
         * Gets the value of the professionalDevelopmentActivityEducationLevelsAddressed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalDevelopmentActivityEducationLevelsAddressed() {
            return professionalDevelopmentActivityEducationLevelsAddressed;
        }

        /**
         * Sets the value of the professionalDevelopmentActivityEducationLevelsAddressed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalDevelopmentActivityEducationLevelsAddressed(String value) {
            this.professionalDevelopmentActivityEducationLevelsAddressed = value;
        }

    }

}
