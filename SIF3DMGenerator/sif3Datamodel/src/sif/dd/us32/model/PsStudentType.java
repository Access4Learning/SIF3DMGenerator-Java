
package sif.dd.us32.model;

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
 * <p>Java class for psStudentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="psStudentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accommodationsNeededType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabilityConditionStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabilityConditionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabilityDeterminationSourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="disabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ideaIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postsecondaryEnteringStudentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postsecondaryStudentEnteringTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="primaryDisabilityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="identification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="idVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                                       &lt;element name="stateOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="dependencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="unitedStatesCitizenshipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="visaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cohortExclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="tuitionResidencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="campusResidencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lEPPostsecondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cohortGraduationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fathersOrPaternalGuardianEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mothersOrMaternalGuardianEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="numberOfDependents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="singleParentOrSinglePregnantWomanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="application" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="standardizedAdmissionTestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="standardizedAdmissionTestScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="enrollment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cipVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cipUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="awardSeekingStudent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programLengthHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programLengthHoursType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="normalCompletionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="normalCompletionTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="firstTimePSStudent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="studentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="enrollmentInAwardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="enrollmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="enrollmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="postsecondaryEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="initialEnrollmentTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="transferReady" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="instructionalActivityHoursType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="instructionalActivityHoursAttempted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="instructionalActivityHoursCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="titleIV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="distanceEducationEnrollment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="studentHousingOnCampus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="fraternityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="distanceEducationProgramEnrollmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="sororityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="financialAid" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="financialAidApplicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAidApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialNeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialNeedMethodology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAidAwardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAidAwardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAidAwardAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="financialAidIncomeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="academicRecord" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="academicYearDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="academicTermDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gpaCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credentialAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="dualCreditsAwarded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="apCreditsAwarded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="awardLevelConferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="academicAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="academicAwardTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gpa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="courseTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="creditHoursAppliedOtherProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="credentialConferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cte" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cteConcentrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteParticipant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteNontraditionalGenderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="displacedHomemakerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteNontraditionalCompletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="graduateStudent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="doctoralCandidacyAdmitIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="doctoralCandidacyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="doctoralExamTakenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="doctoralExamsRequiredType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="graduateOrDoctoralExamResultsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="oralDefenseCompletedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="oralDefenseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="thesisOrDissertationTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="advisorList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="advisor" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="receivingLocationOfInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="assessment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="assessmentAccommodationCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="teacherPrep" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="teacherPreparationEnrollmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teacherPreparationCompleterStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="supervisedClinicalExperience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="supervisedClinicalExperienceClockHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teacherEducationExamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teacherEducationExamScoreType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teacherEducationTestCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teachingCredentialBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="teachingCredentialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="alternativeRouteToCertificationOrLicensure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="criticalTeacherShortageAreaCandidate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="employedWhileEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employedAfterExit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentNAICSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="employmentStatusWhileEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="k12Transcript" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="k12StudentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12StudentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12SchoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12SchoolIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12InstitutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12CountyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12LEAId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12LEAIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12CredentialAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12GPACumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12GPAWeightedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12HighSchoolDiplomaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="k12CohortYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="shortNameOfInstitution" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="programList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="program" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="work-basedLearningOpportunityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "psStudentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "accommodationsNeededType",
    "disabilityConditionStatusCode",
    "disabilityConditionType",
    "disabilityDeterminationSourceType",
    "disabilityStatus",
    "ideaIndicator",
    "postsecondaryEnteringStudentIndicator",
    "postsecondaryStudentEnteringTerm",
    "primaryDisabilityType",
    "identity",
    "contact",
    "demographic",
    "application",
    "enrollment",
    "financialAid",
    "academicRecord",
    "cte",
    "graduateStudent",
    "assessment",
    "teacherPrep",
    "employment",
    "k12Transcript",
    "programList"
})
public class PsStudentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String accommodationsNeededType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String disabilityConditionStatusCode;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String disabilityConditionType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String disabilityDeterminationSourceType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String disabilityStatus;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String ideaIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String postsecondaryEnteringStudentIndicator;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String postsecondaryStudentEnteringTerm;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected String primaryDisabilityType;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.Identity identity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.Contact contact;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.Demographic demographic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.Application application;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.Enrollment enrollment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.FinancialAid financialAid;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.AcademicRecord academicRecord;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.Cte cte;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.GraduateStudent graduateStudent;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.Assessment assessment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.TeacherPrep teacherPrep;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.Employment employment;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.K12Transcript k12Transcript;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected PsStudentType.ProgramList programList;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the accommodationsNeededType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccommodationsNeededType() {
        return accommodationsNeededType;
    }

    /**
     * Sets the value of the accommodationsNeededType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccommodationsNeededType(String value) {
        this.accommodationsNeededType = value;
    }

    /**
     * Gets the value of the disabilityConditionStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityConditionStatusCode() {
        return disabilityConditionStatusCode;
    }

    /**
     * Sets the value of the disabilityConditionStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityConditionStatusCode(String value) {
        this.disabilityConditionStatusCode = value;
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

    /**
     * Gets the value of the disabilityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisabilityStatus() {
        return disabilityStatus;
    }

    /**
     * Sets the value of the disabilityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisabilityStatus(String value) {
        this.disabilityStatus = value;
    }

    /**
     * Gets the value of the ideaIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdeaIndicator() {
        return ideaIndicator;
    }

    /**
     * Sets the value of the ideaIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdeaIndicator(String value) {
        this.ideaIndicator = value;
    }

    /**
     * Gets the value of the postsecondaryEnteringStudentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostsecondaryEnteringStudentIndicator() {
        return postsecondaryEnteringStudentIndicator;
    }

    /**
     * Sets the value of the postsecondaryEnteringStudentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostsecondaryEnteringStudentIndicator(String value) {
        this.postsecondaryEnteringStudentIndicator = value;
    }

    /**
     * Gets the value of the postsecondaryStudentEnteringTerm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostsecondaryStudentEnteringTerm() {
        return postsecondaryStudentEnteringTerm;
    }

    /**
     * Sets the value of the postsecondaryStudentEnteringTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostsecondaryStudentEnteringTerm(String value) {
        this.postsecondaryStudentEnteringTerm = value;
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
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.Identity }
     *     
     */
    public PsStudentType.Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.Identity }
     *     
     */
    public void setIdentity(PsStudentType.Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.Contact }
     *     
     */
    public PsStudentType.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.Contact }
     *     
     */
    public void setContact(PsStudentType.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the demographic property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.Demographic }
     *     
     */
    public PsStudentType.Demographic getDemographic() {
        return demographic;
    }

    /**
     * Sets the value of the demographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.Demographic }
     *     
     */
    public void setDemographic(PsStudentType.Demographic value) {
        this.demographic = value;
    }

    /**
     * Gets the value of the application property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.Application }
     *     
     */
    public PsStudentType.Application getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.Application }
     *     
     */
    public void setApplication(PsStudentType.Application value) {
        this.application = value;
    }

    /**
     * Gets the value of the enrollment property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.Enrollment }
     *     
     */
    public PsStudentType.Enrollment getEnrollment() {
        return enrollment;
    }

    /**
     * Sets the value of the enrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.Enrollment }
     *     
     */
    public void setEnrollment(PsStudentType.Enrollment value) {
        this.enrollment = value;
    }

    /**
     * Gets the value of the financialAid property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.FinancialAid }
     *     
     */
    public PsStudentType.FinancialAid getFinancialAid() {
        return financialAid;
    }

    /**
     * Sets the value of the financialAid property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.FinancialAid }
     *     
     */
    public void setFinancialAid(PsStudentType.FinancialAid value) {
        this.financialAid = value;
    }

    /**
     * Gets the value of the academicRecord property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.AcademicRecord }
     *     
     */
    public PsStudentType.AcademicRecord getAcademicRecord() {
        return academicRecord;
    }

    /**
     * Sets the value of the academicRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.AcademicRecord }
     *     
     */
    public void setAcademicRecord(PsStudentType.AcademicRecord value) {
        this.academicRecord = value;
    }

    /**
     * Gets the value of the cte property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.Cte }
     *     
     */
    public PsStudentType.Cte getCte() {
        return cte;
    }

    /**
     * Sets the value of the cte property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.Cte }
     *     
     */
    public void setCte(PsStudentType.Cte value) {
        this.cte = value;
    }

    /**
     * Gets the value of the graduateStudent property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.GraduateStudent }
     *     
     */
    public PsStudentType.GraduateStudent getGraduateStudent() {
        return graduateStudent;
    }

    /**
     * Sets the value of the graduateStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.GraduateStudent }
     *     
     */
    public void setGraduateStudent(PsStudentType.GraduateStudent value) {
        this.graduateStudent = value;
    }

    /**
     * Gets the value of the assessment property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.Assessment }
     *     
     */
    public PsStudentType.Assessment getAssessment() {
        return assessment;
    }

    /**
     * Sets the value of the assessment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.Assessment }
     *     
     */
    public void setAssessment(PsStudentType.Assessment value) {
        this.assessment = value;
    }

    /**
     * Gets the value of the teacherPrep property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.TeacherPrep }
     *     
     */
    public PsStudentType.TeacherPrep getTeacherPrep() {
        return teacherPrep;
    }

    /**
     * Sets the value of the teacherPrep property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.TeacherPrep }
     *     
     */
    public void setTeacherPrep(PsStudentType.TeacherPrep value) {
        this.teacherPrep = value;
    }

    /**
     * Gets the value of the employment property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.Employment }
     *     
     */
    public PsStudentType.Employment getEmployment() {
        return employment;
    }

    /**
     * Sets the value of the employment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.Employment }
     *     
     */
    public void setEmployment(PsStudentType.Employment value) {
        this.employment = value;
    }

    /**
     * Gets the value of the k12Transcript property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.K12Transcript }
     *     
     */
    public PsStudentType.K12Transcript getK12Transcript() {
        return k12Transcript;
    }

    /**
     * Sets the value of the k12Transcript property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.K12Transcript }
     *     
     */
    public void setK12Transcript(PsStudentType.K12Transcript value) {
        this.k12Transcript = value;
    }

    /**
     * Gets the value of the programList property.
     * 
     * @return
     *     possible object is
     *     {@link PsStudentType.ProgramList }
     *     
     */
    public PsStudentType.ProgramList getProgramList() {
        return programList;
    }

    /**
     * Sets the value of the programList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PsStudentType.ProgramList }
     *     
     */
    public void setProgramList(PsStudentType.ProgramList value) {
        this.programList = value;
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
     *         &lt;element name="academicYearDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="academicTermDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gpaCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credentialAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="dualCreditsAwarded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="apCreditsAwarded" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="awardLevelConferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="academicAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="academicAwardTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gpa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="courseTotal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="creditHoursAppliedOtherProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="credentialConferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "academicYearDesignator",
        "academicTermDesignator",
        "gpaCumulative",
        "credentialAwardDate",
        "dualCreditsAwarded",
        "apCreditsAwarded",
        "awardLevelConferred",
        "academicAwardDate",
        "academicAwardTitle",
        "gpa",
        "courseTotal",
        "creditHoursAppliedOtherProgram",
        "credentialConferred"
    })
    public static class AcademicRecord {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String academicYearDesignator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String academicTermDesignator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String gpaCumulative;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String credentialAwardDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String dualCreditsAwarded;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String apCreditsAwarded;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String awardLevelConferred;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String academicAwardDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String academicAwardTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String gpa;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String courseTotal;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String creditHoursAppliedOtherProgram;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String credentialConferred;

        /**
         * Gets the value of the academicYearDesignator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcademicYearDesignator() {
            return academicYearDesignator;
        }

        /**
         * Sets the value of the academicYearDesignator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcademicYearDesignator(String value) {
            this.academicYearDesignator = value;
        }

        /**
         * Gets the value of the academicTermDesignator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcademicTermDesignator() {
            return academicTermDesignator;
        }

        /**
         * Sets the value of the academicTermDesignator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcademicTermDesignator(String value) {
            this.academicTermDesignator = value;
        }

        /**
         * Gets the value of the gpaCumulative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGpaCumulative() {
            return gpaCumulative;
        }

        /**
         * Sets the value of the gpaCumulative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGpaCumulative(String value) {
            this.gpaCumulative = value;
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
         * Gets the value of the dualCreditsAwarded property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDualCreditsAwarded() {
            return dualCreditsAwarded;
        }

        /**
         * Sets the value of the dualCreditsAwarded property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDualCreditsAwarded(String value) {
            this.dualCreditsAwarded = value;
        }

        /**
         * Gets the value of the apCreditsAwarded property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApCreditsAwarded() {
            return apCreditsAwarded;
        }

        /**
         * Sets the value of the apCreditsAwarded property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApCreditsAwarded(String value) {
            this.apCreditsAwarded = value;
        }

        /**
         * Gets the value of the awardLevelConferred property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwardLevelConferred() {
            return awardLevelConferred;
        }

        /**
         * Sets the value of the awardLevelConferred property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwardLevelConferred(String value) {
            this.awardLevelConferred = value;
        }

        /**
         * Gets the value of the academicAwardDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcademicAwardDate() {
            return academicAwardDate;
        }

        /**
         * Sets the value of the academicAwardDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcademicAwardDate(String value) {
            this.academicAwardDate = value;
        }

        /**
         * Gets the value of the academicAwardTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcademicAwardTitle() {
            return academicAwardTitle;
        }

        /**
         * Sets the value of the academicAwardTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcademicAwardTitle(String value) {
            this.academicAwardTitle = value;
        }

        /**
         * Gets the value of the gpa property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGpa() {
            return gpa;
        }

        /**
         * Sets the value of the gpa property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGpa(String value) {
            this.gpa = value;
        }

        /**
         * Gets the value of the courseTotal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCourseTotal() {
            return courseTotal;
        }

        /**
         * Sets the value of the courseTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCourseTotal(String value) {
            this.courseTotal = value;
        }

        /**
         * Gets the value of the creditHoursAppliedOtherProgram property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditHoursAppliedOtherProgram() {
            return creditHoursAppliedOtherProgram;
        }

        /**
         * Sets the value of the creditHoursAppliedOtherProgram property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditHoursAppliedOtherProgram(String value) {
            this.creditHoursAppliedOtherProgram = value;
        }

        /**
         * Gets the value of the credentialConferred property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCredentialConferred() {
            return credentialConferred;
        }

        /**
         * Sets the value of the credentialConferred property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCredentialConferred(String value) {
            this.credentialConferred = value;
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
     *         &lt;element name="standardizedAdmissionTestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="standardizedAdmissionTestScore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "standardizedAdmissionTestType",
        "standardizedAdmissionTestScore"
    })
    public static class Application {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String standardizedAdmissionTestType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String standardizedAdmissionTestScore;

        /**
         * Gets the value of the standardizedAdmissionTestType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStandardizedAdmissionTestType() {
            return standardizedAdmissionTestType;
        }

        /**
         * Sets the value of the standardizedAdmissionTestType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStandardizedAdmissionTestType(String value) {
            this.standardizedAdmissionTestType = value;
        }

        /**
         * Gets the value of the standardizedAdmissionTestScore property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStandardizedAdmissionTestScore() {
            return standardizedAdmissionTestScore;
        }

        /**
         * Sets the value of the standardizedAdmissionTestScore property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStandardizedAdmissionTestScore(String value) {
            this.standardizedAdmissionTestScore = value;
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
     *         &lt;element name="assessmentAccommodationCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "assessmentAccommodationCategory"
    })
    public static class Assessment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String assessmentAccommodationCategory;

        /**
         * Gets the value of the assessmentAccommodationCategory property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAssessmentAccommodationCategory() {
            return assessmentAccommodationCategory;
        }

        /**
         * Sets the value of the assessmentAccommodationCategory property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAssessmentAccommodationCategory(String value) {
            this.assessmentAccommodationCategory = value;
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
     *                             &lt;element name="stateOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected PsStudentType.Contact.AddressList addressList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected PsStudentType.Contact.PhoneNumberList phoneNumberList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected PsStudentType.Contact.EmailList emailList;

        /**
         * Gets the value of the addressList property.
         * 
         * @return
         *     possible object is
         *     {@link PsStudentType.Contact.AddressList }
         *     
         */
        public PsStudentType.Contact.AddressList getAddressList() {
            return addressList;
        }

        /**
         * Sets the value of the addressList property.
         * 
         * @param value
         *     allowed object is
         *     {@link PsStudentType.Contact.AddressList }
         *     
         */
        public void setAddressList(PsStudentType.Contact.AddressList value) {
            this.addressList = value;
        }

        /**
         * Gets the value of the phoneNumberList property.
         * 
         * @return
         *     possible object is
         *     {@link PsStudentType.Contact.PhoneNumberList }
         *     
         */
        public PsStudentType.Contact.PhoneNumberList getPhoneNumberList() {
            return phoneNumberList;
        }

        /**
         * Sets the value of the phoneNumberList property.
         * 
         * @param value
         *     allowed object is
         *     {@link PsStudentType.Contact.PhoneNumberList }
         *     
         */
        public void setPhoneNumberList(PsStudentType.Contact.PhoneNumberList value) {
            this.phoneNumberList = value;
        }

        /**
         * Gets the value of the emailList property.
         * 
         * @return
         *     possible object is
         *     {@link PsStudentType.Contact.EmailList }
         *     
         */
        public PsStudentType.Contact.EmailList getEmailList() {
            return emailList;
        }

        /**
         * Sets the value of the emailList property.
         * 
         * @param value
         *     allowed object is
         *     {@link PsStudentType.Contact.EmailList }
         *     
         */
        public void setEmailList(PsStudentType.Contact.EmailList value) {
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
         *                   &lt;element name="stateOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            protected List<PsStudentType.Contact.AddressList.Address> address;

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
             * {@link PsStudentType.Contact.AddressList.Address }
             * 
             * 
             */
            public List<PsStudentType.Contact.AddressList.Address> getAddress() {
                if (address == null) {
                    address = new ArrayList<PsStudentType.Contact.AddressList.Address>();
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
             *         &lt;element name="stateOfResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "country",
                "stateOfResidence"
            })
            public static class Address {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected PsStudentType.Contact.AddressList.Address.Street street;
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
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String stateOfResidence;
                @XmlAttribute(name = "addressType")
                protected String addressType;

                /**
                 * Gets the value of the street property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PsStudentType.Contact.AddressList.Address.Street }
                 *     
                 */
                public PsStudentType.Contact.AddressList.Address.Street getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PsStudentType.Contact.AddressList.Address.Street }
                 *     
                 */
                public void setStreet(PsStudentType.Contact.AddressList.Address.Street value) {
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
                 * Gets the value of the stateOfResidence property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateOfResidence() {
                    return stateOfResidence;
                }

                /**
                 * Sets the value of the stateOfResidence property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateOfResidence(String value) {
                    this.stateOfResidence = value;
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
            protected List<PsStudentType.Contact.EmailList.Email> email;

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
             * {@link PsStudentType.Contact.EmailList.Email }
             * 
             * 
             */
            public List<PsStudentType.Contact.EmailList.Email> getEmail() {
                if (email == null) {
                    email = new ArrayList<PsStudentType.Contact.EmailList.Email>();
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
            protected List<PsStudentType.Contact.PhoneNumberList.PhoneNumber> phoneNumber;

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
             * {@link PsStudentType.Contact.PhoneNumberList.PhoneNumber }
             * 
             * 
             */
            public List<PsStudentType.Contact.PhoneNumberList.PhoneNumber> getPhoneNumber() {
                if (phoneNumber == null) {
                    phoneNumber = new ArrayList<PsStudentType.Contact.PhoneNumberList.PhoneNumber>();
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
     *         &lt;element name="cteConcentrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteParticipant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteNontraditionalGenderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="displacedHomemakerIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteNontraditionalCompletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "cteConcentrator",
        "cteParticipant",
        "cteNontraditionalGenderStatus",
        "displacedHomemakerIndicator",
        "cteNontraditionalCompletion"
    })
    public static class Cte {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteConcentrator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteParticipant;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteNontraditionalGenderStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String displacedHomemakerIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteNontraditionalCompletion;

        /**
         * Gets the value of the cteConcentrator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCteConcentrator() {
            return cteConcentrator;
        }

        /**
         * Sets the value of the cteConcentrator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCteConcentrator(String value) {
            this.cteConcentrator = value;
        }

        /**
         * Gets the value of the cteParticipant property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCteParticipant() {
            return cteParticipant;
        }

        /**
         * Sets the value of the cteParticipant property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCteParticipant(String value) {
            this.cteParticipant = value;
        }

        /**
         * Gets the value of the cteNontraditionalGenderStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCteNontraditionalGenderStatus() {
            return cteNontraditionalGenderStatus;
        }

        /**
         * Sets the value of the cteNontraditionalGenderStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCteNontraditionalGenderStatus(String value) {
            this.cteNontraditionalGenderStatus = value;
        }

        /**
         * Gets the value of the displacedHomemakerIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplacedHomemakerIndicator() {
            return displacedHomemakerIndicator;
        }

        /**
         * Sets the value of the displacedHomemakerIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplacedHomemakerIndicator(String value) {
            this.displacedHomemakerIndicator = value;
        }

        /**
         * Gets the value of the cteNontraditionalCompletion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCteNontraditionalCompletion() {
            return cteNontraditionalCompletion;
        }

        /**
         * Sets the value of the cteNontraditionalCompletion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCteNontraditionalCompletion(String value) {
            this.cteNontraditionalCompletion = value;
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
     *         &lt;element name="dependencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="unitedStatesCitizenshipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="visaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cohortExclusion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="tuitionResidencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="campusResidencyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lEPPostsecondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cohortGraduationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fathersOrPaternalGuardianEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mothersOrMaternalGuardianEducation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="numberOfDependents" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="singleParentOrSinglePregnantWomanStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "hispanicOrLatinoEthnicity",
        "dependencyStatus",
        "unitedStatesCitizenshipStatus",
        "visaType",
        "cohortExclusion",
        "tuitionResidencyType",
        "campusResidencyType",
        "lepPostsecondary",
        "cohortGraduationYear",
        "fathersOrPaternalGuardianEducation",
        "mothersOrMaternalGuardianEducation",
        "numberOfDependents",
        "singleParentOrSinglePregnantWomanStatus"
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
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String dependencyStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String unitedStatesCitizenshipStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String visaType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cohortExclusion;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String tuitionResidencyType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String campusResidencyType;
        @XmlElement(name = "lEPPostsecondary", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String lepPostsecondary;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cohortGraduationYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String fathersOrPaternalGuardianEducation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String mothersOrMaternalGuardianEducation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String numberOfDependents;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String singleParentOrSinglePregnantWomanStatus;

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

        /**
         * Gets the value of the dependencyStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDependencyStatus() {
            return dependencyStatus;
        }

        /**
         * Sets the value of the dependencyStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDependencyStatus(String value) {
            this.dependencyStatus = value;
        }

        /**
         * Gets the value of the unitedStatesCitizenshipStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitedStatesCitizenshipStatus() {
            return unitedStatesCitizenshipStatus;
        }

        /**
         * Sets the value of the unitedStatesCitizenshipStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitedStatesCitizenshipStatus(String value) {
            this.unitedStatesCitizenshipStatus = value;
        }

        /**
         * Gets the value of the visaType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVisaType() {
            return visaType;
        }

        /**
         * Sets the value of the visaType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVisaType(String value) {
            this.visaType = value;
        }

        /**
         * Gets the value of the cohortExclusion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCohortExclusion() {
            return cohortExclusion;
        }

        /**
         * Sets the value of the cohortExclusion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCohortExclusion(String value) {
            this.cohortExclusion = value;
        }

        /**
         * Gets the value of the tuitionResidencyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTuitionResidencyType() {
            return tuitionResidencyType;
        }

        /**
         * Sets the value of the tuitionResidencyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTuitionResidencyType(String value) {
            this.tuitionResidencyType = value;
        }

        /**
         * Gets the value of the campusResidencyType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCampusResidencyType() {
            return campusResidencyType;
        }

        /**
         * Sets the value of the campusResidencyType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCampusResidencyType(String value) {
            this.campusResidencyType = value;
        }

        /**
         * Gets the value of the lepPostsecondary property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLEPPostsecondary() {
            return lepPostsecondary;
        }

        /**
         * Sets the value of the lepPostsecondary property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLEPPostsecondary(String value) {
            this.lepPostsecondary = value;
        }

        /**
         * Gets the value of the cohortGraduationYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCohortGraduationYear() {
            return cohortGraduationYear;
        }

        /**
         * Sets the value of the cohortGraduationYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCohortGraduationYear(String value) {
            this.cohortGraduationYear = value;
        }

        /**
         * Gets the value of the fathersOrPaternalGuardianEducation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFathersOrPaternalGuardianEducation() {
            return fathersOrPaternalGuardianEducation;
        }

        /**
         * Sets the value of the fathersOrPaternalGuardianEducation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFathersOrPaternalGuardianEducation(String value) {
            this.fathersOrPaternalGuardianEducation = value;
        }

        /**
         * Gets the value of the mothersOrMaternalGuardianEducation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMothersOrMaternalGuardianEducation() {
            return mothersOrMaternalGuardianEducation;
        }

        /**
         * Sets the value of the mothersOrMaternalGuardianEducation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMothersOrMaternalGuardianEducation(String value) {
            this.mothersOrMaternalGuardianEducation = value;
        }

        /**
         * Gets the value of the numberOfDependents property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumberOfDependents() {
            return numberOfDependents;
        }

        /**
         * Sets the value of the numberOfDependents property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumberOfDependents(String value) {
            this.numberOfDependents = value;
        }

        /**
         * Gets the value of the singleParentOrSinglePregnantWomanStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleParentOrSinglePregnantWomanStatus() {
            return singleParentOrSinglePregnantWomanStatus;
        }

        /**
         * Sets the value of the singleParentOrSinglePregnantWomanStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleParentOrSinglePregnantWomanStatus(String value) {
            this.singleParentOrSinglePregnantWomanStatus = value;
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
     *         &lt;element name="employedWhileEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employedAfterExit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentNAICSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="employmentStatusWhileEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "employedWhileEnrolled",
        "employedAfterExit",
        "employmentNAICSCode",
        "employmentEndDate",
        "employmentStartDate",
        "employmentStatusWhileEnrolled"
    })
    public static class Employment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employedWhileEnrolled;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employedAfterExit;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentNAICSCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String employmentStatusWhileEnrolled;

        /**
         * Gets the value of the employedWhileEnrolled property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployedWhileEnrolled() {
            return employedWhileEnrolled;
        }

        /**
         * Sets the value of the employedWhileEnrolled property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployedWhileEnrolled(String value) {
            this.employedWhileEnrolled = value;
        }

        /**
         * Gets the value of the employedAfterExit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmployedAfterExit() {
            return employedAfterExit;
        }

        /**
         * Sets the value of the employedAfterExit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmployedAfterExit(String value) {
            this.employedAfterExit = value;
        }

        /**
         * Gets the value of the employmentNAICSCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentNAICSCode() {
            return employmentNAICSCode;
        }

        /**
         * Sets the value of the employmentNAICSCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentNAICSCode(String value) {
            this.employmentNAICSCode = value;
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
         * Gets the value of the employmentStatusWhileEnrolled property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmploymentStatusWhileEnrolled() {
            return employmentStatusWhileEnrolled;
        }

        /**
         * Sets the value of the employmentStatusWhileEnrolled property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmploymentStatusWhileEnrolled(String value) {
            this.employmentStatusWhileEnrolled = value;
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
     *         &lt;element name="cipVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cipUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="awardSeekingStudent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programLengthHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programLengthHoursType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="normalCompletionTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="normalCompletionTimeUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="firstTimePSStudent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="studentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="enrollmentInAwardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="enrollmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="enrollmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="postsecondaryEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="initialEnrollmentTerm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="transferReady" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="instructionalActivityHoursType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="instructionalActivityHoursAttempted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="instructionalActivityHoursCompleted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="titleIV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="distanceEducationEnrollment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="studentHousingOnCampus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="fraternityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="distanceEducationProgramEnrollmentIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="sororityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "cipVersion",
        "cipUse",
        "cipCode",
        "awardSeekingStudent",
        "programLengthHours",
        "programLengthHoursType",
        "normalCompletionTime",
        "normalCompletionTimeUnit",
        "firstTimePSStudent",
        "studentLevel",
        "enrollmentInAwardType",
        "enrollmentType",
        "enrollmentStatus",
        "postsecondaryEntryDate",
        "exitDate",
        "initialEnrollmentTerm",
        "transferReady",
        "instructionalActivityHoursType",
        "instructionalActivityHoursAttempted",
        "instructionalActivityHoursCompleted",
        "titleIV",
        "distanceEducationEnrollment",
        "studentHousingOnCampus",
        "fraternityStatus",
        "distanceEducationProgramEnrollmentIndicator",
        "sororityStatus"
    })
    public static class Enrollment {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cipVersion;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cipUse;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cipCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String awardSeekingStudent;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programLengthHours;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programLengthHoursType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String normalCompletionTime;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String normalCompletionTimeUnit;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String firstTimePSStudent;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String studentLevel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String enrollmentInAwardType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String enrollmentType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String enrollmentStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String postsecondaryEntryDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String exitDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String initialEnrollmentTerm;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String transferReady;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String instructionalActivityHoursType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String instructionalActivityHoursAttempted;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String instructionalActivityHoursCompleted;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String titleIV;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String distanceEducationEnrollment;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String studentHousingOnCampus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String fraternityStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String distanceEducationProgramEnrollmentIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String sororityStatus;

        /**
         * Gets the value of the cipVersion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCipVersion() {
            return cipVersion;
        }

        /**
         * Sets the value of the cipVersion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCipVersion(String value) {
            this.cipVersion = value;
        }

        /**
         * Gets the value of the cipUse property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCipUse() {
            return cipUse;
        }

        /**
         * Sets the value of the cipUse property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCipUse(String value) {
            this.cipUse = value;
        }

        /**
         * Gets the value of the cipCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCipCode() {
            return cipCode;
        }

        /**
         * Sets the value of the cipCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCipCode(String value) {
            this.cipCode = value;
        }

        /**
         * Gets the value of the awardSeekingStudent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwardSeekingStudent() {
            return awardSeekingStudent;
        }

        /**
         * Sets the value of the awardSeekingStudent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwardSeekingStudent(String value) {
            this.awardSeekingStudent = value;
        }

        /**
         * Gets the value of the programLengthHours property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramLengthHours() {
            return programLengthHours;
        }

        /**
         * Sets the value of the programLengthHours property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramLengthHours(String value) {
            this.programLengthHours = value;
        }

        /**
         * Gets the value of the programLengthHoursType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramLengthHoursType() {
            return programLengthHoursType;
        }

        /**
         * Sets the value of the programLengthHoursType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramLengthHoursType(String value) {
            this.programLengthHoursType = value;
        }

        /**
         * Gets the value of the normalCompletionTime property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNormalCompletionTime() {
            return normalCompletionTime;
        }

        /**
         * Sets the value of the normalCompletionTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNormalCompletionTime(String value) {
            this.normalCompletionTime = value;
        }

        /**
         * Gets the value of the normalCompletionTimeUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNormalCompletionTimeUnit() {
            return normalCompletionTimeUnit;
        }

        /**
         * Sets the value of the normalCompletionTimeUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNormalCompletionTimeUnit(String value) {
            this.normalCompletionTimeUnit = value;
        }

        /**
         * Gets the value of the firstTimePSStudent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstTimePSStudent() {
            return firstTimePSStudent;
        }

        /**
         * Sets the value of the firstTimePSStudent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstTimePSStudent(String value) {
            this.firstTimePSStudent = value;
        }

        /**
         * Gets the value of the studentLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStudentLevel() {
            return studentLevel;
        }

        /**
         * Sets the value of the studentLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStudentLevel(String value) {
            this.studentLevel = value;
        }

        /**
         * Gets the value of the enrollmentInAwardType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnrollmentInAwardType() {
            return enrollmentInAwardType;
        }

        /**
         * Sets the value of the enrollmentInAwardType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnrollmentInAwardType(String value) {
            this.enrollmentInAwardType = value;
        }

        /**
         * Gets the value of the enrollmentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnrollmentType() {
            return enrollmentType;
        }

        /**
         * Sets the value of the enrollmentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnrollmentType(String value) {
            this.enrollmentType = value;
        }

        /**
         * Gets the value of the enrollmentStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnrollmentStatus() {
            return enrollmentStatus;
        }

        /**
         * Sets the value of the enrollmentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnrollmentStatus(String value) {
            this.enrollmentStatus = value;
        }

        /**
         * Gets the value of the postsecondaryEntryDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostsecondaryEntryDate() {
            return postsecondaryEntryDate;
        }

        /**
         * Sets the value of the postsecondaryEntryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostsecondaryEntryDate(String value) {
            this.postsecondaryEntryDate = value;
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
         * Gets the value of the initialEnrollmentTerm property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInitialEnrollmentTerm() {
            return initialEnrollmentTerm;
        }

        /**
         * Sets the value of the initialEnrollmentTerm property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInitialEnrollmentTerm(String value) {
            this.initialEnrollmentTerm = value;
        }

        /**
         * Gets the value of the transferReady property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransferReady() {
            return transferReady;
        }

        /**
         * Sets the value of the transferReady property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransferReady(String value) {
            this.transferReady = value;
        }

        /**
         * Gets the value of the instructionalActivityHoursType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstructionalActivityHoursType() {
            return instructionalActivityHoursType;
        }

        /**
         * Sets the value of the instructionalActivityHoursType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstructionalActivityHoursType(String value) {
            this.instructionalActivityHoursType = value;
        }

        /**
         * Gets the value of the instructionalActivityHoursAttempted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstructionalActivityHoursAttempted() {
            return instructionalActivityHoursAttempted;
        }

        /**
         * Sets the value of the instructionalActivityHoursAttempted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstructionalActivityHoursAttempted(String value) {
            this.instructionalActivityHoursAttempted = value;
        }

        /**
         * Gets the value of the instructionalActivityHoursCompleted property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstructionalActivityHoursCompleted() {
            return instructionalActivityHoursCompleted;
        }

        /**
         * Sets the value of the instructionalActivityHoursCompleted property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstructionalActivityHoursCompleted(String value) {
            this.instructionalActivityHoursCompleted = value;
        }

        /**
         * Gets the value of the titleIV property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitleIV() {
            return titleIV;
        }

        /**
         * Sets the value of the titleIV property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitleIV(String value) {
            this.titleIV = value;
        }

        /**
         * Gets the value of the distanceEducationEnrollment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceEducationEnrollment() {
            return distanceEducationEnrollment;
        }

        /**
         * Sets the value of the distanceEducationEnrollment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceEducationEnrollment(String value) {
            this.distanceEducationEnrollment = value;
        }

        /**
         * Gets the value of the studentHousingOnCampus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStudentHousingOnCampus() {
            return studentHousingOnCampus;
        }

        /**
         * Sets the value of the studentHousingOnCampus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStudentHousingOnCampus(String value) {
            this.studentHousingOnCampus = value;
        }

        /**
         * Gets the value of the fraternityStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFraternityStatus() {
            return fraternityStatus;
        }

        /**
         * Sets the value of the fraternityStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFraternityStatus(String value) {
            this.fraternityStatus = value;
        }

        /**
         * Gets the value of the distanceEducationProgramEnrollmentIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceEducationProgramEnrollmentIndicator() {
            return distanceEducationProgramEnrollmentIndicator;
        }

        /**
         * Sets the value of the distanceEducationProgramEnrollmentIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceEducationProgramEnrollmentIndicator(String value) {
            this.distanceEducationProgramEnrollmentIndicator = value;
        }

        /**
         * Gets the value of the sororityStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSororityStatus() {
            return sororityStatus;
        }

        /**
         * Sets the value of the sororityStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSororityStatus(String value) {
            this.sororityStatus = value;
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
     *         &lt;element name="financialAidApplicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAidApplicationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialNeed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialNeedMethodology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAidAwardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAidAwardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAidAwardAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="financialAidIncomeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "financialAidApplicant",
        "financialAidApplicationType",
        "financialNeed",
        "financialNeedMethodology",
        "financialAidAwardStatus",
        "financialAidAwardType",
        "financialAidAwardAmount",
        "financialAidIncomeLevel"
    })
    public static class FinancialAid {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAidApplicant;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAidApplicationType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialNeed;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialNeedMethodology;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAidAwardStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAidAwardType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAidAwardAmount;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String financialAidIncomeLevel;

        /**
         * Gets the value of the financialAidApplicant property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAidApplicant() {
            return financialAidApplicant;
        }

        /**
         * Sets the value of the financialAidApplicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAidApplicant(String value) {
            this.financialAidApplicant = value;
        }

        /**
         * Gets the value of the financialAidApplicationType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAidApplicationType() {
            return financialAidApplicationType;
        }

        /**
         * Sets the value of the financialAidApplicationType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAidApplicationType(String value) {
            this.financialAidApplicationType = value;
        }

        /**
         * Gets the value of the financialNeed property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialNeed() {
            return financialNeed;
        }

        /**
         * Sets the value of the financialNeed property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialNeed(String value) {
            this.financialNeed = value;
        }

        /**
         * Gets the value of the financialNeedMethodology property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialNeedMethodology() {
            return financialNeedMethodology;
        }

        /**
         * Sets the value of the financialNeedMethodology property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialNeedMethodology(String value) {
            this.financialNeedMethodology = value;
        }

        /**
         * Gets the value of the financialAidAwardStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAidAwardStatus() {
            return financialAidAwardStatus;
        }

        /**
         * Sets the value of the financialAidAwardStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAidAwardStatus(String value) {
            this.financialAidAwardStatus = value;
        }

        /**
         * Gets the value of the financialAidAwardType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAidAwardType() {
            return financialAidAwardType;
        }

        /**
         * Sets the value of the financialAidAwardType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAidAwardType(String value) {
            this.financialAidAwardType = value;
        }

        /**
         * Gets the value of the financialAidAwardAmount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAidAwardAmount() {
            return financialAidAwardAmount;
        }

        /**
         * Sets the value of the financialAidAwardAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAidAwardAmount(String value) {
            this.financialAidAwardAmount = value;
        }

        /**
         * Gets the value of the financialAidIncomeLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFinancialAidIncomeLevel() {
            return financialAidIncomeLevel;
        }

        /**
         * Sets the value of the financialAidIncomeLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFinancialAidIncomeLevel(String value) {
            this.financialAidIncomeLevel = value;
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
     *         &lt;element name="doctoralCandidacyAdmitIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="doctoralCandidacyDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="doctoralExamTakenDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="doctoralExamsRequiredType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="graduateOrDoctoralExamResultsStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="oralDefenseCompletedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="oralDefenseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="thesisOrDissertationTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="advisorList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="advisor" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="receivingLocationOfInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "doctoralCandidacyAdmitIndicator",
        "doctoralCandidacyDate",
        "doctoralExamTakenDate",
        "doctoralExamsRequiredType",
        "graduateOrDoctoralExamResultsStatus",
        "oralDefenseCompletedIndicator",
        "oralDefenseDate",
        "thesisOrDissertationTitle",
        "advisorList"
    })
    public static class GraduateStudent {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String doctoralCandidacyAdmitIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String doctoralCandidacyDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String doctoralExamTakenDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String doctoralExamsRequiredType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String graduateOrDoctoralExamResultsStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String oralDefenseCompletedIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String oralDefenseDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String thesisOrDissertationTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected PsStudentType.GraduateStudent.AdvisorList advisorList;

        /**
         * Gets the value of the doctoralCandidacyAdmitIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDoctoralCandidacyAdmitIndicator() {
            return doctoralCandidacyAdmitIndicator;
        }

        /**
         * Sets the value of the doctoralCandidacyAdmitIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDoctoralCandidacyAdmitIndicator(String value) {
            this.doctoralCandidacyAdmitIndicator = value;
        }

        /**
         * Gets the value of the doctoralCandidacyDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDoctoralCandidacyDate() {
            return doctoralCandidacyDate;
        }

        /**
         * Sets the value of the doctoralCandidacyDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDoctoralCandidacyDate(String value) {
            this.doctoralCandidacyDate = value;
        }

        /**
         * Gets the value of the doctoralExamTakenDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDoctoralExamTakenDate() {
            return doctoralExamTakenDate;
        }

        /**
         * Sets the value of the doctoralExamTakenDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDoctoralExamTakenDate(String value) {
            this.doctoralExamTakenDate = value;
        }

        /**
         * Gets the value of the doctoralExamsRequiredType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDoctoralExamsRequiredType() {
            return doctoralExamsRequiredType;
        }

        /**
         * Sets the value of the doctoralExamsRequiredType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDoctoralExamsRequiredType(String value) {
            this.doctoralExamsRequiredType = value;
        }

        /**
         * Gets the value of the graduateOrDoctoralExamResultsStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGraduateOrDoctoralExamResultsStatus() {
            return graduateOrDoctoralExamResultsStatus;
        }

        /**
         * Sets the value of the graduateOrDoctoralExamResultsStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGraduateOrDoctoralExamResultsStatus(String value) {
            this.graduateOrDoctoralExamResultsStatus = value;
        }

        /**
         * Gets the value of the oralDefenseCompletedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOralDefenseCompletedIndicator() {
            return oralDefenseCompletedIndicator;
        }

        /**
         * Sets the value of the oralDefenseCompletedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOralDefenseCompletedIndicator(String value) {
            this.oralDefenseCompletedIndicator = value;
        }

        /**
         * Gets the value of the oralDefenseDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOralDefenseDate() {
            return oralDefenseDate;
        }

        /**
         * Sets the value of the oralDefenseDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOralDefenseDate(String value) {
            this.oralDefenseDate = value;
        }

        /**
         * Gets the value of the thesisOrDissertationTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getThesisOrDissertationTitle() {
            return thesisOrDissertationTitle;
        }

        /**
         * Sets the value of the thesisOrDissertationTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setThesisOrDissertationTitle(String value) {
            this.thesisOrDissertationTitle = value;
        }

        /**
         * Gets the value of the advisorList property.
         * 
         * @return
         *     possible object is
         *     {@link PsStudentType.GraduateStudent.AdvisorList }
         *     
         */
        public PsStudentType.GraduateStudent.AdvisorList getAdvisorList() {
            return advisorList;
        }

        /**
         * Sets the value of the advisorList property.
         * 
         * @param value
         *     allowed object is
         *     {@link PsStudentType.GraduateStudent.AdvisorList }
         *     
         */
        public void setAdvisorList(PsStudentType.GraduateStudent.AdvisorList value) {
            this.advisorList = value;
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
         *         &lt;element name="advisor" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="receivingLocationOfInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "advisor"
        })
        public static class AdvisorList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<PsStudentType.GraduateStudent.AdvisorList.Advisor> advisor;

            /**
             * Gets the value of the advisor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the advisor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAdvisor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PsStudentType.GraduateStudent.AdvisorList.Advisor }
             * 
             * 
             */
            public List<PsStudentType.GraduateStudent.AdvisorList.Advisor> getAdvisor() {
                if (advisor == null) {
                    advisor = new ArrayList<PsStudentType.GraduateStudent.AdvisorList.Advisor>();
                }
                return this.advisor;
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
             *         &lt;element name="receivingLocationOfInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "receivingLocationOfInstruction",
                "firstName",
                "middleName",
                "lastName",
                "suffix",
                "prefix"
            })
            public static class Advisor {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String receivingLocationOfInstruction;
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
                 * Gets the value of the receivingLocationOfInstruction property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReceivingLocationOfInstruction() {
                    return receivingLocationOfInstruction;
                }

                /**
                 * Sets the value of the receivingLocationOfInstruction property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReceivingLocationOfInstruction(String value) {
                    this.receivingLocationOfInstruction = value;
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
     *         &lt;element name="identification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="idVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "identification"
    })
    public static class Identity {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected PsStudentType.Identity.Name name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected PsStudentType.Identity.OtherNameList otherNameList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected PsStudentType.Identity.Identification identification;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link PsStudentType.Identity.Name }
         *     
         */
        public PsStudentType.Identity.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link PsStudentType.Identity.Name }
         *     
         */
        public void setName(PsStudentType.Identity.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the otherNameList property.
         * 
         * @return
         *     possible object is
         *     {@link PsStudentType.Identity.OtherNameList }
         *     
         */
        public PsStudentType.Identity.OtherNameList getOtherNameList() {
            return otherNameList;
        }

        /**
         * Sets the value of the otherNameList property.
         * 
         * @param value
         *     allowed object is
         *     {@link PsStudentType.Identity.OtherNameList }
         *     
         */
        public void setOtherNameList(PsStudentType.Identity.OtherNameList value) {
            this.otherNameList = value;
        }

        /**
         * Gets the value of the identification property.
         * 
         * @return
         *     possible object is
         *     {@link PsStudentType.Identity.Identification }
         *     
         */
        public PsStudentType.Identity.Identification getIdentification() {
            return identification;
        }

        /**
         * Sets the value of the identification property.
         * 
         * @param value
         *     allowed object is
         *     {@link PsStudentType.Identity.Identification }
         *     
         */
        public void setIdentification(PsStudentType.Identity.Identification value) {
            this.identification = value;
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
         *         &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="socialSecurityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="idVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "studentIdSystem",
            "socialSecurityNumber",
            "idVerification",
            "studentId"
        })
        public static class Identification {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String studentIdSystem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String socialSecurityNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String idVerification;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String studentId;

            /**
             * Gets the value of the studentIdSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentIdSystem() {
                return studentIdSystem;
            }

            /**
             * Sets the value of the studentIdSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentIdSystem(String value) {
                this.studentIdSystem = value;
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

            /**
             * Gets the value of the studentId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStudentId() {
                return studentId;
            }

            /**
             * Sets the value of the studentId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStudentId(String value) {
                this.studentId = value;
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
            protected List<PsStudentType.Identity.OtherNameList.OtherName> otherName;

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
             * {@link PsStudentType.Identity.OtherNameList.OtherName }
             * 
             * 
             */
            public List<PsStudentType.Identity.OtherNameList.OtherName> getOtherName() {
                if (otherName == null) {
                    otherName = new ArrayList<PsStudentType.Identity.OtherNameList.OtherName>();
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
     *         &lt;element name="k12StudentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12StudentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12SchoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12SchoolIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12InstitutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12CountyANSICode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12LEAId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12LEAIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12CredentialAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12GPACumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12GPAWeightedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12HighSchoolDiplomaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="k12CohortYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "k12StudentId",
        "k12StudentIdSystem",
        "k12SchoolId",
        "k12SchoolIdSystem",
        "k12InstitutionName",
        "k12CountyANSICode",
        "k12LEAId",
        "k12LEAIdSystem",
        "k12CredentialAwardDate",
        "k12GPACumulative",
        "k12GPAWeightedIndicator",
        "k12HighSchoolDiplomaType",
        "k12CohortYear",
        "shortNameOfInstitution"
    })
    public static class K12Transcript {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12StudentId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12StudentIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12SchoolId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12SchoolIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12InstitutionName;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12CountyANSICode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12LEAId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12LEAIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12CredentialAwardDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12GPACumulative;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12GPAWeightedIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12HighSchoolDiplomaType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String k12CohortYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String shortNameOfInstitution;

        /**
         * Gets the value of the k12StudentId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12StudentId() {
            return k12StudentId;
        }

        /**
         * Sets the value of the k12StudentId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12StudentId(String value) {
            this.k12StudentId = value;
        }

        /**
         * Gets the value of the k12StudentIdSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12StudentIdSystem() {
            return k12StudentIdSystem;
        }

        /**
         * Sets the value of the k12StudentIdSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12StudentIdSystem(String value) {
            this.k12StudentIdSystem = value;
        }

        /**
         * Gets the value of the k12SchoolId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12SchoolId() {
            return k12SchoolId;
        }

        /**
         * Sets the value of the k12SchoolId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12SchoolId(String value) {
            this.k12SchoolId = value;
        }

        /**
         * Gets the value of the k12SchoolIdSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12SchoolIdSystem() {
            return k12SchoolIdSystem;
        }

        /**
         * Sets the value of the k12SchoolIdSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12SchoolIdSystem(String value) {
            this.k12SchoolIdSystem = value;
        }

        /**
         * Gets the value of the k12InstitutionName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12InstitutionName() {
            return k12InstitutionName;
        }

        /**
         * Sets the value of the k12InstitutionName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12InstitutionName(String value) {
            this.k12InstitutionName = value;
        }

        /**
         * Gets the value of the k12CountyANSICode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12CountyANSICode() {
            return k12CountyANSICode;
        }

        /**
         * Sets the value of the k12CountyANSICode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12CountyANSICode(String value) {
            this.k12CountyANSICode = value;
        }

        /**
         * Gets the value of the k12LEAId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12LEAId() {
            return k12LEAId;
        }

        /**
         * Sets the value of the k12LEAId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12LEAId(String value) {
            this.k12LEAId = value;
        }

        /**
         * Gets the value of the k12LEAIdSystem property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12LEAIdSystem() {
            return k12LEAIdSystem;
        }

        /**
         * Sets the value of the k12LEAIdSystem property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12LEAIdSystem(String value) {
            this.k12LEAIdSystem = value;
        }

        /**
         * Gets the value of the k12CredentialAwardDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12CredentialAwardDate() {
            return k12CredentialAwardDate;
        }

        /**
         * Sets the value of the k12CredentialAwardDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12CredentialAwardDate(String value) {
            this.k12CredentialAwardDate = value;
        }

        /**
         * Gets the value of the k12GPACumulative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12GPACumulative() {
            return k12GPACumulative;
        }

        /**
         * Sets the value of the k12GPACumulative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12GPACumulative(String value) {
            this.k12GPACumulative = value;
        }

        /**
         * Gets the value of the k12GPAWeightedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12GPAWeightedIndicator() {
            return k12GPAWeightedIndicator;
        }

        /**
         * Sets the value of the k12GPAWeightedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12GPAWeightedIndicator(String value) {
            this.k12GPAWeightedIndicator = value;
        }

        /**
         * Gets the value of the k12HighSchoolDiplomaType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12HighSchoolDiplomaType() {
            return k12HighSchoolDiplomaType;
        }

        /**
         * Sets the value of the k12HighSchoolDiplomaType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12HighSchoolDiplomaType(String value) {
            this.k12HighSchoolDiplomaType = value;
        }

        /**
         * Gets the value of the k12CohortYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getK12CohortYear() {
            return k12CohortYear;
        }

        /**
         * Sets the value of the k12CohortYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setK12CohortYear(String value) {
            this.k12CohortYear = value;
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
     *         &lt;element name="program" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="work-basedLearningOpportunityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "program"
    })
    public static class ProgramList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<PsStudentType.ProgramList.Program> program;

        /**
         * Gets the value of the program property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the program property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProgram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PsStudentType.ProgramList.Program }
         * 
         * 
         */
        public List<PsStudentType.ProgramList.Program> getProgram() {
            if (program == null) {
                program = new ArrayList<PsStudentType.ProgramList.Program>();
            }
            return this.program;
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
         *         &lt;element name="work-basedLearningOpportunityType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "workBasedLearningOpportunityType"
        })
        public static class Program {

            @XmlElement(name = "work-basedLearningOpportunityType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String workBasedLearningOpportunityType;

            /**
             * Gets the value of the workBasedLearningOpportunityType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getWorkBasedLearningOpportunityType() {
                return workBasedLearningOpportunityType;
            }

            /**
             * Sets the value of the workBasedLearningOpportunityType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setWorkBasedLearningOpportunityType(String value) {
                this.workBasedLearningOpportunityType = value;
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
     *         &lt;element name="teacherPreparationEnrollmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teacherPreparationCompleterStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="supervisedClinicalExperience" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="supervisedClinicalExperienceClockHours" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teacherEducationExamType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teacherEducationExamScoreType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teacherEducationTestCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teachingCredentialBasis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="teachingCredentialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="alternativeRouteToCertificationOrLicensure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="criticalTeacherShortageAreaCandidate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "teacherPreparationEnrollmentStatus",
        "teacherPreparationCompleterStatus",
        "supervisedClinicalExperience",
        "supervisedClinicalExperienceClockHours",
        "teacherEducationExamType",
        "teacherEducationExamScoreType",
        "teacherEducationTestCompany",
        "teachingCredentialBasis",
        "teachingCredentialType",
        "alternativeRouteToCertificationOrLicensure",
        "criticalTeacherShortageAreaCandidate"
    })
    public static class TeacherPrep {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teacherPreparationEnrollmentStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teacherPreparationCompleterStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String supervisedClinicalExperience;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String supervisedClinicalExperienceClockHours;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teacherEducationExamType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teacherEducationExamScoreType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teacherEducationTestCompany;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teachingCredentialBasis;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String teachingCredentialType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String alternativeRouteToCertificationOrLicensure;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String criticalTeacherShortageAreaCandidate;

        /**
         * Gets the value of the teacherPreparationEnrollmentStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeacherPreparationEnrollmentStatus() {
            return teacherPreparationEnrollmentStatus;
        }

        /**
         * Sets the value of the teacherPreparationEnrollmentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeacherPreparationEnrollmentStatus(String value) {
            this.teacherPreparationEnrollmentStatus = value;
        }

        /**
         * Gets the value of the teacherPreparationCompleterStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeacherPreparationCompleterStatus() {
            return teacherPreparationCompleterStatus;
        }

        /**
         * Sets the value of the teacherPreparationCompleterStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeacherPreparationCompleterStatus(String value) {
            this.teacherPreparationCompleterStatus = value;
        }

        /**
         * Gets the value of the supervisedClinicalExperience property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupervisedClinicalExperience() {
            return supervisedClinicalExperience;
        }

        /**
         * Sets the value of the supervisedClinicalExperience property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupervisedClinicalExperience(String value) {
            this.supervisedClinicalExperience = value;
        }

        /**
         * Gets the value of the supervisedClinicalExperienceClockHours property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupervisedClinicalExperienceClockHours() {
            return supervisedClinicalExperienceClockHours;
        }

        /**
         * Sets the value of the supervisedClinicalExperienceClockHours property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupervisedClinicalExperienceClockHours(String value) {
            this.supervisedClinicalExperienceClockHours = value;
        }

        /**
         * Gets the value of the teacherEducationExamType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeacherEducationExamType() {
            return teacherEducationExamType;
        }

        /**
         * Sets the value of the teacherEducationExamType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeacherEducationExamType(String value) {
            this.teacherEducationExamType = value;
        }

        /**
         * Gets the value of the teacherEducationExamScoreType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeacherEducationExamScoreType() {
            return teacherEducationExamScoreType;
        }

        /**
         * Sets the value of the teacherEducationExamScoreType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeacherEducationExamScoreType(String value) {
            this.teacherEducationExamScoreType = value;
        }

        /**
         * Gets the value of the teacherEducationTestCompany property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeacherEducationTestCompany() {
            return teacherEducationTestCompany;
        }

        /**
         * Sets the value of the teacherEducationTestCompany property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeacherEducationTestCompany(String value) {
            this.teacherEducationTestCompany = value;
        }

        /**
         * Gets the value of the teachingCredentialBasis property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeachingCredentialBasis() {
            return teachingCredentialBasis;
        }

        /**
         * Sets the value of the teachingCredentialBasis property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeachingCredentialBasis(String value) {
            this.teachingCredentialBasis = value;
        }

        /**
         * Gets the value of the teachingCredentialType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTeachingCredentialType() {
            return teachingCredentialType;
        }

        /**
         * Sets the value of the teachingCredentialType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTeachingCredentialType(String value) {
            this.teachingCredentialType = value;
        }

        /**
         * Gets the value of the alternativeRouteToCertificationOrLicensure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlternativeRouteToCertificationOrLicensure() {
            return alternativeRouteToCertificationOrLicensure;
        }

        /**
         * Sets the value of the alternativeRouteToCertificationOrLicensure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlternativeRouteToCertificationOrLicensure(String value) {
            this.alternativeRouteToCertificationOrLicensure = value;
        }

        /**
         * Gets the value of the criticalTeacherShortageAreaCandidate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCriticalTeacherShortageAreaCandidate() {
            return criticalTeacherShortageAreaCandidate;
        }

        /**
         * Sets the value of the criticalTeacherShortageAreaCandidate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCriticalTeacherShortageAreaCandidate(String value) {
            this.criticalTeacherShortageAreaCandidate = value;
        }

    }

}
