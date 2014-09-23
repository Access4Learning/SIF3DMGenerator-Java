
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
 * <p>Java class for k12StudentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="k12StudentType">
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
 *                   &lt;element name="identification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                   &lt;element name="twoOrMoreRaces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="hispanicOrLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="countryOfBirthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="stateOfBirthAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cityOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="residenceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="enrollmentList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="enrollment" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="leaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="leaIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="schoolIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="responsibleDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="responsibleDistrictType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="responsibleSchoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="responsibleSchoolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="kindergartenProgramParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="giftedAndTalented" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="enrollmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="entryGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="entryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exitGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exitStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cohortYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="cohortGraduationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="activityInvolvementBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="activityInvolvementEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="gedPreparationProgramParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="displacedStudent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="truantStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="programGiftedEligibilityCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="activityList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="activity" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="activityInvolvementBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="activityInvolvementEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="courseList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="course" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="courseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="courseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="gradeLevelWhenCourseTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="courseRepeatCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numberOfCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="numberOfCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="gradeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="gradeValueQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="academicRecord" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="creditsAttemptedCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="technologyLiteracyStatusIn8thGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="creditsEarnedCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gradePointsEarnedCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gpaCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="gpaGivenSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="highSchoolStudentClassRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="totalNumberInClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="classRankingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="projectedGraduationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="diplomaOrCredentialAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="highSchoolDiplomaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="academicHonorsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="highSchoolDiplomaDistinctionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="honorsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteCompleter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="recognitionForParticipationOrPerformanceInAnActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="endOfTermStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="promotionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="nonpromotionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="literacyAssessmentAdministeredType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="literacyGoalMetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="literacyPostTestStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="literacyPreTestStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="postsecondaryEnrollmentAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cohortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="graduationRateSurveyCohortYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="graduationRateSurveyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="preAndPostTestIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="proficiencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="progressLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="careerEducationPlanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="careerEducationPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="professionalOrTechnicalCredentialConferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="attendance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="daysInAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="daysAbsent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="studentAttendanceRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="attendanceEventList" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="attendanceEvent" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="calendarEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="attendanceEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="dailyAttendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="absentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                       &lt;element name="presentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="cte" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programHeathSafetyChecklistUseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteConcentrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteParticipant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="displacedHomemaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="singleParentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteNontraditionalCompletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="cteCompleter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="disability" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ideaIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="disabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="section504Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="primaryDisability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="awaitingInitialIDEAEvaluation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ideaEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="disabilityConditionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="disabilityDeterminationSourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="disciplineEventList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="disciplineEvent" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="actionTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="durationOfAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="shortenedExpulsion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="actionLengthDifferenceReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="educationalServicesAfterRemoval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="fullYearExpulsion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="relatedToZeroTolerancePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ideaInterimRemoval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="ideaInterimRemovalReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="disciplinaryActionIEPPlacementMeetingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="economic" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="eligibilitySchoolFoodServicePrograms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="statusStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="statusEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="economicDisadvantageStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="participationInSchoolFoodServicePrograms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="homeless" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="homelessnessStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="statusStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="statusEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="primaryNighttimeResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="servicedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="unaccompaniedYouthStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="immigrant" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="title3ImmigrantStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="title3ImmigrantParticipationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="immigrantStatusStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="immigrantStatusEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="firstUSEnrollment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lep" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lepExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="perkinsLEPStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="title3AccountabilityProgressStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="title3LEPParticipationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lepEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="migrant" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="migrantStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="mepContinuationOfServicesStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="continuationOfServicesReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="educationProgramParticipationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="educationProgramServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="educationProgramEnrollmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="educationProgramProjectBased" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="prioritizedForServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="studentQualifyingArrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="lastQualifyingMoveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qualifyingMoveFromCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qualifyingMoveFromCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="qualifyingMoveFromState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="educationProgramEligibilityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="designatedGraduationSchoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="birthDateVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="immunizationRecordFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="multipleBirthIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="neglectedOrDelinquent" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="neglectedDelinquentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="academicAchievementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="academicOutcomeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="obtainedEmployment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="participationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="participationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="participationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="exitReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="programIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="specialEducation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="fte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="exitReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="servicesExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="title1" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolChoiceAppliedForTransferStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolChoiceEligibleForTransferStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolChoiceTransferStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolSupplementalServicesAppliedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolSupplementalServicesEligibleStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolSupplementalServicesReceivedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="schoolwideProgramParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="targetedAssistanceParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="individualizedProgramList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="individualizedProgram" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="dateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="nonInclusionMinutesPerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="inclusionMinutesPerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="transitionPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="servicePlanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="servicePlanMeetingLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="servicePlanMeetingParticipants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="servicePlanSignedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="servicePlanSignatureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="servicePlanReevaluationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="studentSupportServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="healthRecordList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="healthRecord" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="medicalAlertIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="allergyReactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="allergySeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="allergyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="visionScreeningDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="visionScreeningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="employmentRecordList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="employmentRecord" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="employedWhileEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="employedAfterExit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="employmentNAICSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="employmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="employmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "k12StudentType", namespace = "http://www.sifassociation.org/datamodel/na/3.2", propOrder = {
    "identity",
    "contact",
    "demographic",
    "enrollmentList",
    "activityList",
    "courseList",
    "academicRecord",
    "attendance",
    "cte",
    "disability",
    "disciplineEventList",
    "languageList",
    "economic",
    "homeless",
    "immigrant",
    "lep",
    "migrant",
    "neglectedOrDelinquent",
    "programList",
    "specialEducation",
    "title1",
    "individualizedProgramList",
    "healthRecordList",
    "employmentRecordList"
})
public class K12StudentType {

    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Identity identity;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Contact contact;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Demographic demographic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.EnrollmentList enrollmentList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.ActivityList activityList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.CourseList courseList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.AcademicRecord academicRecord;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Attendance attendance;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Cte cte;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Disability disability;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.DisciplineEventList disciplineEventList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.LanguageList languageList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Economic economic;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Homeless homeless;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Immigrant immigrant;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Lep lep;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Migrant migrant;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.NeglectedOrDelinquent neglectedOrDelinquent;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.ProgramList programList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.SpecialEducation specialEducation;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.Title1 title1;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.IndividualizedProgramList individualizedProgramList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.HealthRecordList healthRecordList;
    @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
    protected K12StudentType.EmploymentRecordList employmentRecordList;
    @XmlAttribute(name = "refId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refId;

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Identity }
     *     
     */
    public K12StudentType.Identity getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Identity }
     *     
     */
    public void setIdentity(K12StudentType.Identity value) {
        this.identity = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Contact }
     *     
     */
    public K12StudentType.Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Contact }
     *     
     */
    public void setContact(K12StudentType.Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the demographic property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Demographic }
     *     
     */
    public K12StudentType.Demographic getDemographic() {
        return demographic;
    }

    /**
     * Sets the value of the demographic property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Demographic }
     *     
     */
    public void setDemographic(K12StudentType.Demographic value) {
        this.demographic = value;
    }

    /**
     * Gets the value of the enrollmentList property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.EnrollmentList }
     *     
     */
    public K12StudentType.EnrollmentList getEnrollmentList() {
        return enrollmentList;
    }

    /**
     * Sets the value of the enrollmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.EnrollmentList }
     *     
     */
    public void setEnrollmentList(K12StudentType.EnrollmentList value) {
        this.enrollmentList = value;
    }

    /**
     * Gets the value of the activityList property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.ActivityList }
     *     
     */
    public K12StudentType.ActivityList getActivityList() {
        return activityList;
    }

    /**
     * Sets the value of the activityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.ActivityList }
     *     
     */
    public void setActivityList(K12StudentType.ActivityList value) {
        this.activityList = value;
    }

    /**
     * Gets the value of the courseList property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.CourseList }
     *     
     */
    public K12StudentType.CourseList getCourseList() {
        return courseList;
    }

    /**
     * Sets the value of the courseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.CourseList }
     *     
     */
    public void setCourseList(K12StudentType.CourseList value) {
        this.courseList = value;
    }

    /**
     * Gets the value of the academicRecord property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.AcademicRecord }
     *     
     */
    public K12StudentType.AcademicRecord getAcademicRecord() {
        return academicRecord;
    }

    /**
     * Sets the value of the academicRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.AcademicRecord }
     *     
     */
    public void setAcademicRecord(K12StudentType.AcademicRecord value) {
        this.academicRecord = value;
    }

    /**
     * Gets the value of the attendance property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Attendance }
     *     
     */
    public K12StudentType.Attendance getAttendance() {
        return attendance;
    }

    /**
     * Sets the value of the attendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Attendance }
     *     
     */
    public void setAttendance(K12StudentType.Attendance value) {
        this.attendance = value;
    }

    /**
     * Gets the value of the cte property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Cte }
     *     
     */
    public K12StudentType.Cte getCte() {
        return cte;
    }

    /**
     * Sets the value of the cte property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Cte }
     *     
     */
    public void setCte(K12StudentType.Cte value) {
        this.cte = value;
    }

    /**
     * Gets the value of the disability property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Disability }
     *     
     */
    public K12StudentType.Disability getDisability() {
        return disability;
    }

    /**
     * Sets the value of the disability property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Disability }
     *     
     */
    public void setDisability(K12StudentType.Disability value) {
        this.disability = value;
    }

    /**
     * Gets the value of the disciplineEventList property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.DisciplineEventList }
     *     
     */
    public K12StudentType.DisciplineEventList getDisciplineEventList() {
        return disciplineEventList;
    }

    /**
     * Sets the value of the disciplineEventList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.DisciplineEventList }
     *     
     */
    public void setDisciplineEventList(K12StudentType.DisciplineEventList value) {
        this.disciplineEventList = value;
    }

    /**
     * Gets the value of the languageList property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.LanguageList }
     *     
     */
    public K12StudentType.LanguageList getLanguageList() {
        return languageList;
    }

    /**
     * Sets the value of the languageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.LanguageList }
     *     
     */
    public void setLanguageList(K12StudentType.LanguageList value) {
        this.languageList = value;
    }

    /**
     * Gets the value of the economic property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Economic }
     *     
     */
    public K12StudentType.Economic getEconomic() {
        return economic;
    }

    /**
     * Sets the value of the economic property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Economic }
     *     
     */
    public void setEconomic(K12StudentType.Economic value) {
        this.economic = value;
    }

    /**
     * Gets the value of the homeless property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Homeless }
     *     
     */
    public K12StudentType.Homeless getHomeless() {
        return homeless;
    }

    /**
     * Sets the value of the homeless property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Homeless }
     *     
     */
    public void setHomeless(K12StudentType.Homeless value) {
        this.homeless = value;
    }

    /**
     * Gets the value of the immigrant property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Immigrant }
     *     
     */
    public K12StudentType.Immigrant getImmigrant() {
        return immigrant;
    }

    /**
     * Sets the value of the immigrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Immigrant }
     *     
     */
    public void setImmigrant(K12StudentType.Immigrant value) {
        this.immigrant = value;
    }

    /**
     * Gets the value of the lep property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Lep }
     *     
     */
    public K12StudentType.Lep getLep() {
        return lep;
    }

    /**
     * Sets the value of the lep property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Lep }
     *     
     */
    public void setLep(K12StudentType.Lep value) {
        this.lep = value;
    }

    /**
     * Gets the value of the migrant property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Migrant }
     *     
     */
    public K12StudentType.Migrant getMigrant() {
        return migrant;
    }

    /**
     * Sets the value of the migrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Migrant }
     *     
     */
    public void setMigrant(K12StudentType.Migrant value) {
        this.migrant = value;
    }

    /**
     * Gets the value of the neglectedOrDelinquent property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.NeglectedOrDelinquent }
     *     
     */
    public K12StudentType.NeglectedOrDelinquent getNeglectedOrDelinquent() {
        return neglectedOrDelinquent;
    }

    /**
     * Sets the value of the neglectedOrDelinquent property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.NeglectedOrDelinquent }
     *     
     */
    public void setNeglectedOrDelinquent(K12StudentType.NeglectedOrDelinquent value) {
        this.neglectedOrDelinquent = value;
    }

    /**
     * Gets the value of the programList property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.ProgramList }
     *     
     */
    public K12StudentType.ProgramList getProgramList() {
        return programList;
    }

    /**
     * Sets the value of the programList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.ProgramList }
     *     
     */
    public void setProgramList(K12StudentType.ProgramList value) {
        this.programList = value;
    }

    /**
     * Gets the value of the specialEducation property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.SpecialEducation }
     *     
     */
    public K12StudentType.SpecialEducation getSpecialEducation() {
        return specialEducation;
    }

    /**
     * Sets the value of the specialEducation property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.SpecialEducation }
     *     
     */
    public void setSpecialEducation(K12StudentType.SpecialEducation value) {
        this.specialEducation = value;
    }

    /**
     * Gets the value of the title1 property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.Title1 }
     *     
     */
    public K12StudentType.Title1 getTitle1() {
        return title1;
    }

    /**
     * Sets the value of the title1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.Title1 }
     *     
     */
    public void setTitle1(K12StudentType.Title1 value) {
        this.title1 = value;
    }

    /**
     * Gets the value of the individualizedProgramList property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.IndividualizedProgramList }
     *     
     */
    public K12StudentType.IndividualizedProgramList getIndividualizedProgramList() {
        return individualizedProgramList;
    }

    /**
     * Sets the value of the individualizedProgramList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.IndividualizedProgramList }
     *     
     */
    public void setIndividualizedProgramList(K12StudentType.IndividualizedProgramList value) {
        this.individualizedProgramList = value;
    }

    /**
     * Gets the value of the healthRecordList property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.HealthRecordList }
     *     
     */
    public K12StudentType.HealthRecordList getHealthRecordList() {
        return healthRecordList;
    }

    /**
     * Sets the value of the healthRecordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.HealthRecordList }
     *     
     */
    public void setHealthRecordList(K12StudentType.HealthRecordList value) {
        this.healthRecordList = value;
    }

    /**
     * Gets the value of the employmentRecordList property.
     * 
     * @return
     *     possible object is
     *     {@link K12StudentType.EmploymentRecordList }
     *     
     */
    public K12StudentType.EmploymentRecordList getEmploymentRecordList() {
        return employmentRecordList;
    }

    /**
     * Sets the value of the employmentRecordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link K12StudentType.EmploymentRecordList }
     *     
     */
    public void setEmploymentRecordList(K12StudentType.EmploymentRecordList value) {
        this.employmentRecordList = value;
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
     *         &lt;element name="creditsAttemptedCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="technologyLiteracyStatusIn8thGrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="creditsEarnedCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gradePointsEarnedCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gpaCumulative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="gpaGivenSession" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="highSchoolStudentClassRank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="totalNumberInClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="classRankingDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="projectedGraduationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="diplomaOrCredentialAwardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="highSchoolDiplomaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="academicHonorsType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="highSchoolDiplomaDistinctionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="honorsDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteCompleter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="recognitionForParticipationOrPerformanceInAnActivity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="endOfTermStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="promotionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="nonpromotionReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="literacyAssessmentAdministeredType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="literacyGoalMetStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="literacyPostTestStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="literacyPreTestStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="postsecondaryEnrollmentAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cohortDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="graduationRateSurveyCohortYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="graduationRateSurveyIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="preAndPostTestIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="proficiencyStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="progressLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="careerEducationPlanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="careerEducationPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="professionalOrTechnicalCredentialConferred" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "creditsAttemptedCumulative",
        "technologyLiteracyStatusIn8ThGrade",
        "creditsEarnedCumulative",
        "gradePointsEarnedCumulative",
        "gpaCumulative",
        "gpaGivenSession",
        "highSchoolStudentClassRank",
        "totalNumberInClass",
        "classRankingDate",
        "projectedGraduationDate",
        "diplomaOrCredentialAwardDate",
        "highSchoolDiplomaType",
        "academicHonorsType",
        "highSchoolDiplomaDistinctionType",
        "honorsDescription",
        "cteCompleter",
        "activityIdentifier",
        "activityTitle",
        "recognitionForParticipationOrPerformanceInAnActivity",
        "endOfTermStatus",
        "promotionReason",
        "nonpromotionReason",
        "literacyAssessmentAdministeredType",
        "literacyGoalMetStatus",
        "literacyPostTestStatus",
        "literacyPreTestStatus",
        "postsecondaryEnrollmentAction",
        "cohortDescription",
        "graduationRateSurveyCohortYear",
        "graduationRateSurveyIndicator",
        "preAndPostTestIndicator",
        "proficiencyStatus",
        "progressLevel",
        "careerEducationPlanDate",
        "careerEducationPlanType",
        "professionalOrTechnicalCredentialConferred"
    })
    public static class AcademicRecord {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String creditsAttemptedCumulative;
        @XmlElement(name = "technologyLiteracyStatusIn8thGrade", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String technologyLiteracyStatusIn8ThGrade;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String creditsEarnedCumulative;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String gradePointsEarnedCumulative;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String gpaCumulative;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String gpaGivenSession;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String highSchoolStudentClassRank;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String totalNumberInClass;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String classRankingDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String projectedGraduationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String diplomaOrCredentialAwardDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String highSchoolDiplomaType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String academicHonorsType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String highSchoolDiplomaDistinctionType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String honorsDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteCompleter;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String activityIdentifier;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String activityTitle;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String recognitionForParticipationOrPerformanceInAnActivity;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String endOfTermStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String promotionReason;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String nonpromotionReason;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String literacyAssessmentAdministeredType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String literacyGoalMetStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String literacyPostTestStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String literacyPreTestStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String postsecondaryEnrollmentAction;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cohortDescription;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String graduationRateSurveyCohortYear;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String graduationRateSurveyIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String preAndPostTestIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String proficiencyStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String progressLevel;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String careerEducationPlanDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String careerEducationPlanType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String professionalOrTechnicalCredentialConferred;

        /**
         * Gets the value of the creditsAttemptedCumulative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditsAttemptedCumulative() {
            return creditsAttemptedCumulative;
        }

        /**
         * Sets the value of the creditsAttemptedCumulative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditsAttemptedCumulative(String value) {
            this.creditsAttemptedCumulative = value;
        }

        /**
         * Gets the value of the technologyLiteracyStatusIn8ThGrade property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTechnologyLiteracyStatusIn8ThGrade() {
            return technologyLiteracyStatusIn8ThGrade;
        }

        /**
         * Sets the value of the technologyLiteracyStatusIn8ThGrade property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTechnologyLiteracyStatusIn8ThGrade(String value) {
            this.technologyLiteracyStatusIn8ThGrade = value;
        }

        /**
         * Gets the value of the creditsEarnedCumulative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreditsEarnedCumulative() {
            return creditsEarnedCumulative;
        }

        /**
         * Sets the value of the creditsEarnedCumulative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreditsEarnedCumulative(String value) {
            this.creditsEarnedCumulative = value;
        }

        /**
         * Gets the value of the gradePointsEarnedCumulative property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGradePointsEarnedCumulative() {
            return gradePointsEarnedCumulative;
        }

        /**
         * Sets the value of the gradePointsEarnedCumulative property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGradePointsEarnedCumulative(String value) {
            this.gradePointsEarnedCumulative = value;
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
         * Gets the value of the gpaGivenSession property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGpaGivenSession() {
            return gpaGivenSession;
        }

        /**
         * Sets the value of the gpaGivenSession property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGpaGivenSession(String value) {
            this.gpaGivenSession = value;
        }

        /**
         * Gets the value of the highSchoolStudentClassRank property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHighSchoolStudentClassRank() {
            return highSchoolStudentClassRank;
        }

        /**
         * Sets the value of the highSchoolStudentClassRank property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHighSchoolStudentClassRank(String value) {
            this.highSchoolStudentClassRank = value;
        }

        /**
         * Gets the value of the totalNumberInClass property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotalNumberInClass() {
            return totalNumberInClass;
        }

        /**
         * Sets the value of the totalNumberInClass property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotalNumberInClass(String value) {
            this.totalNumberInClass = value;
        }

        /**
         * Gets the value of the classRankingDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassRankingDate() {
            return classRankingDate;
        }

        /**
         * Sets the value of the classRankingDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassRankingDate(String value) {
            this.classRankingDate = value;
        }

        /**
         * Gets the value of the projectedGraduationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProjectedGraduationDate() {
            return projectedGraduationDate;
        }

        /**
         * Sets the value of the projectedGraduationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProjectedGraduationDate(String value) {
            this.projectedGraduationDate = value;
        }

        /**
         * Gets the value of the diplomaOrCredentialAwardDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiplomaOrCredentialAwardDate() {
            return diplomaOrCredentialAwardDate;
        }

        /**
         * Sets the value of the diplomaOrCredentialAwardDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiplomaOrCredentialAwardDate(String value) {
            this.diplomaOrCredentialAwardDate = value;
        }

        /**
         * Gets the value of the highSchoolDiplomaType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHighSchoolDiplomaType() {
            return highSchoolDiplomaType;
        }

        /**
         * Sets the value of the highSchoolDiplomaType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHighSchoolDiplomaType(String value) {
            this.highSchoolDiplomaType = value;
        }

        /**
         * Gets the value of the academicHonorsType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcademicHonorsType() {
            return academicHonorsType;
        }

        /**
         * Sets the value of the academicHonorsType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcademicHonorsType(String value) {
            this.academicHonorsType = value;
        }

        /**
         * Gets the value of the highSchoolDiplomaDistinctionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHighSchoolDiplomaDistinctionType() {
            return highSchoolDiplomaDistinctionType;
        }

        /**
         * Sets the value of the highSchoolDiplomaDistinctionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHighSchoolDiplomaDistinctionType(String value) {
            this.highSchoolDiplomaDistinctionType = value;
        }

        /**
         * Gets the value of the honorsDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHonorsDescription() {
            return honorsDescription;
        }

        /**
         * Sets the value of the honorsDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHonorsDescription(String value) {
            this.honorsDescription = value;
        }

        /**
         * Gets the value of the cteCompleter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCteCompleter() {
            return cteCompleter;
        }

        /**
         * Sets the value of the cteCompleter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCteCompleter(String value) {
            this.cteCompleter = value;
        }

        /**
         * Gets the value of the activityIdentifier property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivityIdentifier() {
            return activityIdentifier;
        }

        /**
         * Sets the value of the activityIdentifier property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivityIdentifier(String value) {
            this.activityIdentifier = value;
        }

        /**
         * Gets the value of the activityTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActivityTitle() {
            return activityTitle;
        }

        /**
         * Sets the value of the activityTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActivityTitle(String value) {
            this.activityTitle = value;
        }

        /**
         * Gets the value of the recognitionForParticipationOrPerformanceInAnActivity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRecognitionForParticipationOrPerformanceInAnActivity() {
            return recognitionForParticipationOrPerformanceInAnActivity;
        }

        /**
         * Sets the value of the recognitionForParticipationOrPerformanceInAnActivity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRecognitionForParticipationOrPerformanceInAnActivity(String value) {
            this.recognitionForParticipationOrPerformanceInAnActivity = value;
        }

        /**
         * Gets the value of the endOfTermStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndOfTermStatus() {
            return endOfTermStatus;
        }

        /**
         * Sets the value of the endOfTermStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndOfTermStatus(String value) {
            this.endOfTermStatus = value;
        }

        /**
         * Gets the value of the promotionReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotionReason() {
            return promotionReason;
        }

        /**
         * Sets the value of the promotionReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotionReason(String value) {
            this.promotionReason = value;
        }

        /**
         * Gets the value of the nonpromotionReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNonpromotionReason() {
            return nonpromotionReason;
        }

        /**
         * Sets the value of the nonpromotionReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNonpromotionReason(String value) {
            this.nonpromotionReason = value;
        }

        /**
         * Gets the value of the literacyAssessmentAdministeredType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLiteracyAssessmentAdministeredType() {
            return literacyAssessmentAdministeredType;
        }

        /**
         * Sets the value of the literacyAssessmentAdministeredType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLiteracyAssessmentAdministeredType(String value) {
            this.literacyAssessmentAdministeredType = value;
        }

        /**
         * Gets the value of the literacyGoalMetStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLiteracyGoalMetStatus() {
            return literacyGoalMetStatus;
        }

        /**
         * Sets the value of the literacyGoalMetStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLiteracyGoalMetStatus(String value) {
            this.literacyGoalMetStatus = value;
        }

        /**
         * Gets the value of the literacyPostTestStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLiteracyPostTestStatus() {
            return literacyPostTestStatus;
        }

        /**
         * Sets the value of the literacyPostTestStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLiteracyPostTestStatus(String value) {
            this.literacyPostTestStatus = value;
        }

        /**
         * Gets the value of the literacyPreTestStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLiteracyPreTestStatus() {
            return literacyPreTestStatus;
        }

        /**
         * Sets the value of the literacyPreTestStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLiteracyPreTestStatus(String value) {
            this.literacyPreTestStatus = value;
        }

        /**
         * Gets the value of the postsecondaryEnrollmentAction property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPostsecondaryEnrollmentAction() {
            return postsecondaryEnrollmentAction;
        }

        /**
         * Sets the value of the postsecondaryEnrollmentAction property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPostsecondaryEnrollmentAction(String value) {
            this.postsecondaryEnrollmentAction = value;
        }

        /**
         * Gets the value of the cohortDescription property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCohortDescription() {
            return cohortDescription;
        }

        /**
         * Sets the value of the cohortDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCohortDescription(String value) {
            this.cohortDescription = value;
        }

        /**
         * Gets the value of the graduationRateSurveyCohortYear property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGraduationRateSurveyCohortYear() {
            return graduationRateSurveyCohortYear;
        }

        /**
         * Sets the value of the graduationRateSurveyCohortYear property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGraduationRateSurveyCohortYear(String value) {
            this.graduationRateSurveyCohortYear = value;
        }

        /**
         * Gets the value of the graduationRateSurveyIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGraduationRateSurveyIndicator() {
            return graduationRateSurveyIndicator;
        }

        /**
         * Sets the value of the graduationRateSurveyIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGraduationRateSurveyIndicator(String value) {
            this.graduationRateSurveyIndicator = value;
        }

        /**
         * Gets the value of the preAndPostTestIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreAndPostTestIndicator() {
            return preAndPostTestIndicator;
        }

        /**
         * Sets the value of the preAndPostTestIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreAndPostTestIndicator(String value) {
            this.preAndPostTestIndicator = value;
        }

        /**
         * Gets the value of the proficiencyStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProficiencyStatus() {
            return proficiencyStatus;
        }

        /**
         * Sets the value of the proficiencyStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProficiencyStatus(String value) {
            this.proficiencyStatus = value;
        }

        /**
         * Gets the value of the progressLevel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgressLevel() {
            return progressLevel;
        }

        /**
         * Sets the value of the progressLevel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgressLevel(String value) {
            this.progressLevel = value;
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
         * Gets the value of the professionalOrTechnicalCredentialConferred property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfessionalOrTechnicalCredentialConferred() {
            return professionalOrTechnicalCredentialConferred;
        }

        /**
         * Sets the value of the professionalOrTechnicalCredentialConferred property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfessionalOrTechnicalCredentialConferred(String value) {
            this.professionalOrTechnicalCredentialConferred = value;
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
     *         &lt;element name="activity" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="activityInvolvementBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="activityInvolvementEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "activity"
    })
    public static class ActivityList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<K12StudentType.ActivityList.Activity> activity;

        /**
         * Gets the value of the activity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link K12StudentType.ActivityList.Activity }
         * 
         * 
         */
        public List<K12StudentType.ActivityList.Activity> getActivity() {
            if (activity == null) {
                activity = new ArrayList<K12StudentType.ActivityList.Activity>();
            }
            return this.activity;
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
         *         &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="activityInvolvementBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="activityInvolvementEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "activityTitle",
            "activityIdentifier",
            "activityInvolvementBeginDate",
            "activityInvolvementEndDate"
        })
        public static class Activity {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String activityTitle;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String activityIdentifier;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String activityInvolvementBeginDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String activityInvolvementEndDate;

            /**
             * Gets the value of the activityTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivityTitle() {
                return activityTitle;
            }

            /**
             * Sets the value of the activityTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivityTitle(String value) {
                this.activityTitle = value;
            }

            /**
             * Gets the value of the activityIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivityIdentifier() {
                return activityIdentifier;
            }

            /**
             * Sets the value of the activityIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivityIdentifier(String value) {
                this.activityIdentifier = value;
            }

            /**
             * Gets the value of the activityInvolvementBeginDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivityInvolvementBeginDate() {
                return activityInvolvementBeginDate;
            }

            /**
             * Sets the value of the activityInvolvementBeginDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivityInvolvementBeginDate(String value) {
                this.activityInvolvementBeginDate = value;
            }

            /**
             * Gets the value of the activityInvolvementEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivityInvolvementEndDate() {
                return activityInvolvementEndDate;
            }

            /**
             * Sets the value of the activityInvolvementEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivityInvolvementEndDate(String value) {
                this.activityInvolvementEndDate = value;
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
     *         &lt;element name="daysInAttendance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="daysAbsent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="studentAttendanceRate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="attendanceEventList" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="attendanceEvent" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="calendarEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="attendanceEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="dailyAttendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="absentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                             &lt;element name="presentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "daysInAttendance",
        "daysAbsent",
        "studentAttendanceRate",
        "attendanceEventList"
    })
    public static class Attendance {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String daysInAttendance;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String daysAbsent;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String studentAttendanceRate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StudentType.Attendance.AttendanceEventList attendanceEventList;

        /**
         * Gets the value of the daysInAttendance property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDaysInAttendance() {
            return daysInAttendance;
        }

        /**
         * Sets the value of the daysInAttendance property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDaysInAttendance(String value) {
            this.daysInAttendance = value;
        }

        /**
         * Gets the value of the daysAbsent property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDaysAbsent() {
            return daysAbsent;
        }

        /**
         * Sets the value of the daysAbsent property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDaysAbsent(String value) {
            this.daysAbsent = value;
        }

        /**
         * Gets the value of the studentAttendanceRate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStudentAttendanceRate() {
            return studentAttendanceRate;
        }

        /**
         * Sets the value of the studentAttendanceRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStudentAttendanceRate(String value) {
            this.studentAttendanceRate = value;
        }

        /**
         * Gets the value of the attendanceEventList property.
         * 
         * @return
         *     possible object is
         *     {@link K12StudentType.Attendance.AttendanceEventList }
         *     
         */
        public K12StudentType.Attendance.AttendanceEventList getAttendanceEventList() {
            return attendanceEventList;
        }

        /**
         * Sets the value of the attendanceEventList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StudentType.Attendance.AttendanceEventList }
         *     
         */
        public void setAttendanceEventList(K12StudentType.Attendance.AttendanceEventList value) {
            this.attendanceEventList = value;
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
         *         &lt;element name="attendanceEvent" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="calendarEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="attendanceEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="dailyAttendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="absentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                   &lt;element name="presentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "attendanceEvent"
        })
        public static class AttendanceEventList {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected List<K12StudentType.Attendance.AttendanceEventList.AttendanceEvent> attendanceEvent;

            /**
             * Gets the value of the attendanceEvent property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the attendanceEvent property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAttendanceEvent().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link K12StudentType.Attendance.AttendanceEventList.AttendanceEvent }
             * 
             * 
             */
            public List<K12StudentType.Attendance.AttendanceEventList.AttendanceEvent> getAttendanceEvent() {
                if (attendanceEvent == null) {
                    attendanceEvent = new ArrayList<K12StudentType.Attendance.AttendanceEventList.AttendanceEvent>();
                }
                return this.attendanceEvent;
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
             *         &lt;element name="calendarEventDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="attendanceEventType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="dailyAttendanceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="absentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *         &lt;element name="presentAttendanceCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
                "calendarEventDate",
                "attendanceEventType",
                "dailyAttendanceStatus",
                "absentAttendanceCategory",
                "presentAttendanceCategory"
            })
            public static class AttendanceEvent {

                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String calendarEventDate;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String attendanceEventType;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String dailyAttendanceStatus;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String absentAttendanceCategory;
                @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
                protected String presentAttendanceCategory;

                /**
                 * Gets the value of the calendarEventDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCalendarEventDate() {
                    return calendarEventDate;
                }

                /**
                 * Sets the value of the calendarEventDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCalendarEventDate(String value) {
                    this.calendarEventDate = value;
                }

                /**
                 * Gets the value of the attendanceEventType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAttendanceEventType() {
                    return attendanceEventType;
                }

                /**
                 * Sets the value of the attendanceEventType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAttendanceEventType(String value) {
                    this.attendanceEventType = value;
                }

                /**
                 * Gets the value of the dailyAttendanceStatus property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDailyAttendanceStatus() {
                    return dailyAttendanceStatus;
                }

                /**
                 * Sets the value of the dailyAttendanceStatus property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDailyAttendanceStatus(String value) {
                    this.dailyAttendanceStatus = value;
                }

                /**
                 * Gets the value of the absentAttendanceCategory property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAbsentAttendanceCategory() {
                    return absentAttendanceCategory;
                }

                /**
                 * Sets the value of the absentAttendanceCategory property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAbsentAttendanceCategory(String value) {
                    this.absentAttendanceCategory = value;
                }

                /**
                 * Gets the value of the presentAttendanceCategory property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPresentAttendanceCategory() {
                    return presentAttendanceCategory;
                }

                /**
                 * Sets the value of the presentAttendanceCategory property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPresentAttendanceCategory(String value) {
                    this.presentAttendanceCategory = value;
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
        protected K12StudentType.Contact.AddressList addressList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StudentType.Contact.PhoneNumberList phoneNumberList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StudentType.Contact.EmailList emailList;

        /**
         * Gets the value of the addressList property.
         * 
         * @return
         *     possible object is
         *     {@link K12StudentType.Contact.AddressList }
         *     
         */
        public K12StudentType.Contact.AddressList getAddressList() {
            return addressList;
        }

        /**
         * Sets the value of the addressList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StudentType.Contact.AddressList }
         *     
         */
        public void setAddressList(K12StudentType.Contact.AddressList value) {
            this.addressList = value;
        }

        /**
         * Gets the value of the phoneNumberList property.
         * 
         * @return
         *     possible object is
         *     {@link K12StudentType.Contact.PhoneNumberList }
         *     
         */
        public K12StudentType.Contact.PhoneNumberList getPhoneNumberList() {
            return phoneNumberList;
        }

        /**
         * Sets the value of the phoneNumberList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StudentType.Contact.PhoneNumberList }
         *     
         */
        public void setPhoneNumberList(K12StudentType.Contact.PhoneNumberList value) {
            this.phoneNumberList = value;
        }

        /**
         * Gets the value of the emailList property.
         * 
         * @return
         *     possible object is
         *     {@link K12StudentType.Contact.EmailList }
         *     
         */
        public K12StudentType.Contact.EmailList getEmailList() {
            return emailList;
        }

        /**
         * Sets the value of the emailList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StudentType.Contact.EmailList }
         *     
         */
        public void setEmailList(K12StudentType.Contact.EmailList value) {
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
            protected List<K12StudentType.Contact.AddressList.Address> address;

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
             * {@link K12StudentType.Contact.AddressList.Address }
             * 
             * 
             */
            public List<K12StudentType.Contact.AddressList.Address> getAddress() {
                if (address == null) {
                    address = new ArrayList<K12StudentType.Contact.AddressList.Address>();
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
                protected K12StudentType.Contact.AddressList.Address.Street street;
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
                 *     {@link K12StudentType.Contact.AddressList.Address.Street }
                 *     
                 */
                public K12StudentType.Contact.AddressList.Address.Street getStreet() {
                    return street;
                }

                /**
                 * Sets the value of the street property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link K12StudentType.Contact.AddressList.Address.Street }
                 *     
                 */
                public void setStreet(K12StudentType.Contact.AddressList.Address.Street value) {
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
            protected List<K12StudentType.Contact.EmailList.Email> email;

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
             * {@link K12StudentType.Contact.EmailList.Email }
             * 
             * 
             */
            public List<K12StudentType.Contact.EmailList.Email> getEmail() {
                if (email == null) {
                    email = new ArrayList<K12StudentType.Contact.EmailList.Email>();
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
            protected List<K12StudentType.Contact.PhoneNumberList.PhoneNumber> phoneNumber;

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
             * {@link K12StudentType.Contact.PhoneNumberList.PhoneNumber }
             * 
             * 
             */
            public List<K12StudentType.Contact.PhoneNumberList.PhoneNumber> getPhoneNumber() {
                if (phoneNumber == null) {
                    phoneNumber = new ArrayList<K12StudentType.Contact.PhoneNumberList.PhoneNumber>();
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
     *         &lt;element name="course" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="courseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="courseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="gradeLevelWhenCourseTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="courseRepeatCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numberOfCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="numberOfCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="gradeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="gradeValueQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "course"
    })
    public static class CourseList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<K12StudentType.CourseList.Course> course;

        /**
         * Gets the value of the course property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the course property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCourse().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link K12StudentType.CourseList.Course }
         * 
         * 
         */
        public List<K12StudentType.CourseList.Course> getCourse() {
            if (course == null) {
                course = new ArrayList<K12StudentType.CourseList.Course>();
            }
            return this.course;
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
         *         &lt;element name="courseIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="courseCodeSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="courseTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="gradeLevelWhenCourseTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="courseRepeatCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numberOfCreditsAttempted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="numberOfCreditsEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="gradeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="creditTypeEarned" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="gradeValueQualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "courseIdentifier",
            "courseCodeSystem",
            "courseTitle",
            "gradeLevelWhenCourseTaken",
            "courseRepeatCode",
            "numberOfCreditsAttempted",
            "numberOfCreditsEarned",
            "gradeEarned",
            "creditTypeEarned",
            "gradeValueQualifier"
        })
        public static class Course {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String courseIdentifier;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String courseCodeSystem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String courseTitle;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String gradeLevelWhenCourseTaken;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String courseRepeatCode;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String numberOfCreditsAttempted;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String numberOfCreditsEarned;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String gradeEarned;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String creditTypeEarned;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String gradeValueQualifier;

            /**
             * Gets the value of the courseIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCourseIdentifier() {
                return courseIdentifier;
            }

            /**
             * Sets the value of the courseIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCourseIdentifier(String value) {
                this.courseIdentifier = value;
            }

            /**
             * Gets the value of the courseCodeSystem property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCourseCodeSystem() {
                return courseCodeSystem;
            }

            /**
             * Sets the value of the courseCodeSystem property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCourseCodeSystem(String value) {
                this.courseCodeSystem = value;
            }

            /**
             * Gets the value of the courseTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCourseTitle() {
                return courseTitle;
            }

            /**
             * Sets the value of the courseTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCourseTitle(String value) {
                this.courseTitle = value;
            }

            /**
             * Gets the value of the gradeLevelWhenCourseTaken property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGradeLevelWhenCourseTaken() {
                return gradeLevelWhenCourseTaken;
            }

            /**
             * Sets the value of the gradeLevelWhenCourseTaken property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGradeLevelWhenCourseTaken(String value) {
                this.gradeLevelWhenCourseTaken = value;
            }

            /**
             * Gets the value of the courseRepeatCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCourseRepeatCode() {
                return courseRepeatCode;
            }

            /**
             * Sets the value of the courseRepeatCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCourseRepeatCode(String value) {
                this.courseRepeatCode = value;
            }

            /**
             * Gets the value of the numberOfCreditsAttempted property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumberOfCreditsAttempted() {
                return numberOfCreditsAttempted;
            }

            /**
             * Sets the value of the numberOfCreditsAttempted property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumberOfCreditsAttempted(String value) {
                this.numberOfCreditsAttempted = value;
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
             * Gets the value of the gradeEarned property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGradeEarned() {
                return gradeEarned;
            }

            /**
             * Sets the value of the gradeEarned property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGradeEarned(String value) {
                this.gradeEarned = value;
            }

            /**
             * Gets the value of the creditTypeEarned property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCreditTypeEarned() {
                return creditTypeEarned;
            }

            /**
             * Sets the value of the creditTypeEarned property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCreditTypeEarned(String value) {
                this.creditTypeEarned = value;
            }

            /**
             * Gets the value of the gradeValueQualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGradeValueQualifier() {
                return gradeValueQualifier;
            }

            /**
             * Sets the value of the gradeValueQualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGradeValueQualifier(String value) {
                this.gradeValueQualifier = value;
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
     *         &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programHeathSafetyChecklistUseStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteConcentrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteParticipant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="displacedHomemaker" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="singleParentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteNontraditionalCompletion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cteCompleter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "programParticipationStartDate",
        "programParticipationExitDate",
        "programHeathSafetyChecklistUseStatus",
        "cteConcentrator",
        "cteParticipant",
        "displacedHomemaker",
        "singleParentStatus",
        "cteNontraditionalCompletion",
        "cteCompleter"
    })
    public static class Cte {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationExitDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programHeathSafetyChecklistUseStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteConcentrator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteParticipant;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String displacedHomemaker;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String singleParentStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteNontraditionalCompletion;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cteCompleter;

        /**
         * Gets the value of the programParticipationStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationStartDate() {
            return programParticipationStartDate;
        }

        /**
         * Sets the value of the programParticipationStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationStartDate(String value) {
            this.programParticipationStartDate = value;
        }

        /**
         * Gets the value of the programParticipationExitDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationExitDate() {
            return programParticipationExitDate;
        }

        /**
         * Sets the value of the programParticipationExitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationExitDate(String value) {
            this.programParticipationExitDate = value;
        }

        /**
         * Gets the value of the programHeathSafetyChecklistUseStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramHeathSafetyChecklistUseStatus() {
            return programHeathSafetyChecklistUseStatus;
        }

        /**
         * Sets the value of the programHeathSafetyChecklistUseStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramHeathSafetyChecklistUseStatus(String value) {
            this.programHeathSafetyChecklistUseStatus = value;
        }

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
         * Gets the value of the displacedHomemaker property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDisplacedHomemaker() {
            return displacedHomemaker;
        }

        /**
         * Sets the value of the displacedHomemaker property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDisplacedHomemaker(String value) {
            this.displacedHomemaker = value;
        }

        /**
         * Gets the value of the singleParentStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleParentStatus() {
            return singleParentStatus;
        }

        /**
         * Sets the value of the singleParentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleParentStatus(String value) {
            this.singleParentStatus = value;
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

        /**
         * Gets the value of the cteCompleter property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCteCompleter() {
            return cteCompleter;
        }

        /**
         * Sets the value of the cteCompleter property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCteCompleter(String value) {
            this.cteCompleter = value;
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
     *         &lt;element name="twoOrMoreRaces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="hispanicOrLatinoEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="countryOfBirthCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="stateOfBirthAbbreviation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="cityOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="residenceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "twoOrMoreRaces",
        "hispanicOrLatinoEthnicity",
        "countryOfBirthCode",
        "stateOfBirthAbbreviation",
        "cityOfBirth",
        "residenceStatus"
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
        protected String twoOrMoreRaces;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String hispanicOrLatinoEthnicity;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String countryOfBirthCode;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String stateOfBirthAbbreviation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String cityOfBirth;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String residenceStatus;

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
         * Gets the value of the twoOrMoreRaces property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTwoOrMoreRaces() {
            return twoOrMoreRaces;
        }

        /**
         * Sets the value of the twoOrMoreRaces property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTwoOrMoreRaces(String value) {
            this.twoOrMoreRaces = value;
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
         * Gets the value of the countryOfBirthCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryOfBirthCode() {
            return countryOfBirthCode;
        }

        /**
         * Sets the value of the countryOfBirthCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryOfBirthCode(String value) {
            this.countryOfBirthCode = value;
        }

        /**
         * Gets the value of the stateOfBirthAbbreviation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateOfBirthAbbreviation() {
            return stateOfBirthAbbreviation;
        }

        /**
         * Sets the value of the stateOfBirthAbbreviation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateOfBirthAbbreviation(String value) {
            this.stateOfBirthAbbreviation = value;
        }

        /**
         * Gets the value of the cityOfBirth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityOfBirth() {
            return cityOfBirth;
        }

        /**
         * Sets the value of the cityOfBirth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityOfBirth(String value) {
            this.cityOfBirth = value;
        }

        /**
         * Gets the value of the residenceStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResidenceStatus() {
            return residenceStatus;
        }

        /**
         * Sets the value of the residenceStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResidenceStatus(String value) {
            this.residenceStatus = value;
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
     *         &lt;element name="ideaIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="disabilityStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="section504Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="primaryDisability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="awaitingInitialIDEAEvaluation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ideaEnvironment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "ideaIndicator",
        "disabilityStatus",
        "section504Status",
        "primaryDisability",
        "awaitingInitialIDEAEvaluation",
        "ideaEnvironment",
        "disabilityConditionType",
        "disabilityDeterminationSourceType"
    })
    public static class Disability {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String disabilityStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String section504Status;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String primaryDisability;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String awaitingInitialIDEAEvaluation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String ideaEnvironment;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String disabilityConditionType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String disabilityDeterminationSourceType;

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
         * Gets the value of the section504Status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSection504Status() {
            return section504Status;
        }

        /**
         * Sets the value of the section504Status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSection504Status(String value) {
            this.section504Status = value;
        }

        /**
         * Gets the value of the primaryDisability property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryDisability() {
            return primaryDisability;
        }

        /**
         * Sets the value of the primaryDisability property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryDisability(String value) {
            this.primaryDisability = value;
        }

        /**
         * Gets the value of the awaitingInitialIDEAEvaluation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAwaitingInitialIDEAEvaluation() {
            return awaitingInitialIDEAEvaluation;
        }

        /**
         * Sets the value of the awaitingInitialIDEAEvaluation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAwaitingInitialIDEAEvaluation(String value) {
            this.awaitingInitialIDEAEvaluation = value;
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
     *         &lt;element name="disciplineEvent" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="actionTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="durationOfAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="shortenedExpulsion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="actionLengthDifferenceReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="educationalServicesAfterRemoval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="fullYearExpulsion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="relatedToZeroTolerancePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ideaInterimRemoval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="ideaInterimRemovalReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="disciplinaryActionIEPPlacementMeetingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "disciplineEvent"
    })
    public static class DisciplineEventList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<K12StudentType.DisciplineEventList.DisciplineEvent> disciplineEvent;

        /**
         * Gets the value of the disciplineEvent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the disciplineEvent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDisciplineEvent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link K12StudentType.DisciplineEventList.DisciplineEvent }
         * 
         * 
         */
        public List<K12StudentType.DisciplineEventList.DisciplineEvent> getDisciplineEvent() {
            if (disciplineEvent == null) {
                disciplineEvent = new ArrayList<K12StudentType.DisciplineEventList.DisciplineEvent>();
            }
            return this.disciplineEvent;
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
         *         &lt;element name="actionTaken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="actionStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="actionEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="durationOfAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="shortenedExpulsion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="actionLengthDifferenceReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="educationalServicesAfterRemoval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="fullYearExpulsion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="relatedToZeroTolerancePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ideaInterimRemoval" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="ideaInterimRemovalReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="disciplinaryActionIEPPlacementMeetingIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "actionTaken",
            "reason",
            "actionStartDate",
            "actionEndDate",
            "durationOfAction",
            "shortenedExpulsion",
            "actionLengthDifferenceReason",
            "educationalServicesAfterRemoval",
            "fullYearExpulsion",
            "relatedToZeroTolerancePolicy",
            "ideaInterimRemoval",
            "ideaInterimRemovalReason",
            "disciplinaryActionIEPPlacementMeetingIndicator"
        })
        public static class DisciplineEvent {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String actionTaken;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String reason;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String actionStartDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String actionEndDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String durationOfAction;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String shortenedExpulsion;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String actionLengthDifferenceReason;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String educationalServicesAfterRemoval;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String fullYearExpulsion;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String relatedToZeroTolerancePolicy;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String ideaInterimRemoval;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String ideaInterimRemovalReason;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String disciplinaryActionIEPPlacementMeetingIndicator;

            /**
             * Gets the value of the actionTaken property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActionTaken() {
                return actionTaken;
            }

            /**
             * Sets the value of the actionTaken property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActionTaken(String value) {
                this.actionTaken = value;
            }

            /**
             * Gets the value of the reason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReason() {
                return reason;
            }

            /**
             * Sets the value of the reason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReason(String value) {
                this.reason = value;
            }

            /**
             * Gets the value of the actionStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActionStartDate() {
                return actionStartDate;
            }

            /**
             * Sets the value of the actionStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActionStartDate(String value) {
                this.actionStartDate = value;
            }

            /**
             * Gets the value of the actionEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActionEndDate() {
                return actionEndDate;
            }

            /**
             * Sets the value of the actionEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActionEndDate(String value) {
                this.actionEndDate = value;
            }

            /**
             * Gets the value of the durationOfAction property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDurationOfAction() {
                return durationOfAction;
            }

            /**
             * Sets the value of the durationOfAction property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDurationOfAction(String value) {
                this.durationOfAction = value;
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
             * Gets the value of the actionLengthDifferenceReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActionLengthDifferenceReason() {
                return actionLengthDifferenceReason;
            }

            /**
             * Sets the value of the actionLengthDifferenceReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActionLengthDifferenceReason(String value) {
                this.actionLengthDifferenceReason = value;
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
             * Gets the value of the ideaInterimRemoval property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdeaInterimRemoval() {
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
            public void setIdeaInterimRemoval(String value) {
                this.ideaInterimRemoval = value;
            }

            /**
             * Gets the value of the ideaInterimRemovalReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIdeaInterimRemovalReason() {
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
            public void setIdeaInterimRemovalReason(String value) {
                this.ideaInterimRemovalReason = value;
            }

            /**
             * Gets the value of the disciplinaryActionIEPPlacementMeetingIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisciplinaryActionIEPPlacementMeetingIndicator() {
                return disciplinaryActionIEPPlacementMeetingIndicator;
            }

            /**
             * Sets the value of the disciplinaryActionIEPPlacementMeetingIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisciplinaryActionIEPPlacementMeetingIndicator(String value) {
                this.disciplinaryActionIEPPlacementMeetingIndicator = value;
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
     *         &lt;element name="eligibilitySchoolFoodServicePrograms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="statusStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="statusEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="economicDisadvantageStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="participationInSchoolFoodServicePrograms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "eligibilitySchoolFoodServicePrograms",
        "statusStartDate",
        "statusEndDate",
        "economicDisadvantageStatus",
        "participationInSchoolFoodServicePrograms"
    })
    public static class Economic {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String eligibilitySchoolFoodServicePrograms;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String statusStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String statusEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String economicDisadvantageStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String participationInSchoolFoodServicePrograms;

        /**
         * Gets the value of the eligibilitySchoolFoodServicePrograms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEligibilitySchoolFoodServicePrograms() {
            return eligibilitySchoolFoodServicePrograms;
        }

        /**
         * Sets the value of the eligibilitySchoolFoodServicePrograms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEligibilitySchoolFoodServicePrograms(String value) {
            this.eligibilitySchoolFoodServicePrograms = value;
        }

        /**
         * Gets the value of the statusStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusStartDate() {
            return statusStartDate;
        }

        /**
         * Sets the value of the statusStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusStartDate(String value) {
            this.statusStartDate = value;
        }

        /**
         * Gets the value of the statusEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusEndDate() {
            return statusEndDate;
        }

        /**
         * Sets the value of the statusEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusEndDate(String value) {
            this.statusEndDate = value;
        }

        /**
         * Gets the value of the economicDisadvantageStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEconomicDisadvantageStatus() {
            return economicDisadvantageStatus;
        }

        /**
         * Sets the value of the economicDisadvantageStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEconomicDisadvantageStatus(String value) {
            this.economicDisadvantageStatus = value;
        }

        /**
         * Gets the value of the participationInSchoolFoodServicePrograms property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParticipationInSchoolFoodServicePrograms() {
            return participationInSchoolFoodServicePrograms;
        }

        /**
         * Sets the value of the participationInSchoolFoodServicePrograms property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParticipationInSchoolFoodServicePrograms(String value) {
            this.participationInSchoolFoodServicePrograms = value;
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
     *         &lt;element name="employmentRecord" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="employedWhileEnrolled" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="employedAfterExit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="employmentNAICSCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="employmentEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="employmentStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "employmentRecord"
    })
    public static class EmploymentRecordList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<K12StudentType.EmploymentRecordList.EmploymentRecord> employmentRecord;

        /**
         * Gets the value of the employmentRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the employmentRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmploymentRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link K12StudentType.EmploymentRecordList.EmploymentRecord }
         * 
         * 
         */
        public List<K12StudentType.EmploymentRecordList.EmploymentRecord> getEmploymentRecord() {
            if (employmentRecord == null) {
                employmentRecord = new ArrayList<K12StudentType.EmploymentRecordList.EmploymentRecord>();
            }
            return this.employmentRecord;
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
            "employmentStartDate"
        })
        public static class EmploymentRecord {

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
     *         &lt;element name="enrollment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="leaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="leaIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="schoolIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="responsibleDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="responsibleDistrictType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="responsibleSchoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="responsibleSchoolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="kindergartenProgramParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="giftedAndTalented" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="enrollmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="entryGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="entryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exitGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exitStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cohortYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="cohortGraduationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="activityInvolvementBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="activityInvolvementEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="gedPreparationProgramParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="displacedStudent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="truantStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="programGiftedEligibilityCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "enrollment"
    })
    public static class EnrollmentList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<K12StudentType.EnrollmentList.Enrollment> enrollment;

        /**
         * Gets the value of the enrollment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the enrollment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEnrollment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link K12StudentType.EnrollmentList.Enrollment }
         * 
         * 
         */
        public List<K12StudentType.EnrollmentList.Enrollment> getEnrollment() {
            if (enrollment == null) {
                enrollment = new ArrayList<K12StudentType.EnrollmentList.Enrollment>();
            }
            return this.enrollment;
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
         *         &lt;element name="schoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="schoolIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="responsibleDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="responsibleDistrictType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="responsibleSchoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="enrollmentEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="responsibleSchoolType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="kindergartenProgramParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="giftedAndTalented" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="enrollmentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="entryGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="entryType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exitGradeLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exitType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exitStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cohortYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="cohortGraduationYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="activityTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="activityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="activityInvolvementBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="activityInvolvementEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="gedPreparationProgramParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="displacedStudent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="truantStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="programGiftedEligibilityCriteria" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "schoolId",
            "schoolIdSystem",
            "responsibleDistrict",
            "responsibleDistrictType",
            "responsibleSchoolId",
            "enrollmentEntryDate",
            "responsibleSchoolType",
            "kindergartenProgramParticipation",
            "giftedAndTalented",
            "enrollmentStatus",
            "entryGradeLevel",
            "entryType",
            "exitDate",
            "exitGradeLevel",
            "exitType",
            "exitStatus",
            "cohortYear",
            "cohortGraduationYear",
            "activityTitle",
            "activityIdentifier",
            "activityInvolvementBeginDate",
            "activityInvolvementEndDate",
            "gedPreparationProgramParticipation",
            "displacedStudent",
            "truantStatus",
            "programGiftedEligibilityCriteria"
        })
        public static class Enrollment {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String leaId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String leaIdSystem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String schoolId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String schoolIdSystem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String responsibleDistrict;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String responsibleDistrictType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String responsibleSchoolId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String enrollmentEntryDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String responsibleSchoolType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String kindergartenProgramParticipation;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String giftedAndTalented;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String enrollmentStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String entryGradeLevel;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String entryType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String exitDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String exitGradeLevel;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String exitType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String exitStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String cohortYear;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String cohortGraduationYear;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String activityTitle;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String activityIdentifier;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String activityInvolvementBeginDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String activityInvolvementEndDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String gedPreparationProgramParticipation;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String displacedStudent;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String truantStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String programGiftedEligibilityCriteria;

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
             * Gets the value of the responsibleDistrict property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponsibleDistrict() {
                return responsibleDistrict;
            }

            /**
             * Sets the value of the responsibleDistrict property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponsibleDistrict(String value) {
                this.responsibleDistrict = value;
            }

            /**
             * Gets the value of the responsibleDistrictType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponsibleDistrictType() {
                return responsibleDistrictType;
            }

            /**
             * Sets the value of the responsibleDistrictType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponsibleDistrictType(String value) {
                this.responsibleDistrictType = value;
            }

            /**
             * Gets the value of the responsibleSchoolId property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponsibleSchoolId() {
                return responsibleSchoolId;
            }

            /**
             * Sets the value of the responsibleSchoolId property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponsibleSchoolId(String value) {
                this.responsibleSchoolId = value;
            }

            /**
             * Gets the value of the enrollmentEntryDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnrollmentEntryDate() {
                return enrollmentEntryDate;
            }

            /**
             * Sets the value of the enrollmentEntryDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnrollmentEntryDate(String value) {
                this.enrollmentEntryDate = value;
            }

            /**
             * Gets the value of the responsibleSchoolType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResponsibleSchoolType() {
                return responsibleSchoolType;
            }

            /**
             * Sets the value of the responsibleSchoolType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResponsibleSchoolType(String value) {
                this.responsibleSchoolType = value;
            }

            /**
             * Gets the value of the kindergartenProgramParticipation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKindergartenProgramParticipation() {
                return kindergartenProgramParticipation;
            }

            /**
             * Sets the value of the kindergartenProgramParticipation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKindergartenProgramParticipation(String value) {
                this.kindergartenProgramParticipation = value;
            }

            /**
             * Gets the value of the giftedAndTalented property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGiftedAndTalented() {
                return giftedAndTalented;
            }

            /**
             * Sets the value of the giftedAndTalented property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGiftedAndTalented(String value) {
                this.giftedAndTalented = value;
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
             * Gets the value of the entryGradeLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntryGradeLevel() {
                return entryGradeLevel;
            }

            /**
             * Sets the value of the entryGradeLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntryGradeLevel(String value) {
                this.entryGradeLevel = value;
            }

            /**
             * Gets the value of the entryType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEntryType() {
                return entryType;
            }

            /**
             * Sets the value of the entryType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEntryType(String value) {
                this.entryType = value;
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
             * Gets the value of the exitGradeLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExitGradeLevel() {
                return exitGradeLevel;
            }

            /**
             * Sets the value of the exitGradeLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExitGradeLevel(String value) {
                this.exitGradeLevel = value;
            }

            /**
             * Gets the value of the exitType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExitType() {
                return exitType;
            }

            /**
             * Sets the value of the exitType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExitType(String value) {
                this.exitType = value;
            }

            /**
             * Gets the value of the exitStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExitStatus() {
                return exitStatus;
            }

            /**
             * Sets the value of the exitStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExitStatus(String value) {
                this.exitStatus = value;
            }

            /**
             * Gets the value of the cohortYear property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCohortYear() {
                return cohortYear;
            }

            /**
             * Sets the value of the cohortYear property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCohortYear(String value) {
                this.cohortYear = value;
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
             * Gets the value of the activityTitle property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivityTitle() {
                return activityTitle;
            }

            /**
             * Sets the value of the activityTitle property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivityTitle(String value) {
                this.activityTitle = value;
            }

            /**
             * Gets the value of the activityIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivityIdentifier() {
                return activityIdentifier;
            }

            /**
             * Sets the value of the activityIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivityIdentifier(String value) {
                this.activityIdentifier = value;
            }

            /**
             * Gets the value of the activityInvolvementBeginDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivityInvolvementBeginDate() {
                return activityInvolvementBeginDate;
            }

            /**
             * Sets the value of the activityInvolvementBeginDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivityInvolvementBeginDate(String value) {
                this.activityInvolvementBeginDate = value;
            }

            /**
             * Gets the value of the activityInvolvementEndDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActivityInvolvementEndDate() {
                return activityInvolvementEndDate;
            }

            /**
             * Sets the value of the activityInvolvementEndDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActivityInvolvementEndDate(String value) {
                this.activityInvolvementEndDate = value;
            }

            /**
             * Gets the value of the gedPreparationProgramParticipation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGedPreparationProgramParticipation() {
                return gedPreparationProgramParticipation;
            }

            /**
             * Sets the value of the gedPreparationProgramParticipation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGedPreparationProgramParticipation(String value) {
                this.gedPreparationProgramParticipation = value;
            }

            /**
             * Gets the value of the displacedStudent property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDisplacedStudent() {
                return displacedStudent;
            }

            /**
             * Sets the value of the displacedStudent property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDisplacedStudent(String value) {
                this.displacedStudent = value;
            }

            /**
             * Gets the value of the truantStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTruantStatus() {
                return truantStatus;
            }

            /**
             * Sets the value of the truantStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTruantStatus(String value) {
                this.truantStatus = value;
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
     *         &lt;element name="healthRecord" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="medicalAlertIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="allergyReactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="allergySeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="allergyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="visionScreeningDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="visionScreeningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "healthRecord"
    })
    public static class HealthRecordList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<K12StudentType.HealthRecordList.HealthRecord> healthRecord;

        /**
         * Gets the value of the healthRecord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the healthRecord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHealthRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link K12StudentType.HealthRecordList.HealthRecord }
         * 
         * 
         */
        public List<K12StudentType.HealthRecordList.HealthRecord> getHealthRecord() {
            if (healthRecord == null) {
                healthRecord = new ArrayList<K12StudentType.HealthRecordList.HealthRecord>();
            }
            return this.healthRecord;
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
         *         &lt;element name="medicalAlertIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="allergyReactionDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="allergySeverity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="allergyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="immunizationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="immunizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="visionScreeningDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="visionScreeningStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "medicalAlertIndicator",
            "allergyReactionDescription",
            "allergySeverity",
            "allergyType",
            "immunizationDate",
            "immunizationType",
            "visionScreeningDate",
            "visionScreeningStatus"
        })
        public static class HealthRecord {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String medicalAlertIndicator;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String allergyReactionDescription;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String allergySeverity;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String allergyType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String immunizationDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String immunizationType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String visionScreeningDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String visionScreeningStatus;

            /**
             * Gets the value of the medicalAlertIndicator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMedicalAlertIndicator() {
                return medicalAlertIndicator;
            }

            /**
             * Sets the value of the medicalAlertIndicator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMedicalAlertIndicator(String value) {
                this.medicalAlertIndicator = value;
            }

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

            /**
             * Gets the value of the visionScreeningDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVisionScreeningDate() {
                return visionScreeningDate;
            }

            /**
             * Sets the value of the visionScreeningDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVisionScreeningDate(String value) {
                this.visionScreeningDate = value;
            }

            /**
             * Gets the value of the visionScreeningStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVisionScreeningStatus() {
                return visionScreeningStatus;
            }

            /**
             * Sets the value of the visionScreeningStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVisionScreeningStatus(String value) {
                this.visionScreeningStatus = value;
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
     *         &lt;element name="homelessnessStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="statusStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="statusEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="primaryNighttimeResidence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="servicedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="unaccompaniedYouthStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "homelessnessStatus",
        "statusStartDate",
        "statusEndDate",
        "primaryNighttimeResidence",
        "servicedIndicator",
        "unaccompaniedYouthStatus"
    })
    public static class Homeless {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String homelessnessStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String statusStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String statusEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String primaryNighttimeResidence;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String servicedIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String unaccompaniedYouthStatus;

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
         * Gets the value of the statusStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusStartDate() {
            return statusStartDate;
        }

        /**
         * Sets the value of the statusStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusStartDate(String value) {
            this.statusStartDate = value;
        }

        /**
         * Gets the value of the statusEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusEndDate() {
            return statusEndDate;
        }

        /**
         * Sets the value of the statusEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusEndDate(String value) {
            this.statusEndDate = value;
        }

        /**
         * Gets the value of the primaryNighttimeResidence property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryNighttimeResidence() {
            return primaryNighttimeResidence;
        }

        /**
         * Sets the value of the primaryNighttimeResidence property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryNighttimeResidence(String value) {
            this.primaryNighttimeResidence = value;
        }

        /**
         * Gets the value of the servicedIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServicedIndicator() {
            return servicedIndicator;
        }

        /**
         * Sets the value of the servicedIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServicedIndicator(String value) {
            this.servicedIndicator = value;
        }

        /**
         * Gets the value of the unaccompaniedYouthStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnaccompaniedYouthStatus() {
            return unaccompaniedYouthStatus;
        }

        /**
         * Sets the value of the unaccompaniedYouthStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnaccompaniedYouthStatus(String value) {
            this.unaccompaniedYouthStatus = value;
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
     *                   &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "identification"
    })
    public static class Identity {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StudentType.Identity.Name name;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StudentType.Identity.OtherNameList otherNameList;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected K12StudentType.Identity.Identification identification;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link K12StudentType.Identity.Name }
         *     
         */
        public K12StudentType.Identity.Name getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StudentType.Identity.Name }
         *     
         */
        public void setName(K12StudentType.Identity.Name value) {
            this.name = value;
        }

        /**
         * Gets the value of the otherNameList property.
         * 
         * @return
         *     possible object is
         *     {@link K12StudentType.Identity.OtherNameList }
         *     
         */
        public K12StudentType.Identity.OtherNameList getOtherNameList() {
            return otherNameList;
        }

        /**
         * Sets the value of the otherNameList property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StudentType.Identity.OtherNameList }
         *     
         */
        public void setOtherNameList(K12StudentType.Identity.OtherNameList value) {
            this.otherNameList = value;
        }

        /**
         * Gets the value of the identification property.
         * 
         * @return
         *     possible object is
         *     {@link K12StudentType.Identity.Identification }
         *     
         */
        public K12StudentType.Identity.Identification getIdentification() {
            return identification;
        }

        /**
         * Sets the value of the identification property.
         * 
         * @param value
         *     allowed object is
         *     {@link K12StudentType.Identity.Identification }
         *     
         */
        public void setIdentification(K12StudentType.Identity.Identification value) {
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
         *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "studentId",
            "studentIdSystem",
            "socialSecurityNumber",
            "idVerification"
        })
        public static class Identification {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String studentId;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String studentIdSystem;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String socialSecurityNumber;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String idVerification;

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
            protected List<K12StudentType.Identity.OtherNameList.OtherName> otherName;

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
             * {@link K12StudentType.Identity.OtherNameList.OtherName }
             * 
             * 
             */
            public List<K12StudentType.Identity.OtherNameList.OtherName> getOtherName() {
                if (otherName == null) {
                    otherName = new ArrayList<K12StudentType.Identity.OtherNameList.OtherName>();
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
     *         &lt;element name="title3ImmigrantStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="title3ImmigrantParticipationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="immigrantStatusStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="immigrantStatusEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="firstUSEnrollment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "title3ImmigrantStatus",
        "title3ImmigrantParticipationStatus",
        "immigrantStatusStartDate",
        "immigrantStatusEndDate",
        "firstUSEnrollment"
    })
    public static class Immigrant {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String title3ImmigrantStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String title3ImmigrantParticipationStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String immigrantStatusStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String immigrantStatusEndDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String firstUSEnrollment;

        /**
         * Gets the value of the title3ImmigrantStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle3ImmigrantStatus() {
            return title3ImmigrantStatus;
        }

        /**
         * Sets the value of the title3ImmigrantStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle3ImmigrantStatus(String value) {
            this.title3ImmigrantStatus = value;
        }

        /**
         * Gets the value of the title3ImmigrantParticipationStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle3ImmigrantParticipationStatus() {
            return title3ImmigrantParticipationStatus;
        }

        /**
         * Sets the value of the title3ImmigrantParticipationStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle3ImmigrantParticipationStatus(String value) {
            this.title3ImmigrantParticipationStatus = value;
        }

        /**
         * Gets the value of the immigrantStatusStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImmigrantStatusStartDate() {
            return immigrantStatusStartDate;
        }

        /**
         * Sets the value of the immigrantStatusStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImmigrantStatusStartDate(String value) {
            this.immigrantStatusStartDate = value;
        }

        /**
         * Gets the value of the immigrantStatusEndDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImmigrantStatusEndDate() {
            return immigrantStatusEndDate;
        }

        /**
         * Sets the value of the immigrantStatusEndDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImmigrantStatusEndDate(String value) {
            this.immigrantStatusEndDate = value;
        }

        /**
         * Gets the value of the firstUSEnrollment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFirstUSEnrollment() {
            return firstUSEnrollment;
        }

        /**
         * Sets the value of the firstUSEnrollment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFirstUSEnrollment(String value) {
            this.firstUSEnrollment = value;
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
     *         &lt;element name="individualizedProgram" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="dateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="nonInclusionMinutesPerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="inclusionMinutesPerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="transitionPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="servicePlanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="servicePlanMeetingLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="servicePlanMeetingParticipants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="servicePlanSignedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="servicePlanSignatureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="servicePlanReevaluationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="studentSupportServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    public static class IndividualizedProgramList {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected List<K12StudentType.IndividualizedProgramList.IndividualizedProgram> individualizedProgram;

        /**
         * Gets the value of the individualizedProgram property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the individualizedProgram property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIndividualizedProgram().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link K12StudentType.IndividualizedProgramList.IndividualizedProgram }
         * 
         * 
         */
        public List<K12StudentType.IndividualizedProgramList.IndividualizedProgram> getIndividualizedProgram() {
            if (individualizedProgram == null) {
                individualizedProgram = new ArrayList<K12StudentType.IndividualizedProgramList.IndividualizedProgram>();
            }
            return this.individualizedProgram;
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
         *         &lt;element name="dateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="nonInclusionMinutesPerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="inclusionMinutesPerWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="transitionPlanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="servicePlanDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="servicePlanMeetingLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="servicePlanMeetingParticipants" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="servicePlanSignedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="servicePlanSignatureDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="servicePlanReevaluationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="studentSupportServiceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "dateType",
            "date",
            "nonInclusionMinutesPerWeek",
            "inclusionMinutesPerWeek",
            "transitionPlanType",
            "servicePlanDate",
            "servicePlanMeetingLocation",
            "servicePlanMeetingParticipants",
            "servicePlanSignedBy",
            "servicePlanSignatureDate",
            "servicePlanReevaluationDate",
            "studentSupportServiceType"
        })
        public static class IndividualizedProgram {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String type;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String dateType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String date;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String nonInclusionMinutesPerWeek;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String inclusionMinutesPerWeek;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String transitionPlanType;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String servicePlanDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String servicePlanMeetingLocation;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String servicePlanMeetingParticipants;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String servicePlanSignedBy;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String servicePlanSignatureDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String servicePlanReevaluationDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String studentSupportServiceType;

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
             * Gets the value of the nonInclusionMinutesPerWeek property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNonInclusionMinutesPerWeek() {
                return nonInclusionMinutesPerWeek;
            }

            /**
             * Sets the value of the nonInclusionMinutesPerWeek property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNonInclusionMinutesPerWeek(String value) {
                this.nonInclusionMinutesPerWeek = value;
            }

            /**
             * Gets the value of the inclusionMinutesPerWeek property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInclusionMinutesPerWeek() {
                return inclusionMinutesPerWeek;
            }

            /**
             * Sets the value of the inclusionMinutesPerWeek property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInclusionMinutesPerWeek(String value) {
                this.inclusionMinutesPerWeek = value;
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
             * Gets the value of the servicePlanDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServicePlanDate() {
                return servicePlanDate;
            }

            /**
             * Sets the value of the servicePlanDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServicePlanDate(String value) {
                this.servicePlanDate = value;
            }

            /**
             * Gets the value of the servicePlanMeetingLocation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServicePlanMeetingLocation() {
                return servicePlanMeetingLocation;
            }

            /**
             * Sets the value of the servicePlanMeetingLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServicePlanMeetingLocation(String value) {
                this.servicePlanMeetingLocation = value;
            }

            /**
             * Gets the value of the servicePlanMeetingParticipants property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServicePlanMeetingParticipants() {
                return servicePlanMeetingParticipants;
            }

            /**
             * Sets the value of the servicePlanMeetingParticipants property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServicePlanMeetingParticipants(String value) {
                this.servicePlanMeetingParticipants = value;
            }

            /**
             * Gets the value of the servicePlanSignedBy property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServicePlanSignedBy() {
                return servicePlanSignedBy;
            }

            /**
             * Sets the value of the servicePlanSignedBy property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServicePlanSignedBy(String value) {
                this.servicePlanSignedBy = value;
            }

            /**
             * Gets the value of the servicePlanSignatureDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServicePlanSignatureDate() {
                return servicePlanSignatureDate;
            }

            /**
             * Sets the value of the servicePlanSignatureDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServicePlanSignatureDate(String value) {
                this.servicePlanSignatureDate = value;
            }

            /**
             * Gets the value of the servicePlanReevaluationDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServicePlanReevaluationDate() {
                return servicePlanReevaluationDate;
            }

            /**
             * Sets the value of the servicePlanReevaluationDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServicePlanReevaluationDate(String value) {
                this.servicePlanReevaluationDate = value;
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
        protected List<K12StudentType.LanguageList.Language> language;

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
         * {@link K12StudentType.LanguageList.Language }
         * 
         * 
         */
        public List<K12StudentType.LanguageList.Language> getLanguage() {
            if (language == null) {
                language = new ArrayList<K12StudentType.LanguageList.Language>();
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
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lepExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="perkinsLEPStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="title3AccountabilityProgressStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="title3LEPParticipationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lepEntryDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "status",
        "programParticipationStartDate",
        "programParticipationExitDate",
        "lepExitDate",
        "perkinsLEPStatus",
        "title3AccountabilityProgressStatus",
        "title3LEPParticipationStatus",
        "lepEntryDate"
    })
    public static class Lep {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String status;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationExitDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String lepExitDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String perkinsLEPStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String title3AccountabilityProgressStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String title3LEPParticipationStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String lepEntryDate;

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

        /**
         * Gets the value of the programParticipationStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationStartDate() {
            return programParticipationStartDate;
        }

        /**
         * Sets the value of the programParticipationStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationStartDate(String value) {
            this.programParticipationStartDate = value;
        }

        /**
         * Gets the value of the programParticipationExitDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationExitDate() {
            return programParticipationExitDate;
        }

        /**
         * Sets the value of the programParticipationExitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationExitDate(String value) {
            this.programParticipationExitDate = value;
        }

        /**
         * Gets the value of the lepExitDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLepExitDate() {
            return lepExitDate;
        }

        /**
         * Sets the value of the lepExitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLepExitDate(String value) {
            this.lepExitDate = value;
        }

        /**
         * Gets the value of the perkinsLEPStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPerkinsLEPStatus() {
            return perkinsLEPStatus;
        }

        /**
         * Sets the value of the perkinsLEPStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPerkinsLEPStatus(String value) {
            this.perkinsLEPStatus = value;
        }

        /**
         * Gets the value of the title3AccountabilityProgressStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle3AccountabilityProgressStatus() {
            return title3AccountabilityProgressStatus;
        }

        /**
         * Sets the value of the title3AccountabilityProgressStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle3AccountabilityProgressStatus(String value) {
            this.title3AccountabilityProgressStatus = value;
        }

        /**
         * Gets the value of the title3LEPParticipationStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTitle3LEPParticipationStatus() {
            return title3LEPParticipationStatus;
        }

        /**
         * Sets the value of the title3LEPParticipationStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTitle3LEPParticipationStatus(String value) {
            this.title3LEPParticipationStatus = value;
        }

        /**
         * Gets the value of the lepEntryDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLepEntryDate() {
            return lepEntryDate;
        }

        /**
         * Sets the value of the lepEntryDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLepEntryDate(String value) {
            this.lepEntryDate = value;
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
     *         &lt;element name="studentIdSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="studentId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="migrantStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="mepContinuationOfServicesStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="continuationOfServicesReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="educationProgramParticipationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="educationProgramServicesType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="educationProgramEnrollmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="educationProgramProjectBased" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="prioritizedForServices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="studentQualifyingArrivalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="lastQualifyingMoveDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qualifyingMoveFromCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qualifyingMoveFromCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="qualifyingMoveFromState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="educationProgramEligibilityExpirationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="designatedGraduationSchoolId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="birthDateVerification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="immunizationRecordFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="multipleBirthIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "studentId",
        "migrantStatus",
        "programParticipationStartDate",
        "programParticipationExitDate",
        "mepContinuationOfServicesStatus",
        "continuationOfServicesReason",
        "educationProgramParticipationStatus",
        "educationProgramServicesType",
        "educationProgramEnrollmentType",
        "educationProgramProjectBased",
        "prioritizedForServices",
        "studentQualifyingArrivalDate",
        "lastQualifyingMoveDate",
        "qualifyingMoveFromCity",
        "qualifyingMoveFromCountry",
        "qualifyingMoveFromState",
        "educationProgramEligibilityExpirationDate",
        "designatedGraduationSchoolId",
        "birthDateVerification",
        "immunizationRecordFlag",
        "multipleBirthIndicator"
    })
    public static class Migrant {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String studentIdSystem;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String studentId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String migrantStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationExitDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String mepContinuationOfServicesStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String continuationOfServicesReason;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String educationProgramParticipationStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String educationProgramServicesType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String educationProgramEnrollmentType;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String educationProgramProjectBased;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String prioritizedForServices;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String studentQualifyingArrivalDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String lastQualifyingMoveDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qualifyingMoveFromCity;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qualifyingMoveFromCountry;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String qualifyingMoveFromState;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String educationProgramEligibilityExpirationDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String designatedGraduationSchoolId;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String birthDateVerification;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String immunizationRecordFlag;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String multipleBirthIndicator;

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
         * Gets the value of the programParticipationStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationStartDate() {
            return programParticipationStartDate;
        }

        /**
         * Sets the value of the programParticipationStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationStartDate(String value) {
            this.programParticipationStartDate = value;
        }

        /**
         * Gets the value of the programParticipationExitDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationExitDate() {
            return programParticipationExitDate;
        }

        /**
         * Sets the value of the programParticipationExitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationExitDate(String value) {
            this.programParticipationExitDate = value;
        }

        /**
         * Gets the value of the mepContinuationOfServicesStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMepContinuationOfServicesStatus() {
            return mepContinuationOfServicesStatus;
        }

        /**
         * Sets the value of the mepContinuationOfServicesStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMepContinuationOfServicesStatus(String value) {
            this.mepContinuationOfServicesStatus = value;
        }

        /**
         * Gets the value of the continuationOfServicesReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContinuationOfServicesReason() {
            return continuationOfServicesReason;
        }

        /**
         * Sets the value of the continuationOfServicesReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContinuationOfServicesReason(String value) {
            this.continuationOfServicesReason = value;
        }

        /**
         * Gets the value of the educationProgramParticipationStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEducationProgramParticipationStatus() {
            return educationProgramParticipationStatus;
        }

        /**
         * Sets the value of the educationProgramParticipationStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEducationProgramParticipationStatus(String value) {
            this.educationProgramParticipationStatus = value;
        }

        /**
         * Gets the value of the educationProgramServicesType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEducationProgramServicesType() {
            return educationProgramServicesType;
        }

        /**
         * Sets the value of the educationProgramServicesType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEducationProgramServicesType(String value) {
            this.educationProgramServicesType = value;
        }

        /**
         * Gets the value of the educationProgramEnrollmentType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEducationProgramEnrollmentType() {
            return educationProgramEnrollmentType;
        }

        /**
         * Sets the value of the educationProgramEnrollmentType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEducationProgramEnrollmentType(String value) {
            this.educationProgramEnrollmentType = value;
        }

        /**
         * Gets the value of the educationProgramProjectBased property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEducationProgramProjectBased() {
            return educationProgramProjectBased;
        }

        /**
         * Sets the value of the educationProgramProjectBased property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEducationProgramProjectBased(String value) {
            this.educationProgramProjectBased = value;
        }

        /**
         * Gets the value of the prioritizedForServices property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrioritizedForServices() {
            return prioritizedForServices;
        }

        /**
         * Sets the value of the prioritizedForServices property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrioritizedForServices(String value) {
            this.prioritizedForServices = value;
        }

        /**
         * Gets the value of the studentQualifyingArrivalDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStudentQualifyingArrivalDate() {
            return studentQualifyingArrivalDate;
        }

        /**
         * Sets the value of the studentQualifyingArrivalDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStudentQualifyingArrivalDate(String value) {
            this.studentQualifyingArrivalDate = value;
        }

        /**
         * Gets the value of the lastQualifyingMoveDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLastQualifyingMoveDate() {
            return lastQualifyingMoveDate;
        }

        /**
         * Sets the value of the lastQualifyingMoveDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLastQualifyingMoveDate(String value) {
            this.lastQualifyingMoveDate = value;
        }

        /**
         * Gets the value of the qualifyingMoveFromCity property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualifyingMoveFromCity() {
            return qualifyingMoveFromCity;
        }

        /**
         * Sets the value of the qualifyingMoveFromCity property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualifyingMoveFromCity(String value) {
            this.qualifyingMoveFromCity = value;
        }

        /**
         * Gets the value of the qualifyingMoveFromCountry property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualifyingMoveFromCountry() {
            return qualifyingMoveFromCountry;
        }

        /**
         * Sets the value of the qualifyingMoveFromCountry property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualifyingMoveFromCountry(String value) {
            this.qualifyingMoveFromCountry = value;
        }

        /**
         * Gets the value of the qualifyingMoveFromState property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualifyingMoveFromState() {
            return qualifyingMoveFromState;
        }

        /**
         * Sets the value of the qualifyingMoveFromState property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualifyingMoveFromState(String value) {
            this.qualifyingMoveFromState = value;
        }

        /**
         * Gets the value of the educationProgramEligibilityExpirationDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEducationProgramEligibilityExpirationDate() {
            return educationProgramEligibilityExpirationDate;
        }

        /**
         * Sets the value of the educationProgramEligibilityExpirationDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEducationProgramEligibilityExpirationDate(String value) {
            this.educationProgramEligibilityExpirationDate = value;
        }

        /**
         * Gets the value of the designatedGraduationSchoolId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDesignatedGraduationSchoolId() {
            return designatedGraduationSchoolId;
        }

        /**
         * Sets the value of the designatedGraduationSchoolId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDesignatedGraduationSchoolId(String value) {
            this.designatedGraduationSchoolId = value;
        }

        /**
         * Gets the value of the birthDateVerification property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBirthDateVerification() {
            return birthDateVerification;
        }

        /**
         * Sets the value of the birthDateVerification property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBirthDateVerification(String value) {
            this.birthDateVerification = value;
        }

        /**
         * Gets the value of the immunizationRecordFlag property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getImmunizationRecordFlag() {
            return immunizationRecordFlag;
        }

        /**
         * Sets the value of the immunizationRecordFlag property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setImmunizationRecordFlag(String value) {
            this.immunizationRecordFlag = value;
        }

        /**
         * Gets the value of the multipleBirthIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMultipleBirthIndicator() {
            return multipleBirthIndicator;
        }

        /**
         * Sets the value of the multipleBirthIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMultipleBirthIndicator(String value) {
            this.multipleBirthIndicator = value;
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
     *         &lt;element name="neglectedDelinquentStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="academicAchievementIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="academicOutcomeIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="obtainedEmployment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "neglectedDelinquentStatus",
        "programParticipationStartDate",
        "programParticipationExitDate",
        "academicAchievementIndicator",
        "academicOutcomeIndicator",
        "obtainedEmployment",
        "programType"
    })
    public static class NeglectedOrDelinquent {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String neglectedDelinquentStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationExitDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String academicAchievementIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String academicOutcomeIndicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String obtainedEmployment;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programType;

        /**
         * Gets the value of the neglectedDelinquentStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNeglectedDelinquentStatus() {
            return neglectedDelinquentStatus;
        }

        /**
         * Sets the value of the neglectedDelinquentStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNeglectedDelinquentStatus(String value) {
            this.neglectedDelinquentStatus = value;
        }

        /**
         * Gets the value of the programParticipationStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationStartDate() {
            return programParticipationStartDate;
        }

        /**
         * Sets the value of the programParticipationStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationStartDate(String value) {
            this.programParticipationStartDate = value;
        }

        /**
         * Gets the value of the programParticipationExitDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationExitDate() {
            return programParticipationExitDate;
        }

        /**
         * Sets the value of the programParticipationExitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationExitDate(String value) {
            this.programParticipationExitDate = value;
        }

        /**
         * Gets the value of the academicAchievementIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcademicAchievementIndicator() {
            return academicAchievementIndicator;
        }

        /**
         * Sets the value of the academicAchievementIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcademicAchievementIndicator(String value) {
            this.academicAchievementIndicator = value;
        }

        /**
         * Gets the value of the academicOutcomeIndicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAcademicOutcomeIndicator() {
            return academicOutcomeIndicator;
        }

        /**
         * Sets the value of the academicOutcomeIndicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAcademicOutcomeIndicator(String value) {
            this.academicOutcomeIndicator = value;
        }

        /**
         * Gets the value of the obtainedEmployment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObtainedEmployment() {
            return obtainedEmployment;
        }

        /**
         * Sets the value of the obtainedEmployment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObtainedEmployment(String value) {
            this.obtainedEmployment = value;
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
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="participationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="participationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="participationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="exitReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="programIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        protected List<K12StudentType.ProgramList.Program> program;

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
         * {@link K12StudentType.ProgramList.Program }
         * 
         * 
         */
        public List<K12StudentType.ProgramList.Program> getProgram() {
            if (program == null) {
                program = new ArrayList<K12StudentType.ProgramList.Program>();
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
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="participationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="participationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="participationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="exitReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="programIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="programName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
            "type",
            "participationStatus",
            "participationStartDate",
            "participationExitDate",
            "exitReason",
            "programIdentifier",
            "programName",
            "workBasedLearningOpportunityType"
        })
        public static class Program {

            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String type;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String participationStatus;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String participationStartDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String participationExitDate;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String exitReason;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String programIdentifier;
            @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String programName;
            @XmlElement(name = "work-basedLearningOpportunityType", namespace = "http://www.sifassociation.org/datamodel/na/3.2")
            protected String workBasedLearningOpportunityType;

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
             * Gets the value of the participationStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParticipationStatus() {
                return participationStatus;
            }

            /**
             * Sets the value of the participationStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParticipationStatus(String value) {
                this.participationStatus = value;
            }

            /**
             * Gets the value of the participationStartDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParticipationStartDate() {
                return participationStartDate;
            }

            /**
             * Sets the value of the participationStartDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParticipationStartDate(String value) {
                this.participationStartDate = value;
            }

            /**
             * Gets the value of the participationExitDate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getParticipationExitDate() {
                return participationExitDate;
            }

            /**
             * Sets the value of the participationExitDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setParticipationExitDate(String value) {
                this.participationExitDate = value;
            }

            /**
             * Gets the value of the exitReason property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExitReason() {
                return exitReason;
            }

            /**
             * Sets the value of the exitReason property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExitReason(String value) {
                this.exitReason = value;
            }

            /**
             * Gets the value of the programIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramIdentifier() {
                return programIdentifier;
            }

            /**
             * Sets the value of the programIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramIdentifier(String value) {
                this.programIdentifier = value;
            }

            /**
             * Gets the value of the programName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProgramName() {
                return programName;
            }

            /**
             * Sets the value of the programName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProgramName(String value) {
                this.programName = value;
            }

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
     *         &lt;element name="fte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="exitReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="servicesExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "fte",
        "programParticipationStartDate",
        "programParticipationExitDate",
        "exitReason",
        "servicesExitDate"
    })
    public static class SpecialEducation {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String fte;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationExitDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String exitReason;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String servicesExitDate;

        /**
         * Gets the value of the fte property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFte() {
            return fte;
        }

        /**
         * Sets the value of the fte property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFte(String value) {
            this.fte = value;
        }

        /**
         * Gets the value of the programParticipationStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationStartDate() {
            return programParticipationStartDate;
        }

        /**
         * Sets the value of the programParticipationStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationStartDate(String value) {
            this.programParticipationStartDate = value;
        }

        /**
         * Gets the value of the programParticipationExitDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationExitDate() {
            return programParticipationExitDate;
        }

        /**
         * Sets the value of the programParticipationExitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationExitDate(String value) {
            this.programParticipationExitDate = value;
        }

        /**
         * Gets the value of the exitReason property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExitReason() {
            return exitReason;
        }

        /**
         * Sets the value of the exitReason property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExitReason(String value) {
            this.exitReason = value;
        }

        /**
         * Gets the value of the servicesExitDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServicesExitDate() {
            return servicesExitDate;
        }

        /**
         * Sets the value of the servicesExitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServicesExitDate(String value) {
            this.servicesExitDate = value;
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
     *         &lt;element name="indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="programParticipationExitDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolChoiceAppliedForTransferStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolChoiceEligibleForTransferStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolChoiceTransferStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolSupplementalServicesAppliedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolSupplementalServicesEligibleStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolSupplementalServicesReceivedStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="schoolwideProgramParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="targetedAssistanceParticipation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "indicator",
        "programParticipationStartDate",
        "programParticipationExitDate",
        "schoolChoiceAppliedForTransferStatus",
        "schoolChoiceEligibleForTransferStatus",
        "schoolChoiceTransferStatus",
        "schoolSupplementalServicesAppliedStatus",
        "schoolSupplementalServicesEligibleStatus",
        "schoolSupplementalServicesReceivedStatus",
        "schoolwideProgramParticipation",
        "targetedAssistanceParticipation"
    })
    public static class Title1 {

        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String indicator;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationStartDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String programParticipationExitDate;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolChoiceAppliedForTransferStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolChoiceEligibleForTransferStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolChoiceTransferStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolSupplementalServicesAppliedStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolSupplementalServicesEligibleStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolSupplementalServicesReceivedStatus;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String schoolwideProgramParticipation;
        @XmlElement(namespace = "http://www.sifassociation.org/datamodel/na/3.2")
        protected String targetedAssistanceParticipation;

        /**
         * Gets the value of the indicator property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicator() {
            return indicator;
        }

        /**
         * Sets the value of the indicator property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndicator(String value) {
            this.indicator = value;
        }

        /**
         * Gets the value of the programParticipationStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationStartDate() {
            return programParticipationStartDate;
        }

        /**
         * Sets the value of the programParticipationStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationStartDate(String value) {
            this.programParticipationStartDate = value;
        }

        /**
         * Gets the value of the programParticipationExitDate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramParticipationExitDate() {
            return programParticipationExitDate;
        }

        /**
         * Sets the value of the programParticipationExitDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramParticipationExitDate(String value) {
            this.programParticipationExitDate = value;
        }

        /**
         * Gets the value of the schoolChoiceAppliedForTransferStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolChoiceAppliedForTransferStatus() {
            return schoolChoiceAppliedForTransferStatus;
        }

        /**
         * Sets the value of the schoolChoiceAppliedForTransferStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolChoiceAppliedForTransferStatus(String value) {
            this.schoolChoiceAppliedForTransferStatus = value;
        }

        /**
         * Gets the value of the schoolChoiceEligibleForTransferStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolChoiceEligibleForTransferStatus() {
            return schoolChoiceEligibleForTransferStatus;
        }

        /**
         * Sets the value of the schoolChoiceEligibleForTransferStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolChoiceEligibleForTransferStatus(String value) {
            this.schoolChoiceEligibleForTransferStatus = value;
        }

        /**
         * Gets the value of the schoolChoiceTransferStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolChoiceTransferStatus() {
            return schoolChoiceTransferStatus;
        }

        /**
         * Sets the value of the schoolChoiceTransferStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolChoiceTransferStatus(String value) {
            this.schoolChoiceTransferStatus = value;
        }

        /**
         * Gets the value of the schoolSupplementalServicesAppliedStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolSupplementalServicesAppliedStatus() {
            return schoolSupplementalServicesAppliedStatus;
        }

        /**
         * Sets the value of the schoolSupplementalServicesAppliedStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolSupplementalServicesAppliedStatus(String value) {
            this.schoolSupplementalServicesAppliedStatus = value;
        }

        /**
         * Gets the value of the schoolSupplementalServicesEligibleStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolSupplementalServicesEligibleStatus() {
            return schoolSupplementalServicesEligibleStatus;
        }

        /**
         * Sets the value of the schoolSupplementalServicesEligibleStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolSupplementalServicesEligibleStatus(String value) {
            this.schoolSupplementalServicesEligibleStatus = value;
        }

        /**
         * Gets the value of the schoolSupplementalServicesReceivedStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolSupplementalServicesReceivedStatus() {
            return schoolSupplementalServicesReceivedStatus;
        }

        /**
         * Sets the value of the schoolSupplementalServicesReceivedStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolSupplementalServicesReceivedStatus(String value) {
            this.schoolSupplementalServicesReceivedStatus = value;
        }

        /**
         * Gets the value of the schoolwideProgramParticipation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchoolwideProgramParticipation() {
            return schoolwideProgramParticipation;
        }

        /**
         * Sets the value of the schoolwideProgramParticipation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchoolwideProgramParticipation(String value) {
            this.schoolwideProgramParticipation = value;
        }

        /**
         * Gets the value of the targetedAssistanceParticipation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTargetedAssistanceParticipation() {
            return targetedAssistanceParticipation;
        }

        /**
         * Sets the value of the targetedAssistanceParticipation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTargetedAssistanceParticipation(String value) {
            this.targetedAssistanceParticipation = value;
        }

    }

}
